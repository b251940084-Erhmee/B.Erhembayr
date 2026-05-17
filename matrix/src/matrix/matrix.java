package matrix;

public class matrix {

    private int [][] huvisagch1;
    private int [][] huvisagch2;
    private String huvisagch;

    public matrix(int [][] huvisagch1, int [][] huvisagch2, String huvisagch){
        this.huvisagch1 = huvisagch1;
        this.huvisagch2 = huvisagch2;
        this.huvisagch = huvisagch;
    }

    private int [][] nemeh(int [][] huvisagch1, int [][] huvisagch2){
        int [][] result = new int[huvisagch1.length][huvisagch1[0].length];

        for(int i=0;i<huvisagch1.length;i++){
            for(int j=0;j<huvisagch1[0].length;j++){
                result[i][j] = huvisagch1[i][j] + huvisagch2[i][j];
            }
        }
        return result;
    }

    private int [][] hasah(int [][] huvisagch1, int [][] huvisagch2){
        int [][] result = new int[huvisagch1.length][huvisagch1[0].length];

        for(int i=0;i<huvisagch1.length;i++){
            for(int j=0;j<huvisagch1[0].length;j++){
                result[i][j] = huvisagch1[i][j] - huvisagch2[i][j];
            }
        }
        return result;
    }

    private int [][] urjih(int [][] huvisagch1, int [][] huvisagch2){
        int [][] result = new int[huvisagch1.length][huvisagch2[0].length];

        for(int i=0;i<huvisagch1.length;i++){
            for(int j=0;j<huvisagch2[0].length;j++){
                for(int k=0;k<huvisagch2.length;k++){
                    result[i][j] += huvisagch1[i][k] * huvisagch2[k][j];
                }
            }
        }
        return result;
    }

    public int [][] choosehuvisagch(){
        int [][] result = null;

        if(huvisagch.equals("+")){
            result = nemeh(huvisagch1,huvisagch2);
        }
        else if(huvisagch.equals("-")){
            result = hasah(huvisagch1,huvisagch2);
        }
        else if(huvisagch.equals("*")){
            result = urjih(huvisagch1,huvisagch2);
        }

        printmatrix(result);
        return result;
    }

    private void printmatrix(int [][] pmatrix){
        for(int i=0;i<pmatrix.length;i++){
            for(int j=0;j<pmatrix[i].length;j++){
                System.out.print(pmatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}	



