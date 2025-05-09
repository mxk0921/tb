package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ldv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UMB_FEATURE_CAINIAO_ERROR = "cainiaoError";
    public static final String UMB_FEATURE_CATCH_EXCEPTION = "umbCatchException";
    public static final String UMB_FEATURE_CATCH_MAP_EXCEPTION = "umbCatchMApException";
    public static final String UMB_FEATURE_CONTAINER_CREATE_ERROR = "listContainerCreateError";
    public static final String UMB_FEATURE_DX_ERROR = "dxError";
    public static final String UMB_FEATURE_REQUEST_ERROR = "requestError";

    static {
        t2o.a(297795615);
    }

    public static void a(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("716ee568", new Object[]{context, str, str2, str3, str4, str5, map});
            return;
        }
        b(context, str2, str3, str4, str5, map);
        kor.b(str, str3, str4, str5, new String[0]);
    }

    public static void b(Context context, String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbf6db2", new Object[]{context, str, str2, str3, str4, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        ygb a2 = gcl.a();
        if (a2 != null) {
            a2.a(str, str2, str3, str4, map);
        }
    }

    public static void c(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e91c34d", new Object[]{context, str, str2, str3});
            return;
        }
        a(context, str, "cainiaoError", "dataError", str2 + "- Error", "核心参数 = " + str2 + " 错误原因 = " + str3, null);
    }

    public static void d(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1062529", new Object[]{context, str, str2});
        } else {
            a(context, str, "cainiaoError", "init ", " star cainiao native error", str2, null);
        }
    }

    public static void e(Context context, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f4e54c", new Object[]{context, str, str2, map});
        } else {
            a(context, str, UMB_FEATURE_CATCH_EXCEPTION, "exception", "executeWithException", str2, map);
        }
    }

    public static void f(Context context, String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7804dff5", new Object[]{context, str, str2, str3, map});
        } else {
            a(context, str, UMB_FEATURE_CONTAINER_CREATE_ERROR, "container View", str2, str3, map);
        }
    }

    public static void g(Context context, String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b3d2cf3", new Object[]{context, str, str2, str3, map});
        } else {
            a(context, str, "dxError", "parser", str2, str3, map);
        }
    }

    public static void h(Context context, String str, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dda0c4cf", new Object[]{context, str, mtopResponse});
            return;
        }
        a(context, str, "requestError", mtopResponse.getApi() + "-" + mtopResponse.getV(), mtopResponse.getRetCode(), mtopResponse.getRetMsg(), null);
    }
}
