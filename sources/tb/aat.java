package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.business.taoke.TaokeRequest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class aat extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092830);
    }

    public aat(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(aat aatVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/business/taoke/TaokeBusiness");
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
