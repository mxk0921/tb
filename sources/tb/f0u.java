package tb;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class f0u implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "toast";

    /* renamed from: a  reason: collision with root package name */
    public final Context f18928a;

    static {
        t2o.a(912261957);
        t2o.a(912261826);
    }

    public f0u(Context context) {
        this.f18928a = context;
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (irVar == null || (a2 = irVar.a()) == null) {
            return false;
        }
        String string = a2.getString("message");
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        Toast.makeText(this.f18928a, string, 0).show();
        return true;
    }
}
