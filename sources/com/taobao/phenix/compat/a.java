package com.taobao.phenix.compat;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfigLocal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import tb.fiv;
import tb.z8l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CACHE_KEY_ALIVFS_ENABLED = "_alivfs";
    public static final String CLEAR_CACHE_HISTORY = "clear_cache_history";
    public static final String CLOUD_KEY_HEIGHT_SCALE_PRIORITY_WHITELIST = "_height_scale_priority_whitelist";
    public static final String CLOUD_KEY_HEIGHT_SCALE_WHITELIST = "_height_scale_whitelist";
    public static final String CLOUD_KEY_HIGH_QUALITY_PRIORITY_WHITELIST = "_high_quality_priority_whitelist";
    public static final String CLOUD_KEY_HIGH_QUALITY_WHITELIST = "_high_quality_whitelist";
    public static final String CLOUD_KEY_LIMIT_RECURSIVE_DEPTH_WHITELIST = "_limit_recursive_depth_whitelist";
    public static final String CONFIG_ITEM_SEPARATOR = ",";
    public static final int COVERAGE_RANGE_MAX = 100;
    public static final int COVERAGE_RANGE_MIN = 0;
    public static final int FID_OF_ANDROID_P = 29;
    public static final int FID_OF_ANDROID_S = 46;
    public static final int FID_OF_ANIM_FRAME_COUNT_LIMIT = 49;
    public static final int FID_OF_APG_SUPPORT = 17;
    public static final int FID_OF_APNG_SUPPORT = 20;
    public static final int FID_OF_ASHMEM_SUPPORT = 19;
    public static final int FID_OF_AVIF_SUPPORT = 45;
    public static final int FID_OF_BITMAP_POOL = 18;
    public static final int FID_OF_CLEAR_CACHE = 52;
    public static final int FID_OF_DECODE_CANCELLABLE = 16;
    public static final int FID_OF_DETECT_ALIVFS_NUMS = 44;
    public static final int FID_OF_DOMAIN_MERGE_SPECIAL = 37;
    public static final int FID_OF_EXTERNAL_DECODER_PRIOR = 15;
    public static final int FID_OF_FIX_HEIF_ALPHA_CRASH = 53;
    public static final int FID_OF_FIX_HEIF_MEMORY_CRASH = 54;
    public static final int FID_OF_HEIC_ICC_SUPPORT = 39;
    public static final int FID_OF_HEIF_BUGFIX = 30;
    public static final int FID_OF_HEIF_PNG_SUPPORT = 23;
    public static final int FID_OF_HEIF_SUPPORT = 22;
    public static final int FID_OF_HEIGHT_SCALE_PRIORITY_WHITELIST = 59;
    public static final int FID_OF_HEIGHT_SCALE_WHITELIST = 57;
    public static final int FID_OF_HIGH_QUALITY_PRIORITY_WHITELIST = 60;
    public static final int FID_OF_HIGH_QUALITY_WHITELIST = 58;
    public static final int FID_OF_IMAGE_ASYNC = 28;
    public static final int FID_OF_IMAGE_GRAY_TRAFFIC = 55;
    public static final int FID_OF_IMAGE_OPT_CACHE_STRATEGY = 56;
    public static final int FID_OF_LIMIT_RECURSIVE_DEPTH_WHITELIST = 50;
    public static final int FID_OF_LOCAL_AVIF_BY_SYSTEM_SUPPORT = 48;
    public static final int FID_OF_LOCAL_HEIC_BY_SYSTEM_SUPPORT = 41;
    public static final int FID_OF_MONITOR_STAT_SAMPLING = 13;
    public static final int FID_OF_NETWORK_MAX_RUNNING = 14;
    public static final int FID_OF_NEW_CACHE_POOL = 26;
    public static final int FID_OF_NEW_LAUNCH = 27;
    public static final int FID_OF_NEW_THREAD_MODEL = 24;
    public static final int FID_OF_NEW_THREAD_MODEL_V2 = 47;
    public static final int FID_OF_NON_CRITICAL_REPORT_SAMPLING = 21;
    public static final int FID_OF_NO_REUSE_WEBP = 32;
    public static final int FID_OF_RXMODEL_RECYCLE = 25;
    public static final int FID_OF_SKIP_ALIVFS_DURATION = 43;
    public static final int FID_OF_SKIP_ALIVFS_SHRESHOLD = 42;
    public static final int FID_OF_SUPPORT_HEIF_ALPHA = 51;
    public static final int FID_OF_THUMB_NAIL = 36;
    public static final int FID_OF_TTL_CACHE = 38;
    public static final int FID_OF_UNIFY_THREAD_POOL = 12;
    public static final int FID_OF_USER_AGENT_ADD_TRACE_ID = 40;
    public static final int FID_OF_WEBP_BUG_FIX = 35;
    public static final int FID_OF_WEBP_CONVERT = 33;
    public static final int FID_OF_WEBP_DEGRADE = 31;
    public static final String SUPPORT_HEIF_ALPHA = "support_heif_alpha";
    public static String c = "picasso.alicdn.com";
    public static long d = 604800;
    public static a e;
    public static final Random f = new Random();

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f11464a;
    public List<b> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
        void a(a aVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f11466a;
        public int b;
        public boolean c;
        public String[] d;
        public String[] e;
        public String[] f;
        public String[] g;
        public String[] h;
        public int[] i;

        public c(int i, int i2, boolean z) {
            this.f11466a = i;
            this.b = i2;
            this.c = z;
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a934b02d", new Object[]{this})).booleanValue();
            }
            if (c(this.d, Build.MODEL) || c(this.e, Build.MANUFACTURER)) {
                return true;
            }
            return false;
        }

        public boolean b(int[] iArr, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e30ee300", new Object[]{this, iArr, new Integer(i)})).booleanValue();
            }
            if (iArr != null && (r2 = iArr.length) > 0) {
                for (int i2 : iArr) {
                    if (i == i2) {
                        return true;
                    }
                }
            }
            return false;
        }

        public boolean c(String[] strArr, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2274476", new Object[]{this, strArr, str})).booleanValue();
            }
            if (!(str == null || strArr == null || (r2 = strArr.length) <= 0)) {
                for (String str2 : strArr) {
                    if (str.equals(str2)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3bc8a95d", new Object[]{this})).booleanValue();
            }
            if (b(this.i, Build.VERSION.SDK_INT) || c(this.f, Build.MODEL) || c(this.g, Build.MANUFACTURER) || c(this.h, Build.CPU_ABI)) {
                return true;
            }
            return false;
        }
    }

    public a(Context context) {
        this.f11464a = context.getSharedPreferences("cloud_image_setting", 0);
        OrangeConfigLocal.getInstance().registerListener(new String[]{"android_image_function_control"}, new C0648a());
        OrangeConfigLocal.getInstance().getConfigs("android_image_function_control");
    }

    public static /* synthetic */ SharedPreferences a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("a33238dd", new Object[]{aVar});
        }
        return aVar.f11464a;
    }

    public static /* synthetic */ String b(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c53e80c", new Object[]{aVar, str});
        }
        return aVar.f(str);
    }

    public static /* synthetic */ List c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e8b2759c", new Object[]{aVar});
        }
        return aVar.b;
    }

    public static synchronized a n(Context context) {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("afd71232", new Object[]{context});
            }
            if (e == null) {
                e = new a(context);
            }
            return e;
        }
    }

    public static boolean p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5aec0122", new Object[]{new Integer(i)})).booleanValue();
        }
        if (f.nextInt(100) + 1 <= i) {
            return true;
        }
        return false;
    }

    public synchronized void d(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe3f269", new Object[]{this, bVar});
            return;
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(bVar);
    }

    public final String e(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a9212ceb", new Object[]{this, new Integer(i), str});
        }
        StringBuilder sb = new StringBuilder(str.length() + 11);
        sb.append("cloudimg_");
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public final String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("83454151", new Object[]{this, str});
        }
        StringBuilder sb = new StringBuilder(30);
        sb.append("cloudimg_");
        sb.append(str);
        return sb.toString();
    }

    public Boolean g(String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("510f5aa4", new Object[]{this, str});
        }
        SharedPreferences sharedPreferences = this.f11464a;
        if (sharedPreferences == null || !sharedPreferences.getBoolean(str, false)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final Integer h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("4cdf1efb", new Object[]{this, str});
        }
        SharedPreferences sharedPreferences = this.f11464a;
        if (sharedPreferences == null) {
            return 0;
        }
        return Integer.valueOf(sharedPreferences.getInt(str, 0));
    }

    public String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec2b0292", new Object[]{this, str});
        }
        SharedPreferences sharedPreferences = this.f11464a;
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.getString(str, null);
    }

    public final boolean j(c cVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Integer h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d296c8e", new Object[]{this, cVar})).booleanValue();
        }
        v(cVar);
        int i = cVar.f11466a;
        if (cVar.b <= 0 && i == 29 && cVar.a()) {
            return true;
        }
        if (cVar.b <= 0 || cVar.d()) {
            fiv.f("CloudConfig", "feature[%d] disabled, cause all close or should skip, coverage=%d", Integer.valueOf(i), Integer.valueOf(cVar.b));
            return false;
        } else if (cVar.b >= 100) {
            fiv.f("CloudConfig", "feature[%d] enabled, cause all open, coverage=%d", Integer.valueOf(i), Integer.valueOf(cVar.b));
            return true;
        } else {
            String e2 = e(i, "_last_enabled");
            String e3 = e(i, "_last_coverage");
            Boolean g = g(e2);
            if (!cVar.c || g == null || (h = h(e3)) == null || cVar.b != h.intValue()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = p(cVar.b);
            } else {
                z2 = g.booleanValue();
            }
            if (!cVar.c && g != null) {
                boolean q = q(e2);
                if (!q(e3) || !q) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                fiv.a("CloudConfig", "feature[%d] remove all keys, cause permanent YES to NO, result=%b", Integer.valueOf(i), Boolean.valueOf(z4));
            }
            if (cVar.c && z) {
                boolean r = r(e2, Boolean.valueOf(z2));
                if (!r(e3, Integer.valueOf(cVar.b)) || !r) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                fiv.a("CloudConfig", "feature[%d] save keys[enabled&coverage] at permanent true, cause coverage changed or not been saved, result=%b", Integer.valueOf(i), Boolean.valueOf(z3));
            }
            fiv.f("CloudConfig", "feature[%d] open result=%B, has random=%b", Integer.valueOf(i), Boolean.valueOf(z2), Boolean.valueOf(z));
            return z2;
        }
    }

    public int k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d42266c0", new Object[]{this, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(i(e(i, CACHE_KEY_ALIVFS_ENABLED)));
        } catch (Throwable unused) {
            return 0;
        }
    }

    public String l(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f11c5629", new Object[]{this, new Integer(i), str});
        }
        return i(e(i, str));
    }

    public int m(int i) {
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7bb6eb87", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i == 13) {
            cVar = new c(i, 20, false);
        } else if (i != 21) {
            cVar = null;
        } else {
            cVar = new c(i, 40, false);
        }
        if (cVar == null) {
            return 0;
        }
        v(cVar);
        int i2 = cVar.b;
        if (i2 <= 0 || cVar.d()) {
            fiv.f("CloudConfig", "feature[%d] disabled, cause all close or should skip, coverage=%d", Integer.valueOf(i), Integer.valueOf(cVar.b));
            return 0;
        } else if (cVar.b < 100) {
            return i2;
        } else {
            fiv.f("CloudConfig", "feature[%d] enabled, cause all open, coverage=%d", Integer.valueOf(i), Integer.valueOf(cVar.b));
            return 100;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public boolean o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4708a94b", new Object[]{this, new Integer(i)})).booleanValue();
        }
        switch (i) {
            case 12:
                return j(new c(i, 100, false));
            case 13:
            case 21:
            case 34:
            case 42:
            case 43:
            case 44:
            case 50:
            default:
                return false;
            case 14:
                return j(new c(i, 100, false));
            case 15:
                return j(new c(i, 0, false));
            case 16:
                return j(new c(i, 100, false));
            case 17:
                return j(new c(i, 0, true));
            case 18:
                return j(new c(i, 100, false));
            case 19:
                return j(new c(i, 100, false));
            case 20:
                return j(new c(i, 100, true));
            case 22:
                return j(new c(i, 100, true));
            case 23:
                return j(new c(i, 0, false));
            case 24:
                return j(new c(i, 0, false));
            case 25:
                return j(new c(i, 0, false));
            case 26:
                j(new c(i, 100, false));
                break;
            case 27:
                break;
            case 28:
                return j(new c(i, 100, false));
            case 29:
                return j(new c(i, 0, false));
            case 30:
                return j(new c(i, 100, false));
            case 31:
                return j(new c(i, 100, false));
            case 32:
                return j(new c(i, 100, false));
            case 33:
                return j(new c(i, 0, false));
            case 35:
                return j(new c(i, 100, false));
            case 36:
                return j(new c(i, 0, false));
            case 37:
                return j(new c(i, 100, false));
            case 38:
                return j(new c(i, 100, false));
            case 39:
                return j(new c(i, 100, false));
            case 40:
                return j(new c(i, 0, false));
            case 41:
                return j(new c(i, 0, false));
            case 45:
                return j(new c(i, 100, true));
            case 46:
                return j(new c(i, 0, false));
            case 47:
                return j(new c(i, 100, true));
            case 48:
                return j(new c(i, 0, false));
            case 49:
                return j(new c(i, 0, false));
            case 51:
                return j(new c(i, 0, true));
            case 52:
                return j(new c(i, 0, true));
            case 53:
                return j(new c(i, 100, true));
            case 54:
                return j(new c(i, 100, true));
            case 55:
                return j(new c(i, 0, true));
            case 56:
                return j(new c(i, 100, true));
        }
        return j(new c(i, 100, false));
    }

    public final boolean q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53ae3973", new Object[]{this, str})).booleanValue();
        }
        SharedPreferences sharedPreferences = this.f11464a;
        if (sharedPreferences == null) {
            return false;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.remove(str);
        edit.apply();
        return true;
    }

    public boolean r(String str, Object obj) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19353c42", new Object[]{this, str, obj})).booleanValue();
        }
        SharedPreferences sharedPreferences = this.f11464a;
        if (sharedPreferences == null) {
            return false;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (obj instanceof String) {
            edit.putString(str, (String) obj);
        } else if (obj instanceof Integer) {
            edit.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Boolean) {
            edit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else {
            z = false;
        }
        edit.apply();
        return z;
    }

    public final int s(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fdaa42b7", new Object[]{this, str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return i;
        }
    }

    public final int[] t(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("1747d3b7", new Object[]{this, str, new Integer(i)});
        }
        String[] split = str.split(",");
        int length = split.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = s(split[i2], i);
        }
        return iArr;
    }

    public final String[] u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("eba65943", new Object[]{this, str});
        }
        return str.split(",");
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.phenix.compat.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class C0648a implements z8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0648a() {
        }

        @Override // tb.z8l
        public void onConfigUpdate(String str, boolean z) {
            Map<String, String> configs;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
                return;
            }
            fiv.c("CloudConfig", "orange configs callback with group=%s, from cache=%b", str, Boolean.valueOf(z));
            if (!(z || !"android_image_function_control".equals(str) || (configs = OrangeConfigLocal.getInstance().getConfigs("android_image_function_control")) == null)) {
                Set<String> keySet = configs.keySet();
                SharedPreferences.Editor edit = a.a(a.this).edit();
                for (String str2 : keySet) {
                    String str3 = configs.get(str2);
                    edit.putString(a.b(a.this, str2), str3);
                    fiv.a("CloudConfig", "update configs from orange, save result=true, key=%s, value=%s", str2, str3);
                }
                edit.apply();
                synchronized (a.this) {
                    try {
                        if (a.c(a.this) != null) {
                            for (b bVar : a.c(a.this)) {
                                bVar.a(a.this);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public final void v(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86218e40", new Object[]{this, cVar});
            return;
        }
        try {
            String i = i(e(cVar.f11466a, "_coverage"));
            String i2 = i(e(cVar.f11466a, "_permanent"));
            String i3 = i(e(cVar.f11466a, "_model_blacklist"));
            String i4 = i(e(cVar.f11466a, "_vendor_blacklist"));
            String i5 = i(e(cVar.f11466a, "_api_blacklist"));
            String i6 = i(e(cVar.f11466a, "_cpu_blacklist"));
            String i7 = i(e(cVar.f11466a, "_model_whitelist"));
            String i8 = i(e(cVar.f11466a, "_vendor_whitelist"));
            fiv.a("CloudConfig", "update configs from local cache, fid=%d, coverage=%s, permanent=%s, modelBlacks=%s, vendorBlacks=%s, apiBlacks=%s, cpuBlacks=%s", Integer.valueOf(cVar.f11466a), i, i2, i3, i4, i5, i6);
            if (!TextUtils.isEmpty(i)) {
                cVar.b = Math.min(100, Math.max(0, s(i, cVar.b)));
            }
            if (!TextUtils.isEmpty(i2)) {
                cVar.c = "1".equals(i2);
            }
            if (!TextUtils.isEmpty(i3)) {
                cVar.f = u(i3);
            }
            if (!TextUtils.isEmpty(i4)) {
                cVar.g = u(i4);
            }
            if (!TextUtils.isEmpty(i5)) {
                cVar.i = t(i5, 0);
            }
            if (!TextUtils.isEmpty(i6)) {
                cVar.h = u(i6);
            }
            if (!TextUtils.isEmpty(i7)) {
                cVar.d = u(i7);
            }
            if (!TextUtils.isEmpty(i8)) {
                cVar.e = u(i8);
            }
        } catch (Exception e2) {
            fiv.c("CloudConfig", "update configs from local cache error=%s", e2);
        }
    }
}
