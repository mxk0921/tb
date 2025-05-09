package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.topAccount.TaoLiveKtIntimacyModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class eqz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final eqz INSTANCE = new eqz();

    static {
        t2o.a(1010827380);
    }

    public final boolean a(TaoLiveKtIntimacyModel taoLiveKtIntimacyModel, czs czsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e053c1d3", new Object[]{this, taoLiveKtIntimacyModel, czsVar})).booleanValue();
        }
        if (!h2t.INSTANCE.k()) {
            return false;
        }
        if ((czsVar == null || !czsVar.y()) && ((czsVar == null || !czsVar.C()) && ((czsVar == null || !czsVar.d0()) && ((czsVar == null || !czsVar.B()) && taoLiveKtIntimacyModel != null)))) {
            return ckf.b(taoLiveKtIntimacyModel.getEnableNewStyle(), "true");
        }
        return false;
    }
}
