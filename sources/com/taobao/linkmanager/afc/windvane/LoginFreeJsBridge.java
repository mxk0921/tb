package com.taobao.linkmanager.afc.windvane;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.linkmanager.afc.utils.LinkLoginUtils;
import com.taobao.linkmanager.launcher.TbFcLinkInit;
import tb.kpw;
import tb.noc;
import tb.t2o;
import tb.vg0;
import tb.vp9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LoginFreeJsBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION = "loginFree";
    public static final String NAME = "LoginFreeHandler";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements noc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(LoginFreeJsBridge loginFreeJsBridge) {
        }

        @Override // tb.noc
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f0db772e", new Object[]{this});
            } else {
                WVStandardEventCenter.postNotificationToJS("is_login_success", "false");
            }
        }

        @Override // tb.noc
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39ba37e1", new Object[]{this});
            } else {
                WVStandardEventCenter.postNotificationToJS("is_login_success", "true");
            }
        }
    }

    static {
        t2o.a(744489053);
    }

    public static /* synthetic */ Object ipc$super(LoginFreeJsBridge loginFreeJsBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/linkmanager/afc/windvane/LoginFreeJsBridge");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (TextUtils.equals(str, ACTION)) {
            vp9.a("linkx", "LoginFreeJsBridge === execute === js调用免登");
            String b = vg0.c().b("is_js_login_open", "true");
            if (TextUtils.equals("false", b)) {
                vp9.a("linkx", "LoginFreeJsBridge === execute === js调用免登：" + b);
                return false;
            }
            LinkLoginUtils.a(TbFcLinkInit.instance().mApplication, new a(this));
        }
        return true;
    }
}
