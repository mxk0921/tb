package android.taobao.windvane.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.c21;
import tb.chb;
import tb.qp0;
import tb.t2o;
import tb.v7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DeviceUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Object f1822a = new Object();
    public static volatile Integer b = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface DeviceLevel {
        public static final int HIGH = 0;
        public static final int LOW = 2;
        public static final int MEDIUM = 1;
        public static final int UNKNOWN = -1;
    }

    static {
        t2o.a(989856427);
    }

    public static int a() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e89be20", new Object[0])).intValue();
        }
        if (b == null) {
            synchronized (f1822a) {
                if (b == null) {
                    try {
                        b = Integer.valueOf((int) qp0.c());
                    } catch (Exception e) {
                        v7t.d("DeviceUtils", "getDeviceScore error: " + e.getMessage());
                        if (b == null) {
                            i = -1;
                        }
                    }
                    if (b == null) {
                        i = -1;
                        b = i;
                    }
                }
            }
        }
        return b.intValue();
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cec5212", new Object[0])).intValue();
        }
        chb g = c21.g();
        if (g != null) {
            return g.getInt("deviceLevel", -1);
        }
        return -1;
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bbfe2cb6", new Object[0])).intValue();
        }
        return b() + 1;
    }
}
