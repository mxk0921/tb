package tb;

import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class r9v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(83886343);
    }

    public static String a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d50634a", new Object[]{mtopResponse});
        }
        if (mtopResponse == null) {
            return "";
        }
        Map<String, List<String>> headerFields = mtopResponse.getHeaderFields();
        String str = (headerFields == null || headerFields.get(HttpConstant.EAGLE_EYE_ID_2) == null) ? null : headerFields.get(HttpConstant.EAGLE_EYE_ID_2).get(0);
        return str == null ? "" : str;
    }
}
