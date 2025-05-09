package com.alipay.android.msp.framework.offline;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CashierOperationReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_CASHIER_OPERATION_RESULT = "com.alipay.android.app.sdk.ACTION_CASHIER_OPERATION_RESULT";
    public static final String BIZ_CASHIER_REPORT = "biz_cashier_report";
    public static final String BIZ_GET_LOCAL_TID = "biz_get_local_tid";
    public static final String BIZ_GET_TID = "biz_get_tid";
    public static final String CASHIER_TID = "Tid";
    public static final String CASHIER_TID_IMEI = "IMEI";
    public static final String CASHIER_TID_IMSI = "IMSI";
    public static final String CASHIER_TID_SEED = "TidSeed";
    public static final String CASHIER_TID_VIRTUALIMSI = "VirtualImsi";
    public static final String CASHIER_TID_VIRTUALTMEI = "VirtualImei";
    public static final String PARAMS_ACTION = "action";
    public static final String PARAMS_EXTEND_PARAMS = "extend_params";
    public static final String PARAMS_IDENTIFY = "identify";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f3642a;

    public static synchronized void a(Context context) {
        synchronized (CashierOperationReceiver.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e1dcfb91", new Object[]{context});
            } else if (!f3642a) {
                GlobalHelper.getInstance().init(context);
                PhoneCashierMspEngine.getMspBase().loadProperties(context);
                f3642a = true;
            }
        }
    }

    public static Map<String, String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("83521f7e", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            return hashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next, null));
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return hashMap;
    }

    public static /* synthetic */ Object ipc$super(CashierOperationReceiver cashierOperationReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/offline/CashierOperationReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        LogUtil.record(2, "CashierOperationReceiver::onReceive", "start");
        TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.offline.CashierOperationReceiver.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                LogUtil.record(2, "CashierOperationReceiver::onReceive", "bg start");
                CashierOperationReceiver.access$000(CashierOperationReceiver.this, context, intent);
            }
        });
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:34:0x0122
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:90)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public static /* synthetic */ void access$000(com.alipay.android.msp.framework.offline.CashierOperationReceiver r16, android.content.Context r17, android.content.Intent r18) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.offline.CashierOperationReceiver.access$000(com.alipay.android.msp.framework.offline.CashierOperationReceiver, android.content.Context, android.content.Intent):void");
    }
}
