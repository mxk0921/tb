package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import kotlin.Metadata;
import tb.kr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class zox implements sud {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONArray f32915a;
        public final /* synthetic */ lr b;

        public a(JSONArray jSONArray, lr lrVar) {
            this.f32915a = jSONArray;
            this.b = lrVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            wfr.INSTANCE.d("ZCacheAbility", "start zCache");
            JSONArray jSONArray = this.f32915a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : jSONArray) {
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str = (String) obj;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            yox.n(arrayList);
            lr lrVar = this.b;
            if (lrVar != null) {
                lrVar.a(kr.b.INSTANCE);
            }
        }
    }

    static {
        t2o.a(804257812);
        t2o.a(803209236);
    }

    @Override // tb.sud
    public void a(String str, JSONObject jSONObject, lr lrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8c347dc", new Object[]{this, str, jSONObject, lrVar});
            return;
        }
        ckf.g(str, "name");
        ckf.g(jSONObject, "data");
        JSONArray jSONArray = jSONObject.getJSONArray("prefetchList");
        if (jSONArray == null || jSONArray.isEmpty()) {
            wfr.INSTANCE.b("ZCacheAbility", "prefetch list params illegal");
            if (lrVar != null) {
                lrVar.a(new kr.a(-1, "prefetch list params illegal"));
                return;
            }
            return;
        }
        rfr.INSTANCE.b(new a(jSONArray, lrVar));
    }
}
