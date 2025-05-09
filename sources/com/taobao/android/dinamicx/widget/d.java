package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.g;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.HashMap;
import tb.la6;
import tb.mw5;
import tb.qub;
import tb.t2o;
import tb.vu3;
import tb.xv5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class d extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXANIMATEDVIEW_MAXLOOPCOUNT = 1982976705946089973L;
    public static final long DXANIMATEDVIEW_ONLOOPED = 5288720132388024904L;
    public static final long DX_WIDGET_ANIMATEDVIEW = -2149351516928899638L;
    public String b;
    public int c;

    /* renamed from: a  reason: collision with root package name */
    public double f7428a = 1.0d;
    public int d = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements DXImageWidgetNode.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode.d
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b56bae9b", new Object[]{this, new Integer(i)});
            } else if (i > 0) {
                DXEvent dXEvent = new DXEvent(d.DXANIMATEDVIEW_ONLOOPED);
                HashMap hashMap = new HashMap();
                hashMap.put("loopedCount", mw5.K(i));
                dXEvent.setArgs(hashMap);
                d.this.postEvent(dXEvent);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements DXImageWidgetNode.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode.d
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b56bae9b", new Object[]{this, new Integer(i)});
            } else if (i > 0) {
                DXEvent dXEvent = new DXEvent(d.DXANIMATEDVIEW_ONLOOPED);
                HashMap hashMap = new HashMap();
                hashMap.put("loopedCount", mw5.K(i));
                dXEvent.setArgs(hashMap);
                d.this.postEvent(dXEvent);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597261);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new d();
        }
    }

    static {
        t2o.a(444597258);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1806543962:
                return new Double(super.getDefaultValueForDoubleAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXAnimatedViewWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new d();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public double getDefaultValueForDoubleAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("945253a6", new Object[]{this, new Long(j)})).doubleValue();
        }
        if (j == 7594222789952419722L) {
            return 1.0d;
        }
        return super.getDefaultValueForDoubleAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (dXWidgetNode instanceof d) {
            d dVar = (d) dXWidgetNode;
            this.f7428a = dVar.f7428a;
            this.b = dVar.b;
            this.c = dVar.c;
            this.d = dVar.d;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        s h = g.h(getDXRuntimeContext());
        if (h == null) {
            return new ImageView(context);
        }
        return h.c(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        ImageView imageView = (ImageView) view;
        DXImageWidgetNode.g gVar = new DXImageWidgetNode.g();
        gVar.n = true;
        gVar.s = true;
        gVar.t = this.d;
        if (getEventHandlersExprNode() != null && getEventHandlersExprNode().get(DXANIMATEDVIEW_ONLOOPED) != null) {
            gVar.E(new a());
        } else if (!isV4Node() || getDxv4Properties().h() == null || getDxv4Properties().h().get(DXANIMATEDVIEW_ONLOOPED) == null) {
            gVar.E(null);
        } else {
            gVar.E(new b());
        }
        setImageScaleType(imageView, this.c);
        if (TextUtils.isEmpty(this.b)) {
            imageView.setImageDrawable(null);
        }
        s h = g.h(getDXRuntimeContext());
        if (h != null) {
            h.b(imageView, this.b, gVar);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == 7594222789952419722L) {
            this.f7428a = d;
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
            return;
        }
        if (j == 1015096712691932083L) {
            this.c = i;
        }
        if (j == 1982976705946089973L) {
            this.d = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == 9274838684923695L) {
            this.b = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int reusePoolMaxSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("184462af", new Object[]{this})).intValue();
        }
        return 3;
    }

    public void setImageScaleType(ImageView imageView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("920072b7", new Object[]{this, imageView, new Integer(i)});
        } else if (i == 1) {
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        } else if (i != 2) {
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean supportReuse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("562c49f0", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z = true;
        int i6 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int a2 = DXWidgetNode.DXMeasureSpec.a(i);
        int a3 = DXWidgetNode.DXMeasureSpec.a(i2);
        boolean z2 = a2 != 1073741824;
        if (a3 == 1073741824) {
            z = false;
        }
        if (z2 || z) {
            double d = this.f7428a;
            if (d <= vu3.b.GEO_NOT_SUPPORT) {
                if (DinamicXEngine.j0()) {
                    new IllegalArgumentException("非定高顶宽场景下需要设置aspectRatio");
                }
                la6.b("DXAnimatedViewWidgetNode" + xv5.a(new IllegalArgumentException("aspectRatio 非定高顶宽场景下需要设置aspectRatio")));
            }
            if (!z2 || z) {
                if (!z2 && z) {
                    int size = View.MeasureSpec.getSize(i);
                    if (d > vu3.b.GEO_NOT_SUPPORT) {
                        i5 = (int) (size / d);
                        i6 = size;
                    } else {
                        i6 = size;
                    }
                }
                i5 = 0;
            } else {
                i5 = View.MeasureSpec.getSize(i2);
                if (d > vu3.b.GEO_NOT_SUPPORT) {
                    i6 = (int) (i5 * d);
                }
            }
            int max = Math.max(i6, getSuggestedMinimumWidth());
            i3 = Math.max(i5, getSuggestedMinimumHeight());
            i4 = max;
        } else {
            i4 = DXWidgetNode.DXMeasureSpec.b(i);
            i3 = DXWidgetNode.DXMeasureSpec.b(i2);
        }
        setMeasuredDimension(DXWidgetNode.resolveSize(i4, i), DXWidgetNode.resolveSize(i3, i2));
    }
}
