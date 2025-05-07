public class FlourPacker {

    public static void main(String[] args) {

        System.out.println(canPack(2, 1, 15));
        System.out.println(canPack(3, 1, 15));
        System.out.println(canPack(4, 1, 11));
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(-5, 11, 11));
    }

        public static boolean canPack(int bigCount, int smallCount, int goal){

            int totalBigWeight = bigCount * 5;

            if(bigCount < 0 || smallCount < 0 || goal < 0){
                return false;
            }


            if(totalBigWeight >= goal){

                int remaining = goal % 5;
                if(smallCount >= remaining){

                    return true;
                }
            }else{

                //checking if totalBigWeight is less than the goal
                if(smallCount >= goal - totalBigWeight){

                    return true;
                }
            }

            return false;
        }
    }

