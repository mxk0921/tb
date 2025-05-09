package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.templateprocess.business.SmartBenefitMarqueeRequest;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.templateprocess.business.SmartBenefitMarqueeResponse;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.templateprocess.business.SmartCommonIssueInteractRequest;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.templateprocess.business.SmartCommonIssueInteractResponse;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.templateprocess.business.SmartLiveInteractRequest;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.templateprocess.business.SmartLiveInteractResponse;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class e7q extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699788);
    }

    public e7q(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(e7q e7qVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/smartlayer/templateprocess/business/SmartLiveInteractBusiness");
    }

    public void K(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0e85cb1", new Object[]{this, str, str2, str3, str4, str5, str6, str7});
            return;
        }
        SmartCommonIssueInteractRequest smartCommonIssueInteractRequest = new SmartCommonIssueInteractRequest();
        smartCommonIssueInteractRequest.liveId = str;
        smartCommonIssueInteractRequest.anchorId = str2;
        smartCommonIssueInteractRequest.interactType = str3;
        smartCommonIssueInteractRequest.interactId = str4;
        smartCommonIssueInteractRequest.rightsType = str5;
        smartCommonIssueInteractRequest.asac = str6;
        smartCommonIssueInteractRequest.extendParams = str7;
        if (!TextUtils.isEmpty(str6)) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("asac", str6);
            A(hashMap);
        }
        C(1, smartCommonIssueInteractRequest, SmartCommonIssueInteractResponse.class);
    }

    public void L(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a63d8e", new Object[]{this, str, str2});
            return;
        }
        SmartBenefitMarqueeRequest smartBenefitMarqueeRequest = new SmartBenefitMarqueeRequest();
        smartBenefitMarqueeRequest.bizId = str;
        smartBenefitMarqueeRequest.bizType = str2;
        smartBenefitMarqueeRequest.querySize = 20;
        C(1, smartBenefitMarqueeRequest, SmartBenefitMarqueeResponse.class);
    }

    public void M(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8ec06d9", new Object[]{this, str, str2, str3, str4});
            return;
        }
        SmartLiveInteractRequest smartLiveInteractRequest = new SmartLiveInteractRequest();
        smartLiveInteractRequest.liveId = str;
        smartLiveInteractRequest.anchorId = str2;
        smartLiveInteractRequest.interactTypes = str3;
        smartLiveInteractRequest.extendParams = str4;
        C(1, smartLiveInteractRequest, SmartLiveInteractResponse.class);
    }
}
