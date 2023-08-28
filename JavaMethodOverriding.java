package main.java.org.example;

public class JavaMethodOverriding {
    static class Sports {
        String getName() {
            return "Generic Sports";
        }

        void getNumberOfTeamMembers() {
            System.out.println("Each team has n players in " + getName());
        }
    }

    static class Soccer extends Sports {
        @Override
        String getName() {
            return "Soccer Class";
        }

        void getNumberOfTeamMembers() {
            System.out.println("Each team has 11 players in " + getName());
        }

    }

    public static void main(String[] args) {
        Sports sports1 = new Sports();
        Soccer soccer1 = new Soccer();
        System.out.println(sports1.getName());
        sports1.getNumberOfTeamMembers();
        System.out.println(soccer1.getName());
        soccer1.getNumberOfTeamMembers();
    }
}
