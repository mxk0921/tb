package androidx.core.view.accessibility;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class AccessibilityEventCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CONTENT_CHANGE_TYPE_CONTENT_DESCRIPTION = 4;
    public static final int CONTENT_CHANGE_TYPE_CONTENT_INVALID = 1024;
    public static final int CONTENT_CHANGE_TYPE_DRAG_CANCELLED = 512;
    public static final int CONTENT_CHANGE_TYPE_DRAG_DROPPED = 256;
    public static final int CONTENT_CHANGE_TYPE_DRAG_STARTED = 128;
    public static final int CONTENT_CHANGE_TYPE_ENABLED = 4096;
    public static final int CONTENT_CHANGE_TYPE_ERROR = 2048;
    public static final int CONTENT_CHANGE_TYPE_PANE_APPEARED = 16;
    public static final int CONTENT_CHANGE_TYPE_PANE_DISAPPEARED = 32;
    public static final int CONTENT_CHANGE_TYPE_PANE_TITLE = 8;
    public static final int CONTENT_CHANGE_TYPE_STATE_DESCRIPTION = 64;
    public static final int CONTENT_CHANGE_TYPE_SUBTREE = 1;
    public static final int CONTENT_CHANGE_TYPE_TEXT = 2;
    public static final int CONTENT_CHANGE_TYPE_UNDEFINED = 0;
    public static final int TYPES_ALL_MASK = -1;
    public static final int TYPE_ANNOUNCEMENT = 16384;
    public static final int TYPE_ASSIST_READING_CONTEXT = 16777216;
    public static final int TYPE_GESTURE_DETECTION_END = 524288;
    public static final int TYPE_GESTURE_DETECTION_START = 262144;
    @Deprecated
    public static final int TYPE_TOUCH_EXPLORATION_GESTURE_END = 1024;
    @Deprecated
    public static final int TYPE_TOUCH_EXPLORATION_GESTURE_START = 512;
    public static final int TYPE_TOUCH_INTERACTION_END = 2097152;
    public static final int TYPE_TOUCH_INTERACTION_START = 1048576;
    public static final int TYPE_VIEW_ACCESSIBILITY_FOCUSED = 32768;
    public static final int TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED = 65536;
    public static final int TYPE_VIEW_CONTEXT_CLICKED = 8388608;
    @Deprecated
    public static final int TYPE_VIEW_HOVER_ENTER = 128;
    @Deprecated
    public static final int TYPE_VIEW_HOVER_EXIT = 256;
    @Deprecated
    public static final int TYPE_VIEW_SCROLLED = 4096;
    public static final int TYPE_VIEW_TARGETED_BY_SCROLL = 67108864;
    @Deprecated
    public static final int TYPE_VIEW_TEXT_SELECTION_CHANGED = 8192;
    public static final int TYPE_VIEW_TEXT_TRAVERSED_AT_MOVEMENT_GRANULARITY = 131072;
    public static final int TYPE_WINDOWS_CHANGED = 4194304;
    @Deprecated
    public static final int TYPE_WINDOW_CONTENT_CHANGED = 2048;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api34Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api34Impl() {
        }

        public static boolean isAccessibilityDataSensitive(AccessibilityEvent accessibilityEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("32434d1f", new Object[]{accessibilityEvent})).booleanValue();
            }
            return accessibilityEvent.isAccessibilityDataSensitive();
        }

        public static void setAccessibilityDataSensitive(AccessibilityEvent accessibilityEvent, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c03f651", new Object[]{accessibilityEvent, new Boolean(z)});
            } else {
                accessibilityEvent.setAccessibilityDataSensitive(z);
            }
        }
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface ContentChangeType {
    }

    private AccessibilityEventCompat() {
    }

    @Deprecated
    public static void appendRecord(AccessibilityEvent accessibilityEvent, AccessibilityRecordCompat accessibilityRecordCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e8d8627", new Object[]{accessibilityEvent, accessibilityRecordCompat});
        } else {
            accessibilityEvent.appendRecord((AccessibilityRecord) accessibilityRecordCompat.getImpl());
        }
    }

    @Deprecated
    public static AccessibilityRecordCompat asRecord(AccessibilityEvent accessibilityEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccessibilityRecordCompat) ipChange.ipc$dispatch("6b690fe5", new Object[]{accessibilityEvent});
        }
        return new AccessibilityRecordCompat(accessibilityEvent);
    }

    public static int getAction(AccessibilityEvent accessibilityEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7547198a", new Object[]{accessibilityEvent})).intValue();
        }
        return accessibilityEvent.getAction();
    }

    public static int getContentChangeTypes(AccessibilityEvent accessibilityEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("18937210", new Object[]{accessibilityEvent})).intValue();
        }
        return accessibilityEvent.getContentChangeTypes();
    }

    public static int getMovementGranularity(AccessibilityEvent accessibilityEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d5e235ad", new Object[]{accessibilityEvent})).intValue();
        }
        return accessibilityEvent.getMovementGranularity();
    }

    @Deprecated
    public static AccessibilityRecordCompat getRecord(AccessibilityEvent accessibilityEvent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccessibilityRecordCompat) ipChange.ipc$dispatch("feaa9ede", new Object[]{accessibilityEvent, new Integer(i)});
        }
        return new AccessibilityRecordCompat(accessibilityEvent.getRecord(i));
    }

    @Deprecated
    public static int getRecordCount(AccessibilityEvent accessibilityEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65279f2e", new Object[]{accessibilityEvent})).intValue();
        }
        return accessibilityEvent.getRecordCount();
    }

    public static boolean isAccessibilityDataSensitive(AccessibilityEvent accessibilityEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32434d1f", new Object[]{accessibilityEvent})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.isAccessibilityDataSensitive(accessibilityEvent);
        }
        return false;
    }

    public static void setAccessibilityDataSensitive(AccessibilityEvent accessibilityEvent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c03f651", new Object[]{accessibilityEvent, new Boolean(z)});
        } else if (Build.VERSION.SDK_INT >= 34) {
            Api34Impl.setAccessibilityDataSensitive(accessibilityEvent, z);
        }
    }

    public static void setAction(AccessibilityEvent accessibilityEvent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1201258", new Object[]{accessibilityEvent, new Integer(i)});
        } else {
            accessibilityEvent.setAction(i);
        }
    }

    public static void setContentChangeTypes(AccessibilityEvent accessibilityEvent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e6a1892", new Object[]{accessibilityEvent, new Integer(i)});
        } else {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    public static void setMovementGranularity(AccessibilityEvent accessibilityEvent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23b0a1fd", new Object[]{accessibilityEvent, new Integer(i)});
        } else {
            accessibilityEvent.setMovementGranularity(i);
        }
    }
}
