package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.GeneralSettingOnChangeData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ajy extends mx6 implements w8c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336961);
        t2o.a(525337061);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(ajy ajyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/GeneralSettingChangeListenerEventsImpl");
    }

    @Override // tb.w8c
    public void q(GeneralSettingOnChangeData generalSettingOnChangeData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("734a0fea", new Object[]{this, generalSettingOnChangeData});
            return;
        }
        ckf.g(generalSettingOnChangeData, "result");
        Object json = JSON.toJSON(generalSettingOnChangeData);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onChange"));
    }
}
