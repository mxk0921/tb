package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class gar implements mnb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final gar INSTANCE = new gar();

    @Override // tb.mnb
    public Class<?> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("5525a132", new Object[]{this, str});
        }
        ckf.g(str, "className");
        try {
            Class<?> cls = Class.forName(str);
            iih.INSTANCE.b("TBClassFinderImpl", "当前 ClassLoader 找到: ".concat(str));
            return cls;
        } catch (ClassNotFoundException unused) {
            iih iihVar = iih.INSTANCE;
            iihVar.a("TBClassFinderImpl", "当前 ClassLoader 未找到: " + str + "，尝试调用触发远程化加载逻辑");
            zk9.b(str, null);
            return null;
        }
    }
}
