package tb;

import android.content.Context;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "lightbuy.impl.nextrpc.requestParams")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class xng extends et {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public cog f;

    static {
        t2o.a(708837395);
    }

    public static /* synthetic */ Object ipc$super(xng xngVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/lightbuy/data/extension/LightBugNextRPCExtension");
    }

    public final cog J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cog) ipChange.ipc$dispatch("49652c7d", new Object[]{this});
        }
        cog cogVar = this.f;
        if (cogVar != null) {
            return cogVar;
        }
        aog aogVar = (aog) L().g(aog.KEY_LIGHT_BUY, aog.class);
        if (aogVar == null) {
            return null;
        }
        cog b = aogVar.b();
        this.f = b;
        return b;
    }

    public final void K0(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cb09cdf", new Object[]{this, map});
        } else if (map != null) {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                jSONObject.put(str, (Object) map.get(str));
            }
            cog J0 = J0();
            if (J0 == null) {
                ck.g().e("LightBuyDataSourceManager is null !!");
            } else {
                J0.k(L().f(), jSONObject);
            }
        }
    }

    @Override // tb.et, tb.vbb
    public void Q(AURANextRPCEndpoint aURANextRPCEndpoint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb0f0ad2", new Object[]{this, aURANextRPCEndpoint});
            return;
        }
        Context f = L().f();
        if ((f instanceof lud) && "weex".equals(((lud) f).g1())) {
            K0(aURANextRPCEndpoint.getDataParams());
        }
    }
}
