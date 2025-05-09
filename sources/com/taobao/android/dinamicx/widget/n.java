package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXPageChangeEvent;
import com.taobao.android.dinamicx.view.DXNativeBouncePageIndicator;
import com.taobao.android.dinamicx.view.DXNativePageIndicator;
import com.taobao.android.dinamicx.view.DXNativeProgressIndicator;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.pb6;
import tb.qub;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class n extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_OFF_COLOR = 14606046;
    public static final int DEFAULT_ON_COLOR = 16742144;
    public static final long DXPAGEINDICATOR_DISPLAYTYPE = 8838583655093142947L;
    public static final int DXPAGEINDICATOR_DISPLAYTYPE_CIRCLE = 0;
    public static final int DXPAGEINDICATOR_DISPLAYTYPE_LINE = 1;
    public static final int DXPAGEINDICATOR_DISPLAYTYPE_PROGRESS = 2;
    public static final long DXPAGEINDICATOR_ITEMMARGIN = -884050990290307049L;
    public static final long DXPAGEINDICATOR_ITEMROUNDDIAMETER = -8559743205145630989L;
    public static final long DXPAGEINDICATOR_ITEMSELECTEDBORDERCOLOR = 956057309702335052L;
    public static final long DXPAGEINDICATOR_ITEMSELECTEDBORDERWIDTH = 1687099697943502157L;
    public static final long DXPAGEINDICATOR_ITEMUNSELECTEDBORDERCOLOR = -2071489811568019695L;
    public static final long DXPAGEINDICATOR_ITEMUNSELECTEDBORDERWIDTH = 852679479955548690L;
    public static final long DXPAGEINDICATOR_MAXDISPLAYCOUNT = -3284462966979738828L;
    public static final long DXPAGEINDICATOR_UPDATEIMMEDIATELY = -141714798648194808L;
    public static final long DX_PAGE_INDICATOR = -4649639459667590873L;
    public static final long DX_PAGE_INDICATOR_HIDES_FOR_SINGLE_PAGE = 5486881853309576485L;
    public static final long DX_PAGE_INDICATOR_OFF_COLOR = 5279668588453924930L;
    public static final long DX_PAGE_INDICATOR_ON_COLOR = 5176469557014791523L;
    public static final long DX_PAGE_INDICATOR_PAGE_COUNT = 7816476278377541039L;
    public int d;
    public int e;
    public boolean f;
    public int i;
    public int k;
    public int l;
    public int m;
    public int n;

    /* renamed from: a  reason: collision with root package name */
    public int f7446a = 0;
    public int b = DEFAULT_ON_COLOR;
    public int c = DEFAULT_OFF_COLOR;
    public int j = 3000;
    public boolean o = false;
    public int g = pb6.o(DinamicXEngine.x(), "8ap", 16);
    public int h = pb6.o(DinamicXEngine.x(), "3ap", 9);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597339);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new n();
        }
    }

    static {
        t2o.a(444597338);
    }

    public static /* synthetic */ Object ipc$super(n nVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 1327675976:
                return new Boolean(super.onEvent((DXEvent) objArr[0]));
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXPageIndicator");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new n();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == DXPAGEINDICATOR_DISPLAYTYPE) {
            return 0;
        }
        if (j == DX_PAGE_INDICATOR_ON_COLOR) {
            return DEFAULT_ON_COLOR;
        }
        if (j == DX_PAGE_INDICATOR_OFF_COLOR) {
            return DEFAULT_OFF_COLOR;
        }
        if (j == DXPAGEINDICATOR_ITEMUNSELECTEDBORDERWIDTH || DXPAGEINDICATOR_ITEMSELECTEDBORDERCOLOR == j || DXPAGEINDICATOR_ITEMSELECTEDBORDERWIDTH == j || DXPAGEINDICATOR_ITEMUNSELECTEDBORDERCOLOR == j) {
            return 0;
        }
        if (j == DXPAGEINDICATOR_ITEMMARGIN) {
            return pb6.p(getEngine(), DinamicXEngine.x(), "3ap", 9);
        }
        if (j == DXPAGEINDICATOR_ITEMROUNDDIAMETER) {
            return pb6.p(getEngine(), DinamicXEngine.x(), "8ap", 16);
        }
        if (j == DXPAGEINDICATOR_MAXDISPLAYCOUNT) {
            return 1;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (dXWidgetNode instanceof n) {
            n nVar = (n) dXWidgetNode;
            this.f7446a = nVar.f7446a;
            this.f = nVar.f;
            this.e = nVar.e;
            this.d = nVar.d;
            this.c = nVar.c;
            this.b = nVar.b;
            this.h = nVar.h;
            this.g = nVar.g;
            this.k = nVar.k;
            this.l = nVar.l;
            this.m = nVar.m;
            this.n = nVar.n;
            this.j = nVar.j;
            if (getDefaultValueForIntAttr(DXPAGEINDICATOR_MAXDISPLAYCOUNT) == 1 && (i = nVar.i) != 0) {
                this.i = i;
            }
            this.o = nVar.o;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        if (!t() && getDefaultValueForIntAttr(DXPAGEINDICATOR_MAXDISPLAYCOUNT) == 1 && this.i != 0) {
            return new DXNativeBouncePageIndicator(context);
        }
        if (this.f7446a == 2) {
            return new DXNativeProgressIndicator(context);
        }
        return new DXNativePageIndicator(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (super.onEvent(dXEvent)) {
            return true;
        }
        if (dXEvent.getEventId() != -8975195222378757716L && (dXEvent.getEventId() != DXSliderLayout.DXSLIDERLAYOUT_ONENDDRAGGING || !this.o)) {
            return false;
        }
        if (this.e <= 0) {
            return true;
        }
        DXPageChangeEvent dXPageChangeEvent = (DXPageChangeEvent) dXEvent;
        if (getDefaultValueForIntAttr(DXPAGEINDICATOR_MAXDISPLAYCOUNT) == 1 && this.i != 0) {
            DXNativeBouncePageIndicator dXNativeBouncePageIndicator = (DXNativeBouncePageIndicator) getDXRuntimeContext().D();
            if (dXNativeBouncePageIndicator != null) {
                dXNativeBouncePageIndicator.setSelectedView(dXPageChangeEvent.pageIndex);
            }
        } else if (getDXRuntimeContext().D() instanceof DXNativeProgressIndicator) {
            DXNativeProgressIndicator dXNativeProgressIndicator = (DXNativeProgressIndicator) getDXRuntimeContext().D();
            if (dXPageChangeEvent.isTouched) {
                dXNativeProgressIndicator.setIndex(dXPageChangeEvent.pageIndex + 1);
            } else {
                dXNativeProgressIndicator.setIndexWithAnimation(dXPageChangeEvent.pageIndex);
            }
        } else {
            DXNativePageIndicator dXNativePageIndicator = (DXNativePageIndicator) getDXRuntimeContext().D();
            if (dXNativePageIndicator != null) {
                dXNativePageIndicator.setSelectedView(dXPageChangeEvent.pageIndex);
            }
        }
        this.d = dXPageChangeEvent.pageIndex;
        return true;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int a2 = DXWidgetNode.DXMeasureSpec.a(i);
        int a3 = DXWidgetNode.DXMeasureSpec.a(i2);
        if (a2 != 1073741824) {
            z = true;
        } else {
            z = false;
        }
        if (a3 != 1073741824) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            i6 = DXWidgetNode.DXMeasureSpec.b(i);
            i3 = DXWidgetNode.DXMeasureSpec.b(i2);
        } else if (t()) {
            i3 = 0;
        } else {
            if (z) {
                if (getDefaultValueForIntAttr(DXPAGEINDICATOR_MAXDISPLAYCOUNT) != 1 || (i5 = this.i) == 0) {
                    i4 = this.e;
                } else {
                    i4 = Math.min(i5, this.e);
                }
                if (i4 > 0) {
                    int i7 = 0;
                    while (i6 < i4) {
                        i7 += this.g;
                        if (i6 != i4 - 1) {
                            i7 += this.h;
                        }
                        i6++;
                    }
                    i6 = i7;
                }
            } else {
                i6 = DXWidgetNode.DXMeasureSpec.b(i);
            }
            if (z2) {
                i3 = this.g;
            } else {
                i3 = DXWidgetNode.DXMeasureSpec.b(i2);
            }
        }
        setMeasuredDimension(DXWidgetNode.resolveSize(i6, i), DXWidgetNode.resolveSize(i3, i2));
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXPAGEINDICATOR_DISPLAYTYPE) {
            this.f7446a = i;
        } else if (j == DX_PAGE_INDICATOR_ON_COLOR) {
            this.b = i;
        } else if (j == DX_PAGE_INDICATOR_OFF_COLOR) {
            this.c = i;
        } else if (j == DX_PAGE_INDICATOR_PAGE_COUNT) {
            this.e = i;
        } else if (j == DX_PAGE_INDICATOR_HIDES_FOR_SINGLE_PAGE) {
            if (i == 0) {
                z = false;
            }
            this.f = z;
        } else if (j == DXPAGEINDICATOR_ITEMMARGIN) {
            this.h = i;
        } else if (j == DXPAGEINDICATOR_ITEMROUNDDIAMETER) {
            this.g = i;
        } else if (j == DXPAGEINDICATOR_ITEMSELECTEDBORDERCOLOR) {
            this.k = i;
        } else if (j == DXPAGEINDICATOR_ITEMSELECTEDBORDERWIDTH) {
            this.l = i;
        } else if (j == DXPAGEINDICATOR_ITEMUNSELECTEDBORDERCOLOR) {
            this.m = i;
        } else if (j == DXPAGEINDICATOR_ITEMUNSELECTEDBORDERWIDTH) {
            this.n = i;
        } else if (j == DXPAGEINDICATOR_MAXDISPLAYCOUNT) {
            this.i = i;
        } else if (j == DXPAGEINDICATOR_UPDATEIMMEDIATELY) {
            if (i == 0) {
                z = false;
            }
            this.o = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e358e989", new Object[]{this})).booleanValue();
        }
        if (this.f7446a == 1) {
            return true;
        }
        return false;
    }

    public void u(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4b7b827", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        n nVar = (n) getDXRuntimeContext().W();
        if (!t() && getDefaultValueForIntAttr(DXPAGEINDICATOR_MAXDISPLAYCOUNT) == 1 && this.i != 0) {
            DXNativeBouncePageIndicator dXNativeBouncePageIndicator = (DXNativeBouncePageIndicator) view;
            dXNativeBouncePageIndicator.setItemRoundDiameter(nVar.g);
            dXNativeBouncePageIndicator.setItemMargin(nVar.h);
            dXNativeBouncePageIndicator.setItemSelectedBorderWidth(nVar.l);
            dXNativeBouncePageIndicator.setItemSelectedBorderColor(nVar.k);
            dXNativeBouncePageIndicator.setItemUnSelectedBorderWidth(nVar.n);
            dXNativeBouncePageIndicator.setItemUnSelectedBorderColor(nVar.m);
            int tryFetchDarkModeColor = tryFetchDarkModeColor("onColor", 1, nVar.b);
            int tryFetchDarkModeColor2 = tryFetchDarkModeColor("offColor", 1, nVar.c);
            dXNativeBouncePageIndicator.setSelectedDrawable(tryFetchDarkModeColor);
            dXNativeBouncePageIndicator.setUnselectedDrawable(tryFetchDarkModeColor2);
            dXNativeBouncePageIndicator.setMaxDisplayCount(nVar.i);
            if ((!nVar.f || nVar.e != 1) && (i2 = nVar.e) > 0) {
                this.d = nVar.d;
                dXNativeBouncePageIndicator.addChildViews(i2, nVar.d);
                return;
            }
            dXNativeBouncePageIndicator.addChildViews(0, 0);
        } else if (view instanceof DXNativeProgressIndicator) {
            this.d = nVar.d;
            DXNativeProgressIndicator dXNativeProgressIndicator = (DXNativeProgressIndicator) view;
            dXNativeProgressIndicator.setSectionDuration(this.j);
            dXNativeProgressIndicator.setSectionCount(nVar.e);
            int tryFetchDarkModeColor3 = tryFetchDarkModeColor("onColor", 1, nVar.b);
            int tryFetchDarkModeColor4 = tryFetchDarkModeColor("offColor", 1, nVar.c);
            dXNativeProgressIndicator.setIndicatorColor(tryFetchDarkModeColor3);
            dXNativeProgressIndicator.setItemMargin(this.h);
            dXNativeProgressIndicator.setBackgroundColor(tryFetchDarkModeColor4);
            dXNativeProgressIndicator.prepare();
            dXNativeProgressIndicator.initIndex(this.d);
        } else {
            DXNativePageIndicator dXNativePageIndicator = (DXNativePageIndicator) view;
            dXNativePageIndicator.setItemRoundDiameter(nVar.g);
            dXNativePageIndicator.setItemMargin(nVar.h);
            dXNativePageIndicator.setItemSelectedBorderWidth(nVar.l);
            dXNativePageIndicator.setItemSelectedBorderColor(nVar.k);
            dXNativePageIndicator.setItemUnSelectedBorderWidth(nVar.n);
            dXNativePageIndicator.setItemUnSelectedBorderColor(nVar.m);
            dXNativePageIndicator.setLineDisplayType(t());
            dXNativePageIndicator.setItemLineDisplayTypeSize(nVar.e, nVar.getMeasuredWidth(), nVar.getMeasuredHeight());
            int tryFetchDarkModeColor5 = tryFetchDarkModeColor("onColor", 1, nVar.b);
            int tryFetchDarkModeColor6 = tryFetchDarkModeColor("offColor", 1, nVar.c);
            dXNativePageIndicator.setSelectedDrawable(tryFetchDarkModeColor5);
            dXNativePageIndicator.setUnselectedDrawable(tryFetchDarkModeColor6);
            if ((!nVar.f || nVar.e != 1) && (i = nVar.e) > 0) {
                this.d = nVar.d;
                dXNativePageIndicator.addChildViews(i, nVar.d);
                return;
            }
            dXNativePageIndicator.addChildViews(0, 0);
        }
    }
}
