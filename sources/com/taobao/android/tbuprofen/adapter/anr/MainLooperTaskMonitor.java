package com.taobao.android.tbuprofen.adapter.anr;

import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.text.TextUtils;
import android.util.Printer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.util.ReflectUtils;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.f0i;
import tb.pri;
import tb.t2o;
import tb.urr;
import tb.y74;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MainLooperTaskMonitor implements InvocationHandler, Printer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String g = "MainLooperMonitor";

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f9616a = new AtomicBoolean(false);
    private boolean b = false;
    private Object d = null;
    private Printer e = null;
    private f0i c = null;
    private final MessageQueue f = pri.b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class ProxyArrayList<T> extends ArrayList<MessageQueue.IdleHandler> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final MainLooperTaskMonitor monitor;

        static {
            t2o.a(824180771);
        }

        public ProxyArrayList(ArrayList<MessageQueue.IdleHandler> arrayList, MainLooperTaskMonitor mainLooperTaskMonitor) {
            this.monitor = mainLooperTaskMonitor;
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<MessageQueue.IdleHandler> it = arrayList.iterator();
                while (it.hasNext()) {
                    add(it.next());
                }
            }
        }

        public static /* synthetic */ Object ipc$super(ProxyArrayList proxyArrayList, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -332530133) {
                return new Boolean(super.remove(objArr[0]));
            }
            if (hashCode == 195222152) {
                return new Boolean(super.add((ProxyArrayList) objArr[0]));
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/tbuprofen/adapter/anr/MainLooperTaskMonitor$ProxyArrayList");
        }

        public ArrayList<MessageQueue.IdleHandler> getIdleHandlerList() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("92c8b93f", new Object[]{this});
            }
            ArrayList<MessageQueue.IdleHandler> arrayList = new ArrayList<>();
            for (int i = 0; i < size(); i++) {
                MessageQueue.IdleHandler idleHandler = get(i);
                if (idleHandler instanceof a) {
                    arrayList.add(((a) idleHandler).a());
                }
            }
            return arrayList;
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ec2dfe2b", new Object[]{this, obj})).booleanValue();
            }
            return super.remove(obj);
        }

        public boolean add(MessageQueue.IdleHandler idleHandler) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3118e396", new Object[]{this, idleHandler})).booleanValue() : super.add((ProxyArrayList<T>) new a(idleHandler, this.monitor));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements MessageQueue.IdleHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final MessageQueue.IdleHandler f9617a;
        public final MainLooperTaskMonitor b;

        static {
            t2o.a(824180772);
        }

        public a(MessageQueue.IdleHandler idleHandler, MainLooperTaskMonitor mainLooperTaskMonitor) {
            this.f9617a = idleHandler;
            this.b = mainLooperTaskMonitor;
        }

        public MessageQueue.IdleHandler a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MessageQueue.IdleHandler) ipChange.ipc$dispatch("ca24e011", new Object[]{this});
            }
            return this.f9617a;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
            }
            if (!MainLooperTaskMonitor.a(this.b)) {
                return this.f9617a.queueIdle();
            }
            MainLooperTaskMonitor.b(this.b).c(this.f9617a);
            boolean queueIdle = this.f9617a.queueIdle();
            MainLooperTaskMonitor.b(this.b).d(this.f9617a);
            return queueIdle;
        }
    }

    static {
        t2o.a(824180770);
    }

    public static /* synthetic */ boolean a(MainLooperTaskMonitor mainLooperTaskMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d752b162", new Object[]{mainLooperTaskMonitor})).booleanValue();
        }
        return mainLooperTaskMonitor.b;
    }

    public static /* synthetic */ f0i b(MainLooperTaskMonitor mainLooperTaskMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f0i) ipChange.ipc$dispatch("c05b101e", new Object[]{mainLooperTaskMonitor});
        }
        return mainLooperTaskMonitor.c;
    }

    private boolean e() {
        if (this.f == null) {
            urr.b(g, "Can't get messageQueue", new Object[0]);
            return false;
        }
        try {
            Field c = ReflectUtils.c(MessageQueue.class, "mIdleHandlers");
            Object obj = c != null ? c.get(this.f) : null;
            if (obj != null && obj.getClass().equals(ArrayList.class)) {
                ArrayList arrayList = (ArrayList) obj;
                synchronized (this.f) {
                    c.set(this.f, new ProxyArrayList(arrayList, this));
                }
                return true;
            }
        } catch (Exception e) {
            urr.c(g, e, "Failed to monitor idleHandler", new Object[0]);
        }
        return false;
    }

    private boolean f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e42ca1c", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if ((1 & i) != 0) {
                return h();
            }
            if ((i & 2) != 0) {
                return g();
            }
            return false;
        } else if ((i & 2) != 0) {
            return g();
        } else {
            return false;
        }
    }

    private void i() {
        if (this.f != null) {
            try {
                Field c = ReflectUtils.c(MessageQueue.class, "mIdleHandlers");
                Object obj = c != null ? c.get(this.f) : null;
                if (obj != null && obj.getClass().equals(ProxyArrayList.class)) {
                    ProxyArrayList proxyArrayList = (ProxyArrayList) obj;
                    synchronized (this.f) {
                        c.set(this.f, proxyArrayList.getIdleHandlerList());
                    }
                }
            } catch (Exception e) {
                urr.c(g, e, "Failed to monitor idleHandler", new Object[0]);
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (this.f9616a.compareAndSet(true, false)) {
            this.b = false;
            j();
            i();
            this.c = null;
        }
    }

    public boolean d(int i, f0i f0iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("463e9cc7", new Object[]{this, new Integer(i), f0iVar})).booleanValue();
        }
        if (!this.f9616a.compareAndSet(false, true)) {
            return true;
        }
        this.c = f0iVar;
        if (!f(i)) {
            return false;
        }
        e();
        this.b = true;
        return true;
    }

    @Override // android.util.Printer
    public void println(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c611640", new Object[]{this, str});
            return;
        }
        if (this.b && !TextUtils.isEmpty(str)) {
            if (str.charAt(0) == '>') {
                this.c.b(str);
            } else if (str.charAt(0) == '<') {
                this.c.f(str);
            }
        }
        Printer printer = this.e;
        if (printer != null) {
            printer.println(str);
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ead1f7f", new Object[]{this});
            return;
        }
        try {
            Looper.getMainLooper().setMessageLogging(this.e);
            if (Build.VERSION.SDK_INT >= 29) {
                y74.f(Looper.class, "sObserver", null, this.d);
            }
        } catch (IllegalAccessException | NoSuchFieldException e) {
            urr.c(g, e, "restore exception", new Object[0]);
        }
    }

    public boolean g() {
        try {
            Field c = ReflectUtils.c(Looper.class, "mLogging");
            if (c == null) {
                return false;
            }
            Printer printer = (Printer) c.get(Looper.getMainLooper());
            if (printer instanceof MainLooperTaskMonitor) {
                return true;
            }
            Looper.getMainLooper().setMessageLogging(this);
            this.e = printer;
            return true;
        } catch (Throwable th) {
            urr.c(g, th, "proxyLogging exception", new Object[0]);
            return false;
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (this.b && Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId()) {
            String name = method.getName();
            name.hashCode();
            char c = 65535;
            switch (name.hashCode()) {
                case -1879582208:
                    if (name.equals("messageDispatched")) {
                        c = 0;
                        break;
                    }
                    break;
                case 43687879:
                    if (name.equals("dispatchingThrewException")) {
                        c = 1;
                        break;
                    }
                    break;
                case 901629185:
                    if (name.equals("messageDispatchStarting")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                    this.c.a((Message) objArr[1]);
                    break;
                case 2:
                    this.c.e();
                    break;
            }
        }
        Object obj2 = this.d;
        if (obj2 != null) {
            return method.invoke(obj2, objArr);
        }
        return null;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("557ba060", new Object[]{this})).booleanValue();
        }
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Object newProxyInstance = Proxy.newProxyInstance(MainLooperTaskMonitor.class.getClassLoader(), new Class[]{Class.forName("android.os.Looper$Observer")}, this);
                if (ReflectUtils.c(Looper.class, "sObserver") == null) {
                    return false;
                }
                this.d = y74.f(Looper.class, "sObserver", null, newProxyInstance);
                return true;
            }
        } catch (Throwable th) {
            urr.c(g, th, "proxyLooperObserver exception", new Object[0]);
        }
        return false;
    }
}
