package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.business.task.MtopTaobaoGiuliaIntimacyActionEventRequest;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.business.task.MtopTaobaoGiuliaIntimacyActionEventResponse;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.business.task.UploadFansActionRequest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class alv extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699856);
    }

    public alv(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(alv alvVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/business/task/UploadFansActionBusiness");
    }

    public void K(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bfb8e70", new Object[]{this, str, str2, str3, str4, str5});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            UploadFansActionRequest uploadFansActionRequest = new UploadFansActionRequest();
            uploadFansActionRequest.scopeId = str4;
            uploadFansActionRequest.subScope = str5;
            uploadFansActionRequest.action = str;
            uploadFansActionRequest.params = str2;
            uploadFansActionRequest.trackParams = str3;
            C(0, uploadFansActionRequest, null);
        }
    }

    public void L(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7e9efd5", new Object[]{this, str, str2, str3, str4});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            MtopTaobaoGiuliaIntimacyActionEventRequest mtopTaobaoGiuliaIntimacyActionEventRequest = new MtopTaobaoGiuliaIntimacyActionEventRequest();
            mtopTaobaoGiuliaIntimacyActionEventRequest.setBizCode("babyCycle");
            mtopTaobaoGiuliaIntimacyActionEventRequest.setSource(str4);
            mtopTaobaoGiuliaIntimacyActionEventRequest.setTargetUid(str2);
            mtopTaobaoGiuliaIntimacyActionEventRequest.setAction(str);
            mtopTaobaoGiuliaIntimacyActionEventRequest.setBabyCycleId(str3);
            C(0, mtopTaobaoGiuliaIntimacyActionEventRequest, MtopTaobaoGiuliaIntimacyActionEventResponse.class);
        }
    }
}
