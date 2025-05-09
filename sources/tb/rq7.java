package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class rq7 extends m8<tk6> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY = "-5756070486399014857";
    public final sdm b = new sdm();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(713031773);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public rq7 build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rq7) ipChange.ipc$dispatch("e81991f7", new Object[]{this, obj});
            }
            return new rq7();
        }
    }

    static {
        t2o.a(713031772);
    }

    public static /* synthetic */ Object ipc$super(rq7 rq7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/dinamicX/ability/poplayer/DismissPopLayerAbility");
    }

    /* renamed from: i */
    public c8 f(n8 n8Var, tk6 tk6Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("f0bde67e", new Object[]{this, n8Var, tk6Var, u8Var});
        }
        if (tk6Var == null) {
            return new f8();
        }
        if (tk6Var.d() == null || n8Var == null) {
            return new f8();
        }
        this.b.a();
        return new f8();
    }
}
