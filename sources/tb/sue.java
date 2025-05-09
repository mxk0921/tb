package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.engine.env.protocol.IInfoFlowDevice;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sue {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static IInfoFlowDevice f28280a;

    static {
        t2o.a(486539282);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("89e64461", new Object[0]);
        }
        IInfoFlowDevice iInfoFlowDevice = f28280a;
        if (iInfoFlowDevice == null) {
            fve.f("InfoFlowDevice", "getDeviceLevel gDevice == null");
            return null;
        }
        try {
            return iInfoFlowDevice.getDeviceLevel();
        } catch (Throwable th) {
            fve.c("InfoFlowDevice", "getDeviceLevel error", th);
            return null;
        }
    }

    public static Integer b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("1ecb0c14", new Object[0]);
        }
        IInfoFlowDevice iInfoFlowDevice = f28280a;
        if (iInfoFlowDevice == null) {
            fve.f("InfoFlowDevice", "getDeviceScore gDevice == null");
            return null;
        }
        try {
            return Integer.valueOf(iInfoFlowDevice.getDeviceScore());
        } catch (Throwable th) {
            fve.c("InfoFlowDevice", "getDeviceScore error", th);
            return null;
        }
    }

    public static void c(IInfoFlowDevice iInfoFlowDevice) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b18d787", new Object[]{iInfoFlowDevice});
        } else {
            f28280a = iInfoFlowDevice;
        }
    }
}
