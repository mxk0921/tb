package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class CoreComponentFactory extends AppComponentFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface CompatWrapped {
        Object getWrapper();
    }

    public static <T> T checkCompatWrapper(T t) {
        T t2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("b3ccae46", new Object[]{t});
        }
        if (!(t instanceof CompatWrapped) || (t2 = (T) ((CompatWrapped) t).getWrapper()) == null) {
            return t;
        }
        return t2;
    }

    public static /* synthetic */ Object ipc$super(CoreComponentFactory coreComponentFactory, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1333100599:
                return super.instantiateService((ClassLoader) objArr[0], (String) objArr[1], (Intent) objArr[2]);
            case -1129644650:
                return super.instantiateApplication((ClassLoader) objArr[0], (String) objArr[1]);
            case -1062134232:
                return super.instantiateReceiver((ClassLoader) objArr[0], (String) objArr[1], (Intent) objArr[2]);
            case 16826479:
                return super.instantiateProvider((ClassLoader) objArr[0], (String) objArr[1]);
            case 1582749175:
                return super.instantiateActivity((ClassLoader) objArr[0], (String) objArr[1], (Intent) objArr[2]);
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/app/CoreComponentFactory");
        }
    }

    @Override // android.app.AppComponentFactory
    public Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("5e56d5f7", new Object[]{this, classLoader, str, intent});
        }
        return (Activity) checkCompatWrapper(super.instantiateActivity(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    public Application instantiateApplication(ClassLoader classLoader, String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("bcaafd96", new Object[]{this, classLoader, str});
        }
        return (Application) checkCompatWrapper(super.instantiateApplication(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    public ContentProvider instantiateProvider(ClassLoader classLoader, String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentProvider) ipChange.ipc$dispatch("100c06f", new Object[]{this, classLoader, str});
        }
        return (ContentProvider) checkCompatWrapper(super.instantiateProvider(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    public BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BroadcastReceiver) ipChange.ipc$dispatch("c0b11e28", new Object[]{this, classLoader, str, intent});
        }
        return (BroadcastReceiver) checkCompatWrapper(super.instantiateReceiver(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    public Service instantiateService(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Service) ipChange.ipc$dispatch("b08a7fc9", new Object[]{this, classLoader, str, intent});
        }
        return (Service) checkCompatWrapper(super.instantiateService(classLoader, str, intent));
    }
}
