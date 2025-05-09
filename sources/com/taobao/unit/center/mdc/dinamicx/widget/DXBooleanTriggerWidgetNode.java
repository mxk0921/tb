package com.taobao.unit.center.mdc.dinamicx.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.message.kit.threadpool.BaseRunnable;
import com.taobao.message.kit.util.UIHandler;
import com.taobao.taobao.R;
import tb.qub;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DXBooleanTriggerWidgetNode extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXBOOLEANTRIGGER_BOOLEANTRIGGER = -2715384747338651230L;
    public static final long DXBOOLEANTRIGGER_DATA = 33556442494L;
    public static final int DXBOOLEANTRIGGER_DATA_FALSE = 0;
    public static final int DXBOOLEANTRIGGER_DATA_TRUE = 1;
    public static final long DXBOOLEANTRIGGER_DEFALUTDATA = -6928612890232046486L;
    public static final long DXBOOLEANTRIGGER_DELAYTRIGGER = -3030539711189212177L;
    public static final long DXBOOLEANTRIGGER_ONHITDELAY = -8709285748422617861L;
    public static final long DXBOOLEANTRIGGER_ONHITFALSE = -8709276874949405961L;
    public static final long DXBOOLEANTRIGGER_ONHITTRUE = -6553874699928598869L;
    public static final long DXBOOLEANTRIGGER_VISIBLEFILTER = 53126422195207521L;
    private int data = 0;
    private int defalutData = 0;
    private int delayTrigger;
    private String visibleFilter;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Builder implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(552599748);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new DXBooleanTriggerWidgetNode();
        }
    }

    static {
        t2o.a(552599746);
    }

    public static /* synthetic */ String access$000(DXBooleanTriggerWidgetNode dXBooleanTriggerWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d269b6a", new Object[]{dXBooleanTriggerWidgetNode});
        }
        return dXBooleanTriggerWidgetNode.visibleFilter;
    }

    public static /* synthetic */ void access$100(DXBooleanTriggerWidgetNode dXBooleanTriggerWidgetNode, DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7b82c97", new Object[]{dXBooleanTriggerWidgetNode, dXEvent});
        } else {
            dXBooleanTriggerWidgetNode.postMyEvent(dXEvent);
        }
    }

    public static /* synthetic */ int access$200(DXBooleanTriggerWidgetNode dXBooleanTriggerWidgetNode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6d70ebf1", new Object[]{dXBooleanTriggerWidgetNode, str})).intValue();
        }
        return dXBooleanTriggerWidgetNode.convertVisibleInt(str);
    }

    private int convertVisibleInt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e29daeb4", new Object[]{this, str})).intValue();
        }
        str.hashCode();
        if (str.equals("invisible")) {
            return 4;
        }
        if (!str.equals("gone")) {
            return 0;
        }
        return 8;
    }

    private void delayPostAgain(final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8a82fee", new Object[]{this, view});
        } else if (this.delayTrigger > 0) {
            UIHandler.postDelayed(new BaseRunnable() { // from class: com.taobao.unit.center.mdc.dinamicx.widget.DXBooleanTriggerWidgetNode.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/unit/center/mdc/dinamicx/widget/DXBooleanTriggerWidgetNode$1");
                }

                @Override // com.taobao.message.kit.threadpool.BaseRunnable
                public void execute() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e48bb97c", new Object[]{this});
                    } else if (TextUtils.isEmpty(DXBooleanTriggerWidgetNode.access$000(DXBooleanTriggerWidgetNode.this))) {
                        DXBooleanTriggerWidgetNode.access$100(DXBooleanTriggerWidgetNode.this, new DXEvent(DXBooleanTriggerWidgetNode.DXBOOLEANTRIGGER_ONHITDELAY));
                    } else {
                        int visibility = view.getVisibility();
                        DXBooleanTriggerWidgetNode dXBooleanTriggerWidgetNode = DXBooleanTriggerWidgetNode.this;
                        if (visibility == DXBooleanTriggerWidgetNode.access$200(dXBooleanTriggerWidgetNode, DXBooleanTriggerWidgetNode.access$000(dXBooleanTriggerWidgetNode))) {
                            DXBooleanTriggerWidgetNode.access$100(DXBooleanTriggerWidgetNode.this, new DXEvent(DXBooleanTriggerWidgetNode.DXBOOLEANTRIGGER_ONHITDELAY));
                        }
                    }
                }
            }, this.delayTrigger);
        }
    }

    public static /* synthetic */ Object ipc$super(DXBooleanTriggerWidgetNode dXBooleanTriggerWidgetNode, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1814733277:
                return super.onCreateView((Context) objArr[0]);
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/unit/center/mdc/dinamicx/widget/DXBooleanTriggerWidgetNode");
        }
    }

    private void postMyEvent(DXEvent dXEvent) {
        DXWidgetNode dXWidgetNode;
        DXWidgetNode flattenWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6b37017", new Object[]{this, dXEvent});
            return;
        }
        DXRootView L = getDXRuntimeContext().L();
        if (L == null || (flattenWidgetNode = L.getFlattenWidgetNode()) == null) {
            dXWidgetNode = null;
        } else {
            dXWidgetNode = flattenWidgetNode.queryWTByUserId(getUserId());
        }
        if (dXWidgetNode != null) {
            dXWidgetNode.postEvent(dXEvent);
        } else {
            postEvent(dXEvent);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new DXBooleanTriggerWidgetNode();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == 33556442494L) {
            return 0;
        }
        return super.getDefaultValueForIntAttr(j);
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
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof DXBooleanTriggerWidgetNode)) {
            super.onClone(dXWidgetNode, z);
            DXBooleanTriggerWidgetNode dXBooleanTriggerWidgetNode = (DXBooleanTriggerWidgetNode) dXWidgetNode;
            this.data = dXBooleanTriggerWidgetNode.data;
            this.defalutData = dXBooleanTriggerWidgetNode.defalutData;
            this.delayTrigger = dXBooleanTriggerWidgetNode.delayTrigger;
            this.visibleFilter = dXBooleanTriggerWidgetNode.visibleFilter;
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
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (view != null) {
            int i = R.id.dx_boolean_trigger_state_ref;
            Integer num = (Integer) view.getTag(i);
            if (num == null) {
                num = Integer.valueOf(this.defalutData);
            }
            int intValue = num.intValue();
            int i2 = this.data;
            if (intValue != i2) {
                view.setTag(i, Integer.valueOf(i2));
                int i3 = this.data;
                if (i3 == 1) {
                    postEvent(new DXEvent(DXBOOLEANTRIGGER_ONHITTRUE));
                    delayPostAgain(view);
                } else if (i3 == 0) {
                    postEvent(new DXEvent(DXBOOLEANTRIGGER_ONHITFALSE));
                    delayPostAgain(view);
                }
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == 33556442494L) {
            this.data = i;
        } else if (j == DXBOOLEANTRIGGER_DEFALUTDATA) {
            this.defalutData = i;
        } else if (j == DXBOOLEANTRIGGER_DELAYTRIGGER) {
            this.delayTrigger = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXBOOLEANTRIGGER_VISIBLEFILTER) {
            this.visibleFilter = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }
}
