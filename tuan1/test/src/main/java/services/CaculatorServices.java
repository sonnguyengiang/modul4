package services;


public class CaculatorServices {
    public int cong(int var1, int var2){
        return var1 + var2;
    }

    public int tru(int var1, int var2){
        return var1 - var2;
    }

    public int nhan(int var1, int var2){
        return var1 * var2;
    }

    public int chia(int var1, int var2){
        int a = 0;
        try{
            a = var1 / var2;
        }catch (Exception x){
            x.printStackTrace();
        }
        return a;
    }

    public int caculator(int var1, int var2 , String caculator){
        switch (caculator){
            case "cong":
                return cong(var1, var2);
            case "tru":
                return tru(var1, var2);
            case "nhan":
                return nhan(var1, var2);
            case "chia":
                return chia(var1, var2);
        }
        return 0;
    }
}
