package com.taobao.android.change.app.icon.mtop;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ChangeAppIconMtopResponse<T> implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String actionType;
    public int code;
    public String codeGroup;
    public String message;
    public String msgCode;
    public String msgInfo;
    public T returnValue;

    static {
        t2o.a(284164118);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ChangeAppIconMtopResponse{code=" + this.code + ", message='" + this.message + "', msgCode='" + this.msgCode + "', msgInfo='" + this.msgInfo + "', codeGroup='" + this.codeGroup + "', actionType='" + this.actionType + "', returnValue=" + this.returnValue + '}';
    }
}
