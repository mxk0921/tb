package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class n4u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f24511a;

    static {
        t2o.a(491782719);
    }

    public n4u(cfc cfcVar) {
        this.f24511a = cfcVar;
    }

    public JSONObject b(IContainerInnerDataModel iContainerInnerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("60537a78", new Object[]{this, iContainerInnerDataModel});
        }
        fve.e(obq.SPLASH_BUSINESS_TAG, "parseSplashData->  begin ----- ");
        if (iContainerInnerDataModel == null) {
            fve.e(obq.SPLASH_BUSINESS_TAG, "parseSplashData->  baseData is null, end just return null.");
            return null;
        }
        JSONObject topViewSplashSection = iContainerInnerDataModel.getTopViewSplashSection();
        if (topViewSplashSection == null) {
            fve.e(obq.SPLASH_BUSINESS_TAG, "parseSplashData->  end jsonObject not available.");
            return null;
        }
        fve.e(obq.SPLASH_BUSINESS_TAG, "parseSplashData->  end with success");
        return topViewSplashSection;
    }

    public boolean a(IContainerInnerDataModel iContainerInnerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe0fbbf2", new Object[]{this, iContainerInnerDataModel})).booleanValue();
        }
        if (iContainerInnerDataModel == null || iContainerInnerDataModel.getExt() == null) {
            fve.e(obq.SPLASH_BUSINESS_TAG, "isNeedUpdateSplashData->   baseData == null");
            t4u.b("0", "baseData == null", "");
            return false;
        }
        boolean booleanValue = iContainerInnerDataModel.getExt().getBooleanValue("updateTopview");
        if (!booleanValue) {
            fve.e(obq.SPLASH_BUSINESS_TAG, "isNeedUpdateSplashData, updateTopview is false, no need update splash data.");
            t4u.b("0", "!isNeedUpdateSplashData", "");
        } else {
            fve.e(obq.SPLASH_BUSINESS_TAG, "isNeedUpdateSplashData, updateTopview is true, need update splash data.");
        }
        return booleanValue;
    }
}
