import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class lab11 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Mouse event");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel();
        frame.getContentPane().add(label, BorderLayout.CENTER);

        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (e.getY() > frame.getContentPane().getHeight() / 2) {
                    label.setText("Cursor entry into the window area from below..");
                }
            }
        });

        frame.setVisible(true);
    }
}
