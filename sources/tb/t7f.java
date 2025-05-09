package tb;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.LinkRule;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class t7f extends bxk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public t7f(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(t7f t7fVar, String str, Object... objArr) {
        if (str.hashCode() == -1890718817) {
            return new Boolean(super.d((en8) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitURLRewrite");
    }

    private String q(Context context, Intent intent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a4fd6e4", new Object[]{this, context, intent});
        }
        Uri data = intent.getData();
        if (data == null) {
            return "";
        }
        String i = TFCCommonUtils.i(data.toString());
        if (!LauncherRuntime.o) {
            return i;
        }
        ComponentName component = intent.getComponent();
        if (component == null) {
            return i;
        }
        Pair<LinkRule, ComponentName> l = yrg.l(context, component.getPackageName(), data);
        ComponentName componentName = l.second;
        LinkRule linkRule = l.first;
        if (linkRule == null) {
            str = null;
        } else {
            str = linkRule.name;
        }
        if (vrg.a(LauncherRuntime.h, componentName)) {
            intent.setComponent(componentName).putExtra("cold_startup_h5", true).putExtra("__link_module_name__", str);
        }
        return i;
    }

    @Override // tb.bxk, tb.vct
    public boolean d(en8<String, Void> en8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f4deb9f", new Object[]{this, en8Var})).booleanValue();
        }
        boolean d = super.d(en8Var);
        if (d) {
            return vrg.b(LauncherRuntime.g);
        }
        return d;
    }

    @Override // tb.bxk, tb.mss
    public void p(Application application, HashMap<String, Object> hashMap) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
            return;
        }
        xhq d = LauncherRuntime.d();
        if (d != null && d.f31405a && (intent = d.e) != null) {
            d.h = q(application, intent);
        }
    }
}
