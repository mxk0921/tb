package tb;

import com.taobao.weex.common.Constants;
import io.unicorn.embedding.engine.FlutterJNI;
import io.unicorn.view.AccessibilityBridge;
import org.json.JSONException;
import org.json.JSONObject;
import tb.t42;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class m40 {

    /* renamed from: a  reason: collision with root package name */
    public final FlutterJNI f23762a;
    public a b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface a extends FlutterJNI.a {
    }

    static {
        t2o.a(945815728);
    }

    public m40(ehv ehvVar, FlutterJNI flutterJNI) {
        new t42(ehvVar, "unicorn/accessibility", crf.INSTANCE).f(new b(this));
        this.f23762a = flutterJNI;
    }

    public static void f() {
        b.b();
    }

    public void b(int i, AccessibilityBridge.Action action) {
        this.f23762a.dispatchSemanticsAction(i, action);
    }

    public void c(int i, AccessibilityBridge.Action action, Object obj) {
        this.f23762a.dispatchSemanticsAction(i, action, obj);
    }

    public void d() {
        this.f23762a.setSemanticsEnabled(false);
    }

    public void e() {
        this.f23762a.setSemanticsEnabled(true);
    }

    public void g(int i) {
        this.f23762a.setAccessibilityFeatures(i);
    }

    public void h(a aVar) {
        this.b = aVar;
        this.f23762a.setAccessibilityDelegate(aVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class b implements t42.d<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final m40 f23763a;

        static {
            t2o.a(945815730);
            t2o.a(945815756);
        }

        public b(m40 m40Var) {
            this.f23763a = m40Var;
        }

        public void a(Object obj, t42.e<Object> eVar) {
            m40 m40Var = this.f23763a;
            if (m40Var.b == null) {
                ((t42.b.a) eVar).a(null);
                return;
            }
            JSONObject jSONObject = (JSONObject) obj;
            try {
                String string = jSONObject.getString("type");
                int i = jSONObject.getInt(pl4.KEY_NODE_ID);
                String string2 = jSONObject.getString("message");
                hdh.e("AccessibilityChannel", "Received " + string + " message.");
                string.hashCode();
                char c = 65535;
                switch (string.hashCode()) {
                    case -1140076541:
                        if (string.equals("tooltip")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -649620375:
                        if (string.equals("announce")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 114595:
                        if (string.equals("tap")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 97604824:
                        if (string.equals(Constants.Event.FOCUS)) {
                            c = 3;
                            break;
                        }
                        break;
                    case 114203431:
                        if (string.equals("longPress")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        if (string2 != null) {
                            ((AccessibilityBridge.a) m40Var.b).e(string2);
                            break;
                        }
                        break;
                    case 1:
                        if (string2 != null) {
                            ((AccessibilityBridge.a) m40Var.b).a(string2);
                            break;
                        }
                        break;
                    case 2:
                        ((AccessibilityBridge.a) m40Var.b).d(i);
                        break;
                    case 3:
                        ((AccessibilityBridge.a) m40Var.b).b(i);
                        break;
                    case 4:
                        ((AccessibilityBridge.a) m40Var.b).c(i);
                        break;
                }
                ((t42.b.a) eVar).a(null);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public static void b() {
        }
    }
}
