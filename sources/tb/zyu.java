package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class zyu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SDK_VERSION = "0.2.29";
    public static final String USER_AGENT = "UT4Aplus/0.2.29";

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f33111a;

    public static void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847dd28", new Object[]{application});
        } else {
            b(application, null);
        }
    }

    public static synchronized void b(Application application, Map map) {
        synchronized (zyu.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b47f095d", new Object[]{application, map});
                return;
            }
            if (!f33111a) {
                f33111a = true;
                nb0.d().e(application);
                new em4().a();
                new dml().a();
                lk1.a().b();
            }
        }
    }
}
