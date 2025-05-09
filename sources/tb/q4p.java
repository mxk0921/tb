package tb;

import android.app.Application;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.themis.ThemisConfig;
import com.taobao.search.common.SearchSdk;
import com.taobao.search.sf.widgets.searchbar.SearchBarTagBean;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class q4p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793379);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        SearchSdk.init();
        c4p.i().d("SearchOutLinkPreloadJob", "preload init start");
        if (hashMap == null) {
            c4p.i().d("SearchOutLinkPreloadJob", "params is null， 预加载异常");
            return;
        }
        Object obj = hashMap.get("startIntent");
        if (!(obj instanceof String)) {
            c4p.i().d("SearchOutLinkPreloadJob", "the dpLink is not instance of String");
            return;
        }
        Uri parse = Uri.parse((String) obj);
        if (parse == null) {
            c4p.i().d("SearchOutLinkPreloadJob", "dateUri is null");
            return;
        }
        Map<String, String> d = cql.d(parse);
        b(d);
        if (!d.containsKey(r4p.KEY_SRP_SEARCH_BAR_TAG_STYLE) && y4p.q()) {
            d.put(r4p.KEY_SRP_SEARCH_BAR_TAG_STYLE, "true");
        }
        c4p.i().d("SearchOutLinkPreloadJob", "fireFirstSearch 调用");
    }

    public static void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce656c2", new Object[]{map});
            return;
        }
        String remove = map.remove(h1p.KEY_SEARCH_BAR_TAG);
        if (!TextUtils.isEmpty(remove)) {
            try {
                JSONArray parseArray = JSON.parseArray(remove);
                if (parseArray != null) {
                    StringBuilder sb = new StringBuilder(map.get("q"));
                    for (int i = 0; i < parseArray.size(); i++) {
                        SearchBarTagBean fromJson = SearchBarTagBean.fromJson(parseArray.getJSONObject(i));
                        if (fromJson != null) {
                            Map<String, String> params = fromJson.getParams();
                            if (params != null) {
                                map.putAll(params);
                            }
                            String q = fromJson.getQ();
                            if (!TextUtils.isEmpty(q)) {
                                sb.append(" ");
                                sb.append(q);
                            }
                            map.put("onTag", fromJson.getDescription());
                            map.put("tagAction", ThemisConfig.SCENE_SELECT);
                        }
                    }
                    map.put(r4p.KEY_TAG_SEARCH_KEYWORD, sb.toString());
                }
            } catch (Exception unused) {
            }
        }
    }
}
