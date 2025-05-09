package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.ImagePreviewCloseResult;
import com.taobao.android.abilityidl.ability.ImagePreviewInteractionParam;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class zky extends mx6 implements gec {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337222);
        t2o.a(525337067);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zky(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(zky zkyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/ImagePreviewShowEventsImpl");
    }

    @Override // tb.gec
    public void i(ImagePreviewInteractionParam imagePreviewInteractionParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96761bff", new Object[]{this, imagePreviewInteractionParam});
            return;
        }
        ckf.g(imagePreviewInteractionParam, "result");
        Object json = JSON.toJSON(imagePreviewInteractionParam);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onTapTopRight"));
    }

    @Override // tb.gec
    public void u1(ImagePreviewCloseResult imagePreviewCloseResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c19c7f93", new Object[]{this, imagePreviewCloseResult});
            return;
        }
        ckf.g(imagePreviewCloseResult, "result");
        Object json = JSON.toJSON(imagePreviewCloseResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onClose"));
    }
}
