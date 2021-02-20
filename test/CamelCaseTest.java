import org.junit.Test;

import static org.junit.Assert.*;

public class CamelCaseTest {
    @Test
    public void emptyString() {
        assertEquals("", CamelCase.toCamelCase(""));
    }

    @Test
    public void ifThereIsNotAnyDashOrUnderscore() {
        assertEquals("the", CamelCase.toCamelCase("the"));
        assertEquals("The", CamelCase.toCamelCase("The"));
    }

    @Test
    public void ifThereIsDash() {
        assertEquals("theStealthWarrior", CamelCase.toCamelCase("the-stealth-warrior"));
        assertEquals("TheStealthWarrior", CamelCase.toCamelCase("The-stealth-warrior"));
    }

    @Test
    public void ifThereIsUnderscore() {
        assertEquals("theStealthWarrior", CamelCase.toCamelCase("the_Stealth_Warrior"));
        assertEquals("TheStealthWarrior", CamelCase.toCamelCase("The_Stealth_Warrior"));
    }
}