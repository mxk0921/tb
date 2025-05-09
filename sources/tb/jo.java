package tb;

import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class jo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(81788948);
    }

    @Deprecated
    public static void a(nbb nbbVar, AURAParseIO aURAParseIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("297cf2a", new Object[]{nbbVar, aURAParseIO});
        } else if (nbbVar == null || aURAParseIO == null) {
            ck.g().b("AURAEventDispatcher", "dispatch", "dispatch update workflow error");
        } else {
            nbbVar.c("aura.workflow.update", aURAParseIO, null);
        }
    }
}
