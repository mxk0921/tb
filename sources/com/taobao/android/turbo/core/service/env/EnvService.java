package com.taobao.android.turbo.core.service.env;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.android.revisionswitch.utils.LocationHelper;
import com.taobao.android.tbelder.TBElder;
import com.taobao.android.tbtheme.kit.ThemeData;
import com.taobao.tao.navigation.Interface.TabHostStatusListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.a07;
import tb.a3w;
import tb.bud;
import tb.ckf;
import tb.cpt;
import tb.g1a;
import tb.n78;
import tb.plk;
import tb.qpu;
import tb.r2c;
import tb.r69;
import tb.s1c;
import tb.s69;
import tb.slo;
import tb.t1c;
import tb.t2c;
import tb.t2o;
import tb.tpu;
import tb.ud0;
import tb.xhv;
import tb.z78;
import tb.zrt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class EnvService implements t2c, s1c, TabHostStatusListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final plk<r2c> f9741a = new plk<>();
    public final FestivalBroadcastReceiver b = new FestivalBroadcastReceiver();
    public qpu c;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/taobao/android/turbo/core/service/env/EnvService$FestivalBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "turboflow_framework_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public final class FestivalBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(919601273);
        }

        public FestivalBroadcastReceiver() {
        }

        public static /* synthetic */ Object ipc$super(FestivalBroadcastReceiver festivalBroadcastReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/core/service/env/EnvService$FestivalBroadcastReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            ckf.g(context, "context");
            ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, "EnvService", "onReceive: " + intent.getAction(), null, 4, null);
            if (ckf.b(FestivalMgr.ACTION_FESTIVAL_CHANGE, intent.getAction())) {
                EnvService.L(EnvService.this).d(new EnvService$FestivalBroadcastReceiver$onReceive$1(EnvService.this.t()));
            } else if (ckf.b("taobao.action.ACTION_REVISION_SWITCH_CHANGE", intent.getAction())) {
                EnvService.L(EnvService.this).d(new EnvService$FestivalBroadcastReceiver$onReceive$2(EnvService.this.J1()));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(919601272);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(919601271);
        t2o.a(919601282);
        t2o.a(456130607);
    }

    public static final /* synthetic */ z78 B(EnvService envService, a3w a3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z78) ipChange.ipc$dispatch("70c4f525", new Object[]{envService, a3wVar});
        }
        return envService.M(a3wVar);
    }

    public static final /* synthetic */ plk L(EnvService envService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (plk) ipChange.ipc$dispatch("4b8ef64a", new Object[]{envService});
        }
        return envService.f9741a;
    }

    @Override // tb.t2c
    public boolean J1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dee02e43", new Object[]{this})).booleanValue();
        }
        return TBElder.b();
    }

    public final z78 M(a3w a3wVar) {
        t1c t1cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z78) ipChange.ipc$dispatch("46f399c4", new Object[]{this, a3wVar});
        }
        z78 z78Var = new z78(null, null, null, null, null, 31, null);
        if (a3wVar == null && (t1cVar = (t1c) n78.a(t1c.class)) != null) {
            a3wVar = t1cVar.queryCurrentVersionInfo();
        }
        if (a3wVar != null) {
            z78Var.d(a3wVar.f15531a);
            z78Var.f(a3wVar.c);
            z78Var.b(a3wVar.d);
            z78Var.e(a3wVar.b);
            z78Var.c(a3wVar.e);
        }
        return z78Var;
    }

    public final int T0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a59c1ab", new Object[]{this})).intValue();
        }
        if (cpt.g()) {
            return 1;
        }
        if (cpt.h()) {
            return 2;
        }
        return 0;
    }

    public final String U0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e7db8f24", new Object[]{this});
        }
        return FestivalMgr.i().l("global", slo.KEY_NAVI_STYLE);
    }

    public final String W0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e95e40c2", new Object[]{this});
        }
        return cpt.d().skinPic;
    }

    public final boolean e1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d2e7c3e", new Object[]{this})).booleanValue();
        }
        return FestivalMgr.i().q();
    }

    public final boolean g1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f39be4c", new Object[]{this})).booleanValue();
        }
        if (T0() != 0) {
            return true;
        }
        return false;
    }

    @Override // tb.t2c
    public boolean h1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d920abe3", new Object[]{this})).booleanValue();
        }
        if (!g1() || !ckf.b(U0(), "0")) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.tao.navigation.Interface.TabHostStatusListener
    public int listenEventType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec7280e7", new Object[]{this})).intValue();
        }
        return 1;
    }

    public final String m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("822c976c", new Object[]{this});
        }
        try {
            String str = cpt.d().actionBarBackgroundColor;
            ckf.f(str, "ThemeManager.getThemeDat….actionBarBackgroundColor");
            if (TextUtils.isEmpty(str)) {
                str = cpt.d().skinColor;
                ckf.f(str, "ThemeManager.getThemeData().skinColor");
            }
            if (str.length() > 0 && str.charAt(0) == '#') {
                return str;
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            int parseColor = Color.parseColor(str);
            String str2 = "#" + Integer.toHexString(parseColor);
            int length = str2.length();
            if (length <= 7) {
                return str2;
            }
            StringBuilder sb = new StringBuilder("#");
            int i = length - 6;
            String substring = str2.substring(i);
            ckf.f(substring, "(this as java.lang.String).substring(startIndex)");
            sb.append(substring);
            String substring2 = str2.substring(1, i);
            ckf.f(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            sb.append(substring2);
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // tb.sod
    public void onCreateService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b2eb95", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        this.c = qpuVar;
        IntentFilter intentFilter = new IntentFilter(FestivalMgr.ACTION_FESTIVAL_CHANGE);
        intentFilter.addAction("taobao.action.ACTION_REVISION_SWITCH_CHANGE");
        LocalBroadcastManager.getInstance(qpuVar.getContext()).registerReceiver(this.b, intentFilter);
        ((t1c) n78.a(t1c.class)).addChangeVersionListener(this);
        if (c0(qpuVar)) {
            com.taobao.tao.navigation.a.J("tab2", this);
        }
    }

    @Override // tb.sod
    public void onDestroyService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673e3e35", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        LocalBroadcastManager.getInstance(qpuVar.getContext()).unregisterReceiver(this.b);
        ((t1c) n78.a(t1c.class)).removeChangeVersionListener(this);
        if (c0(qpuVar)) {
            com.taobao.tao.navigation.a.c0("tab2");
        }
    }

    @Override // tb.s1c
    public void onSuccess(final a3w a3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a126ba", new Object[]{this, a3wVar});
        } else {
            zrt.Companion.b(new Runnable() { // from class: com.taobao.android.turbo.core.service.env.EnvService$onSuccess$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* compiled from: Taobao */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltb/r2c;", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "invoke", "(Ltb/r2c;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
                /* renamed from: com.taobao.android.turbo.core.service.env.EnvService$onSuccess$1$1  reason: invalid class name */
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
                public static final class AnonymousClass1 extends Lambda implements g1a<r2c, xhv> {
                    public static volatile transient /* synthetic */ IpChange $ipChange;
                    public final /* synthetic */ z78 $editionVersionInfo;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(z78 z78Var) {
                        super(1);
                        this.$editionVersionInfo = z78Var;
                    }

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/core/service/env/EnvService$onSuccess$1$1");
                    }

                    @Override // tb.g1a
                    public /* bridge */ /* synthetic */ xhv invoke(r2c r2cVar) {
                        invoke2(r2cVar);
                        return xhv.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(r2c r2cVar) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("6ae5fd1e", new Object[]{this, r2cVar});
                            return;
                        }
                        ckf.g(r2cVar, AdvanceSetting.NETWORK_TYPE);
                        r2cVar.onEditionVersionInfoChanged(this.$editionVersionInfo);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    tpu.a aVar = tpu.Companion;
                    StringBuilder sb = new StringBuilder("onEditionVersionInfoChanged: ");
                    a3w a3wVar2 = a3wVar;
                    sb.append(a3wVar2 != null ? a3wVar2.c : null);
                    tpu.a.b(aVar, "EnvService", sb.toString(), null, 4, null);
                    EnvService.L(EnvService.this).d(new AnonymousClass1(EnvService.B(EnvService.this, a3wVar)));
                }
            });
        }
    }

    @Override // tb.s2c
    public void r(r2c r2cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93f7f613", new Object[]{this, r2cVar});
            return;
        }
        ckf.g(r2cVar, DataReceiveMonitor.CB_LISTENER);
        this.f9741a.c(r2cVar);
    }

    @Override // tb.t2c
    public r69 t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r69) ipChange.ipc$dispatch("6fef3db4", new Object[]{this});
        }
        r69 r69Var = new r69();
        ThemeData d = cpt.d();
        ckf.f(d, "ThemeManager.getThemeData()");
        boolean g1 = g1();
        r69Var.g(g1);
        if (g1) {
            r69Var.i(T0());
            r69Var.e(m0());
            r69Var.q(W0());
            r69Var.k(d.actionBarBackgroundColor);
            r69Var.l(d.actionBarBackgroundImage);
            r69Var.m(d.statusBarStyle);
            r69Var.o(d.actionbarTextColor);
            r69Var.p(d.naviStyle);
            r69Var.f(z0());
        }
        r69Var.h(e1());
        r69Var.j(U0());
        FestivalMgr i = FestivalMgr.i();
        ckf.f(i, "FestivalMgr.getInstance()");
        r69Var.n(i.z());
        return r69Var;
    }

    @Override // tb.t2c
    public z78 v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z78) ipChange.ipc$dispatch("98cc9df0", new Object[]{this});
        }
        return M(null);
    }

    @Override // tb.s2c
    public void x(r2c r2cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb9f26d6", new Object[]{this, r2cVar});
            return;
        }
        ckf.g(r2cVar, DataReceiveMonitor.CB_LISTENER);
        this.f9741a.a(r2cVar);
    }

    public final String z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f671d7de", new Object[]{this});
        }
        return s69.e().g("global", "festivalCode");
    }

    @Override // com.taobao.tao.navigation.Interface.TabHostStatusListener
    public void onTabHostStatusChanged(TabHostStatusListener.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45bff8f3", new Object[]{this, aVar});
        } else if (aVar != null && aVar.b == 1) {
            tpu.a aVar2 = tpu.Companion;
            tpu.a.b(aVar2, "EnvService", "onTabHostStatusChanged: " + aVar.b, null, 4, null);
            this.f9741a.d(EnvService$onTabHostStatusChanged$1.INSTANCE);
        }
    }

    @Override // tb.t2c
    public boolean B1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a6a22b9", new Object[]{this})).booleanValue();
        }
        qpu qpuVar = this.c;
        if (qpuVar != null) {
            return LocationHelper.d(qpuVar.getContext()) && TBRevisionSwitchManager.c().d(bud.KEY_NEW_DISCOVERY_ENABLE);
        }
        ckf.y("context");
        throw null;
    }

    public final boolean c0(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4368f920", new Object[]{this, qpuVar})).booleanValue();
        }
        return !qpuVar.a().r() && ((Boolean) ud0.Companion.b().c("weitao_switch.watchTabHostChange", Boolean.TRUE)).booleanValue();
    }
}
