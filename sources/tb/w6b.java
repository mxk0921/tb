package tb;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.birdnest.api.BirdNestEngine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.search.searchdoor.activate.hotspot.HotSpots;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class w6b extends pq1<HotSpots, ja0> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792997);
    }

    public static /* synthetic */ Object ipc$super(w6b w6bVar, String str, Object... objArr) {
        if (str.hashCode() == -4253972) {
            w6bVar.k((JSONObject) objArr[0], (ActivateTypedBean) objArr[1], (ja0) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/activate/hotspot/HotSpotsParser");
    }

    @Override // tb.dx
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad31b77e", new Object[]{this});
        }
        return "nt_hot_spots";
    }

    /* renamed from: l */
    public HotSpots a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HotSpots) ipChange.ipc$dispatch("4e9dfb57", new Object[]{this});
        }
        return new HotSpots(false, null, null, null, null, null, null, false, false, TypedValues.PositionType.TYPE_POSITION_TYPE, null);
    }

    /* renamed from: m */
    public void i(JSONObject jSONObject, HotSpots hotSpots, ja0 ja0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1a986f9", new Object[]{this, jSONObject, hotSpots, ja0Var});
            return;
        }
        ckf.g(jSONObject, "beanObject");
        ckf.g(hotSpots, "bean");
        k(jSONObject, hotSpots, ja0Var);
        hotSpots.setOriginData(jSONObject);
        hotSpots.setPreload(ja0Var != null && ja0Var.w);
        hotSpots.setName(jSONObject.getString("name"));
        hotSpots.setTabKey(jSONObject.getString("tabkey"));
        hotSpots.traceBizType = jSONObject.getString("traceBizType");
        hotSpots.traceTmplType = jSONObject.getString("traceTmplType");
        hotSpots.setTrendRuleText(jSONObject.getString("trendRuleText"));
        hotSpots.setTrendRuleUrl(jSONObject.getString("trendRuleUrl"));
        JSONArray jSONArray = jSONObject.getJSONArray("data");
        if (jSONArray != null) {
            int size = jSONArray.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                JSONObject jSONObject3 = jSONObject2.getJSONObject("tabStyle");
                int intValue = jSONObject2.getIntValue("deepColorSize");
                String string = jSONObject3.getString("name");
                String string2 = jSONObject3.getString("titleImage");
                JSONArray jSONArray2 = jSONObject2.getJSONArray("tabData");
                int size2 = jSONArray2.size();
                ArrayList arrayList2 = new ArrayList(size2);
                for (int i2 = 0; i2 < size2; i2++) {
                    JSONObject jSONObject4 = jSONArray2.getJSONObject(i2);
                    String string3 = jSONObject4.getString("searchNum");
                    String string4 = jSONObject4.getString("showText");
                    String string5 = jSONObject4.getString("tagIcon");
                    String string6 = jSONObject4.getString("markUrl");
                    int intValue2 = jSONObject4.getIntValue("tagIconWidth");
                    int intValue3 = jSONObject4.getIntValue("tagIconHeight");
                    String string7 = jSONObject4.getString(BirdNestEngine.Params.KEY_INDEX_URL);
                    ckf.d(string4);
                    arrayList2.add(new v6b(string4, string5, string3, string7, string6, jSONObject4.getString("arrowIcon"), jSONObject4.getString("arrowIconDark"), jSONObject4.getString("itemJumpUrl"), jSONObject4.getJSONArray("searchParams"), jSONObject4.getString("searchText"), intValue2, intValue3, r3p.Companion.a(jSONObject4), ux3.Companion.a(jSONObject4), jSONObject4.getJSONObject("utLogMap"), jSONObject4, false, 65536, null));
                }
                arrayList.add(new x6b(jSONObject3.getString("tabName"), string, string2, jSONObject3.getString("selectedTitleImage"), Integer.valueOf(jSONObject3.getIntValue("titleWidth")), Integer.valueOf(jSONObject3.getIntValue("titleHeight")), arrayList2, intValue, jSONObject2.getJSONObject("tabTrace"), jSONObject2, false, false, false, false, MediaConstant.MAX_BUFFER_SIZE_DEFAULT, null));
            }
            hotSpots.setTabs(arrayList);
        }
    }
}
