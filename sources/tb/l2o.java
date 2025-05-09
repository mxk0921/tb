package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class l2o implements svc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COL_BIZ = "bizCode";
    public static final String COL_BTAG = "bizTag";
    public static final String COL_CODE = "code";
    public static final String COL_EXT1 = "ext1";
    public static final String COL_EXT2 = "ext2";
    public static final String COL_ID = "id";
    public static final String COL_KEY = "key";
    public static final String COL_MARK = "mark";
    public static final String COL_M_TIME = "mtopTime";
    public static final String COL_PULL_MODE = "mode";
    public static final String COL_SOURCE = "source";
    public static final String COL_S_TIME = "serverTime";
    public static final String COL_TASK = "taskId";
    public static final String COL_TIME = "time";
    public static final String COL_TOPIC = "topic";
    public static final String COL_TYPE = "type";

    /* renamed from: a  reason: collision with root package name */
    public final String f23070a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public int f;
    public final int g;
    public String h;
    public final int i;
    public long l;
    public int m;
    public long j = System.currentTimeMillis();
    public long k = jg4.d();
    public long n = System.nanoTime();

    static {
        t2o.a(628097296);
        t2o.a(628097086);
    }

    public l2o(String str, int i, int i2, String str2, String str3, int i3, int i4) {
        this.f23070a = str;
        this.g = i;
        this.b = i2;
        this.c = str2;
        this.d = str3;
        this.e = i3;
        this.i = i4;
    }

    @Override // tb.svc
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9af574be", new Object[]{this});
        }
        return this.f23070a;
    }

    @Override // tb.svc
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("975e43cf", new Object[]{this})).intValue();
        }
        return this.e;
    }

    @Override // tb.svc
    public long key() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf52db5a", new Object[]{this})).longValue();
        }
        return this.n;
    }

    @Override // tb.lzc
    public int sysCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c43c79d4", new Object[]{this})).intValue();
        }
        return 2;
    }

    @Override // tb.svc
    public JSONObject toJson() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("705c882a", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", (Object) this.f23070a);
        jSONObject.put("bizCode", (Object) Integer.valueOf(this.b));
        jSONObject.put("topic", (Object) this.c);
        jSONObject.put(COL_BTAG, (Object) this.d);
        jSONObject.put("code", (Object) Integer.valueOf(this.e));
        jSONObject.put("source", (Object) Integer.valueOf(this.f));
        jSONObject.put("type", (Object) Integer.valueOf(this.g));
        jSONObject.put(COL_TASK, (Object) this.h);
        jSONObject.put("mode", (Object) Integer.valueOf(this.i));
        jSONObject.put("time", (Object) Long.valueOf(this.j));
        jSONObject.put(COL_M_TIME, (Object) Long.valueOf(this.k));
        jSONObject.put(COL_MARK, (Object) Integer.valueOf(this.m));
        jSONObject.put(COL_S_TIME, (Object) Long.valueOf(this.l));
        jSONObject.put("key", (Object) Long.valueOf(this.n));
        jSONObject.put("platform", (Object) 1);
        return jSONObject;
    }
}
