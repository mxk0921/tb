package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.CompoundButton;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXSwitchEvent;
import com.taobao.android.dinamicx.view.DXNativeSwitch;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.taobao.R;
import tb.gt9;
import tb.qu5;
import tb.qub;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DXSwitchWidgetNode extends DXWidgetNode implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int OFF = 0;
    public static final int ON = 1;
    public static final int e = R.id.dx_switch_background_on_color;
    public static final int f = R.id.dx_switch_background_off_color;
    public int c;

    /* renamed from: a  reason: collision with root package name */
    public int f7403a = gt9.COLOR_UNFOLLOW_DEFAULT;
    public int b = -1710619;
    public boolean d = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597392);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new DXSwitchWidgetNode();
        }
    }

    static {
        t2o.a(444597390);
    }

    public DXSwitchWidgetNode() {
        setAccessibility(1);
    }

    public static /* synthetic */ Object ipc$super(DXSwitchWidgetNode dXSwitchWidgetNode, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -740240234) {
            super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == 2119721610) {
            super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamicx/widget/DXSwitchWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new DXSwitchWidgetNode();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else if (view != null && (view instanceof DXNativeSwitch) && j == 5288679823228297259L) {
            ((DXNativeSwitch) view).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.taobao.android.dinamicx.widget.DXSwitchWidgetNode.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d2d88ae", new Object[]{this, compoundButton, new Boolean(z)});
                    } else if (!DXSwitchWidgetNode.this.d) {
                        DXSwitchEvent dXSwitchEvent = new DXSwitchEvent(5288679823228297259L);
                        dXSwitchEvent.setOn(z);
                        DXSwitchWidgetNode.this.postEvent(dXSwitchEvent);
                    }
                }
            });
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (dXWidgetNode instanceof DXSwitchWidgetNode) {
            DXSwitchWidgetNode dXSwitchWidgetNode = (DXSwitchWidgetNode) dXWidgetNode;
            this.c = dXSwitchWidgetNode.c;
            this.b = dXSwitchWidgetNode.b;
            this.f7403a = dXSwitchWidgetNode.f7403a;
            this.d = dXSwitchWidgetNode.d;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new DXNativeSwitch(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        boolean z2 = true;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int a2 = DXWidgetNode.DXMeasureSpec.a(i);
        int a3 = DXWidgetNode.DXMeasureSpec.a(i2);
        if (a2 == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        if (a3 != 1073741824) {
            z2 = false;
        }
        if (z) {
            i3 = DXWidgetNode.DXMeasureSpec.b(i);
        } else {
            i3 = 0;
        }
        if (z2) {
            i4 = DXWidgetNode.DXMeasureSpec.b(i2);
        }
        setMeasuredDimension(i3, i4);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (n.DX_PAGE_INDICATOR_ON_COLOR == j) {
            this.f7403a = i;
        } else if (n.DX_PAGE_INDICATOR_OFF_COLOR == j) {
            this.b = i;
        } else if (6477083193262386775L == j) {
            this.c = i;
        } else {
            super.onSetIntAttribute(j, i);
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

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean supportReuse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("562c49f0", new Object[]{this})).booleanValue();
        }
        if (getClass() == DXSwitchWidgetNode.class) {
            return true;
        }
        return false;
    }

    public final StateListDrawable t(Drawable drawable, Drawable drawable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StateListDrawable) ipChange.ipc$dispatch("e174db35", new Object[]{this, drawable, drawable2});
        }
        return qu5.b(drawable, drawable2, qu5.STATE_CHECKED);
    }

    public final GradientDrawable v(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GradientDrawable) ipChange.ipc$dispatch("9f472ef0", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        return qu5.c(0, 16777215, i2 / 2, i, i2, i2);
    }

    public void w(Context context, DXNativeSwitch dXNativeSwitch, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b7336e9", new Object[]{this, context, dXNativeSwitch, new Integer(i)});
            return;
        }
        int i2 = e;
        Object tag = dXNativeSwitch.getTag(i2);
        int i3 = f;
        Object tag2 = dXNativeSwitch.getTag(i3);
        if (tag == null || tag2 == null || ((Integer) tag).intValue() != this.f7403a || ((Integer) tag2).intValue() != this.b) {
            int tryFetchDarkModeColor = tryFetchDarkModeColor("onColor", 1, this.f7403a);
            int tryFetchDarkModeColor2 = tryFetchDarkModeColor("offColor", 1, this.b);
            GradientDrawable u = u(context, i);
            dXNativeSwitch.setTrackDrawable(t(v(tryFetchDarkModeColor, i), v(tryFetchDarkModeColor2, i)));
            dXNativeSwitch.setThumbDrawable(u);
            dXNativeSwitch.setTag(i2, Integer.valueOf(tryFetchDarkModeColor));
            dXNativeSwitch.setTag(i3, Integer.valueOf(tryFetchDarkModeColor2));
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (view != null && (view instanceof DXNativeSwitch)) {
            DXNativeSwitch dXNativeSwitch = (DXNativeSwitch) view;
            dXNativeSwitch.setClickable(true);
            dXNativeSwitch.setTextOn("");
            dXNativeSwitch.setTextOff("");
            dXNativeSwitch.setShowText(false);
            dXNativeSwitch.setThumbTextPadding(0);
            dXNativeSwitch.setSplitTrack(false);
            w(context, dXNativeSwitch, getMeasuredHeight());
            this.d = true;
            if (this.c != 1) {
                z = false;
            }
            dXNativeSwitch.setChecked(z);
            this.d = false;
        }
    }

    public final GradientDrawable u(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GradientDrawable) ipChange.ipc$dispatch("d760010a", new Object[]{this, context, new Integer(i)});
        }
        return qu5.c((int) TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics()), 16777215, i / 2, -1, i, i);
    }
}
