package tb;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.structure.childpage.MetaChildPageWidget;
import com.taobao.android.meta.structure.state.MetaState;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.refactor.MSearchResult;
import com.taobao.search.sf.datasource.CommonSearchResult;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class klf extends uhj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final boolean h;
    public final jlf i = new jlf();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(815792899);
            int[] iArr = new int[MetaState.values().length];
            try {
                iArr[MetaState.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MetaState.LOADING_MORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MetaState.UPDATING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MetaState.LOAD_MORE_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MetaState.UPDATE_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        t2o.a(815792898);
    }

    public klf(boolean z) {
        this.h = z;
        L(false);
    }

    public static final void O(klf klfVar, jrh jrhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d236d", new Object[]{klfVar, jrhVar});
            return;
        }
        ckf.g(klfVar, "this$0");
        ckf.g(jrhVar, "$initDataSource");
        MetaChildPageWidget q = klfVar.u().q(jrhVar);
        if (q != null) {
            q.n3();
        }
    }

    public static final void W(klf klfVar, jrh jrhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("297938eb", new Object[]{klfVar, jrhVar});
            return;
        }
        ckf.g(klfVar, "this$0");
        ckf.g(jrhVar, "$scopeDataSource");
        MetaChildPageWidget q = klfVar.u().q(jrhVar);
        if (q != null) {
            q.n3();
        }
    }

    public static /* synthetic */ Object ipc$super(klf klfVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -783977950:
                super.b((jrh) objArr[0], (frh) objArr[1], ((Boolean) objArr[2]).booleanValue(), (Map) objArr[3]);
                return null;
            case -563373229:
                super.f((com.taobao.android.meta.data.a) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            case 975374731:
                super.d((Map) objArr[0], (frh) objArr[1], (jrh) objArr[2], (osi) objArr[3]);
                return null;
            case 1147742622:
                super.l((jrh) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            case 1658820622:
                super.k((jrh) objArr[0], (frh) objArr[1], ((Boolean) objArr[2]).booleanValue(), ((Boolean) objArr[3]).booleanValue(), (osi) objArr[4]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/refactor/ns/IpGuideFlow");
        }
    }

    @Override // tb.uhj
    /* renamed from: D */
    public void j(jrh jrhVar, frh frhVar, frh frhVar2, osi<frh> osiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae87a003", new Object[]{this, jrhVar, frhVar, frhVar2, osiVar});
            return;
        }
        ckf.g(jrhVar, "scopeDataSource");
        ckf.g(frhVar, "src");
        ckf.g(frhVar2, "incoming");
        ckf.g(osiVar, "config");
        frhVar.x(frhVar2);
        rhj rhjVar = (rhj) frhVar;
        rhjVar.O0().clear();
        rhjVar.O0().addAll(((rhj) frhVar2).O0());
    }

    @Override // tb.uhj
    /* renamed from: G */
    public void l(final jrh jrhVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4469299e", new Object[]{this, jrhVar, new Boolean(z)});
            return;
        }
        ckf.g(jrhVar, "initDataSource");
        super.l(jrhVar, z);
        if (z) {
            jrhVar.b1(true);
            U();
            CommonSearchResult commonSearchResult = (CommonSearchResult) jrhVar.getTotalSearchResult();
            if (commonSearchResult != null && commonSearchResult.comboSize() == 0) {
                if (this.h) {
                    rhj rhjVar = new rhj();
                    rhjVar.P(MetaState.EMPTY);
                    CommonSearchResult commonSearchResult2 = (CommonSearchResult) jrhVar.getTotalSearchResult();
                    if (commonSearchResult2 != null) {
                        commonSearchResult2.addCombo(rhjVar);
                        return;
                    }
                    return;
                }
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.laz
                    @Override // java.lang.Runnable
                    public final void run() {
                        klf.O(klf.this, jrhVar);
                    }
                });
            }
        }
    }

    @Override // tb.uhj
    /* renamed from: H */
    public void b(jrh jrhVar, frh frhVar, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1457222", new Object[]{this, jrhVar, frhVar, new Boolean(z), map});
            return;
        }
        ckf.g(jrhVar, "scopeDataSource");
        super.b(jrhVar, frhVar, z, map);
        V(frhVar);
    }

    public final void S(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15db2496", new Object[]{this, str});
        } else if (str != null) {
            RESULT totalSearchResult = ((jrh) u().r()).getTotalSearchResult();
            ckf.e(totalSearchResult, "null cannot be cast to non-null type com.taobao.search.refactor.MSearchResult");
            MSearchResult mSearchResult = (MSearchResult) totalSearchResult;
            int comboSize = mSearchResult.comboSize();
            for (int i = 0; i < comboSize; i++) {
                frh combo = mSearchResult.getCombo(i);
                ckf.e(combo, "null cannot be cast to non-null type com.taobao.search.refactor.ns.NSCombo");
                rhj rhjVar = (rhj) combo;
                if (ckf.b(rhjVar.J0(), str)) {
                    u().D(0, rhjVar.o(), 0, true);
                    return;
                }
            }
        }
    }

    public final void U() {
        rhj rhjVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("742c50e2", new Object[]{this});
            return;
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) ((jrh) u().r()).getTotalSearchResult();
        if (commonSearchResult != null) {
            int comboSize = commonSearchResult.comboSize();
            for (int i = 0; i < comboSize; i++) {
                frh combo = commonSearchResult.getCombo(i);
                if (combo instanceof rhj) {
                    rhjVar = (rhj) combo;
                } else {
                    rhjVar = null;
                }
                if (rhjVar != null) {
                    String str = "";
                    if (rhjVar.c1() != null) {
                        Boolean c1 = rhjVar.c1();
                        ckf.d(c1);
                        if (c1.booleanValue()) {
                            wnl wnlVar = wnl.INSTANCE;
                            Activity activity = u().w().getActivity();
                            ckf.f(activity, "getActivity(...)");
                            String J0 = rhjVar.J0();
                            if (J0 != null) {
                                str = J0;
                            }
                            wnlVar.b(activity, str, "comboState", "5");
                        }
                    }
                    wnl wnlVar2 = wnl.INSTANCE;
                    Activity activity2 = u().w().getActivity();
                    ckf.f(activity2, "getActivity(...)");
                    String J02 = rhjVar.J0();
                    if (J02 != null) {
                        str = J02;
                    }
                    wnlVar2.b(activity2, str, "comboState", "0");
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V(tb.frh r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 2
            com.android.alibaba.ip.runtime.IpChange r2 = tb.klf.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "194f1173"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r4 = 0
            r1[r4] = r5
            r1[r0] = r6
            r2.ipc$dispatch(r3, r1)
            return
        L_0x0015:
            if (r6 != 0) goto L_0x0018
            return
        L_0x0018:
            com.taobao.android.meta.structure.state.MetaState r2 = r6.s()
            int[] r3 = tb.klf.a.$EnumSwitchMapping$0
            int r2 = r2.ordinal()
            r2 = r3[r2]
            java.lang.String r3 = "0"
            if (r2 == r0) goto L_0x0033
            if (r2 == r1) goto L_0x003e
            r0 = 3
            if (r2 == r0) goto L_0x003b
            r0 = 4
            if (r2 == r0) goto L_0x0038
            r0 = 5
            if (r2 == r0) goto L_0x0035
        L_0x0033:
            r0 = r3
            goto L_0x0040
        L_0x0035:
            java.lang.String r0 = "4"
            goto L_0x0040
        L_0x0038:
            java.lang.String r0 = "2"
            goto L_0x0040
        L_0x003b:
            java.lang.String r0 = "3"
            goto L_0x0040
        L_0x003e:
            java.lang.String r0 = "1"
        L_0x0040:
            boolean r1 = r6 instanceof tb.rhj
            if (r1 == 0) goto L_0x004c
            r1 = r6
            tb.rhj r1 = (tb.rhj) r1
            boolean r1 = r1.f1()
            goto L_0x0050
        L_0x004c:
            boolean r1 = r6.w()
        L_0x0050:
            boolean r2 = tb.ckf.b(r0, r3)
            if (r2 == 0) goto L_0x005a
            if (r1 == 0) goto L_0x005a
            java.lang.String r0 = "5"
        L_0x005a:
            tb.wnl r1 = tb.wnl.INSTANCE
            com.taobao.search.refactor.MSController r2 = r5.u()
            tb.ksi r2 = r2.w()
            android.app.Activity r2 = r2.getActivity()
            java.lang.String r3 = "getActivity(...)"
            tb.ckf.f(r2, r3)
            tb.rhj r6 = (tb.rhj) r6
            java.lang.String r6 = r6.J0()
            if (r6 != 0) goto L_0x0077
            java.lang.String r6 = ""
        L_0x0077:
            java.lang.String r3 = "comboState"
            r1.b(r2, r6, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.klf.V(tb.frh):void");
    }

    @Override // tb.uhj
    /* renamed from: q */
    public void d(Map<String, String> map, frh frhVar, jrh jrhVar, osi<frh> osiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a23098b", new Object[]{this, map, frhVar, jrhVar, osiVar});
            return;
        }
        ckf.g(map, "map");
        ckf.g(frhVar, "combo");
        ckf.g(jrhVar, "scopeDataSource");
        super.d(map, frhVar, jrhVar, osiVar);
        map.put("m", "guide_combo");
    }

    @Override // tb.uhj
    /* renamed from: s */
    public void e(CommonSearchResult commonSearchResult, JSONObject jSONObject, yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdf635c5", new Object[]{this, commonSearchResult, jSONObject, ykoVar});
            return;
        }
        ckf.g(commonSearchResult, "result");
        this.i.e((MSearchResult) commonSearchResult, jSONObject, ykoVar);
    }

    @Override // tb.uhj
    /* renamed from: N */
    public boolean p(jrh jrhVar, frh frhVar, ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfab792c", new Object[]{this, jrhVar, frhVar, listStyle})).booleanValue();
        }
        ckf.g(jrhVar, "scopeDataSource");
        ckf.g(frhVar, "combo");
        ckf.g(listStyle, "newStyle");
        frhVar.N(listStyle);
        MetaChildPageWidget q = u().q(jrhVar);
        if (q != null) {
            q.d3();
        }
        return true;
    }

    /* renamed from: T */
    public void f(final jrh jrhVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616e1d7f", new Object[]{this, jrhVar, new Boolean(z)});
            return;
        }
        ckf.g(jrhVar, "scopeDataSource");
        super.f(jrhVar, z);
        if (z) {
            U();
            jrhVar.b1(true);
            CommonSearchResult commonSearchResult = (CommonSearchResult) jrhVar.getTotalSearchResult();
            if (commonSearchResult != null && commonSearchResult.comboSize() == 0) {
                if (this.h) {
                    rhj rhjVar = new rhj();
                    rhjVar.P(MetaState.EMPTY);
                    CommonSearchResult commonSearchResult2 = (CommonSearchResult) jrhVar.getTotalSearchResult();
                    if (commonSearchResult2 != null) {
                        commonSearchResult2.addCombo(rhjVar);
                        return;
                    }
                    return;
                }
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.maz
                    @Override // java.lang.Runnable
                    public final void run() {
                        klf.W(klf.this, jrhVar);
                    }
                });
            }
        }
    }

    @Override // tb.uhj
    /* renamed from: F */
    public void k(jrh jrhVar, frh frhVar, boolean z, boolean z2, osi<frh> osiVar) {
        w7p w7pVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62df980e", new Object[]{this, jrhVar, frhVar, new Boolean(z), new Boolean(z2), osiVar});
            return;
        }
        ckf.g(jrhVar, "scopeDataSource");
        ckf.g(osiVar, "config");
        super.k(jrhVar, frhVar, z, z2, osiVar);
        V(frhVar);
        CommonSearchResult commonSearchResult = (CommonSearchResult) jrhVar.getTotalSearchResult();
        if (commonSearchResult != null && commonSearchResult.hasSectionClip() && commonSearchResult.getLastCombo() == frhVar && frhVar != null && frhVar.w()) {
            rhj rhjVar = frhVar instanceof rhj ? (rhj) frhVar : null;
            if (rhjVar != null) {
                for (BaseCellBean baseCellBean : rhjVar.O0()) {
                    w7p w7pVar2 = baseCellBean.ownedSectionStyle;
                    if (!(w7pVar2 == null || !w7pVar2.h() || (w7pVar = baseCellBean.ownedSectionStyle) == null)) {
                        w7pVar.l(false);
                    }
                }
            }
        }
    }
}
