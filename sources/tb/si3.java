package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.inspector.MessagePriority;
import com.taobao.android.riverlogger.inspector.a;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class si3 implements ncn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final si3 instance = new si3();

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f28066a = new AtomicBoolean(true);

    static {
        t2o.a(649068569);
        t2o.a(649068555);
    }

    @Override // tb.ncn
    public RVLLevel b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RVLLevel) ipChange.ipc$dispatch("3939f356", new Object[]{this});
        }
        if (ti3.c() != null) {
            return RVLLevel.Verbose;
        }
        return RVLLevel.Off;
    }

    @Override // tb.ncn
    public void a(kcn kcnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed4f4a", new Object[]{this, kcnVar});
            return;
        }
        a c = ti3.c();
        if (c != null) {
            if (f28066a.compareAndSet(true, false)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(m09.TASK_TYPE_LEVEL, "Error");
                    jSONObject.put("module", "LOGGER/CLIENT_RESTART_MARK");
                    jSONObject.put("time", System.currentTimeMillis());
                } catch (JSONException unused) {
                }
                c.x("Dev.log", null, jSONObject, MessagePriority.Normal, null);
            }
            if (kcnVar.j) {
                c.w("Dev.log", null, "{\"level\":\"" + kcnVar.f22567a.toString() + "\",\"module\":\"" + kcnVar.b + "\"," + kcnVar.a().substring(1), MessagePriority.Low, null);
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(m09.TASK_TYPE_LEVEL, kcnVar.f22567a.toString());
                jSONObject2.put("module", kcnVar.b);
                jSONObject2.put("time", System.currentTimeMillis());
                jSONObject2.put("ext", kcnVar.a());
            } catch (JSONException unused2) {
            }
            c.x("Dev.log", null, jSONObject2, MessagePriority.Low, null);
        }
    }
}
