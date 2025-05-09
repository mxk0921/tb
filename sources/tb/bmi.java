package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bmi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CALLBACK_DATA = "data";
    public static final String CALLBACK_DATA_LIST = "dataList";
    public static final String CALLBACK_RESULT = "result";
    public static final b Companion = new b(null);
    public static final String KEY_ARGS = "args";
    public static final String KEY_NAME = "name";
    public static final String KEY_RECEIVER = "receiver";
    public static final String KEY_SENDER = "sender";
    public static final String KEY_TIMESTAMP = "timestamp";
    public static final String RECEIVER_INTERACT = "Interact";
    public static final String SENDER_INTERACT = "Interact";

    /* renamed from: a  reason: collision with root package name */
    public final String f16477a;
    public final JSONObject b;
    public final long c;
    public final String d;
    public final String e;
    public a f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
        void onResult(JSONObject jSONObject);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b {
        static {
            t2o.a(689963139);
        }

        public b() {
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(689963137);
    }

    public bmi(String str, JSONObject jSONObject, long j, String str2, String str3, a aVar) {
        ckf.g(str, "name");
        ckf.g(str2, "sender");
        ckf.g(str3, KEY_RECEIVER);
        this.f16477a = str;
        this.b = jSONObject;
        this.c = j;
        this.d = str2;
        this.e = str3;
        this.f = aVar;
    }

    public final JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7c869f7a", new Object[]{this});
        }
        return this.b;
    }

    public final a b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("6efc5542", new Object[]{this});
        }
        return this.f;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.f16477a;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c19608b4", new Object[]{this});
        }
        return this.e;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22826aae", new Object[]{this});
        }
        return this.d;
    }

    public final void f(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7ba02", new Object[]{this, aVar});
        } else {
            this.f = aVar;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "{name=" + this.f16477a + "，timestamp=" + this.c + "，sender=" + this.d + "，receiver=" + this.e + '}';
    }

    public final String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d39b47a5", new Object[]{this});
        }
        String jSONString = new JSONObject(kotlin.collections.a.j(jpu.a("name", this.f16477a), jpu.a("args", this.b), jpu.a("timestamp", Long.valueOf(this.c)), jpu.a("sender", this.d), jpu.a(KEY_RECEIVER, this.e))).toJSONString();
        ckf.f(jSONString, "jsonObject.toJSONString()");
        return jSONString;
    }
}
