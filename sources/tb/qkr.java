package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.ImageStrategyDecider;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qkr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(310378634);
    }

    public void a(Context context) {
        JSONArray parseArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44549d66", new Object[]{this, context});
            return;
        }
        s0m B = s0m.B();
        String string = context.getSharedPreferences("taobao_live_home", 0).getString("jingxuanFirstPageImageSp", "");
        if (!(TextUtils.isEmpty(string) || (parseArray = JSON.parseArray(string)) == null || parseArray.size() <= 0)) {
            for (int i = 0; i < parseArray.size(); i++) {
                JSONObject jSONObject = parseArray.getJSONObject(i);
                if (jSONObject != null) {
                    String string2 = jSONObject.getString("imageUrl");
                    Integer integer = jSONObject.getInteger("width");
                    int intValue = integer.intValue();
                    Integer integer2 = jSONObject.getInteger("height");
                    int intValue2 = integer2.intValue();
                    if (!TextUtils.isEmpty(string2) && intValue > 0 && intValue2 > 0) {
                        B.T(ImageStrategyDecider.decideUrl(string2, integer, integer2, null)).limitSize(null, intValue, intValue2).fetch();
                    }
                }
            }
            TLog.loge("TBLiveImageCtr", "TBLiveImageCtr batchFetchImage end");
        }
    }
}
