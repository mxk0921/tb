package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.mfz;
import tb.y6z;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class a7z implements mfz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a7z INSTANCE = new a7z();

    static {
        t2o.a(598737123);
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
        if (list.size() != 1) {
            return y6z.Companion.b(1.0f);
        }
        y6z.a aVar = y6z.Companion;
        Object obj = list.get(0);
        ckf.d(obj);
        return aVar.a(a(obj));
    }
}
