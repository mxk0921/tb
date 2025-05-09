package com.taobao.message.lab.comfrm.aura;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.inner2.Command;
import com.taobao.message.lab.comfrm.inner2.Plugin;
import com.taobao.message.lab.comfrm.inner2.SourceManager;
import com.taobao.message.lab.comfrm.inner2.config.ConfigInfo;
import com.taobao.message.lab.comfrm.util.TraceUtil;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class DojoSourceService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final SourceManager mSourceManager;

    static {
        t2o.a(537919533);
    }

    public DojoSourceService(DojoContext dojoContext, Plugin plugin, ActionDispatcher actionDispatcher) {
        TraceUtil.beginSection("AURA-C-dojo.service.source");
        if (dojoContext != null) {
            ConfigInfo configInfo = dojoContext.configInfo;
            this.mSourceManager = new SourceManager(dojoContext.identifier, dojoContext.containerKey, configInfo.source, dojoContext.props, actionDispatcher, dojoContext.useRemote, dojoContext.classNamespace, plugin);
            TraceUtil.endTrace();
            return;
        }
        throw new IllegalArgumentException("NOT_FOUND|dojoContext");
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.mSourceManager.dispose();
        }
    }

    public void onExecute(Command command) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("323829c2", new Object[]{this, command});
        } else if (StdActions.COMMAND_INIT_SOURCE.equals(command.getName())) {
            this.mSourceManager.useSource();
        } else {
            this.mSourceManager.handle(command);
        }
    }
}
