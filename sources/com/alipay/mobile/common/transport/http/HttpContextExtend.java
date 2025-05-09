package com.alipay.mobile.common.transport.http;

import android.content.Context;
import com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.storager.StorageUtil;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class HttpContextExtend {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static int MAX_HTTP_REQUEST_COUNT_PER_BATCH = 4;
    public static String TAG = "HttpContextExtend";

    /* renamed from: a  reason: collision with root package name */
    public static HttpContextExtend f4078a;

    public HttpContextExtend(Context context) {
    }

    public static synchronized HttpContextExtend createInstance(Context context) {
        HttpContextExtend httpContextExtend;
        synchronized (HttpContextExtend.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HttpContextExtend) ipChange.ipc$dispatch("167b1233", new Object[]{context});
            }
            HttpContextExtend httpContextExtend2 = f4078a;
            if (httpContextExtend2 != null) {
                return httpContextExtend2;
            }
            synchronized (HttpContextExtend.class) {
                if (f4078a == null) {
                    try {
                        f4078a = new HttpContextExtend(context);
                    } catch (Throwable th) {
                        LogCatUtil.error(TAG, th);
                        return null;
                    }
                }
                httpContextExtend = f4078a;
            }
            return httpContextExtend;
        }
    }

    public static synchronized HttpContextExtend getInstance() {
        synchronized (HttpContextExtend.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HttpContextExtend) ipChange.ipc$dispatch("e892bbb5", new Object[0]);
            }
            HttpContextExtend httpContextExtend = f4078a;
            if (httpContextExtend != null) {
                return httpContextExtend;
            }
            throw new IllegalStateException("HttpContextExtend.createInstance() need called before use");
        }
    }

    public String getClientId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67b6a8bd", new Object[]{this});
        }
        return DeviceInfoUtil.getClientId();
    }

    public String getDid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("52885150", new Object[]{this});
        }
        try {
            return DeviceInfoUtil.getDeviceId();
        } catch (Throwable th) {
            LogCatUtil.error(TAG, th);
            return "";
        }
    }

    public String getLatitude() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f4fa657", new Object[]{this});
        }
        try {
            return DeviceInfoUtil.getLatitude();
        } catch (Exception e) {
            LogCatUtil.error(TAG, e);
            return null;
        }
    }

    public String getLongitude() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16d079a0", new Object[]{this});
        }
        try {
            return DeviceInfoUtil.getLongitude();
        } catch (Exception e) {
            LogCatUtil.error(TAG, e);
            return null;
        }
    }

    public String getProductId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d388ffc5", new Object[]{this});
        }
        try {
            return AppInfoUtil.getProductId();
        } catch (Throwable th) {
            LogCatUtil.error(TAG, th);
            return "";
        }
    }

    public Serializable getSerializable(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Serializable) ipChange.ipc$dispatch("5201c95a", new Object[]{this, str, str2});
        }
        try {
            return StorageUtil.getSerializable(str2);
        } catch (Exception e) {
            LogCatUtil.error(TAG, e);
            return null;
        }
    }

    public void putSerializable(String str, String str2, String str3, Serializable serializable, long j, long j2, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d90317f1", new Object[]{this, str, str2, str3, serializable, new Long(j), new Long(j2), str4});
            return;
        }
        try {
            StorageUtil.saveSerializable(str3, serializable, j2);
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "putSerializable", th);
        }
    }

    public void remove(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39af3815", new Object[]{this, str});
            return;
        }
        try {
            StorageUtil.remove(str);
        } catch (Exception e) {
            LogCatUtil.error(TAG, e);
        }
    }
}
