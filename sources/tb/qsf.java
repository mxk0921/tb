package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.internal.util.LogUtil;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qsf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_DESTORY = "JT_Destroy";
    public static final String EVENT_ENTER = "JT_Enter";
    public static final String EVENT_UPDATE_STAY_TIME = "JT_UpdateStayTime";

    /* renamed from: a  reason: collision with root package name */
    public final b f26905a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f26906a;
        public final String b;
        public String c;
        public String d;
        public long e;
        public final Map<String, Long> g = new HashMap();
        public final Map<String, Object> h = new HashMap();
        public final long f = System.currentTimeMillis();

        static {
            t2o.a(1034944539);
        }

        public b(String str) {
            this.b = str;
        }

        public static /* synthetic */ String a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("93c43a1d", new Object[]{bVar});
            }
            return bVar.f26906a;
        }

        public static /* synthetic */ String b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9492b89e", new Object[]{bVar});
            }
            return bVar.b;
        }

        public static /* synthetic */ String c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9561371f", new Object[]{bVar});
            }
            bVar.getClass();
            return null;
        }

        public static /* synthetic */ String d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("962fb5a0", new Object[]{bVar});
            }
            bVar.getClass();
            return null;
        }

        public static /* synthetic */ String e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("96fe3421", new Object[]{bVar});
            }
            bVar.getClass();
            return null;
        }

        public static /* synthetic */ String f(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("97ccb2a2", new Object[]{bVar});
            }
            return bVar.c;
        }

        public static /* synthetic */ String g(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("989b3123", new Object[]{bVar});
            }
            return bVar.d;
        }

        public static /* synthetic */ long h(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2afb4c70", new Object[]{bVar})).longValue();
            }
            return bVar.f;
        }

        public static /* synthetic */ long i(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("30ff17cf", new Object[]{bVar})).longValue();
            }
            return bVar.e;
        }

        public b j(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d3d67146", new Object[]{this, str, obj});
            }
            ((HashMap) this.h).put(str, obj);
            return this;
        }

        public b k(Map<String, Long> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("90058775", new Object[]{this, map});
            }
            ((HashMap) this.g).clear();
            ((HashMap) this.g).putAll(map);
            return this;
        }

        public b l(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("80254eba", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public qsf m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qsf) ipChange.ipc$dispatch("3a873c96", new Object[]{this});
            }
            return new qsf(this);
        }

        public void n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("de536fbd", new Object[]{this});
            } else {
                m().b();
            }
        }

        public b o(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("a987f775", new Object[]{this, str});
            }
            this.f26906a = str;
            return this;
        }

        public b p(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f20d5ebc", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public b q(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c61fac1", new Object[]{this, new Long(j)});
            }
            this.e = j;
            return this;
        }
    }

    static {
        t2o.a(1034944537);
    }

    public static b a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("15bc6055", new Object[]{str});
        }
        return new b(str);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de536fbd", new Object[]{this});
        } else {
            stf.a(this);
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2004c95", new Object[]{this});
        }
        if (b.b(this.f26905a) != null) {
            return b.b(this.f26905a);
        }
        return "";
    }

    public Map d() {
        Exception e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("da2ef722", new Object[]{this});
        }
        HashMap hashMap = null;
        try {
            hashMap = new HashMap();
            try {
                if (b.a(this.f26905a) != null) {
                    hashMap.put("pageName", b.a(this.f26905a));
                }
                if (b.b(this.f26905a) != null) {
                    hashMap.put("event", b.b(this.f26905a));
                }
                if (b.c(this.f26905a) != null) {
                    hashMap.put("arg1", b.c(this.f26905a));
                }
                if (b.d(this.f26905a) != null) {
                    hashMap.put("arg2", b.d(this.f26905a));
                }
                if (b.e(this.f26905a) != null) {
                    hashMap.put("arg3", b.e(this.f26905a));
                }
                if (b.f(this.f26905a) != null) {
                    hashMap.put("args", b.f(this.f26905a));
                }
                if (b.g(this.f26905a) != null) {
                    hashMap.put("pvID", b.g(this.f26905a));
                }
                if (!((HashMap) this.f26905a.g).isEmpty()) {
                    hashMap.put("areaStayTime", this.f26905a.g);
                }
                hashMap.put("currentUnixTime", Long.valueOf(b.h(this.f26905a)));
                hashMap.put("displayTime", Long.valueOf(b.i(this.f26905a)));
                hashMap.putAll(this.f26905a.h);
            } catch (Exception e2) {
                e = e2;
                LogUtil.e("JTEvent", "json err", e);
                return hashMap;
            }
        } catch (Exception e3) {
            e = e3;
        }
        return hashMap;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        if (b.a(this.f26905a) != null) {
            return b.a(this.f26905a);
        }
        return "";
    }

    public qsf(b bVar) {
        this.f26905a = bVar;
    }
}
