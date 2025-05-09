package tb;

import com.alibaba.ariver.resource.api.models.PluginModel;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t4c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface c9d extends t4c {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(843055258);
        }

        public static void a(c9d c9dVar, bbs bbsVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0db1078", new Object[]{c9dVar, bbsVar});
                return;
            }
            ckf.g(c9dVar, "this");
            ckf.g(bbsVar, "instance");
            t4c.a.a(c9dVar, bbsVar);
        }

        public static void b(c9d c9dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a7efc03", new Object[]{c9dVar});
                return;
            }
            ckf.g(c9dVar, "this");
            t4c.a.b(c9dVar);
        }
    }

    String A(PluginModel pluginModel);

    JSONObject j();

    String l();

    String m0(String str);

    JSONObject o();

    String p0();

    JSONObject x(PluginModel pluginModel);
}
