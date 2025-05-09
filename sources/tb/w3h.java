package tb;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.tao.util.ImageStrategyDecider;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class w3h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(486539760);
    }

    public static boolean a(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, Bundle bundle, View view) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3327566", new Object[]{baseSectionModel, baseSubItemModel, bundle, view})).booleanValue();
        }
        if (!baseSectionModel.containsKey("ext") || bundle == null) {
            fve.e("LiveRoomTransitionUtil", "无法检查实验标识，因为 section 不包含 ext 或 extras = " + bundle);
            return false;
        }
        JSONObject jSONObject2 = baseSectionModel.getJSONObject("ext");
        if (jSONObject2 != null && jSONObject2.containsKey("stark_enableLiveTransition") && "true".equals(jSONObject2.getString("stark_enableLiveTransition"))) {
            fve.e("LiveRoomTransitionUtil", "命中了直播间新交互，服务端放量标记。");
            if (baseSubItemModel.containsKey("content") && (jSONObject = baseSubItemModel.getJSONObject("content")) != null && jSONObject.containsKey("imageUrl") && !TextUtils.isEmpty(jSONObject.getString("imageUrl"))) {
                String string = jSONObject.getString("imageUrl");
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    string = ImageStrategyDecider.decideUrl(string, Integer.valueOf(layoutParams.width), Integer.valueOf(layoutParams.height), null);
                }
                int c = mve.c("orange_key_value_live_blur_radius", 60);
                bundle.putString("coverImage", string);
                bundle.putString(yj4.PARAM_COVER_GAUSS_RADIUS, String.valueOf(c));
                bundle.putString(yj4.PARAM_COVER_GAUSS_SAMPLING, String.valueOf(2));
                s0m.B().T(string).bitmapProcessors(new yf2(view.getContext(), c, 2)).fetch();
                fve.e("LiveRoomTransitionUtil", "首页数据已带入直播间。封面主图预加载中。 12202149, decidedUrl = " + string);
                return true;
            }
        }
        fve.e("LiveRoomTransitionUtil", "一二跳交互优化，直播间新交互，未命中。return false ");
        return false;
    }
}
