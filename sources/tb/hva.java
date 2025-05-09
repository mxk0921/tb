package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.message_sdk.mtop.heart.HeartbeatReportRequest;
import com.taobao.taolive.message_sdk.mtop.heart.HeartbeatReportResponse;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hva extends mt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public hva(b0d b0dVar, int i) {
        super(b0dVar, i, true);
    }

    public static /* synthetic */ Object ipc$super(hva hvaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/message_sdk/mtop/heart/HeartbeatReportBusiness");
    }

    public void r(int i, String str, String str2, long j, List<Long> list, long j2, long j3, HashMap<String, String> hashMap, HashSet<String> hashSet) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("583a1747", new Object[]{this, new Integer(i), str, str2, new Long(j), list, new Long(j2), new Long(j3), hashMap, hashSet});
            return;
        }
        HeartbeatReportRequest heartbeatReportRequest = new HeartbeatReportRequest();
        heartbeatReportRequest.setBizCode(i);
        heartbeatReportRequest.setTopic(str);
        heartbeatReportRequest.setSessionId(str2);
        heartbeatReportRequest.setStage(j);
        heartbeatReportRequest.setStatusList(JSON.toJSONString(list));
        heartbeatReportRequest.setTimestamp(v2s.o().C().getServerTime());
        heartbeatReportRequest.setIncRemainTime(j2);
        heartbeatReportRequest.setRemainTime(j3);
        heartbeatReportRequest.setExtra(hashMap);
        HashMap hashMap2 = new HashMap();
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next != null && (split = next.split(":")) != null) {
                if (split.length == 4) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", (Object) split[1]);
                    jSONObject.put("type", (Object) split[2]);
                    jSONObject.put("t", (Object) split[3]);
                    String str3 = split[0];
                    str3.hashCode();
                    char c = 65535;
                    switch (str3.hashCode()) {
                        case 49:
                            if (str3.equals("1")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 50:
                            if (str3.equals("2")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 51:
                            if (str3.equals("3")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 48625:
                            if (str3.equals("100")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            jSONArray.add(jSONObject);
                            continue;
                        case 1:
                            jSONArray2.add(jSONObject);
                            continue;
                        case 2:
                            jSONArray3.add(jSONObject);
                            continue;
                        case 3:
                            jSONArray4.add(jSONObject);
                            continue;
                    }
                }
            }
        }
        hashMap2.put("step1", jSONArray);
        hashMap2.put("step2", jSONArray2);
        hashMap2.put("step3", jSONArray3);
        hashMap2.put("step100", jSONArray4);
        heartbeatReportRequest.setReceiveMsg(hashMap2);
        n(1, heartbeatReportRequest, HeartbeatReportResponse.class);
    }
}
