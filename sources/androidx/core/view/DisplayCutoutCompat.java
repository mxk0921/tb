package androidx.core.view;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import androidx.core.util.ObjectsCompat;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tb.er7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class DisplayCutoutCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final DisplayCutout mDisplayCutout;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api28Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api28Impl() {
        }

        public static DisplayCutout createDisplayCutout(Rect rect, List<Rect> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DisplayCutout) ipChange.ipc$dispatch("edba6b50", new Object[]{rect, list});
            }
            return new DisplayCutout(rect, list);
        }

        public static List<Rect> getBoundingRects(DisplayCutout displayCutout) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("1de70660", new Object[]{displayCutout});
            }
            return displayCutout.getBoundingRects();
        }

        public static int getSafeInsetBottom(DisplayCutout displayCutout) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c328ba8a", new Object[]{displayCutout})).intValue();
            }
            return displayCutout.getSafeInsetBottom();
        }

        public static int getSafeInsetLeft(DisplayCutout displayCutout) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fd8fe6e6", new Object[]{displayCutout})).intValue();
            }
            return displayCutout.getSafeInsetLeft();
        }

        public static int getSafeInsetRight(DisplayCutout displayCutout) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7681f047", new Object[]{displayCutout})).intValue();
            }
            return displayCutout.getSafeInsetRight();
        }

        public static int getSafeInsetTop(DisplayCutout displayCutout) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("29fb6500", new Object[]{displayCutout})).intValue();
            }
            return displayCutout.getSafeInsetTop();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api29Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api29Impl() {
        }

        public static DisplayCutout createDisplayCutout(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DisplayCutout) ipChange.ipc$dispatch("94d2ecb3", new Object[]{insets, rect, rect2, rect3, rect4});
            }
            return new DisplayCutout(insets, rect, rect2, rect3, rect4);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api30Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api30Impl() {
        }

        public static DisplayCutout createDisplayCutout(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DisplayCutout) ipChange.ipc$dispatch("567284a8", new Object[]{insets, rect, rect2, rect3, rect4, insets2});
            }
            return new DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
        }

        public static Insets getWaterfallInsets(DisplayCutout displayCutout) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Insets) ipChange.ipc$dispatch("724ee75b", new Object[]{displayCutout});
            }
            return displayCutout.getWaterfallInsets();
        }
    }

    public DisplayCutoutCompat(Rect rect, List<Rect> list) {
        this(Build.VERSION.SDK_INT >= 28 ? Api28Impl.createDisplayCutout(rect, list) : null);
    }

    private static DisplayCutout constructDisplayCutout(androidx.core.graphics.Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, androidx.core.graphics.Insets insets2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return er7.a(ipChange.ipc$dispatch("e9a0fdc3", new Object[]{insets, rect, rect2, rect3, rect4, insets2}));
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return Api30Impl.createDisplayCutout(insets.toPlatformInsets(), rect, rect2, rect3, rect4, insets2.toPlatformInsets());
        }
        if (i >= 29) {
            return Api29Impl.createDisplayCutout(insets.toPlatformInsets(), rect, rect2, rect3, rect4);
        }
        if (i < 28) {
            return null;
        }
        Rect rect5 = new Rect(insets.left, insets.top, insets.right, insets.bottom);
        ArrayList arrayList = new ArrayList();
        if (rect != null) {
            arrayList.add(rect);
        }
        if (rect2 != null) {
            arrayList.add(rect2);
        }
        if (rect3 != null) {
            arrayList.add(rect3);
        }
        if (rect4 != null) {
            arrayList.add(rect4);
        }
        return Api28Impl.createDisplayCutout(rect5, arrayList);
    }

    public static DisplayCutoutCompat wrap(DisplayCutout displayCutout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DisplayCutoutCompat) ipChange.ipc$dispatch("4920c39", new Object[]{displayCutout});
        }
        if (displayCutout == null) {
            return null;
        }
        return new DisplayCutoutCompat(displayCutout);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || DisplayCutoutCompat.class != obj.getClass()) {
            return false;
        }
        return ObjectsCompat.equals(this.mDisplayCutout, ((DisplayCutoutCompat) obj).mDisplayCutout);
    }

    public List<Rect> getBoundingRects() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b4c2d4ab", new Object[]{this});
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getBoundingRects(this.mDisplayCutout);
        }
        return Collections.emptyList();
    }

    public int getSafeInsetBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be22779f", new Object[]{this})).intValue();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getSafeInsetBottom(this.mDisplayCutout);
        }
        return 0;
    }

    public int getSafeInsetLeft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("205485fb", new Object[]{this})).intValue();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getSafeInsetLeft(this.mDisplayCutout);
        }
        return 0;
    }

    public int getSafeInsetRight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("27a4badc", new Object[]{this})).intValue();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getSafeInsetRight(this.mDisplayCutout);
        }
        return 0;
    }

    public int getSafeInsetTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b9ba4f15", new Object[]{this})).intValue();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getSafeInsetTop(this.mDisplayCutout);
        }
        return 0;
    }

    public androidx.core.graphics.Insets getWaterfallInsets() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (androidx.core.graphics.Insets) ipChange.ipc$dispatch("7a55aeda", new Object[]{this});
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return androidx.core.graphics.Insets.toCompatInsets(Api30Impl.getWaterfallInsets(this.mDisplayCutout));
        }
        return androidx.core.graphics.Insets.NONE;
    }

    public int hashCode() {
        int hashCode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        DisplayCutout displayCutout = this.mDisplayCutout;
        if (displayCutout == null) {
            return 0;
        }
        hashCode = displayCutout.hashCode();
        return hashCode;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DisplayCutoutCompat{" + this.mDisplayCutout + "}";
    }

    public DisplayCutout unwrap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return er7.a(ipChange.ipc$dispatch("5d954497", new Object[]{this}));
        }
        return this.mDisplayCutout;
    }

    public DisplayCutoutCompat(androidx.core.graphics.Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, androidx.core.graphics.Insets insets2) {
        this(constructDisplayCutout(insets, rect, rect2, rect3, rect4, insets2));
    }

    private DisplayCutoutCompat(DisplayCutout displayCutout) {
        this.mDisplayCutout = displayCutout;
    }
}
