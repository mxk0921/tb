package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.WidgetServiceEditSuccessResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class lyy extends mx6 implements cee {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337668);
        t2o.a(525337203);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lyy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(lyy lyyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/WidgetServiceEditEventsImpl");
    }

    @Override // tb.cee
    public void l0(WidgetServiceEditSuccessResult widgetServiceEditSuccessResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63cb8f3b", new Object[]{this, widgetServiceEditSuccessResult});
            return;
        }
        ckf.g(widgetServiceEditSuccessResult, "result");
        Object json = JSON.toJSON(widgetServiceEditSuccessResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onSuccess"));
    }
}
