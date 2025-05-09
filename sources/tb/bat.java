package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.nav.TaokeRequest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bat extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699528);
    }

    public bat(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(bat batVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/nav/TaokeBusiness");
    }

    public void K(String str, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e334d55", new Object[]{this, str, new Long(j), str2});
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "taolive";
        }
        TaokeRequest taokeRequest = new TaokeRequest();
        taokeRequest.accountId = str;
        taokeRequest.bizType = str2;
        taokeRequest.itemId = j;
        taokeRequest.utdid = gq0.n().getUtdid(v2s.o().f().getApplication().getApplicationContext());
        taokeRequest.platform = "phone";
        taokeRequest.sourceType = 2L;
        C(0, taokeRequest, null);
    }
}
