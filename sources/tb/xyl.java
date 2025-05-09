package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.ContextCompat;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xyl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TB_GUANGGUANG = "TB_GUANGGUANG";
    public static final String[] PERMISSION_CAMERA = {t4p.CAMERA};
    public static final String[] PERMISSION_STORAGE = {"android.permission.READ_EXTERNAL_STORAGE"};
    public static final String[] PERMISSION_MIC = {"android.permission.RECORD_AUDIO"};
    public static final String READ_MEDIA_IMAGES = "android.permission.READ_MEDIA_IMAGES";
    public static final String READ_MEDIA_VIDEO = "android.permission.READ_MEDIA_VIDEO";
    public static final String[] PERMISSION_ALBUM = {READ_MEDIA_IMAGES, READ_MEDIA_VIDEO};
    public static final String READ_MEDIA_VISUAL_USER_SELECTED = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED";
    public static final String[] PERMISSION_ALBUM_ABOVE_14 = {READ_MEDIA_IMAGES, READ_MEDIA_VIDEO, READ_MEDIA_VISUAL_USER_SELECTED};

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f31698a;
        public final /* synthetic */ Runnable b;
        public final /* synthetic */ Runnable c;

        public b(Activity activity, Runnable runnable, Runnable runnable2) {
            this.f31698a = activity;
            this.b = runnable;
            this.c = runnable2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            odg.c("LCPermission", "deny, permission = " + Arrays.toString(xyl.c(this.f31698a)));
            if (xyl.h(this.f31698a)) {
                Runnable runnable = this.b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            Runnable runnable2 = this.c;
            if (runnable2 != null) {
                runnable2.run();
            }
        }
    }

    static {
        t2o.a(511705645);
        SimpleArrayMap simpleArrayMap = new SimpleArrayMap(8);
        simpleArrayMap.put("com.android.voicemail.permission.ADD_VOICEMAIL", 14);
        simpleArrayMap.put("android.permission.BODY_SENSORS", 20);
        simpleArrayMap.put("android.permission.READ_CALL_LOG", 16);
        simpleArrayMap.put("android.permission.READ_EXTERNAL_STORAGE", 16);
        simpleArrayMap.put("android.permission.USE_SIP", 9);
        simpleArrayMap.put("android.permission.WRITE_CALL_LOG", 16);
        simpleArrayMap.put("android.permission.SYSTEM_ALERT_WINDOW", 23);
        simpleArrayMap.put("android.permission.WRITE_SETTINGS", 23);
    }

    public static int a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3912bbff", new Object[]{context, str, str2})).intValue();
        }
        try {
            qzl d = com.taobao.runtimepermission.a.d(context, str, new String[]{str2});
            if (d == null) {
                return -1;
            }
            int[] iArr = d.b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        } catch (RuntimeException unused) {
            return -1;
        }
    }

    public static int b(Context context, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6bd3fb10", new Object[]{context, str, strArr})).intValue();
        }
        for (String str2 : strArr) {
            int a2 = a(context, str, str2);
            if (a2 != 0) {
                return a2;
            }
        }
        return 0;
    }

    public static String[] c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("cb5fb09e", new Object[]{activity});
        }
        if (Build.VERSION.SDK_INT >= 34 && ng8.h(activity) && eag.d()) {
            return PERMISSION_ALBUM_ABOVE_14;
        }
        if (!ng8.b(activity) || !ng8.h(activity)) {
            return PERMISSION_STORAGE;
        }
        return PERMISSION_ALBUM;
    }

    public static boolean d(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4366a3f1", new Object[]{context, str, str2})).booleanValue();
        }
        if (a(context, str, str2) == 0) {
            return true;
        }
        return false;
    }

    public static boolean e(Context context, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa99ce83", new Object[]{context, str, strArr})).booleanValue();
        }
        for (String str2 : strArr) {
            if (!d(context, str, str2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean g(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b44cf9b", new Object[]{activity})).booleanValue();
        }
        boolean K = eag.K();
        if (Build.VERSION.SDK_INT < 34 || !ng8.h(activity) || !i(K, activity, READ_MEDIA_VISUAL_USER_SELECTED) || i(K, activity, READ_MEDIA_IMAGES)) {
            return false;
        }
        return true;
    }

    public static boolean h(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c88b64f", new Object[]{activity})).booleanValue();
        }
        if (!g(activity)) {
            return f(activity);
        }
        odg.c("LCPermission", "Android 14 part Granted");
        return true;
    }

    public static boolean i(boolean z, Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("723d482b", new Object[]{new Boolean(z), activity, str})).booleanValue();
        }
        if (z) {
            return e(activity, TB_GUANGGUANG, str);
        }
        if (ContextCompat.checkSelfPermission(activity, str) == 0) {
            return true;
        }
        return false;
    }

    public static boolean j(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7d2d428", new Object[]{activity})).booleanValue();
        }
        for (String str : PERMISSION_ALBUM) {
            if (!i(eag.K(), activity, str)) {
                return false;
            }
        }
        return true;
    }

    public static void l(Activity activity, Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b9440e4", new Object[]{activity, runnable, runnable2});
            return;
        }
        SpannableString spannableString = new SpannableString(Localization.q(R.string.gg_pub_confirm_album_permission));
        spannableString.setSpan(new TextAppearanceSpan(null, 1, t74.a(activity.getApplicationContext(), 16.0f), ColorStateList.valueOf(-1), null), 6, 8, 33);
        com.taobao.runtimepermission.a.c(activity, c(activity)).w(spannableString.toString()).B(false).y(1L).z(new b(activity, runnable, runnable2)).A(runnable2).u(new a()).x(true).m();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements gjb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.gjb
        public void a(qzl qzlVar) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("475e28c8", new Object[]{this, qzlVar});
            } else if (qzlVar != null && qzlVar.b != null && qzlVar.f27021a != null && qzlVar.c != null) {
                int i = 0;
                while (i < qzlVar.f27021a.length) {
                    StringBuilder sb = new StringBuilder("permission =");
                    sb.append(qzlVar.f27021a[i]);
                    sb.append(",result = ");
                    int[] iArr = qzlVar.b;
                    sb.append(i < iArr.length ? iArr[i] : -1000);
                    sb.append(",msg = ");
                    String[] strArr = qzlVar.c;
                    if (i < strArr.length) {
                        str = strArr[i];
                    } else {
                        str = "";
                    }
                    sb.append(str);
                    odg.c("LCPermission", sb.toString());
                    i++;
                }
            }
        }
    }

    public static boolean f(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e075273c", new Object[]{activity})).booleanValue();
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            return true;
        }
        boolean K = eag.K();
        String[] c = c(activity);
        if (i < 34 || !eag.G()) {
            for (String str : c) {
                if (!i(K, activity, str)) {
                    return false;
                }
            }
            return true;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        int i2 = 0;
        for (String str2 : c) {
            boolean i3 = i(K, activity, str2);
            odg.c("LCPermission", "permission = " + str2 + ",result = " + i3 + ", useBiz = " + K);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append("=");
            sb2.append(i3);
            sb2.append(";");
            sb.append(sb2.toString());
            if (i3) {
                i2++;
                z = true;
            }
        }
        if (z && i2 < 3) {
            ((lvc) kdp.a(lvc.class, new Object[0])).commitWarning("onion_album", "9009", "album_permission_error", sb.toString(), "", null);
        }
        return z;
    }

    public static void k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25780cec", new Object[]{context});
            return;
        }
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addFlags(268435456);
            intent.setData(Uri.fromParts("package", context.getPackageName(), null));
            context.startActivity(intent);
        } catch (Exception e) {
            odg.c("LCPermission", "open setting page error: " + e.getMessage());
        }
    }
}
