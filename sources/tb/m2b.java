package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.dinamicext.view.tbliveFllowContent.mtop.homePageDetail.HomePageDetailRequest;
import com.taobao.taolive.dinamicext.view.tbliveFllowContent.mtop.homePageDetail.HomePageDetailResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class m2b extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092488);
    }

    public m2b(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(m2b m2bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/dinamicext/view/tbliveFllowContent/mtop/homePageDetail/HomePageDetailBusiness");
    }

    public void K(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e3d47e0", new Object[]{this, str});
            return;
        }
        HomePageDetailRequest homePageDetailRequest = new HomePageDetailRequest();
        homePageDetailRequest.liveId = str;
        C(1, homePageDetailRequest, HomePageDetailResponse.class);
    }
}
