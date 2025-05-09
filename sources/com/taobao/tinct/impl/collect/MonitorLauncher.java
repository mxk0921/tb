package com.taobao.tinct.impl.collect;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.ConfigCenter;
import com.taobao.tinct.impl.collect.MonitorLauncher;
import com.taobao.tinct.model.InstantPatchChangeInfo;
import com.taobao.tinct.model.OrangeChangeInfo;
import com.taobao.update.result.BundleUpdateStep;
import java.util.Map;
import tb.bi3;
import tb.gjv;
import tb.h9f;
import tb.iia;
import tb.kjv;
import tb.kwt;
import tb.obk;
import tb.pwt;
import tb.yjv;
import tb.zq2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MonitorLauncher {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f13828a;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tinct.impl.collect.MonitorLauncher$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class AnonymousClass1 extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tinct/impl/collect/MonitorLauncher$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, final Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null) {
                pwt.b().a(new Runnable() { // from class: tb.lzi
                    @Override // java.lang.Runnable
                    public final void run() {
                        MonitorLauncher.AnonymousClass1.b(intent);
                    }
                });
            }
        }

        public static /* synthetic */ void b(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("594668fb", new Object[]{intent});
                return;
            }
            try {
                Thread.sleep(1000L);
                String stringExtra = intent.getStringExtra("namespace");
                String stringExtra2 = intent.getStringExtra("version");
                StringBuilder sb = new StringBuilder("The orange ");
                sb.append(stringExtra);
                sb.append(" is gray update to ");
                sb.append(stringExtra2);
                MonitorLauncher.b(stringExtra, stringExtra2, true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            try {
                map.get("fromCache");
                MonitorLauncher.b(str, map.get("configVersion"), false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b implements yjv.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f13829a;

        public b(Context context) {
            this.f13829a = context;
        }

        @Override // tb.yjv.a
        public void hasPatched(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4820c60", new Object[]{this, new Boolean(z)});
            }
        }

        @Override // tb.yjv.a
        public void patchFailed(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("839bcb76", new Object[]{this, str});
                return;
            }
            Log.e("MonitorLauncher", "The hotpatch update failed： " + str);
        }

        @Override // tb.yjv.a
        public void patchStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77e91881", new Object[]{this});
            }
        }

        @Override // tb.yjv.a
        public void patchSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("890915a2", new Object[]{this});
                return;
            }
            try {
                String patchVersion = InstantPatchChangeInfo.getPatchVersion(this.f13829a);
                String patchType = InstantPatchChangeInfo.getPatchType(this.f13829a);
                if (!TextUtils.isEmpty(patchVersion)) {
                    InstantPatchChangeInfo instantPatchChangeInfo = new InstantPatchChangeInfo(patchVersion, patchType);
                    bi3.g().u(instantPatchChangeInfo);
                    kwt.n(instantPatchChangeInfo, kwt.UPLOAD_TYPE_EFFECT);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // tb.yjv.a
        public void patching(BundleUpdateStep bundleUpdateStep) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2d52632a", new Object[]{this, bundleUpdateStep});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c implements zq2.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.zq2.a
        public void onPatchFailure(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e61a71a2", new Object[]{this, str, new Boolean(z)});
            }
        }

        @Override // tb.zq2.a
        public void onPatchSuccess(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af0e2b09", new Object[]{this, str, new Boolean(z)});
            } else if (!TextUtils.isEmpty(str)) {
                h9f h9fVar = new h9f(str, z);
                bi3.g().s(h9fVar);
                kwt.f(h9fVar, kwt.UPLOAD_TYPE_EFFECT);
            }
        }
    }

    public static /* synthetic */ void b(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec9d4729", new Object[]{str, str2, new Boolean(z)});
        } else {
            i(str, str2, z);
        }
    }

    public static void c(Context context, bi3 bi3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4e669f9", new Object[]{context, bi3Var});
        } else if (!f13828a) {
            f13828a = true;
            g(context);
            h(context, bi3Var);
        }
    }

    public static /* synthetic */ void d(Context context, bi3 bi3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee20b6ac", new Object[]{context, bi3Var});
            return;
        }
        try {
            if (!iia.a((Application) context.getApplicationContext())) {
                f(context);
                e(context);
                if (bi3Var != null) {
                    bi3Var.o();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("MonitorLauncher", "Register patch monitor exception:" + e.getMessage());
        }
    }

    public static void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f472e15", new Object[]{context});
        } else if (com.taobao.tinct.impl.config.a.A()) {
            zq2.sharedInstance().registerCPPInlinePatchListener(new c());
        }
    }

    public static void f(Context context) {
        yjv yjvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a647037", new Object[]{context});
        } else if (com.taobao.tinct.impl.config.a.C() && (yjvVar = kjv.listenerMap.get(gjv.HOTPATCH)) != null) {
            yjvVar.patchProcessListener(new b(context));
        }
    }

    public static void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50b2c058", new Object[]{context});
            return;
        }
        try {
            if (com.taobao.tinct.impl.config.a.H()) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.taobao.orange.monitor.DATA");
                intentFilter.setPriority(Integer.MAX_VALUE);
                context.registerReceiver(new AnonymousClass1(), intentFilter);
                ConfigCenter.getInstance().addGlobalListener(new a());
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("MonitorLauncher", "Failed to register orange monitor done!");
        }
    }

    public static void h(final Context context, final bi3 bi3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbee725e", new Object[]{context, bi3Var});
        } else {
            pwt.b().a(new Runnable() { // from class: tb.jzi
                @Override // java.lang.Runnable
                public final void run() {
                    MonitorLauncher.d(context, bi3Var);
                }
            });
        }
    }

    public static void i(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1df06d50", new Object[]{str, str2, new Boolean(z)});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            bi3.g().t(OrangeChangeInfo.builder(str, str2).setGray(z));
        }
    }
}
