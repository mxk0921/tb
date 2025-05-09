package com.taobao.search.sf.detailpre;

import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.preload.PreloadTaskBroadcastReceiver;
import com.taobao.android.preload.core.task.PreloadTaskEntity;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.task.Coordinator;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.detailpre.DetailPreRequestUtil;
import com.taobao.search.sf.widgets.list.listcell.baseauction.SFAuctionBaseCellBean;
import com.taobao.tao.Globals;
import com.taobao.tao.util.Constants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import tb.a07;
import tb.ckf;
import tb.d1a;
import tb.ftm;
import tb.g6p;
import tb.h19;
import tb.h1p;
import tb.itm;
import tb.mh1;
import tb.njg;
import tb.o4p;
import tb.pv8;
import tb.pwm;
import tb.t2o;
import tb.xpo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class DetailPreRequestUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_CONFIG_DETAIL_PRE_REQUEST_PAGE_TYPE = "detail_pre_request_page";
    public static final String TYPE_PAGE_IN_SHOP_SEARCH = "in_shop_search";
    public static final String TYPE_PAGE_MAIN_SEARCH = "main_search";
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final njg<DetailPreRequestUtil> f11698a = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new d1a() { // from class: tb.a5z
        @Override // tb.d1a
        public final Object invoke() {
            DetailPreRequestUtil q;
            q = DetailPreRequestUtil.q();
            return q;
        }
    });

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815793410);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final DetailPreRequestUtil a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DetailPreRequestUtil) ipChange.ipc$dispatch("75e0cd5f", new Object[]{this});
            }
            return (DetailPreRequestUtil) DetailPreRequestUtil.a().getValue();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b extends xpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ JSONObject c;

        public b(JSONObject jSONObject) {
            this.c = jSONObject;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/detailpre/DetailPreRequestUtil$notifyCellDetailPreRequest$2");
        }

        @Override // tb.xpo
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            Intent intent = new Intent("com.taobao.android.detail.StartPreloadTasks");
            intent.setPackage("com.taobao.taobao");
            intent.putExtra(PreloadTaskBroadcastReceiver.START_PRELOAD_TASKS, this.c.toJSONString());
            Globals.getApplication().sendBroadcast(intent);
        }
    }

    static {
        t2o.a(815793409);
    }

    public static final /* synthetic */ njg a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("59beb729", new Object[0]);
        }
        return f11698a;
    }

    public static final DetailPreRequestUtil e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailPreRequestUtil) ipChange.ipc$dispatch("75e0cd5f", new Object[0]);
        }
        return Companion.a();
    }

    public static final DetailPreRequestUtil q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailPreRequestUtil) ipChange.ipc$dispatch("9b8aabfc", new Object[0]);
        }
        return new DetailPreRequestUtil();
    }

    public static final void r(CommonSearchResult commonSearchResult, boolean z, String str, DetailPreRequestUtil detailPreRequestUtil, String str2) {
        String str3;
        JSONObject k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa73403a", new Object[]{commonSearchResult, new Boolean(z), str, detailPreRequestUtil, str2});
            return;
        }
        ckf.g(detailPreRequestUtil, "this$0");
        JSONArray jSONArray = new JSONArray();
        for (BaseCellBean baseCellBean : new ArrayList(commonSearchResult.getCells())) {
            if (ckf.b("item", baseCellBean.cardType) && (k = detailPreRequestUtil.k(baseCellBean, str2, z)) != null) {
                jSONArray.add(k);
            }
        }
        if (jSONArray.size() > 0) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "bizName", PreloadTaskEntity.PAGE_DETAIL);
            if (z) {
                str3 = "shopsearch";
            } else {
                str3 = "search";
            }
            jSONObject.put((JSONObject) PreloadTaskEntity.SOURCE_FROM, str3);
            jSONObject.put((JSONObject) "items", (String) jSONArray);
            jSONObject.put((JSONObject) "pageIndex", (String) Integer.valueOf(commonSearchResult.getPageNo()));
            jSONObject.put((JSONObject) PreloadTaskEntity.PAGE_TOKEN, str);
            String jSONString = jSONObject.toJSONString();
            Intent intent = new Intent("com.taobao.android.detail.StartPreloadTasks");
            intent.setPackage("com.taobao.taobao");
            intent.putExtra("updatePreloadDataSource", jSONString);
            Globals.getApplication().sendBroadcast(intent);
        }
    }

    public static final void s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f0afc68", new Object[]{new Boolean(z)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "bizName", PreloadTaskEntity.PAGE_DETAIL);
        String str = "search";
        jSONObject.put((JSONObject) PreloadTaskEntity.SOURCE_FROM, z ? "shopsearch" : str);
        if (z) {
            str = "shopsearch";
        }
        jSONObject.put((JSONObject) "bucketId", str);
        Intent intent = new Intent("com.taobao.android.detail.StartPreloadTasks");
        intent.setPackage("com.taobao.taobao");
        intent.putExtra("updateBucketId", jSONObject.toJSONString());
        Globals.getApplication().sendBroadcast(intent);
    }

    public final String c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b575b608", new Object[]{this, new Boolean(z)});
        }
        if (!z) {
            return "MainSrp_" + System.currentTimeMillis();
        }
        return "ShopSrp_" + System.currentTimeMillis();
    }

    public final String d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("676d74af", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            return TYPE_PAGE_IN_SHOP_SEARCH;
        }
        return TYPE_PAGE_MAIN_SEARCH;
    }

    public final void f(String str, List<? extends BaseTypedBean> list, String str2, boolean z) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbeb6e80", new Object[]{this, str, list, str2, new Boolean(z)});
        } else if (str != null && str.length() != 0 && list != null && !list.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            for (BaseTypedBean baseTypedBean : list) {
                JSONObject k = k(baseTypedBean, str2, z);
                if (k != null) {
                    jSONArray.add(k);
                }
            }
            if (jSONArray.size() > 0) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "bizName", PreloadTaskEntity.PAGE_DETAIL);
                if (z) {
                    str3 = "shopsearch";
                } else {
                    str3 = "search";
                }
                jSONObject.put((JSONObject) PreloadTaskEntity.SOURCE_FROM, str3);
                jSONObject.put((JSONObject) "items", (String) jSONArray);
                jSONObject.put((JSONObject) PreloadTaskEntity.PAGE_TOKEN, str);
                Coordinator.execute(new b(jSONObject));
            }
        }
    }

    public final void g(List<? extends MuiseCellBean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10ded256", new Object[]{this, list});
            return;
        }
        List<? extends MuiseCellBean> list2 = list;
        if (!(list2 == null || list2.isEmpty())) {
            JSONArray jSONArray = new JSONArray();
            for (MuiseCellBean muiseCellBean : list) {
                JSONObject l = l(muiseCellBean);
                if (l != null) {
                    jSONArray.add(l);
                }
            }
            if (jSONArray.size() > 0) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) PreloadTaskEntity.SOURCE_FROM, "search");
                jSONObject.put((JSONObject) "items", (String) jSONArray);
                itm.a().c(jSONObject.toString());
            }
        }
    }

    public final void h(List<? extends MuiseCellBean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4e7ef85", new Object[]{this, list});
            return;
        }
        List<? extends MuiseCellBean> list2 = list;
        if (!(list2 == null || list2.isEmpty())) {
            JSONArray jSONArray = new JSONArray();
            for (MuiseCellBean muiseCellBean : list) {
                JSONObject m = m(muiseCellBean);
                if (m != null) {
                    jSONArray.add(m);
                }
            }
            if (jSONArray.size() > 0) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "bizName", "new_detail");
                jSONObject.put((JSONObject) PreloadTaskEntity.SOURCE_FROM, "search");
                jSONObject.put((JSONObject) "items", (String) jSONArray);
                ftm b2 = itm.b("new_detail");
                if (b2 != null) {
                    b2.j(jSONObject.toString());
                }
            }
        }
    }

    public final void i(String str, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67231cc1", new Object[]{this, str, new Boolean(z)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "bizName", PreloadTaskEntity.PAGE_DETAIL);
        if (z) {
            str2 = "shopsearch";
        } else {
            str2 = "search";
        }
        jSONObject.put((JSONObject) PreloadTaskEntity.SOURCE_FROM, str2);
        jSONObject.put((JSONObject) PreloadTaskEntity.PAGE_TOKEN, str);
        String jSONString = jSONObject.toJSONString();
        Intent intent = new Intent("com.taobao.android.detail.StartPreloadTasks");
        intent.setPackage("com.taobao.taobao");
        intent.putExtra("clearPreloadDataSource", jSONString);
        Globals.getApplication().sendBroadcast(intent);
    }

    public final void j(final String str, final CommonSearchResult commonSearchResult, final String str2, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71fb306c", new Object[]{this, str, commonSearchResult, str2, new Boolean(z)});
        } else if (str != null && str.length() != 0 && commonSearchResult != null && !commonSearchResult.getCells().isEmpty()) {
            Coordinator.execute(new Runnable() { // from class: tb.z4z
                @Override // java.lang.Runnable
                public final void run() {
                    DetailPreRequestUtil.r(CommonSearchResult.this, z, str, this, str2);
                }
            });
        }
    }

    public final JSONObject l(MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c87f3fb6", new Object[]{this, muiseCellBean});
        }
        if (TextUtils.isEmpty(muiseCellBean.ndPreviewUrl) || TextUtils.isEmpty(muiseCellBean.ndPreviewBizName)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "url", muiseCellBean.ndPreviewUrl);
        jSONObject.put((JSONObject) "bizName", muiseCellBean.ndPreviewBizName);
        return jSONObject;
    }

    public final JSONObject m(MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3e21dc8d", new Object[]{this, muiseCellBean});
        }
        if (TextUtils.isEmpty(muiseCellBean.ndPreviewUrl)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "url", muiseCellBean.ndPreviewUrl);
        return jSONObject;
    }

    public final void n(String str, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6163c54a", new Object[]{this, str, new Boolean(z)});
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.y4z
                @Override // java.lang.Runnable
                public final void run() {
                    DetailPreRequestUtil.s(z);
                }
            });
        }
    }

    public final JSONObject k(BaseTypedBean baseTypedBean, String str, boolean z) {
        Object obj;
        String str2;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3f0ffe7d", new Object[]{this, baseTypedBean, str, new Boolean(z)});
        }
        if (baseTypedBean == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str3 = "search";
        if (baseTypedBean instanceof MuiseCellBean) {
            MuiseCellBean muiseCellBean = (MuiseCellBean) baseTypedBean;
            JSONObject jSONObject = muiseCellBean.mMuiseBean.model;
            ckf.f(jSONObject, "model");
            if (!TextUtils.isEmpty(str)) {
                linkedHashMap.put(Constants.KEY_SEARCH_KEYWORD, str);
                linkedHashMap.put(h1p.LIST_PARAM_KEY, str + '_' + muiseCellBean.abtest + '_' + muiseCellBean.rn);
            }
            linkedHashMap.put(h1p.LIST_TYPE_KEY, str3);
            if (z) {
                str3 = "shopsearch";
            }
            linkedHashMap.put("from", str3);
            Object obj2 = jSONObject.get("item_id");
            linkedHashMap.put("itemId", obj2 != null ? obj2.toString() : null);
            Object obj3 = jSONObject.get("item_id");
            linkedHashMap.put("id", obj3 != null ? obj3.toString() : null);
            Object obj4 = jSONObject.get(mh1.PRD_PICURL);
            String obj5 = obj4 != null ? obj4.toString() : null;
            linkedHashMap.put(mh1.PRD_PICURL, obj5);
            JSONObject d = h19.d(jSONObject, mh1.PRICE_BLOCK);
            if (d != null) {
                Object obj6 = d.get("price");
                linkedHashMap.put("price", obj6 != null ? obj6.toString() : null);
            }
            Object obj7 = jSONObject.get("title");
            linkedHashMap.put("title", obj7 != null ? obj7.toString() : null);
            String string2 = jSONObject.getString("prefetchImgRatio");
            if (!TextUtils.isEmpty(string2)) {
                linkedHashMap.put("prefetchImgRatio", string2);
                if (!ckf.b(string2, "1:1")) {
                    obj5 = jSONObject.getString(mh1.PRD_WF_PICURL);
                }
                linkedHashMap.put("prefetchImg", obj5 == null ? "" : obj5);
            }
            JSONArray c = h19.c(jSONObject, "extraParams");
            if (c != null) {
                int size = c.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject2 = c.getJSONObject(i);
                    String string3 = jSONObject2.getString("key");
                    if (!(string3 == null || (string = jSONObject2.getString("value")) == null)) {
                        linkedHashMap.put(string3, string);
                    }
                }
            }
        } else if (baseTypedBean instanceof SFAuctionBaseCellBean) {
            SFAuctionBaseCellBean sFAuctionBaseCellBean = (SFAuctionBaseCellBean) baseTypedBean;
            AuctionBaseBean auctionBaseBean = sFAuctionBaseCellBean.auctionBaseBean;
            if (auctionBaseBean == null) {
                return null;
            }
            if (!TextUtils.isEmpty(str)) {
                linkedHashMap.put(Constants.KEY_SEARCH_KEYWORD, str);
                linkedHashMap.put(h1p.LIST_PARAM_KEY, str + '_' + sFAuctionBaseCellBean.abtest + '_' + sFAuctionBaseCellBean.rn);
            }
            linkedHashMap.put(h1p.LIST_TYPE_KEY, str3);
            if (z) {
                str3 = "shopsearch";
            }
            linkedHashMap.put("from", str3);
            linkedHashMap.put("itemId", auctionBaseBean.itemId);
            linkedHashMap.put("id", auctionBaseBean.itemId);
            linkedHashMap.put(mh1.PRD_PICURL, auctionBaseBean.picUrl);
            linkedHashMap.put("price", auctionBaseBean.price);
            linkedHashMap.put("title", auctionBaseBean.title);
            Map<String, String> map = auctionBaseBean.extraParams;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                        linkedHashMap.put(key, value);
                    }
                }
            }
        } else if (baseTypedBean instanceof M3CellBean) {
            if (!TextUtils.isEmpty(str)) {
                linkedHashMap.put(Constants.KEY_SEARCH_KEYWORD, str);
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append('_');
                M3CellBean m3CellBean = (M3CellBean) baseTypedBean;
                obj = "prefetchImgRatio";
                sb.append(m3CellBean.abtest);
                sb.append('_');
                sb.append(m3CellBean.rn);
                linkedHashMap.put(h1p.LIST_PARAM_KEY, sb.toString());
            } else {
                obj = "prefetchImgRatio";
            }
            linkedHashMap.put(h1p.LIST_TYPE_KEY, str3);
            if (z) {
                str3 = "shopsearch";
            }
            linkedHashMap.put("from", str3);
            M3CellBean m3CellBean2 = (M3CellBean) baseTypedBean;
            linkedHashMap.put("itemId", m3CellBean2.itemId);
            linkedHashMap.put("id", m3CellBean2.itemId);
            JSONObject originData = m3CellBean2.getOriginData();
            linkedHashMap.put(mh1.PRD_PICURL, originData != null ? originData.getString(mh1.PRD_PICURL) : null);
            pwm priceInfo = m3CellBean2.getPriceInfo();
            linkedHashMap.put("price", priceInfo != null ? priceInfo.i() : null);
            linkedHashMap.put("title", m3CellBean2.getTitle());
            String prefetchImgRatio = m3CellBean2.getPrefetchImgRatio();
            if (prefetchImgRatio != null) {
                linkedHashMap.put(obj, prefetchImgRatio);
                if (ckf.b(prefetchImgRatio, "1:1")) {
                    str2 = m3CellBean2.getPicPath();
                } else {
                    str2 = m3CellBean2.getUprightImage();
                }
                linkedHashMap.put("prefetchImg", str2 == null ? "" : str2);
            }
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put((JSONObject) "itemId", (String) linkedHashMap.get("itemId"));
        if (o4p.M2()) {
            jSONObject3.put((JSONObject) "url", g6p.c(pv8.DETAIL_URL_PRE_1s, linkedHashMap));
        } else {
            jSONObject3.put((JSONObject) "queryParams", (String) JSON.toJSON(linkedHashMap));
        }
        return jSONObject3;
    }
}
