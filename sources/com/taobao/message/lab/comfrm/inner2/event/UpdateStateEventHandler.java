package com.taobao.message.lab.comfrm.inner2.event;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.aura.INeedContainer;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.ext.ActionExtKt;
import com.taobao.message.lab.comfrm.inner2.CommandHandler;
import com.taobao.message.lab.comfrm.inner2.EventHandler;
import com.taobao.message.lab.comfrm.inner2.PageService;
import com.taobao.message.lab.comfrm.inner2.ServiceProvider;
import com.taobao.message.uikit.util.ApplicationUtil;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class UpdateStateEventHandler implements EventHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(537919706);
        t2o.a(537919601);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.EventHandler
    public void handle(Action action, ActionDispatcher actionDispatcher, CommandHandler commandHandler, ServiceProvider serviceProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b707af03", new Object[]{this, action, actionDispatcher, commandHandler, serviceProvider});
            return;
        }
        Event event = (Event) action.getContext().get("event");
        if (event != null) {
            String stringFromData = ActionExtKt.getStringFromData(action, "updateActionName");
            if (TextUtils.isEmpty(stringFromData)) {
                stringFromData = event.getName();
            }
            Action build = new Action.Build(stringFromData).data(event.getData()).context(event.getContext()).build();
            if (!"1".equals(ActionExtKt.getStringFromData(action, "useContainerUpdate"))) {
                actionDispatcher.dispatch(build);
            } else if (((PageService) serviceProvider.service(PageService.class)).getActivity() instanceof INeedContainer) {
                INeedContainer iNeedContainer = (INeedContainer) ((PageService) serviceProvider.service(PageService.class)).getActivity();
                if (iNeedContainer.getContainer() != null) {
                    iNeedContainer.getContainer().updateState(build);
                }
            } else if (ApplicationUtil.isDebug()) {
                throw new RuntimeException();
            }
        }
    }
}
