package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import java.net.URLEncoder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class g4l implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openPopLayer";
    public static final String EVENT_TYPE_ALTERNATIVE = "open_poplayer";

    /* renamed from: a  reason: collision with root package name */
    public final Context f19722a;

    static {
        t2o.a(912261904);
        t2o.a(912261826);
    }

    public g4l(Context context) {
        this.f19722a = context;
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject a2;
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (irVar == null || (a2 = irVar.a()) == null) {
            return false;
        }
        String string = a2.getString("url");
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        if (Uri.parse(string).getScheme() == null) {
            string = h1p.HTTPS_PREFIX + parse.getSchemeSpecificPart();
        }
        try {
            StringBuilder sb = new StringBuilder("poplayer://abcd?openType=directly&uuid=");
            sb.append(System.currentTimeMillis());
            sb.append("&params=");
            sb.append(URLEncoder.encode("{\"url\":\"" + string + "\"}", "UTF-8"));
            jov.k(this.f19722a, sb.toString());
        } catch (Throwable th) {
            tgh.c("OpenPopLayerImplementor", "execute error", th);
        }
        return true;
    }
}
