package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.io.SharedPreferencesUtils;
import com.taobao.muniontaobaosdk.util.TaoLog;
import com.taobao.orange.OrangeConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class vm2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile List<String> f30097a;
    public static volatile List<String> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements z8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.z8l
        public void onConfigUpdate(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
                return;
            }
            String valueOf = String.valueOf(z);
            TaoLog.Logd("onConfigUpdate in getBucketOnFixedStatus, fromCache=" + valueOf);
            vm2.b(vm2.c());
            vm2.d(true);
            if (!vm2.a().equals(vm2.e())) {
                vm2.f(vm2.a());
            }
        }
    }

    static {
        t2o.a(1017118835);
    }

    public static /* synthetic */ List a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("54cf0df0", new Object[0]);
        }
        return b;
    }

    public static /* synthetic */ List b(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6c94df9d", new Object[]{list});
        }
        b = list;
        return list;
    }

    public static /* synthetic */ List c() throws IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("db54c88f", new Object[0]);
        }
        return h();
    }

    public static /* synthetic */ boolean d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b117a53d", new Object[]{new Boolean(z)})).booleanValue();
        }
        return z;
    }

    public static /* synthetic */ List e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e8603dcd", new Object[0]);
        }
        return f30097a;
    }

    public static /* synthetic */ void f(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48932b6c", new Object[]{list});
        } else {
            v(list);
        }
    }

    public static List<String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c43f5358", new Object[0]);
        }
        String string = SharedPreferencesUtils.getString("bucket", "");
        if (TextUtils.isEmpty(string)) {
            return Collections.emptyList();
        }
        return Arrays.asList(string.split("&"));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:6|(8:47|12|14|(1:16)(1:17)|18|44|19|(2:21|22)(7:24|(5:27|50|(5:29|30|(3:45|32|(1:35))|36|51)|52|25)|49|37|(1:39)|40|41))|13|14|(0)(0)|18|44|19|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[Catch: Exception -> 0x005a, TryCatch #0 {Exception -> 0x005a, blocks: (B:19:0x004f, B:21:0x0055, B:24:0x005c, B:25:0x0064, B:27:0x006a, B:29:0x0084, B:32:0x0090, B:35:0x00a1), top: B:44:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c A[Catch: Exception -> 0x005a, TryCatch #0 {Exception -> 0x005a, blocks: (B:19:0x004f, B:21:0x0055, B:24:0x005c, B:25:0x0064, B:27:0x006a, B:29:0x0084, B:32:0x0090, B:35:0x00a1), top: B:44:0x004f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<java.lang.String> h() throws java.lang.IllegalStateException {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.vm2.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L_0x0012
            java.lang.String r1 = "a1912170"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r0 = r0.ipc$dispatch(r1, r2)
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x0012:
            com.taobao.utils.ILoginInfoGetter r0 = com.taobao.alimama.login.LoginManager.a()
            if (r0 == 0) goto L_0x002d
            com.taobao.utils.LoginInfo r0 = r0.getLastLoginUserInfo()
            if (r0 == 0) goto L_0x002d
            java.lang.String r1 = r0.userId
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x002d
            java.lang.String r0 = r0.userId     // Catch: NumberFormatException -> 0x002d
            long r0 = java.lang.Long.parseLong(r0)     // Catch: NumberFormatException -> 0x002d
            goto L_0x002f
        L_0x002d:
            r0 = -1
        L_0x002f:
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0038
            r0 = 1000(0x3e8, float:1.401E-42)
            goto L_0x003c
        L_0x0038:
            r3 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 % r3
            int r0 = (int) r0
        L_0x003c:
            com.taobao.orange.OrangeConfig r1 = com.taobao.orange.OrangeConfig.getInstance()
            java.lang.String r3 = "bucket"
            java.lang.String r4 = ""
            java.lang.String r5 = "alimama_ad"
            java.lang.String r1 = r1.getConfig(r5, r3, r4)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            com.alibaba.fastjson.JSONObject r1 = com.alibaba.fastjson.JSON.parseObject(r1)     // Catch: Exception -> 0x005a
            if (r1 != 0) goto L_0x005c
            java.util.List r0 = java.util.Collections.emptyList()     // Catch: Exception -> 0x005a
            return r0
        L_0x005a:
            goto L_0x00a7
        L_0x005c:
            java.util.Set r4 = r1.keySet()     // Catch: Exception -> 0x005a
            java.util.Iterator r4 = r4.iterator()     // Catch: Exception -> 0x005a
        L_0x0064:
            boolean r5 = r4.hasNext()     // Catch: Exception -> 0x005a
            if (r5 == 0) goto L_0x00a7
            java.lang.Object r5 = r4.next()     // Catch: Exception -> 0x005a
            java.lang.String r5 = (java.lang.String) r5     // Catch: Exception -> 0x005a
            com.alibaba.fastjson.JSONArray r6 = r1.getJSONArray(r5)     // Catch: Exception -> 0x005a
            int r7 = r6.size()     // Catch: Exception -> 0x005a
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch: Exception -> 0x005a
            java.lang.Object[] r6 = r6.toArray(r7)     // Catch: Exception -> 0x005a
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch: Exception -> 0x005a
            int r7 = r6.length     // Catch: Exception -> 0x005a
            r8 = 0
        L_0x0082:
            if (r8 >= r7) goto L_0x0064
            r9 = r6[r8]     // Catch: Exception -> 0x005a
            java.lang.String r10 = "-"
            java.lang.String[] r9 = r9.split(r10)     // Catch: Exception -> 0x005a
            int r10 = r9.length     // Catch: Exception -> 0x005a
            r11 = 2
            if (r10 != r11) goto L_0x00a4
            r10 = r9[r2]     // Catch: Exception -> 0x005a, NumberFormatException -> 0x00a4
            int r10 = java.lang.Integer.parseInt(r10)     // Catch: Exception -> 0x005a, NumberFormatException -> 0x00a4
            r11 = 1
            r9 = r9[r11]     // Catch: Exception -> 0x005a, NumberFormatException -> 0x00a4
            int r9 = java.lang.Integer.parseInt(r9)     // Catch: Exception -> 0x005a, NumberFormatException -> 0x00a4
            if (r0 < r10) goto L_0x00a4
            if (r0 > r9) goto L_0x00a4
            r3.add(r5)     // Catch: Exception -> 0x005a
        L_0x00a4:
            int r8 = r8 + 1
            goto L_0x0082
        L_0x00a7:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x00b0
            java.util.Collections.sort(r3)
        L_0x00b0:
            java.util.List r0 = java.util.Collections.unmodifiableList(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.vm2.h():java.util.List");
    }

    public static List<String> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("20e2ba0c", new Object[0]);
        }
        if (f30097a == null) {
            f30097a = g();
            b = f30097a;
            OrangeConfig.getInstance().registerListener(new String[]{"alimama_ad"}, new a());
        }
        return f30097a;
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b3ed2a7", new Object[0])).booleanValue();
        }
        return s("ad_nav_hook_enable");
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a18997b", new Object[0])).booleanValue();
        }
        return true;
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("126c48be", new Object[0])).booleanValue();
        }
        return false;
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0bb4585", new Object[0])).booleanValue();
        }
        return true;
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e89dba65", new Object[0])).booleanValue();
        }
        return true;
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("936ccaa0", new Object[0])).booleanValue();
        }
        return s("adv_cpm_crop_bitmap");
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("836f2fa4", new Object[0])).booleanValue();
        }
        return true;
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19b66bc5", new Object[0])).booleanValue();
        }
        return true;
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("92688d82", new Object[0])).booleanValue();
        }
        return s("ad_ifs_disk_filter_new");
    }

    public static boolean s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e95f6303", new Object[]{str})).booleanValue();
        }
        return i().contains(str);
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6185b4a", new Object[0])).booleanValue();
        }
        return s("ad_report_by_exposer");
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4544ffb3", new Object[0])).booleanValue();
        }
        return true;
    }

    public static void v(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3ebb94", new Object[]{list});
        } else if (list.isEmpty()) {
            SharedPreferencesUtils.removeKey("bucket");
        } else {
            SharedPreferencesUtils.putString("bucket", TextUtils.join("&", list));
        }
    }
}
