package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.wireless.security.sdk.SecurityGuardManager;
import com.taobao.wireless.security.sdk.simulatordetect.ISimulatorDetectComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class hbr implements jzb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final hbr INSTANCE = new hbr();

    @Override // tb.jzb
    public String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ee669c5", new Object[]{this, context});
        }
        ckf.g(context, "context");
        if (TBDeviceUtils.P(context)) {
            return "PAD";
        }
        return "PHONE";
    }

    @Override // tb.jzb
    public float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3f91355f", new Object[]{this})).floatValue();
        }
        try {
            String str = p7o.b(2).get("memoryMaxSize");
            if (str != null) {
                return Float.parseFloat(str);
            }
            return -1.0f;
        } catch (Exception e) {
            iih.INSTANCE.a("TBDeviceInfoImpl", "获取RAM失败：".concat(sm8.b(e)));
            return -1.0f;
        }
    }

    @Override // tb.jzb
    public float c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57750e11", new Object[]{this})).floatValue();
        }
        try {
            String str = p7o.b(6).get("storageSize");
            if (str != null) {
                return Float.parseFloat(str);
            }
            return -1.0f;
        } catch (Exception e) {
            iih.INSTANCE.a("TBDeviceInfoImpl", "获取ROM失败：".concat(sm8.b(e)));
            return -1.0f;
        }
    }

    @Override // tb.jzb
    public String d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1ca91a5b", new Object[]{this, context});
        }
        ckf.g(context, "context");
        if (TBDeviceUtils.p(context)) {
            return "FOLD";
        }
        return "NORMAL";
    }

    @Override // tb.jzb
    public boolean e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de3df326", new Object[]{this, context})).booleanValue();
        }
        ckf.g(context, "context");
        SecurityGuardManager instance = SecurityGuardManager.getInstance(context);
        ckf.f(instance, "SecurityGuardManager.getInstance(context)");
        ISimulatorDetectComponent simulatorDetectComp = instance.getSimulatorDetectComp();
        ckf.f(simulatorDetectComp, "SecurityGuardManager.get…text).simulatorDetectComp");
        return simulatorDetectComp.isSimulator();
    }

    @Override // tb.jzb
    public String getDeviceLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("89e64461", new Object[]{this});
        }
        int b = qp0.b();
        if (b == 0) {
            return "HIGH";
        }
        if (b == 1) {
            return "MEDIUM";
        }
        if (b != 2) {
            return "UNKNOWN";
        }
        return "LOW";
    }
}
