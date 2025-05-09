package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
@AURAExtensionImpl(code = cn0.CODE)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class cn0 extends ws {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CODE = "alibuy.impl.event.openSku";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements MSOAServiceListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AURARenderComponent f17165a;
        public final /* synthetic */ AURAEventIO b;

        public a(AURARenderComponent aURARenderComponent, AURAEventIO aURAEventIO) {
            this.f17165a = aURARenderComponent;
            this.b = aURAEventIO;
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
                return;
            }
            cn0.O0(cn0.this, "openSku", str2);
            ck.g().f("AURAMSOAExtension", new ag().b("errCode", str).b("errStr", str2));
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onSuccess(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
            } else {
                cn0.this.Q0(map, this.f17165a, this.b);
            }
        }
    }

    static {
        t2o.a(301989974);
    }

    public static /* synthetic */ void O0(cn0 cn0Var, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bac71b0", new Object[]{cn0Var, str, str2});
        } else {
            cn0Var.M0(str, str2);
        }
    }

    public static /* synthetic */ Object ipc$super(cn0 cn0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/extension/event/msoa/AliBuyOpenSkuExtension");
    }

    @Override // tb.ws
    public void K0(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53a1928f", new Object[]{this, aURAEventIO});
            return;
        }
        qi eventModel = aURAEventIO.getEventModel();
        JSONObject c = eventModel.c();
        if (c == null) {
            M0("openSku", "eventKey or target is null!");
            ck.g().d("AURAOpenMSOAPageExtension eventFields is null");
            return;
        }
        AURARenderComponent j = eventModel.j();
        if (j == null) {
            M0("openSku", "renderComponent is null!");
            ck.g().d("AURAOpenMSOAPageExtension renderComponent is null");
            return;
        }
        rrh.e().o(new vrh("msoa.taobao.cart.sdk", "msoa.taobao.detail.showsku", "2.0", "cart", P0(c)), new a(j, aURAEventIO));
    }

    public final Map<String, Object> P0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("78274261", new Object[]{this, jSONObject});
        }
        String string = jSONObject.getString("itemId");
        String string2 = jSONObject.getString(q2q.KEY_SKU_ID);
        jSONObject.getString("bizName");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("bizName", (Object) "minidetail");
        jSONObject2.put(q2q.KEY_SKU_ID, (Object) string2);
        JSONObject jSONObject3 = jSONObject.getJSONObject("exParams");
        if (jSONObject3 != null) {
            jSONObject2.putAll(jSONObject3);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", string);
        hashMap.put("sourceType", "3");
        hashMap.put("exParams", jSONObject2);
        return hashMap;
    }

    public void Q0(Map<String, Object> map, AURARenderComponent aURARenderComponent, AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f97e3dd4", new Object[]{this, map, aURARenderComponent, aURAEventIO});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        String str = (String) fk.b(map, "itemId", String.class, null);
        String str2 = (String) fk.b(map, q2q.KEY_SKU_ID, String.class, null);
        if (TextUtils.isEmpty(str2)) {
            ck.g().d("AURAMSOAExtension skuId is null");
            return;
        }
        jSONObject.put(q2q.KEY_SKU_ID, (Object) str2);
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("itemId", (Object) str);
        }
        an0.e(J0(), aURARenderComponent, aURAEventIO, jSONObject);
    }

    @Override // tb.ibb
    public String t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45cb977b", new Object[]{this});
        }
        return "openSku";
    }
}
