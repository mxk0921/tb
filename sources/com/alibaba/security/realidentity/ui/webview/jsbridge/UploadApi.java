package com.alibaba.security.realidentity.ui.webview.jsbridge;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.a;
import com.alibaba.security.realidentity.i3;
import com.alibaba.security.realidentity.i4;
import com.alibaba.security.realidentity.j4;
import com.alibaba.security.realidentity.l4;
import com.alibaba.security.realidentity.service.upload.UploadFileModel;
import com.alibaba.security.realidentity.u4;
import com.alibaba.security.realidentity.ui.webview.jsbridge.annotation.JSTopic;
import com.alibaba.security.realidentity.ui.webview.jsbridge.entity.WVResultWrapper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import tb.nsw;

/* compiled from: Taobao */
@JSTopic(topic = "uploadPhoto")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UploadApi extends BaseJsExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public j4 mUploadFileManager;

    public UploadApi(u4 u4Var) {
        super(u4Var);
    }

    public static /* synthetic */ Object ipc$super(UploadApi uploadApi, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/ui/webview/jsbridge/UploadApi");
    }

    @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor
    public String getTrackMethod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("145b9fe3", new Object[]{this});
        }
        return "uploadPhoto";
    }

    @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor
    public boolean execute(String str, final JsCallbackAdapter jsCallbackAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d162c2f", new Object[]{this, str, jsCallbackAdapter})).booleanValue();
        }
        if (a.a()) {
            a.a(BaseJsExecutor.TAG, "UploadApi execute params:" + str);
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            final String str2 = null;
            final String string = (parseObject == null || !parseObject.containsKey(BaseJsExecutor.NAME_PHOTO_ID)) ? null : parseObject.getString(BaseJsExecutor.NAME_PHOTO_ID);
            if (parseObject != null && parseObject.containsKey(BaseJsExecutor.NAME_PHOTO_TYPE)) {
                str2 = parseObject.getString(BaseJsExecutor.NAME_PHOTO_TYPE);
            }
            String a2 = i3.a().a(string);
            if (a2 == null) {
                WVResultWrapper wVResultWrapper = new WVResultWrapper();
                wVResultWrapper.addData(BaseJsExecutor.NAME_PHOTO_TYPE, str2);
                wVResultWrapper.addData(BaseJsExecutor.NAME_PHOTO_ID, string);
                wVResultWrapper.addData("errorMsg", "");
                jsCallbackAdapter.error(wVResultWrapper);
                finishJsBridge(wVResultWrapper, false);
                return false;
            }
            if (this.mUploadFileManager == null) {
                this.mUploadFileManager = i4.a(this.mContext, this.mRPBizConfig.getBasicsConfig().verifyToken, this.mVerifyBizCapacity);
            }
            final String b = i3.a().b(string);
            UploadFileModel uploadFileModel = new UploadFileModel();
            uploadFileModel.mLocalFilePath = a2;
            uploadFileModel.mFileType = "jpeg";
            RPUploadTaskCache.getInstance().put(string, this.mUploadFileManager.a("image/jpeg", this.mRPBizConfig.getOssConfig(), uploadFileModel, new l4() { // from class: com.alibaba.security.realidentity.ui.webview.jsbridge.UploadApi.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.security.realidentity.l4
                public void onCancel() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("379d4540", new Object[]{this});
                    } else {
                        RPUploadTaskCache.getInstance().remove(string);
                    }
                }

                @Override // com.alibaba.security.realidentity.l4
                public void onProgress(long j, long j2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7a56ab73", new Object[]{this, new Long(j), new Long(j2)});
                        return;
                    }
                    nsw nswVar = new nsw();
                    nswVar.b(BaseJsExecutor.NAME_TOTAL_BYTES_SENT, String.valueOf(j));
                    nswVar.b(BaseJsExecutor.NAME_TOTAL_BYTES_EXPECTED_TOSEND, String.valueOf(j2));
                    nswVar.k();
                    UploadApi.this.mWVCallbackContext.fireEvent("rpUploadProgress", nswVar.m());
                }

                @Override // com.alibaba.security.realidentity.l4
                public void onError(String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ac367d3a", new Object[]{this, str3});
                        return;
                    }
                    RPUploadTaskCache.getInstance().remove(string);
                    WVResultWrapper wVResultWrapper2 = new WVResultWrapper();
                    wVResultWrapper2.addData(BaseJsExecutor.NAME_PHOTO_TYPE, str2);
                    wVResultWrapper2.addData(BaseJsExecutor.NAME_PHOTO_ID, string);
                    wVResultWrapper2.addData("errorMsg", str3);
                    jsCallbackAdapter.error(wVResultWrapper2);
                    UploadApi.this.finishJsBridge(wVResultWrapper2, false);
                }

                @Override // com.alibaba.security.realidentity.l4
                public void onSuccess(String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("37d948b5", new Object[]{this, str3});
                        return;
                    }
                    RPUploadTaskCache.getInstance().remove(string);
                    if (b != null) {
                        String str4 = "sign=" + b;
                        try {
                            str4 = URLEncoder.encode(str4, "UTF-8");
                        } catch (UnsupportedEncodingException unused) {
                        }
                        str3 = str3 + "@" + str4;
                    }
                    jsCallbackAdapter.success("{\"photoType\":\"" + str2 + "\",\"sourceUrl\":\"" + str3 + "\"}");
                    UploadApi.this.finishJsBridge(new WVResultWrapper("success"), true);
                }
            }));
            return true;
        } catch (Exception e) {
            if (a.a()) {
                a.a(BaseJsExecutor.TAG, e);
            }
            trackExceptionLog("UploadApi parse error", e);
            callbackUnknowError(jsCallbackAdapter);
            return false;
        }
    }
}
