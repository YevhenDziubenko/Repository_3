public class Box {

        private int width;
        private int length;
        private int height;

        public Box (){
                width = 20;
                length = 30;
                height = 40;
        }

        public Box (int size1, int size2, int size3) {
                width = size1;
                length = size2;
                height = size3;
        }

        public int getWidth(){
                return width;
        }


        public int getLength(){
                return length;
        }

        public int getHeight(){
                return height;
        }


        public void setWidth(int size1){
                width = size1;
        }

        public void setLength(int size2){
                length = size2;
        }

        public void setHeight(int size3){
                height = size3;
        }

//        int getVolume() {
//                return width * length * height;
//        }

//        public static void main(String[] args) {

//                Box theBox = new Box();
//                System.out.println("Box volume: " + theBox.getVolume());
//        }
}