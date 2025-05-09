package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class gdl extends m8<tk6> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ORDERIMAGELOADCOMPLETE = "6062322397365941454";
    public final vel b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final vel f19912a;

        static {
            t2o.a(614465653);
            t2o.a(336592930);
        }

        public a(vel velVar) {
            this.f19912a = velVar;
        }

        /* renamed from: a */
        public gdl build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (gdl) ipChange.ipc$dispatch("8f55f025", new Object[]{this, obj});
            }
            return new gdl(this.f19912a);
        }
    }

    static {
        t2o.a(614465652);
    }

    public gdl(vel velVar) {
        this.b = velVar;
    }

    public static /* synthetic */ Object ipc$super(gdl gdlVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/dinamicX/ability/OrderImageLoadCompleteAbility");
    }

    /* renamed from: i */
    public c8 f(n8 n8Var, tk6 tk6Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("f0bde67e", new Object[]{this, n8Var, tk6Var, u8Var});
        }
        if (this.b == null) {
            return new f8();
        }
        if (!pav.b()) {
            hav.d(vel.TAG, "异步渲染不上报");
        }
        this.b.h();
        return new f8();
    }
}
