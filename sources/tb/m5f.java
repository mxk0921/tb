package tb;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class m5f extends mss {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String e = "/h5";
    private static final String f = "s.m.taobao.com";

    public m5f(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(m5f m5fVar, String str, Object... objArr) {
        if (str.hashCode() == -1890718817) {
            return new Boolean(super.d((en8) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitSearchColdLaunchTask");
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
            return q(c);
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
            q4p.a(application, hashMap2);
        }
    }

    private boolean q(xhq xhqVar) {
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
        String queryParameter = data.getQueryParameter("h5Url");
        if (TextUtils.isEmpty(queryParameter) || yrg.e(queryParameter) == null || (parse = Uri.parse(queryParameter)) == null) {
            return false;
        }
        return TextUtils.equals(parse.getHost(), f) && TextUtils.equals(parse.getPath(), e);
    }
}
