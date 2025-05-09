package com.android.dingtalk.share.ddsharemodule.message;

import android.os.Bundle;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.dingtalk.share.ddsharemodule.ShareConstant;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DDWebpageMessage extends BaseMediaObject {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MAX_WEBPAGE_URL_LENGTH = 10240;
    private static final String TAG = "DDWebpageMessage";
    public String mUrl;

    static {
        t2o.a(90177560);
    }

    public static /* synthetic */ Object ipc$super(DDWebpageMessage dDWebpageMessage, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/android/dingtalk/share/ddsharemodule/message/DDWebpageMessage");
    }

    @Override // com.android.dingtalk.share.ddsharemodule.message.BaseMediaObject, com.android.dingtalk.share.ddsharemodule.message.DDMediaMessage.IMediaObject
    public boolean checkArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30f26010", new Object[]{this})).booleanValue();
        }
        String str = this.mUrl;
        if (str != null && str.length() != 0 && this.mUrl.length() <= 10240) {
            return true;
        }
        Log.e(TAG, "checkArgs fail, url is invalid");
        return false;
    }

    @Override // com.android.dingtalk.share.ddsharemodule.message.BaseMediaObject, com.android.dingtalk.share.ddsharemodule.message.DDMediaMessage.IMediaObject
    public int getSupportVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6cc357f9", new Object[]{this})).intValue();
        }
        return ShareConstant.DINGDING_SDK_SHARE_VERSION_V1;
    }

    @Override // com.android.dingtalk.share.ddsharemodule.message.BaseMediaObject, com.android.dingtalk.share.ddsharemodule.message.DDMediaMessage.IMediaObject
    public void serialize(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16284a0d", new Object[]{this, bundle});
        } else if (bundle != null) {
            bundle.putString(ShareConstant.EXTRA_WEB_PAGE_OBJECT_URL, this.mUrl);
        }
    }

    @Override // com.android.dingtalk.share.ddsharemodule.message.BaseMediaObject, com.android.dingtalk.share.ddsharemodule.message.DDMediaMessage.IMediaObject
    public int type() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d79de6b4", new Object[]{this})).intValue();
        }
        return 1;
    }

    @Override // com.android.dingtalk.share.ddsharemodule.message.BaseMediaObject, com.android.dingtalk.share.ddsharemodule.message.DDMediaMessage.IMediaObject
    public void unserialize(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("185fb4a6", new Object[]{this, bundle});
        } else if (bundle != null) {
            this.mUrl = bundle.getString(ShareConstant.EXTRA_WEB_PAGE_OBJECT_URL);
        }
    }
}
