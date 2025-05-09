package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.monitor.bean.LiveAPMBean;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ykv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356372);
    }

    public final void a(List<LiveAPMBean.SceneData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2e602d3", new Object[]{this, list});
        } else if (list != null && !list.isEmpty()) {
            LiveAPMBean.SceneData sceneData = null;
            LiveAPMBean.SceneData sceneData2 = null;
            LiveAPMBean.SceneData sceneData3 = null;
            LiveAPMBean.SceneData sceneData4 = null;
            for (LiveAPMBean.SceneData sceneData5 : list) {
                if (TextUtils.equals(sceneData5.scenePoint, "start")) {
                    sceneData = sceneData5;
                } else if (TextUtils.equals(sceneData5.scenePoint, lca.STAGE_T1)) {
                    sceneData2 = sceneData5;
                } else if (TextUtils.equals(sceneData5.scenePoint, lca.STAGE_T2)) {
                    sceneData3 = sceneData5;
                } else if (TextUtils.equals(sceneData5.scenePoint, lca.STAGE_INTERACTIVE)) {
                    sceneData4 = sceneData5;
                }
            }
            if (!(sceneData == null || sceneData2 == null || sceneData3 == null || sceneData4 == null)) {
                long j = sceneData2.performanceData.currentTime;
                long j2 = sceneData.performanceData.currentTime;
                long j3 = sceneData3.performanceData.currentTime - j2;
                long j4 = sceneData4.performanceData.currentTime - j2;
                cwd A = v2s.o().A();
                A.a("UploadDataManager", "firstFrame:" + (j - j2) + " interactive:" + j4 + " detailTime:" + j3);
            }
        }
    }

    public void b(String str, ConcurrentHashMap<String, LiveAPMBean> concurrentHashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd3c956c", new Object[]{this, str, concurrentHashMap});
        } else if (v2s.o().E() != null && concurrentHashMap != null) {
            HashMap hashMap = new HashMap();
            if (concurrentHashMap.keySet().contains(str)) {
                v2s.o().A().a("UploadDataManager", "start upload sessionId : " + str);
                LiveAPMBean liveAPMBean = concurrentHashMap.get(str);
                if (liveAPMBean == null) {
                    v2s.o().A().a("UploadDataManager", "liveAPMBean is null upload data fail");
                    return;
                }
                hashMap.put("sessionId", str);
                hashMap.put("originSessionId", liveAPMBean.originSessionId);
                HashMap<String, String> hashMap2 = liveAPMBean.extParams;
                if (hashMap2 != null && hashMap2.size() > 0) {
                    hashMap.putAll(liveAPMBean.extParams);
                }
                List<LiveAPMBean.SceneData> list = liveAPMBean.sceneDataList;
                for (LiveAPMBean.SceneData sceneData : list) {
                    if (!TextUtils.equals(sceneData.scenePoint, "start")) {
                        hashMap.put(sceneData.scenePoint, JSON.toJSONString(sceneData.performanceData));
                    }
                }
                liveAPMBean.totalPerformanceData.hitchTotal /= 1000000;
                hashMap.put(lca.STAGE_INTERACTIVE_DELAY_FINISH, JSON.toJSONString(liveAPMBean.dataDelay1s));
                hashMap.put(lca.STAGE_IS_COLD_START, String.valueOf(liveAPMBean.isColdStart));
                hashMap.put(lca.STAGE_REFRESH_RATE, String.valueOf(liveAPMBean.refreshRate));
                LiveAPMBean.PerformanceData performanceData = liveAPMBean.dataDelay5s;
                if (performanceData != null) {
                    hashMap.put(lca.STAGE_INTERACTIVE_DELAY_FINISH_5S, JSON.toJSONString(performanceData));
                }
                v2s.o().E().track4Click("Page_TaobaoLiveWatch", "Live_APM_Monitor", hashMap);
                c(str, liveAPMBean);
                try {
                    StringBuilder sb = new StringBuilder();
                    Iterator it = hashMap.keySet().iterator();
                    while (it != null && it.hasNext()) {
                        String str2 = (String) it.next();
                        sb.append(str2);
                        sb.append(":");
                        sb.append((String) hashMap.get(str2));
                        sb.append(">>>>");
                    }
                    v2s.o().A().a("UploadDataManager", "start upload sessionId : " + sb.toString());
                    a(list);
                } catch (Exception e) {
                    v2s.o().A().a("UploadDataManager", "upload sessionId fail " + e.getMessage());
                }
            }
        }
    }

    public final void c(String str, LiveAPMBean liveAPMBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bd1c376", new Object[]{this, str, liveAPMBean});
        }
    }
}
