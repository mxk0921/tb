package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Looper;
import android.taobao.mulitenv.EnvironmentSwitcher;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.taobao.android.artry.constants.ResultCode;
import com.taobao.android.artry.resource.ResourceManager;
import com.taobao.tao.TaoPackageInfo;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import tb.clv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class dxv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FEATURE = "TB3DSpace";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements rv2<List<clv>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ File f18142a;
        public final /* synthetic */ rv2 b;

        public a(File file, rv2 rv2Var) {
            this.f18142a = file;
            this.b = rv2Var;
        }

        @Override // tb.rv2
        public void callback(xao<List<clv>> xaoVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e2196b92", new Object[]{this, xaoVar});
                return;
            }
            try {
                ch9.a(this.f18142a);
            } catch (Throwable unused) {
            }
            rv2 rv2Var = this.b;
            if (rv2Var != null) {
                rv2Var.callback(xaoVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements rv2<List<clv>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Object f18143a = new Object();
        public boolean b;
        public List<clv> c;
        public ResultCode d;

        static {
            t2o.a(396361830);
            t2o.a(396361767);
        }

        public static /* synthetic */ Object a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("6190efc9", new Object[]{bVar});
            }
            return bVar.f18143a;
        }

        public static /* synthetic */ boolean b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b37ae64e", new Object[]{bVar})).booleanValue();
            }
            return bVar.b;
        }

        public static /* synthetic */ ResultCode c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ResultCode) ipChange.ipc$dispatch("5ee5621a", new Object[]{bVar});
            }
            return bVar.d;
        }

        public static /* synthetic */ List d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("88af22fb", new Object[]{bVar});
            }
            return bVar.c;
        }

        @Override // tb.rv2
        public void callback(xao<List<clv>> xaoVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e2196b92", new Object[]{this, xaoVar});
                return;
            }
            synchronized (this.f18143a) {
                try {
                    this.b = true;
                    this.d = xaoVar.b;
                    if (!dxv.h(xaoVar.c)) {
                        this.c = xaoVar.c;
                    }
                    this.f18143a.notifyAll();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static {
        t2o.a(396361828);
    }

    public static void a(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dff6303f", new Object[]{closeable});
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static JSONObject b(com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("44ed64cd", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            return new JSONObject(jSONObject.toJSONString());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static com.alibaba.fastjson.JSONObject c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.fastjson.JSONObject) ipChange.ipc$dispatch("3447ca2", new Object[]{str});
        }
        try {
            return JSON.parseObject(str);
        } catch (Throwable th) {
            Log.e("Utils", "failed to covert string[%] to json object..." + th);
            return null;
        }
    }

    public static Bitmap d(Bitmap bitmap) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("1875f4f0", new Object[]{bitmap});
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width == height) {
            return bitmap;
        }
        if (width > height) {
            i = height;
        } else {
            i = width;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, (width - i) / 2, (height - i) / 2, i, i);
        bitmap.recycle();
        return createBitmap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (r2 == null) goto L_0x0047;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String e(android.graphics.Bitmap r5) {
        /*
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = tb.dxv.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = "7933db17"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r5
            java.lang.Object r5 = r1.ipc$dispatch(r2, r3)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L_0x0015:
            r1 = 0
            if (r5 == 0) goto L_0x0047
            boolean r2 = r5.isRecycled()
            if (r2 == 0) goto L_0x001f
            goto L_0x0047
        L_0x001f:
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: all -> 0x0042
            r2.<init>()     // Catch: all -> 0x0042
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: all -> 0x0040
            r4 = 100
            r5.compress(r3, r4, r2)     // Catch: all -> 0x0040
            r2.flush()     // Catch: all -> 0x0040
            r2.close()     // Catch: all -> 0x0040
            byte[] r5 = r2.toByteArray()     // Catch: all -> 0x0040
            java.lang.String r1 = android.util.Base64.encodeToString(r5, r0)     // Catch: all -> 0x0040
        L_0x0039:
            r2.flush()     // Catch: IOException -> 0x0047
            r2.close()     // Catch: IOException -> 0x0047
            goto L_0x0047
        L_0x0040:
            goto L_0x0044
        L_0x0042:
            r2 = r1
        L_0x0044:
            if (r2 == 0) goto L_0x0047
            goto L_0x0039
        L_0x0047:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dxv.e(android.graphics.Bitmap):java.lang.String");
    }

    public static int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec2213a1", new Object[0])).intValue();
        }
        int a2 = EnvironmentSwitcher.a();
        if (a2 < 0 || a2 > 2) {
            return 0;
        }
        return a2;
    }

    public static boolean h(Collection collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90b05181", new Object[]{collection})).booleanValue();
        }
        if (collection == null || collection.size() <= 0) {
            return true;
        }
        return false;
    }

    public static boolean i(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5577c53d", new Object[]{map})).booleanValue();
        }
        if (map == null || map.size() <= 0) {
            return true;
        }
        return false;
    }

    public static boolean j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a68dde12", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith(h1p.HTTP_PREFIX) || str.startsWith(h1p.HTTPS_PREFIX)) {
            return true;
        }
        return false;
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83ffd3f8", new Object[0])).booleanValue();
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    public static boolean l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1ec5636", new Object[]{str})).booleanValue();
        }
        if ("212200".equals(str) || "36400112278902".equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean m() {
        ucq h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de700f89", new Object[0])).booleanValue();
        }
        if (l(TaoPackageInfo.sTTID) || (h = com.taobao.appbundle.a.Companion.a().h()) == null) {
            return true;
        }
        if (BundleInfoManager.instance().getDynamicFeatureInfo("TB3DSpace") == null || !h.f().contains("TB3DSpace")) {
            return false;
        }
        return true;
    }

    public static String n(Throwable th) {
        PrintWriter printWriter;
        StringWriter stringWriter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("893d92ec", new Object[]{th});
        }
        if (th == null) {
            return null;
        }
        try {
            stringWriter = new StringWriter();
            try {
                printWriter = new PrintWriter(stringWriter);
            } catch (Throwable unused) {
                printWriter = null;
            }
        } catch (Throwable unused2) {
            stringWriter = null;
            printWriter = null;
        }
        try {
            th.printStackTrace(printWriter);
            String stringWriter2 = stringWriter.toString();
            a(stringWriter);
            a(printWriter);
            return stringWriter2;
        } catch (Throwable unused3) {
            a(stringWriter);
            a(printWriter);
            return null;
        }
    }

    public static Bitmap o(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ddbfca24", new Object[]{bitmap, new Integer(i)});
        }
        if (bitmap == null) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        matrix.postScale(-1.0f, 1.0f, bitmap.getWidth() / 2, bitmap.getHeight() / 2);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* JADX WARN: Finally extract failed */
    public static boolean p(Bitmap.CompressFormat compressFormat, Bitmap bitmap, File file) {
        Object th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7548951", new Object[]{compressFormat, bitmap, file})).booleanValue();
        }
        if (bitmap == null || bitmap.isRecycled() || file == null || !file.exists() || !file.isFile()) {
            return false;
        }
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            if (compressFormat == null) {
                try {
                    compressFormat = Bitmap.CompressFormat.PNG;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    try {
                        Log.e("Utils", "failed to save" + th);
                        a(fileOutputStream);
                        return false;
                    } catch (Throwable th3) {
                        a(fileOutputStream);
                        throw th3;
                    }
                }
            }
            bitmap.compress(compressFormat, 80, fileOutputStream2);
            a(fileOutputStream2);
            return true;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static void q(boolean z, boolean z2, String str, Context context, Map<String, Bitmap> map, rv2<List<clv>> rv2Var) {
        String str2;
        Object th;
        String str3;
        Object th2;
        String str4 = "Utils";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cdd190f", new Object[]{new Boolean(z), new Boolean(z2), str, context, map, rv2Var});
        } else if (i(map)) {
            xao.b(true, ResultCode.SUCCESS, null, rv2Var);
        } else {
            if (TextUtils.isEmpty(str)) {
                xao.c(false, ResultCode.FAILED_TO_UPLOAD_PICTURE, rv2Var);
            }
            try {
                ArrayList arrayList = new ArrayList();
                ResourceManager d = ResourceManager.d();
                d.f(context);
                File a2 = d.a(System.currentTimeMillis() + "");
                for (Map.Entry<String, Bitmap> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (!TextUtils.isEmpty(key)) {
                        clv.b bVar = new clv.b(str, key);
                        Bitmap value = entry.getValue();
                        if (z) {
                            bVar.a("base64", e(value));
                        }
                        if (a2 == null || !a2.isDirectory() || !a2.exists() || value == null || value.isRecycled()) {
                            str2 = str4;
                        } else {
                            if (z2) {
                                try {
                                    value = d(value);
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    str3 = str4;
                                    try {
                                        str2 = str3;
                                        try {
                                            Log.e(str2, "failed to save bitmap..." + th2);
                                            arrayList.add(bVar.b());
                                            str4 = str2;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            Log.e(str2, "failed to invoke the upload bitmap callback..." + th);
                                            xao.c(false, ResultCode.FAILURE_TAKE_PICTURE_ERROR, rv2Var);
                                            return;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        str2 = str3;
                                        Log.e(str2, "failed to invoke the upload bitmap callback..." + th);
                                        xao.c(false, ResultCode.FAILURE_TAKE_PICTURE_ERROR, rv2Var);
                                        return;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            str3 = str4;
                            try {
                                sb.append(System.currentTimeMillis());
                                sb.append("");
                                File file = new File(a2, sb.toString());
                                file.createNewFile();
                                if (p(Bitmap.CompressFormat.JPEG, value, file)) {
                                    bVar.c(file.getPath());
                                }
                                str2 = str3;
                            } catch (Throwable th6) {
                                th2 = th6;
                                str2 = str3;
                                Log.e(str2, "failed to save bitmap..." + th2);
                                arrayList.add(bVar.b());
                                str4 = str2;
                            }
                        }
                        arrayList.add(bVar.b());
                        str4 = str2;
                    }
                }
                str2 = str4;
                d.j(arrayList, new a(a2, rv2Var));
            } catch (Throwable th7) {
                th = th7;
                str2 = str4;
            }
        }
    }

    public static List<clv> r(boolean z, boolean z2, String str, Context context, Map<String, Bitmap> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9e94d29b", new Object[]{new Boolean(z), new Boolean(z2), str, context, map});
        }
        b bVar = new b();
        q(z, z2, str, context, map, bVar);
        synchronized (b.a(bVar)) {
            if (!b.b(bVar)) {
                try {
                    b.a(bVar).wait(30000L);
                } catch (InterruptedException unused) {
                }
            }
        }
        if (b.c(bVar) != ResultCode.SUCCESS || h(b.d(bVar))) {
            return null;
        }
        return b.d(bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006c A[Catch: Exception -> 0x0034, TRY_LEAVE, TryCatch #0 {Exception -> 0x0034, blocks: (B:8:0x0022, B:10:0x002e, B:14:0x0036, B:16:0x0057, B:18:0x0061, B:20:0x006c), top: B:26:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.String, java.lang.Integer> g(android.app.Activity r10, android.net.Uri r11) {
        /*
            r0 = 0
            java.lang.String r1 = ""
            java.lang.String r2 = "_data"
            com.android.alibaba.ip.runtime.IpChange r3 = tb.dxv.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r1 = "92e32899"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r10
            r10 = 1
            r2[r10] = r11
            java.lang.Object r10 = r3.ipc$dispatch(r1, r2)
            android.util.Pair r10 = (android.util.Pair) r10
            return r10
        L_0x001c:
            if (r10 == 0) goto L_0x0093
            if (r11 != 0) goto L_0x0022
            goto L_0x0093
        L_0x0022:
            java.lang.String r3 = "file"
            java.lang.String r4 = r11.getScheme()     // Catch: Exception -> 0x0034
            boolean r3 = r3.equals(r4)     // Catch: Exception -> 0x0034
            if (r3 == 0) goto L_0x0036
            java.lang.String r10 = r11.getPath()     // Catch: Exception -> 0x0034
        L_0x0032:
            r11 = 0
            goto L_0x0061
        L_0x0034:
            r10 = move-exception
            goto L_0x0072
        L_0x0036:
            java.lang.String[] r5 = new java.lang.String[]{r2}     // Catch: Exception -> 0x0034
            r7 = 0
            r8 = 0
            r6 = 0
            r3 = r10
            r4 = r11
            android.database.Cursor r10 = r3.managedQuery(r4, r5, r6, r7, r8)     // Catch: Exception -> 0x0034
            int r11 = r10.getColumnIndexOrThrow(r2)     // Catch: Exception -> 0x0034
            java.lang.String r2 = "orientation"
            int r2 = r10.getColumnIndex(r2)     // Catch: Exception -> 0x0034
            r10.moveToFirst()     // Catch: Exception -> 0x0034
            java.lang.String r11 = r10.getString(r11)     // Catch: Exception -> 0x0034
            if (r2 < 0) goto L_0x005f
            int r10 = r10.getInt(r2)     // Catch: Exception -> 0x0034
            r9 = r11
            r11 = r10
            r10 = r9
            goto L_0x0061
        L_0x005f:
            r10 = r11
            goto L_0x0032
        L_0x0061:
            java.io.File r2 = new java.io.File     // Catch: Exception -> 0x0034
            r2.<init>(r10)     // Catch: Exception -> 0x0034
            boolean r10 = r2.exists()     // Catch: Exception -> 0x0034
            if (r10 == 0) goto L_0x0070
            java.lang.String r1 = r2.getAbsolutePath()     // Catch: Exception -> 0x0034
        L_0x0070:
            r0 = r11
            goto L_0x0089
        L_0x0072:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r2 = "get image error:"
            r11.<init>(r2)
            java.lang.String r10 = r10.getLocalizedMessage()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            java.lang.String r11 = "Utils"
            android.util.Log.e(r11, r10)
        L_0x0089:
            android.util.Pair r10 = new android.util.Pair
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r10.<init>(r1, r11)
            return r10
        L_0x0093:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dxv.g(android.app.Activity, android.net.Uri):android.util.Pair");
    }
}
