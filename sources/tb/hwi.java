package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.adapter.IMTopAdapter;
import com.taobao.android.fluid.framework.adapter.mtop.CommonResponseOutDo;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.remote.MediaMixDetailReportRequest;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hwi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements IMTopAdapter.b<CommonResponseOutDo> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public void a(MtopResponse mtopResponse, CommonResponseOutDo commonResponseOutDo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b59981a2", new Object[]{this, mtopResponse, commonResponseOutDo});
            }
        }

        @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter.b
        public void onError(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c98ef35", new Object[]{this, mtopResponse});
            }
        }
    }

    static {
        t2o.a(468714310);
    }

    public static void a(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad1492f7", new Object[]{fluidContext, str});
            return;
        }
        ncp j = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j();
        if (j != null && j.u) {
            String unExposeIds = ((IDataService) fluidContext.getService(IDataService.class)).getUnExposeIds();
            if (!TextUtils.isEmpty(unExposeIds)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("recallContentIds", (Object) unExposeIds);
                pep sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
                MediaMixDetailReportRequest mediaMixDetailReportRequest = new MediaMixDetailReportRequest();
                if (TextUtils.isEmpty(str)) {
                    str = sessionParams.d;
                }
                mediaMixDetailReportRequest.contentId = str;
                mediaMixDetailReportRequest.source = sessionParams.c;
                mediaMixDetailReportRequest.type = sessionParams.b;
                mediaMixDetailReportRequest.eventType = "1001";
                mediaMixDetailReportRequest.extendParameters = hxf.d(jSONObject);
                FluidSDK.getMTopAdapter().send(mediaMixDetailReportRequest, new a());
                s19.v(fluidContext);
            }
        }
    }
}
