package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.watermask.a;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qz4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(790626312);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        try {
            wdm.d("UpdateInitFree.init", new Object[0]);
            if (!a9l.w().S(application)) {
                wdm.d("WaterMask.free.init", new Object[0]);
                Object obj = hashMap != null ? hashMap.get("launchStartTime") : null;
                if (obj instanceof Long) {
                    j = ((Long) obj).longValue();
                } else {
                    j = obj instanceof String ? Long.parseLong((String) obj) : 0L;
                }
                a.m().l(j);
                wdm.d("WaterMask.free.init.done", new Object[0]);
            }
            com.taobao.cus.a q = com.taobao.cus.a.q();
            q.y();
            q.B();
            q.d();
            vz4.d(application);
        } catch (Throwable th) {
            wdm.h("Updater.init.error", th);
        }
    }
}
