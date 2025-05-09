package com.alipay.sdk.app;

import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.android.msp.framework.statisticsv2.StatisticInfo;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.model.H5PayUtil;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.Utils;
import com.alipay.sdk.app.statistic.StatisticManager;
import com.alipay.sdk.app.statistic.StatisticRecord;
import com.alipay.sdk.cons.GlobalConstants;
import com.alipay.sdk.sys.BizContext;
import com.alipay.sdk.util.H5PayResultModel;
import com.alipay.sdk.util.LogUtils;
import com.alipay.sdk.util.PayHelper;
import com.alipay.sdk.util.ResultUtil;
import com.alipay.sdk.widget.JumpLoading;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PayTaskCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static long g = -1;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f4505a;
    public StatisticInfo b;
    public boolean c;
    public boolean d;
    public JumpLoading e;
    public final Map<String, TaobaoModel> f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class TaobaoModel {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f4506a;
        public String b;
        public String c;
        public String d;

        public TaobaoModel() {
            this.f4506a = "";
            this.b = "";
            this.c = "";
            this.d = "";
        }

        public String getPayOrderId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9f9ca022", new Object[]{this});
            }
            return this.c;
        }

        public String getReturnUrl() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("78c16730", new Object[]{this});
            }
            return this.f4506a;
        }

        public String getShowUrl() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("30af737d", new Object[]{this});
            }
            return this.b;
        }

        public String getTradeNo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("59e3704a", new Object[]{this});
            }
            return this.d;
        }

        public void setPayOrderId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cae0eb94", new Object[]{this, str});
            } else {
                this.c = str;
            }
        }

        public void setReturnUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("21a93aae", new Object[]{this, str});
            } else {
                this.f4506a = str;
            }
        }

        public void setShowUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec428501", new Object[]{this, str});
            } else {
                this.b = str;
            }
        }

        public void setTradeNo(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e98e21d4", new Object[]{this, str});
            } else {
                this.d = str;
            }
        }
    }

    public PayTaskCompat(Activity activity) {
        this(activity, null);
    }

    public static /* synthetic */ Activity access$000(PayTaskCompat payTaskCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("a2d99e97", new Object[]{payTaskCompat});
        }
        return payTaskCompat.f4505a;
    }

    public static /* synthetic */ StatisticInfo access$100(PayTaskCompat payTaskCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StatisticInfo) ipChange.ipc$dispatch("7ae29028", new Object[]{payTaskCompat});
        }
        return payTaskCompat.b;
    }

    public static final String c(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a51c09c9", new Object[]{strArr});
        }
        if (strArr == null) {
            return "";
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return "";
    }

    public static boolean e(boolean z, boolean z2, String str, StringBuilder sb, Map<String, String> map, String... strArr) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6940e11", new Object[]{new Boolean(z), new Boolean(z2), str, sb, map, strArr})).booleanValue();
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                str2 = "";
                break;
            }
            String str3 = strArr[i];
            if (!TextUtils.isEmpty(map.get(str3))) {
                str2 = map.get(str3);
                break;
            }
            i++;
        }
        if (TextUtils.isEmpty(str2)) {
            if (z2) {
                return false;
            }
        } else if (z) {
            sb.append("&");
            sb.append(str);
            sb.append("=\"");
            sb.append(str2);
            sb.append("\"");
        } else {
            sb.append(str);
            sb.append("=\"");
            sb.append(str2);
            sb.append("\"");
        }
        return true;
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("508cb822", new Object[]{this, str});
        } else if (this.b == null) {
            this.c = true;
            this.b = new StatisticInfo(Utils.getBizId(str));
        }
    }

    public void dismissLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c142d9", new Object[]{this});
            return;
        }
        JumpLoading jumpLoading = this.e;
        if (jumpLoading != null) {
            jumpLoading.dismiss();
            this.e = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0 A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000d, B:10:0x0023, B:12:0x0029, B:14:0x0036, B:17:0x0043, B:19:0x0055, B:22:0x009c, B:24:0x00a5, B:26:0x00ae, B:28:0x00c0, B:31:0x0107, B:33:0x0110, B:35:0x0119, B:37:0x0121, B:39:0x0129, B:41:0x013b, B:44:0x0175, B:46:0x0186, B:48:0x0194, B:50:0x01b3, B:52:0x01e2, B:55:0x01f3, B:57:0x01f9, B:59:0x0208, B:62:0x021a, B:67:0x024e, B:70:0x02c6, B:72:0x02cf, B:75:0x02da, B:77:0x02ea, B:81:0x034c, B:85:0x035f, B:89:0x0372, B:91:0x03b0, B:93:0x03b6, B:95:0x03bc, B:98:0x0424), top: B:106:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized java.lang.String fetchOrderInfoFromH5PayUrl(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 1124
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.PayTaskCompat.fetchOrderInfoFromH5PayUrl(java.lang.String):java.lang.String");
    }

    public String getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        return GlobalConstants.MSP_VERSION;
    }

    public synchronized String pay(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("20b2c545", new Object[]{this, str, new Boolean(z)});
        }
        a(str);
        return b(new BizContext(this.f4505a, str, "pay", this.b), str, z);
    }

    public synchronized Map<String, String> payV2(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b1837c94", new Object[]{this, str, new Boolean(z)});
        }
        a(str);
        BizContext bizContext = new BizContext(this.f4505a, str, "payV2", this.b);
        return ResultUtil.format(bizContext, b(bizContext, str, z));
    }

    public void setUseStandardSdk(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e18cc4f5", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public void showLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
            return;
        }
        JumpLoading jumpLoading = this.e;
        if (jumpLoading != null) {
            jumpLoading.showProgress();
        }
    }

    public PayTaskCompat(Activity activity, StatisticInfo statisticInfo) {
        this.c = false;
        this.d = false;
        this.f = new HashMap();
        this.f4505a = activity;
        this.b = statisticInfo;
        this.e = new JumpLoading(activity, JumpLoading.LOADING_GO_PAY);
    }

    public synchronized boolean payInterceptorWithUrl(String str, final boolean z, final H5PayCallback h5PayCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e19a3b04", new Object[]{this, str, new Boolean(z), h5PayCallback})).booleanValue();
        }
        final String fetchOrderInfoFromH5PayUrl = fetchOrderInfoFromH5PayUrl(str);
        if (!TextUtils.isEmpty(fetchOrderInfoFromH5PayUrl)) {
            LogUtils.i("mspl", "intercepted: ".concat(String.valueOf(fetchOrderInfoFromH5PayUrl)));
            TaskHelper.execute(new Runnable() { // from class: com.alipay.sdk.app.PayTaskCompat.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    H5PayResultModel h5Pay = PayTaskCompat.this.h5Pay(new BizContext(PayTaskCompat.access$000(PayTaskCompat.this), fetchOrderInfoFromH5PayUrl, "payInterceptorWithUrl", PayTaskCompat.access$100(PayTaskCompat.this)), fetchOrderInfoFromH5PayUrl, z);
                    LogUtils.i("mspl", "inc finished: " + h5Pay.getResultCode());
                    h5PayCallback.onPayResult(h5Pay);
                }
            });
        }
        return !TextUtils.isEmpty(fetchOrderInfoFromH5PayUrl);
    }

    public static void d(String str, String str2, String str3, String str4) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
            return;
        }
        String str5 = "";
        String str6 = str5;
        for (String str7 : str.split("&")) {
            if (!TextUtils.isEmpty(str7)) {
                if (str7.startsWith("biz_type=")) {
                    str5 = str7.substring(9);
                } else if (str7.startsWith("trade_no=")) {
                    str6 = str7.substring(9);
                }
            }
        }
        EventLogUtil.logPayEvent("10101277", "result_code", str2, "biz_type", str5, "trade_no", str6, "flow_type", str3, "result_reason", str4);
    }

    public final synchronized String b(BizContext bizContext, String str, boolean z) {
        String str2;
        StatisticInfo statisticInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("383b4765", new Object[]{this, bizContext, str, new Boolean(z)});
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - g >= 3000) {
            g = elapsedRealtime;
            if (z) {
                showLoading();
            }
            if (str.contains("payment_inst=")) {
                String substring = str.substring(str.indexOf("payment_inst=") + 13);
                int indexOf = substring.indexOf(38);
                if (indexOf > 0) {
                    substring = substring.substring(0, indexOf);
                }
                RegionUtils.setRegionStr(substring.replaceAll("\"", "").toLowerCase(Locale.getDefault()).replaceAll("alipay", ""));
            } else {
                RegionUtils.setRegionStr("");
            }
            if (str.contains(GlobalConstants.FROM_12306_FLAG)) {
                GlobalConstants.isFrom12306 = true;
            }
            if (GlobalConstants.isFrom12306) {
                if (str.startsWith(GlobalConstants.ONLINE_ORDER_FLAG_1)) {
                    str = str.substring(str.indexOf(GlobalConstants.ONLINE_ORDER_FLAG_1) + 53);
                } else if (str.startsWith(GlobalConstants.ONLINE_ORDER_FLAG_2)) {
                    str = str.substring(str.indexOf(GlobalConstants.ONLINE_ORDER_FLAG_2) + 52);
                }
            }
            LogUtils.i("mspl", "pay prepared: ".concat(String.valueOf(str)));
            String format = bizContext.format(str, this.d);
            if (com.alipay.sdk.util.Utils.isExistAnyExpectedPackage(bizContext, this.f4505a, RegionUtils.defaultItems)) {
                PayHelper payHelper = new PayHelper(this.f4505a, bizContext, new PayHelper.IAlipayBindListener() { // from class: com.alipay.sdk.app.PayTaskCompat.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.sdk.util.PayHelper.IAlipayBindListener
                    public void onBinded() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("19eccb62", new Object[]{this});
                        }
                    }

                    @Override // com.alipay.sdk.util.PayHelper.IAlipayBindListener
                    public void onStartActivity() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("1fcfb979", new Object[]{this});
                        } else {
                            PayTaskCompat.this.dismissLoading();
                        }
                    }
                });
                LogUtils.i("mspl", "pay inner started: ".concat(String.valueOf(format)));
                String pay4Client = payHelper.pay4Client(format);
                LogUtils.i("mspl", "pay inner raw result: ".concat(String.valueOf(pay4Client)));
                payHelper.clearContext();
                if (!TextUtils.equals(pay4Client, "failed") && !TextUtils.equals(pay4Client, PayHelper.SCHEME_FAILED)) {
                    if (TextUtils.isEmpty(pay4Client)) {
                        str2 = Result.getCancel();
                        StringBuilder sb = new StringBuilder();
                        sb.append(ResultStatus.CANCELED.getStatus());
                        d(format, sb.toString(), "1", "");
                    } else {
                        Map<String, String> format2 = ResultUtil.format(bizContext, pay4Client);
                        String str3 = "";
                        if (!(format2 == null || format2.get("resultStatus") == null)) {
                            str3 = format2.get("resultStatus");
                        }
                        d(format, str3, "1", "");
                        str2 = pay4Client;
                        LogUtils.i("mspl", "pay raw result: ".concat(String.valueOf(str2)));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(SystemClock.elapsedRealtime());
                        StatisticManager.putAction(bizContext, "biz", StatisticRecord.EC_PROGRESS_RETURNING, sb2.toString());
                        StatisticManager.putAction(bizContext, "biz", StatisticRecord.EC_PROGRESS_RETURNING_VALUE, ResultUtil.getAttributeVal(str2, "resultStatus") + "|" + ResultUtil.getAttributeVal(str2, "memo"));
                        if (this.c && (statisticInfo = this.b) != null) {
                            statisticInfo.onStatisticEnd();
                        }
                        dismissLoading();
                        LogUtils.i("mspl", "pay returning: ".concat(String.valueOf(str2)));
                        return str2;
                    }
                }
                str2 = Result.getNotInstalled();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(ResultStatus.ALIPAY_NOT_INSTALLED.getStatus());
                d(format, sb3.toString(), "0", pay4Client);
            } else {
                StatisticManager.putAction(bizContext, "biz", StatisticRecord.EC_CHECK_LAUNCH_APP_EXIST_FALSE);
                str2 = Result.getNotInstalled();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(ResultStatus.ALIPAY_NOT_INSTALLED.getStatus());
                d(format, sb4.toString(), "0", "not_installed");
            }
            LogUtils.i("mspl", "pay raw result: ".concat(String.valueOf(str2)));
            StringBuilder sb22 = new StringBuilder();
            sb22.append(SystemClock.elapsedRealtime());
            StatisticManager.putAction(bizContext, "biz", StatisticRecord.EC_PROGRESS_RETURNING, sb22.toString());
            StatisticManager.putAction(bizContext, "biz", StatisticRecord.EC_PROGRESS_RETURNING_VALUE, ResultUtil.getAttributeVal(str2, "resultStatus") + "|" + ResultUtil.getAttributeVal(str2, "memo"));
            if (this.c) {
                statisticInfo.onStatisticEnd();
            }
            dismissLoading();
            LogUtils.i("mspl", "pay returning: ".concat(String.valueOf(str2)));
            return str2;
        }
        LogUtils.i("mspl", "biz", "RepPay");
        return Result.getDoubleRequest();
    }

    public synchronized H5PayResultModel h5Pay(BizContext bizContext, String str, boolean z) {
        String str2;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (H5PayResultModel) ipChange.ipc$dispatch("1a35ede", new Object[]{this, bizContext, str, new Boolean(z)});
        }
        H5PayResultModel h5PayResultModel = new H5PayResultModel();
        String[] split = b(bizContext, str, z).split(";");
        HashMap hashMap = new HashMap();
        for (String str5 : split) {
            int indexOf = str5.indexOf("={");
            if (indexOf >= 0) {
                String substring = str5.substring(0, indexOf);
                String str6 = substring + "={";
                hashMap.put(substring, str5.substring(str5.indexOf(str6) + str6.length(), str5.lastIndexOf("}")));
            }
        }
        if (hashMap.containsKey("resultStatus")) {
            h5PayResultModel.setResultCode((String) hashMap.get("resultStatus"));
        }
        boolean equals = "9000".equals(hashMap.get("resultStatus"));
        String str7 = (String) hashMap.get("result");
        TaobaoModel taobaoModel = (TaobaoModel) ((HashMap) this.f).remove(str);
        if (taobaoModel != null) {
            str2 = taobaoModel.getPayOrderId();
        } else {
            str2 = "";
        }
        if (taobaoModel != null) {
            str3 = taobaoModel.getTradeNo();
        } else {
            str3 = "";
        }
        c(str2, str3);
        if (hashMap.containsKey("callBackUrl")) {
            str4 = (String) hashMap.get("callBackUrl");
        } else {
            if (str7.length() > 15) {
                String c = c(com.alipay.sdk.util.Utils.subString("&callBackUrl=\"", "\"", str7), com.alipay.sdk.util.Utils.subString("&call_back_url=\"", "\"", str7), com.alipay.sdk.util.Utils.subString("&return_url=\"", "\"", str7), URLDecoder.decode(com.alipay.sdk.util.Utils.subString("&return_url=", "&", str7), "utf-8"), URLDecoder.decode(com.alipay.sdk.util.Utils.subString("&callBackUrl=", "&", str7), "utf-8"), com.alipay.sdk.util.Utils.subString("call_back_url=\"", "\"", str7));
                if (!TextUtils.isEmpty(c)) {
                    str4 = c;
                }
            }
            if (taobaoModel != null) {
                if (equals) {
                    str4 = taobaoModel.getReturnUrl();
                } else {
                    str4 = taobaoModel.getShowUrl();
                }
                if (!TextUtils.isEmpty(str4)) {
                }
            }
            if (taobaoModel != null) {
                str4 = H5PayUtil.TAOBAO_BACK_URL;
            } else {
                str4 = "";
            }
        }
        h5PayResultModel.setReturnUrl(str4);
        if (TextUtils.isEmpty(h5PayResultModel.getReturnUrl())) {
            LogUtils.i("mspl", "biz", StatisticRecord.EC_ACQUIRE_CALLBACK_URL_EMPTY);
        }
        return h5PayResultModel;
    }
}
