package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "tbbuy.impl.nextrpc.refresh.extparams")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class m9r extends et {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(708837473);
    }

    public static /* synthetic */ Object ipc$super(m9r m9rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/aura/extension/TBBuyRefreshExtExtension");
    }

    public final JSONObject J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("614d4378", new Object[]{this});
        }
        AURAGlobalData B = B();
        if (B != null) {
            return (JSONObject) B.get("refreshExtRequestParams", JSONObject.class);
        }
        return null;
    }

    public final void K0(String str, Map<String, String> map, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9598b4e2", new Object[]{this, str, map, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        if (jSONObject2 != null) {
            String str2 = map.get(str);
            if (!TextUtils.isEmpty(str2)) {
                JSONObject a2 = tj.a(str2);
                if (!bh.b(a2)) {
                    a2.putAll(jSONObject2);
                    map.put(str, a2.toJSONString());
                }
            }
        }
    }

    public final void L0(List<String> list, Map<String, String> map, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce4d33b2", new Object[]{this, list, map, jSONObject});
            return;
        }
        for (String str : jSONObject.keySet()) {
            if (list.contains(str)) {
                K0(str, map, jSONObject);
            } else {
                map.put(str, jSONObject.getString(str));
            }
        }
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
        if (!bh.b(dataParams)) {
            JSONObject J0 = J0();
            if (!bh.b(J0)) {
                L0(Collections.singletonList("exParams"), dataParams, J0);
            }
        }
    }
}
