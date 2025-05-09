package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dha extends tfa<gbc> implements ebc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699313);
        t2o.a(295699310);
    }

    public dha(xea xeaVar) {
    }

    public static /* synthetic */ Object ipc$super(dha dhaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/liveGoodsList/liveStateMutitabView/impl/GoodsLiveStateMutitabModel");
    }

    @Override // tb.fvc
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce866d5d", new Object[]{this});
        }
    }
}
