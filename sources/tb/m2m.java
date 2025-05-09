package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class m2m extends ux1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final a b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f23740a;
        public double b;
        public double c;
        public double d;
        public double e;
        public int f;
        public int g;

        static {
            t2o.a(912262421);
        }
    }

    static {
        t2o.a(912262420);
    }

    public m2m(String str, double d, double d2, double d3, double d4, int i, int i2) {
        a aVar = new a();
        this.b = aVar;
        aVar.f23740a = str;
        aVar.b = d;
        aVar.c = d2;
        aVar.d = d3;
        aVar.e = d4;
        aVar.f = i;
        aVar.g = i2;
    }

    public static /* synthetic */ Object ipc$super(m2m m2mVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/message/PicContainerMessage");
    }

    public a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("c42a7c59", new Object[]{this});
        }
        return this.b;
    }
}
