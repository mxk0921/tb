package android.taobao.windvane.extra.launch;

import android.app.Application;
import android.os.Handler;
import android.taobao.windvane.export.prerender.TMSPrerenderService;
import android.taobao.windvane.extra.jsbridge.JSAPIManager;
import android.taobao.windvane.extra.uc.WVCoreSettings;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.base.io.PathUtils;
import com.uc.webview.export.extension.IRunningCoreInfo;
import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;
import tb.ak7;
import tb.bk7;
import tb.ck7;
import tb.jca;
import tb.mrt;
import tb.om2;
import tb.rsa;
import tb.t2o;
import tb.v7t;
import tb.vpw;
import tb.yt4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WindVaneIdleTask extends InitOnceTask {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WindVaneIdleTask";

    static {
        t2o.a(989855979);
    }

    public static /* synthetic */ void access$000(WindVaneIdleTask windVaneIdleTask, Application application, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74b2c782", new Object[]{windVaneIdleTask, application, hashMap});
        } else {
            windVaneIdleTask.doDexOptimizeAsync(application, hashMap);
        }
    }

    public static /* synthetic */ void access$100(WindVaneIdleTask windVaneIdleTask, Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("397787d2", new Object[]{windVaneIdleTask, application});
        } else {
            windVaneIdleTask.doDexOptimizationImpl(application);
        }
    }

    public static /* synthetic */ void access$200(WindVaneIdleTask windVaneIdleTask, File file, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e144b71", new Object[]{windVaneIdleTask, file, new Boolean(z)});
        } else {
            windVaneIdleTask.onDexOptimizeFinish(file, z);
        }
    }

    private void doDexOptimizationImpl(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9211dff", new Object[]{this, application});
            return;
        }
        IRunningCoreInfo iRunningCoreInfo = IRunningCoreInfo.Instance.get();
        if (iRunningCoreInfo == null) {
            v7t.d("DexOptimizer", "runningInfo is null");
            return;
        }
        File fileCoreDex = PathUtils.getFileCoreDex(new File(iRunningCoreInfo.path()));
        v7t.i("DexOptimizer", "optimize file: " + fileCoreDex.getAbsolutePath());
        ck7.b().c(application, fileCoreDex, new bk7() { // from class: android.taobao.windvane.extra.launch.WindVaneIdleTask.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/launch/WindVaneIdleTask$3");
            }

            @Override // tb.bk7
            public void onFailed(File file, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("acf9a904", new Object[]{this, file, str});
                    return;
                }
                v7t.i("DexOptimizer", "optimize onFailed: " + str);
                WindVaneIdleTask.access$200(WindVaneIdleTask.this, file, false);
            }

            @Override // tb.bk7
            public void onSuccess(File file, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2c4f8b2c", new Object[]{this, file, str});
                    return;
                }
                v7t.i("DexOptimizer", "optimize success: " + str);
                WindVaneIdleTask.access$200(WindVaneIdleTask.this, file, true);
            }
        });
    }

    private void doDexOptimizeAsync(final Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c8c61ee", new Object[]{this, application, hashMap});
        } else {
            mrt.b().a(new Runnable() { // from class: android.taobao.windvane.extra.launch.WindVaneIdleTask.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        WindVaneIdleTask.access$100(WindVaneIdleTask.this, application);
                    }
                }
            }, 3000L);
        }
    }

    public static /* synthetic */ Object ipc$super(WindVaneIdleTask windVaneIdleTask, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/launch/WindVaneIdleTask");
    }

    private void onDexOptimizeFinish(final File file, final boolean z) {
        Handler a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9bfca2e", new Object[]{this, file, new Boolean(z)});
        } else if (file != null && (a2 = rsa.b().a()) != null) {
            a2.postDelayed(new Runnable() { // from class: android.taobao.windvane.extra.launch.WindVaneIdleTask.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ak7.a(file, z);
                    }
                }
            }, 3000L);
        }
    }

    @Override // android.taobao.windvane.extra.launch.InitOnceTask, android.taobao.windvane.extra.launch.ILaunchInitTask
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return TAG;
    }

    @Override // android.taobao.windvane.extra.launch.InitOnceTask
    public void initImpl(final Application application, final HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73f761cb", new Object[]{this, application, hashMap});
            return;
        }
        try {
            v7t.i(TAG, "init started");
            JSAPIManager.getInstance().register();
            TMSPrerenderService.INSTANCE.e();
            jca.b();
            if (application == null || !vpw.commonConfig.a3) {
                v7t.i(TAG, "doDexOptimizeAsync not enabled");
            } else {
                WVCoreSettings.getInstance().setCoreEventCallback2(new yt4() { // from class: android.taobao.windvane.extra.launch.WindVaneIdleTask.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/launch/WindVaneIdleTask$1");
                    }

                    @Override // tb.zt4
                    public void onUCCorePrepared() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6e1aa650", new Object[]{this});
                        } else {
                            WindVaneIdleTask.access$000(WindVaneIdleTask.this, application, hashMap);
                        }
                    }
                });
            }
            initBrowserIdleTask(application, hashMap);
            v7t.i(TAG, "init finished");
        } catch (Throwable th) {
            v7t.i(TAG, "init failed: " + th.getMessage());
        }
    }

    private void initBrowserIdleTask(Application application, HashMap<String, Object> hashMap) {
        try {
            if (vpw.commonConfig.g3) {
                v7t.i(TAG, "initBrowserIdleTask v2 started");
                om2.c(application, hashMap);
            } else {
                v7t.i(TAG, "initBrowserIdleTask v1 started");
                IpChange ipChange = om2.$ipChange;
                Method declaredMethod = om2.class.getDeclaredMethod("initImpl", Application.class, HashMap.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, application, hashMap);
            }
        } catch (Throwable th) {
            v7t.d(TAG, "initBrowserIdleTask failed: " + th.getMessage());
        }
    }
}
