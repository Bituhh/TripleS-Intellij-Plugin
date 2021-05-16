package uk.org.oliveira.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.openapi.util.NlsSafe;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class TripleSFileType extends LanguageFileType {
    public static final TripleSFileType INSTANCE = new TripleSFileType();

    private TripleSFileType() {
        super(TripleSLanguage.INSTANCE);
    }

    @Override
    public @NonNls
    @NotNull String getName() {
        return "TripleS File";
    }

    @Override
    public @NlsContexts.Label @NotNull String getDescription() {
        return "TripleS language file";
    }

    @Override
    public @NlsSafe @NotNull String getDefaultExtension() {
        return "sss";
    }

    @Override
    public @Nullable Icon getIcon() {
        return null;
    }
}
