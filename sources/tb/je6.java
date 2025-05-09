package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.taolive.uikit.view.TBMaskView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class je6 extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTBLMASKVIEW_TBENDCOLOR = 5793645708615970550L;
    public static final long DXTBLMASKVIEW_TBID = 38174466807L;
    public static final long DXTBLMASKVIEW_TBLMASKVIEW = -1112551920354485228L;
    public static final long DXTBLMASKVIEW_TBORIENTATION = 3892001199285555311L;
    public static final long DXTBLMASKVIEW_TBSTARTCOLOR = -1401304785392888081L;

    /* renamed from: a  reason: collision with root package name */
    public String f21953a;
    public Object b;
    public String c = "horizontal";
    public String d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(779092442);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new je6();
        }
    }

    static {
        t2o.a(779092441);
    }

    public static /* synthetic */ Object ipc$super(je6 je6Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 253729832:
                return super.getDefaultValueForStringAttr(((Number) objArr[0]).longValue());
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 1694530481:
                super.onSetObjAttribute(((Number) objArr[0]).longValue(), objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/dinamicext/dinamicx/DXTBLMaskViewWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new je6();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public String getDefaultValueForStringAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j)});
        }
        if (j == DXTBLMASKVIEW_TBORIENTATION) {
            return "horizontal";
        }
        return super.getDefaultValueForStringAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else {
            super.onBindEvent(context, view, j);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode instanceof je6) {
            super.onClone(dXWidgetNode, z);
            je6 je6Var = (je6) dXWidgetNode;
            this.f21953a = je6Var.f21953a;
            this.b = je6Var.b;
            this.c = je6Var.c;
            this.d = je6Var.d;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new TBMaskView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetObjAttribute(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65007bb1", new Object[]{this, new Long(j), obj});
        } else if (j == 38174466807L) {
            this.b = obj;
        } else {
            super.onSetObjAttribute(j, obj);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXTBLMASKVIEW_TBENDCOLOR) {
            this.f21953a = str;
        } else if (j == DXTBLMASKVIEW_TBORIENTATION) {
            this.c = str;
        } else if (j == DXTBLMASKVIEW_TBSTARTCOLOR) {
            this.d = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onRenderView(android.content.Context r5, android.view.View r6) {
        /*
            r4 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = tb.je6.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = "ede516ab"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r4
            r0 = 1
            r3[r0] = r5
            r5 = 2
            r3[r5] = r6
            r1.ipc$dispatch(r2, r3)
            return
        L_0x0018:
            super.onRenderView(r5, r6)
            boolean r5 = r6 instanceof com.taobao.taolive.uikit.view.TBMaskView
            if (r5 == 0) goto L_0x0069
            com.taobao.taolive.uikit.view.TBMaskView r6 = (com.taobao.taolive.uikit.view.TBMaskView) r6
            java.lang.Object r5 = r4.b
            if (r5 == 0) goto L_0x0028
            r6.setTag(r5)
        L_0x0028:
            java.lang.String r5 = r4.c
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0069
            java.lang.String r5 = r4.d     // Catch: Exception -> 0x003f
            int r5 = tb.z14.a(r5)     // Catch: Exception -> 0x003f
            java.lang.String r1 = r4.f21953a     // Catch: Exception -> 0x003d
            int r0 = tb.z14.a(r1)     // Catch: Exception -> 0x003d
            goto L_0x0044
        L_0x003d:
            r1 = move-exception
            goto L_0x0041
        L_0x003f:
            r1 = move-exception
            r5 = 0
        L_0x0041:
            r1.printStackTrace()
        L_0x0044:
            java.lang.String r1 = "vertical"
            java.lang.String r2 = r4.c
            boolean r1 = r1.endsWith(r2)
            if (r1 == 0) goto L_0x005b
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r2 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            int[] r5 = new int[]{r5, r0}
            r1.<init>(r2, r5)
            goto L_0x0066
        L_0x005b:
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r2 = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT
            int[] r5 = new int[]{r5, r0}
            r1.<init>(r2, r5)
        L_0x0066:
            r6.setMask(r1)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.je6.onRenderView(android.content.Context, android.view.View):void");
    }
}
