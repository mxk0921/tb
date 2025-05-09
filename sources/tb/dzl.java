package tb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class dzl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

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
            context.startActivity(intent);
        } catch (Throwable th) {
            aqa.c("PermissionPageUtils.goIntentSetting.failed", th);
        }
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e389f44d", new Object[]{context});
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setFlags(268435456);
            intent.setAction("coloros.intent.action.launcher.SHORTCUT_SETTINGS");
            intent.setComponent(ComponentName.unflattenFromString("com.oppo.launcher/.shortcut.ShortcutSettingsActivity"));
            if (f(context, intent)) {
                context.startActivity(intent);
            } else {
                b(context);
            }
        } catch (Throwable th) {
            aqa.c("PermissionPageUtils.goOppoMainager.failed", th);
            b(context);
        }
    }

    public static void d(Context context) {
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
            if (f(context, intent)) {
                context.startActivity(intent);
            } else {
                b(context);
            }
        } catch (Throwable th) {
            aqa.c("PermissionPageUtils.goVivoMainager.failed", th);
            b(context);
        }
    }

    public static boolean f(Context context, Intent intent) {
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
                aqa.b("PermissionPageUtils.isIntentValid=%s", Boolean.valueOf(z));
                return z;
            } catch (Throwable th2) {
                th = th2;
                z2 = z;
                aqa.c("PermissionPageUtils.isIntentValid.error.", th);
                return z2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc98c5f2", new Object[]{context});
            return;
        }
        try {
            String a2 = a();
            aqa.b("PermissionPageManager", "goMiaoMiMainager --- rom : " + a2);
            Intent intent = new Intent();
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
            aqa.c("PermissionPageUtils.goXiaoMiMainager.failed", th);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
        if (r2.equals("xiaomi") == false) goto L_0x003b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(android.content.Context r5) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.dzl.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0012
            java.lang.String r3 = "4c2cabd5"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            r2.ipc$dispatch(r3, r1)
            return
        L_0x0012:
            java.lang.String r2 = android.os.Build.BRAND
            java.lang.String r2 = r2.toLowerCase()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "jumpPermissionPage --- BRAND : "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r4[r0] = r3
            java.lang.String r3 = "PermissionPageManager"
            tb.aqa.b(r3, r4)
            r2.hashCode()
            r3 = -1
            int r4 = r2.hashCode()
            switch(r4) {
                case -759499589: goto L_0x0061;
                case 3418016: goto L_0x0055;
                case 3620012: goto L_0x0049;
                case 108389869: goto L_0x003d;
                default: goto L_0x003b;
            }
        L_0x003b:
            r0 = -1
            goto L_0x006b
        L_0x003d:
            java.lang.String r0 = "redmi"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0047
            goto L_0x003b
        L_0x0047:
            r0 = 3
            goto L_0x006b
        L_0x0049:
            java.lang.String r0 = "vivo"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0053
            goto L_0x003b
        L_0x0053:
            r0 = 2
            goto L_0x006b
        L_0x0055:
            java.lang.String r0 = "oppo"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x005f
            goto L_0x003b
        L_0x005f:
            r0 = 1
            goto L_0x006b
        L_0x0061:
            java.lang.String r1 = "xiaomi"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x006b
            goto L_0x003b
        L_0x006b:
            switch(r0) {
                case 0: goto L_0x007a;
                case 1: goto L_0x0076;
                case 2: goto L_0x0072;
                case 3: goto L_0x007a;
                default: goto L_0x006e;
            }
        L_0x006e:
            b(r5)
            goto L_0x007d
        L_0x0072:
            d(r5)
            goto L_0x007d
        L_0x0076:
            c(r5)
            goto L_0x007d
        L_0x007a:
            e(r5)
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dzl.g(android.content.Context):void");
    }
}
