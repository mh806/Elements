
    class WaterSource{
        private String s;
        WaterSource(){
            System.out.println("Learning Something");
            s = "Constructed";
        }
        public String toString(){return s;}
    }
    
    class LearningSystem{
        private String value1,value2,value3;
        private WaterSource source = new WaterSource();
        public String toString(){
            return
                    "value1 = "+value1+" "+
                            "value2 = "+value2+
            "source:"+source;
        }


    public static void main(String[] args) {
        LearningSystem learner = new LearningSystem();
        System.out.println(learner);
    }
}
