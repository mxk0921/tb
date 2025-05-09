package com.taobao.linkmanager.afc.windvane;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.k81;
import tb.kpw;
import tb.ksr;
import tb.t2o;
import tb.vp9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class XbsJsBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_HIDE_TIPS = "hideTips";
    private static final String ACTION_SHOW_TIPS = "resumeTips";
    public static final String CLASSNAME_BC_TIPS = "TBTipsJSBridgeHandler";

    static {
        t2o.a(744489055);
    }

    public static /* synthetic */ Object ipc$super(XbsJsBridge xbsJsBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/linkmanager/afc/windvane/XbsJsBridge");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (str == null) {
            vp9.b("linkx", "showXbs : action is null");
            return false;
        } else if (str.equals("hideTips")) {
            ksr.a();
            return true;
        } else if (!str.equals(ACTION_SHOW_TIPS) || k81.c().f22459a == null) {
            vp9.b("linkx", "XbsJsBridge === showXbs : no action is match");
            return false;
        } else {
            ksr.b(k81.c().f22459a.get());
            return true;
        }
    }
}
