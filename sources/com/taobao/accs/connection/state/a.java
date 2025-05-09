package com.taobao.accs.connection.state;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.AccsIPCProvider;
import com.taobao.accs.AccsMainService;
import com.taobao.accs.asp.APreferencesManager;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.connection.ConnectionServiceManager;
import com.taobao.accs.connection.IChannelConnection;
import com.taobao.accs.connection.state.StateMachine;
import com.taobao.accs.connection.state.a;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.aranger.exception.IPCException;
import com.taobao.detail.rate.vivid.presenter.PreRequestPresenter;
import com.taobao.keepalive.KeepAliveManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.brt;
import tb.c0;
import tb.c71;
import tb.h;
import tb.lef;
import tb.m8l;
import tb.re;
import tb.t2o;
import tb.tv9;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a extends StateMachine {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EVENT_BOTH_ALIVE = 104;
    public static final int EVENT_CHANNEL_ENTER = 102;
    public static final int EVENT_CHANNEL_EXIT = 103;
    public static final int EVENT_MAIN_ENTER = 100;
    public static final int EVENT_MAIN_EXIT = 101;
    public static final CopyOnWriteArrayList<g> k = new CopyOnWriteArrayList<>();
    public int d;
    public IBinder.DeathRecipient e;
    public final StateMachine.a f;
    public final StateMachine.a g;
    public final StateMachine.a h;
    public final StateMachine.a i;
    public final AtomicBoolean j;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.accs.connection.state.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class C0313a extends StateMachine.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0313a() {
        }

        public static /* synthetic */ Object ipc$super(C0313a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/connection/state/ProcessStateMachine$1");
        }

        @Override // com.taobao.accs.connection.state.StateMachine.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("81677ea5", new Object[]{this});
            } else if (a.this.d() != a.l(a.this).c()) {
            } else {
                if (UtilityImpl.isMainProcess(GlobalClientInfo.getContext())) {
                    a.m(a.this);
                } else if (UtilityImpl.isChannelProcess(GlobalClientInfo.getContext())) {
                    a.n(a.this, GlobalClientInfo.getContext());
                }
            }
        }

        @Override // com.taobao.accs.connection.state.StateMachine.a
        public int c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ece12d0", new Object[]{this})).intValue();
            }
            return 0;
        }

        @Override // com.taobao.accs.connection.state.StateMachine.a
        public void d(StateMachine.Event event) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bbcffb7e", new Object[]{this, event});
                return;
            }
            int eventId = event.getEventId();
            if (eventId == 100) {
                a aVar = a.this;
                aVar.f(a.j(aVar));
            } else if (eventId == 102) {
                a aVar2 = a.this;
                aVar2.f(a.k(aVar2));
            } else if (eventId != 104) {
                ALog.e("ProcessStateMachine", "diedState rcv", "eventId", Integer.valueOf(event.getEventId()));
            } else {
                a aVar3 = a.this;
                aVar3.f(a.l(aVar3));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends StateMachine.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8982342f", new Object[0]);
                return;
            }
            Iterator it = a.o().iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                if (gVar != null) {
                    gVar.a(UtilityImpl.getChannelProcessName(GlobalClientInfo.getContext()));
                }
            }
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/connection/state/ProcessStateMachine$2");
        }

        @Override // com.taobao.accs.connection.state.StateMachine.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ccc95f5f", new Object[]{this});
            } else if (UtilityImpl.isChannelProcessAlive(GlobalClientInfo.getContext())) {
                ALog.e("ProcessStateMachine", "mainAliveState.enter()", new Object[0]);
                a.v().c(StateMachine.Event.obtain(102));
                a.m(a.this);
            }
        }

        @Override // com.taobao.accs.connection.state.StateMachine.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("81677ea5", new Object[]{this});
            } else if (a.this.d() == a.l(a.this).c()) {
                brt.d().execute(new Runnable() { // from class: tb.kym
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.b.f();
                    }
                });
            }
        }

        @Override // com.taobao.accs.connection.state.StateMachine.a
        public int c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ece12d0", new Object[]{this})).intValue();
            }
            return 1;
        }

        @Override // com.taobao.accs.connection.state.StateMachine.a
        public void d(StateMachine.Event event) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bbcffb7e", new Object[]{this, event});
            } else if (event.getEventId() != 102) {
                ALog.e("ProcessStateMachine", "mainAliveState rcv", "eventId", Integer.valueOf(event.getEventId()));
            } else {
                a aVar = a.this;
                aVar.f(a.l(aVar));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c extends StateMachine.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89904bb0", new Object[0]);
                return;
            }
            Iterator it = a.o().iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                if (gVar != null) {
                    try {
                        gVar.a(UtilityImpl.getMainProcessName(GlobalClientInfo.getContext()));
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/connection/state/ProcessStateMachine$3");
        }

        @Override // com.taobao.accs.connection.state.StateMachine.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ccc95f5f", new Object[]{this});
                return;
            }
            Context context = GlobalClientInfo.getContext();
            if (UtilityImpl.isMainProcessAlive(context)) {
                ALog.e("ProcessStateMachine", "channelAliveState.enter()", new Object[0]);
                a.v().c(StateMachine.Event.obtain(100));
                a.n(a.this, context);
            }
        }

        @Override // com.taobao.accs.connection.state.StateMachine.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("81677ea5", new Object[]{this});
            } else if (a.this.d() == a.l(a.this).c()) {
                brt.d().execute(new Runnable() { // from class: tb.lym
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.c.f();
                    }
                });
            }
        }

        @Override // com.taobao.accs.connection.state.StateMachine.a
        public int c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ece12d0", new Object[]{this})).intValue();
            }
            return 2;
        }

        @Override // com.taobao.accs.connection.state.StateMachine.a
        public void d(StateMachine.Event event) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bbcffb7e", new Object[]{this, event});
            } else if (event.getEventId() != 100) {
                ALog.e("ProcessStateMachine", "channelAliveState rcv", "eventId", Integer.valueOf(event.getEventId()));
            } else {
                a aVar = a.this;
                aVar.f(a.l(aVar));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f6047a;

        public e(Context context) {
            this.f6047a = context;
        }

        public final /* synthetic */ void b(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("62c9306c", new Object[]{this, context});
            } else if (UtilityImpl.isMainProcessAlive(context)) {
                a.this.E(context);
            } else {
                ALog.e("ProcessStateMachine", "listenToMainProcess delayed, exit", new Object[0]);
                a.v().c(StateMachine.Event.obtain(101));
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Runnable nymVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                return;
            }
            a.s(a.this).set(false);
            try {
                this.f6047a.unbindService(this);
            } catch (Throwable unused) {
                if (!UtilityImpl.isMainProcessAlive(this.f6047a)) {
                    a.q(a.this, 0);
                    ALog.e("ProcessStateMachine", "listenToMainProcess exit", new Object[0]);
                } else if (a.r(a.this) > 3) {
                    ALog.e("ProcessStateMachine", "not allow to rebind", "mListeningProcessCnt", Integer.valueOf(a.p(a.this)));
                    return;
                } else {
                    ALog.e("ProcessStateMachine", "listenToMainProcess delayed", new Object[0]);
                    final Context context = this.f6047a;
                    nymVar = new Runnable() { // from class: tb.nym
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.e.this.b(context);
                        }
                    };
                }
            }
            if (!UtilityImpl.isMainProcessAlive(this.f6047a)) {
                a.q(a.this, 0);
                ALog.e("ProcessStateMachine", "listenToMainProcess exit", new Object[0]);
                a.v().c(StateMachine.Event.obtain(101));
            } else if (a.r(a.this) > 3) {
                ALog.e("ProcessStateMachine", "not allow to rebind", "mListeningProcessCnt", Integer.valueOf(a.p(a.this)));
            } else {
                ALog.e("ProcessStateMachine", "listenToMainProcess delayed", new Object[0]);
                final Context context2 = this.f6047a;
                nymVar = new Runnable() { // from class: tb.nym
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.e.this.b(context2);
                    }
                };
                brt.m(nymVar, 3L, TimeUnit.SECONDS);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public static final a f6048a = new a(null);

        static {
            t2o.a(343933070);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface g {
        void a(String str);

        void b(String str);
    }

    static {
        t2o.a(343933064);
    }

    public /* synthetic */ a(C0313a aVar) {
        this();
    }

    public static /* synthetic */ void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a54ecf0", new Object[0]);
            return;
        }
        try {
            ((IChannelConnection) re.m(new ComponentName(GlobalClientInfo.getContext(), AccsIPCProvider.class), IChannelConnection.class, new Pair[0])).mainProcessStartUp(StateMachine.Event.obtain(100));
        } catch (IPCException e2) {
            ALog.e("ProcessStateMachine", "mainAliveState enter err", e2, new Object[0]);
        }
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == -1143997570) {
            super.e((StateMachine.Event) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/connection/state/ProcessStateMachine");
    }

    public static /* synthetic */ StateMachine.a j(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StateMachine.a) ipChange.ipc$dispatch("65fc0cf0", new Object[]{aVar});
        }
        return aVar.g;
    }

    public static /* synthetic */ StateMachine.a k(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StateMachine.a) ipChange.ipc$dispatch("19751ef1", new Object[]{aVar});
        }
        return aVar.h;
    }

    public static /* synthetic */ StateMachine.a l(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StateMachine.a) ipChange.ipc$dispatch("ccee30f2", new Object[]{aVar});
        }
        return aVar.i;
    }

    public static /* synthetic */ void m(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a59d6aa", new Object[]{aVar});
        } else {
            aVar.F();
        }
    }

    public static /* synthetic */ void n(a aVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49e3eafd", new Object[]{aVar, context});
        } else {
            aVar.G(context);
        }
    }

    public static /* synthetic */ CopyOnWriteArrayList o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("eb8f01ea", new Object[0]);
        }
        return k;
    }

    public static /* synthetic */ int p(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b9bab820", new Object[]{aVar})).intValue();
        }
        return aVar.d;
    }

    public static /* synthetic */ int q(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89a45727", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.d = i;
        return i;
    }

    public static /* synthetic */ int r(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc91eb24", new Object[]{aVar})).intValue();
        }
        int i = aVar.d + 1;
        aVar.d = i;
        return i;
    }

    public static /* synthetic */ AtomicBoolean s(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("96f3146e", new Object[]{aVar});
        }
        return aVar.j;
    }

    public static a v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("2c86d533", new Object[0]);
        }
        return f.f6048a;
    }

    public boolean A(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83c60f84", new Object[]{this, context})).booleanValue();
        }
        if (UtilityImpl.isMainProcess(context)) {
            return true;
        }
        if (!t()) {
            return UtilityImpl.isMainProcessAlive(context);
        }
        return x(context);
    }

    public final /* synthetic */ void B(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eec102cc", new Object[]{this, context});
            return;
        }
        ALog.e("ProcessStateMachine", "MainBinder died", new Object[0]);
        final int mainProcessPid = UtilityImpl.getMainProcessPid(context);
        if (mainProcessPid != -1) {
            int i = this.d + 1;
            this.d = i;
            if (i > 3) {
                ALog.e("ProcessStateMachine", "not allow to rebind", "mListeningProcessCnt", Integer.valueOf(i));
                return;
            }
            ALog.e("ProcessStateMachine", "listenToMainProcess delayed", new Object[0]);
            brt.m(new Runnable() { // from class: tb.jym
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.D(context, mainProcessPid);
                }
            }, 3L, TimeUnit.SECONDS);
            return;
        }
        this.d = 0;
        ALog.e("ProcessStateMachine", "listenToMainProcess exit", new Object[0]);
        v().c(StateMachine.Event.obtain(101));
        GlobalClientInfo.getInstance(context).setMainBinder(null);
    }

    public final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f17aa101", new Object[]{this});
        } else if (UtilityImpl.isMainProcess(GlobalClientInfo.getContext())) {
            brt.h().execute(new Runnable() { // from class: tb.iym
                @Override // java.lang.Runnable
                public final void run() {
                    a.C();
                }
            });
        }
    }

    public final void G(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b41e33bf", new Object[]{this, context});
            return;
        }
        Intent intent = new Intent(context, AccsMainService.class);
        intent.setAction(AccsMainService.ACTION_CHANNEL_STARTUP);
        intent.putExtra("event", StateMachine.Event.obtain(102));
        lef.f(context, intent);
    }

    public void H(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e12889", new Object[]{this, gVar});
        } else if (gVar != null) {
            k.add(gVar);
        }
    }

    public final boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8eb83aac", new Object[]{this})).booleanValue();
        }
        if (d() != this.f.c()) {
            return true;
        }
        return false;
    }

    public final IBinder.DeathRecipient u(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder.DeathRecipient) ipChange.ipc$dispatch("208f1c81", new Object[]{this, context});
        }
        if (this.e == null) {
            synchronized (a.class) {
                try {
                    if (this.e == null) {
                        this.e = new IBinder.DeathRecipient() { // from class: tb.hym
                            @Override // android.os.IBinder.DeathRecipient
                            public final void binderDied() {
                                a.this.B(context);
                            }
                        };
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.e;
    }

    public final boolean w() {
        try {
            IpChange ipChange = KeepAliveManager.$ipChange;
            return ((Boolean) KeepAliveManager.class.getDeclaredMethod("isInstrMode", new Class[0]).invoke(null, new Object[0])).booleanValue();
        } catch (Throwable th) {
            ALog.e("ProcessStateMachine", "instrMode err", th, new Object[0]);
            return false;
        }
    }

    public final boolean x(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d47614a3", new Object[]{this, context})).booleanValue();
        }
        if (d() == 3) {
            return true;
        }
        return false;
    }

    public boolean y(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e3be9ce", new Object[]{this, context})).booleanValue();
        }
        if (UtilityImpl.isChannelProcess(context)) {
            return true;
        }
        if (!t()) {
            return UtilityImpl.isChannelProcessAlive(context);
        }
        return x(context);
    }

    public a() {
        this.d = 0;
        C0313a aVar = new C0313a();
        this.f = aVar;
        this.g = new b();
        this.h = new c();
        this.i = new d();
        this.j = new AtomicBoolean();
        a(aVar);
    }

    public final /* synthetic */ void D(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ec6ad65", new Object[]{this, context, new Integer(i)});
            return;
        }
        int mainProcessPid = UtilityImpl.getMainProcessPid(context);
        if (mainProcessPid == i) {
            c71.a("accs", BaseMonitor.ALARM_ONLY_BINDER_DIED, BaseMonitor.ALARM_ONLY_BINDER_DIED, "-1", BaseMonitor.ALARM_ONLY_BINDER_DIED);
            E(context);
        } else if (mainProcessPid == -1) {
            ALog.e("ProcessStateMachine", "listenToMainProcess delayed, exit", new Object[0]);
            v().c(StateMachine.Event.obtain(101));
            GlobalClientInfo.getInstance(context).setMainBinder(null);
        } else {
            ALog.e("ProcessStateMachine", "main process reboot !", new Object[0]);
        }
    }

    @Override // com.taobao.accs.connection.state.StateMachine
    public void e(StateMachine.Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbcffb7e", new Object[]{this, event});
            return;
        }
        try {
            super.e(event);
        } catch (Throwable th) {
            ALog.e("ProcessStateMachine", "processEvent err", th, new Object[0]);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d extends StateMachine.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public static /* synthetic */ void f(Context context, boolean z) {
            String mainProcessName;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c54077fd", new Object[]{context, new Boolean(z)});
                return;
            }
            m8l.B();
            c0.g(context);
            Iterator it = a.o().iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                if (gVar != null) {
                    if (z) {
                        try {
                            mainProcessName = UtilityImpl.getMainProcessName(context);
                        } catch (Throwable unused) {
                        }
                    } else {
                        mainProcessName = UtilityImpl.getChannelProcessName(context);
                    }
                    gVar.b(mainProcessName);
                }
            }
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/connection/state/ProcessStateMachine$4");
        }

        @Override // com.taobao.accs.connection.state.StateMachine.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ccc95f5f", new Object[]{this});
                return;
            }
            a.q(a.this, 0);
            ALog.e("ProcessStateMachine", "bothAliveState.enter()", new Object[0]);
            if (!h.c()) {
                try {
                    a.this.E(GlobalClientInfo.getContext());
                } catch (Throwable th) {
                    ALog.e("ProcessStateMachine", "listenToMainProcess err", th, new Object[0]);
                }
            }
        }

        @Override // com.taobao.accs.connection.state.StateMachine.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("81677ea5", new Object[]{this});
                return;
            }
            final Context context = GlobalClientInfo.getContext();
            final boolean isChannelProcess = UtilityImpl.isChannelProcess(context);
            if (isChannelProcess) {
                ConnectionServiceManager.getInstance().onAppBackground();
            }
            brt.d().execute(new Runnable() { // from class: tb.mym
                @Override // java.lang.Runnable
                public final void run() {
                    a.d.f(context, isChannelProcess);
                }
            });
        }

        @Override // com.taobao.accs.connection.state.StateMachine.a
        public int c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ece12d0", new Object[]{this})).intValue();
            }
            return 3;
        }

        @Override // com.taobao.accs.connection.state.StateMachine.a
        public void d(StateMachine.Event event) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bbcffb7e", new Object[]{this, event});
                return;
            }
            int eventId = event.getEventId();
            if (eventId == 101) {
                a aVar = a.this;
                aVar.f(a.k(aVar));
            } else if (eventId != 103) {
                ALog.e("ProcessStateMachine", "bothAliveState rcv", "eventId", Integer.valueOf(event.getEventId()));
            } else {
                a aVar2 = a.this;
                aVar2.f(a.j(aVar2));
                if (UtilityImpl.isChannelProcess(GlobalClientInfo.getContext())) {
                    ALog.e("ProcessStateMachine", "channel received 'EVENT_CHANNEL_EXIT'", new Object[0]);
                    c71.c("accs", BaseMonitor.COUNT_VERIFY, "process_machine_ce", vu3.b.GEO_NOT_SUPPORT);
                }
            }
        }
    }

    public void E(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91e3972d", new Object[]{this, context});
        } else if (UtilityImpl.isChannelProcess(context)) {
            ALog.e("ProcessStateMachine", "listenToMainProcess in channel", new Object[0]);
            if (h.c()) {
                IBinder mainBinder = GlobalClientInfo.getInstance(context).getMainBinder();
                if (mainBinder != null) {
                    try {
                        mainBinder.linkToDeath(u(context), 0);
                        ALog.e("ProcessStateMachine", "listenToMainProcess success", new Object[0]);
                        c71.b("accs", BaseMonitor.ALARM_LISTENER_TO_MAIN_RESULT, "");
                    } catch (Throwable th) {
                        String th2 = th.toString();
                        ALog.e("ProcessStateMachine", "linkToDeath", "err", th2);
                        c71.a("accs", BaseMonitor.ALARM_LISTENER_TO_MAIN_RESULT, "Throwable", PreRequestPresenter.SOURCE_RATE_HISTORY, th2);
                        c71.a("accs", BaseMonitor.ALARM_LISTENER_TO_MAIN_FAIL, "Throwable", PreRequestPresenter.SOURCE_RATE_HISTORY, th2);
                    }
                } else {
                    ALog.e("ProcessStateMachine", "listenToMainProcess but MainBinder null!", new Object[0]);
                    String valueOf = String.valueOf(System.currentTimeMillis());
                    c71.a("accs", BaseMonitor.ALARM_LISTENER_TO_MAIN_RESULT, "timeOut", "-1", valueOf);
                    c71.a("accs", BaseMonitor.ALARM_LISTENER_TO_MAIN_FAIL, "timeOut", "-1", valueOf);
                }
            } else if (!this.j.get() || !m8l.n()) {
                if (context.bindService(new Intent(context, AccsMainService.class), new e(context), w() ? 33 : 1)) {
                    this.j.set(true);
                }
            } else {
                ALog.e("ProcessStateMachine", "listenToMainProcess ing", new Object[0]);
            }
        }
    }

    public boolean z(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17c2f08f", new Object[]{this, context})).booleanValue();
        }
        if (!A(context)) {
            return false;
        }
        if (UtilityImpl.isMainProcess(context)) {
            return tv9.h().k();
        }
        int i = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).getInt(Constants.SP_KEY_MAIN_CREATED_PID, 0);
        int mainProcessPid = UtilityImpl.getMainProcessPid(context);
        boolean z = mainProcessPid > 0 && mainProcessPid == i;
        ALog.e("ProcessStateMachine", "isMainActivityCreated", "result", Boolean.valueOf(z));
        return z;
    }
}
