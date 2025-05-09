package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
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
public class tf5 extends j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXCARTNEWTAGFLOWLAYOUT_CARTNEWTAGFLOWLAYOUT = -2807594229855887366L;
    public static final long DXCARTNEWTAGFLOWLAYOUT_LIMITLINES = 4980744156394974500L;
    public static final long DXCARTNEWTAGFLOWLAYOUT_LINESPACE = -1442719518478951523L;
    public static final long DXCARTNEWTAGFLOWLAYOUT_MAXLINES = 4685059187929305417L;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f28682a;
    public int b;
    public int c = Integer.MAX_VALUE;
    public final Map<Integer, List<DXWidgetNode>> d = new HashMap();
    public final Map<String, Integer> e = new HashMap();

    static {
        t2o.a(478151086);
    }

    public static /* synthetic */ Object ipc$super(tf5 tf5Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1456812170) {
            super.onSetMapAttribute(((Number) objArr[0]).longValue(), (JSONObject) objArr[1]);
            return null;
        } else if (hashCode == -740240234) {
            super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == 2119721610) {
            super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/icart/widget/DXCartNewTagFlowLayoutWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new tf5();
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof tf5)) {
            super.onClone(dXWidgetNode, z);
            tf5 tf5Var = (tf5) dXWidgetNode;
            this.f28682a = tf5Var.f28682a;
            this.b = tf5Var.b;
            this.c = tf5Var.c;
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int i6 = i2;
        boolean z2 = this.isEnableButter;
        if (z2) {
            i5 = i;
        } else {
            i5 = 0;
        }
        if (!z2) {
            i6 = 0;
        }
        for (Integer num : ((HashMap) this.d).keySet()) {
            if (num.intValue() <= this.c) {
                List list = (List) ((HashMap) this.d).get(num);
                int i7 = 0;
                for (int i8 = 0; i8 < list.size(); i8++) {
                    DXWidgetNode dXWidgetNode = (DXWidgetNode) list.get(i8);
                    if (dXWidgetNode.getVisibility() == 0) {
                        int marginLeft = dXWidgetNode.getMarginLeft();
                        int marginRight = dXWidgetNode.getMarginRight();
                        int measuredWidth = dXWidgetNode.getMeasuredWidth();
                        int measuredHeight = dXWidgetNode.getMeasuredHeight();
                        if (i8 == 0) {
                            if (this.isEnableButter) {
                                i5 = i;
                            } else {
                                i5 = 0;
                            }
                        }
                        dXWidgetNode.layout(i5, i6, i5 + marginLeft + measuredWidth + marginRight, i6 + measuredHeight);
                        i5 += marginLeft + measuredWidth + marginRight;
                        i7 = Math.max(measuredHeight, i7);
                    }
                }
                i6 = i6 + i7 + this.b;
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
        int i7;
        DXWidgetNode dXWidgetNode;
        String str;
        int i8;
        int i9;
        int i10;
        int i11 = 2;
        int i12 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ((HashMap) this.d).clear();
        ((HashMap) this.e).clear();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int childrenCount = getChildrenCount();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1;
        while (true) {
            if (i15 >= childrenCount) {
                i3 = i13;
                i4 = i17;
                break;
            }
            DXWidgetNode childAt = getChildAt(i15);
            String userId = childAt.getUserId();
            if (!u(userId)) {
                childAt.setVisibility(i11);
            }
            if (childAt.getVisibility() != 0) {
                i6 = i13;
                i7 = i14;
                i5 = i15;
            } else {
                i6 = i13;
                i7 = i14;
                i5 = i15;
                measureChildWithMargins(childAt, i, 0, i2, 0);
                i14 = childAt.getMeasuredWidth() + childAt.getMarginLeft() + childAt.getMarginRight();
                int measuredHeight = childAt.getMeasuredHeight() + childAt.getMarginTop() + childAt.getMarginBottom();
                int i19 = i7 + i14;
                if (i19 > size) {
                    if (!TextUtils.isEmpty(userId)) {
                        HashMap hashMap = (HashMap) this.e;
                        str = userId;
                        if (hashMap.containsKey(str)) {
                            i10 = ((Integer) ((HashMap) this.e).get(str)).intValue() + i12;
                        } else {
                            i10 = 1;
                        }
                        hashMap.put(str, Integer.valueOf(i10));
                    } else {
                        str = userId;
                    }
                    if (!u(str)) {
                        childAt.setVisibility(2);
                    } else {
                        dXWidgetNode = childAt;
                        i8 = i18 + 1;
                        if (i8 > this.c) {
                            dXWidgetNode.setVisibility(2);
                        }
                        i17 = Math.max(i7, i14);
                        if (i8 > this.c) {
                            i4 = i17;
                            i3 = i6;
                            break;
                        }
                        i16 += i6;
                    }
                } else {
                    str = userId;
                    dXWidgetNode = childAt;
                    measuredHeight = Math.max(i6, measuredHeight);
                    i14 = i19;
                    i8 = i18;
                }
                HashMap hashMap2 = (HashMap) this.e;
                if (hashMap2.containsKey(str)) {
                    i9 = ((Integer) ((HashMap) this.e).get(str)).intValue();
                } else {
                    i9 = 1;
                }
                hashMap2.put(str, Integer.valueOf(i9));
                t(dXWidgetNode, i8);
                i13 = measuredHeight;
                i18 = i8;
                i15 = i5 + 1;
                i11 = 2;
                i12 = 1;
            }
            i14 = i7;
            i13 = i6;
            i15 = i5 + 1;
            i11 = 2;
            i12 = 1;
        }
        int max = Math.max(i4, i14);
        int i20 = i16 + i3;
        for (Integer num : ((HashMap) this.d).keySet()) {
            if (num.intValue() < ((HashMap) this.d).keySet().size()) {
                i20 += this.b;
            }
        }
        if (mode != 1073741824) {
            size = max;
        }
        if (mode2 != 1073741824) {
            size2 = i20;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == -1442719518478951523L) {
            this.b = i;
        } else if (j == 4685059187929305417L) {
            this.c = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92acf76", new Object[]{this, new Long(j), jSONObject});
        } else if (j == DXCARTNEWTAGFLOWLAYOUT_LIMITLINES) {
            this.f28682a = jSONObject;
        } else {
            super.onSetMapAttribute(j, jSONObject);
        }
    }

    public final void t(DXWidgetNode dXWidgetNode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fd8e6a1", new Object[]{this, dXWidgetNode, new Integer(i)});
        } else if (dXWidgetNode != null && dXWidgetNode.getVisibility() == 0 && i <= this.c) {
            List list = (List) ((HashMap) this.d).get(Integer.valueOf(i));
            if (list == null) {
                list = new ArrayList();
                ((HashMap) this.d).put(Integer.valueOf(i), list);
            }
            list.add(dXWidgetNode);
            ((HashMap) this.d).put(Integer.valueOf(i), list);
        }
    }

    public final boolean u(String str) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19c07be7", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (((HashMap) this.e).containsKey(str)) {
            i = ((Integer) ((HashMap) this.e).get(str)).intValue();
        } else {
            i = 0;
        }
        if (!this.f28682a.containsKey(str) || i <= this.f28682a.getInteger(str).intValue()) {
            return true;
        }
        return false;
    }
}
