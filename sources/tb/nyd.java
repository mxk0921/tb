package tb;

import com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface nyd {
    void a(Map<String, ? extends Object> map);

    Map<String, String> b(Map<String, ? extends Object> map);

    int c();

    void d(Map<String, ? extends Object> map);

    List<Map<String, Object>> e();

    void f(String str);

    void g(int i);

    int getItemCount();

    Map<String, Object> h();

    void i(g1a<? super String, xhv> g1aVar);

    void j(String str, String str2);

    void k(boolean z);

    void l(Map<String, ? extends Object> map);

    void m(int i);

    void n(g1a<? super String, xhv> g1aVar);

    void o(g1a<? super List<z3t>, xhv> g1aVar);

    Map<String, Object> p();

    int q();

    void r(g1a<? super TaoLiveKtSwitchModel, xhv> g1aVar);

    void remove(int i);

    void requestRecommendModel(TaoLiveKtSwitchModel taoLiveKtSwitchModel, String str, Map<String, ? extends Object> map);

    void s(g1a<? super TaoLiveKtSwitchModel, xhv> g1aVar);

    void stopManager();

    void t(int i);
}
