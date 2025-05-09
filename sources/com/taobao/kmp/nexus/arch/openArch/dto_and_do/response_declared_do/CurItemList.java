package com.taobao.kmp.nexus.arch.openArch.dto_and_do.response_declared_do;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import org.android.agoo.common.AgooConstants;
import tb.a07;
import tb.a0g;
import tb.dun;
import tb.mzf;
import tb.qjg;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0001\u0018\u0000 \u0089\u00012\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0002\u008a\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005R/\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR/\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR/\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR/\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR/\u0010\u001e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\rR/\u0010%\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u001f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\t\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R/\u0010)\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\t\u001a\u0004\b'\u0010\u000b\"\u0004\b(\u0010\rR/\u0010-\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\t\u001a\u0004\b+\u0010\u000b\"\u0004\b,\u0010\rR/\u00101\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010\t\u001a\u0004\b/\u0010\u000b\"\u0004\b0\u0010\rR/\u00105\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010\t\u001a\u0004\b3\u0010\u000b\"\u0004\b4\u0010\rR/\u00109\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b6\u0010\t\u001a\u0004\b7\u0010\u000b\"\u0004\b8\u0010\rR/\u0010;\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010\t\u001a\u0004\b;\u0010\u000b\"\u0004\b<\u0010\rR/\u0010C\u001a\u0004\u0018\u00010=2\b\u0010\u0007\u001a\u0004\u0018\u00010=8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b>\u0010\t\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR/\u0010G\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010\t\u001a\u0004\bE\u0010\u000b\"\u0004\bF\u0010\rR/\u0010K\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010\t\u001a\u0004\bI\u0010\u000b\"\u0004\bJ\u0010\rR/\u0010O\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bL\u0010\t\u001a\u0004\bM\u0010\u000b\"\u0004\bN\u0010\rR/\u0010S\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bP\u0010\t\u001a\u0004\bQ\u0010\u000b\"\u0004\bR\u0010\rR/\u0010W\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bT\u0010\t\u001a\u0004\bU\u0010\u000b\"\u0004\bV\u0010\rR/\u0010[\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bX\u0010\t\u001a\u0004\bY\u0010\u000b\"\u0004\bZ\u0010\rR/\u0010_\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\\\u0010\t\u001a\u0004\b]\u0010\u000b\"\u0004\b^\u0010\rR/\u0010c\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b`\u0010\t\u001a\u0004\ba\u0010\u000b\"\u0004\bb\u0010\rR/\u0010j\u001a\u0004\u0018\u00010d2\b\u0010\u0007\u001a\u0004\u0018\u00010d8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\be\u0010\t\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR/\u0010q\u001a\u0004\u0018\u00010k2\b\u0010\u0007\u001a\u0004\u0018\u00010k8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bl\u0010\t\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR/\u0010u\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\br\u0010\t\u001a\u0004\bs\u0010\u000b\"\u0004\bt\u0010\rR/\u0010|\u001a\u0004\u0018\u00010v2\b\u0010\u0007\u001a\u0004\u0018\u00010v8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bw\u0010\t\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R0\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b}\u0010\t\u001a\u0004\b~\u0010\u000b\"\u0004\b\u007f\u0010\rR3\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010\t\u001a\u0005\b\u0082\u0001\u0010\u000b\"\u0005\b\u0083\u0001\u0010\rR3\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010\t\u001a\u0005\b\u0086\u0001\u0010\u000b\"\u0005\b\u0087\u0001\u0010\r¨\u0006\u008b\u0001"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/CurItemList;", "Ltb/mzf;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "<init>", "()V", "", "<set-?>", "appPromActive$delegate", "Ltb/qjg;", "getAppPromActive", "()Ljava/lang/String;", "setAppPromActive", "(Ljava/lang/String;)V", "appPromActive", "bulk$delegate", "getBulk", "setBulk", "bulk", "buyCount$delegate", "getBuyCount", "setBuyCount", "buyCount", "createTime$delegate", "getCreateTime", "setCreateTime", "createTime", "duplicate$delegate", "getDuplicate", "setDuplicate", AgooConstants.MESSAGE_DUPLICATE, "Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/ExtendVal;", "extendVal$delegate", "getExtendVal", "()Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/ExtendVal;", "setExtendVal", "(Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/ExtendVal;)V", "extendVal", "favored$delegate", "getFavored", "setFavored", "favored", "goodsIndex$delegate", "getGoodsIndex", "setGoodsIndex", "goodsIndex", "groupNum$delegate", "getGroupNum", "setGroupNum", "groupNum", "hasAppProm$delegate", "getHasAppProm", "setHasAppProm", "hasAppProm", "hasDiscount$delegate", "getHasDiscount", "setHasDiscount", "hasDiscount", "isCpc$delegate", "isCpc", "setCpc", "Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/ItemExtData;", "itemExtData$delegate", "getItemExtData", "()Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/ItemExtData;", "setItemExtData", "(Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/ItemExtData;)V", "itemExtData", "itemH5TaokeUrl$delegate", "getItemH5TaokeUrl", "setItemH5TaokeUrl", "itemH5TaokeUrl", "itemIcon$delegate", "getItemIcon", "setItemIcon", "itemIcon", "itemId$delegate", "getItemId", "setItemId", "itemId", "itemName$delegate", "getItemName", "setItemName", "itemName", "itemPic$delegate", "getItemPic", "setItemPic", "itemPic", "itemPrice$delegate", "getItemPrice", "setItemPrice", "itemPrice", "itemUrl$delegate", "getItemUrl", "setItemUrl", "itemUrl", "liveId$delegate", "getLiveId", "setLiveId", "liveId", "Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/LiveItemPrice;", "liveItemPrice$delegate", "getLiveItemPrice", "()Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/LiveItemPrice;", "setLiveItemPrice", "(Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/LiveItemPrice;)V", "liveItemPrice", "Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/LiveItemStatusData;", "liveItemStatusData$delegate", "getLiveItemStatusData", "()Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/LiveItemStatusData;", "setLiveItemStatusData", "(Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/LiveItemStatusData;)V", "liveItemStatusData", "orderVal$delegate", "getOrderVal", "setOrderVal", "orderVal", "Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/PersonalityData;", "personalityData$delegate", "getPersonalityData", "()Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/PersonalityData;", "setPersonalityData", "(Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/PersonalityData;)V", "personalityData", "recommendItem$delegate", "getRecommendItem", "setRecommendItem", "recommendItem", "sellerId$delegate", "getSellerId", "setSellerId", "sellerId", "topTime$delegate", "getTopTime", "setTopTime", "topTime", "Companion", "a", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class CurItemList extends mzf implements Serializable {
    public static final /* synthetic */ a0g<Object>[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private final qjg appPromActive$delegate = new qjg(null, this, CurItemList$appPromActive$2.INSTANCE);
    private final qjg bulk$delegate = new qjg(null, this, CurItemList$bulk$2.INSTANCE);
    private final qjg buyCount$delegate = new qjg(null, this, CurItemList$buyCount$2.INSTANCE);
    private final qjg createTime$delegate = new qjg(null, this, CurItemList$createTime$2.INSTANCE);
    private final qjg duplicate$delegate = new qjg(null, this, CurItemList$duplicate$2.INSTANCE);
    private final qjg extendVal$delegate = new qjg(null, this, CurItemList$extendVal$2.INSTANCE);
    private final qjg favored$delegate = new qjg(null, this, CurItemList$favored$2.INSTANCE);
    private final qjg goodsIndex$delegate = new qjg(null, this, CurItemList$goodsIndex$2.INSTANCE);
    private final qjg groupNum$delegate = new qjg(null, this, CurItemList$groupNum$2.INSTANCE);
    private final qjg hasAppProm$delegate = new qjg(null, this, CurItemList$hasAppProm$2.INSTANCE);
    private final qjg hasDiscount$delegate = new qjg(null, this, CurItemList$hasDiscount$2.INSTANCE);
    private final qjg isCpc$delegate = new qjg(null, this, CurItemList$isCpc$2.INSTANCE);
    private final qjg itemExtData$delegate = new qjg(null, this, CurItemList$itemExtData$2.INSTANCE);
    private final qjg itemH5TaokeUrl$delegate = new qjg(null, this, CurItemList$itemH5TaokeUrl$2.INSTANCE);
    private final qjg itemIcon$delegate = new qjg(null, this, CurItemList$itemIcon$2.INSTANCE);
    private final qjg itemId$delegate = new qjg(null, this, CurItemList$itemId$2.INSTANCE);
    private final qjg itemName$delegate = new qjg(null, this, CurItemList$itemName$2.INSTANCE);
    private final qjg itemPic$delegate = new qjg(null, this, CurItemList$itemPic$2.INSTANCE);
    private final qjg itemPrice$delegate = new qjg(null, this, CurItemList$itemPrice$2.INSTANCE);
    private final qjg itemUrl$delegate = new qjg(null, this, CurItemList$itemUrl$2.INSTANCE);
    private final qjg liveId$delegate = new qjg(null, this, CurItemList$liveId$2.INSTANCE);
    private final qjg liveItemPrice$delegate = new qjg(null, this, CurItemList$liveItemPrice$2.INSTANCE);
    private final qjg liveItemStatusData$delegate = new qjg(null, this, CurItemList$liveItemStatusData$2.INSTANCE);
    private final qjg orderVal$delegate = new qjg(null, this, CurItemList$orderVal$2.INSTANCE);
    private final qjg personalityData$delegate = new qjg(null, this, CurItemList$personalityData$2.INSTANCE);
    private final qjg recommendItem$delegate = new qjg(null, this, CurItemList$recommendItem$2.INSTANCE);
    private final qjg sellerId$delegate = new qjg(null, this, CurItemList$sellerId$2.INSTANCE);
    private final qjg topTime$delegate = new qjg(null, this, CurItemList$topTime$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1004535956);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    public static /* synthetic */ Object ipc$super(CurItemList curItemList, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/CurItemList");
    }

    public final String getAppPromActive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5495c7c8", new Object[]{this});
        }
        return (String) this.appPromActive$delegate.b(this, $$delegatedProperties[0]);
    }

    public final String getBulk() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6d63a71", new Object[]{this});
        }
        return (String) this.bulk$delegate.b(this, $$delegatedProperties[1]);
    }

    public final String getBuyCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("adacb4ba", new Object[]{this});
        }
        return (String) this.buyCount$delegate.b(this, $$delegatedProperties[2]);
    }

    public final String getCreateTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("166e1e7a", new Object[]{this});
        }
        return (String) this.createTime$delegate.b(this, $$delegatedProperties[3]);
    }

    public final String getDuplicate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("354727c4", new Object[]{this});
        }
        return (String) this.duplicate$delegate.b(this, $$delegatedProperties[4]);
    }

    public final ExtendVal getExtendVal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExtendVal) ipChange.ipc$dispatch("7dbd3701", new Object[]{this});
        }
        return (ExtendVal) this.extendVal$delegate.b(this, $$delegatedProperties[5]);
    }

    public final String getFavored() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e3c40e32", new Object[]{this});
        }
        return (String) this.favored$delegate.b(this, $$delegatedProperties[6]);
    }

    public final String getGoodsIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("95c72f27", new Object[]{this});
        }
        return (String) this.goodsIndex$delegate.b(this, $$delegatedProperties[7]);
    }

    public final String getGroupNum() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42b7491c", new Object[]{this});
        }
        return (String) this.groupNum$delegate.b(this, $$delegatedProperties[8]);
    }

    public final String getHasAppProm() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5eb05dfc", new Object[]{this});
        }
        return (String) this.hasAppProm$delegate.b(this, $$delegatedProperties[9]);
    }

    public final String getHasDiscount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c1b5354", new Object[]{this});
        }
        return (String) this.hasDiscount$delegate.b(this, $$delegatedProperties[10]);
    }

    public final ItemExtData getItemExtData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemExtData) ipChange.ipc$dispatch("5a664e5f", new Object[]{this});
        }
        return (ItemExtData) this.itemExtData$delegate.b(this, $$delegatedProperties[12]);
    }

    public final String getItemH5TaokeUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f286f0", new Object[]{this});
        }
        return (String) this.itemH5TaokeUrl$delegate.b(this, $$delegatedProperties[13]);
    }

    public final String getItemIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d250097", new Object[]{this});
        }
        return (String) this.itemIcon$delegate.b(this, $$delegatedProperties[14]);
    }

    public final String getItemId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this});
        }
        return (String) this.itemId$delegate.b(this, $$delegatedProperties[15]);
    }

    public final String getItemName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cafca1c5", new Object[]{this});
        }
        return (String) this.itemName$delegate.b(this, $$delegatedProperties[16]);
    }

    public final String getItemPic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f977f458", new Object[]{this});
        }
        return (String) this.itemPic$delegate.b(this, $$delegatedProperties[17]);
    }

    public final String getItemPrice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73090bb9", new Object[]{this});
        }
        return (String) this.itemPrice$delegate.b(this, $$delegatedProperties[18]);
    }

    public final String getItemUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3bf1b193", new Object[]{this});
        }
        return (String) this.itemUrl$delegate.b(this, $$delegatedProperties[19]);
    }

    public final String getLiveId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d7740fc", new Object[]{this});
        }
        return (String) this.liveId$delegate.b(this, $$delegatedProperties[20]);
    }

    public final LiveItemPrice getLiveItemPrice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveItemPrice) ipChange.ipc$dispatch("f1a3343b", new Object[]{this});
        }
        return (LiveItemPrice) this.liveItemPrice$delegate.b(this, $$delegatedProperties[21]);
    }

    public final LiveItemStatusData getLiveItemStatusData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveItemStatusData) ipChange.ipc$dispatch("a8f951b3", new Object[]{this});
        }
        return (LiveItemStatusData) this.liveItemStatusData$delegate.b(this, $$delegatedProperties[22]);
    }

    public final String getOrderVal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f2ce030", new Object[]{this});
        }
        return (String) this.orderVal$delegate.b(this, $$delegatedProperties[23]);
    }

    public final PersonalityData getPersonalityData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PersonalityData) ipChange.ipc$dispatch("be77249f", new Object[]{this});
        }
        return (PersonalityData) this.personalityData$delegate.b(this, $$delegatedProperties[24]);
    }

    public final String getRecommendItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8927e60", new Object[]{this});
        }
        return (String) this.recommendItem$delegate.b(this, $$delegatedProperties[25]);
    }

    public final String getSellerId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("822c6289", new Object[]{this});
        }
        return (String) this.sellerId$delegate.b(this, $$delegatedProperties[26]);
    }

    public final String getTopTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3175cced", new Object[]{this});
        }
        return (String) this.topTime$delegate.b(this, $$delegatedProperties[27]);
    }

    public final String isCpc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4af37a6d", new Object[]{this});
        }
        return (String) this.isCpc$delegate.b(this, $$delegatedProperties[11]);
    }

    public final void setAppPromActive(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72c31316", new Object[]{this, str});
        } else {
            this.appPromActive$delegate.a(this, $$delegatedProperties[0], str);
        }
    }

    public final void setBulk(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98705425", new Object[]{this, str});
        } else {
            this.bulk$delegate.a(this, $$delegatedProperties[1], str);
        }
    }

    public final void setBuyCount(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92c73cfc", new Object[]{this, str});
        } else {
            this.buyCount$delegate.a(this, $$delegatedProperties[2], str);
        }
    }

    public final void setCpc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b7bd65", new Object[]{this, str});
        } else {
            this.isCpc$delegate.a(this, $$delegatedProperties[11], str);
        }
    }

    public final void setCreateTime(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e3f383c", new Object[]{this, str});
        } else {
            this.createTime$delegate.a(this, $$delegatedProperties[3], str);
        }
    }

    public final void setDuplicate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5db8c9a", new Object[]{this, str});
        } else {
            this.duplicate$delegate.a(this, $$delegatedProperties[4], str);
        }
    }

    public final void setExtendVal(ExtendVal extendVal) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec3bccf", new Object[]{this, extendVal});
        } else {
            this.extendVal$delegate.a(this, $$delegatedProperties[5], extendVal);
        }
    }

    public final void setFavored(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bc140ec", new Object[]{this, str});
        } else {
            this.favored$delegate.a(this, $$delegatedProperties[6], str);
        }
    }

    public final void setGoodsIndex(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a083d2f", new Object[]{this, str});
        } else {
            this.goodsIndex$delegate.a(this, $$delegatedProperties[7], str);
        }
    }

    public final void setGroupNum(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f0f34da", new Object[]{this, str});
        } else {
            this.groupNum$delegate.a(this, $$delegatedProperties[8], str);
        }
    }

    public final void setHasAppProm(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee44e8fa", new Object[]{this, str});
        } else {
            this.hasAppProm$delegate.a(this, $$delegatedProperties[9], str);
        }
    }

    public final void setHasDiscount(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f06460a", new Object[]{this, str});
        } else {
            this.hasDiscount$delegate.a(this, $$delegatedProperties[10], str);
        }
    }

    public final void setItemExtData(ItemExtData itemExtData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ae195af", new Object[]{this, itemExtData});
        } else {
            this.itemExtData$delegate.a(this, $$delegatedProperties[12], itemExtData);
        }
    }

    public final void setItemH5TaokeUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e82a7886", new Object[]{this, str});
        } else {
            this.itemH5TaokeUrl$delegate.a(this, $$delegatedProperties[13], str);
        }
    }

    public final void setItemIcon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2586cbf", new Object[]{this, str});
        } else {
            this.itemIcon$delegate.a(this, $$delegatedProperties[14], str);
        }
    }

    public final void setItemId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7375121", new Object[]{this, str});
        } else {
            this.itemId$delegate.a(this, $$delegatedProperties[15], str);
        }
    }

    public final void setItemName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f74f151", new Object[]{this, str});
        } else {
            this.itemName$delegate.a(this, $$delegatedProperties[16], str);
        }
    }

    public final void setItemPic(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c8a1f86", new Object[]{this, str});
        } else {
            this.itemPic$delegate.a(this, $$delegatedProperties[17], str);
        }
    }

    public final void setItemPrice(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70562745", new Object[]{this, str});
        } else {
            this.itemPrice$delegate.a(this, $$delegatedProperties[18], str);
        }
    }

    public final void setItemUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("494809ab", new Object[]{this, str});
        } else {
            this.itemUrl$delegate.a(this, $$delegatedProperties[19], str);
        }
    }

    public final void setLiveId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("111acbfa", new Object[]{this, str});
        } else {
            this.liveId$delegate.a(this, $$delegatedProperties[20], str);
        }
    }

    public final void setLiveItemPrice(LiveItemPrice liveItemPrice) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce6b7faf", new Object[]{this, liveItemPrice});
        } else {
            this.liveItemPrice$delegate.a(this, $$delegatedProperties[21], liveItemPrice);
        }
    }

    public final void setLiveItemStatusData(LiveItemStatusData liveItemStatusData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b178cf87", new Object[]{this, liveItemStatusData});
        } else {
            this.liveItemStatusData$delegate.a(this, $$delegatedProperties[22], liveItemStatusData);
        }
    }

    public final void setOrderVal(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e14c8046", new Object[]{this, str});
        } else {
            this.orderVal$delegate.a(this, $$delegatedProperties[23], str);
        }
    }

    public final void setPersonalityData(PersonalityData personalityData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("480532f", new Object[]{this, personalityData});
        } else {
            this.personalityData$delegate.a(this, $$delegatedProperties[24], personalityData);
        }
    }

    public final void setRecommendItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e5d2f7e", new Object[]{this, str});
        } else {
            this.recommendItem$delegate.a(this, $$delegatedProperties[25], str);
        }
    }

    public final void setSellerId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e3d490d", new Object[]{this, str});
        } else {
            this.sellerId$delegate.a(this, $$delegatedProperties[26], str);
        }
    }

    public final void setTopTime(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4475991", new Object[]{this, str});
        } else {
            this.topTime$delegate.a(this, $$delegatedProperties[27], str);
        }
    }

    static {
        t2o.a(1004535955);
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(CurItemList.class, "appPromActive", "getAppPromActive()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl);
        MutablePropertyReference1Impl mutablePropertyReference1Impl2 = new MutablePropertyReference1Impl(CurItemList.class, "bulk", "getBulk()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl2);
        MutablePropertyReference1Impl mutablePropertyReference1Impl3 = new MutablePropertyReference1Impl(CurItemList.class, "buyCount", "getBuyCount()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl3);
        MutablePropertyReference1Impl mutablePropertyReference1Impl4 = new MutablePropertyReference1Impl(CurItemList.class, "createTime", "getCreateTime()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl4);
        MutablePropertyReference1Impl mutablePropertyReference1Impl5 = new MutablePropertyReference1Impl(CurItemList.class, AgooConstants.MESSAGE_DUPLICATE, "getDuplicate()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl5);
        MutablePropertyReference1Impl mutablePropertyReference1Impl6 = new MutablePropertyReference1Impl(CurItemList.class, "extendVal", "getExtendVal()Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/ExtendVal;", 0);
        dun.f(mutablePropertyReference1Impl6);
        MutablePropertyReference1Impl mutablePropertyReference1Impl7 = new MutablePropertyReference1Impl(CurItemList.class, "favored", "getFavored()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl7);
        MutablePropertyReference1Impl mutablePropertyReference1Impl8 = new MutablePropertyReference1Impl(CurItemList.class, "goodsIndex", "getGoodsIndex()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl8);
        MutablePropertyReference1Impl mutablePropertyReference1Impl9 = new MutablePropertyReference1Impl(CurItemList.class, "groupNum", "getGroupNum()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl9);
        MutablePropertyReference1Impl mutablePropertyReference1Impl10 = new MutablePropertyReference1Impl(CurItemList.class, "hasAppProm", "getHasAppProm()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl10);
        MutablePropertyReference1Impl mutablePropertyReference1Impl11 = new MutablePropertyReference1Impl(CurItemList.class, "hasDiscount", "getHasDiscount()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl11);
        MutablePropertyReference1Impl mutablePropertyReference1Impl12 = new MutablePropertyReference1Impl(CurItemList.class, "isCpc", "isCpc()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl12);
        MutablePropertyReference1Impl mutablePropertyReference1Impl13 = new MutablePropertyReference1Impl(CurItemList.class, "itemExtData", "getItemExtData()Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/ItemExtData;", 0);
        dun.f(mutablePropertyReference1Impl13);
        MutablePropertyReference1Impl mutablePropertyReference1Impl14 = new MutablePropertyReference1Impl(CurItemList.class, "itemH5TaokeUrl", "getItemH5TaokeUrl()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl14);
        MutablePropertyReference1Impl mutablePropertyReference1Impl15 = new MutablePropertyReference1Impl(CurItemList.class, "itemIcon", "getItemIcon()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl15);
        MutablePropertyReference1Impl mutablePropertyReference1Impl16 = new MutablePropertyReference1Impl(CurItemList.class, "itemId", "getItemId()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl16);
        MutablePropertyReference1Impl mutablePropertyReference1Impl17 = new MutablePropertyReference1Impl(CurItemList.class, "itemName", "getItemName()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl17);
        MutablePropertyReference1Impl mutablePropertyReference1Impl18 = new MutablePropertyReference1Impl(CurItemList.class, "itemPic", "getItemPic()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl18);
        MutablePropertyReference1Impl mutablePropertyReference1Impl19 = new MutablePropertyReference1Impl(CurItemList.class, "itemPrice", "getItemPrice()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl19);
        MutablePropertyReference1Impl mutablePropertyReference1Impl20 = new MutablePropertyReference1Impl(CurItemList.class, "itemUrl", "getItemUrl()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl20);
        MutablePropertyReference1Impl mutablePropertyReference1Impl21 = new MutablePropertyReference1Impl(CurItemList.class, "liveId", "getLiveId()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl21);
        MutablePropertyReference1Impl mutablePropertyReference1Impl22 = new MutablePropertyReference1Impl(CurItemList.class, "liveItemPrice", "getLiveItemPrice()Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/LiveItemPrice;", 0);
        dun.f(mutablePropertyReference1Impl22);
        MutablePropertyReference1Impl mutablePropertyReference1Impl23 = new MutablePropertyReference1Impl(CurItemList.class, "liveItemStatusData", "getLiveItemStatusData()Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/LiveItemStatusData;", 0);
        dun.f(mutablePropertyReference1Impl23);
        MutablePropertyReference1Impl mutablePropertyReference1Impl24 = new MutablePropertyReference1Impl(CurItemList.class, "orderVal", "getOrderVal()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl24);
        MutablePropertyReference1Impl mutablePropertyReference1Impl25 = new MutablePropertyReference1Impl(CurItemList.class, "personalityData", "getPersonalityData()Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/PersonalityData;", 0);
        dun.f(mutablePropertyReference1Impl25);
        MutablePropertyReference1Impl mutablePropertyReference1Impl26 = new MutablePropertyReference1Impl(CurItemList.class, "recommendItem", "getRecommendItem()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl26);
        MutablePropertyReference1Impl mutablePropertyReference1Impl27 = new MutablePropertyReference1Impl(CurItemList.class, "sellerId", "getSellerId()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl27);
        MutablePropertyReference1Impl mutablePropertyReference1Impl28 = new MutablePropertyReference1Impl(CurItemList.class, "topTime", "getTopTime()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl28);
        $$delegatedProperties = new a0g[]{mutablePropertyReference1Impl, mutablePropertyReference1Impl2, mutablePropertyReference1Impl3, mutablePropertyReference1Impl4, mutablePropertyReference1Impl5, mutablePropertyReference1Impl6, mutablePropertyReference1Impl7, mutablePropertyReference1Impl8, mutablePropertyReference1Impl9, mutablePropertyReference1Impl10, mutablePropertyReference1Impl11, mutablePropertyReference1Impl12, mutablePropertyReference1Impl13, mutablePropertyReference1Impl14, mutablePropertyReference1Impl15, mutablePropertyReference1Impl16, mutablePropertyReference1Impl17, mutablePropertyReference1Impl18, mutablePropertyReference1Impl19, mutablePropertyReference1Impl20, mutablePropertyReference1Impl21, mutablePropertyReference1Impl22, mutablePropertyReference1Impl23, mutablePropertyReference1Impl24, mutablePropertyReference1Impl25, mutablePropertyReference1Impl26, mutablePropertyReference1Impl27, mutablePropertyReference1Impl28};
    }
}
