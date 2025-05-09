package com.ta.audid.upload;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.audid.store.UtdidContentBuilder;
import com.ta.audid.store.UtdidContentUtil;
import com.ta.audid.utils.NetworkInfoUtils;
import com.ta.audid.utils.UtdidLogger;
import com.ta.utdid2.device.AppUtdid;
import com.ta.utdid2.device.UtdidResponse;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class UtdidUploadTask implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String POST_HTTP_URL = "https://audid-api.taobao.com/v2.0/a/audid/req/";
    private static volatile boolean bRunning = false;
    private Context mContext;

    static {
        t2o.a(966787084);
    }

    public UtdidUploadTask(Context context) {
        this.mContext = context;
    }

    private String buildPostData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ac8d7101", new Object[]{this});
        }
        String currentAppUtdid = AppUtdid.getInstance().getCurrentAppUtdid();
        if (TextUtils.isEmpty(currentAppUtdid)) {
            return null;
        }
        String buildUDID = UtdidContentBuilder.buildUDID(currentAppUtdid);
        if (UtdidLogger.isDebug()) {
            UtdidLogger.sd("", buildUDID);
        }
        return UtdidContentUtil.getEncodedContent(buildUDID);
    }

    private boolean reqServer(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f671956", new Object[]{this, str})).booleanValue();
        }
        HttpResponse sendRequest = HttpUtils.sendRequest(POST_HTTP_URL, str, true);
        if (sendRequest == null) {
            return false;
        }
        return UtdidResponse.response(sendRequest);
    }

    private void upload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f170aa08", new Object[]{this});
            return;
        }
        UtdidLogger.d();
        if (NetworkInfoUtils.isConnectInternet(this.mContext) && !bRunning) {
            bRunning = true;
            try {
                uploadFromCache();
            } catch (Throwable unused) {
            }
            bRunning = false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            upload();
        } catch (Throwable th) {
            UtdidLogger.e("", th, new Object[0]);
        }
    }

    private void uploadFromCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a91f55fe", new Object[]{this});
            return;
        }
        UtdidLogger.d();
        String buildPostData = buildPostData();
        if (TextUtils.isEmpty(buildPostData)) {
            UtdidLogger.d("postData is empty", new Object[0]);
        } else if (reqServer(buildPostData)) {
            UtdidLogger.d("", "upload success");
        } else {
            UtdidLogger.d("", "upload fail");
        }
    }
}
