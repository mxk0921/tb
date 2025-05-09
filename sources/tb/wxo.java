package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class wxo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final wxo b = new wxo();

    /* renamed from: a  reason: collision with root package name */
    public int f31002a;

    static {
        t2o.a(993001810);
    }

    public static wxo a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wxo) ipChange.ipc$dispatch("b6ef0f3b", new Object[]{new Integer(i)});
        }
        wxo wxoVar = b;
        wxoVar.f31002a = i;
        return wxoVar;
    }
}
