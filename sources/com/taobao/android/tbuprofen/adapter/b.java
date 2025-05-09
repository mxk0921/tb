package com.taobao.android.tbuprofen.adapter;

import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.adapter.TBProfConfig;
import com.taobao.android.tbuprofen.plugin.DefaultPlugin;
import com.taobao.android.tbuprofen.plugin.PluginCapacity;
import tb.lur;
import tb.n8m;
import tb.p5s;
import tb.t2o;
import tb.urr;
import tb.wrr;
import tb.xrr;
import tb.zrr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f9621a;
    public wrr b;
    public DefaultPlugin c;
    public lur d;
    public TBHeapDumper e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends n8m {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbuprofen/adapter/TBProfHelper$1");
        }

        @Override // tb.n8m
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef389c47", new Object[]{this, str});
                return;
            }
            urr.f("TBProfHelper", "Class Prepared: " + str, new Object[0]);
        }

        @Override // tb.n8m
        public void c(Throwable th, StackTraceElement stackTraceElement, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2acf245d", new Object[]{this, th, stackTraceElement, str});
                return;
            }
            String stackTraceString = Log.getStackTraceString(th);
            urr.g("TBProfHelper", "Catch Exception at " + str + ".\n" + stackTraceString, new Object[0]);
        }

        @Override // tb.n8m
        public void a(String str, String str2, String str3, long j, StackTraceElement[] stackTraceElementArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e15bd7bf", new Object[]{this, str, str2, str3, new Long(j), stackTraceElementArr});
            } else if (b.a(b.this) != null && stackTraceElementArr != null) {
                try {
                    b.a(b.this).k(str, str2, str3, j, stackTraceElementArr);
                } catch (Exception e) {
                    urr.c("TBProfHelper", e, "onBigMemAlloc error", new Object[0]);
                }
            }
        }

        @Override // tb.n8m
        public void d(String str, int i, StackTraceElement[] stackTraceElementArr, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68749ace", new Object[]{this, str, new Integer(i), stackTraceElementArr, str2});
            } else if (b.a(b.this) != null && stackTraceElementArr != null) {
                try {
                    b.a(b.this).p(str, i, stackTraceElementArr, str2);
                } catch (Exception e) {
                    urr.c("TBProfHelper", e, "onMainThreadLongBlock error", new Object[0]);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.tbuprofen.adapter.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class C0496b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f9623a = new b(null);

        static {
            t2o.a(824180751);
        }
    }

    static {
        t2o.a(824180749);
    }

    public /* synthetic */ b(a aVar) {
        this();
    }

    public static /* synthetic */ lur a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lur) ipChange.ipc$dispatch("5c05767a", new Object[]{bVar});
        }
        return bVar.d;
    }

    public static b b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("fcecdb35", new Object[0]);
        }
        return C0496b.f9623a;
    }

    public synchronized boolean c(Context context, com.taobao.android.tbuprofen.adapter.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34cae86c", new Object[]{this, context, aVar})).booleanValue();
        } else if (this.f9621a) {
            return true;
        } else {
            urr.a("TBProfHelper", "init", new Object[0]);
            this.f9621a = true;
            aVar.getClass();
            zrr.d(new xrr());
            TBProfConfig.k(context);
            urr.e(new p5s(TBProfConfig.f(0)));
            if (!TBProfConfig.m() || TBProfConfig.a()) {
                if (aVar.d == null) {
                    aVar.d = new lur(context, aVar);
                }
                this.d = aVar.d;
                e(context, aVar);
                d(context, aVar);
                com.taobao.android.tbuprofen.adapter.anr.b.b(context, aVar);
                return this.f9621a;
            }
            urr.b("TBProfHelper", "Can not auto start TBP in local mode.", new Object[0]);
            return false;
        }
    }

    public void d(Context context, com.taobao.android.tbuprofen.adapter.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eefd9ea", new Object[]{this, context, aVar});
            return;
        }
        if (aVar.e == null) {
            aVar.e = TBProfConfig.d();
        }
        TBProfConfig.HeapDumpConfig heapDumpConfig = aVar.e;
        if (heapDumpConfig.isEnable || heapDumpConfig.isDebug) {
            TBHeapDumper tBHeapDumper = new TBHeapDumper(context, this.c, aVar);
            this.e = tBHeapDumper;
            tBHeapDumper.y();
            this.e.l();
        }
    }

    public boolean e(Context context, com.taobao.android.tbuprofen.adapter.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("513a0c05", new Object[]{this, context, aVar})).booleanValue();
        }
        wrr a2 = wrr.c(context, TBProfConfig.n()).e(this.d).d(TBProfConfig.f(1), TBProfConfig.f(2)).c(TBProfConfig.o()).b(TBProfConfig.p()).f(TBProfConfig.q()).a();
        this.b = a2;
        if (a2.f()) {
            this.f9621a = f();
        }
        return this.f9621a;
    }

    public b() {
        this.f9621a = false;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f704f6e", new Object[]{this})).booleanValue();
        }
        urr.f("TBProfHelper", "initPlugin", new Object[0]);
        DefaultPlugin defaultPlugin = new DefaultPlugin(this.b, TBProfConfig.i());
        this.c = defaultPlugin;
        boolean e = defaultPlugin.e();
        if (e) {
            this.c.setArgs(TBProfConfig.f(3).ordinal(), TBProfConfig.p(), TBProfConfig.q());
            this.c.m(new a());
            String[] c = TBProfConfig.c();
            if (c != null) {
                for (String str : c) {
                    urr.f("TBProfHelper", "cap=" + str, new Object[0]);
                    this.c.n(PluginCapacity.parse(str), true);
                }
            }
        } else {
            urr.g("TBProfHelper", "plugin load failed!", new Object[0]);
            this.c = null;
        }
        return e;
    }
}
