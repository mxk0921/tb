package com.taobao.android.weex_framework.module.builtin;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.instance.WeexScriptOnlyInstance;
import com.taobao.android.weex.module.WeexInnerModule;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WXWindowModule extends WeexInnerModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOG_TAG = "MUSWindowModel";
    public static final String[] METHODS = {"dispatchEvent", "addEventListener", "removeEventListener"};
    private static final WeakHashMap<Activity, b> WINDOW_HOLDERS = new WeakHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, Set<WeexInstance>> f9979a;
        public final Map<WeexInstance, Set<String>> b;

        static {
            t2o.a(982516162);
        }

        public b() {
            this.f9979a = new HashMap();
            this.b = new HashMap();
        }

        public synchronized void a(String str, WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4bd1d9bc", new Object[]{this, str, weexInstance});
                return;
            }
            Set set = (Set) ((HashMap) this.f9979a).get(str);
            if (set == null) {
                set = new HashSet();
                ((HashMap) this.f9979a).put(str, set);
            }
            set.add(weexInstance);
            Set set2 = (Set) ((HashMap) this.b).get(weexInstance);
            if (set2 == null) {
                set2 = new HashSet();
                ((HashMap) this.b).put(weexInstance, set2);
            }
            set2.add(str);
        }

        public synchronized void b(WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1a76d5df", new Object[]{this, weexInstance});
                return;
            }
            Set<String> set = (Set) ((HashMap) this.b).get(weexInstance);
            if (set != null) {
                for (String str : set) {
                    Set set2 = (Set) ((HashMap) this.f9979a).get(str);
                    if (set2 != null) {
                        set2.remove(weexInstance);
                    }
                }
                ((HashMap) this.b).remove(weexInstance);
            }
        }

        public synchronized void c(WeexInstance weexInstance, String str, WeexValue weexValue) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7781a623", new Object[]{this, weexInstance, str, weexValue});
                return;
            }
            Set<WeexInstance> set = (Set) ((HashMap) this.f9979a).get(str);
            if (set != null) {
                for (WeexInstance weexInstance2 : set) {
                    if (weexInstance != weexInstance2) {
                        ((WeexScriptOnlyInstance) weexInstance2).legacyDispatchEvent(str, weexValue);
                    }
                }
            }
        }

        public synchronized void d(String str, WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b6c2139", new Object[]{this, str, weexInstance});
                return;
            }
            Set set = (Set) ((HashMap) this.f9979a).get(str);
            if (set != null) {
                set.remove(weexInstance);
            }
            Set set2 = (Set) ((HashMap) this.b).get(weexInstance);
            if (set2 != null) {
                set2.remove(str);
            }
        }
    }

    private void addEventListener(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0a8b91e", new Object[]{this, str});
            return;
        }
        Context context = getWeexInstance().getContext();
        if (context instanceof Activity) {
            getWindowHolder((Activity) context).a(str, getWeexInstance());
        }
    }

    private void dispatchEvent(String str, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f36481b", new Object[]{this, str, weexValue});
            return;
        }
        Context context = getWeexInstance().getContext();
        if (context instanceof Activity) {
            getWindowHolder((Activity) context).c(getWeexInstance(), str, weexValue);
        }
    }

    private static synchronized b getWindowHolder(Activity activity) {
        synchronized (WXWindowModule.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("a7a8a5ca", new Object[]{activity});
            }
            WeakHashMap<Activity, b> weakHashMap = WINDOW_HOLDERS;
            b bVar = weakHashMap.get(activity);
            if (bVar == null) {
                bVar = new b();
                weakHashMap.put(activity, bVar);
            }
            return bVar;
        }
    }

    public static /* synthetic */ Object ipc$super(WXWindowModule wXWindowModule, String str, Object... objArr) {
        if (str.hashCode() == -498459201) {
            super.onMainThreadDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXWindowModule");
    }

    private void removeEventListener(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc5d65b", new Object[]{this, str});
            return;
        }
        Context context = getWeexInstance().getContext();
        if (context instanceof Activity) {
            getWindowHolder((Activity) context).d(str, getWeexInstance());
        }
    }

    @Override // com.taobao.android.weex.module.WeexInnerModule, com.taobao.android.weex.WeexModule
    public void onMainThreadDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e24a1dbf", new Object[]{this});
            return;
        }
        super.onMainThreadDestroy();
        Context context = getWeexInstance().getContext();
        if (context instanceof Activity) {
            getWindowHolder((Activity) context).b(getWeexInstance());
        }
    }

    static {
        t2o.a(982516160);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
        if (r9.equals("removeEventListener") == false) goto L_0x002c;
     */
    @Override // com.taobao.android.weex.module.WeexInnerModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.weex.WeexValue callModuleMethod(com.taobao.android.weex.WeexInstanceImpl r7, java.lang.String r8, java.lang.String r9, com.taobao.android.weex.WeexValue[] r10) throws java.lang.Exception {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.weex_framework.module.builtin.WXWindowModule.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0021
            java.lang.String r4 = "ffafd8f7"
            r5 = 5
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r6
            r5[r1] = r7
            r5[r0] = r8
            r7 = 3
            r5[r7] = r9
            r7 = 4
            r5[r7] = r10
            java.lang.Object r7 = r3.ipc$dispatch(r4, r5)
            com.taobao.android.weex.WeexValue r7 = (com.taobao.android.weex.WeexValue) r7
            return r7
        L_0x0021:
            r9.hashCode()
            r7 = -1
            int r8 = r9.hashCode()
            switch(r8) {
                case -2140931520: goto L_0x0043;
                case -625809843: goto L_0x0038;
                case -541487286: goto L_0x002e;
                default: goto L_0x002c;
            }
        L_0x002c:
            r0 = -1
            goto L_0x004d
        L_0x002e:
            java.lang.String r8 = "removeEventListener"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x004d
            goto L_0x002c
        L_0x0038:
            java.lang.String r8 = "addEventListener"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x0041
            goto L_0x002c
        L_0x0041:
            r0 = 1
            goto L_0x004d
        L_0x0043:
            java.lang.String r8 = "dispatchEvent"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x004c
            goto L_0x002c
        L_0x004c:
            r0 = 0
        L_0x004d:
            switch(r0) {
                case 0: goto L_0x0069;
                case 1: goto L_0x005d;
                case 2: goto L_0x0051;
                default: goto L_0x0050;
            }
        L_0x0050:
            goto L_0x0078
        L_0x0051:
            com.taobao.android.weex.WeexValue r7 = r6.getArg(r10, r2)
            java.lang.String r7 = r7.toStringValueOrNull()
            r6.removeEventListener(r7)
            goto L_0x0078
        L_0x005d:
            com.taobao.android.weex.WeexValue r7 = r6.getArg(r10, r2)
            java.lang.String r7 = r7.toStringValueOrNull()
            r6.addEventListener(r7)
            goto L_0x0078
        L_0x0069:
            com.taobao.android.weex.WeexValue r7 = r6.getArg(r10, r2)
            java.lang.String r7 = r7.toStringValueOrNull()
            com.taobao.android.weex.WeexValue r8 = r6.getArg(r10, r1)
            r6.dispatchEvent(r7, r8)
        L_0x0078:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_framework.module.builtin.WXWindowModule.callModuleMethod(com.taobao.android.weex.WeexInstanceImpl, java.lang.String, java.lang.String, com.taobao.android.weex.WeexValue[]):com.taobao.android.weex.WeexValue");
    }
}
