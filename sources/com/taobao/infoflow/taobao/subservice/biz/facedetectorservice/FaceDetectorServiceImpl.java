package com.taobao.infoflow.taobao.subservice.biz.facedetectorservice;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IFaceDetectorService;
import com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService;
import com.taobao.infoflow.taobao.subservice.biz.facedetectorservice.impl.FaceDetectorConfig;
import com.taobao.infoflow.taobao.subservice.biz.facedetectorservice.impl.a;
import com.taobao.taolive.uikit.api.TBLiveOpenCardView;
import tb.cfc;
import tb.fve;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FaceDetectorServiceImpl implements IFaceDetectorService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FaceDetectorServiceImpl";
    private FaceDetectorConfig mConfig;
    private a mFaceDetectMission;
    private cfc mInfoFlowContext;

    static {
        t2o.a(491782333);
        t2o.a(488636557);
    }

    private boolean enableFaceDetector() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("caf2d3f1", new Object[]{this})).booleanValue();
        }
        FaceDetectorConfig faceDetectorConfig = this.mConfig;
        if (faceDetectorConfig == null) {
            return false;
        }
        return faceDetectorConfig.j();
    }

    private void initFaceDetectorMissionConfig(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("992a42be", new Object[]{this, cfcVar});
            return;
        }
        if (this.mConfig == null) {
            this.mConfig = new FaceDetectorConfig(cfcVar);
        }
        this.mFaceDetectMission.s(this.mConfig);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mInfoFlowContext = cfcVar;
        if (this.mFaceDetectMission == null) {
            this.mFaceDetectMission = new a();
        }
        initFaceDetectorMissionConfig(cfcVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        a aVar = this.mFaceDetectMission;
        if (aVar != null) {
            aVar.q();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IFaceDetectorService
    public void setFirstFrameRendered() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2230dafb", new Object[]{this});
            return;
        }
        a aVar = this.mFaceDetectMission;
        if (aVar != null) {
            aVar.t();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IFaceDetectorService
    public void startFaceDetector(View view, JSONObject jSONObject, JSONObject jSONObject2) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74281d06", new Object[]{this, view, jSONObject, jSONObject2});
            return;
        }
        cfc cfcVar = this.mInfoFlowContext;
        if (cfcVar == null) {
            fve.b(TAG, "infoContext is null");
            return;
        }
        IVideoPlayControllerService iVideoPlayControllerService = (IVideoPlayControllerService) cfcVar.a(IVideoPlayControllerService.class);
        if (iVideoPlayControllerService == null || !iVideoPlayControllerService.isEnable()) {
            fve.b(TAG, "播控不支持");
        } else if (!enableFaceDetector()) {
            fve.b(TAG, "配置开关未打开");
        } else if ((view instanceof TBLiveOpenCardView) && (aVar = this.mFaceDetectMission) != null) {
            aVar.u((TBLiveOpenCardView) view, jSONObject, jSONObject2);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IFaceDetectorService
    public void stopFaceDetector() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2d4d86c", new Object[]{this});
        } else {
            this.mFaceDetectMission.v();
        }
    }
}
