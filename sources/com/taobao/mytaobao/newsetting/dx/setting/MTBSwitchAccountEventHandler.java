package com.taobao.mytaobao.newsetting.dx.setting;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.inner2.CommandHandler;
import com.taobao.message.lab.comfrm.inner2.EventHandler;
import com.taobao.message.lab.comfrm.inner2.PageService;
import com.taobao.message.lab.comfrm.inner2.ServiceProvider;
import com.taobao.tao.Globals;
import tb.bwu;
import tb.ckf;
import tb.gl6;
import tb.t2o;
import tb.uuu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MTBSwitchAccountEventHandler implements EventHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(745537868);
        t2o.a(537919601);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.EventHandler
    public void handle(Action action, ActionDispatcher actionDispatcher, CommandHandler commandHandler, final ServiceProvider serviceProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b707af03", new Object[]{this, action, actionDispatcher, commandHandler, serviceProvider});
        } else if (!bwu.b()) {
            gl6.Companion.d("Page_TaobaoLiveWatch", "2101", "Page_MYTBSettingVC_切换账户", "spm=a2141.20998086.1.12");
            uuu.a(new Runnable() { // from class: com.taobao.mytaobao.newsetting.dx.setting.MTBSwitchAccountEventHandler$handle$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    PageService pageService;
                    final Activity activity;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ServiceProvider serviceProvider2 = ServiceProvider.this;
                    if (serviceProvider2 != null && (pageService = (PageService) serviceProvider2.service(PageService.class)) != null && (activity = pageService.getActivity()) != null) {
                        LoginBroadcastHelper.registerLoginReceiver(Globals.getApplication(), new BroadcastReceiver() { // from class: com.taobao.mytaobao.newsetting.dx.setting.MTBSwitchAccountEventHandler$handle$1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                                str.hashCode();
                                int hashCode = str.hashCode();
                                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/newsetting/dx/setting/MTBSwitchAccountEventHandler$handle$1$1");
                            }

                            @Override // android.content.BroadcastReceiver
                            public void onReceive(Context context, Intent intent) {
                                String action2;
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                                    return;
                                }
                                ckf.h(context, "context");
                                if (intent != null && (action2 = intent.getAction()) != null) {
                                    if (action2.length() <= 0) {
                                        action2 = null;
                                    }
                                    if (action2 != null && LoginAction.valueOf(action2) == LoginAction.NOTIFY_LOGOUT) {
                                        activity.finish();
                                        LoginBroadcastHelper.unregisterLoginReceiver(Globals.getApplication(), this);
                                    }
                                }
                            }
                        });
                        Login.openMultiAccountPage();
                    }
                }
            });
        }
    }
}
