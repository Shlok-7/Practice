class nesttest{
    private String secret="Gold";
    
    class InnerRoom{
        void access(){
            System.out.println("Accesing seccret: "+secret);
        }
    }
    public static void main(String[] args) {
        nesttest house=new nesttest();
        nesttest.InnerRoom room =house.new InnerRoom();
        room.access();

        System.out.println("Nest Host:"+ InnerRoom.class.getNestHost().getName());
        System.out.println("Are they nestmates ? "+ nesttest.class.isNestmateOf(InnerRoom.class));

    }
}