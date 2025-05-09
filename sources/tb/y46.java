package tb;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class y46 extends mv5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public eji c = null;
    public RecyclerView d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXEvent f31841a;
        public final /* synthetic */ Object[] b;
        public final /* synthetic */ DXRuntimeContext c;

        public a(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
            this.f31841a = dXEvent;
            this.b = objArr;
            this.c = dXRuntimeContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                y46.f(y46.this, this.f31841a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXEvent f31842a;
        public final /* synthetic */ Object[] b;
        public final /* synthetic */ DXRuntimeContext c;

        public b(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
            this.f31842a = dXEvent;
            this.b = objArr;
            this.c = dXRuntimeContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                y46.g(y46.this, this.f31842a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXEvent f31843a;
        public final /* synthetic */ Object[] b;
        public final /* synthetic */ DXRuntimeContext c;

        public c(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
            this.f31843a = dXEvent;
            this.b = objArr;
            this.c = dXRuntimeContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                y46.h(y46.this, this.f31843a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXEvent f31844a;
        public final /* synthetic */ Object[] b;
        public final /* synthetic */ DXRuntimeContext c;

        public d(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
            this.f31844a = dXEvent;
            this.b = objArr;
            this.c = dXRuntimeContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            RecyclerView recyclerView = y46.this.d;
            if (recyclerView == null || recyclerView.getScrollState() == 0) {
                y46.i(y46.this, this.f31844a, this.b, this.c);
            } else {
                jb6.n(this);
            }
        }
    }

    public static /* synthetic */ void f(y46 y46Var, DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a3369da", new Object[]{y46Var, dXEvent, objArr, dXRuntimeContext});
        } else {
            super.handleEvent(dXEvent, objArr, dXRuntimeContext);
        }
    }

    public static /* synthetic */ void g(y46 y46Var, DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0912eb9", new Object[]{y46Var, dXEvent, objArr, dXRuntimeContext});
        } else {
            super.handleEvent(dXEvent, objArr, dXRuntimeContext);
        }
    }

    public static /* synthetic */ void h(y46 y46Var, DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76eef398", new Object[]{y46Var, dXEvent, objArr, dXRuntimeContext});
        } else {
            super.handleEvent(dXEvent, objArr, dXRuntimeContext);
        }
    }

    public static /* synthetic */ void i(y46 y46Var, DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd4cb877", new Object[]{y46Var, dXEvent, objArr, dXRuntimeContext});
        } else {
            super.handleEvent(dXEvent, objArr, dXRuntimeContext);
        }
    }

    public static /* synthetic */ Object ipc$super(y46 y46Var, String str, Object... objArr) {
        if (str.hashCode() == -103056537) {
            super.handleEvent((DXEvent) objArr[0], (Object[]) objArr[1], (DXRuntimeContext) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/dinamicX/event/DXMultiModeEventChainHandler");
    }

    public final long j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6eaba914", new Object[]{this, str})).longValue();
        }
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public void k(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46db97ca", new Object[]{this, recyclerView});
        } else {
            this.d = recyclerView;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
        if (r4.equals("runModeAsync") == false) goto L_0x0050;
     */
    @Override // tb.mv5, tb.ob5, tb.mvb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void handleEvent(com.taobao.android.dinamicx.expression.event.DXEvent r8, java.lang.Object[] r9, com.taobao.android.dinamicx.DXRuntimeContext r10) {
        /*
            r7 = this;
            r0 = 3
            r1 = 2
            r2 = 1
            r3 = 0
            com.android.alibaba.ip.runtime.IpChange r4 = tb.y46.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x001b
            java.lang.String r5 = "f9db7b67"
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r3] = r7
            r6[r2] = r8
            r6[r1] = r9
            r6[r0] = r10
            r4.ipc$dispatch(r5, r6)
            return
        L_0x001b:
            if (r9 == 0) goto L_0x00ce
            int r4 = r9.length
            if (r4 == 0) goto L_0x00ce
            r4 = r9[r3]
            java.lang.String r4 = r4.toString()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x002e
            goto L_0x00ce
        L_0x002e:
            int r4 = r9.length
            if (r4 == r2) goto L_0x00cb
            r4 = r9[r2]
            if (r4 != 0) goto L_0x0037
            goto L_0x00cb
        L_0x0037:
            java.lang.String r4 = r4.toString()
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L_0x0045
            super.handleEvent(r8, r9, r10)
            return
        L_0x0045:
            r4.hashCode()
            r5 = -1
            int r6 = r4.hashCode()
            switch(r6) {
                case -2017976178: goto L_0x0074;
                case 1853519950: goto L_0x006a;
                case 1855860565: goto L_0x005e;
                case 2112570534: goto L_0x0052;
                default: goto L_0x0050;
            }
        L_0x0050:
            r2 = -1
            goto L_0x007f
        L_0x0052:
            java.lang.String r2 = "runModeRvIdle"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x005c
            goto L_0x0050
        L_0x005c:
            r2 = 3
            goto L_0x007f
        L_0x005e:
            java.lang.String r2 = "runModeDelay"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x0068
            goto L_0x0050
        L_0x0068:
            r2 = 2
            goto L_0x007f
        L_0x006a:
            java.lang.String r3 = "runModeAsync"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x007f
            goto L_0x0050
        L_0x0074:
            java.lang.String r2 = "runModePost"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x007e
            goto L_0x0050
        L_0x007e:
            r2 = 0
        L_0x007f:
            switch(r2) {
                case 0: goto L_0x00c2;
                case 1: goto L_0x00aa;
                case 2: goto L_0x008f;
                case 3: goto L_0x0086;
                default: goto L_0x0082;
            }
        L_0x0082:
            super.handleEvent(r8, r9, r10)
            goto L_0x00ca
        L_0x0086:
            tb.y46$d r0 = new tb.y46$d
            r0.<init>(r8, r9, r10)
            tb.jb6.n(r0)
            goto L_0x00ca
        L_0x008f:
            int r0 = r9.length
            if (r0 <= r1) goto L_0x009f
            r0 = r9[r1]
            if (r0 == 0) goto L_0x009f
            java.lang.String r0 = r0.toString()
            long r0 = r7.j(r0)
            goto L_0x00a1
        L_0x009f:
            r0 = 0
        L_0x00a1:
            tb.y46$b r2 = new tb.y46$b
            r2.<init>(r8, r9, r10)
            tb.jb6.o(r2, r0)
            goto L_0x00ca
        L_0x00aa:
            tb.eji r1 = r7.c
            if (r1 != 0) goto L_0x00b7
            tb.eji r1 = new tb.eji
            java.lang.String r2 = "eventChainHandler"
            r1.<init>(r2, r0)
            r7.c = r1
        L_0x00b7:
            tb.eji r0 = r7.c
            tb.y46$c r1 = new tb.y46$c
            r1.<init>(r8, r9, r10)
            r0.g(r1)
            goto L_0x00ca
        L_0x00c2:
            tb.y46$a r0 = new tb.y46$a
            r0.<init>(r8, r9, r10)
            tb.jb6.n(r0)
        L_0x00ca:
            return
        L_0x00cb:
            super.handleEvent(r8, r9, r10)
        L_0x00ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.y46.handleEvent(com.taobao.android.dinamicx.expression.event.DXEvent, java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):void");
    }
}
