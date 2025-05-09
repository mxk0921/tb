package com.taobao.orange.aidl;

import android.content.Context;
import android.os.RemoteException;
import com.taobao.orange.ConfigCenter;
import com.taobao.orange.OCandidate;
import com.taobao.orange.OConfig;
import com.taobao.orange.a;
import com.taobao.orange.aidl.IOrangeApiService;
import com.taobao.orange.candidate.MultiAnalyze;
import com.taobao.orange.util.OLog;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class OrangeApiServiceStub extends IOrangeApiService.Stub {
    private static final String TAG = "ApiService";
    private Context mContext;

    static {
        t2o.a(613417037);
    }

    public OrangeApiServiceStub(Context context) {
        this.mContext = context.getApplicationContext();
    }

    @Override // com.taobao.orange.aidl.IOrangeApiService
    public void addCandidate(String str, String str2, ParcelableCandidateCompare parcelableCandidateCompare) throws RemoteException {
        MultiAnalyze.addCandidate(new OCandidate(str, str2, parcelableCandidateCompare));
    }

    @Override // com.taobao.orange.aidl.IOrangeApiService
    public void addFails(String[] strArr) throws RemoteException {
        ConfigCenter.getInstance().addFails(strArr);
    }

    @Override // com.taobao.orange.aidl.IOrangeApiService
    public void forceCheckUpdate() throws RemoteException {
        ConfigCenter.getInstance().forceCheckUpdate();
    }

    @Override // com.taobao.orange.aidl.IOrangeApiService
    public String getConfig(String str, String str2, String str3) {
        return ConfigCenter.getInstance().getConfig(str, str2, str3);
    }

    @Override // com.taobao.orange.aidl.IOrangeApiService
    public Map<String, String> getConfigs(String str) throws RemoteException {
        return ConfigCenter.getInstance().getConfigs(str);
    }

    @Override // com.taobao.orange.aidl.IOrangeApiService
    public String getCustomConfig(String str, String str2) throws RemoteException {
        return ConfigCenter.getInstance().getCustomConfig(str, str2);
    }

    @Override // com.taobao.orange.aidl.IOrangeApiService
    public void init(OConfig oConfig) {
        ConfigCenter.getInstance().init(this.mContext, oConfig);
    }

    @Override // com.taobao.orange.aidl.IOrangeApiService
    public void registerListener(String str, ParcelableConfigListener parcelableConfigListener, boolean z) throws RemoteException {
        ConfigCenter.getInstance().registerListener(str, parcelableConfigListener, z);
    }

    @Override // com.taobao.orange.aidl.IOrangeApiService
    public void unregisterListener(String str, ParcelableConfigListener parcelableConfigListener) throws RemoteException {
        ConfigCenter.getInstance().unregisterListener(str, parcelableConfigListener);
    }

    @Override // com.taobao.orange.aidl.IOrangeApiService
    public void unregisterListeners(String str) throws RemoteException {
        ConfigCenter.getInstance().unregisterListeners(str);
    }

    @Override // com.taobao.orange.aidl.IOrangeApiService
    public void setUserId(String str) throws RemoteException {
        OLog.d(TAG, "setUserId", "userId", str);
        a.l = str;
    }
}
