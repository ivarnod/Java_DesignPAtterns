package singletonPattern.cloneSigleton;

class SingletonSuper implements Cloneable {
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}