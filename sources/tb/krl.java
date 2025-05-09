package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.CoreConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class krl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(713031853);
    }

    public static String a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("880171bc", new Object[]{intent});
        }
        if (intent == null) {
            return "";
        }
        return intent.getStringExtra("from");
    }

    public static String b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4d22f9a", new Object[]{intent});
        }
        String str = "";
        if (intent == null) {
            return str;
        }
        try {
            str = intent.getStringExtra(CoreConstants.IN_PARAM_ARCHIVE);
            if (TextUtils.isEmpty(str)) {
                str = intent.getStringExtra(CoreConstants.IN_PARAM_IS_ARCHIVE_ORDER);
            }
        } catch (Exception unused) {
        }
        if (intent.getData() == null || !TextUtils.isEmpty(str)) {
            return str;
        }
        String queryParameter = intent.getData().getQueryParameter(CoreConstants.IN_PARAM_ARCHIVE);
        return TextUtils.isEmpty(queryParameter) ? intent.getData().getQueryParameter(CoreConstants.IN_PARAM_IS_ARCHIVE_ORDER) : queryParameter;
    }

    public static String c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77dcc7e9", new Object[]{intent});
        }
        String str = null;
        if (intent == null) {
            return null;
        }
        try {
            str = intent.getStringExtra("bizOrderId");
            if (TextUtils.isEmpty(str)) {
                str = intent.getStringExtra(CoreConstants.IN_PARAM_PAY_ORDER_ID);
                if (TextUtils.isEmpty(str)) {
                    str = intent.getStringExtra("orderId");
                }
            }
        } catch (Exception unused) {
        }
        Uri data = intent.getData();
        if (data == null || !TextUtils.isEmpty(str)) {
            return str;
        }
        String queryParameter = data.getQueryParameter(CoreConstants.IN_PARAM_PAY_ORDER_ID);
        if (TextUtils.isEmpty(queryParameter)) {
            queryParameter = data.getQueryParameter("bizOrderId");
        }
        return TextUtils.isEmpty(queryParameter) ? data.getQueryParameter("orderId") : queryParameter;
    }
}
