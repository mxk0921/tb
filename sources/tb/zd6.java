package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.schedule.ViewProxy;
import com.taobao.taolive.uikit.view.TBLiveFollowComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class zd6 extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTBLFOLLOWVIEW_FOLLOWCOLOR = -5256959681575179875L;
    public static final long DXTBLFOLLOWVIEW_FOLLOWDATA = -3947223316720625897L;
    public static final long DXTBLFOLLOWVIEW_ISFOLLOWED = -7049142842304485086L;
    public static final long DXTBLFOLLOWVIEW_RADIUS = 10074193828068110L;
    public static final long DXTBLFOLLOWVIEW_STROKECOLOR = 1904134416384250786L;
    public static final long DXTBLFOLLOWVIEW_STROKEWIDTH = 1904312980655574691L;
    public static final long DXTBLFOLLOWVIEW_TBLFOLLOWVIEW = 2167110289751455229L;
    public static final long DXTBLFOLLOWVIEW_UNFOLLOWCOLOR = -5703421456103511934L;

    /* renamed from: a  reason: collision with root package name */
    public int f32691a;
    public Object b;
    public int c = 0;
    public double d;
    public int e;
    public double f;
    public int g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if ((view instanceof TBLiveFollowComponent) && (zd6.t(zd6.this) instanceof JSONObject)) {
                String string = ((JSONObject) zd6.t(zd6.this)).getString("accountId");
                String string2 = ((JSONObject) zd6.t(zd6.this)).getString("type");
                if (!TextUtils.isEmpty(string)) {
                    if (TextUtils.equals("daren", string2)) {
                        str = "2";
                    } else {
                        str = "1";
                    }
                    ((TBLiveFollowComponent) view).addFollow(string, str);
                    try {
                        zd6.u(zd6.this, 1);
                        zd6.this.getDXRuntimeContext().i().getJSONObject("liveSearchAnchorBaseInfo").put("follow", (Object) "true");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(779092436);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new zd6();
        }
    }

    static {
        t2o.a(779092434);
    }

    public static /* synthetic */ Object ipc$super(zd6 zd6Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1694530481:
                super.onSetObjAttribute(((Number) objArr[0]).longValue(), objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/dinamicext/dinamicx/DXTBLFollowViewWidgetNode");
        }
    }

    public static /* synthetic */ Object t(zd6 zd6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2d10fb95", new Object[]{zd6Var});
        }
        return zd6Var.b;
    }

    public static /* synthetic */ int u(zd6 zd6Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b43e036", new Object[]{zd6Var, new Integer(i)})).intValue();
        }
        zd6Var.c = i;
        return i;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new zd6();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == DXTBLFOLLOWVIEW_ISFOLLOWED) {
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

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode instanceof zd6) {
            super.onClone(dXWidgetNode, z);
            zd6 zd6Var = (zd6) dXWidgetNode;
            this.f32691a = zd6Var.f32691a;
            this.b = zd6Var.b;
            this.c = zd6Var.c;
            this.d = zd6Var.d;
            this.e = zd6Var.e;
            this.f = zd6Var.f;
            this.g = zd6Var.g;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new TBLiveFollowComponent(context);
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
        } else if (view instanceof TBLiveFollowComponent) {
            TBLiveFollowComponent tBLiveFollowComponent = (TBLiveFollowComponent) view;
            tBLiveFollowComponent.setFollowColor(this.f32691a);
            tBLiveFollowComponent.setFollowData(this.b);
            tBLiveFollowComponent.setIsFollowed(this.c);
            tBLiveFollowComponent.setUnFollowColor(this.g);
            tBLiveFollowComponent.setRadius(this.d);
            tBLiveFollowComponent.setStrokeColor(this.e);
            tBLiveFollowComponent.setStrokeWidth(this.f);
            tBLiveFollowComponent.update();
            if (this.c == 0) {
                ViewProxy.setOnClickListener(view, new a());
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == 10074193828068110L) {
            this.d = d;
        } else if (j == DXTBLFOLLOWVIEW_STROKEWIDTH) {
            this.f = d;
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXTBLFOLLOWVIEW_FOLLOWCOLOR) {
            this.f32691a = i;
        } else if (j == DXTBLFOLLOWVIEW_ISFOLLOWED) {
            this.c = i;
        } else if (j == DXTBLFOLLOWVIEW_STROKECOLOR) {
            this.e = i;
        } else if (j == DXTBLFOLLOWVIEW_UNFOLLOWCOLOR) {
            this.g = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetObjAttribute(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65007bb1", new Object[]{this, new Long(j), obj});
        } else if (j == DXTBLFOLLOWVIEW_FOLLOWDATA) {
            this.b = obj;
        } else {
            super.onSetObjAttribute(j, obj);
        }
    }
}
