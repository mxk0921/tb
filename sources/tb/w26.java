package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.view.DXNativeCountDownTimerView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.g;
import com.taobao.taolive.room.dx.DXLiveCountDownTimerView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class w26 extends g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXLIVECOUNTDOWNVIEW_LIVECOUNTDOWNVIEW = 2878922941451687645L;
    public static final long DXLIVECOUNTDOWNVIEW_LIVE_FUTURETIME = -7257181253166306744L;
    public long L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements DXNativeCountDownTimerView.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.dinamicx.view.DXNativeCountDownTimerView.b
        public void onFinish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
            } else {
                w26.this.postEvent(new DXEvent(wc6.DXSMARTLAYERCOUNTDOWNTEXTVIEW_ONCOUNTDOWNFINISH));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(779092953);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new w26();
        }
    }

    static {
        t2o.a(779092951);
    }

    public static /* synthetic */ Object ipc$super(w26 w26Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1440851004:
                super.onSetLongAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).longValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/dx/DXLiveCountDownViewWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.g, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new w26();
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

    @Override // com.taobao.android.dinamicx.widget.g, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof w26)) {
            super.onClone(dXWidgetNode, z);
            this.L = ((w26) dXWidgetNode).L;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.g, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new DXLiveCountDownTimerView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.g, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.g, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        long j = this.L;
        if (j > 0 && (view instanceof DXLiveCountDownTimerView)) {
            DXLiveCountDownTimerView dXLiveCountDownTimerView = (DXLiveCountDownTimerView) view;
            dXLiveCountDownTimerView.setLive_futureTime(j);
            dXLiveCountDownTimerView.setFutureTime(this.L);
            dXLiveCountDownTimerView.setCurrentTime(this.L - System.currentTimeMillis());
            dXLiveCountDownTimerView.updateCountView();
            if (dXLiveCountDownTimerView.getLastTime() > 0) {
                dXLiveCountDownTimerView.showCountDown();
                dXLiveCountDownTimerView.updateCountView();
                dXLiveCountDownTimerView.getTimer().e();
                dXLiveCountDownTimerView.setOnFinishListener(new a());
                return;
            }
            dXLiveCountDownTimerView.hideCountDown();
            dXLiveCountDownTimerView.getTimer().g();
            postEvent(new DXEvent(wc6.DXSMARTLAYERCOUNTDOWNTEXTVIEW_ONCOUNTDOWNFINISH));
        }
    }

    @Override // com.taobao.android.dinamicx.widget.g, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetLongAttribute(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1e5bc4", new Object[]{this, new Long(j), new Long(j2)});
        } else if (j == DXLIVECOUNTDOWNVIEW_LIVE_FUTURETIME) {
            this.L = j2;
        } else {
            super.onSetLongAttribute(j, j2);
        }
    }
}
