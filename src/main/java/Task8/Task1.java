package Task8;

public class Task1 {
    int var1 = 20;
    double var2 = 2.3;
    float var3 = 2.3F;
    long var4 = 2222L;
    boolean var5 = true;
    byte var6 = 126;
    short var7 = 213;
    char var8 = 'a';
    String var9 = "Hillel";

    public Task1() {
    }

    public Task1(int var1) {
        this.var1 = var1;
    }

    public Task1(int var1, double var2) {
        this(var1);
        this.var2 = var2;
    }

    public Task1(int var1, double var2, float var3) {
        this(var1, var2);
        this.var3 = var3;
    }

    public Task1(int var1, double var2, float var3, long var4) {
        this(var1, var2, var3);
        this.var4 = var4;
    }

    public Task1(int var1, double var2, float var3, long var4, boolean var5) {
        this(var1, var2, var3, var4);
        this.var5 = var5;
    }

    public Task1(int var1, double var2, float var3, long var4, boolean var5, byte var6) {
        this(var1, var2, var3, var4, var5);
        this.var6 = var6;
    }

    public Task1(int var1, double var2, float var3, long var4, boolean var5, byte var6, short var7) {
        this(var1, var2, var3, var4, var5, var6);
        this.var7 = var7;
    }

    public Task1(int var1, double var2, float var3, long var4, boolean var5, byte var6, short var7, char var8) {
        this(var1, var2, var3, var4, var5, var6, var7);
        this.var8 = var8;
    }

    public Task1(int var1, double var2, float var3, long var4, boolean var5, byte var6, short var7, char var8, String var9) {
        this(var1, var2, var3, var4, var5, var6, var7, var8);
        this.var9 = var9;
    }

    public int getVar1() {
        return var1;
    }

    public void setVar1(int var1) {
        this.var1 = var1;
    }

    public double getVar2() {
        return var2;
    }

    public void setVar2(double var2) {
        this.var2 = var2;
    }

    public float getVar3() {
        return var3;
    }

    public void setVar3(float var3) {
        this.var3 = var3;
    }

    public long getVar4() {
        return var4;
    }

    public void setVar4(long var4) {
        this.var4 = var4;
    }

    public boolean isVar5() {
        return var5;
    }

    public void setVar5(boolean var5) {
        this.var5 = var5;
    }

    public byte getVar6() {
        return var6;
    }

    public void setVar6(byte var6) {
        this.var6 = var6;
    }

    public short getVar7() {
        return var7;
    }

    public void setVar7(short var7) {
        this.var7 = var7;
    }

    public char getVar8() {
        return var8;
    }

    public void setVar8(char var8) {
        this.var8 = var8;
    }

    public String getVar9() {
        return var9;
    }

    public void setVar9(String var9) {
        this.var9 = var9;
    }

}
