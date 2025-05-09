package com.alibaba.flexa.compat;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.split.SplitFileInfo;
import com.alibaba.android.split.core.internal.InternalHacker;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.aa1;
import tb.acq;
import tb.e9f;
import tb.fa1;
import tb.fwt;
import tb.g9m;
import tb.jvc;
import tb.obq;
import tb.qcq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class FlexaApplication extends Application {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<String, String> sActivityMap;
    private Object activityThread;
    private Field allApplications_field;
    private Class clazzStyle;
    private Field instruction_field;
    public aa1 mApplicationCompat;
    private Context mBase;
    private Application pluginApplication;
    public boolean pluginInstalled;
    private fwt timing = new fwt(FlexaApplication.class.getSimpleName());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class SafelyInstrumention extends Instrumentation {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public SafelyInstrumention() {
        }

        public static /* synthetic */ Object ipc$super(SafelyInstrumention safelyInstrumention, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1330221517) {
                super.callActivityOnCreate((Activity) objArr[0], (Bundle) objArr[1]);
                return null;
            } else if (hashCode == -254075091) {
                return super.newActivity((ClassLoader) objArr[0], (String) objArr[1], (Intent) objArr[2]);
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/flexa/compat/FlexaApplication$SafelyInstrumention");
            }
        }

        public final int a(String str) {
            try {
                Field declaredField = FlexaApplication.access$600(FlexaApplication.this).getDeclaredField(str);
                declaredField.setAccessible(true);
                return ((Integer) declaredField.get(null)).intValue();
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        }

        @Override // android.app.Instrumentation
        public void callActivityOnCreate(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0b66e33", new Object[]{this, activity, bundle});
                return;
            }
            if (!TextUtils.isEmpty(FlexaApplication.this.getTheme(activity.getClass().getName()))) {
                FlexaApplication flexaApplication = FlexaApplication.this;
                if (flexaApplication.pluginInstalled) {
                    String theme = flexaApplication.getTheme(activity.getClass().getName());
                    if (!TextUtils.isEmpty(theme)) {
                        activity.setTheme(a(theme));
                    }
                }
            }
            FlexaApplication flexaApplication2 = FlexaApplication.this;
            if (!flexaApplication2.pluginInstalled || !g9m.a(FlexaApplication.access$200(flexaApplication2))) {
                super.callActivityOnCreate(activity, bundle);
            } else {
                super.callActivityOnCreate(activity, null);
            }
        }

        @Override // android.app.Instrumentation
        public Activity newActivity(ClassLoader classLoader, String str, Intent intent) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
            Class<?> cls;
            FlexaApplication flexaApplication = FlexaApplication.this;
            if (flexaApplication.pluginInstalled) {
                if (str.equalsIgnoreCase(FlexaApplication.access$300(flexaApplication, FlexaApplication.access$200(flexaApplication)))) {
                    intent.setComponent(new ComponentName(FlexaApplication.access$200(flexaApplication).getPackageName(), flexaApplication.getPluginLauncherClassName()));
                    return (Activity) classLoader.loadClass(flexaApplication.getPluginLauncherClassName()).newInstance();
                } else if (flexaApplication.getRealActivityNameAfterInstall(str).equals(str)) {
                    return super.newActivity(classLoader, str, intent);
                } else {
                    String realActivityNameAfterInstall = flexaApplication.getRealActivityNameAfterInstall(str);
                    intent.setComponent(new ComponentName(FlexaApplication.access$200(flexaApplication).getPackageName(), realActivityNameAfterInstall));
                    return (Activity) classLoader.loadClass(realActivityNameAfterInstall).newInstance();
                }
            } else if (FlexaApplication.access$400().values().contains(str)) {
                intent.setComponent(new ComponentName(FlexaApplication.access$200(flexaApplication).getPackageName(), FlexaApplication.access$500(flexaApplication, str)));
                return (Activity) classLoader.loadClass(FlexaApplication.access$500(flexaApplication, str)).newInstance();
            } else {
                try {
                    cls = classLoader.loadClass(str);
                } catch (Exception e) {
                    e.printStackTrace();
                    cls = null;
                }
                if (cls != null) {
                    return (Activity) cls.newInstance();
                }
                intent.setComponent(new ComponentName(FlexaApplication.access$200(flexaApplication).getPackageName(), FlexaApplication.access$300(flexaApplication, FlexaApplication.access$200(flexaApplication))));
                return (Activity) classLoader.loadClass(FlexaApplication.access$300(flexaApplication, FlexaApplication.access$200(flexaApplication))).newInstance();
            }
        }

        @Override // android.app.Instrumentation
        public boolean onException(Object obj, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1d775c06", new Object[]{this, obj, th})).booleanValue();
            }
            Log.e("SafelyInstrumention", "Throwable--------", th);
            return true;
        }

        public /* synthetic */ SafelyInstrumention(FlexaApplication flexaApplication, a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements qcq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(FlexaApplication flexaApplication) {
        }

        @Override // tb.qcq
        public SplitFileInfo a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SplitFileInfo) ipChange.ipc$dispatch("6bb1e295", new Object[]{this, str});
            }
            if (!str.equals(acq.PLUGIN_NAME)) {
                return new SplitFileInfo();
            }
            SplitFileInfo splitFileInfo = new SplitFileInfo();
            splitFileInfo.url = "https://mtl4.alibaba-inc.com/scheduler/jobs/403568/artifacts/0664fbd3a04243098493c8c8657c4916/download/600000%40taobao_android_10.2.10.99.apk";
            splitFileInfo.md5 = "1bde5b0a93ec6c8ca97acebd888b8e51";
            splitFileInfo.fileSize = 111589764L;
            splitFileInfo.splitName = acq.PLUGIN_NAME;
            return splitFileInfo;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements jvc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private b() {
        }

        @Override // tb.jvc
        public void a(String str, boolean z, String str2, long j, int i, String str3, String str4, long j2, long j3, long j4, boolean z2, boolean z3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7e0d97b", new Object[]{this, str, new Boolean(z), str2, new Long(j), new Integer(i), str3, str4, new Long(j2), new Long(j3), new Long(j4), new Boolean(z2), new Boolean(z3)});
            }
        }

        @Override // tb.jvc
        public void b(String str, boolean z, String str2, long j, int i, String str3, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("22b6cac5", new Object[]{this, str, new Boolean(z), str2, new Long(j), new Integer(i), str3, new Long(j2)});
            }
        }

        @Override // tb.jvc
        public void c(String str, boolean z, int i, long j, int i2, String str2, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3de53244", new Object[]{this, str, new Boolean(z), new Integer(i), new Long(j), new Integer(i2), str2, new Long(j2)});
            }
        }

        public /* synthetic */ b(FlexaApplication flexaApplication, a aVar) {
            this();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        sActivityMap = hashMap;
        hashMap.put("com.taobao.base.h5.BrowserActivity", "com.taobao.browser.BrowserActivity");
        sActivityMap.put("com.taobao.taobao.MiniActivity", obq.BIZ_NAME);
        sActivityMap.put("com.taobao.minisearch.searchdoor.SearchDoorActivity", "com.taobao.search.searchdoor.SearchDoorActivity");
        sActivityMap.put("com.taobao.minisearch.searchresult.SearchResultActivity", "com.taobao.search.sf.MainSearchResultActivity");
    }

    public static /* synthetic */ Context access$200(FlexaApplication flexaApplication) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("d9017313", new Object[]{flexaApplication});
        }
        return flexaApplication.mBase;
    }

    public static /* synthetic */ String access$300(FlexaApplication flexaApplication, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5826492", new Object[]{flexaApplication, context});
        }
        return flexaApplication.getLauncherClassName(context);
    }

    public static /* synthetic */ Map access$400() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fb521370", new Object[0]);
        }
        return sActivityMap;
    }

    public static /* synthetic */ String access$500(FlexaApplication flexaApplication, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a5c07d9e", new Object[]{flexaApplication, str});
        }
        return flexaApplication.getRealActivityNameBeforeInstall(str);
    }

    public static /* synthetic */ Class access$600(FlexaApplication flexaApplication) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("26b81044", new Object[]{flexaApplication});
        }
        return flexaApplication.clazzStyle;
    }

    private void downGrade() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbd9925c", new Object[]{this});
            return;
        }
        try {
            acq.p().L();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String getLauncherClassName(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eefd3e8c", new Object[]{this, context});
        }
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            return "";
        }
        Log.e("FlexaApplication", "launcher ActivityName:" + launchIntentForPackage.getComponent().getClassName());
        return launchIntentForPackage.getComponent().getClassName();
    }

    private String getRealActivityNameBeforeInstall(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63c1b921", new Object[]{this, str});
        }
        for (Map.Entry<String, String> entry : sActivityMap.entrySet()) {
            if (entry.getValue().equals(str)) {
                return entry.getKey();
            }
        }
        return "";
    }

    public static /* synthetic */ Object ipc$super(FlexaApplication flexaApplication, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 413640386) {
            super.onCreate();
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/flexa/compat/FlexaApplication");
        }
    }

    private boolean isEmulated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a19d826", new Object[]{this})).booleanValue();
        }
        try {
            return acq.p().E(acq.PLUGIN_NAME);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private boolean isMarkEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("823947b5", new Object[]{this})).booleanValue();
        }
        try {
            return acq.p().H();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private void markEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5373d63b", new Object[]{this});
        } else {
            acq.p().M();
        }
    }

    private void rollBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a52d58b", new Object[]{this});
            return;
        }
        try {
            acq.p().P();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setComponentsState(List<ComponentInfo> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c2aa5d2", new Object[]{this, list, new Integer(i)});
            return;
        }
        for (ComponentInfo componentInfo : list) {
            ComponentName componentName = new ComponentName(componentInfo.packageName, componentInfo.name);
            if (getPackageManager().getComponentEnabledSetting(componentName) != i) {
                getPackageManager().setComponentEnabledSetting(componentName, i, 1);
            }
        }
    }

    public void disableComponents(Context context, List<ComponentInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6920b4", new Object[]{this, context, list});
        } else {
            setComponentsState(list, 2);
        }
    }

    public abstract void disableComponentsAfterInstalled(Context context);

    public void enableComponents(Context context, List<ComponentInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c1c0bb9", new Object[]{this, context, list});
        } else {
            setComponentsState(list, 1);
        }
    }

    public abstract void enableComponentsAfterInstalled(Context context);

    public abstract void enableComponentsBeforeInstalled(Context context);

    public abstract String getPluginAppliactionClassName();

    public abstract String getPluginLauncherClassName();

    public String getPluginVersionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ceb6e19f", new Object[]{this});
        }
        return "10.4.0";
    }

    public String getRealActivityNameAfterInstall(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ff1393e2", new Object[]{this, str});
        }
        if (sActivityMap.containsKey(str)) {
            return sActivityMap.get(str);
        }
        return str;
    }

    public abstract String getTheme(String str);

    public void initFlexa(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("991b87c9", new Object[]{this, context});
        } else {
            com.alibaba.flexa.compat.a.b(context).f(new b(this, null)).g(new a(this)).d(false).c(true).a();
        }
    }

    public boolean installAppPlugin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56384164", new Object[]{this})).booleanValue();
        }
        return acq.z(this);
    }

    public abstract boolean shouldDownGradeAfterInstalled();

    public abstract boolean shouldRollBackAfterInstalled();

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        boolean z = false;
        boolean z2 = true;
        super.attachBaseContext(context);
        this.timing.b("attachBaseContext");
        this.mBase = context;
        try {
            this.instruction_field = InternalHacker.getInstrumentationField();
            this.allApplications_field = InternalHacker.getAllApplicationField();
            Object activityThread = InternalHacker.getActivityThread(context);
            this.activityThread = activityThread;
            this.instruction_field.set(activityThread, new SafelyInstrumention(this, null));
            this.mApplicationCompat = (aa1) Class.forName(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("COMPAT_APPLICATION")).getDeclaredConstructor(Application.class).newInstance(this);
            initFlexa(context);
            if (isEmulated() && acq.G(this.mBase)) {
                z = shouldDownGradeAfterInstalled();
                if (z) {
                    downGrade();
                }
                if (shouldRollBackAfterInstalled()) {
                    rollBack();
                }
            }
            this.timing.b("installAppPlugin");
            if (!acq.G(this.mBase)) {
                z2 = isMarkEnabled();
            }
            if (!z && z2) {
                this.pluginInstalled = installAppPlugin();
            }
            this.timing.c();
            this.timing.b("other");
            if (this.pluginInstalled && acq.G(this.mBase)) {
                disableComponentsAfterInstalled(context);
                enableComponentsAfterInstalled(context);
                markEnabled();
            } else if (acq.G(this.mBase)) {
                enableComponentsBeforeInstalled(context);
            }
            if (this.pluginInstalled) {
                context.getApplicationInfo().nativeLibraryDir = fa1.f19136a;
                InternalHacker.clearProviders(context);
                DelegatePM.sProxyVersionName = getPluginVersionName();
            } else {
                if (acq.p() != null) {
                    acq p = acq.p();
                    Context context2 = this.mBase;
                    Context context3 = this.mBase;
                    p.O(context2, new e9f(context3, ":", null, context3.getClassLoader()));
                }
                this.mApplicationCompat.a(context);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.timing.c();
        this.timing.c();
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        this.timing.b("onCreate");
        if (this.pluginInstalled) {
            try {
                ClassLoader classLoader = getClassLoader();
                this.clazzStyle = classLoader.loadClass(getPackageName() + ".R$style");
                this.pluginApplication = (Application) getClassLoader().loadClass(getPluginAppliactionClassName()).newInstance();
                Method declaredMethod = Class.forName("android.app.ContextImpl").getDeclaredMethod("setOuterContext", Context.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(getBaseContext(), this.pluginApplication);
                this.timing.b("initApplication");
                InternalHacker.initApplication(this.pluginApplication, getPackageName());
                this.timing.c();
                List list = (List) this.allApplications_field.get(this.activityThread);
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        break;
                    } else if (list.get(i) == this) {
                        list.set(i, this.pluginApplication);
                        break;
                    } else {
                        i++;
                    }
                }
                Method declaredMethod2 = Application.class.getDeclaredMethod(Constants.Event.SLOT_LIFECYCLE.ATTACH, Context.class);
                declaredMethod2.setAccessible(true);
                this.timing.b("pluginApplication-attach");
                declaredMethod2.invoke(this.pluginApplication, getBaseContext());
                this.timing.c();
                this.timing.b("installProviders");
                InternalHacker.installProviders(this.pluginApplication);
                this.timing.c();
                this.timing.b("pluginApplication-onCreate");
                this.pluginApplication.onCreate();
                this.timing.c();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            this.mApplicationCompat.b();
        }
        this.timing.c();
        this.timing.d();
    }
}
