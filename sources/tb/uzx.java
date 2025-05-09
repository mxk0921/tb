package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class uzx<T> extends l5y<T> implements r9y<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(628097531);
        t2o.a(628097533);
    }

    public static /* synthetic */ Object ipc$super(uzx uzxVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/h/c");
    }

    public final uzx<T> M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uzx) ipChange.ipc$dispatch("7588415d", new Object[]{this});
        }
        if (this instanceof dyx) {
            return this;
        }
        return new dyx(this);
    }
}
