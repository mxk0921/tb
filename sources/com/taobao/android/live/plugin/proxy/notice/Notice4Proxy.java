package com.taobao.android.live.plugin.proxy.notice;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.btype.flexaremote.proxy.Notice4ProxyX;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import tb.k2n;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class Notice4Proxy extends k2n<INotice4Proxy> implements INotice4Proxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "Notice4Proxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final Notice4Proxy f8757a = new Notice4Proxy();

        static {
            t2o.a(806355202);
        }

        public static /* synthetic */ Notice4Proxy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Notice4Proxy) ipChange.ipc$dispatch("9bfe6291", new Object[0]);
            }
            return f8757a;
        }
    }

    static {
        t2o.a(806355200);
        t2o.a(806355198);
    }

    public static Notice4Proxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Notice4Proxy) ipChange.ipc$dispatch("9da92d77", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ Object ipc$super(Notice4Proxy notice4Proxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/proxy/notice/Notice4Proxy");
    }

    @Override // tb.k2n
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this});
        }
        return INotice4Proxy.KEY;
    }

    @Override // tb.k2n
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this});
        }
        return "com.taobao.android.live.plugin.btype.flexaremote.proxy.Notice4ProxyX";
    }

    @Override // com.taobao.android.live.plugin.proxy.notice.INotice4Proxy
    public Class<? extends BaseFrame> getNoticeFrame4Class() {
        Class<? extends BaseFrame> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("d07eb657", new Object[]{this});
        }
        INotice4Proxy real = getReal();
        if (real != null) {
            cls = real.getNoticeFrame4Class();
        } else {
            cls = null;
        }
        FlexaLiveX.w("[Notice4Proxy#getNoticeFrame4Class]  value: " + cls);
        return cls;
    }

    @Override // tb.k2n
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return "installLiveNotice4Plugin";
    }

    @Override // tb.k2n
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this});
        }
        return "直播公告4";
    }

    private Notice4Proxy() {
        try {
            initBType();
        } catch (Throwable th) {
            FlexaLiveX.w("[Notice4Proxy<init>] error: " + th.getMessage());
        }
    }

    @Override // tb.k2n
    public <ProxyType extends INotice4Proxy> ProxyType createLocalFromTpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProxyType) ((INotice4Proxy) ipChange.ipc$dispatch("aa9c0ffe", new Object[]{this})) : new Notice4ProxyX();
    }
}
