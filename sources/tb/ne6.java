package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.taolive.uikit.view.TBLiveSubscribeView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ne6 extends DXWidgetNode implements TBLiveSubscribeView.f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTBLSUBSCRIBEVIEW_LACTIVITYTYPE = -2069602197696611992L;
    public static final long DXTBLSUBSCRIBEVIEW_LBOLD = 18447527196978L;
    public static final long DXTBLSUBSCRIBEVIEW_LBORDERWIDTH = 3701974352896314070L;
    public static final long DXTBLSUBSCRIBEVIEW_LCLICKMAIDIAN = 732344823744725778L;
    public static final long DXTBLSUBSCRIBEVIEW_LCORNERRADIUS = -6502838344289573046L;
    public static final long DXTBLSUBSCRIBEVIEW_LLIVEID = 5060064627242346672L;
    public static final long DXTBLSUBSCRIBEVIEW_LLIVEINFO = -53848254088781935L;
    public static final long DXTBLSUBSCRIBEVIEW_LSUBFROM = 4374524015627555122L;
    public static final long DXTBLSUBSCRIBEVIEW_LSUBSCRIBEBACKGROUNDCOLOR = 1823545870889657894L;
    public static final long DXTBLSUBSCRIBEVIEW_LSUBSCRIBEBORDERCOLOR = -3873877724587126144L;
    public static final long DXTBLSUBSCRIBEVIEW_LSUBSCRIBETEXT = -6371906121786017855L;
    public static final long DXTBLSUBSCRIBEVIEW_LSUBSCRIBETEXTCOLOR = -8420058298873725499L;
    public static final long DXTBLSUBSCRIBEVIEW_LTEXTGRAVITY = -6848740934753895933L;
    public static final int DXTBLSUBSCRIBEVIEW_LTEXTGRAVITY_CENTER = 1;
    public static final int DXTBLSUBSCRIBEVIEW_LTEXTGRAVITY_LEFT = 0;
    public static final int DXTBLSUBSCRIBEVIEW_LTEXTGRAVITY_RIGHT = 2;
    public static final long DXTBLSUBSCRIBEVIEW_LTEXTSIZE = 4639572392309634485L;
    public static final long DXTBLSUBSCRIBEVIEW_LUNSUBSCRIBEBACKGROUNDCOLOR = -6079998249699179541L;
    public static final long DXTBLSUBSCRIBEVIEW_LUNSUBSCRIBEBORDERCOLOR = -1787463109713374139L;
    public static final long DXTBLSUBSCRIBEVIEW_LUNSUBSCRIBETEXT = -5051518861819197306L;
    public static final long DXTBLSUBSCRIBEVIEW_LUNSUBSCRIBETEXTCOLOR = -5559952976809922166L;
    public static final long DXTBLSUBSCRIBEVIEW_LUSERSUBSCRIBE = 9071069927109579451L;
    public static final long DXTBLSUBSCRIBEVIEW_TBLSUBSCRIBEVIEW = -6149004832464267473L;

    /* renamed from: a  reason: collision with root package name */
    public String f24677a;
    public boolean b;
    public int c;
    public Object d;
    public int e;
    public String f;
    public Object g;
    public String h;
    public int i;
    public int j;
    public String k;
    public int l;
    public int m = 1;
    public int n;
    public int o;
    public int p;
    public String q;
    public int r;
    public boolean s;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(779092444);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new ne6();
        }
    }

    static {
        t2o.a(779092443);
        t2o.a(779093706);
    }

    public static /* synthetic */ Object ipc$super(ne6 ne6Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 1694530481:
                super.onSetObjAttribute(((Number) objArr[0]).longValue(), objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/dinamicext/dinamicx/DXTBLSubscribeViewWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new ne6();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode instanceof ne6) {
            super.onClone(dXWidgetNode, z);
            ne6 ne6Var = (ne6) dXWidgetNode;
            this.f24677a = ne6Var.f24677a;
            this.b = ne6Var.b;
            this.c = ne6Var.c;
            this.d = ne6Var.d;
            this.e = ne6Var.e;
            this.f = ne6Var.f;
            this.g = ne6Var.g;
            this.h = ne6Var.h;
            this.i = ne6Var.i;
            this.j = ne6Var.j;
            this.k = ne6Var.k;
            this.l = ne6Var.l;
            this.m = ne6Var.m;
            this.n = ne6Var.n;
            this.o = ne6Var.o;
            this.p = ne6Var.p;
            this.q = ne6Var.q;
            this.r = ne6Var.r;
            this.s = ne6Var.s;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new TBLiveSubscribeView(context, this);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (view instanceof TBLiveSubscribeView) {
            TBLiveSubscribeView tBLiveSubscribeView = (TBLiveSubscribeView) view;
            tBLiveSubscribeView.setBorderWidth((this.c * 375) / owo.g(context));
            tBLiveSubscribeView.setCornerRadius(this.e);
            tBLiveSubscribeView.setUserSubscribed(this.s);
            tBLiveSubscribeView.setSubscribeBorderColor(this.j);
            tBLiveSubscribeView.setSubscribeBackgroundColor(this.i);
            tBLiveSubscribeView.setSubscribeText(this.k);
            tBLiveSubscribeView.setSubscribeTextColor(this.l);
            tBLiveSubscribeView.setUnSubscribeBorderColor(this.p);
            tBLiveSubscribeView.setUnSubscribeBackgroundColor(this.o);
            tBLiveSubscribeView.setUnSubscribeText(this.q);
            tBLiveSubscribeView.setUnSubscribeTextColor(this.r);
            tBLiveSubscribeView.setTextSize((this.n * 375.0f) / owo.g(context));
            tBLiveSubscribeView.setLiveId(this.f);
            tBLiveSubscribeView.setSubFrom(this.h);
            tBLiveSubscribeView.setActivityType(this.f24677a);
            Object obj = this.g;
            if (obj instanceof JSONObject) {
                tBLiveSubscribeView.setLiveInfo((JSONObject) obj);
            } else {
                tBLiveSubscribeView.setLiveInfo(null);
            }
            Object obj2 = this.d;
            if (obj2 instanceof JSONObject) {
                tBLiveSubscribeView.setClickMaidian((JSONObject) obj2);
            } else {
                tBLiveSubscribeView.setClickMaidian(null);
            }
            if (this.b) {
                tBLiveSubscribeView.setBold(true);
            }
            t(tBLiveSubscribeView, this.m);
            tBLiveSubscribeView.render();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXTBLSUBSCRIBEVIEW_LBOLD) {
            if (i == 0) {
                z = false;
            }
            this.b = z;
        } else if (j == DXTBLSUBSCRIBEVIEW_LBORDERWIDTH) {
            this.c = i;
        } else if (j == DXTBLSUBSCRIBEVIEW_LCORNERRADIUS) {
            this.e = i;
        } else if (j == DXTBLSUBSCRIBEVIEW_LSUBSCRIBEBACKGROUNDCOLOR) {
            this.i = i;
        } else if (j == DXTBLSUBSCRIBEVIEW_LSUBSCRIBEBORDERCOLOR) {
            this.j = i;
        } else if (j == DXTBLSUBSCRIBEVIEW_LSUBSCRIBETEXTCOLOR) {
            this.l = i;
        } else if (j == DXTBLSUBSCRIBEVIEW_LTEXTGRAVITY) {
            this.m = i;
        } else if (j == DXTBLSUBSCRIBEVIEW_LTEXTSIZE) {
            this.n = i;
        } else if (j == DXTBLSUBSCRIBEVIEW_LUNSUBSCRIBEBACKGROUNDCOLOR) {
            this.o = i;
        } else if (j == DXTBLSUBSCRIBEVIEW_LUNSUBSCRIBEBORDERCOLOR) {
            this.p = i;
        } else if (j == DXTBLSUBSCRIBEVIEW_LUNSUBSCRIBETEXTCOLOR) {
            this.r = i;
        } else if (j == DXTBLSUBSCRIBEVIEW_LUSERSUBSCRIBE) {
            if (i == 0) {
                z = false;
            }
            this.s = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetObjAttribute(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65007bb1", new Object[]{this, new Long(j), obj});
        } else if (j == DXTBLSUBSCRIBEVIEW_LCLICKMAIDIAN) {
            this.d = obj;
        } else if (j == DXTBLSUBSCRIBEVIEW_LLIVEINFO) {
            this.g = obj;
        } else {
            super.onSetObjAttribute(j, obj);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXTBLSUBSCRIBEVIEW_LACTIVITYTYPE) {
            this.f24677a = str;
        } else if (j == DXTBLSUBSCRIBEVIEW_LLIVEID) {
            this.f = str;
        } else if (j == DXTBLSUBSCRIBEVIEW_LSUBFROM) {
            this.h = str;
        } else if (j == DXTBLSUBSCRIBEVIEW_LSUBSCRIBETEXT) {
            this.k = str;
        } else if (j == DXTBLSUBSCRIBEVIEW_LUNSUBSCRIBETEXT) {
            this.q = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    public final void t(TBLiveSubscribeView tBLiveSubscribeView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c55d90d4", new Object[]{this, tBLiveSubscribeView, new Integer(i)});
        } else if (i == 0) {
            tBLiveSubscribeView.setTextGravity(19);
        } else if (i == 2) {
            tBLiveSubscribeView.setTextGravity(21);
        } else {
            tBLiveSubscribeView.setTextGravity(17);
        }
    }

    @Override // com.taobao.taolive.uikit.view.TBLiveSubscribeView.f
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4471fdf", new Object[]{this});
            return;
        }
        this.s = true;
        Object obj = this.g;
        if (obj instanceof JSONObject) {
            ((JSONObject) obj).put("userSubscribe", (Object) "true");
        }
    }

    @Override // com.taobao.taolive.uikit.view.TBLiveSubscribeView.f
    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e15ae639", new Object[]{this});
            return;
        }
        this.s = false;
        Object obj = this.g;
        if (obj instanceof JSONObject) {
            ((JSONObject) obj).put("userSubscribe", (Object) "false");
        }
    }
}
