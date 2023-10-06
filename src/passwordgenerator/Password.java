package passwordgenerator;

import java.security.SecureRandom;

public class Password {

    private int length;
    private String characters;
    private String numbers;
    private String specials;

    private boolean includeNumbers;
    private boolean includeSpecials;

    private SecureRandom random;
    private String password;

    public Password() {
        this.length = 12;
        this.characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        this.numbers = "0123456789";
        this.specials = "!@#$%^&*()_+-=[]{};:,.<>?/";

        this.includeNumbers = true;
        this.includeSpecials = true;

        this.random = new SecureRandom();
        this.password = "";
    }

    public String getPassword() {
        String tempPassword = this.password;
        this.password = "";
        return tempPassword;
    }

    public void generatePassword() {
        this.characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        if (this.includeNumbers) {
            this.characters += this.numbers;
        }
        if (this.includeSpecials) {
            this.characters += this.specials;
        }
        for (int i = 0; i < this.length; i++) {
            int randomIndex = random.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            this.password += randomChar;
        }

    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isIncludeNumbers() {
        return includeNumbers;
    }

    public void setIncludeNumbers(boolean includeNumbers) {
        this.includeNumbers = includeNumbers;
    }

    public boolean isIncludeSpecials() {
        return includeSpecials;
    }

    public void setIncludeSpecials(boolean includeSpecials) {
        this.includeSpecials = includeSpecials;
    }

    public String getCharacters() {
        return characters;
    }

    public void setCharacters(String characters) {
        this.characters = characters;
    }

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    public String getSpecials() {
        return specials;
    }

    public void setSpecials(String specials) {
        this.specials = specials;
    }

    public SecureRandom getRandom() {
        return random;
    }

    public void setRandom(SecureRandom random) {
        this.random = random;
    }

}
