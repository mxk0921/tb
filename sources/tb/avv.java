package tb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import com.taobao.tao.TrackBuried;
import java.util.HashMap;
import java.util.Properties;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class avv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(619708657);
    }

    public static void a(Activity activity, String str, String str2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55ab10e7", new Object[]{activity, str, str2, intent});
            return;
        }
        TBS.Page.create(str, "Webview");
        Uri parse = Uri.parse(str2);
        String stringExtra = intent.getStringExtra("sellerId");
        if (!TextUtils.isEmpty(stringExtra)) {
            Properties properties = new Properties();
            properties.put("seller_id", stringExtra);
            TBS.Page.updatePageProperties(str, properties);
        }
        if (parse != null && parse.isHierarchical()) {
            String queryParameter = parse.getQueryParameter("carrier_id");
            if (!TextUtils.isEmpty(queryParameter)) {
                TrackBuried.carrier = queryParameter;
            }
        }
        Properties properties2 = new Properties();
        properties2.put("url", str2);
        TBS.EasyTrace.updateEasyTraceActivityProperties(activity, properties2);
    }

    public static void b(String str, String str2, String str3) {
        char c = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6279b38", new Object[]{str, str2, str3});
            return;
        }
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        for (String str8 : str2.split("#")) {
            Uri parse = Uri.parse(str8);
            if (parse != null && parse.isHierarchical()) {
                String queryParameter = parse.getQueryParameter("locate");
                if (!TextUtils.isEmpty(queryParameter)) {
                    str6 = queryParameter;
                }
                String queryParameter2 = parse.getQueryParameter("actparam");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    str4 = queryParameter2;
                }
                String queryParameter3 = parse.getQueryParameter(h1p.LIST_PARAM_KEY);
                if (!TextUtils.isEmpty(queryParameter3)) {
                    str5 = queryParameter3;
                }
                String queryParameter4 = parse.getQueryParameter("carrier_id");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    str7 = queryParameter4;
                }
                if (str4 != null || str5 != null) {
                    if (!TextUtils.isEmpty(str4)) {
                        TrackBuried.list_Type = TrackBuried.list_TypeArr[c];
                        TrackBuried.list_Param = str4;
                        Properties properties = new Properties();
                        if (!TextUtils.isEmpty(str6)) {
                            TrackBuried.list_Param += "_" + str6;
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            properties.put("url", str3);
                        }
                        if (!TextUtils.isEmpty(str7)) {
                            properties.put("carrier_id", str7);
                            TrackBuried.carrier = str7;
                        }
                        TBS.Page.updatePageProperties(str, properties);
                        HashMap hashMap = new HashMap();
                        hashMap.put("action", "kpv");
                        TrackBuried.effectupdatePageProperties(str, hashMap);
                    } else if (!TextUtils.isEmpty(str5)) {
                        c = 0;
                        TrackBuried.list_Type = TrackBuried.list_TypeArr[0];
                        TrackBuried.list_Param = str5;
                        Properties properties2 = new Properties();
                        if (!TextUtils.isEmpty(str3)) {
                            properties2.put("url", str3);
                        }
                        if (!TextUtils.isEmpty(str7)) {
                            properties2.put("carrier_id", str7);
                            TrackBuried.carrier = str7;
                        }
                        TBS.Page.updatePageProperties(str, properties2);
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("action", "kpv");
                        TrackBuried.effectupdatePageProperties(str, hashMap2);
                    }
                    c = 0;
                }
            }
        }
    }
}
