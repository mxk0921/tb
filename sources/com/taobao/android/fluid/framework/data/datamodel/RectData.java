package com.taobao.android.fluid.framework.data.datamodel;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class RectData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String height;
    public String width;
    public String x;
    public String y;

    static {
        t2o.a(468714214);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RectData{x='" + this.x + "', y='" + this.y + "', width='" + this.width + "', height='" + this.height + "'}";
    }
}
