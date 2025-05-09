package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.liveroom.updown.mtop.manager.TaoLiveKtUpDownRequestManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class g3t {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final g3t INSTANCE = new g3t();

    static {
        t2o.a(1010827401);
    }

    public final oyd a(i3t i3tVar) {
        pxs a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oyd) ipChange.ipc$dispatch("256012e4", new Object[]{this, i3tVar});
        }
        if (i3tVar == null || (a2 = i3tVar.a()) == null) {
            return null;
        }
        if (i3tVar.c() == 0) {
            TaoLiveKtUpDownRequestManager taoLiveKtUpDownRequestManager = new TaoLiveKtUpDownRequestManager();
            taoLiveKtUpDownRequestManager.initManager(a2, i3tVar.b());
            return taoLiveKtUpDownRequestManager;
        } else if (i3tVar.c() == 1) {
            qqz qqzVar = new qqz();
            qqzVar.n(a2, i3tVar.b());
            return qqzVar;
        } else {
            TaoLiveKtUpDownRequestManager taoLiveKtUpDownRequestManager2 = new TaoLiveKtUpDownRequestManager();
            taoLiveKtUpDownRequestManager2.initManager(a2, i3tVar.b());
            return taoLiveKtUpDownRequestManager2;
        }
    }
}
