
package alomarket;

class Queue {
    Node front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    /**
     * @param key  Kuyruga eklenecek Siparis nesnesini parametre alir.
     */
    
    void addSiparis(Siparis key) {

        // Kontrol node´u olusturulur.
        Node temp = new Node();
        temp.data = key;

        // Eger kuyruk bos ise Node hem rear hem front olur.
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }

        // Yeni node kuyrugun sonune eklenir ve rear degistirilir.
        this.rear.next = temp;
        this.rear = temp;
    }

    // Kuyruktan Siparis silmek icindir.Kuyruk mantigina göre de en öndeki siparis
    // silinir.
    void removeSiparis() {
        // Kuyruk bos ise null döndürülür cünkü silme islemi yapilamaz.
        if (this.front == null)
            return;

        // Front fronttan bir sonrakine tasinir.
        Node temp = this.front;
        this.front = this.front.next;

        // Front null olursa rear da null yapilir .Cünkü kuyrukta eleman kalmamistir.
        if (this.front == null)
            this.rear = null;
    }
}
    