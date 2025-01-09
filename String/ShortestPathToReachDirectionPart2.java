package String;

public class ShortestPathToReachDirectionPart2 {
    public static void main(String[] args){
        String s = "SSSNEEEW";
        int scount = 0;
        int ncount = 0;
        int ecount = 0;
        int wcount = 0;

        int i = 0;
        while(i < s.length()){
            char ch = s.charAt(i);
            if(ch == 'S'){
                scount++;
            } else if(ch == 'E'){
                ecount++;
            } else if(ch == 'W'){
                wcount++;
            } else{
                ncount++;
            }
            i++;
        }
        int eans = 0;
        int wans = 0;
        if(ecount > wcount){
             eans = ecount - wcount;
        } else{
            wans = wcount - ecount;
        }

        int nans = 0;
        int sans = 0;
        if(scount > ncount){
            sans = scount - ncount;
        } else{
            nans = ncount - scount;
        }

        if(eans == 0 && wans > 0){
            int a = 0;
            while(a < wans){
                System.out.print('W');
                a++;
            }
        } else if(wans == 0 && eans > 0){
            int a = 0;
            while(a < eans){
                System.out.print('E');
                a++;
            }
        }  if(nans == 0 && sans > 0){
            int a = 0;
            while(a < sans){
                System.out.print('S');
                a++;
            }
        } else if(sans == 0 && nans > 0){
            int a = 0;
            while(a < nans){
                System.out.print('N');
                a++;
            }
        }


    }

}
