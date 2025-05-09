package com.taobao.kmp.nexus.arch.openArch.dto_and_do.response_declared_do;

import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.aura.helper.RequestConfig;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import tb.a07;
import tb.a0g;
import tb.dun;
import tb.mh1;
import tb.mzf;
import tb.pg1;
import tb.qjg;
import tb.t2o;
import tb.yj4;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0003\b¶\u0001\b\u0001\u0018\u0000 º\u00012\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0002»\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005R/\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR/\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR/\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR/\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR/\u0010\u001e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\rR/\u0010\"\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\t\u001a\u0004\b \u0010\u000b\"\u0004\b!\u0010\rR/\u0010$\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\t\u001a\u0004\b$\u0010\u000b\"\u0004\b%\u0010\rR/\u0010)\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\t\u001a\u0004\b'\u0010\u000b\"\u0004\b(\u0010\rR/\u0010-\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\t\u001a\u0004\b+\u0010\u000b\"\u0004\b,\u0010\rR/\u00101\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010\t\u001a\u0004\b/\u0010\u000b\"\u0004\b0\u0010\rR/\u00105\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010\t\u001a\u0004\b3\u0010\u000b\"\u0004\b4\u0010\rR/\u00109\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b6\u0010\t\u001a\u0004\b7\u0010\u000b\"\u0004\b8\u0010\rR/\u0010=\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010\t\u001a\u0004\b;\u0010\u000b\"\u0004\b<\u0010\rR/\u0010A\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b>\u0010\t\u001a\u0004\b?\u0010\u000b\"\u0004\b@\u0010\rR/\u0010E\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bB\u0010\t\u001a\u0004\bC\u0010\u000b\"\u0004\bD\u0010\rR/\u0010I\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bF\u0010\t\u001a\u0004\bG\u0010\u000b\"\u0004\bH\u0010\rR/\u0010M\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bJ\u0010\t\u001a\u0004\bK\u0010\u000b\"\u0004\bL\u0010\rR/\u0010Q\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bN\u0010\t\u001a\u0004\bO\u0010\u000b\"\u0004\bP\u0010\rR/\u0010U\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bR\u0010\t\u001a\u0004\bS\u0010\u000b\"\u0004\bT\u0010\rR/\u0010Y\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bV\u0010\t\u001a\u0004\bW\u0010\u000b\"\u0004\bX\u0010\rR/\u0010]\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bZ\u0010\t\u001a\u0004\b[\u0010\u000b\"\u0004\b\\\u0010\rR/\u0010a\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b^\u0010\t\u001a\u0004\b_\u0010\u000b\"\u0004\b`\u0010\rR/\u0010e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bb\u0010\t\u001a\u0004\bc\u0010\u000b\"\u0004\bd\u0010\rR/\u0010i\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bf\u0010\t\u001a\u0004\bg\u0010\u000b\"\u0004\bh\u0010\rR/\u0010k\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bj\u0010\t\u001a\u0004\bk\u0010\u000b\"\u0004\bl\u0010\rR/\u0010p\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bm\u0010\t\u001a\u0004\bn\u0010\u000b\"\u0004\bo\u0010\rR/\u0010t\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bq\u0010\t\u001a\u0004\br\u0010\u000b\"\u0004\bs\u0010\rR/\u0010x\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bu\u0010\t\u001a\u0004\bv\u0010\u000b\"\u0004\bw\u0010\rR/\u0010|\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\by\u0010\t\u001a\u0004\bz\u0010\u000b\"\u0004\b{\u0010\rR0\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b}\u0010\t\u001a\u0004\b~\u0010\u000b\"\u0004\b\u007f\u0010\rR3\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010\t\u001a\u0005\b\u0082\u0001\u0010\u000b\"\u0005\b\u0083\u0001\u0010\rR3\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010\t\u001a\u0005\b\u0086\u0001\u0010\u000b\"\u0005\b\u0087\u0001\u0010\rR3\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0089\u0001\u0010\t\u001a\u0005\b\u008a\u0001\u0010\u000b\"\u0005\b\u008b\u0001\u0010\rR3\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u008d\u0001\u0010\t\u001a\u0005\b\u008e\u0001\u0010\u000b\"\u0005\b\u008f\u0001\u0010\rR3\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0090\u0001\u0010\t\u001a\u0005\b\u0091\u0001\u0010\u000b\"\u0005\b\u0092\u0001\u0010\rR3\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0094\u0001\u0010\t\u001a\u0005\b\u0095\u0001\u0010\u000b\"\u0005\b\u0096\u0001\u0010\rR3\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0097\u0001\u0010\t\u001a\u0005\b\u0098\u0001\u0010\u000b\"\u0005\b\u0099\u0001\u0010\rR3\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u009a\u0001\u0010\t\u001a\u0005\b\u009b\u0001\u0010\u000b\"\u0005\b\u009c\u0001\u0010\rR3\u0010¡\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u009e\u0001\u0010\t\u001a\u0005\b\u009f\u0001\u0010\u000b\"\u0005\b \u0001\u0010\rR3\u0010¥\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b¢\u0001\u0010\t\u001a\u0005\b£\u0001\u0010\u000b\"\u0005\b¤\u0001\u0010\rR3\u0010©\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b¦\u0001\u0010\t\u001a\u0005\b§\u0001\u0010\u000b\"\u0005\b¨\u0001\u0010\rR3\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\bª\u0001\u0010\t\u001a\u0005\b«\u0001\u0010\u000b\"\u0005\b¬\u0001\u0010\rR3\u0010±\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b®\u0001\u0010\t\u001a\u0005\b¯\u0001\u0010\u000b\"\u0005\b°\u0001\u0010\rR3\u0010µ\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b²\u0001\u0010\t\u001a\u0005\b³\u0001\u0010\u000b\"\u0005\b´\u0001\u0010\rR3\u0010¹\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b¶\u0001\u0010\t\u001a\u0005\b·\u0001\u0010\u000b\"\u0005\b¸\u0001\u0010\r¨\u0006¼\u0001"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/ExtendVal;", "Ltb/mzf;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "<init>", "()V", "", "<set-?>", "atmosphere$delegate", "Ltb/qjg;", "getAtmosphere", "()Ljava/lang/String;", "setAtmosphere", "(Ljava/lang/String;)V", "atmosphere", "categoryLevelLeaf$delegate", "getCategoryLevelLeaf", "setCategoryLevelLeaf", "categoryLevelLeaf", "enableSKU$delegate", "getEnableSKU", "setEnableSKU", "enableSKU", "categoryLevelOneName$delegate", "getCategoryLevelOneName", "setCategoryLevelOneName", "categoryLevelOneName", "customizedItemRights$delegate", "getCustomizedItemRights", "setCustomizedItemRights", "customizedItemRights", "benefitCodes$delegate", "getBenefitCodes", "setBenefitCodes", "benefitCodes", "isBestGoods$delegate", "isBestGoods", "setBestGoods", "tabType$delegate", "getTabType", "setTabType", "tabType", "checkResult$delegate", "getCheckResult", "setCheckResult", "checkResult", "hasTaoInsurance$delegate", "getHasTaoInsurance", "setHasTaoInsurance", "hasTaoInsurance", "rightType$delegate", "getRightType", "setRightType", "rightType", "playUrl$delegate", "getPlayUrl", "setPlayUrl", yj4.PARAM_PLAY_URL, "itemCategoryIdList$delegate", "getItemCategoryIdList", "setItemCategoryIdList", "itemCategoryIdList", "sellerId$delegate", "getSellerId", "setSellerId", "sellerId", "subTitle$delegate", "getSubTitle", "setSubTitle", MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE, "tradeParams$delegate", "getTradeParams", "setTradeParams", "tradeParams", "itemIconOfficial$delegate", "getItemIconOfficial", "setItemIconOfficial", "itemIconOfficial", "categoryLevelOne$delegate", "getCategoryLevelOne", "setCategoryLevelOne", "categoryLevelOne", "commission$delegate", "getCommission", "setCommission", "commission", "categoryLevelLeafName$delegate", "getCategoryLevelLeafName", "setCategoryLevelLeafName", "categoryLevelLeafName", "trackInfo$delegate", "getTrackInfo", "setTrackInfo", "trackInfo", "itemUniqueKey$delegate", "getItemUniqueKey", "setItemUniqueKey", "itemUniqueKey", "timeVersion$delegate", "getTimeVersion", "setTimeVersion", "timeVersion", "business$delegate", "getBusiness", "setBusiness", "business", "isAnchorItem$delegate", "isAnchorItem", "setAnchorItem", "timeMovingTypeInfo$delegate", "getTimeMovingTypeInfo", "setTimeMovingTypeInfo", "timeMovingTypeInfo", "itemTabSource$delegate", "getItemTabSource", "setItemTabSource", "itemTabSource", "closePopItem$delegate", "getClosePopItem", "setClosePopItem", "closePopItem", "right$delegate", "getRight", "setRight", "right", "anchorId$delegate", "getAnchorId", "setAnchorId", RequestConfig.KEY_ANCHOR_ID, "timeMovingContentId$delegate", "getTimeMovingContentId", "setTimeMovingContentId", "timeMovingContentId", "liveId$delegate", "getLiveId", "setLiveId", "liveId", "goodsSubscribeStatus$delegate", "getGoodsSubscribeStatus", "setGoodsSubscribeStatus", "goodsSubscribeStatus", "isHide$delegate", "isHide", "setHide", "itemExtendVal$delegate", "getItemExtendVal", "setItemExtendVal", "itemExtendVal", "isCpc$delegate", "isCpc", "setCpc", "isTop$delegate", "isTop", "setTop", "needRecovery$delegate", "getNeedRecovery", "setNeedRecovery", "needRecovery", "benefitDesc$delegate", "getBenefitDesc", "setBenefitDesc", "benefitDesc", "yanxuanIcon$delegate", "getYanxuanIcon", "setYanxuanIcon", "yanxuanIcon", "pageSource$delegate", "getPageSource", "setPageSource", "pageSource", "time$delegate", pg1.ATOM_EXT_getTime, pg1.ATOM_EXT_setTime, "time", "userType$delegate", "getUserType", "setUserType", mh1.PRD_USER_TYPE, "timeMovingStampInfo$delegate", "getTimeMovingStampInfo", "setTimeMovingStampInfo", "timeMovingStampInfo", "timepoint$delegate", "getTimepoint", "setTimepoint", "timepoint", "Companion", "a", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ExtendVal extends mzf implements Serializable {
    public static final /* synthetic */ a0g<Object>[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private final qjg atmosphere$delegate = new qjg(null, this, ExtendVal$atmosphere$2.INSTANCE);
    private final qjg categoryLevelLeaf$delegate = new qjg(null, this, ExtendVal$categoryLevelLeaf$2.INSTANCE);
    private final qjg enableSKU$delegate = new qjg(null, this, ExtendVal$enableSKU$2.INSTANCE);
    private final qjg categoryLevelOneName$delegate = new qjg(null, this, ExtendVal$categoryLevelOneName$2.INSTANCE);
    private final qjg customizedItemRights$delegate = new qjg(null, this, ExtendVal$customizedItemRights$2.INSTANCE);
    private final qjg benefitCodes$delegate = new qjg(null, this, ExtendVal$benefitCodes$2.INSTANCE);
    private final qjg isBestGoods$delegate = new qjg(null, this, ExtendVal$isBestGoods$2.INSTANCE);
    private final qjg tabType$delegate = new qjg(null, this, ExtendVal$tabType$2.INSTANCE);
    private final qjg checkResult$delegate = new qjg(null, this, ExtendVal$checkResult$2.INSTANCE);
    private final qjg hasTaoInsurance$delegate = new qjg(null, this, ExtendVal$hasTaoInsurance$2.INSTANCE);
    private final qjg rightType$delegate = new qjg(null, this, ExtendVal$rightType$2.INSTANCE);
    private final qjg playUrl$delegate = new qjg(null, this, ExtendVal$playUrl$2.INSTANCE);
    private final qjg itemCategoryIdList$delegate = new qjg(null, this, ExtendVal$itemCategoryIdList$2.INSTANCE);
    private final qjg sellerId$delegate = new qjg(null, this, ExtendVal$sellerId$2.INSTANCE);
    private final qjg subTitle$delegate = new qjg(null, this, ExtendVal$subTitle$2.INSTANCE);
    private final qjg tradeParams$delegate = new qjg(null, this, ExtendVal$tradeParams$2.INSTANCE);
    private final qjg itemIconOfficial$delegate = new qjg(null, this, ExtendVal$itemIconOfficial$2.INSTANCE);
    private final qjg categoryLevelOne$delegate = new qjg(null, this, ExtendVal$categoryLevelOne$2.INSTANCE);
    private final qjg commission$delegate = new qjg(null, this, ExtendVal$commission$2.INSTANCE);
    private final qjg categoryLevelLeafName$delegate = new qjg(null, this, ExtendVal$categoryLevelLeafName$2.INSTANCE);
    private final qjg trackInfo$delegate = new qjg(null, this, ExtendVal$trackInfo$2.INSTANCE);
    private final qjg itemUniqueKey$delegate = new qjg(null, this, ExtendVal$itemUniqueKey$2.INSTANCE);
    private final qjg timeVersion$delegate = new qjg(null, this, ExtendVal$timeVersion$2.INSTANCE);
    private final qjg business$delegate = new qjg(null, this, ExtendVal$business$2.INSTANCE);
    private final qjg isAnchorItem$delegate = new qjg(null, this, ExtendVal$isAnchorItem$2.INSTANCE);
    private final qjg timeMovingTypeInfo$delegate = new qjg(null, this, ExtendVal$timeMovingTypeInfo$2.INSTANCE);
    private final qjg itemTabSource$delegate = new qjg(null, this, ExtendVal$itemTabSource$2.INSTANCE);
    private final qjg closePopItem$delegate = new qjg(null, this, ExtendVal$closePopItem$2.INSTANCE);
    private final qjg right$delegate = new qjg(null, this, ExtendVal$right$2.INSTANCE);
    private final qjg anchorId$delegate = new qjg(null, this, ExtendVal$anchorId$2.INSTANCE);
    private final qjg timeMovingContentId$delegate = new qjg(null, this, ExtendVal$timeMovingContentId$2.INSTANCE);
    private final qjg liveId$delegate = new qjg(null, this, ExtendVal$liveId$2.INSTANCE);
    private final qjg goodsSubscribeStatus$delegate = new qjg(null, this, ExtendVal$goodsSubscribeStatus$2.INSTANCE);
    private final qjg isHide$delegate = new qjg(null, this, ExtendVal$isHide$2.INSTANCE);
    private final qjg itemExtendVal$delegate = new qjg(null, this, ExtendVal$itemExtendVal$2.INSTANCE);
    private final qjg isCpc$delegate = new qjg(null, this, ExtendVal$isCpc$2.INSTANCE);
    private final qjg isTop$delegate = new qjg(null, this, ExtendVal$isTop$2.INSTANCE);
    private final qjg needRecovery$delegate = new qjg(null, this, ExtendVal$needRecovery$2.INSTANCE);
    private final qjg benefitDesc$delegate = new qjg(null, this, ExtendVal$benefitDesc$2.INSTANCE);
    private final qjg yanxuanIcon$delegate = new qjg(null, this, ExtendVal$yanxuanIcon$2.INSTANCE);
    private final qjg pageSource$delegate = new qjg(null, this, ExtendVal$pageSource$2.INSTANCE);
    private final qjg time$delegate = new qjg(null, this, ExtendVal$time$2.INSTANCE);
    private final qjg userType$delegate = new qjg(null, this, ExtendVal$userType$2.INSTANCE);
    private final qjg timeMovingStampInfo$delegate = new qjg(null, this, ExtendVal$timeMovingStampInfo$2.INSTANCE);
    private final qjg timepoint$delegate = new qjg(null, this, ExtendVal$timepoint$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1004535999);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    public static /* synthetic */ Object ipc$super(ExtendVal extendVal, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/ExtendVal");
    }

    public final String getAnchorId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("308bb293", new Object[]{this});
        }
        return (String) this.anchorId$delegate.b(this, $$delegatedProperties[29]);
    }

    public final String getAtmosphere() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15a0b8e1", new Object[]{this});
        }
        return (String) this.atmosphere$delegate.b(this, $$delegatedProperties[0]);
    }

    public final String getBenefitCodes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54cfb7d4", new Object[]{this});
        }
        return (String) this.benefitCodes$delegate.b(this, $$delegatedProperties[5]);
    }

    public final String getBenefitDesc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e3b93a7", new Object[]{this});
        }
        return (String) this.benefitDesc$delegate.b(this, $$delegatedProperties[38]);
    }

    public final String getBusiness() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4431af83", new Object[]{this});
        }
        return (String) this.business$delegate.b(this, $$delegatedProperties[23]);
    }

    public final String getCategoryLevelLeaf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0053acb", new Object[]{this});
        }
        return (String) this.categoryLevelLeaf$delegate.b(this, $$delegatedProperties[1]);
    }

    public final String getCategoryLevelLeafName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c67c00", new Object[]{this});
        }
        return (String) this.categoryLevelLeafName$delegate.b(this, $$delegatedProperties[19]);
    }

    public final String getCategoryLevelOne() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4cff89e3", new Object[]{this});
        }
        return (String) this.categoryLevelOne$delegate.b(this, $$delegatedProperties[17]);
    }

    public final String getCategoryLevelOneName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c1537f18", new Object[]{this});
        }
        return (String) this.categoryLevelOneName$delegate.b(this, $$delegatedProperties[3]);
    }

    public final String getCheckResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b02644a", new Object[]{this});
        }
        return (String) this.checkResult$delegate.b(this, $$delegatedProperties[8]);
    }

    public final String getClosePopItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b0329d7", new Object[]{this});
        }
        return (String) this.closePopItem$delegate.b(this, $$delegatedProperties[27]);
    }

    public final String getCommission() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d0a80b8", new Object[]{this});
        }
        return (String) this.commission$delegate.b(this, $$delegatedProperties[18]);
    }

    public final String getCustomizedItemRights() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f71a96f8", new Object[]{this});
        }
        return (String) this.customizedItemRights$delegate.b(this, $$delegatedProperties[4]);
    }

    public final String getEnableSKU() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b6e40b95", new Object[]{this});
        }
        return (String) this.enableSKU$delegate.b(this, $$delegatedProperties[2]);
    }

    public final String getGoodsSubscribeStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("74e7185d", new Object[]{this});
        }
        return (String) this.goodsSubscribeStatus$delegate.b(this, $$delegatedProperties[32]);
    }

    public final String getHasTaoInsurance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("40b5319d", new Object[]{this});
        }
        return (String) this.hasTaoInsurance$delegate.b(this, $$delegatedProperties[9]);
    }

    public final String getItemCategoryIdList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6eed019", new Object[]{this});
        }
        return (String) this.itemCategoryIdList$delegate.b(this, $$delegatedProperties[12]);
    }

    public final String getItemExtendVal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("689be59b", new Object[]{this});
        }
        return (String) this.itemExtendVal$delegate.b(this, $$delegatedProperties[34]);
    }

    public final String getItemIconOfficial() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98e7e86c", new Object[]{this});
        }
        return (String) this.itemIconOfficial$delegate.b(this, $$delegatedProperties[16]);
    }

    public final String getItemTabSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("61be2d2", new Object[]{this});
        }
        return (String) this.itemTabSource$delegate.b(this, $$delegatedProperties[26]);
    }

    public final String getItemUniqueKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e7ba78d4", new Object[]{this});
        }
        return (String) this.itemUniqueKey$delegate.b(this, $$delegatedProperties[21]);
    }

    public final String getLiveId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d7740fc", new Object[]{this});
        }
        return (String) this.liveId$delegate.b(this, $$delegatedProperties[31]);
    }

    public final String getNeedRecovery() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8881d8d8", new Object[]{this});
        }
        return (String) this.needRecovery$delegate.b(this, $$delegatedProperties[37]);
    }

    public final String getPageSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e00ed779", new Object[]{this});
        }
        return (String) this.pageSource$delegate.b(this, $$delegatedProperties[40]);
    }

    public final String getPlayUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31feaeb4", new Object[]{this});
        }
        return (String) this.playUrl$delegate.b(this, $$delegatedProperties[11]);
    }

    public final String getRight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e6f2253", new Object[]{this});
        }
        return (String) this.right$delegate.b(this, $$delegatedProperties[28]);
    }

    public final String getRightType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bf3d5e39", new Object[]{this});
        }
        return (String) this.rightType$delegate.b(this, $$delegatedProperties[10]);
    }

    public final String getSellerId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("822c6289", new Object[]{this});
        }
        return (String) this.sellerId$delegate.b(this, $$delegatedProperties[13]);
    }

    public final String getSubTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d9c4664b", new Object[]{this});
        }
        return (String) this.subTitle$delegate.b(this, $$delegatedProperties[14]);
    }

    public final String getTabType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93d21060", new Object[]{this});
        }
        return (String) this.tabType$delegate.b(this, $$delegatedProperties[7]);
    }

    public final String getTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75382b96", new Object[]{this});
        }
        return (String) this.time$delegate.b(this, $$delegatedProperties[41]);
    }

    public final String getTimeMovingContentId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e365dd6", new Object[]{this});
        }
        return (String) this.timeMovingContentId$delegate.b(this, $$delegatedProperties[30]);
    }

    public final String getTimeMovingStampInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c6b3259", new Object[]{this});
        }
        return (String) this.timeMovingStampInfo$delegate.b(this, $$delegatedProperties[43]);
    }

    public final String getTimeMovingTypeInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c79e900", new Object[]{this});
        }
        return (String) this.timeMovingTypeInfo$delegate.b(this, $$delegatedProperties[25]);
    }

    public final String getTimeVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("226c2604", new Object[]{this});
        }
        return (String) this.timeVersion$delegate.b(this, $$delegatedProperties[22]);
    }

    public final String getTimepoint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("309650ec", new Object[]{this});
        }
        return (String) this.timepoint$delegate.b(this, $$delegatedProperties[44]);
    }

    public final String getTrackInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("396b2cf6", new Object[]{this});
        }
        return (String) this.trackInfo$delegate.b(this, $$delegatedProperties[20]);
    }

    public final String getTradeParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e5a78a5", new Object[]{this});
        }
        return (String) this.tradeParams$delegate.b(this, $$delegatedProperties[15]);
    }

    public final String getUserType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b04eebe", new Object[]{this});
        }
        return (String) this.userType$delegate.b(this, $$delegatedProperties[42]);
    }

    public final String getYanxuanIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da621e26", new Object[]{this});
        }
        return (String) this.yanxuanIcon$delegate.b(this, $$delegatedProperties[39]);
    }

    public final String isAnchorItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67ad607", new Object[]{this});
        }
        return (String) this.isAnchorItem$delegate.b(this, $$delegatedProperties[24]);
    }

    public final String isBestGoods() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("19a9ba31", new Object[]{this});
        }
        return (String) this.isBestGoods$delegate.b(this, $$delegatedProperties[6]);
    }

    public final String isCpc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4af37a6d", new Object[]{this});
        }
        return (String) this.isCpc$delegate.b(this, $$delegatedProperties[35]);
    }

    public final String isHide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a68724ed", new Object[]{this});
        }
        return (String) this.isHide$delegate.b(this, $$delegatedProperties[33]);
    }

    public final String isTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91a6d80e", new Object[]{this});
        }
        return (String) this.isTop$delegate.b(this, $$delegatedProperties[36]);
    }

    public final void setAnchorId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bc7fa43", new Object[]{this, str});
        } else {
            this.anchorId$delegate.a(this, $$delegatedProperties[29], str);
        }
    }

    public final void setAnchorItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a57447b", new Object[]{this, str});
        } else {
            this.isAnchorItem$delegate.a(this, $$delegatedProperties[24], str);
        }
    }

    public final void setAtmosphere(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155feab5", new Object[]{this, str});
        } else {
            this.atmosphere$delegate.a(this, $$delegatedProperties[0], str);
        }
    }

    public final void setBenefitCodes(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5c5b722", new Object[]{this, str});
        } else {
            this.benefitCodes$delegate.a(this, $$delegatedProperties[5], str);
        }
    }

    public final void setBenefitDesc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ee1017", new Object[]{this, str});
        } else {
            this.benefitDesc$delegate.a(this, $$delegatedProperties[38], str);
        }
    }

    public final void setBestGoods(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6648021", new Object[]{this, str});
        } else {
            this.isBestGoods$delegate.a(this, $$delegatedProperties[6], str);
        }
    }

    public final void setBusiness(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce19b53", new Object[]{this, str});
        } else {
            this.business$delegate.a(this, $$delegatedProperties[23], str);
        }
    }

    public final void setCategoryLevelLeaf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e212673", new Object[]{this, str});
        } else {
            this.categoryLevelLeaf$delegate.a(this, $$delegatedProperties[1], str);
        }
    }

    public final void setCategoryLevelLeafName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("286431de", new Object[]{this, str});
        } else {
            this.categoryLevelLeafName$delegate.a(this, $$delegatedProperties[19], str);
        }
    }

    public final void setCategoryLevelOne(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f3440f3", new Object[]{this, str});
        } else {
            this.categoryLevelOne$delegate.a(this, $$delegatedProperties[17], str);
        }
    }

    public final void setCategoryLevelOneName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d660c5e", new Object[]{this, str});
        } else {
            this.categoryLevelOneName$delegate.a(this, $$delegatedProperties[3], str);
        }
    }

    public final void setCheckResult(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d0153d4", new Object[]{this, str});
        } else {
            this.checkResult$delegate.a(this, $$delegatedProperties[8], str);
        }
    }

    public final void setClosePopItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c600857f", new Object[]{this, str});
        } else {
            this.closePopItem$delegate.a(this, $$delegatedProperties[27], str);
        }
    }

    public final void setCommission(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b2f1dbe", new Object[]{this, str});
        } else {
            this.commission$delegate.a(this, $$delegatedProperties[18], str);
        }
    }

    public final void setCpc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b7bd65", new Object[]{this, str});
        } else {
            this.isCpc$delegate.a(this, $$delegatedProperties[35], str);
        }
    }

    public final void setCustomizedItemRights(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d081f07e", new Object[]{this, str});
        } else {
            this.customizedItemRights$delegate.a(this, $$delegatedProperties[4], str);
        }
    }

    public final void setEnableSKU(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7db22e9", new Object[]{this, str});
        } else {
            this.enableSKU$delegate.a(this, $$delegatedProperties[2], str);
        }
    }

    public final void setGoodsSubscribeStatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c459bb9", new Object[]{this, str});
        } else {
            this.goodsSubscribeStatus$delegate.a(this, $$delegatedProperties[32], str);
        }
    }

    public final void setHasTaoInsurance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9018d6e1", new Object[]{this, str});
        } else {
            this.hasTaoInsurance$delegate.a(this, $$delegatedProperties[9], str);
        }
    }

    public final void setHide(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d40e9c55", new Object[]{this, str});
        } else {
            this.isHide$delegate.a(this, $$delegatedProperties[33], str);
        }
    }

    public final void setItemCategoryIdList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3abcee7d", new Object[]{this, str});
        } else {
            this.itemCategoryIdList$delegate.a(this, $$delegatedProperties[12], str);
        }
    }

    public final void setItemExtendVal(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df80afa3", new Object[]{this, str});
        } else {
            this.itemExtendVal$delegate.a(this, $$delegatedProperties[34], str);
        }
    }

    public final void setItemIconOfficial(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c057b38a", new Object[]{this, str});
        } else {
            this.itemIconOfficial$delegate.a(this, $$delegatedProperties[16], str);
        }
    }

    public final void setItemTabSource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f200594c", new Object[]{this, str});
        } else {
            this.itemTabSource$delegate.a(this, $$delegatedProperties[26], str);
        }
    }

    public final void setItemUniqueKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4434838a", new Object[]{this, str});
        } else {
            this.itemUniqueKey$delegate.a(this, $$delegatedProperties[21], str);
        }
    }

    public final void setLiveId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("111acbfa", new Object[]{this, str});
        } else {
            this.liveId$delegate.a(this, $$delegatedProperties[31], str);
        }
    }

    public final void setNeedRecovery(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1857b69e", new Object[]{this, str});
        } else {
            this.needRecovery$delegate.a(this, $$delegatedProperties[37], str);
        }
    }

    public final void setPageSource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98b59f1d", new Object[]{this, str});
        } else {
            this.pageSource$delegate.a(this, $$delegatedProperties[40], str);
        }
    }

    public final void setPlayUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14dab0aa", new Object[]{this, str});
        } else {
            this.playUrl$delegate.a(this, $$delegatedProperties[11], str);
        }
    }

    public final void setRight(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc4dbdeb", new Object[]{this, str});
        } else {
            this.right$delegate.a(this, $$delegatedProperties[28], str);
        }
    }

    public final void setRightType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaac24c5", new Object[]{this, str});
        } else {
            this.rightType$delegate.a(this, $$delegatedProperties[10], str);
        }
    }

    public final void setSellerId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e3d490d", new Object[]{this, str});
        } else {
            this.sellerId$delegate.a(this, $$delegatedProperties[13], str);
        }
    }

    public final void setSubTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9a5bd8b", new Object[]{this, str});
        } else {
            this.subTitle$delegate.a(this, $$delegatedProperties[14], str);
        }
    }

    public final void setTabType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed73847e", new Object[]{this, str});
        } else {
            this.tabType$delegate.a(this, $$delegatedProperties[7], str);
        }
    }

    public final void setTime(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c64c87a0", new Object[]{this, str});
        } else {
            this.time$delegate.a(this, $$delegatedProperties[41], str);
        }
    }

    public final void setTimeMovingContentId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("806ad7c8", new Object[]{this, str});
        } else {
            this.timeMovingContentId$delegate.a(this, $$delegatedProperties[30], str);
        }
    }

    public final void setTimeMovingStampInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8d093a5", new Object[]{this, str});
        } else {
            this.timeMovingStampInfo$delegate.a(this, $$delegatedProperties[43], str);
        }
    }

    public final void setTimeMovingTypeInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9694f276", new Object[]{this, str});
        } else {
            this.timeMovingTypeInfo$delegate.a(this, $$delegatedProperties[25], str);
        }
    }

    public final void setTimeVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42cfc95a", new Object[]{this, str});
        } else {
            this.timeVersion$delegate.a(this, $$delegatedProperties[22], str);
        }
    }

    public final void setTimepoint(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64718872", new Object[]{this, str});
        } else {
            this.timepoint$delegate.a(this, $$delegatedProperties[44], str);
        }
    }

    public final void setTop(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("927013e4", new Object[]{this, str});
        } else {
            this.isTop$delegate.a(this, $$delegatedProperties[36], str);
        }
    }

    public final void setTrackInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76382da8", new Object[]{this, str});
        } else {
            this.trackInfo$delegate.a(this, $$delegatedProperties[20], str);
        }
    }

    public final void setTradeParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44abcad9", new Object[]{this, str});
        } else {
            this.tradeParams$delegate.a(this, $$delegatedProperties[15], str);
        }
    }

    public final void setUserType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80764378", new Object[]{this, str});
        } else {
            this.userType$delegate.a(this, $$delegatedProperties[42], str);
        }
    }

    public final void setYanxuanIcon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8998d578", new Object[]{this, str});
        } else {
            this.yanxuanIcon$delegate.a(this, $$delegatedProperties[39], str);
        }
    }

    static {
        t2o.a(1004535998);
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(ExtendVal.class, "atmosphere", "getAtmosphere()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl);
        MutablePropertyReference1Impl mutablePropertyReference1Impl2 = new MutablePropertyReference1Impl(ExtendVal.class, "categoryLevelLeaf", "getCategoryLevelLeaf()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl2);
        MutablePropertyReference1Impl mutablePropertyReference1Impl3 = new MutablePropertyReference1Impl(ExtendVal.class, "enableSKU", "getEnableSKU()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl3);
        MutablePropertyReference1Impl mutablePropertyReference1Impl4 = new MutablePropertyReference1Impl(ExtendVal.class, "categoryLevelOneName", "getCategoryLevelOneName()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl4);
        MutablePropertyReference1Impl mutablePropertyReference1Impl5 = new MutablePropertyReference1Impl(ExtendVal.class, "customizedItemRights", "getCustomizedItemRights()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl5);
        MutablePropertyReference1Impl mutablePropertyReference1Impl6 = new MutablePropertyReference1Impl(ExtendVal.class, "benefitCodes", "getBenefitCodes()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl6);
        MutablePropertyReference1Impl mutablePropertyReference1Impl7 = new MutablePropertyReference1Impl(ExtendVal.class, "isBestGoods", "isBestGoods()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl7);
        MutablePropertyReference1Impl mutablePropertyReference1Impl8 = new MutablePropertyReference1Impl(ExtendVal.class, "tabType", "getTabType()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl8);
        MutablePropertyReference1Impl mutablePropertyReference1Impl9 = new MutablePropertyReference1Impl(ExtendVal.class, "checkResult", "getCheckResult()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl9);
        MutablePropertyReference1Impl mutablePropertyReference1Impl10 = new MutablePropertyReference1Impl(ExtendVal.class, "hasTaoInsurance", "getHasTaoInsurance()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl10);
        MutablePropertyReference1Impl mutablePropertyReference1Impl11 = new MutablePropertyReference1Impl(ExtendVal.class, "rightType", "getRightType()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl11);
        MutablePropertyReference1Impl mutablePropertyReference1Impl12 = new MutablePropertyReference1Impl(ExtendVal.class, yj4.PARAM_PLAY_URL, "getPlayUrl()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl12);
        MutablePropertyReference1Impl mutablePropertyReference1Impl13 = new MutablePropertyReference1Impl(ExtendVal.class, "itemCategoryIdList", "getItemCategoryIdList()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl13);
        MutablePropertyReference1Impl mutablePropertyReference1Impl14 = new MutablePropertyReference1Impl(ExtendVal.class, "sellerId", "getSellerId()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl14);
        MutablePropertyReference1Impl mutablePropertyReference1Impl15 = new MutablePropertyReference1Impl(ExtendVal.class, MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE, "getSubTitle()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl15);
        MutablePropertyReference1Impl mutablePropertyReference1Impl16 = new MutablePropertyReference1Impl(ExtendVal.class, "tradeParams", "getTradeParams()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl16);
        MutablePropertyReference1Impl mutablePropertyReference1Impl17 = new MutablePropertyReference1Impl(ExtendVal.class, "itemIconOfficial", "getItemIconOfficial()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl17);
        MutablePropertyReference1Impl mutablePropertyReference1Impl18 = new MutablePropertyReference1Impl(ExtendVal.class, "categoryLevelOne", "getCategoryLevelOne()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl18);
        MutablePropertyReference1Impl mutablePropertyReference1Impl19 = new MutablePropertyReference1Impl(ExtendVal.class, "commission", "getCommission()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl19);
        MutablePropertyReference1Impl mutablePropertyReference1Impl20 = new MutablePropertyReference1Impl(ExtendVal.class, "categoryLevelLeafName", "getCategoryLevelLeafName()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl20);
        MutablePropertyReference1Impl mutablePropertyReference1Impl21 = new MutablePropertyReference1Impl(ExtendVal.class, "trackInfo", "getTrackInfo()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl21);
        MutablePropertyReference1Impl mutablePropertyReference1Impl22 = new MutablePropertyReference1Impl(ExtendVal.class, "itemUniqueKey", "getItemUniqueKey()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl22);
        MutablePropertyReference1Impl mutablePropertyReference1Impl23 = new MutablePropertyReference1Impl(ExtendVal.class, "timeVersion", "getTimeVersion()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl23);
        MutablePropertyReference1Impl mutablePropertyReference1Impl24 = new MutablePropertyReference1Impl(ExtendVal.class, "business", "getBusiness()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl24);
        MutablePropertyReference1Impl mutablePropertyReference1Impl25 = new MutablePropertyReference1Impl(ExtendVal.class, "isAnchorItem", "isAnchorItem()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl25);
        MutablePropertyReference1Impl mutablePropertyReference1Impl26 = new MutablePropertyReference1Impl(ExtendVal.class, "timeMovingTypeInfo", "getTimeMovingTypeInfo()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl26);
        MutablePropertyReference1Impl mutablePropertyReference1Impl27 = new MutablePropertyReference1Impl(ExtendVal.class, "itemTabSource", "getItemTabSource()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl27);
        MutablePropertyReference1Impl mutablePropertyReference1Impl28 = new MutablePropertyReference1Impl(ExtendVal.class, "closePopItem", "getClosePopItem()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl28);
        MutablePropertyReference1Impl mutablePropertyReference1Impl29 = new MutablePropertyReference1Impl(ExtendVal.class, "right", "getRight()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl29);
        MutablePropertyReference1Impl mutablePropertyReference1Impl30 = new MutablePropertyReference1Impl(ExtendVal.class, RequestConfig.KEY_ANCHOR_ID, "getAnchorId()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl30);
        MutablePropertyReference1Impl mutablePropertyReference1Impl31 = new MutablePropertyReference1Impl(ExtendVal.class, "timeMovingContentId", "getTimeMovingContentId()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl31);
        MutablePropertyReference1Impl mutablePropertyReference1Impl32 = new MutablePropertyReference1Impl(ExtendVal.class, "liveId", "getLiveId()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl32);
        MutablePropertyReference1Impl mutablePropertyReference1Impl33 = new MutablePropertyReference1Impl(ExtendVal.class, "goodsSubscribeStatus", "getGoodsSubscribeStatus()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl33);
        MutablePropertyReference1Impl mutablePropertyReference1Impl34 = new MutablePropertyReference1Impl(ExtendVal.class, "isHide", "isHide()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl34);
        MutablePropertyReference1Impl mutablePropertyReference1Impl35 = new MutablePropertyReference1Impl(ExtendVal.class, "itemExtendVal", "getItemExtendVal()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl35);
        MutablePropertyReference1Impl mutablePropertyReference1Impl36 = new MutablePropertyReference1Impl(ExtendVal.class, "isCpc", "isCpc()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl36);
        MutablePropertyReference1Impl mutablePropertyReference1Impl37 = new MutablePropertyReference1Impl(ExtendVal.class, "isTop", "isTop()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl37);
        MutablePropertyReference1Impl mutablePropertyReference1Impl38 = new MutablePropertyReference1Impl(ExtendVal.class, "needRecovery", "getNeedRecovery()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl38);
        MutablePropertyReference1Impl mutablePropertyReference1Impl39 = new MutablePropertyReference1Impl(ExtendVal.class, "benefitDesc", "getBenefitDesc()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl39);
        MutablePropertyReference1Impl mutablePropertyReference1Impl40 = new MutablePropertyReference1Impl(ExtendVal.class, "yanxuanIcon", "getYanxuanIcon()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl40);
        MutablePropertyReference1Impl mutablePropertyReference1Impl41 = new MutablePropertyReference1Impl(ExtendVal.class, "pageSource", "getPageSource()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl41);
        MutablePropertyReference1Impl mutablePropertyReference1Impl42 = new MutablePropertyReference1Impl(ExtendVal.class, "time", "getTime()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl42);
        MutablePropertyReference1Impl mutablePropertyReference1Impl43 = new MutablePropertyReference1Impl(ExtendVal.class, mh1.PRD_USER_TYPE, "getUserType()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl43);
        MutablePropertyReference1Impl mutablePropertyReference1Impl44 = new MutablePropertyReference1Impl(ExtendVal.class, "timeMovingStampInfo", "getTimeMovingStampInfo()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl44);
        MutablePropertyReference1Impl mutablePropertyReference1Impl45 = new MutablePropertyReference1Impl(ExtendVal.class, "timepoint", "getTimepoint()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl45);
        $$delegatedProperties = new a0g[]{mutablePropertyReference1Impl, mutablePropertyReference1Impl2, mutablePropertyReference1Impl3, mutablePropertyReference1Impl4, mutablePropertyReference1Impl5, mutablePropertyReference1Impl6, mutablePropertyReference1Impl7, mutablePropertyReference1Impl8, mutablePropertyReference1Impl9, mutablePropertyReference1Impl10, mutablePropertyReference1Impl11, mutablePropertyReference1Impl12, mutablePropertyReference1Impl13, mutablePropertyReference1Impl14, mutablePropertyReference1Impl15, mutablePropertyReference1Impl16, mutablePropertyReference1Impl17, mutablePropertyReference1Impl18, mutablePropertyReference1Impl19, mutablePropertyReference1Impl20, mutablePropertyReference1Impl21, mutablePropertyReference1Impl22, mutablePropertyReference1Impl23, mutablePropertyReference1Impl24, mutablePropertyReference1Impl25, mutablePropertyReference1Impl26, mutablePropertyReference1Impl27, mutablePropertyReference1Impl28, mutablePropertyReference1Impl29, mutablePropertyReference1Impl30, mutablePropertyReference1Impl31, mutablePropertyReference1Impl32, mutablePropertyReference1Impl33, mutablePropertyReference1Impl34, mutablePropertyReference1Impl35, mutablePropertyReference1Impl36, mutablePropertyReference1Impl37, mutablePropertyReference1Impl38, mutablePropertyReference1Impl39, mutablePropertyReference1Impl40, mutablePropertyReference1Impl41, mutablePropertyReference1Impl42, mutablePropertyReference1Impl43, mutablePropertyReference1Impl44, mutablePropertyReference1Impl45};
    }
}
