package tb;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.common.BundleMap;
import com.taobao.monitor.procedure.ProcedureImpl;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wxm implements odd, j8e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ADD_BIZ = 4;
    public static final int ADD_BIZ_AB_TEST = 5;
    public static final int ADD_BIZ_STAGE = 6;
    public static final int BEGIN = 0;
    public static final int END = 10;
    public static final int EVENT = 1;
    public static final int STAGE = 2;

    /* renamed from: a  reason: collision with root package name */
    public final ProcedureImpl f30992a;
    public final Handler b;
    public final Handler c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f30993a;
        public final /* synthetic */ Object b;

        public a(String str, Object obj) {
            this.f30993a = str;
            this.b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                wxm.w(wxm.this).a(this.f30993a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f30994a;
        public final /* synthetic */ Object b;

        public b(String str, Object obj) {
            this.f30994a = str;
            this.b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                wxm.w(wxm.this).l(this.f30994a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f30995a;
        public final /* synthetic */ Object b;

        public c(String str, Object obj) {
            this.f30995a = str;
            this.b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                wxm.w(wxm.this).u(this.f30995a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f30996a;
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;

        public d(String str, long j, long j2) {
            this.f30996a = str;
            this.b = j;
            this.c = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                wxm.w(wxm.this).i(this.f30996a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f30997a;
        public final /* synthetic */ long b;

        public e(String str, long j) {
            this.f30997a = str;
            this.b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                wxm.w(wxm.this).g(this.f30997a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f30998a;
        public final /* synthetic */ long b;
        public final /* synthetic */ Map c;

        public f(String str, long j, Map map) {
            this.f30998a = str;
            this.b = j;
            this.c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                wxm.w(wxm.this).n(this.f30998a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f30999a;
        public final /* synthetic */ long b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Map d;

        public g(String str, long j, String str2, Map map) {
            this.f30999a = str;
            this.b = j;
            this.c = str2;
            this.d = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ProcedureImpl w = wxm.w(wxm.this);
            String str2 = this.f30999a;
            long j = this.b;
            if (TextUtils.isEmpty(this.c)) {
                str = "UNKNOWN";
            } else {
                str = this.c;
            }
            w.k(str2, j, str, this.d);
        }
    }

    public wxm(ProcedureImpl procedureImpl) {
        if (procedureImpl != null) {
            this.f30992a = procedureImpl;
            w9a g2 = w9a.g();
            this.b = new h(g2.f().getLooper());
            this.c = g2.f();
            return;
        }
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ ProcedureImpl w(wxm wxmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProcedureImpl) ipChange.ipc$dispatch("74686c4b", new Object[]{wxmVar});
        }
        return wxmVar.f30992a;
    }

    @Override // tb.mdd
    public mdd a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("97fa7e26", new Object[]{this, str, obj});
        }
        x(new a(str, obj));
        return this;
    }

    @Override // tb.mdd
    public mdd b(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("710326c5", new Object[]{this, str, map});
        }
        Message obtain = Message.obtain();
        obtain.what = 4;
        obtain.obj = this.f30992a;
        Bundle bundle = new Bundle();
        bundle.putString("bizID", str);
        bundle.putSerializable(wua.KEY_PROPERTIES, new BundleMap(map));
        obtain.setData(bundle);
        this.b.sendMessage(obtain);
        return this;
    }

    @Override // tb.mdd
    public mdd c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("73340a13", new Object[]{this});
        }
        Message obtain = Message.obtain();
        obtain.what = 0;
        obtain.obj = this.f30992a;
        this.b.sendMessage(obtain);
        return this;
    }

    @Override // tb.mdd
    public mdd e(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("4c31e53a", new Object[]{this, str, map});
        }
        return n(str, SystemClock.uptimeMillis(), map);
    }

    @Override // tb.mdd
    public mdd end() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("7daf1745", new Object[]{this});
        }
        Message obtain = Message.obtain();
        obtain.what = 10;
        obtain.obj = this.f30992a;
        this.b.sendMessage(obtain);
        return this;
    }

    @Override // tb.odd
    public void f(mdd mddVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5409f598", new Object[]{this, mddVar});
        } else {
            this.f30992a.f(mddVar);
        }
    }

    @Override // tb.mdd
    public mdd g(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("b8132913", new Object[]{this, str, new Long(j)});
        }
        x(new e(str, j));
        return this;
    }

    @Override // tb.mdd
    public mdd h(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("bdeff6b2", new Object[]{this, str, map});
        }
        Message obtain = Message.obtain();
        obtain.what = 5;
        obtain.obj = this.f30992a;
        Bundle bundle = new Bundle();
        bundle.putString("bizID", str);
        bundle.putSerializable("abTest", new BundleMap(map));
        obtain.setData(bundle);
        this.b.sendMessage(obtain);
        return this;
    }

    @Override // tb.mdd
    public mdd i(String str, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("d3a54738", new Object[]{this, str, new Long(j), new Long(j2)});
        }
        x(new d(str, j, j2));
        return this;
    }

    @Override // tb.mdd
    public boolean isAlive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c89930ce", new Object[]{this})).booleanValue();
        }
        return this.f30992a.isAlive();
    }

    @Override // tb.mdd
    public mdd k(String str, long j, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("123baf2f", new Object[]{this, str, new Long(j), str2, map});
        }
        x(new g(str, j, str2, map));
        return this;
    }

    @Override // tb.mdd
    public mdd l(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("48dfa2fc", new Object[]{this, str, obj});
        }
        x(new b(str, obj));
        return this;
    }

    @Override // tb.mdd
    public mdd m(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("3de93262", new Object[]{this, str, new Long(j)});
        }
        Message obtain = Message.obtain();
        obtain.what = 12;
        obtain.obj = this.f30992a;
        Bundle bundle = new Bundle();
        bundle.putString("name", str);
        bundle.putLong("timestamp", j);
        obtain.setData(bundle);
        this.b.sendMessage(obtain);
        return this;
    }

    @Override // tb.mdd
    public mdd n(String str, long j, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("d027d992", new Object[]{this, str, new Long(j), map});
        }
        x(new f(str, j, map));
        return this;
    }

    @Override // tb.mdd
    public mdd o(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("15eafc4b", new Object[]{this, str, map});
        }
        Message obtain = Message.obtain();
        obtain.what = 6;
        obtain.obj = this.f30992a;
        Bundle bundle = new Bundle();
        bundle.putString("bizID", str);
        bundle.putSerializable(v4s.PARAM_UPLOAD_STAGE, new BundleMap(map));
        obtain.setData(bundle);
        this.b.sendMessage(obtain);
        return this;
    }

    @Override // tb.mdd
    public mdd p(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("4c7abda9", new Object[]{this, str, str2, map});
        }
        return k(str, SystemClock.uptimeMillis(), str2, map);
    }

    @Override // tb.mdd
    public mdd q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("c494e695", new Object[]{this, new Boolean(z)});
        }
        Message obtain = Message.obtain();
        obtain.what = 11;
        obtain.obj = this.f30992a;
        Bundle bundle = new Bundle();
        bundle.putBoolean("force", z);
        obtain.setData(bundle);
        this.b.sendMessage(obtain);
        return this;
    }

    @Override // tb.mdd
    public String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6d369af2", new Object[]{this});
        }
        return this.f30992a.r();
    }

    @Override // tb.j8e
    public void s(r1w r1wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb010b8e", new Object[]{this, r1wVar});
        } else {
            this.f30992a.s(r1wVar);
        }
    }

    @Override // tb.odd
    public void t(mdd mddVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b894d715", new Object[]{this, mddVar});
        } else {
            this.f30992a.t(mddVar);
        }
    }

    @Override // tb.mdd
    public mdd u(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("e3faa03f", new Object[]{this, str, obj});
        }
        x(new c(str, obj));
        return this;
    }

    @Override // tb.mdd
    public mdd v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("d292def7", new Object[]{this, str});
        }
        return g(str, SystemClock.uptimeMillis());
    }

    public final void x(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3d03401", new Object[]{this, runnable});
        } else {
            this.c.post(runnable);
        }
    }

    public mdd y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("14efc3b", new Object[]{this});
        }
        return this.f30992a;
    }

    @Override // tb.mdd
    public mdd d(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("d85a89dd", new Object[]{this, str, map});
        }
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = this.f30992a;
        Bundle bundle = new Bundle();
        bundle.putString("name", str);
        bundle.putSerializable("events", new BundleMap(map));
        obtain.setData(bundle);
        this.b.sendMessage(obtain);
        return this;
    }

    @Override // tb.mdd
    public mdd j(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("f8564df8", new Object[]{this, str, new Long(j)});
        }
        Message obtain = Message.obtain();
        obtain.what = 2;
        obtain.obj = this.f30992a;
        Bundle bundle = new Bundle();
        bundle.putString("name", str);
        bundle.putLong("timestamp", j);
        obtain.setData(bundle);
        this.b.sendMessage(obtain);
        return this;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class h extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/monitor/procedure/ProcedureProxy$ProcedureHandler");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            try {
                int i = message.what;
                if (i == 0) {
                    ((ProcedureImpl) message.obj).c();
                } else if (i == 1) {
                    Bundle data = message.getData();
                    ((ProcedureImpl) message.obj).d(data.getString("name"), ((BundleMap) data.getSerializable("events")).getData());
                } else if (i == 2) {
                    Bundle data2 = message.getData();
                    ((ProcedureImpl) message.obj).j(data2.getString("name"), data2.getLong("timestamp"));
                } else if (i == 4) {
                    Bundle data3 = message.getData();
                    ((ProcedureImpl) message.obj).b(data3.getString("bizID"), ((BundleMap) data3.getSerializable(wua.KEY_PROPERTIES)).getData());
                } else if (i == 5) {
                    Bundle data4 = message.getData();
                    ((ProcedureImpl) message.obj).h(data4.getString("bizID"), ((BundleMap) data4.getSerializable("abTest")).getData());
                } else if (i != 6) {
                    switch (i) {
                        case 10:
                            ((ProcedureImpl) message.obj).end();
                            break;
                        case 11:
                            ((ProcedureImpl) message.obj).q(message.getData().getBoolean("force"));
                            break;
                        case 12:
                            Bundle data5 = message.getData();
                            ((ProcedureImpl) message.obj).m(data5.getString("name"), data5.getLong("timestamp"));
                            break;
                    }
                } else {
                    Bundle data6 = message.getData();
                    ((ProcedureImpl) message.obj).o(data6.getString("bizID"), ((BundleMap) data6.getSerializable(v4s.PARAM_UPLOAD_STAGE)).getData());
                }
            } catch (Exception e) {
                zq6.a("ProcedureProxy", e);
            }
        }
    }
}
