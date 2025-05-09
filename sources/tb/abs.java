package tb;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.qwd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class abs {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TMSInitializer";

    /* renamed from: a  reason: collision with root package name */
    public static final String f15646a = "tms_manifest";
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static final AtomicBoolean c = new AtomicBoolean(false);

    public static qwd a(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Bundle bundle = applicationInfo.metaData;
            if (bundle == null) {
                return null;
            }
            String str = f15646a;
            if (bundle.containsKey(str)) {
                return (qwd) Class.forName(applicationInfo.metaData.getString(str)).newInstance();
            }
            return null;
        } catch (Throwable th) {
            TMSLogger.c("TMSInitializer!", "findManifestClass exception ", th);
            return null;
        }
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc98bb4f", new Object[]{context});
            return;
        }
        qwd a2 = a(context);
        f(context);
        d(a2);
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7314504b", new Object[]{context});
            return;
        }
        h8s.w(context);
        f(context);
    }

    public static void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("545cbd7a", new Object[]{context});
        } else {
            d(a(context));
        }
    }

    public static void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc255d75", new Object[]{context});
        } else if (!c.get()) {
            g(a(context));
        }
    }

    public static void d(qwd qwdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e9d4a4c", new Object[]{qwdVar});
        } else if (qwdVar == null) {
            TMSLogger.b(TAG, "registerAbilities but mainManifest is null!");
        } else {
            List<qwd.e> abilities = qwdVar.getAbilities();
            if (abilities == null || abilities.isEmpty()) {
                TMSLogger.b(TAG, "registerAbilities but abilityList is empty!");
                return;
            }
            for (qwd.e eVar : abilities) {
                if (eVar instanceof qwd.b) {
                    qwd.b bVar = (qwd.b) eVar;
                    l8s.d(bVar.b, bVar.f26968a);
                } else if (eVar instanceof qwd.a) {
                    ((qwd.a) eVar).getClass();
                    l8s.e(null, null, null);
                }
            }
            b.set(true);
        }
    }

    public static void g(qwd qwdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cde5c92a", new Object[]{qwdVar});
        } else if (qwdVar == null) {
            TMSLogger.b(TAG, "registerAdapters but mainManifest is null!");
        } else {
            List<qwd.f> adapters = qwdVar.getAdapters();
            if (adapters == null || adapters.isEmpty()) {
                TMSLogger.b(TAG, "registerAdapters but adapterList is empty!");
                return;
            }
            for (qwd.f fVar : adapters) {
                if (fVar instanceof qwd.d) {
                    ((qwd.d) fVar).getClass();
                    p8s.i(null, null);
                } else if (fVar instanceof qwd.c) {
                    qwd.c cVar = (qwd.c) fVar;
                    p8s.h(cVar.f26969a, cVar.b);
                }
            }
            c.set(true);
        }
    }

    static {
        t2o.a(839909716);
    }
}
