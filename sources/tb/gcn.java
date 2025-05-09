package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class gcn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APP_ID = "appId";
    public static final String PLUGIN_ID = "pluginId";

    /* renamed from: a  reason: collision with root package name */
    public String f19896a;
    public String b;
    public Map<String, String> c;
    public byte[] d;
    public long e;
    public Map<String, String> f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final gcn f19897a = new gcn();

        static {
            t2o.a(839909861);
        }

        public gcn a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (gcn) ipChange.ipc$dispatch("9d85d2cd", new Object[]{this});
            }
            return this.f19897a;
        }

        public b b(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("dbaf5139", new Object[]{this, map});
            }
            gcn.c(this.f19897a, map);
            return this;
        }

        public b c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("fd62fc13", new Object[]{this, str});
            }
            gcn.b(this.f19897a, str);
            return this;
        }

        public b d(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("8985fd88", new Object[]{this, bArr});
            }
            gcn.d(this.f19897a, bArr);
            return this;
        }

        public b e(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("b573bebd", new Object[]{this, new Long(j)});
            }
            gcn.e(this.f19897a, j);
            return this;
        }

        public b f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("5f1cb921", new Object[]{this, str});
            }
            gcn.a(this.f19897a, str);
            return this;
        }
    }

    static {
        t2o.a(839909859);
    }

    public static /* synthetic */ String a(gcn gcnVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca9d3928", new Object[]{gcnVar, str});
        }
        gcnVar.f19896a = str;
        return str;
    }

    public static /* synthetic */ String b(gcn gcnVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2e37969", new Object[]{gcnVar, str});
        }
        gcnVar.b = str;
        return str;
    }

    public static /* synthetic */ Map c(gcn gcnVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("87a6018e", new Object[]{gcnVar, map});
        }
        gcnVar.c = map;
        return map;
    }

    public static /* synthetic */ byte[] d(gcn gcnVar, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("d6545acb", new Object[]{gcnVar, bArr});
        }
        gcnVar.d = bArr;
        return bArr;
    }

    public static /* synthetic */ long e(gcn gcnVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c1dfbe4e", new Object[]{gcnVar, new Long(j)})).longValue();
        }
        gcnVar.e = j;
        return j;
    }

    public static b m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("af584043", new Object[0]);
        }
        return new b();
    }

    public void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7404c381", new Object[]{this, str, str2});
            return;
        }
        if (this.f == null) {
            this.f = new HashMap();
        }
        this.f.put(str, str2);
    }

    public String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1adac0be", new Object[]{this, str});
        }
        Map<String, String> map = this.f;
        if (map == null || !map.containsKey(str)) {
            return "";
        }
        return this.f.get(str);
    }

    public Map<String, String> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this});
        }
        return this.c;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e63d782", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.b)) {
            return "GET";
        }
        return this.b;
    }

    public byte[] j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("3f335d73", new Object[]{this});
        }
        return this.d;
    }

    public long k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e838026", new Object[]{this})).longValue();
        }
        return this.e;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.f19896a;
    }

    public gcn() {
        this.f = new HashMap();
    }
}
