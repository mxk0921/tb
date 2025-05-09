package com.alipay.mobile.common.transport.download;

import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.alipay.mobile.common.transport.utils.TransportConstants;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DownloadConnChangedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static DownloadConnChangedListener b;

    /* renamed from: a  reason: collision with root package name */
    public List<DownloadRequest> f4059a;

    public static final DownloadConnChangedListener getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DownloadConnChangedListener) ipChange.ipc$dispatch("3787f42", new Object[0]);
        }
        DownloadConnChangedListener downloadConnChangedListener = b;
        if (downloadConnChangedListener != null) {
            return downloadConnChangedListener;
        }
        synchronized (DownloadConnChangedListener.class) {
            try {
                DownloadConnChangedListener downloadConnChangedListener2 = b;
                if (downloadConnChangedListener2 != null) {
                    return downloadConnChangedListener2;
                }
                DownloadConnChangedListener downloadConnChangedListener3 = new DownloadConnChangedListener();
                b = downloadConnChangedListener3;
                return downloadConnChangedListener3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final List<DownloadRequest> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        List<DownloadRequest> list = this.f4059a;
        if (list != null) {
            return list;
        }
        synchronized (this) {
            try {
                List<DownloadRequest> list2 = this.f4059a;
                if (list2 != null) {
                    return list2;
                }
                ArrayList arrayList = new ArrayList(2);
                this.f4059a = arrayList;
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addNetworkSensitiveTask(DownloadRequest downloadRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("968d24f8", new Object[]{this, downloadRequest});
        } else if (downloadRequest != null) {
            try {
                synchronized (this) {
                    a().add(downloadRequest);
                }
            } catch (Throwable th) {
                LogCatUtil.warn("DownloadConnChangedListener", "[addNetworkSensitiveTask] Remove exception = " + th.toString(), th);
            }
        }
    }

    public void notifyNetworkChangedEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("825a4292", new Object[]{this});
            return;
        }
        List<DownloadRequest> list = this.f4059a;
        if (list == null || ((ArrayList) list).isEmpty()) {
            return;
        }
        if (!NetworkUtils.isNetworkAvailable(TransportEnvUtil.getContext())) {
            LogCatUtil.info("DownloadConnChangedListener", "[notifyNetworkChangedEvent] Network unavailable, don't cancel.");
        } else if (!NetworkUtils.isWiFiMobileNetwork(TransportEnvUtil.getContext())) {
            synchronized (this) {
                int size = ((ArrayList) this.f4059a).size();
                if (size > 0) {
                    while (((ArrayList) this.f4059a).size() > 0) {
                        DownloadRequest downloadRequest = (DownloadRequest) ((ArrayList) this.f4059a).remove(0);
                        if (downloadRequest != null) {
                            downloadRequest.cancel(TransportConstants.ERR_MSG_ILLEGAL_NETWORK_TYPE);
                        }
                    }
                    LogCatUtil.info("DownloadConnChangedListener", "[notifyNetworkChangedEvent] The number of cancellation tasks is " + size);
                }
            }
        }
    }

    public void removeNetworkSensitiveTask(DownloadRequest downloadRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bef18f5", new Object[]{this, downloadRequest});
        } else if (downloadRequest != null && this.f4059a != null) {
            try {
                synchronized (this) {
                    a().remove(downloadRequest);
                }
            } catch (Throwable th) {
                LogCatUtil.warn("DownloadConnChangedListener", "[removeNetworkSensitiveTask] Remove exception = " + th.toString(), th);
            }
        }
    }
}
