package tb;

import android.content.Context;
import android.net.Uri;
import android.taobao.windvane.webview.IWVWebView;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface zlc {
    boolean A(Map<String, String> map);

    String B();

    boolean C(Map<String, String> map);

    boolean D();

    Map E(Uri uri);

    boolean F(IInteractiveProxy.h hVar, IWVWebView iWVWebView, Map<String, String> map, inr inrVar);

    boolean G(IInteractiveProxy.h hVar, Map<String, String> map);

    @Deprecated
    boolean H(IInteractiveProxy.h hVar, IWVWebView iWVWebView, Map<String, String> map);

    boolean I(Map<String, String> map);

    boolean J(Map<String, String> map);

    void K(IWVWebView iWVWebView);

    String L();

    boolean M(IInteractiveProxy.h hVar, IWVWebView iWVWebView, JSONObject jSONObject);

    boolean N(Map<String, String> map);

    org.json.JSONObject O(Context context);

    void P(inr inrVar, Map<String, String> map);

    boolean Q(Map<String, String> map);

    boolean R(IInteractiveProxy.h hVar, IWVWebView iWVWebView);

    boolean S(Map<String, String> map);

    boolean T(Map<String, String> map);

    boolean U(Map<String, String> map);

    boolean V(Map<String, String> map);

    boolean a(Map<String, String> map);

    boolean b(IInteractiveProxy.h hVar, IWVWebView iWVWebView);

    String c();

    boolean d();

    void destroy();

    boolean e(Map<String, String> map);

    boolean f(Map<String, String> map);

    boolean g(Map<String, String> map);

    long getCurrentPosition();

    boolean h(Map<String, String> map);

    boolean i();

    boolean j(Map<String, String> map);

    String k();

    boolean l();

    boolean m(Map<String, String> map);

    boolean n();

    boolean o();

    boolean p(IInteractiveProxy.h hVar, Map<String, String> map);

    boolean pauseVideo();

    boolean q();

    boolean r(Map<String, String> map);

    boolean s(Map<String, String> map);

    boolean t(Map<String, String> map);

    boolean u();

    boolean v(Map<String, String> map);

    boolean w(Map<String, String> map);

    String x();

    void y(inr inrVar);

    void z(inr inrVar, Map<String, Object> map);
}
