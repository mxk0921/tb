package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.network.domain.NetworkStats;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class o9o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final h3o f25231a;
    public final int b;
    public final String c;
    public final Map<String, List<String>> d;
    public final q9o e;
    public final NetworkStats f;
    public final byte[] g;
    public final jpq h;
    public final JSONObject i;
    public final BaseOutDo j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public h3o f25232a;
        public int b = -1;
        public String c;
        public Map<String, List<String>> d;
        public q9o e;
        public NetworkStats f;
        public byte[] g;
        public jpq h;
        public JSONObject i;
        public BaseOutDo j;

        static {
            t2o.a(589300035);
        }

        public static /* synthetic */ jpq a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jpq) ipChange.ipc$dispatch("f92456f5", new Object[]{bVar});
            }
            return bVar.h;
        }

        public static /* synthetic */ JSONObject b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("98c3b564", new Object[]{bVar});
            }
            return bVar.i;
        }

        public static /* synthetic */ BaseOutDo c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BaseOutDo) ipChange.ipc$dispatch("733de6d", new Object[]{bVar});
            }
            return bVar.j;
        }

        public b d(q9o q9oVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("bcc20d54", new Object[]{this, q9oVar});
            }
            this.e = q9oVar;
            return this;
        }

        public o9o e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (o9o) ipChange.ipc$dispatch("56d85818", new Object[]{this});
            }
            if (this.f25232a != null) {
                return new o9o(this);
            }
            throw new IllegalStateException("request == null");
        }

        public b f(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("a2a2d30c", new Object[]{this, bArr});
            }
            this.g = bArr;
            return this;
        }

        public b g(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("6cf726bb", new Object[]{this, new Integer(i)});
            }
            this.b = i;
            return this;
        }

        public b h(Map<String, List<String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("dae32b04", new Object[]{this, map});
            }
            this.d = map;
            return this;
        }

        public b i(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("4a6bd784", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public b j(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("2e16188c", new Object[]{this, jSONObject});
            }
            this.i = jSONObject;
            return this;
        }

        public b k(BaseOutDo baseOutDo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("e42e7693", new Object[]{this, baseOutDo});
            }
            this.j = baseOutDo;
            return this;
        }

        public b l(h3o h3oVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("8398b4cf", new Object[]{this, h3oVar});
            }
            this.f25232a = h3oVar;
            return this;
        }

        public b m(NetworkStats networkStats) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("444af094", new Object[]{this, networkStats});
            }
            this.f = networkStats;
            return this;
        }

        public b n(jpq jpqVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("414f95a4", new Object[]{this, jpqVar});
            }
            this.h = jpqVar;
            return this;
        }
    }

    static {
        t2o.a(589300033);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append("Response{ code=");
        sb.append(this.b);
        sb.append(", message=");
        sb.append(this.c);
        sb.append(", headers");
        sb.append(this.d);
        sb.append(", body");
        sb.append(this.e);
        sb.append(", request");
        sb.append(this.f25231a);
        sb.append(", stat");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }

    public o9o(b bVar) {
        this.f25231a = bVar.f25232a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = b.a(bVar);
        this.i = b.b(bVar);
        this.j = b.c(bVar);
    }
}
