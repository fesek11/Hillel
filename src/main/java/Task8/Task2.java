package Task8;

public class Task2 {
    final int var1 = 0;
    final double var2 = 3.1465467;
    final boolean var3 = true;



    public Task2() {
    }
   /* public Task2(int var1){ Нельзя изменить поле с модификатором final как в конструкторе, так и в Set
   значения обьявляются один раз - в первый раз
        this.var1 = var1;
    }
    public Task2(int var1, double var2) {
        this.var1 = var1;
        this.var2 = var2;
    }
    public Task2(int var1, double var2, boolean var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }*/

    public int getVar1() {
        return var1;
    }

    public double getVar2() {
        return var2;
    }

    public boolean isVar3() {
        return var3;
    }
   /* public int setVar1(int var1){
        this.var1 = var1;
    }
    public int setVar1(int var2){
        this.var2 = var2;
    }
    public int setVar1(int var2){
        this.var3 = var3;
    }*/
}
