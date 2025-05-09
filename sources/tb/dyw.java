package tb;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeFrameLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.j;
import com.taobao.android.sku.utils.SkuLogUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dyw extends j {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long DX_WIDGET_ID = k06.a("WaterfallLayout");

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, List<DXWidgetNode>> f18166a = new LinkedHashMap();
    public final Map<Integer, Integer> b = new LinkedHashMap();

    static {
        t2o.a(442499189);
    }

    public static /* synthetic */ Object ipc$super(dyw dywVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1775895211) {
            super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
            return null;
        } else if (hashCode == -303753557) {
            super.onRenderView((Context) objArr[0], (View) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/sku/dinamicx/widget/WaterfallLayout");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        if (cjz.a()) {
            SkuLogUtils.x("WaterfallLayout.build");
        }
        return new dyw();
    }

    public Object clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("78b3604e", new Object[]{this});
        }
        return super.clone();
    }

    @Override // com.taobao.android.dinamicx.widget.j
    public ViewGroup.LayoutParams generateLayoutParams(q26 q26Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("193cd1a2", new Object[]{this, q26Var});
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(q26Var.f26456a, q26Var.b);
        layoutParams.gravity = q26Var.c;
        return layoutParams;
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
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new DXNativeFrameLayout(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            t(i, i2, i3, i4);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            u(i, i2);
        }
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

    public void u(int i, int i2) {
        int i3;
        int i4;
        int i5 = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9106d7b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        ((LinkedHashMap) this.f18166a).clear();
        ((LinkedHashMap) this.b).clear();
        int virtualChildCount = getVirtualChildCount();
        ArrayList arrayList = new ArrayList();
        this.b.put(0, 0);
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i8 < virtualChildCount) {
            DXWidgetNode childAt = getChildAt(i8);
            if (childAt == null || childAt.getVisibility() == i5) {
                i6 = i6;
                i7 = i7;
            } else {
                measureChildWithMargins(childAt, i, 0, i2, 0);
                int measuredWidth = childAt.getMeasuredWidth() + childAt.getMarginLeft() + childAt.getMarginRight();
                int measuredHeight = childAt.getMeasuredHeight() + childAt.getMarginTop() + childAt.getMarginBottom();
                if (measuredWidth > size) {
                    i3 = measuredWidth;
                    measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, mode), 0, i2, 0);
                    i4 = measuredHeight;
                } else {
                    i3 = measuredWidth;
                    i4 = measuredHeight;
                }
                int max = Math.max(i4, i6);
                i7 += i3;
                if (i7 > size) {
                    int i12 = i10 + 1;
                    this.f18166a.put(Integer.valueOf(i10), new ArrayList(arrayList));
                    this.b.put(Integer.valueOf(i12), Integer.valueOf(max));
                    arrayList.clear();
                    arrayList.add(childAt);
                    i11 += max;
                    i6 = max;
                    i10 = i12;
                    i9 = size;
                    i7 = i3;
                } else {
                    arrayList.add(childAt);
                    i6 = max;
                }
            }
            i8++;
            i5 = 2;
        }
        if (i9 == 0) {
            i9 = Math.min(i7, size);
        }
        if (!arrayList.isEmpty()) {
            this.f18166a.put(Integer.valueOf(i10), new ArrayList(arrayList));
            this.b.put(Integer.valueOf(i10 + 1), Integer.valueOf(i6));
            arrayList.clear();
            i11 += i6;
        }
        setMeasuredDimension(DXWidgetNode.resolveSize(Math.max(i9 + getPaddingLeftWithDirection() + getPaddingRightWithDirection(), getSuggestedMinimumWidth()), i), DXWidgetNode.resolveSize(Math.max(i11 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2));
    }

    @Override // com.taobao.android.dinamicx.widget.j
    public ViewGroup.LayoutParams generateLayoutParams(q26 q26Var, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("3d0366b5", new Object[]{this, q26Var, layoutParams});
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = q26Var.c;
        }
        layoutParams.width = q26Var.f26456a;
        layoutParams.height = q26Var.b;
        return layoutParams;
    }

    public void t(int i, int i2, int i3, int i4) {
        int i5 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cc0d6cf", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        for (Map.Entry entry : ((LinkedHashMap) this.f18166a).entrySet()) {
            if (entry == null) {
                Log.e("WaterfallLayout", "null rowChildren entry");
            } else {
                List<DXWidgetNode> list = (List) entry.getValue();
                if (list == null || list.isEmpty()) {
                    Log.e("WaterfallLayout", "null or empty rowChildren value");
                } else {
                    Integer num = (Integer) ((LinkedHashMap) this.b).get(entry.getKey());
                    if (num != null) {
                        i5 += num.intValue();
                    }
                    int paddingLeftWithDirection = getPaddingLeftWithDirection();
                    int paddingTop = getPaddingTop();
                    for (DXWidgetNode dXWidgetNode : list) {
                        if (dXWidgetNode.getVisibility() != 2) {
                            int measuredWidth = dXWidgetNode.getMeasuredWidth();
                            int measuredHeight = dXWidgetNode.getMeasuredHeight();
                            int leftMarginWithDirection = paddingLeftWithDirection + dXWidgetNode.getLeftMarginWithDirection();
                            int marginTop = paddingTop + i5 + dXWidgetNode.getMarginTop();
                            dXWidgetNode.layout(leftMarginWithDirection, marginTop, leftMarginWithDirection + measuredWidth, measuredHeight + marginTop);
                            paddingLeftWithDirection = leftMarginWithDirection + measuredWidth + dXWidgetNode.getRightMarginWithDirection();
                        }
                    }
                }
            }
        }
    }
}
