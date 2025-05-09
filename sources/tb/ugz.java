package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.phz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ugz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ugz INSTANCE = new ugz();

    static {
        t2o.a(598737289);
    }

    public final void a(phz phzVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab55a738", new Object[]{this, phzVar});
            return;
        }
        ckf.g(phzVar, "event");
        byte c = phzVar.c();
        if (phz.a.b(c, phz.a.a((byte) 0))) {
            vgz vgzVar = phzVar.d().get();
            if (vgzVar != null) {
                vgzVar.onEvent(phzVar);
                return;
            }
            return;
        }
        if (!phz.a.b(c, phz.a.a((byte) 1))) {
            z = phz.a.b(c, phz.a.a((byte) 2));
        }
        if (z) {
            System.out.println((Object) ("Processing event with ID: " + phzVar.a() + " in scope: " + ((Object) phz.a.d(phzVar.c()))));
        }
    }
}
