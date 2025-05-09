package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class je0 extends ku1<ne0> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements MSOAServiceListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
            } else {
                je0.this.g(str, str2);
            }
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onSuccess(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
            } else {
                je0.this.h(ba3.b(map));
            }
        }
    }

    static {
        t2o.a(573571091);
    }

    public static /* synthetic */ Object ipc$super(je0 je0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mmad/ability/biz/cart/AddCartEvent");
    }

    @Override // tb.ku1
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("adef98ca", new Object[]{this});
        }
        return me0.EVENT_TYPE;
    }

    /* renamed from: i */
    public void e(ne0 ne0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59503727", new Object[]{this, ne0Var});
        } else if (ne0Var == null) {
            jgh.a("AddCartEvent", "data null");
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("itemId", ne0Var.b);
            hashMap.put("showSku", Boolean.FALSE);
            hashMap.put(q2q.KEY_SKU_ID, ne0Var.f24672a);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("operateSource", (Object) "splashAd");
            hashMap.put("exParams", jSONObject.toJSONString());
            vrh vrhVar = new vrh("msoa.taobao.cart.open", "msoa.taobao.cart.open.add", "1.0", "splashInteract", hashMap);
            ba3.a(ne0Var.b);
            rrh.e().o(vrhVar, new a());
        }
    }

    public void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b7b6a10", new Object[]{this, str, str2});
            return;
        }
        try {
            jgh.a("AddCartEvent", "互动加购失败：retCode=" + str + ";retMsg=" + str2);
            i4v.s(0, str, str2, this.b);
            c(str, str2);
            nwi nwiVar = this.b;
            String d = d();
            m0j.f(nwiVar, d, str + str2);
        } catch (Throwable th) {
            jgh.b("AddCartEvent", "SmallPopView. commitFail .error", th);
        }
    }

    public void h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0867ffd", new Object[]{this, jSONObject});
            return;
        }
        try {
            jgh.a("AddCartEvent", "互动加购成功");
            i4v.s(1, "", "", this.b);
            f(jSONObject);
        } catch (Throwable th) {
            jgh.b("AddCartEvent", "SmallPopView. commitSuccess .error", th);
        }
    }
}
