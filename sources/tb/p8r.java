package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.aura.external.TBBuyExternalRPVerifyService;
import tb.ck;
import tb.k9r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class p8r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f25949a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements k9r.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pvh f25950a;
        public final /* synthetic */ pvh b;

        public a(p8r p8rVar, pvh pvhVar, pvh pvhVar2) {
            this.f25950a = pvhVar;
            this.b = pvhVar2;
        }

        @Override // tb.k9r.d
        public void a(boolean z, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f730c189", new Object[]{this, new Boolean(z), str, str2});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorCode", (Object) str);
            jSONObject.put("errorMsg", (Object) str2);
            if (z) {
                this.f25950a.b(jSONObject);
            } else {
                this.b.b(jSONObject);
            }
        }
    }

    static {
        t2o.a(708837522);
    }

    public p8r(Context context) {
        this.f25949a = context;
    }

    public final JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3e6aff6c", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            jSONObject.put("message", (Object) str);
        }
        return jSONObject;
    }

    public void c(String str, JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56f76fce", new Object[]{this, str, jSONObject, pvhVar, pvhVar2});
            return;
        }
        Log.e("TBBuyJsBridge", "onReceiveMessage event = " + str);
        rbb g = ck.g();
        g.f("onReceiveMessage event = " + str, ck.b.b().l("TBBuyJsBridge").i("AliBuyCommonModule/event").g("receive", str).a());
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if ("verifyRP".equals(str)) {
            b(jSONObject, pvhVar, pvhVar2);
        }
    }

    public final boolean b(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fab438d0", new Object[]{this, jSONObject, pvhVar, pvhVar2})).booleanValue();
        }
        String string = jSONObject.getString(BaseJsExecutor.NAME_VERIFY_TOKEN);
        if (TextUtils.isEmpty(string)) {
            pvhVar.b(a("verifyToken is null"));
            ck.g().e("TBBuyJsBridge verifyToken is null!!");
        }
        new TBBuyExternalRPVerifyService().verify(this.f25949a, string, new a(this, pvhVar, pvhVar2));
        return true;
    }
}
