package com.taobao.android.live.plugin.proxy.kmp;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.CommentSendProxyX;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import tb.k2n;
import tb.t2o;
import tb.ux9;
import tb.z9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CommentSendProxy extends k2n<ICommentSendProxy> implements ICommentSendProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "CommentSendProxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final CommentSendProxy f8752a = new CommentSendProxy();

        static {
            t2o.a(806355178);
        }

        public static /* synthetic */ CommentSendProxy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CommentSendProxy) ipChange.ipc$dispatch("19956594", new Object[0]);
            }
            return f8752a;
        }
    }

    static {
        t2o.a(806355176);
        t2o.a(806355179);
    }

    public static CommentSendProxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CommentSendProxy) ipChange.ipc$dispatch("4d43f76e", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ Object ipc$super(CommentSendProxy commentSendProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/proxy/kmp/CommentSendProxy");
    }

    @Override // tb.k2n
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this});
        }
        return "CommentSendProxy";
    }

    @Override // tb.k2n
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this});
        }
        return "com.taobao.android.live.plugin.atype.flexalocal.proxy.CommentSendProxyX";
    }

    @Override // tb.k2n
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return "installCommentSendPlugin";
    }

    @Override // tb.k2n
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this});
        }
        return z9u.CLICK_COMMENT_SEND;
    }

    @Override // com.taobao.android.live.plugin.proxy.kmp.ICommentSendProxy
    public void sendCommentAction(Context context, ux9 ux9Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a27d7366", new Object[]{this, context, ux9Var, str});
            return;
        }
        ICommentSendProxy real = getReal();
        if (real != null) {
            real.sendCommentAction(context, ux9Var, str);
        }
        FlexaLiveX.w("[CommentSendProxy#CommentSend]");
    }

    private CommentSendProxy() {
        try {
            initAType();
        } catch (Throwable th) {
            FlexaLiveX.w("[CommentSendProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // tb.k2n
    public <ProxyType extends ICommentSendProxy> ProxyType createLocalFromTpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProxyType) ((ICommentSendProxy) ipChange.ipc$dispatch("8be56a45", new Object[]{this})) : new CommentSendProxyX();
    }
}
