package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class pd2 implements s4a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final i5a f26024a;

    static {
        t2o.a(475004943);
        t2o.a(475004944);
    }

    public pd2(i5a i5aVar) {
        this.f26024a = i5aVar;
    }

    @Override // tb.s4a
    public void a(JSONObject jSONObject, d90 d90Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b68a946", new Object[]{this, jSONObject, d90Var});
        } else if (this.f26024a == null || jSONObject == null) {
            s3a.d("BizContextRecordAction", "gatewayPageContext == null");
        } else {
            String string = jSONObject.getString("_bizId");
            if (TextUtils.isEmpty(string)) {
                s3a.d("BizContextRecordAction", "bizId isEmpty");
                return;
            }
            JSONObject a2 = this.f26024a.a(string);
            if (a2 != null) {
                jSONObject.remove("_bizId");
                a2.putAll(jSONObject);
            }
        }
    }
}
