package tb;

import android.text.GetChars;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class db8 implements Spanned, GetChars {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final char[] ELLIPSIS_NORMAL = {8230};

    /* renamed from: a  reason: collision with root package name */
    public final Spanned f17706a;
    public Layout b;
    public int c = -1;
    public int d = -1;
    public ReplacementSpan e;

    static {
        t2o.a(503316932);
    }

    public db8(Spanned spanned) {
        this.f17706a = spanned;
    }

    public void a(int i, int i2, int i3, char[] cArr, int i4) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7f6b78c", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), cArr, new Integer(i4)});
            return;
        }
        int ellipsisCount = this.b.getEllipsisCount(i3);
        if (ellipsisCount != 0) {
            int ellipsisStart = this.b.getEllipsisStart(i3);
            int lineStart = this.b.getLineStart(i3);
            for (int i5 = ellipsisStart; i5 < ellipsisStart + ellipsisCount; i5++) {
                if (i5 == ellipsisStart) {
                    c = ELLIPSIS_NORMAL[0];
                    int i6 = i5 + lineStart;
                    this.c = i6;
                    this.d = i6 + ellipsisCount;
                } else {
                    c = 65279;
                }
                int i7 = i5 + lineStart;
                if (i7 >= i && i7 < i2) {
                    cArr[(i7 + i4) - i] = c;
                }
            }
        }
    }

    public ReplacementSpan b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReplacementSpan) ipChange.ipc$dispatch("a4ce9fe0", new Object[]{this});
        }
        return this.e;
    }

    public Spanned c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Spanned) ipChange.ipc$dispatch("f07f83eb", new Object[]{this});
        }
        return this.f17706a;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Character) ipChange.ipc$dispatch("797dd2c0", new Object[]{this, new Integer(i)})).charValue();
        }
        return this.f17706a.charAt(i);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.b = null;
        this.d = -1;
        this.c = -1;
    }

    public void e(ReplacementSpan replacementSpan) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27e8d248", new Object[]{this, replacementSpan});
        } else {
            this.e = replacementSpan;
        }
    }

    public void f(Layout layout) {
        int ellipsisCount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e1e1422", new Object[]{this, layout});
            return;
        }
        this.b = layout;
        if (layout.getLineCount() == 1 && (ellipsisCount = this.b.getEllipsisCount(0)) != 0) {
            int ellipsisStart = this.b.getEllipsisStart(0);
            this.c = ellipsisStart;
            this.d = ellipsisStart + ellipsisCount;
        }
    }

    @Override // android.text.GetChars
    public void getChars(int i, int i2, char[] cArr, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("989204ad", new Object[]{this, new Integer(i), new Integer(i2), cArr, new Integer(i3)});
            return;
        }
        TextUtils.getChars(this.f17706a, i, i2, cArr, i3);
        Layout layout = this.b;
        if (layout != null) {
            int lineForOffset = this.b.getLineForOffset(i2);
            for (int lineForOffset2 = layout.getLineForOffset(i); lineForOffset2 <= lineForOffset; lineForOffset2++) {
                a(i, i2, lineForOffset2, cArr, i3);
            }
        }
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5bdb51", new Object[]{this, obj})).intValue();
        }
        ReplacementSpan replacementSpan = this.e;
        if (replacementSpan == null || replacementSpan != obj) {
            return this.f17706a.getSpanEnd(obj);
        }
        return this.d + 1;
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f445effd", new Object[]{this, obj})).intValue();
        }
        ReplacementSpan replacementSpan = this.e;
        if (replacementSpan == null || replacementSpan != obj) {
            return this.f17706a.getSpanFlags(obj);
        }
        return 17;
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a711f98", new Object[]{this, obj})).intValue();
        }
        ReplacementSpan replacementSpan = this.e;
        if (replacementSpan == null || replacementSpan != obj) {
            return this.f17706a.getSpanStart(obj);
        }
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        int i3;
        int i4 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T[]) ((Object[]) ipChange.ipc$dispatch("48ecbc84", new Object[]{this, new Integer(i), new Integer(i2), cls}));
        }
        if (this.d < i2 || (i3 = this.c) > i2) {
            return (T[]) this.f17706a.getSpans(i, i2, cls);
        }
        Object[] spans = this.f17706a.getSpans(i, Math.max(i3, i), cls);
        Object[] spans2 = this.f17706a.getSpans(Math.min(i2, this.d), i2, cls);
        if (this.e == null || (!cls.isAssignableFrom(ReplacementSpan.class) && cls != this.e.getClass())) {
            i4 = 0;
        }
        int length = spans.length + spans2.length + i4;
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, length));
        if (tArr.length > length) {
            tArr = (T[]) Arrays.copyOf(tArr, length);
        }
        System.arraycopy(spans, 0, tArr, 0, spans.length);
        if (i4 > 0) {
            tArr[spans.length] = this.e;
        }
        System.arraycopy(spans2, 0, tArr, spans.length + i4, spans2.length);
        return tArr;
    }

    @Override // java.lang.CharSequence
    public int length() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("451fdc60", new Object[]{this})).intValue();
        }
        return this.f17706a.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("16413897", new Object[]{this, new Integer(i), new Integer(i2), cls})).intValue();
        }
        return this.f17706a.nextSpanTransition(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("45243232", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        return this.f17706a.subSequence(i, i2);
    }
}
