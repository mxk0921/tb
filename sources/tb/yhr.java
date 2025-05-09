package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.home.dinamic.ability.business.TBLAddFollowRequest;
import com.taobao.live.home.dinamic.ability.business.TBLCancelFollowRequest;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class yhr extends ot1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806355394);
    }

    public yhr(IRemoteBaseListener iRemoteBaseListener) {
        super(iRemoteBaseListener);
    }

    public static /* synthetic */ Object ipc$super(yhr yhrVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/dinamic/ability/business/TBLFollowBusiness");
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2152b82", new Object[]{this, str});
            return;
        }
        TBLAddFollowRequest tBLAddFollowRequest = new TBLAddFollowRequest();
        tBLAddFollowRequest.accountId = str;
        a(0, tBLAddFollowRequest, null);
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e732debb", new Object[]{this, str});
            return;
        }
        TBLCancelFollowRequest tBLCancelFollowRequest = new TBLCancelFollowRequest();
        tBLCancelFollowRequest.accountId = str;
        a(0, tBLCancelFollowRequest, null);
    }
}
