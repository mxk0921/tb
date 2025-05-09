package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.artry.constants.ResultCode;
import com.taobao.android.artry.resource.ResourceManager;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import tb.clv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class rf7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements rv2<List<clv>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ File f27337a;
        public final /* synthetic */ rv2 b;

        public a(File file, rv2 rv2Var) {
            this.f27337a = file;
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
                ch9.a(this.f27337a);
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
        public final Object f27338a = new Object();
        public boolean b;
        public List<clv> c;
        public ResultCode d;

        static {
            t2o.a(440401933);
            t2o.a(396361767);
        }

        public static /* synthetic */ Object a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("285a0dc7", new Object[]{bVar});
            }
            return bVar.f27338a;
        }

        public static /* synthetic */ boolean b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bcdfbd0", new Object[]{bVar})).booleanValue();
            }
            return bVar.b;
        }

        public static /* synthetic */ ResultCode c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ResultCode) ipChange.ipc$dispatch("42c69b5c", new Object[]{bVar});
            }
            return bVar.d;
        }

        public static /* synthetic */ List d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("4befab9", new Object[]{bVar});
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
            synchronized (this.f27338a) {
                try {
                    this.b = true;
                    this.d = xaoVar.b;
                    if (!dxv.h(xaoVar.c)) {
                        this.c = xaoVar.c;
                    }
                    this.f27338a.notifyAll();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static {
        t2o.a(440401931);
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

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea11bd1c", new Object[]{str})).booleanValue();
        }
        try {
            File file = new File(str);
            if (file.exists()) {
                return file.delete();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean c(Collection collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90b05181", new Object[]{collection})).booleanValue();
        }
        if (collection == null || collection.size() <= 0) {
            return true;
        }
        return false;
    }

    public static boolean d(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5577c53d", new Object[]{map})).booleanValue();
        }
        if (map == null || map.size() <= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean e(Bitmap.CompressFormat compressFormat, Bitmap bitmap, File file) {
        Throwable th;
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
                        ba.a("Utils", th, "failed to save bitmap to file[%s]", file.getAbsolutePath());
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

    public static void f(String str, Context context, Map<String, Bitmap> map, rv2<List<clv>> rv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcf0d10f", new Object[]{str, context, map, rv2Var});
        } else if (d(map)) {
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
                        if (a2 != null && a2.isDirectory() && a2.exists() && value != null && !value.isRecycled()) {
                            File file = new File(a2, System.currentTimeMillis() + "");
                            file.createNewFile();
                            if (e(Bitmap.CompressFormat.JPEG, value, file)) {
                                bVar.c(file.getPath());
                            }
                        }
                        arrayList.add(bVar.b());
                    }
                }
                d.j(arrayList, new a(a2, rv2Var));
            } catch (Throwable th) {
                ba.a("Utils", th, "failed to invoke the upload bitmap callback...", new Object[0]);
                xao.c(false, ResultCode.FAILURE_TAKE_PICTURE_ERROR, rv2Var);
            }
        }
    }

    public static List<clv> g(String str, Context context, Map<String, Bitmap> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("174c2fdb", new Object[]{str, context, map});
        }
        b bVar = new b();
        f(str, context, map, bVar);
        synchronized (b.a(bVar)) {
            if (!b.b(bVar)) {
                try {
                    b.a(bVar).wait(30000L);
                } catch (InterruptedException unused) {
                }
            }
        }
        if (b.c(bVar) != ResultCode.SUCCESS || c(b.d(bVar))) {
            return null;
        }
        return b.d(bVar);
    }
}
