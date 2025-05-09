package com.taobao.themis.pub_kit.teenager_protect;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Handler;
import com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.utils.CommonExtKt;
import com.taobao.trtc.api.TrtcConstants;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmInline;
import tb.a07;
import tb.ckf;
import tb.g1a;
import tb.njg;
import tb.p8s;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class PubTimeLock {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final PubTimeLock INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final njg f13737a = kotlin.a.b(PubTimeLock$PUB_TIME_LOCK_DURATION$2.INSTANCE);
    public static final njg b = kotlin.a.b(PubTimeLock$DELAY_DURATION$2.INSTANCE);
    public static final Application c;
    public static final Handler d;
    public static final Set<b> e;
    public static long f;
    public static final Runnable g;
    public static long h;
    public static TimeLockStatus i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/taobao/themis/pub_kit/teenager_protect/PubTimeLock$TimeLockStatus;", "", "status", "", "(Ljava/lang/String;II)V", "getStatus", "()I", "UNLOCK", Configuration.RUNNING, "PAUSE", "RESET_LOCK", "MAX_LOCK", "themis_pub_kit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class TimeLockStatus extends Enum<TimeLockStatus> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final int status;
        public static final TimeLockStatus UNLOCK = new TimeLockStatus("UNLOCK", 0, 0);
        public static final TimeLockStatus RUNNING = new TimeLockStatus(Configuration.RUNNING, 1, 1);
        public static final TimeLockStatus PAUSE = new TimeLockStatus("PAUSE", 2, 2);
        public static final TimeLockStatus RESET_LOCK = new TimeLockStatus("RESET_LOCK", 3, 3);
        public static final TimeLockStatus MAX_LOCK = new TimeLockStatus("MAX_LOCK", 4, 4);
        private static final /* synthetic */ TimeLockStatus[] $VALUES = $values();

        private static final /* synthetic */ TimeLockStatus[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TimeLockStatus[]) ipChange.ipc$dispatch("a4272c3b", new Object[0]) : new TimeLockStatus[]{UNLOCK, RUNNING, PAUSE, RESET_LOCK, MAX_LOCK};
        }

        private TimeLockStatus(String str, int i, int i2) {
            this.status = i2;
        }

        public static /* synthetic */ Object ipc$super(TimeLockStatus timeLockStatus, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub_kit/teenager_protect/PubTimeLock$TimeLockStatus");
        }

        public static TimeLockStatus valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("42dd1170", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(TimeLockStatus.class, str);
            }
            return (TimeLockStatus) valueOf;
        }

        public static TimeLockStatus[] values() {
            Object clone;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                clone = ipChange.ipc$dispatch("13343fdf", new Object[0]);
            } else {
                clone = $VALUES.clone();
            }
            return (TimeLockStatus[]) clone;
        }

        public final int getStatus() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fcf6c362", new Object[]{this})).intValue();
            }
            return this.status;
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            PubTimeLock pubTimeLock = PubTimeLock.INSTANCE;
            PubTimeLock.k(pubTimeLock);
            TMSLogger.f("PubTimeLock", "time lock init: elapsedSeconds: " + PubTimeLock.e() + ", timeLockStatus: " + PubTimeLock.j() + ", timeLockLimitDuration: " + PubTimeLock.g(pubTimeLock) + ", timeLockLoopDuration: " + PubTimeLock.c(pubTimeLock));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void a(int i);
    }

    /* compiled from: Taobao */
    @JvmInline
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a Companion = new a(null);
        public static final int b = e(0);
        public static final int c = e(1);
        public static final int d = e(2);

        /* renamed from: a  reason: collision with root package name */
        public final int f13738a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            static {
                t2o.a(845152364);
            }

            public /* synthetic */ a(a07 a07Var) {
                this();
            }

            public final int a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("3e58c391", new Object[]{this})).intValue();
                }
                return c.a();
            }

            public final int b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("3fd85c56", new Object[]{this})).intValue();
                }
                return c.b();
            }

            public final int c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("e051213d", new Object[]{this})).intValue();
                }
                return c.c();
            }

            public a() {
            }
        }

        static {
            t2o.a(845152363);
        }

        public /* synthetic */ c(int i) {
            this.f13738a = i;
        }

        public static final /* synthetic */ int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bd73009c", new Object[0])).intValue();
            }
            return c;
        }

        public static final /* synthetic */ int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ff7f10b7", new Object[0])).intValue();
            }
            return d;
        }

        public static final /* synthetic */ int c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e463d0f0", new Object[0])).intValue();
            }
            return b;
        }

        public static final /* synthetic */ c d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("ee30b869", new Object[]{new Integer(i)});
            }
            return new c(i);
        }

        public static int e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f7c3fb1c", new Object[]{new Integer(i)})).intValue();
            }
            return i;
        }

        public static boolean f(int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c8e8d10e", new Object[]{new Integer(i), obj})).booleanValue();
            }
            if ((obj instanceof c) && i == ((c) obj).j()) {
                return true;
            }
            return false;
        }

        public static final boolean g(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("16ffe02d", new Object[]{new Integer(i), new Integer(i2)})).booleanValue();
            }
            if (i == i2) {
                return true;
            }
            return false;
        }

        public static int h(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6440d9fd", new Object[]{new Integer(i)})).intValue();
            }
            return i;
        }

        public static String i(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f7de1ee5", new Object[]{new Integer(i)});
            }
            return "TimeLockType(type=" + i + ')';
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            return f(this.f13738a, obj);
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return h(this.f13738a);
        }

        public final /* synthetic */ int j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b0d22175", new Object[]{this})).intValue();
            }
            return this.f13738a;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return i(this.f13738a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(845152365);
            int[] iArr = new int[TimeLockStatus.values().length];
            iArr[TimeLockStatus.UNLOCK.ordinal()] = 1;
            iArr[TimeLockStatus.RUNNING.ordinal()] = 2;
            iArr[TimeLockStatus.PAUSE.ordinal()] = 3;
            iArr[TimeLockStatus.RESET_LOCK.ordinal()] = 4;
            iArr[TimeLockStatus.MAX_LOCK.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g1a<c, xhv> f13739a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                t2o.a(845152367);
                int[] iArr = new int[TimeLockStatus.values().length];
                iArr[TimeLockStatus.RESET_LOCK.ordinal()] = 1;
                iArr[TimeLockStatus.MAX_LOCK.ordinal()] = 2;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public e(g1a<? super c, xhv> g1aVar) {
            this.f13739a = g1aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int i = a.$EnumSwitchMapping$0[PubTimeLock.j().ordinal()];
            if (i == 1) {
                this.f13739a.invoke(c.d(c.Companion.a()));
            } else if (i != 2) {
                this.f13739a.invoke(c.d(c.Companion.c()));
            } else {
                this.f13739a.invoke(c.d(c.Companion.b()));
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f13740a;

        public f(b bVar) {
            this.f13740a = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                PubTimeLock.i().add(this.f13740a);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final g INSTANCE = new g();

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            long e = PubTimeLock.e();
            PubTimeLock pubTimeLock = PubTimeLock.INSTANCE;
            PubTimeLock.p(e + PubTimeLock.c(pubTimeLock));
            TMSLogger.f("PubTimeLock", "time lock update elapsedSeconds: " + PubTimeLock.e() + ", currentDayTimeStamp: " + PubTimeLock.b() + ", realDayTimeStamp: " + PubTimeLock.d(pubTimeLock, System.currentTimeMillis()));
            PubTimeLock.m(pubTimeLock);
            if (PubTimeLock.b() != PubTimeLock.d(pubTimeLock, System.currentTimeMillis())) {
                pubTimeLock.A();
            } else if (PubTimeLock.e() >= PubTimeLock.g(pubTimeLock)) {
                PubTimeLock.l(pubTimeLock);
            } else if (PubTimeLock.j() == TimeLockStatus.RUNNING) {
                PubTimeLock.n(pubTimeLock);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TimeLockStatus f13741a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                t2o.a(845152371);
                int[] iArr = new int[TimeLockStatus.values().length];
                iArr[TimeLockStatus.UNLOCK.ordinal()] = 1;
                iArr[TimeLockStatus.RUNNING.ordinal()] = 2;
                iArr[TimeLockStatus.PAUSE.ordinal()] = 3;
                iArr[TimeLockStatus.RESET_LOCK.ordinal()] = 4;
                iArr[TimeLockStatus.MAX_LOCK.ordinal()] = 5;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public h(TimeLockStatus timeLockStatus) {
            this.f13741a = timeLockStatus;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            PubTimeLock pubTimeLock = PubTimeLock.INSTANCE;
            if (!PubTimeLock.a(pubTimeLock, PubTimeLock.j(), this.f13741a)) {
                TMSLogger.b("PubTimeLock", "switchTo: status check failed: " + PubTimeLock.j() + " -> " + this.f13741a);
                return;
            }
            PubTimeLock.q(this.f13741a);
            int i = a.$EnumSwitchMapping$0[this.f13741a.ordinal()];
            if (i == 1) {
                TMSLogger.f("PubTimeLock", "time lock unlock");
                PubTimeLock.p(0L);
                PubTimeLock.o(PubTimeLock.d(pubTimeLock, System.currentTimeMillis()));
                PubTimeLock.f().removeCallbacks(PubTimeLock.h());
                PubTimeLock.m(pubTimeLock);
            } else if (i == 2) {
                TMSLogger.f("PubTimeLock", "time lock run");
                PubTimeLock.n(pubTimeLock);
            } else if (i == 3) {
                TMSLogger.f("PubTimeLock", "time lock pause");
                PubTimeLock.f().removeCallbacks(PubTimeLock.h());
            } else if (i == 4) {
                TMSLogger.f("PubTimeLock", "time lock reset");
                PubTimeLock.p(0L);
                PubTimeLock.o(PubTimeLock.d(pubTimeLock, System.currentTimeMillis()));
                PubTimeLock.f().removeCallbacks(PubTimeLock.h());
                PubTimeLock.m(pubTimeLock);
                for (b bVar : PubTimeLock.i()) {
                    bVar.a(c.Companion.a());
                }
                PubTimeLock.i().clear();
            } else if (i == 5) {
                TMSLogger.f("PubTimeLock", "time lock max lock");
                PubTimeLock.m(pubTimeLock);
                for (b bVar2 : PubTimeLock.i()) {
                    bVar2.a(c.Companion.b());
                }
                PubTimeLock.i().clear();
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f13742a;

        public i(b bVar) {
            this.f13742a = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                PubTimeLock.i().remove(this.f13742a);
            }
        }
    }

    static {
        Application application;
        t2o.a(845152357);
        PubTimeLock pubTimeLock = new PubTimeLock();
        INSTANCE = pubTimeLock;
        IEnvironmentService iEnvironmentService = (IEnvironmentService) p8s.b(IEnvironmentService.class);
        if (iEnvironmentService == null) {
            application = null;
        } else {
            application = iEnvironmentService.getApplicationContext();
        }
        c = application;
        d = CommonExtKt.b();
        e = new LinkedHashSet();
        f = pubTimeLock.t(System.currentTimeMillis());
        g = g.INSTANCE;
        i = TimeLockStatus.RESET_LOCK;
        pubTimeLock.B(a.INSTANCE);
    }

    public static final /* synthetic */ boolean a(PubTimeLock pubTimeLock, TimeLockStatus timeLockStatus, TimeLockStatus timeLockStatus2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15c4bec0", new Object[]{pubTimeLock, timeLockStatus, timeLockStatus2})).booleanValue();
        }
        return pubTimeLock.r(timeLockStatus, timeLockStatus2);
    }

    public static final /* synthetic */ long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("266d1664", new Object[0])).longValue();
        }
        return f;
    }

    public static final /* synthetic */ long c(PubTimeLock pubTimeLock) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f4feee3c", new Object[]{pubTimeLock})).longValue();
        }
        return pubTimeLock.s();
    }

    public static final /* synthetic */ long d(PubTimeLock pubTimeLock, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c446d046", new Object[]{pubTimeLock, new Long(j)})).longValue();
        }
        return pubTimeLock.t(j);
    }

    public static final /* synthetic */ long e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ada37a0", new Object[0])).longValue();
        }
        return h;
    }

    public static final /* synthetic */ Handler f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("513a18bf", new Object[0]);
        }
        return d;
    }

    public static final /* synthetic */ long g(PubTimeLock pubTimeLock) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("826dc424", new Object[]{pubTimeLock})).longValue();
        }
        return pubTimeLock.v();
    }

    public static final /* synthetic */ Runnable h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("d14f056e", new Object[0]);
        }
        return g;
    }

    public static final /* synthetic */ Set i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("c3b9657e", new Object[0]);
        }
        return e;
    }

    public static final /* synthetic */ TimeLockStatus j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TimeLockStatus) ipChange.ipc$dispatch("6c8aaeea", new Object[0]);
        }
        return i;
    }

    public static final /* synthetic */ void k(PubTimeLock pubTimeLock) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd8f57d2", new Object[]{pubTimeLock});
        } else {
            pubTimeLock.w();
        }
    }

    public static final /* synthetic */ void l(PubTimeLock pubTimeLock) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84d1f1b1", new Object[]{pubTimeLock});
        } else {
            pubTimeLock.x();
        }
    }

    public static final /* synthetic */ void m(PubTimeLock pubTimeLock) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5870096", new Object[]{pubTimeLock});
        } else {
            pubTimeLock.C();
        }
    }

    public static final /* synthetic */ void n(PubTimeLock pubTimeLock) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b592a", new Object[]{pubTimeLock});
        } else {
            pubTimeLock.D();
        }
    }

    public static final /* synthetic */ void o(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96f4e460", new Object[]{new Long(j)});
        } else {
            f = j;
        }
    }

    public static final /* synthetic */ void p(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c07fe70c", new Object[]{new Long(j)});
        } else {
            h = j;
        }
    }

    public static final /* synthetic */ void q(TimeLockStatus timeLockStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f92d7a8", new Object[]{timeLockStatus});
        } else {
            i = timeLockStatus;
        }
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27bd7ea1", new Object[]{this});
        } else {
            F(TimeLockStatus.RESET_LOCK);
        }
    }

    public final void B(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd6934ec", new Object[]{this, runnable});
            return;
        }
        Thread currentThread = Thread.currentThread();
        Handler handler = d;
        if (ckf.b(currentThread, handler.getLooper().getThread())) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eacd82f", new Object[]{this});
        } else {
            d.postDelayed(g, s());
        }
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else {
            F(TimeLockStatus.RUNNING);
        }
    }

    public final void F(TimeLockStatus timeLockStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4293db1", new Object[]{this, timeLockStatus});
        } else {
            B(new h(timeLockStatus));
        }
    }

    public final void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccb421cb", new Object[]{this});
        } else {
            F(TimeLockStatus.UNLOCK);
        }
    }

    public final void H(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4426d996", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, DataReceiveMonitor.CB_LISTENER);
        B(new i(bVar));
    }

    public final boolean r(TimeLockStatus timeLockStatus, TimeLockStatus timeLockStatus2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9f00f05", new Object[]{this, timeLockStatus, timeLockStatus2})).booleanValue();
        }
        int i2 = d.$EnumSwitchMapping$0[timeLockStatus2.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            throw new NoWhenBranchMatchedException();
                        } else if (timeLockStatus == TimeLockStatus.RUNNING) {
                            return true;
                        }
                    } else if (timeLockStatus != TimeLockStatus.RESET_LOCK) {
                        return true;
                    }
                } else if (timeLockStatus == TimeLockStatus.RUNNING) {
                    return true;
                }
            } else if (timeLockStatus == TimeLockStatus.UNLOCK || timeLockStatus == TimeLockStatus.PAUSE) {
                return true;
            }
        } else if (timeLockStatus == TimeLockStatus.RESET_LOCK || timeLockStatus == TimeLockStatus.MAX_LOCK) {
            return true;
        }
        return false;
    }

    public final long s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("819ebf41", new Object[]{this})).longValue();
        }
        return ((Number) b.getValue()).longValue();
    }

    public final long t(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2d0c9e1", new Object[]{this, new Long(j)})).longValue();
        }
        long j2 = 60;
        return ((((j + 28800000) / 1000) / j2) / j2) / 24;
    }

    public final void u(g1a<? super c, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2027988e", new Object[]{this, g1aVar});
            return;
        }
        ckf.g(g1aVar, "callback");
        B(new e(g1aVar));
    }

    public final long v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("338d2d29", new Object[]{this})).longValue();
        }
        return ((Number) f13737a.getValue()).longValue();
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eade21b6", new Object[]{this});
        } else {
            F(TimeLockStatus.MAX_LOCK);
        }
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else {
            F(TimeLockStatus.PAUSE);
        }
    }

    public final void z(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5de2448f", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, DataReceiveMonitor.CB_LISTENER);
        B(new f(bVar));
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9b539b", new Object[]{this});
            return;
        }
        Application application = c;
        if (application == null) {
            TMSLogger.b("PubTimeLock", "saveState: appContext is null");
            return;
        }
        SharedPreferences.Editor edit = application.getSharedPreferences("PubTimerPrefs", 0).edit();
        edit.putLong(TrtcConstants.TRTC_PARAMS_ELAPSED, h);
        edit.putLong("dayTimeStamp", f);
        edit.putInt("lockType", i.getStatus());
        edit.apply();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
        if (r0 == r4.getStatus()) goto L_0x004d;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w() {
        /*
            r6 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.themis.pub_kit.teenager_protect.PubTimeLock.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0012
            java.lang.String r2 = "c593b857"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r6
            r1.ipc$dispatch(r2, r3)
            return
        L_0x0012:
            android.app.Application r1 = com.taobao.themis.pub_kit.teenager_protect.PubTimeLock.c
            if (r1 != 0) goto L_0x001f
            java.lang.String r0 = "PubTimeLock"
            java.lang.String r1 = "saveState: appContext is null"
            com.taobao.themis.kernel.basic.TMSLogger.b(r0, r1)
            return
        L_0x001f:
            java.lang.String r2 = "PubTimerPrefs"
            android.content.SharedPreferences r0 = r1.getSharedPreferences(r2, r0)
            if (r0 != 0) goto L_0x0028
            goto L_0x006b
        L_0x0028:
            java.lang.String r1 = "elapsed"
            r2 = 0
            long r4 = r0.getLong(r1, r2)
            com.taobao.themis.pub_kit.teenager_protect.PubTimeLock.h = r4
            java.lang.String r1 = "dayTimeStamp"
            long r1 = r0.getLong(r1, r2)
            com.taobao.themis.pub_kit.teenager_protect.PubTimeLock$TimeLockStatus r3 = com.taobao.themis.pub_kit.teenager_protect.PubTimeLock.TimeLockStatus.UNLOCK
            int r4 = r3.getStatus()
            java.lang.String r5 = "lockType"
            int r0 = r0.getInt(r5, r4)
            com.taobao.themis.pub_kit.teenager_protect.PubTimeLock$TimeLockStatus r4 = com.taobao.themis.pub_kit.teenager_protect.PubTimeLock.TimeLockStatus.RESET_LOCK
            int r5 = r4.getStatus()
            if (r0 != r5) goto L_0x004f
        L_0x004d:
            r3 = r4
            goto L_0x0058
        L_0x004f:
            com.taobao.themis.pub_kit.teenager_protect.PubTimeLock$TimeLockStatus r4 = com.taobao.themis.pub_kit.teenager_protect.PubTimeLock.TimeLockStatus.MAX_LOCK
            int r5 = r4.getStatus()
            if (r0 != r5) goto L_0x0058
            goto L_0x004d
        L_0x0058:
            com.taobao.themis.pub_kit.teenager_protect.PubTimeLock.i = r3
            com.taobao.themis.pub_kit.teenager_protect.PubTimeLock r0 = com.taobao.themis.pub_kit.teenager_protect.PubTimeLock.INSTANCE
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r0.t(r3)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x006b
            r0.A()
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.pub_kit.teenager_protect.PubTimeLock.w():void");
    }
}
