package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qba implements z9c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f26650a;
    public final JSONObject b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public JSONObject f26651a;
        public JSONObject b;

        static {
            t2o.a(729810185);
        }

        public static /* synthetic */ JSONObject a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("604cbe28", new Object[]{aVar});
            }
            return aVar.f26651a;
        }

        public static /* synthetic */ JSONObject b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("257eaf87", new Object[]{aVar});
            }
            return aVar.b;
        }

        public qba c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qba) ipChange.ipc$dispatch("ac29fafb", new Object[]{this});
            }
            return new qba(this);
        }

        public a d(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("cfbe9af8", new Object[]{this, jSONObject});
            }
            this.b = jSONObject;
            return this;
        }

        public a e(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("81359bf4", new Object[]{this, jSONObject});
            }
            this.f26651a = jSONObject;
            return this;
        }
    }

    static {
        t2o.a(729810184);
        t2o.a(729810127);
    }

    public qba(a aVar) {
        this.f26650a = a.a(aVar);
        this.b = a.b(aVar);
    }

    @Override // tb.z9c
    public JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3dfc2e7f", new Object[]{this});
        }
        return this.f26650a;
    }

    @Override // tb.z9c
    public JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("58e5c3fb", new Object[]{this});
        }
        return this.b;
    }
}
