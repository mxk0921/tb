package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class mg8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_ABSORBED = "absorbed";
    public static final String EVENT_ABSORBING = "absorbing";
    public static final String EVENT_DRAG = "drag";
    public static final String EVENT_HIT_WALL = "hitWall";
    public static final String EVENT_HOVER = "hover";
    public static final String FLOAT_EVENT_TYPE_EVENT = "FloatWindow.Event";
    public static final String FLOAT_EVENT_TYPE_GESTURE = "FloatWindow.Gesture";
    public static final String FLOAT_SOURCE_TYPE = "FloatWindow";

    static {
        t2o.a(435159068);
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6e90cf69", new Object[]{new Integer(i)});
        }
        if (i == 0 || i == 1 || i == 3 || i == 2) {
            return FLOAT_EVENT_TYPE_GESTURE;
        }
        return FLOAT_EVENT_TYPE_EVENT;
    }

    public static String b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b3c7ddc", new Object[]{new Integer(i)});
        }
        if (i == 0) {
            return EVENT_HOVER;
        }
        if (i == 1) {
            return EVENT_DRAG;
        }
        if (i == 2) {
            return EVENT_ABSORBING;
        }
        if (i == 3) {
            return EVENT_ABSORBED;
        }
        if (i != 4) {
            return "";
        }
        return EVENT_HIT_WALL;
    }
}
