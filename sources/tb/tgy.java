package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.ContactsResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class tgy extends mx6 implements cqb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336779);
        t2o.a(525337013);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgy(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(tgy tgyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/ContactsContactChooseEventsImpl");
    }

    @Override // tb.cqb
    public void b1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21c581b9", new Object[]{this});
        } else {
            b().c(new FinishResult(null, "onCancelled"));
        }
    }

    @Override // tb.cqb
    public void z(ContactsResult contactsResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e881d", new Object[]{this, contactsResult});
            return;
        }
        ckf.g(contactsResult, "result");
        Object json = JSON.toJSON(contactsResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onChosen"));
    }
}
