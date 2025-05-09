package tb;

import android.graphics.Rect;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Locale;
import java.util.Map;
import tb.h1p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class rm1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27464a;
    public om1 b;
    public om1 c;
    public int d;
    public String e;
    public String f;
    public String g;
    public Map<String, String> h;

    static {
        t2o.a(404750673);
    }

    public void a(JSONObject jSONObject, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72964f96", new Object[]{this, jSONObject, new Long(j), new Long(j2)});
            return;
        }
        jSONObject.put("bizId", (Object) this.f27464a);
        jSONObject.put("index", (Object) Integer.valueOf(this.d));
        jSONObject.put("time", (Object) Long.valueOf(j));
        jSONObject.put("trace", (Object) Long.valueOf(j2));
        jSONObject.put("screenW", (Object) Float.valueOf(gwv.y(gwv.s() * 1.0f)));
        jSONObject.put("screenH", (Object) Float.valueOf(gwv.y(gwv.r() * 1.0f)));
    }

    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d692b7ae", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (!pz3.b(this.h)) {
            jSONObject2.putAll(this.h);
        }
        if (!TextUtils.isEmpty(this.e)) {
            jSONObject2.put(yj4.PARAM_PVID, (Object) this.e);
        }
        if (!TextUtils.isEmpty(this.f)) {
            jSONObject2.put(yj4.PARAM_SEARCH_KEYWORD_RN, (Object) this.f);
        }
        if (!TextUtils.isEmpty(this.g)) {
            jSONObject2.put(h1p.a.PARAM_KEY_FIRST_RN, (Object) this.g);
        }
        if (jSONObject2.size() > 0) {
            jSONObject.put("ext", (Object) jSONObject2);
        }
    }

    public void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb9b42e3", new Object[]{this, jSONObject});
            return;
        }
        om1 om1Var = this.b;
        if (om1Var != null) {
            jSONObject.put("cardX", (Object) Integer.valueOf((int) om1Var.c()));
            jSONObject.put("cardY", (Object) Integer.valueOf((int) this.b.d()));
            jSONObject.put("cardW", (Object) Integer.valueOf((int) this.b.b()));
            jSONObject.put("cardH", (Object) Integer.valueOf((int) this.b.a()));
            om1 om1Var2 = this.b;
            jSONObject.put("cardPosition", (Object) u6a.x(om1Var2.f25484a + (om1Var2.c / 2.0f), om1Var2.b + (om1Var2.d / 2.0f), true));
        }
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e73931a5", new Object[]{this, jSONObject});
        } else if (this.b == null || this.c == null) {
            jSONObject.put(slo.KEY_IS_FULL, "true");
            jSONObject.put("expRatio", "1");
            jSONObject.put("errMsg", "noVisualRectOrRect");
        } else {
            om1 om1Var = this.b;
            float f = om1Var.f25484a;
            float f2 = om1Var.b;
            Rect rect = new Rect((int) f, (int) f2, (int) (f + om1Var.c), (int) (f2 + om1Var.d));
            om1 om1Var2 = this.c;
            float f3 = om1Var2.f25484a;
            float f4 = om1Var2.b;
            Rect rect2 = new Rect((int) f3, (int) f4, (int) (f3 + om1Var2.c), (int) (f4 + om1Var2.d));
            Rect rect3 = new Rect();
            if (Rect.intersects(rect, rect2)) {
                rect3.set(rect);
                rect3.intersect(rect2);
                om1 om1Var3 = this.b;
                float f5 = ((rect3.right - rect3.left) * (rect3.bottom - rect3.top)) / (om1Var3.c * om1Var3.d);
                if (f5 >= 0.99d) {
                    jSONObject.put(slo.KEY_IS_FULL, "true");
                }
                jSONObject.put("expRatio", (Object) Float.valueOf(Float.parseFloat(String.format(Locale.CHINA, "%.3f", Float.valueOf(f5)))));
            } else {
                jSONObject.put(slo.KEY_IS_FULL, "false");
                jSONObject.put("expRatio", "0");
                jSONObject.put("errMsg", "noIntersectionRect");
            }
            jSONObject.put("visualX", (Object) Float.valueOf(this.c.c()));
            jSONObject.put("visualY", (Object) Float.valueOf(this.c.d()));
            jSONObject.put("visualW", (Object) Float.valueOf(this.c.b()));
            jSONObject.put("visualH", (Object) Float.valueOf(this.c.a()));
        }
    }

    public JSONObject e(long j, String str, float f, float f2, String str2, long j2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("851f983d", new Object[]{this, new Long(j), str, new Float(f), new Float(f2), str2, new Long(j2), new Boolean(z)});
        }
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(this.f27464a) && this.d < 0) {
            return jSONObject;
        }
        jSONObject.put("diffX", (Object) Float.valueOf(gwv.y(f)));
        jSONObject.put("diffY", (Object) Float.valueOf(gwv.y(f2)));
        jSONObject.put(yam.TRIGGER_NAME_SCROLL_STATUS, (Object) str);
        jSONObject.put("isTouching", (Object) String.valueOf(z));
        if (z) {
            float[] n = u6a.n();
            jSONObject.put("touchX", (Object) Float.valueOf(n[0]));
            jSONObject.put("touchY", (Object) Float.valueOf(n[1]));
        }
        om1 om1Var = this.b;
        jSONObject.put("cardLastPosition", (Object) u6a.x(om1Var.f25484a + (om1Var.c / 2.0f) + f, om1Var.b + (om1Var.d / 2.0f) + f2, true));
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put("scrollSpeeds", (Object) str2);
        }
        a(jSONObject, j, j2);
        d(jSONObject);
        b(jSONObject);
        c(jSONObject);
        return jSONObject;
    }
}
