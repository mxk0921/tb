package tb;

import android.text.TextPaint;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.weex_uikit.widget.video.c;
import com.taobao.search.common.dynamic.bean.SearchDomBean;
import com.taobao.search.jarvis.bean.DynamicCardBean;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.m3.flash.FlashSaleView;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import com.uc.crashsdk.export.LogType;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class mnh extends lg3<M3CellBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792330);
    }

    public static /* synthetic */ Object ipc$super(mnh mnhVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/M3Parser");
    }

    public final nd4 A(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nd4) ipChange.ipc$dispatch("964cdc25", new Object[]{this, jSONObject});
        }
        String string = jSONObject.getString("text");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        Integer a2 = nnh.a(jSONObject.getString("textColor"));
        String string2 = jSONObject.getString("icon");
        ckf.d(string);
        return new nd4(a2, string2, string);
    }

    public final void B(JSONObject jSONObject, M3CellBean m3CellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc6fc62d", new Object[]{this, jSONObject, m3CellBean});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("discountInfo");
        if (jSONObject2 != null) {
            C(jSONObject2, m3CellBean);
        }
    }

    public final void D(JSONObject jSONObject, M3CellBean m3CellBean, CommonSearchResult commonSearchResult) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1459e1a4", new Object[]{this, jSONObject, m3CellBean, commonSearchResult});
            return;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject(r4p.VALUE_MODULE_DYNAMIC_CARD);
        if (jSONObject3 != null) {
            DynamicCardBean dynamicCardBean = new DynamicCardBean();
            dynamicCardBean.mOriginData = jSONObject3;
            vg3 b = yak.f31939a.b();
            String str = null;
            if (commonSearchResult != null) {
                jSONObject2 = commonSearchResult.pageInfo;
            } else {
                jSONObject2 = null;
            }
            dynamicCardBean.mDynamicCellBean = b.b(jSONObject3, commonSearchResult, jSONObject2);
            m3CellBean.setDynamicCardBean(dynamicCardBean);
            if (commonSearchResult != null) {
                BaseCellBean baseCellBean = dynamicCardBean.mDynamicCellBean;
                if (baseCellBean != null) {
                    str = baseCellBean.type;
                }
                commonSearchResult.addUsedTemplate(str);
            }
        }
    }

    public final dif H(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dif) ipChange.ipc$dispatch("7dc40187", new Object[]{this, jSONObject});
        }
        String string = jSONObject.getString("query");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        String string2 = jSONObject.getString("text");
        if (TextUtils.isEmpty(string2)) {
            return null;
        }
        String string3 = jSONObject.getString("tag_pic");
        String string4 = jSONObject.getString("rightIcon");
        Integer a2 = nnh.a(jSONObject.getString("typeColor"));
        ckf.d(string);
        Integer a3 = nnh.a(jSONObject.getString("textColor"));
        String string5 = jSONObject.getString("type");
        Integer a4 = nnh.a(jSONObject.getString(vaj.KEY_BG_COLOR));
        ckf.d(string2);
        return new dif(string3, string4, a2, string, a3, string5, a4, string2, jSONObject.getString("key"), jSONObject.getString("tagTrace"), jSONObject.getJSONObject("params"));
    }

    public final void I(AuctionBaseBean auctionBaseBean, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a3023e8", new Object[]{this, auctionBaseBean, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("jarvisData");
        if (jSONObject2 != null) {
            HashMap hashMap = new HashMap();
            for (String str : jSONObject2.keySet()) {
                String string = jSONObject2.getString(str);
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(string)) {
                    hashMap.put(str, string);
                }
            }
            String string2 = jSONObject.getString(mh1.CLICK_TRACE);
            auctionBaseBean.clickTrace = string2;
            hashMap.put(mh1.CLICK_TRACE, string2);
            auctionBaseBean.jarvisData = hashMap;
        }
    }

    public final qzp T(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qzp) ipChange.ipc$dispatch("867de25a", new Object[]{this, jSONObject});
        }
        String string = jSONObject.getString("text");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        String string2 = jSONObject.getString("url");
        Integer integer = jSONObject.getInteger("borderRadius");
        int intValue = integer != null ? integer.intValue() : -1;
        String string3 = jSONObject.getString("rightIcon");
        ckf.d(string);
        return new qzp(string2, intValue, string3, string, jSONObject.getString("listStylePrefix"), nnh.a(jSONObject.getString(vaj.KEY_BG_COLOR)), jSONObject.getString("icon"), nnh.a(jSONObject.getString("textColor")));
    }

    public final void W(JSONObject jSONObject, M3CellBean m3CellBean, BaseSearchResult baseSearchResult) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93dcfa83", new Object[]{this, jSONObject, m3CellBean, baseSearchResult});
            return;
        }
        m3CellBean.setUtLogMap(jSONObject.getJSONObject("utLogMap"));
        boolean z = baseSearchResult instanceof CommonSearchResult;
        JSONObject jSONObject3 = null;
        CommonSearchResult commonSearchResult = z ? (CommonSearchResult) baseSearchResult : null;
        if (!(commonSearchResult == null || (jSONObject2 = commonSearchResult.pageData) == null)) {
            m3CellBean.setClickBackParams(jSONObject2.getJSONObject("clickBackParams"));
        }
        m3CellBean.setBackCardRqParams(jSONObject.getJSONObject("backCardRqParams"));
        m3CellBean.setPrefetchImgRatio(jSONObject.getString("prefetchImgRatio"));
        m3CellBean.setExtraParams(jSONObject.getJSONArray("extraParams"));
        m3CellBean.setSkuSourceType(jSONObject.getString("skuSourceType"));
        CommonSearchResult commonSearchResult2 = z ? (CommonSearchResult) baseSearchResult : null;
        if (commonSearchResult2 != null) {
            jSONObject3 = commonSearchResult2.copyPageInfo;
        }
        m3CellBean.setPageInfo(jSONObject3);
    }

    public final void X(M3CellBean m3CellBean, AuctionBaseBean auctionBaseBean, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f2cc5a4", new Object[]{this, m3CellBean, auctionBaseBean, jSONObject});
            return;
        }
        m3CellBean.setVideoForcePlay(jSONObject.getBooleanValue("videoForcePlay"));
        m3CellBean.setVideoAutoPlay(jSONObject.getBooleanValue("videoAutoPlay"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("video");
        if (jSONObject2 != null) {
            auctionBaseBean.videoUrl = jSONObject2.getString("videoUrl");
            auctionBaseBean.showVideoIcon = jSONObject2.getBooleanValue("showIcon");
            auctionBaseBean.videoId = jSONObject2.getString("videoId");
            auctionBaseBean.delayTime = (int) jSONObject2.getLongValue(c.ATTR_DELAY_TIME);
            auctionBaseBean.hideCountDown = jSONObject2.getBooleanValue("hideCountDown");
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("wfVideo");
        if (jSONObject3 == null) {
            jSONObject3 = jSONObject.getJSONObject("video");
        }
        if (jSONObject3 != null) {
            auctionBaseBean.wfVideoUrl = jSONObject3.getString("videoUrl");
            auctionBaseBean.wfShowVideoIcon = jSONObject3.getBooleanValue("showIcon");
            auctionBaseBean.wfVideoId = jSONObject3.getString("videoId");
            auctionBaseBean.wfDelayTime = (int) jSONObject3.getLongValue(c.ATTR_DELAY_TIME);
            auctionBaseBean.wfHideCountDown = jSONObject3.getBooleanValue("hideCountDown");
        }
        if (TextUtils.isEmpty(auctionBaseBean.videoCover)) {
            auctionBaseBean.videoCover = m3CellBean.getPicPath();
        }
        if (TextUtils.isEmpty(auctionBaseBean.wfVideoCover)) {
            if (!TextUtils.isEmpty(m3CellBean.getUprightImage())) {
                str = m3CellBean.getUprightImage();
            } else {
                str = m3CellBean.getPicPath();
            }
            auctionBaseBean.wfVideoCover = str;
        }
    }

    @Override // tb.dx
    public Class<M3CellBean> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("3a181f26", new Object[]{this});
        }
        return M3CellBean.class;
    }

    @Override // tb.dx
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad31b77e", new Object[]{this});
        }
        return "nt_auction_m3";
    }

    @Override // tb.lg3
    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbc178f6", new Object[]{this})).booleanValue();
        }
        return true;
    }

    /* renamed from: q */
    public M3CellBean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (M3CellBean) ipChange.ipc$dispatch("cd453c77", new Object[]{this});
        }
        return new M3CellBean();
    }

    public final String s(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a942aac", new Object[]{this, str, jSONObject, jSONObject2});
        }
        String str3 = null;
        if (jSONObject != null) {
            str2 = jSONObject.getString(str);
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        if (jSONObject2 != null) {
            str3 = jSONObject2.getString(str);
        }
        return str3;
    }

    /* renamed from: t */
    public void n(JSONObject jSONObject, M3CellBean m3CellBean, BaseSearchResult baseSearchResult) {
        CommonSearchResult commonSearchResult;
        CommonSearchResult commonSearchResult2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e614659d", new Object[]{this, jSONObject, m3CellBean, baseSearchResult});
            return;
        }
        ckf.g(m3CellBean, "bean");
        if (jSONObject != null) {
            m3CellBean.setEtype(jSONObject.getString("etype"));
            ckf.d(baseSearchResult);
            R(m3CellBean, baseSearchResult);
            W(jSONObject, m3CellBean, baseSearchResult);
            N(jSONObject, m3CellBean);
            U(jSONObject, m3CellBean, baseSearchResult);
            w(jSONObject, m3CellBean);
            B(jSONObject, m3CellBean);
            P(jSONObject, m3CellBean);
            CommonSearchResult commonSearchResult3 = (CommonSearchResult) baseSearchResult;
            S(jSONObject, m3CellBean, commonSearchResult3);
            G(jSONObject, m3CellBean, baseSearchResult);
            V(jSONObject, m3CellBean);
            y(jSONObject, m3CellBean);
            F(jSONObject, m3CellBean, baseSearchResult);
            boolean z = baseSearchResult instanceof CommonSearchResult;
            if (z) {
                commonSearchResult = commonSearchResult3;
            } else {
                commonSearchResult = null;
            }
            E(jSONObject, m3CellBean, commonSearchResult);
            if (z) {
                commonSearchResult2 = commonSearchResult3;
            } else {
                commonSearchResult2 = null;
            }
            D(jSONObject, m3CellBean, commonSearchResult2);
            if (!z) {
                commonSearchResult3 = null;
            }
            J(jSONObject, m3CellBean, commonSearchResult3);
            v(jSONObject, m3CellBean);
            O(jSONObject, m3CellBean, baseSearchResult);
            L(jSONObject, m3CellBean);
            K(jSONObject, m3CellBean);
            I(m3CellBean.getAuctionBean(), jSONObject);
            X(m3CellBean, m3CellBean.getAuctionBean(), jSONObject);
            m3CellBean.setOriginData(jSONObject);
            m(m3CellBean.getAuctionBean(), baseSearchResult);
            m3CellBean.getAuctionBean().itemId = m3CellBean.itemId;
            m3CellBean.getAuctionBean().mOutterBean = m3CellBean;
            m3CellBean.setUtLogMap(m3CellBean.getUtLogMap());
        }
    }

    /* renamed from: u */
    public void o(org.json.JSONObject jSONObject, M3CellBean m3CellBean, BaseSearchResult baseSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8145d76b", new Object[]{this, jSONObject, m3CellBean, baseSearchResult});
            return;
        }
        ckf.g(jSONObject, "beanObject");
        ckf.g(m3CellBean, "bean");
    }

    public final void v(JSONObject jSONObject, M3CellBean m3CellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("def4b7db", new Object[]{this, jSONObject, m3CellBean});
            return;
        }
        m3CellBean.getAuctionBean().p4pContentUrl = jSONObject.getString(mh1.P4P_CONTENT_URL);
        m3CellBean.setFinalTargetUrl(jSONObject.getString("finalTargetUrl"));
        m3CellBean.setX_qzt_ad(jSONObject.getIntValue("x_qzt_ad"));
        m3CellBean.getAuctionBean().p4pPid = jSONObject.getString(MspDBHelper.BizEntry.COLUMN_NAME_PID);
        m3CellBean.setClickUrl(jSONObject.getString(mh1.PRD_P4P_URL));
        m3CellBean.setUseAuctionURL(jSONObject.getBooleanValue("useAuctionURL"));
        m3CellBean.setAuctionURL(jSONObject.getString("auctionURL"));
        m3CellBean.getAuctionBean().o2oShopId = mqq.c(jSONObject.getString(mh1.PRD_O2O_SHOP_ID));
        m3CellBean.getAuctionBean().skuId = jSONObject.getString(q2q.KEY_SKU_ID);
        m3CellBean.getAuctionBean().locType = jSONObject.getString(r4p.KEY_LOC_TYPE);
        m3CellBean.getAuctionBean().ifsUrl = jSONObject.getString("ifsUrl");
    }

    public final dif x(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dif) ipChange.ipc$dispatch("e26f9688", new Object[]{this, jSONObject});
        }
        String string = jSONObject.getString("showText");
        String string2 = jSONObject.getString("searchText");
        String string3 = jSONObject.getString("trace");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            return null;
        }
        Integer a2 = nnh.a(jSONObject.getString("tagColor"));
        ckf.d(string2);
        String string4 = jSONObject.getString("tag");
        ckf.d(string);
        return new dif(null, null, a2, string2, null, string4, null, string, null, string3, null);
    }

    public final void y(JSONObject jSONObject, M3CellBean m3CellBean) {
        ArrayList arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b184453", new Object[]{this, jSONObject, m3CellBean});
        } else if (m3CellBean.getInteractiveInfo() == null) {
            JSONArray jSONArray = jSONObject.getJSONArray("bottomTagInfo");
            if (jSONArray != null) {
                int size = jSONArray.size();
                if (size != 0) {
                    arrayList = new ArrayList(size);
                    for (int i = 0; i < size; i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        ckf.f(jSONObject2, "getJSONObject(...)");
                        dif x = x(jSONObject2);
                        if (x != null) {
                            arrayList.add(x);
                        }
                    }
                } else {
                    return;
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null && (!arrayList.isEmpty())) {
                m3CellBean.setBottomTagInfo(new hhf(arrayList, false, true));
            }
        }
    }

    public final p34 z(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p34) ipChange.ipc$dispatch("9d4cbf60", new Object[]{this, jSONObject});
        }
        String string = jSONObject.getString("text");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        String string2 = jSONObject.getString("numComment");
        ckf.d(string);
        return new p34(string2, string, nnh.a(jSONObject.getString("textColor")), nnh.a(jSONObject.getString("numColor")), jSONObject.getString("showMinComment"));
    }

    public final void J(JSONObject jSONObject, M3CellBean m3CellBean, CommonSearchResult commonSearchResult) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdaf7ea6", new Object[]{this, jSONObject, m3CellBean, commonSearchResult});
            return;
        }
        if (!(commonSearchResult == null || (jSONObject2 = commonSearchResult.pageData) == null || (jSONObject3 = jSONObject2.getJSONObject("switchers")) == null)) {
            z = jSONObject3.getBooleanValue("isJiaGouClick");
        }
        m3CellBean.setJiaGouUt(z);
        m3CellBean.setJiaGouSupport(jSONObject.getBoolean("isJiaGou"));
        JSONObject jSONObject4 = jSONObject.getJSONObject("jiaGouConfig");
        if (jSONObject4 != null) {
            m3CellBean.setJiaGouInfo(new cuf(jSONObject4.getIntValue("width"), jSONObject4.getIntValue("height"), jSONObject4.getIntValue("iconHeight"), jSONObject4.getString("url")));
        }
    }

    public final void L(JSONObject jSONObject, M3CellBean m3CellBean) {
        nhl nhlVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7c285dd", new Object[]{this, jSONObject, m3CellBean});
            return;
        }
        String string = jSONObject.getString(mh1.PRD_ICON_LIST);
        if (string != null) {
            for (String str : wsq.z0(string, new String[]{","}, false, 0, 6, null)) {
                if (ckf.b(str, "p4p")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("p4pIcon");
                    if (jSONObject2 != null) {
                        nhlVar = new nhl(jSONObject2.getString("img"), jSONObject2.getIntValue("width"), jSONObject2.getIntValue("height"));
                    } else {
                        nhlVar = new nhl("", 0, 0);
                    }
                    m3CellBean.setP4pIcon(nhlVar);
                    return;
                }
            }
        }
    }

    public final void N(JSONObject jSONObject, M3CellBean m3CellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29ae1062", new Object[]{this, jSONObject, m3CellBean});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("imageInfo");
        if (jSONArray != null && jSONArray.size() > 0) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(0);
            m3CellBean.setPicPath(jSONObject2.getString("imageUrl"));
            m3CellBean.setUprightImage(jSONObject2.getString("uprightImgImage"));
            m3CellBean.setWfRatioOrigin(jSONObject2.getString("uprightImgAspectRatio"));
            m3CellBean.setWfRatio(qrl.d(m3CellBean.getWfRatioOrigin(), 1.0f));
            if (TextUtils.isEmpty(m3CellBean.getUprightImage())) {
                m3CellBean.setUprightImage(m3CellBean.getPicPath());
            }
            if (!TextUtils.isEmpty(m3CellBean.getUprightImage()) && TextUtils.isEmpty(m3CellBean.getWfRatioOrigin())) {
                m3CellBean.setWfRatioOrigin(String.valueOf(m3CellBean.getWfRatio()));
            }
        }
        if (TextUtils.isEmpty(m3CellBean.getPicPath())) {
            m3CellBean.setPicPath(jSONObject.getString(mh1.PRD_PICURL));
        }
        if (TextUtils.isEmpty(m3CellBean.getUprightImage())) {
            m3CellBean.setUprightImage(jSONObject.getString(mh1.PRD_WF_PICURL));
            String string = jSONObject.getString("uprightImgAspectRatio");
            if (string != null) {
                m3CellBean.setWfRatioOrigin(string);
                m3CellBean.setWfRatio(qrl.d(string, 1.0f));
            }
        }
        if (TextUtils.isEmpty(m3CellBean.getWfRatioOrigin()) && !TextUtils.isEmpty(m3CellBean.getUprightImage())) {
            m3CellBean.setWfRatio(0.6666667f);
            m3CellBean.setWfRatioOrigin(String.valueOf(m3CellBean.getWfRatio()));
        }
    }

    public final g1n Q(JSONObject jSONObject, boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1n) ipChange.ipc$dispatch("f0798337", new Object[]{this, jSONObject, new Boolean(z)});
        }
        String string = jSONObject.getString("propertyName");
        if (string == null) {
            string = "";
        }
        String string2 = jSONObject.getString("propertyValueName");
        if (TextUtils.isEmpty(string2)) {
            return null;
        }
        ckf.d(string2);
        if (z || !ckf.b(jSONObject.getString("textType"), "singleRow")) {
            z2 = false;
        }
        return new g1n(string, string2, z, z2);
    }

    public final void R(M3CellBean m3CellBean, BaseSearchResult baseSearchResult) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28893f8f", new Object[]{this, m3CellBean, baseSearchResult});
            return;
        }
        ckf.e(baseSearchResult, "null cannot be cast to non-null type com.taobao.search.sf.datasource.CommonSearchResult");
        JSONObject jSONObject = ((CommonSearchResult) baseSearchResult).pageData;
        if (!(jSONObject == null || (jSONArray = jSONObject.getJSONArray("removeArea")) == null)) {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                String string = jSONArray.getString(i);
                if (string != null) {
                    switch (string.hashCode()) {
                        case -1855391377:
                            if (!string.equals("bottomTag")) {
                                break;
                            } else {
                                m3CellBean.setRemoveBottomTag(true);
                                continue;
                            }
                        case 116114:
                            if (!string.equals("usp")) {
                                break;
                            } else {
                                m3CellBean.setRemoveUsp(true);
                                continue;
                            }
                        case 3226745:
                            if (!string.equals("icon")) {
                                break;
                            } else {
                                m3CellBean.setRemoveIcon(true);
                                continue;
                            }
                        case 578717046:
                            if (!string.equals("intoShop")) {
                                break;
                            } else {
                                m3CellBean.setRemoveShopInfo(true);
                                continue;
                            }
                    }
                }
            }
        }
    }

    public final void F(JSONObject jSONObject, M3CellBean m3CellBean, BaseSearchResult baseSearchResult) {
        int i;
        String string;
        String string2;
        Boolean bool;
        int i2 = 2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a40249b", new Object[]{this, jSONObject, m3CellBean, baseSearchResult});
            return;
        }
        String str = null;
        CommonSearchResult commonSearchResult = baseSearchResult instanceof CommonSearchResult ? (CommonSearchResult) baseSearchResult : null;
        if (commonSearchResult != null) {
            JSONObject jSONObject2 = commonSearchResult.pageData;
            JSONObject jSONObject3 = jSONObject2 != null ? jSONObject2.getJSONObject("dynamicData") : null;
            String string3 = jSONObject.getString("iconUspMerge");
            if (string3 == null) {
                string3 = jSONObject3 != null ? jSONObject3.getString("iconUspMerge") : null;
            }
            if (string3 != null) {
                if (ckf.b(string3, "usp")) {
                    m3CellBean.setIconUspMerge(1);
                } else if (ckf.b(string3, "icon")) {
                    m3CellBean.setIconUspMerge(2);
                }
            }
            if (!(jSONObject3 == null || (bool = jSONObject3.getBoolean("listIconInTop")) == null)) {
                z = bool.booleanValue();
            }
            m3CellBean.setListIconInTop(z);
            JSONObject utLogMap = m3CellBean.getUtLogMap();
            if (!(utLogMap == null || (string2 = utLogMap.getString("usp")) == null)) {
                m3CellBean.setUspInWhiteList(M3CellBean.Companion.a().contains(string2));
            }
            String string4 = jSONObject.getString("mergeLocToPrice");
            String str2 = "";
            if (string4 == null) {
                if (jSONObject3 != null) {
                    str = jSONObject3.getString("mergeLocToPrice");
                }
                string4 = str == null ? str2 : str;
            }
            if (ckf.b(string4, "top")) {
                i = 1;
            } else {
                i = ckf.b(string4, "bottom") ? 2 : -1;
            }
            m3CellBean.setMergeLocToPrice(i);
            if (!(jSONObject3 == null || (string = jSONObject3.getString("mergeLocToPrice")) == null)) {
                str2 = string;
            }
            if (ckf.b(str2, "top")) {
                i2 = 1;
            } else if (!ckf.b(str2, "bottom")) {
                i2 = -1;
            }
            m3CellBean.setListMergeLocToPrice(i2);
        }
    }

    public final void U(JSONObject jSONObject, M3CellBean m3CellBean, BaseSearchResult baseSearchResult) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a5f308", new Object[]{this, jSONObject, m3CellBean, baseSearchResult});
            return;
        }
        ckf.e(baseSearchResult, "null cannot be cast to non-null type com.taobao.search.sf.datasource.CommonSearchResult");
        CommonSearchResult commonSearchResult = (CommonSearchResult) baseSearchResult;
        String string2 = jSONObject.getString("title");
        if (string2 != null) {
            m3CellBean.setTitle(r(mqq.c(string2)));
        }
        HashMap<String, SearchDomBean> hashMap = commonSearchResult.domIcons;
        JSONArray jSONArray = jSONObject.getJSONArray(m09.ICON_RENDER);
        if (jSONArray != null) {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (ckf.b(jSONObject2.getString("group"), "1") && (string = jSONObject2.getString("domClass")) != null) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("iconStyle");
                    SearchDomBean g = q1p.g(jSONObject3 != null ? jSONObject3.getJSONObject("light") : null);
                    if (!(g == null && (hashMap == null || (g = hashMap.get(string)) == null))) {
                        if (m3CellBean.getTitleIcon() == null) {
                            m3CellBean.setTitleIcon(g);
                        }
                        if (m3CellBean.getTitleIcons() == null) {
                            m3CellBean.setTitleIcons(new ArrayList());
                        }
                        List<SearchDomBean> titleIcons = m3CellBean.getTitleIcons();
                        ckf.d(titleIcons);
                        titleIcons.add(g);
                    }
                }
            }
        }
        Boolean bool = jSONObject.getBoolean("listTwoLineTitle");
        if (bool == null || bool.booleanValue()) {
            m3CellBean.setListTitleLines(2);
        } else {
            m3CellBean.setListTitleLines(1);
        }
        if (jSONObject.getBooleanValue("wfTwoLineTitle")) {
            m3CellBean.setWfTitleLines(2);
        } else {
            m3CellBean.setWfTitleLines(1);
        }
    }

    public final String r(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a422b7f", new Object[]{this, charSequence});
        }
        if (charSequence == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(charSequence.length() * 2);
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (ckf.i(charAt, 55296) < 0 || ckf.i(charAt, 56320) >= 0) {
                sb.append(charAt);
                sb.append("\u200b");
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public final void C(JSONObject jSONObject, M3CellBean m3CellBean) {
        HashSet hashSet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a52ceb6d", new Object[]{this, jSONObject, m3CellBean});
        } else if (jSONObject != null) {
            String string = jSONObject.getString("text");
            if (!TextUtils.isEmpty(string)) {
                int intValue = jSONObject.getIntValue("iconWidth");
                int intValue2 = jSONObject.getIntValue("iconHeight");
                String string2 = jSONObject.getString("prizeIds");
                if (string2 != null) {
                    hashSet = new HashSet();
                    for (String str : wsq.z0(string2, new String[]{","}, false, 0, 6, null)) {
                        hashSet.add(str);
                    }
                } else {
                    hashSet = null;
                }
                m3CellBean.setDiscountInfo(new rp7(intValue, intValue2, jSONObject.getString("icon"), string, nnh.a(jSONObject.getString("textColor")), hashSet, jSONObject.getString("receivedText"), jSONObject.getString("receivedDefaultText"), null, false, LogType.UNEXP_OTHER, null));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
        if (r4.equals("onlyLongPress") == false) goto L_0x005b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M(com.alibaba.fastjson.JSONObject r9, com.taobao.search.m3.M3CellBean r10) {
        /*
            r8 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            com.android.alibaba.ip.runtime.IpChange r4 = tb.mnh.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0018
            java.lang.String r5 = "5565255c"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r8
            r3[r1] = r9
            r3[r0] = r10
            r4.ipc$dispatch(r5, r3)
            return
        L_0x0018:
            java.lang.String r4 = "commonParams"
            com.alibaba.fastjson.JSONObject r4 = r9.getJSONObject(r4)
            r5 = 4
            if (r4 == 0) goto L_0x005f
            java.lang.String r6 = "hasFeedback"
            java.lang.String r4 = r4.getString(r6)
            if (r4 == 0) goto L_0x005f
            int r6 = r4.hashCode()
            r7 = 96673(0x179a1, float:1.35468E-40)
            if (r6 == r7) goto L_0x0053
            r1 = 267100476(0xfeba13c, float:2.3234894E-29)
            if (r6 == r1) goto L_0x0047
            r1 = 2123857115(0x7e977cdb, float:1.0068086E38)
            if (r6 == r1) goto L_0x003d
            goto L_0x005b
        L_0x003d:
            java.lang.String r1 = "onlyLongPress"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x005e
            goto L_0x005b
        L_0x0047:
            java.lang.String r0 = "onlyClick"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0051
            goto L_0x005b
        L_0x0051:
            r0 = 3
            goto L_0x005e
        L_0x0053:
            java.lang.String r0 = "all"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x005d
        L_0x005b:
            r0 = 4
            goto L_0x005e
        L_0x005d:
            r0 = 1
        L_0x005e:
            r5 = r0
        L_0x005f:
            r10.setFeedbackType(r5)
            com.alibaba.fastjson.JSONObject r0 = new com.alibaba.fastjson.JSONObject
            r0.<init>()
            r0.putAll(r9)
            java.lang.String r9 = "main"
            java.lang.Object r9 = r0.remove(r9)
            java.lang.String r1 = "p4p"
            java.lang.Object r1 = r0.remove(r1)
            boolean r3 = r10.isP4p
            java.lang.String r4 = "actions"
            if (r3 == 0) goto L_0x0082
            r0.put(r4, r1)
            goto L_0x0085
        L_0x0082:
            r0.put(r4, r9)
        L_0x0085:
            tb.p59 r9 = new tb.p59
            r1 = 0
            r9.<init>(r0, r2, r1)
            r10.setFeedback(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.mnh.M(com.alibaba.fastjson.JSONObject, com.taobao.search.m3.M3CellBean):void");
    }

    public final void V(JSONObject jSONObject, M3CellBean m3CellBean) {
        String string;
        g1n Q;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe3fba6a", new Object[]{this, jSONObject, m3CellBean});
            return;
        }
        m3CellBean.setUspBottom(ckf.b(jSONObject.getString("uspPos"), "bottom"));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(2);
        ArrayList arrayList3 = new ArrayList(3);
        ArrayList arrayList4 = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("structuredUSPInfo");
        if (jSONArray != null) {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (!(jSONObject2 == null || (string = jSONObject2.getString("fieldTemplate")) == null)) {
                    switch (string.hashCode()) {
                        case -1804585442:
                            if (string.equals("priceproperty") && (Q = Q(jSONObject2, true)) != null) {
                                arrayList3.add(Q);
                                continue;
                            }
                            break;
                        case -1494550414:
                            if (!string.equals("singleRow")) {
                                break;
                            } else {
                                qzp T = T(jSONObject2);
                                if (T != null) {
                                    arrayList4.add(T);
                                    break;
                                } else {
                                    continue;
                                }
                            }
                        case -1399754105:
                            if (!string.equals("composite")) {
                                break;
                            } else if (arrayList2.size() < 2) {
                                nd4 A = A(jSONObject2);
                                if (A != null) {
                                    arrayList2.add(A);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        case -993141291:
                            if (!string.equals("property")) {
                                break;
                            } else {
                                g1n Q2 = Q(jSONObject2, false);
                                if (Q2 != null) {
                                    arrayList3.add(Q2);
                                    break;
                                } else {
                                    continue;
                                }
                            }
                        case 273184065:
                            if (!string.equals("discount")) {
                                break;
                            } else {
                                C(jSONObject2, m3CellBean);
                                continue;
                            }
                        case 803370328:
                            if (!string.equals("interactiveTag")) {
                                break;
                            } else {
                                dif H = H(jSONObject2);
                                if (H != null) {
                                    arrayList.add(H);
                                    break;
                                } else {
                                    continue;
                                }
                            }
                        case 2103533612:
                            if (!string.equals("commentText")) {
                                break;
                            } else {
                                m3CellBean.setCommentInfo(z(jSONObject2));
                                continue;
                            }
                    }
                }
            }
        }
        if (!arrayList4.isEmpty()) {
            m3CellBean.setSingleRowInfo(new pzp(arrayList4));
        }
        if (!arrayList.isEmpty()) {
            m3CellBean.setInteractiveInfo(new hhf(arrayList, false, false, 6, null));
        }
        if (!arrayList2.isEmpty()) {
            m3CellBean.setCompositeInfo(new md4(arrayList2));
        }
        if (!arrayList3.isEmpty()) {
            m3CellBean.setPropertyInfo(new f1n(arrayList3, null));
        }
        if (m3CellBean.getPropertyInfo() == null && m3CellBean.getCompositeInfo() == null && m3CellBean.getInteractiveInfo() == null && m3CellBean.getSingleRowInfo() == null && m3CellBean.getCommentInfo() == null) {
            ArrayList arrayList5 = new ArrayList();
            Integer a2 = nnh.a(jSONObject.getString("summaryTipsColor"));
            JSONArray jSONArray2 = jSONObject.getJSONArray("summaryTips");
            if (jSONArray2 != null) {
                int size2 = jSONArray2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String string2 = jSONArray2.getString(i2);
                    if (!TextUtils.isEmpty(string2)) {
                        ckf.d(string2);
                        arrayList5.add(new g1n("", string2, false, false));
                    }
                }
            }
            if (!arrayList5.isEmpty()) {
                m3CellBean.setSummaryTips(new f1n(arrayList5, a2));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
        if (r10.equals("onlyClick") == false) goto L_0x008b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(com.alibaba.fastjson.JSONObject r8, com.taobao.search.m3.M3CellBean r9, com.taobao.search.sf.datasource.CommonSearchResult r10) {
        /*
            r7 = this;
            r0 = 3
            r1 = 2
            r2 = 1
            r3 = 0
            r4 = 4
            com.android.alibaba.ip.runtime.IpChange r5 = tb.mnh.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x001b
            java.lang.String r6 = "280c66c0"
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r7
            r4[r2] = r8
            r4[r1] = r9
            r4[r0] = r10
            r5.ipc$dispatch(r6, r4)
            return
        L_0x001b:
            if (r10 != 0) goto L_0x001e
            return
        L_0x001e:
            java.lang.String r5 = "pltSimilarUrl"
            java.lang.String r5 = r8.getString(r5)
            r9.setPltSimilarUrl(r5)
            java.lang.String r5 = "similarSameUrl"
            java.lang.String r5 = r8.getString(r5)
            r9.setSimilarSameUrl(r5)
            com.alibaba.fastjson.JSONObject r10 = r10.pageData
            java.lang.String r5 = "feedback"
            if (r10 == 0) goto L_0x0042
            com.alibaba.fastjson.JSONObject r10 = r10.getJSONObject(r5)
            if (r10 == 0) goto L_0x0042
            r7.M(r10, r9)
            return
        L_0x0042:
            com.alibaba.fastjson.JSONObject r8 = r8.getJSONObject(r5)
            if (r8 != 0) goto L_0x0049
            return
        L_0x0049:
            java.lang.String r10 = "commonParams"
            com.alibaba.fastjson.JSONObject r10 = r8.getJSONObject(r10)
            if (r10 == 0) goto L_0x008f
            java.lang.String r5 = "hasFeedback"
            java.lang.String r10 = r10.getString(r5)
            if (r10 == 0) goto L_0x008f
            int r5 = r10.hashCode()
            r6 = 96673(0x179a1, float:1.35468E-40)
            if (r5 == r6) goto L_0x0083
            r2 = 267100476(0xfeba13c, float:2.3234894E-29)
            if (r5 == r2) goto L_0x0079
            r0 = 2123857115(0x7e977cdb, float:1.0068086E38)
            if (r5 == r0) goto L_0x006d
            goto L_0x008b
        L_0x006d:
            java.lang.String r0 = "onlyLongPress"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0077
            goto L_0x008b
        L_0x0077:
            r0 = 2
            goto L_0x008e
        L_0x0079:
            java.lang.String r1 = "onlyClick"
            boolean r10 = r10.equals(r1)
            if (r10 != 0) goto L_0x008e
            goto L_0x008b
        L_0x0083:
            java.lang.String r0 = "all"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x008d
        L_0x008b:
            r0 = 4
            goto L_0x008e
        L_0x008d:
            r0 = 1
        L_0x008e:
            r4 = r0
        L_0x008f:
            r9.setFeedbackType(r4)
            tb.p59 r10 = new tb.p59
            r0 = 0
            r10.<init>(r8, r3, r0)
            r9.setFeedback(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.mnh.E(com.alibaba.fastjson.JSONObject, com.taobao.search.m3.M3CellBean, com.taobao.search.sf.datasource.CommonSearchResult):void");
    }

    public final void K(JSONObject jSONObject, M3CellBean m3CellBean) {
        JSONObject jSONObject2;
        int intValue;
        int intValue2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b3f29e", new Object[]{this, jSONObject, m3CellBean});
        } else if (m3CellBean.getP4pIcon() == null) {
            m3CellBean.setNewDate(jSONObject.getString("newDate"));
            if (TextUtils.isEmpty(m3CellBean.getNewDate())) {
                JSONArray jSONArray = jSONObject.getJSONArray("leftSuperScriptInfo");
                if (jSONArray != null && !jSONArray.isEmpty()) {
                    int size = jSONArray.size();
                    for (int i = 0; i < size; i++) {
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                        String string = jSONObject3.getString("fieldTemplate");
                        if (string != null) {
                            String string2 = jSONObject3.getString("imageUrl");
                            int intValue3 = jSONObject3.getIntValue("width");
                            int intValue4 = jSONObject3.getIntValue("height");
                            String string3 = jSONObject3.getString("text");
                            int hashCode = string.hashCode();
                            if (hashCode != 75165) {
                                if (hashCode != 1417350021) {
                                    if (hashCode == 1525159562 && string.equals("3DIcon") && !TextUtils.isEmpty(string2) && intValue3 > 0 && intValue4 > 0) {
                                        m3CellBean.setLeftScriptInfo(new ykg(null, 2, string2, intValue3, intValue4, null, jSONObject3.getIntValue("listLeft"), jSONObject3.getIntValue("listTop"), jSONObject3.getIntValue("wfLeft"), jSONObject3.getIntValue("wfTop")));
                                        return;
                                    }
                                } else if (string.equals("liveIcon") && !TextUtils.isEmpty(string2) && intValue3 > 0 && intValue4 > 0) {
                                    m3CellBean.setLeftScriptInfo(new ykg(string3, 1, string2, intValue3, intValue4, jSONObject3.getString("needHiddenLiveNumber"), 0, 0, 0, 0));
                                    return;
                                }
                            } else if (string.equals("LBS") && !TextUtils.isEmpty(string3)) {
                                m3CellBean.setLeftScriptInfo(new ykg(string3, 3, null, 0, 0, jSONObject3.getString("needHiddenLiveNumber"), 0, 0, 0, 0));
                                return;
                            }
                        }
                    }
                }
                JSONObject jSONObject4 = jSONObject.getJSONObject("liveInfo");
                if (!(jSONObject4 == null || (jSONObject2 = jSONObject4.getJSONObject("liveStageImgInfo")) == null)) {
                    String string4 = jSONObject2.getString("url");
                    if (!TextUtils.isEmpty(string4) && (intValue = jSONObject2.getIntValue("width")) > 0 && (intValue2 = jSONObject2.getIntValue("height")) > 0) {
                        m3CellBean.setLeftScriptInfo(new ykg(jSONObject2.getString("liveViewNum"), 1, string4, intValue, intValue2, null, 0, 0, 0, 0));
                    }
                }
            }
        }
    }

    public final void w(JSONObject jSONObject, M3CellBean m3CellBean) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e3ca31a", new Object[]{this, jSONObject, m3CellBean});
            return;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray("benefits");
        if (jSONArray2 != null) {
            int size = jSONArray2.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
                if (jSONObject2 != null && ckf.b(jSONObject2.getString("type"), "flashSaleInfo") && (jSONArray = jSONObject2.getJSONArray("texList")) != null) {
                    ArrayList arrayList = new ArrayList();
                    TextPaint textPaint = new TextPaint();
                    textPaint.setTextSize(FlashSaleView.Companion.a());
                    int size2 = jSONArray.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        String string = jSONArray.getString(i2);
                        if (string != null) {
                            arrayList.add(new vk9(string, (int) textPaint.measureText(string)));
                        }
                    }
                    m3CellBean.setFlashSaleInfo(new uk9(arrayList, jSONObject2.getLongValue("onlineEndTime"), jSONObject2.getString("soldOutTxt"), nnh.a(jSONObject2.getString("txtColor")), jSONObject2.getString("iconUrl"), nnh.a(jSONObject2.getString("countDownBgColor"))));
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Boolean] */
    public final void P(JSONObject jSONObject, M3CellBean m3CellBean) {
        String str;
        Integer num;
        String str2;
        String str3;
        Integer num2;
        String str4;
        Integer num3;
        String str5;
        owm owmVar;
        String str6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fb01da1", new Object[]{this, jSONObject, m3CellBean});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("priceShowWithIcon");
        JSONObject jSONObject3 = jSONObject.getJSONObject(mh1.PRICE_BLOCK);
        String s = s("price", jSONObject2, jSONObject3);
        String s2 = s(mh1.PRICE_PREFIX, jSONObject2, jSONObject3);
        String string = jSONObject.getString("location");
        String string2 = jSONObject.getString("commentCount");
        String string3 = jSONObject.getString("daySold");
        String str7 = null;
        if (TextUtils.isEmpty(string3)) {
            string3 = jSONObject.getString(mh1.PRD_REALSALES);
            if (TextUtils.isEmpty(string3)) {
                Integer integer = jSONObject.getInteger(mh1.PRD_SELLED);
                int intValue = integer != null ? integer.intValue() : -1;
                if (intValue < 0) {
                    string3 = null;
                } else if (intValue >= 10000) {
                    DecimalFormat decimalFormat = new DecimalFormat("0.0");
                    string3 = decimalFormat.format(Float.valueOf(intValue / 10000.0f)) + "万人付款";
                } else {
                    string3 = intValue + Localization.q(R.string.taobao_app_1005_1_16682);
                }
            }
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("priceShowWithIcon");
        if (jSONObject4 != null) {
            String string4 = jSONObject4.getString("priceBottomText");
            Integer a2 = nnh.a(jSONObject4.getString("priceBottomColor"));
            int intValue2 = jSONObject4.getIntValue("iconWidth");
            int intValue3 = jSONObject4.getIntValue("iconHeight");
            String string5 = jSONObject4.getString("iconUrl");
            if (intValue2 <= 0 || intValue3 <= 0 || TextUtils.isEmpty(string5)) {
                owmVar = null;
            } else {
                ckf.d(string5);
                owmVar = new owm(intValue2, intValue3, string5);
            }
            String string6 = jSONObject4.getString(mh1.PRICE_SUFFIX);
            Integer a3 = nnh.a(jSONObject4.getString("suffixColor"));
            String string7 = jSONObject4.getString("subText");
            Integer a4 = nnh.a(jSONObject4.getString("subTextColor"));
            if (jSONObject4.getBooleanValue("showOriginPrice")) {
                str3 = jSONObject4.getString("originPrice");
                if (TextUtils.isEmpty(str3)) {
                    str3 = null;
                }
                str6 = Boolean.valueOf(true ^ jSONObject4.getBooleanValue("hiddenPriceUnderline"));
            } else {
                str6 = null;
                str3 = null;
            }
            JSONObject jSONObject5 = jSONObject4.getJSONObject("extra");
            if (jSONObject5 != null) {
                str7 = jSONObject5.getString("listBackgroundImgUrl");
                str = jSONObject5.getString("wfBackgroundImgUrl");
            } else {
                str = null;
            }
            str2 = string4;
            num = a2;
            num2 = a4;
            num3 = a3;
            str4 = string7;
            str5 = string6;
            str7 = str6;
        } else {
            owmVar = null;
            str5 = null;
            num3 = null;
            str4 = null;
            num2 = null;
            str3 = null;
            str2 = null;
            num = null;
            str7 = null;
            str = null;
        }
        String title = m3CellBean.getTitle();
        String str8 = "";
        if (title == null) {
            title = str8;
        }
        String str9 = s == null ? str8 : s;
        if (string3 != null) {
            str8 = string3;
        }
        m3CellBean.setPriceInfo(new pwm(owmVar, s2, s, str5, num3, str4, num2, str3, ckf.b(str7, Boolean.TRUE), string3, string2, string, title + ' ' + str9 + ' ' + str8, str2, num, str7, str));
    }

    public final void G(JSONObject jSONObject, M3CellBean m3CellBean, BaseSearchResult baseSearchResult) {
        boolean z;
        String string;
        String string2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d073506", new Object[]{this, jSONObject, m3CellBean, baseSearchResult});
            return;
        }
        ckf.e(baseSearchResult, "null cannot be cast to non-null type com.taobao.search.sf.datasource.CommonSearchResult");
        CommonSearchResult commonSearchResult = (CommonSearchResult) baseSearchResult;
        JSONObject jSONObject2 = commonSearchResult.pageData;
        List list = null;
        JSONObject jSONObject3 = jSONObject2 != null ? jSONObject2.getJSONObject("dynamicData") : null;
        HashMap<String, SearchDomBean> hashMap = commonSearchResult.domIcons;
        if (jSONObject3 == null || (string2 = jSONObject3.getString("p4pIconPosition")) == null) {
            z = false;
        } else {
            z = ckf.b(string2, "leftBottom") || ckf.b(string2, "rightBottom");
            if (z) {
                m3CellBean.setP4pIconBottomLeft(ckf.b(string2, "leftBottom"));
                m3CellBean.setP4pIconUrl(jSONObject3.getString("p4pIconUrl"));
                m3CellBean.setP4pIconWidth(jSONObject3.getIntValue("p4pIconWidth"));
                m3CellBean.setP4pIconHeight(jSONObject3.getIntValue("p4pIconHeight"));
            }
        }
        JSONArray jSONArray = jSONObject.getJSONArray(m09.ICON_RENDER);
        if (jSONArray != null) {
            int size = jSONArray.size();
            ArrayList arrayList = new ArrayList(size);
            xfe xfeVar = null;
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject4 = jSONArray.getJSONObject(i);
                String string3 = jSONObject4.getString("type");
                if (!(string3 == null || !ckf.b(jSONObject4.getString("group"), "2") || (string = jSONObject4.getString("domClass")) == null)) {
                    JSONObject jSONObject5 = jSONObject4.getJSONObject("iconStyle");
                    SearchDomBean g = q1p.g(jSONObject5 != null ? jSONObject5.getJSONObject("light") : null);
                    if (!(g == null && (hashMap == null || (g = hashMap.get(string)) == null))) {
                        String string4 = jSONObject4.getString("text");
                        String obj = string4 != null ? wsq.Q0(string4).toString() : null;
                        String string5 = jSONObject4.getString("prefix");
                        xfe xfeVar2 = new xfe(g, string3, obj, string5 != null ? wsq.Q0(string5).toString() : null, string);
                        if (ckf.b(string, "guanggao")) {
                            if (z) {
                                m3CellBean.setMoveP4pIconBottom(true);
                            } else {
                                xfeVar = xfeVar2;
                            }
                        }
                        if (xfeVar2.f()) {
                            arrayList.add(xfeVar2);
                        }
                    }
                }
            }
            if (xfeVar != null) {
                list = xz3.e(xfeVar);
            }
            m3CellBean.setIconInfo(new wfe(arrayList, list));
        }
    }

    public final void O(JSONObject jSONObject, M3CellBean m3CellBean, BaseSearchResult baseSearchResult) {
        f4m f4mVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8b9babf", new Object[]{this, jSONObject, m3CellBean, baseSearchResult});
        } else if (jSONObject.getBooleanValue("canPk")) {
            ckf.e(baseSearchResult, "null cannot be cast to non-null type com.taobao.search.sf.datasource.CommonSearchResult");
            JSONObject jSONObject2 = ((CommonSearchResult) baseSearchResult).pageInfo;
            String string = jSONObject2 != null ? jSONObject2.getString("pkGroup") : null;
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("pkInfo");
                if (jSONObject3 != null) {
                    ArrayList arrayList = new ArrayList();
                    JSONArray jSONArray = jSONObject3.getJSONArray("extraParamKeys");
                    if (jSONArray != null) {
                        int size = jSONObject3.size();
                        for (int i = 0; i < size; i++) {
                            String string2 = jSONArray.getString(i);
                            if (!TextUtils.isEmpty(string2)) {
                                arrayList.add(string2);
                            }
                        }
                    }
                    String string3 = jSONObject3.getString("buttonDefaultText");
                    String string4 = jSONObject3.getString("buttonSelectedText");
                    f4mVar = new f4m(string3, string4, arrayList, false, "pk_" + string);
                } else {
                    f4mVar = new f4m(null, null, null, false, "pk_" + string);
                }
                m3CellBean.setPkInfo(f4mVar);
            }
        }
    }

    public final void S(JSONObject jSONObject, M3CellBean m3CellBean, CommonSearchResult commonSearchResult) {
        JSONObject jSONObject2;
        int i = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78f86f3f", new Object[]{this, jSONObject, m3CellBean, commonSearchResult});
            return;
        }
        m3CellBean.getAuctionBean().userId = jSONObject.getString("userId");
        boolean removeShopInfo = m3CellBean.getRemoveShopInfo();
        Object obj = null;
        String string = (!m3CellBean.getRemoveShopInfo() || (jSONObject2 = commonSearchResult.pageData.getJSONObject("dynamicData")) == null) ? null : jSONObject2.getString("showIntoShopSourceType");
        JSONObject jSONObject3 = jSONObject.getJSONObject("structuredShopInfo");
        if (jSONObject3 == null) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("shopInfo");
            if (jSONObject4 != null && jSONObject4.getBooleanValue("pbshowshopinfo")) {
                String string2 = jSONObject4.getString("url");
                JSONArray jSONArray = jSONObject4.getJSONArray("shopInfoList");
                if (jSONArray != null && jSONArray.size() != 0) {
                    ArrayList arrayList = new ArrayList(jSONArray.size());
                    String string3 = jSONArray.getString(0);
                    if (!TextUtils.isEmpty(string3)) {
                        Integer a2 = nnh.a(jSONObject4.getString("shopInfoColor"));
                        arrayList.add(new yop(a2, string3, Constants.Name.SUFFIX, 0, 0, null));
                        if (jSONArray.size() > 1) {
                            String string4 = jSONArray.getString(1);
                            if (!TextUtils.isEmpty(string4)) {
                                arrayList.add(new yop(a2, string4, "all", 0, 0, null));
                            }
                        }
                        m3CellBean.setShopInfo(new vop(string2, null, arrayList, false, ""));
                    }
                }
            }
        } else if (jSONObject3.getBooleanValue("pbshowshopinfo")) {
            String string5 = jSONObject3.getString("url");
            JSONArray jSONArray2 = jSONObject3.getJSONArray("infoList");
            if (jSONArray2 != null) {
                ArrayList arrayList2 = new ArrayList(jSONArray2.size());
                StringBuilder sb = new StringBuilder();
                int size = jSONArray2.size();
                int i2 = 0;
                while (i2 < size) {
                    JSONObject jSONObject5 = jSONArray2.getJSONObject(i2);
                    if (jSONObject5 != null) {
                        String string6 = jSONObject5.getString("text");
                        String string7 = jSONObject5.getString("sourceType");
                        if (string7 == null) {
                            string7 = "";
                        }
                        if (removeShopInfo && string != null && !TextUtils.isEmpty(string7) && wsq.O(string, string7, false, i, obj)) {
                            m3CellBean.setRemoveShopInfo(false);
                            removeShopInfo = false;
                        }
                        if (!TextUtils.isEmpty(string6)) {
                            if (sb.length() > 0) {
                                sb.append(" ");
                            }
                            sb.append(string6);
                        }
                        Integer a3 = nnh.a(jSONObject5.getString("color"));
                        String string8 = jSONObject5.getString("hiddenType");
                        ckf.f(string8, "getString(...)");
                        arrayList2.add(new yop(a3, string6, string8, jSONObject5.getIntValue("iconWidth"), jSONObject5.getIntValue("iconHeight"), jSONObject5.getString("icon")));
                    }
                    i2++;
                    i = 2;
                    obj = null;
                }
                Integer a4 = nnh.a(jSONObject3.getString("guideColor"));
                String sb2 = sb.toString();
                ckf.f(sb2, "toString(...)");
                m3CellBean.setShopInfo(new vop(string5, a4, arrayList2, true, sb2));
            }
        }
    }
}
