package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.ErrorViewWidgetRequestError;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class diy extends mx6 implements d3c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336881);
        t2o.a(525337037);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public diy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(diy diyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/ErrorViewWidgetShowEventImpl");
    }

    @Override // tb.d3c
    public void r1(ErrorViewWidgetRequestError errorViewWidgetRequestError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffbd6b16", new Object[]{this, errorViewWidgetRequestError});
            return;
        }
        ckf.g(errorViewWidgetRequestError, "result");
        Object json = JSON.toJSON(errorViewWidgetRequestError);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onRefreshButtonPressed"));
    }
}
