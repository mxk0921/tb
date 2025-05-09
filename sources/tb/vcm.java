package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vcm implements j3c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729808981);
        t2o.a(729808979);
    }

    @Override // tb.j3c
    public boolean a(ucm ucmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fb15cfb", new Object[]{this, ucmVar})).booleanValue();
        }
        if (ucmVar == null || "com.alibaba.poplayer.PopLayer.action.POP".equals(ucmVar.f29294a) || vdm.a(ucmVar.f29294a) != 1) {
            return false;
        }
        bqa.a("poplayerevent dispatch", ucmVar.toString());
        rgm.h().p(ucmVar.f29294a, ucmVar.b, ucmVar.g(), null);
        return true;
    }
}
