package tb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.Event;
import com.alibaba.poplayer.trigger.InternalTriggerController;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class vem {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(790626505);
    }

    public static Object a(JSONObject jSONObject, String str) {
        Object a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("74758743", new Object[]{jSONObject, str});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            for (String str2 : jSONObject.keySet()) {
                if (!TextUtils.isEmpty(str2)) {
                    Object obj = jSONObject.get(str2);
                    if (str2.equals(str)) {
                        if (obj == null) {
                            return Boolean.FALSE;
                        }
                        return obj;
                    } else if (obj instanceof JSONObject) {
                        Object a3 = a(jSONObject.getJSONObject(str2), str);
                        if (a3 != null) {
                            return a3;
                        }
                    } else if (obj instanceof JSONArray) {
                        Iterator<Object> it = ((JSONArray) obj).iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if ((next instanceof JSONObject) && (a2 = a((JSONObject) next, str)) != null) {
                                return a2;
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
            }
        } catch (Throwable th) {
            wdm.h("findValueInJSONObject.error.", th);
        }
        return null;
    }

    public static OnePopModule b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnePopModule) ipChange.ipc$dispatch("439735c2", new Object[]{str});
        }
        OnePopModule onePopModule = new OnePopModule();
        onePopModule.b = str;
        onePopModule.f2533a = "PopHub";
        onePopModule.k = c2v.getInstance().getCurrentPageName();
        onePopModule.l = InternalTriggerController.getCurUri();
        try {
            onePopModule.m = URLEncoder.encode(InternalTriggerController.getCurActivityInfo(), "UTF-8");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        onePopModule.n = Event.b.b(5);
        onePopModule.o = "";
        onePopModule.k0 = "selfRender";
        onePopModule.j = "";
        return onePopModule;
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("89e64461", new Object[0]);
        }
        int i = c21.g().getInt("deviceLevel", -1);
        if (i == 0) {
            return "high";
        }
        if (i == 1) {
            return "middle";
        }
        if (i != 2) {
            return "";
        }
        return "low";
    }

    public static boolean d(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d1fb6f8", new Object[]{new Integer(i), new Long(j)})).booleanValue();
        }
        long abs = Math.abs(j);
        if (i < 0) {
            i = 0;
        }
        if (i > 100) {
            i = 100;
        }
        if (i == 0) {
            return false;
        }
        if (i != 100 && abs % 100 > i - 1) {
            return false;
        }
        return true;
    }

    public static String e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a83de091", new Object[]{str, str2});
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                return Uri.parse(str).getQueryParameter(str2);
            } catch (Throwable th) {
                wdm.h("getURLParam.error.", th);
            }
        }
        return "";
    }

    public static long f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64b9d13", new Object[]{str})).longValue();
        }
        long j = 0;
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        int length = str.length();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < length; i++) {
            j = (j * 31) + charArray[i];
        }
        return Long.MAX_VALUE & j;
    }

    public static boolean g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afe54a44", new Object[]{context})).booleanValue();
        }
        return TBDeviceUtils.p(context);
    }

    public static boolean h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f374103f", new Object[]{context})).booleanValue();
        }
        return TBDeviceUtils.P(context);
    }

    public static void k(byte[] bArr, File file) {
        Throwable th;
        IOException e;
        Bitmap decodeByteArray;
        FileOutputStream fileOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a8d7e1a", new Object[]{bArr, file});
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    if (file.isDirectory()) {
                        file.delete();
                    }
                    if (!file.getParentFile().exists()) {
                        file.getParentFile().mkdirs();
                    }
                    decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                    fileOutputStream = new FileOutputStream(file);
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e2) {
                e = e2;
            }
            try {
                decodeByteArray.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.flush();
                wdm.d("WaterMaskInfoManager.saveImageToFile.finish.file=" + file.getAbsolutePath(), new Object[0]);
                fileOutputStream.close();
            } catch (IOException e3) {
                e = e3;
                fileOutputStream2 = fileOutputStream;
                wdm.h("WaterMaskInfoManager.saveImageToFile.error", e);
                if (fileOutputStream2 != null) {
                    fileOutputStream2.close();
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (Throwable th4) {
                        th4.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th5) {
            th5.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [boolean] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap j(java.io.File r6) {
        /*
            r0 = 0
            java.lang.String r1 = "loadBitmapFromFile.Failed to decode bitmap from file: "
            java.lang.String r2 = "loadBitmapFromFile.Bitmap loaded successfully from file: "
            com.android.alibaba.ip.runtime.IpChange r3 = tb.vem.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001b
            java.lang.String r1 = "2b66d1f7"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r6
            java.lang.Object r6 = r3.ipc$dispatch(r1, r2)
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            return r6
        L_0x001b:
            r3 = 0
            boolean r4 = r6.exists()     // Catch: all -> 0x006f, IOException -> 0x0071
            if (r4 != 0) goto L_0x0023
            return r3
        L_0x0023:
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: all -> 0x006f, IOException -> 0x0071
            r4.<init>(r6)     // Catch: all -> 0x006f, IOException -> 0x0071
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r4)     // Catch: all -> 0x004c, IOException -> 0x004f
            if (r5 == 0) goto L_0x0051
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: all -> 0x004c, IOException -> 0x004f
            r1.<init>(r2)     // Catch: all -> 0x004c, IOException -> 0x004f
            java.lang.String r6 = r6.getAbsolutePath()     // Catch: all -> 0x004c, IOException -> 0x004f
            r1.append(r6)     // Catch: all -> 0x004c, IOException -> 0x004f
            java.lang.String r6 = r1.toString()     // Catch: all -> 0x004c, IOException -> 0x004f
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: all -> 0x004c, IOException -> 0x004f
            tb.wdm.d(r6, r0)     // Catch: all -> 0x004c, IOException -> 0x004f
            r4.close()     // Catch: all -> 0x0047
            goto L_0x004b
        L_0x0047:
            r6 = move-exception
            r6.printStackTrace()
        L_0x004b:
            return r5
        L_0x004c:
            r6 = move-exception
            r3 = r4
            goto L_0x0084
        L_0x004f:
            r6 = move-exception
            goto L_0x0073
        L_0x0051:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: all -> 0x004c, IOException -> 0x004f
            r2.<init>(r1)     // Catch: all -> 0x004c, IOException -> 0x004f
            java.lang.String r6 = r6.getAbsolutePath()     // Catch: all -> 0x004c, IOException -> 0x004f
            r2.append(r6)     // Catch: all -> 0x004c, IOException -> 0x004f
            java.lang.String r6 = r2.toString()     // Catch: all -> 0x004c, IOException -> 0x004f
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: all -> 0x004c, IOException -> 0x004f
            tb.wdm.d(r6, r0)     // Catch: all -> 0x004c, IOException -> 0x004f
            r4.close()     // Catch: all -> 0x006a
            goto L_0x006e
        L_0x006a:
            r6 = move-exception
            r6.printStackTrace()
        L_0x006e:
            return r3
        L_0x006f:
            r6 = move-exception
            goto L_0x0084
        L_0x0071:
            r6 = move-exception
            r4 = r3
        L_0x0073:
            java.lang.String r0 = "loadBitmapFromFile.error"
            tb.wdm.h(r0, r6)     // Catch: all -> 0x004c
            if (r4 == 0) goto L_0x0083
            r4.close()     // Catch: all -> 0x007f
            goto L_0x0083
        L_0x007f:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0083:
            return r3
        L_0x0084:
            if (r3 == 0) goto L_0x008e
            r3.close()     // Catch: all -> 0x008a
            goto L_0x008e
        L_0x008a:
            r0 = move-exception
            r0.printStackTrace()
        L_0x008e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.vem.j(java.io.File):android.graphics.Bitmap");
    }

    public static boolean i(Context context, String str) {
        Intent intent;
        List<ResolveInfo> queryIntentActivities;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9dcc2be6", new Object[]{context, str})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            String packageName = context.getPackageName();
            if (!TextUtils.isEmpty(packageName)) {
                str = "market://details?id=" + packageName;
            } else {
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
            }
            if (!TextUtils.isEmpty(str) && (queryIntentActivities = context.getPackageManager().queryIntentActivities((intent = new Intent("android.intent.action.VIEW", Uri.parse(str))), 65536)) != null) {
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    if ((resolveInfo.activityInfo.applicationInfo.flags & 1) != 0) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                        intent.setFlags(805339136);
                        context.startActivity(intent);
                        if (1 != 0) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            wdm.h("PopLayerWVPlugin.NavToUrl.market.error.", th);
            return false;
        }
    }
}
