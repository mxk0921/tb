package com.taobao.message.datasdk.facade.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ExtData implements Cloneable, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Object ext;

    static {
        t2o.a(529530917);
    }

    public ExtData(Object obj) {
        this.ext = obj;
    }

    private Object getExt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1d0aa780", new Object[]{this});
        }
        return this.ext;
    }
}
