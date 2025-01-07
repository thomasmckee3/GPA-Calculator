public class TextColor {
    // Standard ANSI Colors (8 Colors + Reset)
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    // Bright ANSI Colors (16-Color Mode)
    public static final String BRIGHT_BLACK = "\u001B[90m";
    public static final String BRIGHT_RED = "\u001B[91m";
    public static final String BRIGHT_GREEN = "\u001B[92m";
    public static final String BRIGHT_YELLOW = "\u001B[93m";
    public static final String BRIGHT_BLUE = "\u001B[94m";
    public static final String BRIGHT_PURPLE = "\u001B[95m";
    public static final String BRIGHT_CYAN = "\u001B[96m";
    public static final String BRIGHT_WHITE = "\u001B[97m";

    // Extended 256-Color Mode (Approximate Orange)
    public static final String ORANGE_256 = "\u001B[38;5;202m";

    // TrueColor (24-bit RGB Mode for Exact Orange)
    public static final String ORANGE_RGB = "\u001B[38;2;255;165;0m";
    public static final String DARK_GREEN_RGB = "\u001B[38;2;0;128;0m";  // TrueColor Dark Green
    public static final String LIGHT_BLUE_RGB = "\u001B[38;2;173;216;230m";


    // Bold
    public static final String BOLD = "\u001B[1m";

    // Background Colors (256-color)
    public static final String BACKGROUND_BLACK = "\u001B[48;5;0m";
    public static final String BACKGROUND_RED = "\u001B[48;5;1m";
    public static final String BACKGROUND_GREEN = "\u001B[48;5;2m";
    public static final String BACKGROUND_YELLOW = "\u001B[48;5;3m";
    public static final String BACKGROUND_BLUE = "\u001B[48;5;4m";
    public static final String BACKGROUND_MAGENTA = "\u001B[48;5;5m";
    public static final String BACKGROUND_CYAN = "\u001B[48;5;6m";
    public static final String BACKGROUND_WHITE = "\u001B[48;5;7m";

    // Example for RGB Customization
    public static String rgb(int red, int green, int blue) {
        return String.format("\u001B[38;2;%d;%d;%dm", red, green, blue);
    }

    // Prevent instantiation of the utility class
    private TextColor() {}
}
