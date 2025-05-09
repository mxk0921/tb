package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.android.turbo.model.DrawerModel;
import com.taobao.android.turbo.model.TabModel;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface kxd extends vod {
    void A(boolean z, boolean z2);

    void B(rjb rjbVar);

    Map<String, String> C(String str);

    boolean D(String str, String str2);

    DrawerModel.DrawerGravity E(String str);

    boolean J(String str, Map<String, String> map);

    void L(rjb rjbVar);

    void M(ieb iebVar);

    boolean N();

    boolean O();

    boolean P(String str, String str2, boolean z);

    void Q(Context context, String str);

    boolean S(String str);

    Map<String, Integer> T();

    boolean V(DrawerModel.DrawerGravity drawerGravity);

    int W();

    TabModel X(String str);

    boolean Y();

    void Z(boolean z);

    void a();

    void b(String str);

    boolean b();

    void d(a1c a1cVar);

    void e(d1c d1cVar);

    void f(JSONObject jSONObject);

    boolean hideBackButton();

    void p(a1c a1cVar);

    void r(ieb iebVar);

    boolean selectTab(String str);

    boolean showBackButton();

    void t(byd bydVar);

    void u(BaseOuterComponent.b bVar);

    Map<String, String> w(String str);

    void x(k7d k7dVar);

    int y();

    boolean z();
}
