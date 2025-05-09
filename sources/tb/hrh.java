package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.search.TaoliveSearchHotWords;
import com.taobao.android.searchbaseframe.business.weex.multiplelist.XslMUSComponent;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultLayoutInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.jarvis.bean.DynamicCardBean;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.mmd.datasource.bean.SearchApiModel;
import com.taobao.search.musie.list.horizontal.HorizontalXslComponent;
import com.taobao.search.refactor.MSearchResult;
import com.taobao.search.sf.widgets.list.listcell.baseauction.SFAuctionBaseCellBean;
import com.taobao.search.sf.widgets.topbar.SFTopBarBean;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import tb.gy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class hrh implements utc<frh, MSearchResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final lrh f20841a;
    private final boolean b = y4p.o();

    static {
        t2o.a(815792873);
        t2o.a(993001494);
    }

    public hrh(lrh lrhVar) {
        ckf.g(lrhVar, "flow");
        this.f20841a = lrhVar;
    }

    private final void A(boolean z, boolean z2, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb1c510a", new Object[]{this, new Boolean(z), new Boolean(z2), obj, obj2});
        } else if ((obj2 instanceof JSONArray) && z2) {
            ckf.e(obj, "null cannot be cast to non-null type com.alibaba.fastjson.JSONArray");
            JSONArray jSONArray = (JSONArray) obj;
            if (z) {
                jSONArray.addAll(0, (Collection) obj2);
            } else {
                jSONArray.addAll((Collection) obj2);
            }
        }
    }

    private final void B(String str, JSONObject jSONObject, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("302cdd36", new Object[]{this, str, jSONObject, obj, obj2});
        } else if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
            ((JSONObject) obj2).putAll((Map) obj);
            jSONObject.put((JSONObject) str, (String) obj2);
        }
    }

    private final void D(JSONObject jSONObject) {
        JSONObject jSONObject2;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceb05489", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            try {
                JSONObject jSONObject3 = jSONObject.getJSONObject("bizApi");
                if (jSONObject3 != null) {
                    for (Map.Entry<String, Object> entry : jSONObject3.entrySet()) {
                        ckf.f(entry, "next(...)");
                        Map.Entry<String, Object> entry2 = entry;
                        String key = entry2.getKey();
                        Object value = entry2.getValue();
                        if (value instanceof JSONObject) {
                            jSONObject2 = (JSONObject) value;
                        } else {
                            jSONObject2 = null;
                        }
                        if (jSONObject2 != null) {
                            HashMap<String, String> hashMap = new HashMap<>();
                            for (Map.Entry<String, Object> entry3 : jSONObject2.entrySet()) {
                                ckf.f(entry3, "next(...)");
                                Map.Entry<String, Object> entry4 = entry3;
                                Object value2 = entry4.getValue();
                                if (value2 instanceof String) {
                                    str = (String) value2;
                                } else {
                                    str = null;
                                }
                                if (str != null) {
                                    hashMap.put(entry4.getKey(), str);
                                }
                            }
                            if (!hashMap.isEmpty()) {
                                yzo yzoVar = yzo.INSTANCE;
                                ckf.d(key);
                                yzoVar.a(key, hashMap);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                irh.a("bizApiParams", th);
            }
        }
    }

    private final void E(MSearchResult mSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f733b614", new Object[]{this, mSearchResult, jSONObject});
            return;
        }
        try {
            String string = jSONObject.getString("filterMod");
            if (string != null) {
                mSearchResult.addExtMod("filterMod", string);
            }
            String string2 = jSONObject.getString("sideMod");
            if (!TextUtils.isEmpty(string2)) {
                mSearchResult.addExtMod("sideMod", string2);
            }
        } catch (Throwable th) {
            irh.a("extMod", th);
        }
    }

    private final void F(MSearchResult mSearchResult, JSONObject jSONObject) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1502bc94", new Object[]{this, mSearchResult, jSONObject});
        } else if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("extraConfig");
                if (!(jSONObject2 == null || (jSONArray = jSONObject2.getJSONArray("clearParams")) == null)) {
                    mSearchResult.clearParams = new HashSet();
                    int size = jSONArray.size();
                    for (int i = 0; i < size; i++) {
                        String string = jSONArray.getString(i);
                        if (!TextUtils.isEmpty(string)) {
                            mSearchResult.clearParams.add(string);
                        }
                    }
                }
            } catch (Throwable th) {
                irh.a("extraConfig", th);
            }
        }
    }

    private final void G(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("149662c0", new Object[]{this, jSONArray, jSONObject});
            return;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray("foldHeader");
        if (jSONArray2 != null) {
            jSONArray.addAll(jSONArray2);
        }
    }

    private final void H(BaseCellBean baseCellBean, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("838a8c2b", new Object[]{this, baseCellBean, jSONObject});
            return;
        }
        boolean booleanValue = jSONObject.getBooleanValue("fullSpan");
        if (baseCellBean instanceof MuiseCellBean) {
            Map<String, Object> map = ((MuiseCellBean) baseCellBean).mExtraObj;
            ckf.f(map, "mExtraObj");
            map.put("fullSpan", Boolean.valueOf(booleanValue));
        } else if (baseCellBean instanceof WeexCellBean) {
            Map<String, Object> map2 = ((WeexCellBean) baseCellBean).mExtraObj;
            ckf.f(map2, "mExtraObj");
            map2.put("fullSpan", Boolean.valueOf(booleanValue));
        }
    }

    private final void I(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76055225", new Object[]{this, jSONArray, jSONObject});
            return;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray("halfStickyHeader");
        if (jSONArray2 != null && jSONArray != null) {
            jSONArray.addAll(jSONArray2);
        }
    }

    private final void J(MSearchResult mSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b9cbf30", new Object[]{this, mSearchResult, jSONObject});
        } else {
            mSearchResult.sessionId = jSONObject.getString("sessionid");
        }
    }

    private final BaseCellBean K(MSearchResult mSearchResult, JSONObject jSONObject, JSONObject jSONObject2, Map<String, ? extends Object> map, int i, List<String> list) {
        JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseCellBean) ipChange.ipc$dispatch("d158b7d6", new Object[]{this, mSearchResult, jSONObject, jSONObject2, map, new Integer(i), list});
        }
        BaseCellBean b = mSearchResult.c().b().b(jSONObject, mSearchResult, jSONObject2);
        String str = null;
        if (b == null) {
            return null;
        }
        H(b, jSONObject);
        boolean z = b instanceof SFAuctionBaseCellBean;
        if (z) {
            ((SFAuctionBaseCellBean) b).pageInfo = jSONObject2;
        } else if (b instanceof MuiseCellBean) {
            ((MuiseCellBean) b).mExtraObj.putAll(map);
        } else if (b instanceof WeexCellBean) {
            ((WeexCellBean) b).mExtraObj.putAll(map);
        }
        boolean z2 = b instanceof MuiseCellBean;
        if (z2 && (d = h19.d(jSONObject, r4p.VALUE_MODULE_DYNAMIC_CARD)) != null) {
            jSONObject.remove(r4p.VALUE_MODULE_DYNAMIC_CARD);
            DynamicCardBean dynamicCardBean = new DynamicCardBean();
            dynamicCardBean.mOriginData = d;
            dynamicCardBean.mDynamicCellBean = mSearchResult.c().b().b(d, mSearchResult, jSONObject2);
            Map<String, Object> map2 = ((MuiseCellBean) b).mExtraObj;
            ckf.f(map2, "mExtraObj");
            map2.put("dynamicCardBean", dynamicCardBean);
            BaseCellBean baseCellBean = dynamicCardBean.mDynamicCellBean;
            if (baseCellBean != null) {
                str = baseCellBean.type;
            }
            mSearchResult.addUsedTemplate(str);
        }
        JSONObject e0 = e0(jSONObject, list);
        if (z) {
            ((SFAuctionBaseCellBean) b).wsData = e0;
        } else if (z2) {
            Map<String, Object> map3 = ((MuiseCellBean) b).mExtraObj;
            ckf.f(map3, "mExtraObj");
            map3.put("wsData", e0);
        } else if (b instanceof M3CellBean) {
            ((M3CellBean) b).setWsData(e0);
        }
        b.pageSize = i;
        b.setOriginPageSize(i);
        return b;
    }

    private final void L(MSearchResult mSearchResult, frh frhVar, JSONObject jSONObject, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e68d6b97", new Object[]{this, mSearchResult, frhVar, jSONObject, list});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray(HorizontalXslComponent.ATTR_ITEMS_ARRAY);
        if (jSONArray == null) {
            jSONArray = jSONObject.getJSONArray("shopArray");
        }
        ArrayList arrayList = new ArrayList();
        y(mSearchResult, jSONArray, jSONObject, arrayList, list, true);
        frhVar.c(arrayList);
    }

    private final void M(MSearchResult mSearchResult, JSONObject jSONObject) {
        JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eeb237e", new Object[]{this, mSearchResult, jSONObject});
            return;
        }
        try {
            JSONObject d2 = h19.d(jSONObject, "jarvisFeature");
            if (!(d2 == null || (d = h19.d(d2, "queryFeature")) == null)) {
                HashMap hashMap = new HashMap();
                for (Map.Entry<String, Object> entry : d.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (!TextUtils.isEmpty(key) && value != null) {
                        hashMap.put(key, value.toString());
                    }
                }
                mSearchResult.jarvisFeature = hashMap;
            }
        } catch (Throwable th) {
            irh.a("jarvisFeature", th);
        }
    }

    private final void N(MSearchResult mSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75a48953", new Object[]{this, mSearchResult, jSONObject});
            return;
        }
        try {
            String string = jSONObject.getString("jarvisConfig");
            if (!TextUtils.isEmpty(string)) {
                mSearchResult.addExtMod("jarvisConfig", string);
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("jarvisContext");
            if (jSONObject2 != null) {
                mSearchResult.addExtMod("jarvisContext", jSONObject2.toString());
                if (mSearchResult.isNew()) {
                    mSearchResult.spClientSession = jSONObject2.getString("isOpenDuplicateRemove");
                }
            }
        } catch (Throwable th) {
            irh.a("jarvis", th);
        }
    }

    private final void Q(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09c1203", new Object[]{this, jSONArray, jSONObject});
            return;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray("listHeader");
        if (jSONArray2 != null) {
            jSONArray.addAll(jSONArray2);
        }
    }

    private final void R(MSearchResult mSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("378be5d9", new Object[]{this, mSearchResult, jSONObject});
            return;
        }
        try {
            JSONObject d = h19.d(jSONObject, "pkModule");
            if (d != null) {
                mSearchResult.pkModuleBean = mSearchResult.c().n().d(d, mSearchResult, jSONObject.getJSONObject(HorizontalXslComponent.ATTR_PAGE_INFO));
            }
        } catch (Throwable th) {
            irh.a(PushConstants.URI_PACKAGE_NAME, th);
        }
    }

    private final void S(MSearchResult mSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68022d0e", new Object[]{this, mSearchResult, jSONObject});
            return;
        }
        JSONObject d = h19.d(jSONObject, AgooConstants.MESSAGE_POPUP);
        if (d != null) {
            BaseTypedBean d2 = mSearchResult.c().n().d(d, mSearchResult, jSONObject.getJSONObject(HorizontalXslComponent.ATTR_PAGE_INFO));
            mSearchResult.popupBean = d2 instanceof MuiseBean ? (MuiseBean) d2 : null;
        }
    }

    private final void T(MSearchResult mSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa29cab0", new Object[]{this, mSearchResult, jSONObject});
            return;
        }
        JSONObject d = h19.d(jSONObject, "switches");
        if (d != null) {
            mSearchResult.isPullRefreshEnabled = d.getBooleanValue("enableSrpRefresh");
        }
    }

    private final void U(JSONObject jSONObject, frh frhVar) {
        nun nunVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdd6d933", new Object[]{this, jSONObject, frhVar});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("refreshInfo");
        if (jSONObject2 != null) {
            boolean booleanValue = jSONObject2.getBooleanValue("refreshable");
            JSONObject jSONObject3 = jSONObject2.getJSONObject("guide");
            String str = null;
            if (jSONObject3 != null) {
                String string = jSONObject3.getString("lottie");
                int intValue = jSONObject3.getIntValue("width");
                int intValue2 = jSONObject3.getIntValue("height");
                String string2 = jSONObject3.getString("text");
                ckf.f(string2, "getString(...)");
                nunVar = new nun(string, intValue, intValue2, string2, jSONObject3.getIntValue("triggerIndex"));
            } else {
                nunVar = null;
            }
            JSONObject jSONObject4 = jSONObject2.getJSONObject(TaoliveSearchHotWords.TYPE_HINT);
            if (jSONObject4 != null) {
                str = jSONObject4.getString("text");
            }
            frhVar.C0(new run(booleanValue, str, nunVar));
        }
    }

    private final void V(JSONArray jSONArray, JSONObject jSONObject, MSearchResult mSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e370d31", new Object[]{this, jSONArray, jSONObject, mSearchResult});
            return;
        }
        Object obj = jSONObject.get("sceneHeader");
        JSONObject jSONObject2 = obj instanceof JSONObject ? (JSONObject) obj : null;
        if (jSONObject2 != null) {
            jSONArray.add(jSONObject2);
            JSONObject jSONObject3 = jSONObject2.getJSONObject("style");
            if (jSONObject3 != null) {
                String string = jSONObject3.getString("enableSlide");
                if (!TextUtils.isEmpty(string)) {
                    mSearchResult.addExtMod("enableSlide", string);
                }
            }
        }
    }

    private final void W(MSearchResult mSearchResult, JSONObject jSONObject) {
        String obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec834e4a", new Object[]{this, mSearchResult, jSONObject});
            return;
        }
        JSONObject d = h19.d(jSONObject, "sessionParams");
        if (d != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            for (Map.Entry<String, Object> entry : d.entrySet()) {
                ckf.f(entry, "next(...)");
                Map.Entry<String, Object> entry2 = entry;
                String key = entry2.getKey();
                Object value = entry2.getValue();
                if (!(value == null || (obj = value.toString()) == null)) {
                    hashMap.put(key, obj);
                }
            }
            mSearchResult.sessionParams = hashMap;
        }
    }

    private final void X(JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3, JSONArray jSONArray4, JSONArray jSONArray5, JSONObject jSONObject, MSearchResult mSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("387b9ddf", new Object[]{this, jSONArray, jSONArray2, jSONArray3, jSONArray4, jSONArray5, jSONObject, mSearchResult});
            return;
        }
        G(jSONArray, jSONObject);
        Z(jSONArray2, jSONObject);
        Q(jSONArray4, jSONObject);
        V(jSONArray5, jSONObject, mSearchResult);
        I(jSONArray3, jSONObject);
    }

    private final void Y(MSearchResult mSearchResult, frh frhVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39110fee", new Object[]{this, mSearchResult, frhVar, jSONObject});
            return;
        }
        try {
            ResultMainInfoBean resultMainInfoBean = new ResultMainInfoBean();
            ResultMainInfoBean.parseBaseInfo(resultMainInfoBean, jSONObject);
            mSearchResult.setMainInfo(resultMainInfoBean);
            frhVar.N(resultMainInfoBean.style);
            frhVar.X(resultMainInfoBean);
            frhVar.D0(resultMainInfoBean);
            frhVar.J(Boolean.valueOf(resultMainInfoBean.finish));
            mSearchResult.crossShopRecPvUuid = jSONObject.getString("pvUuid");
        } catch (Throwable th) {
            irh.a("status", th);
        }
    }

    private final void Z(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f223c98", new Object[]{this, jSONArray, jSONObject});
            return;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray("stickyHeader");
        if (jSONArray2 != null) {
            jSONArray.addAll(jSONArray2);
        }
    }

    private final void d(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73af128f", new Object[]{this, jSONArray, jSONObject});
            return;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray("dynCellHeader");
        if (jSONArray2 != null) {
            jSONArray.addAll(jSONArray2);
        }
    }

    private final void d0(MSearchResult mSearchResult, JSONObject jSONObject, frh frhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e081191", new Object[]{this, mSearchResult, jSONObject, frhVar});
            return;
        }
        try {
            JSONObject d = h19.d(jSONObject, "updateParams");
            if (d != null && !d.isEmpty()) {
                ckf.e(mSearchResult, "null cannot be cast to non-null type com.taobao.search.sf.datasource.CommonSearchResult");
                for (Map.Entry<String, Object> entry : d.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    Map<String, String> map = mSearchResult.updateParams;
                    ckf.f(map, "updateParams");
                    map.put(key, value.toString());
                    frhVar.o0().put(key, value.toString());
                }
            }
        } catch (Throwable th) {
            irh.a("updateParams", th);
        }
    }

    private final JSONObject e0(JSONObject jSONObject, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("76309dc1", new Object[]{this, jSONObject, list});
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : list) {
            String string = jSONObject.getString(str);
            if (!TextUtils.isEmpty(string)) {
                jSONObject2.put((JSONObject) str, string);
            }
        }
        return jSONObject2;
    }

    private final void g0(MSearchResult mSearchResult, frh frhVar) {
        ListStyle a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fd433ac", new Object[]{this, mSearchResult, frhVar});
        } else if (mSearchResult != null && mSearchResult.isSaveListStyle && (a2 = oug.INSTANCE.a()) != null) {
            frhVar.N(a2);
        }
    }

    private final void n(JSONObject jSONObject, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70ef88e6", new Object[]{this, jSONObject, obj});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("iconStyle");
        if (jSONObject2 != null) {
            if (obj instanceof MuiseBean) {
                JSONObject jSONObject3 = ((MuiseBean) obj).extraStatus;
                ckf.f(jSONObject3, XslMUSComponent.KEY_EXTRA_STATUS);
                jSONObject3.put((JSONObject) "iconStyle", (String) jSONObject2);
            } else if (obj instanceof WeexBean) {
                JSONObject jSONObject4 = ((WeexBean) obj).extraStatus;
                ckf.f(jSONObject4, XslMUSComponent.KEY_EXTRA_STATUS);
                jSONObject4.put((JSONObject) "iconStyle", (String) jSONObject2);
            }
        }
    }

    private final void o(JSONObject jSONObject, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80df3675", new Object[]{this, jSONObject, jSONArray});
        } else if (jSONObject != null) {
            jSONArray.add(jSONObject);
        }
    }

    private final void p(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91d37ff", new Object[]{this, jSONArray, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("userdoc");
        if (jSONObject2 != null) {
            jSONObject2.put((JSONObject) "tItemType", "nt_personalization");
            jSONArray.add(jSONObject2);
        }
    }

    private final void q(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9788ef94", new Object[]{this, jSONArray, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("promotionBanner");
        if (jSONObject2 != null) {
            jSONObject2.put((JSONObject) "tItemType", "nt_promotionbanner");
            jSONArray.add(jSONObject2);
        }
    }

    private final void r(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90bf9bc8", new Object[]{this, jSONArray, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("newPromotion");
        if (jSONObject2 != null) {
            jSONObject2.put((JSONObject) "tItemType", "nt_promotionfilter");
            jSONArray.add(jSONObject2);
        }
    }

    private final void s(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7b73152", new Object[]{this, jSONArray, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("searchHint");
        if (jSONObject2 != null) {
            jSONObject2.put((JSONObject) "tItemType", "nt_searchhint");
            jSONArray.add(jSONObject2);
        }
    }

    private final void t(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37b3c4ee", new Object[]{this, jSONArray, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("sortMenu");
        if (jSONObject2 != null) {
            jSONObject2.put((JSONObject) "tItemType", "nt_sortbar");
            jSONArray.add(jSONObject2);
        }
    }

    private final void u(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87980e09", new Object[]{this, jSONArray, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("srpFooter");
        if (jSONObject2 != null) {
            jSONArray.add(jSONObject2);
        }
    }

    private final void w(JSONObject jSONObject) {
        JSONObject d;
        JSONObject d2;
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19f3aaef", new Object[]{this, jSONObject});
        } else if (jSONObject != null && (d = h19.d(jSONObject, "api")) != null && (d2 = h19.d(jSONObject, "tabAction")) != null) {
            String string = d2.getString("param");
            String string2 = d.getString("name");
            String string3 = d.getString("version");
            if (!(TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3) || TextUtils.isEmpty(string))) {
                JSONObject d3 = h19.d(d, "params");
                if (d3 != null) {
                    hashMap = new HashMap();
                    for (Map.Entry<String, Object> entry : d3.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (!TextUtils.isEmpty(key) && value != null) {
                            hashMap.put(key, value.toString());
                        }
                    }
                } else {
                    hashMap = null;
                }
                SearchApiModel searchApiModel = new SearchApiModel(string2, string3, hashMap);
                yzo yzoVar = yzo.INSTANCE;
                ckf.d(string);
                yzoVar.b(string, searchApiModel);
            }
        }
    }

    public final void O(MSearchResult mSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94d99fc8", new Object[]{this, mSearchResult, jSONObject});
            return;
        }
        ckf.g(mSearchResult, "result");
        ckf.g(jSONObject, "dataObject");
        P(mSearchResult, jSONObject, true);
    }

    /* renamed from: x */
    public void e(MSearchResult mSearchResult, JSONObject jSONObject, yko ykoVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("409d9c6c", new Object[]{this, mSearchResult, jSONObject, ykoVar});
            return;
        }
        ckf.g(mSearchResult, "result");
        frh frhVar = new frh();
        mSearchResult.addCombo(frhVar);
        JSONArray u = this.f20841a.u();
        if (u != null) {
            ckf.d(jSONObject);
            C(jSONObject, u);
            this.f20841a.L(null);
        }
        ckf.d(jSONObject);
        Object clone = jSONObject.clone();
        ckf.e(clone, "null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
        mSearchResult.originData = (JSONObject) clone;
        try {
            t64.INSTANCE.a(mSearchResult, jSONObject);
        } catch (Throwable th) {
            irh.a("preParse", th);
        }
        frhVar.y0(mSearchResult.noResultMod);
        U(jSONObject, frhVar);
        D(jSONObject);
        Y(mSearchResult, frhVar, jSONObject);
        irh.d(mSearchResult, jSONObject);
        irh.b(mSearchResult, jSONObject);
        irh.c(mSearchResult, jSONObject, true);
        O(mSearchResult, jSONObject);
        irh.f(mSearchResult, jSONObject);
        List<String> f0 = f0(jSONObject);
        L(mSearchResult, frhVar, jSONObject, f0);
        JSONArray c = h19.c(jSONObject, "replaceArray");
        List<BaseCellBean> replaceCells = mSearchResult.getReplaceCells();
        ckf.f(replaceCells, "getReplaceCells(...)");
        y(mSearchResult, c, jSONObject, replaceCells, f0, false);
        JSONArray c2 = h19.c(jSONObject, "bufferArray");
        List<BaseCellBean> bufferCells = mSearchResult.getBufferCells();
        ckf.f(bufferCells, "getBufferCells(...)");
        y(mSearchResult, c2, jSONObject, bufferCells, f0, false);
        irh.e(mSearchResult, jSONObject);
        c0(mSearchResult, jSONObject);
        E(mSearchResult, jSONObject);
        d0(mSearchResult, jSONObject, frhVar);
        N(mSearchResult, jSONObject);
        J(mSearchResult, jSONObject);
        M(mSearchResult, jSONObject);
        W(mSearchResult, jSONObject);
        S(mSearchResult, jSONObject);
        boolean isNew = mSearchResult.isNew();
        if (!isNew) {
            gy.c searchConfig = mSearchResult.getSearchConfig();
            ckf.e(searchConfig, "null cannot be cast to non-null type com.taobao.android.meta.data.MetaSearchConfig<*>");
            Map<String, String> n = ((osi) searchConfig).n();
            if (!(n == null || (str = n.get("searchType")) == null)) {
                isNew = ckf.b(str, "all");
            }
        }
        a0(mSearchResult, jSONObject);
        if (isNew) {
            R(mSearchResult, jSONObject);
            F(mSearchResult, jSONObject);
            g0(mSearchResult, frhVar);
        }
        T(mSearchResult, jSONObject);
        mSearchResult.updateItems();
        mSearchResult.collectCellTemplates();
    }

    private final void C(JSONObject jSONObject, JSONArray jSONArray) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f26210e", new Object[]{this, jSONObject, jSONArray});
        } else if (jSONArray != null && !jSONArray.isEmpty()) {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String string = jSONObject2.getString("type");
                if (!TextUtils.isEmpty(string) && (obj = jSONObject2.get("data")) != null) {
                    String string2 = jSONObject2.getString("key");
                    if (!TextUtils.isEmpty(string2)) {
                        Object obj2 = jSONObject.get(string2);
                        if (obj2 == null) {
                            jSONObject.put((JSONObject) string2, (String) obj);
                        } else {
                            boolean z = obj2 instanceof JSONArray;
                            if (string != null) {
                                switch (string.hashCode()) {
                                    case -1108791789:
                                        if (!string.equals("mergeLocal")) {
                                            break;
                                        } else {
                                            ckf.d(string2);
                                            B(string2, jSONObject, obj, obj2);
                                            continue;
                                        }
                                    case -1102179574:
                                        if (!string.equals("mergeStart")) {
                                            break;
                                        } else {
                                            A(true, z, obj2, obj);
                                            continue;
                                        }
                                    case -501718653:
                                        if (!string.equals("mergeEnd")) {
                                            break;
                                        } else {
                                            A(false, z, obj2, obj);
                                            continue;
                                        }
                                    case 178828699:
                                        if (!string.equals("mergeServer")) {
                                            break;
                                        } else {
                                            ckf.d(string2);
                                            B(string2, jSONObject, obj2, obj);
                                            continue;
                                        }
                                    case 1094496948:
                                        if (!string.equals("replace")) {
                                            break;
                                        } else {
                                            jSONObject.put((JSONObject) string2, (String) obj);
                                            continue;
                                        }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private final void b0(JSONObject jSONObject) {
        JSONArray c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84fc9f4f", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !jSONObject.isEmpty() && (c = h19.c(jSONObject, "tabs")) != null) {
            int size = c.size();
            for (int i = 0; i < size; i++) {
                w(c.getJSONObject(i));
            }
        }
    }

    private final List<String> f0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("35502e2b", new Object[]{this, jSONObject});
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray c = h19.c(h19.d(h19.d(jSONObject, "jarvisConfig"), "ext"), "ws_keys");
            if (c != null) {
                int size = c.size();
                for (int i = 0; i < size; i++) {
                    String string = c.getString(i);
                    if (!TextUtils.isEmpty(string)) {
                        ckf.d(string);
                        arrayList.add(string);
                    }
                }
            }
        } catch (Throwable th) {
            irh.a("wsDataKeys", th);
        }
        return arrayList;
    }

    private final void h0(JSONArray jSONArray, JSONArray jSONArray2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a736c73", new Object[]{this, jSONArray, jSONArray2});
            return;
        }
        int size = jSONArray.size();
        JSONObject jSONObject = null;
        for (int i = 0; i < size; i++) {
            Object obj = jSONArray.get(i);
            ckf.e(obj, "null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
            JSONObject jSONObject2 = (JSONObject) obj;
            String string = jSONObject2.getString("tItemType");
            if (TextUtils.equals(string, "nt_prepose_filter") || TextUtils.equals(string, "nt_prepose_filter_new")) {
                jSONObject = jSONObject2;
            }
        }
        if (jSONObject != null) {
            jSONArray.remove(jSONObject);
            jSONArray2.add(0, jSONObject);
        }
    }

    private final String v(MSearchResult mSearchResult, JSONArray jSONArray, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("358b3a49", new Object[]{this, mSearchResult, jSONArray, jSONObject, str});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("topBar");
        if (jSONObject2 == null) {
            return "";
        }
        String string = jSONObject2.getString("tItemType");
        if (TextUtils.isEmpty(string)) {
            if (TextUtils.equals(q1p.PAGE_NAME_INSHOP, str)) {
                string = "nt_inshop_topbar";
            } else {
                string = "nt_topbar";
            }
            jSONObject2.put((JSONObject) "tItemType", string);
            mSearchResult.setUseNativeTopBar(true);
        }
        jSONArray.add(0, jSONObject2);
        ckf.d(string);
        return string;
    }

    private final void z(String str, MSearchResult mSearchResult, JSONArray jSONArray, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98fd32ff", new Object[]{this, str, mSearchResult, jSONArray, jSONObject, new Boolean(z)});
        } else if (jSONArray != null) {
            StringBuilder sb = new StringBuilder();
            JSONObject jSONObject2 = jSONObject.getJSONObject(HorizontalXslComponent.ATTR_PAGE_INFO);
            JSONObject jSONObject3 = jSONObject.getJSONObject("pageData");
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject4 = jSONArray.getJSONObject(i);
                jSONObject4.getString("tItemType");
                BaseTypedBean d = mSearchResult.c().n().d(jSONObject4, mSearchResult, jSONObject2);
                if (d != null) {
                    if (d instanceof MuiseBean) {
                        Map<String, Object> map = ((MuiseBean) d).mExtraObj;
                        ckf.f(map, "mExtraObj");
                        map.put("pageData", jSONObject3);
                    }
                    sb.append(d.type);
                    sb.append("/");
                    if (d instanceof SFTopBarBean) {
                        mSearchResult.topBarParseTraceDigest = ((SFTopBarBean) d).traceDigest;
                    }
                    n(jSONObject, d);
                    if (z) {
                        mSearchResult.addHeader(new isi(str, d, null));
                    } else {
                        mSearchResult.addFooter(d);
                    }
                }
            }
            if (mSearchResult.layoutParseTraceDigestMap == null) {
                mSearchResult.layoutParseTraceDigestMap = new HashMap();
            }
            Map<String, a9u> map2 = mSearchResult.layoutParseTraceDigestMap;
            ckf.d(map2);
            map2.put(str, new a9u(sb.toString()));
        }
    }

    public final void a0(MSearchResult mSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460905de", new Object[]{this, mSearchResult, jSONObject});
            return;
        }
        ckf.g(mSearchResult, "result");
        ckf.g(jSONObject, "data");
        try {
            JSONObject d = h19.d(jSONObject, "switches");
            if (d != null) {
                mSearchResult.switches = d;
                mSearchResult.isServerAutoPlay = d.getBooleanValue("videoAutoPlay4g");
                mSearchResult.enableAiSrpEntrance = d.getBooleanValue("enableAiSrpEntrance");
                mSearchResult.isPrePaging = d.getBooleanValue("prePaging");
                mSearchResult.isPageTurning = d.getBooleanValue("pageTurning");
                mSearchResult.isNewFilter = d.getBooleanValue("newFilter");
                mSearchResult.isJarvisDataCache = d.getBooleanValue("isJarvisDataCache");
                mSearchResult.isUpdateUtparam = d.getBooleanValue("updateUtparam");
                mSearchResult.isPreciseAppear = d.getBooleanValue("preciseAppear");
                mSearchResult.setPreDetail(Boolean.valueOf(h19.e(d, "preDetail", true)));
                mSearchResult.isHalfStickySearchBar = d.getBooleanValue("halfStickySearchBar");
                mSearchResult.isSaveListStyle = d.getBooleanValue("saveListStyle");
                String string = d.getString("enableZstdDict");
                if (ckf.b(string, "true")) {
                    q5j.c = true;
                } else if (ckf.b(string, "false")) {
                    q5j.c = false;
                }
            }
        } catch (Throwable th) {
            irh.a("switches", th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0051 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:7:0x0023, B:9:0x0030, B:14:0x0039, B:15:0x003d, B:17:0x0042, B:20:0x0049, B:23:0x0051, B:26:0x005c, B:29:0x0061, B:30:0x0069), top: B:33:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:7:0x0023, B:9:0x0030, B:14:0x0039, B:15:0x003d, B:17:0x0042, B:20:0x0049, B:23:0x0051, B:26:0x005c, B:29:0x0061, B:30:0x0069), top: B:33:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c0(com.taobao.search.refactor.MSearchResult r7, com.alibaba.fastjson.JSONObject r8) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.hrh.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0018
            java.lang.String r3 = "1f321c42"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r0] = r6
            r4[r1] = r7
            r7 = 2
            r4[r7] = r8
            r2.ipc$dispatch(r3, r4)
            return
        L_0x0018:
            java.lang.String r2 = "result"
            tb.ckf.g(r7, r2)
            java.lang.String r2 = "dataObject"
            tb.ckf.g(r8, r2)
            tb.a9u r2 = new tb.a9u     // Catch: all -> 0x0037
            r2.<init>()     // Catch: all -> 0x0037
            r7.tabParseTraceDigest = r2     // Catch: all -> 0x0037
            java.util.ArrayList r2 = com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean.parseBean(r8, r2)     // Catch: all -> 0x0037
            if (r2 == 0) goto L_0x0039
            boolean r3 = r2.isEmpty()     // Catch: all -> 0x0037
            if (r3 == 0) goto L_0x003d
            goto L_0x0039
        L_0x0037:
            r7 = move-exception
            goto L_0x006d
        L_0x0039:
            java.util.ArrayList r2 = com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean.createDefaultTabs()     // Catch: all -> 0x0037
        L_0x003d:
            r7.setTabs(r2)     // Catch: all -> 0x0037
            if (r2 == 0) goto L_0x0069
            boolean r7 = r2.isEmpty()     // Catch: all -> 0x0037
            if (r7 == 0) goto L_0x0049
            goto L_0x0069
        L_0x0049:
            int r7 = r2.size()     // Catch: all -> 0x0037
            r3 = 0
        L_0x004e:
            r4 = -1
            if (r3 >= r7) goto L_0x005e
            java.lang.Object r5 = r2.get(r3)     // Catch: all -> 0x0037
            com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean r5 = (com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean) r5     // Catch: all -> 0x0037
            boolean r5 = r5.isSelected     // Catch: all -> 0x0037
            if (r5 == 0) goto L_0x005c
            goto L_0x005f
        L_0x005c:
            int r3 = r3 + r1
            goto L_0x004e
        L_0x005e:
            r3 = -1
        L_0x005f:
            if (r3 != r4) goto L_0x0069
            java.lang.Object r7 = r2.get(r0)     // Catch: all -> 0x0037
            com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean r7 = (com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean) r7     // Catch: all -> 0x0037
            r7.isSelected = r1     // Catch: all -> 0x0037
        L_0x0069:
            r6.b0(r8)     // Catch: all -> 0x0037
            goto L_0x0073
        L_0x006d:
            java.lang.String r8 = "tabs"
            tb.irh.a(r8, r7)
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.hrh.c0(com.taobao.search.refactor.MSearchResult, com.alibaba.fastjson.JSONObject):void");
    }

    public final void P(MSearchResult mSearchResult, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65b0c0c", new Object[]{this, mSearchResult, jSONObject, new Boolean(z)});
            return;
        }
        ckf.g(mSearchResult, "result");
        ckf.g(jSONObject, "dataObject");
        mSearchResult.layoutParseTraceDigestMap = new HashMap();
        ResultLayoutInfoBean resultLayoutInfoBean = new ResultLayoutInfoBean();
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        JSONArray jSONArray5 = new JSONArray();
        JSONArray jSONArray6 = new JSONArray();
        JSONArray jSONArray7 = new JSONArray();
        t(jSONArray2, jSONObject);
        o(jSONObject.getJSONObject("searchTips"), jSONArray4);
        o(jSONObject.getJSONObject("ShopRecommendHeader"), jSONArray4);
        q(jSONArray4, jSONObject);
        r(jSONArray4, jSONObject);
        s(jSONArray4, jSONObject);
        d(jSONArray4, jSONObject);
        p(jSONArray4, jSONObject);
        u(jSONArray5, jSONObject);
        X(jSONArray3, jSONArray, jSONArray2, jSONArray4, jSONArray6, jSONObject, mSearchResult);
        mSearchResult.topBarParseTraceDigest = null;
        v(mSearchResult, jSONArray7, jSONObject, mSearchResult.getMainInfo().pageName);
        h0(jSONArray4, jSONArray);
        if (z) {
            z("sceneHeader", mSearchResult, jSONArray6, jSONObject, true);
        }
        z(ytc.TYPE_FOLD, mSearchResult, jSONArray3, jSONObject, true);
        z("topBar", mSearchResult, jSONArray7, jSONObject, true);
        z(ytc.TYPE_HALF_STICKY, mSearchResult, jSONArray2, jSONObject, true);
        z("sticky", mSearchResult, jSONArray, jSONObject, true);
        z("list", mSearchResult, jSONArray4, jSONObject, true);
        z("listFooter", mSearchResult, jSONArray5, jSONObject, false);
        mSearchResult.getMainInfo().layoutInfo = resultLayoutInfoBean;
    }

    private final void y(MSearchResult mSearchResult, JSONArray jSONArray, JSONObject jSONObject, List<BaseCellBean> list, List<String> list2, boolean z) {
        int i;
        hrh hrhVar = this;
        JSONArray jSONArray2 = jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c3d7584", new Object[]{hrhVar, mSearchResult, jSONArray2, jSONObject, list, list2, new Boolean(z)});
        } else if (jSONArray2 != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(HorizontalXslComponent.ATTR_PAGE_INFO);
            HashMap hashMap = new HashMap();
            hashMap.put("iconStyle", jSONObject.getJSONObject("iconStyle"));
            hashMap.put("pageData", jSONObject.getJSONObject("pageData"));
            hashMap.put("negFeedbackActions", jSONObject.getJSONObject("negFeedbackActions"));
            int size = jSONArray.size();
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            while (i2 < size) {
                JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                if (jSONObject3 == null) {
                    sb.append("null_cell/");
                    i = i2;
                    jSONObject2 = jSONObject2;
                    sb = sb;
                } else {
                    if (hrhVar.b && ckf.b(jSONObject3.getString("tItemType"), a83.CARD_M3)) {
                        jSONObject3.put((JSONObject) "tItemType", "nt_auction_m3");
                    }
                    i = i2;
                    jSONObject2 = jSONObject2;
                    sb = sb;
                    BaseCellBean K = K(mSearchResult, jSONObject3, jSONObject2, hashMap, size, list2);
                    if (K == null) {
                        sb.append("parse_error:");
                        sb.append(jSONObject3.getString("tItemType"));
                        sb.append("/");
                    } else {
                        sb.append(K.type);
                        sb.append("/");
                        K.pagePos = i;
                        list.add(K);
                    }
                }
                i2 = i + 1;
                hrhVar = this;
                jSONArray2 = jSONArray;
            }
            if (z) {
                ckf.e(mSearchResult, "null cannot be cast to non-null type com.taobao.search.sf.datasource.CommonSearchResult");
                mSearchResult.itemsArrayTraceDigest = new a9u(sb.toString());
            }
        }
    }
}
