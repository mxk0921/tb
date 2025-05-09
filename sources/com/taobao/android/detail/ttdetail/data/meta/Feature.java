package com.taobao.android.detail.ttdetail.data.meta;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.feature.DevFeature;
import tb.rcw;
import tb.t2o;

/* compiled from: Taobao */
@MappingKey(key = "feature")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class Feature extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final boolean bundleItem;
    private final boolean customItem;
    private final boolean detail3;
    private final boolean detail3EnableSmallWindow;
    private final boolean detail3HeadPic;
    private final boolean detail3SkuPriceLinkage;
    private final boolean detail3VideoAutoPlay;
    private final boolean detail3VideoCompress;
    private final boolean detailNewLightOff;
    private final boolean enableMainPicMask;
    private final boolean enableNewStructure;
    private final boolean finalUltron;
    private final boolean guessYouLikeNewStyle;
    private final boolean headerPicFlow;
    private final boolean headerPicScrollCycle;
    private final boolean hideMainPicLocator;
    private final boolean industryDynamicLayout;
    private final boolean insideDowngrade;
    private final boolean insideNewHeight;
    private final boolean isDonateItem;
    private final boolean isPromoteContent;
    private final boolean isSceneMatchingPurchase;
    private final boolean lightoffPageFindSimilar;
    private final boolean mainPicGifAutoPlay;
    private final boolean mainPicHideLocator;
    private final boolean newCollectSummary;
    private final boolean newbuyShowSku;
    private final boolean oneProductMM;
    private final boolean oneProductMMDegrade;
    private final boolean openDetailAndAddCartAndBuyNow;
    private final boolean openDetailAndNewBuy;
    private final boolean selectedBundleTab;
    private final boolean showSku;
    private final boolean skuSilentAction;
    private final boolean smAcitonAfterPurchase;
    private final boolean supportPresent;
    private final boolean useMtopPost;

    static {
        t2o.a(912261670);
    }

    public Feature(JSONObject jSONObject) {
        super(jSONObject);
        this.finalUltron = jSONObject.getBooleanValue("finalUltron");
        this.bundleItem = jSONObject.getBooleanValue("bundleItem");
        this.detail3 = jSONObject.getBooleanValue("detail3");
        this.insideDowngrade = jSONObject.getBooleanValue("insideDowngrade");
        this.isDonateItem = jSONObject.getBooleanValue("isDonateItem");
        this.detail3VideoAutoPlay = jSONObject.getBooleanValue("detail3VideoAutoPlay");
        this.showSku = jSONObject.getBooleanValue("showSku");
        this.skuSilentAction = jSONObject.getBooleanValue("skuSilentAction");
        this.detail3HeadPic = jSONObject.getBooleanValue("detail3HeadPic");
        Boolean bool = jSONObject.getBoolean("newbuyShowSku");
        this.newbuyShowSku = bool == null || bool.booleanValue();
        this.detail3VideoCompress = jSONObject.getBooleanValue("detail3VideoCompress");
        this.detail3EnableSmallWindow = jSONObject.getBooleanValue(rcw.ENABLE_SMALL_WINDOW);
        this.headerPicFlow = jSONObject.getBooleanValue("headerPicFlow");
        this.detailNewLightOff = jSONObject.getBooleanValue("detailNewLightOff");
        this.oneProductMM = jSONObject.getBooleanValue("oneProductMM");
        this.oneProductMMDegrade = jSONObject.getBooleanValue("oneProductMMDegrade");
        this.detail3SkuPriceLinkage = jSONObject.getBooleanValue("detail3SkuPriceLinkage");
        this.enableNewStructure = jSONObject.getBooleanValue("enableNewStructure");
        this.openDetailAndNewBuy = jSONObject.getBooleanValue("openDetailAndNewBuy");
        this.openDetailAndAddCartAndBuyNow = jSONObject.getBooleanValue("openDetailAndAddCartAndBuyNow");
        this.industryDynamicLayout = jSONObject.getBooleanValue("industryDynamicLayout");
        this.hideMainPicLocator = jSONObject.getBooleanValue("hideMainPicLocator");
        this.guessYouLikeNewStyle = jSONObject.getBooleanValue("guessYouLikeNewStyle");
        this.insideNewHeight = jSONObject.getBooleanValue("insideNewHeight");
        this.lightoffPageFindSimilar = jSONObject.getBooleanValue("lightoffPageFindSimilar");
        this.headerPicScrollCycle = jSONObject.getBooleanValue("headerPicScrollCycle");
        this.customItem = jSONObject.getBooleanValue("customItem");
        this.smAcitonAfterPurchase = jSONObject.getBooleanValue("smAcitonAfterPurchase");
        this.isPromoteContent = jSONObject.getBooleanValue("isPromoteContent");
        this.enableMainPicMask = jSONObject.getBooleanValue("enableMainPicMask");
        this.mainPicHideLocator = jSONObject.getBooleanValue("mainPicHideLocator");
        this.supportPresent = jSONObject.getBooleanValue("supportPresent");
        this.mainPicGifAutoPlay = jSONObject.getBooleanValue("mainPicGifAutoPlay");
        this.newCollectSummary = jSONObject.getBooleanValue("newCollectSummary");
        this.isSceneMatchingPurchase = jSONObject.getBooleanValue("isSceneMatchingPurchase");
        this.selectedBundleTab = jSONObject.getBooleanValue("selectedBundleTab");
        this.useMtopPost = jSONObject.getBooleanValue("useMtopPost");
    }

    public static /* synthetic */ Object ipc$super(Feature feature, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/data/meta/Feature");
    }

    public boolean isBundleItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f12b88a", new Object[]{this})).booleanValue();
        }
        return this.bundleItem;
    }

    public boolean isCustomItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44b3b479", new Object[]{this})).booleanValue();
        }
        return this.customItem;
    }

    public boolean isDetail3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f364203", new Object[]{this})).booleanValue();
        }
        return this.detail3;
    }

    public boolean isDetail3EnableSmallWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ffdaa47", new Object[]{this})).booleanValue();
        }
        return this.detail3EnableSmallWindow;
    }

    public boolean isDetail3HeadPic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c065227d", new Object[]{this})).booleanValue();
        }
        return this.detail3HeadPic;
    }

    public boolean isDetail3SkuPriceLinkage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8119ba6c", new Object[]{this})).booleanValue();
        }
        return this.detail3SkuPriceLinkage;
    }

    public boolean isDetail3VideoAutoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0f32611", new Object[]{this})).booleanValue();
        }
        return this.detail3VideoAutoPlay;
    }

    public boolean isDetail3VideoCompress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a13b9c70", new Object[]{this})).booleanValue();
        }
        return this.detail3VideoCompress;
    }

    public boolean isDetailNewLightOff() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d892e2a9", new Object[]{this})).booleanValue();
        }
        return this.detailNewLightOff;
    }

    public boolean isDonateItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f599577", new Object[]{this})).booleanValue();
        }
        return this.isDonateItem;
    }

    public boolean isEnableMainPicMask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df23a29b", new Object[]{this})).booleanValue();
        }
        if (this.enableMainPicMask || Boolean.TRUE.equals(DevFeature.mFeature.get(DevFeature.sEnableMedicalHeaderMask))) {
            return true;
        }
        return false;
    }

    public boolean isEnableNewStructure() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb2f0c2b", new Object[]{this})).booleanValue();
        }
        return this.enableNewStructure;
    }

    public boolean isFinalUltron() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e49efe0b", new Object[]{this})).booleanValue();
        }
        return this.finalUltron;
    }

    public boolean isGuessYouLikeNewStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e655765", new Object[]{this})).booleanValue();
        }
        return this.guessYouLikeNewStyle;
    }

    public boolean isHeaderPicFlow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b11eb18c", new Object[]{this})).booleanValue();
        }
        return this.headerPicFlow;
    }

    public boolean isHeaderPicScrollCycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6b713f1", new Object[]{this})).booleanValue();
        }
        return this.headerPicScrollCycle;
    }

    public boolean isHideMainPicLocator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("136d26fc", new Object[]{this})).booleanValue();
        }
        return this.hideMainPicLocator;
    }

    public boolean isIndustryDynamicLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f644e00c", new Object[]{this})).booleanValue();
        }
        return this.industryDynamicLayout;
    }

    public boolean isInsideDowngrade() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d014725a", new Object[]{this})).booleanValue();
        }
        return this.insideDowngrade;
    }

    public boolean isInsideNewHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f427cc", new Object[]{this})).booleanValue();
        }
        return this.insideNewHeight;
    }

    public boolean isLightoffPageFindSimilar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0ac060b", new Object[]{this})).booleanValue();
        }
        return this.lightoffPageFindSimilar;
    }

    public boolean isMainPicGifAutoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13ba9aeb", new Object[]{this})).booleanValue();
        }
        return this.mainPicGifAutoPlay;
    }

    public boolean isMainPicHideLocator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8ed37f8", new Object[]{this})).booleanValue();
        }
        return this.mainPicHideLocator;
    }

    public boolean isNewCollectSummary() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1feaf05d", new Object[]{this})).booleanValue();
        }
        return this.newCollectSummary;
    }

    public boolean isNewbuyShowSku() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("168d789b", new Object[]{this})).booleanValue();
        }
        return this.newbuyShowSku;
    }

    public boolean isOneProductMM() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("923d305e", new Object[]{this})).booleanValue();
        }
        return this.oneProductMM;
    }

    public boolean isOneProductMMDegrade() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e978e2e", new Object[]{this})).booleanValue();
        }
        return this.oneProductMMDegrade;
    }

    public boolean isOpenDetailAndAddCartAndBuyNow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa44dd03", new Object[]{this})).booleanValue();
        }
        return this.openDetailAndAddCartAndBuyNow;
    }

    public boolean isOpenDetailAndNewBuy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b48fb783", new Object[]{this})).booleanValue();
        }
        return this.openDetailAndNewBuy;
    }

    public boolean isPromoteContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2696e76e", new Object[]{this})).booleanValue();
        }
        return this.isPromoteContent;
    }

    public boolean isSceneMatchingPurchase() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad9e324b", new Object[]{this})).booleanValue();
        }
        return this.isSceneMatchingPurchase;
    }

    public boolean isSelectedBundleTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b47734d9", new Object[]{this})).booleanValue();
        }
        return this.selectedBundleTab;
    }

    public boolean isShowSku() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43a0dde1", new Object[]{this})).booleanValue();
        }
        return this.showSku;
    }

    public boolean isSkuSilentAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8ecafa9", new Object[]{this})).booleanValue();
        }
        return this.skuSilentAction;
    }

    public boolean isSmAcitonAfterPurchase() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20764938", new Object[]{this})).booleanValue();
        }
        return this.smAcitonAfterPurchase;
    }

    public boolean isSupportPresent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba013b41", new Object[]{this})).booleanValue();
        }
        return this.supportPresent;
    }

    public boolean isUseMtopPost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("931fafb0", new Object[]{this})).booleanValue();
        }
        return this.useMtopPost;
    }
}
