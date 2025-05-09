package tb;

import android.content.Context;
import android.os.RemoteException;
import com.heytap.msp.a;
import com.opos.process.bridge.provider.BridgeDispatchException;
import com.opos.process.bridge.provider.BridgeExecuteException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class rwx {
    public static Context b;
    public static com.heytap.mspsdk.receiver.a c;
    public static final AtomicBoolean d = new AtomicBoolean(false);

    /* renamed from: a  reason: collision with root package name */
    public volatile com.heytap.msp.a f27657a = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final rwx f27658a = new rwx();

        static {
            t2o.a(253755412);
        }
    }

    static {
        t2o.a(253755411);
    }

    public static rwx f() {
        return a.f27658a;
    }

    public Context a() {
        return b;
    }

    public synchronized void b(com.heytap.msp.a aVar) {
        if (this.f27657a == null) {
            this.f27657a = aVar;
        }
    }

    public synchronized com.heytap.msp.a c() {
        return this.f27657a;
    }

    public final synchronized com.heytap.msp.a d() {
        try {
            com.heytap.msp.a a2 = a.AbstractBinderC0261a.a(new wsx(b, null).i());
            this.f27657a = a2;
            a2.a("getMspCoreBinder", null, null);
            c3j.f("SdkRunTime", "connect success by provider");
            return a2;
        } catch (RemoteException | BridgeDispatchException | BridgeExecuteException | IllegalArgumentException e) {
            e.printStackTrace();
            c3j.h("SdkRunTime", e);
            return null;
        }
    }

    public synchronized boolean e() {
        boolean z = true;
        if (this.f27657a == null || !this.f27657a.asBinder().pingBinder()) {
            if (d() == null) {
                z = false;
            }
            return z;
        }
        c3j.f("SdkRunTime", "ping OK");
        return true;
    }
}
