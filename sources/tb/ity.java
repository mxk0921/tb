package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.PhotoSaveToAlbumFinishResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ity extends mx6 implements w8d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337397);
        t2o.a(525337107);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ity(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(ity ityVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/PhotoSaveToAlbumFinishEventsImpl");
    }

    @Override // tb.w8d
    public void r(PhotoSaveToAlbumFinishResult photoSaveToAlbumFinishResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d11eb599", new Object[]{this, photoSaveToAlbumFinishResult});
            return;
        }
        ckf.g(photoSaveToAlbumFinishResult, "result");
        Object json = JSON.toJSON(photoSaveToAlbumFinishResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onFinish"));
    }
}
