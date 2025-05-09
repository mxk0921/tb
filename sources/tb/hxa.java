package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hxa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092718);
    }

    public static void a(Context context, TBLiveDataModel tBLiveDataModel, boolean z, ux9 ux9Var) {
        String str;
        String str2;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fbb9b73", new Object[]{context, tBLiveDataModel, new Boolean(z), ux9Var});
            return;
        }
        VideoInfo videoInfo = tBLiveDataModel.mVideoInfo;
        if (v2s.o().I("reportUrlForTaoBao")) {
            if (xj7.a() == 2) {
                z2 = true;
            }
            if (!z && !z2 && videoInfo != null && (str2 = videoInfo.reportUrlPopLayer) != null) {
                if (uwa.s()) {
                    JSONObject parseObject = JSON.parseObject(Uri.parse(str2).getQueryParameter("params"));
                    String E = uwa.E();
                    if (!TextUtils.isEmpty(E)) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("subjectType", "LIVE");
                        hashMap.put("reportType", "LIVE");
                        hashMap.put("subjectId", videoInfo.liveId);
                        hashMap.put("ttid", v2s.o().f().getTTID());
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("reportStartTime", (Object) String.valueOf(System.currentTimeMillis()));
                        jSONObject.put("liveType", (Object) videoInfo.roomStatus);
                        jSONObject.put("liveRecordTime", (Object) "0");
                        hashMap.put("extParams", jSONObject.toJSONString());
                        parseObject.put("url", (Object) qnv.a(E, hashMap));
                        str2 = qnv.c(str2, "params", parseObject.toJSONString());
                    } else {
                        return;
                    }
                }
                sbu.l(ux9Var);
                Intent intent = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
                intent.putExtra("event", str2);
                intent.putExtra("param", str2);
                LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
            } else if (videoInfo != null && videoInfo.reportUrl != null) {
                sbu.l(ux9Var);
                voj.d(context, videoInfo.reportUrl, true);
            }
        } else if (videoInfo != null && (str = videoInfo.openReportUrl) != null) {
            voj.d(context, str, true);
        }
    }
}
