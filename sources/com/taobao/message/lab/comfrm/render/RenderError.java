package com.taobao.message.lab.comfrm.render;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class RenderError {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String detail;
    private String errorCode;
    private String errorMsg;

    static {
        t2o.a(537919752);
    }

    public RenderError(String str, String str2, String str3) {
        this.errorCode = str;
        this.errorMsg = str2;
        this.detail = str3;
    }

    public String getDetail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ed839612", new Object[]{this});
        }
        return this.detail;
    }

    public String getErrorCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f72feefa", new Object[]{this});
        }
        return this.errorCode;
    }

    public String getErrorMsg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this});
        }
        return this.errorMsg;
    }
}
