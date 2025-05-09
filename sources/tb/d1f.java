package tb;

import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.login4android.api.Login;
import com.taobao.message.kit.util.BundleSplitUtil;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class d1f extends mss {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String e = "/taolive/video.html";

    public d1f(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(d1f d1fVar, String str, Object... objArr) {
        if (str.hashCode() == -1890718817) {
            return new Boolean(super.d((en8) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitLinkLogin");
    }

    private boolean q(xhq xhqVar) {
        Uri data;
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3484bb74", new Object[]{this, xhqVar})).booleanValue();
        }
        Intent intent = xhqVar.e;
        if (intent == null || (data = intent.getData()) == null || data.isOpaque()) {
            return false;
        }
        String queryParameter = data.getQueryParameter("h5Url");
        if (TextUtils.isEmpty(queryParameter) || yrg.e(queryParameter) == null || (parse = Uri.parse(queryParameter)) == null) {
            return false;
        }
        return TextUtils.equals(parse.getPath(), "/taolive/video.html");
    }

    private boolean r(xhq xhqVar) {
        ComponentName component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70cb2028", new Object[]{this, xhqVar})).booleanValue();
        }
        Intent intent = xhqVar.e;
        if (intent == null || (component = intent.getComponent()) == null) {
            return false;
        }
        if ("com.taobao.tao.msgcenter.activity.MsgCenterThirdPushActivity".equals(component.getClassName()) || BundleSplitUtil.ACTIVITY_NAME.equals(component.getClassName())) {
            return t.a(LauncherRuntime.g, "link_push_launch");
        }
        return false;
    }

    @Override // tb.vct
    public boolean d(en8<String, Void> en8Var) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f4deb9f", new Object[]{this, en8Var})).booleanValue();
        }
        boolean d = super.d(en8Var);
        if (!d) {
            return false;
        }
        xhq c = ppo.b().c();
        if (c == null) {
            return d;
        }
        if (!q(c) && !r(c)) {
            z = false;
        }
        return z;
    }

    @Override // tb.mss
    public void p(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
        } else if (!Login.checkSessionValid()) {
            Login.triggerLoginBundle();
        }
    }
}
