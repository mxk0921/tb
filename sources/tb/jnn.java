package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class jnn implements pr6<enn> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARSER_ID = "id_recommend";

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f22096a;

    static {
        t2o.a(912261545);
        t2o.a(912261532);
    }

    public jnn(Context context, ze7 ze7Var) {
        this.f22096a = ze7Var;
    }

    /* renamed from: b */
    public enn a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (enn) ipChange.ipc$dispatch("1f920a48", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        return new enn(jSONObject, this.f22096a.b().d());
    }
}
