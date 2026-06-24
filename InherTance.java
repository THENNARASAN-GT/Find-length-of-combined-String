import java.io.*;
class parent{
    String s1,s2;

    public void display(String name1, String name2){
       s1=name1;
       s2=name2;
        String str=s1+s2;
       System.out.println( "this is my two names:"+str);

    }


}
class gt extends parent{
    String s3;

    public void display(String name1, String name2, String name3){
        s1=name1;
        s2=name2;
        s3=name3;
        String str=s1+s2+s3;
        String str1=str.toLowerCase();
        int len=str1.length();
        System.out.println("this is my three names:"+str1);
        System.out.println("Length of the combined name: " + len);  


    }

}


public class InherTance {
    public static void main(String[]args)throws IOException{
 BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
 parent p=new parent();
 
        System.out.print("Enter first name: ");
        String name1=br.readLine();
        System.out.print("Enter second name: ");
        String name2=br.readLine();
        System.out.print("Enter third name: ");
        String name3=br.readLine();
        p.display(name1,name2);
        gt p1=new gt();
        p1.display(name1, name2,name3);

    
    }
}
