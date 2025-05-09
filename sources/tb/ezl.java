package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ezl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(790626328);
    }

    public static String a() {
        BufferedReader bufferedReader;
        Throwable th;
        IOException e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13bf55e7", new Object[0]);
        }
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ro.miui.ui.version.name").getInputStream()), 1024);
            try {
                try {
                    String readLine = bufferedReader.readLine();
                    bufferedReader.close();
                    try {
                        bufferedReader.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    return readLine;
                } catch (IOException e3) {
                    e = e3;
                    e.printStackTrace();
                    try {
                        bufferedReader.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    bufferedReader.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
                throw th;
            }
        } catch (IOException e6) {
            e = e6;
            bufferedReader = null;
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
            bufferedReader.close();
            throw th;
        }
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53cc8495", new Object[]{context});
            return;
        }
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", "com.taobao.taobao", null));
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (Throwable th) {
            wdm.h("PermissionPageUtils.goIntentSetting.failed", th);
        }
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("101f56c1", new Object[]{context});
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setClassName("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.SoftPermissionDetailActivity");
            intent.setAction("secure.intent.action.softPermissionDetail");
            intent.putExtra(NewHtcHomeBadger.PACKAGENAME, "com.taobao.taobao");
            intent.setFlags(268435456);
            if (e(context, intent)) {
                context.startActivity(intent);
            } else {
                b(context);
            }
        } catch (Throwable th) {
            wdm.h("PermissionPageUtils.goVivoMainager.failed", th);
            b(context);
        }
    }

    public static boolean e(Context context, Intent intent) {
        Throwable th;
        boolean z;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73e7206c", new Object[]{context, intent})).booleanValue();
        }
        try {
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                z = true;
            } else {
                z = false;
            }
            try {
                wdm.d("PermissionPageUtils.isIntentValid=%s", Boolean.valueOf(z));
                return z;
            } catch (Throwable th2) {
                th = th2;
                z2 = z;
                wdm.h("PermissionPageUtils.isIntentValid.error.", th);
                return z2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc98c5f2", new Object[]{context});
            return;
        }
        try {
            String a2 = a();
            wdm.d("goMiaoMiMainager --- rom : " + a2, new Object[0]);
            Intent intent = new Intent();
            intent.setFlags(268435456);
            if (!"V6".equals(a2) && !"V7".equals(a2)) {
                if (!"V8".equals(a2) && !"V9".equals(a2) && !"V10".equals(a2) && !"V11".equals(a2) && !"V12".equals(a2)) {
                    b(context);
                    context.startActivity(intent);
                }
                intent.setAction("miui.intent.action.APP_PERM_EDITOR");
                intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity");
                intent.putExtra("extra_pkgname", "com.taobao.taobao");
                context.startActivity(intent);
            }
            intent.setAction("miui.intent.action.APP_PERM_EDITOR");
            intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity");
            intent.putExtra("extra_pkgname", "com.taobao.taobao");
            context.startActivity(intent);
        } catch (Throwable th) {
            wdm.h("PermissionPageUtils.goXiaoMiMainager.failed", th);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
        if (r6.equals("vivo") == false) goto L_0x0045;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void f(android.content.Context r5, boolean r6) {
        /*
            r0 = 1
            r1 = 2
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = tb.ezl.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001a
            java.lang.Boolean r4 = new java.lang.Boolean
            r4.<init>(r6)
            java.lang.Object[] r6 = new java.lang.Object[r1]
            r6[r2] = r5
            r6[r0] = r4
            java.lang.String r5 = "3969819f"
            r3.ipc$dispatch(r5, r6)
            return
        L_0x001a:
            if (r6 == 0) goto L_0x0020
            b(r5)
            return
        L_0x0020:
            java.lang.String r6 = android.os.Build.BRAND
            java.lang.String r6 = r6.toLowerCase()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "jumpPermissionPage --- BRAND : "
            r3.<init>(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r4 = new java.lang.Object[r2]
            tb.wdm.d(r3, r4)
            r6.hashCode()
            r3 = -1
            int r4 = r6.hashCode()
            switch(r4) {
                case -759499589: goto L_0x005d;
                case 3620012: goto L_0x0053;
                case 108389869: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            r0 = -1
            goto L_0x0068
        L_0x0047:
            java.lang.String r0 = "redmi"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0051
            goto L_0x0045
        L_0x0051:
            r0 = 2
            goto L_0x0068
        L_0x0053:
            java.lang.String r1 = "vivo"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0068
            goto L_0x0045
        L_0x005d:
            java.lang.String r0 = "xiaomi"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0067
            goto L_0x0045
        L_0x0067:
            r0 = 0
        L_0x0068:
            switch(r0) {
                case 0: goto L_0x0073;
                case 1: goto L_0x006f;
                case 2: goto L_0x0073;
                default: goto L_0x006b;
            }
        L_0x006b:
            b(r5)
            goto L_0x0076
        L_0x006f:
            c(r5)
            goto L_0x0076
        L_0x0073:
            d(r5)
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ezl.f(android.content.Context, boolean):void");
    }
}
