package tb;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
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

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class p8o {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String b = p8o.class.getSimpleName();
    public static final String suffixName = ".png";

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, ArrayList<Drawable>> f25943a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f25944a;
        public final /* synthetic */ String b;

        public a(c cVar, String str) {
            this.f25944a = cVar;
            this.b = str;
        }

        @Override // tb.p8o.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c09162bc", new Object[]{this});
                return;
            }
            c cVar = this.f25944a;
            if (cVar != null) {
                cVar.a();
            }
        }

        @Override // tb.p8o.c
        public void b(ArrayList<Drawable> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d7e369f7", new Object[]{this, arrayList});
                return;
            }
            if (arrayList != null) {
                this.f25944a.b(arrayList);
            }
            p8o.a(p8o.this).put(this.b, arrayList);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements pt7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f25945a;

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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/service/ResourceManager$2$1");
            }

            /* renamed from: a */
            public Object doInBackground(String... strArr) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ipChange.ipc$dispatch("67d66758", new Object[]{this, strArr});
                }
                return p8o.b(p8o.this, strArr[0]);
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
                    c cVar = b.this.f25945a;
                    if (cVar != null) {
                        cVar.b((ArrayList) obj);
                        return;
                    }
                    return;
                }
                c cVar2 = b.this.f25945a;
                if (cVar2 != null) {
                    cVar2.a();
                }
            }
        }

        public b(c cVar) {
            this.f25945a = cVar;
        }

        @Override // tb.pt7
        public void onDownloadError(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            c cVar = this.f25945a;
            if (cVar != null) {
                cVar.a();
            }
        }

        @Override // tb.pt7
        public void onDownloadFinish(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
            } else {
                new a().execute(str2);
            }
        }

        @Override // tb.pt7
        public void onDownloadProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.pt7
        public void onDownloadStateChange(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
            }
        }

        @Override // tb.pt7
        public void onFinish(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface c {
        void a();

        void b(ArrayList<Drawable> arrayList);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final p8o f25947a = new p8o(null);

        static {
            t2o.a(806355787);
        }

        public static /* synthetic */ p8o a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (p8o) ipChange.ipc$dispatch("6ddc74e4", new Object[0]);
            }
            return f25947a;
        }
    }

    static {
        t2o.a(806355782);
    }

    public /* synthetic */ p8o(a aVar) {
        this();
    }

    public static /* synthetic */ HashMap a(p8o p8oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("277462c6", new Object[]{p8oVar});
        }
        return p8oVar.f25943a;
    }

    public static /* synthetic */ ArrayList b(p8o p8oVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("d19b1626", new Object[]{p8oVar, str});
        }
        return p8oVar.c(str);
    }

    public static p8o f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p8o) ipChange.ipc$dispatch("d2a4af3e", new Object[0]);
        }
        return d.a();
    }

    public final ArrayList<Drawable> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("4691710b", new Object[]{this, str});
        }
        String d2 = qg9.d(v2s.o().f().getApplication(), "taolive");
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
                    File file2 = new File(d2 + wh6.DIR + qg9.b(name));
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
        } catch (Exception e) {
            String str2 = b;
            q0h.a(str2, "fetchFromFile = " + e.getMessage());
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    public final void d(String str, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c8703cc", new Object[]{this, str, cVar});
            return;
        }
        if (!TextUtils.isEmpty(str) && !str.startsWith("http")) {
            str = uyv.HTTPS_SCHEMA.concat(str);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("bizId", "my3dZone");
        hashMap.put("useCache", Boolean.TRUE);
        hashMap.put("fileStorePath", qg9.d(v2s.o().f().getApplication(), "taolive"));
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) str);
        jSONArray.add(jSONObject);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("downloadList", jSONArray);
        hashMap2.put("downloadParam", hashMap);
        v2s.o().i().b(hashMap2, new b(cVar));
    }

    public void e(String str, c cVar) {
        ArrayList<Drawable> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b0a4fd4", new Object[]{this, str, cVar});
        } else if (!TextUtils.isEmpty(str)) {
            HashMap<String, ArrayList<Drawable>> hashMap = this.f25943a;
            if (hashMap == null || !hashMap.containsKey(str) || (arrayList = this.f25943a.get(str)) == null || cVar == null) {
                d(str, new a(cVar, str));
            } else {
                cVar.b(arrayList);
            }
        } else if (cVar != null) {
            cVar.a();
        }
    }

    public p8o() {
        this.f25943a = new HashMap<>();
    }
}
