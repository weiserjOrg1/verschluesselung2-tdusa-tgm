package dusa;
import java.awt.*;
import javax.swing.*;

	public class CipherPanel extends JPanel{
		private CipherModel m1;
		private CipherView v1;
		public CipherPanel (CipherView v, CipherModel m) {
			this.m1 = m;
			this.v1 = v;
		}
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("Verschl�sselter Text: "+"\n"+this.m1.getEtext(), 5, 20);
			g.drawString("Entschl�sselter Text: "+"\n"+this.m1.getDtext(), 5, 40);
		}
}
