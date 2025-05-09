package tb;

import android.app.Application;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.BaseICartFragmentProxy;
import com.taobao.android.icart.weex.call.CartMegaManager;
import com.taobao.tao.Globals;
import com.taobao.tao.alipay.export.CashdeskConstants;
import java.util.Map;
import tb.ne3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class zq0 extends mw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(478150939);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b implements BaseICartFragmentProxy.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ sv b;
        public final /* synthetic */ String c;

        public b(sv svVar, String str) {
            this.b = svVar;
            this.c = str;
        }

        @Override // com.taobao.android.icart.BaseICartFragmentProxy.a
        public void onActivityResult(int i, int i2, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            } else if (i == 1001) {
                this.b.r(this);
                if (i2 == -1) {
                    zq0.c(zq0.this, this.c, intent);
                } else {
                    CartMegaManager.INSTANCE.l(this.c);
                }
            }
        }
    }

    static {
        t2o.a(478150938);
    }

    public static final /* synthetic */ void c(zq0 zq0Var, String str, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b13d2b52", new Object[]{zq0Var, str, intent});
        } else {
            zq0Var.d(str, intent);
        }
    }

    public static /* synthetic */ Object ipc$super(zq0 zq0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/weex/call/nativehandler/impl/AliPayServiceNativeHandler");
    }

    @Override // tb.mw
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3046a606", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public final void d(String str, Intent intent) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93f120a2", new Object[]{this, str, intent});
            return;
        }
        JSONObject jSONObject = null;
        try {
            jSONObject = JSON.parseObject(intent != null ? intent.getStringExtra("result") : null);
        } catch (Exception e) {
            ne3.c.b(ne3.Companion, "AliPayServiceParseResultError", e, 0.0f, 4, null);
        }
        JSONObject jSONObject2 = new JSONObject();
        if (intent == null || (str2 = intent.getStringExtra("errorCode")) == null) {
            str2 = "";
        }
        jSONObject2.put((JSONObject) "code", str2);
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject2.put((JSONObject) "result", (String) jSONObject);
        g1a<Map<String, ? extends Object>, xhv> f = CartMegaManager.INSTANCE.f(str);
        if (f != null) {
            f.invoke(jSONObject2);
        }
    }

    @Override // tb.mw
    public boolean a(String str, String str2, JSONObject jSONObject, String str3) {
        rv i;
        sv b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d18e260f", new Object[]{this, str, str2, jSONObject, str3})).booleanValue();
        }
        ckf.g(str, "instanceID");
        ckf.g(str2, "method");
        ckf.g(jSONObject, "params");
        ckf.g(str3, "callbackID");
        if (!jSONObject.containsKey("api") || !jSONObject.containsKey("params") || (i = CartMegaManager.INSTANCE.i(str)) == null || (b2 = i.b()) == null) {
            return false;
        }
        Intent intent = new Intent();
        intent.setAction(CashdeskConstants.ALIPAY_ACTION);
        Application application = Globals.getApplication();
        ckf.f(application, "Globals.getApplication()");
        intent.setPackage(application.getPackageName());
        intent.putExtra("bizType", jSONObject.getString("api"));
        intent.putExtra("data", jSONObject.getString("params"));
        Fragment h = b2.h();
        if (h != null) {
            h.startActivityForResult(intent, 1001);
        }
        b2.o(new b(b2, str3));
        return true;
    }
}
