package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class qy5 extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXHANIMATORIMAGEVIEW_HANIMATORIMAGEVIEW = -1417750378278284013L;
    public static final long DXHANIMATORIMAGEVIEW_IMAGEURL = 3520785955321526846L;
    public static final long DXHANIMATORIMAGEVIEW_MAXSCROLLINGENDNOTIFYTIMES = 8442704571553018783L;
    public static final long DXHANIMATORIMAGEVIEW_ONFEEDSSCROLLEND = -3388379768679026854L;
    public static final long DXHANIMATORIMAGEVIEW_ONFEEDSSCROLLSTART = 111688451027680851L;
    public static final long DXHANIMATORIMAGEVIEW_SCROLLENDDELAYTIME = -4087040622847156170L;
    public static int f;
    public boolean d;

    /* renamed from: a  reason: collision with root package name */
    public int f26998a = -1;
    public long b = 0;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final Runnable e = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!qy5.t(qy5.this) && qy5.u(qy5.this)) {
                vfm.c("HAnimatorImageView ", "post scroll end to template");
                qy5.this.postEvent(new DXEvent(qy5.DXHANIMATORIMAGEVIEW_ONFEEDSSCROLLEND));
                qy5.v();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new qy5();
        }
    }

    public static /* synthetic */ Object ipc$super(qy5 qy5Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1440851004:
                super.onSetLongAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).longValue());
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -1085610847:
                return new Long(super.getDefaultValueForLongAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 1327675976:
                return new Boolean(super.onEvent((DXEvent) objArr[0]));
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/pop/dx/widget/DXHAnimatorImageViewWidgetNode");
        }
    }

    public static /* synthetic */ boolean t(qy5 qy5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d34a6743", new Object[]{qy5Var})).booleanValue();
        }
        return qy5Var.d;
    }

    public static /* synthetic */ boolean u(qy5 qy5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a564e44", new Object[]{qy5Var})).booleanValue();
        }
        return qy5Var.w();
    }

    public static /* synthetic */ int v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("271339f4", new Object[0])).intValue();
        }
        int i = f;
        f = i + 1;
        return i;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new qy5();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == DXHANIMATORIMAGEVIEW_MAXSCROLLINGENDNOTIFYTIMES) {
            return -1;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public long getDefaultValueForLongAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf4ae4a1", new Object[]{this, new Long(j)})).longValue();
        }
        if (j == DXHANIMATORIMAGEVIEW_SCROLLENDDELAYTIME) {
            return 0L;
        }
        return super.getDefaultValueForLongAttr(j);
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
        } else if (dXWidgetNode instanceof qy5) {
            super.onClone(dXWidgetNode, z);
            qy5 qy5Var = (qy5) dXWidgetNode;
            qy5Var.getClass();
            this.f26998a = qy5Var.f26998a;
            this.b = qy5Var.b;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new View(context);
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
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXHANIMATORIMAGEVIEW_MAXSCROLLINGENDNOTIFYTIMES) {
            this.f26998a = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetLongAttribute(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1e5bc4", new Object[]{this, new Long(j), new Long(j2)});
        } else if (j == DXHANIMATORIMAGEVIEW_SCROLLENDDELAYTIME) {
            this.b = j2;
        } else {
            super.onSetLongAttribute(j, j2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j != 3520785955321526846L) {
            super.onSetStringAttribute(j, str);
        }
    }

    public final boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("325be2b", new Object[]{this})).booleanValue();
        }
        int i = this.f26998a;
        if (i < 0 || f < i) {
            return true;
        }
        return false;
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae099996", new Object[]{this});
            return;
        }
        long j = this.b;
        if (j > 0) {
            this.c.postDelayed(this.e, j);
        } else {
            ((a) this.e).run();
        }
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
        long eventId = dXEvent.getEventId();
        vfm.e("HAnimatorImageView ", "onEvent=" + eventId);
        if (eventId == -1609878593 && !this.d) {
            this.c.removeCallbacks(this.e);
            vfm.c("HAnimatorImageView ", "receive on scroll start event");
            this.d = true;
            postEvent(new DXEvent(DXHANIMATORIMAGEVIEW_ONFEEDSSCROLLSTART));
            return true;
        } else if (eventId != -962581640 || !this.d || !w()) {
            return onEvent;
        } else {
            vfm.f("HAnimatorImageView ", "receive on scroll stop event");
            this.d = false;
            x();
            return true;
        }
    }
}
