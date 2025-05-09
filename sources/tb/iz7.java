package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class iz7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final iz7 INSTANCE = new iz7();
    public static final String VALUE_FALSE = "false";
    public static final String VALUE_TRUE = "true";

    static {
        t2o.a(918552608);
    }

    @JvmStatic
    public static final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c87d993", new Object[0])).booleanValue();
        }
        return false;
    }

    @JvmStatic
    public static final int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b96d30b", new Object[]{new Integer(i)})).intValue();
        }
        return bx0.d();
    }

    @JvmStatic
    public static final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2046cb94", new Object[0])).intValue();
        }
        return 17;
    }

    @JvmStatic
    public static final int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1b00642", new Object[0])).intValue();
        }
        return -2;
    }

    @JvmStatic
    public static final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f18a7055", new Object[0])).booleanValue();
        }
        return false;
    }

    @JvmStatic
    public static final int f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("587934d7", new Object[]{new Integer(i)})).intValue();
        }
        return bx0.e();
    }
}
