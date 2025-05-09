package com.alipay.android.msp.core.component;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.framework.statisticsv2.StatisticInfo;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.MspContextUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class JsExceptionReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String JS_EXCEPTION_ACTION = "com.flybird.js.exception";

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicInteger f3546a = new AtomicInteger();
    public static JsExceptionReceiver b;

    private JsExceptionReceiver() {
    }

    public static /* synthetic */ Object ipc$super(JsExceptionReceiver jsExceptionReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/core/component/JsExceptionReceiver");
    }

    public static void registerReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b22c8539", new Object[0]);
        } else if (f3546a.getAndIncrement() == 0) {
            b = new JsExceptionReceiver();
            LocalBroadcastManager.getInstance(MspContextUtil.getContext()).registerReceiver(b, new IntentFilter("com.flybird.js.exception"));
        }
    }

    public static void unregisterReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97044d52", new Object[0]);
        } else if (f3546a.decrementAndGet() == 0 && b != null) {
            LocalBroadcastManager.getInstance(MspContextUtil.getContext()).unregisterReceiver(b);
            b = null;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        String stringExtra = intent.getStringExtra("exception");
        String stringExtra2 = intent.getStringExtra("script");
        String stringExtra3 = intent.getStringExtra("tplId");
        LogUtil.record(2, "JsExceptionReceiver:onReceive", "tplId=" + stringExtra3 + " exception=" + stringExtra + " script=" + stringExtra2);
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(MspContextManager.getInstance().getLatestBizId());
        if (!TextUtils.isEmpty(stringExtra2)) {
            if (stringExtra2.length() > 80) {
                stringExtra2 = stringExtra2.substring(0, 80);
            }
            stringExtra2 = stringExtra2.replace("\n", "");
        }
        if (!TextUtils.isEmpty(stringExtra)) {
            stringExtra = stringExtra.replace("\n", " ");
        }
        if (TextUtils.isEmpty(stringExtra3)) {
            return;
        }
        if (stringExtra3.startsWith("QUICKPAY@")) {
            String substring = stringExtra3.substring(9);
            if (mspContextByBizId != null) {
                StatisticInfo statisticInfo = mspContextByBizId.getStatisticInfo();
                String concat = "js_".concat(String.valueOf(substring));
                statisticInfo.addError(ErrorType.DEFAULT, concat, stringExtra + "|" + stringExtra2);
            }
        } else if (mspContextByBizId != null) {
            StatisticInfo statisticInfo2 = mspContextByBizId.getStatisticInfo();
            String concat2 = "js_".concat(stringExtra3);
            statisticInfo2.addError(ErrorType.WARNING, concat2, stringExtra + "|" + stringExtra2);
        }
    }
}
