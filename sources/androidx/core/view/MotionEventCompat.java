package androidx.core.view;

import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MotionEventCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    @Deprecated
    public static final int ACTION_HOVER_ENTER = 9;
    @Deprecated
    public static final int ACTION_HOVER_EXIT = 10;
    @Deprecated
    public static final int ACTION_HOVER_MOVE = 7;
    @Deprecated
    public static final int ACTION_MASK = 255;
    @Deprecated
    public static final int ACTION_POINTER_DOWN = 5;
    @Deprecated
    public static final int ACTION_POINTER_INDEX_MASK = 65280;
    @Deprecated
    public static final int ACTION_POINTER_INDEX_SHIFT = 8;
    @Deprecated
    public static final int ACTION_POINTER_UP = 6;
    @Deprecated
    public static final int ACTION_SCROLL = 8;
    @Deprecated
    public static final int AXIS_BRAKE = 23;
    @Deprecated
    public static final int AXIS_DISTANCE = 24;
    @Deprecated
    public static final int AXIS_GAS = 22;
    @Deprecated
    public static final int AXIS_GENERIC_1 = 32;
    @Deprecated
    public static final int AXIS_GENERIC_10 = 41;
    @Deprecated
    public static final int AXIS_GENERIC_11 = 42;
    @Deprecated
    public static final int AXIS_GENERIC_12 = 43;
    @Deprecated
    public static final int AXIS_GENERIC_13 = 44;
    @Deprecated
    public static final int AXIS_GENERIC_14 = 45;
    @Deprecated
    public static final int AXIS_GENERIC_15 = 46;
    @Deprecated
    public static final int AXIS_GENERIC_16 = 47;
    @Deprecated
    public static final int AXIS_GENERIC_2 = 33;
    @Deprecated
    public static final int AXIS_GENERIC_3 = 34;
    @Deprecated
    public static final int AXIS_GENERIC_4 = 35;
    @Deprecated
    public static final int AXIS_GENERIC_5 = 36;
    @Deprecated
    public static final int AXIS_GENERIC_6 = 37;
    @Deprecated
    public static final int AXIS_GENERIC_7 = 38;
    @Deprecated
    public static final int AXIS_GENERIC_8 = 39;
    @Deprecated
    public static final int AXIS_GENERIC_9 = 40;
    @Deprecated
    public static final int AXIS_HAT_X = 15;
    @Deprecated
    public static final int AXIS_HAT_Y = 16;
    @Deprecated
    public static final int AXIS_HSCROLL = 10;
    @Deprecated
    public static final int AXIS_LTRIGGER = 17;
    @Deprecated
    public static final int AXIS_ORIENTATION = 8;
    @Deprecated
    public static final int AXIS_PRESSURE = 2;
    public static final int AXIS_RELATIVE_X = 27;
    public static final int AXIS_RELATIVE_Y = 28;
    @Deprecated
    public static final int AXIS_RTRIGGER = 18;
    @Deprecated
    public static final int AXIS_RUDDER = 20;
    @Deprecated
    public static final int AXIS_RX = 12;
    @Deprecated
    public static final int AXIS_RY = 13;
    @Deprecated
    public static final int AXIS_RZ = 14;
    public static final int AXIS_SCROLL = 26;
    @Deprecated
    public static final int AXIS_SIZE = 3;
    @Deprecated
    public static final int AXIS_THROTTLE = 19;
    @Deprecated
    public static final int AXIS_TILT = 25;
    @Deprecated
    public static final int AXIS_TOOL_MAJOR = 6;
    @Deprecated
    public static final int AXIS_TOOL_MINOR = 7;
    @Deprecated
    public static final int AXIS_TOUCH_MAJOR = 4;
    @Deprecated
    public static final int AXIS_TOUCH_MINOR = 5;
    @Deprecated
    public static final int AXIS_VSCROLL = 9;
    @Deprecated
    public static final int AXIS_WHEEL = 21;
    @Deprecated
    public static final int AXIS_X = 0;
    @Deprecated
    public static final int AXIS_Y = 1;
    @Deprecated
    public static final int AXIS_Z = 11;
    @Deprecated
    public static final int BUTTON_PRIMARY = 1;

    private MotionEventCompat() {
    }

    @Deprecated
    public static int findPointerIndex(MotionEvent motionEvent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("488d27ec", new Object[]{motionEvent, new Integer(i)})).intValue();
        }
        return motionEvent.findPointerIndex(i);
    }

    @Deprecated
    public static int getActionIndex(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d230b855", new Object[]{motionEvent})).intValue();
        }
        return motionEvent.getActionIndex();
    }

    @Deprecated
    public static int getActionMasked(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28b30666", new Object[]{motionEvent})).intValue();
        }
        return motionEvent.getActionMasked();
    }

    @Deprecated
    public static float getAxisValue(MotionEvent motionEvent, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f206dfbd", new Object[]{motionEvent, new Integer(i)})).floatValue() : motionEvent.getAxisValue(i);
    }

    @Deprecated
    public static int getButtonState(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14b45158", new Object[]{motionEvent})).intValue();
        }
        return motionEvent.getButtonState();
    }

    @Deprecated
    public static int getPointerCount(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("617ef917", new Object[]{motionEvent})).intValue();
        }
        return motionEvent.getPointerCount();
    }

    @Deprecated
    public static int getPointerId(MotionEvent motionEvent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19bdccd8", new Object[]{motionEvent, new Integer(i)})).intValue();
        }
        return motionEvent.getPointerId(i);
    }

    @Deprecated
    public static int getSource(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc9b6b20", new Object[]{motionEvent})).intValue();
        }
        return motionEvent.getSource();
    }

    @Deprecated
    public static float getX(MotionEvent motionEvent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("428bc695", new Object[]{motionEvent, new Integer(i)})).floatValue();
        }
        return motionEvent.getX(i);
    }

    @Deprecated
    public static float getY(MotionEvent motionEvent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cabc0674", new Object[]{motionEvent, new Integer(i)})).floatValue();
        }
        return motionEvent.getY(i);
    }

    public static boolean isFromSource(MotionEvent motionEvent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83fc339c", new Object[]{motionEvent, new Integer(i)})).booleanValue();
        }
        if ((motionEvent.getSource() & i) == i) {
            return true;
        }
        return false;
    }

    @Deprecated
    public static float getAxisValue(MotionEvent motionEvent, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4ed58cc6", new Object[]{motionEvent, new Integer(i), new Integer(i2)})).floatValue() : motionEvent.getAxisValue(i, i2);
    }
}
