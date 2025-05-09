package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXViewEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.i;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class be6 extends i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTBLGRIDLAYOUT_ON_PAGE_APPEAR = -8975334121118753601L;
    public static final long DXTBLGRIDLAYOUT_ON_PAGE_DISAPPEAR = -5201408949358043646L;
    public static final long DXTBLGRIDLAYOUT_TBLGRIDLAYOUT = 1280153617202335731L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(779092438);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new be6();
        }
    }

    static {
        t2o.a(779092437);
    }

    public static /* synthetic */ Object ipc$super(be6 be6Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1834790766) {
            super.onBeforeBindChildData();
            return null;
        } else if (hashCode == -630327606) {
            super.sendBroadcastEvent((DXEvent) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taolive/dinamicext/dinamicx/DXTBLGridLayoutWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.i, com.taobao.android.dinamicx.widget.h, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new be6();
    }

    @Override // com.taobao.android.dinamicx.widget.i, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeforeBindChildData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a35092", new Object[]{this});
            return;
        }
        super.onBeforeBindChildData();
        setDisableFlatten(true);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void sendBroadcastEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da6df6ca", new Object[]{this, dXEvent});
        } else if (dXEvent != null) {
            if (5288671110273408574L == dXEvent.getEventId()) {
                postEvent(dXEvent);
                if (getChildrenCount() != 0) {
                    for (DXWidgetNode dXWidgetNode : getChildren()) {
                        DXViewEvent dXViewEvent = new DXViewEvent(-8975334121118753601L);
                        dXViewEvent.setItemIndex(dXWidgetNode.getDXRuntimeContext().P());
                        dXWidgetNode.sendBroadcastEvent(dXViewEvent);
                    }
                }
            } else if (5388973340095122049L == dXEvent.getEventId()) {
                postEvent(dXEvent);
                if (getChildrenCount() != 0) {
                    for (DXWidgetNode dXWidgetNode2 : getChildren()) {
                        DXViewEvent dXViewEvent2 = new DXViewEvent(-5201408949358043646L);
                        dXViewEvent2.setItemIndex(dXWidgetNode2.getDXRuntimeContext().P());
                        dXWidgetNode2.sendBroadcastEvent(dXViewEvent2);
                    }
                }
            } else {
                super.sendBroadcastEvent(dXEvent);
            }
        }
    }
}
