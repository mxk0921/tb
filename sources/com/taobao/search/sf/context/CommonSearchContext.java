package com.taobao.search.sf.context;

import android.content.Intent;
import android.os.Parcel;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.context.BaseSearchContext;
import com.taobao.android.task.Coordinator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import tb.cql;
import tb.h1p;
import tb.mg8;
import tb.o4p;
import tb.qrl;
import tb.r4p;
import tb.t2o;
import tb.xrl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class CommonSearchContext extends BaseSearchContext {
    private static final String KEY_BIZARGS = "bizargs";
    private static volatile List<String> sBlackList = new ArrayList();
    public static final HashSet<String> sOtherTabWhiteList;
    private Map<String, Map<String, String>> mTabParamsMap = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String c0 = o4p.c0();
            if (!TextUtils.isEmpty(c0)) {
                List unused = CommonSearchContext.sBlackList = new ArrayList(Arrays.asList(c0.split("&")));
            }
        }
    }

    public CommonSearchContext(Map<String, String> map) {
        super(filterBlackListParams(map));
        updateBlackList();
        String param = getParam("catId", "");
        if (!TextUtils.isEmpty(param)) {
            setParam(r4p.KEY_CATMAP, param);
        }
    }

    private static Map<String, String> filterBlackListParams(Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            for (String str : sBlackList) {
                map.remove(str);
            }
        }
        return map;
    }

    public static CommonSearchContext fromIntent(Intent intent) {
        return fromMap(cql.b(intent));
    }

    public static CommonSearchContext fromMap(Map<String, String> map) {
        if (map == null) {
            return new CommonSearchContext();
        }
        return new CommonSearchContext(map);
    }

    private void handleBizArgs() {
        Map<String, String> e = cql.e(getParam(KEY_BIZARGS));
        if (e != null) {
            for (Map.Entry<String, String> entry : e.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    setParam(key, value);
                }
            }
        }
    }

    private void rewriteKeywordValue() {
        String removeParam = removeParam("query");
        String removeParam2 = removeParam("search");
        String param = getParam("q");
        if (!TextUtils.isEmpty(param)) {
            removeParam = param;
        }
        if (!TextUtils.isEmpty(removeParam)) {
            removeParam2 = removeParam;
        }
        if (removeParam2 == null || "null".equals(removeParam2)) {
            removeParam2 = "";
        }
        setParam("q", removeParam2);
    }

    private static void updateBlackList() {
        Coordinator.execute(new a());
    }

    public String getChannelSrp() {
        String param = getParam(xrl.G_CHANNELSRP);
        if (TextUtils.isEmpty(param)) {
            return getParam("channelSrp");
        }
        return param;
    }

    public String getDatasourceToken() {
        return getParam(h1p.KEY_DATASOURCE_TOKEN);
    }

    public Map<String, String> getGlobalParams() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : getParamsSnapshot().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value) && key.startsWith(r4p.GLOBAL_PARAM_PREFIX)) {
                hashMap.put(key, value);
            }
        }
        return hashMap;
    }

    public String getKeyword() {
        return getParam("q");
    }

    public Map<String, String> getOtherTabParams() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : this.mParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.isEmpty(key) && (sOtherTabWhiteList.contains(key) || key.startsWith(r4p.GLOBAL_PARAM_PREFIX))) {
                hashMap.put(key, value);
            }
        }
        return hashMap;
    }

    public String getParamIncludingGlobal(String str) {
        String param = getParam(str);
        if (!TextUtils.isEmpty(param)) {
            return param;
        }
        return getParam(r4p.GLOBAL_PARAM_PREFIX + str);
    }

    public float getPopupHeight() {
        String param = getParam(r4p.KEY_POP_UP_HEIGHT);
        if (TextUtils.isEmpty(param)) {
            return -1.0f;
        }
        return qrl.d(param, -1.0f);
    }

    public Map<String, String> getTabParams(String str) {
        return this.mTabParamsMap.get(str);
    }

    public void handleInShopSearchParams() {
        String[] strArr = {"sellerId", "seller_id", "userId", "user_id"};
        int i = 0;
        while (true) {
            if (i >= 4) {
                break;
            }
            String param = getParam(strArr[i]);
            if (!TextUtils.isEmpty(param)) {
                this.mParams.put("sellerId", param);
                break;
            }
            i++;
        }
        this.mParams.remove("userId");
        this.mParams.remove("user_id");
        String param2 = getParam("shop_id");
        if (!TextUtils.isEmpty(param2)) {
            this.mParams.remove("shop_id");
            this.mParams.put("shopId", param2);
        }
    }

    public void init() {
        rewriteKeywordValue();
        handleBizArgs();
    }

    public boolean isChannelSrp() {
        return !TextUtils.isEmpty(getChannelSrp());
    }

    public boolean isDynamicSearchBar() {
        return TextUtils.equals(getParam("dynamicSearchBar"), "true");
    }

    public boolean isGallerySrp() {
        return isGallerySrp(getParam("m"));
    }

    public boolean isLongSleeveRecommendModule() {
        return TextUtils.equals(r4p.VALUE_LONG_SLEEVE_RECOMMEND, getParam("m"));
    }

    public boolean isPopupCloseStyle() {
        return TextUtils.equals(getParamIncludingGlobal(r4p.KEY_POP_UP_STYLE), "close");
    }

    public boolean isPopupDrag() {
        return TextUtils.equals(getParamIncludingGlobal(r4p.KEY_POP_UP_STYLE), mg8.EVENT_DRAG);
    }

    public boolean isPopupIcon() {
        return TextUtils.equals(getParamIncludingGlobal(r4p.KEY_POP_UP_STYLE), "icon");
    }

    public boolean isPopupSrp() {
        String param = getParam(r4p.KEY_POP_UP);
        if (!o4p.o1()) {
            return false;
        }
        return TextUtils.equals(param, "true");
    }

    public boolean isSameStyleModule() {
        return TextUtils.equals(r4p.VALUE_SHOWTYPE_SAME, getParam(r4p.KEY_SHOWTYPE));
    }

    public boolean isShopSimilarSearchModule() {
        return TextUtils.equals(r4p.VALUE_SHOWTYPE_SIMILAR_SHOP, getParam("m")) || TextUtils.equals(r4p.VALUE_SIMILAR_SHOP_NEW, getParam("m"));
    }

    public boolean isSimilarModule() {
        return TextUtils.equals(r4p.VALUE_SHOWTYPE_SIMILAR, getParam(r4p.KEY_SHOWTYPE));
    }

    public void setTabParams(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Map<String, String> map = this.mTabParamsMap.get(str);
            if (map == null) {
                map = new HashMap<>();
                this.mTabParamsMap.put(str, map);
            }
            map.put(str2, str3);
        }
    }

    public void updateParams(Map<String, String> map) {
        this.mParams.clear();
        handleParams(filterBlackListParams(map));
        String param = getParam("catId", "");
        if (!TextUtils.isEmpty(param)) {
            setParam(r4p.KEY_CATMAP, param);
        }
    }

    public static boolean isGallerySrp(String str) {
        return TextUtils.equals(str, "pictureview");
    }

    static {
        t2o.a(815793385);
        HashSet<String> hashSet = new HashSet<>();
        sOtherTabWhiteList = hashSet;
        hashSet.add("q");
        hashSet.add("from");
        hashSet.add("search_action");
        hashSet.add(r4p.KEY_JARVIS_DISABLED);
        hashSet.add(r4p.KEY_CHANGED_ADDRESS);
        hashSet.add(r4p.KEY_HAS_TAB);
    }

    public CommonSearchContext() {
    }

    public CommonSearchContext(Parcel parcel) {
        super(parcel);
    }
}
