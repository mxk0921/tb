package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.async.AsyncProcessor;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class j4o implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "request";

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f21758a;
    public final Map<Integer, String> b = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements AsyncProcessor.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f21759a;
        public final /* synthetic */ oa4 b;

        public a(int i, oa4 oa4Var) {
            this.f21759a = i;
            this.b = oa4Var;
        }

        @Override // com.taobao.android.detail.ttdetail.async.AsyncProcessor.d
        public void a(JSONObject jSONObject, JSONObject jSONObject2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe679aeb", new Object[]{this, jSONObject, jSONObject2});
                return;
            }
            j4o.b(j4o.this).put(Integer.valueOf(this.f21759a), "success");
            this.b.updateComponent();
        }

        @Override // com.taobao.android.detail.ttdetail.async.AsyncProcessor.d
        public void onFail(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("239cc86e", new Object[]{this, str});
                return;
            }
            j4o.b(j4o.this).put(Integer.valueOf(this.f21759a), "failure");
            this.b.updateComponent();
        }
    }

    static {
        t2o.a(912261937);
        t2o.a(912261826);
    }

    public j4o(Context context, ze7 ze7Var) {
        this.f21758a = ze7Var;
    }

    public static /* synthetic */ Map b(j4o j4oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("77b83b9d", new Object[]{j4oVar});
        }
        return j4oVar.b;
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        oa4 i;
        nb4 componentData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (irVar == null || irVar.a() == null || (i = yc4.i(runtimeAbilityParamArr)) == null || (componentData = i.getComponentData()) == null) {
            return false;
        }
        int hashCode = i.hashCode();
        if (!yc4.q(componentData) && !"success".equalsIgnoreCase((String) ((ConcurrentHashMap) this.b).get(Integer.valueOf(hashCode))) && !"blocking".equalsIgnoreCase((String) ((ConcurrentHashMap) this.b).get(Integer.valueOf(hashCode)))) {
            ((ConcurrentHashMap) this.b).put(Integer.valueOf(hashCode), "blocking");
            new AsyncProcessor(this.f21758a).u(componentData, new a(hashCode, i), runtimeAbilityParamArr);
        }
        return true;
    }
}
