package tb;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.watermask.a;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class xxw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(790626563);
    }

    public static void a(Application application, final HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        try {
            boolean S = a9l.w().S(application);
            wdm.d("WaterMaskInit.init.hitWaterMaskOpt=" + S, new Object[0]);
            final long currentTimeMillis = System.currentTimeMillis();
            if (S) {
                final Runnable jyyVar = new Runnable() { // from class: tb.jyy
                    @Override // java.lang.Runnable
                    public final void run() {
                        xxw.d(hashMap, currentTimeMillis);
                    }
                };
                long W = a9l.w().W();
                if (W > 0) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: tb.kyy
                        @Override // java.lang.Runnable
                        public final void run() {
                            xxw.e(jyyVar);
                        }
                    }, W);
                } else {
                    jyyVar.run();
                }
            }
            kxo.q().p(application);
            kxo.q().y();
        } catch (Throwable th) {
            wdm.h("WaterMaskInit.init.error", th);
        }
    }

    public static /* synthetic */ void e(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79fb4fc2", new Object[]{runnable});
        } else {
            hst.b(runnable);
        }
    }

    public static /* synthetic */ void d(HashMap hashMap, long j) {
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a4633b4", new Object[]{hashMap, new Long(j)});
            return;
        }
        Object obj = hashMap != null ? hashMap.get("launchStartTime") : null;
        if (obj instanceof Long) {
            j2 = ((Long) obj).longValue();
        } else {
            j2 = obj instanceof String ? Long.parseLong((String) obj) : 0L;
        }
        if (j2 > 0) {
            j2 += System.currentTimeMillis() - j;
        }
        a.m().l(j2);
        wdm.d("WaterMaskInit.init.done", new Object[0]);
    }
}
