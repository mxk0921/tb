package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.foz;
import tb.mfz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class goz implements mfz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final goz INSTANCE = new goz();

    static {
        t2o.a(598737139);
        t2o.a(598737396);
    }

    @Override // tb.mfz
    public float a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8c0b5a74", new Object[]{this, obj})).floatValue();
        }
        return mfz.a.b(this, obj);
    }

    public float c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("87287aeb", new Object[]{this, obj})).floatValue();
        }
        return mfz.a.a(this, obj);
    }

    public lfz b(List<? extends Object> list) {
        float f;
        float f2;
        float f3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lfz) ipChange.ipc$dispatch("51aa9252", new Object[]{this, list});
        }
        ckf.g(list, "modifierArgs");
        if (list.isEmpty()) {
            throw new IllegalArgumentException("SizeElement 参数不对");
        } else if (list.size() == 1) {
            foz.a aVar = foz.Companion;
            Object obj = list.get(0);
            if (obj == null) {
                f3 = n5z.g(0);
            } else {
                f3 = c(obj);
            }
            return aVar.b(f3);
        } else if (list.size() == 2) {
            foz.a aVar2 = foz.Companion;
            Object obj2 = list.get(0);
            if (obj2 == null) {
                f = n5z.g(0);
            } else {
                f = c(obj2);
            }
            Object obj3 = list.get(1);
            if (obj3 == null) {
                f2 = n5z.g(0);
            } else {
                f2 = c(obj3);
            }
            return aVar2.a(f, f2);
        } else {
            throw new IllegalArgumentException("SizeElement 参数不对");
        }
    }
}
