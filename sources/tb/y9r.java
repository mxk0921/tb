package tb;

import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "tbbuy.impl.nextrpc.userTrack")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class y9r extends et {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(708837499);
    }

    public static /* synthetic */ Object ipc$super(y9r y9rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/aura/extension/utTrack/TBBuyUserTrackNextRPCExtension");
    }

    @Override // tb.et
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47552595", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.et, tb.vbb
    public void j0(AURANextRPCEndpoint aURANextRPCEndpoint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("501f871f", new Object[]{this, aURANextRPCEndpoint});
            return;
        }
        Map<String, String> dataParams = aURANextRPCEndpoint.getDataParams();
        AURAGlobalData B = B();
        if (B != null) {
            B.update("tbbuy_dataParams", dataParams);
        }
    }
}
