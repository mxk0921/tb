package com.ut.share.executor;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.share.SharePlatform;
import com.ut.share.ShareResponse;
import com.ut.share.data.ShareData;
import com.ut.share.inter.ShareListener;
import java.util.Map;
import tb.blo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class CopyExecutor implements IShareExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(662700060);
        t2o.a(662700066);
    }

    @Override // com.ut.share.executor.IShareExecutor
    public boolean isAppAvailable(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a500273", new Object[]{this, context})).booleanValue();
        }
        return true;
    }

    @Override // com.ut.share.executor.IShareExecutor
    public void register(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca24689b", new Object[]{this, map});
        }
    }

    @Override // com.ut.share.executor.IShareExecutor
    public void share(Context context, ShareData shareData, ShareListener shareListener) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("532a854a", new Object[]{this, context, shareData, shareListener});
        } else if (shareData != null && (!TextUtils.isEmpty(shareData.getText()) || !TextUtils.isEmpty(shareData.getLink()))) {
            if (!TextUtils.isEmpty(shareData.getText())) {
                str = shareData.getText();
            } else {
                str = "";
            }
            if (!TextUtils.isEmpty(shareData.getLink())) {
                if (TextUtils.isEmpty(str)) {
                    str = shareData.getLink();
                } else {
                    str = str.concat(" ").concat(shareData.getLink());
                }
            }
            shareData.setText(str);
            if (shareListener != null) {
                ShareResponse shareResponse = new ShareResponse();
                shareResponse.platform = SharePlatform.Copy;
                shareResponse.errorCode = ShareResponse.ErrorCode.ERR_START;
                shareResponse.data = shareData;
                shareListener.onResponse(shareResponse);
            }
            try {
                ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(blo.TAO_FLAG, shareData.getText()));
            } catch (Exception e) {
                e.printStackTrace();
                ShareResponse shareResponse2 = new ShareResponse();
                shareResponse2.platform = SharePlatform.Copy;
                shareResponse2.errorCode = ShareResponse.ErrorCode.ERR_FAIL;
                shareResponse2.data = shareData;
                shareListener.onResponse(shareResponse2);
            }
            if (shareListener != null) {
                ShareResponse shareResponse3 = new ShareResponse();
                shareResponse3.platform = SharePlatform.Copy;
                shareResponse3.errorCode = ShareResponse.ErrorCode.ERR_SUCCESS;
                shareResponse3.data = shareData;
                shareListener.onResponse(shareResponse3);
            }
        } else if (shareListener != null) {
            ShareResponse shareResponse4 = new ShareResponse();
            shareResponse4.platform = SharePlatform.Copy;
            shareResponse4.errorCode = ShareResponse.ErrorCode.ERR_FAIL;
            shareListener.onResponse(shareResponse4);
        }
    }

    @Override // com.ut.share.executor.IShareExecutor
    public boolean supportImageShare() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e67c8f7e", new Object[]{this})).booleanValue();
        }
        return false;
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
