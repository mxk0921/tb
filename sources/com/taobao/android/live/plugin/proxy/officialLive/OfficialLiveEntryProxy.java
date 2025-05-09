package com.taobao.android.live.plugin.proxy.officialLive;

import android.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.OfficialLiveEntryProxyX;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import tb.k2n;
import tb.mvb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class OfficialLiveEntryProxy extends k2n<IOfficialLiveEntryProxy> implements IOfficialLiveEntryProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ORANGE_INSTALL_LIVE_PLUGIN = "installLiveOfficialLiveEntryPlugin";
    private static final String TAG = "OfficialLiveEntryProxy";
    private static final String TRACK_NAME = "官方台节目单";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final OfficialLiveEntryProxy f8759a = new OfficialLiveEntryProxy();

        static {
            t2o.a(806355209);
        }

        public static /* synthetic */ OfficialLiveEntryProxy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (OfficialLiveEntryProxy) ipChange.ipc$dispatch("b521548f", new Object[0]);
            }
            return f8759a;
        }
    }

    static {
        t2o.a(806355207);
        t2o.a(806355206);
    }

    public static OfficialLiveEntryProxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OfficialLiveEntryProxy) ipChange.ipc$dispatch("a4959375", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ Object ipc$super(OfficialLiveEntryProxy officialLiveEntryProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/proxy/officialLive/OfficialLiveEntryProxy");
    }

    @Override // tb.k2n
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this});
        }
        return IOfficialLiveEntryProxy.KEY;
    }

    @Override // tb.k2n
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this});
        }
        return "com.taobao.android.live.plugin.atype.flexalocal.proxy.OfficialLiveEntryProxyX";
    }

    @Override // com.taobao.android.live.plugin.proxy.officialLive.IOfficialLiveEntryProxy
    public Pair<Long, mvb> getOfficialLiveEntryDXHandler() {
        Pair<Long, mvb> pair;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("58681682", new Object[]{this});
        }
        IOfficialLiveEntryProxy real = getReal();
        if (real != null) {
            pair = real.getOfficialLiveEntryDXHandler();
        } else {
            pair = null;
        }
        FlexaLiveX.w("[OfficialLiveEntryProxy#getOfficialLiveEntryDXHandler]: " + pair);
        return pair;
    }

    @Override // com.taobao.android.live.plugin.proxy.officialLive.IOfficialLiveEntryProxy
    public Class<? extends BaseFrame> getOfficialLiveEntryFrameClass() {
        Class<? extends BaseFrame> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("635734a4", new Object[]{this});
        }
        IOfficialLiveEntryProxy real = getReal();
        if (real != null) {
            cls = real.getOfficialLiveEntryFrameClass();
        } else {
            cls = null;
        }
        FlexaLiveX.w("[OfficialLiveEntryProxy#getOfficialLiveEntryFrameClass]: " + cls);
        return cls;
    }

    @Override // tb.k2n
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return ORANGE_INSTALL_LIVE_PLUGIN;
    }

    @Override // tb.k2n
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this});
        }
        return TRACK_NAME;
    }

    private OfficialLiveEntryProxy() {
        try {
            initAType();
        } catch (Throwable th) {
            FlexaLiveX.w("[OfficialLiveEntryProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // tb.k2n
    public <ProxyType extends IOfficialLiveEntryProxy> ProxyType createLocalFromTpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProxyType) ((IOfficialLiveEntryProxy) ipChange.ipc$dispatch("6198ee5e", new Object[]{this})) : new OfficialLiveEntryProxyX();
    }
}
