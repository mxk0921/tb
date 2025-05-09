package tb;

import android.animation.TimeInterpolator;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class cc5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ANIMATION = "animation";
    public static final String DAMPING_RATIO = "dampingRatio";
    public static final float DEFAULT_DAMPING_RATIO = 0.5f;
    public static final float DEFAULT_STIFFNESS = 1500.0f;
    public static final int DEFAULT_TWEEN_SPEC_DELAY_MILLIS = 0;
    public static final int DEFAULT_TWEEN_SPEC_DURATION_MILLIS = 300;
    public static final int DEFAULT_TWEEN_SPEC_ITERATIONS = 0;
    public static final int DEFAULT_TWEEN_SPEC_REPEAT_MODE = 1;
    public static final String DELAY_MILLIS = "delayMillis";
    public static final String DURATION_MILLIS = "durationMillis";
    public static final String EASING = "easing";
    public static final String ITERATIONS = "iterations";
    public static final String PARAMS = "params";
    public static final String REPEAT_MODE = "repeatMode";
    public static final int REPEAT_MODE_RESTART = 1;
    public static final int REPEAT_MODE_REVERSE = 2;
    public static final String SPRING_SPEC = "spring";
    public static final String STIFFNESS = "stiffness";
    public static final String TWEEN_SPEC = "tween";
    public static final String TYPE = "type";

    static {
        t2o.a(444597769);
    }

    public static int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dea501fe", new Object[]{new Integer(i)})).intValue();
        }
        if (i != 2) {
            return 1;
        }
        return 2;
    }

    public static jub b(JSONObject jSONObject, Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jub) ipChange.ipc$dispatch("fca9c126", new Object[]{jSONObject, cls});
        }
        String h = srf.h("type", jSONObject, null);
        if (TextUtils.isEmpty(h)) {
            return c(cls);
        }
        h.hashCode();
        if (h.equals(SPRING_SPEC)) {
            return e(srf.g("params", jSONObject, null));
        }
        if (!h.equals(TWEEN_SPEC)) {
            return c(cls);
        }
        return f(srf.g("params", jSONObject, null), cls);
    }

    public static jub c(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jub) ipChange.ipc$dispatch("56eb53ce", new Object[]{cls});
        }
        return rk6.b(cls, 300, 0, 0, 1, d());
    }

    public static TimeInterpolator d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TimeInterpolator) ipChange.ipc$dispatch("42243713", new Object[0]);
        }
        return uu5.h();
    }

    public static jub e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jub) ipChange.ipc$dispatch("bdad93b7", new Object[]{jSONObject});
        }
        return bd6.b(srf.d(DAMPING_RATIO, jSONObject, 0.5f), srf.d(STIFFNESS, jSONObject, 1500.0f));
    }

    public static jub f(JSONObject jSONObject, Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jub) ipChange.ipc$dispatch("67d4d8f0", new Object[]{jSONObject, cls});
        }
        return rk6.b(cls, srf.e(DURATION_MILLIS, jSONObject, 300), srf.e(DELAY_MILLIS, jSONObject, 0), srf.e(ITERATIONS, jSONObject, 0), a(srf.e(REPEAT_MODE, jSONObject, 1)), uu5.a(srf.b("easing", jSONObject, null)));
    }
}
