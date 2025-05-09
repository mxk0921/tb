package com.android.tools.ir.runtime;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.ha1;
import tb.stn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ApplicationInvoker {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<String, ApplicationInvoker> mApplications = new ConcurrentHashMap();
    private static ha1 sApplicationMonitor = new ha1();
    private final String bundleName;
    private volatile boolean inited = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface a {
        void a();

        void onInitError(String str);
    }

    private ApplicationInvoker(String str) {
        this.bundleName = str;
    }

    public static ApplicationInvoker getInstance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApplicationInvoker) ipChange.ipc$dispatch("1173b3a8", new Object[]{str});
        }
        synchronized (mApplications) {
            try {
                if (mApplications.containsKey(str)) {
                    return mApplications.get(str);
                }
                ApplicationInvoker applicationInvoker = new ApplicationInvoker(str);
                mApplications.put(str, applicationInvoker);
                return applicationInvoker;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void invoke(String str, Context context) {
        try {
            if (!this.inited) {
                this.inited = true;
                if (!TextUtils.isEmpty(str)) {
                    try {
                        Class<?> loadClass = ApplicationInvoker.class.getClassLoader().loadClass(str);
                        if (loadClass != null) {
                            Application application = (Application) loadClass.newInstance();
                            stn.b(application, Constants.Event.SLOT_LIFECYCLE.ATTACH, Context.class).invoke(application, ((Application) context).getBaseContext());
                            Method b = stn.b(application, "onCreate", new Class[0]);
                            long currentTimeMillis = System.currentTimeMillis();
                            b.invoke(application, new Object[0]);
                            sApplicationMonitor.b("invoke", this.bundleName, str, context.getClass().getName(), System.currentTimeMillis() - currentTimeMillis);
                            Log.e("ApplicationInvoker", "successfully invoke start application " + str);
                        } else {
                            throw new ClassNotFoundException("can not find class: " + str);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        this.inited = false;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void invoke(String str, Context context, a aVar) {
        try {
            if (!this.inited) {
                this.inited = true;
                if (!TextUtils.isEmpty(str)) {
                    try {
                        Class<?> loadClass = ApplicationInvoker.class.getClassLoader().loadClass(str);
                        if (loadClass != null) {
                            Application application = (Application) loadClass.newInstance();
                            stn.b(application, Constants.Event.SLOT_LIFECYCLE.ATTACH, Context.class).invoke(application, ((Application) context).getBaseContext());
                            Method b = stn.b(application, "onCreate", new Class[0]);
                            long currentTimeMillis = System.currentTimeMillis();
                            b.invoke(application, new Object[0]);
                            sApplicationMonitor.b("call", this.bundleName, str, context.getClass().getName(), System.currentTimeMillis() - currentTimeMillis);
                            Log.e("ApplicationInvoker", "successfully invoke start application " + str);
                            if (aVar != null) {
                                aVar.a();
                            }
                        } else {
                            throw new ClassNotFoundException("can not find class: " + str);
                        }
                    } catch (Exception e) {
                        this.inited = false;
                        if (aVar != null) {
                            aVar.onInitError(e.getMessage());
                        }
                    }
                } else if (aVar != null) {
                    aVar.a();
                }
            } else if (aVar != null) {
                aVar.a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
