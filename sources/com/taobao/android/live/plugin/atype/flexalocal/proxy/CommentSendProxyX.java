package com.taobao.android.live.plugin.atype.flexalocal.proxy;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.kmp.ICommentSendProxy;
import tb.g44;
import tb.t2o;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CommentSendProxyX implements ICommentSendProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699600);
        t2o.a(806355179);
    }

    @Override // com.taobao.android.live.plugin.proxy.kmp.ICommentSendProxy
    public void sendCommentAction(Context context, ux9 ux9Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a27d7366", new Object[]{this, context, ux9Var, str});
        } else {
            new g44(context, ux9Var).g("follow");
        }
    }
}
