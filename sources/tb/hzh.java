package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.DynamicMergeUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class hzh implements pr6<d1i> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARSER_ID = "id_main_screen";

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f20982a;

    static {
        t2o.a(912261539);
        t2o.a(912261532);
    }

    public hzh(Context context, ze7 ze7Var) {
        this.f20982a = ze7Var;
    }

    /* renamed from: b */
    public d1i a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1i) ipChange.ipc$dispatch("878f6d21", new Object[]{this, jSONObject});
        }
        return c(DynamicMergeUtils.h(jSONObject));
    }

    public final d1i c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1i) ipChange.ipc$dispatch("d0892664", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        return new d1i(jSONObject, this.f20982a.b().d());
    }
}
