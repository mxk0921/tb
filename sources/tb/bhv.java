package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bhv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993002177);
    }

    public static void a(yko ykoVar, rlo rloVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76e057b7", new Object[]{ykoVar, rloVar});
        } else {
            ykoVar.i().o(new emo(new qlo(ykoVar, rloVar), rloVar));
        }
    }

    public static void b(yko ykoVar, amo amoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4494afd", new Object[]{ykoVar, amoVar});
        } else {
            ykoVar.i().o(amoVar);
        }
    }
}
