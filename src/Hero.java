public abstract class Hero implements HavingSuperAbility {
    private int XP  ;
    private int Damej ;
    private String typeOfWeapon ;

    public String getTypeOfWeapon() {
        return typeOfWeapon;
    }

    public void setTypeOfWeapon(String typeOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
    }

    public int getDamej(int damej) {
        return Damej;
    }

    public void setDamej(int damej) {
        Damej = damej;
    }

    public int getXP() {
        return this.XP;
    }

    public void setXP(int XP) {
        this.XP = XP;
    }



}
