package tb;

import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.MtopStatistics;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ik {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(81789261);
    }

    public static String a(kk kkVar) {
        MtopResponse e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7aac1dc1", new Object[]{kkVar});
        }
        if (kkVar == null || (e = kkVar.e()) == null) {
            return null;
        }
        String b = b(e);
        if (!TextUtils.isEmpty(b)) {
            return b;
        }
        MtopStatistics mtopStat = e.getMtopStat();
        if (mtopStat != null) {
            return mtopStat.eagleEyeTraceId;
        }
        return null;
    }

    public static String b(MtopResponse mtopResponse) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8dd291a0", new Object[]{mtopResponse});
        }
        Map<String, List<String>> headerFields = mtopResponse.getHeaderFields();
        if (headerFields == null || (list = headerFields.get(HttpConstant.EAGLE_EYE_ID_2)) == null || list.size() < 1) {
            return null;
        }
        return list.get(0);
    }
}
