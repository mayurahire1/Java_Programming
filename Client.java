// user-defined package import
import PPA.Infosystems;
import PPA.LB.Pune;
import PPA.Marvellous;


class Client
{
    public static void main(String[] args) 
    {
        Marvellous mobj = new Marvellous();
        Infosystems iobj = new Infosystems();
        Pune pobj = new Pune();      

        System.out.println("Inside main of Client");

        mobj.fun();
        iobj.gun();
        pobj.sun();
    }
}