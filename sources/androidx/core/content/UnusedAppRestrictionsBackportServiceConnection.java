package androidx.core.content;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService;
import com.android.alibaba.ip.runtime.IpChange;
import tb.y6o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UnusedAppRestrictionsBackportServiceConnection implements ServiceConnection {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Context mContext;
    public y6o<Integer> mResultFuture;
    public IUnusedAppRestrictionsBackportService mUnusedAppRestrictionsService = null;
    private boolean mHasBoundService = false;

    public UnusedAppRestrictionsBackportServiceConnection(Context context) {
        this.mContext = context;
    }

    private IUnusedAppRestrictionsBackportCallback getBackportCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IUnusedAppRestrictionsBackportCallback) ipChange.ipc$dispatch("64f40c90", new Object[]{this});
        }
        return new IUnusedAppRestrictionsBackportCallback.Stub() { // from class: androidx.core.content.UnusedAppRestrictionsBackportServiceConnection.1
            @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback
            public void onIsPermissionRevocationEnabledForAppResult(boolean z, boolean z2) throws RemoteException {
                if (!z) {
                    UnusedAppRestrictionsBackportServiceConnection.this.mResultFuture.p(0);
                    Log.e(PackageManagerCompat.LOG_TAG, "Unable to retrieve the permission revocation setting from the backport");
                } else if (z2) {
                    UnusedAppRestrictionsBackportServiceConnection.this.mResultFuture.p(3);
                } else {
                    UnusedAppRestrictionsBackportServiceConnection.this.mResultFuture.p(2);
                }
            }
        };
    }

    public void connectAndFetchResult(y6o<Integer> y6oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85d875f9", new Object[]{this, y6oVar});
        } else if (!this.mHasBoundService) {
            this.mHasBoundService = true;
            this.mResultFuture = y6oVar;
            this.mContext.bindService(new Intent(UnusedAppRestrictionsBackportService.ACTION_UNUSED_APP_RESTRICTIONS_BACKPORT_CONNECTION).setPackage(PackageManagerCompat.getPermissionRevocationVerifierApp(this.mContext.getPackageManager())), this, 1);
        } else {
            throw new IllegalStateException("Each UnusedAppRestrictionsBackportServiceConnection can only be bound once.");
        }
    }

    public void disconnectFromService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74877e76", new Object[]{this});
        } else if (this.mHasBoundService) {
            this.mHasBoundService = false;
            this.mContext.unbindService(this);
        } else {
            throw new IllegalStateException("bindService must be called before unbind");
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
            return;
        }
        IUnusedAppRestrictionsBackportService asInterface = IUnusedAppRestrictionsBackportService.Stub.asInterface(iBinder);
        this.mUnusedAppRestrictionsService = asInterface;
        try {
            asInterface.isPermissionRevocationEnabledForApp(getBackportCallback());
        } catch (RemoteException unused) {
            this.mResultFuture.p(0);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
        } else {
            this.mUnusedAppRestrictionsService = null;
        }
    }
}
