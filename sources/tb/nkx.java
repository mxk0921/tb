package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.transfer.widget.avatar.AvatarsAnimView;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.h;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class nkx extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXXQINTERACTAVATARANIMATIONVIEW_ANIMATIONDURATION = 7542118000091127575L;
    public static final long DXXQINTERACTAVATARANIMATIONVIEW_ANIMATIONINTERVALTIME = -6890449677620354903L;
    public static final long DXXQINTERACTAVATARANIMATIONVIEW_AVATARSDATA = -1863206941435189385L;
    public static final long DXXQINTERACTAVATARANIMATIONVIEW_ISANIMATIONON = 5099635912092916806L;
    public static final long DXXQINTERACTAVATARANIMATIONVIEW_ISINFINITE = -3537170322378136036L;
    public static final long DXXQINTERACTAVATARANIMATIONVIEW_XQINTERACTAVATARANIMATIONVIEW;
    public static final long DX_EVENT_ID;

    /* renamed from: a  reason: collision with root package name */
    public double f24799a;
    public double b;
    public JSONArray c;
    public int d = 1;
    public int e = 1;
    public AvatarsAnimView f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912262711);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new nkx();
        }
    }

    static {
        t2o.a(912262710);
        long a2 = k06.a("XQInteractAvatarAnimationView");
        DX_EVENT_ID = a2;
        DXXQINTERACTAVATARANIMATIONVIEW_XQINTERACTAVATARANIMATIONVIEW = a2;
    }

    public static /* synthetic */ Object ipc$super(nkx nkxVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -879570230:
                super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1327675976:
                return new Boolean(super.onEvent((DXEvent) objArr[0]));
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/transfer/widget/XQInteractAvatarAnimationViewWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.h, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new nkx();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == DXXQINTERACTAVATARANIMATIONVIEW_ISANIMATIONON || j == -3537170322378136036L) {
            return 1;
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

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof nkx)) {
            super.onClone(dXWidgetNode, z);
            nkx nkxVar = (nkx) dXWidgetNode;
            this.f24799a = nkxVar.f24799a;
            this.b = nkxVar.b;
            this.c = nkxVar.c;
            this.d = nkxVar.d;
            this.e = nkxVar.e;
            tgh.b("AvatarAnimationView", "recycleTransImage onClone");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.h, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        tgh.b("AvatarAnimationView", "recycleTransImage onCreateView");
        AvatarsAnimView avatarsAnimView = new AvatarsAnimView(context);
        this.f = avatarsAnimView;
        return avatarsAnimView;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (super.onEvent(dXEvent)) {
            return true;
        }
        if (!(getDXRuntimeContext().L() == null || this.f == null)) {
            long eventId = dXEvent.getEventId();
            if (5288671110273408574L == eventId) {
                this.f.setIsAppear(true);
                return true;
            } else if (5388973340095122049L == eventId) {
                this.f.setIsAppear(false);
                return true;
            }
        }
        return false;
    }

    @Override // com.taobao.android.dinamicx.widget.h, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (!(view instanceof AvatarsAnimView)) {
            tgh.b("AvatarAnimationView", "!(weakView instanceof AvatarsAnimView)");
            return;
        }
        AvatarsAnimView avatarsAnimView = (AvatarsAnimView) view;
        this.f = avatarsAnimView;
        avatarsAnimView.setData(this.f24799a, this.b, this.c, this.d, this.e);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == DXXQINTERACTAVATARANIMATIONVIEW_ANIMATIONDURATION) {
            this.f24799a = d;
        } else if (j == DXXQINTERACTAVATARANIMATIONVIEW_ANIMATIONINTERVALTIME) {
            this.b = d;
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.h, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXXQINTERACTAVATARANIMATIONVIEW_ISANIMATIONON) {
            this.d = i;
        } else if (j == -3537170322378136036L) {
            this.e = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
        } else if (j == DXXQINTERACTAVATARANIMATIONVIEW_AVATARSDATA) {
            this.c = jSONArray;
        } else {
            super.onSetListAttribute(j, jSONArray);
        }
    }
}
