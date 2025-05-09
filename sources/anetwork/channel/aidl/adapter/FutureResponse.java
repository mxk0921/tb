package anetwork.channel.aidl.adapter;

import android.os.RemoteException;
import anet.channel.util.ALog;
import anetwork.channel.Response;
import anetwork.channel.aidl.ParcelableFuture;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class FutureResponse implements Future<Response> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "anet.FutureResponse";
    private ParcelableFuture delegate;
    private Response response;

    static {
        t2o.a(607126012);
    }

    public FutureResponse(ParcelableFuture parcelableFuture) {
        this.delegate = parcelableFuture;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f7d8cf7", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        ParcelableFuture parcelableFuture = this.delegate;
        if (parcelableFuture == null) {
            return false;
        }
        try {
            return parcelableFuture.cancel(z);
        } catch (RemoteException e) {
            ALog.w(TAG, "[cancel]", null, e, new Object[0]);
            return false;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ff5f452", new Object[]{this})).booleanValue();
        }
        try {
            return this.delegate.isCancelled();
        } catch (RemoteException e) {
            ALog.w(TAG, "[isCancelled]", null, e, new Object[0]);
            return false;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15dabe57", new Object[]{this})).booleanValue();
        }
        try {
            return this.delegate.isDone();
        } catch (RemoteException e) {
            ALog.w(TAG, "[isDone]", null, e, new Object[0]);
            return true;
        }
    }

    public FutureResponse(Response response) {
        this.response = response;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Future
    public Response get() throws InterruptedException, ExecutionException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("dc76621f", new Object[]{this});
        }
        Response response = this.response;
        if (response != null) {
            return response;
        }
        ParcelableFuture parcelableFuture = this.delegate;
        if (parcelableFuture != null) {
            try {
                return parcelableFuture.get(20000L);
            } catch (RemoteException e) {
                ALog.w(TAG, "[get]", null, e, new Object[0]);
            }
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Future
    public Response get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("c3e8b213", new Object[]{this, new Long(j), timeUnit});
        }
        Response response = this.response;
        if (response != null) {
            return response;
        }
        ParcelableFuture parcelableFuture = this.delegate;
        if (parcelableFuture != null) {
            try {
                return parcelableFuture.get(j);
            } catch (RemoteException e) {
                ALog.w(TAG, "[get(long timeout, TimeUnit unit)]", null, e, new Object[0]);
            }
        }
        return null;
    }
}
