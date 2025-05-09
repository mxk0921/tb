package tb;

import android.view.View;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.android.turbo.core.service.page.IPageBackLifecycle;
import com.taobao.android.turbo.model.PageModel;
import com.taobao.android.turbo.model.TabModel;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface xwc extends iae<PageModel> {
    int E1(String str);

    boolean K(IPageBackLifecycle.TriggerType triggerType);

    void L0();

    Map<String, Integer> T();

    wwc Y();

    View b1(String str);

    TabModel d0(int i);

    int getCurrentIndex();

    int getScrollState();

    void i(BaseOuterComponent.b bVar);

    void k(boolean z);

    boolean selectTab(int i);

    boolean selectTab(String str);
}
