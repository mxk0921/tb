package tb;

import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.PhotoSaveMediaToAlbumFinishResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class hty extends mx6 implements v8d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337394);
        t2o.a(525337105);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hty(vq vqVar) {
        super(vqVar);
        ckf.g(vqVar, "callback");
    }

    public static /* synthetic */ Object ipc$super(hty htyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/PhotoSaveMediaToAlbumEventsImpl");
    }

    @Override // tb.v8d
    public void V(PhotoSaveMediaToAlbumFinishResult photoSaveMediaToAlbumFinishResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8708fa53", new Object[]{this, photoSaveMediaToAlbumFinishResult});
            return;
        }
        ckf.g(photoSaveMediaToAlbumFinishResult, "result");
        Object json = JSON.toJSON(photoSaveMediaToAlbumFinishResult);
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        b().c(new FinishResult((JSONObject) json, "onFinish"));
    }
}
