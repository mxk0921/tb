package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.mfz;
import tb.z2z;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class s1z implements mfz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final s1z INSTANCE = new s1z();

    static {
        t2o.a(598737001);
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
        if (list.size() == 1) {
            z2z.a aVar = z2z.Companion;
            Object obj = list.get(0);
            if (obj != null) {
                return new p1z(aVar.d(((Number) obj).floatValue()));
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Number");
        } else if (list.size() != 4) {
            return new p1z(z2z.Companion.d(0.0f));
        } else {
            z2z.a aVar2 = z2z.Companion;
            Object obj2 = list.get(0);
            if (obj2 != null) {
                float floatValue = ((Number) obj2).floatValue();
                Object obj3 = list.get(1);
                if (obj3 != null) {
                    float floatValue2 = ((Number) obj3).floatValue();
                    Object obj4 = list.get(2);
                    if (obj4 != null) {
                        float floatValue3 = ((Number) obj4).floatValue();
                        Object obj5 = list.get(3);
                        if (obj5 != null) {
                            return new p1z(aVar2.e(new y2z(floatValue, floatValue2, floatValue3, ((Number) obj5).floatValue())));
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Number");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Number");
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Number");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Number");
        }
    }
}
