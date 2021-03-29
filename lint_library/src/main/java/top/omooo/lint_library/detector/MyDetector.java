package top.omooo.lint_library.detector;

import com.android.tools.lint.detector.api.Detector;

import org.jetbrains.annotations.Nullable;

import java.util.Collection;

public class MyDetector extends Detector implements Detector.UastScanner {


    @Nullable
    @Override
    public Collection<String> getApplicableAttributes() {
        return super.getApplicableAttributes();
    }


}
