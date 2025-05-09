package tb;

import android.app.Activity;
import android.view.animation.AlphaAnimation;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import tb.arj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class drj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final drj INSTANCE = new drj();

    /* renamed from: a  reason: collision with root package name */
    public static AlphaAnimation f18030a;
    public static AlphaAnimation b;

    static {
        t2o.a(815793695);
    }

    @JvmStatic
    public static final MuiseBean a(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MuiseBean) ipChange.ipc$dispatch("164cf458", new Object[]{str, str2, str3, str4, jSONObject});
        }
        MuiseBean muiseBean = new MuiseBean();
        if (str == null) {
            str = "";
        }
        muiseBean.type = str;
        if (str2 == null) {
            str2 = "";
        }
        muiseBean.rn = str2;
        if (str3 == null) {
            str3 = "";
        }
        muiseBean.abtest = str3;
        if (str4 == null) {
            str4 = "";
        }
        muiseBean.pageType = str4;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        muiseBean.model = jSONObject;
        return muiseBean;
    }

    @JvmStatic
    public static final AlphaAnimation b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlphaAnimation) ipChange.ipc$dispatch("220fc573", new Object[]{new Boolean(z)});
        }
        if (z) {
            if (f18030a == null) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                f18030a = alphaAnimation;
                alphaAnimation.setDuration(500L);
            }
            return f18030a;
        }
        if (b == null) {
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            b = alphaAnimation2;
            alphaAnimation2.setDuration(500L);
        }
        return b;
    }

    @JvmStatic
    public static final void d(Activity activity, brj brjVar, JSONObject jSONObject, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18544516", new Object[]{activity, brjVar, jSONObject, new Boolean(z)});
        } else if (activity != null && jSONObject != null && brjVar != null) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                ckf.f(entry, "next(...)");
                Map.Entry<String, Object> entry2 = entry;
                String key = entry2.getKey();
                Object value = entry2.getValue();
                if (value != null) {
                    str = value.toString();
                } else {
                    str = null;
                }
                hashMap.put(key, str);
            }
            hashMap.put(r4p.KEY_GRAY_HAIR, String.valueOf(z));
            brjVar.b(activity, hashMap);
        }
    }

    @JvmStatic
    public static final boolean c(arj.b bVar, Integer num, BaseCellBean baseCellBean, JSONObject jSONObject, Integer num2, Integer num3) {
        String str;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e44383d5", new Object[]{bVar, num, baseCellBean, jSONObject, num2, num3})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (num3 != null && num3.intValue() == 0) {
            str = "listCoverHeight";
        } else {
            str = "wfCoverHeight";
        }
        jSONObject2.put((JSONObject) str, (String) Float.valueOf(p1p.d(num2 != null ? num2.intValue() : 0)));
        jSONObject2.put((JSONObject) "placeholder", "true");
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            ckf.f(entry, "next(...)");
            Map.Entry<String, Object> entry2 = entry;
            if (!ckf.b("tItemType", entry2.getKey())) {
                jSONObject2.put((JSONObject) entry2.getKey(), (String) entry2.getValue());
            }
        }
        String valueOf = String.valueOf(jSONObject.get("tItemType"));
        MuiseBean muiseBean = new MuiseBean();
        muiseBean.type = valueOf;
        muiseBean.model = jSONObject2;
        ListStyle fromInt = ListStyle.fromInt(num3 != null ? num3.intValue() : 1);
        if (num2 != null) {
            i = num2.intValue();
        }
        muiseBean.updateCachedHeight(fromInt, i);
        MuiseCellBean muiseCellBean = new MuiseCellBean();
        muiseCellBean.type = valueOf;
        muiseCellBean.mMuiseBean = muiseBean;
        if (baseCellBean != null) {
            muiseCellBean.cardType = baseCellBean.cardType;
            muiseCellBean.itemId = baseCellBean.itemId;
            String[] strArr = baseCellBean.curItemIds;
            if (strArr != null) {
                muiseCellBean.curItemIds = strArr;
            }
            String[] strArr2 = baseCellBean.curP4pIds;
            if (strArr2 != null) {
                muiseCellBean.curP4pIds = strArr2;
            }
            muiseCellBean.isP4p = baseCellBean.isP4p;
            muiseCellBean.isDynamicLandP4p = baseCellBean.isDynamicLandP4p;
        }
        if (bVar != null) {
            bVar.a(muiseCellBean, num != null ? num.intValue() : -1);
        }
        return true;
    }
}
