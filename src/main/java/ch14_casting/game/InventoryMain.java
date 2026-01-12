package ch14_casting.game;

import ch14_casting.game.items.*;
import ch14_casting.game.system.Inventory;

public class InventoryMain {
    public static void main(String[] args) {

        // AllArgsConstructor를 활용한 Inventory 객체 생성
        Inventory inventory1 = new Inventory(new Weapon[5]);
        // 추가로 생성한 생성자를 활용한 Inventory 객체 생성
        Inventory myInventory = new Inventory(5);
        Weapon[] weapons = {new Sword(), new Bow(), new Staff()};

        // 이번에는 인벤토리의 addWeapon() argument로 바로 생성자 호출했습니다.
        inventory1.addWeapon(new Sword());
        inventory1.addWeapon(new Staff());
        inventory1.addWeapon(new Bow());
        inventory1.addWeapon(new Sword());
        inventory1.addWeapon(new Staff());
        inventory1.addWeapon(new Bow());
        inventory1.attackAll();
        inventory1.useSpecialAbilities();
    }
}
