package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.ContactsQueryResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ugy extends mx6 implements dqb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336780);
        t2o.a(525337015);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ugy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(ugy ugyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/ContactsContactQueryEventsImpl");
    }

    @Override // tb.dqb
    public void S0(ContactsQueryResult contactsQueryResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83761d5f", new Object[]{this, contactsQueryResult});
            return;
        }
        ckf.g(contactsQueryResult, "result");
        Object json = JSON.toJSON(contactsQueryResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onFound"));
    }
}
