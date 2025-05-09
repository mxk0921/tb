package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.LocaleList;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import androidx.core.os.LocaleListCompat;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AccessibilityWindowInfoCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_ACCESSIBILITY_OVERLAY = 4;
    public static final int TYPE_APPLICATION = 1;
    public static final int TYPE_INPUT_METHOD = 2;
    public static final int TYPE_MAGNIFICATION_OVERLAY = 6;
    public static final int TYPE_SPLIT_SCREEN_DIVIDER = 5;
    public static final int TYPE_SYSTEM = 3;
    private static final int UNDEFINED = -1;
    private final Object mInfo;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api21Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api21Impl() {
        }

        public static void getBoundsInScreen(AccessibilityWindowInfo accessibilityWindowInfo, Rect rect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb17fca8", new Object[]{accessibilityWindowInfo, rect});
            } else {
                accessibilityWindowInfo.getBoundsInScreen(rect);
            }
        }

        public static AccessibilityWindowInfo getChild(AccessibilityWindowInfo accessibilityWindowInfo, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AccessibilityWindowInfo) ipChange.ipc$dispatch("d7204e3c", new Object[]{accessibilityWindowInfo, new Integer(i)});
            }
            return accessibilityWindowInfo.getChild(i);
        }

        public static int getChildCount(AccessibilityWindowInfo accessibilityWindowInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("88325851", new Object[]{accessibilityWindowInfo})).intValue();
            }
            return accessibilityWindowInfo.getChildCount();
        }

        public static int getId(AccessibilityWindowInfo accessibilityWindowInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7a878619", new Object[]{accessibilityWindowInfo})).intValue();
            }
            return accessibilityWindowInfo.getId();
        }

        public static int getLayer(AccessibilityWindowInfo accessibilityWindowInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a096c0a3", new Object[]{accessibilityWindowInfo})).intValue();
            }
            return accessibilityWindowInfo.getLayer();
        }

        public static AccessibilityWindowInfo getParent(AccessibilityWindowInfo accessibilityWindowInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AccessibilityWindowInfo) ipChange.ipc$dispatch("94a36e4f", new Object[]{accessibilityWindowInfo});
            }
            return accessibilityWindowInfo.getParent();
        }

        public static AccessibilityNodeInfo getRoot(AccessibilityWindowInfo accessibilityWindowInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AccessibilityNodeInfo) ipChange.ipc$dispatch("f3f98545", new Object[]{accessibilityWindowInfo});
            }
            return accessibilityWindowInfo.getRoot();
        }

        public static int getType(AccessibilityWindowInfo accessibilityWindowInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f8dff9b8", new Object[]{accessibilityWindowInfo})).intValue();
            }
            return accessibilityWindowInfo.getType();
        }

        public static boolean isAccessibilityFocused(AccessibilityWindowInfo accessibilityWindowInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("faadf3ac", new Object[]{accessibilityWindowInfo})).booleanValue();
            }
            return accessibilityWindowInfo.isAccessibilityFocused();
        }

        public static boolean isActive(AccessibilityWindowInfo accessibilityWindowInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("17892e9", new Object[]{accessibilityWindowInfo})).booleanValue();
            }
            return accessibilityWindowInfo.isActive();
        }

        public static boolean isFocused(AccessibilityWindowInfo accessibilityWindowInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d393fa06", new Object[]{accessibilityWindowInfo})).booleanValue();
            }
            return accessibilityWindowInfo.isFocused();
        }

        public static AccessibilityWindowInfo obtain() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AccessibilityWindowInfo) ipChange.ipc$dispatch("3c38b3f8", new Object[0]) : AccessibilityWindowInfo.obtain();
        }

        public static AccessibilityWindowInfo obtain(AccessibilityWindowInfo accessibilityWindowInfo) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AccessibilityWindowInfo) ipChange.ipc$dispatch("3c1b102a", new Object[]{accessibilityWindowInfo}) : AccessibilityWindowInfo.obtain(accessibilityWindowInfo);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api24Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api24Impl() {
        }

        public static AccessibilityNodeInfo getAnchor(AccessibilityWindowInfo accessibilityWindowInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AccessibilityNodeInfo) ipChange.ipc$dispatch("11915a52", new Object[]{accessibilityWindowInfo});
            }
            return accessibilityWindowInfo.getAnchor();
        }

        public static CharSequence getTitle(AccessibilityWindowInfo accessibilityWindowInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("1ff47d23", new Object[]{accessibilityWindowInfo});
            }
            return accessibilityWindowInfo.getTitle();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api26Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api26Impl() {
        }

        public static boolean isInPictureInPictureMode(AccessibilityWindowInfo accessibilityWindowInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("345a3ea6", new Object[]{accessibilityWindowInfo})).booleanValue();
            }
            return accessibilityWindowInfo.isInPictureInPictureMode();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api30Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api30Impl() {
        }

        public static AccessibilityWindowInfo instantiateAccessibilityWindowInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AccessibilityWindowInfo) ipChange.ipc$dispatch("fe1ea59b", new Object[0]);
            }
            return new AccessibilityWindowInfo();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api33Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api33Impl() {
        }

        public static int getDisplayId(AccessibilityWindowInfo accessibilityWindowInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dce13bcf", new Object[]{accessibilityWindowInfo})).intValue();
            }
            return accessibilityWindowInfo.getDisplayId();
        }

        public static void getRegionInScreen(AccessibilityWindowInfo accessibilityWindowInfo, Region region) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70bc9139", new Object[]{accessibilityWindowInfo, region});
            } else {
                accessibilityWindowInfo.getRegionInScreen(region);
            }
        }

        public static AccessibilityNodeInfoCompat getRoot(Object obj, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AccessibilityNodeInfoCompat) ipChange.ipc$dispatch("6cc7ab1e", new Object[]{obj, new Integer(i)});
            }
            return AccessibilityNodeInfoCompat.wrapNonNullInstance(((AccessibilityWindowInfo) obj).getRoot(i));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api34Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api34Impl() {
        }

        public static LocaleList getLocales(AccessibilityWindowInfo accessibilityWindowInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LocaleList) ipChange.ipc$dispatch("740e78a6", new Object[]{accessibilityWindowInfo});
            }
            return accessibilityWindowInfo.getLocales();
        }

        public static long getTransitionTimeMillis(AccessibilityWindowInfo accessibilityWindowInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("af12cb27", new Object[]{accessibilityWindowInfo})).longValue();
            }
            return accessibilityWindowInfo.getTransitionTimeMillis();
        }
    }

    public AccessibilityWindowInfoCompat() {
        if (Build.VERSION.SDK_INT >= 30) {
            this.mInfo = Api30Impl.instantiateAccessibilityWindowInfo();
        } else {
            this.mInfo = null;
        }
    }

    public static AccessibilityWindowInfoCompat obtain() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AccessibilityWindowInfoCompat) ipChange.ipc$dispatch("f9c7c26c", new Object[0]) : wrapNonNullInstance(Api21Impl.obtain());
    }

    public static AccessibilityWindowInfoCompat wrapNonNullInstance(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccessibilityWindowInfoCompat) ipChange.ipc$dispatch("9ef601f6", new Object[]{obj});
        }
        if (obj != null) {
            return new AccessibilityWindowInfoCompat(obj);
        }
        return null;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AccessibilityWindowInfoCompat)) {
            return false;
        }
        AccessibilityWindowInfoCompat accessibilityWindowInfoCompat = (AccessibilityWindowInfoCompat) obj;
        Object obj2 = this.mInfo;
        if (obj2 != null) {
            return obj2.equals(accessibilityWindowInfoCompat.mInfo);
        }
        if (accessibilityWindowInfoCompat.mInfo == null) {
            return true;
        }
        return false;
    }

    public AccessibilityNodeInfoCompat getAnchor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccessibilityNodeInfoCompat) ipChange.ipc$dispatch("38892d14", new Object[]{this});
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return AccessibilityNodeInfoCompat.wrapNonNullInstance(Api24Impl.getAnchor((AccessibilityWindowInfo) this.mInfo));
        }
        return null;
    }

    public void getBoundsInScreen(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab7543f6", new Object[]{this, rect});
        } else {
            Api21Impl.getBoundsInScreen((AccessibilityWindowInfo) this.mInfo, rect);
        }
    }

    public AccessibilityWindowInfoCompat getChild(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccessibilityWindowInfoCompat) ipChange.ipc$dispatch("2dfb8022", new Object[]{this, new Integer(i)});
        }
        return wrapNonNullInstance(Api21Impl.getChild((AccessibilityWindowInfo) this.mInfo, i));
    }

    public int getChildCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5991ad43", new Object[]{this})).intValue();
        }
        return Api21Impl.getChildCount((AccessibilityWindowInfo) this.mInfo);
    }

    public int getDisplayId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3f7433c1", new Object[]{this})).intValue();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return Api33Impl.getDisplayId((AccessibilityWindowInfo) this.mInfo);
        }
        return 0;
    }

    public int getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ddaaf0b", new Object[]{this})).intValue();
        }
        return Api21Impl.getId((AccessibilityWindowInfo) this.mInfo);
    }

    public int getLayer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c25ba95", new Object[]{this})).intValue();
        }
        return Api21Impl.getLayer((AccessibilityWindowInfo) this.mInfo);
    }

    public LocaleListCompat getLocales() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocaleListCompat) ipChange.ipc$dispatch("a0efa620", new Object[]{this});
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return LocaleListCompat.wrap(Api34Impl.getLocales((AccessibilityWindowInfo) this.mInfo));
        }
        return LocaleListCompat.getEmptyLocaleList();
    }

    public AccessibilityWindowInfoCompat getParent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccessibilityWindowInfoCompat) ipChange.ipc$dispatch("d19ce991", new Object[]{this});
        }
        return wrapNonNullInstance(Api21Impl.getParent((AccessibilityWindowInfo) this.mInfo));
    }

    public void getRegionInScreen(Region region) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c93bdb87", new Object[]{this, region});
        } else if (Build.VERSION.SDK_INT >= 33) {
            Api33Impl.getRegionInScreen((AccessibilityWindowInfo) this.mInfo, region);
        } else {
            Rect rect = new Rect();
            Api21Impl.getBoundsInScreen((AccessibilityWindowInfo) this.mInfo, rect);
            region.set(rect);
        }
    }

    public AccessibilityNodeInfoCompat getRoot() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AccessibilityNodeInfoCompat) ipChange.ipc$dispatch("cbf58707", new Object[]{this}) : AccessibilityNodeInfoCompat.wrapNonNullInstance(Api21Impl.getRoot((AccessibilityWindowInfo) this.mInfo));
    }

    public CharSequence getTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("1db95d71", new Object[]{this});
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return Api24Impl.getTitle((AccessibilityWindowInfo) this.mInfo);
        }
        return null;
    }

    public long getTransitionTimeMillis() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e560b099", new Object[]{this})).longValue();
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.getTransitionTimeMillis((AccessibilityWindowInfo) this.mInfo);
        }
        return 0L;
    }

    public int getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
        }
        return Api21Impl.getType((AccessibilityWindowInfo) this.mInfo);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        Object obj = this.mInfo;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public boolean isAccessibilityFocused() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7163f99e", new Object[]{this})).booleanValue();
        }
        return Api21Impl.isAccessibilityFocused((AccessibilityWindowInfo) this.mInfo);
    }

    public boolean isActive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb2d0d5b", new Object[]{this})).booleanValue();
        }
        return Api21Impl.isActive((AccessibilityWindowInfo) this.mInfo);
    }

    public boolean isFocused() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30a918f8", new Object[]{this})).booleanValue();
        }
        return Api21Impl.isFocused((AccessibilityWindowInfo) this.mInfo);
    }

    public boolean isInPictureInPictureMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55026d98", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.isInPictureInPictureMode((AccessibilityWindowInfo) this.mInfo);
        }
        return false;
    }

    @Deprecated
    public void recycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51af759a", new Object[]{this});
        }
    }

    public String toString() {
        boolean z;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder("AccessibilityWindowInfo[id=");
        Rect rect = new Rect();
        getBoundsInScreen(rect);
        sb.append(getId());
        sb.append(", type=");
        sb.append(typeToString(getType()));
        sb.append(", layer=");
        sb.append(getLayer());
        sb.append(", bounds=");
        sb.append(rect);
        sb.append(", focused=");
        sb.append(isFocused());
        sb.append(", active=");
        sb.append(isActive());
        sb.append(", hasParent=");
        if (getParent() != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(", hasChildren=");
        if (getChildCount() > 0) {
            z2 = true;
        }
        sb.append(z2);
        sb.append(", transitionTime=");
        sb.append(getTransitionTimeMillis());
        sb.append(", locales=");
        sb.append(getLocales());
        sb.append(']');
        return sb.toString();
    }

    public AccessibilityWindowInfo unwrap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccessibilityWindowInfo) ipChange.ipc$dispatch("46d44c7a", new Object[]{this});
        }
        return (AccessibilityWindowInfo) this.mInfo;
    }

    public static AccessibilityWindowInfoCompat obtain(AccessibilityWindowInfoCompat accessibilityWindowInfoCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccessibilityWindowInfoCompat) ipChange.ipc$dispatch("39fabb2a", new Object[]{accessibilityWindowInfoCompat});
        }
        if (accessibilityWindowInfoCompat == null) {
            return null;
        }
        return wrapNonNullInstance(Api21Impl.obtain((AccessibilityWindowInfo) accessibilityWindowInfoCompat.mInfo));
    }

    private static String typeToString(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1ed4c0a", new Object[]{new Integer(i)});
        }
        if (i == 1) {
            return "TYPE_APPLICATION";
        }
        if (i == 2) {
            return "TYPE_INPUT_METHOD";
        }
        if (i == 3) {
            return "TYPE_SYSTEM";
        }
        if (i != 4) {
            return "<UNKNOWN>";
        }
        return "TYPE_ACCESSIBILITY_OVERLAY";
    }

    public AccessibilityNodeInfoCompat getRoot(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccessibilityNodeInfoCompat) ipChange.ipc$dispatch("aef6de02", new Object[]{this, new Integer(i)});
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return Api33Impl.getRoot(this.mInfo, i);
        }
        return getRoot();
    }

    private AccessibilityWindowInfoCompat(Object obj) {
        this.mInfo = obj;
    }
}
