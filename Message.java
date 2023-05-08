public class Message {
    private String message;
    private float speed;
    private boolean isPrinting = false;

    public Message(String message, float speed){
        this.message = message;
        this.speed = speed;
    }

    public void print(){
        if (isPrinting){
            return;
        }

        isPrinting = true;
        float timer = 0;
        int printIndex = -1;

        // Clear Screen
        System.out.println("\033c");

        while(isPrinting){
            timer += speed * Time.deltaTime;

            if (timer > 1){
                printIndex++;

                if (printIndex >= message.length()){
                    isPrinting = false;
                }

                System.out.print(message.substring(printIndex, printIndex + 1));

                timer = 0;
            }
        }
    }
}
