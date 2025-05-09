package com.taobao.android.detail.ttdetail.feature;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.bw6;
import tb.mr7;
import tb.t2o;
import tb.tgh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DevFeature {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f6771a = bw6.a(mr7.d());
    public static final Map<String, Boolean> mFeature = new HashMap<String, Boolean>() { // from class: com.taobao.android.detail.ttdetail.feature.DevFeature.1
        {
            Boolean bool = Boolean.FALSE;
            put(DevFeature.sShowDxRenderCost, bool);
            put(DevFeature.sAbilityNotFoundHandlerToast, Boolean.valueOf(DevFeature.a()));
            put(DevFeature.sRequestWithDebugMode, Boolean.valueOf(DevFeature.a()));
            put(DevFeature.sHeaderFlingMode, null);
            put(DevFeature.sForceNewArchitecture, Boolean.valueOf(DevFeature.a()));
            put(DevFeature.sCallbackInOnCreate, bool);
            Boolean bool2 = Boolean.TRUE;
            put(DevFeature.sInvokePreloadRender, bool2);
            put(DevFeature.sInvokeStreamingFinish, bool);
            put(DevFeature.sClipStreamingData, bool);
            put(DevFeature.sShowPerformancePanel, bool);
            put(DevFeature.sClipLowDevicePreloadData, bool2);
            put(DevFeature.sTryRequestIndustry, bool);
            put(DevFeature.sDowngradeIndustry, bool);
            put(DevFeature.sTryRequestDetail2, bool);
            put(DevFeature.sInsideWithStdPopAnim, bool);
            put(DevFeature.sBottomInBottomOut, bool);
            put(DevFeature.sFuckStdPopActivityGroup, bool);
            put(DevFeature.sForceConvertIndustryHeader, bool);
            put(DevFeature.sCropMtopData, bool);
            put(DevFeature.sEnableCompatibleSmallWindow, bool);
            put(DevFeature.sDisableStreamingNetwork, bool);
            put(DevFeature.sEnableNewUserBehavior, Boolean.valueOf(DevFeature.a()));
            put(DevFeature.sForceSku2, bool);
            put(DevFeature.sEnableImageBlur, bool);
            put(DevFeature.sMockTBLiveTinyShop, bool);
            put(DevFeature.sForceConvertUltron, bool);
            put(DevFeature.sDisableAllPreload, bool);
            put(DevFeature.sDisableCopySkuData, bool);
            put(DevFeature.sDisableGlobalFloatView, bool);
            put(DevFeature.sEnableMedicalHeaderMask, bool);
            put(DevFeature.sDisableRatePrefetch, bool);
            put(DevFeature.sEnableVolumeSetting, bool);
        }
    };
    public static final String sAbilityNotFoundHandlerToast = "handlerNotFound";
    public static final String sBottomInBottomOut = "bottomInBottomOut";
    public static final String sCallbackInOnCreate = "callbackOnCreateMainThread";
    public static final String sClipLowDevicePreloadData = "clipLowDevicePreloadData";
    public static final String sClipStreamingData = "clipStreamingData";
    public static final String sCropMtopData = "cropMtopData";
    public static final String sDisableAllPreload = "disableAllPreload";
    public static final String sDisableCopySkuData = "disableCopySkuData";
    public static final String sDisableGlobalFloatView = "disableGlobalFloatView";
    public static final String sDisableRatePrefetch = "disableRatePrefetch";
    public static final String sDisableStreamingNetwork = "disableStreamingMtop";
    public static final String sDowngradeDetail2 = "downgradeDetail2";
    public static final String sDowngradeIndustry = "downgradeIndustry";
    public static final String sEnableCompatibleSmallWindow = "compatibleSmallWindow";
    public static final String sEnableImageBlur = "enableImageBlur";
    public static final String sEnableMedicalHeaderMask = "enableHeaderMask";
    public static final String sEnableNewUserBehavior = "enableNewUserBehavior";
    public static final String sEnableVolumeSetting = "enableVolumeSetting";
    public static final String sForceConvertIndustryHeader = "forceConvertIndustryHeader";
    public static final String sForceConvertUltron = "forceConvertUltron";
    public static final String sForceNewArchitecture = "forceNewArchitecture";
    public static final String sForceSku2 = "forceSku2.0";
    public static final String sFuckStdPopActivityGroup = "f**kStdPopActivityGroup";
    public static final String sHeaderFlingMode = "headerFlingMode";
    public static final String sInsideWithStdPopAnim = "insideWithStdPopAnim";
    public static final String sInvokePreloadRender = "invokePreloadRender";
    public static final String sInvokeStreamingFinish = "invokeStreamingFinish";
    public static final String sMockTBLiveTinyShop = "mockTBLiveTinyShop";
    public static final String sRequestWithDebugMode = "requestWithDebugMode";
    public static final String sShowDxRenderCost = "dxCreateRenderCost";
    public static final String sShowPerformancePanel = "showPerformancePanel";
    public static final String sTryRequestDetail2 = "requestDetail2";
    public static final String sTryRequestIndustry = "requestIndustry";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            } else {
                dialogInterface.dismiss();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements DialogInterface.OnMultiChoiceClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String[] f6772a;

        public b(String[] strArr) {
            this.f6772a = strArr;
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public void onClick(DialogInterface dialogInterface, int i, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4add8c27", new Object[]{this, dialogInterface, new Integer(i), new Boolean(z)});
                return;
            }
            String str = this.f6772a[i];
            DevFeature.mFeature.put(str, Boolean.valueOf(z));
            tgh.b("DevFeature", "user switchDevFeature: " + str + " to value: " + z + " Manually");
        }
    }

    static {
        t2o.a(912261762);
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue();
        }
        return f6771a;
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("932e9e3", new Object[]{context});
            return;
        }
        String[] strArr = {sShowDxRenderCost, sAbilityNotFoundHandlerToast, sRequestWithDebugMode, sHeaderFlingMode, sForceNewArchitecture, sCallbackInOnCreate, sInvokePreloadRender, sInvokeStreamingFinish, sClipStreamingData, sShowPerformancePanel, sClipLowDevicePreloadData, sTryRequestIndustry, sDowngradeIndustry, sTryRequestDetail2, sInsideWithStdPopAnim, sBottomInBottomOut, sFuckStdPopActivityGroup, sForceConvertIndustryHeader, sCropMtopData, sEnableCompatibleSmallWindow, sDisableStreamingNetwork, sEnableNewUserBehavior, sForceSku2, sEnableImageBlur, sMockTBLiveTinyShop, sForceConvertUltron, sDisableAllPreload, sDisableCopySkuData, sDisableGlobalFloatView, sEnableMedicalHeaderMask, sDisableRatePrefetch, sEnableVolumeSetting};
        Boolean bool = Boolean.TRUE;
        Map<String, Boolean> map = mFeature;
        new AlertDialog.Builder(context).setTitle("DFeature").setMultiChoiceItems(strArr, new boolean[]{bool.equals(map.get(sShowDxRenderCost)), bool.equals(map.get(sAbilityNotFoundHandlerToast)), bool.equals(map.get(sRequestWithDebugMode)), bool.equals(map.get(sHeaderFlingMode)), bool.equals(map.get(sForceNewArchitecture)), bool.equals(map.get(sCallbackInOnCreate)), bool.equals(map.get(sInvokePreloadRender)), bool.equals(map.get(sInvokeStreamingFinish)), bool.equals(map.get(sClipStreamingData)), bool.equals(map.get(sShowPerformancePanel)), bool.equals(map.get(sClipLowDevicePreloadData)), bool.equals(map.get(sTryRequestIndustry)), bool.equals(map.get(sDowngradeIndustry)), bool.equals(map.get(sTryRequestDetail2)), bool.equals(map.get(sInsideWithStdPopAnim)), bool.equals(map.get(sBottomInBottomOut)), bool.equals(map.get(sFuckStdPopActivityGroup)), bool.equals(map.get(sForceConvertIndustryHeader)), bool.equals(map.get(sCropMtopData)), bool.equals(map.get(sEnableCompatibleSmallWindow)), bool.equals(map.get(sDisableStreamingNetwork)), bool.equals(map.get(sEnableNewUserBehavior)), bool.equals(map.get(sForceSku2)), bool.equals(map.get(sEnableImageBlur)), bool.equals(map.get(sMockTBLiveTinyShop)), bool.equals(map.get(sForceConvertUltron)), bool.equals(map.get(sDisableAllPreload)), bool.equals(map.get(sDisableCopySkuData)), bool.equals(map.get(sDisableGlobalFloatView)), bool.equals(map.get(sEnableMedicalHeaderMask)), bool.equals(map.get(sDisableRatePrefetch)), bool.equals(map.get(sEnableVolumeSetting))}, new b(strArr)).setCancelable(false).setNegativeButton("dismiss", new a()).create().show();
    }
}
