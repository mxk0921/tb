package com.taobao.login4android.init;

import android.app.Application;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.appbundle.a;
import com.taobao.login4android.TaoBaoLoginInitializer;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.tao.TaobaoApplication;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.HashMap;
import tb.t2o;
import tb.t5r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class LoginInitializer implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String PARAM_FORCE_THREAD = "loginScheduleAsync";
    private static final String TAG = "login.LoginInitializer1";

    static {
        t2o.a(517996585);
    }

    private void registerFeatureComponentLoader(final Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8a8f13b", new Object[]{this, application});
            return;
        }
        try {
            if (LoginSwitch.getSwitch("login_init_register_component_loader", "true")) {
                LoginTLogAdapter.trace(TAG, "registerFeatureComponentLoader: ");
                a.Companion.a().p("login4taobao", new a.c() { // from class: com.taobao.login4android.init.LoginInitializer.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.appbundle.a.c
                    public void onFeatureComponentLoaded(String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("334c129c", new Object[]{this, str});
                            return;
                        }
                        LoginTLogAdapter.trace(LoginInitializer.TAG, "onFeatureComponentLoaded() called with: componentName = [" + str + "]");
                        TaoBaoLoginInitializer.init(application);
                        UserTrackAdapter.sendUserTrack(UTConstant.PageName.UT_PAGE_EXTEND, "login_init_component_loaded", null);
                    }
                });
            }
        } catch (Exception e) {
            LoginTLogAdapter.trace(TAG, "registerFeatureComponentLoader: ", e);
        }
    }

    private void tryToAttachDebugTools(Application application) {
        try {
            Method declaredMethod = Class.forName("com.taobao.login4android.debugtools.DebugToolsInitializer").getDeclaredMethod("init", Application.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, application);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        String processName = TaobaoApplication.getProcessName(application);
        LoginTLogAdapter.e(TAG, "LoginInitializer init() called with: application = [" + application + "], params = [" + hashMap + "],currentProcessName=" + processName);
        Login.init(application.getApplicationContext());
        if ("com.taobao.taobao".equals(processName)) {
            try {
                t5r.b("login_sdk_pre_init", "true");
                if (hashMap == null || !hashMap.containsKey(PARAM_FORCE_THREAD)) {
                    z = false;
                }
                TaoBaoLoginInitializer.init(application, z);
                UserTrackAdapter.sendUserTrack(UTConstant.PageName.UT_PAGE_EXTEND, "login_sdk_pre_init_enabled", null);
            } catch (Exception e) {
                e.printStackTrace();
                UserTrackAdapter.sendUT("LoginInitException");
            }
            try {
                registerFeatureComponentLoader(application);
            } catch (Exception unused) {
            }
        }
        tryToAttachDebugTools(application);
    }
}
