package com.taobao.aranger.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.constant.Constants;
import com.taobao.aranger.intf.ProcessStateListener;
import com.taobao.aranger.utils.CallbackManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.b5d;
import tb.g;
import tb.g5d;
import tb.re;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class CallbackManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String f = CallbackManager.class.getSimpleName();
    public static volatile CallbackManager g = null;
    public final IntentFilter e;
    public final ProcessStateReceiver d = new ProcessStateReceiver();

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, b> f10072a = new ConcurrentHashMap<>();
    public final CopyOnWriteArrayList<ProcessStateListener> b = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<ProcessStateListener> c = new CopyOnWriteArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class ProcessStateReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(393216093);
        }

        private ProcessStateReceiver() {
        }

        public static /* synthetic */ Object ipc$super(ProcessStateReceiver processStateReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/aranger/utils/CallbackManager$ProcessStateReceiver");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceive$1(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd56bb78", new Object[]{this, intent});
            } else {
                onReceiveImpl(intent);
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, final Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (g.a()) {
                g5d.b(false, false, new Runnable() { // from class: tb.dw2
                    @Override // java.lang.Runnable
                    public final void run() {
                        CallbackManager.ProcessStateReceiver.this.lambda$onReceive$1(intent);
                    }
                });
            } else {
                onReceiveImpl(intent);
            }
        }

        private void onReceiveImpl(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f940188", new Object[]{this, intent});
                return;
            }
            String stringExtra = intent.getStringExtra("processName");
            if (Constants.ACTION_DISCONNECT.equals(intent.getAction())) {
                Iterator it = CallbackManager.a(CallbackManager.this).iterator();
                while (it.hasNext()) {
                    try {
                        ((ProcessStateListener) it.next()).onProcessStop(stringExtra);
                    } catch (Throwable th) {
                        b5d.h(CallbackManager.b(), "[onReceive][onProcessStop]", th, new Object[0]);
                    }
                }
                return;
            }
            Iterator it2 = CallbackManager.a(CallbackManager.this).iterator();
            while (it2.hasNext()) {
                try {
                    ((ProcessStateListener) it2.next()).onProcessStart(stringExtra);
                } catch (Throwable th2) {
                    b5d.h(CallbackManager.b(), "[onReceive][onProcessStart]", th2, new Object[0]);
                }
            }
            if (CallbackManager.c(CallbackManager.this) != null) {
                Iterator it3 = CallbackManager.c(CallbackManager.this).iterator();
                while (it3.hasNext()) {
                    try {
                        ((ProcessStateListener) it3.next()).onProcessStart(stringExtra);
                    } catch (Throwable th3) {
                        b5d.h(CallbackManager.b(), "[onReceive][onProcessStart]local", th3, new Object[0]);
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Object f10073a;

        static {
            t2o.a(393216092);
        }

        public b(boolean z, Object obj) {
            if (z) {
                this.f10073a = new WeakReference(obj);
            } else {
                this.f10073a = obj;
            }
        }

        public Object a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("6352d3f5", new Object[]{this});
            }
            Object obj = this.f10073a;
            if (obj instanceof WeakReference) {
                return ((WeakReference) obj).get();
            }
            return obj;
        }
    }

    static {
        t2o.a(393216090);
    }

    public CallbackManager() {
        IntentFilter intentFilter = new IntentFilter();
        this.e = intentFilter;
        intentFilter.addAction(Constants.ACTION_CONNECT);
        intentFilter.addAction(Constants.ACTION_DISCONNECT);
    }

    public static /* synthetic */ CopyOnWriteArrayList a(CallbackManager callbackManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("a4ddefd6", new Object[]{callbackManager});
        }
        return callbackManager.b;
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("682607c7", new Object[0]);
        }
        return f;
    }

    public static /* synthetic */ CopyOnWriteArrayList c(CallbackManager callbackManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("31330158", new Object[]{callbackManager});
        }
        return callbackManager.c;
    }

    public static CallbackManager f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CallbackManager) ipChange.ipc$dispatch("2887a5f5", new Object[0]);
        }
        if (g == null) {
            synchronized (CallbackManager.class) {
                try {
                    if (g == null) {
                        g = new CallbackManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g;
    }

    public void d(String str, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6e6a301", new Object[]{this, str, obj, new Boolean(z)});
        } else {
            this.f10072a.putIfAbsent(str, new b(z, obj));
        }
    }

    public Object e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("29e226a6", new Object[]{this, str});
        }
        b bVar = this.f10072a.get(str);
        if (bVar == null) {
            return null;
        }
        Object a2 = bVar.a();
        if (a2 == null) {
            this.f10072a.remove(str);
        }
        return a2;
    }

    public void h(ProcessStateListener processStateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fcf87f2", new Object[]{this, processStateListener});
            return;
        }
        synchronized (this.c) {
            this.c.add(processStateListener);
        }
    }

    public void i(ProcessStateListener processStateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d1e2fcd", new Object[]{this, processStateListener});
            return;
        }
        synchronized (this.b) {
            try {
                if (this.b.isEmpty()) {
                    re.r().registerReceiver(this.d, this.e);
                }
                this.b.add(processStateListener);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9586eba", new Object[]{this, str});
        } else {
            this.f10072a.remove(str);
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89e8d9dd", new Object[]{this, str});
            return;
        }
        Iterator<ProcessStateListener> it = this.c.iterator();
        while (it.hasNext()) {
            try {
                it.next().onProcessStop(str);
            } catch (Throwable th) {
                b5d.h(f, "onProcessDisconnect err", th, new Object[0]);
            }
        }
    }
}
