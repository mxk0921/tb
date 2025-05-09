package tb;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.tao.log.TLog;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class r6f extends mss {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String f = "/taolive/video.html";
    private static final String g = "/taolive/main.html";
    private boolean e = false;

    public r6f(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(r6f r6fVar, String str, Object... objArr) {
        if (str.hashCode() == -1890718817) {
            return new Boolean(super.d((en8) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitTaoLiveColdLaunchTask");
    }

    private boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5377a22", new Object[]{this})).booleanValue();
        }
        int i = LauncherRuntime.k;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    private boolean r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5badb0ea", new Object[]{this, str})).booleanValue();
        }
        if (yrg.e(str) == null) {
            return false;
        }
        return true;
    }

    @Override // tb.vct
    public boolean d(en8<String, Void> en8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f4deb9f", new Object[]{this, en8Var})).booleanValue();
        }
        boolean d = super.d(en8Var);
        if (!d) {
            return false;
        }
        xhq c = ppo.b().c();
        if (c != null) {
            return s(c);
        }
        return d;
    }

    @Override // tb.mss
    public void p(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
            return;
        }
        xhq c = ppo.b().c();
        if (c != null) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("startupUrl", c.h);
            hashMap2.put("startIntent", c.e.getDataString());
            hashMap2.put("isLinkLaunch", Boolean.valueOf(this.e));
            q6f.e(application, hashMap2);
        }
    }

    private boolean s(xhq xhqVar) {
        Uri data;
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae23fc11", new Object[]{this, xhqVar})).booleanValue();
        }
        Intent intent = xhqVar.e;
        if (intent == null || (data = intent.getData()) == null || data.isOpaque()) {
            return false;
        }
        String g2 = bqg.g(data);
        if (TextUtils.isEmpty(g2) || (parse = Uri.parse(g2)) == null) {
            return false;
        }
        String path = parse.getPath();
        TLog.loge(erj.MODULE, c(), "path:" + path);
        this.e = false;
        if (TextUtils.equals(path, "/taolive/video.html") && r(g2)) {
            return true;
        }
        if (TextUtils.equals(path, g) && r(g2)) {
            String queryParameter = parse.getQueryParameter("channelType");
            String queryParameter2 = parse.getQueryParameter("liveHomePageType");
            return "jingxuan,singleLiveTab".equals(queryParameter) && ("mixLiveAndTab".equals(queryParameter2) || "mixLive".equals(queryParameter2));
        } else if (!q()) {
            return false;
        } else {
            this.e = true;
            return true;
        }
    }
}
