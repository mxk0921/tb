package com.etao.feimagesearch.nn;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.etao.feimagesearch.nn.MNNManager;
import com.taobao.android.mnncv.MNNCV;
import com.taobao.dai.adapter.MRTTaobaoAdapter;
import com.tmall.android.dai.DAI;
import com.tmall.android.dai.DAIConfiguration;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyThreadSafetyMode;
import tb.a07;
import tb.agh;
import tb.caa;
import tb.ckf;
import tb.jqv;
import tb.lg4;
import tb.mzu;
import tb.njg;
import tb.p73;
import tb.q7m;
import tb.t2o;
import tb.zio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class MNNManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MNN_ACTION = "com.taobao.mrt.cv_task_ready";

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f4846a;
    public final CopyOnWriteArrayList<b> b;
    public boolean c;
    public int d;
    public static final a Companion = new a(null);
    public static final njg<MNNManager> e = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, MNNManager$Companion$instance$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481297279);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final MNNManager a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MNNManager) ipChange.ipc$dispatch("694c7db3", new Object[]{this});
            }
            return (MNNManager) MNNManager.b().getValue();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface b {
        void a();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/nn/MNNManager$initMnn$1");
        }

        @Override // tb.zio
        public void c() {
            Application c;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else if (lg4.I() && !MNNManager.e(MNNManager.this, "") && (c = caa.c()) != null) {
                DAIConfiguration create = DAI.newConfigurationBuilder(c).setUserAdapter(jqv.class).setDebugMode(false).create();
                String n = caa.n();
                if (!TextUtils.isEmpty(n)) {
                    try {
                        MRTTaobaoAdapter.startMNNRuntime(c, n, create);
                        MNNCV.init(c);
                        mzu.n(p73.f25916a, "callMnnInit", 19999, new String[0]);
                        agh.r("AutoDetect", "callMnnInit", "");
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ b c;

        public d(String str, b bVar) {
            this.b = str;
            this.c = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (MNNManager.e(MNNManager.this, this.b)) {
                this.c.a();
            } else {
                MNNManager.c(MNNManager.this).add(this.c);
            }
        }
    }

    static {
        t2o.a(481297278);
    }

    public /* synthetic */ MNNManager(a07 a07Var) {
        this();
    }

    public static final /* synthetic */ boolean a(MNNManager mNNManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("879d8ba1", new Object[]{mNNManager})).booleanValue();
        }
        return mNNManager.c;
    }

    public static final /* synthetic */ njg b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("59beb729", new Object[0]);
        }
        return e;
    }

    public static final /* synthetic */ CopyOnWriteArrayList c(MNNManager mNNManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("4d3864a", new Object[]{mNNManager});
        }
        return mNNManager.b;
    }

    public static final /* synthetic */ AtomicBoolean d(MNNManager mNNManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("ad85a2d2", new Object[]{mNNManager});
        }
        return mNNManager.f4846a;
    }

    public static final /* synthetic */ boolean e(MNNManager mNNManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc4d6a", new Object[]{mNNManager, str})).booleanValue();
        }
        return mNNManager.i(str);
    }

    public final void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d0b4177", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public final int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72c03725", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("968e4dc4", new Object[]{this});
        } else if (!this.c) {
            this.c = true;
            q7m.b(new c());
        }
    }

    public final void j(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2e63fc1", new Object[]{this, str, bVar});
            return;
        }
        ckf.g(str, BaseMnnRunUnit.KEY_TASK_NAME);
        ckf.g(bVar, "statusListener");
        q7m.b(new d(str, bVar));
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            this.b.clear();
        }
    }

    public final void l(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89bdfebe", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, "statusListener");
        this.b.remove(bVar);
    }

    public MNNManager() {
        this.f4846a = new AtomicBoolean(false);
        this.b = new CopyOnWriteArrayList<>();
        this.d = 100;
        if (!i("") && !lg4.u4()) {
            LocalBroadcastManager.getInstance(caa.c()).registerReceiver(new BroadcastReceiver() { // from class: com.etao.feimagesearch.nn.MNNManager$broadcastReceiver$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* compiled from: Taobao */
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
                public static final class a implements Runnable {
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ MNNManager f4848a;

                    public a(MNNManager mNNManager) {
                        this.f4848a = mNNManager;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        mzu.n(p73.f25916a, "receiveMnnBroadcast", 19999, "hasCallMnnInit", String.valueOf(MNNManager.a(this.f4848a)));
                        agh.r("AutoDetect", "receiveMnnBroadcast", ckf.p("hasCallMnnInit:", Boolean.valueOf(MNNManager.a(this.f4848a))));
                        Iterator it = MNNManager.c(this.f4848a).iterator();
                        ckf.f(it, "mnnStatusListenerList.iterator()");
                        while (it.hasNext()) {
                            ((MNNManager.b) it.next()).a();
                        }
                        MNNManager.c(this.f4848a).clear();
                    }
                }

                public static /* synthetic */ Object ipc$super(MNNManager$broadcastReceiver$1 mNNManager$broadcastReceiver$1, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/nn/MNNManager$broadcastReceiver$1");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        return;
                    }
                    MNNManager.d(MNNManager.this).set(true);
                    q7m.b(new a(MNNManager.this));
                }
            }, new IntentFilter("com.taobao.mrt.cv_task_ready"));
        }
    }

    public final boolean i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d01a0abb", new Object[]{this, str})).booleanValue();
        }
        if (this.f4846a.get()) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            if (MNNCV.isAvailable() && MNNCV.isTaskRunnable("plt_autodetect")) {
                return true;
            }
        } else if (MNNCV.isAvailable() && MNNCV.isTaskRunnable(str)) {
            return true;
        }
        return false;
    }
}
