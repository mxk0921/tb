package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class b1p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b1p INSTANCE = new b1p();

    static {
        t2o.a(815792230);
    }

    public final boolean a(yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6bc042b", new Object[]{this, ykoVar})).booleanValue();
        }
        return sr3.a("XSearchDebugToast", ykoVar);
    }

    public final boolean b(yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e290c6f0", new Object[]{this, ykoVar})).booleanValue();
        }
        return sr3.a("elderHome", ykoVar);
    }

    public final boolean c(yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8412d30b", new Object[]{this, ykoVar})).booleanValue();
        }
        return sr3.a("searchGrayHair", ykoVar);
    }

    public final boolean d(yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb5323be", new Object[]{this, ykoVar})).booleanValue();
        }
        return sr3.a("shopElderEnable", ykoVar);
    }

    public final boolean e(yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef4e1b34", new Object[]{this, ykoVar})).booleanValue();
        }
        return sr3.a("srpFullTraceEnable", ykoVar);
    }
}
