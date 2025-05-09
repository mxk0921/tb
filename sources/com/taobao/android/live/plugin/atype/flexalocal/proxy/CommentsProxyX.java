package com.taobao.android.live.plugin.atype.flexalocal.proxy;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.ChatFrameKMP;
import com.taobao.android.live.plugin.atype.flexalocal.comments.notify.ImportantEventFrame;
import com.taobao.android.live.plugin.proxy.comments.ICommentsProxy;
import tb.dse;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CommentsProxyX implements ICommentsProxy, ICommentsProxy.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699601);
        t2o.a(806355132);
        t2o.a(806355133);
    }

    @Override // com.taobao.android.live.plugin.proxy.comments.ICommentsProxy
    public Class<? extends BaseFrame> getChatFrame3Class() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("9edde138", new Object[]{this});
        }
        return ChatFrameKMP.class;
    }

    @Override // com.taobao.android.live.plugin.proxy.comments.ICommentsProxy
    public Class<? extends BaseFrame> getImportantEventFrameClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("fc112bed", new Object[]{this});
        }
        return ImportantEventFrame.class;
    }

    @Override // com.taobao.android.live.plugin.proxy.comments.ICommentsProxy.b
    public Long getImportantMessageIntervalTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("2197bec1", new Object[]{this});
        }
        return new dse().getImportantMessageIntervalTime();
    }

    @Override // com.taobao.android.live.plugin.proxy.comments.ICommentsProxy.b
    public Long getImportantMessageTimeoutTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("eacdcafb", new Object[]{this});
        }
        return new dse().getImportantMessageTimeoutTime();
    }
}
