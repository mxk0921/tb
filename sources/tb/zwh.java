package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class zwh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481297621);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final void a(com.taobao.android.weex_framework.a aVar, String str, String str2, JSONObject jSONObject, Map<String, ? extends Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("471ace49", new Object[]{this, aVar, str, str2, jSONObject, map});
            } else if (aVar != null) {
                try {
                    aVar.initWithURL(Uri.parse(str));
                    if (!TextUtils.equals(str, str2)) {
                        aVar.addInstanceEnv("bundleUrl", str2);
                    }
                    aVar.getMonitorInfo().t(str);
                    aVar.getMonitorInfo().q(str2);
                    aVar.render(jSONObject, map);
                } catch (Exception unused) {
                    aVar.renderByUrl(str, str2, jSONObject, map);
                }
            }
        }

        public a() {
        }
    }

    static {
        t2o.a(481297620);
    }

    @JvmStatic
    public static final void a(com.taobao.android.weex_framework.a aVar, String str, String str2, JSONObject jSONObject, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("471ace49", new Object[]{aVar, str, str2, jSONObject, map});
        } else {
            Companion.a(aVar, str, str2, jSONObject, map);
        }
    }
}
