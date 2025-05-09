package com.taobao.adaemon.anr;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IServiceManager;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.ServiceManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.Choreographer;
import android.view.InputEvent;
import android.view.InputEventCompatProcessor;
import android.view.InputEventReceiver;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewRootImpl;
import android.view.WindowManagerGlobal;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.LocalProcessMonitor;
import com.taobao.adaemon.anr.ANRHacker;
import com.taobao.adaemon.anr.MsgPrinter;
import com.taobao.adaemon.e;
import com.taobao.adaemon.g;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.tcrash.AnrUncaughtListener;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.atools.StaticHook;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Predicate;
import tb.b5d;
import tb.cp;
import tb.e61;
import tb.f;
import tb.f2d;
import tb.f7l;
import tb.hkq;
import tb.mf;
import tb.o41;
import tb.oxn;
import tb.s55;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ANRHacker implements MsgPrinter.b, e61 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Field A;
    public static Field B;
    public static Field C;
    public static Field D;
    public static Field E;
    public static Field F;
    public static Field G;
    public static Field H;
    public static Field I;
    public static Field J;
    public static Method K;
    public static Method L;
    public static Method M;
    public static Method N;
    public static Method O;
    public static Method P;
    public static Method Q;
    public static Method R;
    public static int S;
    public static long T;
    public static long U;
    public static String V;
    public static final StringBuilder W = new StringBuilder();
    public static volatile ANRHacker x;
    public static Field y;
    public static Field z;
    public volatile H b;
    public volatile long d;
    public volatile long e;
    public long f;
    public volatile String l;
    public volatile String m;
    public volatile MsgPrinter r;
    public Pair<b, b> s;
    public boolean t;
    public volatile long w;
    public volatile boolean c = true;
    public final AtomicLong g = new AtomicLong();
    public final AtomicBoolean h = new AtomicBoolean();
    public final AtomicBoolean i = new AtomicBoolean();
    public final AtomicBoolean j = new AtomicBoolean();
    public final AtomicBoolean k = new AtomicBoolean();
    public final Object n = new Object();
    public final Object o = new Object();
    public final CopyOnWriteArraySet<Integer> p = new CopyOnWriteArraySet<>();
    public final LinkedHashMap<Integer, Object> q = new LinkedHashMap<Integer, Object>() { // from class: com.taobao.adaemon.anr.ANRHacker.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/adaemon/anr/ANRHacker$1");
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<Integer, Object> entry) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue();
            }
            if (size() >= 100) {
                return true;
            }
            return false;
        }
    };
    public Boolean u = null;
    public int v = 1000;

    /* renamed from: a  reason: collision with root package name */
    public final Context f6135a = g.l();

    /* compiled from: Taobao */
    /* renamed from: com.taobao.adaemon.anr.ANRHacker$2  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class AnonymousClass2 extends ArrayList<Application.ActivityLifecycleCallbacks> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass2(Collection collection) {
            super(collection);
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1530880303) {
                return new Boolean(super.addAll(((Number) objArr[0]).intValue(), (Collection) objArr[1]));
            }
            if (hashCode == -1499470522) {
                return super.toArray();
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/adaemon/anr/ANRHacker$2");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$addAll$0(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2d24b5ce", new Object[]{activityLifecycleCallbacks})).booleanValue();
            }
            return activityLifecycleCallbacks instanceof b;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public boolean addAll(int i, Collection<? extends Application.ActivityLifecycleCallbacks> collection) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a4c09ed1", new Object[]{this, new Integer(i), collection})).booleanValue();
            }
            collection.removeIf(new Predicate() { // from class: tb.mb
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean lambda$addAll$0;
                    lambda$addAll$0 = ANRHacker.AnonymousClass2.lambda$addAll$0((Application.ActivityLifecycleCallbacks) obj);
                    return lambda$addAll$0;
                }
            });
            return super.addAll(i, collection);
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Object[]) ipChange.ipc$dispatch("a69fe546", new Object[]{this});
            }
            Object[] array = super.toArray();
            if (array == null) {
                return null;
            }
            int length = array.length;
            Object[] objArr = new Object[length + 2];
            if (length > 0) {
                System.arraycopy(array, 0, objArr, 1, length);
            }
            if (ANRHacker.h(ANRHacker.this) == null) {
                ANRHacker.i(ANRHacker.this, Pair.create(new b("first"), new b("last")));
            }
            objArr[0] = ANRHacker.h(ANRHacker.this).first;
            objArr[length + 1] = ANRHacker.h(ANRHacker.this).second;
            return objArr;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class IdleList extends ArrayList<MessageQueue.IdleHandler> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(349175891);
        }

        public IdleList(ArrayList<MessageQueue.IdleHandler> arrayList) {
            Iterator<MessageQueue.IdleHandler> it = arrayList.iterator();
            while (it.hasNext()) {
                add(it.next());
            }
        }

        public static /* synthetic */ Object ipc$super(IdleList idleList, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -2146825139) {
                return super.toArray((Object[]) objArr[0]);
            }
            if (hashCode == -332530133) {
                return new Boolean(super.remove(objArr[0]));
            }
            if (hashCode == 195222152) {
                return new Boolean(super.add((IdleList) objArr[0]));
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/adaemon/anr/ANRHacker$IdleList");
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ec2dfe2b", new Object[]{this, obj})).booleanValue();
            }
            if (!(obj instanceof a)) {
                Iterator<MessageQueue.IdleHandler> it = iterator();
                while (it.hasNext()) {
                    MessageQueue.IdleHandler next = it.next();
                    if (next instanceof a) {
                        a aVar = (a) next;
                        if (aVar.f6138a == obj) {
                            return super.remove(aVar);
                        }
                    }
                }
            }
            return super.remove(obj);
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public <T> T[] toArray(T[] tArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T[]) ((Object[]) ipChange.ipc$dispatch("800a0c4d", new Object[]{this, tArr}));
            }
            ANRHacker.c0(size());
            ANRHacker.f0(SystemClock.elapsedRealtime());
            ANRHacker.i0(0L);
            ANRHacker.k0(null);
            ANRHacker.l0().setLength(0);
            return (T[]) super.toArray(tArr);
        }

        public boolean add(MessageQueue.IdleHandler idleHandler) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3118e396", new Object[]{this, idleHandler})).booleanValue() : super.add((IdleList) new a(idleHandler));
        }
    }

    static {
        t2o.a(349175885);
        t2o.a(349175899);
        t2o.a(349175908);
    }

    public ANRHacker() {
        I0();
    }

    public static /* synthetic */ Field A(Field field) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("e41308e3", new Object[]{field});
        }
        z = field;
        return field;
    }

    public static /* synthetic */ Field B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("559575c3", new Object[0]);
        }
        return A;
    }

    public static /* synthetic */ Field C(Field field) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("e5495bc2", new Object[]{field});
        }
        A = field;
        return field;
    }

    public static /* synthetic */ Field D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("6a7e3e04", new Object[0]);
        }
        return C;
    }

    public static /* synthetic */ Field E(Field field) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("e67faea1", new Object[]{field});
        }
        C = field;
        return field;
    }

    public static /* synthetic */ Field F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("7f670645", new Object[0]);
        }
        return B;
    }

    public static /* synthetic */ Field G(Field field) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("e7b60180", new Object[]{field});
        }
        B = field;
        return field;
    }

    public static /* synthetic */ Field H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("944fce86", new Object[0]);
        }
        return D;
    }

    public static /* synthetic */ Field I(Field field) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("e8ec545f", new Object[]{field});
        }
        D = field;
        return field;
    }

    public static /* synthetic */ Field J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("a93896c7", new Object[0]);
        }
        return E;
    }

    public static /* synthetic */ Field K(Field field) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("ea22a73e", new Object[]{field});
        }
        E = field;
        return field;
    }

    public static /* synthetic */ Method L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("72547bd3", new Object[0]);
        }
        return P;
    }

    public static /* synthetic */ Method M(Method method) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("45197729", new Object[]{method});
        }
        P = method;
        return method;
    }

    public static /* synthetic */ Method N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("fa84bbb2", new Object[0]);
        }
        return Q;
    }

    public static /* synthetic */ Method O(Method method) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("d2068e48", new Object[]{method});
        }
        Q = method;
        return method;
    }

    public static /* synthetic */ Method P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("82b4fb91", new Object[0]);
        }
        return R;
    }

    public static /* synthetic */ Method Q(Method method) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("5ef3a567", new Object[]{method});
        }
        R = method;
        return method;
    }

    public static /* synthetic */ H R(ANRHacker aNRHacker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (H) ipChange.ipc$dispatch("7ec6ef98", new Object[]{aNRHacker});
        }
        return aNRHacker.b;
    }

    public static /* synthetic */ Method S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("579b7837", new Object[0]);
        }
        return N;
    }

    public static /* synthetic */ Method T(Method method) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("af07fe8d", new Object[]{method});
        }
        N = method;
        return method;
    }

    public static /* synthetic */ Field U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("1c800e65", new Object[0]);
        }
        return F;
    }

    public static /* synthetic */ Field V(Field field) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("e805d60", new Object[]{field});
        }
        F = field;
        return field;
    }

    public static /* synthetic */ Method W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("67fbf7f5", new Object[0]);
        }
        return L;
    }

    public static /* synthetic */ Method X(Method method) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("c8e22ccb", new Object[]{method});
        }
        L = method;
        return method;
    }

    public static /* synthetic */ Method Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("f02c37d4", new Object[0]);
        }
        return M;
    }

    public static /* synthetic */ Method Z(Method method) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("55cf43ea", new Object[]{method});
        }
        M = method;
        return method;
    }

    public static /* synthetic */ Field a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("5b3a6728", new Object[0]);
        }
        return G;
    }

    public static /* synthetic */ Field b0(Field field) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("122355fd", new Object[]{field});
        }
        G = field;
        return field;
    }

    public static /* synthetic */ int c0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e2700948", new Object[]{new Integer(i)})).intValue();
        }
        S = i;
        return i;
    }

    public static /* synthetic */ int d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bd33b565", new Object[0])).intValue();
        }
        int i = S - 1;
        S = i;
        return i;
    }

    public static /* synthetic */ long e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1c563a1", new Object[0])).longValue();
        }
        return T;
    }

    public static /* synthetic */ long f0(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a5139e9", new Object[]{new Long(j)})).longValue();
        }
        T = j;
        return j;
    }

    public static /* synthetic */ AtomicBoolean g0(ANRHacker aNRHacker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("2a7c7b9e", new Object[]{aNRHacker});
        }
        return aNRHacker.j;
    }

    public static /* synthetic */ Pair h(ANRHacker aNRHacker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("5a5f7fa4", new Object[]{aNRHacker});
        }
        return aNRHacker.s;
    }

    public static /* synthetic */ long h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7d8e7b37", new Object[0])).longValue();
        }
        return U;
    }

    public static /* synthetic */ Pair i(ANRHacker aNRHacker, Pair pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("48cdebc8", new Object[]{aNRHacker, pair});
        }
        aNRHacker.s = pair;
        return pair;
    }

    public static /* synthetic */ long i0(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("37ab1513", new Object[]{new Long(j)})).longValue();
        }
        U = j;
        return j;
    }

    public static /* synthetic */ long j(ANRHacker aNRHacker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e3c03acf", new Object[]{aNRHacker})).longValue();
        }
        return aNRHacker.v0();
    }

    public static /* synthetic */ String j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5f40969c", new Object[0]);
        }
        return V;
    }

    public static /* synthetic */ void k(ANRHacker aNRHacker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2684f149", new Object[]{aNRHacker});
        } else {
            aNRHacker.F0();
        }
    }

    public static /* synthetic */ String k0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab5cd4d0", new Object[]{str});
        }
        V = str;
        return str;
    }

    public static /* synthetic */ CopyOnWriteArraySet l(ANRHacker aNRHacker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArraySet) ipChange.ipc$dispatch("8128153f", new Object[]{aNRHacker});
        }
        return aNRHacker.p;
    }

    public static /* synthetic */ StringBuilder l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringBuilder) ipChange.ipc$dispatch("8d9dae0", new Object[0]);
        }
        return W;
    }

    public static /* synthetic */ Method m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("d3bbc056", new Object[0]);
        }
        return O;
    }

    public static /* synthetic */ String m0(ANRHacker aNRHacker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c735c7a1", new Object[]{aNRHacker});
        }
        return aNRHacker.l;
    }

    public static /* synthetic */ Method n(Method method) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("af4dec", new Object[]{method});
        }
        O = method;
        return method;
    }

    public static /* synthetic */ long n0(ANRHacker aNRHacker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2e111d4", new Object[]{aNRHacker})).longValue();
        }
        return aNRHacker.d;
    }

    public static /* synthetic */ Object o(ANRHacker aNRHacker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("92b30666", new Object[]{aNRHacker});
        }
        return aNRHacker.n;
    }

    public static /* synthetic */ AtomicBoolean o0(ANRHacker aNRHacker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("20f008e1", new Object[]{aNRHacker});
        }
        return aNRHacker.i;
    }

    public static /* synthetic */ boolean p(ANRHacker aNRHacker, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("debceddb", new Object[]{aNRHacker, str})).booleanValue();
        }
        return aNRHacker.H0(str);
    }

    public static /* synthetic */ String p0(ANRHacker aNRHacker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6dfd0cfe", new Object[]{aNRHacker});
        }
        return aNRHacker.m;
    }

    public static /* synthetic */ long q(ANRHacker aNRHacker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5a5c842", new Object[]{aNRHacker})).longValue();
        }
        return aNRHacker.e;
    }

    public static /* synthetic */ String q0(ANRHacker aNRHacker, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce074732", new Object[]{aNRHacker, str});
        }
        aNRHacker.m = str;
        return str;
    }

    public static /* synthetic */ Field r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("35f11f29", new Object[0]);
        }
        return H;
    }

    public static /* synthetic */ AtomicBoolean r0(ANRHacker aNRHacker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("6fe7bc63", new Object[]{aNRHacker});
        }
        return aNRHacker.k;
    }

    public static /* synthetic */ Field s(Field field) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("c5c4f11c", new Object[]{field});
        }
        H = field;
        return field;
    }

    public static /* synthetic */ Field t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("4ad9e76a", new Object[0]);
        }
        return I;
    }

    public static /* synthetic */ Field u(Field field) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("c6fb43fb", new Object[]{field});
        }
        I = field;
        return field;
    }

    public static ANRHacker u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ANRHacker) ipChange.ipc$dispatch("f9ef1e67", new Object[0]);
        }
        if (x == null) {
            synchronized (ANRHacker.class) {
                try {
                    if (x == null) {
                        x = new ANRHacker();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return x;
    }

    public static /* synthetic */ LinkedHashMap v(ANRHacker aNRHacker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedHashMap) ipChange.ipc$dispatch("9ffa446d", new Object[]{aNRHacker});
        }
        return aNRHacker.q;
    }

    public static /* synthetic */ Field w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("74ab77ec", new Object[0]);
        }
        return y;
    }

    public static /* synthetic */ Field x(Field field) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("c967e9b9", new Object[]{field});
        }
        y = field;
        return field;
    }

    public static /* synthetic */ AtomicLong y(ANRHacker aNRHacker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicLong) ipChange.ipc$dispatch("692bded6", new Object[]{aNRHacker});
        }
        return aNRHacker.g;
    }

    public static /* synthetic */ Object y0(String str, Object obj, Object obj2, Method method, Object[] objArr) throws Throwable {
        String name = method.getName();
        if (name.equals("getService") && objArr.length > 0 && str.equals(objArr[0])) {
            return null;
        }
        try {
            return method.invoke(obj, objArr);
        } catch (Throwable th) {
            b5d.h("ANRHacker", "closeMiuiANR invoke err", th, "mtdName", name);
            if (!(th instanceof InvocationTargetException) || th.getCause() == null) {
                throw th;
            }
            throw th.getCause();
        }
    }

    public static /* synthetic */ Field z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("40acad82", new Object[0]);
        }
        return z;
    }

    public final /* synthetic */ void A0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa5550a1", new Object[]{this});
        } else {
            t0(10000L);
        }
    }

    public final /* synthetic */ void B0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa636822", new Object[]{this});
            return;
        }
        try {
            E0();
        } catch (Throwable th) {
            s55.h("ANRHacker", "lazyInit err", th, new Object[0]);
        }
    }

    public final /* synthetic */ void D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c3b3a0b", new Object[]{this});
        } else if (SystemClock.elapsedRealtime() - this.w >= 5000) {
            try {
                synchronized (this.o) {
                    if (LocalProcessMonitor.h0().q0(this.f6135a) && !this.c) {
                        s55.i("ANRHacker", "mH quit", new Object[0]);
                        this.c = true;
                        this.b.getLooper().quit();
                    }
                }
            } catch (Throwable th) {
                s55.h("ANRHacker", "onAppBackground err", th, new Object[0]);
            }
        }
    }

    public final void E0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cba252b", new Object[]{this});
        } else {
            TCrashSDK.instance().addAnrUncaughtListener(new AnrUncaughtListener() { // from class: tb.ib
                @Override // com.taobao.android.tcrash.AnrUncaughtListener
                public final Map onAnrUncaught() {
                    Map C0;
                    C0 = ANRHacker.this.C0();
                    return C0;
                }
            });
        }
    }

    public final void F0() {
        MessageQueue queue;
        if (this.r == null) {
            synchronized (ANRHacker.class) {
                try {
                    if (this.r == null) {
                        this.r = new MsgPrinter(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.r.d();
        if (J == null) {
            try {
                Field i = StaticHook.i(MessageQueue.class, "mIdleHandlers");
                J = i;
                i.setAccessible(true);
                queue = Looper.getMainLooper().getQueue();
                if (queue != null) {
                    synchronized (queue) {
                        J.set(queue, new IdleList((ArrayList) J.get(queue)));
                    }
                    s55.i("ANRHacker", "set idle handler success", new Object[0]);
                } else {
                    s55.i("ANRHacker", "set idle handler, mainQ is null", new Object[0]);
                }
            } catch (Throwable th2) {
                s55.h("ANRHacker", "set idle handler err: ", th2, new Object[0]);
            }
        }
    }

    public final boolean G0() {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("352a56e7", new Object[]{this})).booleanValue();
        }
        if (this.u == null) {
            s55.i("ANRHacker", "mainMsgSwitch", new Object[0]);
            File file = new File("/data/local/tmp/.adaemon_main_msg");
            boolean exists = file.exists();
            this.u = Boolean.valueOf(exists);
            if (exists) {
                BufferedReader bufferedReader = null;
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                    try {
                        int parseInt = Integer.parseInt(bufferedReader2.readLine());
                        this.v = parseInt;
                        s55.i("ANRHacker", "mainMsgSwitch", "hugeMsgTimeMills", Integer.valueOf(parseInt));
                        f2d.a(bufferedReader2);
                    } catch (Exception unused) {
                        bufferedReader = bufferedReader2;
                        f2d.a(bufferedReader);
                        return this.u.booleanValue();
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        f2d.a(bufferedReader);
                        throw th;
                    }
                } catch (Exception unused2) {
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
        return this.u.booleanValue();
    }

    public final boolean H0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee92ad1d", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || str.indexOf("android.view.Choreographer$Frame") <= -1) {
            return false;
        }
        return true;
    }

    public void J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37cad717", new Object[]{this});
            return;
        }
        s55.i("ANRHacker", "onAppBackground", new Object[0]);
        this.w = SystemClock.elapsedRealtime();
        mf.k(new Runnable() { // from class: tb.kb
            @Override // java.lang.Runnable
            public final void run() {
                ANRHacker.this.D0();
            }
        }, 5000L, TimeUnit.MILLISECONDS);
    }

    public void K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c078d8ac", new Object[]{this});
            return;
        }
        s55.i("ANRHacker", "onAppForeground", new Object[0]);
        I0();
    }

    public void L0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bc258e4", new Object[]{this, str});
            return;
        }
        this.i.set(false);
        this.g.set(Long.MAX_VALUE);
        if (this.t) {
            this.f = SystemClock.uptimeMillis() - this.d;
            if (G0() && this.f >= this.v) {
                g.Z(str, g.C(this.l), this.f);
            } else if (this.f >= g.s(false) && !cp.f()) {
                if (TextUtils.isEmpty(this.m) || !this.m.equals(this.l)) {
                    new e.a(str, g.C(this.l), this.f, true).b();
                } else {
                    s55.i("ANRHacker", "onMessageEnd skip", "msg", this.l);
                }
            }
        }
        synchronized (this.n) {
            this.l = null;
        }
    }

    public void M0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4695172b", new Object[]{this, str});
            return;
        }
        this.i.set(true);
        this.d = SystemClock.uptimeMillis();
        this.e = System.nanoTime();
        this.l = str;
        this.m = null;
        this.g.set(SystemClock.uptimeMillis() + 300);
        boolean q0 = LocalProcessMonitor.h0().q0(this.f6135a);
        this.t = !q0;
        if (!q0) {
            if (!this.j.getAndSet(true) && f.a()) {
                this.b.sendEmptyMessageAtTime(101, this.g.get());
            }
            if (!this.k.getAndSet(true)) {
                this.b.sendEmptyMessageDelayed(102, 10000L);
            }
        }
    }

    public final void O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8948ac2f", new Object[]{this});
            return;
        }
        cp.j();
        LocalProcessMonitor.h0().q0(this.f6135a);
    }

    public final void P0() {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                Field i = StaticHook.i(Application.class, "mActivityLifecycleCallbacks");
                i.setAccessible(true);
                ArrayList arrayList = (ArrayList) i.get(o41.a());
                if (arrayList != null) {
                    synchronized (arrayList) {
                        i.set(o41.a(), new AnonymousClass2(arrayList));
                    }
                    s55.i("ANRHacker", "replaceLifecycleList success", new Object[0]);
                }
            } catch (Throwable th) {
                s55.h("ANRHacker", "replaceLifecycleList err", th, new Object[0]);
            }
        }
    }

    public void t0(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7790ecb", new Object[]{this, new Long(j)});
        } else if (this.r != null) {
            this.r.b(j);
        }
    }

    public final long v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("55aad7e7", new Object[]{this})).longValue();
        }
        return SystemClock.uptimeMillis() - this.g.get();
    }

    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        try {
            F0();
            if (!this.h.getAndSet(true)) {
                P0();
                O0();
                mf.l(new Runnable() { // from class: tb.eb
                    @Override // java.lang.Runnable
                    public final void run() {
                        ANRHacker.this.z0();
                    }
                });
                if (f.c("adaemon_test")) {
                    mf.k(new Runnable() { // from class: tb.fb
                        @Override // java.lang.Runnable
                        public final void run() {
                            ANRHacker.this.A0();
                        }
                    }, 20L, TimeUnit.SECONDS);
                }
                if (!f.a()) {
                    s55.i("ANRHacker", "init closed", new Object[0]);
                    return;
                }
                mf.l(new Runnable() { // from class: tb.gb
                    @Override // java.lang.Runnable
                    public final void run() {
                        ANRHacker.this.s0();
                    }
                });
                mf.k(new Runnable() { // from class: tb.hb
                    @Override // java.lang.Runnable
                    public final void run() {
                        ANRHacker.this.B0();
                    }
                }, 3L, TimeUnit.SECONDS);
                s55.i("ANRHacker", "init success", new Object[0]);
            }
        } catch (Throwable th) {
            s55.h("ANRHacker", "init err", th, new Object[0]);
            hkq.b(e.MODULE_NAME, e.b, "anr_init_err", vu3.b.GEO_NOT_SUPPORT);
        }
    }

    public final boolean x0() throws InvocationTargetException, IllegalAccessException {
        MessageQueue queue;
        if (K == null) {
            K = StaticHook.g(MessageQueue.class, "isPolling", new Class[0]);
        }
        Method method = K;
        queue = Looper.getMainLooper().getQueue();
        return ((Boolean) method.invoke(queue, new Object[0])).booleanValue();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public final class H extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public long[] c;
        public final AtomicBoolean b = new AtomicBoolean();
        public boolean d = true;

        /* renamed from: a  reason: collision with root package name */
        public final Handler f6136a = new Handler(Looper.getMainLooper());

        /* compiled from: Taobao */
        /* renamed from: com.taobao.adaemon.anr.ANRHacker$H$1  reason: invalid class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class AnonymousClass1 extends InputEventCompatProcessor {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ InputEventCompatProcessor f6137a;
            public final /* synthetic */ ViewRootImpl b;

            public AnonymousClass1(InputEventCompatProcessor inputEventCompatProcessor, ViewRootImpl viewRootImpl) {
                this.f6137a = inputEventCompatProcessor;
                this.b = viewRootImpl;
            }

            public final /* synthetic */ void b(WeakReference weakReference, InputEvent inputEvent) {
                try {
                    ViewRootImpl viewRootImpl = (ViewRootImpl) weakReference.get();
                    if (viewRootImpl == null) {
                        s55.i("ANRHacker", "main.post() empty viewRoot event:" + inputEvent, new Object[0]);
                        return;
                    }
                    InputEventReceiver e = H.e(H.this, viewRootImpl);
                    if (e == null) {
                        s55.i("ANRHacker", "main.post() empty inputEventReceiver", new Object[0]);
                        return;
                    }
                    if (ANRHacker.S() == null) {
                        ANRHacker.T(StaticHook.g(ViewRootImpl.class, "enqueueInputEvent", InputEvent.class, InputEventReceiver.class, Integer.TYPE, Boolean.TYPE));
                        ANRHacker.S().setAccessible(true);
                    }
                    s55.i("ANRHacker", "enqueueInputEvent", "event", g.v(inputEvent));
                    ANRHacker.S().invoke(viewRootImpl, inputEvent, e, 0, Boolean.TRUE);
                } catch (Throwable th) {
                    s55.h("ANRHacker", "mainHandler.post err", th, new Object[0]);
                }
            }

            public List<InputEvent> processInputEventForCompatibility(InputEvent inputEvent, boolean z, View view) {
                return processInputEventForCompatibility(inputEvent);
            }

            public List<MotionEvent> processLetterboxScrollCompatibility(InputEvent inputEvent) {
                if (this.f6137a == null) {
                    return null;
                }
                try {
                    if (ANRHacker.L() == null) {
                        ANRHacker.M(StaticHook.g(InputEventCompatProcessor.class, "processLetterboxScrollCompatibility", InputEvent.class));
                        ANRHacker.L().setAccessible(true);
                    }
                    return (List) ANRHacker.L().invoke(this.f6137a, inputEvent);
                } catch (Throwable th) {
                    s55.h("ANRHacker", "processLetterboxScrollCompatibility err", th, new Object[0]);
                    return null;
                }
            }

            public List<InputEvent> processInputEventForCompatibility(InputEvent inputEvent, boolean z) {
                return processInputEventForCompatibility(inputEvent);
            }

            public List<InputEvent> processInputEventForCompatibility(InputEvent inputEvent) {
                final InputEvent c;
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    return null;
                }
                H.b(H.this).set(true);
                try {
                    c = H.c(H.this, inputEvent);
                } catch (Throwable th) {
                    s55.h("ANRHacker", "processInputEvent err", th, new Object[0]);
                }
                if (c == null) {
                    s55.i("ANRHacker", "process empty newEvent", new Object[0]);
                    return null;
                }
                s55.i("ANRHacker", "processInputEvent", "event", g.v(c));
                final WeakReference weakReference = new WeakReference(this.b);
                H.d(H.this).post(new Runnable() { // from class: com.taobao.adaemon.anr.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        ANRHacker.H.AnonymousClass1.this.b(weakReference, c);
                    }
                });
                return Collections.emptyList();
            }

            public InputEvent processStylusButtonCompatibility(InputEvent inputEvent) {
                if (this.f6137a == null) {
                    return null;
                }
                try {
                    if (ANRHacker.P() == null) {
                        ANRHacker.Q(StaticHook.g(InputEventCompatProcessor.class, "processStylusButtonCompatibility", InputEvent.class));
                        ANRHacker.P().setAccessible(true);
                    }
                    return (InputEvent) ANRHacker.P().invoke(this.f6137a, inputEvent);
                } catch (Throwable th) {
                    s55.h("ANRHacker", "processStylusButtonCompatibility err", th, new Object[0]);
                    return null;
                }
            }

            public List<MotionEvent> processLetterboxScrollCompatibility(InputEvent inputEvent, View view) {
                if (this.f6137a == null) {
                    return null;
                }
                try {
                    if (ANRHacker.N() == null) {
                        ANRHacker.O(StaticHook.g(InputEventCompatProcessor.class, "processLetterboxScrollCompatibility", InputEvent.class, View.class));
                        ANRHacker.N().setAccessible(true);
                    }
                    return (List) ANRHacker.N().invoke(this.f6137a, inputEvent, view);
                } catch (Throwable th) {
                    s55.h("ANRHacker", "processLetterboxScrollCompatibility2 err", th, new Object[0]);
                    return null;
                }
            }
        }

        static {
            t2o.a(349175889);
        }

        public H(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ AtomicBoolean b(H h) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AtomicBoolean) ipChange.ipc$dispatch("7f03c10d", new Object[]{h});
            }
            return h.b;
        }

        public static /* synthetic */ InputEvent c(H h, InputEvent inputEvent) throws InvocationTargetException, IllegalAccessException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InputEvent) ipChange.ipc$dispatch("a2e6367b", new Object[]{h, inputEvent});
            }
            return h.g(inputEvent);
        }

        public static /* synthetic */ Handler d(H h) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Handler) ipChange.ipc$dispatch("919f6ce2", new Object[]{h});
            }
            return h.f6136a;
        }

        public static /* synthetic */ InputEventReceiver e(H h, ViewRootImpl viewRootImpl) throws IllegalAccessException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InputEventReceiver) ipChange.ipc$dispatch("a342ae33", new Object[]{h, viewRootImpl});
            }
            return h.i(viewRootImpl);
        }

        public static /* synthetic */ Object ipc$super(H h, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/adaemon/anr/ANRHacker$H");
        }

        public static /* synthetic */ boolean o(List list, Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1de278fb", new Object[]{list, num})).booleanValue();
            }
            return !list.contains(num);
        }

        public final InputEvent g(InputEvent inputEvent) throws InvocationTargetException, IllegalAccessException {
            Method method;
            if (inputEvent instanceof MotionEvent) {
                if (ANRHacker.W() == null) {
                    ANRHacker.X(StaticHook.g(MotionEvent.class, "copy", new Class[0]));
                }
                method = ANRHacker.W();
            } else if (inputEvent instanceof KeyEvent) {
                if (ANRHacker.Y() == null) {
                    ANRHacker.Z(StaticHook.g(KeyEvent.class, "copy", new Class[0]));
                }
                method = ANRHacker.Y();
            } else {
                method = null;
            }
            if (method != null) {
                return (InputEvent) method.invoke(inputEvent, new Object[0]);
            }
            return null;
        }

        public final ArrayList<ViewRootImpl> h() throws IllegalAccessException {
            if (ANRHacker.J() == null) {
                ANRHacker.K(StaticHook.i(WindowManagerGlobal.class, "mRoots"));
                ANRHacker.J().setAccessible(true);
            }
            return (ArrayList) ANRHacker.J().get(WindowManagerGlobal.getInstance());
        }

        public final InputEventReceiver i(ViewRootImpl viewRootImpl) throws IllegalAccessException {
            if (viewRootImpl == null) {
                return null;
            }
            if (ANRHacker.a0() == null) {
                ANRHacker.b0(StaticHook.i(ViewRootImpl.class, "mInputEventReceiver"));
                ANRHacker.a0().setAccessible(true);
            }
            return (InputEventReceiver) ANRHacker.a0().get(viewRootImpl);
        }

        public final void k(Object obj) throws Throwable {
            if (ANRHacker.w() == null) {
                ANRHacker.x(StaticHook.i(BroadcastReceiver.PendingResult.class, "mToken"));
                ANRHacker.w().setAccessible(true);
            }
            if (ANRHacker.z() == null) {
                ANRHacker.A(StaticHook.i(BroadcastReceiver.PendingResult.class, "mResultCode"));
                ANRHacker.z().setAccessible(true);
            }
            if (ANRHacker.B() == null) {
                ANRHacker.C(StaticHook.i(BroadcastReceiver.PendingResult.class, "mResultData"));
                ANRHacker.B().setAccessible(true);
            }
            if (ANRHacker.D() == null) {
                ANRHacker.E(StaticHook.i(BroadcastReceiver.PendingResult.class, "mResultExtras"));
                ANRHacker.D().setAccessible(true);
            }
            if (ANRHacker.F() == null) {
                ANRHacker.G(StaticHook.i(BroadcastReceiver.PendingResult.class, "mOrderedHint"));
                ANRHacker.F().setAccessible(true);
            }
            if (ANRHacker.H() == null) {
                ANRHacker.I(StaticHook.i(BroadcastReceiver.PendingResult.class, "mFlags"));
                ANRHacker.H().setAccessible(true);
            }
            g.e((IBinder) ANRHacker.w().get(obj), ANRHacker.z().getInt(obj), (String) ANRHacker.B().get(obj), (Bundle) ANRHacker.D().get(obj), ANRHacker.F().getBoolean(obj), ANRHacker.H().getInt(obj));
        }

        public final void m() {
            MessageQueue queue;
            ANRHacker aNRHacker = ANRHacker.this;
            if (f.d()) {
                s55.i("ANRHacker", "handleReceiverTimeout closed", new Object[0]);
                return;
            }
            s55.i("ANRHacker", "handleReceiverTimeout", new Object[0]);
            try {
                queue = Looper.getMainLooper().getQueue();
                if (ANRHacker.r() == null) {
                    ANRHacker.s(StaticHook.i(MessageQueue.class, "mMessages"));
                    ANRHacker.r().setAccessible(true);
                }
                if (ANRHacker.t() == null) {
                    ANRHacker.u(StaticHook.i(Message.class, "next"));
                    ANRHacker.t().setAccessible(true);
                }
                Message message = (Message) ANRHacker.r().get(queue);
                while (message != null) {
                    if (message.what == 113) {
                        Object obj = message.obj;
                        if (obj != null) {
                            int hashCode = obj.hashCode();
                            if (!ANRHacker.v(aNRHacker).containsKey(Integer.valueOf(hashCode))) {
                                ANRHacker.v(aNRHacker).put(Integer.valueOf(hashCode), null);
                                k(obj);
                                s55.i("ANRHacker", "finish receiver: " + obj, new Object[0]);
                            }
                        }
                    }
                    message = (Message) ANRHacker.t().get(message);
                }
            } catch (Throwable th) {
                Log.e("ANRHacker", "handleReceiverTimeout err", th);
                hkq.b(e.MODULE_NAME, e.b, "anr_receiver", vu3.b.GEO_NOT_SUPPORT);
            }
        }

        public final long j() {
            Choreographer x;
            if (this.c == null && this.d && Build.VERSION.SDK_INT >= 23 && (x = g.x()) != null) {
                try {
                    Field i = StaticHook.i(Choreographer.class, "mFrameInfo");
                    if (i == null) {
                        this.d = false;
                        s55.i("ANRHacker", "getAnimationFrame not support, Choreographer.mFrameInfo is null", new Object[0]);
                    } else {
                        i.setAccessible(true);
                        Object obj = i.get(x);
                        Field i2 = StaticHook.i(obj.getClass(), "frameInfo");
                        if (i2 == null) {
                            i2 = StaticHook.i(obj.getClass(), "mFrameInfo");
                        }
                        if (i2 == null) {
                            this.d = false;
                            s55.i("ANRHacker", "getAnimationFrame not support, FrameInfo.frameInfo[] is null", new Object[0]);
                        } else {
                            i2.setAccessible(true);
                            long[] jArr = (long[]) i2.get(obj);
                            this.c = jArr;
                            s55.i("ANRHacker", "getAnimationFrame", "size", Integer.valueOf(jArr.length));
                        }
                    }
                } catch (Throwable th) {
                    this.d = false;
                    s55.h("ANRHacker", "getAnimationFrameNanos err", th, new Object[0]);
                }
            }
            long[] jArr2 = this.c;
            if (jArr2 == null || jArr2.length <= 6) {
                return 0L;
            }
            return jArr2[6];
        }

        public final InputEventCompatProcessor p(ViewRootImpl viewRootImpl) throws IllegalAccessException {
            Method[] h;
            long j;
            InputEventCompatProcessor inputEventCompatProcessor = (InputEventCompatProcessor) g.u().get(viewRootImpl);
            if (inputEventCompatProcessor == null) {
                s55.i("ANRHacker", "empty InputEventCompatProcessor", new Object[0]);
                hkq.b(e.MODULE_NAME, e.b, "empty_InputEventCompatProcessor", vu3.b.GEO_NOT_SUPPORT);
            }
            AnonymousClass1 r7 = new AnonymousClass1(inputEventCompatProcessor, viewRootImpl);
            if (ANRHacker.U() == null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    for (Method method : StaticHook.h(InputEventCompatProcessor.class)) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        sb.setLength(0);
                        sb.append("InputEventCompatProcessor.methods: ");
                        sb.append(method.getName());
                        sb.append(f7l.BRACKET_START_STR);
                        sb.append(method.getGenericReturnType());
                        sb.append(")_");
                        sb.append(parameterTypes.length);
                        sb.append("_");
                        for (Class<?> cls : parameterTypes) {
                            sb.append(cls);
                            sb.append(",");
                        }
                        String sb2 = sb.toString();
                        s55.i("ANRHacker", sb2, new Object[0]);
                        if (("processInputEventForCompatibility".equals(method.getName()) && parameterTypes.length == 1 && parameterTypes[0] == InputEvent.class && method.getReturnType() == List.class) || ("processInputEventBeforeFinish".equals(method.getName()) && parameterTypes.length == 1 && parameterTypes[0] == InputEvent.class && method.getReturnType() == InputEvent.class)) {
                            j = 0;
                        } else {
                            j = 0;
                            hkq.b(e.MODULE_NAME, e.b, sb2, vu3.b.GEO_NOT_SUPPORT);
                        }
                    }
                } catch (Throwable th) {
                    s55.h("ANRHacker", "newInputEventCompatProcessor dump err", th, new Object[0]);
                }
                ANRHacker.V(StaticHook.i(InputEventCompatProcessor.class, "mTargetSdkVersion"));
                ANRHacker.U().setAccessible(true);
            }
            ANRHacker.U().set(r7, 33);
            return r7;
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
                if (i == 101) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        long j = ANRHacker.j(ANRHacker.this);
                        if (j >= 0) {
                            n(false);
                        } else if (ANRHacker.y(ANRHacker.this).get() != Long.MAX_VALUE) {
                            long min = Math.min(Math.abs(j), 1000L);
                            ANRHacker.R(ANRHacker.this).removeMessages(101);
                            ANRHacker.R(ANRHacker.this).sendMessageDelayed(Message.obtain(ANRHacker.R(ANRHacker.this), 101), min);
                            s55.i("ANRHacker", "handleMessage(MSG_SCHEDULE)", "rescheduleTimeMills", Long.valueOf(min));
                        } else {
                            ANRHacker.g0(ANRHacker.this).set(false);
                            s55.i("ANRHacker", "handleMessage(MSG_SCHEDULE), stop scheduling", "curMsg", ANRHacker.m0(ANRHacker.this), "lastDoFrameGapMills", Long.valueOf((System.nanoTime() - j()) / 1000000));
                            ANRHacker.R(ANRHacker.this).removeMessages(103);
                            ANRHacker.R(ANRHacker.this).sendEmptyMessageDelayed(103, 3000L);
                        }
                    }
                } else if (i == 102) {
                    long uptimeMillis = SystemClock.uptimeMillis() - (ANRHacker.n0(ANRHacker.this) + 10000);
                    if (uptimeMillis >= 0) {
                        if (ANRHacker.o0(ANRHacker.this).get()) {
                            ANRHacker aNRHacker = ANRHacker.this;
                            if (ANRHacker.q0(aNRHacker, ANRHacker.m0(aNRHacker)) != null) {
                                new e.a(ANRHacker.p0(ANRHacker.this), null, 10000L, false).b();
                                s55.i("ANRHacker", "handleMessage", "blockMsg", ANRHacker.p0(ANRHacker.this));
                            }
                        }
                        ANRHacker.r0(ANRHacker.this).set(false);
                        return;
                    }
                    s55.i("ANRHacker", "handleMessage(MSG_BLOCK)", "diffMills", Long.valueOf(uptimeMillis));
                    ANRHacker.R(ANRHacker.this).sendMessageDelayed(Message.obtain(ANRHacker.R(ANRHacker.this), 102), Math.abs(uptimeMillis));
                } else if (i == 103) {
                    s55.i("ANRHacker", "handleMessage(MSG_CHECK_PRINTER)", new Object[0]);
                    ANRHacker.k(ANRHacker.this);
                    ANRHacker.R(ANRHacker.this).sendEmptyMessageDelayed(103, 10000L);
                }
            } catch (Throwable th) {
                s55.h("ANRHacker", "handleMessage err", th, new Object[0]);
                hkq.b(e.MODULE_NAME, e.b, "anr_handle_message", vu3.b.GEO_NOT_SUPPORT);
            }
        }

        public final void n(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5abd06c5", new Object[]{this, new Boolean(z)});
                return;
            }
            s55.i("ANRHacker", "handleTimeoutAndReschedule(MSG_SCHEDULE)", "emptyMsg", Boolean.valueOf(z), "reschedule_1s", Boolean.valueOf(!z));
            l(z);
            if (!z) {
                m();
                ANRHacker.R(ANRHacker.this).removeMessages(101);
                ANRHacker.R(ANRHacker.this).sendMessageDelayed(Message.obtain(ANRHacker.R(ANRHacker.this), 101), 1000L);
            }
        }

        public final void l(boolean z) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                String r = oxn.s().r();
                if (!TextUtils.isEmpty(r)) {
                    if (r.contains(Build.BRAND + "_" + i)) {
                        s55.i("ANRHacker", "handleInputTimeout", "limits", r);
                        return;
                    }
                }
                try {
                    ArrayList<ViewRootImpl> h = h();
                    if (h != null && !h.isEmpty()) {
                        final ArrayList arrayList = new ArrayList();
                        Iterator<ViewRootImpl> it = h.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            ANRHacker aNRHacker = ANRHacker.this;
                            if (hasNext) {
                                ViewRootImpl next = it.next();
                                int hashCode = next.hashCode();
                                arrayList.add(Integer.valueOf(hashCode));
                                if (!ANRHacker.l(aNRHacker).contains(Integer.valueOf(hashCode))) {
                                    InputEventCompatProcessor p = p(next);
                                    s55.i("ANRHacker", "create", "processor", p, "viewRootHash", Integer.valueOf(hashCode));
                                    g.u().set(next, p);
                                    ANRHacker.l(aNRHacker).add(Integer.valueOf(hashCode));
                                }
                            } else {
                                ANRHacker.l(aNRHacker).removeIf(new Predicate() { // from class: tb.ob
                                    @Override // java.util.function.Predicate
                                    public final boolean test(Object obj) {
                                        boolean o;
                                        o = ANRHacker.H.o(arrayList, (Integer) obj);
                                        return o;
                                    }
                                });
                                f(h, z);
                                return;
                            }
                        }
                    }
                    s55.i("ANRHacker", "handleInputTimeout empty mRoots", new Object[0]);
                } catch (Throwable th) {
                    s55.h("ANRHacker", "handleInputTimeout err", th, new Object[0]);
                    hkq.b(e.MODULE_NAME, e.b, "anr_input", vu3.b.GEO_NOT_SUPPORT);
                }
            }
        }

        public final void f(ArrayList<ViewRootImpl> arrayList, boolean z) throws Exception {
            int i;
            char c = 3;
            char c2 = 4;
            this.b.set(false);
            int size = arrayList.size();
            int c0 = LocalProcessMonitor.h0().c0();
            if (size != c0) {
                s55.i("ANRHacker", "consumeBatchInputEvent not allowed(unknown view root)", "rootSize", Integer.valueOf(size), "activitySize", Integer.valueOf(c0));
                return;
            }
            int i2 = size - 1;
            while (i2 >= 0) {
                InputEventReceiver i3 = i(arrayList.get(i2));
                if (i3 == null) {
                    s55.i("ANRHacker", "consumeBatchInputEvent empty inputEventReceiver", new Object[0]);
                    i = -1;
                } else {
                    if (ANRHacker.m() == null) {
                        ANRHacker.n(StaticHook.g(InputEventReceiver.class, "consumeBatchedInputEvents", Long.TYPE));
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    synchronized (ANRHacker.o(ANRHacker.this)) {
                        try {
                            if (ANRHacker.m0(ANRHacker.this) != null || z) {
                                if (!z) {
                                    ANRHacker aNRHacker = ANRHacker.this;
                                    if (ANRHacker.p(aNRHacker, ANRHacker.m0(aNRHacker))) {
                                        long j = j();
                                        long nanoTime = System.nanoTime() - (j + 1000000000);
                                        if (ANRHacker.q(ANRHacker.this) <= 0 || j <= ANRHacker.q(ANRHacker.this) || nanoTime <= 0) {
                                            String m0 = ANRHacker.m0(ANRHacker.this);
                                            Long valueOf = Long.valueOf(j);
                                            Long valueOf2 = Long.valueOf(nanoTime / 1000000);
                                            Object[] objArr = new Object[6];
                                            objArr[0] = "curMsg";
                                            objArr[1] = m0;
                                            objArr[2] = "animNanos";
                                            objArr[c] = valueOf;
                                            objArr[c2] = "gapMs";
                                            objArr[5] = valueOf2;
                                            s55.i("ANRHacker", "consumeBatchInputEvent not allowed(Choreographer)", objArr);
                                            return;
                                        }
                                    }
                                }
                                if (LocalProcessMonitor.h0().u0()) {
                                    s55.i("ANRHacker", "consumeBatchInputEvent not allowed(WXPay)", "curMsg", ANRHacker.m0(ANRHacker.this));
                                    return;
                                }
                                Activity f0 = LocalProcessMonitor.h0().f0();
                                long m02 = LocalProcessMonitor.h0().m0();
                                if (f0 == null || !"com.taobao.android.detail.alittdetail.TTDetailActivity".equals(f0.getLocalClassName()) || LocalProcessMonitor.h0().c0() != 1 || m02 <= 0 || SystemClock.elapsedRealtime() - m02 >= 1000) {
                                    if (!LocalProcessMonitor.h0().q0(o41.a()) && !LocalProcessMonitor.h0().v0(1000L)) {
                                        s55.i("ANRHacker", "consumeBatchInputEvent", "curMsg", ANRHacker.m0(ANRHacker.this), "index", Integer.valueOf(i2));
                                        ANRHacker.m().invoke(i3, -1);
                                        if (this.b.get()) {
                                            return;
                                        }
                                    }
                                    s55.i("ANRHacker", "consumeBatchInputEvent not allowed(bg or just destroy)", "curMsg", ANRHacker.m0(ANRHacker.this));
                                    return;
                                }
                                s55.i("ANRHacker", "consumeBatchInputEvent not allowed(TTDetail just resumed)", "curMsg", ANRHacker.m0(ANRHacker.this));
                                return;
                            }
                            s55.i("ANRHacker", "consumeBatchInputEvent not allowed(empty msg)", new Object[0]);
                            return;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
                    if (uptimeMillis2 > 500) {
                        new e.h("consume_input_" + this.b.get(), uptimeMillis2).b();
                    }
                    i = -1;
                }
                i2 += i;
                c = 3;
                c2 = 4;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements MessageQueue.IdleHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final MessageQueue.IdleHandler f6138a;

        static {
            t2o.a(349175888);
        }

        public a(MessageQueue.IdleHandler idleHandler) {
            this.f6138a = idleHandler;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean queueIdle = this.f6138a.queueIdle();
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            String name = this.f6138a.getClass().getName();
            StringBuilder l0 = ANRHacker.l0();
            l0.append(name);
            l0.append(":【");
            l0.append(elapsedRealtime2);
            l0.append("ms】;");
            if (elapsedRealtime2 > ANRHacker.h0()) {
                ANRHacker.k0(name);
                ANRHacker.i0(elapsedRealtime2);
            }
            if (ANRHacker.d0() == 0) {
                long elapsedRealtime3 = SystemClock.elapsedRealtime() - ANRHacker.e0();
                if (elapsedRealtime3 > g.s(false)) {
                    s55.i("ANRHacker_IDLE", "idleHandler end", "spent(ms)", Long.valueOf(elapsedRealtime3));
                    e.a aVar = new e.a("IdleHandler", null, elapsedRealtime3, true);
                    StringBuilder l02 = ANRHacker.l0();
                    aVar.e(l02.insert(0, "max:" + ANRHacker.j0() + ":" + ANRHacker.h0() + "ms;").toString());
                    aVar.b();
                }
            }
            return queueIdle;
        }
    }

    public final /* synthetic */ void z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa473920", new Object[]{this});
            return;
        }
        try {
            Context l = g.l();
            if (cp.h(l)) {
                LocalProcessMonitor.h0().P0(this);
            }
            if (cp.e(l)) {
                Intent intent = new Intent(ChannelLaunchReceiver.ACTION);
                intent.setPackage(l.getPackageName());
                l.sendBroadcast(intent);
                s55.i("ANRHacker", "send ChannelLaunchReceiver", new Object[0]);
            }
        } catch (Throwable th) {
            s55.h("ANRHacker", "send ChannelLaunchReceiver err", th, new Object[0]);
        }
    }

    public final /* synthetic */ Map C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9d52dac", new Object[]{this});
        }
        s55.i("ANRHacker", "onAnrUncaught", "printer", g.y());
        hkq.b(e.MODULE_NAME, e.b, "on_anr", vu3.b.GEO_NOT_SUPPORT);
        t0(20000L);
        return null;
    }

    public final void I0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77ebe111", new Object[]{this});
            return;
        }
        synchronized (this.o) {
            try {
                s55.i("ANRHacker", "newHandler", "quited", Boolean.valueOf(this.c));
                if (this.c) {
                    HandlerThread handlerThread = new HandlerThread("adaemon-handler");
                    handlerThread.start();
                    this.b = new H(handlerThread.getLooper());
                    this.c = false;
                    this.j.set(false);
                    this.k.set(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s0() {
        String str;
        String str2 = Build.BRAND;
        if ("xiaomi".equalsIgnoreCase(str2) || TBDeviceUtils.REDMI_MANUFACTURE_LOWER_CASE.equalsIgnoreCase(str2)) {
            try {
                Class<?> cls = Class.forName("miui.mqsas.sdk.MQSEventManagerDelegate");
                Field m = StaticHook.m(cls, "MQS_SERVICE_NAME");
                m.setAccessible(true);
                final String valueOf = String.valueOf(m.get(null));
                s55.i("ANRHacker", "closeMiuiANR", "service", valueOf);
                if (!TextUtils.isEmpty(valueOf)) {
                    Field m2 = StaticHook.m(ServiceManager.class, "sServiceManager");
                    m2.setAccessible(true);
                    final Object obj = m2.get(null);
                    m2.set(null, Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{IServiceManager.class}, new InvocationHandler() { // from class: tb.jb
                        @Override // java.lang.reflect.InvocationHandler
                        public final Object invoke(Object obj2, Method method, Object[] objArr) {
                            Object y0;
                            y0 = ANRHacker.y0(valueOf, obj, obj2, method, objArr);
                            return y0;
                        }
                    }));
                    Field i = StaticHook.i(cls, "mService");
                    i.setAccessible(true);
                    Object invoke = StaticHook.g(cls, "getInstance", new Class[0]).invoke(null, new Object[0]);
                    i.set(invoke, null);
                    Method g = StaticHook.g(cls, "getMQSService", new Class[0]);
                    g.setAccessible(true);
                    if (g.invoke(invoke, new Object[0]) == null) {
                        str = "success";
                    } else {
                        str = "failure";
                    }
                    s55.i("ANRHacker", "closeMiuiANR ".concat(str), new Object[0]);
                }
            } catch (Throwable th) {
                s55.h("ANRHacker", "closeMiuiANR err", th, new Object[0]);
                hkq.b(e.MODULE_NAME, e.b, "miui_anr_err", vu3.b.GEO_NOT_SUPPORT);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String NAME_FIRST = "first";
        public static final String NAME_LAST = "last";
        public static long b;

        /* renamed from: a  reason: collision with root package name */
        public final String f6139a;

        static {
            t2o.a(349175892);
        }

        public b(String str) {
            this.f6139a = str;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            } else {
                a("onActivityCreated", activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            } else {
                a("onActivityDestroyed", activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            } else {
                a("onActivityPaused", activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1cb46a1", new Object[]{this, activity, bundle});
            } else {
                a("onActivityPostCreated", activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d47a9ec4", new Object[]{this, activity});
            } else {
                a("onActivityPostDestroyed", activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b8ee035", new Object[]{this, activity});
            } else {
                a("onActivityPostPaused", activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c8c2182", new Object[]{this, activity});
            } else {
                a("onActivityPostResumed", activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostSaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a54686ea", new Object[]{this, activity, bundle});
            } else {
                a("onActivityPostSaveInstanceState", activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c02c3ac", new Object[]{this, activity});
            } else {
                a("onActivityPostStarted", activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea24cdf8", new Object[]{this, activity});
            } else {
                a("onActivityPostStopped", activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ebc4708", new Object[]{this, activity, bundle});
            } else {
                a("onActivityPreCreated", activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e3d3077d", new Object[]{this, activity});
            } else {
                a("onActivityPreDestroyed", activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ce30da1c", new Object[]{this, activity});
            } else {
                a("onActivityPrePaused", activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4e29647b", new Object[]{this, activity});
            } else {
                a("onActivityPreResumed", activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreSaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0fb7291", new Object[]{this, activity, bundle});
            } else {
                a("onActivityPreSaveInstanceState", activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6da006a5", new Object[]{this, activity});
            } else {
                a("onActivityPreStarted", activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebc210f1", new Object[]{this, activity});
            } else {
                a("onActivityPreStopped", activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            } else {
                a("onActivityResumed", activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            } else {
                a("onActivitySaveInstanceState", activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            } else {
                a("onActivityStarted", activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            } else {
                a("onActivityStopped", activity);
            }
        }

        public final void a(String str, Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72edf5f4", new Object[]{this, str, activity});
            } else if ("first".equals(this.f6139a)) {
                b = SystemClock.elapsedRealtime();
            } else if ("last".equals(this.f6139a)) {
                s55.i("ANRHacker_LifecycleCallback", str, "spent(ms)", Long.valueOf(SystemClock.elapsedRealtime() - b), "name", activity.getLocalClassName());
            }
        }
    }

    public void N0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("917e8845", new Object[]{this, new Boolean(z2)});
            return;
        }
        try {
            boolean x0 = x0();
            s55.i("ANRHacker", "onSetToMainLooper", "notPolling", Boolean.valueOf(!x0), DMComponent.RESET, Boolean.valueOf(z2));
            if (!x0) {
                M0("adaemon.onSetToMainLooper");
            }
        } catch (Throwable th) {
            s55.h("ANRHacker", "onSetToMainLooper err", th, new Object[0]);
        }
    }
}
