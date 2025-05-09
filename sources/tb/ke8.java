package tb;

import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import tb.wsi;
import tb.x8x;
import tb.xid;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ke8 {

    /* renamed from: a  reason: collision with root package name */
    public final wsi f22612a;
    public w6a b;
    public final List<xid.a> c = new ArrayList();
    public xid.b d;

    static {
        t2o.a(945815731);
    }

    public ke8(pa2 pa2Var) {
        a aVar = new a(this);
        wsi wsiVar = new wsi(pa2Var, "unicorn/engine_events", drf.INSTANCE);
        this.f22612a = wsiVar;
        wsiVar.f(aVar);
    }

    public static void g() {
        a.b();
    }

    public void d() {
        this.b = null;
        ((ArrayList) this.c).clear();
        this.d = null;
    }

    public void e(l5x l5xVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", l5xVar.d().value());
            jSONObject.put("x", l5xVar.f());
            jSONObject.put("y", l5xVar.g());
            jSONObject.put("width", l5xVar.e());
            jSONObject.put("height", l5xVar.b());
            jSONObject.put("eventType", l5xVar.a().value());
            jSONObject.put("timeStamp", l5xVar.c() * 1000);
            this.f22612a.c("external.event", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void f(String str, Object obj) {
        this.f22612a.c(str, obj);
    }

    public void h() {
        this.f22612a.c("refreshPixelCheckTime", null);
    }

    public void i(boolean z, w6a w6aVar, xid.a aVar) {
        hdh.e("EngineChannel", "Sending message to set consumption mode '" + z + "'");
        this.b = w6aVar;
        if (aVar != null) {
            ((ArrayList) this.c).add(aVar);
        }
        this.f22612a.c("setConsumptionMode", Integer.valueOf(z ? 1 : 0));
    }

    public void j(xid.b bVar) {
        if (bVar != null) {
            this.d = bVar;
            this.f22612a.c("handleOverscroll", Boolean.TRUE);
        }
    }

    public void k() {
        this.f22612a.c("StopListScroll", null);
    }

    public void l() {
        this.f22612a.c("stopPixelCheck", null);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class a implements wsi.c {

        /* renamed from: a  reason: collision with root package name */
        public final ke8 f22613a;

        static {
            t2o.a(945815732);
            t2o.a(945815771);
        }

        public a(ke8 ke8Var) {
            this.f22613a = ke8Var;
        }

        @Override // tb.wsi.c
        public void a(vsi vsiVar, wsi.d dVar) {
            String str = vsiVar.f30223a;
            hdh.d("EngineChannel", "Received '" + str + "' message.");
            ke8 ke8Var = this.f22613a;
            w6a w6aVar = ke8Var.b;
            Object obj = vsiVar.b;
            if (w6aVar != null && "gestureState".equals(str) && (obj instanceof JSONObject)) {
                try {
                    ke8Var.b.a(((JSONObject) obj).getBoolean("gestureState"));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            if (ke8Var.c != null && "gestureState".equals(str) && (obj instanceof JSONObject)) {
                try {
                    Iterator it = ((ArrayList) ke8Var.c).iterator();
                    while (it.hasNext()) {
                        ((xid.a) it.next()).a(((JSONObject) obj).getBoolean("gestureState"), ((JSONObject) obj).getString("acceptGestureType"));
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            if (ke8Var.d != null && "onOverscroll".equals(str) && (obj instanceof JSONObject)) {
                try {
                    JSONObject jSONObject = ((JSONObject) obj).getJSONObject(Constants.Name.CONTENT_OFFSET);
                    ((x8x.o) ke8Var.d).a(((JSONObject) obj).getDouble("value"), ((JSONObject) obj).getDouble("velocity"), ((JSONObject) obj).getString("axis"), jSONObject);
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
            }
        }

        public static void b() {
        }
    }
}
