package com.taobao.android.tbuprofen.adapter.anr;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import com.taobao.android.tcrash.UncaughtCrashType;
import java.util.Iterator;
import java.util.LinkedList;
import tb.adk;
import tb.mur;
import tb.t2o;
import tb.urr;
import tb.wsa;
import tb.y74;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class AsyncSharedPreferences {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static adk f9614a = null;
    public static adk b = null;
    public static Object c = null;
    public static Object d = null;
    public static HandlerThread e = null;
    public static boolean f = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class ProxyLinkList<E> extends LinkedList<Runnable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final boolean isWork = false;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Runnable f9615a;

            public a(Runnable runnable) {
                this.f9615a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    this.f9615a.run();
                }
            }
        }

        static {
            t2o.a(824180759);
        }

        public ProxyLinkList() {
        }

        public static /* synthetic */ Object ipc$super(ProxyLinkList proxyLinkList, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbuprofen/adapter/anr/AsyncSharedPreferences$ProxyLinkList");
        }

        @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
        public boolean remove(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ec2dfe2b", new Object[]{this, obj})).booleanValue();
            }
            return true;
        }

        public boolean add(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bdcb2a", new Object[]{this, runnable})).booleanValue();
            }
            if (this.isWork) {
                mur.b().a(new a(runnable));
            }
            return true;
        }

        @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
        public int size() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
            }
            if (this.isWork && Build.VERSION.SDK_INT >= 31) {
                synchronized (AsyncSharedPreferences.b()) {
                    try {
                        try {
                            if (!AsyncSharedPreferences.c()) {
                                urr.b("AsyncSharedPreferences", "proxy sWork failed", new Object[0]);
                            } else {
                                urr.b("AsyncSharedPreferences", "proxy sWork again!!!", new Object[0]);
                            }
                        } catch (Exception e) {
                            urr.c("AsyncSharedPreferences", e, "proxy sWork exception", new Object[0]);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return 0;
        }

        public ProxyLinkList(LinkedList<Runnable> linkedList) {
            if (linkedList != null) {
                Iterator<Runnable> it = linkedList.iterator();
                while (it.hasNext()) {
                    add(it.next());
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int MSG_CHECK_HOOK = 12331;

        static {
            t2o.a(824180758);
        }

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbuprofen/adapter/anr/AsyncSharedPreferences$ProxyHandler");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            if (message.what == 12331) {
                UncaughtCrashHeader uncaughtCrashHeader = (UncaughtCrashHeader) message.obj;
                if (AsyncSharedPreferences.a() instanceof Handler) {
                    ((Handler) AsyncSharedPreferences.a()).removeMessages(1);
                }
                uncaughtCrashHeader.addHeaderInfo("TBP_SP_HOOK_HANDLER", y74.g(System.currentTimeMillis()));
            }
        }
    }

    static {
        t2o.a(824180757);
    }

    public static /* synthetic */ Object a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7d600c9b", new Object[0]);
        }
        return d;
    }

    public static /* synthetic */ Object b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("79619b7a", new Object[0]);
        }
        return c;
    }

    public static /* synthetic */ boolean c() throws IllegalAccessException, NoSuchFieldException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26a27dfd", new Object[0])).booleanValue();
        }
        return f();
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12e473e5", new Object[0]);
            return;
        }
        try {
            Object obj = c;
            if (obj != null) {
                synchronized (obj) {
                    adk adkVar = f9614a;
                    if (adkVar != null) {
                        adkVar.f("sWork", new LinkedList());
                        f9614a.f("sFinishers", new LinkedList());
                        f9614a.f("sHandler", d);
                    }
                    HandlerThread handlerThread = e;
                    if (handlerThread != null) {
                        handlerThread.quitSafely();
                    }
                }
                UncaughtCrashHeader crashCaughtHeaderByType = TCrashSDK.instance().getCrashCaughtHeaderByType(UncaughtCrashType.ANR_ONLY);
                crashCaughtHeaderByType.addHeaderInfo("TBP_SP_OPT", "false");
                crashCaughtHeaderByType.addHeaderInfo("TBP_SP_HOOK_HANDLER", "false");
                c = null;
                e = null;
                f = false;
                urr.b("AsyncSharedPreferences", "deoptimize sp done!!!", new Object[0]);
            }
        } catch (Exception e2) {
            urr.c("AsyncSharedPreferences", e2, "doptimize sp exception", new Object[0]);
        }
    }

    public static void e() {
        adk b2;
        adk adkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be9020e4", new Object[0]);
        } else if (Build.VERSION.SDK_INT < 26) {
            urr.g("AsyncSharedPreferences", "Sp hook do not support below Android8", new Object[0]);
        } else {
            try {
                if (!f) {
                    try {
                        adk i = adk.i(Class.forName("android.app.QueuedWork"));
                        f9614a = i;
                        b2 = i.b("sLock");
                        b = f9614a.b("sWork");
                        adkVar = f9614a;
                    } catch (Exception e2) {
                        urr.c("AsyncSharedPreferences", e2, "optimize sp exception", new Object[0]);
                        if (f) {
                            return;
                        }
                    }
                    if (!(adkVar == null || b2 == null)) {
                        d = adkVar.e("getHandler", new Class[0], new Object[0]).h();
                        Object h = b2.h();
                        c = h;
                        if (!(d == null || h == null)) {
                            UncaughtCrashHeader crashCaughtHeaderByType = TCrashSDK.instance().getCrashCaughtHeaderByType(UncaughtCrashType.ANR_ONLY);
                            crashCaughtHeaderByType.addHeaderInfo("TBP_SP_OPT", "false");
                            synchronized (c) {
                                try {
                                } catch (Exception e3) {
                                    urr.c("AsyncSharedPreferences", e3, "Failed to hook QueuedWork", new Object[0]);
                                }
                                if (f()) {
                                    f9614a.f("sFinishers", new ProxyLinkList());
                                    HandlerThread a2 = wsa.a("tbp-queued-work-looper");
                                    e = a2;
                                    a2.start();
                                    f9614a.f("sHandler", new a(e.getLooper()));
                                    f = true;
                                    Object h2 = f9614a.e("getHandler", new Class[0], new Object[0]).h();
                                    if (h2 instanceof a) {
                                        Message obtain = Message.obtain();
                                        obtain.what = a.MSG_CHECK_HOOK;
                                        obtain.obj = crashCaughtHeaderByType;
                                        ((a) h2).sendMessage(obtain);
                                    } else {
                                        urr.b("AsyncSharedPreferences", "waitToFinish processPendingWork hook failed!!!", new Object[0]);
                                    }
                                    crashCaughtHeaderByType.addHeaderInfo("TBP_SP_OPT", y74.g(System.currentTimeMillis()));
                                    urr.b("AsyncSharedPreferences", "optimize sp done!!!", new Object[0]);
                                    if (f) {
                                        return;
                                    }
                                    d();
                                    return;
                                } else if (!f) {
                                    d();
                                    return;
                                } else {
                                    return;
                                }
                            }
                        }
                        urr.b("AsyncSharedPreferences", "Failed to get object", new Object[0]);
                        if (!f) {
                            d();
                            return;
                        }
                        return;
                    }
                    urr.b("AsyncSharedPreferences", "Failed to get field or method", new Object[0]);
                    if (!f) {
                        d();
                    }
                }
            } catch (Throwable th) {
                if (!f) {
                    d();
                }
                throw th;
            }
        }
    }

    public static boolean f() throws IllegalAccessException, NoSuchFieldException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("912229e8", new Object[0])).booleanValue();
        }
        Object h = b.h();
        if (h == null) {
            urr.b("AsyncSharedPreferences", "Failed to get sWork object", new Object[0]);
            return false;
        }
        f9614a.f("sWork", new ProxyLinkList((LinkedList) h));
        return true;
    }
}
