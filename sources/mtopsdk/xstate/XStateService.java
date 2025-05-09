package mtopsdk.xstate;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.xstate.aidl.IXState;
import tb.jnx;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class XStateService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public IXState.Stub f15412a = null;
    public final Object b = new Object();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class XStateStub extends IXState.Stub {
        static {
            t2o.a(589300091);
        }

        public XStateStub() {
        }

        @Override // mtopsdk.xstate.aidl.IXState
        public String getValue(String str) throws RemoteException {
            return jnx.b(str);
        }

        @Override // mtopsdk.xstate.aidl.IXState
        public void init() throws RemoteException {
            jnx.c(XStateService.this.getBaseContext());
        }

        @Override // mtopsdk.xstate.aidl.IXState
        public String removeKey(String str) throws RemoteException {
            return jnx.d(str);
        }

        @Override // mtopsdk.xstate.aidl.IXState
        public void setValue(String str, String str2) throws RemoteException {
            jnx.e(str, str2);
        }

        @Override // mtopsdk.xstate.aidl.IXState
        public void unInit() throws RemoteException {
            jnx.f();
        }
    }

    static {
        t2o.a(589300090);
    }

    public static /* synthetic */ Object ipc$super(XStateService xStateService, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/xstate/XStateService");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        synchronized (this.b) {
            try {
                if (this.f15412a == null) {
                    XStateStub xStateStub = new XStateStub();
                    this.f15412a = xStateStub;
                    try {
                        xStateStub.init();
                    } catch (RemoteException e) {
                        TBSdkLog.e("mtopsdk.XStateService", "[onBind]init() exception", e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i("mtopsdk.XStateService", "[onBind] XStateService  stub= " + this.f15412a.hashCode());
        }
        return this.f15412a;
    }

    @Override // android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        synchronized (this.b) {
            try {
                IXState.Stub stub = this.f15412a;
                if (stub != null) {
                    try {
                        stub.unInit();
                    } catch (RemoteException e) {
                        TBSdkLog.e("mtopsdk.XStateService", "[onDestroy]unInit() exception", e);
                    } catch (Throwable th) {
                        TBSdkLog.e("mtopsdk.XStateService", "[onDestroy]unInit() error", th);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
        }
        return 2;
    }
}
