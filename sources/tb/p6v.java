package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class p6v extends m8<tk6> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ULTRONBUYNOW = "-1873679453362485004";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements MSOAServiceListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(p6v p6vVar) {
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
                return;
            }
            UnifyLog.e("UltronBuyNowAbility", str + "#" + str2);
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onSuccess(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(713031765);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public p6v build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (p6v) ipChange.ipc$dispatch("39dded80", new Object[]{this, obj});
            }
            return new p6v();
        }
    }

    static {
        t2o.a(713031763);
    }

    public static /* synthetic */ Object ipc$super(p6v p6vVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/dinamicX/ability/UltronBuyNowAbility");
    }

    /* renamed from: i */
    public c8 f(n8 n8Var, tk6 tk6Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("f0bde67e", new Object[]{this, n8Var, tk6Var, u8Var});
        }
        JSONObject h = n8Var.h();
        if (h == null) {
            return new b8(new a8(-1000, f4w.LOAD_DATA_NULL));
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bizName", (Object) "minidetail");
        jSONObject.put("from", (Object) "order");
        jSONObject.put("request_key", (Object) "openFrom,skuId");
        jSONObject.put("openFrom", (Object) "tmBuyAgain");
        String string = h.getString(q2q.KEY_SKU_ID);
        if (string != null) {
            jSONObject.put(q2q.KEY_SKU_ID, (Object) string);
        }
        HashMap hashMap = new HashMap(3);
        hashMap.put("sourceType", "6");
        hashMap.putAll(h);
        hashMap.put("exParams", jSONObject);
        rrh.e().o(new vrh("msoa.taobao.cart.sdk", "msoa.taobao.detail.showsku", "2.0", "cart", hashMap), new a(this));
        return new f8();
    }
}
