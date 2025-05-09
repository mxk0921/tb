package tb;

import android.content.Context;
import android.net.Uri;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import java.net.URLEncoder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class e5l implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openTmallApp";
    public static final String EVENT_TYPE_ALTERNATIVE = "open_tmall_app";

    /* renamed from: a  reason: collision with root package name */
    public final Context f18296a;

    static {
        t2o.a(912261921);
        t2o.a(912261826);
    }

    public e5l(Context context, ze7 ze7Var) {
        this.f18296a = context;
    }

    public final String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("37e4e4d2", new Object[]{this, str});
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("dl_redirect");
            if (queryParameter == null) {
                return "";
            }
            return queryParameter;
        } catch (Throwable th) {
            tgh.c("OpenTmallAppImplementor", "getRedirectUrl error", th);
            return "";
        }
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (irVar == null || (a2 = irVar.a()) == null) {
            return false;
        }
        String string = a2.getString("url");
        try {
            String encode = URLEncoder.encode(b(string), "UTF-8");
            String encode2 = URLEncoder.encode(string, "UTF-8");
            jov.k(this.f18296a, "tbout://m.taobao.com/out.htm?url=" + encode + "&linkKey=tmall&degradeH5Url=" + encode2 + "&visa=8038aae9c566568b&meanwhile=true");
        } catch (Throwable th) {
            tgh.c("OpenTmallAppImplementor", "run openTmallApp error", th);
        }
        return true;
    }
}
