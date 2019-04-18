package composite;

import java.util.*;

public class CompositeElement implements BaseComponent {
	private int id;
	private String name;
	
	private List<BaseComponent> components;
	
	public void printName() {
		components.forEach(BaseComponent::printName);
	}

	public CompositeElement(int id, String name) {
		this.id = id;
		this.name = name;
		this.components = new ArrayList<>();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<BaseComponent> getComponents() {
		return components;
	}

	public void setComponents(List<BaseComponent> components) {
		this.components = components;
	}

	public void addComponent(BaseComponent c) {
		components.add(c);
	}
	
	public void removeComponent(BaseComponent c) {
		components.remove(c);
	}
	
}
