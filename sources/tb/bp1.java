package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bp1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f16522a = null;

    static {
        t2o.a(295699644);
    }

    public static Boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("73846d04", new Object[0]);
        }
        if (f16522a == null) {
            f16522a = Boolean.valueOf(Boolean.parseBoolean(v2s.o().p().b("tblive", "enableSubscribeAsianGameMsg", "true")));
        }
        return f16522a;
    }
}
