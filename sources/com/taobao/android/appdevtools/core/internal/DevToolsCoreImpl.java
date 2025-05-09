package com.taobao.android.appdevtools.core.internal;

import android.os.Build;
import android.taobao.windvane.extra.devtools.DevTools;
import android.taobao.windvane.jsbridge.api.WVDevelopTool;
import android.text.TextUtils;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.appdevtools.core.export.IDevToolsCore;
import com.taobao.android.appdevtools.core.model.Config;
import com.taobao.android.appdevtools.core.model.RemoteDebugParam;
import com.taobao.android.appdevtools.core.model.Resource;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.RVLRemoteConnectCallback;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.export.extension.ICoreVersion;
import com.uc.webview.export.extension.Sdk2CoreHost;
import com.uc.webview.export.extension.U4Engine;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import tb.bwj;
import tb.ckf;
import tb.fsw;
import tb.g1a;
import tb.lcn;
import tb.lh4;
import tb.m0m;
import tb.mcn;
import tb.njg;
import tb.onf;
import tb.qqw;
import tb.rrf;
import tb.rv7;
import tb.sgh;
import tb.t2o;
import tb.tu7;
import tb.upl;
import tb.v7t;
import tb.vc9;
import tb.w1a;
import tb.wsq;
import tb.xhv;
import tb.xrt;
import tb.yaa;
import tb.zu7;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/taobao/android/appdevtools/core/internal/DevToolsCoreImpl;", "Lcom/taobao/android/appdevtools/core/export/IDevToolsCore;", "<init>", "()V", "Ltb/xhv;", "init", "appdevtools-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class DevToolsCoreImpl implements IDevToolsCore {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean d;

    /* renamed from: a  reason: collision with root package name */
    public final m0m<Config> f6340a = new m0m<>("config", Config.class, DevToolsCoreImpl$special$$inlined$createPersistentWrapper$default$1.INSTANCE);
    public final m0m<Resource> b = new m0m<>("backendJS", Resource.class, DevToolsCoreImpl$mBackendJSFile$1.INSTANCE);
    public final m0m<Resource> c = new m0m<>("injectJS", Resource.class, DevToolsCoreImpl$mInjectJSFile$1.INSTANCE);
    public int e = -1;
    public final njg f = kotlin.a.b(DevToolsCoreImpl$executor$2.INSTANCE);
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final AtomicBoolean h = new AtomicBoolean(false);

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ g1a<Boolean, xhv> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(g1a<? super Boolean, xhv> g1aVar) {
            this.b = g1aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!DevToolsCoreImpl.t(DevToolsCoreImpl.this, false, 1, null)) {
                this.b.invoke(Boolean.FALSE);
            } else {
                WVDevelopTool.setUCRemoteDebug(false);
                WVDevelopTool.setUCRemoteDebugStrategy("");
                WVDevelopTool.setUCRemoteDebugFilePath("");
                this.b.invoke(Boolean.TRUE);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ g1a<Boolean, xhv> b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(g1a<? super Boolean, xhv> g1aVar) {
            this.b = g1aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!DevToolsCoreImpl.t(DevToolsCoreImpl.this, false, 1, null)) {
                lcn.a(RVLLevel.Error, sgh.a("DevToolsCore")).j("close").a("error", "devTools is currently closed or disabled").f();
                this.b.invoke(Boolean.FALSE);
            } else {
                mcn.a();
                DevToolsCoreImpl.p(DevToolsCoreImpl.this, false);
                DevToolsCoreImpl.k(DevToolsCoreImpl.this).b();
                DevToolsCoreImpl.j(DevToolsCoreImpl.this).b();
                DevToolsCoreImpl.l(DevToolsCoreImpl.this).b();
                this.b.invoke(Boolean.TRUE);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RemoteDebugParam f6343a;
        public final /* synthetic */ w1a<Boolean, String, Boolean, xhv> b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(RemoteDebugParam remoteDebugParam, w1a<? super Boolean, ? super String, ? super Boolean, xhv> w1aVar) {
            this.f6343a = remoteDebugParam;
            this.b = w1aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Sdk2CoreHost.impl().startRemoteDebugging(this.f6343a.getWsUrl());
            WVDevelopTool.setUCRemoteDebugStrategy(this.f6343a.getStrategy());
            this.b.invoke(Boolean.TRUE, "SUCCESS", Boolean.FALSE);
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ g1a<Config, xhv> b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(g1a<? super Config, xhv> g1aVar) {
            this.b = g1aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!DevToolsCoreImpl.i(DevToolsCoreImpl.this, true)) {
                lcn.a(RVLLevel.Error, sgh.a("DevToolsCore")).j("getConfig").a("error", "disabled").f();
                this.b.invoke(null);
            } else {
                Config config = (Config) DevToolsCoreImpl.k(DevToolsCoreImpl.this).a();
                lcn.a(RVLLevel.Info, sgh.a("DevToolsCore")).j("getConfig").a("config", rrf.b(config)).f();
                this.b.invoke(config);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class e extends U4Engine.Extractor.Client {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ File b;
        public final /* synthetic */ RemoteDebugParam c;
        public final /* synthetic */ w1a<Boolean, String, Boolean, xhv> d;

        /* JADX WARN: Multi-variable type inference failed */
        public e(File file, RemoteDebugParam remoteDebugParam, w1a<? super Boolean, ? super String, ? super Boolean, xhv> w1aVar) {
            this.b = file;
            this.c = remoteDebugParam;
            this.d = w1aVar;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -868516125) {
                super.onFailed((UCKnownException) objArr[0]);
                return null;
            } else if (hashCode == 1802196450) {
                super.onSuccess((File) objArr[0]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/appdevtools/core/internal/DevToolsCoreImpl$onDownloadSuccess$1");
            }
        }

        @Override // com.uc.webview.export.extension.U4Engine.Extractor.Client
        public void onFailed(UCKnownException uCKnownException) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc3b7ee3", new Object[]{this, uCKnownException});
                return;
            }
            ckf.g(uCKnownException, ErrorType.DEFAULT);
            super.onFailed(uCKnownException);
            w1a<Boolean, String, Boolean, xhv> w1aVar = this.d;
            Boolean bool = Boolean.FALSE;
            w1aVar.invoke(bool, ckf.p("UNZIP::UC_EXTRACT_FAIL::", uCKnownException.getMessage()), bool);
        }

        @Override // com.uc.webview.export.extension.U4Engine.Extractor.Client
        public void onSuccess(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b6b55e2", new Object[]{this, file});
                return;
            }
            ckf.g(file, "dir");
            super.onSuccess(file);
            WVDevelopTool.setUCRemoteDebug(true);
            WVDevelopTool.setUCRemoteDebugFilePath(this.b.getAbsolutePath());
            WVDevelopTool.setUCRemoteDebugStrategy(this.c.getStrategy());
            w1a<Boolean, String, Boolean, xhv> w1aVar = this.d;
            Boolean bool = Boolean.TRUE;
            w1aVar.invoke(bool, "READY", bool);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class f implements RVLRemoteConnectCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Config b;
        public final /* synthetic */ g1a<Boolean, xhv> c;

        /* JADX WARN: Multi-variable type inference failed */
        public f(Config config, g1a<? super Boolean, xhv> g1aVar) {
            this.b = config;
            this.c = g1aVar;
        }

        @Override // com.taobao.android.riverlogger.RVLRemoteConnectCallback
        public void finish(boolean z, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db6055c4", new Object[]{this, new Boolean(z), str});
                return;
            }
            lcn.a(RVLLevel.Info, sgh.a("DevToolsCore")).j("open").a("success", Boolean.valueOf(z)).a("errorMsg", str).f();
            if (z) {
                DevToolsCoreImpl.m(DevToolsCoreImpl.this);
                DevToolsCoreImpl.p(DevToolsCoreImpl.this, true);
                DevToolsCoreImpl.this.a(this.b, this.c);
                return;
            }
            this.c.invoke(Boolean.FALSE);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class g implements RVLRemoteConnectCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ RemoteDebugParam b;
        public final /* synthetic */ w1a<Boolean, String, Boolean, xhv> c;

        /* JADX WARN: Multi-variable type inference failed */
        public g(RemoteDebugParam remoteDebugParam, w1a<? super Boolean, ? super String, ? super Boolean, xhv> w1aVar) {
            this.b = remoteDebugParam;
            this.c = w1aVar;
        }

        @Override // com.taobao.android.riverlogger.RVLRemoteConnectCallback
        public void finish(boolean z, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db6055c4", new Object[]{this, new Boolean(z), str});
                return;
            }
            lcn.a(RVLLevel.Info, sgh.a("DevToolsCore")).j("openRemote").a("success", Boolean.valueOf(z)).a("errorMsg", str).f();
            if (z) {
                DevToolsCoreImpl.p(DevToolsCoreImpl.this, true);
                DevToolsCoreImpl.m(DevToolsCoreImpl.this);
                if (TextUtils.isEmpty(this.b.getWsUrl())) {
                    this.c.invoke(Boolean.TRUE, "SUCCESS", Boolean.FALSE);
                } else {
                    DevToolsCoreImpl.h(DevToolsCoreImpl.this, this.b, this.c);
                }
            } else {
                RVLLevel rVLLevel = RVLLevel.Error;
                String a2 = sgh.a("DevToolsCore");
                lcn.f(rVLLevel, a2, "openRemote failed, appWsUrl: " + this.b.getAppWsUrl() + ", debugId: " + this.b.getDebugId());
                w1a<Boolean, String, Boolean, xhv> w1aVar = this.c;
                Boolean bool = Boolean.FALSE;
                w1aVar.invoke(bool, "INVALID::NOT_ALI_NETWORK", bool);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ g1a<Boolean, xhv> c;

        /* JADX WARN: Multi-variable type inference failed */
        public h(String str, g1a<? super Boolean, xhv> g1aVar) {
            this.b = str;
            this.c = g1aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Resource resource = (Resource) DevToolsCoreImpl.l(DevToolsCoreImpl.this).a();
            if (resource == null || !ckf.b(resource.getUrl(), this.b)) {
                String a2 = bwj.INSTANCE.a(this.b, kotlin.collections.a.h());
                if (a2 == null) {
                    this.c.invoke(Boolean.FALSE);
                    return;
                }
                DevToolsCoreImpl.l(DevToolsCoreImpl.this).c(new Resource(this.b, a2));
            }
            this.c.invoke(Boolean.TRUE);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class i implements FilenameFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6348a;

        public i(String str) {
            this.f6348a = str;
        }

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6696dd14", new Object[]{this, file, str})).booleanValue();
            }
            ckf.f(str, "name");
            return !wsq.O(str, this.f6348a, false, 2, null);
        }
    }

    static {
        t2o.a(998244358);
        t2o.a(998244357);
    }

    public static final /* synthetic */ void h(DevToolsCoreImpl devToolsCoreImpl, RemoteDebugParam remoteDebugParam, w1a w1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9540d75a", new Object[]{devToolsCoreImpl, remoteDebugParam, w1aVar});
        } else {
            devToolsCoreImpl.r(remoteDebugParam, w1aVar);
        }
    }

    public static final /* synthetic */ boolean i(DevToolsCoreImpl devToolsCoreImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc015be3", new Object[]{devToolsCoreImpl, new Boolean(z)})).booleanValue();
        }
        return devToolsCoreImpl.s(z);
    }

    public static final /* synthetic */ m0m j(DevToolsCoreImpl devToolsCoreImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m0m) ipChange.ipc$dispatch("162f3d7c", new Object[]{devToolsCoreImpl});
        }
        return devToolsCoreImpl.b;
    }

    public static final /* synthetic */ m0m k(DevToolsCoreImpl devToolsCoreImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m0m) ipChange.ipc$dispatch("afb6a2d3", new Object[]{devToolsCoreImpl});
        }
        return devToolsCoreImpl.f6340a;
    }

    public static final /* synthetic */ m0m l(DevToolsCoreImpl devToolsCoreImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m0m) ipChange.ipc$dispatch("750d8787", new Object[]{devToolsCoreImpl});
        }
        return devToolsCoreImpl.c;
    }

    public static final /* synthetic */ void m(DevToolsCoreImpl devToolsCoreImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40a40b6e", new Object[]{devToolsCoreImpl});
        } else {
            devToolsCoreImpl.y();
        }
    }

    public static final /* synthetic */ void n(DevToolsCoreImpl devToolsCoreImpl, RemoteDebugParam remoteDebugParam, String str, String str2, w1a w1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86e64d08", new Object[]{devToolsCoreImpl, remoteDebugParam, str, str2, w1aVar});
        } else {
            devToolsCoreImpl.B(remoteDebugParam, str, str2, w1aVar);
        }
    }

    public static final /* synthetic */ void o(DevToolsCoreImpl devToolsCoreImpl, String str, g1a g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9d68f7", new Object[]{devToolsCoreImpl, str, g1aVar});
        } else {
            devToolsCoreImpl.C(str, g1aVar);
        }
    }

    public static final /* synthetic */ void p(DevToolsCoreImpl devToolsCoreImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d75e81c", new Object[]{devToolsCoreImpl, new Boolean(z)});
        } else {
            devToolsCoreImpl.d = z;
        }
    }

    public static final /* synthetic */ void q(DevToolsCoreImpl devToolsCoreImpl, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27103393", new Object[]{devToolsCoreImpl, new Integer(i2)});
        } else {
            devToolsCoreImpl.e = i2;
        }
    }

    public static /* synthetic */ boolean t(DevToolsCoreImpl devToolsCoreImpl, boolean z, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5facde7", new Object[]{devToolsCoreImpl, new Boolean(z), new Integer(i2), obj})).booleanValue();
        }
        if ((i2 & 1) != 0) {
            z = false;
        }
        return devToolsCoreImpl.s(z);
    }

    public final boolean A(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17ca74f4", new Object[]{this, file})).booleanValue();
        }
        if (!file.exists()) {
            return false;
        }
        return U4Engine.isExtractDirReady(file);
    }

    public final void B(RemoteDebugParam remoteDebugParam, String str, String str2, w1a<? super Boolean, ? super String, ? super Boolean, xhv> w1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("121d618f", new Object[]{this, remoteDebugParam, str, str2, w1aVar});
            return;
        }
        File x = x(str2);
        if (x.exists() && !qqw.b(x)) {
            Boolean bool = Boolean.FALSE;
            w1aVar.invoke(bool, ckf.p("UNZIP::DELETE_OLD_DIR_FAIL::", x.getAbsolutePath()), bool);
        } else if (!x.mkdirs()) {
            Boolean bool2 = Boolean.FALSE;
            w1aVar.invoke(bool2, ckf.p("UNZIP::MK_DIR_FAIL::", x.getAbsolutePath()), bool2);
        } else {
            Boolean bool3 = Boolean.TRUE;
            w1aVar.invoke(bool3, "UNZIP::START", bool3);
            File w = w(str2);
            if (!vc9.i(str, x.getAbsolutePath()) || !w.exists()) {
                Boolean bool4 = Boolean.FALSE;
                w1aVar.invoke(bool4, "UNZIP::UNZIP_FAIL", bool4);
                return;
            }
            File v = v(str2);
            if (v.exists() && !qqw.b(v)) {
                Boolean bool5 = Boolean.FALSE;
                w1aVar.invoke(bool5, ckf.p("UNZIP::DELETE_OLD_DIR_FAIL::", v.getAbsolutePath()), bool5);
            } else if (!v.mkdirs()) {
                Boolean bool6 = Boolean.FALSE;
                w1aVar.invoke(bool6, ckf.p("UNZIP::MK_DIR_FAIL::", v.getAbsolutePath()), bool6);
            } else {
                try {
                    U4Engine.createExtractor().setCompressedFile(w).setContext(yaa.n).setASync(false).setSpecifiedDir(v).setClient(new e(v, remoteDebugParam, w1aVar)).start();
                } catch (Exception e2) {
                    v7t.e("DevToolsCore", "extract fail", e2, new Object[0]);
                    Boolean bool7 = Boolean.FALSE;
                    w1aVar.invoke(bool7, ckf.p("UNZIP::UC_EXTRACT_FAIL::", e2.getMessage()), bool7);
                }
            }
        }
    }

    public final void C(String str, g1a<? super Boolean, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("131e2348", new Object[]{this, str, g1aVar});
            return;
        }
        Resource a2 = this.b.a();
        if (a2 == null || !ckf.b(a2.getUrl(), str)) {
            String a3 = bwj.INSTANCE.a(str, kotlin.collections.a.h());
            if (a3 == null) {
                g1aVar.invoke(Boolean.FALSE);
                return;
            }
            this.b.c(new Resource(str, a3));
        }
        g1aVar.invoke(Boolean.TRUE);
    }

    @Override // com.taobao.android.appdevtools.core.export.IDevToolsCore
    public void a(final Config config, final g1a<? super Boolean, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48eccc23", new Object[]{this, config, g1aVar});
            return;
        }
        ckf.g(config, "config");
        ckf.g(g1aVar, "callback");
        u().submit(new Runnable() { // from class: com.taobao.android.appdevtools.core.internal.DevToolsCoreImpl$setConfig$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "success", "Ltb/xhv;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            /* renamed from: com.taobao.android.appdevtools.core.internal.DevToolsCoreImpl$setConfig$1$1  reason: invalid class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
            public static final class AnonymousClass1 extends Lambda implements g1a<Boolean, xhv> {
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public final /* synthetic */ g1a<Boolean, xhv> $callback;
                public final /* synthetic */ Config $config;
                public final /* synthetic */ DevToolsCoreImpl this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass1(Config config, DevToolsCoreImpl devToolsCoreImpl, g1a<? super Boolean, xhv> g1aVar) {
                    super(1);
                    this.$config = config;
                    this.this$0 = devToolsCoreImpl;
                    this.$callback = g1aVar;
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/appdevtools/core/internal/DevToolsCoreImpl$setConfig$1$1");
                }

                @Override // tb.g1a
                public /* bridge */ /* synthetic */ xhv invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return xhv.INSTANCE;
                }

                public final void invoke(boolean z) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("36b985b5", new Object[]{this, new Boolean(z)});
                        return;
                    }
                    lcn.a(RVLLevel.Info, sgh.a("DevToolsCore")).j("setConfig").a("config", rrf.a(this.$config)).a("success", Boolean.valueOf(z)).f();
                    if (z) {
                        DevToolsCoreImpl.k(this.this$0).c(this.$config);
                        this.$callback.invoke(Boolean.TRUE);
                        return;
                    }
                    this.$callback.invoke(Boolean.FALSE);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!DevToolsCoreImpl.i(DevToolsCoreImpl.this, true)) {
                    g1aVar.invoke(Boolean.FALSE);
                } else if (!config.isValid()) {
                    g1aVar.invoke(Boolean.FALSE);
                } else {
                    DevToolsCoreImpl.o(DevToolsCoreImpl.this, config.getInjectScriptUrl(), new AnonymousClass1(config, DevToolsCoreImpl.this, g1aVar));
                }
            }
        });
    }

    @Override // com.taobao.android.appdevtools.core.export.IDevToolsCore
    public void b(g1a<? super Boolean, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("119fb845", new Object[]{this, g1aVar});
            return;
        }
        ckf.g(g1aVar, "callback");
        u().submit(new b(g1aVar));
    }

    @Override // com.taobao.android.appdevtools.core.export.IDevToolsCore
    public void c(g1a<? super Config, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f816085", new Object[]{this, g1aVar});
            return;
        }
        ckf.g(g1aVar, "callback");
        u().submit(new d(g1aVar));
    }

    @Override // com.taobao.android.appdevtools.core.export.IDevToolsCore
    public void d(Config config, g1a<? super Boolean, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43de7fa9", new Object[]{this, config, g1aVar});
            return;
        }
        ckf.g(config, "config");
        ckf.g(g1aVar, "callback");
        if (!s(true)) {
            g1aVar.invoke(Boolean.FALSE);
        } else {
            mcn.d(config.getAppWsUrl(), config.getDebugId(), new f(config, g1aVar));
        }
    }

    @Override // com.taobao.android.appdevtools.core.export.IDevToolsCore
    public void g(g1a<? super Boolean, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72e73f6d", new Object[]{this, g1aVar});
            return;
        }
        ckf.g(g1aVar, "callback");
        u().submit(new a(g1aVar));
    }

    public final void r(RemoteDebugParam remoteDebugParam, w1a<? super Boolean, ? super String, ? super Boolean, xhv> w1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73a8ead5", new Object[]{this, remoteDebugParam, w1aVar});
        } else if (z()) {
            xrt.a(new c(remoteDebugParam, w1aVar));
        } else if (Build.VERSION.SDK_INT >= 28) {
            D(remoteDebugParam, w1aVar);
        } else {
            Boolean bool = Boolean.FALSE;
            w1aVar.invoke(bool, "RELEASE::NOT_SUPPORT", bool);
        }
    }

    public final boolean s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a800938e", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (!lh4.a() || (!z && !this.d)) {
            return false;
        }
        return true;
    }

    public final ExecutorService u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("992aaecb", new Object[]{this});
        }
        return (ExecutorService) this.f.getValue();
    }

    public final File v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("2c574627", new Object[]{this, str});
        }
        return new File(WVDevelopTool.getUCDebugDir(), ckf.p("uc_extract.", str));
    }

    public final File w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("fe1fd32", new Object[]{this, str});
        }
        if (EnvInfo.is64Bit()) {
            return new File(x(str), "jni/arm64-v8a/libkernelu4_7z_uc.so");
        }
        return new File(x(str), "jni/armeabi-v7a/libkernelu4_7z_uc.so");
    }

    public final File x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("5f8863ee", new Object[]{this, str});
        }
        return new File(WVDevelopTool.getUCDebugDir(), ckf.p("uc_aar.", str));
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33f181d1", new Object[]{this});
        } else if (this.h.compareAndSet(false, true)) {
            Resource a2 = this.b.a();
            if (a2 != null) {
                DevTools.BACK_END_JS = a2.getContent();
            }
            Resource a3 = this.c.a();
            if (a3 != null) {
                DevTools.INJECTED_JS = a3.getContent();
            }
        }
    }

    public final boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36bed1b8", new Object[]{this})).booleanValue();
        }
        ICoreVersion iCoreVersion = ICoreVersion.Instance.get();
        if (iCoreVersion == null || !iCoreVersion.supportInspector()) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.android.appdevtools.core.export.IDevToolsCore
    public void e(RemoteDebugParam remoteDebugParam, w1a<? super Boolean, ? super String, ? super Boolean, xhv> w1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("397b532c", new Object[]{this, remoteDebugParam, w1aVar});
            return;
        }
        ckf.g(remoteDebugParam, "param");
        ckf.g(w1aVar, "callback");
        if (!s(true)) {
            lcn.a(RVLLevel.Error, sgh.a("DevToolsCore")).j("remoteDebug").a("error", "devTools is currently closed or disabled").f();
            Boolean bool = Boolean.FALSE;
            w1aVar.invoke(bool, "disabled", bool);
            return;
        }
        lcn.f(RVLLevel.Info, sgh.a("DevToolsCore"), "start openRemote");
        mcn.d(remoteDebugParam.getAppWsUrl(), remoteDebugParam.getDebugId(), new g(remoteDebugParam, w1aVar));
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class j implements tu7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f6349a = -1;
        public final /* synthetic */ w1a<Boolean, String, Boolean, xhv> b;
        public final /* synthetic */ DevToolsCoreImpl c;
        public final /* synthetic */ RemoteDebugParam d;
        public final /* synthetic */ String e;

        /* JADX WARN: Multi-variable type inference failed */
        public j(w1a<? super Boolean, ? super String, ? super Boolean, xhv> w1aVar, DevToolsCoreImpl devToolsCoreImpl, RemoteDebugParam remoteDebugParam, String str) {
            this.b = w1aVar;
            this.c = devToolsCoreImpl;
            this.d = remoteDebugParam;
            this.e = str;
        }

        @Override // tb.tu7
        public void onDownloadError(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            ckf.g(str2, "msg");
            v7t.e("DevToolsCore", "old onDownloadError", null, "url", str, "errorCode", Integer.valueOf(i), "msg", str2);
            DevToolsCoreImpl.q(this.c, -1);
            w1a<Boolean, String, Boolean, xhv> w1aVar = this.b;
            Boolean bool = Boolean.FALSE;
            w1aVar.invoke(bool, ckf.p("DOWNLOAD::", str2), bool);
        }

        @Override // tb.tu7
        public void onFinish(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
            } else {
                v7t.j("DevToolsCore", "old onFinish", null, "allSuccess", Boolean.valueOf(z));
            }
        }

        @Override // tb.tu7
        public void onNetworkLimit(int i, upl uplVar, tu7.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcf51783", new Object[]{this, new Integer(i), uplVar, aVar});
            } else {
                v7t.j("DevToolsCore", "old onNetworkLimit", null, "netType", Integer.valueOf(i));
            }
        }

        @Override // tb.tu7
        public void onDownloadProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
                return;
            }
            v7t.m("DevToolsCore", "old onDownloadProgress", null, "process", Integer.valueOf(i));
            if (this.f6349a != i) {
                w1a<Boolean, String, Boolean, xhv> w1aVar = this.b;
                Boolean bool = Boolean.TRUE;
                w1aVar.invoke(bool, ckf.p("DOWNLOAD::", Integer.valueOf(i)), bool);
                this.f6349a = i;
            }
        }

        @Override // tb.tu7
        public void onDownloadFinish(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
                return;
            }
            v7t.j("DevToolsCore", "old onDownloadFinish", null, "url", str, "filePath", str2);
            DevToolsCoreImpl.q(this.c, -1);
            if (str2 != null) {
                w1a<Boolean, String, Boolean, xhv> w1aVar = this.b;
                Boolean bool = Boolean.TRUE;
                w1aVar.invoke(bool, "DOWNLOAD::SUCCESS", bool);
                DevToolsCoreImpl.n(this.c, this.d, str2, this.e, this.b);
                return;
            }
            w1a<Boolean, String, Boolean, xhv> w1aVar2 = this.b;
            Boolean bool2 = Boolean.FALSE;
            w1aVar2.invoke(bool2, "DOWNLOAD::FILE_PATH_EMPTY", bool2);
        }

        @Override // tb.tu7
        public void onDownloadStateChange(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
            } else {
                v7t.b("DevToolsCore", "old onDownloadStateChange", null, "url", str, "isDownloading", Boolean.valueOf(z));
            }
        }
    }

    @Override // com.taobao.android.appdevtools.core.export.IDevToolsCore
    public void f(String str, g1a<? super Boolean, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf56d6ca", new Object[]{this, str, g1aVar});
            return;
        }
        ckf.g(str, "url");
        ckf.g(g1aVar, "callback");
        if (!t(this, false, 1, null)) {
            g1aVar.invoke(Boolean.FALSE);
        } else {
            u().submit(new h(str, g1aVar));
        }
    }

    @Override // com.taobao.android.appdevtools.core.export.IDevToolsCore
    public void init() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (this.g.compareAndSet(false, true)) {
            try {
                fsw.h("WVDevTools", WVDevToolsPlugin.class);
                obj = Result.m1108constructorimpl(xhv.INSTANCE);
            } catch (Throwable th) {
                obj = Result.m1108constructorimpl(kotlin.b.a(th));
            }
            Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
            if (th2 != null) {
                lcn.a(RVLLevel.Error, sgh.a("DevToolsCore")).j("init").a("error", th2.getMessage()).f();
            }
            if (Result.m1115isSuccessimpl(obj)) {
                xhv xhvVar = (xhv) obj;
                lcn.a(RVLLevel.Info, sgh.a("DevToolsCore")).j("init").a("success", Boolean.TRUE).f();
            }
        }
    }

    public final void D(RemoteDebugParam remoteDebugParam, w1a<? super Boolean, ? super String, ? super Boolean, xhv> w1aVar) {
        String str;
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("356cac1", new Object[]{this, remoteDebugParam, w1aVar});
            return;
        }
        if (TextUtils.isEmpty(remoteDebugParam.getUcVersion())) {
            str = "5.12.9.0.241129232600";
        } else {
            str = remoteDebugParam.getUcVersion();
        }
        File v = v(str);
        if (A(v)) {
            WVDevelopTool.setUCRemoteDebug(true);
            WVDevelopTool.setUCRemoteDebugFilePath(v.getAbsolutePath());
            WVDevelopTool.setUCRemoteDebugStrategy(remoteDebugParam.getStrategy());
            w1aVar.invoke(Boolean.TRUE, "RESTART::RESTART", Boolean.FALSE);
        } else if (this.e != -1) {
            Boolean bool = Boolean.FALSE;
            w1aVar.invoke(bool, "DOWNLOADING::DOWNLOADING", bool);
        } else {
            File uCDebugDir = WVDevelopTool.getUCDebugDir();
            if (uCDebugDir.exists() && (listFiles = uCDebugDir.listFiles(new i(str))) != null) {
                int length = listFiles.length;
                int i2 = 0;
                while (i2 < length) {
                    File file = listFiles[i2];
                    i2++;
                    qqw.b(file);
                }
            }
            Boolean bool2 = Boolean.TRUE;
            w1aVar.invoke(bool2, "DOWNLOAD::START", bool2);
            zu7 zu7Var = new zu7();
            upl uplVar = zu7Var.b;
            uplVar.f29547a = "DevToolsCore";
            uplVar.g = WVDevelopTool.getUCDebugDir().getAbsolutePath();
            zu7Var.b.h = false;
            onf onfVar = new onf();
            onfVar.f25507a = String.format("https://artlab.alibaba-inc.com/api/protocol/1/maven/releases/com/uc/webview/u4core-7z-debug-arm64-v8a/%s/u4core-7z-debug-arm64-v8a-%s.aar", Arrays.copyOf(new Object[]{str, str}, 2));
            onfVar.d = "uc_aar.16844057.zip";
            zu7Var.f33016a.add(onfVar);
            this.e = rv7.e().b(zu7Var, new j(w1aVar, this, remoteDebugParam, str));
        }
    }
}
