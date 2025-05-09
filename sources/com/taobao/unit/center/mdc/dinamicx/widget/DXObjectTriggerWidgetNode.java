package com.taobao.unit.center.mdc.dinamicx.widget;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.qub;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DXObjectTriggerWidgetNode extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXOBJECTTRIGGER_DATA = 33556442494L;
    public static final long DXOBJECTTRIGGER_IGNOREFIRST = -5117848632570300777L;
    public static final int DXOBJECTTRIGGER_IGNOREFIRST_FALSE = 0;
    public static final int DXOBJECTTRIGGER_IGNOREFIRST_TRUE = 1;
    public static final long DXOBJECTTRIGGER_OBJECTTRIGGER = 6254774490434620216L;
    public static final long DXOBJECTTRIGGER_ONDATACHANGED = -6654049759731953906L;
    private Object data;
    private int ignoreFirst;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Builder implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(552599779);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new DXObjectTriggerWidgetNode();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ObjectTriggerView extends View {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Object data = null;
        private boolean isRenderFirst = true;

        static {
            t2o.a(552599780);
        }

        public ObjectTriggerView(Context context) {
            super(context);
        }

        public static /* synthetic */ boolean access$000(ObjectTriggerView objectTriggerView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c151b9cf", new Object[]{objectTriggerView})).booleanValue();
            }
            return objectTriggerView.isRenderFirst;
        }

        public static /* synthetic */ boolean access$002(ObjectTriggerView objectTriggerView, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("86699ab", new Object[]{objectTriggerView, new Boolean(z)})).booleanValue();
            }
            objectTriggerView.isRenderFirst = z;
            return z;
        }

        public static /* synthetic */ Object access$100(ObjectTriggerView objectTriggerView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("9b68f6a6", new Object[]{objectTriggerView});
            }
            return objectTriggerView.data;
        }

        public static /* synthetic */ Object access$102(ObjectTriggerView objectTriggerView, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("d33edd08", new Object[]{objectTriggerView, obj});
            }
            objectTriggerView.data = obj;
            return obj;
        }

        public static /* synthetic */ Object ipc$super(ObjectTriggerView objectTriggerView, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/unit/center/mdc/dinamicx/widget/DXObjectTriggerWidgetNode$ObjectTriggerView");
        }
    }

    static {
        t2o.a(552599778);
    }

    public static /* synthetic */ Object ipc$super(DXObjectTriggerWidgetNode dXObjectTriggerWidgetNode, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1794007282:
                dXObjectTriggerWidgetNode.setObjAttribute(((Number) objArr[0]).longValue(), objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/unit/center/mdc/dinamicx/widget/DXObjectTriggerWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new DXObjectTriggerWidgetNode();
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
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof DXObjectTriggerWidgetNode)) {
            super.onClone(dXWidgetNode, z);
            DXObjectTriggerWidgetNode dXObjectTriggerWidgetNode = (DXObjectTriggerWidgetNode) dXWidgetNode;
            this.data = dXObjectTriggerWidgetNode.data;
            this.ignoreFirst = dXObjectTriggerWidgetNode.ignoreFirst;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new ObjectTriggerView(context);
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
        Object obj;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (view != null) {
            ObjectTriggerView objectTriggerView = (ObjectTriggerView) view;
            if (ObjectTriggerView.access$000(objectTriggerView)) {
                ObjectTriggerView.access$002(objectTriggerView, false);
                if (this.ignoreFirst == 1) {
                    ObjectTriggerView.access$102(objectTriggerView, this.data);
                    return;
                }
            }
            Object access$100 = ObjectTriggerView.access$100(objectTriggerView);
            if (access$100 == null && this.data == null) {
                z = false;
            } else if (!(access$100 == null || (obj = this.data) == null)) {
                z = true ^ obj.equals(access$100);
            }
            if (z) {
                ObjectTriggerView.access$102(objectTriggerView, this.data);
                postEvent(new DXEvent(DXOBJECTTRIGGER_ONDATACHANGED));
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXOBJECTTRIGGER_IGNOREFIRST) {
            this.ignoreFirst = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetObjAttribute(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65007bb1", new Object[]{this, new Long(j), obj});
        } else if (j == 33556442494L) {
            this.data = obj;
        } else {
            setObjAttribute(j, obj);
        }
    }
}
