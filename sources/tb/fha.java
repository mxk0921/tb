package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fha extends vfa<Object, ebc> implements gbc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699314);
        t2o.a(295699311);
    }

    public fha(xea xeaVar) {
        super(xeaVar);
    }

    public static /* synthetic */ Object ipc$super(fha fhaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/liveGoodsList/liveStateMutitabView/impl/GoodsLiveStateMutitabPresenter");
    }

    /* renamed from: O */
    public ebc N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ebc) ipChange.ipc$dispatch("2ee4383c", new Object[]{this});
        }
        return new dha(this.d);
    }
}
