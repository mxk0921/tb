package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeFrameLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.j;
import com.taobao.tao.Globals;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vf5 extends j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXCARTPRICEFLOWLAYOUT_CARTPRICEFLOWLAYOUT = -4522183021858442330L;
    public static final long DXCARTPRICEFLOWLAYOUT_FONTSIZESET = 4704851875127321993L;
    public static final long DXCARTPRICEFLOWLAYOUT_LINESPACE = -1442719518478951523L;
    public static final long DXCARTPRICEFLOWLAYOUT_MAXLINES = 4685059187929305417L;
    public static final JSONObject e;
    public int b;
    public int c = Integer.MAX_VALUE;
    public final Map<Integer, List<DXWidgetNode>> d = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f29979a = e;

    public static /* synthetic */ Object ipc$super(vf5 vf5Var, String str, Object... objArr) {
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/icart/widget/DXCartPriceFlowLayoutWidgetNode");
        }
    }

    public static JSONObject u(JSONObject jSONObject, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("78504cc3", new Object[]{jSONObject, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Float(f5), new Float(f6), new Float(f7)});
        }
        jSONObject.put("mainPriceSize", (Object) Float.valueOf(f));
        jSONObject.put("mainPriceSymbolScale", (Object) Float.valueOf(f2));
        jSONObject.put("mainPriceDecimalScale", (Object) Float.valueOf(f3));
        jSONObject.put("couponDiscountedPriceSize", (Object) Float.valueOf(f4));
        jSONObject.put("couponDiscountedPriceSymbolScale", (Object) Float.valueOf(f5));
        jSONObject.put("couponDiscountedPriceDecimalScale", (Object) Float.valueOf(f6));
        jSONObject.put("couponDiscountedTitlePrefixSize", (Object) Float.valueOf(f7));
        return jSONObject;
    }

    public final float A(JSONObject jSONObject, String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf4d2ccc", new Object[]{this, jSONObject, str, new Float(f)})).floatValue();
        }
        if (!jSONObject.containsKey(str)) {
            return f;
        }
        try {
            return jSONObject.getFloat(str).floatValue();
        } catch (Exception unused) {
            return f;
        }
    }

    public final float B(JSONObject jSONObject, String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d0a46254", new Object[]{this, jSONObject, str, new Float(f)})).floatValue();
        }
        float A = A(jSONObject, str, 0.0f);
        kmb w = w();
        if (w != null) {
            if (A == 0.0f) {
                return f;
            }
            return w.e().d0(A);
        } else if (A == 0.0f) {
            return f;
        } else {
            return pb6.c(Globals.getApplication(), A);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new vf5();
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode instanceof vf5) {
            super.onClone(dXWidgetNode, z);
            vf5 vf5Var = (vf5) dXWidgetNode;
            this.f29979a = vf5Var.f29979a;
            this.b = vf5Var.b;
            this.c = vf5Var.c;
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
        } else if (j == DXCARTPRICEFLOWLAYOUT_FONTSIZESET) {
            this.f29979a = jSONObject;
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

    public final void v(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a97a88ee", new Object[]{this, obj});
        } else if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            g2s g2sVar = (g2s) queryWidgetNodeByUserId("mainPrice");
            if (x(g2sVar)) {
                g2sVar.setTextSize(B(jSONObject, "mainPriceSize", g2sVar.getTextSize()));
                g2sVar.y(A(jSONObject, "mainPriceSymbolScale", g2sVar.w()));
                g2sVar.x(A(jSONObject, "mainPriceDecimalScale", g2sVar.u()));
            }
            cx5 cx5Var = (cx5) queryWidgetNodeByUserId("couponDiscountedTitlePrefix");
            if (x(cx5Var)) {
                cx5Var.setTextSize(B(jSONObject, "couponDiscountedTitlePrefixSize", cx5Var.getTextSize()));
            }
            g2s g2sVar2 = (g2s) queryWidgetNodeByUserId("couponDiscountedPrice");
            if (x(g2sVar2)) {
                g2sVar2.setTextSize(B(jSONObject, "couponDiscountedPriceSize", g2sVar2.getTextSize()));
                g2sVar2.y(A(jSONObject, "couponDiscountedPriceSymbolScale", g2sVar2.w()));
                g2sVar2.x(A(jSONObject, "couponDiscountedPriceDecimalScale", g2sVar2.u()));
            }
        }
    }

    public final kmb w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("5d2c502", new Object[]{this});
        }
        kmb b = yn2.b(getDXRuntimeContext());
        if (b != null) {
            return b;
        }
        hav.b(c9x.CART_BIZ_NAME, "CartPriceFlowLayout", "cartPresenter is null");
        return null;
    }

    public final boolean x(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc1de15f", new Object[]{this, dXWidgetNode})).booleanValue();
        }
        if (dXWidgetNode == null || dXWidgetNode.getVisibility() == 2 || dXWidgetNode.getVisibility() == 1) {
            return false;
        }
        return true;
    }

    public final boolean y(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        DXWidgetNode dXWidgetNode;
        int i12;
        int i13 = i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee4422e9", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i13), new Integer(i6), new Boolean(z)})).booleanValue();
        }
        ((HashMap) this.d).clear();
        int childrenCount = getChildrenCount();
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            if (i16 >= childrenCount) {
                i7 = i14;
                i8 = i19;
                break;
            }
            DXWidgetNode childAt = getChildAt(i16);
            if (childAt.getVisibility() != 0) {
                i11 = i16;
                i10 = childrenCount;
            } else {
                i11 = i16;
                i10 = childrenCount;
                measureChildWithMargins(childAt, i, 0, i2, 0);
                i15 = childAt.getMeasuredWidth() + childAt.getMarginLeft() + childAt.getMarginRight();
                int measuredHeight = childAt.getMeasuredHeight() + childAt.getMarginTop() + childAt.getMarginBottom();
                int i20 = i15 + i15;
                if (i20 <= i13) {
                    dXWidgetNode = childAt;
                    measuredHeight = Math.max(i14, measuredHeight);
                    i15 = i20;
                    i12 = i17;
                } else if (!z) {
                    return false;
                } else {
                    i12 = i17 + 1;
                    if (i12 > this.c) {
                        dXWidgetNode = childAt;
                        dXWidgetNode.setVisibility(2);
                    } else {
                        dXWidgetNode = childAt;
                    }
                    i19 = Math.max(i15, i15);
                    if (i12 > this.c) {
                        i8 = i19;
                        i7 = i14;
                        break;
                    }
                    i18 += i14;
                }
                t(dXWidgetNode, i12);
                i14 = measuredHeight;
                i17 = i12;
            }
            i16 = i11 + 1;
            childrenCount = i10;
        }
        int max = Math.max(i8, i15);
        int i21 = i18 + i7;
        for (Integer num : ((HashMap) this.d).keySet()) {
            if (num.intValue() < ((HashMap) this.d).keySet().size()) {
                i21 += this.b;
            }
        }
        if (i3 != 1073741824) {
            i13 = max;
        }
        if (i4 == 1073741824) {
            i9 = i6;
        } else {
            i9 = i21;
        }
        setMeasuredDimension(i13, i9);
        return true;
    }

    public final boolean z() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9c54a91", new Object[]{this})).booleanValue();
        }
        DXWidgetNode queryWidgetNodeByUserId = queryWidgetNodeByUserId("nowTitlePrepend");
        return ((queryWidgetNodeByUserId != null && queryWidgetNodeByUserId.getVisibility() != 2) || (jSONObject = this.f29979a) == null || jSONObject.size() == 0) ? false : true;
    }

    static {
        t2o.a(478151088);
        JSONObject jSONObject = new JSONObject();
        e = jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("sizeLevel_".concat("1"), (Object) u(jSONObject2, 20.0f, 0.72f, 0.72f, 15.0f, 0.688f, 0.688f, 11.0f));
        jSONObject.put("sizeLevel_".concat("2"), (Object) u(new JSONObject(), 14.0f, 0.714f, 0.714f, 14.0f, 0.714f, 0.714f, 10.0f));
        jSONObject.put("sizeLevel_".concat("3"), (Object) u(new JSONObject(), 13.0f, 0.769f, 0.769f, 11.0f, 0.909f, 0.909f, 10.0f));
        jSONObject.put("sizeLevel_".concat("4"), (Object) jSONObject2);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ((HashMap) this.d).clear();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (z()) {
            int i3 = 0;
            while (i3 < this.f29979a.size()) {
                int i4 = i3 + 1;
                v(this.f29979a.get("sizeLevel_".concat(String.valueOf(i4))));
                if (!y(i, i2, mode, mode2, size, size2, i3 == this.f29979a.size() - 1)) {
                    i3 = i4;
                } else {
                    return;
                }
            }
            requestLayout();
        }
        y(i, i2, mode, mode2, size, size2, true);
    }
}
