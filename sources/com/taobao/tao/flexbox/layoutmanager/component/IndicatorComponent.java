package com.taobao.tao.flexbox.layoutmanager.component;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.j;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.view.TNodeIndicatorView;
import java.util.HashMap;
import java.util.Map;
import tb.hk8;
import tb.ir2;
import tb.jfw;
import tb.nwv;
import tb.s6o;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class IndicatorComponent extends Component<TNodeIndicatorView, a> implements j {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context context;
    private boolean firstTime = true;
    private TNodeIndicatorView.a lastIndicatorStatus;
    private TNodeIndicatorView mIndicator;

    static {
        t2o.a(503316730);
        t2o.a(503317092);
    }

    public static /* synthetic */ Object ipc$super(IndicatorComponent indicatorComponent, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -703216504) {
            super.applyAttrForView((IndicatorComponent) ((View) objArr[0]), (View) ((jfw) objArr[1]), (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
            return null;
        } else if (hashCode == 1052797818) {
            super.detach(((Boolean) objArr[0]).booleanValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/flexbox/layoutmanager/component/IndicatorComponent");
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        V v = this.view;
        if (v != 0) {
            this.lastIndicatorStatus = ((TNodeIndicatorView) v).getCurrentIndicatorStatus();
        }
        super.detach(z);
        o.t T = this.node.T();
        if (T != null) {
            T.a("onbrowserselected", this);
            T.a("onBannerSelected", this);
            T.a("onpageselected", this);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleMessage(n.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e782cf4", new Object[]{this, gVar})).booleanValue();
        }
        return onHandleTNodeMessage(gVar.b, gVar.c, gVar.d, null, gVar.e, gVar.g);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onViewCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad6b63ab", new Object[]{this});
            return;
        }
        o.t T = this.node.T();
        if (T != null) {
            T.b("onbrowserselected", this);
            T.b("onBannerSelected", this);
            T.b("onpageselected", this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a extends jfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int A0;
        public int E0;
        public String[] H0;
        public int w0;
        public int x0;
        public int y0;
        public int z0;
        public int B0 = 0;
        public int C0 = -1;
        public int D0 = 0;
        public float F0 = 1.0f;
        public boolean G0 = false;

        static {
            t2o.a(503316731);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -998046064) {
                super.B((Context) objArr[0], (HashMap) objArr[1]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/IndicatorComponent$IndicatorParams");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
            if (r9.equals("indicator-count") == false) goto L_0x0026;
         */
        @Override // tb.jfw
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void v(android.content.Context r8, java.lang.String r9, java.lang.Object r10) {
            /*
                r7 = this;
                r0 = 3
                r1 = 2
                r2 = 1
                r3 = 0
                com.android.alibaba.ip.runtime.IpChange r4 = com.taobao.tao.flexbox.layoutmanager.component.IndicatorComponent.a.$ipChange
                boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r5 == 0) goto L_0x001b
                java.lang.String r5 = "e7bb1f3f"
                r6 = 4
                java.lang.Object[] r6 = new java.lang.Object[r6]
                r6[r3] = r7
                r6[r2] = r8
                r6[r1] = r9
                r6[r0] = r10
                r4.ipc$dispatch(r5, r6)
                return
            L_0x001b:
                r9.hashCode()
                r8 = -1
                int r4 = r9.hashCode()
                switch(r4) {
                    case -1034268112: goto L_0x004a;
                    case -893829617: goto L_0x003e;
                    case 98629247: goto L_0x0032;
                    case 2050497489: goto L_0x0028;
                    default: goto L_0x0026;
                }
            L_0x0026:
                r0 = -1
                goto L_0x0055
            L_0x0028:
                java.lang.String r1 = "indicator-count"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x0055
                goto L_0x0026
            L_0x0032:
                java.lang.String r0 = "group"
                boolean r9 = r9.equals(r0)
                if (r9 != 0) goto L_0x003c
                goto L_0x0026
            L_0x003c:
                r0 = 2
                goto L_0x0055
            L_0x003e:
                java.lang.String r0 = "min-scale"
                boolean r9 = r9.equals(r0)
                if (r9 != 0) goto L_0x0048
                goto L_0x0026
            L_0x0048:
                r0 = 1
                goto L_0x0055
            L_0x004a:
                java.lang.String r0 = "new-control"
                boolean r9 = r9.equals(r0)
                if (r9 != 0) goto L_0x0054
                goto L_0x0026
            L_0x0054:
                r0 = 0
            L_0x0055:
                switch(r0) {
                    case 0: goto L_0x006e;
                    case 1: goto L_0x0067;
                    case 2: goto L_0x0060;
                    case 3: goto L_0x0059;
                    default: goto L_0x0058;
                }
            L_0x0058:
                goto L_0x0074
            L_0x0059:
                int r8 = tb.nwv.t(r10, r3)
                r7.E0 = r8
                goto L_0x0074
            L_0x0060:
                java.lang.String[] r8 = tb.ir2.s(r10)
                r7.H0 = r8
                goto L_0x0074
            L_0x0067:
                float r8 = tb.nwv.r(r10, r2)
                r7.F0 = r8
                goto L_0x0074
            L_0x006e:
                boolean r8 = tb.nwv.o(r10, r3)
                r7.G0 = r8
            L_0x0074:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.IndicatorComponent.a.v(android.content.Context, java.lang.String, java.lang.Object):void");
        }

        @Override // tb.jfw
        public void B(Context context, HashMap hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4830690", new Object[]{this, context, hashMap});
                return;
            }
            super.B(context, hashMap);
            this.w0 = nwv.t(hashMap.get("numbers"), 4);
            this.x0 = nwv.t(hashMap.get("radius"), 4);
            this.y0 = nwv.t(hashMap.get("inner-space"), 4);
            Object obj = hashMap.get("normal-color");
            if (obj != null) {
                this.z0 = ir2.e(context, 1, obj);
            }
            Object obj2 = hashMap.get("select-color");
            if (obj2 != null) {
                this.A0 = ir2.e(context, 1, obj2);
            }
            String str = "current-index";
            if (!hashMap.containsKey(str)) {
                str = "currentIndex";
            }
            this.B0 = nwv.t(hashMap.get(str), 0);
            Object obj3 = hashMap.get("border-item-color");
            if (obj3 != null) {
                this.C0 = ir2.e(context, 1, obj3);
            }
            this.D0 = nwv.t(hashMap.get("border-item-width"), 0);
        }
    }

    public void applyAttrForView(TNodeIndicatorView tNodeIndicatorView, a aVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddb47670", new Object[]{this, tNodeIndicatorView, aVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForView((IndicatorComponent) tNodeIndicatorView, (TNodeIndicatorView) aVar, map, z);
        this.mIndicator.setTotal(aVar.w0);
        int U = s6o.U(getNode(), this.context, aVar.x0);
        this.mIndicator.setBorderWidth(s6o.U(getNode(), this.context, aVar.D0));
        this.mIndicator.setRadius(U);
        if (aVar.y0 > 0) {
            this.mIndicator.setGapMargin(s6o.U(getNode(), this.context, aVar.y0));
        }
        this.mIndicator.setUnfocusColor(aVar.z0);
        this.mIndicator.setFocusColor(aVar.A0);
        this.mIndicator.setBorderColor(aVar.C0);
        this.mIndicator.setNewControlParams(aVar.G0, aVar.E0, aVar.F0);
        if (this.firstTime) {
            this.firstTime = false;
            TNodeIndicatorView.a aVar2 = this.lastIndicatorStatus;
            if (aVar2 != null) {
                this.mIndicator.initWithIndicatorStatus(aVar2);
            } else {
                this.mIndicator.setIndex(aVar.B0);
            }
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public a generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("2348b4fe", new Object[]{this}) : new a();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public TNodeIndicatorView onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TNodeIndicatorView) ipChange.ipc$dispatch("c50ff2a5", new Object[]{this, context});
        }
        this.context = context;
        TNodeIndicatorView tNodeIndicatorView = new TNodeIndicatorView(context);
        this.mIndicator = tNodeIndicatorView;
        this.firstTime = true;
        return tNodeIndicatorView;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleTNodeMessage(n nVar, n nVar2, String str, String str2, Map map, hk8 hk8Var) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abab8f80", new Object[]{this, nVar, nVar2, str, str2, map, hk8Var})).booleanValue();
        }
        if (!str.equals("onbrowserselected") && !str.equals("onBannerSelected")) {
            z = false;
        }
        if ((str.equals("onpageselected") || z) && ir2.b(nwv.J(map.get("group"), null), ((a) this.viewParams).H0)) {
            this.mIndicator.setIndex(((Integer) map.get("newIndex")).intValue());
        }
        return false;
    }
}
