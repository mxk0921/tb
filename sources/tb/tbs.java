package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.taobao.initializer.kernel.TMSInitTaskExecutorType;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class tbs extends z8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String b = "";
    public static final String c = "[landing_v2_1120,landing_v2_1119,landing_v2_1121,landing_v2_1122]";

    static {
        t2o.a(847249530);
    }

    public tbs(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(tbs tbsVar, String str, Object... objArr) {
        if (str.hashCode() == 1344301040) {
            super.c((Application) objArr[0], (HashMap) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/taobao/initializer/task/necessary/TMSMiniKernelInitTask");
    }

    @Override // tb.z8s
    public void c(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("502067f0", new Object[]{this, application, hashMap});
            return;
        }
        super.c(application, hashMap);
        try {
            if (q9s.h2()) {
                q9s.J3("themis_mini_kernel_white_config", "miniKernelPathList", b);
                q9s.J3("themis_mini_kernel_white_config", "miniKernelPageIdList", c);
            }
        } catch (Exception e) {
            TMSLogger.b(z8s.TAG, "TMSMiniKernelInitTask error, error is: " + e.getMessage());
        }
    }

    @Override // tb.z8s
    public TMSInitTaskExecutorType d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSInitTaskExecutorType) ipChange.ipc$dispatch("45d39259", new Object[]{this});
        }
        return TMSInitTaskExecutorType.NORMAL;
    }

    @Override // tb.z8s
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "miniKernel.init";
    }
}
