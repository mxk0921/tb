package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ri7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_DEVICE_LEVEL = "deviceLevel";
    public static final String LEVEL_HIGH = "high";
    public static final String LEVEL_LOW = "low";
    public static final String LEVEL_MED = "medium";
    public static final String LEVEL_UNKNOWN = "unknown";
    public static final ri7 INSTANCE = new ri7();

    /* renamed from: a  reason: collision with root package name */
    public static int f27400a = -1;

    static {
        t2o.a(481296917);
    }

    @JvmStatic
    public static final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("89e64461", new Object[0]);
        }
        try {
            int b = b();
            if (b == 0) {
                return "high";
            }
            if (b == 1) {
                return "medium";
            }
            if (b != 2) {
                return "unknown";
            }
            return "low";
        } catch (Throwable unused) {
            return "medium";
        }
    }

    @JvmStatic
    public static final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("777e06b3", new Object[0])).intValue();
        }
        int i = f27400a;
        int i2 = -1;
        if (i != -1) {
            return i;
        }
        try {
            i2 = c21.g().getInt("deviceLevel", -1);
        } catch (Throwable unused) {
        }
        f27400a = i2;
        return i2;
    }

    @JvmStatic
    public static final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("522b454b", new Object[0])).booleanValue();
        }
        if (b() == 2) {
            return true;
        }
        return false;
    }
}
