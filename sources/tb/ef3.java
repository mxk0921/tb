package tb;

import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import com.taobao.taobao.internal.PayResultInfo;
import com.taobao.tlog.adapter.AdapterForTLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ef3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_NAME = "Page_Pay";

    public static void a(PayResultInfo payResultInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cdd4ae5", new Object[]{payResultInfo});
        } else {
            AppMonitor.Alarm.commitFail(PAGE_NAME, "Alipay", payResultInfo.resultStatus, payResultInfo.memo);
        }
    }

    public static void b(PayResultInfo payResultInfo) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddb083a3", new Object[]{payResultInfo});
            return;
        }
        if (TextUtils.isEmpty(payResultInfo.from)) {
            str = "UNKNOW";
        } else {
            str = payResultInfo.from;
        }
        TBS.Ext.commitEvent(str, 30001, "do_pay_request_failed", payResultInfo.alipayResult);
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da3ca1e9", new Object[0]);
        } else {
            AppMonitor.Alarm.commitSuccess(PAGE_NAME, "Alipay");
        }
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5542c4a2", new Object[]{str});
            return;
        }
        AdapterForTLog.logd(PAGE_NAME, "退款鉴权,result=" + str);
    }

    public static void e(PayResultInfo payResultInfo, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d788014", new Object[]{payResultInfo, str, str2, new Boolean(z)});
            return;
        }
        String str3 = payResultInfo.resultString;
        String str4 = payResultInfo.from;
        String str5 = payResultInfo.alipayResult;
        AdapterForTLog.loge(PAGE_NAME, "PAY_FAILED;resultStr=" + str3 + ",signStr=" + str + ",from=" + str4 + ",needpop=" + z + ",alipayResult=" + str5 + ",unsuccessURL=" + str2);
    }

    public static void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44430bd6", new Object[]{str});
            return;
        }
        AdapterForTLog.logd(PAGE_NAME, "极简支付结束,result=" + str);
    }

    public static void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ac897a7", new Object[]{str});
            return;
        }
        AdapterForTLog.logd(PAGE_NAME, "simplePay,signStr=" + str);
    }

    public static void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bf200f3", new Object[]{str});
            return;
        }
        AdapterForTLog.logd(PAGE_NAME, "拉起h5支付,h5=" + str);
    }
}
