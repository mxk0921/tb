package com.taobao.mrt.openapi;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.t2o;
import tb.uqh;
import tb.zqh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MRTOpenApi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "OpenApiTask";
    private static MRTOpenApi mInstance = new MRTOpenApi();

    static {
        t2o.a(577765394);
    }

    private MRTOpenApi() {
    }

    public static boolean findService(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfb37c51", new Object[]{str})).booleanValue();
        }
        if (zqh.d().e(str) != null) {
            return true;
        }
        return false;
    }

    public static MRTOpenApi getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRTOpenApi) ipChange.ipc$dispatch("83532c10", new Object[0]);
        }
        return mInstance;
    }

    public static boolean isServiceAllowed(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("350103d2", new Object[]{str})).booleanValue();
        }
        return true;
    }

    public static Map<String, Object> python_api(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("18e22ee8", new Object[]{str, str2, map});
        }
        uqh e = zqh.d().e(str);
        if (e == null) {
            return null;
        }
        return e.a(str2, map);
    }
}
