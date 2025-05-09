package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.MtopInfo;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class epq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262840);
    }

    public static String a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d50634a", new Object[]{mtopResponse});
        }
        if (mtopResponse != null) {
            try {
                if (mtopResponse.getHeaderFields() != null) {
                    Map<String, List<String>> headerFields = mtopResponse.getHeaderFields();
                    if (headerFields.containsKey("eagleeye-traceid")) {
                        return headerFields.get("eagleeye-traceid").get(0);
                    }
                }
            } catch (Exception e) {
                tgh.b("StreamDataUtils", "getTraceId exception:" + e);
            }
        }
        return "";
    }

    public static boolean d(MtopInfo mtopInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("380e38e2", new Object[]{mtopInfo})).booleanValue();
        }
        if (mtopInfo == null) {
            return false;
        }
        return e(mtopInfo.a());
    }

    public static boolean b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("875f6303", new Object[]{map})).booleanValue();
        }
        return map != null && Boolean.parseBoolean(map.get("updateWithCustomApi")) && "true".equals(map.get("streamMode")) && vbl.x0();
    }

    public static boolean c(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5e1a78e", new Object[]{map})).booleanValue();
        }
        return map != null && map.containsKey("x-used-stream");
    }

    public static boolean e(MtopResponse mtopResponse) {
        Map<String, List<String>> headerFields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6d82503", new Object[]{mtopResponse})).booleanValue();
        }
        return (mtopResponse == null || (headerFields = mtopResponse.getHeaderFields()) == null || !headerFields.containsKey("useStreamApi")) ? false : true;
    }
}
