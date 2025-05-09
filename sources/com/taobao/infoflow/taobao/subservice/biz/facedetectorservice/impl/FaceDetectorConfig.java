package com.taobao.infoflow.taobao.subservice.biz.facedetectorservice.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import tb.cfc;
import tb.fve;
import tb.t2o;
import tb.w1e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FaceDetectorConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f10744a;
    public final IContainerDataService<?> b;
    public FaceDetectionConfigInfo c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class FaceDetectionConfigInfo implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String preDetectionIntervalTime = "10";
        public String intervalTime = "600";
        public String preDetectionThreshold = "3";
        public String detectionContinuedFailThreshold = "5";
        public String detectionContinuedErrorCloseThreshold = "10";
        public String detectionContinuedFailCloseThreshold = "10";
        public String continuedIsNotFarApartThreshold = "2";
        public String continuedIsNotFarApartCloseThreshold = "10";
        public String continuedIsFarApartThreshold = "3";
        public ArrayList<Float> farApartThresholdList = new ArrayList<>();
        public HashMap<Float, ArrayList<Float>> areaRatioToScaleMap = new HashMap<>();
        public boolean enableOpenFaceDetector = false;
        public boolean isNeedLocalScale = false;
        public boolean isNeedResultStatistics = false;
        public boolean isNeedAddSelectView = false;

        static {
            t2o.a(491782346);
        }

        public void defaultAreaRatioToScaleMap() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f2944f1", new Object[]{this});
                return;
            }
            ArrayList<Float> arrayList = new ArrayList<>();
            arrayList.add(Float.valueOf(1.4f));
            arrayList.add(Float.valueOf(1.2f));
            ArrayList<Float> arrayList2 = new ArrayList<>();
            arrayList2.add(Float.valueOf(1.8f));
            arrayList2.add(Float.valueOf(1.6f));
            ArrayList<Float> arrayList3 = new ArrayList<>();
            arrayList3.add(Float.valueOf(2.0f));
            arrayList3.add(Float.valueOf(1.8f));
            this.areaRatioToScaleMap.put(Float.valueOf(2.5f), arrayList);
            this.areaRatioToScaleMap.put(Float.valueOf(4.0f), arrayList2);
            this.areaRatioToScaleMap.put(Float.valueOf(6.0f), arrayList3);
            this.farApartThresholdList.add(Float.valueOf(2.5f));
            this.farApartThresholdList.add(Float.valueOf(4.0f));
            this.farApartThresholdList.add(Float.valueOf(6.0f));
        }

        public int getDetectionContinuedErrorCloseThreshold() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dcc26f07", new Object[]{this})).intValue();
            }
            try {
                return Integer.parseInt(this.detectionContinuedErrorCloseThreshold);
            } catch (NumberFormatException unused) {
                return 10;
            }
        }

        public int getDetectionContinuedFailCloseThreshold() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("49285b39", new Object[]{this})).intValue();
            }
            try {
                return Integer.parseInt(this.detectionContinuedFailCloseThreshold);
            } catch (NumberFormatException unused) {
                return 10;
            }
        }

        public ArrayList<Float> getFarApartScaleList(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("7287953e", new Object[]{this, new Float(f)});
            }
            if (this.farApartThresholdList.isEmpty() || this.areaRatioToScaleMap.isEmpty()) {
                defaultAreaRatioToScaleMap();
            }
            int size = this.farApartThresholdList.size();
            float f2 = 0.0f;
            for (int i = 0; i < size && this.farApartThresholdList.get(i).floatValue() <= f; i++) {
                f2 = this.farApartThresholdList.get(i).floatValue();
            }
            return this.areaRatioToScaleMap.get(Float.valueOf(f2));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IContainerDataService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void j(w1e w1eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c0b6e76", new Object[]{this, w1eVar});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void l(w1e w1eVar, IContainerDataModel<?> iContainerDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec3ff412", new Object[]{this, w1eVar, iContainerDataModel});
            } else {
                FaceDetectorConfig.a(FaceDetectorConfig.this, iContainerDataModel);
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void m(w1e w1eVar, IContainerDataModel<?> iContainerDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e9a5c54", new Object[]{this, w1eVar, iContainerDataModel});
            }
        }
    }

    static {
        t2o.a(491782344);
    }

    public FaceDetectorConfig(cfc cfcVar) {
        this.f10744a = cfcVar;
        this.b = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        g();
    }

    public static /* synthetic */ void a(FaceDetectorConfig faceDetectorConfig, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eb176b3", new Object[]{faceDetectorConfig, iContainerDataModel});
        } else {
            faceDetectorConfig.f(iContainerDataModel);
        }
    }

    public final IContainerDataService.a b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.a) ipChange.ipc$dispatch("a5b738e0", new Object[]{this});
        }
        return new a();
    }

    public FaceDetectionConfigInfo c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FaceDetectionConfigInfo) ipChange.ipc$dispatch("425be1e4", new Object[]{this});
        }
        return this.c;
    }

    public final JSONObject d(IContainerInnerDataModel<?> iContainerInnerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("de5b6ff", new Object[]{this, iContainerInnerDataModel});
        }
        if (iContainerInnerDataModel == null) {
            fve.e("FaceDetectorConfig", "baseData == null");
            return null;
        }
        JSONObject ext = iContainerInnerDataModel.getExt();
        if (ext != null) {
            return ext.getJSONObject("homeGlobalABTest");
        }
        fve.e("FaceDetectorConfig", "ext == null");
        return null;
    }

    public final JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d70d4561", new Object[]{this});
        }
        IContainerDataService<?> iContainerDataService = this.b;
        if (iContainerDataService == null) {
            fve.e("FaceDetectorConfig", "containerDataService == null");
            return null;
        }
        IContainerDataModel containerData = iContainerDataService.getContainerData();
        if (containerData != null) {
            return d(containerData.getBase());
        }
        fve.e("FaceDetectorConfig", "containerData == null");
        return null;
    }

    public final void f(IContainerDataModel<?> iContainerDataModel) {
        IContainerInnerDataModel<?> base;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d00a22a3", new Object[]{this, iContainerDataModel});
        } else if (iContainerDataModel != null && (base = iContainerDataModel.getBase()) != null) {
            this.c = (FaceDetectionConfigInfo) JSON.toJavaObject(d(base), FaceDetectionConfigInfo.class);
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecb9ed", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f10744a.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            fve.e("FaceDetectorConfig", "containerDataService == null");
            return;
        }
        this.c = (FaceDetectionConfigInfo) JSON.toJavaObject(e(), FaceDetectionConfigInfo.class);
        iContainerDataService.addDataProcessListener(b());
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9240fcd", new Object[]{this})).booleanValue();
        }
        FaceDetectionConfigInfo faceDetectionConfigInfo = this.c;
        if (faceDetectionConfigInfo != null) {
            return faceDetectionConfigInfo.isNeedAddSelectView;
        }
        return false;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28136aaa", new Object[]{this})).booleanValue();
        }
        FaceDetectionConfigInfo faceDetectionConfigInfo = this.c;
        if (faceDetectionConfigInfo != null) {
            return faceDetectionConfigInfo.isNeedLocalScale;
        }
        return false;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ff26f02", new Object[]{this})).booleanValue();
        }
        FaceDetectionConfigInfo faceDetectionConfigInfo = this.c;
        if (faceDetectionConfigInfo != null) {
            return faceDetectionConfigInfo.enableOpenFaceDetector;
        }
        return false;
    }
}
