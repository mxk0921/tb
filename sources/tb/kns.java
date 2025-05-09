package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class kns implements pr6<jns> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARSER_ID = "id_ali_tt_detail_global";

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f22789a;

    static {
        t2o.a(912261548);
        t2o.a(912261532);
    }

    public kns(Context context, ze7 ze7Var) {
        this.f22789a = ze7Var;
    }

    /* renamed from: b */
    public jns a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jns) ipChange.ipc$dispatch("bc987d95", new Object[]{this, jSONObject});
        }
        return new jns(jSONObject, this.f22789a);
    }
}
