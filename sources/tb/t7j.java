package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.ReflectUtil;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class t7j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1034944714);
    }

    public static MethodEnum a(String str) {
        MethodEnum[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MethodEnum) ipChange.ipc$dispatch("6f39091a", new Object[]{str});
        }
        for (MethodEnum methodEnum : MethodEnum.values()) {
            if (methodEnum.getMethod().equalsIgnoreCase(str)) {
                return methodEnum;
            }
        }
        return null;
    }

    public static String c(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f69f714a", new Object[]{map, str});
        }
        if (map == null || str == null) {
            return null;
        }
        return map.remove(str);
    }

    public static Map<String, String> b(String str, String str2, int i, Map<String, String> map, int i2) {
        String str3;
        MethodEnum a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6ff68ab", new Object[]{str, str2, new Integer(i), map, new Integer(i2)});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(str);
        mtopRequest.setVersion(str2);
        mtopRequest.setNeedEcode(false);
        mtopRequest.setNeedSession(true);
        mtopRequest.setData(ReflectUtil.convertMapToDataStr(map));
        HashMap hashMap = new HashMap();
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        build.setConnectionTimeoutMilliSecond(i);
        build.setSocketTimeoutMilliSecond(i);
        String c = c(map, "__customDomain__");
        if (!TextUtils.isEmpty(c)) {
            build.setCustomDomain(c);
        }
        String c2 = c(map, "__requestMethod__");
        if (!TextUtils.isEmpty(c2) && (a2 = a(c2)) != null) {
            build.reqMethod(a2);
        }
        if (i2 == 1) {
            build.reqMethod(MethodEnum.POST);
        }
        MtopResponse syncRequest = build.syncRequest();
        if ("SUCCESS".equalsIgnoreCase(syncRequest.getRetCode())) {
            hashMap.put("success", "1");
            if (syncRequest.getBytedata() != null) {
                try {
                    str3 = new String(syncRequest.getBytedata(), "UTF-8");
                } catch (Exception unused) {
                }
                hashMap.put("result", str3);
            }
            str3 = null;
            hashMap.put("result", str3);
        } else {
            hashMap.put("success", "0");
            hashMap.put("errorCode", syncRequest.getRetCode() + "");
            hashMap.put("errorMsg", syncRequest.getRetMsg() + "");
            hashMap.put("result", "");
        }
        return hashMap;
    }
}
