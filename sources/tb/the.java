package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.event.EventCenter;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class the {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e52748f5", new Object[0]);
        } else {
            EventCenter.f().h(new the()).k(16, Collections.emptyMap());
        }
    }

    public static void c(final Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        l1r.g(application);
        kw4.g(application);
        b();
        mti.c().b().post(new Runnable() { // from class: tb.rhe
            @Override // java.lang.Runnable
            public final void run() {
                the.d(application);
            }
        });
        el9.a(application);
    }

    public static /* synthetic */ void d(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50a7e779", new Object[]{application});
        } else {
            nmv.g(application);
        }
    }
}
