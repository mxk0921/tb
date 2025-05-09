package com.taobao.taolive.dinamicext.dinamicx;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.cxb;
import tb.exb;
import tb.mw5;
import tb.qub;
import tb.t2o;
import tb.vjr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class DXTBLFllowContentWidgetNode extends DXWidgetNode implements exb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTBLFLLOWCONTENT_MUTE = 36176011951L;
    public static final long DXTBLFLLOWCONTENT_ONMUTESTATECHANGE = 2679050831624843472L;
    public static final long DXTBLFLLOWCONTENT_TBLFLLOWCONTENT = 7659290621499814096L;
    public static final long DXTBLFLLOWCONTENT_TBLIVEDATA = -4433725912444460566L;
    public static final String TAG = DXTBLFllowContentWidgetNode.class.getSimpleName();
    private String mute;
    private JSONObject tbLiveData;
    private vjr tbLiveFllowContentController;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (DXTBLFllowContentWidgetNode.access$000(DXTBLFllowContentWidgetNode.this) != null) {
                if (DXTBLFllowContentWidgetNode.this.getEngine() == null || DXTBLFllowContentWidgetNode.this.getEngine().v() == null || DXTBLFllowContentWidgetNode.this.getEngine().v().e() == null) {
                    str = null;
                } else {
                    str = DXTBLFllowContentWidgetNode.this.getEngine().v().e().getString("global_muted");
                }
                DXTBLFllowContentWidgetNode.access$000(DXTBLFllowContentWidgetNode.this).x(str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements vjr.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.vjr.f
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b2b8c940", new Object[]{this, new Boolean(z)});
                return;
            }
            DXEvent dXEvent = new DXEvent(DXTBLFllowContentWidgetNode.DXTBLFLLOWCONTENT_ONMUTESTATECHANGE);
            HashMap hashMap = new HashMap();
            hashMap.put("mute", mw5.O(String.valueOf(z)));
            dXEvent.setArgs(hashMap);
            DXTBLFllowContentWidgetNode.this.postEvent(dXEvent);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(779092433);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new DXTBLFllowContentWidgetNode();
        }
    }

    static {
        t2o.a(779092430);
        t2o.a(444597112);
    }

    public static /* synthetic */ vjr access$000(DXTBLFllowContentWidgetNode dXTBLFllowContentWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vjr) ipChange.ipc$dispatch("e4f1cf13", new Object[]{dXTBLFllowContentWidgetNode});
        }
        return dXTBLFllowContentWidgetNode.tbLiveFllowContentController;
    }

    public static /* synthetic */ Object ipc$super(DXTBLFllowContentWidgetNode dXTBLFllowContentWidgetNode, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1456812170:
                super.onSetMapAttribute(((Number) objArr[0]).longValue(), (JSONObject) objArr[1]);
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/dinamicext/dinamicx/DXTBLFllowContentWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new DXTBLFllowContentWidgetNode();
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

    @Override // tb.exb
    public void onCanPlay(cxb<?, exb> cxbVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74c767ef", new Object[]{this, cxbVar, str});
            return;
        }
        new StringBuilder("onCanPlay: ").append(hashCode());
        if (getDXRuntimeContext() != null && getDXRuntimeContext().L() != null) {
            getDXRuntimeContext().L().post(new a());
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof DXTBLFllowContentWidgetNode)) {
            super.onClone(dXWidgetNode, z);
            DXTBLFllowContentWidgetNode dXTBLFllowContentWidgetNode = (DXTBLFllowContentWidgetNode) dXWidgetNode;
            this.mute = dXTBLFllowContentWidgetNode.mute;
            this.tbLiveData = dXTBLFllowContentWidgetNode.tbLiveData;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return LayoutInflater.from(context).inflate(R.layout.tbliveuikit_fllow_content_layout, (ViewGroup) null);
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
        if (view != null) {
            vjr vjrVar = new vjr(context, view, this.tbLiveData, this.mute, new b());
            this.tbLiveFllowContentController = vjrVar;
            vjrVar.u();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92acf76", new Object[]{this, new Long(j), jSONObject});
        } else if (j == DXTBLFLLOWCONTENT_TBLIVEDATA) {
            this.tbLiveData = jSONObject;
        } else {
            super.onSetMapAttribute(j, jSONObject);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == 36176011951L) {
            this.mute = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // tb.exb
    public void onShouldStop(cxb<?, exb> cxbVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c812a17e", new Object[]{this, cxbVar, str});
            return;
        }
        new StringBuilder("onShouldStop: ").append(hashCode());
        vjr vjrVar = this.tbLiveFllowContentController;
        if (vjrVar != null) {
            vjrVar.y();
        }
    }
}
