package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.FavoriteGuideResultData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class iiy extends mx6 implements k5c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336905);
        t2o.a(525337041);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iiy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(iiy iiyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/FavoriteGuideResultListenerEventsImpl");
    }

    @Override // tb.k5c
    public void L(FavoriteGuideResultData favoriteGuideResultData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9816549", new Object[]{this, favoriteGuideResultData});
            return;
        }
        ckf.g(favoriteGuideResultData, "result");
        Object json = JSON.toJSON(favoriteGuideResultData);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onSuccess"));
    }
}
