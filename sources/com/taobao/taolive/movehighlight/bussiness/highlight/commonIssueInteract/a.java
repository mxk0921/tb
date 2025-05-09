package com.taobao.taolive.movehighlight.bussiness.highlight.commonIssueInteract;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.movehighlight.bundle.timeshift.model.LiveTimemovingModel;
import com.taobao.taolive.movehighlight.bussiness.highlight.commonIssueInteract.LiveCommonIssueInteractRequest;
import java.util.HashMap;
import tb.b0d;
import tb.nt1;
import tb.t2o;
import tb.zqq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092599);
    }

    public a(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/bussiness/highlight/commonIssueInteract/LiveCommonIssueInteractBusiness");
    }

    public void K(LiveTimemovingModel liveTimemovingModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f0e5f6", new Object[]{this, liveTimemovingModel});
        } else if (liveTimemovingModel != null && liveTimemovingModel.rightInfo != null && liveTimemovingModel.extendVal != null) {
            LiveCommonIssueInteractRequest liveCommonIssueInteractRequest = new LiveCommonIssueInteractRequest();
            liveCommonIssueInteractRequest.liveId = zqq.h(liveTimemovingModel.extendVal.liveId);
            liveCommonIssueInteractRequest.anchorId = zqq.h(liveTimemovingModel.extendVal.anchorId);
            liveCommonIssueInteractRequest.asac = liveTimemovingModel.rightInfo.asac;
            LiveCommonIssueInteractRequest.ExtendParams extendParams = new LiveCommonIssueInteractRequest.ExtendParams();
            LiveTimemovingModel.RightInfo rightInfo = liveTimemovingModel.rightInfo;
            extendParams.strategyCode = rightInfo.strategyCode;
            extendParams.channel = rightInfo.channel;
            extendParams.benefitCode = rightInfo.benefitCode;
            String str = rightInfo.asac;
            extendParams.asac = str;
            liveCommonIssueInteractRequest.extendParams = extendParams;
            if (str != null && !TextUtils.isEmpty(str)) {
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("asac", extendParams.asac);
                A(hashMap);
            }
            C(0, liveCommonIssueInteractRequest, LiveCommonIssueInteractResponse.class);
        }
    }
}
