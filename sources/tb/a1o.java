package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.showcase.LiveGoodDataCenter;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.constans.GLRenderType;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a1o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public xea f15489a;
    public final ItemCategory b;
    public final boolean c;

    static {
        t2o.a(295699339);
    }

    public a1o(ItemCategory itemCategory, boolean z) {
        this.b = itemCategory;
        this.c = z;
    }

    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        xea xeaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec10649", new Object[]{this, jSONObject, jSONObject2});
        } else if (jSONObject2 != null) {
            jSONObject2.remove("expansionRedPacket");
            ItemCategory itemCategory = this.b;
            if (!(itemCategory == null || !itemCategory.isDefaultTab() || (xeaVar = this.f15489a) == null || xeaVar.Q() || this.f15489a.H() == null || !"1".equals(this.f15489a.H().roomStatus))) {
                String string = jSONObject.getString("itemId");
                if (!(TextUtils.isEmpty(string) || this.f15489a.j() == null || this.f15489a.j().A().isEmpty())) {
                    for (LiveGoodDataCenter.l lVar : this.f15489a.j().A()) {
                        if (lVar != null && TextUtils.equals(string, lVar.c)) {
                            jSONObject2.put("expansionRedPacket", (Object) lVar.b);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void d(xea xeaVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f48f0e6d", new Object[]{this, xeaVar, jSONObject});
        } else {
            jSONObject.put("isFollowed", (Object) String.valueOf(kkr.i().f(xeaVar)));
        }
    }

    public boolean g(xea xeaVar, JSONObject jSONObject, boolean z, GLRenderType gLRenderType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba071fa9", new Object[]{this, xeaVar, jSONObject, new Boolean(z), gLRenderType})).booleanValue();
        }
        if (jSONObject == null) {
            hha.b("RenderStateChecker", "checkState | liveItemJson null:");
            return false;
        }
        long a2 = f4s.a();
        JSONObject jSONObject2 = jSONObject.getJSONObject("itemExtData");
        b(jSONObject, z, gLRenderType);
        boolean f = f(jSONObject2);
        boolean h = h(jSONObject2);
        if (jSONObject2 == null) {
            JSONObject jSONObject3 = new JSONObject();
            d(xeaVar, jSONObject3);
            jSONObject.put("itemExtData", (Object) jSONObject3);
        } else {
            d(xeaVar, jSONObject2);
        }
        boolean c = c(jSONObject, a2);
        e(jSONObject, a2);
        if (f || h || c) {
            return true;
        }
        return false;
    }

    public void i(xea xeaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e657f0f", new Object[]{this, xeaVar});
        } else {
            this.f15489a = xeaVar;
        }
    }

    public final void b(JSONObject jSONObject, boolean z, GLRenderType gLRenderType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9376637", new Object[]{this, jSONObject, new Boolean(z), gLRenderType});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("nativeConfigInfos");
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
            jSONObject.put("nativeConfigInfos", (Object) jSONObject2);
        }
        xea xeaVar = this.f15489a;
        String str = "0";
        if (xeaVar != null && xeaVar.c()) {
            jSONObject2.put("isFirstRec", (Object) (z ? "1" : str));
        }
        if (this.c) {
            jSONObject2.put("disableExplainFunction", "true");
        }
        if (gLRenderType != null) {
            jSONObject2.put("goodsDisplayStyle", (Object) gLRenderType.cpsCode);
        }
        if (y6p.a(jSONObject, false)) {
            str = "1";
        }
        jSONObject2.put("isSeckill", (Object) str);
        a(jSONObject, jSONObject2);
    }

    public final boolean c(JSONObject jSONObject, long j) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f101fce", new Object[]{this, jSONObject, new Long(j)})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("native_itemBenefits");
        if (jSONArray != null && !jSONArray.isEmpty()) {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                if (!i92.b((JSONObject) it.next(), j)) {
                    it.remove();
                    z = true;
                }
            }
        }
        return z;
    }

    public final boolean f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4286e5e", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        String string = jSONObject.getString("preSaleStatus");
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        if (TextUtils.equals("0", string) || TextUtils.equals("1", string)) {
            long longValue = jSONObject.getLongValue("depositBegin");
            long longValue2 = jSONObject.getLongValue("depositEnd");
            long a2 = f4s.a();
            if (longValue > 0 && longValue2 > 0 && a2 > 0) {
                if (a2 >= longValue2) {
                    jSONObject.put("preSaleStatus", "2");
                    return true;
                } else if (a2 >= longValue && !TextUtils.equals("1", string)) {
                    jSONObject.put("preSaleStatus", "1");
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6be6de6e", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        String string = jSONObject.getString("timingUpShelfStatus");
        if (!TextUtils.isEmpty(string) && TextUtils.equals("0", string)) {
            long longValue = jSONObject.getLongValue("timingStarts");
            long a2 = f4s.a();
            if (longValue > 0 && a2 > longValue) {
                jSONObject.remove("timingUpShelfStatus");
                return true;
            }
        }
        return false;
    }

    public final void e(JSONObject jSONObject, long j) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f7f9b41", new Object[]{this, jSONObject, new Long(j)});
            return;
        }
        int H = wda.H();
        if (jSONObject != null && 3 != H && (jSONObject2 = jSONObject.getJSONObject("itemExtData")) != null) {
            JSONObject jSONObject4 = jSONObject2.getJSONObject("giftActivityInfo");
            if (jSONObject4 != null && !jSONObject4.isEmpty() && (H == 2 || H == 1)) {
                JSONObject jSONObject5 = jSONObject4.getJSONObject("shopFreeSendGiftPart_taobaolive");
                if (jSONObject5 != null) {
                    if (!i92.b(jSONObject5, j)) {
                        jSONObject4.remove("shopFreeSendGiftPart_taobaolive");
                        if (jSONObject4.isEmpty()) {
                            jSONObject2.remove("giftActivityInfo");
                        }
                    }
                } else {
                    return;
                }
            }
            JSONObject jSONObject6 = jSONObject2.getJSONObject("nextGiftActivityInfo");
            if (jSONObject6 != null && !jSONObject6.isEmpty() && H == 1 && (jSONObject3 = jSONObject6.getJSONObject("shopFreeSendGiftPart_taobaolive")) != null && !jSONObject3.isEmpty() && i92.b(jSONObject3, j)) {
                jSONObject2.put("giftActivityInfo", (Object) jSONObject6);
                jSONObject2.remove("nextGiftActivityInfo");
            }
        }
    }
}
