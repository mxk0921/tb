package com.taobao.umipublish.extension.windvane.abilities;

import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class KfcCheckAbility extends MTopAbility implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATE_INVALID = 0;
    public static final int STATE_VALID = 1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class KFCRequest implements IMTOPDataObject {
        public String API_NAME;
        public boolean NEED_ECODE;
        public boolean NEED_SESSION;
        public String VERSION;
        public String params;

        static {
            t2o.a(944767170);
            t2o.a(589299906);
        }

        private KFCRequest() {
            this.API_NAME = "mtop.taobao.media.guang.publish.kfcCheck";
            this.VERSION = "1.0";
            this.NEED_ECODE = true;
            this.NEED_SESSION = true;
            this.params = null;
        }
    }

    static {
        t2o.a(944767168);
        t2o.a(589299719);
    }

    public static /* synthetic */ Object ipc$super(KfcCheckAbility kfcCheckAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/abilities/KfcCheckAbility");
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.MTopAbility
    public String getErrorCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f72feefa", new Object[]{this});
        }
        return "7001";
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility
    public void onExecute(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95fd7073", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            successCallback();
        } else {
            KFCRequest kFCRequest = new KFCRequest();
            kFCRequest.params = jSONObject.toJSONString();
            MtopBusiness.build(Mtop.instance(null), kFCRequest).registerListener((IRemoteListener) this).reqMethod(MethodEnum.POST).setConnectionTimeoutMilliSecond(5000).startRequest();
        }
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.MTopAbility, com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        org.json.JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
        try {
            if (dataJsonObject.optBoolean("hit")) {
                org.json.JSONObject optJSONObject = dataJsonObject.optJSONObject("hitData");
                if (optJSONObject == null) {
                    jSONObject = null;
                } else {
                    jSONObject = JSON.parseObject(optJSONObject.toString());
                }
                invalidCallback(jSONObject);
                return;
            }
            successCallback();
        } catch (Throwable th) {
            errorCallback("7001", Log.getStackTraceString(th));
        }
    }

    private void invalidCallback(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9adabd6d", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("state", (Object) String.valueOf(0));
        jSONObject2.put("invalidData", (Object) jSONObject);
        successCallback(jSONObject2);
    }

    private void successCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eb7a1ef", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", (Object) String.valueOf(1));
        successCallback(jSONObject);
    }
}
