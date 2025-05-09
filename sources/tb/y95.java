package tb;

import android.app.Application;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.login4android.api.Login;
import com.taobao.media.MediaSystemUtils;
import com.taobao.taobaoavsdk.CodeUsageCounter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class y95 implements utb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(451936287);
        t2o.a(452985050);
    }

    @Override // tb.utb
    public String getDeviceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79a7d1d2", new Object[]{this});
        }
        CodeUsageCounter.c().a(CodeUsageCounter.componentName.dw_adapter_DWUserInfoAdapter);
        Application application = MediaSystemUtils.sApplication;
        if (application == null) {
            return "";
        }
        try {
            return UTDevice.getUtdid(application);
        } catch (Throwable unused) {
            return Build.ID;
        }
    }

    @Override // tb.utb
    public String getUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        CodeUsageCounter.c().a(CodeUsageCounter.componentName.dw_adapter_DWUserInfoAdapter);
        try {
            return Login.getUserId();
        } catch (Throwable unused) {
            return Build.ID;
        }
    }
}
