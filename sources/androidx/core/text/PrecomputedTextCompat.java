package androidx.core.text;

import android.os.Build;
import android.os.LocaleList;
import android.os.Trace;
import android.text.Layout;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import tb.lom;
import tb.mom;
import tb.rom;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class PrecomputedTextCompat implements Spannable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final char LINE_FEED = '\n';
    private static Executor sExecutor;
    private static final Object sLock = new Object();
    private final int[] mParagraphEnds;
    private final Params mParams;
    private final Spannable mText;
    private final PrecomputedText mWrapped;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api28Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api28Impl() {
        }

        public static Spannable castToSpannable(PrecomputedText precomputedText) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Spannable) ipChange.ipc$dispatch("d508d74a", new Object[]{precomputedText}) : precomputedText;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class PrecomputedTextFutureTask extends FutureTask<PrecomputedTextCompat> {

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static class PrecomputedTextCallback implements Callable<PrecomputedTextCompat> {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private Params mParams;
            private CharSequence mText;

            public PrecomputedTextCallback(Params params, CharSequence charSequence) {
                this.mParams = params;
                this.mText = charSequence;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public PrecomputedTextCompat call() throws Exception {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (PrecomputedTextCompat) ipChange.ipc$dispatch("2b1c0af9", new Object[]{this}) : PrecomputedTextCompat.create(this.mText, this.mParams);
            }
        }

        public PrecomputedTextFutureTask(Params params, CharSequence charSequence) {
            super(new PrecomputedTextCallback(params, charSequence));
        }
    }

    private PrecomputedTextCompat(CharSequence charSequence, Params params, int[] iArr) {
        this.mText = new SpannableString(charSequence);
        this.mParams = params;
        this.mParagraphEnds = iArr;
        this.mWrapped = null;
    }

    public static PrecomputedTextCompat create(CharSequence charSequence, Params params) {
        StaticLayout.Builder obtain;
        StaticLayout.Builder breakStrategy;
        StaticLayout.Builder hyphenationFrequency;
        StaticLayout.Builder textDirection;
        PrecomputedText.Params params2;
        PrecomputedText create;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PrecomputedTextCompat) ipChange.ipc$dispatch("1bcb20c7", new Object[]{charSequence, params});
        }
        Preconditions.checkNotNull(charSequence);
        Preconditions.checkNotNull(params);
        try {
            Trace.beginSection("PrecomputedText");
            if (Build.VERSION.SDK_INT < 29 || (params2 = params.mWrapped) == null) {
                ArrayList arrayList = new ArrayList();
                int length = charSequence.length();
                int i = 0;
                while (i < length) {
                    int indexOf = TextUtils.indexOf(charSequence, (char) LINE_FEED, i, length);
                    if (indexOf < 0) {
                        i = length;
                    } else {
                        i = indexOf + 1;
                    }
                    arrayList.add(Integer.valueOf(i));
                }
                int[] iArr = new int[arrayList.size()];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), params.getTextPaint(), Integer.MAX_VALUE);
                    breakStrategy = obtain.setBreakStrategy(params.getBreakStrategy());
                    hyphenationFrequency = breakStrategy.setHyphenationFrequency(params.getHyphenationFrequency());
                    textDirection = hyphenationFrequency.setTextDirection(params.getTextDirection());
                    textDirection.build();
                } else {
                    new StaticLayout(charSequence, params.getTextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                return new PrecomputedTextCompat(charSequence, params, iArr);
            }
            create = PrecomputedText.create(charSequence, params2);
            return new PrecomputedTextCompat(create, params);
        } finally {
            Trace.endSection();
        }
    }

    public static Future<PrecomputedTextCompat> getTextFuture(CharSequence charSequence, Params params, Executor executor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("8e04f63f", new Object[]{charSequence, params, executor});
        }
        PrecomputedTextFutureTask precomputedTextFutureTask = new PrecomputedTextFutureTask(params, charSequence);
        if (executor == null) {
            synchronized (sLock) {
                try {
                    if (sExecutor == null) {
                        sExecutor = Executors.newFixedThreadPool(1);
                    }
                    executor = sExecutor;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        executor.execute(precomputedTextFutureTask);
        return precomputedTextFutureTask;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Character) ipChange.ipc$dispatch("797dd2c0", new Object[]{this, new Integer(i)})).charValue();
        }
        return this.mText.charAt(i);
    }

    public int getParagraphCount() {
        int paragraphCount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d5f2a31", new Object[]{this})).intValue();
        }
        if (Build.VERSION.SDK_INT < 29) {
            return this.mParagraphEnds.length;
        }
        paragraphCount = this.mWrapped.getParagraphCount();
        return paragraphCount;
    }

    public Params getParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Params) ipChange.ipc$dispatch("59229151", new Object[]{this});
        }
        return this.mParams;
    }

    public PrecomputedText getPrecomputedText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return lom.a(ipChange.ipc$dispatch("ac2c98bc", new Object[]{this}));
        }
        if (mom.a(this.mText)) {
            return lom.a(this.mText);
        }
        return null;
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5bdb51", new Object[]{this, obj})).intValue();
        }
        return this.mText.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f445effd", new Object[]{this, obj})).intValue();
        }
        return this.mText.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a711f98", new Object[]{this, obj})).intValue();
        }
        return this.mText.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        Object[] spans;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T[]) ((Object[]) ipChange.ipc$dispatch("48ecbc84", new Object[]{this, new Integer(i), new Integer(i2), cls}));
        }
        if (Build.VERSION.SDK_INT < 29) {
            return (T[]) this.mText.getSpans(i, i2, cls);
        }
        spans = this.mWrapped.getSpans(i, i2, cls);
        return (T[]) spans;
    }

    @Override // java.lang.CharSequence
    public int length() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("451fdc60", new Object[]{this})).intValue();
        }
        return this.mText.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("16413897", new Object[]{this, new Integer(i), new Integer(i2), cls})).intValue();
        }
        return this.mText.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baa3c11", new Object[]{this, obj});
        } else if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.mWrapped.removeSpan(obj);
        } else {
            this.mText.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1a30dd4", new Object[]{this, obj, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.mWrapped.setSpan(obj, i, i2, i3);
        } else {
            this.mText.setSpan(obj, i, i2, i3);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("45243232", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        return this.mText.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.mText.toString();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Params {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final int mBreakStrategy;
        private final int mHyphenationFrequency;
        private final TextPaint mPaint;
        private final TextDirectionHeuristic mTextDir;
        public final PrecomputedText.Params mWrapped;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static class Builder {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private int mBreakStrategy;
            private int mHyphenationFrequency;
            private final TextPaint mPaint;
            private TextDirectionHeuristic mTextDir;

            public Builder(TextPaint textPaint) {
                this.mPaint = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.mBreakStrategy = 1;
                    this.mHyphenationFrequency = 1;
                } else {
                    this.mHyphenationFrequency = 0;
                    this.mBreakStrategy = 0;
                }
                this.mTextDir = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }

            public Params build() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Params) ipChange.ipc$dispatch("6b258643", new Object[]{this});
                }
                return new Params(this.mPaint, this.mTextDir, this.mBreakStrategy, this.mHyphenationFrequency);
            }

            public Builder setBreakStrategy(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("1a170a63", new Object[]{this, new Integer(i)});
                }
                this.mBreakStrategy = i;
                return this;
            }

            public Builder setHyphenationFrequency(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("99f0ef78", new Object[]{this, new Integer(i)});
                }
                this.mHyphenationFrequency = i;
                return this;
            }

            public Builder setTextDirection(TextDirectionHeuristic textDirectionHeuristic) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("42b982a7", new Object[]{this, textDirectionHeuristic});
                }
                this.mTextDir = textDirectionHeuristic;
                return this;
            }
        }

        public Params(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            PrecomputedText.Params.Builder breakStrategy;
            PrecomputedText.Params.Builder hyphenationFrequency;
            PrecomputedText.Params.Builder textDirection;
            PrecomputedText.Params build;
            if (Build.VERSION.SDK_INT >= 29) {
                breakStrategy = rom.a(textPaint).setBreakStrategy(i);
                hyphenationFrequency = breakStrategy.setHyphenationFrequency(i2);
                textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
                build = textDirection.build();
                this.mWrapped = build;
            } else {
                this.mWrapped = null;
            }
            this.mPaint = textPaint;
            this.mTextDir = textDirectionHeuristic;
            this.mBreakStrategy = i;
            this.mHyphenationFrequency = i2;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            if (equalsWithoutTextDirection(params) && this.mTextDir == params.getTextDirection()) {
                return true;
            }
            return false;
        }

        public int getBreakStrategy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f4c9e456", new Object[]{this})).intValue();
            }
            return this.mBreakStrategy;
        }

        public int getHyphenationFrequency() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4ea62909", new Object[]{this})).intValue();
            }
            return this.mHyphenationFrequency;
        }

        public TextDirectionHeuristic getTextDirection() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TextDirectionHeuristic) ipChange.ipc$dispatch("9766a89a", new Object[]{this});
            }
            return this.mTextDir;
        }

        public TextPaint getTextPaint() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TextPaint) ipChange.ipc$dispatch("cd905f54", new Object[]{this});
            }
            return this.mPaint;
        }

        public int hashCode() {
            LocaleList textLocales;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            if (Build.VERSION.SDK_INT < 24) {
                return ObjectsCompat.hash(Float.valueOf(this.mPaint.getTextSize()), Float.valueOf(this.mPaint.getTextScaleX()), Float.valueOf(this.mPaint.getTextSkewX()), Float.valueOf(this.mPaint.getLetterSpacing()), Integer.valueOf(this.mPaint.getFlags()), this.mPaint.getTextLocale(), this.mPaint.getTypeface(), Boolean.valueOf(this.mPaint.isElegantTextHeight()), this.mTextDir, Integer.valueOf(this.mBreakStrategy), Integer.valueOf(this.mHyphenationFrequency));
            }
            Float valueOf = Float.valueOf(this.mPaint.getTextSize());
            Float valueOf2 = Float.valueOf(this.mPaint.getTextScaleX());
            Float valueOf3 = Float.valueOf(this.mPaint.getTextSkewX());
            Float valueOf4 = Float.valueOf(this.mPaint.getLetterSpacing());
            Integer valueOf5 = Integer.valueOf(this.mPaint.getFlags());
            textLocales = this.mPaint.getTextLocales();
            return ObjectsCompat.hash(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, textLocales, this.mPaint.getTypeface(), Boolean.valueOf(this.mPaint.isElegantTextHeight()), this.mTextDir, Integer.valueOf(this.mBreakStrategy), Integer.valueOf(this.mHyphenationFrequency));
        }

        public String toString() {
            String fontVariationSettings;
            LocaleList textLocales;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.mPaint.getTextSize());
            sb.append(", textScaleX=" + this.mPaint.getTextScaleX());
            sb.append(", textSkewX=" + this.mPaint.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + this.mPaint.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.mPaint.isElegantTextHeight());
            if (i >= 24) {
                StringBuilder sb2 = new StringBuilder(", textLocale=");
                textLocales = this.mPaint.getTextLocales();
                sb2.append(textLocales);
                sb.append(sb2.toString());
            } else {
                sb.append(", textLocale=" + this.mPaint.getTextLocale());
            }
            sb.append(", typeface=" + this.mPaint.getTypeface());
            if (i >= 26) {
                StringBuilder sb3 = new StringBuilder(", variationSettings=");
                fontVariationSettings = this.mPaint.getFontVariationSettings();
                sb3.append(fontVariationSettings);
                sb.append(sb3.toString());
            }
            sb.append(", textDir=" + this.mTextDir);
            sb.append(", breakStrategy=" + this.mBreakStrategy);
            sb.append(", hyphenationFrequency=" + this.mHyphenationFrequency);
            sb.append("}");
            return sb.toString();
        }

        public boolean equalsWithoutTextDirection(Params params) {
            LocaleList textLocales;
            LocaleList textLocales2;
            boolean equals;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fa46f152", new Object[]{this, params})).booleanValue();
            }
            int i = Build.VERSION.SDK_INT;
            if ((i >= 23 && (this.mBreakStrategy != params.getBreakStrategy() || this.mHyphenationFrequency != params.getHyphenationFrequency())) || this.mPaint.getTextSize() != params.getTextPaint().getTextSize() || this.mPaint.getTextScaleX() != params.getTextPaint().getTextScaleX() || this.mPaint.getTextSkewX() != params.getTextPaint().getTextSkewX() || this.mPaint.getLetterSpacing() != params.getTextPaint().getLetterSpacing() || !TextUtils.equals(this.mPaint.getFontFeatureSettings(), params.getTextPaint().getFontFeatureSettings()) || this.mPaint.getFlags() != params.getTextPaint().getFlags()) {
                return false;
            }
            if (i >= 24) {
                textLocales = this.mPaint.getTextLocales();
                textLocales2 = params.getTextPaint().getTextLocales();
                equals = textLocales.equals(textLocales2);
                if (!equals) {
                    return false;
                }
            } else if (!this.mPaint.getTextLocale().equals(params.getTextPaint().getTextLocale())) {
                return false;
            }
            if (this.mPaint.getTypeface() == null) {
                if (params.getTextPaint().getTypeface() != null) {
                    return false;
                }
            } else if (!this.mPaint.getTypeface().equals(params.getTextPaint().getTypeface())) {
                return false;
            }
            return true;
        }

        public Params(PrecomputedText.Params params) {
            TextPaint textPaint;
            TextDirectionHeuristic textDirection;
            int breakStrategy;
            int hyphenationFrequency;
            textPaint = params.getTextPaint();
            this.mPaint = textPaint;
            textDirection = params.getTextDirection();
            this.mTextDir = textDirection;
            breakStrategy = params.getBreakStrategy();
            this.mBreakStrategy = breakStrategy;
            hyphenationFrequency = params.getHyphenationFrequency();
            this.mHyphenationFrequency = hyphenationFrequency;
            this.mWrapped = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }

    public int getParagraphEnd(int i) {
        int paragraphEnd;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1ae2c", new Object[]{this, new Integer(i)})).intValue();
        }
        Preconditions.checkArgumentInRange(i, 0, getParagraphCount(), "paraIndex");
        if (Build.VERSION.SDK_INT < 29) {
            return this.mParagraphEnds[i];
        }
        paragraphEnd = this.mWrapped.getParagraphEnd(i);
        return paragraphEnd;
    }

    public int getParagraphStart(int i) {
        int paragraphStart;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e753905", new Object[]{this, new Integer(i)})).intValue();
        }
        Preconditions.checkArgumentInRange(i, 0, getParagraphCount(), "paraIndex");
        if (Build.VERSION.SDK_INT >= 29) {
            paragraphStart = this.mWrapped.getParagraphStart(i);
            return paragraphStart;
        } else if (i == 0) {
            return 0;
        } else {
            return this.mParagraphEnds[i - 1];
        }
    }

    private PrecomputedTextCompat(PrecomputedText precomputedText, Params params) {
        this.mText = Api28Impl.castToSpannable(precomputedText);
        this.mParams = params;
        this.mParagraphEnds = null;
        this.mWrapped = Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }
}
