package com.ut.share.executor;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.ut.share.SharePlatform;
import com.ut.share.ShareResponse;
import com.ut.share.data.ShareData;
import com.ut.share.inter.ShareListener;
import com.ut.share.sdk.ShareDingTalkController;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DingTalkExecutor implements IShareExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String APP_ID;
    private ShareDingTalkController dingTalk;

    static {
        t2o.a(662700061);
        t2o.a(662700066);
    }

    public ShareDingTalkController getDingTalk() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareDingTalkController) ipChange.ipc$dispatch("a83abc60", new Object[]{this});
        }
        return this.dingTalk;
    }

    @Override // com.ut.share.executor.IShareExecutor
    public boolean isAppAvailable(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a500273", new Object[]{this, context})).booleanValue();
        }
        if (TextUtils.isEmpty(APP_ID) || !(context instanceof Activity)) {
            return false;
        }
        if (this.dingTalk == null) {
            this.dingTalk = new ShareDingTalkController(context, APP_ID);
        }
        return this.dingTalk.isDDAppAvaliable(context);
    }

    @Override // com.ut.share.executor.IShareExecutor
    public void register(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca24689b", new Object[]{this, map});
        } else {
            APP_ID = map.get("appId");
        }
    }

    @Override // com.ut.share.executor.IShareExecutor
    public void share(Context context, ShareData shareData, ShareListener shareListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("532a854a", new Object[]{this, context, shareData, shareListener});
        } else if (!TextUtils.isEmpty(APP_ID)) {
            if (this.dingTalk == null) {
                this.dingTalk = new ShareDingTalkController(context, APP_ID);
            }
            this.dingTalk.share(context, shareData, shareListener);
        } else if (shareListener != null) {
            ShareResponse shareResponse = new ShareResponse();
            shareResponse.platform = SharePlatform.DingTalk;
            shareResponse.errorCode = ShareResponse.ErrorCode.ERR_FAIL;
            shareResponse.data = shareData;
            shareResponse.errorMessage = Localization.q(R.string.taobao_app_1010_1_18103);
            shareListener.onResponse(shareResponse);
        }
    }

    @Override // com.ut.share.executor.IShareExecutor
    public boolean supportImageShare() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e67c8f7e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.ut.share.executor.IShareExecutor
    public boolean isAppAvailable(Context context, SharePlatform sharePlatform) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("186c2822", new Object[]{this, context, sharePlatform})).booleanValue() : isAppAvailable(context);
    }

    @Override // com.ut.share.executor.IShareExecutor
    public void share(Context context, SharePlatform sharePlatform, ShareData shareData, ShareListener shareListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d8b03b", new Object[]{this, context, sharePlatform, shareData, shareListener});
        } else {
            share(context, shareData, shareListener);
        }
    }
}
