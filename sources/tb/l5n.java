package tb;

import android.app.Application;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.preload.TBBuyPreloadFactory;
import java.util.HashMap;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class l5n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(708837420);
    }

    public l5n() {
        Log.e("PurchaseIdleLauncher", pg1.ATOM_constructor);
    }

    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        ck.g().e("下单闲时预加载开始", ck.b.b().i("AURA/performance").d("time", System.currentTimeMillis()).a());
        TBBuyPreloadFactory.onStage(application.getApplicationContext(), "idle", "tbBuy", null);
    }
}
