package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.boutique.fastsp.adapter.factory.FastSpFactory;
import com.taobao.android.boutique.fastsp.face.factory.SharedPreferencesFactory;
import com.taobao.android.boutique.fastsp.face.factory.SysSharedPreferencesFactory;
import java.io.File;
import java.util.HashSet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class wlp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(408944658);
    }

    public final void a(f1r f1rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7289873e", new Object[]{this, f1rVar});
            return;
        }
        if (f1rVar.b("closeDoubleWrite", false)) {
            g6g.f19754a = false;
        }
        y5g.b = f1rVar.b("fixStringSet", false);
    }

    public Object b(Context context) {
        SharedPreferencesFactory sharedPreferencesFactory;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1e62a907", new Object[]{this, context});
        }
        try {
            File filesDir = context.getFilesDir();
            File file = new File("/data/local/tmp/fastsp.db");
            boolean exists = file.exists();
            uhh.e(exists);
            if (!exists) {
                file = new File(filesDir, "fastsp.db");
            }
            f1r f1rVar = new f1r(ob9.a().b(file));
            if (f1rVar.b("useOptSp", true)) {
                a(f1rVar);
                String[] split = f1rVar.a("writeOnceSet", "").split(";");
                HashSet hashSet = new HashSet();
                for (String str : split) {
                    hashSet.add(str);
                }
                sharedPreferencesFactory = new FastSpFactory(hashSet);
            } else {
                sharedPreferencesFactory = null;
            }
            if (sharedPreferencesFactory == null) {
                sharedPreferencesFactory = new SysSharedPreferencesFactory();
            }
            return f1rVar.b("useMonitor", false) ? new yzi(sharedPreferencesFactory) : sharedPreferencesFactory;
        } catch (Throwable th) {
            uhh.d(th);
            uhh.b("SharedPreferencesFactoryRef", "init");
            return new SysSharedPreferencesFactory();
        }
    }
}
