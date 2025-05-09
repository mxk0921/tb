package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.topOperate.TopOperateRequest;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.topOperate.TopOperateResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class c4u extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295698919);
    }

    public c4u(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(c4u c4uVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/business/topOperate/TopOperateBusiness");
    }

    public void K(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2a20cf4", new Object[]{this, str, str2, str3});
            return;
        }
        TopOperateRequest topOperateRequest = new TopOperateRequest();
        topOperateRequest.anchorId = str2;
        topOperateRequest.liveId = str;
        topOperateRequest.transParams = str3;
        C(1, topOperateRequest, TopOperateResponse.class);
    }
}
