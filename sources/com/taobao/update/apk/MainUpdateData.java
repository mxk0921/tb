package com.taobao.update.apk;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MainUpdateData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long applicationId;
    public long batchId;
    public String channelNum;
    public String etag;
    public String httpsUrl;
    public String info;
    public String md5;
    public String packageUrl;
    public long productId;
    public int remindCount;
    public int remindStrategy;
    public long size;
    public String version;

    static {
        t2o.a(953155592);
    }

    public String getDownloadUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9b30508", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.httpsUrl)) {
            return this.httpsUrl;
        }
        return this.packageUrl;
    }
}
