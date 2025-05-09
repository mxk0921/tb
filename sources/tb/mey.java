package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AlertConfirmInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class mey extends mx6 implements cfb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336697);
        t2o.a(525336999);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mey(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(mey meyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AlertEventsImpl");
    }

    @Override // tb.cfb
    public void B(AlertConfirmInfo alertConfirmInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2958b9b", new Object[]{this, alertConfirmInfo});
            return;
        }
        ckf.g(alertConfirmInfo, "result");
        Object json = JSON.toJSON(alertConfirmInfo);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onOther"));
    }

    @Override // tb.cfb
    public void J(AlertConfirmInfo alertConfirmInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5529a063", new Object[]{this, alertConfirmInfo});
            return;
        }
        ckf.g(alertConfirmInfo, "result");
        Object json = JSON.toJSON(alertConfirmInfo);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onCancel"));
    }

    @Override // tb.cfb
    public void n(AlertConfirmInfo alertConfirmInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a873d70b", new Object[]{this, alertConfirmInfo});
            return;
        }
        ckf.g(alertConfirmInfo, "result");
        Object json = JSON.toJSON(alertConfirmInfo);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onConfirm"));
    }
}
