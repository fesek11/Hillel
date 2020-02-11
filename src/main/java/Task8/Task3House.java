package Task8;


public class Task3House {

        Table table;
        Chair chair;
        Penal penal;

    public Task3House() {
        }

    public Task3House(Table table, Chair chair, Penal penal) {
            this.table = table;
            this.chair = chair;
            this.penal = penal;
        }
        public Table getTable () {
            return table;
        }

        public void setTable (Table table){
            this.table = table;
        }

        public Chair getChair () {
            return chair;
        }

        public void setChair (Chair chair){
            this.chair = chair;
        }

        public Penal getPenal () {
            return penal;
        }

        public void setPenal (Penal penal){
            this.penal = penal;
        }

    }

