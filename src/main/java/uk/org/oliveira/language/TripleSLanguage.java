package uk.org.oliveira.language;

import com.intellij.lang.Language;

public class TripleSLanguage extends Language {

    public static final TripleSLanguage INSTANCE = new TripleSLanguage();

    private TripleSLanguage() {
        super("TripleS");
    }
}
