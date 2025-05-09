package tb;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface fsb {
    void a(String str);

    void b(List<IDMComponent> list);

    String c();

    boolean d();

    List<IDMComponent> e(String str);

    void f(String str);

    void g(ptd ptdVar);

    String getBizName();

    IDMComponent getComponentByName(String str);

    List<IDMComponent> getComponents();

    IDMComponent getRootComponent();

    List<o58> h();

    JSONObject i();
}
