package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeFrameLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class of5 extends j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXALIFLOWLAYOUT_ALIFLOWLAYOUT = -1154450094495690322L;
    public static final long DXCARTFLOWLAYOUT_LINESPACE = -1442719518478951523L;
    public static final long DXCARTFLOWLAYOUT_MAXLINES = 4685059187929305417L;
    public static final boolean d = vav.a(c9x.CART_BIZ_NAME, "disableCartFlowFlat", false);

    /* renamed from: a  reason: collision with root package name */
    public int f25347a;
    public int b = Integer.MAX_VALUE;
    public final Map<Integer, List<DXWidgetNode>> c = new HashMap();

    static {
        t2o.a(478151076);
    }

    public static /* synthetic */ Object ipc$super(of5 of5Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -740240234) {
            super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == -634587146) {
            return new Boolean(super.checkLayoutFlat());
        } else {
            if (hashCode == 2119721610) {
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/icart/widget/DXCartFlowLayoutWidgetNode");
        }
    }

    public final boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bca80604", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i < 6 || i > 8) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new of5();
    }

    @Override // com.taobao.android.dinamicx.widget.j
    public boolean checkLayoutFlat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da2cf7f6", new Object[]{this})).booleanValue();
        }
        if (d) {
            return false;
        }
        return super.checkLayoutFlat();
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof of5)) {
            super.onClone(dXWidgetNode, z);
            of5 of5Var = (of5) dXWidgetNode;
            this.f25347a = of5Var.f25347a;
            this.b = of5Var.b;
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
        int i5;
        int i6;
        int i7 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int i8 = i2;
        if (!this.isEnableButter) {
            i8 = 0;
        }
        for (Integer num : ((HashMap) this.c).keySet()) {
            if (num.intValue() <= this.b) {
                if (this.isEnableButter) {
                    i5 = i;
                } else {
                    i5 = 0;
                }
                List list = (List) ((HashMap) this.c).get(num);
                int i9 = 0;
                int i10 = 0;
                while (i9 < list.size()) {
                    DXWidgetNode dXWidgetNode = (DXWidgetNode) list.get(i9);
                    int layoutGravity = dXWidgetNode.getLayoutGravity();
                    if (dXWidgetNode.getVisibility() == 0) {
                        if (!v(dXWidgetNode) || !(i9 == 0 || i9 == list.size() - i7)) {
                            int marginLeft = dXWidgetNode.getMarginLeft();
                            int marginRight = dXWidgetNode.getMarginRight();
                            int measuredWidth = dXWidgetNode.getMeasuredWidth();
                            int measuredHeight = dXWidgetNode.getMeasuredHeight();
                            i10 = Math.max(measuredHeight, i10);
                            if (a(layoutGravity)) {
                                i5 = getMeasuredWidth() - ((marginLeft + measuredWidth) + marginRight);
                                if (this.isEnableButter) {
                                    i5 = i + i5;
                                }
                                if (layoutGravity == 7) {
                                    i6 = (i10 - measuredHeight) / 2;
                                } else if (layoutGravity == 8) {
                                    i6 = i10 - measuredHeight;
                                }
                                int i11 = i6 + i8;
                                dXWidgetNode.layout(i5, i11, i5 + marginLeft + measuredWidth + marginRight, measuredHeight + i11);
                                i5 += marginLeft + measuredWidth + marginRight;
                            }
                            i6 = 0;
                            int i112 = i6 + i8;
                            dXWidgetNode.layout(i5, i112, i5 + marginLeft + measuredWidth + marginRight, measuredHeight + i112);
                            i5 += marginLeft + measuredWidth + marginRight;
                        } else {
                            dXWidgetNode.setVisibility(2);
                        }
                    }
                    i9++;
                    i7 = 1;
                }
                i8 = i8 + i10 + this.f25347a;
                i7 = 1;
            } else {
                return;
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        DXWidgetNode dXWidgetNode;
        int i7;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ((HashMap) this.c).clear();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int childrenCount = getChildrenCount();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        while (true) {
            if (i10 >= childrenCount) {
                i3 = i9;
                i4 = i8;
                i5 = i11;
                break;
            }
            DXWidgetNode childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (!v(childAt) || ((HashMap) this.c).get(Integer.valueOf(i13)) != null)) {
                i6 = i10;
                measureChildWithMargins(childAt, i, 0, i2, 0);
                i9 = childAt.getMeasuredWidth() + childAt.getMarginLeft() + childAt.getMarginRight();
                int measuredHeight = childAt.getMeasuredHeight() + childAt.getMarginTop() + childAt.getMarginBottom();
                int layoutGravity = childAt.getLayoutGravity();
                int i14 = i9 + i9;
                if (i14 > size) {
                    i7 = i13 + 1;
                    if (i7 > this.b) {
                        dXWidgetNode = childAt;
                        dXWidgetNode.setVisibility(2);
                    } else {
                        dXWidgetNode = childAt;
                    }
                    i11 = Math.max(i9, i9);
                    if (i7 > this.b) {
                        i3 = i9;
                        i5 = i11;
                        i4 = i8;
                        break;
                    }
                    if (a(layoutGravity)) {
                        i9 = size;
                    }
                    i12 += i8;
                } else {
                    dXWidgetNode = childAt;
                    if (a(layoutGravity)) {
                        i14 = i9 + (size - i9);
                    }
                    measuredHeight = Math.max(i8, measuredHeight);
                    i9 = i14;
                    i7 = i13;
                }
                t(dXWidgetNode, i7);
                i8 = measuredHeight;
                i13 = i7;
            } else {
                i6 = i10;
            }
            i10 = i6 + 1;
        }
        int max = Math.max(i5, i3);
        int i15 = i12 + i4;
        for (Integer num : ((HashMap) this.c).keySet()) {
            if (num.intValue() < ((HashMap) this.c).keySet().size()) {
                i15 += this.f25347a;
            }
        }
        if (mode != 1073741824) {
            size = max;
        }
        if (mode2 != 1073741824) {
            size2 = i15;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == -1442719518478951523L) {
            this.f25347a = i;
        } else if (j == 4685059187929305417L) {
            this.b = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    public final void t(DXWidgetNode dXWidgetNode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fd8e6a1", new Object[]{this, dXWidgetNode, new Integer(i)});
        } else if (dXWidgetNode != null && dXWidgetNode.getVisibility() == 0 && i <= this.b) {
            List list = (List) ((HashMap) this.c).get(Integer.valueOf(i));
            if (list == null) {
                list = new ArrayList();
                ((HashMap) this.c).put(Integer.valueOf(i), list);
            }
            list.add(dXWidgetNode);
            ((HashMap) this.c).put(Integer.valueOf(i), list);
        }
    }

    public final boolean v(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99d43fed", new Object[]{this, dXWidgetNode})).booleanValue();
        }
        return dXWidgetNode instanceof pf5;
    }
}
