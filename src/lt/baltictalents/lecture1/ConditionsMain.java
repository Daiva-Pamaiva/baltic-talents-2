package lt.baltictalents.lecture1;

class ConditionsMain {
    public static void main(String[] args) {
        int a = 100;
        String rez = "a yra " + (a < 100 ? "mažiau" : "daugiau") + " už šimtą ";

        String status;
        if (a < 100) {
            status = "mažiau";
        } else {
            status = "daugiau";
        }
        rez = "a yra " + status + " už šimtą ";
    }
}
