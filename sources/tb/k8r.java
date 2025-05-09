package tb;

import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class k8r extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_GLOBAL_DATA_KV = -4981361777532461787L;

    static {
        t2o.a(708837461);
    }

    public static /* synthetic */ Object ipc$super(k8r k8rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/aura/dinamicx/parse/TBBuyGlobalDataKVParse");
    }

    public final String a(AURAGlobalData aURAGlobalData) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f164347", new Object[]{this, aURAGlobalData});
        }
        if (aURAGlobalData == null || (jSONObject = (JSONObject) aURAGlobalData.get("submitExposureItemArgs", JSONObject.class)) == null) {
            return null;
        }
        return jSONObject.getString("itemCount");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length >= 2) {
            Object q = dXRuntimeContext.q();
            if (!(q instanceof qh)) {
                return null;
            }
            try {
                AURAGlobalData j = ((qh) q).j();
                String str = (String) objArr[0];
                String str2 = (String) objArr[1];
                if ("get".equals(str)) {
                    if ("globalBuyItemNum".equals(str2)) {
                        return a(j);
                    }
                    return j.get(str2, String.class);
                } else if ("set".equals(str)) {
                    j.update(str2, (String) objArr[2]);
                }
            } catch (Throwable th) {
                rbb g = ck.g();
                g.d("TBBuyGlobalDataKVParse exception :" + th.getMessage());
            }
        }
        return null;
    }
}
