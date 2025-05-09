package com.taobao.android.live.plugin.proxy.comments;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.CommentsProxyX;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.android.live.plugin.proxy.comments.ICommentsProxy;
import tb.k2n;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CommentsProxy extends k2n<ICommentsProxy> implements ICommentsProxy, ICommentsProxy.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "CommentsProxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final CommentsProxy f8743a = new CommentsProxy();

        static {
            t2o.a(806355131);
        }

        public static /* synthetic */ CommentsProxy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CommentsProxy) ipChange.ipc$dispatch("7458e53d", new Object[0]);
            }
            return f8743a;
        }
    }

    static {
        t2o.a(806355129);
        t2o.a(806355132);
        t2o.a(806355133);
    }

    public static CommentsProxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CommentsProxy) ipChange.ipc$dispatch("76aa6897", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ Object ipc$super(CommentsProxy commentsProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/proxy/comments/CommentsProxy");
    }

    @Override // com.taobao.android.live.plugin.proxy.comments.ICommentsProxy
    public Class<? extends BaseFrame> getChatFrame3Class() {
        Class<? extends BaseFrame> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("9edde138", new Object[]{this});
        }
        ICommentsProxy real = getReal();
        if (real != null) {
            cls = real.getChatFrame3Class();
        } else {
            cls = null;
        }
        FlexaLiveX.w("[CommentsProxy#getChatFrame3Class]  value: " + cls);
        return cls;
    }

    @Override // tb.k2n
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this});
        }
        return ICommentsProxy.KEY;
    }

    @Override // com.taobao.android.live.plugin.proxy.comments.ICommentsProxy
    public Class<? extends BaseFrame> getImportantEventFrameClass() {
        Class<? extends BaseFrame> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("fc112bed", new Object[]{this});
        }
        ICommentsProxy real = getReal();
        if (real != null) {
            cls = real.getImportantEventFrameClass();
        } else {
            cls = null;
        }
        FlexaLiveX.w("[CommentsProxy#getImportantEventFrameClass]  value: " + cls);
        return cls;
    }

    @Override // com.taobao.android.live.plugin.proxy.comments.ICommentsProxy.b
    public Long getImportantMessageIntervalTime() {
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("2197bec1", new Object[]{this});
        }
        ICommentsProxy real = getReal();
        if (real != null) {
            l = ((ICommentsProxy.b) real).getImportantMessageIntervalTime();
        } else {
            l = null;
        }
        FlexaLiveX.w("[CommentsProxy#getImportantMessageIntervalTime]  value: " + l);
        return l;
    }

    @Override // com.taobao.android.live.plugin.proxy.comments.ICommentsProxy.b
    public Long getImportantMessageTimeoutTime() {
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("eacdcafb", new Object[]{this});
        }
        ICommentsProxy real = getReal();
        if (real != null) {
            l = ((ICommentsProxy.b) real).getImportantMessageTimeoutTime();
        } else {
            l = null;
        }
        FlexaLiveX.w("[CommentsProxy#getImportantMessageTimeoutTime]  value: " + l);
        return l;
    }

    @Override // tb.k2n
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this});
        }
        return "com.taobao.android.live.plugin.atype.flexalocal.proxy.CommentsProxyX";
    }

    @Override // tb.k2n
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return "installLiveCommentsPlugin";
    }

    @Override // tb.k2n
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this});
        }
        return "评论区域/重要消息通知漂条";
    }

    private CommentsProxy() {
        try {
            initAType();
        } catch (Throwable th) {
            FlexaLiveX.w("[CommentsProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // tb.k2n
    public <ProxyType extends ICommentsProxy> ProxyType createLocalFromTpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProxyType) ((ICommentsProxy) ipChange.ipc$dispatch("22a1f928", new Object[]{this})) : new CommentsProxyX();
    }
}
