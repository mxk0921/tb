package com.taobao.unit.center.mdc.dinamicx.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeLinearLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.k;
import tb.qub;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DXMsgSelectableLinearLayoutWidgetNode extends k {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXMSGSELECTABLELINEARLAYOUT_MSGSELECTABLELINEARLAYOUT = -3358615048808481267L;
    public static final long DXMSGSELECTABLELINEARLAYOUT_SELECTOR = 6456471229576470377L;
    private String selector = "#1A000000";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Builder implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(552599769);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new DXMsgSelectableLinearLayoutWidgetNode();
        }
    }

    static {
        t2o.a(552599768);
    }

    public static /* synthetic */ Object ipc$super(DXMsgSelectableLinearLayoutWidgetNode dXMsgSelectableLinearLayoutWidgetNode, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 253729832) {
            return super.getDefaultValueForStringAttr(((Number) objArr[0]).longValue());
        }
        if (hashCode == 1115049375) {
            super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
            return null;
        } else if (hashCode == 2119721610) {
            super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/unit/center/mdc/dinamicx/widget/DXMsgSelectableLinearLayoutWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new DXMsgSelectableLinearLayoutWidgetNode();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public String getDefaultValueForStringAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j)});
        }
        if (j == DXMSGSELECTABLELINEARLAYOUT_SELECTOR) {
            return "#1A000000";
        }
        return super.getDefaultValueForStringAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof DXMsgSelectableLinearLayoutWidgetNode)) {
            super.onClone(dXWidgetNode, z);
            this.selector = ((DXMsgSelectableLinearLayoutWidgetNode) dXWidgetNode).selector;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        MsgDXNativeLinearLayout msgDXNativeLinearLayout = new MsgDXNativeLinearLayout(context);
        msgDXNativeLinearLayout.setSelector(Color.parseColor(this.selector));
        return msgDXNativeLinearLayout;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXMSGSELECTABLELINEARLAYOUT_SELECTOR) {
            this.selector = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class MsgDXNativeLinearLayout extends DXNativeLinearLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int foregroundColor = 436207616;
        private float x = -1.0f;
        private float y = -1.0f;

        static {
            t2o.a(552599770);
        }

        public MsgDXNativeLinearLayout(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(MsgDXNativeLinearLayout msgDXNativeLinearLayout, String str, Object... objArr) {
            if (str.hashCode() == 2075560917) {
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/unit/center/mdc/dinamicx/widget/DXMsgSelectableLinearLayoutWidgetNode$MsgDXNativeLinearLayout");
        }

        private boolean isMove(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4d7d0abb", new Object[]{this, motionEvent})).booleanValue();
            }
            if (Math.abs(this.x - motionEvent.getX()) > ViewConfiguration.get(getContext()).getScaledTouchSlop() || Math.abs(this.y - motionEvent.getY()) > ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                return true;
            }
            return false;
        }

        private void reset() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e6256", new Object[]{this});
                return;
            }
            this.x = -1.0f;
            this.y = -1.0f;
            if (Build.VERSION.SDK_INT >= 23) {
                setForeground(new ColorDrawable(0));
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
            }
            if (motionEvent.getAction() == 0 && this.x == -1.0f && this.y == -1.0f) {
                this.x = motionEvent.getX();
                this.y = motionEvent.getY();
                if (Build.VERSION.SDK_INT >= 23) {
                    setForeground(new ColorDrawable(this.foregroundColor));
                }
            } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 4) {
                reset();
            } else if (motionEvent.getAction() == 1) {
                reset();
            } else if (isMove(motionEvent)) {
                reset();
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        public void setSelector(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd14419b", new Object[]{this, new Integer(i)});
            } else {
                this.foregroundColor = i;
            }
        }

        public MsgDXNativeLinearLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public MsgDXNativeLinearLayout(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }
    }
}
