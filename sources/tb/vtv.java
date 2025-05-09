package tb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TrackBuried;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class vtv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(619708656);
    }

    public static void a(Activity activity, String str, String str2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55ab10e7", new Object[]{activity, str, str2, intent});
            return;
        }
        Uri parse = Uri.parse(str2);
        String stringExtra = intent.getStringExtra("sellerId");
        if (!TextUtils.isEmpty(stringExtra)) {
            HashMap hashMap = new HashMap();
            hashMap.put("seller_id", stringExtra);
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(activity, hashMap);
        }
        if (parse != null && parse.isHierarchical()) {
            String queryParameter = parse.getQueryParameter("carrier_id");
            if (!TextUtils.isEmpty(queryParameter)) {
                TrackBuried.carrier = queryParameter;
            }
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("url", str2);
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(activity, hashMap2);
    }

    public static void b(Activity activity, String str, String str2, String str3) {
        char c = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2f3418a", new Object[]{activity, str, str2, str3});
            return;
        }
        String[] split = str2.split("#");
        int length = split.length;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        for (int i = 0; i < length; i++) {
            Uri parse = Uri.parse(split[i]);
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
                if (!(str4 == null && str5 == null)) {
                    if (!TextUtils.isEmpty(str4)) {
                        TrackBuried.list_Type = TrackBuried.list_TypeArr[c];
                        TrackBuried.list_Param = str4;
                        HashMap hashMap = new HashMap();
                        if (!TextUtils.isEmpty(str6)) {
                            StringBuilder sb = new StringBuilder();
                            split = split;
                            sb.append(TrackBuried.list_Param);
                            sb.append("_");
                            sb.append(str6);
                            TrackBuried.list_Param = sb.toString();
                        } else {
                            split = split;
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            hashMap.put("url", str3);
                        }
                        if (!TextUtils.isEmpty(str7)) {
                            hashMap.put("carrier_id", str7);
                            TrackBuried.carrier = str7;
                        }
                        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(activity, hashMap);
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("action", "kpv");
                        TrackBuried.effectupdatePageProperties(str, hashMap2);
                    } else {
                        split = split;
                        if (!TextUtils.isEmpty(str5)) {
                            c = 0;
                            TrackBuried.list_Type = TrackBuried.list_TypeArr[0];
                            TrackBuried.list_Param = str5;
                            HashMap hashMap3 = new HashMap();
                            if (!TextUtils.isEmpty(str3)) {
                                hashMap3.put("url", str3);
                            }
                            if (!TextUtils.isEmpty(str7)) {
                                hashMap3.put("carrier_id", str7);
                                TrackBuried.carrier = str7;
                            }
                            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(activity, hashMap3);
                            HashMap hashMap4 = new HashMap();
                            hashMap4.put("action", "kpv");
                            TrackBuried.effectupdatePageProperties(str, hashMap4);
                        }
                    }
                    c = 0;
                }
            }
            split = split;
        }
    }
}
