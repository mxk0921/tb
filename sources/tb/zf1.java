package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.business.AtmosphereRealRequest;
import com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.business.AtmosphereRealResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class zf1 extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699424);
    }

    public zf1(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(zf1 zf1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/input/atmosphere/business/AtmosphereBusiness");
    }

    public void K(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24b69e21", new Object[]{this, str, str2});
            return;
        }
        AtmosphereRealRequest atmosphereRealRequest = new AtmosphereRealRequest();
        atmosphereRealRequest.liveId = str;
        atmosphereRealRequest.anchorId = str2;
        C(0, atmosphereRealRequest, AtmosphereRealResponse.class);
    }
}
