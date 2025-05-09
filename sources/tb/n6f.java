package tb;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.layoutmanager.container.PageRenderIntercept;
import com.taobao.tao.log.TLog;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class n6f extends mss {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String f = "/guangguang/index.htm";
    private static final String g = "/tnode/index.htm";
    private static final String h = "/app/tb-source-app/video-fullpage/pages/index2";
    private static final String i = "cold_launch_tab2";
    private static final String j = "cold_launch_video";
    private static int k = 0;
    private static int l = 1;
    private static int m = 2;
    private static volatile boolean n;
    private int e = -1;

    public n6f(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(n6f n6fVar, String str, Object... objArr) {
        if (str.hashCode() == -1890718817) {
            return new Boolean(super.d((en8) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitTab2ColdLaunchTask");
    }

    private Uri q(xhq xhqVar) {
        Uri data;
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("bedd0a9f", new Object[]{this, xhqVar});
        }
        Intent intent = xhqVar.e;
        if (intent == null || (data = intent.getData()) == null || data.isOpaque()) {
            return null;
        }
        String queryParameter = data.getQueryParameter("h5Url");
        if (!TextUtils.isEmpty(queryParameter) && (parse = Uri.parse(queryParameter)) != null && !parse.isOpaque()) {
            return parse;
        }
        return null;
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82860ee4", new Object[0])).booleanValue();
        }
        return n;
    }

    private boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5377a22", new Object[]{this})).booleanValue();
        }
        int i2 = LauncherRuntime.k;
        if (i2 == 1 || i2 == 2) {
            return true;
        }
        return false;
    }

    private boolean u(Uri uri, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c7e1abc", new Object[]{this, uri, str})).booleanValue();
        }
        if (uri == null) {
            return false;
        }
        if (yrg.e(uri.toString()) == null) {
            return t.a(LauncherRuntime.g, str);
        }
        return true;
    }

    @Override // tb.vct
    public boolean d(en8<String, Void> en8Var) {
        xhq c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f4deb9f", new Object[]{this, en8Var})).booleanValue();
        }
        if (!super.d(en8Var) || (c = ppo.b().c()) == null) {
            return false;
        }
        Uri q = q(c);
        if (t(q) && u(q, i)) {
            this.e = k;
            return true;
        } else if (v(q) && u(q, j)) {
            this.e = m;
            return true;
        } else if (!s()) {
            return false;
        } else {
            this.e = l;
            return true;
        }
    }

    @Override // tb.mss
    public void p(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
            return;
        }
        xhq c = ppo.b().c();
        if (c != null && this.e != -1) {
            HashMap hashMap2 = new HashMap();
            int i2 = this.e;
            if (i2 == k || i2 == m) {
                hashMap2.put("startupUrl", c.h);
                hashMap2.put("startIntent", c.e.getDataString());
            } else if (i2 == l) {
                hashMap2.put("interceptLinkBack", Boolean.TRUE);
            }
            hashMap2.put("taskType", Integer.valueOf(this.e));
            n = true;
            PageRenderIntercept.init(application, hashMap2);
        }
    }

    private boolean t(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b42dcbc6", new Object[]{this, uri})).booleanValue();
        }
        if (uri == null) {
            return false;
        }
        String path = uri.getPath();
        String queryParameter = uri.getQueryParameter("tabid");
        String queryParameter2 = uri.getQueryParameter("skipOpt");
        TLog.loge(erj.MODULE, c(), "path:" + path + " tabId:" + queryParameter + " skpOpt:" + queryParameter2);
        return (TextUtils.equals(path, f) || TextUtils.equals(path, g)) && !TextUtils.equals(queryParameter2, "1");
    }

    private boolean v(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ca25c9c", new Object[]{this, uri})).booleanValue();
        }
        if (uri == null) {
            return false;
        }
        String path = uri.getPath();
        String queryParameter = uri.getQueryParameter("skipOpt");
        TLog.loge(erj.MODULE, c(), "path:" + path + " skpOpt:" + queryParameter);
        return TextUtils.equals(path, "/app/tb-source-app/video-fullpage/pages/index2") && !TextUtils.equals(queryParameter, "1");
    }
}
