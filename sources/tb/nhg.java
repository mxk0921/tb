package tb;

import android.os.Process;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class nhg extends ta7<String, Void> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public nhg(vct<String, Void> vctVar) {
        super(vctVar);
    }

    public static /* synthetic */ Object ipc$super(nhg nhgVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/impl/LauncherTask");
    }

    @Override // tb.vct
    public boolean d(en8<String, Void> en8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f4deb9f", new Object[]{this, en8Var})).booleanValue();
        }
        if (kft.a(c()) || !k().d(en8Var)) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public Void b() {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Void) ipChange.ipc$dispatch("68657001", new Object[]{this});
        }
        if (LauncherRuntime.l) {
            j = System.currentTimeMillis();
            jdh.j("LauncherTask", "Executing launcher # %s, thread priority:%d", c(), Integer.valueOf(Process.getThreadPriority(Process.myTid())));
        } else {
            j = 0;
        }
        String c = c();
        try {
            w35.a(c);
            cts.b(c);
            Void b = k().b();
            cts.a(c);
            w35.c();
            if (!LauncherRuntime.l) {
                return b;
            }
            jdh.k("LauncherTask", "Executed launcher # %s, Execution Done with result=%s, cost=%d ms", c(), b, Long.valueOf(ptt.b(j)));
            return b;
        } catch (Throwable th) {
            try {
                m(th);
                return null;
            } finally {
                cts.a(c);
                w35.c();
                if (LauncherRuntime.l) {
                    jdh.k("LauncherTask", "Executed launcher # %s, Execution Done with result=%s, cost=%d ms", c(), null, Long.valueOf(ptt.b(j)));
                }
            }
        }
    }

    public final void m(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            return;
        }
        jdh.a("LauncherTask", "execute task '%s' failed with exception:", c(), th);
        OrangeConfig instance = OrangeConfig.getInstance();
        String config = instance.getConfig("launch_config", "is_report_crash", "1");
        String config2 = instance.getConfig("launch_config", "crash_white_list", "");
        if (!"1".equals(config)) {
            return;
        }
        if (TextUtils.isEmpty(config2) || !config2.contains(c())) {
            k1j.a(LauncherRuntime.g, c(), th);
        }
    }
}
