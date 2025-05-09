package com.taobao.android.festival.jsbridge;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.skin.SkinConfig;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.common.WXModuleAnno;
import java.io.Serializable;
import tb.g1q;
import tb.k1q;
import tb.t2o;
import tb.xtw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TBSkinThemeWXModule extends WXModule implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TBSkinThemeWXModule";

    static {
        t2o.a(464519227);
    }

    public static /* synthetic */ Object ipc$super(TBSkinThemeWXModule tBSkinThemeWXModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/festival/jsbridge/TBSkinThemeWXModule");
    }

    @WXModuleAnno
    public void downloadSkin(String str, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d499dd2", new Object[]{this, str, jSCallback});
        } else {
            g1q.h().c(str, new xtw(jSCallback, this.mWXSDKInstance.getContext()));
        }
    }

    @WXModuleAnno
    public void getCurrentSkin(JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee6ba141", new Object[]{this, jSCallback});
            return;
        }
        xtw xtwVar = new xtw(jSCallback, this.mWXSDKInstance.getContext());
        SkinConfig o = k1q.q().o();
        if (o == null || !o.isValidConfig()) {
            xtwVar.onError("", "NO_SKIN", "no selected skin");
        } else {
            xtwVar.onSuccess(JSON.toJSONString(o));
        }
    }

    @WXModuleAnno
    public void setCurrentSkin(String str, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52c15e03", new Object[]{this, str, jSCallback});
        } else {
            g1q.h().p(str, new xtw(jSCallback, this.mWXSDKInstance.getContext()));
        }
    }
}
