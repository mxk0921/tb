package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXScrollerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.live.home.dinamic.widget.DXTBLNativeRecyclerView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vd6 extends DXScrollerLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTBLAUTOSCROLLSCROLLERLAYOUT_INFINITESCROLL = 790344787869171155L;
    public static final long DXTBLAUTOSCROLLSCROLLERLAYOUT_SCROLLSPEED = -3216884856980908405L;
    public static final long DXTBLAUTOSCROLLSCROLLERLAYOUT_SHOULDAUTOSCROLL = -426628818580889433L;
    public static final long DXTBLAUTOSCROLLSCROLLERLAYOUT_SINGLEEXPOSE = 414910799174304258L;
    public static final long DXTBLAUTOSCROLLSCROLLERLAYOUT_TBLAUTOSCROLLSCROLLERLAYOUT = -7037058416621756471L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(806355465);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new vd6();
        }
    }

    static {
        t2o.a(806355464);
    }

    public static /* synthetic */ Object ipc$super(vd6 vd6Var, String str, Object... objArr) {
        switch (str.hashCode()) {
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
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/dinamic/widget/DXTBLAutoScrollScrollerLayoutWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new vd6();
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == DXTBLAUTOSCROLLSCROLLERLAYOUT_INFINITESCROLL) {
            return 0;
        }
        if (j == -3216884856980908405L) {
            return 5;
        }
        if (j == DXTBLAUTOSCROLLSCROLLERLAYOUT_SHOULDAUTOSCROLL || j == DXTBLAUTOSCROLLSCROLLERLAYOUT_SINGLEEXPOSE) {
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

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof vd6)) {
            super.onClone(dXWidgetNode, z);
            vd6 vd6Var = (vd6) dXWidgetNode;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        DXTBLNativeRecyclerView dXTBLNativeRecyclerView = new DXTBLNativeRecyclerView(context);
        closeDefaultAnimator(dXTBLNativeRecyclerView);
        return dXTBLNativeRecyclerView;
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else {
            super.onRenderView(context, view);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j != DXTBLAUTOSCROLLSCROLLERLAYOUT_INFINITESCROLL && j != -3216884856980908405L && j != DXTBLAUTOSCROLLSCROLLERLAYOUT_SHOULDAUTOSCROLL && j != DXTBLAUTOSCROLLSCROLLERLAYOUT_SINGLEEXPOSE) {
            super.onSetIntAttribute(j, i);
        }
    }
}
