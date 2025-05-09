package androidx.core.graphics;

import android.graphics.Rect;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jbf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class Insets {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Insets NONE = new Insets(0, 0, 0, 0);
    public final int bottom;
    public final int left;
    public final int right;
    public final int top;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api29Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api29Impl() {
        }

        public static android.graphics.Insets of(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (android.graphics.Insets) ipChange.ipc$dispatch("b43a9495", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
            return android.graphics.Insets.of(i, i2, i3, i4);
        }
    }

    private Insets(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i4;
    }

    public static Insets add(Insets insets, Insets insets2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Insets) ipChange.ipc$dispatch("f0ae1b29", new Object[]{insets, insets2});
        }
        return of(insets.left + insets2.left, insets.top + insets2.top, insets.right + insets2.right, insets.bottom + insets2.bottom);
    }

    public static Insets max(Insets insets, Insets insets2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Insets) ipChange.ipc$dispatch("c62ae3ec", new Object[]{insets, insets2});
        }
        return of(Math.max(insets.left, insets2.left), Math.max(insets.top, insets2.top), Math.max(insets.right, insets2.right), Math.max(insets.bottom, insets2.bottom));
    }

    public static Insets min(Insets insets, Insets insets2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Insets) ipChange.ipc$dispatch("227d3cda", new Object[]{insets, insets2});
        }
        return of(Math.min(insets.left, insets2.left), Math.min(insets.top, insets2.top), Math.min(insets.right, insets2.right), Math.min(insets.bottom, insets2.bottom));
    }

    public static Insets of(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Insets) ipChange.ipc$dispatch("e7a9f8bf", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return NONE;
        }
        return new Insets(i, i2, i3, i4);
    }

    public static Insets subtract(Insets insets, Insets insets2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Insets) ipChange.ipc$dispatch("c814199c", new Object[]{insets, insets2});
        }
        return of(insets.left - insets2.left, insets.top - insets2.top, insets.right - insets2.right, insets.bottom - insets2.bottom);
    }

    public static Insets toCompatInsets(android.graphics.Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Insets) ipChange.ipc$dispatch("a39d79ee", new Object[]{insets});
        }
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return of(i, i2, i3, i4);
    }

    @Deprecated
    public static Insets wrap(android.graphics.Insets insets) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Insets) ipChange.ipc$dispatch("37c30a77", new Object[]{insets});
        }
        return toCompatInsets(insets);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || Insets.class != obj.getClass()) {
            return false;
        }
        Insets insets = (Insets) obj;
        if (this.bottom == insets.bottom && this.left == insets.left && this.right == insets.right && this.top == insets.top) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (((((this.left * 31) + this.top) * 31) + this.right) * 31) + this.bottom;
    }

    public android.graphics.Insets toPlatformInsets() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return jbf.a(ipChange.ipc$dispatch("aaf15422", new Object[]{this}));
        }
        return Api29Impl.of(this.left, this.top, this.right, this.bottom);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Insets{left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + '}';
    }

    public static Insets of(Rect rect) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Insets) ipChange.ipc$dispatch("6787295c", new Object[]{rect}) : of(rect.left, rect.top, rect.right, rect.bottom);
    }
}
