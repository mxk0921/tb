package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.utils.CommonExtKt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class idx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f21268a;
    public final int b;
    public int c;

    static {
        t2o.a(838860823);
    }

    public idx(idx idxVar) {
        ckf.g(idxVar, "viewConfig");
        this.c = -1;
        this.f21268a = idxVar.f21268a;
        this.b = idxVar.b;
        this.c = idxVar.c;
    }

    public final idx a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (idx) ipChange.ipc$dispatch("ef5b71c6", new Object[]{this});
        }
        return new idx(this);
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        int i = this.f21268a;
        if (i == -1) {
            return i;
        }
        return CommonExtKt.f(this.c, i, -1);
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43d49fe", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        int i = this.b;
        if (i == -1) {
            return i;
        }
        return CommonExtKt.f(this.c, i, -1);
    }

    public final void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2768ff64", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public idx(int i, int i2) {
        this.c = -1;
        this.b = i;
        this.f21268a = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public idx(com.taobao.themis.external.embed.WidgetStartParams r5) {
        /*
            r4 = this;
            java.lang.String r0 = "startParams"
            tb.ckf.g(r5, r0)
            r4.<init>()
            r0 = -1
            r4.c = r0
            java.lang.String r1 = r5.getWidth()
            r2 = 0
            if (r1 != 0) goto L_0x0015
        L_0x0013:
            r1 = -1
            goto L_0x002b
        L_0x0015:
            java.lang.Integer r1 = tb.ssq.m(r1)
            if (r1 != 0) goto L_0x001c
            goto L_0x0013
        L_0x001c:
            int r3 = r1.intValue()
            if (r3 <= 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r1 = r2
        L_0x0024:
            if (r1 != 0) goto L_0x0027
            goto L_0x0013
        L_0x0027:
            int r1 = r1.intValue()
        L_0x002b:
            r4.b = r1
            java.lang.String r5 = r5.getHeight()
            if (r5 != 0) goto L_0x0034
            goto L_0x0049
        L_0x0034:
            java.lang.Integer r5 = tb.ssq.m(r5)
            if (r5 != 0) goto L_0x003b
            goto L_0x0049
        L_0x003b:
            int r1 = r5.intValue()
            if (r1 <= 0) goto L_0x0042
            r2 = r5
        L_0x0042:
            if (r2 != 0) goto L_0x0045
            goto L_0x0049
        L_0x0045:
            int r0 = r2.intValue()
        L_0x0049:
            r4.f21268a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.idx.<init>(com.taobao.themis.external.embed.WidgetStartParams):void");
    }
}
