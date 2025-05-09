package com.alibaba.aliweex;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.ui.component.EmbedManager;
import com.taobao.weex.ui.component.IWXEmbed;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.cvw;
import tb.inx;
import tb.kr0;
import tb.ksc;
import tb.npb;
import tb.t2o;
import tb.xuw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AliWXSDKInstance extends WXSDKInstance implements EmbedManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Map<String, IWXEmbed> m0;
    public cvw n0;
    public String o0;
    public final String p0;
    public final ksc q0;
    public final Map<String, Object> r0;

    static {
        t2o.a(85983233);
        t2o.a(985661679);
    }

    public AliWXSDKInstance(String str) {
        this.m0 = new HashMap();
        this.p0 = "AliWXSDKInstance";
        this.r0 = new ConcurrentHashMap();
    }

    public static /* synthetic */ Object ipc$super(AliWXSDKInstance aliWXSDKInstance, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1983604863) {
            super.destroy();
            return null;
        } else if (hashCode == -17468269) {
            super.onActivityDestroy();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/aliweex/AliWXSDKInstance");
        }
    }

    public String D1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6d92e585", new Object[]{this});
        }
        return this.o0;
    }

    public ksc E1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksc) ipChange.ipc$dispatch("2b1746d6", new Object[]{this});
        }
        return this.q0;
    }

    public cvw F1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cvw) ipChange.ipc$dispatch("431f9df4", new Object[]{this});
        }
        return this.n0;
    }

    public final void G1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25acce24", new Object[]{this});
            return;
        }
        npb b = kr0.e().b();
        if (b != null && TextUtils.equals(b.getConfig(this.p0, "reset_mtop_pagename_and_pageurl", "true"), "true")) {
            inx.l("PageName", "");
            inx.l("PageUrl", "");
        }
    }

    public void H1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c80f9f9", new Object[]{this, str});
        } else {
            this.o0 = str;
        }
    }

    public void I1(cvw cvwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2293310", new Object[]{this, cvwVar});
        } else {
            this.n0 = cvwVar;
        }
    }

    @Override // com.taobao.weex.WXSDKInstance
    public synchronized void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        G1();
    }

    @Override // com.taobao.weex.ui.component.EmbedManager
    public IWXEmbed getEmbed(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXEmbed) ipChange.ipc$dispatch("bc959b24", new Object[]{this, str});
        }
        return this.m0.get(str);
    }

    @Deprecated
    public Object getExtra(String str, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("4ab8f58b", new Object[]{this, str, obj}) : getExtra(str);
    }

    @Override // com.taobao.weex.WXSDKInstance, tb.yae
    public void onActivityDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef57493", new Object[]{this});
            return;
        }
        super.onActivityDestroy();
        this.n0 = null;
    }

    @Override // com.taobao.weex.ui.component.EmbedManager
    public void putEmbed(String str, IWXEmbed iWXEmbed) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc7a5fc5", new Object[]{this, str, iWXEmbed});
        } else {
            this.m0.put(str, iWXEmbed);
        }
    }

    public void putExtra(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c83a756e", new Object[]{this, str, obj});
        } else if (!TextUtils.isEmpty(str) && obj != null) {
            this.r0.put(str, obj);
        }
    }

    public void removeExtra(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67551f7d", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.r0.remove(str);
        }
    }

    @Override // com.taobao.weex.WXSDKInstance
    public WXSDKInstance v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("b834091", new Object[]{this});
        }
        AliWXSDKInstance aliWXSDKInstance = new AliWXSDKInstance(getContext(), this.o0);
        aliWXSDKInstance.I1(this.n0);
        return aliWXSDKInstance;
    }

    public Object getExtra(String str) {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("91ec6527", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str) && (map = this.r0) != null) {
            return map.get(str);
        }
        return null;
    }

    public AliWXSDKInstance(Context context, String str) {
        super(context);
        this.m0 = new HashMap();
        this.p0 = "AliWXSDKInstance";
        this.r0 = new ConcurrentHashMap();
        this.q0 = new xuw();
        this.o0 = str;
    }
}
