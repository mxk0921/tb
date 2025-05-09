package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.search.sf.BaseResultActivity;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.tao.util.MyUrlEncoder;
import com.taobao.tao.util.NavUrls;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class x3p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792243);
    }

    public static void a(String str, String str2, Map<String, String> map, Activity activity, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ad8b28e", new Object[]{str, str2, map, activity, str3});
        } else {
            b(str, str2, map, activity, str3, false);
        }
    }

    public static void d(Map<String, String> map, Context context, CommonBaseDatasource commonBaseDatasource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ef31fd1", new Object[]{map, context, commonBaseDatasource});
        } else if (!(context instanceof BaseResultActivity)) {
            b4p.b("SearchJmp", "当前activity不是搜索结果页，不能使用重搜功能");
        } else {
            HashMap hashMap = new HashMap();
            if (commonBaseDatasource != null) {
                eca.a(hashMap, commonBaseDatasource.getParamsSnapShot());
                String tab = commonBaseDatasource.getTab();
                if (!TextUtils.isEmpty(tab)) {
                    hashMap.put("tab", tab);
                }
            }
            if (map != null && map.size() > 0) {
                hashMap.putAll(map);
            }
            ((BaseResultActivity) context).F3(hashMap);
        }
    }

    public static void b(String str, String str2, Map<String, String> map, Activity activity, String str3, boolean z) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03e5206", new Object[]{str, str2, map, activity, str3, new Boolean(z)});
        } else if (activity != null) {
            Bundle bundle = new Bundle();
            bundle.putString("q", str);
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("tab", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("searchDoorFrom", str3);
            }
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        if (value == null) {
                            value = "";
                        }
                        bundle.putString(key, value);
                    }
                }
            }
            boolean equals = "true".equals(map.get(r4p.KEY_G_POP_UP));
            if (equals) {
                str4 = "https://main.m.taobao.com/search/index.html?tbsearch_popup=true&tbsearch_popup_animated=false";
            } else {
                str4 = NavUrls.NAV_URL_SEARCH_HOME;
            }
            if (z) {
                str4 = Uri.parse(str4).buildUpon().appendQueryParameter(r4p.KEY_SEARCHDOOR_LAUNCH_MODE, r4p.VALUE_SEARCHDOOR_LAUNCH_MODE_NEW_TASK).build().toString();
            }
            Nav.from(activity).withExtras(bundle).toUri(str4);
            activity.overridePendingTransition(0, 0);
            if (equals) {
                activity.finish();
            }
        }
    }

    public static void c(Map<String, String> map, Context context, String str, boolean z, Map<String, String> map2, boolean z2) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70d26aa8", new Object[]{map, context, str, new Boolean(z), map2, new Boolean(z2)});
            return;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("tab", str);
        }
        if (map.get("q") == null) {
            str2 = "";
        } else {
            str2 = map.get("q");
        }
        bundle.putString(r4p.KEY_LAYERED_SRP, "true");
        String str4 = NavUrls.nav_urls_auction_search[1];
        if (z2) {
            str3 = "https://main.m.taobao.com/search/index.html?q=" + MyUrlEncoder.encod(str2, "UTF-8");
            map2.put(r4p.KEY_POP_UP, "true");
            map2.put("tbsearch_popup_animated", "false");
            map2.put(r4p.KEY_POP_UP_HEIGHT, "1");
        } else {
            str3 = String.format(str4, MyUrlEncoder.encod(str2, "UTF-8"));
        }
        String str5 = map.get("channelSrp");
        if (!TextUtils.isEmpty(str5)) {
            map2.put("channelSrp", str5);
        }
        String str6 = map.get(xrl.G_CHANNELSRP);
        if (!TextUtils.isEmpty(str6)) {
            map2.put(xrl.G_CHANNELSRP, str6);
        }
        String c = f6p.c(str3, map2);
        if (!z || !(context instanceof Activity)) {
            Nav.from(context).withExtras(bundle).toUri(c);
            return;
        }
        Nav.from(context).withExtras(bundle).toUri(c);
        if (o4p.n2()) {
            ((Activity) context).overridePendingTransition(R.anim.tbsearch_anim_slide_right_to_left, R.anim.tbsearch_anim_exit_right_to_left);
        } else {
            ((Activity) context).overridePendingTransition(0, 0);
        }
    }
}
