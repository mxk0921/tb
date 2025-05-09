package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.j;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class eu5 extends j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXDETAILFLOWLAYOUT_HGAP = 34681438404L;
    public static final long DXDETAILFLOWLAYOUT_MAXLINES = 4685059187929305417L;
    public static final long DXDETAILFLOWLAYOUT_VGAP = 38721391538L;
    public static final long DX_EVENT_ID;
    public static final long VIEW_IDENTITY;

    /* renamed from: a  reason: collision with root package name */
    public int f18816a;
    public int b;
    public int c;
    public final List<List<DXWidgetNode>> d = new ArrayList();
    public final List<Integer> e = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912262676);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new eu5();
        }
    }

    static {
        t2o.a(912262675);
        long a2 = k06.a("DetailFlowLayout");
        DX_EVENT_ID = a2;
        VIEW_IDENTITY = a2;
    }

    public static /* synthetic */ Object ipc$super(eu5 eu5Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1814733277:
                return super.onCreateView((Context) objArr[0]);
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/transfer/widget/DXDetailFlowLayoutWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new eu5();
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

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof eu5)) {
            super.onClone(dXWidgetNode, z);
            eu5 eu5Var = (eu5) dXWidgetNode;
            this.f18816a = eu5Var.f18816a;
            this.b = eu5Var.b;
            this.c = eu5Var.c;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return super.onCreateView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int size = ((ArrayList) this.d).size();
        for (int i5 = 0; i5 < size; i5++) {
            int intValue = ((Integer) ((ArrayList) this.e).get(i5)).intValue();
            List list = (List) ((ArrayList) this.d).get(i5);
            int size2 = list.size();
            for (int i6 = 0; i6 < size2; i6++) {
                DXWidgetNode dXWidgetNode = (DXWidgetNode) list.get(i6);
                int marginLeft = dXWidgetNode.getMarginLeft() + paddingLeft;
                if (i6 > 0) {
                    marginLeft += this.f18816a;
                }
                int marginTop = dXWidgetNode.getMarginTop() + paddingTop;
                dXWidgetNode.layout(marginLeft, marginTop, dXWidgetNode.getMeasuredWidth() + marginLeft, dXWidgetNode.getMeasuredHeight() + marginTop);
                paddingLeft += dXWidgetNode.getMeasuredWidth() + dXWidgetNode.getMarginLeft() + dXWidgetNode.getMarginRight();
                if (i6 > 0) {
                    paddingLeft += this.f18816a;
                }
            }
            paddingLeft = getPaddingLeft();
            paddingTop = paddingTop + intValue + this.c;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ((ArrayList) this.d).clear();
        ((ArrayList) this.e).clear();
        int b = (DXWidgetNode.DXMeasureSpec.b(i) - getPaddingLeft()) - getPaddingRight();
        int paddingLeft = (0 - getPaddingLeft()) - getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        ArrayList arrayList = new ArrayList();
        int childrenCount = getChildrenCount();
        int i6 = paddingLeft;
        int i7 = paddingTop;
        ArrayList arrayList2 = arrayList;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= childrenCount) {
                i3 = i8;
                i4 = i9;
                break;
            }
            DXWidgetNode childAt = getChildAt(i10);
            i4 = i9;
            measureChildWithMargins(childAt, i, 0, i2, 0);
            int measuredWidth = childAt.getMeasuredWidth() + childAt.getMarginLeft() + childAt.getMarginRight();
            int measuredHeight = childAt.getMeasuredHeight() + childAt.getMarginTop() + childAt.getMarginBottom() + 8;
            int i11 = i4 + measuredWidth;
            if (i11 > b) {
                ((ArrayList) this.e).add(Integer.valueOf(i8));
                ((ArrayList) this.d).add(arrayList2);
                i6 = Math.max(i4, b);
                i7 += i8;
                if (((ArrayList) this.d).size() == this.b) {
                    for (int i12 = childrenCount - 1; i12 >= i10; i12--) {
                        getChildAt(i12).setMeasuredDimension(0, 0);
                    }
                    arrayList2 = new ArrayList();
                    i3 = i8;
                } else {
                    i5 = i10;
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(childAt);
                    arrayList2 = arrayList3;
                }
            } else {
                i5 = i10;
                int max = Math.max(i8, measuredHeight);
                arrayList2.add(childAt);
                measuredHeight = max;
                measuredWidth = i11;
            }
            i9 = this.f18816a + measuredWidth;
            i10 = i5 + 1;
            i8 = measuredHeight;
        }
        if (!arrayList2.isEmpty()) {
            ((ArrayList) this.e).add(Integer.valueOf(i3));
            ((ArrayList) this.d).add(arrayList2);
            i6 = Math.max(i4, b);
            i7 += i3;
        }
        if (((ArrayList) this.d).size() > 0) {
            i7 += (((ArrayList) this.d).size() - 1) * this.f18816a;
        }
        setMeasuredDimension(i6, i7);
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else {
            super.onRenderView(context, view);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXDETAILFLOWLAYOUT_HGAP) {
            this.f18816a = i;
        } else if (j == 4685059187929305417L) {
            this.b = i;
        } else if (j == DXDETAILFLOWLAYOUT_VGAP) {
            this.c = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }
}
