package tb;

import com.alibaba.ability.impl.performance.PerformanceAbility;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class yh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {
        public static final int LEVEL_CODE_HIGH = 3;
        public static final int LEVEL_CODE_LOW = 1;
        public static final int LEVEL_CODE_MIDDLE = 2;
        public static final int LEVEL_CODE_UNKNOWN = 0;
        public static final String LEVEL_NAME_HIGH = "high";
        public static final String LEVEL_NAME_LOW = "low";
        public static final String LEVEL_NAME_MIDDLE = "middle";
        public static final String LEVEL_NAME_UNKNOWN = "unknown";

        /* renamed from: a  reason: collision with root package name */
        public final int f32082a;
        public final String b;

        static {
            t2o.a(80740649);
        }

        public a(int i, String str) {
            this.f32082a = i;
            this.b = str;
        }
    }

    static {
        t2o.a(80740648);
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("5969d753", new Object[0]);
        }
        try {
            chb g = c21.g();
            if (g != null) {
                int i = g.getInt("deviceLevel", -1);
                if (i == 2) {
                    return new a(1, "low");
                }
                if (i == 1) {
                    return new a(2, "middle");
                }
                if (i == 0) {
                    return new a(3, "high");
                }
                return new a(0, "unknown");
            }
        } catch (Exception e) {
            ck.g().b("AURADeviceUtils", PerformanceAbility.API_GET_DEVICE_LEVEL, e.toString());
        }
        return new a(0, "unknown");
    }
}
