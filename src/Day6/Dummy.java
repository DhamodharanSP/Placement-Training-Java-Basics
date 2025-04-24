package Day6;

public class Dummy
{
    public static void main(String[] args) {
//        for(int i=1;i<10;++i)
//        {
//            for(int j=i*100;j<(i+1)*100;++j)
//                System.out.print(j+" ");
//            System.out.println();
//        }

        for(int i=1;i<10;++i)
        {
            for(int j=i*100+11;j<i*100+20;++j)
            {
                System.out.println("Factors of "+j);
                for(int k=1;k<10;++k)
                {
                    if(j%k==0)
                        System.out.print(k+" ");
                }
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
