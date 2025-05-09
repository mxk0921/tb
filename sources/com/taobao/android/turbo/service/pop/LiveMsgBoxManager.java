package com.taobao.android.turbo.service.pop;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.a07;
import tb.bwc;
import tb.ckf;
import tb.j5o;
import tb.m7e;
import tb.qpu;
import tb.qu6;
import tb.rlc;
import tb.t2o;
import tb.tpu;
import tb.ud0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class LiveMsgBoxManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String KEY_LIVE_MSG_BOX = "gg.liveMsgBoxCount";
    public static final String TAG = "LiveMsgBoxManager";

    /* renamed from: a  reason: collision with root package name */
    public int f9765a;
    public int b;
    public boolean e;
    public final qpu g;
    public final rlc h;
    public int c = 100000;
    public int d = 100000;
    public final Handler f = new b(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455587);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/pop/LiveMsgBoxManager$handler$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            ckf.g(message, "msg");
            if (message.what == 1) {
                LiveMsgBoxManager.d(LiveMsgBoxManager.this);
            }
        }
    }

    static {
        t2o.a(916455586);
    }

    public LiveMsgBoxManager(qpu qpuVar, rlc rlcVar) {
        ckf.g(qpuVar, "engineContext");
        ckf.g(rlcVar, "callback");
        this.g = qpuVar;
        this.h = rlcVar;
        i();
    }

    public static final /* synthetic */ rlc a(LiveMsgBoxManager liveMsgBoxManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rlc) ipChange.ipc$dispatch("76320cdb", new Object[]{liveMsgBoxManager});
        }
        return liveMsgBoxManager.h;
    }

    public static final /* synthetic */ int b(LiveMsgBoxManager liveMsgBoxManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("beb5e31", new Object[]{liveMsgBoxManager})).intValue();
        }
        return liveMsgBoxManager.b;
    }

    public static final /* synthetic */ boolean c(LiveMsgBoxManager liveMsgBoxManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b2ada36", new Object[]{liveMsgBoxManager})).booleanValue();
        }
        return liveMsgBoxManager.j();
    }

    public static final /* synthetic */ void d(LiveMsgBoxManager liveMsgBoxManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12fef500", new Object[]{liveMsgBoxManager});
        } else {
            liveMsgBoxManager.l();
        }
    }

    public static final /* synthetic */ void e(LiveMsgBoxManager liveMsgBoxManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5c7ce8c", new Object[]{liveMsgBoxManager, new Integer(i)});
        } else {
            liveMsgBoxManager.c = i;
        }
    }

    public static final /* synthetic */ void f(LiveMsgBoxManager liveMsgBoxManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bf2854d", new Object[]{liveMsgBoxManager, new Integer(i)});
        } else {
            liveMsgBoxManager.d = i;
        }
    }

    public static final /* synthetic */ void g(LiveMsgBoxManager liveMsgBoxManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c76b7791", new Object[]{liveMsgBoxManager, new Integer(i)});
        } else {
            liveMsgBoxManager.b = i;
        }
    }

    public static final /* synthetic */ void h(LiveMsgBoxManager liveMsgBoxManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e9d699e", new Object[]{liveMsgBoxManager});
        } else {
            liveMsgBoxManager.p();
        }
    }

    public static /* synthetic */ void n(LiveMsgBoxManager liveMsgBoxManager, long j, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bb96dea", new Object[]{liveMsgBoxManager, new Long(j), new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            j = 30000;
        }
        liveMsgBoxManager.m(j);
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea4a7883", new Object[]{this});
        } else if (!this.e) {
            this.e = true;
            ud0.Companion.f().c(KEY_LIVE_MSG_BOX, new LiveMsgBoxManager$initShowCnt$1(this, qu6.Companion.a("MM_dd")));
        }
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5111827d", new Object[]{this})).booleanValue();
        }
        if (this.b >= this.d || this.f9765a >= this.c) {
            return true;
        }
        return false;
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f065c08c", new Object[]{this});
        } else if (j()) {
            bwc e = ud0.Companion.e();
            HashMap hashMap = new HashMap();
            j5o.a aVar = new j5o.a("mtop.guge.guangguang.livecapsule");
            aVar.b(hashMap);
            e.a(aVar.a(), new LiveMsgBoxManager$requestLiveMsgBox$1(this), new LiveMsgBoxManager$requestLiveMsgBox$2(this));
        }
    }

    public final void m(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44f2a8c6", new Object[]{this, new Long(j)});
            return;
        }
        tpu.a.b(tpu.Companion, TAG, "startRequestMsgBox", null, 4, null);
        if (j()) {
            this.f.removeMessages(1);
            if (((m7e) this.g.getService(m7e.class)).isLogin()) {
                this.f.sendEmptyMessageDelayed(1, j);
            }
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1eef61e", new Object[]{this});
            return;
        }
        tpu.a.b(tpu.Companion, TAG, "stopRequestMsgBox", null, 4, null);
        this.f.removeMessages(1);
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6a472a", new Object[]{this});
            return;
        }
        this.f9765a++;
        this.b++;
        String a2 = qu6.Companion.a("MM_dd");
        ud0.Companion.f().b(KEY_LIVE_MSG_BOX, a2 + "=" + this.b);
        tpu.a.b(tpu.Companion, TAG, "updateShowCnt, today: " + a2 + ", perDayShowCnt: " + this.b, null, 4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
        if (tb.ckf.b(r2, "video") != false) goto L_0x0065;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j() {
        /*
            r10 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.turbo.service.pop.LiveMsgBoxManager.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "56f023c2"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r10
            java.lang.Object r0 = r2.ipc$dispatch(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0019:
            tb.qpu r2 = r10.g
            java.lang.Class<tb.c1c> r3 = tb.c1c.class
            tb.sod r2 = r2.getService(r3)
            tb.c1c r2 = (tb.c1c) r2
            boolean r2 = r2.n1()
            tb.qpu r3 = r10.g
            java.lang.Class<tb.xwc> r4 = tb.xwc.class
            tb.sod r3 = r3.getService(r4)
            tb.xwc r3 = (tb.xwc) r3
            int r4 = r3.getCurrentIndex()
            com.taobao.android.turbo.model.TabModel r4 = r3.d0(r4)
            java.lang.String r5 = "innerLive"
            int r3 = r3.E1(r5)
            r5 = -1
            if (r3 == r5) goto L_0x0067
            if (r2 != 0) goto L_0x0067
            r2 = 0
            if (r4 == 0) goto L_0x004d
            java.lang.String r3 = r4.getId()
            goto L_0x004e
        L_0x004d:
            r3 = r2
        L_0x004e:
            java.lang.String r5 = "home"
            boolean r3 = tb.ckf.b(r3, r5)
            if (r3 != 0) goto L_0x0065
            if (r4 == 0) goto L_0x005c
            java.lang.String r2 = r4.getId()
        L_0x005c:
            java.lang.String r3 = "video"
            boolean r2 = tb.ckf.b(r2, r3)
            if (r2 == 0) goto L_0x0067
        L_0x0065:
            r2 = 1
            goto L_0x0068
        L_0x0067:
            r2 = 0
        L_0x0068:
            boolean r3 = r10.k()
            tb.tpu$a r4 = tb.tpu.Companion
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "valid Tab: "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r6 = ", isTired: "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r6 = r5.toString()
            java.lang.String r5 = "LiveMsgBoxManager"
            r7 = 0
            r8 = 4
            r9 = 0
            tb.tpu.a.b(r4, r5, r6, r7, r8, r9)
            if (r2 == 0) goto L_0x0092
            if (r3 != 0) goto L_0x0092
            r0 = 1
        L_0x0092:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.turbo.service.pop.LiveMsgBoxManager.j():boolean");
    }
}
