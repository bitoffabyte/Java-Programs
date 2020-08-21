import java.util.Scanner;

class journal {
    String JournalName;
    String Publisher;
    int impactFactor;

    public dispJD(String str){
        if(JournalName.contains(str)){
            System.out.println("JournalName :" + JournalName);
            System.out.println("Publisher :" + Publisher);
            System.out.println("impactFactor :" + impactFactor);
        }
    }

    public chkIF(int i){
        if (impactFactor >= i){
            System.out.println("JournalName :" + JournalName);
            System.out.println("Publisher :" + Publisher);
            System.out.println("impactFactor :" + impactFactor);
        }
    }
}

class JournalCheck {

    public static void main(String args[]){
        journal j = new journal();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the journal details (name publisher and impact factor)");
        j.JournalName = sc.nextLine();
        j.Publisher -sc.nextLine();
        j.impactFactor = sc.nextInt();
        System.out.println("Enter the check string");
        String ch = sc.nextLine();
        j.dispJD(ch);
        System.out.println("Enter the Impact Factor");
        int i ch = sc.nextInt();
        j.chkIF(i);
    }
}