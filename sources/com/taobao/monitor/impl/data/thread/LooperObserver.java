package com.taobao.monitor.impl.data.thread;

import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.lang.reflect.Field;
import tb.nca;
import tb.o48;
import tb.zq6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LooperObserver implements Looper.Observer {
    public static final int NANOS_PER_MS = 1000000;
    public static final boolean e;
    public static final boolean f;

    /* renamed from: a  reason: collision with root package name */
    public a f11086a;
    public a b;
    public int c;
    public a d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int ASYNC = 6;
        public static final int FREEZE = 5;
        public static final int HUGE = 2;
        public static final int HUGE_THRESHOLD = 100000000;
        public static final int IDLE = 3;
        public static final int KEY = 4;
        public static final int NORMAL = 1;
        public static a r;
        public static int s;
        public static final Object t = new Object();
        public String j;
        public String k;
        public Exception l;
        public a p;
        public a q;

        /* renamed from: a  reason: collision with root package name */
        public long f11087a = -1;
        public long b = -1;
        public long c = 0;
        public long d = -1;
        public long e = -1;
        public long f = 0;
        public int g = 1;
        public int h = -1;
        public long i = -1;
        public int m = 0;
        public boolean n = false;
        public boolean o = false;

        public static a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("cc2afa1b", new Object[0]);
            }
            synchronized (t) {
                try {
                    a aVar = r;
                    if (aVar == null) {
                        return new a();
                    }
                    r = aVar.p;
                    aVar.p = null;
                    aVar.q = null;
                    s--;
                    return aVar;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51af759a", new Object[]{this});
                return;
            }
            this.f11087a = 0L;
            this.b = 0L;
            this.c = 0L;
            this.d = 0L;
            this.e = 0L;
            this.f = 0L;
            this.g = 1;
            this.h = 0;
            this.i = 0L;
            this.j = null;
            this.k = null;
            this.l = null;
            this.m = 0;
            this.n = false;
            this.o = false;
            synchronized (t) {
                try {
                    int i = s;
                    if (i < 100) {
                        this.p = r;
                        r = this;
                        s = i + 1;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "MsgRecordNode{startNanoTime=" + (this.f11087a / 1000000) + ", endNanoTime=" + (this.b / 1000000) + ", wallDuration=" + (this.c / 1000000) + ", startThreadTime=" + this.d + ", endThreadTime=" + this.e + ", cpuDuration=" + this.f + ", type=" + this.g + ", what=" + this.h + ", when=" + this.i + ", target='" + this.j + "', callback='" + this.k + "', exception=" + this.l + ", count=" + this.m + ", background=" + this.n + ", asynchronous=" + this.o + '}';
        }
    }

    static {
        try {
            e = new File("/data/local/tmp/.apm/.removeLooperObserverCluster").exists();
            f = new File("/data/local/tmp/.apm/.printEveryMsgNode").exists();
        } catch (Exception e2) {
            e2.printStackTrace();
            e = false;
            f = false;
        }
    }

    public final void a(a aVar) {
        if (f) {
            Log.e("LooperObserver", aVar.toString());
        }
        a aVar2 = this.f11086a;
        aVar.p = aVar2;
        if (aVar2 != null) {
            aVar2.q = aVar;
        }
        this.f11086a = aVar;
        if (this.b == null) {
            this.b = aVar;
        }
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        if (i2 > 200) {
            a aVar3 = this.b;
            a aVar4 = aVar3.q;
            this.b = aVar4;
            aVar3.q = null;
            aVar4.p = null;
            this.c = i;
            aVar3.b();
        }
    }

    public final void b(a aVar, Message message, Exception exc) {
        boolean isAsynchronous;
        String str;
        boolean isAsynchronous2;
        if (aVar != null) {
            long nanoTime = System.nanoTime();
            aVar.b = nanoTime;
            aVar.c = nanoTime - aVar.f11087a;
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            aVar.e = currentThreadTimeMillis;
            aVar.f = currentThreadTimeMillis - aVar.d;
            if (aVar.c >= 100000000 || e) {
                aVar.g = 2;
            }
            isAsynchronous = message.isAsynchronous();
            if (isAsynchronous) {
                aVar.g = 6;
                isAsynchronous2 = message.isAsynchronous();
                aVar.o = isAsynchronous2;
            }
            if (aVar.g != 1) {
                aVar.h = message.what;
                aVar.i = message.getWhen();
                String str2 = null;
                if (message.getTarget() == null) {
                    str = null;
                } else {
                    str = message.getTarget().getClass().getName();
                }
                aVar.j = str;
                Runnable callback = message.getCallback();
                if (callback != null) {
                    str2 = callback.getClass().getName();
                }
                aVar.k = str2;
            }
            aVar.l = exc;
            aVar.m++;
        }
    }

    public final void c(a aVar) {
        if (aVar != null) {
            int i = aVar.g;
            if (i == 2) {
                a(aVar);
                return;
            }
            a aVar2 = this.f11086a;
            if (aVar2 != null && aVar2.g == 1 && i == 1) {
                long j = aVar2.c;
                if (j <= 100000000 && aVar2.n == aVar.n) {
                    aVar2.b = aVar.b;
                    aVar2.e = aVar.e;
                    aVar2.h = -1;
                    aVar2.i = -1L;
                    aVar2.j = null;
                    aVar2.k = null;
                    aVar2.l = null;
                    aVar2.c = j + aVar.c;
                    aVar2.f += aVar.f;
                    aVar2.m++;
                    aVar.b();
                    return;
                }
            }
            a(aVar);
        }
    }

    public void dispatchingThrewException(Object obj, Message message, Exception exc) {
        if (o48.p && Thread.currentThread() == null) {
            b(this.d, message, exc);
            c(this.d);
            this.d = null;
        }
    }

    public Object messageDispatchStarting() {
        if (!o48.p || Thread.currentThread() != null) {
            return null;
        }
        a a2 = a.a();
        this.d = a2;
        a2.f11087a = System.nanoTime();
        this.d.d = SystemClock.currentThreadTimeMillis();
        this.d.n = nca.f24637a;
        return null;
    }

    public void messageDispatched(Object obj, Message message) {
        if (o48.p && Thread.currentThread() == null) {
            b(this.d, message, null);
            c(this.d);
            this.d = null;
        }
    }

    public static void init() {
        Field field;
        try {
            Field[] fieldArr = (Field[]) Class.class.getDeclaredMethod("getDeclaredFields", new Class[0]).invoke(Looper.class, new Object[0]);
            int length = fieldArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    field = null;
                    break;
                }
                field = fieldArr[i];
                if ("sObserver".equals(field.getName())) {
                    break;
                }
                i++;
            }
            field.setAccessible(true);
            field.set(null, (LooperObserver) Class.forName(LooperObserver.class.getName()).getConstructor(Object.class).newInstance(field.get(null)));
        } catch (Exception e2) {
            zq6.a("LooperObserver", e2);
        }
    }
}
