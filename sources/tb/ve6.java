package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.h;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ve6 extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTBPOPEVENTLAYOUT_ONPOPCANCEL = 8746808838507530845L;
    public static final long DXTBPOPEVENTLAYOUT_ONPOPCONFIRM = -1129127094585505562L;
    public static final long DXTBPOPEVENTLAYOUT_ONPOPSCROLL = 8783582798676678022L;
    public static final long DXTBPOPEVENTLAYOUT_ONPOPTIMEOUT = -819022960750368545L;
    public static final long DXTBPOPEVENTLAYOUT_TBPOPEVENTLAYOUT = -5412611939775210923L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new ve6();
        }
    }

    public static /* synthetic */ Object ipc$super(ve6 ve6Var, String str, Object... objArr) {
        if (str.hashCode() == 1327675976) {
            return new Boolean(super.onEvent((DXEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/pop/dx/widget/DXTBPopEventLayoutWidgetNode");
    }

    @Override // com.taobao.android.dinamicx.widget.h, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new ve6();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (dXEvent == null) {
            return false;
        }
        boolean onEvent = super.onEvent(dXEvent);
        boolean t = t(dXEvent);
        if (onEvent || t) {
            return true;
        }
        return false;
    }

    public final boolean t(DXEvent dXEvent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a07e66e", new Object[]{this, dXEvent})).booleanValue();
        }
        if (dXEvent.isPrepareBind()) {
            return false;
        }
        long eventId = dXEvent.getEventId();
        if (DXTBPOPEVENTLAYOUT_ONPOPCANCEL == eventId) {
            str = "popCancel";
        } else if (DXTBPOPEVENTLAYOUT_ONPOPCONFIRM == eventId) {
            str = "popConfirm";
        } else if (DXTBPOPEVENTLAYOUT_ONPOPTIMEOUT == eventId) {
            str = "popTimeout";
        } else {
            str = DXTBPOPEVENTLAYOUT_ONPOPSCROLL == eventId ? "popScroll" : null;
        }
        if (str == null) {
            return false;
        }
        vfm.f("DXTBPopEventLayout ", "widget on " + str + " event, " + hashCode());
        return true;
    }
}
