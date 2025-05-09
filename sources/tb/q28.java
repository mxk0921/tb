package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.p28;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class q28 implements p28.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final uzi f26459a;

    static {
        t2o.a(729810165);
        t2o.a(729809754);
    }

    public q28(uzi uziVar) {
        this.f26459a = uziVar;
    }

    @Override // tb.p28.a
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75fe32c1", new Object[]{this, jSONObject});
            return;
        }
        e(jSONObject);
        c();
        b();
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9b34c27", new Object[]{this});
        } else {
            this.f26459a.a("click");
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93988741", new Object[]{this});
            return;
        }
        Map<String, Object> b = this.f26459a.b("click");
        wri d = wri.d();
        z4a z4aVar = z4a.NEW_FACE_PARENT;
        d.a("click", z4aVar.c, b);
        wri.d().b("click", z4aVar.c, b);
    }

    public final String d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("898a2c24", new Object[]{this, jSONObject});
        }
        if (f0p.a()) {
            return jSONObject.getString("realtimeClickParam");
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
        if (jSONObject2 != null) {
            return jSONObject2.getString("realtimeClickParam");
        }
        fve.e("DxItemClickListener", "getRealTimeClickParams ext == null");
        return null;
    }

    public final void e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c015eff7", new Object[]{this, jSONObject});
            return;
        }
        String d = d(jSONObject);
        if (d == null || TextUtils.isEmpty(d)) {
            fve.e("DxItemClickListener", "realTimeClickParams == null");
        } else {
            this.f26459a.d(d);
        }
    }
}
