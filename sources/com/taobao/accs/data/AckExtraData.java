package com.taobao.accs.data;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AckExtraData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String mErrCode;
    private String mTime = String.valueOf(System.currentTimeMillis());

    static {
        t2o.a(343933078);
    }

    public AckExtraData(String str) {
        this.mErrCode = str;
    }

    public String getErrCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49f20fbd", new Object[]{this});
        }
        return this.mErrCode;
    }

    public String getTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75382b96", new Object[]{this});
        }
        return this.mTime;
    }
}
