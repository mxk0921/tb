package tb;

import android.app.Activity;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.inner2.CommandHandler;
import com.taobao.message.lab.comfrm.inner2.EventHandler;
import com.taobao.message.lab.comfrm.inner2.PageService;
import com.taobao.message.lab.comfrm.inner2.ServiceProvider;
import com.taobao.mytaobao.base.MtbGlobalEnv;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class fm6 implements EventHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(745537850);
        t2o.a(537919601);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.EventHandler
    public void handle(Action action, ActionDispatcher actionDispatcher, CommandHandler commandHandler, ServiceProvider serviceProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b707af03", new Object[]{this, action, actionDispatcher, commandHandler, serviceProvider});
        } else if (!bwu.b()) {
            uuu.a(new a(serviceProvider));
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ServiceProvider f19404a;

        public a(ServiceProvider serviceProvider) {
            this.f19404a = serviceProvider;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PageService pageService;
            Activity activity;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ServiceProvider serviceProvider = this.f19404a;
            if (serviceProvider != null && (pageService = (PageService) serviceProvider.service(PageService.class)) != null && (activity = pageService.getActivity()) != null && !MtbGlobalEnv.t()) {
                if (!ih4.a("trialVersionUpdate", true) || Localization.o()) {
                    pkv.getInstance(activity).update(false);
                } else {
                    Nav.from(activity).toUri(qh4.e("trialVersionUpdateUrl", "https://web.m.taobao.com/app/TBVirtualInteractionClient/AppUpdate/update"));
                }
            }
        }
    }
}
