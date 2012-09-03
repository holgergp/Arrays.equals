import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;


/**
 * Test der Arrays.equals() Methode auf 1 und 2 dimensionale Arrays, verpackt in einer Instanz, oder Top-Level
 * @author holgergp
 *
 */
public class ArrayTest {

	//Sample Enum
	public enum CONTENT{
		ONE,TWO,THREE,FOUR;
	}
	
	@Test
	public void testTwoDimensionArrayEqualsInt(){
		int[][]array1= new int[2][2];
		int[][]array2= new int[2][2];
		
		array1[0][0]=1;
		array1[0][1]=2;
		array1[1][0]=3;
		array1[1][1]=4;
		
		array2=array1;
		
		boolean arrEquals = Arrays.equals(array1, array2);
		
		Assert.assertTrue(arrEquals);
		                    
	}
	
	@Test
	public void testTwoDimensiionArrayEqualsENUM(){
		CONTENT[][]array1= new CONTENT[2][2];
		CONTENT[][]array2= new CONTENT[2][2];
		
		array1[0][0]=CONTENT.ONE;
		array1[0][1]=CONTENT.TWO;
		array1[1][0]=CONTENT.THREE;
		array1[1][1]=CONTENT.FOUR;
		
		array2=array1;
		
		boolean arrEquals = Arrays.equals(array1, array2);
		
		Assert.assertTrue(arrEquals);
		                    
	}
	
	@Test
	public void testArrayEqualsClassContainingTwoDimensionEnumArray(){
		EnumTwoDimensionArrayContainer class1= new EnumTwoDimensionArrayContainer();
		EnumTwoDimensionArrayContainer class2= new EnumTwoDimensionArrayContainer();
		
		Assert.assertArrayEquals(class1.container,class2.container);
		
		boolean classEquals = class1.equals(class2);
		Assert.assertTrue(classEquals);
	}
	
	/**
	 * Klasse mit einem 2-dimensionalen ENUM Array
	 * @author holgergp
	 *
	 */
	class EnumTwoDimensionArrayContainer{
		public CONTENT[][]container= new CONTENT[2][2];
		public EnumTwoDimensionArrayContainer() {
			container[0][0]=CONTENT.ONE;
			container[0][1]=CONTENT.TWO;
			container[1][0]=CONTENT.THREE;
			container[1][1]=CONTENT.FOUR;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + Arrays.hashCode(container);
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			EnumTwoDimensionArrayContainer other = (EnumTwoDimensionArrayContainer) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (!Arrays.equals(container, other.container))
				return false;
			return true;
		}
		private ArrayTest getOuterType() {
			return ArrayTest.this;
		}
	}
	
	@Test
	public void testArrayEqualsClassContainingOneDimensionEnumrray(){
		EnumOneDimensionArrayContainer class1= new EnumOneDimensionArrayContainer();
		EnumOneDimensionArrayContainer class2= new EnumOneDimensionArrayContainer();
		
		boolean classEquals = class1.equals(class2);
		Assert.assertTrue(classEquals);
	}
	
	/**
	 * Klasse mit einem 1-dimensionalen ENUM Array
	 * @author holgergp
	 *
	 */
	class EnumOneDimensionArrayContainer{
		public CONTENT[]container= new CONTENT[2];
		public EnumOneDimensionArrayContainer() {
			container[0]=CONTENT.ONE;
			container[1]=CONTENT.TWO;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + Arrays.hashCode(container);
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			EnumOneDimensionArrayContainer other = (EnumOneDimensionArrayContainer) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (!Arrays.equals(container, other.container))
				return false;
			return true;
		}
		private ArrayTest getOuterType() {
			return ArrayTest.this;
		}
	}
	
	@Test
	public void testArrayEqualsClassContainingOneDimensionIntArray(){
		IntTwoDimensionArrayContainer class1= new IntTwoDimensionArrayContainer();
		IntTwoDimensionArrayContainer class2= new IntTwoDimensionArrayContainer();
		
		Assert.assertArrayEquals(class1.container,class2.container);

		boolean classEquals = class1.equals(class2);
		Assert.assertTrue(classEquals);
	}
	
	/**
	 * Klasse mit einem 1-dimensionalen int Array
	 * @author holgergp
	 *
	 */
	class IntTwoDimensionArrayContainer{
		public CONTENT[][]container= new CONTENT[2][2];
		public IntTwoDimensionArrayContainer() {
			container[0][0]=CONTENT.ONE;
			container[0][1]=CONTENT.TWO;
			container[1][0]=CONTENT.THREE;
			container[1][1]=CONTENT.FOUR;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + Arrays.hashCode(container);
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			IntTwoDimensionArrayContainer other = (IntTwoDimensionArrayContainer) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (!Arrays.equals(container, other.container))
				return false;
			return true;
		}
		private ArrayTest getOuterType() {
			return ArrayTest.this;
		}
	}
	
}
