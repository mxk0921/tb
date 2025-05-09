package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.mfz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class mtz implements mfz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final mtz INSTANCE = new mtz();

    static {
        t2o.a(598737143);
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
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lfz) ipChange.ipc$dispatch("51aa9252", new Object[]{this, list});
        }
        ckf.g(list, "modifierArgs");
        if (list.size() != 1 || (obj = list.get(0)) == null) {
            f = n5z.g(0);
        } else {
            f = c(obj);
        }
        return new foz(f, 0.0f, f, 0.0f, true, 10, null);
    }
}
