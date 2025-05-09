package tb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.poplayer.layermanager.d;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class lig implements pjc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f23356a = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends TypeReference<List<String>> {
        public a(lig ligVar) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b extends TypeReference<List<String>> {
        public b(lig ligVar) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final lig f23357a = new lig();

        static {
            t2o.a(790626337);
        }

        public static /* synthetic */ lig a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (lig) ipChange.ipc$dispatch("3ecbc44e", new Object[0]);
            }
            return f23357a;
        }
    }

    static {
        t2o.a(790626334);
        t2o.a(625999947);
    }

    public static lig g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lig) ipChange.ipc$dispatch("d4dccab3", new Object[0]);
        }
        return c.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x02ac A[Catch: all -> 0x02c0, TryCatch #4 {all -> 0x004e, blocks: (B:7:0x0035, B:10:0x0043, B:21:0x0089, B:33:0x029a, B:43:0x02e2, B:34:0x029f, B:36:0x02ac, B:37:0x02c2, B:38:0x02c7, B:40:0x02ce, B:14:0x0053, B:16:0x0060, B:17:0x006d, B:18:0x0072, B:20:0x0079, B:6:0x0027), top: B:45:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02c2 A[Catch: all -> 0x02c0, TryCatch #4 {all -> 0x004e, blocks: (B:7:0x0035, B:10:0x0043, B:21:0x0089, B:33:0x029a, B:43:0x02e2, B:34:0x029f, B:36:0x02ac, B:37:0x02c2, B:38:0x02c7, B:40:0x02ce, B:14:0x0053, B:16:0x0060, B:17:0x006d, B:18:0x0072, B:20:0x0079, B:6:0x0027), top: B:45:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02ce A[Catch: all -> 0x02c0, TRY_LEAVE, TryCatch #4 {all -> 0x004e, blocks: (B:7:0x0035, B:10:0x0043, B:21:0x0089, B:33:0x029a, B:43:0x02e2, B:34:0x029f, B:36:0x02ac, B:37:0x02c2, B:38:0x02c7, B:40:0x02ce, B:14:0x0053, B:16:0x0060, B:17:0x006d, B:18:0x0072, B:20:0x0079, B:6:0x0027), top: B:45:0x0027 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 755
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.lig.c():void");
    }

    public String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f41a24ff", new Object[]{this, str});
        }
        if (a9l.w().F()) {
            return a9l.w().k(str);
        }
        return OrangeConfig.getInstance().getConfig("android_layermanager", str, "");
    }

    public String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3cbf8f4d", new Object[]{this, str});
        }
        return OrangeConfig.getInstance().getConfig("android_layermanager", str, "");
    }

    public void f(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9380764", new Object[]{this, dVar});
        }
    }

    public final void i(SharedPreferences.Editor editor, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d903255f", new Object[]{this, editor, str, str2, new Boolean(z)});
            return;
        }
        try {
            String e = e(str);
            if (!TextUtils.isEmpty(e)) {
                z = Boolean.parseBoolean(e);
            }
            if (editor != null) {
                editor.putBoolean(str2, z);
            } else {
                a9l.w().g0(str2, z);
            }
        } catch (Throwable th) {
            wdm.h("LayerMgrAdapter.updateBoolean.error.orangeKey=" + str, th);
        }
    }

    public final void j(SharedPreferences.Editor editor, String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68b3a7c9", new Object[]{this, editor, str, str2, new Long(j)});
            return;
        }
        try {
            String e = e(str);
            if (!TextUtils.isEmpty(e)) {
                j = Long.parseLong(e);
            }
            if (editor != null) {
                editor.putLong(str2, j);
            } else {
                a9l.w().j0(str2, j);
            }
        } catch (Throwable th) {
            wdm.h("LayerMgrAdapter.updateLong.error.orangeKey=" + str, th);
        }
    }

    public final void k(SharedPreferences.Editor editor, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7142383a", new Object[]{this, editor, str, str2, str3});
            return;
        }
        try {
            String e = e(str);
            if (!TextUtils.isEmpty(e)) {
                str3 = e;
            }
            if (editor != null) {
                editor.putString(str2, str3);
            } else {
                a9l.w().k0(str2, str3);
            }
        } catch (Throwable th) {
            wdm.h("LayerMgrAdapter.updateString.error.orangeKey=" + str, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:8:0x002b, B:10:0x0031, B:16:0x0041, B:18:0x0046, B:21:0x0059, B:22:0x0060), top: B:25:0x002b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void h(boolean r6, com.alibaba.poplayer.layermanager.d r7, java.lang.String r8, java.util.Map r9) {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r1 = "configVersion"
            java.lang.String r2 = "configGroup=android_layermanager.configVersion="
            com.android.alibaba.ip.runtime.IpChange r3 = tb.lig.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0027
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r6)
            r6 = 5
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r0] = r5
            r0 = 1
            r6[r0] = r1
            r0 = 2
            r6[r0] = r7
            r7 = 3
            r6[r7] = r8
            r7 = 4
            r6[r7] = r9
            java.lang.String r7 = "d931afea"
            r3.ipc$dispatch(r7, r6)
            return
        L_0x0027:
            java.lang.String r8 = ""
            if (r9 == 0) goto L_0x0040
            boolean r3 = r9.containsKey(r1)     // Catch: all -> 0x003e
            if (r3 == 0) goto L_0x0040
            java.lang.Object r9 = r9.get(r1)     // Catch: all -> 0x003e
            java.lang.String r9 = (java.lang.String) r9     // Catch: all -> 0x003e
            boolean r1 = android.text.TextUtils.isEmpty(r9)     // Catch: all -> 0x003e
            if (r1 != 0) goto L_0x0040
            goto L_0x0041
        L_0x003e:
            r6 = move-exception
            goto L_0x0072
        L_0x0040:
            r9 = r8
        L_0x0041:
            r5.c()     // Catch: all -> 0x003e
            if (r6 == 0) goto L_0x0055
            tb.a9l r0 = tb.a9l.w()     // Catch: all -> 0x003e
            java.lang.String r1 = "android_layermanager"
            java.lang.String r3 = "layer_manager_config"
            java.lang.String r4 = "directlyBlackList"
            boolean r0 = r0.i0(r1, r3, r4, r9)     // Catch: all -> 0x003e
        L_0x0055:
            if (r6 == 0) goto L_0x0059
            if (r0 == 0) goto L_0x0060
        L_0x0059:
            tb.eig r6 = r7.n()     // Catch: all -> 0x003e
            r6.f()     // Catch: all -> 0x003e
        L_0x0060:
            java.lang.String r6 = "configUpdate"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: all -> 0x003e
            r7.<init>(r2)     // Catch: all -> 0x003e
            r7.append(r9)     // Catch: all -> 0x003e
            java.lang.String r7 = r7.toString()     // Catch: all -> 0x003e
            tb.wdm.f(r6, r8, r7)     // Catch: all -> 0x003e
            goto L_0x0077
        L_0x0072:
            java.lang.String r7 = "LayerMgrAdapter.onConfigUpdate error"
            tb.wdm.h(r7, r6)
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.lig.h(boolean, com.alibaba.poplayer.layermanager.d, java.lang.String, java.util.Map):void");
    }

    public void b(final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57b957ee", new Object[]{this, dVar});
        } else if (!this.f23356a.getAndSet(true)) {
            final boolean F = a9l.w().F();
            wdm.f(wdm.CATEGORY_LIFE_CYCLE, "", "LayerMgrAdapter.addConfigObserver.updateCacheConfigAsync.isLocalLMConfigEnable=" + F);
            if (F) {
                wdm.d("LayerMgrAdapter.addConfigObserver.isLocalLMConfigEnable.updateCacheConfigAsync.", new Object[0]);
                dVar.n().f();
            }
            OrangeConfig.getInstance().registerListener(new String[]{"android_layermanager"}, new obk() { // from class: tb.kig
                @Override // tb.obk
                public final void onConfigUpdate(String str, Map map) {
                    lig.this.h(F, dVar, str, map);
                }
            }, true);
        }
    }
}
