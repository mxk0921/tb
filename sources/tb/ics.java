package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IConfigAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.taobao.initializer.kernel.TMSInitTaskExecutorType;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ics extends z8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(847249531);
    }

    public ics(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(ics icsVar, String str, Object... objArr) {
        if (str.hashCode() == 1344301040) {
            super.c((Application) objArr[0], (HashMap) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/taobao/initializer/task/necessary/TMSPrefetchDataInitTask");
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
            if (q9s.A1()) {
                ((IConfigAdapter) p8s.g(IConfigAdapter.class)).getCustomConfigByLocal("themis_prefetch_white_list", "{}");
            }
        } catch (Exception e) {
            TMSLogger.b(z8s.TAG, "TMSPrefetchDataInitTask error" + e.getMessage());
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
        return "prefetchData.init";
    }
}
