package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.MemberCheckRequest;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.MemberCheckResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class iki extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295698890);
    }

    public iki(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(iki ikiVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/business/MemberCheckBussiness");
    }

    public void K(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89ede273", new Object[]{this, str, str2});
            return;
        }
        MemberCheckRequest memberCheckRequest = new MemberCheckRequest();
        memberCheckRequest.anchorId = str;
        memberCheckRequest.liveId = str2;
        C(1, memberCheckRequest, MemberCheckResponse.class);
    }
}
