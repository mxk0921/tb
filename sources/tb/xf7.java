package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xf7 extends boj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(578813980);
    }

    public xf7(xnj xnjVar) {
        super(xnjVar);
        addUriFilterItem(new yf7());
        addUriFilterItem(new zf7());
        addUriFilterItem(new ag7());
        addUriFilterItem(new bg7());
        addUriFilterItem(new cg7());
        addUriFilterItem(new dg7());
    }

    public static /* synthetic */ Object ipc$super(xf7 xf7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/wrapper/nav/DetailNavProcessorNode");
    }

    @Override // tb.boj
    public boolean addSchemaWhenDeficiency() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd2dd70", new Object[]{this})).booleanValue();
        }
        return true;
    }
}
