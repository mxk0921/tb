package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.LiveItemPersonalityGetResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.taolive.sdk.model.common.ItemIdentifier;
import com.taobao.taolive.sdk.model.common.ItemSortInfo;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.message.GoodMsgNew;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class wga extends uzp<v0d> implements ibc, jac {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699343);
        t2o.a(295699335);
        t2o.a(295699048);
    }

    public wga(xea xeaVar, ItemCategory itemCategory) {
        super(xeaVar, itemCategory);
        if (xeaVar != null && xeaVar.j() != null && !itemCategory.isIndependentTab()) {
            xeaVar.j().s(this);
        }
    }

    public static /* synthetic */ Object ipc$super(wga wgaVar, String str, Object... objArr) {
        if (str.hashCode() == 985537887) {
            super.p();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/liveGoodsList/liveStateView/impl/GoodsListBasePresenter2");
    }

    @Override // tb.ibc
    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cb39bf", new Object[]{this});
        }
    }

    @Override // tb.jac
    public void C(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12f16b64", new Object[]{this, new Long(j), new Integer(i)});
        } else {
            f0(j, i);
        }
    }

    @Override // tb.ibc
    public void a() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("719385bc", new Object[]{this});
            return;
        }
        for (th5 th5Var : this.d.e()) {
            if (th5Var != null && (jSONObject = th5Var.b) != null && jSONObject.containsKey("native_vipTagsShow") && th5Var.b.containsKey("native_canShowVipEntrance")) {
                th5Var.b.put("native_canShowVipEntrance", (Object) Boolean.FALSE);
                this.c.a(this.d, th5Var.b);
            }
        }
        List N = ((v0d) this.f29980a).getAdapter().N();
        if (N != null && N.size() > 0) {
            ((v0d) this.f29980a).getAdapter().notifyDataSetChanged();
        }
    }

    public void a0(th5 th5Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a56fb9", new Object[]{this, th5Var, new Boolean(z)});
        } else {
            this.k.b(this.j, th5Var, false, true, z, (pqd) this.f29980a);
        }
    }

    public final void b0(th5 th5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85af9539", new Object[]{this, th5Var});
            return;
        }
        List<x4h> T = T();
        if (!(th5Var == null || T == null)) {
            for (int i = 0; i < T.size(); i++) {
                x4h x4hVar = T.get(i);
                if (th5Var.c == x4hVar.b && TextUtils.equals(x4hVar.e, th5Var.e)) {
                    ((v0d) this.f29980a).getAdapter().notifyItemChanged(i);
                    return;
                }
            }
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84150132", new Object[]{this});
        }
    }

    public final void d0(GoodMsgNew goodMsgNew, boolean z) {
        LiveItem liveItem;
        ItemSortInfo itemSortInfo;
        List<ItemIdentifier> list;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaead1c7", new Object[]{this, goodMsgNew, new Boolean(z)});
        } else if (goodMsgNew != null && (liveItem = goodMsgNew.liveItemDO) != null) {
            jq6.n(liveItem);
            if (pfa.e(goodMsgNew.liveItemDO, this.e, this.f) && pfa.P(this.d.u(), goodMsgNew.liveItemDO)) {
                if (pfa.B(this.e, this.f)) {
                    itemSortInfo = goodMsgNew.itemSortInfo;
                } else {
                    Map<String, ItemSortInfo> map = goodMsgNew.categoryItemSortInfo;
                    if (map != null) {
                        itemSortInfo = map.get(this.f);
                    } else {
                        itemSortInfo = null;
                    }
                    if (itemSortInfo == null) {
                        hea heaVar = this.k;
                        LiveItem liveItem2 = goodMsgNew.liveItemDO;
                        heaVar.p(liveItem2.goodsIndex, Long.toString(liveItem2.itemId));
                    }
                }
                if (!pfa.B(this.e, this.f) || this.d.j().z() == null || !this.d.j().z().useRecommendItem) {
                    list = this.k.w(itemSortInfo, null, true, X());
                } else {
                    list = this.k.d(itemSortInfo);
                }
                if (X()) {
                    z2 = V(list, null, goodMsgNew.liveItemDO, false);
                } else {
                    z2 = false;
                }
                if (!yga.y()) {
                    hea.s(this.d.x(Long.toString(goodMsgNew.liveItemDO.itemId)), goodMsgNew.liveItemDO, z);
                } else if (z) {
                    hea.s(this.d.x(Long.toString(goodMsgNew.liveItemDO.itemId)), goodMsgNew.liveItemDO, true);
                }
                O(goodMsgNew.liveItemDO, false, true, false);
                if (!this.k.q(T()) || z2) {
                    this.k.e(T());
                    ((v0d) this.f29980a).getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    @Override // tb.ibc
    public void e(List<ItemIdentifier> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34c1301d", new Object[]{this, list});
        } else if (list != null && !list.isEmpty()) {
            ((cbc) this.b).g(this.k.m(), list, this.j, false, false, "refresh");
        }
    }

    public final void f0(long j, int i) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9780da1", new Object[]{this, new Long(j), new Integer(i)});
            return;
        }
        th5 k = this.d.k(this.j, 4, -1, Long.toString(j));
        if (k == null || (jSONObject = k.b) == null) {
            hha.c("GoodsLiveStatePresenter", "dxData == null");
            return;
        }
        if (jSONObject.containsKey("itemExtData")) {
            JSONObject jSONObject2 = k.b.getJSONObject("itemExtData");
            int intValue = jSONObject2.getIntValue("itemSellingTotal");
            if (intValue >= i) {
                hha.c("GoodsLiveStatePresenter", "updateItem | currTotal=" + intValue + "   total=" + i + " goodIndex=" + k.c);
                return;
            }
            jSONObject2.put("itemSellingTotal", (Object) String.valueOf(i));
        } else {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("itemSellingTotal", (Object) String.valueOf(i));
            k.b.put("itemExtData", (Object) jSONObject3);
        }
        if (k.b.containsKey("liveItemStatusData")) {
            JSONObject jSONObject4 = k.b.getJSONObject("liveItemStatusData");
            if (jSONObject4.containsKey("isSpeaking") && TextUtils.equals(jSONObject4.getString("isSpeaking"), "true")) {
                hha.c("GoodsLiveStatePresenter", "isSpeaking  true");
            }
        }
        b0(k);
        hha.c("GoodsLiveStatePresenter", "update item");
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7ab8f7b", new Object[]{this});
        }
    }

    @Override // tb.jac
    public void k(GoodMsgNew goodMsgNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("314945a5", new Object[]{this, goodMsgNew});
        } else {
            d0(goodMsgNew, true);
        }
    }

    @Override // tb.jac
    public void m(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f22e87a4", new Object[]{this, jSONObject});
        } else {
            e0(jSONObject);
        }
    }

    @Override // tb.jac
    public void n(GoodMsgNew goodMsgNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5433eb18", new Object[]{this, goodMsgNew});
        } else {
            d0(goodMsgNew, true);
        }
    }

    @Override // tb.vfa, tb.bdd
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3abe1d5f", new Object[]{this});
            return;
        }
        super.p();
        xea xeaVar = this.d;
        if (xeaVar != null && xeaVar.j() != null) {
            this.d.j().V(this);
        }
    }

    @Override // tb.jac
    public void q(GoodMsgNew goodMsgNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b183b31f", new Object[]{this, goodMsgNew});
        } else {
            d0(goodMsgNew, true);
        }
    }

    @Override // tb.ibc
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c46ebcab", new Object[]{this});
        } else if (this.d.Q() || this.d.N()) {
        } else {
            if (X() || this.j.queryRights) {
                hha.b("GoodsLiveStatePresenter", "getRightList | isListAllTab=" + X() + " queryRights=" + this.j.queryRights);
                ((cbc) this.b).e(this.j);
            }
        }
    }

    @Override // tb.jac
    public void s(GoodMsgNew goodMsgNew, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b857be9e", new Object[]{this, goodMsgNew, new Boolean(z)});
        } else {
            d0(goodMsgNew, z);
        }
    }

    @Override // tb.jac
    public void u(GoodMsgNew goodMsgNew, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b640d63", new Object[]{this, goodMsgNew, new Boolean(z)});
        } else {
            d0(goodMsgNew, z);
        }
    }

    @Override // tb.ibc
    public void v(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b4aa2d7", new Object[]{this, liveItem});
        } else {
            O(liveItem, true, true, false);
        }
    }

    @Override // tb.ibc
    public void w(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ce067f0", new Object[]{this, liveItem});
        } else {
            O(liveItem, true, true, false);
        }
    }

    @Override // tb.jac
    public void x(GoodMsgNew goodMsgNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b784d2cb", new Object[]{this, goodMsgNew});
        } else {
            d0(goodMsgNew, true);
        }
    }

    @Override // tb.jac
    public void y(LiveItem liveItem, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cbd22f1", new Object[]{this, liveItem, str, str2});
        }
    }

    public void c0(LiveItemPersonalityGetResponseData.LiveItemPersonalityData liveItemPersonalityData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("866bedb9", new Object[]{this, liveItemPersonalityData});
            return;
        }
        List N = ((v0d) this.f29980a).getAdapter().N();
        if (N != null && N.size() > 0) {
            for (int i = 0; i < N.size(); i++) {
                th5 M = ((v0d) this.f29980a).getAdapter().M(i);
                if (M != null && M.e.equals(liveItemPersonalityData.itemId)) {
                    M.b.put("personalityData", (Object) liveItemPersonalityData.personalityData);
                    ((v0d) this.f29980a).getAdapter().notifyItemChanged(i);
                }
            }
        }
    }

    public final void e0(JSONObject jSONObject) {
        LiveItem liveItem;
        JSONObject jSONObject2;
        String str;
        JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29958d7", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            long h = zqq.h(jSONObject.getString("itemId"));
            String string = jSONObject.getString("status");
            String string2 = jSONObject.getString("type");
            List N = ((v0d) this.f29980a).getAdapter().N();
            if (!TextUtils.isEmpty(this.d.u()) && N != null && N.size() > 0) {
                for (int i = 0; i < N.size(); i++) {
                    th5 M = ((v0d) this.f29980a).getAdapter().M(i);
                    if (((x4h) N.get(i)).e.equals(String.valueOf(h)) && M != null && M.b.getString("liveId").equals(this.d.u())) {
                        liveItem = (LiveItem) fkx.f(M.b.toJSONString(), LiveItem.class);
                        break;
                    }
                }
            }
            liveItem = null;
            if (liveItem != null) {
                if ("2".equals(string) && "secKillSellout".equals(string2)) {
                    LiveItem.Ext ext = liveItem.extendVal;
                    if (!(ext == null || (str = ext.secKillInfo) == null || liveItem.itemId != h || (d = fkx.d(str)) == null)) {
                        d.put("status", (Object) 2);
                        liveItem.extendVal.secKillInfo = d.toJSONString();
                        O(liveItem, true, true, false);
                    }
                } else if ("itemUpSelf".equals(string2)) {
                    JSONObject jSONObject3 = liveItem.liveItemStatusData;
                    if (jSONObject3 != null) {
                        jSONObject3.put("isDownShelf", (Object) Boolean.FALSE);
                        O(liveItem, true, true, false);
                    }
                } else if ("cancelPunish".equals(string2) && (jSONObject2 = liveItem.liveItemStatusData) != null) {
                    jSONObject2.put("isGray", (Object) Boolean.FALSE);
                    O(liveItem, true, true, false);
                }
            }
        }
    }
}
