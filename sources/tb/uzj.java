package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class uzj implements s4a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f29698a;

        public a(String str) {
            this.f29698a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TBToast.makeText(m0b.c(), this.f29698a, 2000L).show();
            }
        }
    }

    static {
        t2o.a(729809790);
        t2o.a(475004944);
    }

    @Override // tb.s4a
    public void a(JSONObject jSONObject, d90 d90Var) {
        JSONObject A;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b68a946", new Object[]{this, jSONObject, d90Var});
            return;
        }
        imn d = zza.d(yyj.e().f());
        if (d != null && (A = d.A()) != null) {
            String b = b(A, jSONObject);
            if (TextUtils.isEmpty(b)) {
                bqa.d("NewFaceToastAction", "toastText is empty");
            } else {
                m5a.a().i(new a(b));
            }
        }
    }

    public final String b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b92ebbb", new Object[]{this, jSONObject, jSONObject2});
        }
        try {
            JSONObject jSONObject4 = jSONObject.getJSONObject("toasts");
            if (jSONObject4 == null) {
                return null;
            }
            String string = jSONObject2.getString("requestType");
            if (TextUtils.isEmpty(string) || (jSONObject3 = jSONObject4.getJSONObject(string)) == null) {
                return null;
            }
            String string2 = jSONObject2.getString("toastType");
            if (TextUtils.isEmpty(string2)) {
                return null;
            }
            return jSONObject3.getString(string2);
        } catch (Exception e) {
            bqa.c("NewFaceToastAction", e, new String[0]);
            return null;
        }
    }
}
