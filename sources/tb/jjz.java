package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.ijz;
import tb.mfz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class jjz implements mfz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final jjz INSTANCE = new jjz();

    static {
        t2o.a(598737134);
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
        float f4;
        float f5;
        float f6;
        float f7;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lfz) ipChange.ipc$dispatch("51aa9252", new Object[]{this, list});
        }
        ckf.g(list, "modifierArgs");
        if (list.isEmpty()) {
            throw new IllegalArgumentException("ModifierElement 参数不对");
        } else if (list.size() == 1) {
            ijz.a aVar = ijz.Companion;
            Object obj = list.get(0);
            if (obj == null) {
                f7 = n5z.g(0);
            } else {
                f7 = c(obj);
            }
            return aVar.b(f7);
        } else if (list.size() == 2) {
            ijz.a aVar2 = ijz.Companion;
            Object obj2 = list.get(0);
            if (obj2 == null) {
                f5 = n5z.g(0);
            } else {
                f5 = c(obj2);
            }
            Object obj3 = list.get(1);
            if (obj3 == null) {
                f6 = n5z.g(0);
            } else {
                f6 = c(obj3);
            }
            return aVar2.a(f5, f6);
        } else if (list.size() == 4) {
            ijz.a aVar3 = ijz.Companion;
            Object obj4 = list.get(0);
            if (obj4 == null) {
                f = n5z.g(0);
            } else {
                f = c(obj4);
            }
            Object obj5 = list.get(1);
            if (obj5 == null) {
                f2 = n5z.g(0);
            } else {
                f2 = c(obj5);
            }
            Object obj6 = list.get(2);
            if (obj6 == null) {
                f3 = n5z.g(0);
            } else {
                f3 = c(obj6);
            }
            Object obj7 = list.get(3);
            if (obj7 == null) {
                f4 = n5z.g(0);
            } else {
                f4 = c(obj7);
            }
            return aVar3.c(f, f2, f3, f4);
        } else {
            throw new IllegalArgumentException("SizeElement 参数不对");
        }
    }
}
