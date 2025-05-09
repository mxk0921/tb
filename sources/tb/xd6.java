package tb;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.taobaocompat.lifecycle.TimestampSynchronizer;
import com.taobao.taolive.uikit.view.TBLiveCountDownView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xd6 extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTBLCOUNTDOWNVIEW_AUTOCUTDOWN = 6638060553199557000L;
    public static final long DXTBLCOUNTDOWNVIEW_BGCOLOR = 4692251727942617679L;
    public static final long DXTBLCOUNTDOWNVIEW_EXPIRETEXT = 736185736852682556L;
    public static final long DXTBLCOUNTDOWNVIEW_PREFIX = 9933265312032660L;
    public static final long DXTBLCOUNTDOWNVIEW_SUFFIX = 10152742301255515L;
    public static final long DXTBLCOUNTDOWNVIEW_TBLCOUNTDOWNVIEW = -129525802453820114L;
    public static final long DXTBLCOUNTDOWNVIEW_TEXTCOLOR = 5737767606580872653L;
    public static final long DXTBLCOUNTDOWNVIEW_TEXTSIZE = 6751005219504497256L;
    public static final long DXTBLCOUNTDOWNVIEW_TIMELEFT = 6755539235969560642L;
    public static final long DXTBLCOUNTDOWNVIEW_TIMELEFT1 = 8063753808540655988L;

    /* renamed from: a  reason: collision with root package name */
    public String f31319a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(779092427);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new xd6();
        }
    }

    static {
        t2o.a(779092426);
    }

    public static /* synthetic */ Object ipc$super(xd6 xd6Var, String str, Object... objArr) {
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
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/dinamicext/dinamicx/DXTBLCountDownViewWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new xd6();
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
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof xd6)) {
            super.onClone(dXWidgetNode, z);
            xd6 xd6Var = (xd6) dXWidgetNode;
            this.f31319a = xd6Var.f31319a;
            this.b = xd6Var.b;
            this.c = xd6Var.c;
            this.d = xd6Var.d;
            this.e = xd6Var.e;
            this.f = xd6Var.f;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        TBLiveCountDownView tBLiveCountDownView = new TBLiveCountDownView(context, true);
        tBLiveCountDownView.needExpireText(true);
        return tBLiveCountDownView;
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
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (view instanceof TBLiveCountDownView) {
            TBLiveCountDownView tBLiveCountDownView = (TBLiveCountDownView) view;
            try {
                tBLiveCountDownView.setTimeTextColor(Color.parseColor(this.d));
                tBLiveCountDownView.setTimeTextSize(Float.parseFloat(this.e));
                tBLiveCountDownView.setColonColor(Color.parseColor(this.d));
                tBLiveCountDownView.setColonSize(Float.parseFloat(this.e));
                tBLiveCountDownView.setPreTextColor(Color.parseColor(this.d));
                tBLiveCountDownView.setPreTextSize(Float.parseFloat(this.e));
                tBLiveCountDownView.setSuffixTextColor(Color.parseColor(this.d));
                tBLiveCountDownView.setSuffixTextSize(Float.parseFloat(this.e));
                tBLiveCountDownView.setExpireTextColor(Color.parseColor(this.d));
                tBLiveCountDownView.setExpireTextSize(Float.parseFloat(this.e));
            } catch (Error unused) {
            }
            tBLiveCountDownView.setExpireTextStr(this.f31319a);
            tBLiveCountDownView.setPreText(this.b);
            tBLiveCountDownView.setSuffixText(this.c);
            long serverTime = TimestampSynchronizer.getServerTime();
            try {
                j = Long.parseLong(this.f);
            } catch (Error unused2) {
                j = 0;
            }
            tBLiveCountDownView.setCountToEnd(j - serverTime);
            tBLiveCountDownView.start();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j != DXTBLCOUNTDOWNVIEW_AUTOCUTDOWN) {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j != DXTBLCOUNTDOWNVIEW_BGCOLOR) {
            if (j == DXTBLCOUNTDOWNVIEW_EXPIRETEXT) {
                this.f31319a = str;
            } else if (j == DXTBLCOUNTDOWNVIEW_PREFIX) {
                this.b = str;
            } else if (j == DXTBLCOUNTDOWNVIEW_SUFFIX) {
                this.c = str;
            } else if (j == 5737767606580872653L) {
                this.d = str;
            } else if (j == 6751005219504497256L) {
                this.e = str;
            } else if (j == DXTBLCOUNTDOWNVIEW_TIMELEFT) {
                this.f = str;
            } else if (j != DXTBLCOUNTDOWNVIEW_TIMELEFT1) {
                super.onSetStringAttribute(j, str);
            }
        }
    }
}
