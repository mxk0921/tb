package anetwork.channel.aidl.adapter;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.fulltrace.AnalysisFactory;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.util.ALog;
import anetwork.channel.Network;
import anetwork.channel.NetworkListener;
import anetwork.channel.Request;
import anetwork.channel.Response;
import anetwork.channel.aidl.Connection;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.aidl.IRemoteNetworkGetter;
import anetwork.channel.aidl.NetworkResponse;
import anetwork.channel.aidl.ParcelableRequest;
import anetwork.channel.aidl.RemoteNetwork;
import anetwork.channel.config.NetworkConfigCenter;
import anetwork.channel.degrade.DegradableNetworkDelegate;
import anetwork.channel.entity.RequestConfig;
import anetwork.channel.http.HttpNetworkDelegate;
import anetwork.channel.http.NetworkSdkSetting;
import anetwork.channel.util.RequestConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Future;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NetworkProxy implements Network {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEGRADE = 1;
    public static final int HTTP = 0;
    public static String TAG = "anet.NetworkProxy";
    private Context mContext;
    private volatile RemoteNetwork mDelegate = null;
    private int mType;

    static {
        t2o.a(607126013);
        t2o.a(607125964);
    }

    public NetworkProxy(Context context, int i) {
        this.mContext = context;
        this.mType = i;
    }

    private void initDelegateInstance(boolean z) {
        RemoteNetwork remoteNetwork;
        RemoteNetwork remoteNetwork2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b42a703", new Object[]{this, new Boolean(z)});
            return;
        }
        NetworkSdkSetting.init(null, null);
        NetworkSdkSetting.initAsync(GlobalAppRuntimeInfo.getContext());
        if (this.mDelegate == null) {
            if (NetworkConfigCenter.isRemoteNetworkServiceEnable()) {
                boolean isTargetProcess = GlobalAppRuntimeInfo.isTargetProcess();
                if (!NetworkConfigCenter.isBindServiceOptimize() || !isTargetProcess) {
                    RemoteGetterHelper.initRemoteGetterAndWait(this.mContext, z);
                    tryGetRemoteNetworkInstance(this.mType);
                    if (this.mDelegate != null) {
                        ALog.e(TAG, "[Launcher] NetworkSdkSetting initDelegateInstance 3 end!!!", null, new Object[0]);
                        return;
                    }
                } else {
                    RemoteGetterHelper.initRemoteGetterAndWait(this.mContext, false);
                    if (!RemoteGetterHelper.bBinding || this.mDelegate != null) {
                        tryGetRemoteNetworkInstance(this.mType);
                        if (this.mDelegate != null) {
                            ALog.e(TAG, "[Launcher] NetworkSdkSetting initDelegateInstance 2 end!!!", null, new Object[0]);
                            return;
                        }
                    } else {
                        if (this.mType == 1) {
                            remoteNetwork2 = new DegradableNetworkDelegate(this.mContext);
                        } else {
                            remoteNetwork2 = new HttpNetworkDelegate(this.mContext);
                        }
                        this.mDelegate = remoteNetwork2;
                        ALog.e(TAG, "[Launcher] NetworkSdkSetting initDelegateInstance 1 end!!!", null, new Object[0]);
                        return;
                    }
                }
                if (NetworkConfigCenter.isAllowSpdyWhenBindServiceFailed() && isTargetProcess && RemoteGetterHelper.bBindFailed) {
                    synchronized (this) {
                        try {
                            if (this.mDelegate == null) {
                                if (this.mType == 1) {
                                    remoteNetwork = new DegradableNetworkDelegate(this.mContext);
                                } else {
                                    remoteNetwork = new HttpNetworkDelegate(this.mContext);
                                }
                                this.mDelegate = remoteNetwork;
                                ALog.e(TAG, "[initDelegateInstance] getNetworkInstance when bindService failed.", null, new Object[0]);
                                return;
                            }
                        } finally {
                        }
                    }
                }
            }
            synchronized (this) {
                try {
                    if (this.mDelegate == null) {
                        if (ALog.isPrintLog(2)) {
                            ALog.i(TAG, "[getLocalNetworkInstance]", null, new Object[0]);
                        }
                        this.mDelegate = new HttpNetworkDelegate(this.mContext);
                    }
                } finally {
                }
            }
            ALog.e(TAG, "[Launcher] NetworkSdkSetting initDelegateInstance 4 end!!!", null, new Object[0]);
        }
    }

    private void recordRequestStat(Request request) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4486d07", new Object[]{this, request});
        } else if (request != null) {
            request.setExtProperty(RequestConstant.KEY_REQ_START, String.valueOf(System.currentTimeMillis()));
            String extProperty = request.getExtProperty(RequestConstant.KEY_TRACE_ID);
            if (TextUtils.isEmpty(extProperty)) {
                extProperty = AnalysisFactory.getInstance().createRequest();
            }
            request.setExtProperty(RequestConstant.KEY_TRACE_ID, extProperty);
            request.setExtProperty(RequestConstant.KEY_REQ_PROCESS, GlobalAppRuntimeInfo.getCurrentProcess());
        }
    }

    private synchronized void tryGetRemoteNetworkInstance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47e9d5ba", new Object[]{this, new Integer(i)});
        } else if (this.mDelegate == null) {
            if (ALog.isPrintLog(2)) {
                String str = TAG;
                ALog.i(str, "[tryGetRemoteNetworkInstance] type=" + i, null, new Object[0]);
            }
            IRemoteNetworkGetter remoteGetter = RemoteGetterHelper.getRemoteGetter();
            if (remoteGetter != null) {
                this.mDelegate = remoteGetter.get(i);
            }
        }
    }

    private void reportRemoteError(Throwable th, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0400fca", new Object[]{this, th, str});
            return;
        }
        ALog.e(TAG, null, str, th, new Object[0]);
        ExceptionStatistic exceptionStatistic = new ExceptionStatistic(-103, null, "rt");
        exceptionStatistic.exceptionStack = th.toString();
        AppMonitor.getInstance().commitStat(exceptionStatistic);
    }

    @Override // anetwork.channel.Network
    public Future<Response> asyncSend(Request request, Object obj, Handler handler, NetworkListener networkListener) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("b23e43d6", new Object[]{this, request, obj, handler, networkListener});
        }
        recordRequestStat(request);
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            z = false;
        }
        initDelegateInstance(z);
        ParcelableRequest parcelableRequest = new ParcelableRequest(request);
        ParcelableNetworkListenerWrapper parcelableNetworkListenerWrapper = (networkListener == null && handler == null) ? null : new ParcelableNetworkListenerWrapper(networkListener, handler, obj);
        if (parcelableRequest.url == null) {
            if (parcelableNetworkListenerWrapper != null) {
                try {
                    parcelableNetworkListenerWrapper.onFinished(new DefaultFinishEvent(-102));
                } catch (RemoteException unused) {
                }
            }
            RequestConfig.illegalParamCommit(parcelableRequest, "url_null", -102);
            return new FutureResponse(new NetworkResponse(-102));
        }
        try {
            return new FutureResponse(this.mDelegate.asyncSend(parcelableRequest, parcelableNetworkListenerWrapper));
        } catch (Throwable th) {
            if (parcelableNetworkListenerWrapper != null) {
                try {
                    parcelableNetworkListenerWrapper.onFinished(new DefaultFinishEvent(-102));
                } catch (RemoteException unused2) {
                }
            }
            reportRemoteError(th, "[asyncSend]call asyncSend exception");
            return new FutureResponse(new NetworkResponse(-103));
        }
    }

    @Override // anetwork.channel.Network
    public Connection getConnection(Request request, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Connection) ipChange.ipc$dispatch("266e0cb1", new Object[]{this, request, obj});
        }
        ALog.i(TAG, "networkProxy getConnection", request.getSeqNo(), new Object[0]);
        recordRequestStat(request);
        initDelegateInstance(true);
        ParcelableRequest parcelableRequest = new ParcelableRequest(request);
        if (parcelableRequest.url == null) {
            RequestConfig.illegalParamCommit(parcelableRequest, "url_null", -102);
            return new ConnectionDelegate(-102);
        }
        try {
            return this.mDelegate.getConnection(parcelableRequest);
        } catch (Throwable th) {
            reportRemoteError(th, "[getConnection]call getConnection method failed.");
            return new ConnectionDelegate(-103);
        }
    }

    @Override // anetwork.channel.Network
    public Response syncSend(Request request, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("df4cc9f6", new Object[]{this, request, obj});
        }
        ALog.i(TAG, "networkProxy syncSend", request.getSeqNo(), new Object[0]);
        recordRequestStat(request);
        initDelegateInstance(true);
        ParcelableRequest parcelableRequest = new ParcelableRequest(request);
        if (parcelableRequest.url == null) {
            RequestConfig.illegalParamCommit(parcelableRequest, "url_null", -102);
            return new NetworkResponse(-102);
        }
        try {
            return this.mDelegate.syncSend(parcelableRequest);
        } catch (Throwable th) {
            reportRemoteError(th, "[syncSend]call syncSend method failed.");
            return new NetworkResponse(-103);
        }
    }
}
