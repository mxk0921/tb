package tb;

import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.android.turbo.core.service.page.IPageBackLifecycle;
import com.taobao.android.turbo.model.DrawerModel;
import com.taobao.android.turbo.model.PageModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface c1c extends iae<PageModel> {
    boolean D1();

    DrawerModel.DrawerGravity E(String str);

    boolean K(IPageBackLifecycle.TriggerType triggerType);

    boolean S0();

    boolean V(DrawerModel.DrawerGravity drawerGravity);

    void V0();

    b1c Y();

    void i(BaseOuterComponent.b bVar);

    void k(boolean z);

    boolean n1();

    DrawerModel.DrawerGravity w0();

    DrawerModel y0(DrawerModel.DrawerGravity drawerGravity);
}
