package com.alipay.sdk.app;

import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.sdk.app.statistic.StatisticRecord;
import com.alipay.sdk.sys.BizContext;
import com.alipay.sdk.util.LogUtils;
import com.alipay.sdk.util.PayHelper;
import com.alipay.sdk.util.ResultUtil;
import com.alipay.sdk.util.Utils;
import com.alipay.sdk.widget.JumpLoading;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AuthTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f4504a;
    public final JumpLoading b;

    public AuthTask(Activity activity) {
        this.f4504a = activity;
        this.b = new JumpLoading(activity, JumpLoading.LOADING_GO_AUTH);
    }

    public static /* synthetic */ void access$000(AuthTask authTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9dae8e3", new Object[]{authTask});
        } else {
            authTask.a();
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c142d9", new Object[]{this});
            return;
        }
        JumpLoading jumpLoading = this.b;
        if (jumpLoading != null) {
            jumpLoading.dismiss();
        }
    }

    public synchronized String auth(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ac6df245", new Object[]{this, str, new Boolean(z)});
        }
        return innerAuth(new BizContext(this.f4504a, str, "auth"), str, z);
    }

    public synchronized Map<String, String> authV2(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5b2eaf94", new Object[]{this, str, new Boolean(z)});
        }
        BizContext bizContext = new BizContext(this.f4504a, str, "authV2");
        return ResultUtil.format(bizContext, innerAuth(bizContext, str, z));
    }

    public synchronized String innerAuth(BizContext bizContext, String str, boolean z) {
        JumpLoading jumpLoading;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c946cc08", new Object[]{this, bizContext, str, new Boolean(z)});
        }
        if (z && (jumpLoading = this.b) != null) {
            jumpLoading.showProgress();
        }
        String cancel = Result.getCancel();
        RegionUtils.setRegionStr("");
        try {
            Activity activity = this.f4504a;
            String format = bizContext.format(str, false);
            if (Utils.isExistAnyExpectedPackage(bizContext, this.f4504a, RegionUtils.defaultItems)) {
                cancel = new PayHelper(activity, bizContext, new PayHelper.IAlipayBindListener() { // from class: com.alipay.sdk.app.AuthTask.1
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
                            AuthTask.access$000(AuthTask.this);
                        }
                    }
                }).pay4Client(format);
                if (!TextUtils.equals(cancel, "failed") && !TextUtils.equals(cancel, PayHelper.SCHEME_FAILED)) {
                    if (TextUtils.isEmpty(cancel)) {
                        cancel = Result.getCancel();
                    }
                }
                LogUtils.w("mspl", "biz", StatisticRecord.EC_LOG_BIND_CALLED_H5);
                cancel = Result.getNotInstalled();
            } else {
                LogUtils.w("mspl", "biz", StatisticRecord.EC_LOG_BIND_CALLED_H5);
                cancel = Result.getNotInstalled();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(SystemClock.elapsedRealtime());
            LogUtils.i("mspl", "biz", StatisticRecord.EC_PROGRESS_RETURNING, sb.toString());
            LogUtils.i("mspl", "biz", StatisticRecord.EC_PROGRESS_RETURNING_VALUE, ResultUtil.getAttributeVal(cancel, "resultStatus") + "|" + ResultUtil.getAttributeVal(cancel, "memo"));
        } catch (Exception e) {
            LogUtils.printExceptionStackTrace(e);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(SystemClock.elapsedRealtime());
            LogUtils.i("mspl", "biz", StatisticRecord.EC_PROGRESS_RETURNING, sb2.toString());
            LogUtils.i("mspl", "biz", StatisticRecord.EC_PROGRESS_RETURNING_VALUE, ResultUtil.getAttributeVal(cancel, "resultStatus") + "|" + ResultUtil.getAttributeVal(cancel, "memo"));
        }
        a();
        return cancel;
    }
}
