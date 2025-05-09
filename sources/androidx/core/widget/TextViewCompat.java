package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.util.Preconditions;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.Constants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class TextViewCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int AUTO_SIZE_TEXT_TYPE_NONE = 0;
    public static final int AUTO_SIZE_TEXT_TYPE_UNIFORM = 1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api23Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api23Impl() {
        }

        public static int getBreakStrategy(TextView textView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a2282734", new Object[]{textView})).intValue();
            }
            return textView.getBreakStrategy();
        }

        public static ColorStateList getCompoundDrawableTintList(TextView textView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ColorStateList) ipChange.ipc$dispatch("2547510f", new Object[]{textView});
            }
            return textView.getCompoundDrawableTintList();
        }

        public static PorterDuff.Mode getCompoundDrawableTintMode(TextView textView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PorterDuff.Mode) ipChange.ipc$dispatch("812901e1", new Object[]{textView});
            }
            return textView.getCompoundDrawableTintMode();
        }

        public static int getHyphenationFrequency(TextView textView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dcd581e1", new Object[]{textView})).intValue();
            }
            return textView.getHyphenationFrequency();
        }

        public static void setBreakStrategy(TextView textView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5477d756", new Object[]{textView, new Integer(i)});
            } else {
                textView.setBreakStrategy(i);
            }
        }

        public static void setCompoundDrawableTintList(TextView textView, ColorStateList colorStateList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9b6b88d7", new Object[]{textView, colorStateList});
            } else {
                textView.setCompoundDrawableTintList(colorStateList);
            }
        }

        public static void setCompoundDrawableTintMode(TextView textView, PorterDuff.Mode mode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b755293f", new Object[]{textView, mode});
            } else {
                textView.setCompoundDrawableTintMode(mode);
            }
        }

        public static void setHyphenationFrequency(TextView textView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c9b80e1", new Object[]{textView, new Integer(i)});
            } else {
                textView.setHyphenationFrequency(i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api24Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api24Impl() {
        }

        public static DecimalFormatSymbols getInstance(Locale locale) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DecimalFormatSymbols) ipChange.ipc$dispatch("76c85f57", new Object[]{locale});
            }
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api26Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api26Impl() {
        }

        public static int getAutoSizeMaxTextSize(TextView textView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7df6b664", new Object[]{textView})).intValue();
            }
            return textView.getAutoSizeMaxTextSize();
        }

        public static int getAutoSizeMinTextSize(TextView textView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f8c45236", new Object[]{textView})).intValue();
            }
            return textView.getAutoSizeMinTextSize();
        }

        public static int getAutoSizeStepGranularity(TextView textView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("563526d4", new Object[]{textView})).intValue();
            }
            return textView.getAutoSizeStepGranularity();
        }

        public static int[] getAutoSizeTextAvailableSizes(TextView textView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (int[]) ipChange.ipc$dispatch("86963c23", new Object[]{textView});
            }
            return textView.getAutoSizeTextAvailableSizes();
        }

        public static int getAutoSizeTextType(TextView textView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("49de52c3", new Object[]{textView})).intValue();
            }
            return textView.getAutoSizeTextType();
        }

        public static void setAutoSizeTextTypeUniformWithConfiguration(TextView textView, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6053fe8", new Object[]{textView, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            } else {
                textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            }
        }

        public static void setAutoSizeTextTypeUniformWithPresetSizes(TextView textView, int[] iArr, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("80bc1d4a", new Object[]{textView, iArr, new Integer(i)});
            } else {
                textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            }
        }

        public static void setAutoSizeTextTypeWithDefaults(TextView textView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("85bf017", new Object[]{textView, new Integer(i)});
            } else {
                textView.setAutoSizeTextTypeWithDefaults(i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api28Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api28Impl() {
        }

        public static CharSequence castToCharSequence(PrecomputedText precomputedText) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("fa95fbce", new Object[]{precomputedText}) : precomputedText;
        }

        public static String[] getDigitStrings(DecimalFormatSymbols decimalFormatSymbols) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String[]) ipChange.ipc$dispatch("a354179d", new Object[]{decimalFormatSymbols});
            }
            return decimalFormatSymbols.getDigitStrings();
        }

        public static PrecomputedText.Params getTextMetricsParams(TextView textView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PrecomputedText.Params) ipChange.ipc$dispatch("158451d9", new Object[]{textView});
            }
            return textView.getTextMetricsParams();
        }

        public static void setFirstBaselineToTopHeight(TextView textView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c043af54", new Object[]{textView, new Integer(i)});
            } else {
                textView.setFirstBaselineToTopHeight(i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api34Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api34Impl() {
        }

        public static void setLineHeight(TextView textView, int i, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14aa659d", new Object[]{textView, new Integer(i), new Float(f)});
            } else {
                textView.setLineHeight(i, f);
            }
        }
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface AutoSizeTextType {
    }

    private TextViewCompat() {
    }

    public static int getAutoSizeMaxTextSize(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7df6b664", new Object[]{textView})).intValue();
        }
        if (Build.VERSION.SDK_INT >= 27) {
            return Api26Impl.getAutoSizeMaxTextSize(textView);
        }
        if (textView instanceof AutoSizeableTextView) {
            return ((AutoSizeableTextView) textView).getAutoSizeMaxTextSize();
        }
        return -1;
    }

    public static int getAutoSizeMinTextSize(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f8c45236", new Object[]{textView})).intValue();
        }
        if (Build.VERSION.SDK_INT >= 27) {
            return Api26Impl.getAutoSizeMinTextSize(textView);
        }
        if (textView instanceof AutoSizeableTextView) {
            return ((AutoSizeableTextView) textView).getAutoSizeMinTextSize();
        }
        return -1;
    }

    public static int getAutoSizeStepGranularity(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("563526d4", new Object[]{textView})).intValue();
        }
        if (Build.VERSION.SDK_INT >= 27) {
            return Api26Impl.getAutoSizeStepGranularity(textView);
        }
        if (textView instanceof AutoSizeableTextView) {
            return ((AutoSizeableTextView) textView).getAutoSizeStepGranularity();
        }
        return -1;
    }

    public static int[] getAutoSizeTextAvailableSizes(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("86963c23", new Object[]{textView});
        }
        if (Build.VERSION.SDK_INT >= 27) {
            return Api26Impl.getAutoSizeTextAvailableSizes(textView);
        }
        if (textView instanceof AutoSizeableTextView) {
            return ((AutoSizeableTextView) textView).getAutoSizeTextAvailableSizes();
        }
        return new int[0];
    }

    public static int getAutoSizeTextType(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49de52c3", new Object[]{textView})).intValue();
        }
        if (Build.VERSION.SDK_INT >= 27) {
            return Api26Impl.getAutoSizeTextType(textView);
        }
        if (textView instanceof AutoSizeableTextView) {
            return ((AutoSizeableTextView) textView).getAutoSizeTextType();
        }
        return 0;
    }

    public static ColorStateList getCompoundDrawableTintList(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorStateList) ipChange.ipc$dispatch("2547510f", new Object[]{textView});
        }
        Preconditions.checkNotNull(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            return Api23Impl.getCompoundDrawableTintList(textView);
        }
        if (textView instanceof TintableCompoundDrawablesView) {
            return ((TintableCompoundDrawablesView) textView).getSupportCompoundDrawablesTintList();
        }
        return null;
    }

    public static PorterDuff.Mode getCompoundDrawableTintMode(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PorterDuff.Mode) ipChange.ipc$dispatch("812901e1", new Object[]{textView});
        }
        Preconditions.checkNotNull(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            return Api23Impl.getCompoundDrawableTintMode(textView);
        }
        if (textView instanceof TintableCompoundDrawablesView) {
            return ((TintableCompoundDrawablesView) textView).getSupportCompoundDrawablesTintMode();
        }
        return null;
    }

    public static Drawable[] getCompoundDrawablesRelative(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable[]) ipChange.ipc$dispatch("54867e6", new Object[]{textView});
        }
        return textView.getCompoundDrawablesRelative();
    }

    public static int getFirstBaselineToTopHeight(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d69f930e", new Object[]{textView})).intValue();
        }
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int getLastBaselineToBottomHeight(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("51567b32", new Object[]{textView})).intValue();
        }
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static int getMaxLines(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbb363bf", new Object[]{textView})).intValue();
        }
        return textView.getMaxLines();
    }

    public static int getMinLines(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7935a92d", new Object[]{textView})).intValue();
        }
        return textView.getMinLines();
    }

    private static int getTextDirection(TextDirectionHeuristic textDirectionHeuristic) {
        TextDirectionHeuristic textDirectionHeuristic2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("994a4537", new Object[]{textDirectionHeuristic})).intValue();
        }
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (textDirectionHeuristic == textDirectionHeuristic3 || textDirectionHeuristic == (textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == textDirectionHeuristic2) {
            return 6;
        }
        if (textDirectionHeuristic == textDirectionHeuristic3) {
            return 7;
        }
        return 1;
    }

    private static TextDirectionHeuristic getTextDirectionHeuristic(TextView textView) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextDirectionHeuristic) ipChange.ipc$dispatch("73b14c06", new Object[]{textView});
        }
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
            if (textView.getLayoutDirection() == 1) {
                z = true;
            }
            switch (textView.getTextDirection()) {
                case 2:
                    return TextDirectionHeuristics.ANYRTL_LTR;
                case 3:
                    return TextDirectionHeuristics.LTR;
                case 4:
                    return TextDirectionHeuristics.RTL;
                case 5:
                    return TextDirectionHeuristics.LOCALE;
                case 6:
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                case 7:
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                default:
                    if (z) {
                        return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        } else {
            byte directionality = Character.getDirectionality(Api28Impl.getDigitStrings(Api24Impl.getInstance(textView.getTextLocale()))[0].codePointAt(0));
            if (directionality == 1 || directionality == 2) {
                return TextDirectionHeuristics.RTL;
            }
            return TextDirectionHeuristics.LTR;
        }
    }

    public static PrecomputedTextCompat.Params getTextMetricsParams(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PrecomputedTextCompat.Params) ipChange.ipc$dispatch("56e0d065", new Object[]{textView});
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new PrecomputedTextCompat.Params(Api28Impl.getTextMetricsParams(textView));
        }
        PrecomputedTextCompat.Params.Builder builder = new PrecomputedTextCompat.Params.Builder(new TextPaint(textView.getPaint()));
        if (i >= 23) {
            builder.setBreakStrategy(Api23Impl.getBreakStrategy(textView));
            builder.setHyphenationFrequency(Api23Impl.getHyphenationFrequency(textView));
        }
        builder.setTextDirection(getTextDirectionHeuristic(textView));
        return builder.build();
    }

    public static void setAutoSizeTextTypeUniformWithConfiguration(TextView textView, int i, int i2, int i3, int i4) throws IllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6053fe8", new Object[]{textView, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (Build.VERSION.SDK_INT >= 27) {
            Api26Impl.setAutoSizeTextTypeUniformWithConfiguration(textView, i, i2, i3, i4);
        } else if (textView instanceof AutoSizeableTextView) {
            ((AutoSizeableTextView) textView).setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }
    }

    public static void setAutoSizeTextTypeUniformWithPresetSizes(TextView textView, int[] iArr, int i) throws IllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80bc1d4a", new Object[]{textView, iArr, new Integer(i)});
        } else if (Build.VERSION.SDK_INT >= 27) {
            Api26Impl.setAutoSizeTextTypeUniformWithPresetSizes(textView, iArr, i);
        } else if (textView instanceof AutoSizeableTextView) {
            ((AutoSizeableTextView) textView).setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }
    }

    public static void setAutoSizeTextTypeWithDefaults(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85bf017", new Object[]{textView, new Integer(i)});
        } else if (Build.VERSION.SDK_INT >= 27) {
            Api26Impl.setAutoSizeTextTypeWithDefaults(textView, i);
        } else if (textView instanceof AutoSizeableTextView) {
            ((AutoSizeableTextView) textView).setAutoSizeTextTypeWithDefaults(i);
        }
    }

    public static void setCompoundDrawableTintList(TextView textView, ColorStateList colorStateList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b6b88d7", new Object[]{textView, colorStateList});
            return;
        }
        Preconditions.checkNotNull(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            Api23Impl.setCompoundDrawableTintList(textView, colorStateList);
        } else if (textView instanceof TintableCompoundDrawablesView) {
            ((TintableCompoundDrawablesView) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    public static void setCompoundDrawableTintMode(TextView textView, PorterDuff.Mode mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b755293f", new Object[]{textView, mode});
            return;
        }
        Preconditions.checkNotNull(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            Api23Impl.setCompoundDrawableTintMode(textView, mode);
        } else if (textView instanceof TintableCompoundDrawablesView) {
            ((TintableCompoundDrawablesView) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    public static void setCompoundDrawablesRelative(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d86771d9", new Object[]{textView, drawable, drawable2, drawable3, drawable4});
        } else {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }
    }

    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aadb152d", new Object[]{textView, drawable, drawable2, drawable3, drawable4});
        } else {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    public static void setCustomSelectionActionModeCallback(TextView textView, ActionMode.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14e39b4f", new Object[]{textView, callback});
        } else {
            textView.setCustomSelectionActionModeCallback(wrapCustomSelectionActionModeCallback(textView, callback));
        }
    }

    public static void setFirstBaselineToTopHeight(TextView textView, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c043af54", new Object[]{textView, new Integer(i)});
            return;
        }
        Preconditions.checkArgumentNonnegative(i);
        if (Build.VERSION.SDK_INT >= 28) {
            Api28Impl.setFirstBaselineToTopHeight(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void setLastBaselineToBottomHeight(TextView textView, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1fef8b0", new Object[]{textView, new Integer(i)});
            return;
        }
        Preconditions.checkArgumentNonnegative(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void setLineHeight(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7605283", new Object[]{textView, new Integer(i)});
            return;
        }
        Preconditions.checkArgumentNonnegative(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public static void setPrecomputedText(TextView textView, PrecomputedTextCompat precomputedTextCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b17cbaa", new Object[]{textView, precomputedTextCompat});
        } else if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(Api28Impl.castToCharSequence(precomputedTextCompat.getPrecomputedText()));
        } else if (getTextMetricsParams(textView).equalsWithoutTextDirection(precomputedTextCompat.getParams())) {
            textView.setText(precomputedTextCompat);
        } else {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
    }

    public static void setTextAppearance(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ea7e239", new Object[]{textView, new Integer(i)});
        } else if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    public static void setTextMetricsParams(TextView textView, PrecomputedTextCompat.Params params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebd5dadb", new Object[]{textView, params});
            return;
        }
        textView.setTextDirection(getTextDirection(params.getTextDirection()));
        if (Build.VERSION.SDK_INT < 23) {
            float textScaleX = params.getTextPaint().getTextScaleX();
            textView.getPaint().set(params.getTextPaint());
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
            return;
        }
        textView.getPaint().set(params.getTextPaint());
        Api23Impl.setBreakStrategy(textView, params.getBreakStrategy());
        Api23Impl.setHyphenationFrequency(textView, params.getHyphenationFrequency());
    }

    public static ActionMode.Callback unwrapCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActionMode.Callback) ipChange.ipc$dispatch("15da7059", new Object[]{callback});
        }
        if (!(callback instanceof OreoCallback) || Build.VERSION.SDK_INT < 26) {
            return callback;
        }
        return ((OreoCallback) callback).getWrappedCallback();
    }

    public static ActionMode.Callback wrapCustomSelectionActionModeCallback(TextView textView, ActionMode.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActionMode.Callback) ipChange.ipc$dispatch("109e4aa8", new Object[]{textView, callback});
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || i > 27 || (callback instanceof OreoCallback) || callback == null) {
            return callback;
        }
        return new OreoCallback(callback, textView);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class OreoCallback implements ActionMode.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final int MENU_ITEM_ORDER_PROCESS_TEXT_INTENT_ACTIONS_START = 100;
        private final ActionMode.Callback mCallback;
        private boolean mCanUseMenuBuilderReferences;
        private boolean mInitializedMenuBuilderReferences = false;
        private Class<?> mMenuBuilderClass;
        private Method mMenuBuilderRemoveItemAtMethod;
        private final TextView mTextView;

        public OreoCallback(ActionMode.Callback callback, TextView textView) {
            this.mCallback = callback;
            this.mTextView = textView;
        }

        private Intent createProcessTextIntent() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Intent) ipChange.ipc$dispatch("9053f2d0", new Object[]{this});
            }
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType(Constants.SHARETYPE);
        }

        private Intent createProcessTextIntentForResolveInfo(ResolveInfo resolveInfo, TextView textView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Intent) ipChange.ipc$dispatch("2013c74", new Object[]{this, resolveInfo, textView});
            }
            Intent putExtra = createProcessTextIntent().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !isEditable(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        private List<ResolveInfo> getSupportedActivities(Context context, PackageManager packageManager) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("c545e765", new Object[]{this, context, packageManager});
            }
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(createProcessTextIntent(), 0)) {
                if (isSupportedActivity(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        private boolean isSupportedActivity(ResolveInfo resolveInfo, Context context) {
            int checkSelfPermission;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1c6f9ee1", new Object[]{this, resolveInfo, context})).booleanValue();
            }
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            if (str == null) {
                return true;
            }
            checkSelfPermission = context.checkSelfPermission(str);
            if (checkSelfPermission == 0) {
                return true;
            }
            return false;
        }

        private void recomputeProcessTextMenuItems(Menu menu) {
            Method method;
            Context context = this.mTextView.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.mInitializedMenuBuilderReferences) {
                this.mInitializedMenuBuilderReferences = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.mMenuBuilderClass = cls;
                    this.mMenuBuilderRemoveItemAtMethod = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.mCanUseMenuBuilderReferences = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.mMenuBuilderClass = null;
                    this.mMenuBuilderRemoveItemAtMethod = null;
                    this.mCanUseMenuBuilderReferences = false;
                }
            }
            try {
                if (!this.mCanUseMenuBuilderReferences || !this.mMenuBuilderClass.isInstance(menu)) {
                    method = menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                } else {
                    method = this.mMenuBuilderRemoveItemAtMethod;
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        method.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> supportedActivities = getSupportedActivities(context, packageManager);
                for (int i = 0; i < supportedActivities.size(); i++) {
                    ResolveInfo resolveInfo = supportedActivities.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(createProcessTextIntentForResolveInfo(resolveInfo, this.mTextView)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        public ActionMode.Callback getWrappedCallback() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ActionMode.Callback) ipChange.ipc$dispatch("d8973a24", new Object[]{this});
            }
            return this.mCallback;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cb43f5b1", new Object[]{this, actionMode, menuItem})).booleanValue();
            }
            return this.mCallback.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e072c179", new Object[]{this, actionMode, menu})).booleanValue();
            }
            return this.mCallback.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a57b0823", new Object[]{this, actionMode});
            } else {
                this.mCallback.onDestroyActionMode(actionMode);
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cae505a6", new Object[]{this, actionMode, menu})).booleanValue();
            }
            recomputeProcessTextMenuItems(menu);
            return this.mCallback.onPrepareActionMode(actionMode, menu);
        }

        private boolean isEditable(TextView textView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f0668b3", new Object[]{this, textView})).booleanValue();
            }
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }
    }

    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textView, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9f250dd", new Object[]{textView, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        }
    }

    public static void setLineHeight(TextView textView, int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14aa659d", new Object[]{textView, new Integer(i), new Float(f)});
        } else if (Build.VERSION.SDK_INT >= 34) {
            Api34Impl.setLineHeight(textView, i, f);
        } else {
            setLineHeight(textView, Math.round(TypedValue.applyDimension(i, f, textView.getResources().getDisplayMetrics())));
        }
    }
}
