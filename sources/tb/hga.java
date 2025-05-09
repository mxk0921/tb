package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.ItemIdentifier;
import java.util.Comparator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hga implements Comparator<x4h> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<ItemIdentifier> f20622a;

    static {
        t2o.a(295699377);
    }

    public hga(List<ItemIdentifier> list) {
        this.f20622a = list;
    }

    public static boolean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff9526bd", new Object[]{new Integer(i)})).booleanValue();
        }
        if (8 == i || 1 == i || 2 == i) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public int compare(x4h x4hVar, x4h x4hVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2977793f", new Object[]{this, x4hVar, x4hVar2})).intValue();
        }
        if (x4hVar == null && x4hVar2 == null) {
            return 0;
        }
        if (x4hVar == null || x4hVar2 == null) {
            if (x4hVar == null) {
                return -1;
            }
            return 1;
        } else if (b(x4hVar.f31139a) || b(x4hVar2.f31139a)) {
            return x4hVar2.b - x4hVar.b;
        } else {
            int n = hea.n(this.f20622a, x4hVar.b, x4hVar.e);
            int n2 = hea.n(this.f20622a, x4hVar2.b, x4hVar2.e);
            if (!wda.I() || (n >= 0 && n2 >= 0)) {
                return n - n2;
            }
            return n2 - n;
        }
    }
}
