package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.foundation.layout.RowColumn.LayoutDirection;
import tb.ozy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface can {
    public static final a Companion = a.$$INSTANCE;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final /* synthetic */ a $$INSTANCE = new a();

        /* renamed from: a  reason: collision with root package name */
        public static final can f16942a = new ozy(-1.0f, -1.0f);
        public static final can b = new ozy(0.0f, 0.0f);
        public static final c c = new ozy.b(-1.0f);
        public static final c d = new ozy.b(0.0f);
        public static final c e = new ozy.b(1.0f);
        public static final b f = new ozy.a(-1.0f);
        public static final b g = new ozy.a(0.0f);
        public static final b h = new ozy.a(1.0f);

        static {
            t2o.a(598737036);
        }

        public final c a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("927084d6", new Object[]{this});
            }
            return e;
        }

        public final can b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (can) ipChange.ipc$dispatch("6456fc9c", new Object[]{this});
            }
            return b;
        }

        public final b c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("5d8f90a3", new Object[]{this});
            }
            return g;
        }

        public final c d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("f224afa3", new Object[]{this});
            }
            return d;
        }

        public final b e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("56e7d82c", new Object[]{this});
            }
            return h;
        }

        public final b f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("4ef487b3", new Object[]{this});
            }
            return f;
        }

        public final c g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("c914654", new Object[]{this});
            }
            return c;
        }

        public final can h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (can) ipChange.ipc$dispatch("3164d64", new Object[]{this});
            }
            return f16942a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
        int a(int i, int i2, LayoutDirection layoutDirection);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface c {
        int a(int i, int i2);
    }

    long a(long j, long j2, LayoutDirection layoutDirection);
}
