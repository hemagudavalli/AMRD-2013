package technical;

import org.junit.Test;

import junit.framework.Assert;

public class MultiDArrayTester {
	@Test
	public void testForNotNull(){
		MultiDimensionArray array = new MultiDimensionArray();
		int [][] arr = {{1,2},{3,4},{5,6}};
		int [] length = new int[1];
		length[0]=2;
		array.setMultiArr(arr);
		array.sum(array, length);
	}
	@Test
	public void testForEqual(){
		MultiDimensionArray array = new MultiDimensionArray();
		int [][] arr = {{1,2},{3,4},{5,6}};
		int [] length = new int[1];
		length[0]=2;
		array.setMultiArr(arr);
		array.sum(array, length);
		Assert.assertEquals(array.sum(array, length), (Long)21L);
	}
	@Test
	public void testForNotEqual(){
		MultiDimensionArray array = new MultiDimensionArray();
		int [][] arr = {{1,2},{3,4},{5,7}};
		int [] length = new int[1];
		length[0]=2;
		array.setMultiArr(arr);
		array.sum(array, length);
		Assert.assertNotSame((Long)21L, array.sum(array, length));
	}

}
