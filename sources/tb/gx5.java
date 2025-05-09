package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.tao.export.flickbtn.FlickingShareButton;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gx5 extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXFLICKINGSHAREBUTTON_BIZCODE = 4692571911381046119L;
    public static final long DXFLICKINGSHAREBUTTON_FLICKANIMENABLE = 3594541629581155300L;
    public static final int DXFLICKINGSHAREBUTTON_FLICKANIMENABLE_FALSE = 1;
    public static final int DXFLICKINGSHAREBUTTON_FLICKANIMENABLE_TRUE = 0;
    public static final long DXFLICKINGSHAREBUTTON_FLICKINGSHAREBUTTON = -2033267238411967319L;
    public static final long DXFLICKINGSHAREBUTTON_ICONCOLOR = 2996147367631721393L;
    public static final long DXFLICKINGSHAREBUTTON_ICONHEIGHT = 7735295455280851724L;
    public static final long DXFLICKINGSHAREBUTTON_ICONWIDTH = 2996192074059827378L;
    public static final long DXFLICKINGSHAREBUTTON_LOCATION = 4406527402114761313L;
    public static final long DXFLICKINGSHAREBUTTON_SHARECONTENT = -8838640107702650118L;
    public static final long DXFLICKINGSHAREBUTTON_SHAREICONFONT = 8560243711849934944L;
    public static final long DXFLICKINGSHAREBUTTON_TARGETID = 6746394970674636604L;
    public static final long DXFLICKINGSHAREBUTTON_TARGETTYPE = -3419842854714867917L;

    /* renamed from: a  reason: collision with root package name */
    public String f20285a;
    public int b = 0;
    public int c = -6710887;
    public int d;
    public int e;
    public String f;
    public String g;
    public String h;
    public String i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(666894394);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new gx5();
        }
    }

    static {
        t2o.a(666894393);
    }

    public static /* synthetic */ Object ipc$super(gx5 gx5Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1456812170:
                super.onSetMapAttribute(((Number) objArr[0]).longValue(), (JSONObject) objArr[1]);
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/export/flickbtn/DXFlickingShareButtonWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new gx5();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == DXFLICKINGSHAREBUTTON_FLICKANIMENABLE) {
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
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof gx5)) {
            super.onClone(dXWidgetNode, z);
            gx5 gx5Var = (gx5) dXWidgetNode;
            this.f20285a = gx5Var.f20285a;
            this.b = gx5Var.b;
            this.c = gx5Var.c;
            this.d = gx5Var.d;
            this.e = gx5Var.e;
            this.f = gx5Var.f;
            this.g = gx5Var.g;
            this.h = gx5Var.h;
            this.i = gx5Var.i;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        Log.e("daishuwen", "DXFlickingShareButtonWidgetNode#onCreateView");
        DXRootView L = getDXRuntimeContext().L();
        if (L != null) {
            int i = R.id.flShareContainer;
            if (L.findViewById(i) != null) {
                Log.e("daishuwen", "find cached view");
                return L.findViewById(i);
            }
        }
        Log.e("daishuwen", "create new view");
        FlickingShareButton flickingShareButton = new FlickingShareButton(context);
        flickingShareButton.setIconSize(this.e, this.d);
        flickingShareButton.setIconColor(this.c);
        if (!TextUtils.isEmpty(this.g)) {
            flickingShareButton.setIconFont(this.g);
        }
        if (this.b == 0) {
            z = true;
        }
        flickingShareButton.setFlickAnimEnable(z);
        flickingShareButton.dxMode = true;
        t(flickingShareButton);
        return flickingShareButton;
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
            return;
        }
        super.onRenderView(context, view);
        if ((context instanceof Activity) && (view instanceof FlickingShareButton)) {
            FlickingShareButton flickingShareButton = (FlickingShareButton) view;
            t(flickingShareButton);
            flickingShareButton.considerPostRequestData();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXFLICKINGSHAREBUTTON_FLICKANIMENABLE) {
            this.b = i;
        } else if (j == 2996147367631721393L) {
            this.c = i;
        } else if (j == DXFLICKINGSHAREBUTTON_ICONHEIGHT) {
            this.d = i;
        } else if (j == DXFLICKINGSHAREBUTTON_ICONWIDTH) {
            this.e = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92acf76", new Object[]{this, new Long(j), jSONObject});
        } else if (j != DXFLICKINGSHAREBUTTON_SHARECONTENT) {
            super.onSetMapAttribute(j, jSONObject);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXFLICKINGSHAREBUTTON_BIZCODE) {
            this.f20285a = str;
        } else if (j == DXFLICKINGSHAREBUTTON_LOCATION) {
            this.f = str;
        } else if (j == DXFLICKINGSHAREBUTTON_SHAREICONFONT) {
            this.g = str;
        } else if (j == DXFLICKINGSHAREBUTTON_TARGETID) {
            this.h = str;
        } else if (j == DXFLICKINGSHAREBUTTON_TARGETTYPE) {
            this.i = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    public final void t(FlickingShareButton flickingShareButton) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f129c3f2", new Object[]{this, flickingShareButton});
            return;
        }
        String str = this.f;
        if (str != null) {
            flickingShareButton.presenter.d = str;
        }
        String str2 = this.f20285a;
        if (str2 != null) {
            flickingShareButton.presenter.c = str2;
        }
        String str3 = this.h;
        if (str3 != null) {
            flickingShareButton.presenter.e = str3;
        }
        String str4 = this.i;
        if (str4 != null) {
            flickingShareButton.presenter.f = str4;
        }
    }
}
