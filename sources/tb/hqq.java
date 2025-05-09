package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hqq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<b> f20826a = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a extends ThreadLocal<b> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/util/StringBuilderHolder$1");
        }

        /* renamed from: a */
        public b initialValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("49c2db9a", new Object[]{this});
            }
            return new b(new StringBuilder(512));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final StringBuilder f20827a;
        public int b = 0;

        static {
            t2o.a(503317427);
        }

        public b(StringBuilder sb) {
            this.f20827a = sb;
        }

        public b a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("55c83a51", new Object[]{this, obj});
            }
            this.f20827a.append(obj);
            return this;
        }

        public b b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("604d8fa3", new Object[]{this, str});
            }
            this.f20827a.append(str);
            return this;
        }

        public int c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("451fdc60", new Object[]{this})).intValue();
            }
            return this.f20827a.length();
        }

        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b159eefc", new Object[]{this});
                return;
            }
            this.b++;
            this.f20827a.setLength(0);
        }

        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            } else {
                this.b = 0;
            }
        }

        public String f(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("667b6ee8", new Object[]{this, new Integer(i), new Integer(i2)});
            }
            String substring = this.f20827a.substring(i, i2);
            e();
            return substring;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            String sb = this.f20827a.toString();
            e();
            return sb;
        }
    }

    static {
        t2o.a(503317425);
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("4fa9700e", new Object[0]);
        }
        b bVar = f20826a.get();
        if (bVar == null || bVar.b != 0) {
            return new b(new StringBuilder());
        }
        bVar.d();
        return bVar;
    }
}
