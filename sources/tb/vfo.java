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
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class vfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093361);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("126eb771", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enablePoplayerReportNewUrl", "true"));
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76b9e348", new Object[0]);
        }
        return v2s.o().p().b("tblive", "tbLiveRoomReportUrl", "https://market.m.taobao.com/app/msd/buyer-aqcenter/report.html?bizSource=taobao#/poplayer");
    }

    public static void c(Context context, ux9 ux9Var, TBLiveDataModel tBLiveDataModel, long j, boolean z) {
        String str;
        String str2;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7fd7421", new Object[]{context, ux9Var, tBLiveDataModel, new Long(j), new Boolean(z)});
            return;
        }
        VideoInfo videoInfo = tBLiveDataModel.mVideoInfo;
        if (v2s.o().I("reportUrlForTaoBao")) {
            if (xj7.a() == 2) {
                z2 = true;
            }
            if (!z && !z2 && videoInfo != null && (str2 = videoInfo.reportUrlPopLayer) != null) {
                if (a()) {
                    JSONObject parseObject = JSON.parseObject(Uri.parse(str2).getQueryParameter("params"));
                    String b = b();
                    if (!TextUtils.isEmpty(b)) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("subjectType", "LIVE");
                        hashMap.put("reportType", "LIVE");
                        hashMap.put("subjectId", videoInfo.liveId);
                        hashMap.put("ttid", v2s.o().f().getTTID());
                        JSONObject jSONObject = new JSONObject();
                        long currentTimeMillis = System.currentTimeMillis();
                        if ("1".equals(videoInfo.roomStatus)) {
                            j = currentTimeMillis - videoInfo.startTime;
                        } else if (!"2".equals(videoInfo.roomStatus)) {
                            j = 0;
                        }
                        jSONObject.put("reportStartTime", (Object) String.valueOf(currentTimeMillis));
                        jSONObject.put("liveType", (Object) videoInfo.roomStatus);
                        jSONObject.put("liveRecordTime", (Object) String.valueOf(j));
                        hashMap.put("extParams", jSONObject.toJSONString());
                        parseObject.put("url", (Object) qnv.a(b, hashMap));
                        str2 = qnv.c(str2, "params", parseObject.toJSONString());
                    } else {
                        return;
                    }
                }
                rbu.f0(ux9Var);
                Intent intent = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
                intent.putExtra("event", str2);
                intent.putExtra("param", str2);
                LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
            } else if (videoInfo != null && videoInfo.reportUrl != null) {
                rbu.f0(ux9Var);
                voj.d(context, videoInfo.reportUrl, true);
            }
        } else if (videoInfo != null && (str = videoInfo.openReportUrl) != null) {
            voj.d(context, str, true);
        }
    }
}
