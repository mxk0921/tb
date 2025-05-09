package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class toy extends o2g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final toy b = new toy("OpenArch");
    public static final toy c = new toy("LifeCycle");
    public static final toy d = new toy("DataService");
    public static final toy e = new toy("PowerMsgService");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1004535846);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final toy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (toy) ipChange.ipc$dispatch("cfd72d17", new Object[]{this});
            }
            return toy.b();
        }

        public final toy b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (toy) ipChange.ipc$dispatch("5ec6ec36", new Object[]{this});
            }
            return toy.c();
        }

        public final toy c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (toy) ipChange.ipc$dispatch("e56d24d8", new Object[]{this});
            }
            return toy.d();
        }

        public final toy d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (toy) ipChange.ipc$dispatch("69ef545", new Object[]{this});
            }
            return toy.e();
        }

        public a() {
        }
    }

    static {
        t2o.a(1004535845);
        new toy("MessageService");
        new toy("PlayControlService");
        new toy("Interactive");
        new toy("Domain");
        new toy("Filed");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public toy(String str) {
        super(str);
        ckf.g(str, "code");
    }

    public static final /* synthetic */ toy b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (toy) ipChange.ipc$dispatch("b9dced5e", new Object[0]);
        }
        return d;
    }

    public static final /* synthetic */ toy c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (toy) ipChange.ipc$dispatch("562415df", new Object[0]);
        }
        return c;
    }

    public static final /* synthetic */ toy d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (toy) ipChange.ipc$dispatch("65eba87d", new Object[0]);
        }
        return b;
    }

    public static final /* synthetic */ toy e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (toy) ipChange.ipc$dispatch("4deeae70", new Object[0]);
        }
        return e;
    }

    public static /* synthetic */ Object ipc$super(toy toyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/definition/OpenArchEventCategory");
    }
}
