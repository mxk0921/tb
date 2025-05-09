package com.alipay.android.msp.framework.statisticsv2.collector;

import android.text.TextUtils;
import com.alipay.android.msp.framework.constraints.IChannelInfo;
import com.alipay.android.msp.framework.statisticsv2.Grammar;
import com.alipay.android.msp.framework.statisticsv2.mechanism.PersistStorage;
import com.alipay.android.msp.framework.storage.PrefUtils;
import com.alipay.android.msp.pay.service.MspInitAssistService;
import com.alipay.android.msp.utils.ThreadSafeDateFormat;
import com.android.alibaba.ip.runtime.IpChange;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Date;
import java.util.Locale;
import tb.z2k;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SdkCollector {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static String f3665a = "";
    public static String b = "";

    public static synchronized String a() {
        synchronized (SdkCollector.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3a8fc60a", new Object[0]);
            }
            String str = Grammar.ATTR_DEFAULT_VALUE;
            String string = PrefUtils.getString(PersistStorage.FILE_STATISTICS_V2, "seqFirstTime", "");
            Integer num = PrefUtils.getInt(PersistStorage.FILE_STATISTICS_V2, z2k.d.ATTACHED_RESPONSE_HEADER_REQ_COUNT, 0);
            if (num == null) {
                num = 0;
            }
            if (num.intValue() + 1 <= 0 || TextUtils.isEmpty(string)) {
                string = ThreadSafeDateFormat.format(new Date(), "yyyy-MM-dd HH:mm:ss:SSS");
                num = 0;
            }
            Integer valueOf = Integer.valueOf(num.intValue() + 1);
            String str2 = string + Constants.WAVE_SEPARATOR + valueOf;
            PrefUtils.putString(PersistStorage.FILE_STATISTICS_V2, "seqFirstTime", string);
            PrefUtils.putInt(PersistStorage.FILE_STATISTICS_V2, z2k.d.ATTACHED_RESPONSE_HEADER_REQ_COUNT, valueOf);
            return str2;
        }
    }

    public static String b() {
        String str;
        IChannelInfo channelInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8523c6ca", new Object[0]);
        }
        if (TextUtils.isEmpty(f3665a)) {
            MspInitAssistService sdkInstance = MspInitAssistService.getSdkInstance();
            if (sdkInstance == null || (channelInfo = sdkInstance.getChannelInfo()) == null) {
                str = "com.alipay.quickpay";
            } else {
                str = channelInfo.getApiName();
            }
            f3665a = str.toLowerCase(Locale.CHINA);
        }
        return f3665a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b7, code lost:
        if (r6.equals("com.alipay.quickpay") == false) goto L_0x00af;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String collectData(java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.statisticsv2.collector.SdkCollector.collectData(java.lang.String):java.lang.String");
    }
}
