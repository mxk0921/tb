package com.taobao.fence.common;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ContentData {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String content;
    public int errorCode;
    public String errorMsg;
    public String extraContent;
    public boolean success;

    static {
        t2o.a(756023304);
    }

    public ContentData() {
    }

    public String getContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1ec9696", new Object[]{this});
        }
        return this.content;
    }

    public ContentData(boolean z, ResultEnums resultEnums) {
        this.success = z;
        if (resultEnums != null) {
            this.errorCode = resultEnums.code;
            this.errorMsg = resultEnums.message;
        }
    }
}
