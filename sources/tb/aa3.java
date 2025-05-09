package tb;

import android.content.Intent;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.alipay.export.CashdeskConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class aa3 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends l12 {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String j;
        public final /* synthetic */ String k;

        public a(aa3 aa3Var, String str, String str2) {
            this.j = str;
            this.k = str2;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartAliPayServiceSubscriber$1");
        }

        @Override // tb.l12
        public void j(lcu lcuVar) {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
                return;
            }
            this.c.g().m("cart_activity_result", this);
            Integer num = (Integer) lcuVar.e("requestCode");
            Integer num2 = (Integer) lcuVar.e("resultCode");
            Intent intent = (Intent) lcuVar.e("data");
            if (intent != null && intent.getExtras() != null && num != null && num2 != null && 50103 == num.intValue() && num2.intValue() == -1) {
                if ("0".equals(intent.getStringExtra("errorCode"))) {
                    try {
                        jSONObject = JSON.parseObject(intent.getExtras().getString("result"));
                    } catch (Exception e) {
                        ei8.a("AliPayServiceParseJsonError", e);
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        if ("true".equals(jSONObject.getString("success"))) {
                            be3.c(this.b, this.j);
                        } else if ("false".equals(jSONObject.getString("success"))) {
                            be3.c(this.b, this.k);
                        }
                    }
                } else {
                    be3.c(this.b, this.k);
                }
            }
        }
    }

    static {
        t2o.a(479199372);
    }

    public static /* synthetic */ Object ipc$super(aa3 aa3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartAliPayServiceSubscriber");
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        JSONObject c = c();
        String string = c.getString("api");
        String string2 = c.getString("params");
        JSONObject jSONObject = c.getJSONObject("success");
        JSONObject jSONObject2 = c.getJSONObject("fail");
        String str = "";
        String string3 = jSONObject != null ? jSONObject.getString("toast") : str;
        if (jSONObject2 != null) {
            str = jSONObject2.getString("toast");
        }
        Intent intent = new Intent();
        intent.setAction(CashdeskConstants.ALIPAY_ACTION);
        intent.setPackage(this.b.getPackageName());
        intent.putExtra("bizType", string);
        intent.putExtra("data", string2);
        this.j.R().startActivityForResult(intent, vc3.REQUEST_ALI_PAY_SERVICE);
        this.j.g().c("cart_activity_result", new a(this, string3, str));
    }
}
