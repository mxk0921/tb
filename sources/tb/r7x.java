package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.android.ultron.ext.event.widget.CommonPopupWindow;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class r7x extends m6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NEXT_TAG_DISMISS = "dismiss";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements CommonPopupWindow.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b8v f27174a;

        public a(b8v b8vVar) {
            this.f27174a = b8vVar;
        }

        @Override // com.alibaba.android.ultron.ext.event.widget.CommonPopupWindow.h
        public void onCancel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("379d4540", new Object[]{this});
            } else {
                r7x.this.B(this.f27174a, "dismiss");
            }
        }
    }

    static {
        t2o.a(156237854);
    }

    public static /* synthetic */ Object ipc$super(r7x r7xVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/event/WeexPopV3Subscriber");
    }

    @Override // tb.m6v
    public void F(b8v b8vVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
        } else if (!(b8vVar.e() instanceof Activity) || f() == null || !(f().get("weexPopUrl") instanceof String)) {
            if (!(b8vVar.e() instanceof Activity)) {
                str = "content 异常" + b8vVar.e();
            } else if (f() == null) {
                str = "getEventFields 为空";
            } else {
                str = !(f().get("weexPopUrl") instanceof String) ? "url 参数有问题" : null;
            }
            tj8.a(r7x.class.getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", str);
        } else {
            H(this.b, D(b8vVar), new a(b8vVar));
        }
    }

    public final String G(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f31b0b24", new Object[]{this, str, jSONObject});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (!(entry == null || TextUtils.isEmpty(entry.getKey()) || entry.getValue() == null)) {
                buildUpon.appendQueryParameter(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return buildUpon.build().toString();
    }

    public void H(Context context, JSONObject jSONObject, CommonPopupWindow.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("941d2a1f", new Object[]{this, context, jSONObject, hVar});
        } else if (jSONObject != null) {
            String string = jSONObject.getString("weexPopUrl");
            String string2 = jSONObject.getString("heightPercent");
            JSONObject jSONObject2 = jSONObject.getJSONObject("queryParams");
            if (!TextUtils.isEmpty(string)) {
                String G = G(string, jSONObject2);
                CommonPopupWindow commonPopupWindow = new CommonPopupWindow(context);
                CommonPopupWindow.i iVar = new CommonPopupWindow.i();
                iVar.i(-1);
                iVar.h(G);
                if (!TextUtils.isEmpty(string2)) {
                    try {
                        iVar.j(Float.valueOf(string2).floatValue());
                    } catch (Exception unused) {
                        iVar.j(0.6f);
                    }
                } else {
                    iVar.j(0.6f);
                }
                iVar.f(true);
                iVar.g(80);
                commonPopupWindow.w(iVar);
                commonPopupWindow.s(hVar);
            }
        }
    }
}
