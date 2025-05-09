package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class s8v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(614465635);
    }

    public static w55 a(Context context, u3o u3oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w55) ipChange.ipc$dispatch("cfd512bc", new Object[]{context, u3oVar});
        }
        if (u3oVar == null || context == null) {
            return null;
        }
        return new w55(context).b(u3oVar.c()).z0(u3oVar.n()).p0(u3oVar.j()).r0(u3oVar.i()).q0(u3oVar.t()).d(u3oVar.f()).v0(u3oVar.m()).o(u3oVar.h()).x0(u3oVar.u()).j0(u3oVar.r()).r(u3oVar.p()).l0(u3oVar.z()).s0(u3oVar.o()).u0(u3oVar.k()).k0(u3oVar.s()).c(u3oVar.e()).e(u3oVar.g());
    }
}
