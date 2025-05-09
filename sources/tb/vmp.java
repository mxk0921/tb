package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.BrowserComponent;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.view.SheetViewGroup;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vmp extends zr7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(503316833);
    }

    public static /* synthetic */ Object ipc$super(vmp vmpVar, String str, Object... objArr) {
        if (str.hashCode() == -703216504) {
            super.applyAttrForView((View) objArr[0], (jfw) objArr[1], (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/SheetComponent");
    }

    @Override // tb.zr7, com.taobao.tao.flexbox.layoutmanager.core.Component
    public void applyAttrForView(View view, jfw jfwVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d615c488", new Object[]{this, view, jfwVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForView(view, jfwVar, map, z);
        a aVar = (a) this.viewParams;
        if (!nwv.S(aVar.w0)) {
            n w = this.node.w(aVar.w0, false);
            P p = this.viewParams;
            ((SheetViewGroup) view).setSideNode(w, ((a) p).x0, ((a) p).y0);
        }
        ((SheetViewGroup) view).setBrowserNode(this.node.x(BrowserComponent.class));
    }

    @Override // tb.zr7, com.taobao.tao.flexbox.layoutmanager.core.c
    public boolean canbeDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e62ddc", new Object[]{this})).booleanValue();
        }
        return false;
    }

    /* renamed from: h */
    public a generateViewParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("4b8d1919", new Object[]{this});
        }
        return new a(this);
    }

    @Override // tb.zr7
    public boolean needRecycled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98f38ff2", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.zr7, com.taobao.tao.flexbox.layoutmanager.core.Component
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        SheetViewGroup sheetViewGroup = new SheetViewGroup(context);
        sheetViewGroup.bindComponent(this);
        return sheetViewGroup;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends jfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String w0;
        public int x0 = 1;
        public int y0 = 1;

        static {
            t2o.a(503316834);
        }

        public a(vmp vmpVar) {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/SheetComponent$SheetViewParams");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
            if (r9.equals("side-max-appearNum") == false) goto L_0x0027;
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
                r2 = 4
                r3 = 1
                r4 = 0
                com.android.alibaba.ip.runtime.IpChange r5 = tb.vmp.a.$ipChange
                boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r6 == 0) goto L_0x001b
                java.lang.String r6 = "e7bb1f3f"
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r4] = r7
                r2[r3] = r8
                r2[r1] = r9
                r2[r0] = r10
                r5.ipc$dispatch(r6, r2)
                return
            L_0x001b:
                r9.hashCode()
                r8 = 0
                r5 = -1
                int r6 = r9.hashCode()
                switch(r6) {
                    case -1048099191: goto L_0x0063;
                    case -995678931: goto L_0x0057;
                    case -400370815: goto L_0x004b;
                    case 1392756370: goto L_0x0041;
                    case 1502074784: goto L_0x0035;
                    case 2085176657: goto L_0x0029;
                    default: goto L_0x0027;
                }
            L_0x0027:
                r0 = -1
                goto L_0x006e
            L_0x0029:
                java.lang.String r0 = "side-id"
                boolean r9 = r9.equals(r0)
                if (r9 != 0) goto L_0x0033
                goto L_0x0027
            L_0x0033:
                r0 = 5
                goto L_0x006e
            L_0x0035:
                java.lang.String r0 = "side-alpha-id"
                boolean r9 = r9.equals(r0)
                if (r9 != 0) goto L_0x003f
                goto L_0x0027
            L_0x003f:
                r0 = 4
                goto L_0x006e
            L_0x0041:
                java.lang.String r1 = "side-max-appearNum"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x006e
                goto L_0x0027
            L_0x004b:
                java.lang.String r0 = "side-max-activeNum"
                boolean r9 = r9.equals(r0)
                if (r9 != 0) goto L_0x0055
                goto L_0x0027
            L_0x0055:
                r0 = 2
                goto L_0x006e
            L_0x0057:
                java.lang.String r0 = "side-min-alpha"
                boolean r9 = r9.equals(r0)
                if (r9 != 0) goto L_0x0061
                goto L_0x0027
            L_0x0061:
                r0 = 1
                goto L_0x006e
            L_0x0063:
                java.lang.String r0 = "side-direction"
                boolean r9 = r9.equals(r0)
                if (r9 != 0) goto L_0x006d
                goto L_0x0027
            L_0x006d:
                r0 = 0
            L_0x006e:
                switch(r0) {
                    case 0: goto L_0x008f;
                    case 1: goto L_0x008b;
                    case 2: goto L_0x0084;
                    case 3: goto L_0x007d;
                    case 4: goto L_0x0079;
                    case 5: goto L_0x0072;
                    default: goto L_0x0071;
                }
            L_0x0071:
                goto L_0x0095
            L_0x0072:
                java.lang.String r8 = tb.nwv.I(r10, r8)
                r7.w0 = r8
                goto L_0x0095
            L_0x0079:
                tb.nwv.I(r10, r8)
                goto L_0x0095
            L_0x007d:
                int r8 = tb.nwv.t(r10, r3)
                r7.x0 = r8
                goto L_0x0095
            L_0x0084:
                int r8 = tb.nwv.t(r10, r3)
                r7.y0 = r8
                goto L_0x0095
            L_0x008b:
                tb.nwv.r(r10, r4)
                goto L_0x0095
            L_0x008f:
                java.lang.String r8 = "right"
                tb.nwv.I(r10, r8)
            L_0x0095:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.vmp.a.v(android.content.Context, java.lang.String, java.lang.Object):void");
        }
    }
}
