package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.mfz;
import tb.xzy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class wzy implements mfz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final wzy INSTANCE = new wzy();

    static {
        t2o.a(598736993);
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
        float c3;
        float c4;
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lfz) ipChange.ipc$dispatch("51aa9252", new Object[]{this, list});
        }
        ckf.g(list, "modifierArgs");
        if (list.size() == 2) {
            xzy.a aVar = xzy.Companion;
            Object obj = list.get(0);
            if (obj == null) {
                f = n5z.g(0);
            } else {
                f = c(obj);
            }
            Object obj2 = list.get(1);
            if (obj2 != null) {
                return aVar.a(f, (String) obj2);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } else if (list.size() == 5) {
            xzy.a aVar2 = xzy.Companion;
            Object obj3 = list.get(0);
            if (obj3 == null) {
                c = n5z.g(0);
            } else {
                c = c(obj3);
            }
            Object obj4 = list.get(1);
            if (obj4 == null) {
                c2 = n5z.g(0);
            } else {
                c2 = c(obj4);
            }
            Object obj5 = list.get(2);
            if (obj5 == null) {
                c3 = n5z.g(0);
            } else {
                c3 = c(obj5);
            }
            Object obj6 = list.get(3);
            if (obj6 == null) {
                c4 = n5z.g(0);
            } else {
                c4 = c(obj6);
            }
            Object obj7 = list.get(4);
            if (obj7 != null) {
                return aVar2.b(c, c2, c3, c4, (String) obj7);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } else {
            throw new IllegalArgumentException("BorderCreator 参数不对");
        }
    }
}
