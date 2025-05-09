package tb;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class s68 extends arg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Context f;

    public s68(sgg sggVar, Instrumentation instrumentation, Context context) {
        super(sggVar, instrumentation);
        this.f = context;
    }

    public static /* synthetic */ Object ipc$super(s68 s68Var, String str, Object... objArr) {
        if (str.hashCode() == -254075091) {
            return super.c((ClassLoader) objArr[0], (String) objArr[1], (Intent) objArr[2]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/bootstrap/tao/ability/EasyGoLifeCycleManagerImpl");
    }

    @Override // tb.arg, tb.xqg
    public Activity c(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("f0db1f2d", new Object[]{this, classLoader, str, intent});
        }
        if (!TextUtils.equals(r68.b(), str)) {
            return super.c(classLoader, str, intent);
        }
        if (intent == null) {
            whh.a("EasyGoLifeCycleManagerImpl", " newActivity intent is null");
            return super.c(classLoader, str, intent);
        }
        ComponentName m = m();
        if (m != null) {
            intent.setClassName(m.getPackageName(), m.getClassName());
            intent.putExtra(r68.c(), "true");
            str = m.getClassName();
            whh.a("EasyGoLifeCycleManagerImpl", " override newActivity  targetActivity: " + m.getClassName());
        }
        return super.c(classLoader, str, intent);
    }

    public final ComponentName m() {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ComponentName) ipChange.ipc$dispatch("3baabf87", new Object[]{this});
        }
        String a2 = r68.a();
        if (TextUtils.isEmpty(a2)) {
            whh.a("EasyGoLifeCycleManagerImpl", " getTargetComponentName targetUrl is null");
            return null;
        }
        try {
            intent = Nav.from(this.f).intentForUri(Uri.parse(a2));
        } catch (Throwable th) {
            whh.a("EasyGoLifeCycleManagerImpl", " getTargetComponentName error " + th.getMessage());
            intent = null;
        }
        if (intent == null) {
            whh.a("EasyGoLifeCycleManagerImpl", " getTargetComponentName newIntent is null");
            return null;
        }
        ComponentName component = intent.getComponent();
        if (component == null) {
            whh.a("EasyGoLifeCycleManagerImpl", " getTargetComponentName targetComponent is null");
            return null;
        }
        String packageName = component.getPackageName();
        String className = component.getClassName();
        if (!TextUtils.isEmpty(packageName) && !TextUtils.isEmpty(className)) {
            return component;
        }
        whh.a("EasyGoLifeCycleManagerImpl", " getTargetComponentName packageName or className is null packageName: " + packageName + " className: " + className);
        return null;
    }
}
