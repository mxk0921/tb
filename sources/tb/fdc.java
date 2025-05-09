package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSONObject;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface fdc {
    void A(IHomeSubTabController iHomeSubTabController, Map<String, String> map);

    void B(IHomeSubTabController iHomeSubTabController, boolean z);

    List<String> C(String str);

    float D(IHomeSubTabController iHomeSubTabController);

    JSONObject E(IHomeSubTabController iHomeSubTabController);

    void F(IHomeSubTabController iHomeSubTabController);

    JSONObject G(IHomeSubTabController iHomeSubTabController);

    void H(IHomeSubTabController iHomeSubTabController, View view);

    void I(IHomeSubTabController iHomeSubTabController, String str);

    int J(IHomeSubTabController iHomeSubTabController);

    int K(IHomeSubTabController iHomeSubTabController);

    void L(IHomeSubTabController iHomeSubTabController, String str);

    Fragment a();

    int d();

    String e();

    Context f();

    void g(zve zveVar);

    z9c getGlobalExtModel();

    View h(String str);

    boolean isAdaptHudScreen();

    boolean j(View view, ViewGroup.LayoutParams layoutParams);

    Map<String, Integer> k(String str, String str2);

    String l();

    boolean m();

    boolean n();

    String q();

    boolean r(IHomeSubTabController iHomeSubTabController);

    void s(IHomeSubTabController iHomeSubTabController, boolean z);

    void t(IHomeSubTabController iHomeSubTabController, JSONObject jSONObject);

    void u(IHomeSubTabController iHomeSubTabController);

    JSONObject v(IHomeSubTabController iHomeSubTabController);

    void w(IHomeSubTabController iHomeSubTabController, boolean z);

    JSONObject x(IHomeSubTabController iHomeSubTabController);

    void y(IHomeSubTabController iHomeSubTabController, boolean z);

    void z(IHomeSubTabController iHomeSubTabController);
}
