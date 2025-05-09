package com.taobao.android.turbo.service.redpoint.tabicon;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.model.RedpointModel;
import com.taobao.android.turbo.service.redpoint.RedpointService;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.did;
import tb.qpu;
import tb.spu;
import tb.t12;
import tb.t2o;
import tb.tpu;
import tb.zrt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class LTVTabIconManager extends t12 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static boolean e;
    public static String f;
    public static boolean g;
    public boolean c;
    public final LTVTabIconManager$receiver$1 d = new BroadcastReceiver() { // from class: com.taobao.android.turbo.service.redpoint.tabicon.LTVTabIconManager$receiver$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(LTVTabIconManager$receiver$1 lTVTabIconManager$receiver$1, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/redpoint/tabicon/LTVTabIconManager$receiver$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null) {
                int intExtra = intent.getIntExtra("state", -1);
                String stringExtra = intent.getStringExtra("data");
                if (intExtra == 14 && stringExtra != null) {
                    LTVTabIconManager.this.h((RedpointModel) JSON.parseObject(stringExtra, RedpointModel.class));
                    LTVTabIconManager.r(LTVTabIconManager.this);
                    LTVTabIconManager lTVTabIconManager = LTVTabIconManager.this;
                    RedpointModel f2 = lTVTabIconManager.f();
                    ckf.d(f2);
                    LTVTabIconManager.n(lTVTabIconManager, f2);
                    LTVTabIconManager.o(LTVTabIconManager.this, false);
                } else if (intExtra == 15) {
                    if (!LTVTabIconManager.k(LTVTabIconManager.this)) {
                        LTVTabIconManager.this.h(null);
                        LTVTabIconManager.this.g(null);
                    }
                } else if (intExtra == 13) {
                    LTVTabIconManager.o(LTVTabIconManager.this, true);
                }
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(916455625);
        }

        public a() {
        }

        public final void a(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10da6477", new Object[]{this, new Integer(i), str});
                return;
            }
            Intent intent = new Intent("LTVTabIconChanged");
            intent.putExtra("state", i);
            if (i == 14) {
                intent.putExtra("data", str);
            }
            LocalBroadcastManager.getInstance(spu.Companion.d()).sendBroadcast(intent);
        }

        public final void b(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("539cca12", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            ckf.g(str, "materialType");
            ckf.g(str2, "data");
            if (LTVTabIconManager.m()) {
                tpu.a.b(tpu.Companion, RedpointService.TAG, "onIntroductoryStateChanged for inResetTab, ignore", null, 4, null);
            } else if (i == 14 || i == 15 || i == 13) {
                if (i == 14) {
                    LTVTabIconManager.p(str2);
                } else if (i == 15 && LTVTabIconManager.l()) {
                    LTVTabIconManager.p(null);
                }
                a(i, str2);
            }
        }

        public final void c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4ce07fdb", new Object[]{this, new Boolean(z)});
            } else {
                LTVTabIconManager.q(z);
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                LTVTabIconManager.this.h(null);
            }
        }
    }

    static {
        t2o.a(916455624);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.taobao.android.turbo.service.redpoint.tabicon.LTVTabIconManager$receiver$1] */
    public LTVTabIconManager(qpu qpuVar) {
        super(qpuVar);
        ckf.g(qpuVar, "context");
        h(t());
        if (f() != null) {
            z();
            RedpointModel f2 = f();
            ckf.d(f2);
            u(f2);
        }
        x();
    }

    public static /* synthetic */ Object ipc$super(LTVTabIconManager lTVTabIconManager, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/redpoint/tabicon/LTVTabIconManager");
    }

    public static final /* synthetic */ boolean k(LTVTabIconManager lTVTabIconManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("778ed9e7", new Object[]{lTVTabIconManager})).booleanValue();
        }
        return lTVTabIconManager.c;
    }

    public static final /* synthetic */ boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5005d70", new Object[0])).booleanValue();
        }
        return g;
    }

    public static final /* synthetic */ boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af891217", new Object[0])).booleanValue();
        }
        return e;
    }

    public static final /* synthetic */ void n(LTVTabIconManager lTVTabIconManager, RedpointModel redpointModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf2cc5b1", new Object[]{lTVTabIconManager, redpointModel});
        } else {
            lTVTabIconManager.u(redpointModel);
        }
    }

    public static final /* synthetic */ void o(LTVTabIconManager lTVTabIconManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bddc34c5", new Object[]{lTVTabIconManager, new Boolean(z)});
        } else {
            lTVTabIconManager.c = z;
        }
    }

    public static final /* synthetic */ void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d247dc8", new Object[]{str});
        } else {
            f = str;
        }
    }

    public static final /* synthetic */ void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d2fef95", new Object[]{new Boolean(z)});
        } else {
            e = z;
        }
    }

    public static final /* synthetic */ void r(LTVTabIconManager lTVTabIconManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f940424", new Object[]{lTVTabIconManager});
        } else {
            lTVTabIconManager.z();
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            y();
        }
    }

    public final RedpointModel t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RedpointModel) ipChange.ipc$dispatch("d66154d9", new Object[]{this});
        }
        g = true;
        String str = f;
        if (str != null) {
            return (RedpointModel) JSON.parseObject(str, RedpointModel.class);
        }
        return null;
    }

    public final void u(RedpointModel redpointModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9c97534", new Object[]{this, redpointModel});
        } else if (redpointModel.isIconMode()) {
            j(redpointModel);
            g(redpointModel);
        }
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c16bebed", new Object[]{this});
        } else if (f() == null) {
            g(null);
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1800bf4a", new Object[]{this});
            return;
        }
        i();
        if (f() != null) {
            zrt.Companion.b(new b());
        }
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec7a3b35", new Object[]{this});
        } else {
            LocalBroadcastManager.getInstance(spu.Companion.d()).registerReceiver(this.d, new IntentFilter("LTVTabIconChanged"));
        }
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b938f0e", new Object[]{this});
        } else {
            LocalBroadcastManager.getInstance(spu.Companion.d()).unregisterReceiver(this.d);
        }
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf6d5fa3", new Object[]{this});
        } else {
            ((did) c().getService(did.class)).A0(true);
        }
    }
}
