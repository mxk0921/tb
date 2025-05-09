package tb;

import android.app.Application;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import tb.tu7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class o8o {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static o8o b = null;
    public static final String suffixName = ".png";

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, ArrayList<Drawable>> f25215a = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f25216a;
        public final /* synthetic */ String b;

        public a(c cVar, String str) {
            this.f25216a = cVar;
            this.b = str;
        }

        @Override // tb.o8o.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c09162bc", new Object[]{this});
                return;
            }
            c cVar = this.f25216a;
            if (cVar != null) {
                cVar.a();
            }
        }

        @Override // tb.o8o.c
        public void b(ArrayList<Drawable> arrayList) {
            c cVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d7e369f7", new Object[]{this, arrayList});
                return;
            }
            if (!(arrayList == null || (cVar = this.f25216a) == null)) {
                cVar.b(arrayList);
            }
            o8o.a(o8o.this).put(this.b, arrayList);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements tu7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f25217a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class a extends AsyncTask<String, Integer, Object> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                if (str.hashCode() == -1325021319) {
                    super.onPostExecute(objArr[0]);
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/uikit/utils/ResourceManager$2$1");
            }

            /* renamed from: a */
            public Object doInBackground(String... strArr) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ipChange.ipc$dispatch("67d66758", new Object[]{this, strArr});
                }
                return o8o.b(o8o.this, strArr[0]);
            }

            @Override // android.os.AsyncTask
            public void onPostExecute(Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b105c779", new Object[]{this, obj});
                    return;
                }
                super.onPostExecute(obj);
                if (obj != null) {
                    c cVar = b.this.f25217a;
                    if (cVar != null) {
                        cVar.b((ArrayList) obj);
                        return;
                    }
                    return;
                }
                c cVar2 = b.this.f25217a;
                if (cVar2 != null) {
                    cVar2.a();
                }
            }
        }

        public b(c cVar) {
            this.f25217a = cVar;
        }

        @Override // tb.tu7
        public void onDownloadError(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            c cVar = this.f25217a;
            if (cVar != null) {
                cVar.a();
            }
        }

        @Override // tb.tu7
        public void onDownloadFinish(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
            } else {
                new a().execute(str2);
            }
        }

        @Override // tb.tu7
        public void onDownloadProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.tu7
        public void onDownloadStateChange(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
            }
        }

        @Override // tb.tu7
        public void onFinish(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
            }
        }

        @Override // tb.tu7
        public void onNetworkLimit(int i, upl uplVar, tu7.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcf51783", new Object[]{this, new Integer(i), uplVar, aVar});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface c {
        void a();

        void b(ArrayList<Drawable> arrayList);
    }

    static {
        t2o.a(779093658);
    }

    public static /* synthetic */ HashMap a(o8o o8oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("b3b24c69", new Object[]{o8oVar});
        }
        return o8oVar.f25215a;
    }

    public static /* synthetic */ ArrayList b(o8o o8oVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("3019f92b", new Object[]{o8oVar, str});
        }
        return o8oVar.c(str);
    }

    public static o8o f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o8o) ipChange.ipc$dispatch("22fc2093", new Object[0]);
        }
        if (b == null) {
            b = new o8o();
        }
        return b;
    }

    public final ArrayList<Drawable> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("4691710b", new Object[]{this, str});
        }
        Application a2 = fkr.a();
        String b2 = tg9.b(a2, File.separator + "taolive");
        ArrayList<Drawable> arrayList = new ArrayList<>();
        File file = new File(str);
        FileInputStream fileInputStream = null;
        try {
            if (!TextUtils.isEmpty(str) && !str.endsWith(".zip")) {
                FileInputStream fileInputStream2 = new FileInputStream(new File(str));
                try {
                    arrayList.add(new BitmapDrawable(BitmapFactory.decodeStream(fileInputStream2)));
                    fileInputStream2.close();
                    return arrayList;
                } catch (Exception unused) {
                    fileInputStream = fileInputStream2;
                }
            }
        } catch (Exception unused2) {
        }
        try {
            ZipFile zipFile = new ZipFile(file);
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                String name = zipEntry.getName();
                if (!TextUtils.isEmpty(name) && name.endsWith(".png") && !name.contains("../")) {
                    File file2 = new File(b2 + wh6.DIR + tg9.a(name));
                    if (file2.isHidden()) {
                        file2.delete();
                    } else {
                        file2.delete();
                        if (!(zipEntry.getSize() == 0 || zipEntry.isDirectory() || (fileInputStream = zipFile.getInputStream(zipEntry)) == null)) {
                            arrayList.add(new BitmapDrawable(BitmapFactory.decodeStream(fileInputStream)));
                            fileInputStream.close();
                        }
                    }
                }
            }
            zipFile.close();
        } catch (Exception unused3) {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    public void e(String str, c cVar) {
        ArrayList<Drawable> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a76d407", new Object[]{this, str, cVar});
        } else if (!TextUtils.isEmpty(str)) {
            HashMap<String, ArrayList<Drawable>> hashMap = this.f25215a;
            if (hashMap == null || !hashMap.containsKey(str) || (arrayList = this.f25215a.get(str)) == null || cVar == null) {
                d(str, new a(cVar, str));
            } else {
                cVar.b(arrayList);
            }
        } else if (cVar != null) {
            cVar.a();
        }
    }

    public final void d(String str, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad17c10f", new Object[]{this, str, cVar});
            return;
        }
        if (!TextUtils.isEmpty(str) && !str.startsWith("http")) {
            str = uyv.HTTPS_SCHEMA.concat(str);
        }
        zu7 zu7Var = new zu7();
        upl uplVar = new upl();
        uplVar.f29547a = "my3dZone";
        uplVar.k = true;
        zu7Var.b = uplVar;
        ArrayList arrayList = new ArrayList();
        onf onfVar = new onf();
        onfVar.f25507a = str;
        arrayList.add(onfVar);
        zu7Var.f33016a = arrayList;
        rv7.e().b(zu7Var, new b(cVar));
    }
}
