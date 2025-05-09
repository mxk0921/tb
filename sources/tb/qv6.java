package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.b;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qv6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DebugUtil";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ Map f;

        public a(String str, String str2, String str3, String str4, Map map) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = map;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/testutils/DebugUtil$1");
        }

        @Override // tb.m02
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                qv6.b(this.b, this.c, this.d, this.e, this.f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static Boolean f26950a;
        public static Map<String, String> b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static class a extends TypeReference<Map<String, String>> {
        }

        static {
            t2o.a(404750690);
        }

        public static /* synthetic */ Map a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]);
            }
            return b;
        }

        public static void b(String str, String str2, boolean z, String str3) {
            long j;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("36b578a2", new Object[]{str, str2, new Boolean(z), str3});
                return;
            }
            dn1 c = dn1.c();
            if (z) {
                j = System.currentTimeMillis();
            } else {
                j = 0;
            }
            c.g(str, j);
            dn1.c().h(str2, str3);
        }

        public static boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fb924a67", new Object[0])).booleanValue();
            }
            return e("logDebugCacheTime", "logDebugCacheParam", TimeUnit.HOURS, 4L);
        }

        public static boolean e(String str, String str2, TimeUnit timeUnit, long j) {
            long d;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("13c04f87", new Object[]{str, str2, timeUnit, new Long(j)})).booleanValue();
            }
            if (f26950a == null) {
                try {
                    d = dn1.c().d(str, 0L);
                } catch (Exception unused) {
                }
                if (d == 0) {
                    return false;
                }
                if (System.currentTimeMillis() - d < timeUnit.toMillis(j)) {
                    g(str, str2, dn1.c().e(str2), false);
                }
                f26950a = Boolean.valueOf(Boolean.TRUE.equals(f26950a));
            }
            return f26950a.booleanValue();
        }

        public static void f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7ba84e09", new Object[]{new Boolean(z)});
            } else {
                f26950a = Boolean.valueOf(z);
            }
        }

        public static void g(String str, String str2, String str3, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("afb89851", new Object[]{str, str2, str3, new Boolean(z)});
                return;
            }
            b = (Map) JSON.parseObject(str3, new a(), new Feature[0]);
            f(true);
            b(str, str2, true, str3);
        }

        public static void h(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("790c5f65", new Object[]{str, new Boolean(z)});
            } else {
                g("logDebugCacheTime", "logDebugCacheParam", str, z);
            }
        }

        public static void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b32a153", new Object[]{str});
            } else {
                b("logLevelCacheTime", "defalutCachedLogLevel", true, str);
            }
        }
    }

    static {
        t2o.a(404750688);
    }

    public static void a(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb3d74f5", new Object[]{str, str2, str3, str4, map});
        } else {
            g(str, str2, str3, str4, map);
        }
    }

    public static /* synthetic */ void b(String str, String str2, String str3, String str4, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba640454", new Object[]{str, str2, str3, str4, map});
        } else {
            d(str, str2, str3, str4, map);
        }
    }

    public static void c(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b98a93b3", new Object[]{str, str2, str3, str4, map});
        } else {
            kiq.c(new a(str, str2, str3, str4, map));
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ebd0169", new Object[0]);
        } else if (b.d()) {
            g("uploadDB", "", "", bsu.i().g(), b.a());
        }
    }

    public static void f(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd827ed5", new Object[]{str, str2, str3, str4});
        } else if (b.a() != null || b.d()) {
            HashMap hashMap = new HashMap(b.a());
            hashMap.put("uploadSource", "log");
            g(str, str2, str3, str4, hashMap);
        }
    }

    public static void g(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43d6732", new Object[]{str, str2, str3, str4, map});
        } else if (b.d()) {
            c(str, str2, str3, str4, map);
        }
    }

    public static void h(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a51bd0", new Object[]{str, str2, str3, str4, map});
        } else if (b.d()) {
            if (map == null) {
                map = new HashMap<>();
            }
            map.putAll(b.a());
            c(str, str2, str3, str4, map);
        }
    }

    public static void d(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8b12312", new Object[]{str, str2, str3, str4, map});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.cttp.mi.logs.upload");
        mtopRequest.setVersion("2.0");
        mtopRequest.setNeedEcode(false);
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            jSONObject.putAll(map);
        }
        jSONObject.put("timestamp", (Object) Long.valueOf(bwt.b()));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("arg1", (Object) str);
        jSONObject2.put("arg2", (Object) str2);
        jSONObject2.put("arg3", (Object) str3);
        jSONObject2.put("args", (Object) str4);
        jSONObject.put(PopConst.POP_UPLOAD_DATA_KEY, (Object) jSONObject2.toString());
        mtopRequest.setData(jSONObject.toString());
        RemoteBusiness build = RemoteBusiness.build(mtopRequest, f82.g());
        build.reqMethod(MethodEnum.POST);
        build.startRequest();
    }
}
