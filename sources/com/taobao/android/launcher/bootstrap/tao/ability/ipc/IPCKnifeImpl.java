package com.taobao.android.launcher.bootstrap.tao.ability.ipc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.ipc.a;
import com.taobao.android.task.Coordinator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.b8l;
import tb.t;
import tb.whh;
import tb.xio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class IPCKnifeImpl implements Handler.Callback, a.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final a.AbstractC0433a f8155a;
    public final Handler c;
    public final int e;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final Handler d = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface ProxyFlags {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 72182663) {
                super.dispatchMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/bootstrap/tao/ability/ipc/IPCKnifeImpl$1");
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44d6b87", new Object[]{this, message});
                return;
            }
            IPCKnifeImpl.this.handleMessage(message);
            Runnable callback = message.getCallback();
            if (callback != null) {
                IPCKnifeImpl.d(IPCKnifeImpl.this).postAtFrontOfQueue(xio.a("ReceiverRunnable", callback));
            } else {
                super.dispatchMessage(message);
            }
        }
    }

    public IPCKnifeImpl(a.AbstractC0433a aVar, b8l b8lVar) {
        this.e = 0;
        this.f8155a = aVar;
        Context appContext = aVar.getAppContext();
        if (t.a(appContext, "ngIPCKnifeOpenForAll")) {
            this.e = 1;
        } else if (!TextUtils.equals(b8lVar.f16248a, b8lVar.b) && t.a(appContext, "ngIPCKnifeOpenForAllInSub")) {
            this.e = 1;
        }
        this.e |= 2;
        this.c = new a(Coordinator.getWorkerLooper());
    }

    public static /* synthetic */ Handler d(IPCKnifeImpl iPCKnifeImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("305b92ab", new Object[]{iPCKnifeImpl});
        }
        return iPCKnifeImpl.d;
    }

    public static a.b e(a.AbstractC0433a aVar, b8l b8lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.b) ipChange.ipc$dispatch("b629c826", new Object[]{aVar, b8lVar});
        }
        return new IPCKnifeImpl(aVar, b8lVar);
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ability.ipc.a.b
    public Intent a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("41edc960", new Object[]{this, broadcastReceiver, intentFilter});
        }
        if (this.e == 0) {
            return this.f8155a.a(broadcastReceiver, intentFilter);
        }
        if (this.b.get()) {
            return this.f8155a.a(broadcastReceiver, intentFilter);
        }
        int i = this.e;
        if ((i & 1) == 1) {
            return this.f8155a.c(broadcastReceiver, intentFilter, null, this.c);
        }
        if ((2 & i) == 0) {
            return this.f8155a.a(broadcastReceiver, intentFilter);
        }
        if (f(intentFilter)) {
            return this.f8155a.c(broadcastReceiver, intentFilter, null, this.c);
        }
        return this.f8155a.a(broadcastReceiver, intentFilter);
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ability.ipc.a.b
    public Intent b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("d2e01403", new Object[]{this, broadcastReceiver, intentFilter, new Integer(i)});
        }
        if (this.e == 0) {
            return this.f8155a.b(broadcastReceiver, intentFilter, i);
        }
        if (this.b.get()) {
            return this.f8155a.b(broadcastReceiver, intentFilter, i);
        }
        int i2 = this.e;
        if ((i2 & 1) == 1) {
            return this.f8155a.d(broadcastReceiver, intentFilter, null, this.c, i);
        }
        if ((2 & i2) == 0) {
            return this.f8155a.a(broadcastReceiver, intentFilter);
        }
        if (f(intentFilter)) {
            return this.f8155a.d(broadcastReceiver, intentFilter, null, this.c, i);
        }
        return this.f8155a.b(broadcastReceiver, intentFilter, i);
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ability.ipc.a.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e26c67bc", new Object[]{this});
        } else {
            this.b.compareAndSet(false, true);
        }
    }

    public final boolean f(IntentFilter intentFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87325002", new Object[]{this, intentFilter})).booleanValue();
        }
        if (intentFilter.hasAction("android.intent.action.BOOT_COMPLETED") || intentFilter.hasAction("android.intent.action.SCREEN_OFF") || intentFilter.hasAction("android.intent.action.SCREEN_ON") || intentFilter.hasAction("android.intent.action.USER_PRESENT")) {
            return true;
        }
        return false;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        whh.a("IPCKnifeImpl", "received broadcast receiver message: " + message);
        return false;
    }
}
