package rpg.gui.ui;

import utils.cache.ImageCache;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;

public class HoverButtonUI extends BasicButtonUI {

    protected ImageIcon[] parts;
    protected ImageIcon[] partsHover;

    @Override
    protected void installDefaults(AbstractButton b) {
        initParts();
        b.setFont(new Font("Arial", Font.PLAIN, 24));
        b.setForeground(Color.BLACK);
        b.setDoubleBuffered(true);
        b.setOpaque(false);
        b.setBorderPainted(false);
        b.setFocusPainted(false);
        b.setContentAreaFilled(false);
        b.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        Graphics2D g2d = (Graphics2D) g;
        AbstractButton button = (AbstractButton) c;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        ImageIcon[] images = button.getModel().isRollover() ? partsHover : parts;
        drawButtonParts(g2d, images);
    }

    protected void initParts() {
        parts = new ImageIcon[3];
        partsHover = new ImageIcon[3];
        // Cargar imágenes desde la caché
        parts[0] = ImageCache.getImageIcon("userLeftSide");
        parts[1] = ImageCache.getImageIcon("userCenterSide");
        parts[2] = ImageCache.getImageIcon("userRightSide");
        partsHover[0] = ImageCache.getImageIcon("userHoverLeftSide");
        partsHover[1] = ImageCache.getImageIcon("userHoverCenterSide");
        partsHover[2] = ImageCache.getImageIcon("userHoverRightSide");
    }

    protected void drawButtonParts(Graphics2D g2d, ImageIcon[] parts) {
        g2d.drawImage(parts[0].getImage(), 0, 0, null);
        g2d.drawImage(parts[1].getImage(), 27, 0, null);
        g2d.drawImage(parts[2].getImage(), 54, 0, null);
    }
}

