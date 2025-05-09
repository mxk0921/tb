package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.LocationData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class rmy extends mx6 implements dnc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337263);
        t2o.a(525337073);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rmy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(rmy rmyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/LocationRequestLocationEventsImpl");
    }

    @Override // tb.dnc
    public void o0(LocationData locationData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c44a1641", new Object[]{this, locationData});
            return;
        }
        ckf.g(locationData, "result");
        Object json = JSON.toJSON(locationData);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onSuccess"));
    }
}
