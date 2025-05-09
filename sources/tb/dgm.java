package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.device.UTDevice;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class dgm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements xrg {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.xrg
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bdd26f3", new Object[]{this, jSONObject});
                return;
            }
            irg.a("link_tag", "PopMtopRequest === getMsgFromServer: onSuccess：" + jSONObject);
        }

        @Override // tb.xrg
        public void b(JSONObject jSONObject, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29c4da98", new Object[]{this, jSONObject, str});
                return;
            }
            irg.b("link_tag", "PopMtopRequest === getMsgFromServer: onError：" + jSONObject + " === retMsg=" + str);
        }
    }

    static {
        t2o.a(1030750320);
    }

    public static void a(Context context, int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c8e63a", new Object[]{context, new Integer(i)});
            return;
        }
        int f = zhm.f(context);
        if (zhm.n(zhm.g(context), jsg.f())) {
            i2 = f;
        }
        if (!c(context, i)) {
            irg.a("link_tag", "PopMtopRequest === getMsgFromServer == 校验失败，不发起网络请求");
            return;
        }
        zhm.s(context, i2 + 1);
        zhm.t(context, jsg.f());
        HashMap hashMap = new HashMap();
        hashMap.put("scene", "float_push_intention");
        hashMap.put("action", "PUSH");
        hashMap.put("bizKey", "AUGE_ASYNC");
        irg.a("link_tag", "PopMtopRequest === getMsgFromServer == 请求参数：" + hashMap);
        esg.b("msg_request_type", i + "", "", null);
        zpg.b().d(zpg.GET_MSG_API, "1.0", hashMap, false, false, true, new a());
    }

    public static boolean b(Context context) {
        String g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89e03344", new Object[]{context})).booleanValue();
        }
        try {
            g = aqg.g(context, "mtopRequestPeriod", "01:45-23:15");
        } catch (Exception e) {
            irg.b("link_tag", "PopMtopRequest === isInRequestPeriod == 异常:" + e);
        }
        if (TextUtils.isEmpty(g)) {
            return false;
        }
        String[] split = g.split("-");
        if (split.length < 2) {
            return false;
        }
        String str = split[0];
        String str2 = split[1];
        String c = zhm.c();
        int compareTo = c.compareTo(str);
        int compareTo2 = c.compareTo(str2);
        if (compareTo <= 0 || compareTo2 >= 0) {
            irg.a("link_tag", "PopMtopRequest === isInRequestPeriod == 当前时间点不在config范围内:".concat(g));
            return false;
        }
        irg.a("link_tag", "PopMtopRequest === isInRequestPeriod == 当前时间点在config范围内: ".concat(g));
        return true;
    }

    public static boolean c(Context context, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0cb6ad8", new Object[]{context, new Integer(i)})).booleanValue();
        }
        if (!b(context)) {
            irg.a("link_tag", "PopMtopRequest === isShouldRequest == 不在支持的请求时间段内，不请求服务端");
            esg.b(esg.ARG1_NOT_IN_REQUEST_TIME, i + "", "", null);
            return false;
        } else if (!zhm.k(context, i)) {
            irg.a("link_tag", "PopMtopRequest === isShouldRequest == 不在支持的请求场景，不请求服务端");
            esg.b(esg.ARG1_NOT_IN_REQUEST_SCENCE, "", "", null);
            return false;
        } else if (!ssj.c(context)) {
            irg.a("link_tag", "PopMtopRequest === isShouldRequest == 网络链接不正常，不请求服务端");
            esg.b(esg.ARG1_NETWORK_NOT_CONNECTED, "", "", null);
            return false;
        } else if (!jsg.a(context)) {
            esg.b(esg.ARG1_POP_NOT_IN_PERMISSION, "", "", null);
            irg.a("link_tag", "PopMtopRequest === isShouldRequest == 没有悬浮窗权限，不请求网络");
            return false;
        } else if (!zhm.l(context)) {
            irg.a("link_tag", "PopMtopRequest === isShouldRequest == 机型和系统版本，不支持桌面push");
            esg.b(esg.ARG1_POP_NOT_IN_WHITELIST, "", "", null);
            return false;
        } else {
            int f = zhm.f(context);
            try {
                i2 = Integer.parseInt(aqg.g(context, "maxMtopRequestCount", "3"));
            } catch (Exception e) {
                irg.b("link_tag", "PopMtopRequest === isShouldRequest == 类型转换异常：" + e);
                i2 = 0;
            }
            if (!zhm.n(zhm.g(context), jsg.f()) || f <= i2) {
                try {
                    if (Math.abs(UTDevice.getUtdid(context).hashCode()) % 100 > Integer.parseInt(aqg.g(context, "greyRandomCount", "100"))) {
                        irg.a("link_tag", "PopMtopRequest === isShouldRequest == 未命中灰度，不发发起网络请求");
                        return false;
                    }
                } catch (Exception e2) {
                    irg.b("link_tag", "PopMtopRequest === isShouldRequest == 灰度边界数据解析，类型转换异常：" + e2);
                }
                return true;
            }
            irg.a("link_tag", "PopMtopRequest === isShouldRequest == 请求超过" + i2 + "次, 不在发起请求");
            return false;
        }
    }
}
