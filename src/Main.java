class Main {
    public static void main(String[] args) {
        for(Luna luna: Luna.values()){
            System.out.println(luna);
        }
    }
    enum Luna {
        IANUARIE, FEBRUARIE, MARTIE, APRILIE, MAI, IUNIE, IULIE, AUGUST, SEPTEMBRIE, OCTOMBRIE, NOIEMBRIE, DECEMBRIE
    }
}