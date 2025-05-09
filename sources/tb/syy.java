package tb;

import android.graphics.Color;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.mfz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class syy implements mfz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final syy INSTANCE = new syy();

    static {
        t2o.a(598737113);
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
            Object obj = list.get(0);
            if (obj != null) {
                return new tyy(Color.parseColor((String) obj));
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        throw new IllegalStateException("BackgroundModifierCreator 参数不对");
    }
}
