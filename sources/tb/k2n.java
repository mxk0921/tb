package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.bl9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class k2n<IProxyType> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int A_TYPE = 1;
    private static final int B_TYPE = 2;
    private AtomicBoolean installPluginOnce;
    public IProxyType local;
    public boolean needLocal = true;
    public IProxyType remote;
    private static final AtomicBoolean A_TYPE_ONCE = new AtomicBoolean(false);
    private static final AtomicBoolean B_TYPE_ONCE = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements bl9.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.bl9.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dbd6452", new Object[]{this});
            } else {
                k2n.access$000(k2n.this, 1);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements bl9.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.bl9.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bef331", new Object[]{this});
            } else {
                k2n.access$000(k2n.this, 2);
            }
        }
    }

    static {
        t2o.a(806355113);
    }

    public static /* synthetic */ boolean access$000(k2n k2nVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c80f14b4", new Object[]{k2nVar, new Integer(i)})).booleanValue();
        }
        return k2nVar.refreshRemote(i);
    }

    public static void loadAType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6d37ac6", new Object[]{str});
        } else if (!A_TYPE_ONCE.compareAndSet(false, true)) {
        } else {
            if (FlexaLiveX.o().k()) {
                try {
                    bcq.a().g(com.taobao.appbundle.a.Companion.a().d(), false, FlexaLiveX.ATYPE, FlexaLiveX.TAOLIVE_HOMEPAGE);
                    FlexaLiveX.u();
                    FlexaLiveX.w("[" + str + "<init>] loadAType, app bundle load");
                } catch (Throwable th) {
                    FlexaLiveX.w("[" + str + "<init>] loadAType, app bundle load error: " + th.getMessage());
                }
            } else {
                FlexaLiveX.w("[" + str + "<init>] loadAType, app bundle load error: enableSyncLoadRemoteModule false");
            }
        }
    }

    private void tryToRefreshBTypePlugin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdea7af1", new Object[]{this});
            return;
        }
        String simpleName = getClass().getSimpleName();
        if (FlexaLiveX.l()) {
            FlexaLiveX.w("[" + simpleName + "<tryToRefreshBTypePlugin>] force local, return");
            return;
        }
        try {
            FlexaLiveX.x(bl9.g().b(), getTrackName(), "tryToRefresh");
            IProxyType iproxytype = (IProxyType) bl9.g().e().get(getIProxyKey());
            if (iproxytype != null) {
                this.remote = iproxytype;
                FlexaLiveX.w("[" + simpleName + "#tryToRefreshBTypePlugin] use remote, remote: " + this.remote);
            } else {
                FlexaLiveX.w("[" + simpleName + "#tryToRefreshBTypePlugin] use local, remote: null");
                if (!refreshRemote(2)) {
                    bl9.g().i(new b());
                }
            }
        } catch (Throwable th) {
            FlexaLiveX.w("[" + simpleName + "#tryToRefreshPlugin] error: " + th);
        }
    }

    public <ProxyType extends IProxyType> ProxyType createLocal() {
        ProxyType proxytype;
        long nanoTime = System.nanoTime();
        if (!d4s.e("enableCreateLocalFromTpl", true) || !d4s.a("taolive", "TplCreateLocal", "enableTpl", false)) {
            o3s.d("ProxyX", "createLocalFromOrigin" + getLocalClassName());
            TextUtils.isEmpty(getLocalClassName());
            try {
                proxytype = (ProxyType) Class.forName(getLocalClassName()).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused) {
                proxytype = null;
            }
        } else {
            o3s.d("ProxyX", "createLocalFromTpl" + getLocalClassName());
            proxytype = (ProxyType) createLocalFromTpl();
        }
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.Name.INTERVAL, String.valueOf(System.nanoTime() - nanoTime));
        hashMap.put("className", getLocalClassName());
        if (d4s.e("enableTplCommitTint", false) && v2s.o().s() != null) {
            v2s.o().s().a("createTpl", "Page_TaobaoLive", hashMap);
        }
        return proxytype;
    }

    public abstract <ProxyType extends IProxyType> ProxyType createLocalFromTpl();

    public abstract String getIProxyKey();

    public abstract String getLocalClassName();

    public abstract String getOrangeKey();

    public IProxyType getReal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IProxyType) ipChange.ipc$dispatch("bd6363f7", new Object[]{this});
        }
        if (this.needLocal) {
            IProxyType iproxytype = this.local;
            if (iproxytype != null) {
                return iproxytype;
            }
            FlexaLiveX.u();
            return this.remote;
        } else if (this.remote == null) {
            return this.local;
        } else {
            FlexaLiveX.u();
            return this.remote;
        }
    }

    public abstract String getTrackName();

    public void initAType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65ffc712", new Object[]{this});
            return;
        }
        this.installPluginOnce = new AtomicBoolean(false);
        this.local = (IProxyType) createLocal();
        String simpleName = getClass().getSimpleName();
        if (FlexaLiveX.D(getOrangeKey())) {
            this.needLocal = true;
            FlexaLiveX.w("[" + simpleName + "<init>] force local, return");
            return;
        }
        FlexaLiveX.w("[" + simpleName + "<init>] try to use remote");
        if (this.installPluginOnce.compareAndSet(false, true)) {
            FlexaLiveX.w("[" + simpleName + "<init>]  Installing");
            loadAType(simpleName);
            IProxyType iproxytype = (IProxyType) bl9.g().d().get(getIProxyKey());
            if (iproxytype != null) {
                this.needLocal = false;
                this.remote = iproxytype;
                FlexaLiveX.w("[" + simpleName + "<init>] use remote, remote: " + this.remote);
            } else {
                this.needLocal = true;
                FlexaLiveX.w("[" + simpleName + "<init>] use local, remote: null");
                if (!refreshRemote(1)) {
                    bl9.g().h(new a());
                }
            }
            FlexaLiveX.x(bl9.g().a(), getTrackName(), "init");
            return;
        }
        FlexaLiveX.w("[" + simpleName + "<init>]  Installed");
    }

    public void initBType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa443613", new Object[]{this});
            return;
        }
        this.installPluginOnce = new AtomicBoolean(false);
        String simpleName = getClass().getSimpleName();
        if (giv.c().b()) {
            FlexaLiveX.w("[" + simpleName + "<initBType>] createLocal");
            this.local = (IProxyType) createLocal();
        } else if (FlexaLiveX.l()) {
            FlexaLiveX.w("[" + simpleName + "<initBType>] force local, return");
        } else {
            FlexaLiveX.w("[" + simpleName + "<initBType>] try to use remote");
            if (this.installPluginOnce.compareAndSet(false, true)) {
                FlexaLiveX.w("[" + simpleName + "<initBType>]  Installing");
                loadBType(simpleName);
                tryToRefreshBTypePlugin();
            } else {
                FlexaLiveX.w("[" + simpleName + "<initBType>]  Installed");
            }
            FlexaLiveX.x(bl9.g().b(), getTrackName(), "init");
        }
    }

    public void initCrossPlatform() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("534ca4aa", new Object[]{this});
            return;
        }
        this.installPluginOnce = new AtomicBoolean(false);
        this.local = (IProxyType) createLocal();
        String simpleName = getClass().getSimpleName();
        if (FlexaLiveX.D(getOrangeKey())) {
            this.needLocal = true;
            FlexaLiveX.w("[" + simpleName + "<init>] force local, return");
        } else if (getOrangeKey() == null || d4s.e(getOrangeKey(), true)) {
            FlexaLiveX.w("[" + simpleName + "<init>] try to use remote");
            if (this.installPluginOnce.compareAndSet(false, true)) {
                FlexaLiveX.w("[" + simpleName + "<init>]  Installing");
                loadAType(simpleName);
                IProxyType iproxytype = (IProxyType) r2s.INSTANCE.a().get(getIProxyKey());
                if (iproxytype != null) {
                    this.needLocal = false;
                    this.remote = iproxytype;
                    FlexaLiveX.w("[" + simpleName + "<init>] use remote, remote: " + this.remote);
                }
                FlexaLiveX.x(bl9.g().a(), getTrackName(), "init");
                return;
            }
            FlexaLiveX.w("[" + simpleName + "<init>]  Installed");
        } else {
            this.needLocal = true;
            FlexaLiveX.w("[" + simpleName + "<init>] force local by orange, return");
        }
    }

    public static void loadBType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10248b87", new Object[]{str});
        } else if (!B_TYPE_ONCE.compareAndSet(false, true)) {
        } else {
            if (FlexaLiveX.o().k()) {
                try {
                    bcq.a().g(com.taobao.appbundle.a.Companion.a().d(), false, FlexaLiveX.BTYPE, FlexaLiveX.TBLIVE_GIFT);
                    FlexaLiveX.u();
                    FlexaLiveX.w("[" + str + "<init>] loadBType, app bundle load");
                } catch (Throwable th) {
                    FlexaLiveX.w("[" + str + "<init>] loadBType, app bundle load error: " + th.getMessage());
                }
            } else {
                FlexaLiveX.w("[" + str + "<init>] loadBType, app bundle load error: enableSyncLoadRemoteModule false");
            }
        }
    }

    private boolean refreshRemote(int i) {
        IProxyType iproxytype;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("869f10ff", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i != 1) {
            iproxytype = i != 2 ? null : (IProxyType) bl9.g().e().get(getIProxyKey());
        } else {
            iproxytype = (IProxyType) bl9.g().d().get(getIProxyKey());
        }
        if (iproxytype == null) {
            return false;
        }
        this.remote = iproxytype;
        FlexaLiveX.w("[" + getClass().getSimpleName() + "#refreshBRemote] refresh remote, remote: " + this.remote);
        FlexaLiveX.x(true, getTrackName(), "refreshRemote");
        FlexaLiveX.x(true, getTrackName(), "refreshRemote");
        return true;
    }
}
