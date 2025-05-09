package tb;

import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.MsgRouter;
import com.taobao.tao.messagekit.core.model.Command;
import com.taobao.tao.messagekit.core.utils.MsgLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a34 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray<wnb> f15522a = new SparseArray<>();
    public final vxx<Command> b = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements lzx<ikl, Command> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(a34 a34Var) {
        }

        /* renamed from: a */
        public Command apply(ikl iklVar) {
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                obj = ipChange.ipc$dispatch("25f19f7c", new Object[]{this, iklVar});
            } else {
                obj = iklVar.f21366a;
            }
            return (Command) obj;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements f4y<ikl> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(a34 a34Var) {
        }

        /* renamed from: a */
        public boolean test(ikl iklVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a95860dc", new Object[]{this, iklVar})).booleanValue();
            }
            return iklVar.f21366a instanceof Command;
        }
    }

    static {
        t2o.a(628097051);
    }

    public static /* synthetic */ SparseArray a(a34 a34Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseArray) ipChange.ipc$dispatch("108b22ef", new Object[]{a34Var});
        }
        return a34Var.f15522a;
    }

    public wnb b(int i) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            obj = ipChange.ipc$dispatch("eba39ac2", new Object[]{this, new Integer(i)});
        } else {
            obj = this.f15522a.get(i);
        }
        return (wnb) obj;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7900fd98", new Object[]{this});
            return;
        }
        MsgLog.i("CommandManager", mi6.TAG);
        MsgRouter.e().c().a().f(new b(this)).e(new a(this)).g(gay.a()).b(this.b);
    }

    public void d(int i, wnb wnbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("491db24b", new Object[]{this, new Integer(i), wnbVar});
        } else {
            this.f15522a.put(i, wnbVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements vxx<Command> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        /* renamed from: a */
        public void accept(Command command) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("22b42a9", new Object[]{this, command});
                return;
            }
            wnb wnbVar = (wnb) a34.a(a34.this).get(command.header.g);
            if (wnbVar != null) {
                wnbVar.a(command);
            }
            dva dvaVar = command.header;
            MsgLog.i("CommandManager", "command:", dvaVar.f18091a, "subType:", Integer.valueOf(dvaVar.g));
        }
    }
}
