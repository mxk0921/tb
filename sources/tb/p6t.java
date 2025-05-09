package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.controller2.TaoLiveRealController;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class p6t implements zuc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaoLiveRealController f25913a;

    public p6t(TaoLiveRealController taoLiveRealController) {
        this.f25913a = taoLiveRealController;
    }

    @Override // tb.zuc
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4942848", new Object[]{this, str});
        } else {
            TaoLiveRealController.j0(this.f25913a).w(str);
        }
    }
}
