package anetwork.channel.aidl.adapter;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.PublicErrorStatistic;
import anet.channel.util.ALog;
import anetwork.channel.aidl.IRemoteNetworkGetter;
import anetwork.channel.aidl.NetworkService;
import anetwork.channel.config.NetworkConfigCenter;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.rb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class RemoteGetterHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "anet.RemoteGetter";
    public static volatile IRemoteNetworkGetter mGetter;
    public static volatile boolean bBindFailed = false;
    public static volatile boolean bBinding = false;
    public static volatile CountDownLatch mServiceBindLock = null;
    public static Handler handler = new Handler(Looper.getMainLooper());
    private static ServiceConnection conn = new ServiceConnection() { // from class: anetwork.channel.aidl.adapter.RemoteGetterHelper.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            if (ALog.isPrintLog(2)) {
                ALog.i(RemoteGetterHelper.TAG, "[onServiceConnected]ANet_Service start success. ANet run with service mode", null, new Object[0]);
            }
            synchronized (RemoteGetterHelper.class) {
                try {
                    RemoteGetterHelper.mGetter = IRemoteNetworkGetter.Stub.asInterface(iBinder);
                    if (RemoteGetterHelper.mServiceBindLock != null) {
                        RemoteGetterHelper.mServiceBindLock.countDown();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            RemoteGetterHelper.access$000(1);
            RemoteGetterHelper.bBindFailed = false;
            RemoteGetterHelper.bBinding = false;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                return;
            }
            if (ALog.isPrintLog(2)) {
                ALog.i(RemoteGetterHelper.TAG, "ANet_Service Disconnected", null, new Object[0]);
            }
            RemoteGetterHelper.mGetter = null;
            RemoteGetterHelper.bBinding = false;
            RemoteGetterHelper.access$000(0);
            if (RemoteGetterHelper.mServiceBindLock != null) {
                RemoteGetterHelper.mServiceBindLock.countDown();
            }
        }
    };

    static {
        t2o.a(607126019);
    }

    public static /* synthetic */ void access$000(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddeb5a6c", new Object[]{new Integer(i)});
        } else {
            commitBindServiceRet(i);
        }
    }

    private static void asyncBindService(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88dbe705", new Object[]{context});
            return;
        }
        if (ALog.isPrintLog(2)) {
            ALog.i(TAG, "[asyncBindService] mContext:" + context + " bBindFailed:" + bBindFailed + " bBinding:" + bBinding, null, new Object[0]);
        }
        if (context != null && !bBindFailed && !bBinding) {
            bBinding = true;
            Intent intent = new Intent(context, NetworkService.class);
            intent.setAction(IRemoteNetworkGetter.class.getName());
            intent.addCategory("android.intent.category.DEFAULT");
            bBindFailed = !context.bindService(intent, conn, 1);
            if (bBindFailed) {
                bBinding = false;
                ALog.e(TAG, "[asyncBindService]ANet_Service start not success. ANet run with local mode!", null, new Object[0]);
            }
            handler.postDelayed(new Runnable() { // from class: anetwork.channel.aidl.adapter.RemoteGetterHelper.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (RemoteGetterHelper.bBinding) {
                        RemoteGetterHelper.bBinding = false;
                        ALog.e(RemoteGetterHelper.TAG, "binding service timeout. reset status!", null, new Object[0]);
                    }
                }
            }, 10000L);
        }
    }

    public static IRemoteNetworkGetter getRemoteGetter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRemoteNetworkGetter) ipChange.ipc$dispatch("f652f87c", new Object[0]);
        }
        return mGetter;
    }

    private static void commitBindServiceRet(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4cca87c", new Object[]{new Integer(i)});
            return;
        }
        PublicErrorStatistic publicErrorStatistic = new PublicErrorStatistic("service_bind");
        publicErrorStatistic.ret = i;
        AppMonitor.getInstance().commitStat(publicErrorStatistic);
        ALog.e(TAG, "commitBindServiceRet ps=" + publicErrorStatistic.toString(), null, rb.RESULT_KEY, Integer.valueOf(i));
    }

    public static void initRemoteGetterAndWait(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b0f6f1e", new Object[]{context, new Boolean(z)});
        } else if (mGetter == null && !bBindFailed) {
            asyncBindService(context);
            if (!bBindFailed && z) {
                try {
                    synchronized (RemoteGetterHelper.class) {
                        if (mGetter == null) {
                            if (mServiceBindLock == null) {
                                mServiceBindLock = new CountDownLatch(1);
                            }
                            ALog.i(TAG, "[initRemoteGetterAndWait]begin to wait", null, new Object[0]);
                            if (mServiceBindLock.await(NetworkConfigCenter.getServiceBindWaitTime(), TimeUnit.SECONDS)) {
                                ALog.i(TAG, "mServiceBindLock count down to 0", null, new Object[0]);
                            } else {
                                ALog.i(TAG, "mServiceBindLock wait timeout", null, new Object[0]);
                            }
                        }
                    }
                } catch (InterruptedException unused) {
                    ALog.e(TAG, "mServiceBindLock wait interrupt", null, new Object[0]);
                }
            }
        }
    }
}
