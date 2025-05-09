package tb;

import android.content.Context;
import android.util.Log;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import tb.oit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class zig {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final oit f32791a;
    public final LruCache<String, DinamicTemplate> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements FilenameFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f32792a = -1;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;
        public final /* synthetic */ DinamicTemplate d;

        public a(zig zigVar, String str, int i, DinamicTemplate dinamicTemplate) {
            this.b = str;
            this.c = i;
            this.d = dinamicTemplate;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            int lastIndexOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6696dd14", new Object[]{this, file, str})).booleanValue();
            }
            if (!str.startsWith(this.b) || (lastIndexOf = str.lastIndexOf("_")) == -1) {
                return false;
            }
            try {
                int intValue = Integer.valueOf(str.substring(lastIndexOf + 1)).intValue();
                if (intValue > this.f32792a && intValue < this.c) {
                    this.f32792a = intValue;
                    this.d.version = String.valueOf(intValue);
                }
                return true;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
    }

    static {
        t2o.a(444596396);
    }

    public zig(Context context, String str) {
        if (context != null) {
            context.getApplicationContext();
        }
        this.b = new LruCache<>(16);
        this.f32791a = new oit.e().i(context).j(str + "_layout.db").n(str + xw0.ANIM_LAYOUT_TAG).l(16).k(2097152L).m(str).h();
    }

    public DinamicTemplate a(DinamicTemplate dinamicTemplate) {
        int intValue;
        DinamicTemplate dinamicTemplate2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicTemplate) ipChange.ipc$dispatch("2d1e44f7", new Object[]{this, dinamicTemplate});
        }
        String str = dinamicTemplate.name;
        try {
            intValue = Integer.valueOf(dinamicTemplate.version).intValue();
            dinamicTemplate2 = this.b.get(str);
        } catch (NumberFormatException unused) {
        }
        if (dinamicTemplate2 != null) {
            return dinamicTemplate2;
        }
        DinamicTemplate dinamicTemplate3 = new DinamicTemplate();
        String[] list = this.f32791a.g().list(new a(this, str, intValue, dinamicTemplate3));
        if (!(list == null || list.length == 0)) {
            dinamicTemplate3.name = str;
            return dinamicTemplate3;
        }
        return null;
    }

    public byte[] b(DinamicTemplate dinamicTemplate, String str, String str2, ojt ojtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("761f29da", new Object[]{this, dinamicTemplate, str, str2, ojtVar});
        }
        return c().h(dinamicTemplate, str, str2, ojtVar);
    }

    public final oit c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oit) ipChange.ipc$dispatch("e465f00a", new Object[]{this});
        }
        return this.f32791a;
    }

    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f370f898", new Object[]{this, str})).booleanValue();
        }
        if (c().f.get(str) != null || new File(this.f32791a.g(), str).exists()) {
            return true;
        }
        return false;
    }

    public byte[] e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("45c20d26", new Object[]{this, str, str2});
        }
        String str3 = str + "/" + str2 + ".xml";
        try {
            return g2d.a(AssetsDelegate.proxy_open(tl7.a().getAssets(), str3));
        } catch (IOException e) {
            Log.e("LayoutFileManager", "readAssert exception: " + str3, e);
            return null;
        }
    }

    public byte[] f(String str) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("6fbe9729", new Object[]{this, str});
        }
        oit c = c();
        byte[] bArr = null;
        try {
            byte[] bArr2 = c.f.get(str);
            if (bArr2 != null) {
                return bArr2;
            }
            try {
                return c.c(str, new ojt());
            } catch (Throwable th2) {
                th = th2;
                bArr = bArr2;
                Log.e("LayoutFileManager", "read local layout file exception", th);
                return bArr;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public byte[] g(String str, String str2) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("8ccc7ff7", new Object[]{this, str, str2});
        }
        byte[] bArr = null;
        try {
            byte[] bArr2 = c().f.get(str2);
            if (bArr2 != null) {
                return bArr2;
            }
            try {
                return e(str, str2);
            } catch (Throwable th2) {
                th = th2;
                bArr = bArr2;
                Log.e("LayoutFileManager", "read local layout file from asset exception", th);
                return bArr;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public byte[] h(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("629145d", new Object[]{this, str});
        }
        oit c = c();
        byte[] bArr = c.f.get(str);
        if (bArr != null) {
            return bArr;
        }
        File file = new File(c.g(), str);
        if (!file.exists()) {
            return null;
        }
        byte[] l = c.l(file);
        c.f.put(str, l);
        return l;
    }

    public void i(oit.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dc88d80", new Object[]{this, fVar});
        } else if (fVar != null) {
            this.f32791a.g = fVar;
        }
    }

    public void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("318788b5", new Object[]{this, new Integer(i)});
        } else {
            this.f32791a.m(i);
        }
    }
}
