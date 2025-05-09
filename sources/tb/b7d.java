package tb;

import android.view.ViewGroup;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.android.turbo.core.service.page.IPageBackLifecycle;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface b7d extends sod, p6d, r6d, IPageBackLifecycle, jeb, ieb, l7d, e7d {
    Map<String, String> R();

    int getHeight();

    int getPageState();

    ViewGroup getView();

    void u(BaseOuterComponent.b bVar);

    void w1(String str, Map<String, String> map);
}
