package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.mfz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class h8z implements mfz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final h8z INSTANCE = new h8z();

    static {
        t2o.a(598737127);
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
        float c;
        float c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lfz) ipChange.ipc$dispatch("51aa9252", new Object[]{this, list});
        }
        ckf.g(list, "modifierArgs");
        if (list.size() == 2) {
            Object obj = list.get(0);
            if (obj == null) {
                c = n5z.Companion.a();
            } else {
                c = c(obj);
            }
            Object obj2 = list.get(1);
            if (obj2 == null) {
                c2 = n5z.Companion.a();
            } else {
                c2 = c(obj2);
            }
            return new foz(0.0f, c, 0.0f, c2, true, 5, null);
        }
        throw new IllegalArgumentException("HeightInCreator 参数不对");
    }
}
