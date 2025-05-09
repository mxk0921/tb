package tb;

import android.app.Application;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.tao.Globals;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class u7j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481297627);
    }

    public static MtopBusiness a(String str, String str2, Map<String, String> map, IRemoteBaseListener iRemoteBaseListener, boolean z, boolean z2) {
        TBLocationDTO a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("d58ed164", new Object[]{str, str2, map, iRemoteBaseListener, new Boolean(z), new Boolean(z2)});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(str);
        mtopRequest.setVersion(str2);
        mtopRequest.setNeedEcode(z);
        if (map != null) {
            mtopRequest.setData(JSON.toJSONString(map));
        }
        MtopBusiness build = MtopBusiness.build(mtopRequest, caa.n());
        if (lg4.v1() && (a2 = mch.Companion.a()) != null) {
            build.getMtopInstance().setCoordinates(a2.longitude, a2.latitude);
        }
        if (iRemoteBaseListener != null) {
            build.registerListener((IRemoteListener) iRemoteBaseListener);
        }
        if (z2) {
            build.reqMethod(MethodEnum.POST);
        }
        build.startRequest();
        return build;
    }

    public static Pair<String, String> b() {
        PositionInfo i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("98e5fe97", new Object[0]);
        }
        Application application = Globals.getApplication();
        if (application == null || (i = o78.i(application)) == null || i.countryNumCode == null) {
            return null;
        }
        return new Pair<>(r4p.KEY_COUNTRY_NUM, i.countryNumCode);
    }

    public static Map<String, String> c(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cf70117", new Object[]{str, map});
        }
        if (!lg4.v0()) {
            return map;
        }
        HashMap hashMap = new HashMap();
        if (map != null && !map.isEmpty()) {
            HashMap hashMap2 = new HashMap();
            List asList = Arrays.asList(lg4.D2());
            List asList2 = Arrays.asList(lg4.y2());
            List asList3 = Arrays.asList(lg4.A2());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    if (asList3.contains(key)) {
                        hashMap.put(key, value);
                    } else if (asList2.contains(key)) {
                        hashMap.put(key, value);
                    } else if (asList.contains(key)) {
                        hashMap.put(key, value);
                    } else {
                        hashMap2.put(key, value);
                    }
                }
            }
            if (Arrays.asList(lg4.E2()).contains(str)) {
                hashMap.put("passThroughParams", JSON.toJSONString(hashMap2));
            }
        }
        return hashMap;
    }
}
