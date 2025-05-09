package com.taobao.search.musie.web;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.ui.MUSNodeProp;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import java.util.Map;
import tb.a07;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class MusWeb extends UINode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ATTR_DISABLE_TOUCH = "disableTouch";
    public static final String ATTR_SRC = "src";
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815792802);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792801);
    }

    public MusWeb(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(MusWeb musWeb, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -939675523) {
            super.refreshAttribute((Map) objArr[0]);
            return null;
        } else if (hashCode == -285278287) {
            super.onMount((MUSDKInstance) objArr[0], objArr[1]);
            return null;
        } else if (hashCode == -136526582) {
            super.onUnmount((MUSDKInstance) objArr[0], objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/musie/web/MusWeb");
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
        return new MusWebViewHost(context);
    }

    @Override // tb.hvu
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onMount(mUSDKInstance, obj);
        mountContent(obj);
    }

    @Override // tb.hvu
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        MusWebViewHost musWebViewHost;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onUnmount(mUSDKInstance, obj);
        if (obj instanceof MusWebViewHost) {
            musWebViewHost = (MusWebViewHost) obj;
        } else {
            musWebViewHost = null;
        }
        if (musWebViewHost != null) {
            musWebViewHost.unMount();
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void refreshAttribute(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7fdb07d", new Object[]{this, map});
            return;
        }
        ckf.g(map, "attributes");
        super.refreshAttribute(map);
        mountContent(getMountContent());
    }

    @MUSNodeProp(name = ATTR_DISABLE_TOUCH, refresh = true)
    public final void refreshDisableTouch(Boolean bool) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bafb74", new Object[]{this, bool});
            return;
        }
        MusWebViewHost musWebViewHost = (MusWebViewHost) getMountContent();
        if (bool != null) {
            z = bool.booleanValue();
        }
        musWebViewHost.setDisableTouch(z);
    }

    @MUSNodeProp(name = ATTR_DISABLE_TOUCH)
    public final void setDisableTouch(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b669ec8d", new Object[]{this, bool});
        } else {
            setAttribute(ATTR_DISABLE_TOUCH, bool);
        }
    }

    @MUSNodeProp(name = "src")
    public final void setSrc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbfab33", new Object[]{this, str});
            return;
        }
        ckf.g(str, "src");
        setAttribute("src", str);
    }

    private final void mountContent(Object obj) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68c91ac3", new Object[]{this, obj});
            return;
        }
        String str = (String) getAttribute("src");
        if (!TextUtils.isEmpty(str)) {
            MusWebViewHost musWebViewHost = obj instanceof MusWebViewHost ? (MusWebViewHost) obj : null;
            if (musWebViewHost != null) {
                ckf.d(str);
                musWebViewHost.mount(str);
                Boolean bool = (Boolean) getAttribute(ATTR_DISABLE_TOUCH);
                if (bool != null) {
                    z = bool.booleanValue();
                }
                musWebViewHost.setDisableTouch(z);
            }
        }
    }
}
