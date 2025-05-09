package tb;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.y44;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class yk0 extends m6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FIELD_ALERT = "alert";
    public static final String NEXT_TAG_CANCEL = "cancel";
    public static final String NEXT_TAG_CONFIRM = "confirm";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements y44.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b8v f32138a;

        public a(b8v b8vVar) {
            this.f32138a = b8vVar;
        }

        @Override // tb.y44.c
        public void a(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("672b314f", new Object[]{this, dialogInterface});
                return;
            }
            yk0.this.B(this.f32138a, "confirm");
            dialogInterface.dismiss();
        }

        @Override // tb.y44.c
        public void b(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2727188b", new Object[]{this, dialogInterface});
                return;
            }
            yk0.this.B(this.f32138a, "cancel");
            dialogInterface.dismiss();
        }
    }

    static {
        t2o.a(156237828);
    }

    public static JSONObject G(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("40d5dc7", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", (Object) "alertV3");
        jSONObject2.put("fields", (Object) jSONObject.getJSONObject("alert"));
        if (!jSONObject.containsKey("cancelText")) {
            jSONObject2.getJSONObject("fields").put("cancelText", (Object) wmc.CANCEL);
        }
        return jSONObject2;
    }

    public static /* synthetic */ Object ipc$super(yk0 yk0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/event/AlertV2Subscriber");
    }

    @Override // tb.m6v
    public void F(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
            return;
        }
        JSONObject D = D(b8vVar);
        if (D == null) {
            tj8.a(yk0.class.getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", "获取fields失败");
            return;
        }
        Context e = b8vVar.e();
        if (e instanceof Activity) {
            try {
                new y44(this.b).c(D.getString("msg")).g(D.getString("title")).d(D.getString("cancelText")).f(D.getString("confirmText")).e(new a(b8vVar)).h();
            } catch (Exception e2) {
                tj8.b("AlertV2Subscriber", "onHandleEventChain", "EVENT_CHAIN_TRY_EXCEPTION_ERROR", tj8.c(e2));
            }
        } else {
            tj8.a(yk0.class.getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", "context异常 context is" + e);
        }
    }
}
