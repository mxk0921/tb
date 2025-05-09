package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.LruCache;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.f;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dx5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static File b;

    /* renamed from: a  reason: collision with root package name */
    public final LruCache<String, byte[]> f18126a = new LruCache<>(100);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final dx5 f18127a = new dx5();
        public static dx5 b = null;

        static {
            t2o.a(444597016);
        }

        public static /* synthetic */ dx5 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (dx5) ipChange.ipc$dispatch("110049e5", new Object[0]);
            }
            return b;
        }

        public static /* synthetic */ dx5 b(dx5 dx5Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (dx5) ipChange.ipc$dispatch("ffcbe293", new Object[]{dx5Var});
            }
            b = dx5Var;
            return dx5Var;
        }

        public static /* synthetic */ dx5 c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (dx5) ipChange.ipc$dispatch("5ebfc1e6", new Object[0]);
            }
            return f18127a;
        }
    }

    static {
        t2o.a(444597015);
    }

    public static dx5 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dx5) ipChange.ipc$dispatch("926e53c0", new Object[0]);
        }
        if (!DinamicXEngine.j0() || a.a() == null) {
            return a.c();
        }
        return a.a();
    }

    public static void l(dx5 dx5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("619bf3cf", new Object[]{dx5Var});
        } else if (a.a() == null) {
            a.b(dx5Var);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8798996a", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            synchronized (this.f18126a) {
                this.f18126a.remove(str);
            }
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b6ed177b", new Object[]{this});
        }
        return wh6.ASSET_DIR;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1bcb7a22", new Object[]{this});
        }
        File file = b;
        if (file == null) {
            return "";
        }
        return file.getAbsolutePath();
    }

    public void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("403285d0", new Object[]{this, context});
            return;
        }
        if (context == null) {
            la6.d("DinamicX_File", "DXFileManager", "context is null");
        }
        File file = b;
        if (file == null || !file.exists()) {
            File file2 = new File(context.getFilesDir(), wh6.DEFAULT_ROOT_DIR);
            b = file2;
            if (!file2.exists() && !b.mkdirs()) {
                b.mkdirs();
            }
        }
    }

    public boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f811d750", new Object[]{this, str})).booleanValue();
        }
        if (this.f18126a.snapshot().containsKey(str)) {
            return true;
        }
        return false;
    }

    public byte[] g(String str, DXRuntimeContext dXRuntimeContext) {
        List<f.a> list;
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("7643cfb5", new Object[]{this, str, dXRuntimeContext});
        }
        long nanoTime = System.nanoTime();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            synchronized (this.f18126a) {
                bArr = this.f18126a.get(str);
                if (bArr != null) {
                    if (bArr.length == 0) {
                    }
                    m("Template_Read", System.nanoTime() - nanoTime);
                }
                bArr = u06.e(str);
                if (bArr != null && bArr.length > 0) {
                    this.f18126a.put(str, bArr);
                }
                m("Template_Read", System.nanoTime() - nanoTime);
            }
            return bArr;
        } catch (IOException e) {
            if (dXRuntimeContext == null || dXRuntimeContext.m() == null || (list = dXRuntimeContext.m().c) == null) {
                return null;
            }
            f.a aVar = new f.a("Template", "Template_Read", f.DX_TEMPLATE_IO_READ_ERROR);
            if (e instanceof FileNotFoundException) {
                aVar.e = "fileNotFound " + str;
            } else {
                aVar.e = str + " " + xv5.a(e);
            }
            la6.b(aVar.e);
            list.add(aVar);
            return null;
        }
    }

    public void h(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98147f2f", new Object[]{this, str, bArr});
        } else if (!TextUtils.isEmpty(str) && bArr != null) {
            synchronized (this.f18126a) {
                try {
                    if (this.f18126a.get(str) == null) {
                        this.f18126a.put(str, bArr);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public JSONObject i(String str, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("517c107c", new Object[]{this, str, dXRuntimeContext});
        }
        byte[] g = g(str, dXRuntimeContext);
        if (g == null || g.length == 0) {
            return null;
        }
        return JSON.parseObject(new String(g));
    }

    public boolean j(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73e5a999", new Object[]{this, str, bArr})).booleanValue();
        }
        return k(str, bArr, true);
    }

    public boolean k(String str, byte[] bArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d03be3", new Object[]{this, str, bArr, new Boolean(z)})).booleanValue();
        }
        long nanoTime = System.nanoTime();
        boolean k = u06.k(str, bArr, z);
        if (k) {
            m("Template_Write", System.nanoTime() - nanoTime);
        }
        if (!k) {
            la6.b("文件写入失败 " + str);
        }
        return k;
    }

    public final void m(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d4adb2a", new Object[]{this, str, new Long(j)});
        } else {
            ic5.u(2, "DinamicX_File", "Template", str, null, null, j, true);
        }
    }
}
