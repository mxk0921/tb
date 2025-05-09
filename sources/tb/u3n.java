package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.pub_kit.guide.model.PubIconChangeGuidePopupModel;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class u3n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(845152332);
    }

    public static final String a(PubUserGuideModule pubUserGuideModule) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a5509c5", new Object[]{pubUserGuideModule});
        }
        ckf.g(pubUserGuideModule, "<this>");
        StringBuilder sb = new StringBuilder();
        List<String> expBuckets = pubUserGuideModule.getExpBuckets();
        if (expBuckets != null) {
            for (Object obj : expBuckets) {
                int i2 = i + 1;
                if (i >= 0) {
                    String str = (String) obj;
                    if (i == 0) {
                        sb.append(str);
                    } else {
                        sb.append("_");
                        sb.append(str);
                    }
                    i = i2;
                } else {
                    yz3.p();
                    throw null;
                }
            }
        }
        String sb2 = sb.toString();
        ckf.f(sb2, "StringBuilder().apply {\n…       }\n    }.toString()");
        return sb2;
    }

    public static final Integer b(PubUserGuideModule pubUserGuideModule) {
        JSONObject newPopupData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("2b25c5bd", new Object[]{pubUserGuideModule});
        }
        ckf.g(pubUserGuideModule, "<this>");
        PubIconChangeGuidePopupModel iconChangeGuidePopup = pubUserGuideModule.getIconChangeGuidePopup();
        Object obj = (iconChangeGuidePopup == null || (newPopupData = iconChangeGuidePopup.getNewPopupData()) == null) ? null : newPopupData.get("strongGuideAlgorithmUserClickTime");
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        return null;
    }

    public static final Integer c(PubUserGuideModule pubUserGuideModule) {
        JSONObject newPopupData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("9b934844", new Object[]{pubUserGuideModule});
        }
        ckf.g(pubUserGuideModule, "<this>");
        PubIconChangeGuidePopupModel iconChangeGuidePopup = pubUserGuideModule.getIconChangeGuidePopup();
        Object obj = (iconChangeGuidePopup == null || (newPopupData = iconChangeGuidePopup.getNewPopupData()) == null) ? null : newPopupData.get("strongGuideAlgorithmUserStayTime");
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        return null;
    }
}
