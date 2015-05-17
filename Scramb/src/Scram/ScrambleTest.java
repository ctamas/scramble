package Scram;

import junit.framework.TestCase;

public class ScrambleTest extends TestCase {

	public void testScrambleWord1() {
	    Scramble tester = new Scramble();
	    assertEquals("almas-t kell adjon", "aamls", tester.ScrambleWord("almas"));
	}
	public void testScrambleWord2() {
	    Scramble tester1 = new Scramble();
	    assertEquals("aamls ptie -t kell adjon", "aamls ptie", tester1.ScrambleWord("almas pite"));
	}
	public void testScrambleWord3() {
	    Scramble tester1 = new Scramble();
	    assertEquals("aamls ptie megelen svlagloza hedig tolan-t kell adjon", "aamls ptie megelen svlagloza hedig tolan", tester1.ScrambleWord("almas pite melegen szolgalva hideg talon"));
	    
	}
}