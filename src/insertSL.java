import java.util.Random;

public class insertSL<T extends Comparable<T>> extends SkipList<T> {
	Random seedGenerator = new Random();
	int randomSeed = seedGenerator.nextInt() | 0x100;
	int randomLevel() {
		int x = randomSeed;
		x ^= x << 13;
		x ^= x >>> 17;
		x ^= x << 5;
		randomSeed = x;
		int level = 0;
		while((x&1) == 0) {
			level++;
			x = x >>> 1;
		}
		return level;
	}
	
	@Override
	public void insert(T value) {
		int temp = randomLevel();
	
		if (header.forward == null) {
			header.value = value;
			header.
			
		}
		SkipList.SkipListNode<T>[] tempNode = header.forward[];
		for(int i = 3; i > header.forward.length; i--) {
			if(header.forward[i].value.equals(value)) {
				tempNode = header.forward[i]; 
				
			}
		}
		
	}

	@Override
	public boolean contains(Comparable value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Comparable value) {
		// TODO Auto-generated method stub
		return false;
	}


}
