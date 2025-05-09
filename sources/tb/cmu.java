package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.trtc.utils.TrtcLog;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class cmu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile Map<String, String> f17158a = null;
    public static final AtomicBoolean b = new AtomicBoolean(false);

    static {
        t2o.a(395313593);
    }

    public static synchronized void a() {
        synchronized (cmu.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cfe36af8", new Object[0]);
                return;
            }
            if (OrangeConfig.getInstance() != null) {
                OrangeConfig.getInstance().unregisterListener(new String[]{"artc_sdk"});
            }
            b.set(false);
        }
    }

    public static synchronized String c() {
        synchronized (cmu.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d13b8214", new Object[0]);
            } else if (f17158a == null) {
                return "";
            } else {
                return JSON.toJSONString(f17158a);
            }
        }
    }

    public static float d(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86205bd9", new Object[]{str, new Float(f)})).floatValue();
        }
        if (f17158a == null) {
            return f;
        }
        String str2 = f17158a.get(str);
        if (str2 == null) {
            return f;
        }
        if (str2.length() != 0) {
            try {
            } catch (Throwable unused) {
                return f;
            }
        }
        return Float.parseFloat(str2);
    }

    public static int e(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("235381ac", new Object[]{str, new Integer(i)})).intValue();
        }
        if (f17158a == null) {
            return i;
        }
        String str2 = f17158a.get(str);
        if (str2 == null) {
            return i;
        }
        if (str2.length() != 0) {
            try {
            } catch (Throwable unused) {
                return i;
            }
        }
        return Integer.parseInt(str2);
    }

    public static String f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{str, str2});
        }
        if (f17158a == null) {
            return str2;
        }
        String str3 = f17158a.get(str);
        if (str3 == null || str3.length() == 0) {
            return str2;
        }
        return str3;
    }

    public static synchronized void g() {
        synchronized (cmu.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b110817", new Object[0]);
                return;
            }
            AtomicBoolean atomicBoolean = b;
            if (!atomicBoolean.get()) {
                if (OrangeConfig.getInstance() == null) {
                    TrtcLog.j("TrtcOrange", "OrangeConfig instance is null.");
                    return;
                }
                j(OrangeConfig.getInstance().getConfigs("artc_sdk"));
                OrangeConfig.getInstance().registerListener(new String[]{"artc_sdk"}, new obk() { // from class: tb.bmu
                    @Override // tb.obk
                    public final void onConfigUpdate(String str, Map map) {
                        cmu.h(str, map);
                    }
                }, true);
                atomicBoolean.set(true);
            }
        }
    }

    public static synchronized void h(String str, Map<String, String> map) {
        synchronized (cmu.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{str, map});
                return;
            }
            TrtcLog.j("TrtcOrange", "onConfigUpdate nameSpace: " + str + " ,args: " + map);
            j(OrangeConfig.getInstance().getConfigs("artc_sdk"));
            StringBuilder sb = new StringBuilder("onConfigUpdate configs: ");
            sb.append(f17158a);
            TrtcLog.j("TrtcOrange", sb.toString());
            if (f17158a != null) {
                i(f17158a);
            }
        }
    }

    public static void i(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71ac8332", new Object[]{map});
            return;
        }
        String jSONString = JSON.toJSONString(map);
        if (!TextUtils.isEmpty(jSONString)) {
            try {
                ulu.a(rlu.f27461a, "TrtcOrangeConfigs", jSONString);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void j(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0f450b2", new Object[]{map});
        } else if (map != null) {
            TrtcLog.j("TrtcOrange", "updateCurOrangeConfigs: " + map);
            f17158a = map;
        }
    }

    public static boolean b(String str, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eafd5b07", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        return (f17158a == null || (str2 = f17158a.get(str)) == null || str2.length() == 0) ? z : str2.equalsIgnoreCase("true") || str2.equals("1");
    }
}
