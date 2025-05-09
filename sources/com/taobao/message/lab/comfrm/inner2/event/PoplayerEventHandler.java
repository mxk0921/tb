package com.taobao.message.lab.comfrm.inner2.event;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.inner2.CommandHandler;
import com.taobao.message.lab.comfrm.inner2.EventHandler;
import com.taobao.message.lab.comfrm.inner2.ServiceProvider;
import com.taobao.message.lab.comfrm.inner2.WeakDependence;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PoplayerEventHandler implements EventHandler, WeakDependence {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(537919705);
        t2o.a(537919601);
        t2o.a(537919674);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.EventHandler
    public void handle(Action action, ActionDispatcher actionDispatcher, CommandHandler commandHandler, ServiceProvider serviceProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b707af03", new Object[]{this, action, actionDispatcher, commandHandler, serviceProvider});
        }
    }
}
