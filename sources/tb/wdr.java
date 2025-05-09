package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class wdr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final wdr INSTANCE = new wdr();

    static {
        t2o.a(1031798812);
    }

    @JvmStatic
    public static final void b(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        ckf.g(application, "application");
        ckf.g(hashMap, "params");
        vto.INSTANCE.a().execute(new Runnable() { // from class: tb.vdr
            @Override // java.lang.Runnable
            public final void run() {
                wdr.c();
            }
        });
    }

    public static final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e0b6245", new Object[0]);
        } else {
            der.INSTANCE.c();
        }
    }
}
