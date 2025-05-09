package com.taobao.calendar.sdk.synchronize;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.taobao.calendar.sdk.Preferences;
import com.taobao.calendar.sdk.TBCalendar;
import com.taobao.calendar.sdk.db.TableSchedule;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.io.Serializable;
import java.util.List;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class SynBusinessProxy implements Serializable {
    private static String TAG = "SynBusinessProxy";
    private static String groupName = "calendar";
    private static String key = "enableRemindSync";
    private Context mContext;
    private IRemoteListener mListener = new IRemoteListener() { // from class: com.taobao.calendar.sdk.synchronize.SynBusinessProxy.1
        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            Log.e("Test", "onError" + obj);
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            if (mtopResponse.isApiSuccess()) {
                MtopCalRemindSubmitAndUpdateResponseData mtopCalRemindSubmitAndUpdateResponseData = (MtopCalRemindSubmitAndUpdateResponseData) baseOutDo.getData();
                if (mtopCalRemindSubmitAndUpdateResponseData.isNeedUpdate() && TableSchedule.cacheToDB(mtopCalRemindSubmitAndUpdateResponseData.getUpdateData())) {
                    if (Preferences.mEditor == null && SynBusinessProxy.this.mContext != null) {
                        Preferences.init(SynBusinessProxy.this.mContext);
                    }
                    Preferences.mEditor.putLong(SynBusinessProxy.this.mUserId, mtopCalRemindSubmitAndUpdateResponseData.getLut().longValue());
                    Preferences.mEditor.apply();
                    return;
                }
                return;
            }
            onError(i, mtopResponse, obj);
        }
    };
    private String mTtid;
    private String mUserId;

    static {
        t2o.a(414187601);
    }

    public SynBusinessProxy(Context context, String str, String str2) {
        this.mContext = null;
        this.mContext = context;
        this.mUserId = str;
        this.mTtid = str2;
    }

    public void getScheduleByScanCode(MtopListener mtopListener, String str) {
        if (!TextUtils.isEmpty(str)) {
            MtopGetScheduleByScanCodeRequest mtopGetScheduleByScanCodeRequest = new MtopGetScheduleByScanCodeRequest();
            mtopGetScheduleByScanCodeRequest.setCode(str);
            RemoteBusiness registeListener = RemoteBusiness.build((IMTOPDataObject) mtopGetScheduleByScanCodeRequest, this.mTtid).registeListener(mtopListener);
            registeListener.setBizId(22);
            registeListener.startRequest(MtopGetScheduleByScanCodeResponse.class);
        }
    }

    public void submitAndUpdate() {
        String config = OrangeConfig.getInstance().getConfig(groupName, key, "true");
        if (this.mContext == null || TextUtils.isEmpty(config) || !config.equalsIgnoreCase("true") || !validateUserId(this.mUserId)) {
            Log.e(TAG, "xcommand has closed all mtop request!");
            return;
        }
        List<ScheduleModel> scheduleNoSynListFromDB = TableSchedule.getScheduleNoSynListFromDB("", "", this.mUserId);
        if (Preferences.mPref == null) {
            Preferences.init(this.mContext);
        }
        long j = Preferences.mPref.getLong(this.mUserId, 1L);
        MtopCalRemindSubmitAndUpdateRequest mtopCalRemindSubmitAndUpdateRequest = new MtopCalRemindSubmitAndUpdateRequest();
        mtopCalRemindSubmitAndUpdateRequest.setSubmitData(scheduleNoSynListFromDB);
        mtopCalRemindSubmitAndUpdateRequest.setLut(j);
        RemoteBusiness registeListener = RemoteBusiness.build(this.mContext, mtopCalRemindSubmitAndUpdateRequest, TBCalendar.ttid).registeListener((MtopListener) this.mListener);
        registeListener.reqMethod(MethodEnum.POST);
        registeListener.setBizId(22);
        registeListener.startRequest(0, MtopCalRemindSubmitAndUpdateResponse.class);
    }

    public void update(MtopListener mtopListener) {
        String config = OrangeConfig.getInstance().getConfig(groupName, key, "true");
        if (this.mContext == null || TextUtils.isEmpty(config) || !config.equalsIgnoreCase("true") || !validateUserId(this.mUserId)) {
            Log.e(TAG, "xcommand has closed all mtop request!");
            return;
        }
        MtopCalRemindUpdateRequest mtopCalRemindUpdateRequest = new MtopCalRemindUpdateRequest();
        if (Preferences.mPref == null) {
            Preferences.init(this.mContext);
        }
        mtopCalRemindUpdateRequest.setLut(Preferences.mPref.getLong(this.mUserId, 1L));
        RemoteBusiness registeListener = RemoteBusiness.build(this.mContext, mtopCalRemindUpdateRequest, this.mTtid).registeListener(mtopListener);
        registeListener.setBizId(22);
        registeListener.startRequest(MtopCalRemindUpdateResponse.class);
    }

    public boolean validateUserId(String str) {
        if (TextUtils.isEmpty(str) || "0".equals(str) || "1".equals(str)) {
            return false;
        }
        return true;
    }
}
