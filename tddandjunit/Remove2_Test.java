import org.junit.Test;
import static org.junit.Assert.*;
public class Remove2_Test {
	/*TODO list for my feature
	 * 1. ABCD => BCD
	 * 2. AACD => CD
	 * 3. BACD => BCD
	 * 4. BBAA => BBAA
	 * 5. AABAA => BAA
	 */
	
	public static void test2As1() {
		Remove2 remove2 = new Remove2();
		assertEquals("BCD", remove2.remove("ABCD"));
	}

	public void test2As2() {
		Remove2 remove2 = new Remove2();
		assertEquals("CD", remove2.remove("AACD"));
	}

	public void test2As3() {
		Remove2 remove2 = new Remove2();
		assertEquals("BCD", remove2.remove("BACD"));
	}
	
	public void test2As4() {
		Remove2 remove2 = new Remove2();
		assertEquals("BBAA", remove2.remove("BBAA"));
	}
	
	public void test2As5() {
		Remove2 remove2 = new Remove2();
		assertEquals("BAA", remove2.remove("AABAA"));
	}
	
	public void test2As6() {
		Remove2 remove2 = new Remove2();
		assertEquals("", remove2.remove("AA"));
	}
}