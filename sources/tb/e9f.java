package tb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.alibaba.android.split.core.plugin.fake.FakeReceiver;
import com.alibaba.android.split.core.plugin.fake.FakeService;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import dalvik.system.PathClassLoader;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class e9f extends PathClassLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final List<String> b = Arrays.asList("com.taobao.agoo.AgooCommondReceiver", "com.taobao.accs.EventReceiver");
    public static final List<String> c = Arrays.asList("com.taobao.weex.WXActivity");

    /* renamed from: a  reason: collision with root package name */
    public final Context f18373a;

    static {
        t2o.a(677380193);
    }

    public e9f(Context context, String str, String str2, ClassLoader classLoader) {
        super(str, str2, classLoader);
        this.f18373a = context;
    }

    public static /* synthetic */ Object ipc$super(e9f e9fVar, String str, Object... objArr) {
        if (str.hashCode() == 2052165949) {
            return super.findClass((String) objArr[0]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/core/plugin/InjectClassLoader");
    }

    public final boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("320d9c2e", new Object[]{this, str})).booleanValue();
        }
        if (c.contains(str)) {
            return true;
        }
        List<ResolveInfo> queryIntentActivities = this.f18373a.getPackageManager().queryIntentActivities(new Intent().setComponent(new ComponentName(this.f18373a, str)), 131072);
        if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
            return false;
        }
        return true;
    }

    public final boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ff72b0e", new Object[]{this, str})).booleanValue();
        }
        if (b.contains(str)) {
            return true;
        }
        List<ResolveInfo> queryBroadcastReceivers = this.f18373a.getPackageManager().queryBroadcastReceivers(new Intent().setComponent(new ComponentName(this.f18373a, str)), 131072);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            return false;
        }
        return true;
    }

    public final boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71868680", new Object[]{this, str})).booleanValue();
        }
        List<ResolveInfo> queryIntentServices = this.f18373a.getPackageManager().queryIntentServices(new Intent().setComponent(new ComponentName(this.f18373a, str)), 131072);
        if (queryIntentServices == null || queryIntentServices.size() <= 0) {
            return false;
        }
        return true;
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public Class<?> findClass(String str) throws ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("7a51913d", new Object[]{this, str});
        }
        if (a(str)) {
            Log.e("InjectClassLoader", str + " is not found, so launcher activity instead!");
            return Class.forName(this.f18373a.getPackageManager().getLaunchIntentForPackage(this.f18373a.getPackageName()).getComponent().getClassName());
        } else if (b(str)) {
            Log.e("InjectClassLoader", str + " is not found, so FakeReceiver instead!");
            return FakeReceiver.class;
        } else if (!c(str)) {
            return super.findClass(str);
        } else {
            Log.e("InjectClassLoader", str + " is not found, so fakeService instead!");
            return FakeService.class;
        }
    }
}
