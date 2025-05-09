package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.MtopTbliveGrowthApiPopExposureRequest;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.MtopTbliveGrowthApiPopExposureResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class f6q extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699732);
    }

    public f6q(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(f6q f6qVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/smartlanding/business/SmartLandingUploadBusiness");
    }

    public void K(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d3044f9", new Object[]{this, str, str2, str3});
            return;
        }
        MtopTbliveGrowthApiPopExposureRequest mtopTbliveGrowthApiPopExposureRequest = new MtopTbliveGrowthApiPopExposureRequest();
        mtopTbliveGrowthApiPopExposureRequest.setPopId(str);
        mtopTbliveGrowthApiPopExposureRequest.setScene(str2);
        mtopTbliveGrowthApiPopExposureRequest.setExParams(str3);
        C(0, mtopTbliveGrowthApiPopExposureRequest, MtopTbliveGrowthApiPopExposureResponse.class);
    }
}
