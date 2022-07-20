public class Character {

    String name;
    int healthPoints;
    String status;
    GuitarWeapon guitarWeapon;


    public Character(String name) {
        this.name = name;
        healthPoints = 100;
        status = "Normal";
    }

    public int attack(Character characterName, GuitarWeapon guitarWeapon) {
        int damage = guitarWeapon.damage;
        characterName.healthPoints -= damage;
        characterName.status = guitarWeapon.dmgType;
        System.out.println("You dealt " + damage + " damage to " + characterName);
        return characterName.healthPoints;
    }
}
