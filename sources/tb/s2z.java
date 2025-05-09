package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.iiz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class s2z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(598737431);
        t2o.a(598737449);
    }

    public onz<t2z, String> a(byte[] bArr, int i, int i2) {
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (onz) ipChange.ipc$dispatch("6a0e389e", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
        }
        ckf.g(bArr, "data");
        d0z d0zVar = new d0z(bArr, i, i2 + i);
        int x = d0zVar.x();
        ArrayList arrayList = new ArrayList();
        if (x > 0) {
            while (true) {
                int i4 = i3 + 1;
                String v = d0zVar.v();
                arrayList.add(v);
                if (ciz.Companion.c()) {
                    iiz.a aVar = iiz.Companion;
                    aVar.p("index:" + i3 + ", str:" + v + ",offset:" + d0zVar.A());
                }
                if (i4 >= x) {
                    break;
                }
                i3 = i4;
            }
        }
        onz<t2z, String> onzVar = new onz<>(1, new t2z(arrayList), null, 4, null);
        if (ciz.Companion.c()) {
            iiz.Companion.p(ckf.p("CONST_SECTION", JSON.toJSONString(onzVar)));
        }
        return onzVar;
    }
}
