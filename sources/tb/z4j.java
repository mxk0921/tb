package tb;

import android.text.TextUtils;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.util.ALog;
import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.statistics.OrangeRecoverStat;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class z4j implements ewc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Long> f32525a = new HashMap();
    public int b = 0;
    public boolean c = false;
    public boolean d = false;
    public int e = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f32526a;
        public final /* synthetic */ long b;

        public a(String str, long j) {
            this.f32526a = str;
            this.b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            z4j.c(z4j.this).put(this.f32526a, Long.valueOf(this.b));
            AppMonitor.getInstance().commitCount(new f7j("sign_start"));
            mhj.b(new e(this.f32526a), 10000L, TimeUnit.MILLISECONDS);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements NetworkCallBack.FinishListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ OrangeRecoverStat f32528a;
        public final /* synthetic */ long b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ NetworkEvent.FinishEvent f32529a;

            public a(NetworkEvent.FinishEvent finishEvent) {
                this.f32529a = finishEvent;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                int httpCode = this.f32529a.getHttpCode();
                if (httpCode == 200) {
                    ALog.e("npm.MtopDetector", "[tryRecoverOrange]request is ok.", null, new Object[0]);
                    z4j.e(z4j.this, true);
                    c.this.f32528a.ret = 1;
                } else {
                    c.this.f32528a.ret = 0;
                    ALog.e("npm.MtopDetector", "[tryRecoverOrange]request error.", null, "httpCode", Integer.valueOf(httpCode));
                }
                OrangeRecoverStat orangeRecoverStat = c.this.f32528a;
                orangeRecoverStat.statusCode = httpCode;
                orangeRecoverStat.totalTime = System.currentTimeMillis() - c.this.b;
                AppMonitor.getInstance().commitStat(c.this.f32528a);
                z4j.g(z4j.this, false);
            }
        }

        public c(OrangeRecoverStat orangeRecoverStat, long j) {
            this.f32528a = orangeRecoverStat;
            this.b = j;
        }

        @Override // anetwork.channel.NetworkCallBack.FinishListener
        public void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a00910e8", new Object[]{this, finishEvent, obj});
            } else {
                mhj.a(new a(finishEvent));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final z4j f32530a = new z4j();

        public static /* synthetic */ z4j a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (z4j) ipChange.ipc$dispatch("98a3b4ad", new Object[0]);
            }
            return f32530a;
        }
    }

    public static /* synthetic */ Map c(z4j z4jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("75f033db", new Object[]{z4jVar});
        }
        return z4jVar.f32525a;
    }

    public static /* synthetic */ boolean d(z4j z4jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fdc6f62b", new Object[]{z4jVar})).booleanValue();
        }
        return z4jVar.c;
    }

    public static /* synthetic */ boolean e(z4j z4jVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2eadc54f", new Object[]{z4jVar, new Boolean(z)})).booleanValue();
        }
        z4jVar.c = z;
        return z;
    }

    public static /* synthetic */ boolean f(z4j z4jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd50902c", new Object[]{z4jVar})).booleanValue();
        }
        return z4jVar.d;
    }

    public static /* synthetic */ boolean g(z4j z4jVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20576b6e", new Object[]{z4jVar, new Boolean(z)})).booleanValue();
        }
        z4jVar.d = z;
        return z;
    }

    public static /* synthetic */ int h(z4j z4jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fcda2a1c", new Object[]{z4jVar})).intValue();
        }
        return z4jVar.b;
    }

    public static /* synthetic */ int i(z4j z4jVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1200d1ab", new Object[]{z4jVar, new Integer(i)})).intValue();
        }
        z4jVar.b = i;
        return i;
    }

    public static /* synthetic */ int j(z4j z4jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8ab5c24", new Object[]{z4jVar})).intValue();
        }
        int i = z4jVar.b;
        z4jVar.b = 1 + i;
        return i;
    }

    public static /* synthetic */ int k(z4j z4jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc63c41d", new Object[]{z4jVar})).intValue();
        }
        return z4jVar.e;
    }

    public static /* synthetic */ int l(z4j z4jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a834f625", new Object[]{z4jVar})).intValue();
        }
        int i = z4jVar.e;
        z4jVar.e = 1 + i;
        return i;
    }

    public static /* synthetic */ void m(z4j z4jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbed5e2b", new Object[]{z4jVar});
        } else {
            z4jVar.o();
        }
    }

    public static z4j n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z4j) ipChange.ipc$dispatch("5ce7ad72", new Object[0]);
        }
        return d.a();
    }

    @Override // tb.ewc
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4700576", new Object[]{this, str});
        } else if (qxn.f() && !TextUtils.isEmpty(str)) {
            mhj.a(new a(str, System.currentTimeMillis()));
        }
    }

    @Override // tb.ewc
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5541eb41", new Object[]{this, str});
        } else if (qxn.f() && !TextUtils.isEmpty(str)) {
            mhj.a(new b(str, System.currentTimeMillis()));
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75404bbe", new Object[]{this});
        } else {
            new DegradableNetwork(ktj.b()).asyncSend(new RequestImpl("http://guide-acs.m.taobao.com/gw/mtop.taobao.aserver.concurrent.count/2.0"), null, null, new c(new OrangeRecoverStat(), System.currentTimeMillis()));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f32531a;

        public e(String str) {
            this.f32531a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (qxn.f()) {
                Long l = (Long) z4j.c(z4j.this).remove(this.f32531a);
                if (l == null || System.currentTimeMillis() - l.longValue() < 10000) {
                    z4j.i(z4j.this, 0);
                } else {
                    z4j.j(z4j.this);
                    AppMonitor.getInstance().commitCount(new f7j("more_10s"));
                    ALog.e("npm.MtopDetector", "sign error, cost >10s.", null, "falcoId", this.f32531a);
                }
                if (!z4j.f(z4j.this) && z4j.h(z4j.this) >= 5 && !z4j.d(z4j.this) && z4j.k(z4j.this) < 3) {
                    z4j.m(z4j.this);
                    z4j.g(z4j.this, true);
                    z4j.i(z4j.this, 0);
                    z4j.l(z4j.this);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f32527a;
        public final /* synthetic */ long b;

        public b(String str, long j) {
            this.f32527a = str;
            this.b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            AppMonitor.getInstance().commitCount(new f7j("sign_finish"));
            Long l = (Long) z4j.c(z4j.this).remove(this.f32527a);
            if (l != null) {
                long longValue = this.b - l.longValue();
                if (longValue >= 0) {
                    if (longValue <= 1000) {
                        str = "less_1s";
                    } else if (longValue <= 2000) {
                        str = "1_2s";
                    } else if (longValue <= 3000) {
                        str = "2_3s";
                    } else if (longValue <= Constants.STARTUP_TIME_LEVEL_1) {
                        str = "3_4s";
                    } else if (longValue <= 5000) {
                        str = "4_5s";
                    } else if (longValue <= 10000) {
                        ALog.e("npm.MtopDetector", "sign cost >5s.", null, "falcoId", this.f32527a);
                        str = "5_10s";
                    } else {
                        ALog.e("npm.MtopDetector", "sign cost >10s.", null, "falcoId", this.f32527a);
                        str = "more_10s";
                    }
                    AppMonitor.getInstance().commitCount(new f7j(str));
                }
            }
        }
    }
}
