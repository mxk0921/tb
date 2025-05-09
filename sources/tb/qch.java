package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class qch implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "locatorTo";

    /* renamed from: a  reason: collision with root package name */
    public final Context f26669a;

    static {
        t2o.a(912261886);
        t2o.a(912261826);
    }

    public qch(Context context) {
        this.f26669a = context;
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
        String string = a2.getString(xka.KEY_LOCATOR_ID);
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        q84.f(this.f26669a, new pch(string));
        return true;
    }
}
