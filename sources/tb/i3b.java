package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class i3b extends zya {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809330);
    }

    public static /* synthetic */ Object ipc$super(i3b i3bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/homepage/launcher/HomePreCreateNativeViewLauncher");
    }

    @Override // tb.zya
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        if (dvh.o()) {
            dvh.a(dvh.STAGE_APP_LAUNCH_TASKS);
        }
        phg.e("PreCreateNativeView");
        if (!vxl.b().J()) {
            if (vxl.b().w() || p7p.k()) {
                bqa.d("HomeLoadCacheLauncher", "preCreateNativeView");
                wbo.a().g(2);
                wbo.a().d();
                wbo.a().f();
            }
            phg.d("PreCreateNativeView");
        }
    }
}
