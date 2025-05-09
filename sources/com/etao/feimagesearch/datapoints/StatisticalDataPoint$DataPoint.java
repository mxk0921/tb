package com.etao.feimagesearch.datapoints;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum StatisticalDataPoint$DataPoint {
    IRP_JS_ORANGE_FALLBACK("irpJsOrangeFallback", "irp js 回滚"),
    IRP_MULTI_REGION_CLICK("multiregionClick", "多物体点击"),
    IRP_MULTI_REGION_SHOW("multiregionShow", "多物体检测后显示"),
    IRP_CLOSE_RESULT_PAGE_CLICK("CloseResultPageClicked", "关闭结果窗口"),
    IRP_CLOSE_RESULT_PAGE_BACK_CLICK("CloseResultPageBackPressed", "通过Back关闭结果窗口"),
    IRP_NETWORK_BUILD_FAILED("buildNetFailed", "创建网络失败"),
    IRP_NETWORK_BRANCH_RESULT("BranchResult", "分类网络结果"),
    IRP_LOGO_FEATURE_BUILD_FAILED("LogoFeatureDownLoadFail", "创建Logo识别feature失败"),
    IRP_COMMERCIAL_FEATURE_BUILD_FAILED("CommercialFeatureDownloadFailed", "创建确定性商品识别feature失败"),
    IRP_LOW_MEMORY("LowMemory", "低内存报警"),
    IRP_RELEASE_MODEL_ON_LOW_MEMORY("ReleaseModelOnLowMemory", "低内存报警后释放网络"),
    IRP_NPU_RUNNING("NPURunning", "NPU模型"),
    IRP_NPU_DOWNGRADE("ModelDowngrade", "NPU模型降级"),
    IRP_NPU_PERFORMANCE("NPUPerformance", "NPU性能"),
    SCAN_LOGO_RESULT("Logorec", "识别到的logo"),
    SCAN_LOGO_ONLINE("LogoNetToServer", "服务器侧识别"),
    SCAN_BRANCH_RESULT("branchRec", "识别到的Branch"),
    EDGE_COMPUTE_ON("edgeComputeOn", "命中端上新链路"),
    EDGE_COMPUTE_DETECT("edgeComputeDetectSuccess", "端上抠图成功"),
    EDGE_COMPUTE_CLASSIFY("edgeComputeClassifySuccess", "端上类目预测成功"),
    EDGE_COMPUTE_TIMEOUT("edgeComputeTimeout", "端上新链路超时"),
    EDGE_COMPUTE_CROPUPLOAD("edgeComputeCropUpload", "端上上传的是抠图后的结果"),
    EDGE_COMPUTE_PREPAREFAIL("edgeComputePrepareFailed", "端上网络构建失败"),
    SCAN_QRCODE("ScanQRCodeResult", "二维码扫描埋点"),
    SEARCH_SOURCE("img_src", "图搜的图像来源"),
    SEARCH_MOVE_REGION("PartEdited", "移动物体Region发起搜索"),
    SEARCH_UPLOAD_PERFORMANCE("img_upload_performance", "图搜的上传文件数据"),
    SEARCH_FROM_SHOP("search_from_shop", "店铺内搜索"),
    REAL_RESULT_PAGE("real_result_page", "真实结果页到达次数");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String mDesc;
    private final String mPoint;

    StatisticalDataPoint$DataPoint(String str, String str2) {
        this.mPoint = str;
        this.mDesc = str2;
    }

    public static /* synthetic */ Object ipc$super(StatisticalDataPoint$DataPoint statisticalDataPoint$DataPoint, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/datapoints/StatisticalDataPoint$DataPoint");
    }

    public static StatisticalDataPoint$DataPoint valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StatisticalDataPoint$DataPoint) ipChange.ipc$dispatch("45aafe8c", new Object[]{str});
        }
        return (StatisticalDataPoint$DataPoint) Enum.valueOf(StatisticalDataPoint$DataPoint.class, str);
    }

    public String getDesc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f24b4252", new Object[]{this});
        }
        return this.mDesc;
    }

    public String getPoint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("690aff5f", new Object[]{this});
        }
        return this.mPoint;
    }
}
