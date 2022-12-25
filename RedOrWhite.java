import javax.swing.JOptionPane;

public class RedOrWhite {
    public static void main(String[] args) {


        JOptionPane.showMessageDialog(null, "Hello,sir. \nWould you like to drink some wine?");;
        int Answer1 = JOptionPane.showConfirmDialog(null, "Drink?","Choose",JOptionPane.YES_NO_OPTION);

        if (Answer1 == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "That's shame... \nGoodbye than...");
        }
        else if (Answer1 == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null,"Oh, That's good \n Red or White?");
            String[] buttons = {"Red","White"};
            int Answer2 = JOptionPane.showOptionDialog(null, "Red or White","Choose",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,buttons,"Red");
            if (Answer2 == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null,"// \n// \n// \n// \n// \n");
                JOptionPane.showMessageDialog(null,"Enjoy your red whine, sir.");

            }
            else {
                JOptionPane.showMessageDialog(null,"// \n// \n// \n// \n// \n");
                JOptionPane.showMessageDialog(null,"Enjoy your white wine, sir.");
            }
        }
    }

}
