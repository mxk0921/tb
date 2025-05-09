package tb;

import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.ne3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class xbx {
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(478151060);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final JSONObject a(JSONObject jSONObject) {
            boolean z;
            Exception e;
            boolean z2 = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("ad3e2567", new Object[]{this, jSONObject});
            }
            ckf.g(jSONObject, "params");
            List<String> j = h0r.j();
            long currentTimeMillis = System.currentTimeMillis();
            try {
                z = false;
                for (String str : j) {
                    try {
                        if (!z2) {
                            z2 = rcx.b(str);
                        }
                        if (!z) {
                            z = rcx.c(str);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        String message = e.getMessage();
                        ckf.d(message);
                        ub3.g("widgetGetInstalledError", message);
                        ne3.c.h(ne3.Companion, c9x.TAG, "GetWidgetParams", System.currentTimeMillis() - currentTimeMillis, 0.0f, 8, null);
                        jSONObject.put((JSONObject) RequestConfig.IS_SUPPORT_WIDGET, String.valueOf(z2));
                        jSONObject.put((JSONObject) RequestConfig.IS_WIDGET_INSTALLED, String.valueOf(z));
                        return jSONObject;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                z = false;
            }
            ne3.c.h(ne3.Companion, c9x.TAG, "GetWidgetParams", System.currentTimeMillis() - currentTimeMillis, 0.0f, 8, null);
            jSONObject.put((JSONObject) RequestConfig.IS_SUPPORT_WIDGET, String.valueOf(z2));
            jSONObject.put((JSONObject) RequestConfig.IS_WIDGET_INSTALLED, String.valueOf(z));
            return jSONObject;
        }
    }

    static {
        t2o.a(478151059);
    }
}
