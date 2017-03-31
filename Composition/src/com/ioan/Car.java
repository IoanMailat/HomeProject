package com.ioan;

/**
 * Created by Nelutzu on 3/26/2017.
 */

    public class Car extends Vehicle {
        private String weels;
        private boolean isManual;

        public Car(String name, String weels, boolean isManual) {
            super(name);
            this.weels = weels;
            this.isManual = isManual;
        }

        public String getWeels() {
            return weels;
        }

        public boolean isManual() {
            return isManual;
        }

}
