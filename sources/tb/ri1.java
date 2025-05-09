package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import tb.uhb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ri1 implements uhb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final ITMSPage f27397a;
    public final Set<iwd> b = new CopyOnWriteArraySet();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(843055140);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (iwd iwdVar : ri1.a(ri1.this)) {
                try {
                    iwdVar.destroy();
                } catch (Exception e) {
                    TMSLogger.c("AudioPageExtension", e.getMessage(), e);
                }
            }
        }
    }

    static {
        t2o.a(843055139);
        t2o.a(843055142);
    }

    public ri1(ITMSPage iTMSPage) {
        ckf.g(iTMSPage, "page");
        this.f27397a = iTMSPage;
    }

    public static final /* synthetic */ Set a(ri1 ri1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("7938cde9", new Object[]{ri1Var});
        }
        return ri1Var.b;
    }

    @Override // tb.z5d
    public void G(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea6c5d4", new Object[]{this, iTMSPage});
        } else {
            uhb.a.b(this, iTMSPage);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0052, code lost:
        if (r0.booleanValue() == false) goto L_0x0054;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
        if (tb.q9s.f1(r1) != false) goto L_0x005a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005a, code lost:
        r0 = new com.taobao.themis.open.ability.audio.MegaPlayerInstance(r5, r4.f27397a);
     */
    @Override // tb.uhb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.iwd U0(java.lang.String r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.ri1.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "1a5b60b1"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            java.lang.Object r5 = r0.ipc$dispatch(r1, r2)
            tb.iwd r5 = (tb.iwd) r5
            return r5
        L_0x0018:
            java.lang.String r0 = "id"
            tb.ckf.g(r5, r0)
            com.taobao.themis.kernel.page.ITMSPage r0 = r4.f27397a
            tb.bbs r0 = r0.getInstance()
            tb.mm4 r0 = r0.N()
            com.taobao.themis.kernel.page.ITMSPage r1 = r4.f27397a
            tb.bbs r1 = r1.getInstance()
            java.lang.String r1 = r1.L()
            java.lang.String r2 = "page.getInstance().appId"
            tb.ckf.f(r1, r2)
            boolean r2 = tb.q9s.e1()
            if (r2 == 0) goto L_0x0062
            if (r0 == 0) goto L_0x0054
            com.alibaba.fastjson.JSONObject r0 = r0.b()
            java.lang.String r2 = "enableMixPlayer"
            java.lang.Boolean r0 = r0.getBoolean(r2)
            java.lang.String r2 = "containerModel.extra.get…eMixPlayer\"\n            )"
            tb.ckf.f(r0, r2)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x005a
        L_0x0054:
            boolean r0 = tb.q9s.f1(r1)
            if (r0 == 0) goto L_0x0062
        L_0x005a:
            com.taobao.themis.open.ability.audio.MegaPlayerInstance r0 = new com.taobao.themis.open.ability.audio.MegaPlayerInstance
            com.taobao.themis.kernel.page.ITMSPage r1 = r4.f27397a
            r0.<init>(r5, r1)
            goto L_0x0069
        L_0x0062:
            tb.zbs r0 = new tb.zbs
            com.taobao.themis.kernel.page.ITMSPage r1 = r4.f27397a
            r0.<init>(r5, r1)
        L_0x0069:
            java.util.Set<tb.iwd> r5 = r4.b
            java.util.concurrent.CopyOnWriteArraySet r5 = (java.util.concurrent.CopyOnWriteArraySet) r5
            r5.add(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ri1.U0(java.lang.String):tb.iwd");
    }

    @Override // tb.z5d
    public void c() {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
            return;
        }
        uhb.a.c(this);
        IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
        if (iExecutorService != null && (executor = iExecutorService.getExecutor(ExecutorType.AUDIO)) != null) {
            executor.execute(new b());
        }
    }

    @Override // tb.z5d
    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc5065a", new Object[]{this});
        } else {
            uhb.a.a(this);
        }
    }
}
