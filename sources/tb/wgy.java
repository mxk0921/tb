package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.ContainerWindowSize;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class wgy extends mx6 implements sqb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336799);
        t2o.a(525337019);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wgy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(wgy wgyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/ContainerPageResizeEventsImpl");
    }

    @Override // tb.sqb
    public void R0(ContainerWindowSize containerWindowSize) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f421160f", new Object[]{this, containerWindowSize});
            return;
        }
        ckf.g(containerWindowSize, "result");
        Object json = JSON.toJSON(containerWindowSize);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onResize"));
    }
}
