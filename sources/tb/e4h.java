package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.config.GetLiveShareConfigRequest;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.config.GetLiveShareConfigResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class e4h extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295698530);
    }

    public e4h(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(e4h e4hVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/bottom/control/share/business/LiveShareBusiness");
    }

    public void K(GetLiveShareConfigRequest getLiveShareConfigRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4585afd8", new Object[]{this, getLiveShareConfigRequest});
        } else {
            C(0, getLiveShareConfigRequest, GetLiveShareConfigResponse.class);
        }
    }
}
