class MakeCaptian {

    private MakeCaptian(){}


    private static class SingeltonHelper {


        private static final MakeCaptian CAPTIAN = new MakeCaptian();
    }


        public static MakeCaptian getCaptian(){

            return SingeltonHelper.CAPTIAN;
        }
    }



