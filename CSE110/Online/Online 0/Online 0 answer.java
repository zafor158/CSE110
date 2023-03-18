public class Online1 {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4};

            if(a1[0]>a1[1]&&a1[0]>a1[2]&&a1[0]>a1[3]){
                System.out.println("Fourth smallest number: "+a1[0]);
            }

            else if(a1[1]>a1[0]&&a1[1]>a1[2]&&a1[1]>a1[3]){
                System.out.println("Fourth smallest number: "+a1[1]);
            }
            else if(a1[2]>a1[0] && a1[2]>a1[1]&&a1[2]>a1[3]){
                System.out.print("Fourth smallest number: "+a1[2]);
            }
            else if(a1[3]>a1[0]&&a1[3]>a1[1]&&a1[3]>a1[2]){
                System.out.print("Fourth smallest number: "+a1[3]);
            }
        }


    }

