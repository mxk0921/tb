package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.PointerIcon;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class PointerIconCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_ALIAS = 1010;
    public static final int TYPE_ALL_SCROLL = 1013;
    public static final int TYPE_ARROW = 1000;
    public static final int TYPE_CELL = 1006;
    public static final int TYPE_CONTEXT_MENU = 1001;
    public static final int TYPE_COPY = 1011;
    public static final int TYPE_CROSSHAIR = 1007;
    public static final int TYPE_DEFAULT = 1000;
    public static final int TYPE_GRAB = 1020;
    public static final int TYPE_GRABBING = 1021;
    public static final int TYPE_HAND = 1002;
    public static final int TYPE_HELP = 1003;
    public static final int TYPE_HORIZONTAL_DOUBLE_ARROW = 1014;
    public static final int TYPE_NO_DROP = 1012;
    public static final int TYPE_NULL = 0;
    public static final int TYPE_TEXT = 1008;
    public static final int TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW = 1017;
    public static final int TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW = 1016;
    public static final int TYPE_VERTICAL_DOUBLE_ARROW = 1015;
    public static final int TYPE_VERTICAL_TEXT = 1009;
    public static final int TYPE_WAIT = 1004;
    public static final int TYPE_ZOOM_IN = 1018;
    public static final int TYPE_ZOOM_OUT = 1019;
    private final PointerIcon mPointerIcon;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api24Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api24Impl() {
        }

        public static PointerIcon create(Bitmap bitmap, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PointerIcon) ipChange.ipc$dispatch("bf9cfc2e", new Object[]{bitmap, new Float(f), new Float(f2)});
            }
            return PointerIcon.create(bitmap, f, f2);
        }

        public static PointerIcon getSystemIcon(Context context, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PointerIcon) ipChange.ipc$dispatch("721b1259", new Object[]{context, new Integer(i)});
            }
            return PointerIcon.getSystemIcon(context, i);
        }

        public static PointerIcon load(Resources resources, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PointerIcon) ipChange.ipc$dispatch("dc717dca", new Object[]{resources, new Integer(i)});
            }
            return PointerIcon.load(resources, i);
        }
    }

    private PointerIconCompat(PointerIcon pointerIcon) {
        this.mPointerIcon = pointerIcon;
    }

    public static PointerIconCompat create(Bitmap bitmap, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointerIconCompat) ipChange.ipc$dispatch("c4b3f4e2", new Object[]{bitmap, new Float(f), new Float(f2)});
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return new PointerIconCompat(Api24Impl.create(bitmap, f, f2));
        }
        return new PointerIconCompat(null);
    }

    public static PointerIconCompat getSystemIcon(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointerIconCompat) ipChange.ipc$dispatch("fcc3228d", new Object[]{context, new Integer(i)});
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return new PointerIconCompat(Api24Impl.getSystemIcon(context, i));
        }
        return new PointerIconCompat(null);
    }

    public static PointerIconCompat load(Resources resources, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointerIconCompat) ipChange.ipc$dispatch("a1a6ec7e", new Object[]{resources, new Integer(i)});
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return new PointerIconCompat(Api24Impl.load(resources, i));
        }
        return new PointerIconCompat(null);
    }

    public Object getPointerIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9e02366b", new Object[]{this});
        }
        return this.mPointerIcon;
    }
}
