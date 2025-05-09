package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class zzo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "TBSearch";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String POINT_NAME = "SearchMUSCustomReport";

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static class a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public static final b f33123a = new b();

            static {
                t2o.a(815792221);
            }

            public static /* synthetic */ b a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (b) ipChange.ipc$dispatch("d184b681", new Object[0]);
                }
                return f33123a;
            }
        }

        static {
            t2o.a(815792220);
        }

        public static b a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("2b887ba9", new Object[0]);
            }
            return a.a();
        }

        public void b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("868834de", new Object[]{this, jSONObject});
            } else {
                AppMonitor.Counter.commit(zzo.MODULE_NAME, POINT_NAME, jSONObject.toJSONString(), 1.0d);
            }
        }

        public b() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String KEY_TYPE = "type";
        public static final String POINT_NAME = "SRPSystemRebuild";
        public static final String TYPE_SYSTEM_REBUILD = "system_rebuild";
        public static volatile c b = null;

        /* renamed from: a  reason: collision with root package name */
        public boolean f33124a = false;

        static {
            t2o.a(815792225);
        }

        public static c a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("acb12202", new Object[0]);
            }
            if (b == null) {
                synchronized (c.class) {
                    try {
                        if (b == null) {
                            b = new c();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return b;
        }

        public void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7d6c7b5e", new Object[]{this, new Boolean(z)});
            } else {
                this.f33124a = z;
            }
        }

        public void c(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("868834de", new Object[]{this, jSONObject});
            } else if (this.f33124a) {
                AppMonitor.Counter.commit(zzo.MODULE_NAME, POINT_NAME, jSONObject.toJSONString(), 1.0d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String POINT_NAME = "SearchTemplateDegraded";

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static class a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public static final e f33126a = new e();

            static {
                t2o.a(815792229);
            }

            public static /* synthetic */ e a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (e) ipChange.ipc$dispatch("38fa4515", new Object[0]);
                }
                return f33126a;
            }
        }

        static {
            t2o.a(815792228);
        }

        public static e a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("a9eadfef", new Object[0]);
            }
            return a.a();
        }

        public void b(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9493e8b0", new Object[]{this, str, str2, str3});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("page", (Object) str);
            jSONObject.put("tItemType", (Object) str2);
            jSONObject.put("originTItemType", (Object) str3);
            AppMonitor.Counter.commit(zzo.MODULE_NAME, POINT_NAME, jSONObject.toJSONString(), 1.0d);
        }

        public e() {
        }
    }

    static {
        t2o.a(815792218);
    }

    public void onEvent(y5p y5pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96aaeca9", new Object[]{this, y5pVar});
        } else if (!y5pVar.b && !y5pVar.c) {
            a0p.c("network", y5pVar.j);
            a0p.c("parseData", y5pVar.k);
            a0p.a("uiShown");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String KEY_CODE = "code";
        public static final String KEY_MSG = "msg";
        public static final String KEY_TYPE = "type";
        public static final String POINT_NAME = "SearchDoorSuggest";
        public static final String TYPE_FAILURE = "failure";
        public static final String TYPE_SUCCESS = "success_with_data";
        public static final String TYPE_SUCCESS_WITH_EMPTY_DATA = "success_with_empty_data";

        /* renamed from: a  reason: collision with root package name */
        public final HashMap<String, String> f33125a = new HashMap<>();
        public boolean b = false;
        public static final String[] extraParamsKeys = {"q", ia0.PARAM_SEARCHDOOR_FROM, "src", "area", "tab", "channelSrp"};
        public static volatile d c = null;

        public static d b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("719e9a2b", new Object[0]);
            }
            if (c == null) {
                synchronized (d.class) {
                    try {
                        if (c == null) {
                            c = new d();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return c;
        }

        public Map<String, String> a(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("9304f88d", new Object[]{this, str, map});
            }
            HashMap hashMap = new HashMap();
            hashMap.put("type", str);
            if (map != null) {
                hashMap.putAll(map);
            }
            return hashMap;
        }

        public void c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7d6c7b5e", new Object[]{this, new Boolean(z)});
            } else {
                this.b = z;
            }
        }

        public void d(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba8af658", new Object[]{this, map});
            } else if (this.b) {
                this.f33125a.clear();
                if (map != null && !map.isEmpty()) {
                    this.f33125a.putAll(map);
                }
            }
        }

        public void e(Map<String, String> map) {
            String[] strArr;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("793214f3", new Object[]{this, map});
            } else if (this.b) {
                if (map == null) {
                    map = new HashMap<>();
                }
                if (!this.f33125a.isEmpty()) {
                    for (String str : extraParamsKeys) {
                        String str2 = this.f33125a.get(str);
                        if (!TextUtils.isEmpty(str2)) {
                            map.put(str, str2);
                        }
                    }
                }
                AppMonitor.Counter.commit(zzo.MODULE_NAME, POINT_NAME, JSON.toJSONString(map), 1.0d);
                this.f33125a.clear();
            }
        }

        static {
            t2o.a(815792226);
        }
    }
}
