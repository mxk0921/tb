package anetwork.channel.aidl;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import anet.channel.util.ALog;
import anetwork.channel.aidl.IRemoteNetworkGetter;
import anetwork.channel.aidl.RemoteNetwork;
import anetwork.channel.degrade.DegradableNetworkDelegate;
import anetwork.channel.http.HttpNetworkDelegate;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NetworkService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "anet.NetworkService";
    private Context context;
    private RemoteNetwork.Stub degradeableNetwork = null;
    private RemoteNetwork.Stub httpNetwork = null;
    public IRemoteNetworkGetter.Stub stub = new IRemoteNetworkGetter.Stub() { // from class: anetwork.channel.aidl.NetworkService.1
        @Override // anetwork.channel.aidl.IRemoteNetworkGetter
        public RemoteNetwork get(int i) throws RemoteException {
            if (i == 1) {
                return NetworkService.access$000(NetworkService.this);
            }
            return NetworkService.access$100(NetworkService.this);
        }
    };

    static {
        t2o.a(607125990);
    }

    public static /* synthetic */ RemoteNetwork.Stub access$000(NetworkService networkService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteNetwork.Stub) ipChange.ipc$dispatch("de3713bc", new Object[]{networkService});
        }
        return networkService.degradeableNetwork;
    }

    public static /* synthetic */ RemoteNetwork.Stub access$100(NetworkService networkService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteNetwork.Stub) ipChange.ipc$dispatch("23d8565b", new Object[]{networkService});
        }
        return networkService.httpNetwork;
    }

    public static /* synthetic */ Object ipc$super(NetworkService networkService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anetwork/channel/aidl/NetworkService");
    }

    @Override // android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
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

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        this.context = getApplicationContext();
        if (ALog.isPrintLog(2)) {
            ALog.i(TAG, "onBind:" + intent.getAction(), null, new Object[0]);
        }
        this.degradeableNetwork = new DegradableNetworkDelegate(this.context);
        this.httpNetwork = new HttpNetworkDelegate(this.context);
        if (IRemoteNetworkGetter.class.getName().equals(intent.getAction())) {
            return this.stub;
        }
        return null;
    }
}
