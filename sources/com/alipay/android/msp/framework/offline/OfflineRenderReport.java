package com.alipay.android.msp.framework.offline;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.android.app.helper.Tid;
import com.alipay.android.msp.framework.helper.TidHelper;
import com.alipay.android.msp.framework.storage.FileUtils;
import com.alipay.android.msp.framework.storage.PrefUtils;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.network.MiscRequestUtils;
import com.alipay.android.msp.pay.GlobalConstant;
import com.alipay.android.msp.pay.GlobalSdkConstant;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class OfflineRenderReport {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f3643a;

    public OfflineRenderReport(Map<String, String> map) {
        this.f3643a = map;
    }

    public static String c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7289b85", new Object[]{context});
        }
        Tid loadTID = TidHelper.loadTID(context);
        if (loadTID != null) {
            return loadTID.getTid();
        }
        return null;
    }

    public final void a(final Context context, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{this, context, str});
        } else {
            TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.offline.OfflineRenderReport.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        OfflineRenderReport.access$000(OfflineRenderReport.this, context, str);
                    } catch (Throwable th) {
                        LogUtil.printExceptionStackTrace(th);
                    }
                }
            });
        }
    }

    public void reportActivity(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d4d839e", new Object[]{this, context});
        } else {
            a(context, "bizcontext={\"requestScene\":\"ACTIVITY\"}");
        }
    }

    public void reportResultPageInfo(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e645aa73", new Object[]{this, context});
            return;
        }
        String string = PrefUtils.getString("cashier_offline_render", "birdnest_ver", null);
        String string2 = PrefUtils.getString("cashier_offline_render", "msp_ver", null);
        String string3 = PrefUtils.getString("cashier_offline_render", "tHash", null);
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
            a(context, "bizcontext={\"requestScene\":\"INIT\"}");
        } else if (b(context)) {
            a(context, "bizcontext={\"requestScene\":\"UPDATE\"}");
        }
    }

    public void reportUseDefaultResultInfo(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dddffa8", new Object[]{this, context});
        } else {
            a(context, "bizcontext={\"requestScene\":\"DEFAULTRESULT\"}");
        }
    }

    public static /* synthetic */ void access$000(OfflineRenderReport offlineRenderReport, Context context, String str) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87302220", new Object[]{offlineRenderReport, context, str});
            return;
        }
        boolean requestReportLocalInfo = MiscRequestUtils.OfflineRenderReportRequest.requestReportLocalInfo(str, true, offlineRenderReport.f3643a);
        if (requestReportLocalInfo) {
            PrefUtils.putString("cashier_offline_render", "birdnest_ver", GlobalConstant.getTemplateVersion());
            PrefUtils.putString("cashier_offline_render", "msp_ver", GlobalSdkConstant.getMspVersion());
            PrefUtils.putString("cashier_offline_render", "tHash", FileUtils.md5(c(context)));
            PrefUtils.remove("cashier_offline_render", "tid");
        }
        LogUtil.record(2, "OfflineRender::reportLocalInfo", "success:".concat(String.valueOf(requestReportLocalInfo)));
    }

    public static boolean b(Context context) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0d012e0", new Object[]{context})).booleanValue();
        }
        String templateVersion = GlobalConstant.getTemplateVersion();
        String mspVersion = GlobalSdkConstant.getMspVersion();
        String c = c(context);
        String string = PrefUtils.getString("cashier_offline_render", "birdnest_ver", null);
        String string2 = PrefUtils.getString("cashier_offline_render", "msp_ver", null);
        try {
            z = !TextUtils.equals(FileUtils.md5(c), PrefUtils.getString("cashier_offline_render", "tHash", null));
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            z = false;
        }
        return !TextUtils.equals(templateVersion, string) || !TextUtils.equals(mspVersion, string2) || z;
    }
}
