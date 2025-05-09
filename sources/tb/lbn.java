package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class lbn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final kgd f23236a;
    public final obn b;

    public lbn(kgd kgdVar, obn obnVar) {
        this.f23236a = kgdVar;
        this.b = obnVar;
    }

    public final File a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("71a61287", new Object[]{this});
        }
        return new File(this.b.c(), "prefetch_enabled");
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c6f43ab", new Object[]{this, str});
            return;
        }
        try {
            File a2 = a();
            File file = new File(a2, this.f23236a.g());
            if (!file.isDirectory()) {
                jg9.d(a2);
                jg9.h(file);
                RSoLog.d("RSoResolver,  init appVerDir = " + file);
            }
            File file2 = new File(file, str);
            if (file2.exists()) {
                RSoLog.d("RSoResolver, prefetch enabled by " + str);
                return;
            }
            jg9.q(file2, "1");
            RSoLog.d("RSoResolver, prefetch enabled, libName = " + str + ", " + file2.exists());
        } catch (Throwable th) {
            rbn.g("enablePrefetch", th);
        }
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4e7e955", new Object[]{this, str})).booleanValue();
        }
        try {
            boolean exists = new File(new File(a(), this.f23236a.g()), str).exists();
            RSoLog.d("RSoResolver,  isPrefetchEnabled = " + exists + ", libName = " + str);
            return exists;
        } catch (Throwable th) {
            rbn.g("isPrefetchEnabled", th);
            RSoLog.d("RSoResolver, caught exception, isPrefetchEnabled = false, libName = " + str);
            return false;
        }
    }
}
