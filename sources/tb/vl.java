package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class vl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(81789161);
    }

    public static String a(kk kkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("95b5bcd9", new Object[]{kkVar});
        }
        MtopResponse e = kkVar.e();
        if (e != null) {
            return e.getMappingCode();
        }
        return null;
    }

    public static int b(kk kkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d235f0b9", new Object[]{kkVar})).intValue();
        }
        MtopResponse e = kkVar.e();
        if (e != null) {
            return e.getResponseCode();
        }
        return 200;
    }

    public static String c(kk kkVar) {
        MtopResponse e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4e893794", new Object[]{kkVar});
        }
        if (kkVar == null || (e = kkVar.e()) == null) {
            return null;
        }
        Map<String, List<String>> headerFields = e.getHeaderFields();
        if (bh.b(headerFields)) {
            return null;
        }
        List<String> list = headerFields.get("eagleeye-traceid");
        if (bh.a(list)) {
            return null;
        }
        return list.get(0);
    }
}
