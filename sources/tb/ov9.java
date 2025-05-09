package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ov9 implements vwd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(847249433);
        t2o.a(847249434);
    }

    @Override // tb.vwd
    public boolean a(mpj mpjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4350870", new Object[]{this, mpjVar})).booleanValue();
        }
        ckf.g(mpjVar, "navigationInfo");
        if (!wsq.O(mpjVar.d(), "forceThemis", false, 2, null) || !ckf.b("true", mpjVar.c().getQueryParameter("forceThemis"))) {
            return false;
        }
        if (mpjVar.b()) {
            return v9s.INSTANCE.a(mpjVar);
        }
        return true;
    }
}
