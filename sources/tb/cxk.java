package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class cxk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public o02 f17414a;

    static {
        t2o.a(815793720);
    }

    public static cxk a(o02 o02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxk) ipChange.ipc$dispatch("8e6040e5", new Object[]{o02Var});
        }
        cxk cxkVar = new cxk();
        cxkVar.f17414a = o02Var;
        return cxkVar;
    }
}
