/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS2;

/**
 *
 * @author Shirogami
 */
public class SepedaMotor implements IKendaraan { int kecepatan;
int gear;
@Override
public void ubahgear(int gear) { this.gear = gear;
}

@Override
public void tambahKecepatan(int kecepatan) { this.kecepatan += kecepatan;
}

@Override
public void rem(int kecepatan) { this.kecepatan -= kecepatan;
}

@Override
public void info() { System.out.println("Kecepata "+ kecepatan); System.out.println("Gear Sekarang "+ gear);
}

}

