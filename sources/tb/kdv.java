package tb;

import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.android.umbrella.link.export.UMDimKey;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class kdv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final UMLinkLogInterface f22602a = hdv.a();

    static {
        t2o.a(153092154);
    }

    public static void a(String str, String str2, String str3, String str4, Map<UMDimKey, Object> map, cyu cyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("343c734a", new Object[]{str, str2, str3, str4, map, cyuVar});
        } else {
            f22602a.logError("ultron_common_page", str, str2, null, str3, str4, map, cyuVar);
        }
    }

    public static void b(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcca9ae6", new Object[]{str, str2, str3, str4, str5, map});
        } else {
            f22602a.commitFailure(str2, str3, "1.0", "ultron_common_page", str, map, str4, str5);
        }
    }

    public static void c(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ad95cdf", new Object[]{str, str2, str3, map});
        } else {
            f22602a.commitSuccess(str2, str3, "1.0", "ultron_common_page", str, map);
        }
    }
}
