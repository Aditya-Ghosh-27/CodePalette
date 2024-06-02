// sample problem on method overloading(Polymorphism)

class FindMax{
    int m, n;
    FindMax(int nx, int ny){
        m = nx;
        n = ny;
    }
    int GetMax(int x, int y){
        return Math.max(x, y);
    }
}
class FindGreat extends FindMax{
    int z;
    FindGreat(int nx, int ny, int nz){
        super(nx, ny);
        z = nz;
    }
    int GetMax(int q, int r, int s){
        return Math.max(q, Math.max(r, s));
    }
    public void Show(){
        int p = GetMax(m, n);
        int q = GetMax(m, n, z);
        System.out.println("Greatest from "+m+" and "+n+" is: "+p);
        System.out.println("Greatest from "+m+" and "+n+" and "+z+" is: "+q);
    }
}
class sampleProblem4{
    public static void main(String[] args){
        FindGreat ob = new FindGreat(10, 70, 25);
        ob.Show();
    }
}