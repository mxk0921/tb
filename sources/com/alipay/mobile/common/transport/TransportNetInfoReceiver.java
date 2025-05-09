package com.alipay.mobile.common.transport;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.alipay.mobile.common.transport.download.DownloadConnChangedListener;
import com.alipay.mobile.common.transport.http.HttpClientConnChangedListener;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TransportNetInfoReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static TransportNetInfoReceiver f4049a;

    public static final TransportNetInfoReceiver getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TransportNetInfoReceiver) ipChange.ipc$dispatch("3343fcfe", new Object[0]);
        }
        TransportNetInfoReceiver transportNetInfoReceiver = f4049a;
        if (transportNetInfoReceiver != null) {
            return transportNetInfoReceiver;
        }
        synchronized (TransportNetInfoReceiver.class) {
            try {
                if (f4049a == null) {
                    f4049a = new TransportNetInfoReceiver();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f4049a;
    }

    public static /* synthetic */ Object ipc$super(TransportNetInfoReceiver transportNetInfoReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transport/TransportNetInfoReceiver");
    }

    public void doReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97cbad06", new Object[]{this, context, intent});
            return;
        }
        HttpClientConnChangedListener.getInstance().notifyNetworkChangedEvent();
        DownloadConnChangedListener.getInstance().notifyNetworkChangedEvent();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else {
            NetworkAsyncTaskExecutor.executeLowPri(new Runnable() { // from class: com.alipay.mobile.common.transport.TransportNetInfoReceiver.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TransportNetInfoReceiver.this.doReceive(context, intent);
                    }
                }
            });
        }
    }
}
