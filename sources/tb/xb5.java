package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xb5 extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long ADDTOCART = -5950106872187663489L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements MSOAServiceListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k8 f31264a;
        public final /* synthetic */ String b;
        public final /* synthetic */ u8 c;

        public a(xb5 xb5Var, k8 k8Var, String str, u8 u8Var) {
            this.f31264a = k8Var;
            this.b = str;
            this.c = u8Var;
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorCode", (Object) str);
            jSONObject.put("errorMsg", (Object) str2);
            v1.b("DXAddToCartAbility", "onFail: " + jSONObject);
            this.c.callback("onFail", new f8(jSONObject));
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onSuccess(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
                return;
            }
            JSONObject jSONObject = new JSONObject(map);
            v1.b("DXAddToCartAbility", "onSuccess: " + jSONObject);
            ba3.g(this.f31264a, this.b, map);
            this.c.callback("onSuccess", new f8(jSONObject));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public xb5 build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xb5) ipChange.ipc$dispatch("bbe08ec3", new Object[]{this, obj});
            }
            return new xb5();
        }
    }

    public static /* synthetic */ Object ipc$super(xb5 xb5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/ad/impl/dx/ability/DXAddToCartAbility");
    }

    @Override // tb.m8
    public c8 f(n8 n8Var, k8 k8Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
        }
        String i = n8Var.i("itemId");
        boolean equals = TextUtils.equals("true", n8Var.i("disableAddToCart"));
        boolean equals2 = TextUtils.equals("true", n8Var.i("disableToast"));
        if (TextUtils.isEmpty(i) || equals) {
            v1.b("DXAddToCartAbility", "onExecuteWithData: itemId=" + i + ", disableAddToCart=" + n8Var.i("disableAddToCart"));
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", i);
        hashMap.put("showSku", Boolean.FALSE);
        hashMap.put(q2q.KEY_SKU_ID, n8Var.i(q2q.KEY_SKU_ID));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("disableToast", Boolean.valueOf(equals2));
        hashMap.put("clientExParams", hashMap2);
        vrh vrhVar = new vrh("msoa.taobao.cart.open", "msoa.taobao.cart.open.add", "1.0", "homepageTexiu", hashMap);
        ba3.a(i);
        rrh.e().o(vrhVar, new a(this, k8Var, i, u8Var));
        return null;
    }
}
