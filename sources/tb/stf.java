package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class stf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1034944552);
    }

    public static void a(qsf qsfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd2fe086", new Object[]{qsfVar});
        } else {
            gtf.i().o(qsfVar.e(), qsfVar.c(), qsfVar.d(), null);
        }
    }
}
