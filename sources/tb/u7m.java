package tb;

import android.app.Activity;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class u7m {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HAS_MEDIA_PERMISSION = 0;
    public static final int NO_MEDIA_PERMISSION = -2;
    public static final int NO_MEDIA_PERMISSION_EXCLUDE_PART_AUTH = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements q8d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(d dVar) {
        }

        @Override // tb.q8d
        public void a(String[] strArr, int[] iArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e648db2a", new Object[]{this, strArr, iArr});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ d c;

        public b(d dVar) {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/util/PltPermissionUtils$2");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ d c;

        public c(d dVar) {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/util/PltPermissionUtils$3");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface d {
        void onPermissionGranted();
    }

    static {
        t2o.a(481297639);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.app.Activity r5, java.lang.String r6, tb.u7m.d r7) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.u7m.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0018
            java.lang.String r3 = "4cf5260b"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            r5 = 2
            r4[r5] = r7
            r2.ipc$dispatch(r3, r4)
            return
        L_0x0018:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r2 >= r3) goto L_0x0024
            if (r7 == 0) goto L_0x0023
            r7.onPermissionGranted()
        L_0x0023:
            return
        L_0x0024:
            r3 = 33
            if (r2 >= r3) goto L_0x003a
            java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
            int r5 = tb.t7m.a(r5, r0)
            if (r5 == 0) goto L_0x0034
            h(r6, r7)
            goto L_0x0039
        L_0x0034:
            if (r7 == 0) goto L_0x0039
            r7.onPermissionGranted()
        L_0x0039:
            return
        L_0x003a:
            java.lang.String r3 = "android.permission.READ_MEDIA_IMAGES"
            int r3 = tb.t7m.a(r5, r3)
            if (r3 != 0) goto L_0x004c
            java.lang.String r3 = "android.permission.READ_MEDIA_VIDEO"
            int r3 = tb.t7m.a(r5, r3)
            if (r3 != 0) goto L_0x004c
            r3 = 1
            goto L_0x004d
        L_0x004c:
            r3 = 0
        L_0x004d:
            r4 = 34
            if (r2 >= r4) goto L_0x005d
            if (r3 == 0) goto L_0x0059
            if (r7 == 0) goto L_0x005c
            r7.onPermissionGranted()
            goto L_0x005c
        L_0x0059:
            i(r6, r1, r7)
        L_0x005c:
            return
        L_0x005d:
            if (r3 == 0) goto L_0x0065
            if (r7 == 0) goto L_0x0064
            r7.onPermissionGranted()
        L_0x0064:
            return
        L_0x0065:
            java.lang.String r1 = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"
            int r5 = tb.t7m.a(r5, r1)
            if (r5 != 0) goto L_0x0073
            if (r7 == 0) goto L_0x0072
            r7.onPermissionGranted()
        L_0x0072:
            return
        L_0x0073:
            i(r6, r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.u7m.a(android.app.Activity, java.lang.String, tb.u7m$d):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        if (r3 == 0) goto L_0x0041;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(android.content.Context r5) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.u7m.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "bde39375"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            java.lang.Object r5 = r2.ipc$dispatch(r3, r1)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            return r5
        L_0x0019:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r2 >= r3) goto L_0x0020
            return r0
        L_0x0020:
            r3 = 33
            r4 = -2
            if (r2 >= r3) goto L_0x002f
            java.lang.String r1 = "android.permission.READ_EXTERNAL_STORAGE"
            int r5 = tb.o9k.a(r5, r1)
            if (r5 != 0) goto L_0x002e
            return r0
        L_0x002e:
            return r4
        L_0x002f:
            java.lang.String r3 = "android.permission.READ_MEDIA_IMAGES"
            int r3 = tb.o9k.a(r5, r3)
            if (r3 != 0) goto L_0x0040
            java.lang.String r3 = "android.permission.READ_MEDIA_VIDEO"
            int r3 = tb.o9k.a(r5, r3)
            if (r3 != 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r1 = 0
        L_0x0041:
            r3 = 34
            if (r2 >= r3) goto L_0x004a
            if (r1 == 0) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r0 = -2
        L_0x0049:
            return r0
        L_0x004a:
            if (r1 == 0) goto L_0x004d
            return r0
        L_0x004d:
            java.lang.String r0 = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"
            int r5 = tb.o9k.a(r5, r0)
            if (r5 != 0) goto L_0x0057
            r5 = -1
            return r5
        L_0x0057:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.u7m.b(android.content.Context):int");
    }

    public static boolean c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a671bb4e", new Object[]{activity})).booleanValue();
        }
        if (activity.getApplicationInfo().targetSdkVersion < 33 || Build.VERSION.SDK_INT < 33) {
            if (Build.VERSION.SDK_INT >= 23) {
                return !ActivityCompat.shouldShowRequestPermissionRationale(activity, "android.permission.READ_EXTERNAL_STORAGE");
            }
            return false;
        } else if (!ActivityCompat.shouldShowRequestPermissionRationale(activity, xyl.READ_MEDIA_IMAGES) || !ActivityCompat.shouldShowRequestPermissionRationale(activity, xyl.READ_MEDIA_VIDEO)) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean d(android.content.Context r5) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.u7m.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "1ff0de33"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            java.lang.Object r5 = r2.ipc$dispatch(r3, r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L_0x0019:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r2 >= r3) goto L_0x0020
            return r1
        L_0x0020:
            r3 = 33
            if (r2 >= r3) goto L_0x002e
            java.lang.String r2 = "android.permission.READ_EXTERNAL_STORAGE"
            int r5 = tb.o9k.a(r5, r2)
            if (r5 != 0) goto L_0x002d
            r0 = 1
        L_0x002d:
            return r0
        L_0x002e:
            java.lang.String r3 = "android.permission.READ_MEDIA_IMAGES"
            int r3 = tb.o9k.a(r5, r3)
            if (r3 != 0) goto L_0x0040
            java.lang.String r3 = "android.permission.READ_MEDIA_VIDEO"
            int r3 = tb.o9k.a(r5, r3)
            if (r3 != 0) goto L_0x0040
            r3 = 1
            goto L_0x0041
        L_0x0040:
            r3 = 0
        L_0x0041:
            r4 = 34
            if (r2 >= r4) goto L_0x0046
            return r3
        L_0x0046:
            if (r3 == 0) goto L_0x0049
            return r1
        L_0x0049:
            java.lang.String r2 = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"
            int r5 = tb.o9k.a(r5, r2)
            if (r5 != 0) goto L_0x0052
            r0 = 1
        L_0x0052:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.u7m.d(android.content.Context):boolean");
    }

    public static boolean e(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e38b4ab", new Object[]{activity})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 23 && ContextCompat.checkSelfPermission(activity, t4p.CAMERA) != 0) {
            return false;
        }
        return true;
    }

    public static boolean f() {
        boolean canDrawOverlays;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c578e7ca", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        canDrawOverlays = Settings.canDrawOverlays(caa.c());
        return canDrawOverlays;
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad12b35a", new Object[0])).booleanValue();
        }
        return "true".equals(lg4.f2("image_search", "use_sys_album", "false"));
    }

    public static void h(String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30c76c0c", new Object[]{str, dVar});
        } else {
            com.taobao.runtimepermission.a.c(caa.c(), new String[]{"android.permission.READ_EXTERNAL_STORAGE"}).t("biz_imgsearch").A(new c(dVar)).z(new b(dVar)).x(true).w(str).y(lg4.t3()).m();
        }
    }

    public static void i(String str, boolean z, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b798d5e3", new Object[]{str, new Boolean(z), dVar});
            return;
        }
        Log.e("Permission", "Request Permission");
        com.taobao.runtimepermission.a.c(caa.c(), z ? new String[]{xyl.READ_MEDIA_IMAGES, xyl.READ_MEDIA_VIDEO, xyl.READ_MEDIA_VISUAL_USER_SELECTED} : new String[]{xyl.READ_MEDIA_IMAGES, xyl.READ_MEDIA_VIDEO}).t("biz_imgsearch").v(new a(dVar)).x(true).w(str).y(0L).m();
    }

    public static void j(String str, boolean z, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("651106d0", new Object[]{str, new Boolean(z), dVar});
        } else {
            i(str, z, dVar);
        }
    }
}
