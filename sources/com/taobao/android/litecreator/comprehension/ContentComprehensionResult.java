package com.taobao.android.litecreator.comprehension;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import org.json.JSONObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ContentComprehensionResult implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public JSONObject bizData;
    public long timeStamp = -1;

    static {
        t2o.a(511705183);
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.timeStamp = -1L;
        this.bizData = null;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ContentComprehensionResult{timeStamp=" + this.timeStamp + ", bizData=" + this.bizData + '}';
    }
}
