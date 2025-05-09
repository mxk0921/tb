package com.taobao.android.live.plugin.proxy.projectscreen;

import android.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.btype.flexaremote.proxy.ProjectScreenProxyX;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import tb.k2n;
import tb.mvb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ProjectScreenProxy extends k2n<IProjectScreenProxy> implements IProjectScreenProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ORANGE_INSTALL_LIVE_PLUGIN = "installLiveProjectScreenPlugin";
    private static final String TAG = "ProjectScreenProxy";
    private static final String TRACK_NAME = "投屏";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final ProjectScreenProxy f8762a = new ProjectScreenProxy();

        static {
            t2o.a(806355222);
        }

        public static /* synthetic */ ProjectScreenProxy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ProjectScreenProxy) ipChange.ipc$dispatch("c3cf9c29", new Object[0]);
            }
            return f8762a;
        }
    }

    static {
        t2o.a(806355220);
        t2o.a(806355219);
    }

    public static ProjectScreenProxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProjectScreenProxy) ipChange.ipc$dispatch("34c03703", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ Object ipc$super(ProjectScreenProxy projectScreenProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/proxy/projectscreen/ProjectScreenProxy");
    }

    @Override // tb.k2n
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this});
        }
        return IProjectScreenProxy.KEY;
    }

    @Override // tb.k2n
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this});
        }
        return "com.taobao.android.live.plugin.btype.flexaremote.proxy.ProjectScreenProxyX";
    }

    @Override // tb.k2n
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return ORANGE_INSTALL_LIVE_PLUGIN;
    }

    @Override // com.taobao.android.live.plugin.proxy.projectscreen.IProjectScreenProxy
    public Pair<Long, mvb> getProjectScreenDXHandler() {
        Pair<Long, mvb> pair;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("89efe398", new Object[]{this});
        }
        IProjectScreenProxy real = getReal();
        if (real != null) {
            pair = real.getProjectScreenDXHandler();
        } else {
            pair = null;
        }
        FlexaLiveX.w("[ProjectScreenProxy#getProjectScreenDXHandler]: " + pair);
        return pair;
    }

    @Override // com.taobao.android.live.plugin.proxy.projectscreen.IProjectScreenProxy
    public Class<? extends BaseFrame> getProjectScreenIconFrameClass() {
        Class<? extends BaseFrame> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("3f2cbc27", new Object[]{this});
        }
        IProjectScreenProxy real = getReal();
        if (real != null) {
            cls = real.getProjectScreenIconFrameClass();
        } else {
            cls = null;
        }
        FlexaLiveX.w("[ProjectScreenProxy#getProjectScreenIconFrameClass]: " + cls);
        return cls;
    }

    @Override // com.taobao.android.live.plugin.proxy.projectscreen.IProjectScreenProxy
    public Class<? extends BaseFrame> getProjectScreenOptFrameClass() {
        Class<? extends BaseFrame> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("b39843e3", new Object[]{this});
        }
        IProjectScreenProxy real = getReal();
        if (real != null) {
            cls = real.getProjectScreenOptFrameClass();
        } else {
            cls = null;
        }
        FlexaLiveX.w("[ProjectScreenProxy#getProjectScreenOptFrameClass]: " + cls);
        return cls;
    }

    @Override // com.taobao.android.live.plugin.proxy.projectscreen.IProjectScreenProxy
    public Class<? extends BaseFrame> getProjectScreenSearchFrameClass() {
        Class<? extends BaseFrame> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("334fc156", new Object[]{this});
        }
        IProjectScreenProxy real = getReal();
        if (real != null) {
            cls = real.getProjectScreenSearchFrameClass();
        } else {
            cls = null;
        }
        FlexaLiveX.w("[ProjectScreenProxy#getProjectScreenFrameClass]: " + cls);
        return cls;
    }

    @Override // tb.k2n
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this});
        }
        return TRACK_NAME;
    }

    private ProjectScreenProxy() {
        try {
            initBType();
        } catch (Throwable th) {
            FlexaLiveX.w("[ProjectScreenProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // tb.k2n
    public <ProxyType extends IProjectScreenProxy> ProxyType createLocalFromTpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProxyType) ((IProjectScreenProxy) ipChange.ipc$dispatch("738f398c", new Object[]{this})) : new ProjectScreenProxyX();
    }
}
