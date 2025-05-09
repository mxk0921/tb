package tb;

import com.alibaba.android.ultron.engine.protocol.Global;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class hca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(157286478);
    }

    public static Global a(u1n u1nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Global) ipChange.ipc$dispatch("f8ee1384", new Object[]{u1nVar});
        }
        Global global = new Global();
        global.data = u1nVar.c();
        return global;
    }
}
