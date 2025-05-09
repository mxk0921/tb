package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qzo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NETWORK_MTOP_API_NAME = "network_mtop_api_name";
    public static final String NETWORK_MTOP_API_VERSION = "network_mtop_api_version";
    public static final String NETWORK_MTOP_DATA_JSON_STRING = "network_mtop_data_json_string";
    public static final String NETWORK_MTOP_NEED_ECODE = "network_mtop_need_ecode";

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, Object> f27023a = new HashMap<>();
    public final HashMap<String, Object> b = new HashMap<>();
    public Class c;

    static {
        t2o.a(463470629);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da110054", new Object[]{this});
        }
        return (String) f(NETWORK_MTOP_API_NAME);
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("46dbac5b", new Object[]{this});
        }
        return (String) f(NETWORK_MTOP_API_VERSION);
    }

    public Object d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3cbcc975", new Object[]{this, str});
        }
        return this.b.get(str);
    }

    public Map<String, Object> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a1a9926c", new Object[]{this});
        }
        return this.b;
    }

    public Object f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("955d4716", new Object[]{this, str});
        }
        return this.f27023a.get(str);
    }

    public Class g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("5d7ccf95", new Object[]{this});
        }
        return this.c;
    }

    public qzo h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qzo) ipChange.ipc$dispatch("2e01f48c", new Object[]{this, str});
        }
        l(NETWORK_MTOP_API_NAME, str);
        return this;
    }

    public qzo i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qzo) ipChange.ipc$dispatch("9a2b84cd", new Object[]{this, str});
        }
        l(NETWORK_MTOP_API_VERSION, str);
        return this;
    }

    public qzo j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qzo) ipChange.ipc$dispatch("58a4e22f", new Object[]{this, new Boolean(z)});
        }
        l(NETWORK_MTOP_NEED_ECODE, Boolean.valueOf(z));
        return this;
    }

    public qzo k(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qzo) ipChange.ipc$dispatch("5976ba57", new Object[]{this, str, obj});
        }
        if (str != null) {
            this.b.put(str, obj);
            return this;
        }
        throw new IllegalArgumentException("Property key can't be null");
    }

    public qzo l(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qzo) ipChange.ipc$dispatch("33ad426e", new Object[]{this, str, obj});
        }
        if (str != null) {
            this.f27023a.put(str, obj);
            return this;
        }
        throw new IllegalArgumentException("Property key can't be null");
    }

    public void m(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf3df61", new Object[]{this, cls});
        } else {
            this.c = cls;
        }
    }

    public void n(szo szoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adc40c06", new Object[]{this, szoVar});
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eecff67", new Object[]{this})).booleanValue();
        }
        Object f = f(NETWORK_MTOP_NEED_ECODE);
        if (f == null || !(f instanceof Boolean)) {
            return false;
        }
        return ((Boolean) f).booleanValue();
    }
}
