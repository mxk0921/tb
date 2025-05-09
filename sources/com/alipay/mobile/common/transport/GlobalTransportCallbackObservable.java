package com.alipay.mobile.common.transport;

import android.os.SystemClock;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class GlobalTransportCallbackObservable extends TransportCallbackAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static GlobalTransportCallbackObservable f4045a;

    public static GlobalTransportCallbackObservable getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GlobalTransportCallbackObservable) ipChange.ipc$dispatch("1a251079", new Object[0]);
        }
        GlobalTransportCallbackObservable globalTransportCallbackObservable = f4045a;
        if (globalTransportCallbackObservable != null) {
            return globalTransportCallbackObservable;
        }
        synchronized (GlobalTransportCallbackObservable.class) {
            try {
                GlobalTransportCallbackObservable globalTransportCallbackObservable2 = f4045a;
                if (globalTransportCallbackObservable2 != null) {
                    return globalTransportCallbackObservable2;
                }
                GlobalTransportCallbackObservable globalTransportCallbackObservable3 = new GlobalTransportCallbackObservable();
                f4045a = globalTransportCallbackObservable3;
                return globalTransportCallbackObservable3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ Object ipc$super(GlobalTransportCallbackObservable globalTransportCallbackObservable, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transport/GlobalTransportCallbackObservable");
    }

    public final boolean a(List<TransportCallback> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c705295d", new Object[]{this, list})).booleanValue();
        }
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // com.alipay.mobile.common.transport.TransportCallbackAdapter, com.alipay.mobile.common.transport.TransportCallback
    public void onCancelled(Request request) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9ab1ecd", new Object[]{this, request});
            return;
        }
        List<TransportCallback> refCallbackList = GlobalTransportCallbackRegistrar.getInstance().refCallbackList();
        if (a(refCallbackList)) {
            for (int i = 0; i < refCallbackList.size(); i++) {
                try {
                    TransportCallback transportCallback = refCallbackList.get(i);
                    if (transportCallback != null) {
                        transportCallback.onCancelled(request);
                    }
                } catch (Throwable th) {
                    LogCatUtil.error("GlobalTransportCallbackObservable", "[onCancelled] Exception = " + th.toString(), th);
                    return;
                }
            }
        }
    }

    @Override // com.alipay.mobile.common.transport.TransportCallbackAdapter, com.alipay.mobile.common.transport.TransportCallback
    public void onFailed(Request request, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9fc6d16", new Object[]{this, request, new Integer(i), str});
            return;
        }
        List<TransportCallback> refCallbackList = GlobalTransportCallbackRegistrar.getInstance().refCallbackList();
        if (a(refCallbackList)) {
            for (int i2 = 0; i2 < refCallbackList.size(); i2++) {
                try {
                    TransportCallback transportCallback = refCallbackList.get(i2);
                    if (transportCallback != null) {
                        transportCallback.onFailed(request, i, str);
                    }
                } catch (Throwable th) {
                    LogCatUtil.error("GlobalTransportCallbackObservable", "[onFailed] Exception = " + th.toString(), th);
                    return;
                }
            }
        }
    }

    @Override // com.alipay.mobile.common.transport.TransportCallbackAdapter, com.alipay.mobile.common.transport.TransportCallback
    public void onPostExecute(Request request, Response response) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a46dd3b", new Object[]{this, request, response});
            return;
        }
        List<TransportCallback> refCallbackList = GlobalTransportCallbackRegistrar.getInstance().refCallbackList();
        if (a(refCallbackList)) {
            for (int i = 0; i < refCallbackList.size(); i++) {
                try {
                    TransportCallback transportCallback = refCallbackList.get(i);
                    if (transportCallback != null) {
                        transportCallback.onPostExecute(request, response);
                    }
                } catch (Throwable th) {
                    LogCatUtil.error("GlobalTransportCallbackObservable", "[onPostExecute] Exception = " + th.toString(), th);
                    return;
                }
            }
        }
    }

    @Override // com.alipay.mobile.common.transport.TransportCallbackAdapter, com.alipay.mobile.common.transport.TransportCallback
    public void onPreExecute(Request request) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d596d2c", new Object[]{this, request});
            return;
        }
        List<TransportCallback> refCallbackList = GlobalTransportCallbackRegistrar.getInstance().refCallbackList();
        if (a(refCallbackList)) {
            for (int i = 0; i < refCallbackList.size(); i++) {
                try {
                    TransportCallback transportCallback = refCallbackList.get(i);
                    if (transportCallback != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        transportCallback.onPreExecute(request);
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        if (elapsedRealtime2 > 20) {
                            LogCatUtil.info("GlobalTransportCallbackObservable", "[onPreExecute] Callback class name = " + transportCallback.getClass().getSimpleName() + ", cost = " + elapsedRealtime2);
                        }
                    }
                } catch (Throwable th) {
                    LogCatUtil.error("GlobalTransportCallbackObservable", "[onPreExecute] Exception = " + th.toString(), th);
                    return;
                }
            }
        }
    }

    @Override // com.alipay.mobile.common.transport.TransportCallbackAdapter, com.alipay.mobile.common.transport.TransportCallback
    public void onProgressUpdate(Request request, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f01968e", new Object[]{this, request, new Double(d)});
            return;
        }
        List<TransportCallback> refCallbackList = GlobalTransportCallbackRegistrar.getInstance().refCallbackList();
        if (a(refCallbackList)) {
            for (int i = 0; i < refCallbackList.size(); i++) {
                try {
                    TransportCallback transportCallback = refCallbackList.get(i);
                    if (transportCallback != null) {
                        transportCallback.onProgressUpdate(request, d);
                    }
                } catch (Throwable th) {
                    LogCatUtil.error("GlobalTransportCallbackObservable", "[onProgressUpdate] Exception = " + th.toString(), th);
                    return;
                }
            }
        }
    }
}
