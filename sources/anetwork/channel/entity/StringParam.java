package anetwork.channel.entity;

import anetwork.channel.Param;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class StringParam implements Param {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String key;
    private String value;

    static {
        t2o.a(607126057);
        t2o.a(607125975);
    }

    public StringParam(String str, String str2) {
        this.key = str;
        this.value = str2;
    }

    @Override // anetwork.channel.Param
    public String getKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
        }
        return this.key;
    }

    @Override // anetwork.channel.Param
    public String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        }
        return this.value;
    }
}
