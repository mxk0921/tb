package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.core.text.PrecomputedTextCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.stream.IntStream;
import tb.mom;
import tb.oiv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UnprecomputeTextOnModificationSpannable implements Spannable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Spannable mDelegate;
    private boolean mSafeToWrite = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class CharSequenceHelper_API24 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private CharSequenceHelper_API24() {
        }

        public static IntStream chars(CharSequence charSequence) {
            IntStream chars;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return oiv.a(ipChange.ipc$dispatch("76aa005d", new Object[]{charSequence}));
            }
            chars = charSequence.chars();
            return chars;
        }

        public static IntStream codePoints(CharSequence charSequence) {
            IntStream codePoints;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return oiv.a(ipChange.ipc$dispatch("54f85aa", new Object[]{charSequence}));
            }
            codePoints = charSequence.codePoints();
            return codePoints;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class PrecomputedTextDetector {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public boolean isPrecomputedText(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fe745b22", new Object[]{this, charSequence})).booleanValue();
            }
            return charSequence instanceof PrecomputedTextCompat;
        }
    }

    public UnprecomputeTextOnModificationSpannable(Spannable spannable) {
        this.mDelegate = spannable;
    }

    private void ensureSafeWrites() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f314246", new Object[]{this});
            return;
        }
        Spannable spannable = this.mDelegate;
        if (!this.mSafeToWrite && precomputedTextDetector().isPrecomputedText(spannable)) {
            this.mDelegate = new SpannableString(spannable);
        }
        this.mSafeToWrite = true;
    }

    public static PrecomputedTextDetector precomputedTextDetector() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PrecomputedTextDetector) ipChange.ipc$dispatch("65056b18", new Object[0]);
        }
        if (Build.VERSION.SDK_INT < 28) {
            return new PrecomputedTextDetector();
        }
        return new PrecomputedTextDetector_28();
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Character) ipChange.ipc$dispatch("797dd2c0", new Object[]{this, new Integer(i)})).charValue();
        }
        return this.mDelegate.charAt(i);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return oiv.a(ipChange.ipc$dispatch("8d99bf81", new Object[]{this}));
        }
        return CharSequenceHelper_API24.chars(this.mDelegate);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return oiv.a(ipChange.ipc$dispatch("b40c1bce", new Object[]{this}));
        }
        return CharSequenceHelper_API24.codePoints(this.mDelegate);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5bdb51", new Object[]{this, obj})).intValue();
        }
        return this.mDelegate.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f445effd", new Object[]{this, obj})).intValue();
        }
        return this.mDelegate.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a711f98", new Object[]{this, obj})).intValue();
        }
        return this.mDelegate.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T[]) ((Object[]) ipChange.ipc$dispatch("48ecbc84", new Object[]{this, new Integer(i), new Integer(i2), cls}));
        }
        return (T[]) this.mDelegate.getSpans(i, i2, cls);
    }

    public Spannable getUnwrappedSpannable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Spannable) ipChange.ipc$dispatch("b6a88d7a", new Object[]{this});
        }
        return this.mDelegate;
    }

    @Override // java.lang.CharSequence
    public int length() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("451fdc60", new Object[]{this})).intValue();
        }
        return this.mDelegate.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("16413897", new Object[]{this, new Integer(i), new Integer(i2), cls})).intValue();
        }
        return this.mDelegate.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baa3c11", new Object[]{this, obj});
            return;
        }
        ensureSafeWrites();
        this.mDelegate.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1a30dd4", new Object[]{this, obj, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        ensureSafeWrites();
        this.mDelegate.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("45243232", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        return this.mDelegate.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.mDelegate.toString();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class PrecomputedTextDetector_28 extends PrecomputedTextDetector {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(PrecomputedTextDetector_28 precomputedTextDetector_28, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/emoji2/text/UnprecomputeTextOnModificationSpannable$PrecomputedTextDetector_28");
        }

        @Override // androidx.emoji2.text.UnprecomputeTextOnModificationSpannable.PrecomputedTextDetector
        public boolean isPrecomputedText(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fe745b22", new Object[]{this, charSequence})).booleanValue();
            }
            return mom.a(charSequence) || (charSequence instanceof PrecomputedTextCompat);
        }
    }

    public UnprecomputeTextOnModificationSpannable(Spanned spanned) {
        this.mDelegate = new SpannableString(spanned);
    }

    public UnprecomputeTextOnModificationSpannable(CharSequence charSequence) {
        this.mDelegate = new SpannableString(charSequence);
    }
}
