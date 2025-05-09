package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.mfz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class l1z implements mfz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final l1z INSTANCE = new l1z();

    static {
        t2o.a(598737149);
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
        if (list.size() == 4) {
            Object obj = list.get(0);
            if (obj != null) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Object obj2 = list.get(3);
                if (obj2 != null) {
                    return new k1z(booleanValue, ((Integer) obj2).intValue());
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int{ com.taobao.android.nanocompose.foundation.util.TypealiasKt.ExpressionIndex }");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        }
        throw new IllegalArgumentException("ModifierElement 参数不对");
    }
}
