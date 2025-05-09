package com.taobao.tao.recommend3.observer;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.log.TLog;
import java.lang.ref.WeakReference;
import tb.c21;
import tb.t11;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class HomeLifecycleObserver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static WeakReference<Activity> f12660a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements t11 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                return;
            }
            HomeLifecycleObserver.a(new WeakReference(activity));
            TLog.loge("home", "GlobalTrace", "setCurrentActivity:" + activity.getComponentName().getClassName());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            }
        }
    }

    static {
        t2o.a(729809853);
    }

    public static /* synthetic */ WeakReference a(WeakReference weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("4946ee13", new Object[]{weakReference});
        }
        f12660a = weakReference;
        return weakReference;
    }

    public static Activity b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("d8e4874f", new Object[0]);
        }
        WeakReference<Activity> weakReference = f12660a;
        Activity activity = weakReference == null ? null : weakReference.get();
        f(activity);
        return activity;
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        d();
        e();
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99ce2af", new Object[0]);
        } else {
            c21.a(new a(), false);
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ed8eb9e", new Object[0]);
        } else {
            com.taobao.tao.navigation.a.G(new FragmentManager.FragmentLifecycleCallbacks() { // from class: com.taobao.tao.recommend3.observer.HomeLifecycleObserver.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend3/observer/HomeLifecycleObserver$2");
                }

                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentActivityCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4c0f5ae2", new Object[]{this, fragmentManager, fragment, bundle});
                    }
                }

                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("69b9df5f", new Object[]{this, fragmentManager, fragment, context});
                    }
                }

                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("871739b1", new Object[]{this, fragmentManager, fragment, bundle});
                    }
                }

                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f2658eb2", new Object[]{this, fragmentManager, fragment});
                    }
                }

                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentDetached(FragmentManager fragmentManager, Fragment fragment) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d62d7dfb", new Object[]{this, fragmentManager, fragment});
                    }
                }

                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c8137aff", new Object[]{this, fragmentManager, fragment});
                    }
                }

                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentPreAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("69cbbd64", new Object[]{this, fragmentManager, fragment, context});
                    }
                }

                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentPreCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2bcee74c", new Object[]{this, fragmentManager, fragment, bundle});
                    }
                }

                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("953163f4", new Object[]{this, fragmentManager, fragment});
                    }
                }

                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentSaveInstanceState(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4d383dc8", new Object[]{this, fragmentManager, fragment, bundle});
                    }
                }

                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e970430a", new Object[]{this, fragmentManager, fragment});
                    }
                }

                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9a68ca3e", new Object[]{this, fragmentManager, fragment});
                    }
                }

                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dce5770a", new Object[]{this, fragmentManager, fragment, view, bundle});
                    }
                }

                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("93910177", new Object[]{this, fragmentManager, fragment});
                    }
                }
            });
        }
    }

    public static void f(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("241dc387", new Object[]{activity});
            return;
        }
        try {
            if (activity == null) {
                TLog.loge("home", "GlobalTrace", "getCurrentActivity error, activity is null");
            } else if (TBMainHost.a(activity) == null) {
                TLog.loge("home", "GlobalTrace", "getCurrentActivity:" + activity.getLocalClassName());
            }
        } catch (Throwable th) {
            TLog.loge("home", "GlobalTrace", "getCurrentActivity error", th);
        }
    }
}
