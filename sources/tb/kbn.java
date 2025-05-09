package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.index.SoIndexAdvanced;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.d;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kbn implements igd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cgd f22538a;
    public final com.taobao.android.remoteso.index.d b;
    public final b7o c;
    public final d d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements gk4<c, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: b */
        public Void a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("28971608", new Object[]{this, cVar});
            }
            RSoLog.d("RSoPreSettle,performPreSettle, data from  provider ");
            kbn.a(kbn.this, cVar);
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f22540a;

        public b(c cVar) {
            this.f22540a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            List<String> b = trq.b(c.c(this.f22540a));
            if (b.isEmpty()) {
                RSoLog.d("RSoPreSettle,schedulePreSettleTask,  skip,   whiteList is empty");
                return;
            }
            RSoLog.d("RSoPreSettle,schedulePreSettleTask,  libNameWhiteList=" + b);
            long c = kbn.b(kbn.this).c("key_presettle_request_interval", 10000L);
            for (String str : b) {
                if (kbn.c(kbn.this, str, c.a(this.f22540a), c.b(this.f22540a))) {
                    uos.f(c);
                }
            }
            kbn.d(kbn.this).set(false);
            RSoLog.d("RSoPreSettle,schedulePreSettleTask,  finish ");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f22541a;
        public final SoIndexData b;
        public final SoIndexAdvanced c;

        public c(String str, SoIndexData soIndexData, SoIndexAdvanced soIndexAdvanced) {
            this.f22541a = str;
            this.b = soIndexData;
            this.c = soIndexAdvanced;
        }

        public static /* synthetic */ SoIndexData a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SoIndexData) ipChange.ipc$dispatch("9cc14f72", new Object[]{cVar});
            }
            return cVar.b;
        }

        public static /* synthetic */ SoIndexAdvanced b(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SoIndexAdvanced) ipChange.ipc$dispatch("54e4c33b", new Object[]{cVar});
            }
            return cVar.c;
        }

        public static /* synthetic */ String c(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("86963bd4", new Object[]{cVar});
            }
            return cVar.f22541a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface d {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class e implements d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.remoteso.resolver2.d.a
        public void a(a7o a7oVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("def47b8e", new Object[]{this, a7oVar});
                return;
            }
            RSoLog.d("RSoPreSettle,performPreSettle,  resolve result = " + a7oVar);
        }
    }

    public kbn(cgd cgdVar, com.taobao.android.remoteso.index.d dVar, b7o b7oVar, d dVar2) {
        this.f22538a = cgdVar;
        this.b = dVar;
        this.c = b7oVar;
        this.d = dVar2;
    }

    public static /* synthetic */ void a(kbn kbnVar, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ce2e58b", new Object[]{kbnVar, cVar});
        } else {
            kbnVar.g(cVar);
        }
    }

    public static /* synthetic */ cgd b(kbn kbnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cgd) ipChange.ipc$dispatch("a1a5c75f", new Object[]{kbnVar});
        }
        return kbnVar.f22538a;
    }

    public static /* synthetic */ boolean c(kbn kbnVar, String str, SoIndexData soIndexData, SoIndexAdvanced soIndexAdvanced) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60a9abea", new Object[]{kbnVar, str, soIndexData, soIndexAdvanced})).booleanValue();
        }
        return kbnVar.e(str, soIndexData, soIndexAdvanced);
    }

    public static /* synthetic */ AtomicBoolean d(kbn kbnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("3c2e0af3", new Object[]{kbnVar});
        }
        return kbnVar.e;
    }

    public final c f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("af549e35", new Object[]{this});
        }
        String b2 = bg4.b(this.f22538a, "preSettleLibs");
        if (trq.c(b2)) {
            RSoLog.d("RSoPreSettle,performPreSettle,skip,   StringUtils.isEmpty(preSettleLibs)");
            return null;
        }
        SoIndexData soIndexData = (SoIndexData) bg4.a(this.f22538a, "preSettleIndex", SoIndexData.class);
        if (soIndexData != null) {
            return new c(b2, soIndexData, (SoIndexAdvanced) bg4.a(this.f22538a, "preSettleIndex2", SoIndexAdvanced.class));
        }
        RSoLog.d("RSoPreSettle,performPreSettle,skip,   preSettleIndex == null");
        return null;
    }

    @Override // tb.igd
    public void trigger() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7573e3f", new Object[]{this});
            return;
        }
        RSoLog.d("RSoPreSettle,trigger enter");
        try {
            if (!this.f22538a.a("key_presettle_enabled", true)) {
                RSoLog.d("RSoPreSettle,trigger, skipped,  not enabled in config ");
                return;
            }
            c f = f();
            if (f != null) {
                RSoLog.d("RSoPreSettle,performPreSettle, data from config");
                g(f);
                return;
            }
            ((t9t) this.d).a(new a());
        } catch (Throwable th) {
            rbn.g("RSoPreSettle,trigger", th);
        }
    }

    public final boolean e(String str, SoIndexData soIndexData, SoIndexAdvanced soIndexAdvanced) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f4a7760", new Object[]{this, str, soIndexData, soIndexAdvanced})).booleanValue();
        }
        if (trq.c(str)) {
            return false;
        }
        SoIndexData.SoFileInfo l = this.b.l(str, soIndexData);
        if (l == null) {
            RSoLog.d("RSoPreSettle,doPreSettle,  presettle data not include lib=" + str);
            return false;
        } else if (!trq.d("Remote", l.getFrom())) {
            RSoLog.d("RSoPreSettle,doPreSettle,  not remote lib=" + str);
            return false;
        } else {
            RSoLog.d("RSoPreSettle,doPreSettle,  ready to resolveOneResult, " + str);
            z6o i = z6o.i(str, l, this.b.j(str, soIndexAdvanced));
            i.m("presettle");
            try {
                this.c.i(i, new e());
                return true;
            } catch (Throwable th) {
                rbn.g("RSoPreSettle,doPreSettle", th);
                return false;
            }
        }
    }

    public final void g(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a1fb975", new Object[]{this, cVar});
        } else if (!this.e.compareAndSet(false, true)) {
            RSoLog.d("RSoPreSettle,dataProvider,consume,  skipped.  processing ");
        } else {
            RSoLog.d("RSoPreSettle,schedulePreSettleTask enter");
            this.b.r(c.a(cVar), c.b(cVar));
            RSoLog.d("RSoPreSettle,schedulePreSettleTask,  markDataAvailable finish ");
            long c2 = this.f22538a.c("key_presettle_delay", 60000L);
            long random = ((long) (Math.random() * c2)) + 60000;
            qbn.e(new b(cVar), random);
            RSoLog.d("RSoPreSettle,schedulePreSettleTask, submit task done,  configDelay=" + c2 + ", actualDelay=" + random);
        }
    }
}
