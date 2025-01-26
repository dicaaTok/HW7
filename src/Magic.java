public class Magic extends Hero {
    @Override
    public String applySuperAbility() {
        System.out.println("Magic применил супер способность CRITICAL DAMAGE ");
        return "" ;
    }
    public int XP ;
public void bb(){
    XP += XP%10;
}
}