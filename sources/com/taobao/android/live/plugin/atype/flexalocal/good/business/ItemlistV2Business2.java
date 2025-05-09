package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.taolive.sdk.business.IRemoteExtendListener;
import com.taobao.taolive.sdk.model.common.ItemIdentifier;
import java.util.List;
import tb.b0d;
import tb.gfa;
import tb.nt1;
import tb.t2o;
import tb.xea;
import tb.y6j;
import tb.yga;
import tb.zqq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ItemlistV2Business2 extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int REQUEST_NUM = 10;
    public final gfa.b l;
    public long m;

    static {
        t2o.a(295698870);
    }

    public ItemlistV2Business2(b0d b0dVar) {
        super(b0dVar);
        this.b = new IRemoteExtendListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2Business2.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.business.IRemoteExtendListener
            public void dataParseBegin(long j) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a054be1d", new Object[]{this, new Long(j)});
                } else {
                    ItemlistV2Business2.K(ItemlistV2Business2.this, j);
                }
            }

            @Override // com.taobao.taolive.sdk.business.IRemoteExtendListener
            public void responseReceive(y6j y6jVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f400314d", new Object[]{this, y6jVar});
                }
            }
        };
    }

    public static /* synthetic */ long K(ItemlistV2Business2 itemlistV2Business2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e048dbac", new Object[]{itemlistV2Business2, new Long(j)})).longValue();
        }
        itemlistV2Business2.m = j;
        return j;
    }

    public static ItemlistV2Request2 L(List<ItemIdentifier> list, List<ItemIdentifier> list2, ItemCategory itemCategory, xea xeaVar, String str, boolean z, long j) {
        int i;
        JSONObject jSONObject;
        boolean z2;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemlistV2Request2) ipChange.ipc$dispatch("d253b083", new Object[]{list, list2, itemCategory, xeaVar, str, new Boolean(z), new Long(j)});
        }
        ItemlistV2Request2 itemlistV2Request2 = new ItemlistV2Request2();
        itemlistV2Request2.liveId = xeaVar.n.f();
        itemlistV2Request2.creatorId = zqq.h(xeaVar.n.b());
        itemlistV2Request2.n = j;
        if (list2 == null || list2.isEmpty()) {
            i = 1;
        } else {
            i = 0;
        }
        itemlistV2Request2.includePopLayerEntance = i;
        itemlistV2Request2.transParams = xeaVar.B();
        itemlistV2Request2.liveSource = xeaVar.v();
        itemlistV2Request2.entryLiveSource = xeaVar.m();
        if (xeaVar.j() == null) {
            jSONObject = null;
        } else {
            jSONObject = xeaVar.j().D();
        }
        itemlistV2Request2.itemCardTransferInfo = jSONObject;
        if (xeaVar.H() != null) {
            if (xeaVar.H().itemTransferInfo == null) {
                str2 = "";
            } else {
                str2 = xeaVar.H().itemTransferInfo.toJSONString();
            }
            itemlistV2Request2.itemTransferInfo = str2;
        }
        if (xeaVar.j() != null && itemCategory != null && itemCategory.isDefaultTab() && xeaVar.c()) {
            List<ItemIdentifier> E = xeaVar.j().E();
            if (!xeaVar.d() || (E != null && !E.isEmpty())) {
                z2 = false;
            } else {
                z2 = true;
            }
            itemlistV2Request2.needRecommendItem = z2;
            if (E != null && E.size() > 0) {
                if (E.size() > 10) {
                    E = E.subList(0, 10);
                }
                itemlistV2Request2.recommendItemList = E;
            }
        }
        itemlistV2Request2.needPcg = xeaVar.c();
        itemlistV2Request2.matchNewVersion = "1";
        if (itemCategory != null) {
            String str3 = itemCategory.categoryId;
            itemlistV2Request2.categoryId = str3;
            itemlistV2Request2.categoryBizType = itemCategory.bizType;
            if (!itemCategory.backSortList) {
                list = null;
            }
            itemlistV2Request2.sortItemList = list;
            if (TextUtils.equals(str3, xeaVar.m.f20663a)) {
                itemlistV2Request2.bizTopItemId = xeaVar.m.b;
            }
        }
        itemlistV2Request2.needSortList = true;
        itemlistV2Request2.itemIndexIdList = list2;
        itemlistV2Request2.firstPage = z;
        itemlistV2Request2.scene = str;
        if (yga.W()) {
            itemlistV2Request2.isInsideDetail = xeaVar.V;
        }
        itemlistV2Request2.isHighlight = xeaVar.Q();
        return itemlistV2Request2;
    }

    public static /* synthetic */ Object ipc$super(ItemlistV2Business2 itemlistV2Business2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/business/ItemlistV2Business2");
    }

    public long M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8c254b71", new Object[]{this})).longValue();
        }
        return this.m;
    }

    public void N(ItemlistV2Request2 itemlistV2Request2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f9b3d20", new Object[]{this, itemlistV2Request2});
        } else {
            E(1, itemlistV2Request2, ItemlistV2Response.class, false, true);
        }
    }

    public void O(List<ItemIdentifier> list, List<ItemIdentifier> list2, ItemCategory itemCategory, xea xeaVar, String str) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f9d8497", new Object[]{this, list, list2, itemCategory, xeaVar, str});
            return;
        }
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        P(list, list2, itemCategory, xeaVar, str, z, 10L);
    }

    public void P(List<ItemIdentifier> list, List<ItemIdentifier> list2, ItemCategory itemCategory, xea xeaVar, String str, boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae64d947", new Object[]{this, list, list2, itemCategory, xeaVar, str, new Boolean(z), new Long(j)});
        } else if (xeaVar != null) {
            E(1, L(list, list2, itemCategory, xeaVar, str, z, j), ItemlistV2Response.class, false, true);
        }
    }

    public ItemlistV2Business2(b0d b0dVar, gfa.b bVar) {
        super(b0dVar);
        this.l = bVar;
        this.b = new IRemoteExtendListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2Business2.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.business.IRemoteExtendListener
            public void dataParseBegin(long j) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a054be1d", new Object[]{this, new Long(j)});
                } else {
                    ItemlistV2Business2.K(ItemlistV2Business2.this, j);
                }
            }

            @Override // com.taobao.taolive.sdk.business.IRemoteExtendListener
            public void responseReceive(y6j y6jVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f400314d", new Object[]{this, y6jVar});
                }
            }
        };
    }
}
