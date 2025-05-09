package tb;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.huawei.nb.searchmanager.utils.logger.DSLog;
import com.huawei.searchservice.service.IHOSPSearchServiceCall;
import tb.ira;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class wq implements qi4 {

    /* renamed from: a  reason: collision with root package name */
    public volatile IHOSPSearchServiceCall f30849a;
    public volatile hdp b;
    public IBinder c;
    public Context d;

    public IHOSPSearchServiceCall a() {
        return this.f30849a;
    }

    public final void b(boolean z) {
        if (z) {
            if (this.b != null) {
                DSLog.it("AbilityConnectionListener", "connectCallback.onConnect", new Object[0]);
                ((ira.c) this.b).a();
            }
        } else if (this.b != null) {
            DSLog.it("AbilityConnectionListener", "connectCallback.onDisconnect", new Object[0]);
            ((ira.c) this.b).b();
        }
    }

    public void c(IBinder iBinder) {
        if (iBinder != null) {
            this.f30849a = IHOSPSearchServiceCall.Stub.asInterface(iBinder);
            try {
                this.f30849a.registerClientDeathBinder(this.c, this.d.getPackageName());
            } catch (RemoteException e) {
                DSLog.et("AbilityConnectionListener", "registerClientDeathBinder RemoteException: " + e.getMessage(), new Object[0]);
            }
            DSLog.it("AbilityConnectionListener", "Succeed async connect search service", new Object[0]);
            b(true);
        }
    }

    public void d() {
        this.f30849a = null;
        DSLog.it("AbilityConnectionListener", "async connection to search service is broken down.", new Object[0]);
        b(false);
    }

    public void e(IBinder iBinder) {
        this.c = iBinder;
    }

    public void f(hdp hdpVar) {
        this.b = hdpVar;
    }

    public void g(Context context) {
        this.d = context;
    }
}
