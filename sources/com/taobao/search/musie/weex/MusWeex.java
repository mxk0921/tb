package com.taobao.search.musie.weex;

import android.content.Context;
import android.graphics.Point;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.ui.MUSNodeProp;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import tb.a07;
import tb.ckf;
import tb.hfn;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class MusWeex extends UINode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ATTR_DATA = "data";
    public static final String ATTR_SCRIPT_URL = "scriptUrl";
    public static final a Companion = new a(null);
    private final Point measureResult = new Point();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815792806);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792805);
    }

    public MusWeex(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(MusWeex musWeex, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -940796597) {
            super.unmount((MUSDKInstance) objArr[0], objArr[1]);
            return null;
        } else if (hashCode == -285278287) {
            super.onMount((MUSDKInstance) objArr[0], objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/musie/weex/MusWeex");
        }
    }

    @Override // tb.hvu
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this});
        }
        return UINodeType.VIEW;
    }

    @Override // tb.hvu
    public Object onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context});
        }
        ckf.d(context);
        return new MusWeexHost(context);
    }

    @Override // tb.hvu
    public void onMeasure(int i, int i2, int i3, int i4, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dab21ed4", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr});
        } else if (iArr != null) {
            if (i3 == 1073741824) {
                iArr[0] = i;
            } else {
                iArr[0] = hfn.c(i, this.measureResult.x);
            }
            if (i4 == 1073741824) {
                iArr[1] = i2;
            } else {
                iArr[1] = this.measureResult.y;
            }
        }
    }

    @Override // tb.hvu
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onMount(mUSDKInstance, obj);
        MusWeexHost musWeexHost = obj instanceof MusWeexHost ? (MusWeexHost) obj : null;
        if (musWeexHost != null) {
            musWeexHost.mount(this, (String) getAttribute("scriptUrl"), (JSONObject) getAttribute("data"), this.measureResult);
        }
    }

    @MUSNodeProp(name = "data")
    public final void setData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09acf9d", new Object[]{this, jSONObject});
            return;
        }
        ckf.g(jSONObject, "data");
        setAttribute("data", jSONObject);
    }

    @MUSNodeProp(name = "scriptUrl")
    public final void setScriptUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31425b73", new Object[]{this, str});
            return;
        }
        ckf.g(str, "scriptUrl");
        setAttribute("scriptUrl", str);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode, tb.hvu
    public void unmount(MUSDKInstance mUSDKInstance, Object obj) {
        MusWeexHost musWeexHost;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7ec954b", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.unmount(mUSDKInstance, obj);
        if (obj instanceof MusWeexHost) {
            musWeexHost = (MusWeexHost) obj;
        } else {
            musWeexHost = null;
        }
        if (musWeexHost != null) {
            musWeexHost.unMount();
        }
    }
}
