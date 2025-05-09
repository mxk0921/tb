package tb;

import android.text.TextUtils;
import com.alibaba.android.umbrella.link.export.UMDimKey;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.utils.baseutils.linklog.ILinkLogAdapter;
import com.taobao.informationflowdataservice.dataservice.utils.baseutils.linklog.RecommendLinkLogAdapter;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class jrg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHILD_BIZ = "homepage_track";
    public static final String MAIN_BIZ = "Page_Home";

    /* renamed from: a  reason: collision with root package name */
    public static final ILinkLogAdapter f22174a = new RecommendLinkLogAdapter();

    static {
        t2o.a(487587979);
    }

    public static void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d68fbbcd", new Object[]{str, str2, str3, str4, str5, map, str6, str7});
            return;
        }
        ILinkLogAdapter iLinkLogAdapter = f22174a;
        if (iLinkLogAdapter != null) {
            iLinkLogAdapter.commitFailure(str, str2, str3, str4, str5, map, str6, str7);
        }
    }

    public static void b(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec5cd960", new Object[]{str, str2, str3, str4, str5, map});
            return;
        }
        ILinkLogAdapter iLinkLogAdapter = f22174a;
        if (iLinkLogAdapter != null) {
            iLinkLogAdapter.commitSuccess(str, str2, str3, str4, str5, map);
        }
    }

    public static void c(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dbe73dd", new Object[]{str, str2, str3, str4, str5});
        } else if (f22174a != null) {
            d("Page_Home", "homepage_track", str, str2, str3, str4, str5);
        }
    }

    public static void d(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        cyu cyuVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a305be71", new Object[]{str, str2, str3, str4, str5, str6, str7});
        } else if (f22174a != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5)) {
            if (TextUtils.isEmpty(str6) || TextUtils.isEmpty(str7)) {
                cyuVar = null;
            } else {
                cyuVar = cyu.a(str6, str7);
            }
            g(str, str2, str3, null, null, cyuVar);
        }
    }

    public static void e(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddfd5ab7", new Object[]{str, str2, str3});
        } else if (f22174a != null) {
            f("Page_Home", "homepage_track", str, str2, str3);
        }
    }

    public static void f(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c133c04b", new Object[]{str, str2, str3, str4, str5});
        } else if (f22174a != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5)) {
            g(str, str2, str3, null, null, cyu.a(str4, str5));
        }
    }

    public static void g(String str, String str2, String str3, ayu ayuVar, Map<UMDimKey, Object> map, cyu cyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6614f406", new Object[]{str, str2, str3, ayuVar, map, cyuVar});
            return;
        }
        ILinkLogAdapter iLinkLogAdapter = f22174a;
        if (iLinkLogAdapter != null) {
            iLinkLogAdapter.logInfo(str, str2, str3, ayuVar, map, cyuVar);
        }
    }
}
