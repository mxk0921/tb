package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.updown.TaoLiveKtUpDownActionType;
import com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel;
import com.taobao.live.timemove.base.data.RecModel;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class pxs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int b;
    public int c;
    public int d;

    /* renamed from: a  reason: collision with root package name */
    public final List<TaoLiveKtSwitchModel> f26390a = new ArrayList();
    public final Set<String> e = new LinkedHashSet();
    public final boolean f = c5t.INSTANCE.D();

    static {
        t2o.a(1010827399);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [T, com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean k(tb.pxs r4, kotlin.jvm.internal.Ref$BooleanRef r5, kotlin.jvm.internal.Ref$ObjectRef<com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel> r6, boolean r7, java.lang.String r8, kotlin.jvm.internal.Ref$IntRef r9, int r10, int r11, int r12) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.pxs.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0047
            java.lang.Boolean r3 = new java.lang.Boolean
            r3.<init>(r7)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r10)
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r11)
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r12)
            r12 = 9
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r12[r1] = r4
            r12[r0] = r5
            r4 = 2
            r12[r4] = r6
            r4 = 3
            r12[r4] = r3
            r4 = 4
            r12[r4] = r8
            r4 = 5
            r12[r4] = r9
            r4 = 6
            r12[r4] = r7
            r4 = 7
            r12[r4] = r10
            r4 = 8
            r12[r4] = r11
            java.lang.String r4 = "f456b720"
            java.lang.Object r4 = r2.ipc$dispatch(r4, r12)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L_0x0047:
            tb.aef r10 = tb.hfn.n(r10, r11)
            tb.ydf r10 = tb.hfn.m(r10, r12)
            int r11 = r10.c()
            int r12 = r10.d()
            int r10 = r10.e()
            if (r10 <= 0) goto L_0x005f
            if (r11 <= r12) goto L_0x0063
        L_0x005f:
            if (r10 >= 0) goto L_0x0094
            if (r12 > r11) goto L_0x0094
        L_0x0063:
            java.util.List<com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel> r2 = r4.f26390a
            java.lang.Object r2 = tb.i04.d0(r2, r11)
            com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel r2 = (com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel) r2
            if (r2 != 0) goto L_0x006e
            goto L_0x0090
        L_0x006e:
            boolean r3 = r5.element
            if (r3 == 0) goto L_0x007b
            boolean r3 = r2.getShouldIgnoredFlag()
            if (r3 != 0) goto L_0x007b
            r6.element = r2
            return r0
        L_0x007b:
            if (r7 == 0) goto L_0x0082
            java.lang.String r2 = r2.getKeyPointId()
            goto L_0x0086
        L_0x0082:
            java.lang.String r2 = r2.getLiveId()
        L_0x0086:
            boolean r2 = tb.ckf.b(r2, r8)
            if (r2 == 0) goto L_0x0090
            r9.element = r11
            r5.element = r0
        L_0x0090:
            if (r11 == r12) goto L_0x0094
            int r11 = r11 + r10
            goto L_0x0063
        L_0x0094:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.pxs.k(tb.pxs, kotlin.jvm.internal.Ref$BooleanRef, kotlin.jvm.internal.Ref$ObjectRef, boolean, java.lang.String, kotlin.jvm.internal.Ref$IntRef, int, int, int):boolean");
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [T, com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean l(tb.pxs r4, kotlin.jvm.internal.Ref$BooleanRef r5, kotlin.jvm.internal.Ref$ObjectRef<com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel> r6, boolean r7, java.lang.String r8, kotlin.jvm.internal.Ref$IntRef r9, int r10, int r11, int r12) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.pxs.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0047
            java.lang.Boolean r3 = new java.lang.Boolean
            r3.<init>(r7)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r10)
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r11)
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r12)
            r12 = 9
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r12[r1] = r4
            r12[r0] = r5
            r4 = 2
            r12[r4] = r6
            r4 = 3
            r12[r4] = r3
            r4 = 4
            r12[r4] = r8
            r4 = 5
            r12[r4] = r9
            r4 = 6
            r12[r4] = r7
            r4 = 7
            r12[r4] = r10
            r4 = 8
            r12[r4] = r11
            java.lang.String r4 = "f816e13d"
            java.lang.Object r4 = r2.ipc$dispatch(r4, r12)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L_0x0047:
            if (r12 <= 0) goto L_0x0082
            int r12 = -r12
            int r11 = tb.o0n.c(r10, r11, r12)
            if (r11 > r10) goto L_0x0081
        L_0x0050:
            java.util.List<com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel> r2 = r4.f26390a
            java.lang.Object r2 = tb.i04.d0(r2, r10)
            com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel r2 = (com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel) r2
            if (r2 != 0) goto L_0x005b
            goto L_0x007d
        L_0x005b:
            boolean r3 = r5.element
            if (r3 == 0) goto L_0x0068
            boolean r3 = r2.getShouldIgnoredFlag()
            if (r3 != 0) goto L_0x0068
            r6.element = r2
            return r0
        L_0x0068:
            if (r7 == 0) goto L_0x006f
            java.lang.String r2 = r2.getKeyPointId()
            goto L_0x0073
        L_0x006f:
            java.lang.String r2 = r2.getLiveId()
        L_0x0073:
            boolean r2 = tb.ckf.b(r2, r8)
            if (r2 == 0) goto L_0x007d
            r9.element = r10
            r5.element = r0
        L_0x007d:
            if (r10 == r11) goto L_0x0081
            int r10 = r10 + r12
            goto L_0x0050
        L_0x0081:
            return r1
        L_0x0082:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Step must be positive, was: "
            r5.<init>(r6)
            r5.append(r12)
            r6 = 46
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.pxs.l(tb.pxs, kotlin.jvm.internal.Ref$BooleanRef, kotlin.jvm.internal.Ref$ObjectRef, boolean, java.lang.String, kotlin.jvm.internal.Ref$IntRef, int, int, int):boolean");
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [T, com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean m(tb.pxs r4, kotlin.jvm.internal.Ref$ObjectRef<com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel> r5, int r6, int r7, int r8) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.pxs.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0034
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r6)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r7)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r8)
            r8 = 5
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r1] = r4
            r8[r0] = r5
            r4 = 2
            r8[r4] = r3
            r4 = 3
            r8[r4] = r6
            r4 = 4
            r8[r4] = r7
            java.lang.String r4 = "94990cb5"
            java.lang.Object r4 = r2.ipc$dispatch(r4, r8)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L_0x0034:
            tb.aef r6 = tb.hfn.n(r6, r7)
            tb.ydf r6 = tb.hfn.m(r6, r8)
            int r7 = r6.c()
            int r8 = r6.d()
            int r6 = r6.e()
            if (r6 <= 0) goto L_0x004c
            if (r7 <= r8) goto L_0x0050
        L_0x004c:
            if (r6 >= 0) goto L_0x0068
            if (r8 > r7) goto L_0x0068
        L_0x0050:
            java.util.List<com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel> r2 = r4.f26390a
            java.lang.Object r2 = tb.i04.d0(r2, r7)
            com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel r2 = (com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel) r2
            if (r2 != 0) goto L_0x005b
            goto L_0x0064
        L_0x005b:
            boolean r3 = r2.getShouldIgnoredFlag()
            if (r3 != 0) goto L_0x0064
            r5.element = r2
            return r0
        L_0x0064:
            if (r7 == r8) goto L_0x0068
            int r7 = r7 + r6
            goto L_0x0050
        L_0x0068:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.pxs.m(tb.pxs, kotlin.jvm.internal.Ref$ObjectRef, int, int, int):boolean");
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [T, com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean n(tb.pxs r4, kotlin.jvm.internal.Ref$ObjectRef<com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel> r5, int r6, int r7, int r8) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.pxs.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0034
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r6)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r7)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r8)
            r8 = 5
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r1] = r4
            r8[r0] = r5
            r4 = 2
            r8[r4] = r3
            r4 = 3
            r8[r4] = r6
            r4 = 4
            r8[r4] = r7
            java.lang.String r4 = "8c4c2a6c"
            java.lang.Object r4 = r2.ipc$dispatch(r4, r8)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L_0x0034:
            if (r8 <= 0) goto L_0x0056
            int r8 = -r8
            int r7 = tb.o0n.c(r6, r7, r8)
            if (r7 > r6) goto L_0x0055
        L_0x003d:
            java.util.List<com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel> r2 = r4.f26390a
            java.lang.Object r2 = tb.i04.d0(r2, r6)
            com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel r2 = (com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel) r2
            if (r2 != 0) goto L_0x0048
            goto L_0x0051
        L_0x0048:
            boolean r3 = r2.getShouldIgnoredFlag()
            if (r3 != 0) goto L_0x0051
            r5.element = r2
            return r0
        L_0x0051:
            if (r6 == r7) goto L_0x0055
            int r6 = r6 + r8
            goto L_0x003d
        L_0x0055:
            return r1
        L_0x0056:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Step must be positive, was: "
            r5.<init>(r6)
            r5.append(r8)
            r6 = 46
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.pxs.n(tb.pxs, kotlin.jvm.internal.Ref$ObjectRef, int, int, int):boolean");
    }

    public final void A(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff6ebae8", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public final void B(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9878e6e", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public final void C(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("653eea5a", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public final int D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6d9098e", new Object[]{this})).intValue();
        }
        return ((ArrayList) this.f26390a).size();
    }

    public final z3t a(int i, List<TaoLiveKtSwitchModel> list, TaoLiveKtUpDownActionType taoLiveKtUpDownActionType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z3t) ipChange.ipc$dispatch("ebb7f586", new Object[]{this, new Integer(i), list, taoLiveKtUpDownActionType});
        }
        z3t z3tVar = new z3t();
        z3tVar.e(i);
        z3tVar.f(list);
        z3tVar.d(taoLiveKtUpDownActionType);
        return z3tVar;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5dd53bc", new Object[]{this})).intValue();
        }
        List B0 = i04.B0(this.f26390a);
        ydf m = hfn.m(hfn.n(this.b + 1, B0.size()), 1);
        int c = m.c();
        int d = m.d();
        int e = m.e();
        if ((e > 0 && c <= d) || (e < 0 && d <= c)) {
            while (!tvr.a(((TaoLiveKtSwitchModel) B0.get(c)).getAlimama())) {
                if (c != d) {
                    c += e;
                }
            }
            return c;
        }
        return -1;
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("771dac62", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final TaoLiveKtSwitchModel d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtSwitchModel) ipChange.ipc$dispatch("d919180b", new Object[]{this});
        }
        return h(this.b);
    }

    public final TaoLiveKtSwitchModel e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtSwitchModel) ipChange.ipc$dispatch("414084c", new Object[]{this, new Integer(i)});
        }
        return (TaoLiveKtSwitchModel) i04.d0(this.f26390a, i);
    }

    public final int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("785cd7b4", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public final int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbe8d1be", new Object[]{this})).intValue();
        }
        int i = this.b;
        int i2 = this.c;
        if (i > i2) {
            return i;
        }
        return i2;
    }

    public final TaoLiveKtSwitchModel h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtSwitchModel) ipChange.ipc$dispatch("4ecc3140", new Object[]{this, new Integer(i)});
        }
        return (TaoLiveKtSwitchModel) i04.d0(this.f26390a, i);
    }

    public final List<TaoLiveKtSwitchModel> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6838055a", new Object[]{this});
        }
        return this.f26390a;
    }

    public final TaoLiveKtSwitchModel o(TaoLiveKtSwitchModel taoLiveKtSwitchModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtSwitchModel) ipChange.ipc$dispatch("965a7fe3", new Object[]{this, taoLiveKtSwitchModel});
        }
        return j(taoLiveKtSwitchModel, false);
    }

    public final TaoLiveKtSwitchModel p(TaoLiveKtSwitchModel taoLiveKtSwitchModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtSwitchModel) ipChange.ipc$dispatch("382fe0e7", new Object[]{this, taoLiveKtSwitchModel});
        }
        return j(taoLiveKtSwitchModel, true);
    }

    public final TaoLiveKtSwitchModel r(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtSwitchModel) ipChange.ipc$dispatch("71bf492c", new Object[]{this, str, str2, str3});
        }
        TaoLiveKtSwitchModel taoLiveKtSwitchModel = (TaoLiveKtSwitchModel) i04.a0(this.f26390a);
        taoLiveKtSwitchModel.setLiveId(str);
        taoLiveKtSwitchModel.setAccountId(str2);
        taoLiveKtSwitchModel.setRecommendBindId(str3);
        return taoLiveKtSwitchModel;
    }

    public final void t(int i, TaoLiveKtSwitchModel taoLiveKtSwitchModel, g1a<? super List<z3t>, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c962d5b", new Object[]{this, new Integer(i), taoLiveKtSwitchModel, g1aVar});
            return;
        }
        ckf.g(g1aVar, "completionCallBack");
        if (taoLiveKtSwitchModel != null) {
            ArrayList arrayList = new ArrayList();
            if (((ArrayList) this.f26390a).isEmpty()) {
                ((ArrayList) this.f26390a).add(taoLiveKtSwitchModel);
                arrayList.add(a(0, xz3.e(taoLiveKtSwitchModel), TaoLiveKtUpDownActionType.InsertAction));
            } else {
                int q = q(taoLiveKtSwitchModel);
                if (q >= 0) {
                    u5t.INSTANCE.b(taoLiveKtSwitchModel.getLiveId(), Integer.valueOf(q), Integer.valueOf(this.b), ((ArrayList) this.f26390a).size());
                    if (q > i) {
                        ((ArrayList) this.f26390a).remove(q);
                        int i2 = i + 1;
                        ((ArrayList) this.f26390a).add(i2, taoLiveKtSwitchModel);
                        z3t a2 = a(q, null, TaoLiveKtUpDownActionType.RemoveAction);
                        z3t a3 = a(i2, xz3.e(taoLiveKtSwitchModel), TaoLiveKtUpDownActionType.InsertAction);
                        arrayList.add(a2);
                        arrayList.add(a3);
                    } else {
                        return;
                    }
                } else if (i < ((ArrayList) this.f26390a).size() - 1) {
                    int i3 = i + 1;
                    ((ArrayList) this.f26390a).add(i3, taoLiveKtSwitchModel);
                    arrayList.add(a(i3, xz3.e(taoLiveKtSwitchModel), TaoLiveKtUpDownActionType.InsertAction));
                } else {
                    int size = ((ArrayList) this.f26390a).size() - 1;
                    if (c5t.INSTANCE.G()) {
                        size = ((ArrayList) this.f26390a).size();
                    }
                    ((ArrayList) this.f26390a).add(taoLiveKtSwitchModel);
                    arrayList.add(a(size, xz3.e(taoLiveKtSwitchModel), TaoLiveKtUpDownActionType.InsertAction));
                }
            }
            g1aVar.invoke(arrayList);
        }
    }

    public final void u(List<TaoLiveKtSwitchModel> list, g1a<? super List<z3t>, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b9861e0", new Object[]{this, list, g1aVar});
            return;
        }
        ckf.g(g1aVar, "completionCallBack");
        List<TaoLiveKtSwitchModel> x = x(list);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (TaoLiveKtSwitchModel taoLiveKtSwitchModel : x) {
            int q = q(taoLiveKtSwitchModel);
            boolean w = w(taoLiveKtSwitchModel);
            if (q < 0 && !w) {
                arrayList.add(taoLiveKtSwitchModel);
            }
        }
        ((ArrayList) this.f26390a).addAll(arrayList);
        if (arrayList.size() > 0) {
            arrayList2.add(a(((ArrayList) this.f26390a).size() - arrayList.size(), arrayList, TaoLiveKtUpDownActionType.InsertAction));
            g1aVar.invoke(arrayList2);
        }
    }

    public final void v(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("927c3194", new Object[]{this, str, str2});
            return;
        }
        if (str != null) {
            this.e.add(str);
        }
        if (str2 != null) {
            this.e.add(str2);
        }
    }

    public final boolean w(TaoLiveKtSwitchModel taoLiveKtSwitchModel) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d43041", new Object[]{this, taoLiveKtSwitchModel})).booleanValue();
        }
        String liveId = taoLiveKtSwitchModel.getLiveId();
        if (liveId != null) {
            z = this.e.add(liveId);
        }
        return !z;
    }

    public final void y(int i, g1a<? super List<z3t>, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dba8cd16", new Object[]{this, new Integer(i), g1aVar});
            return;
        }
        ckf.g(g1aVar, "completionCallBack");
        ((ArrayList) this.f26390a).remove(i);
        g1aVar.invoke(xz3.e(a(i, null, TaoLiveKtUpDownActionType.RemoveAction)));
    }

    public final TaoLiveKtSwitchModel s(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtSwitchModel) ipChange.ipc$dispatch("36f737df", new Object[]{this, map});
        }
        TaoLiveKtSwitchModel taoLiveKtSwitchModel = new TaoLiveKtSwitchModel();
        taoLiveKtSwitchModel.setVisit(true);
        taoLiveKtSwitchModel.setFirst(true);
        taoLiveKtSwitchModel.setRequestType(a4t.INSTANCE.a().get(a4t.FIRST_ENTRY));
        Object obj = null;
        taoLiveKtSwitchModel.setLiveId((String) (map != null ? map.get("curLiveId") : null));
        taoLiveKtSwitchModel.setAccountId((String) (map != null ? map.get("curAccountId") : null));
        taoLiveKtSwitchModel.setTrackInfo((String) (map != null ? map.get("trackInfo") : null));
        if (c5t.INSTANCE.A()) {
            taoLiveKtSwitchModel.setTimeMovingId((String) (map != null ? map.get(yj4.PARAM_TIMEMOVING_ITEM_ID) : null));
            taoLiveKtSwitchModel.setSjsdItemId((String) (map != null ? map.get(yj4.PARAM_SJSD_ITEM_ID) : null));
            taoLiveKtSwitchModel.setKeyPointId((String) (map != null ? map.get("keyPointId") : null));
            taoLiveKtSwitchModel.setProductType((String) (map != null ? map.get(yj4.PARAM_PRODUCT_TYPE) : null));
            if (map != null) {
                obj = map.get("timeMovingSpfPlayVideo");
            }
            taoLiveKtSwitchModel.setTimeMovingSpfPlayVideo((String) obj);
        }
        ((ArrayList) this.f26390a).add(taoLiveKtSwitchModel);
        return taoLiveKtSwitchModel;
    }

    public final int q(TaoLiveKtSwitchModel taoLiveKtSwitchModel) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e13f6c5d", new Object[]{this, taoLiveKtSwitchModel})).intValue();
        }
        boolean z = ckf.b(taoLiveKtSwitchModel != null ? taoLiveKtSwitchModel.getProductType() : null, RecModel.MEDIA_TYPE_TIMEMOVE) && this.f;
        int i2 = -1;
        for (Object obj : this.f26390a) {
            i++;
            if (i >= 0) {
                TaoLiveKtSwitchModel taoLiveKtSwitchModel2 = (TaoLiveKtSwitchModel) obj;
                if (z) {
                    if ((taoLiveKtSwitchModel != null ? taoLiveKtSwitchModel.getKeyPointId() : null) != null) {
                        if (!ckf.b(taoLiveKtSwitchModel.getKeyPointId(), taoLiveKtSwitchModel2.getKeyPointId())) {
                        }
                        i2 = i;
                    }
                } else if ((taoLiveKtSwitchModel != null ? taoLiveKtSwitchModel.getLiveId() : null) != null) {
                    if (!ckf.b(taoLiveKtSwitchModel.getLiveId(), taoLiveKtSwitchModel2.getLiveId())) {
                    }
                    i2 = i;
                }
            } else {
                yz3.p();
                throw null;
            }
        }
        return i2;
    }

    public final List<TaoLiveKtSwitchModel> x(List<TaoLiveKtSwitchModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b67eff91", new Object[]{this, list});
        }
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (TaoLiveKtSwitchModel taoLiveKtSwitchModel : list) {
            String liveId = taoLiveKtSwitchModel.getLiveId();
            String keyPointId = taoLiveKtSwitchModel.getKeyPointId();
            boolean z = ckf.b(taoLiveKtSwitchModel.getProductType(), RecModel.MEDIA_TYPE_TIMEMOVE) && this.f;
            if (!z || keyPointId == null) {
                if (!z && liveId != null) {
                    if (linkedHashSet.add(liveId)) {
                        arrayList.add(taoLiveKtSwitchModel);
                    } else {
                        pus.INSTANCE.k("UpDownSwitch", "", "liveListCheck");
                    }
                }
            } else if (linkedHashSet2.add(keyPointId)) {
                arrayList.add(taoLiveKtSwitchModel);
            } else {
                pus.INSTANCE.k("UpDownSwitch", "", "liveListCheck");
            }
        }
        return i04.B0(arrayList);
    }

    public final void z(int i, TaoLiveKtSwitchModel taoLiveKtSwitchModel, g1a<? super List<z3t>, xhv> g1aVar) {
        String str;
        String str2;
        String str3;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0b6e100", new Object[]{this, new Integer(i), taoLiveKtSwitchModel, g1aVar});
            return;
        }
        ckf.g(g1aVar, "completionCallBack");
        if (i > g() && taoLiveKtSwitchModel != null && i < ((ArrayList) this.f26390a).size() && i > 0) {
            int q = q(taoLiveKtSwitchModel);
            ArrayList arrayList = new ArrayList();
            if (ckf.b(taoLiveKtSwitchModel.getProductType(), RecModel.MEDIA_TYPE_TIMEMOVE) && this.f) {
                z = true;
            }
            if (z) {
                str = taoLiveKtSwitchModel.getKeyPointId();
            } else {
                str = taoLiveKtSwitchModel.getLiveId();
            }
            if (q >= 0) {
                u5t.INSTANCE.b(taoLiveKtSwitchModel.getLiveId(), Integer.valueOf(q), Integer.valueOf(this.b), ((ArrayList) this.f26390a).size());
                if (q > this.b) {
                    if (q < i) {
                        i--;
                    } else if (q == i) {
                        g1aVar.invoke(arrayList);
                        return;
                    }
                    ((ArrayList) this.f26390a).remove(q);
                    arrayList.add(a(q, null, TaoLiveKtUpDownActionType.RemoveAction));
                    TaoLiveKtSwitchModel taoLiveKtSwitchModel2 = (TaoLiveKtSwitchModel) ((ArrayList) this.f26390a).get(i);
                    if (z) {
                        str3 = taoLiveKtSwitchModel2.getKeyPointId();
                    } else {
                        str3 = taoLiveKtSwitchModel2.getLiveId();
                    }
                    if (!ckf.b(str3, str)) {
                        ((ArrayList) this.f26390a).set(i, taoLiveKtSwitchModel);
                        arrayList.add(a(i, xz3.e(taoLiveKtSwitchModel), TaoLiveKtUpDownActionType.ReplaceAction));
                    }
                    g1aVar.invoke(arrayList);
                    return;
                }
                return;
            }
            TaoLiveKtSwitchModel taoLiveKtSwitchModel3 = (TaoLiveKtSwitchModel) ((ArrayList) this.f26390a).get(i);
            if (z) {
                str2 = taoLiveKtSwitchModel3.getKeyPointId();
            } else {
                str2 = taoLiveKtSwitchModel3.getLiveId();
            }
            if (!ckf.b(str2, str)) {
                ((ArrayList) this.f26390a).set(i, taoLiveKtSwitchModel);
                arrayList.add(a(i, xz3.e(taoLiveKtSwitchModel), TaoLiveKtUpDownActionType.ReplaceAction));
                g1aVar.invoke(arrayList);
            }
        }
    }

    public final TaoLiveKtSwitchModel j(TaoLiveKtSwitchModel taoLiveKtSwitchModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtSwitchModel) ipChange.ipc$dispatch("c7f8f630", new Object[]{this, taoLiveKtSwitchModel, new Boolean(z)});
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = -1;
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        String str = null;
        boolean z2 = ckf.b(taoLiveKtSwitchModel != null ? taoLiveKtSwitchModel.getProductType() : null, RecModel.MEDIA_TYPE_TIMEMOVE) && this.f;
        if (z2) {
            if (taoLiveKtSwitchModel != null) {
                str = taoLiveKtSwitchModel.getKeyPointId();
            }
        } else if (taoLiveKtSwitchModel != null) {
            str = taoLiveKtSwitchModel.getLiveId();
        }
        if (!z) {
            k(this, ref$BooleanRef, ref$ObjectRef, z2, str, ref$IntRef, 0, ((ArrayList) this.f26390a).size(), 1);
        } else {
            l(this, ref$BooleanRef, ref$ObjectRef, z2, str, ref$IntRef, ((ArrayList) this.f26390a).size() - 1, 0, 1);
        }
        if (ref$IntRef.element == -1) {
            int i = this.b;
            if (!z) {
                m(this, ref$ObjectRef, i + 1, ((ArrayList) this.f26390a).size(), 1);
            } else {
                n(this, ref$ObjectRef, i - 1, 0, 1);
            }
        }
        return (TaoLiveKtSwitchModel) ref$ObjectRef.element;
    }
}
