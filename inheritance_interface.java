

interface sampleinterface{
    void meth1();
    void meth2();
}
interface childsampleinterface extends sampleinterface{
    void meth3();
    void meth4();
}
class mysamplespace implements childsampleinterface{
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
}
public class inheritance_interface {

    public static void main(String[] args) {
        mysamplespace s = new mysamplespace();
        s.meth1();
        s.meth2();
        s.meth3();
        s.meth4();
    }
    
}
