package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class w44 implements zdb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092840);
        t2o.a(1027604493);
    }

    @Override // tb.zdb
    public String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86036ea6", new Object[]{this, str, str2, str3});
        }
        return v2s.o().p().b(str, str2, str3);
    }
}
