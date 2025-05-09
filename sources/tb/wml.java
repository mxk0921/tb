package tb;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.nav.LCNavInterceptor;
import org.json.JSONObject;
import tb.lvc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class wml extends LCNavInterceptor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705554);
    }

    public static /* synthetic */ Object ipc$super(wml wmlVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/nav/interceptor/PageFilmDetailInterceptor");
    }

    @Override // com.taobao.android.litecreator.sdk.nav.LCNavInterceptor
    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c1bf6a92", new Object[]{this});
        }
        return "litecreator/film_detail";
    }

    @Override // com.taobao.android.litecreator.sdk.nav.LCNavInterceptor
    public void d(JSONObject jSONObject, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c74a5aa9", new Object[]{this, jSONObject, context});
            return;
        }
        ckf.g(jSONObject, "publishConfig");
        ckf.g(context, "context");
        jSONObject.put("film_open_mode", "1");
        ((x6c) kdp.a(x6c.class, new Object[0])).open(context, qrf.p(jSONObject), new WVCallBackContext(null));
        lvc e = e();
        if (e != null) {
            lvc.a.a(e, "short_chain_success", f(), null, 4, null);
        }
    }
}
