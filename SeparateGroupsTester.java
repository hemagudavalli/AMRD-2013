package technical;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class SeparateGroupsTester {
@Test
public void sumPossible()
{
	List<Integer> list = Arrays.asList(2,1,4,5,3,3);
	int k =3;
	SeparateGroups seGroups = new SeparateGroups();
	Assert.assertTrue(seGroups.separate(list, k));
}
@Test
public void sumNotPossiblek()
{
	List<Integer> list = Arrays.asList(2,1,5,3,3);
	int k =3;
	SeparateGroups seGroups = new SeparateGroups();
	Assert.assertFalse(seGroups.separate(list, k));
}
@Test
public void sumNotPossible()
{
	List<Integer> list = Arrays.asList(2,1,5,3,8,3,4);
	int k =3;
	SeparateGroups seGroups = new SeparateGroups();
	Assert.assertFalse(seGroups.separate(list, k));
}
@Test
public void sumNotNull()
{
	List<Integer> list = Arrays.asList(1);
	int k =3;
	SeparateGroups seGroups = new SeparateGroups();
	Assert.assertNotNull(seGroups.separate(list, k));
}
}
