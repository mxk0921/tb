package com.taobao.android.live.plugin.proxy.notice;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.NoticeProxyX;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import tb.k2n;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class NoticeProxy extends k2n<INoticeProxy> implements INoticeProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "NoticeProxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final NoticeProxy f8758a = new NoticeProxy();

        static {
            t2o.a(806355205);
        }

        public static /* synthetic */ NoticeProxy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NoticeProxy) ipChange.ipc$dispatch("99c68ffd", new Object[0]);
            }
            return f8758a;
        }
    }

    static {
        t2o.a(806355203);
        t2o.a(806355199);
    }

    public static NoticeProxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NoticeProxy) ipChange.ipc$dispatch("57c3d057", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ Object ipc$super(NoticeProxy noticeProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/proxy/notice/NoticeProxy");
    }

    @Override // tb.k2n
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this});
        }
        return INoticeProxy.KEY;
    }

    @Override // tb.k2n
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this});
        }
        return "com.taobao.android.live.plugin.atype.flexalocal.proxy.NoticeProxyX";
    }

    @Override // com.taobao.android.live.plugin.proxy.notice.INoticeProxy
    public Class<? extends BaseFrame> getNoticeFrame3Class() {
        Class<? extends BaseFrame> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("cea56338", new Object[]{this});
        }
        INoticeProxy real = getReal();
        if (real != null) {
            cls = real.getNoticeFrame3Class();
        } else {
            cls = null;
        }
        FlexaLiveX.w("[NoticeProxy#getNoticeFrame3Class]  value: " + cls);
        return cls;
    }

    @Override // tb.k2n
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return "installLiveNoticePlugin";
    }

    @Override // tb.k2n
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this});
        }
        return "直播公告";
    }

    private NoticeProxy() {
        try {
            initAType();
        } catch (Throwable th) {
            FlexaLiveX.w("[NoticeProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // tb.k2n
    public <ProxyType extends INoticeProxy> ProxyType createLocalFromTpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProxyType) ((INoticeProxy) ipChange.ipc$dispatch("793700f0", new Object[]{this})) : new NoticeProxyX();
    }
}
