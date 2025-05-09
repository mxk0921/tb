package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.mfz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class dbz implements mfz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final dbz INSTANCE = new dbz();

    static {
        t2o.a(598737130);
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

    public lfz b(List<? extends Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lfz) ipChange.ipc$dispatch("51aa9252", new Object[]{this, list});
        }
        ckf.g(list, "modifierArgs");
        if (list.size() == 2) {
            Object obj = list.get(0);
            ckf.d(obj);
            float a2 = a(obj);
            Object obj2 = list.get(1);
            if (obj2 != null) {
                return new cbz(a2, ((Boolean) obj2).booleanValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        }
        throw new IllegalStateException("LayoutWeightModifier 参数不对");
    }
}
