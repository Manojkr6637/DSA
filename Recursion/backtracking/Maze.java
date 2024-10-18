package RecursionFinish.BackTracking;

import javafx.util.Pair;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.print(bt(3,3));
      //  System.out.print(btList(3,3));
//         System.out.print(btPath("",3,3));
       // btPath("",3,3);
//        System.out.print( btPathList("",3,3));
        //System.out.print( btPathDiagonalList("",3,3));
        boolean [][]board={
                {true, true, true},
                {true, false, true},
                {true, true, true},
        };
         bthRestrict("",board,0,0);
    }
    static void bthRestrict(String p, boolean [][]board, int r, int c){
        if(r==board.length-1 &&  c==board[0].length-1){
            System.out.print(p+" ");
            return;
        }

        if(!board[r][c]){
            return ;
        }
        if(r<board.length-1){
            bthRestrict(p+"D", board,r+1, c);
        }
        if(c<board[0].length-1){
             bthRestrict(p+"R", board,r, c+1);
        }

    }
    static ArrayList<String> btPathDiagonalList(String p, int r, int c){
        if(r==1 &&  c==1){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>list=new ArrayList<>();
        if(r>1 && c>1){
            list.addAll(btPathDiagonalList(p+"V", r-1, c-1));
        }
        if(r>1){
            list.addAll(btPathDiagonalList(p+"V", r-1, c));
        }
        if(c>1){
            list.addAll(btPathDiagonalList(p+"H", r, c-1));
        }
        return list;
    }
    static ArrayList<String> btPathList(String p, int r, int c){
        if(r==1 &&  c==1){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
           return list;
        }
        ArrayList<String>list=new ArrayList<>();
        if(r>1){
            list.addAll(btPathList(p+"D", r-1, c));
        }
        if(c>1){
            list.addAll(btPathList(p+"R", r, c-1));
        }
        return list;
    }
    static void btPath(String p, int r, int c){
        if(r==1 &&  c==1){
            System.out.print(p+" ");
        }
        if(r>1){
            btPath(p+"D", r-1, c);
        }
        if(c>1){
            btPath(p+"R", r, c-1);
        }

    }
    static ArrayList<Pair<Integer,Integer>> btList(int r, int c){
        if(r==1|| c==1){
            ArrayList<Pair<Integer,Integer>>list=new ArrayList<>();
            list.add(new Pair(r,c));
            return list;
        }


        ArrayList<Pair<Integer,Integer>>left=btList(r-1, c);
        ArrayList<Pair<Integer,Integer>>right=btList(r, c-1);
         left.addAll(right);
      return left;
    }
    static int bt(int r, int c){
        if(r==1|| c==1)
            return 1;
        int left=bt(r-1, c);
        int right=bt(r, c-1);
        return left+right;
    }
}
