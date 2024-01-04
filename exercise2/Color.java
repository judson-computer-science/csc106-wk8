public enum Color {

	RED("Red", new String[]{"dark red", "rose"}),
	BLACK("Black", new String[]{"black"}),
	GREEN("Green", new String[]{"forest green", "lime green"}),
	BLUE("Blue", new String[]{"navy blue", "baby blue", "sky blue"}),
	YELLOW("Yellow", new String[]{"bright yellow", "light yellow"});

	private String[] variations;
	private String name;

	Color(String name, String[] variations) {
		this.variations = variations;
		this.name = name;
	}

	public String[] getVariations() { return variations; }

	public String getName() { return name; }

}

