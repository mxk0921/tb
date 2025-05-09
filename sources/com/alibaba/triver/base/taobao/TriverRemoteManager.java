package com.alibaba.triver.base.taobao;

import android.content.Context;
import android.os.SystemClock;
import com.alibaba.android.triver.base.api.ITriverRemoteProxy;
import com.alibaba.triver.base.taobao.TriverRemoteMonitorData;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.component.Remo;
import com.taobao.android.remoteso.component.d;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import java.io.Serializable;
import tb.cxn;
import tb.gcf;
import tb.j0n;
import tb.kyn;
import tb.nhu;
import tb.ris;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TriverRemoteManager implements ITriverRemoteProxy, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_FLEXA = "flexa";
    private static final String KEY_RSO = "rso";
    private static final String MODULE_AMAP = "order_map";
    private static final String MODULE_TRIVER = "triver_taobao";
    private static final String MODULE_UC = "kernelu4_7z_uc";
    private static final String TAG = "TriverRemoteManager";
    private static volatile TriverRemoteManager mInstance;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a implements gcf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f2927a;
        public final /* synthetic */ ITriverRemoteProxy.DependenceMode b;
        public final /* synthetic */ TriverRemoteMonitorData c;
        public final /* synthetic */ TriverRemoteMonitorData.InstallType d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ ITriverRemoteProxy.a g;

        public a(TriverRemoteManager triverRemoteManager, long j, ITriverRemoteProxy.DependenceMode dependenceMode, TriverRemoteMonitorData triverRemoteMonitorData, TriverRemoteMonitorData.InstallType installType, String str, String str2, ITriverRemoteProxy.a aVar) {
            this.f2927a = j;
            this.b = dependenceMode;
            this.c = triverRemoteMonitorData;
            this.d = installType;
            this.e = str;
            this.f = str2;
            this.g = aVar;
        }

        @Override // tb.gcf
        public void a(cxn cxnVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5ef5050", new Object[]{this, cxnVar});
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis() - this.f2927a;
            if (cxnVar.a()) {
                TLog.loge("Triver", TriverRemoteManager.TAG, "install with mode[" + this.b.name() + "] success!");
                this.c.a(uptimeMillis, TriverRemoteMonitorData.Status.Success, "");
                if (TriverRemoteMonitorData.InstallType.EXPLICIT.equals(this.d)) {
                    kyn.c(this.e, this.f, uptimeMillis);
                }
                this.g.onSuccess();
                return;
            }
            if (1003 == cxnVar.d()) {
                kyn.d(TriverRemoteManager.MODULE_TRIVER, this.f);
            }
            this.g.onError(cxnVar.toString());
            this.c.a(uptimeMillis, TriverRemoteMonitorData.Status.UserCancel, cxnVar.toString());
            TLog.loge("Triver", TriverRemoteManager.TAG, "install with mode[" + this.b.name() + "] failed!");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class b implements j0n {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ITriverRemoteProxy.b f2928a;

        public b(TriverRemoteManager triverRemoteManager, ITriverRemoteProxy.b bVar) {
            this.f2928a = bVar;
        }

        @Override // tb.j0n
        public void onProgressChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5158474", new Object[]{this, new Integer(i)});
                return;
            }
            ITriverRemoteProxy.b bVar = this.f2928a;
            if (bVar != null) {
                bVar.a(i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] $SwitchMap$com$alibaba$android$triver$base$api$ITriverRemoteProxy$DependenceMode;

        static {
            int[] iArr = new int[ITriverRemoteProxy.DependenceMode.values().length];
            $SwitchMap$com$alibaba$android$triver$base$api$ITriverRemoteProxy$DependenceMode = iArr;
            try {
                iArr[ITriverRemoteProxy.DependenceMode.UC_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alibaba$android$triver$base$api$ITriverRemoteProxy$DependenceMode[ITriverRemoteProxy.DependenceMode.TRIVER_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$alibaba$android$triver$base$api$ITriverRemoteProxy$DependenceMode[ITriverRemoteProxy.DependenceMode.TRIVER_AND_UC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$alibaba$android$triver$base$api$ITriverRemoteProxy$DependenceMode[ITriverRemoteProxy.DependenceMode.AMAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static synchronized TriverRemoteManager getInstance() {
        synchronized (TriverRemoteManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TriverRemoteManager) ipChange.ipc$dispatch("fd053bbd", new Object[0]);
            }
            if (mInstance == null) {
                mInstance = new TriverRemoteManager();
            }
            return mInstance;
        }
    }

    public String checkTriverState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1ba3868", new Object[]{this});
        }
        return Remo.h(MODULE_TRIVER);
    }

    @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy
    public boolean hasInstalled(ITriverRemoteProxy.DependenceMode dependenceMode, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbe56d4c", new Object[]{this, dependenceMode, context})).booleanValue();
        }
        d.a d = d.a().d(context);
        int i = c.$SwitchMap$com$alibaba$android$triver$base$api$ITriverRemoteProxy$DependenceMode[dependenceMode.ordinal()];
        if (i == 1) {
            d.a(KEY_RSO, MODULE_UC);
        } else if (i == 2) {
            d.a(KEY_FLEXA, MODULE_TRIVER);
        } else if (i == 3) {
            d.a(KEY_RSO, MODULE_UC).a(KEY_FLEXA, MODULE_TRIVER);
        } else if (i == 4) {
            d.a(KEY_FLEXA, "order_map");
        }
        cxn c2 = Remo.c(d.b());
        boolean a2 = c2.a();
        TLog.loge("Triver", TAG, "check mode[" + dependenceMode.name() + "] remote install result : " + c2);
        return a2;
    }

    @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy
    public void install(String str, String str2, ITriverRemoteProxy.DependenceMode dependenceMode, Context context, ITriverRemoteProxy.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c91df66", new Object[]{this, str, str2, dependenceMode, context, aVar});
        } else {
            install(str, str2, dependenceMode, context, aVar, null);
        }
    }

    @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy
    public void installWithMainThreadCallback(String str, String str2, ITriverRemoteProxy.DependenceMode dependenceMode, Context context, ITriverRemoteProxy.a aVar, ITriverRemoteProxy.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c690afe2", new Object[]{this, str, str2, dependenceMode, context, aVar, bVar});
        } else {
            installInner(str, str2, dependenceMode, context, aVar, false, true, bVar, true);
        }
    }

    @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy
    public void installWithRemoUI(String str, String str2, ITriverRemoteProxy.DependenceMode dependenceMode, Context context, ITriverRemoteProxy.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab7df495", new Object[]{this, str, str2, dependenceMode, context, aVar});
        } else {
            installInner(str, str2, dependenceMode, context, aVar, true, false, null, false);
        }
    }

    @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy
    public void install(String str, String str2, ITriverRemoteProxy.DependenceMode dependenceMode, Context context, ITriverRemoteProxy.a aVar, ITriverRemoteProxy.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c94fa14", new Object[]{this, str, str2, dependenceMode, context, aVar, bVar});
        } else {
            installInner(str, str2, dependenceMode, context, aVar, false, true, bVar, false);
        }
    }

    @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy
    public void installWithRemoUI(String str, String str2, boolean z, ITriverRemoteProxy.DependenceMode dependenceMode, Context context, ITriverRemoteProxy.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9fe903f", new Object[]{this, str, str2, new Boolean(z), dependenceMode, context, aVar});
        } else {
            installInner(str, str2, dependenceMode, context, aVar, true, z, null, false);
        }
    }

    private String getFeatureName(ITriverRemoteProxy.DependenceMode dependenceMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2114b30b", new Object[]{this, dependenceMode});
        }
        int i = c.$SwitchMap$com$alibaba$android$triver$base$api$ITriverRemoteProxy$DependenceMode[dependenceMode.ordinal()];
        if (i == 1) {
            return MODULE_UC;
        }
        if (i == 2) {
            return MODULE_TRIVER;
        }
        if (i != 3) {
            return "";
        }
        return "triver_taobao+kernelu4_7z_uc";
    }

    @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy
    public boolean hasInstalled(ITriverRemoteProxy.DependenceMode dependenceMode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("806a6e84", new Object[]{this, dependenceMode})).booleanValue() : hasInstalled(dependenceMode, Globals.getApplication());
    }

    private void installInner(String str, String str2, ITriverRemoteProxy.DependenceMode dependenceMode, Context context, ITriverRemoteProxy.a aVar, boolean z, boolean z2, ITriverRemoteProxy.b bVar, boolean z3) {
        String str3;
        String str4;
        Throwable th;
        TriverRemoteMonitorData.InstallType installType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e25a3a60", new Object[]{this, str, str2, dependenceMode, context, aVar, new Boolean(z), new Boolean(z2), bVar, new Boolean(z3)});
            return;
        }
        try {
            String featureName = getFeatureName(dependenceMode);
            if (nhu.TAG.equals(str)) {
                try {
                    installType = TriverRemoteMonitorData.InstallType.SILENCE;
                } catch (Throwable th2) {
                    th = th2;
                    str3 = "Triver";
                    str4 = TAG;
                    TLog.loge(str3, str4, th);
                    TriverRemoteMonitorData triverRemoteMonitorData = new TriverRemoteMonitorData();
                    triverRemoteMonitorData.b(str2);
                    triverRemoteMonitorData.c(str);
                    triverRemoteMonitorData.d(dependenceMode);
                    triverRemoteMonitorData.a(0L, TriverRemoteMonitorData.Status.Fail, th.getMessage());
                }
            } else {
                installType = TriverRemoteMonitorData.InstallType.EXPLICIT;
            }
            TriverRemoteMonitorData.InstallType installType2 = TriverRemoteMonitorData.InstallType.EXPLICIT;
            if (installType2.equals(installType)) {
                kyn.a(featureName, str2);
            }
            TriverRemoteMonitorData triverRemoteMonitorData2 = new TriverRemoteMonitorData();
            triverRemoteMonitorData2.b(str2);
            triverRemoteMonitorData2.c(str);
            triverRemoteMonitorData2.d(dependenceMode);
            triverRemoteMonitorData2.e(installType);
            if (hasInstalled(dependenceMode, context)) {
                try {
                    triverRemoteMonitorData2.f(false);
                    triverRemoteMonitorData2.a(0L, TriverRemoteMonitorData.Status.Success, "");
                    aVar.onSuccess();
                } catch (Throwable th3) {
                    th = th3;
                    str3 = "Triver";
                    str4 = TAG;
                    TLog.loge(str3, str4, th);
                    TriverRemoteMonitorData triverRemoteMonitorData3 = new TriverRemoteMonitorData();
                    triverRemoteMonitorData3.b(str2);
                    triverRemoteMonitorData3.c(str);
                    triverRemoteMonitorData3.d(dependenceMode);
                    triverRemoteMonitorData3.a(0L, TriverRemoteMonitorData.Status.Fail, th.getMessage());
                }
            } else {
                TLog.loge("Triver", TAG, "start install with mode[" + dependenceMode.name() + "]");
                long uptimeMillis = SystemClock.uptimeMillis();
                if (installType2.equals(installType)) {
                    kyn.e(featureName, str2);
                }
                d.a f = d.a().d(context).g(z).e(!z3 && ris.c()).f(new b(this, bVar));
                str3 = "Triver";
                str4 = TAG;
                try {
                    d.a c2 = f.c(new a(this, uptimeMillis, dependenceMode, triverRemoteMonitorData2, installType, featureName, str2, aVar));
                    int i = c.$SwitchMap$com$alibaba$android$triver$base$api$ITriverRemoteProxy$DependenceMode[dependenceMode.ordinal()];
                    if (i == 1) {
                        c2.a(KEY_RSO, MODULE_UC);
                    } else if (i == 2) {
                        c2.a(KEY_FLEXA, MODULE_TRIVER);
                    } else if (i == 3) {
                        c2.a(KEY_RSO, MODULE_UC).a(KEY_FLEXA, MODULE_TRIVER);
                    } else if (i == 4) {
                        c2.a(KEY_FLEXA, "order_map");
                    }
                    Remo.e(c2.b());
                } catch (Throwable th4) {
                    th = th4;
                    TLog.loge(str3, str4, th);
                    TriverRemoteMonitorData triverRemoteMonitorData32 = new TriverRemoteMonitorData();
                    triverRemoteMonitorData32.b(str2);
                    triverRemoteMonitorData32.c(str);
                    triverRemoteMonitorData32.d(dependenceMode);
                    triverRemoteMonitorData32.a(0L, TriverRemoteMonitorData.Status.Fail, th.getMessage());
                }
            }
        } catch (Throwable th5) {
            th = th5;
            str3 = "Triver";
            str4 = TAG;
        }
    }
}
