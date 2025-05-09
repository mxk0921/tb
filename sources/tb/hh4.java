package tb;

import android.os.Build;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hh4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_CONFIG = "";
    public static final String ORANGE_CONFIG_BUSINESS = "mpm_business_switch";

    /* renamed from: a  reason: collision with root package name */
    public static final String f20637a = Build.BRAND.toLowerCase();
    public static final String b = Build.MODEL.replace(" ", "");
    public static final String c = Build.VERSION.RELEASE;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(588251184);
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("73519e11", new Object[]{this});
            }
            return null;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b1e50810", new Object[]{this});
            }
            return null;
        }

        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ec2889b8", new Object[]{this});
            }
            return null;
        }
    }

    static {
        t2o.a(588251183);
    }

    public static a a() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("dcbc6525", new Object[0]);
        }
        try {
            JSONObject parseObject = JSON.parseObject(OrangeConfig.getInstance().getConfig("mpm_business_switch", "PushCompatibleConfigs", ""));
            String str = f20637a;
            if (parseObject.containsKey(str)) {
                JSONObject jSONObject2 = parseObject.getJSONObject(str);
                String str2 = c;
                if (jSONObject2.containsKey(str2)) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject(str2);
                    String str3 = b;
                    if (jSONObject3.containsKey(str3)) {
                        jSONObject = jSONObject3.getJSONObject(str3);
                    } else {
                        jSONObject = jSONObject3.containsKey("defaultConfig") ? jSONObject3.getJSONObject("defaultConfig") : null;
                    }
                    if (jSONObject != null) {
                        return (a) JSON.parseObject(JSON.toJSONString(jSONObject), a.class);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f11d29b4", new Object[0])).booleanValue();
        }
        return "1".equals(OrangeConfig.getInstance().getConfig("mpm_business_switch", "isDisableSceneShowStyle", "0"));
    }
}
