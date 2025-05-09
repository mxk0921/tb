package com.taobao.android.detail.ttdetail.request.params;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.preload.TBBuyPreloadScene;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.i64;
import tb.t2o;
import tb.wrm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class PreloadRequestParams implements MtopRequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String K_COMMON_PARAMS = "commonParams";
    private static final String K_ITEM_PARAMS = "itemParams";
    private List<wrm> mItemList;
    private String mToken;

    static {
        t2o.a(912262185);
        t2o.a(912262184);
    }

    public PreloadRequestParams(String str, List<wrm> list) {
        this.mToken = str;
        this.mItemList = list;
    }

    private Map<String, String> buildParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("acc73ebf", new Object[]{this, map});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("detail_v", "3.3.2");
        hashMap.put(K_ITEM_PARAMS, JSON.toJSONString(map));
        hashMap.put(K_COMMON_PARAMS, JSON.toJSONString(i64.a()));
        return hashMap;
    }

    public String getDetailToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5d35747", new Object[]{this});
        }
        return this.mToken;
    }

    public List<wrm> getItemList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c2c777b9", new Object[]{this});
        }
        return this.mItemList;
    }

    public boolean isContainItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("401ab552", new Object[]{this, str})).booleanValue();
        }
        for (wrm wrmVar : this.mItemList) {
            if (TextUtils.equals(str, wrmVar.b)) {
                return true;
            }
        }
        return false;
    }

    public boolean isNavPreload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc9b48bb", new Object[]{this})).booleanValue();
        }
        for (wrm wrmVar : this.mItemList) {
            if (wrmVar != null) {
                return TextUtils.equals(TBBuyPreloadScene.NAV, wrmVar.c);
            }
        }
        return true;
    }

    @Override // com.taobao.android.detail.ttdetail.request.params.MtopRequestParams
    public String toData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("add28f54", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        for (wrm wrmVar : this.mItemList) {
            if (!(wrmVar == null || wrmVar.f30875a == null || hashMap.containsKey(wrmVar.b))) {
                hashMap.put(wrmVar.b, wrmVar.f30875a.toJSONString());
            }
        }
        return JSON.toJSONString(buildParams(hashMap));
    }
}
