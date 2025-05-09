package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.framework.adapter.IMTopAdapter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class t19 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Map<String, String> c = t19.this.c();
            ir9.a("VSAggrLog", "generateUtArgs = " + c);
            FluidSDK.getUTAdapter().trackCustom("VSAggrLog", 19997, "submitLog", "", "", c);
            ir9.b("VSAggrLog", "submitLog 19997");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        @JSONField(name = "ext")
        public Map<String, Object> ext;
        @JSONField(name = "lid")
        public final String lid;
        @JSONField(name = "name")
        public String name;
        @JSONField(deserialize = false, serialize = false)
        public long nodeFirstTime;
        @JSONField(name = "plid")
        public String plid;
        @JSONField(name = "props")
        public final Map<String, Object> props = new HashMap();
        @JSONField(name = y1r.COL_SEQ)
        public List<b> seq;
        @JSONField(deserialize = false, serialize = false)
        public long startTime;
        @JSONField(name = "ts")
        public String ts;
        @JSONField(name = "type")
        public String type;

        static {
            t2o.a(468713632);
        }

        public b(String str) {
            if (TextUtils.isEmpty(str)) {
                this.lid = UUID.randomUUID().toString();
            } else {
                this.lid = str;
            }
            this.startTime = SystemClock.elapsedRealtime();
        }

        public static b a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("18adae39", new Object[0]);
            }
            return b(null);
        }

        public static b b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("36a0a36f", new Object[]{str});
            }
            b bVar = new b(str);
            IMTopAdapter mTopAdapter = FluidSDK.getMTopAdapter();
            if (mTopAdapter == null) {
                return bVar;
            }
            bVar.h(String.valueOf(mTopAdapter.getServerTimeMillis()));
            return bVar;
        }

        public b c(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("11223b9f", new Object[]{this, map});
            }
            this.ext = map;
            return this;
        }

        public Object d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("e8ef2c8", new Object[]{this, str});
            }
            return this.props.get(str);
        }

        public List<b> e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("accd9717", new Object[]{this});
            }
            return this.seq;
        }

        public b f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("26335d80", new Object[]{this, str});
            }
            this.name = str;
            return this;
        }

        public b g(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("a2b0684c", new Object[]{this, str, obj});
            }
            this.props.put(str, obj);
            return this;
        }

        public b h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("6dbcad0c", new Object[]{this, str});
            }
            this.ts = str;
            return this;
        }

        public b i(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("1214871", new Object[]{this, str});
            }
            this.type = str;
            return this;
        }
    }

    static {
        t2o.a(468713630);
    }

    public b a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("4c58580c", new Object[]{this, bVar});
        }
        return null;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a02127e2", new Object[]{this});
        }
    }

    public Map<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("eb88a62d", new Object[]{this});
        }
        new HashMap();
        throw null;
    }

    public b d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("946be711", new Object[]{this});
        }
        return null;
    }
}
