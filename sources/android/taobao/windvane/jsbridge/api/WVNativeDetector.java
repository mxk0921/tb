package android.taobao.windvane.jsbridge.api;

import android.app.Application;
import android.content.ContextWrapper;
import android.os.Build;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.security.sdk.SecurityGuardManager;
import tb.ai7;
import tb.c21;
import tb.chb;
import tb.fi7;
import tb.kpw;
import tb.nsw;
import tb.t2o;
import tb.v7t;
import tb.vox;
import tb.yaa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVNativeDetector extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989856290);
    }

    private void detectYearClass(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89420d26", new Object[]{this, str, wVCallBackContext});
            return;
        }
        int c = vox.c(this.mContext);
        if (c == -1) {
            wVCallBackContext.error();
            return;
        }
        nsw nswVar = new nsw();
        nswVar.b("deviceYear", Integer.toString(c));
        wVCallBackContext.success(nswVar);
    }

    private void getCurrentUsage(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("240493ec", new Object[]{this, str, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        Application application = yaa.n;
        if (application == null) {
            wVCallBackContext.error();
            return;
        }
        float g = (float) (fi7.g(application) / 1048576);
        float f = fi7.f();
        float d = g - ((float) (fi7.d(yaa.n) / 1048576));
        nswVar.b("cpuUsage", Float.toString(f));
        nswVar.b("memoryUsage", Float.toString(d / g));
        nswVar.b("totalMemory", Float.toString(g));
        nswVar.b("usedMemory", Float.toString(d));
        wVCallBackContext.success(nswVar);
    }

    private void getPerformanceInfo(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25633416", new Object[]{this, str, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        try {
            chb g = c21.g();
            int i = g.getInt("deviceScore", -1);
            int i2 = g.getInt(ai7.KEY_CPU_SCORE, -1);
            int i3 = g.getInt(ai7.KEY_MEM_SCORE, -1);
            nswVar.a("deviceScore", Integer.valueOf(i));
            nswVar.a(ai7.KEY_CPU_SCORE, Integer.valueOf(i2));
            nswVar.a(ai7.KEY_MEM_SCORE, Integer.valueOf(i3));
            wVCallBackContext.success(nswVar);
        } catch (Throwable th) {
            nswVar.b("errMsg", th.getMessage());
            wVCallBackContext.error(nswVar);
        }
    }

    public static /* synthetic */ Object ipc$super(WVNativeDetector wVNativeDetector, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/jsbridge/api/WVNativeDetector");
    }

    private void isSimulator(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13030c8", new Object[]{this, str, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        try {
            boolean isSimulator = SecurityGuardManager.getInstance(new ContextWrapper(this.mContext)).getSimulatorDetectComp().isSimulator();
            v7t.i("WVNativeDetector", "Current phone is simulator: " + isSimulator);
            nswVar.a("isSimulator", Boolean.valueOf(isSimulator));
            wVCallBackContext.success(nswVar);
        } catch (Throwable th) {
            nswVar.b("errMsg", th.getMessage());
            wVCallBackContext.error(nswVar);
        }
    }

    public void getModelInfo(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d44ea8f", new Object[]{this, wVCallBackContext, str});
            return;
        }
        nsw nswVar = new nsw();
        nswVar.b("model", Build.MODEL);
        nswVar.b("brand", Build.BRAND);
        wVCallBackContext.success(nswVar);
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("getDeviceYear".equals(str)) {
            detectYearClass(str2, wVCallBackContext);
            return true;
        } else if ("getCurrentUsage".equals(str)) {
            getCurrentUsage(str2, wVCallBackContext);
            return true;
        } else if ("getModelInfo".equals(str)) {
            getModelInfo(wVCallBackContext, str2);
            return true;
        } else if ("isSimulator".equals(str)) {
            isSimulator(str2, wVCallBackContext);
            return true;
        } else if (!"getPerformanceInfo".equals(str)) {
            return false;
        } else {
            getPerformanceInfo(str2, wVCallBackContext);
            return true;
        }
    }
}
