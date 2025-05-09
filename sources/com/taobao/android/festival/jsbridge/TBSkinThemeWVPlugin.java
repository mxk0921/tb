package com.taobao.android.festival.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.skin.SkinConfig;
import tb.g1q;
import tb.k1q;
import tb.kpw;
import tb.nsw;
import tb.t2o;
import tb.tpw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TBSkinThemeWVPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(464519226);
    }

    public static /* synthetic */ Object ipc$super(TBSkinThemeWVPlugin tBSkinThemeWVPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/festival/jsbridge/TBSkinThemeWVPlugin");
    }

    public boolean downloadSkin(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ecd972f7", new Object[]{this, wVCallBackContext, str})).booleanValue();
        }
        g1q.h().c(str, new tpw(wVCallBackContext));
        return true;
    }

    public boolean setCurrentSkin(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8dc5fae6", new Object[]{this, wVCallBackContext, str})).booleanValue();
        }
        g1q.h().p(str, new tpw(wVCallBackContext));
        return true;
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("getCurrentSkinInfo".equals(str)) {
            return getCurrentSkinInfo(wVCallBackContext, str2);
        }
        if ("setCurrentSkin".equals(str)) {
            return setCurrentSkin(wVCallBackContext, str2);
        }
        if ("downloadSkin".equals(str)) {
            return downloadSkin(wVCallBackContext, str2);
        }
        nsw nswVar = new nsw();
        nswVar.b("errorMsg", "no matched method");
        wVCallBackContext.error(nswVar);
        return false;
    }

    public boolean getCurrentSkinInfo(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e65c77c0", new Object[]{this, wVCallBackContext, str})).booleanValue();
        }
        SkinConfig o = k1q.q().o();
        if (o == null || !o.isValidConfig()) {
            nsw nswVar = new nsw();
            nswVar.b("errorMsg", "no selected skin");
            wVCallBackContext.error(nswVar);
            return false;
        }
        nsw nswVar2 = new nsw();
        nswVar2.b("msg", JSON.toJSONString(o));
        wVCallBackContext.success(nswVar2);
        return true;
    }
}
