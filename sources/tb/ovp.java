package tb;

import android.content.Intent;
import android.os.Bundle;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.BaseICartFragmentProxy;
import com.taobao.android.icart.weex.call.CartMegaManager;
import com.taobao.android.nav.Nav;
import java.util.Map;
import tb.ne3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ovp extends mw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(478150961);
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

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ sv f25694a;
        public final /* synthetic */ String b;

        public b(sv svVar, String str) {
            this.f25694a = svVar;
            this.b = str;
        }

        @Override // com.taobao.android.icart.BaseICartFragmentProxy.a
        public void onActivityResult(int i, int i2, Intent intent) {
            String stringExtra;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            } else if (i == 1002) {
                this.f25694a.r(this);
                if (i2 == -1) {
                    JSONObject jSONObject = null;
                    if (intent != null) {
                        try {
                            stringExtra = intent.getStringExtra("params");
                        } catch (Exception e) {
                            ne3.c.b(ne3.Companion, "IndustrySkuParseParamsError", e, 0.0f, 4, null);
                        }
                    } else {
                        stringExtra = null;
                    }
                    jSONObject = JSON.parseObject(stringExtra);
                    new JSONObject().put((JSONObject) "skuExtParams", (String) jSONObject);
                    g1a<Map<String, ? extends Object>, xhv> f = CartMegaManager.INSTANCE.f(this.b);
                    if (f != null) {
                        f.invoke(jSONObject);
                        return;
                    }
                    return;
                }
                CartMegaManager.INSTANCE.l(this.b);
            }
        }
    }

    static {
        t2o.a(478150960);
    }

    public static /* synthetic */ Object ipc$super(ovp ovpVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/weex/call/nativehandler/impl/ShowIndustrySkuNativeHandler");
    }

    @Override // tb.mw
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3046a606", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.mw
    public boolean a(String str, String str2, JSONObject jSONObject, String str3) {
        String string;
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
        String string2 = jSONObject.getString("url");
        if (string2 == null || (string = jSONObject.getString("params")) == null || (i = CartMegaManager.INSTANCE.i(str)) == null || (b2 = i.b()) == null) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putString("contentData", string);
        b2.o(new b(b2, str3));
        Nav.from(b2.f()).withFragment(b2.h()).withExtras(bundle).forResult(1002).toUri(string2);
        return true;
    }
}
