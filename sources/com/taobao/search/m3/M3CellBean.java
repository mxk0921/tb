package com.taobao.search.m3;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.search.common.dynamic.bean.SearchDomBean;
import com.taobao.search.jarvis.bean.DynamicCardBean;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import java.util.HashSet;
import java.util.List;
import tb.a07;
import tb.ckf;
import tb.cuf;
import tb.f1n;
import tb.f4m;
import tb.hhf;
import tb.md4;
import tb.nhl;
import tb.p34;
import tb.p59;
import tb.pwm;
import tb.pzp;
import tb.rp7;
import tb.t2o;
import tb.uk9;
import tb.vop;
import tb.wfe;
import tb.ykg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class M3CellBean extends BaseCellBean {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final int FEEDBACK_ALL = 1;
    public static final int FEEDBACK_CLICK = 3;
    public static final int FEEDBACK_LONG_PRESS = 2;
    public static final int FEEDBACK_PLT = 4;
    public static final int ICON_UPS_MERGE_ICON = 2;
    public static final int ICON_UPS_MERGE_USP = 1;
    public static final int MERGE_LOC_TO_PRICE_BOTTOM = 2;
    public static final int MERGE_LOC_TO_PRICE_TOP = 1;
    private static final HashSet<String> summaryShowType;
    private String auctionURL;
    private JSONObject backCardRqParams;
    private hhf bottomTagInfo;
    private JSONObject clickBackParams;
    private String clickUrl;
    private p34 commentInfo;
    private md4 compositeInfo;
    private rp7 discountInfo;
    private DynamicCardBean dynamicCardBean;
    private boolean exposed;
    private JSONObject extDetailParams;
    private JSONArray extraParams;
    private p59 feedback;
    private String finalTargetUrl;
    private uk9 flashSaleInfo;
    private boolean hasPreRequestDetail;
    private wfe iconInfo;
    private hhf interactiveInfo;
    private boolean isClicked;
    private cuf jiaGouInfo;
    private Boolean jiaGouSupport;
    private boolean jiaGouUt;
    private ykg leftScriptInfo;
    private boolean listIconInTop;
    private boolean moveP4pIconBottom;
    private String newDate;
    private JSONObject originData;
    private nhl p4pIcon;
    private boolean p4pIconBottomLeft;
    private int p4pIconHeight;
    private String p4pIconUrl;
    private int p4pIconWidth;
    private JSONObject pageInfo;
    private String picPath;
    private f4m pkInfo;
    private String pltSimilarUrl;
    private String prefetchImgRatio;
    private pwm priceInfo;
    private f1n propertyInfo;
    private boolean removeBottomTag;
    private boolean removeIcon;
    private boolean removeShopInfo;
    private boolean removeUsp;
    private vop shopInfo;
    private String similarSameUrl;
    private pzp singleRowInfo;
    private String skuSourceType;
    private f1n summaryTips;
    private String title;
    private SearchDomBean titleIcon;
    private List<SearchDomBean> titleIcons;
    private String uprightImage;
    private boolean useAuctionURL;
    private boolean uspBottom;
    private boolean uspInWhiteList;
    private JSONObject utLogMap;
    private boolean videoAutoPlay;
    private boolean videoForcePlay;
    private String wfRatioOrigin;
    private JSONObject wsData;
    private int x_qzt_ad;
    private float wfRatio = 1.0f;
    private int wfTitleLines = 1;
    private int listTitleLines = 2;
    private int iconUspMerge = -1;
    private int mergeLocToPrice = -1;
    private int listMergeLocToPrice = -1;
    private int feedbackType = 4;
    private AuctionBaseBean auctionBean = new AuctionBaseBean();
    private String etype = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792328);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final HashSet<String> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HashSet) ipChange.ipc$dispatch("4915680b", new Object[]{this});
            }
            return M3CellBean.access$getSummaryShowType$cp();
        }

        public a() {
        }
    }

    public static final /* synthetic */ HashSet access$getSummaryShowType$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashSet) ipChange.ipc$dispatch("a21493ee", new Object[0]);
        }
        return summaryShowType;
    }

    public static /* synthetic */ Object ipc$super(M3CellBean m3CellBean, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/M3CellBean");
    }

    public final AuctionBaseBean getAuctionBean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuctionBaseBean) ipChange.ipc$dispatch("e8e51145", new Object[]{this});
        }
        return this.auctionBean;
    }

    public final String getAuctionURL() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de062017", new Object[]{this});
        }
        return this.auctionURL;
    }

    public final JSONObject getBackCardRqParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ab9ec879", new Object[]{this});
        }
        return this.backCardRqParams;
    }

    public final hhf getBottomTagInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhf) ipChange.ipc$dispatch("daac3349", new Object[]{this});
        }
        return this.bottomTagInfo;
    }

    public final JSONObject getClickBackParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4e52aae6", new Object[]{this});
        }
        return this.clickBackParams;
    }

    public final String getClickUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("69622edc", new Object[]{this});
        }
        return this.clickUrl;
    }

    public final p34 getCommentInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p34) ipChange.ipc$dispatch("2a053b9f", new Object[]{this});
        }
        return this.commentInfo;
    }

    public final md4 getCompositeInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (md4) ipChange.ipc$dispatch("24e9ca27", new Object[]{this});
        }
        return this.compositeInfo;
    }

    public final rp7 getDiscountInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rp7) ipChange.ipc$dispatch("6b9f2031", new Object[]{this});
        }
        return this.discountInfo;
    }

    public final DynamicCardBean getDynamicCardBean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DynamicCardBean) ipChange.ipc$dispatch("f967758b", new Object[]{this});
        }
        return this.dynamicCardBean;
    }

    public final String getEtype() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c4c1f30", new Object[]{this});
        }
        return this.etype;
    }

    public final boolean getExposed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("786da075", new Object[]{this})).booleanValue();
        }
        return this.exposed;
    }

    public final JSONObject getExtDetailParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("14055e69", new Object[]{this});
        }
        return this.extDetailParams;
    }

    public final JSONArray getExtraParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("47000057", new Object[]{this});
        }
        return this.extraParams;
    }

    public final p59 getFeedback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p59) ipChange.ipc$dispatch("bfa0dffb", new Object[]{this});
        }
        return this.feedback;
    }

    public final int getFeedbackType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec5948cf", new Object[]{this})).intValue();
        }
        return this.feedbackType;
    }

    public final String getFinalTargetUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42268b7b", new Object[]{this});
        }
        return this.finalTargetUrl;
    }

    public final uk9 getFlashSaleInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uk9) ipChange.ipc$dispatch("b7bb1a7e", new Object[]{this});
        }
        return this.flashSaleInfo;
    }

    public final boolean getHasPreRequestDetail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13d0d96c", new Object[]{this})).booleanValue();
        }
        return this.hasPreRequestDetail;
    }

    public final wfe getIconInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wfe) ipChange.ipc$dispatch("f6745504", new Object[]{this});
        }
        return this.iconInfo;
    }

    public final int getIconUspMerge() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8131d5cf", new Object[]{this})).intValue();
        }
        return this.iconUspMerge;
    }

    public final hhf getInteractiveInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhf) ipChange.ipc$dispatch("3d69bbb6", new Object[]{this});
        }
        return this.interactiveInfo;
    }

    public final cuf getJiaGouInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cuf) ipChange.ipc$dispatch("e442ce31", new Object[]{this});
        }
        return this.jiaGouInfo;
    }

    public final Boolean getJiaGouSupport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("f487d332", new Object[]{this});
        }
        return this.jiaGouSupport;
    }

    public final boolean getJiaGouUt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("207ca42b", new Object[]{this})).booleanValue();
        }
        return this.jiaGouUt;
    }

    public final ykg getLeftScriptInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ykg) ipChange.ipc$dispatch("2c146cc1", new Object[]{this});
        }
        return this.leftScriptInfo;
    }

    public final boolean getListIconInTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23044d4e", new Object[]{this})).booleanValue();
        }
        return this.listIconInTop;
    }

    public final int getListMergeLocToPrice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a46e8e4c", new Object[]{this})).intValue();
        }
        return this.listMergeLocToPrice;
    }

    public final int getListTitleLines() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce5bceb5", new Object[]{this})).intValue();
        }
        return this.listTitleLines;
    }

    public final int getMergeLocToPrice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ca189cca", new Object[]{this})).intValue();
        }
        return this.mergeLocToPrice;
    }

    public final boolean getMoveP4pIconBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("906ff354", new Object[]{this})).booleanValue();
        }
        return this.moveP4pIconBottom;
    }

    public final String getNewDate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("40a028c1", new Object[]{this});
        }
        return this.newDate;
    }

    public final JSONObject getOriginData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6d23a08d", new Object[]{this});
        }
        return this.originData;
    }

    public final nhl getP4pIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nhl) ipChange.ipc$dispatch("3d0347b3", new Object[]{this});
        }
        return this.p4pIcon;
    }

    public final boolean getP4pIconBottomLeft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5120f3cc", new Object[]{this})).booleanValue();
        }
        return this.p4pIconBottomLeft;
    }

    public final int getP4pIconHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("83efc110", new Object[]{this})).intValue();
        }
        return this.p4pIconHeight;
    }

    public final String getP4pIconUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50c8bd99", new Object[]{this});
        }
        return this.p4pIconUrl;
    }

    public final int getP4pIconWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6158ae71", new Object[]{this})).intValue();
        }
        return this.p4pIconWidth;
    }

    public final JSONObject getPageInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3e68ff7a", new Object[]{this});
        }
        return this.pageInfo;
    }

    public final String getPicPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a860c800", new Object[]{this});
        }
        return this.picPath;
    }

    public final f4m getPkInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f4m) ipChange.ipc$dispatch("7ffbdacd", new Object[]{this});
        }
        return this.pkInfo;
    }

    public final String getPltSimilarUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ee5dad3", new Object[]{this});
        }
        return this.pltSimilarUrl;
    }

    public final String getPrefetchImgRatio() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb6a3d84", new Object[]{this});
        }
        return this.prefetchImgRatio;
    }

    public final pwm getPriceInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pwm) ipChange.ipc$dispatch("d811a521", new Object[]{this});
        }
        return this.priceInfo;
    }

    public final f1n getPropertyInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f1n) ipChange.ipc$dispatch("b3dba09d", new Object[]{this});
        }
        return this.propertyInfo;
    }

    public final boolean getRemoveBottomTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1e93920", new Object[]{this})).booleanValue();
        }
        return this.removeBottomTag;
    }

    public final boolean getRemoveIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6380421e", new Object[]{this})).booleanValue();
        }
        return this.removeIcon;
    }

    public final boolean getRemoveShopInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a2fd3e9", new Object[]{this})).booleanValue();
        }
        return this.removeShopInfo;
    }

    public final boolean getRemoveUsp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc57b043", new Object[]{this})).booleanValue();
        }
        return this.removeUsp;
    }

    public final vop getShopInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vop) ipChange.ipc$dispatch("57fcd2f2", new Object[]{this});
        }
        return this.shopInfo;
    }

    public final String getSimilarSameUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d4a53bc5", new Object[]{this});
        }
        return this.similarSameUrl;
    }

    public final pzp getSingleRowInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pzp) ipChange.ipc$dispatch("1ef9e0a6", new Object[]{this});
        }
        return this.singleRowInfo;
    }

    public final String getSkuSourceType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da91913d", new Object[]{this});
        }
        return this.skuSourceType;
    }

    public final f1n getSummaryTips() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f1n) ipChange.ipc$dispatch("d5adbc8e", new Object[]{this});
        }
        return this.summaryTips;
    }

    public final String getTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this});
        }
        return this.title;
    }

    public final SearchDomBean getTitleIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchDomBean) ipChange.ipc$dispatch("251c24c8", new Object[]{this});
        }
        return this.titleIcon;
    }

    public final List<SearchDomBean> getTitleIcons() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8c170848", new Object[]{this});
        }
        return this.titleIcons;
    }

    public final String getUprightImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c7fc109", new Object[]{this});
        }
        return this.uprightImage;
    }

    public final boolean getUseAuctionURL() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a50f68", new Object[]{this})).booleanValue();
        }
        return this.useAuctionURL;
    }

    public final boolean getUspBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a9320b2", new Object[]{this})).booleanValue();
        }
        return this.uspBottom;
    }

    public final boolean getUspInWhiteList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47ca5251", new Object[]{this})).booleanValue();
        }
        return this.uspInWhiteList;
    }

    public final JSONObject getUtLogMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("40e47994", new Object[]{this});
        }
        return this.utLogMap;
    }

    public final boolean getVideoAutoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16b287f3", new Object[]{this})).booleanValue();
        }
        return this.videoAutoPlay;
    }

    public final boolean getVideoForcePlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ad90705", new Object[]{this})).booleanValue();
        }
        return this.videoForcePlay;
    }

    public final float getWfRatio() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f15767bd", new Object[]{this})).floatValue();
        }
        return this.wfRatio;
    }

    public final String getWfRatioOrigin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9210496d", new Object[]{this});
        }
        return this.wfRatioOrigin;
    }

    public final int getWfTitleLines() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fbe808a6", new Object[]{this})).intValue();
        }
        return this.wfTitleLines;
    }

    public final JSONObject getWsData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("86527d43", new Object[]{this});
        }
        return this.wsData;
    }

    public final int getX_qzt_ad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("18b35b0e", new Object[]{this})).intValue();
        }
        return this.x_qzt_ad;
    }

    public final boolean isClicked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19b245a8", new Object[]{this})).booleanValue();
        }
        return this.isClicked;
    }

    public final void setAuctionBean(AuctionBaseBean auctionBaseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8906459", new Object[]{this, auctionBaseBean});
            return;
        }
        ckf.g(auctionBaseBean, "<set-?>");
        this.auctionBean = auctionBaseBean;
    }

    public final void setAuctionURL(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a76a3f", new Object[]{this, str});
        } else {
            this.auctionURL = str;
        }
    }

    public final void setBackCardRqParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35ddab2b", new Object[]{this, jSONObject});
        } else {
            this.backCardRqParams = jSONObject;
        }
    }

    public final void setBottomTagInfo(hhf hhfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf823503", new Object[]{this, hhfVar});
        } else {
            this.bottomTagInfo = hhfVar;
        }
    }

    public final void setClickBackParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb0e32f6", new Object[]{this, jSONObject});
        } else {
            this.clickBackParams = jSONObject;
        }
    }

    public final void setClickUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dc1071a", new Object[]{this, str});
        } else {
            this.clickUrl = str;
        }
    }

    public final void setClicked(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e133bce8", new Object[]{this, new Boolean(z)});
        } else {
            this.isClicked = z;
        }
    }

    public final void setCommentInfo(p34 p34Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("502a62b9", new Object[]{this, p34Var});
        } else {
            this.commentInfo = p34Var;
        }
    }

    public final void setCompositeInfo(md4 md4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caa87611", new Object[]{this, md4Var});
        } else {
            this.compositeInfo = md4Var;
        }
    }

    public final void setDiscountInfo(rp7 rp7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40517c7f", new Object[]{this, rp7Var});
        } else {
            this.discountInfo = rp7Var;
        }
    }

    public final void setDynamicCardBean(DynamicCardBean dynamicCardBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f91d7947", new Object[]{this, dynamicCardBean});
        } else {
            this.dynamicCardBean = dynamicCardBean;
        }
    }

    public final void setEtype(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da105cae", new Object[]{this, str});
        } else {
            this.etype = str;
        }
    }

    public final void setExposed(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb901b8f", new Object[]{this, new Boolean(z)});
        } else {
            this.exposed = z;
        }
    }

    public final void setExtDetailParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbb1efd3", new Object[]{this, jSONObject});
        } else {
            this.extDetailParams = jSONObject;
        }
    }

    public final void setExtraParams(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2cd7fa3", new Object[]{this, jSONArray});
        } else {
            this.extraParams = jSONArray;
        }
    }

    public final void setFeedback(p59 p59Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4989d2f5", new Object[]{this, p59Var});
        } else {
            this.feedback = p59Var;
        }
    }

    public final void setFeedbackType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a66521b", new Object[]{this, new Integer(i)});
        } else {
            this.feedbackType = i;
        }
    }

    public final void setFinalTargetUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1377055b", new Object[]{this, str});
        } else {
            this.finalTargetUrl = str;
        }
    }

    public final void setFlashSaleInfo(uk9 uk9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17d554c8", new Object[]{this, uk9Var});
        } else {
            this.flashSaleInfo = uk9Var;
        }
    }

    public final void setHasPreRequestDetail(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1617cf78", new Object[]{this, new Boolean(z)});
        } else {
            this.hasPreRequestDetail = z;
        }
    }

    public final void setIconInfo(wfe wfeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9abe93c0", new Object[]{this, wfeVar});
        } else {
            this.iconInfo = wfeVar;
        }
    }

    public final void setIconUspMerge(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("809f651b", new Object[]{this, new Integer(i)});
        } else {
            this.iconUspMerge = i;
        }
    }

    public final void setInteractiveInfo(hhf hhfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3571ad36", new Object[]{this, hhfVar});
        } else {
            this.interactiveInfo = hhfVar;
        }
    }

    public final void setJiaGouInfo(cuf cufVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d70fed3", new Object[]{this, cufVar});
        } else {
            this.jiaGouInfo = cufVar;
        }
    }

    public final void setJiaGouSupport(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af14db44", new Object[]{this, bool});
        } else {
            this.jiaGouSupport = bool;
        }
    }

    public final void setJiaGouUt(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81eefa01", new Object[]{this, new Boolean(z)});
        } else {
            this.jiaGouUt = z;
        }
    }

    public final void setLeftScriptInfo(ykg ykgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9191d91", new Object[]{this, ykgVar});
        } else {
            this.leftScriptInfo = ykgVar;
        }
    }

    public final void setListIconInTop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4b190d6", new Object[]{this, new Boolean(z)});
        } else {
            this.listIconInTop = z;
        }
    }

    public final void setListMergeLocToPrice(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("993078d6", new Object[]{this, new Integer(i)});
        } else {
            this.listMergeLocToPrice = i;
        }
    }

    public final void setListTitleLines(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b633bf5", new Object[]{this, new Integer(i)});
        } else {
            this.listTitleLines = i;
        }
    }

    public final void setMergeLocToPrice(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f34ea018", new Object[]{this, new Integer(i)});
        } else {
            this.mergeLocToPrice = i;
        }
    }

    public final void setMoveP4pIconBottom(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afd2c590", new Object[]{this, new Boolean(z)});
        } else {
            this.moveP4pIconBottom = z;
        }
    }

    public final void setNewDate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da68783d", new Object[]{this, str});
        } else {
            this.newDate = str;
        }
    }

    public final void setOriginData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea5bbc97", new Object[]{this, jSONObject});
        } else {
            this.originData = jSONObject;
        }
    }

    public final void setP4pIcon(nhl nhlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10f064bd", new Object[]{this, nhlVar});
        } else {
            this.p4pIcon = nhlVar;
        }
    }

    public final void setP4pIconBottomLeft(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("541d418", new Object[]{this, new Boolean(z)});
        } else {
            this.p4pIconBottomLeft = z;
        }
    }

    public final void setP4pIconHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91345792", new Object[]{this, new Integer(i)});
        } else {
            this.p4pIconHeight = i;
        }
    }

    public final void setP4pIconUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f387cfd", new Object[]{this, str});
        } else {
            this.p4pIconUrl = str;
        }
    }

    public final void setP4pIconWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a553a0b9", new Object[]{this, new Integer(i)});
        } else {
            this.p4pIconWidth = i;
        }
    }

    public final void setPageInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a34e084a", new Object[]{this, jSONObject});
        } else {
            this.pageInfo = jSONObject;
        }
    }

    public final void setPicPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6abbc0de", new Object[]{this, str});
        } else {
            this.picPath = str;
        }
    }

    public final void setPkInfo(f4m f4mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("568dccc5", new Object[]{this, f4mVar});
        } else {
            this.pkInfo = f4mVar;
        }
    }

    public final void setPltSimilarUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7275616b", new Object[]{this, str});
        } else {
            this.pltSimilarUrl = str;
        }
    }

    public final void setPrefetchImgRatio(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee200172", new Object[]{this, str});
        } else {
            this.prefetchImgRatio = str;
        }
    }

    public final void setPriceInfo(pwm pwmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe1d59cf", new Object[]{this, pwmVar});
        } else {
            this.priceInfo = pwmVar;
        }
    }

    public final void setPropertyInfo(f1n f1nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd8ecc93", new Object[]{this, f1nVar});
        } else {
            this.propertyInfo = f1nVar;
        }
    }

    public final void setRemoveBottomTag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("591cc44", new Object[]{this, new Boolean(z)});
        } else {
            this.removeBottomTag = z;
        }
    }

    public final void setRemoveIcon(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("435f4d6e", new Object[]{this, new Boolean(z)});
        } else {
            this.removeIcon = z;
        }
    }

    public final void setRemoveShopInfo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a101b03", new Object[]{this, new Boolean(z)});
        } else {
            this.removeShopInfo = z;
        }
    }

    public final void setRemoveUsp(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56957281", new Object[]{this, new Boolean(z)});
        } else {
            this.removeUsp = z;
        }
    }

    public final void setShopInfo(vop vopVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b0249d4", new Object[]{this, vopVar});
        } else {
            this.shopInfo = vopVar;
        }
    }

    public final void setSimilarSameUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0ce5e51", new Object[]{this, str});
        } else {
            this.similarSameUrl = str;
        }
    }

    public final void setSingleRowInfo(pzp pzpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73e802c6", new Object[]{this, pzpVar});
        } else {
            this.singleRowInfo = pzpVar;
        }
    }

    public final void setSkuSourceType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac407841", new Object[]{this, str});
        } else {
            this.skuSourceType = str;
        }
    }

    public final void setSummaryTips(f1n f1nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e33372a", new Object[]{this, f1nVar});
        } else {
            this.summaryTips = f1nVar;
        }
    }

    public final void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.title = str;
        }
    }

    public final void setTitleIcon(SearchDomBean searchDomBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6590160", new Object[]{this, searchDomBean});
        } else {
            this.titleIcon = searchDomBean;
        }
    }

    public final void setTitleIcons(List<SearchDomBean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7a0e71c", new Object[]{this, list});
        } else {
            this.titleIcons = list;
        }
    }

    public final void setUprightImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c416d48d", new Object[]{this, str});
        } else {
            this.uprightImage = str;
        }
    }

    public final void setUseAuctionURL(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("272911fc", new Object[]{this, new Boolean(z)});
        } else {
            this.useAuctionURL = z;
        }
    }

    public final void setUspBottom(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afc80ff2", new Object[]{this, new Boolean(z)});
        } else {
            this.uspBottom = z;
        }
    }

    public final void setUspInWhiteList(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffc5699b", new Object[]{this, new Boolean(z)});
        } else {
            this.uspInWhiteList = z;
        }
    }

    public final void setUtLogMap(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f041d170", new Object[]{this, jSONObject});
        } else {
            this.utLogMap = jSONObject;
        }
    }

    public final void setVideoAutoPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56caaad1", new Object[]{this, new Boolean(z)});
        } else {
            this.videoAutoPlay = z;
        }
    }

    public final void setVideoForcePlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e8d4b67", new Object[]{this, new Boolean(z)});
        } else {
            this.videoForcePlay = z;
        }
    }

    public final void setWfRatio(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fdef49f", new Object[]{this, new Float(f)});
        } else {
            this.wfRatio = f;
        }
    }

    public final void setWfRatioOrigin(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e498c611", new Object[]{this, str});
        } else {
            this.wfRatioOrigin = str;
        }
    }

    public final void setWfTitleLines(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5caf8d24", new Object[]{this, new Integer(i)});
        } else {
            this.wfTitleLines = i;
        }
    }

    public final void setWsData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54af50a1", new Object[]{this, jSONObject});
        } else {
            this.wsData = jSONObject;
        }
    }

    public final void setX_qzt_ad(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("908ee1bc", new Object[]{this, new Integer(i)});
        } else {
            this.x_qzt_ad = i;
        }
    }

    static {
        t2o.a(815792327);
        HashSet<String> hashSet = new HashSet<>();
        summaryShowType = hashSet;
        hashSet.add("adAbstract");
        hashSet.add("tmRank");
        hashSet.add("shopRank");
        hashSet.add("aiSalePoint");
    }
}
