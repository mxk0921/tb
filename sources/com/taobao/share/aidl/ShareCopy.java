package com.taobao.share.aidl;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.statistic.TBS;
import com.taobao.taobao.R;
import com.ut.share.ShareServiceApi;
import tb.bwr;
import tb.eis;
import tb.fwr;
import tb.hip;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ShareCopy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ShareCopy";

    static {
        t2o.a(664797189);
    }

    @Deprecated
    public static boolean copyToClipboard(Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d36dd67", new Object[]{context, str, str2, str3, str4})).booleanValue();
        }
        return doCopy(context, str, str2, str3, str4);
    }

    public static boolean doCopy(Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fe5c5ad", new Object[]{context, str, str2, str3, str4})).booleanValue();
        }
        String tbsForItemCopy = tbsForItemCopy(str, str3, str4);
        if (!TextUtils.isEmpty(str4)) {
            bwr.h().x(str4);
        } else {
            bwr.h().x("other");
        }
        return doCopyDirectory(context, str, str2, tbsForItemCopy);
    }

    public static boolean doCopyDirectory(final Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36408376", new Object[]{context, str, str2, str3})).booleanValue();
        }
        if (TextUtils.isEmpty(str3)) {
            hip.b(context, str2);
            ShareBizAdapter.getInstance().getAppEnv().j(str2);
            new Handler(context.getMainLooper()).post(new Runnable() { // from class: com.taobao.share.aidl.ShareCopy.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Toast.makeText(context, Localization.q(R.string.app_copy_success), 0).show();
                    }
                }
            });
        } else {
            eis eisVar = new eis();
            eisVar.a(str);
            eisVar.e(str3.replace(" ", ""));
            eisVar.d("copy");
            eisVar.b(bwr.h().o());
            eisVar.c(str2);
            ShareBizAdapter.getInstance().getShareEngine().getShareBizEngine().a(eisVar);
        }
        return true;
    }

    public static String tbsForItemCopy(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42e1288f", new Object[]{str, str2, str3});
        }
        if (!TextUtils.isEmpty(str2)) {
            str2 = ShareServiceApi.urlBackFlow(str, "GoodsTitleURL", str2);
        }
        if ("item".equals(str3) || (!TextUtils.isEmpty(str2) && str2.contains("sourceType=item"))) {
            TBS.Ext.commitEvent(5002, str, "GoodsTitleURL", str2);
        } else {
            TextUtils.isEmpty(str2);
        }
        return str2;
    }

    @Deprecated
    public static boolean doCopy(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("316d25a3", new Object[]{context, str, str2, str3})).booleanValue();
        }
        String tbsForItemCopy = tbsForItemCopy(str, str3, null);
        if (!TextUtils.isEmpty(str2)) {
            return doCopyDirectory(context, str, str2, tbsForItemCopy);
        }
        fwr.c(TAG, Localization.q(R.string.taobao_app_1010_1_18296));
        return false;
    }
}
