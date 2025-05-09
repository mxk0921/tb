package tb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.opos.process.bridge.provider.BridgeExecuteException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.s3y;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class d5y {
    public static final d5y b = new d5y();

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, b> f17607a = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17608a;
        public final /* synthetic */ s3y.b b;
        public final /* synthetic */ CountDownLatch c;

        /* compiled from: Taobao */
        /* renamed from: tb.d5y$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class C0903a implements IBinder.DeathRecipient {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ComponentName f17609a;

            static {
                t2o.a(253755452);
            }

            public C0903a(ComponentName componentName) {
                this.f17609a = componentName;
            }

            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                a aVar = a.this;
                b bVar = (b) ((ConcurrentHashMap) d5y.this.f17607a).remove(aVar.f17608a);
                if (bVar != null) {
                    Iterator it = ((CopyOnWriteArrayList) bVar.b).iterator();
                    while (it.hasNext()) {
                        s3y.b bVar2 = (s3y.b) it.next();
                        if (bVar2 != null) {
                            bVar2.onServiceDisconnected(this.f17609a);
                        }
                    }
                }
            }
        }

        static {
            t2o.a(253755451);
        }

        public a(String str, s3y.b bVar, CountDownLatch countDownLatch) {
            this.f17608a = str;
            this.b = bVar;
            this.c = countDownLatch;
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName componentName) {
            Objects.toString(componentName);
            this.c.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                iBinder.linkToDeath(new C0903a(componentName), 0);
            } catch (RemoteException unused) {
            }
            b bVar = new b(iBinder, this);
            ((CopyOnWriteArrayList) bVar.b).add(this.b);
            if (((ConcurrentHashMap) d5y.this.f17607a).put(this.f17608a, bVar) != null) {
                Iterator it = ((CopyOnWriteArrayList) bVar.b).iterator();
                while (it.hasNext()) {
                    s3y.b bVar2 = (s3y.b) it.next();
                    if (bVar2 != null) {
                        bVar2.a(componentName);
                    }
                }
            }
            this.c.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            b bVar = (b) ((ConcurrentHashMap) d5y.this.f17607a).remove(this.f17608a);
            if (bVar != null) {
                Iterator it = ((CopyOnWriteArrayList) bVar.b).iterator();
                while (it.hasNext()) {
                    s3y.b bVar2 = (s3y.b) it.next();
                    if (bVar2 != null) {
                        bVar2.onServiceDisconnected(componentName);
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final IBinder f17610a;
        public final List<s3y.b> b = new CopyOnWriteArrayList();

        static {
            t2o.a(253755453);
        }

        public b(IBinder iBinder, ServiceConnection serviceConnection) {
            this.f17610a = iBinder;
        }
    }

    static {
        t2o.a(253755450);
    }

    public synchronized IBinder a(Context context, Intent intent, int i, s3y.b bVar) {
        b bVar2;
        try {
            String str = intent.getPackage() + "/" + intent.getAction();
            bVar2 = (b) ((ConcurrentHashMap) this.f17607a).get(str);
            if (!(bVar2 == null || bVar2.f17610a == null)) {
                ((CopyOnWriteArrayList) bVar2.b).add(bVar);
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            if (context.bindService(intent, new a(str, bVar, countDownLatch), 1)) {
                try {
                    boolean await = countDownLatch.await(i, TimeUnit.MILLISECONDS);
                    bVar2 = (b) ((ConcurrentHashMap) this.f17607a).get(str);
                    if (bVar2 == null && !await) {
                        throw new BridgeExecuteException("service refused", 101004);
                    }
                } catch (InterruptedException e) {
                    throw new BridgeExecuteException(e, 101005);
                }
            } else {
                throw new BridgeExecuteException("bindService failed", 101005);
            }
        } catch (Throwable th) {
            throw th;
        }
        return bVar2 != null ? bVar2.f17610a : null;
    }
}
