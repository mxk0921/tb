package com.alipay.mobile.common.transport.monitor;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoUtil;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.ext.ExtTransportOffice;
import com.alipay.mobile.common.transport.monitor.networkqos.AlipayQosService;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class NetworkServiceTracer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_LAST_STATE_COUNT = "last_state_count";
    public static final String KEY_LAST_STATE_TS = "last_state_ts";
    public static final String REPORT_BIZ_NAME = "BIZ_NETWORK";
    public static final String REPORT_SUB_NAME_DJG = "DJG";
    public static final String REPORT_SUB_NAME_H5 = "H5";
    public static final String REPORT_SUB_NAME_NBNET_UP = "NBNET_UP";
    public static final String REPORT_SUB_NAME_RPC = "RPC";
    public static final String REPORT_SUB_NAME_RSRC = "RSRC";
    public static final String TAG = "NS_TRACER";
    public static final String TRACE_STATE_FILE = "NS_Tracer_Data";
    public static NetworkServiceTracer c;

    /* renamed from: a  reason: collision with root package name */
    public final long f4119a;
    public NSTraceItem[] b;
    public int maxErrorCount;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class NSTraceItem {
        public int errorCount;
        public long firstErrorTime;
        public int lastErrorCode;
        public String lastErrorMsg;
        public long lastErrorTime;
        public String networkType;

        public NSTraceItem() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum TRACE_ITEM_INDEX {
        TRACE_ITEM_RPC,
        TRACE_ITEM_H5,
        TRACE_ITEM_RSRC,
        TRACE_ITEM_DJG,
        TRACE_ITEM_NBNET_UP
    }

    public NetworkServiceTracer() {
        NSTraceItem[] nSTraceItemArr;
        this.maxErrorCount = 5;
        TransportConfigureManager instance = TransportConfigureManager.getInstance();
        this.f4119a = instance.getLongValue(TransportConfigureItem.NETSERVICE_REPORT_PERIOD);
        this.maxErrorCount = instance.getIntValue(TransportConfigureItem.NETSERVICE_REPORT_ERRCOUNT);
        c();
        Context context = TransportEnvUtil.getContext();
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(TRACE_STATE_FILE, 4);
            for (NSTraceItem nSTraceItem : this.b) {
                nSTraceItem.firstErrorTime = sharedPreferences.getLong(getTSKeyByName(nSTraceItem.networkType), 0L);
                nSTraceItem.errorCount = sharedPreferences.getInt(getCountKeyByName(nSTraceItem.networkType), 0);
            }
            return;
        }
        LogCatUtil.debug(TAG, "Context is not intialzied yet");
    }

    public static NetworkServiceTracer getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkServiceTracer) ipChange.ipc$dispatch("fc3685a6", new Object[0]);
        }
        synchronized (NetworkServiceTracer.class) {
            try {
                if (c == null) {
                    c = new NetworkServiceTracer();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    public final NSTraceItem a(TRACE_ITEM_INDEX trace_item_index) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NSTraceItem) ipChange.ipc$dispatch("4f3d1775", new Object[]{this, trace_item_index});
        }
        return this.b[trace_item_index.ordinal()];
    }

    public final String b(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3af7cdcc", new Object[]{this, new Byte(b)});
        }
        if (b == 1) {
            return REPORT_SUB_NAME_RPC;
        }
        if (b == 2) {
            return "H5";
        }
        if (b == 4) {
            return REPORT_SUB_NAME_RSRC;
        }
        if (b == 3) {
            return REPORT_SUB_NAME_DJG;
        }
        if (b == 6) {
            return REPORT_SUB_NAME_NBNET_UP;
        }
        return "";
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        NSTraceItem[] nSTraceItemArr = new NSTraceItem[5];
        this.b = nSTraceItemArr;
        TRACE_ITEM_INDEX trace_item_index = TRACE_ITEM_INDEX.TRACE_ITEM_RPC;
        nSTraceItemArr[trace_item_index.ordinal()] = new NSTraceItem();
        NSTraceItem[] nSTraceItemArr2 = this.b;
        TRACE_ITEM_INDEX trace_item_index2 = TRACE_ITEM_INDEX.TRACE_ITEM_H5;
        nSTraceItemArr2[trace_item_index2.ordinal()] = new NSTraceItem();
        NSTraceItem[] nSTraceItemArr3 = this.b;
        TRACE_ITEM_INDEX trace_item_index3 = TRACE_ITEM_INDEX.TRACE_ITEM_RSRC;
        nSTraceItemArr3[trace_item_index3.ordinal()] = new NSTraceItem();
        NSTraceItem[] nSTraceItemArr4 = this.b;
        TRACE_ITEM_INDEX trace_item_index4 = TRACE_ITEM_INDEX.TRACE_ITEM_DJG;
        nSTraceItemArr4[trace_item_index4.ordinal()] = new NSTraceItem();
        NSTraceItem[] nSTraceItemArr5 = this.b;
        TRACE_ITEM_INDEX trace_item_index5 = TRACE_ITEM_INDEX.TRACE_ITEM_NBNET_UP;
        nSTraceItemArr5[trace_item_index5.ordinal()] = new NSTraceItem();
        NSTraceItem a2 = a(trace_item_index);
        NSTraceItem a3 = a(trace_item_index2);
        NSTraceItem a4 = a(trace_item_index3);
        NSTraceItem a5 = a(trace_item_index4);
        NSTraceItem a6 = a(trace_item_index5);
        a2.networkType = REPORT_SUB_NAME_RPC;
        a3.networkType = "H5";
        a4.networkType = REPORT_SUB_NAME_RSRC;
        a5.networkType = REPORT_SUB_NAME_DJG;
        a6.networkType = REPORT_SUB_NAME_NBNET_UP;
    }

    public void clearErrorByType(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc84d0c9", new Object[]{this, new Byte(b)});
            return;
        }
        try {
            String b2 = b(b);
            if (TextUtils.isEmpty(b2)) {
                LogCatUtil.debug(TAG, "clearErrorByType unknown bizType,ignored");
                return;
            }
            NSTraceItem g = g(b2);
            if (g != null) {
                g.errorCount = 0;
                g.firstErrorTime = 0L;
                g.lastErrorCode = 0;
                g.lastErrorMsg = "";
                g.lastErrorTime = 0L;
                LogCatUtil.debug(TAG, "Clearing error state for subtype:" + g.networkType);
                i(b2);
            }
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "clearErrorByType exception", th);
        }
    }

    public final void d(NSTraceItem nSTraceItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7980dc8d", new Object[]{this, nSTraceItem});
            return;
        }
        String valueOf = String.valueOf(nSTraceItem.lastErrorCode);
        HashMap hashMap = new HashMap();
        hashMap.put("Last_error_msg", nSTraceItem.lastErrorMsg);
        hashMap.put("Last_error_ts", String.valueOf(nSTraceItem.lastErrorTime));
        MonitorInfoUtil.recordUnavailable("BIZ_NETWORK", nSTraceItem.networkType, valueOf, hashMap);
        LogCatUtil.debug(TAG, "--->mtBizReport invoked, subname=" + nSTraceItem.networkType);
        nSTraceItem.errorCount = 0;
        nSTraceItem.firstErrorTime = 0L;
        h();
    }

    public final synchronized void e(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        NSTraceItem g = g(str);
        String str2 = map.get(HeaderConstant.HEADER_KEY_OPERATION_TYPE);
        if (!TextUtils.equals(str, REPORT_SUB_NAME_RPC) || !f(str2)) {
            if (MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.NETSERVICE_UPERR_REPORT))) {
                map.get("DJG_UP_BIZ");
                if (TextUtils.equals(str, REPORT_SUB_NAME_DJG)) {
                    LogCatUtil.debug(TAG, "DJG up ex,report rignt now");
                    d(g);
                    i(str);
                    return;
                } else if (TextUtils.equals(str, REPORT_SUB_NAME_NBNET_UP)) {
                    LogCatUtil.debug(TAG, "nbnet_up up ex, report rignt now");
                    d(g);
                    i(str);
                    return;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (g.errorCount <= this.maxErrorCount || currentTimeMillis - g.firstErrorTime <= this.f4119a) {
                LogCatUtil.verbose(TAG, "Waiting for more error happened,subtype=" + g.networkType + " from begin time:" + (currentTimeMillis - g.firstErrorTime) + " ms");
            } else {
                d(g);
            }
            i(str);
            return;
        }
        LogCatUtil.debug(TAG, "import rpc ex,report rignt now");
        d(g);
        i(str);
    }

    public final NSTraceItem g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NSTraceItem) ipChange.ipc$dispatch("556b5ed8", new Object[]{this, str});
        }
        if (TextUtils.equals(str, REPORT_SUB_NAME_RPC)) {
            return this.b[TRACE_ITEM_INDEX.TRACE_ITEM_RPC.ordinal()];
        }
        if (TextUtils.equals(str, "H5")) {
            return this.b[TRACE_ITEM_INDEX.TRACE_ITEM_H5.ordinal()];
        }
        if (TextUtils.equals(str, REPORT_SUB_NAME_RSRC)) {
            return this.b[TRACE_ITEM_INDEX.TRACE_ITEM_RSRC.ordinal()];
        }
        if (TextUtils.equals(str, REPORT_SUB_NAME_DJG)) {
            return this.b[TRACE_ITEM_INDEX.TRACE_ITEM_DJG.ordinal()];
        }
        if (TextUtils.equals(str, REPORT_SUB_NAME_NBNET_UP)) {
            return this.b[TRACE_ITEM_INDEX.TRACE_ITEM_NBNET_UP.ordinal()];
        }
        LogCatUtil.debug(TAG, "getTraceItemByName,networkType unknown error");
        return null;
    }

    public String getCountKeyByName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d4d82dc7", new Object[]{this, str});
        }
        return str + "_last_state_count";
    }

    public String getTSKeyByName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8789eac3", new Object[]{this, str});
        }
        return str + "_last_state_ts";
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            NetworkAsyncTaskExecutor.executeLazy(new Runnable() { // from class: com.alipay.mobile.common.transport.monitor.NetworkServiceTracer.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    SignalStateHelper.getInstance().reportNetStateInfo();
                    AlipayQosService.getInstance().getQosLevel();
                    ExtTransportOffice.getInstance().diagnoseNotify();
                }
            });
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "startNetworkDiagnose ex:" + th.toString());
        }
    }

    public final void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        NSTraceItem[] nSTraceItemArr = this.b;
        if (nSTraceItemArr == null || nSTraceItemArr.length == 0) {
            LogCatUtil.debug(TAG, "Nothing to save...");
            return;
        }
        SharedPreferences.Editor edit = TransportEnvUtil.getContext().getSharedPreferences(TRACE_STATE_FILE, 4).edit();
        NSTraceItem g = g(str);
        LogCatUtil.verbose(TAG, "trying to persistTrace Item: " + g.networkType + " first error Time=" + g.firstErrorTime + " error count=" + g.errorCount);
        edit.putLong(getTSKeyByName(g.networkType), g.firstErrorTime);
        edit.putInt(getCountKeyByName(g.networkType), g.errorCount);
        edit.commit();
    }

    public synchronized void recordError(byte b, int i, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f38fd96", new Object[]{this, new Byte(b), new Integer(i), str, map});
            return;
        }
        LogCatUtil.debug(TAG, "--->Exception reported to NSTracer, type=" + ((int) b));
        if (!NetworkUtils.isNetworkAvailable(TransportEnvUtil.getContext())) {
            LogCatUtil.debug(TAG, "network isn't available,need't record error");
            return;
        }
        String b2 = b(b);
        if (TextUtils.isEmpty(b2)) {
            LogCatUtil.debug(TAG, "recordError unknown bizType,ignored");
            return;
        }
        NSTraceItem g = g(b2);
        long currentTimeMillis = System.currentTimeMillis();
        if (g != null) {
            int i2 = g.errorCount;
            if (i2 == 0) {
                g.firstErrorTime = currentTimeMillis;
            }
            g.errorCount = i2 + 1;
            g.lastErrorCode = i;
            g.lastErrorMsg = str;
            g.lastErrorTime = currentTimeMillis;
            e(b2, map);
        } else {
            LogCatUtil.debug(TAG, "Empty item for tunnel type" + b2);
        }
    }

    public static boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.NETSERVICE_RPC_LIST);
        if (!TextUtils.isEmpty(stringValue)) {
            for (String str2 : stringValue.split(",")) {
                if (TextUtils.equals(str2, str)) {
                    LogCatUtil.info(TAG, "importRpc.opeType: " + str);
                    return true;
                }
            }
        }
        return false;
    }
}
