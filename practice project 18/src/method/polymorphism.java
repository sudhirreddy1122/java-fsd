package method;

class polymorphism 
{
    public int sum(int x, int y) 
    { 
        return (x + y); 
    } 
    public int sum(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
    public double sum(double x, double y) 
    { 
        return (x + y); 
    } 
    public static void main(String args[]) 
    { 
    	polymorphism s = new polymorphism(); 
        System.out.println(s.sum(10, 20)); 
        System.out.println(s.sum(10, 20, 40)); 
        System.out.println(s.sum(10.5, 20.5)); 
    } 
}
