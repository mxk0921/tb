package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.structure.state.MetaState;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class csi extends ox<xtc, dsi> implements wtc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public fuc f17290a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(993001556);
            int[] iArr = new int[MetaState.values().length];
            try {
                iArr[MetaState.LOADING_MORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MetaState.LOAD_MORE_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MetaState.LIST_FINISHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        t2o.a(993001555);
        t2o.a(993001552);
    }

    public static /* synthetic */ Object ipc$super(csi csiVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/meta/structure/state/footer/MetaFootStatePresenter");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
        if (r5 == null) goto L_0x006c;
     */
    @Override // tb.wtc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void I() {
        /*
            r11 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.csi.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0012
            java.lang.String r3 = "96950d81"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r11
            r2.ipc$dispatch(r3, r1)
            return
        L_0x0012:
            java.lang.Object r2 = r11.getWidget()
            tb.dsi r2 = (tb.dsi) r2
            java.lang.Object r2 = r2.getModel()
            tb.acx r2 = (tb.acx) r2
            tb.o02 r2 = r2.e()
            com.taobao.android.meta.data.a r2 = (com.taobao.android.meta.data.a) r2
            com.taobao.android.searchbaseframe.datasource.result.SearchResult r2 = r2.getTotalSearchResult()
            com.taobao.android.meta.data.MetaResult r2 = (com.taobao.android.meta.data.MetaResult) r2
            r3 = 2
            if (r2 == 0) goto L_0x006c
            boolean r4 = r2.getHideFooterState()
            if (r4 == 0) goto L_0x0034
            return
        L_0x0034:
            int r4 = r2.comboSize()
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x003b:
            if (r6 >= r4) goto L_0x0066
            tb.asi r8 = r2.getCombo(r6)
            tb.ckf.d(r8)
            com.taobao.android.meta.structure.state.MetaState r9 = r8.s()
            int[] r10 = tb.csi.a.$EnumSwitchMapping$0
            int r9 = r9.ordinal()
            r9 = r10[r9]
            if (r9 == r1) goto L_0x0058
            if (r9 == r3) goto L_0x0055
            goto L_0x005a
        L_0x0055:
            com.taobao.android.meta.structure.state.MetaState r5 = com.taobao.android.meta.structure.state.MetaState.LOAD_MORE_ERROR
            goto L_0x005a
        L_0x0058:
            com.taobao.android.meta.structure.state.MetaState r5 = com.taobao.android.meta.structure.state.MetaState.LOADING_MORE
        L_0x005a:
            if (r5 == 0) goto L_0x005d
            goto L_0x0066
        L_0x005d:
            boolean r8 = r8.w()
            if (r8 == 0) goto L_0x0064
            int r7 = r7 + r1
        L_0x0064:
            int r6 = r6 + r1
            goto L_0x003b
        L_0x0066:
            if (r7 != r4) goto L_0x006a
            com.taobao.android.meta.structure.state.MetaState r5 = com.taobao.android.meta.structure.state.MetaState.LIST_FINISHED
        L_0x006a:
            if (r5 != 0) goto L_0x006e
        L_0x006c:
            com.taobao.android.meta.structure.state.MetaState r5 = com.taobao.android.meta.structure.state.MetaState.DEFAULT
        L_0x006e:
            com.taobao.android.meta.structure.state.MetaState r2 = com.taobao.android.meta.structure.state.MetaState.DEFAULT
            if (r5 != r2) goto L_0x007c
            java.lang.Object r1 = r11.getIView()
            tb.xtc r1 = (tb.xtc) r1
            r1.setVisible(r0)
            return
        L_0x007c:
            java.lang.Object r0 = r11.getIView()
            tb.xtc r0 = (tb.xtc) r0
            r0.setVisible(r1)
            int[] r0 = tb.csi.a.$EnumSwitchMapping$0
            int r2 = r5.ordinal()
            r0 = r0[r2]
            if (r0 == r1) goto L_0x00a9
            if (r0 == r3) goto L_0x009f
            r1 = 3
            if (r0 == r1) goto L_0x0095
            goto L_0x00b2
        L_0x0095:
            java.lang.Object r0 = r11.getIView()
            tb.xtc r0 = (tb.xtc) r0
            r0.l()
            goto L_0x00b2
        L_0x009f:
            java.lang.Object r0 = r11.getIView()
            tb.xtc r0 = (tb.xtc) r0
            r0.showError()
            goto L_0x00b2
        L_0x00a9:
            java.lang.Object r0 = r11.getIView()
            tb.xtc r0 = (tb.xtc) r0
            r0.showLoading()
        L_0x00b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.csi.I():void");
    }

    @Override // tb.wtc
    public bsi a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bsi) ipChange.ipc$dispatch("1ffd1048", new Object[]{this});
        }
        bsi c = ((acx) getWidget().getModel()).c();
        ckf.f(c, "getMetaConfig(...)");
        return c;
    }

    @Override // tb.wtc
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eea3d88d", new Object[]{this});
            return;
        }
        fuc fucVar = this.f17290a;
        if (fucVar != null) {
            fucVar.e();
        }
    }

    @Override // tb.wtc
    public com.taobao.android.meta.data.a<? extends asi, ? extends MetaResult<? extends asi>> getDataSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.meta.data.a) ipChange.ipc$dispatch("6ef7a5b", new Object[]{this});
        }
        o02 e = ((acx) getWidget().getModel()).e();
        ckf.f(e, "getScopeDatasource(...)");
        return (com.taobao.android.meta.data.a) e;
    }

    @Override // tb.ddd
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        }
    }

    @Override // tb.wtc
    public void k0(fuc fucVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97e7b20d", new Object[]{this, fucVar});
            return;
        }
        ckf.g(fucVar, "callback");
        this.f17290a = fucVar;
    }
}
