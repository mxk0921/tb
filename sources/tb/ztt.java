package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.movehighlight.bundle.timeshift.model.LiveTimemovingModel;
import com.taobao.taolive.sdk.model.common.LiveItem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ztt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092625);
    }

    public static LiveItem.TimeMovingPlayInfo a(LiveTimemovingModel liveTimemovingModel) {
        LiveItem.Ext ext;
        LiveItem.TimeMovingPlayInfo timeMovingPlayInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveItem.TimeMovingPlayInfo) ipChange.ipc$dispatch("92967f0a", new Object[]{liveTimemovingModel});
        }
        if (liveTimemovingModel == null || (ext = liveTimemovingModel.extendVal) == null || TextUtils.isEmpty(ext.timeMovingPlayInfo) || (timeMovingPlayInfo = (LiveItem.TimeMovingPlayInfo) JSON.parseObject(liveTimemovingModel.extendVal.timeMovingPlayInfo, LiveItem.TimeMovingPlayInfo.class)) == null) {
            return null;
        }
        return timeMovingPlayInfo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
        if (r4 != null) goto L_0x0032;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<com.taobao.taolive.sdk.model.common.LiveItem.TimeMovingLabelInfos> b(java.lang.String r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.ztt.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "449b8d9"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.Object r4 = r0.ipc$dispatch(r1, r2)
            java.util.List r4 = (java.util.List) r4
            return r4
        L_0x0015:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0031
            java.lang.Class<com.taobao.taolive.sdk.model.common.LiveItem$TimeMovingPlayInfo> r0 = com.taobao.taolive.sdk.model.common.LiveItem.TimeMovingPlayInfo.class
            java.lang.Object r4 = com.alibaba.fastjson.JSON.parseObject(r4, r0)
            com.taobao.taolive.sdk.model.common.LiveItem$TimeMovingPlayInfo r4 = (com.taobao.taolive.sdk.model.common.LiveItem.TimeMovingPlayInfo) r4
            if (r4 == 0) goto L_0x0031
            com.taobao.taolive.sdk.model.common.LiveItem$SpfPlayVideo r0 = r4.spfPlayVideo
            if (r0 == 0) goto L_0x002c
            java.util.List<com.taobao.taolive.sdk.model.common.LiveItem$TimeMovingLabelInfos> r4 = r0.timeMovingLabelInfos
            goto L_0x0032
        L_0x002c:
            java.util.List<com.taobao.taolive.sdk.model.common.LiveItem$TimeMovingLabelInfos> r4 = r4.timeMovingLabelInfos
            if (r4 == 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r4 = 0
        L_0x0032:
            if (r4 != 0) goto L_0x0039
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x0039:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ztt.b(java.lang.String):java.util.List");
    }

    public static void c(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28b875f", new Object[]{jSONObject});
        } else if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("model")) != null && (jSONArray = jSONObject2.getJSONArray("timeMovingList")) != null && jSONArray.size() > 0) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject4 = jSONArray.getJSONObject(i);
                if (!(jSONObject4 == null || (jSONObject3 = jSONObject4.getJSONObject("extendVal")) == null)) {
                    String string = jSONObject3.getString("secKillInfo");
                    if (!TextUtils.isEmpty(string)) {
                        jSONObject3.put("secKillInfo", (Object) JSON.parseObject(string));
                    }
                }
            }
        }
    }
}
