package tb;

import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "tbbuy.impl.event.refresh")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class n9r extends ws {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(708837474);
    }

    public static /* synthetic */ Object ipc$super(n9r n9rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/aura/extension/TBBuyRefreshPageExtension");
    }

    public final JSONObject O0(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f80788d2", new Object[]{this, aURAEventIO});
        }
        qi eventModel = aURAEventIO.getEventModel();
        if (eventModel == null) {
            return null;
        }
        return eventModel.c();
    }

    public final void P0() {
        j1i j1iVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb10355", new Object[]{this});
            return;
        }
        AURAGlobalData B = B();
        if (B != null && (j1iVar = (j1i) B.get("aura_parse_global_data_parse", j1i.class)) != null) {
            j1iVar.b().o(null);
        }
    }

    @Override // tb.ibb
    public String t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45cb977b", new Object[]{this});
        }
        return "refresh";
    }

    @Override // tb.ws
    public void K0(AURAEventIO aURAEventIO) {
        AURAGlobalData B;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53a1928f", new Object[]{this, aURAEventIO});
            return;
        }
        Object f = hh.f(J0().f());
        if (f == null) {
            q8r.a("EMPTY_CONTAINER_FORM_(TBBuyRefreshPageExtension)", "container is empty");
        }
        JSONObject O0 = O0(aURAEventIO);
        if (!(O0 == null || (B = B()) == null)) {
            O0.put("forceShowLoading", "true");
            B.update("refreshExtRequestParams", O0);
        }
        P0();
        if (f instanceof lud) {
            ((lud) f).Y2(true);
        }
    }
}
