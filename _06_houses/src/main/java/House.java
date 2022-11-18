
    public class House {
        private double housenumber;
        private String adress;
        private String color;
        private double size;

        public House(double housenumber, String adress, String color, double size) {
            this.housenumber = housenumber;
            this.adress = adress;
            this.color = color;
            this.size = size;
        }
        public House() {
            housenumber = 0;
            adress = "unknown";
            color = "unknown";
            size = 0;
        }

            public double getHousenumber() {
            return housenumber;
        }

        public void setHousenumber(double housenumber) {
            this.housenumber = housenumber;
        }

        public String getAdress() {
            return adress;
        }

        public void setAdress(String adress) {
            this.adress = adress;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public double getSize() {
            return size;
        }

        public void setSize(double size) {
            this.size = size;
        }

        @Override
        public String toString() {
            return "House{" +
                    "housenumber=" + housenumber +
                    ", adress='" + adress + '\'' +
                    ", color='" + color + '\'' +
                    ", size=" + size +
                    '}';
        }
    }

