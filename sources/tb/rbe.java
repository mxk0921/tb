package tb;

import android.taobao.windvane.extra.uc.WVUCWebView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import com.uc.webview.export.WebResourceRequest;
import com.uc.webview.export.WebResourceResponse;
import java.util.List;
import java.util.Map;
import tb.ace;
import tb.z5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface rbe extends z5d, pbe {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(850395165);
        }

        public static void a(rbe rbeVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb94346a", new Object[]{rbeVar});
                return;
            }
            ckf.g(rbeVar, "this");
            z5d.a.a(rbeVar);
        }

        public static void b(rbe rbeVar, ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3bf47026", new Object[]{rbeVar, iTMSPage});
                return;
            }
            ckf.g(rbeVar, "this");
            ckf.g(iTMSPage, "page");
            z5d.a.b(rbeVar, iTMSPage);
        }

        public static void c(rbe rbeVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d13b5d22", new Object[]{rbeVar});
                return;
            }
            ckf.g(rbeVar, "this");
            z5d.a.c(rbeVar);
        }
    }

    fu F0();

    kzw I();

    cc8 U();

    void W(WVUCWebView wVUCWebView);

    Map<String, Long> d1();

    jzw getGestureListener();

    izw o1();

    void setMegaHandler(ace.a aVar);

    WebResourceResponse t(WebResourceRequest webResourceRequest);

    Map<String, Object> t0();

    void y(String str);

    void z(sbe sbeVar);

    List<String> z0();
}
