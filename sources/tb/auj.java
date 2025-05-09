package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.network.http.HttpType;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class auj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_TIMEOUT_MS = 3000;

    /* renamed from: a  reason: collision with root package name */
    public final String f16012a;
    public final String b;
    public final Map<String, String> c;
    public final String d;
    public final HttpType e;
    public final int f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f16013a;
        public String b;
        public final Map<String, String> c = new HashMap();
        public String d;
        public HttpType e;
        public int f;

        static {
            t2o.a(843055229);
        }

        public auj a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (auj) ipChange.ipc$dispatch("27843255", new Object[]{this});
            }
            return new auj(this.f16013a, this.b, this.c, this.d, this.e, this.f);
        }

        public b b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("9b81eaec", new Object[]{this, str, str2});
            }
            ((HashMap) this.c).put(str, str2);
            return this;
        }

        public b c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("b8930a8a", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public b d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("86877bc9", new Object[]{this, str});
            }
            this.f16013a = str;
            return this;
        }

        public b e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("190b07f2", new Object[]{this, new Integer(i)});
            }
            this.f = i;
            return this;
        }

        public b f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d957e422", new Object[]{this, str});
            }
            HttpType httpType = HttpType.json;
            if (httpType.name().equals(str)) {
                this.e = httpType;
            } else {
                HttpType httpType2 = HttpType.jsonp;
                if (httpType2.name().equals(str)) {
                    this.e = httpType2;
                } else {
                    HttpType httpType3 = HttpType.base64;
                    if (httpType3.name().equals(str)) {
                        this.e = httpType3;
                    } else {
                        HttpType httpType4 = HttpType.arraybuffer;
                        if (httpType4.name().equals(str)) {
                            this.e = httpType4;
                        } else {
                            this.e = HttpType.text;
                        }
                    }
                }
            }
            return this;
        }

        public b g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("8f11d893", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }
    }

    static {
        t2o.a(843055227);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8904be1", new Object[]{this});
        }
        return this.d;
    }

    public Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this});
        }
        return this.c;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e63d782", new Object[]{this});
        }
        return this.f16012a;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e838025", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public HttpType e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpType) ipChange.ipc$dispatch("929fcca2", new Object[]{this});
        }
        return this.e;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.b;
    }

    public auj(String str, String str2, Map<String, String> map, String str3, HttpType httpType, int i) {
        IpChange ipChange = HttpType.$ipChange;
        this.f = 3000;
        this.f16012a = str;
        this.b = str2;
        this.c = map;
        this.d = str3;
        this.e = httpType;
        this.f = i == 0 ? 3000 : i;
    }
}
