package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.MtopInfo;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class w7j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262817);
    }

    public static JSONObject a(MtopInfo mtopInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cf77c749", new Object[]{mtopInfo});
        }
        if (mtopInfo != null) {
            return d(mtopInfo.a());
        }
        tgh.b("MtopUtils", "mtopInfo is null");
        return null;
    }

    public static JSONObject b(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("72a2beb4", new Object[]{mtopResponse});
        }
        return d(mtopResponse);
    }

    public static JSONObject c(MtopResponse mtopResponse, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2d58b10f", new Object[]{mtopResponse, new Integer(i)});
        }
        if (i != 3) {
            return d(mtopResponse);
        }
        try {
            return d(mtopResponse);
        } catch (Exception e) {
            tgh.c("MtopUtils", "parse ERROR mtop data exception: ", e);
            return null;
        }
    }

    public static JSONObject d(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8e99bca5", new Object[]{mtopResponse});
        }
        if (mtopResponse == null) {
            tgh.b("MtopUtils", "mtopResponse is null");
            return null;
        }
        JSONObject originFastJsonObject = mtopResponse.getOriginFastJsonObject();
        if (originFastJsonObject != null || mtopResponse.getBytedata() == null) {
            return originFastJsonObject;
        }
        return JSON.parseObject(new String(mtopResponse.getBytedata()));
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8eacfb83", new Object[]{str})).booleanValue();
        }
        if (TextUtils.equals(y0i.API_NAME, str) || TextUtils.equals(y0i.API_NAME_SPRING_DEGRADE, str)) {
            return true;
        }
        return false;
    }

    public static String f(MtopInfo mtopInfo) {
        MtopResponse a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8203b976", new Object[]{mtopInfo});
        }
        if (mtopInfo == null || (a2 = mtopInfo.a()) == null) {
            return null;
        }
        return a2.getApi();
    }

    public static String g(MtopInfo mtopInfo) {
        MtopResponse a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea4bf0ea", new Object[]{mtopInfo});
        }
        if (mtopInfo == null || (a2 = mtopInfo.a()) == null) {
            return null;
        }
        return a2.getRetCode();
    }

    public static String h(MtopInfo mtopInfo) {
        MtopResponse a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3b01ca62", new Object[]{mtopInfo});
        }
        if (mtopInfo == null || (a2 = mtopInfo.a()) == null) {
            return null;
        }
        return a2.getRetMsg();
    }
}
