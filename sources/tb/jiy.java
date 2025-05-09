package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.FavoriteResultData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class jiy extends mx6 implements m5c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336915);
        t2o.a(525337043);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jiy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(jiy jiyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/FavoriteResultListenerEventsImpl");
    }

    @Override // tb.m5c
    public void q0(FavoriteResultData favoriteResultData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7700a9d", new Object[]{this, favoriteResultData});
            return;
        }
        ckf.g(favoriteResultData, "result");
        Object json = JSON.toJSON(favoriteResultData);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onSuccess"));
    }
}
