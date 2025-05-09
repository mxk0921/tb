package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.bhxbridge.BHXCXXInnerBridge;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class oy8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f25745a = "__NULL__";
    public static Context b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(404750494);
        }

        public static String a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
            }
            SharedPreferences c = c(str);
            if (c != null) {
                return c.getString(str2, str3);
            }
            return str3;
        }

        public static void b(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b40669c8", new Object[]{str, str2, str3});
                return;
            }
            SharedPreferences c = c(str);
            if (c != null) {
                SharedPreferences.Editor edit = c.edit();
                edit.putString(str2, str3);
                edit.commit();
            }
        }

        public static SharedPreferences c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences) ipChange.ipc$dispatch("6cb3acc2", new Object[]{str});
            }
            Context a2 = oy8.a();
            if (a2 == null) {
                a2 = f82.d();
            }
            if (a2 != null) {
                return m7l.a(a2, str, 0);
            }
            return null;
        }

        public static String d(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2a22a2b4", new Object[]{str, str2, str3});
            }
            return a(str, str2, str3);
        }

        public static void e(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8797ddbc", new Object[]{str, str2, str3});
            } else {
                b(str, str2, str3);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public static final oy8 f25746a = new oy8();

        static {
            t2o.a(404750495);
        }
    }

    static {
        t2o.a(404750492);
    }

    public static /* synthetic */ Context a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("75941360", new Object[0]);
        }
        return b;
    }

    public static oy8 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oy8) ipChange.ipc$dispatch("2578f7b3", new Object[0]);
        }
        b = f82.d();
        return c.f25746a;
    }

    public String b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{this, str, str2, str3});
        }
        String d = b.d(str, str2, str3);
        if (TextUtils.equals(d, f25745a)) {
            return str3;
        }
        return d;
    }

    public void e(Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24237e23", new Object[]{this, map});
        } else if (map == null) {
            TLog.loge("BehaviX", "FakeOrangeConfig", "updateConfig lastestConfigs=null");
        } else if (gwv.v()) {
            SharedPreferences c2 = b.c(v82.INIT_FAST_GROUP_NAME);
            if (c2 != null) {
                SharedPreferences.Editor edit = c2.edit();
                edit.clear();
                for (String str2 : o0r.f25069a) {
                    if (map.containsKey(str2)) {
                        edit.putString(str2, map.get(str2));
                    }
                }
                edit.apply();
            }
        } else {
            for (String str3 : o0r.f25069a) {
                if (map.containsKey(str3)) {
                    str = map.get(str3);
                } else {
                    str = f25745a;
                }
                b.e(v82.INIT_FAST_GROUP_NAME, str3, str);
            }
        }
    }

    public oy8() {
    }

    public void d(String str, Map<String, String> map) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("660a7649", new Object[]{this, str, map});
        } else if (map == null) {
            TLog.loge("BehaviX", "FakeOrangeConfig", "updateConfig lastestConfigs=null");
        } else {
            SharedPreferences c2 = b.c(str);
            HashMap hashMap = new HashMap();
            if (c2 != null) {
                SharedPreferences.Editor edit = c2.edit();
                edit.clear();
                for (String str3 : map.keySet()) {
                    if (!o0r.allOrangeNoNeedKeys.contains(str3) && (str2 = map.get(str3)) != null) {
                        edit.putString(str3, str2);
                        hashMap.put(str3, str2);
                    }
                }
                edit.apply();
            }
            BHXCXXInnerBridge.notifyOrangeUpdate(hashMap, false);
        }
    }
}
