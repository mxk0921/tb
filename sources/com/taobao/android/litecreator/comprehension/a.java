package com.taobao.android.litecreator.comprehension;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.bq4;
import tb.cg9;
import tb.dov;
import tb.ed2;
import tb.f7l;
import tb.i8g;
import tb.i9w;
import tb.iiz;
import tb.ko4;
import tb.ndt;
import tb.odg;
import tb.omv;
import tb.ozd;
import tb.qyp;
import tb.ryp;
import tb.sug;
import tb.t2o;
import tb.trt;
import tb.z6e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a extends Observable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Handler r = new Handler(Looper.getMainLooper());

    /* renamed from: a  reason: collision with root package name */
    public final ContentComprehensionTool f8255a;
    public String e;
    public JSONObject f;
    public final String g;
    public Runnable j;
    public Runnable k;
    public i9w l;
    public e m;
    public String n;
    public String o;
    public long p;
    public int q;
    public List<String> b = new ArrayList();
    public final List<String> c = new ArrayList();
    public String d = "";
    public volatile boolean h = false;
    public volatile boolean i = false;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.litecreator.comprehension.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class C0435a implements i9w.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8256a;

        public C0435a(String str) {
            this.f8256a = str;
        }

        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2f5f2b8", new Object[]{this, str, str2});
            } else {
                a.a(a.this, false);
            }
        }

        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37d948b5", new Object[]{this, str});
                return;
            }
            ko4.INSTANCE.d().put(this.f8256a, str);
            a.a(a.this, false);
            trt.h(a.b(a.this));
            a.c(a.this, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            trt.h(a.e(a.this));
            a.f(a.this, null);
            a.g(a.this, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements sug.a<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONArray f8258a;

        public c(a aVar, JSONArray jSONArray) {
            this.f8258a = jSONArray;
        }

        /* renamed from: b */
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad26d18d", new Object[]{this, str});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("imageUrl", (Object) str);
            this.f8258a.add(jSONObject);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements sug.a<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONArray f8259a;

        public d(a aVar, JSONArray jSONArray) {
            this.f8259a = jSONArray;
        }

        /* renamed from: b */
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad26d18d", new Object[]{this, str});
            } else {
                this.f8259a.add(str);
            }
        }
    }

    static {
        t2o.a(511705174);
    }

    public a(String str, ContentComprehensionTool contentComprehensionTool) {
        this.f8255a = contentComprehensionTool;
        this.g = str;
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41d24b14", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.i = z;
        return z;
    }

    public static /* synthetic */ Runnable b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("f717da4f", new Object[]{aVar});
        }
        return aVar.k;
    }

    public static /* synthetic */ Runnable c(a aVar, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("4996b313", new Object[]{aVar, runnable});
        }
        aVar.k = runnable;
        return runnable;
    }

    public static /* synthetic */ Handler d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("7c68f7f", new Object[0]);
        }
        return r;
    }

    public static /* synthetic */ Runnable e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("56864251", new Object[]{aVar});
        }
        return aVar.j;
    }

    public static /* synthetic */ Runnable f(a aVar, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("e2f30615", new Object[]{aVar, runnable});
        }
        aVar.j = runnable;
        return runnable;
    }

    public static /* synthetic */ boolean g(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e75d418", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.h = z;
        return z;
    }

    public static /* synthetic */ ContentComprehensionTool h(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentComprehensionTool) ipChange.ipc$dispatch("9c24cd9f", new Object[]{aVar});
        }
        return aVar.f8255a;
    }

    public static /* synthetic */ String i(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("386dde2", new Object[]{aVar});
        }
        return aVar.g;
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/comprehension/ContentComprehensionData");
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("52d19fd3", new Object[]{this});
        }
        String str = ko4.INSTANCE.d().get(this.e);
        if (!TextUtils.isEmpty(str)) {
            return i9w.a(str);
        }
        return "";
    }

    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5429bc64", new Object[]{this})).intValue();
        }
        return this.b.size();
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (this.b.size() > 0 || ((ArrayList) this.c).size() > 0 || !TextUtils.isEmpty(this.d) || !TextUtils.isEmpty(this.o)) {
            return true;
        }
        return false;
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.b.clear();
        ((ArrayList) this.c).clear();
        this.d = null;
        this.f = null;
    }

    public void n(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbef3335", new Object[]{this, runnable});
        } else if (this.h) {
            this.j = runnable;
        } else {
            runnable.run();
        }
    }

    public void o(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56022b8e", new Object[]{this, runnable});
        } else if (this.i) {
            this.k = runnable;
        } else {
            runnable.run();
        }
    }

    public void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a9c508", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void q(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7723be2d", new Object[]{this, jSONObject});
        } else {
            this.f = jSONObject;
        }
    }

    public void r(List<String> list, boolean z, bq4 bq4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2a7c936", new Object[]{this, list, new Boolean(z), bq4Var});
        } else if (list == null || list.size() <= 0) {
            trt.h(this.j);
            this.j = null;
            this.h = false;
        } else {
            e eVar = this.m;
            if (eVar != null) {
                e.b(eVar);
            }
            this.h = true;
            this.f8255a.u().g = list.size();
            e eVar2 = new e(list, this, bq4Var, new b());
            this.m = eVar2;
            eVar2.execute(new Object[0]);
        }
    }

    public void s(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba1ea0f6", new Object[]{this, list});
            return;
        }
        ((ArrayList) this.c).clear();
        List<String> list2 = this.c;
        if (list == null) {
            list = new ArrayList<>();
        }
        ((ArrayList) list2).addAll(list);
    }

    public void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.n = str;
        }
    }

    public void u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce046f0a", new Object[]{this, str});
            return;
        }
        this.e = str;
        if (TextUtils.isEmpty(ko4.INSTANCE.d().get(str))) {
            if (this.l == null) {
                this.l = new i9w();
            }
            this.i = true;
            this.l.b(Globals.getApplication(), str, new C0435a(str));
        }
    }

    public final JSONArray v(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("d89c8668", new Object[]{this, list});
        }
        JSONArray jSONArray = new JSONArray();
        sug.a(list, new d(this, jSONArray));
        return jSONArray;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class e extends AsyncTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final bq4 f8260a;
        public final List<String> c;
        public final List<String> e;
        public final Runnable f;
        public final a g;
        public boolean b = false;
        public final List<String> d = new ArrayList();

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.litecreator.comprehension.a$e$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class C0436a implements sug.a<String> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ CountDownLatch f8261a;

            public C0436a(CountDownLatch countDownLatch) {
                this.f8261a = countDownLatch;
            }

            /* renamed from: b */
            public void a(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ad26d18d", new Object[]{this, str});
                } else {
                    e.c(e.this, str, this.f8261a);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f8262a;
            public final /* synthetic */ CountDownLatch b;

            public b(String str, CountDownLatch countDownLatch) {
                this.f8262a = str;
                this.b = countDownLatch;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    e.d(e.this, this.f8262a, this.b);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class c extends qyp {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f8263a;
            public final /* synthetic */ CountDownLatch b;
            public final /* synthetic */ long c;
            public final /* synthetic */ String d;

            public c(String str, CountDownLatch countDownLatch, long j, String str2) {
                this.f8263a = str;
                this.b = countDownLatch;
                this.c = j;
                this.d = str2;
            }

            public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/comprehension/ContentComprehensionData$ImageProcessTask$3");
            }

            @Override // tb.qyp, tb.mzd
            public void onFailure(z6e z6eVar, ndt ndtVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7789334b", new Object[]{this, z6eVar, ndtVar});
                    return;
                }
                odg.c("LCCOM.Data", "compressAndUploadImageAsync. upload failed! error:(" + ndtVar.c + "," + ndtVar.f24666a + f7l.BRACKET_END_STR);
                this.b.countDown();
            }

            @Override // tb.qyp, tb.mzd
            public void onSuccess(z6e z6eVar, ozd ozdVar) {
                String str;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("10b3127c", new Object[]{this, z6eVar, ozdVar});
                    return;
                }
                cg9.i(this.f8263a);
                if (ozdVar != null) {
                    str = ozdVar.a();
                } else {
                    str = "";
                }
                if (TextUtils.isEmpty(str)) {
                    this.b.countDown();
                    return;
                }
                a.h(e.e(e.this)).u().b(System.currentTimeMillis() - this.c);
                ko4.INSTANCE.i().put(this.d, str);
                e.a(e.this, str);
                this.b.countDown();
            }
        }

        static {
            t2o.a(511705179);
        }

        public e(List<String> list, a aVar, bq4 bq4Var, Runnable runnable) {
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                arrayList.addAll(list);
            }
            this.c = arrayList;
            this.g = aVar;
            this.e = aVar.b;
            this.f = runnable;
            this.f8260a = bq4Var;
        }

        public static /* synthetic */ void a(e eVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a90f5d26", new Object[]{eVar, str});
            } else {
                eVar.f(str);
            }
        }

        public static /* synthetic */ void b(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("80b8faaf", new Object[]{eVar});
            } else {
                eVar.g();
            }
        }

        public static /* synthetic */ void c(e eVar, String str, CountDownLatch countDownLatch) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d6a5687a", new Object[]{eVar, str, countDownLatch});
            } else {
                eVar.l(str, countDownLatch);
            }
        }

        public static /* synthetic */ void d(e eVar, String str, CountDownLatch countDownLatch) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9f9efdb8", new Object[]{eVar, str, countDownLatch});
            } else {
                eVar.i(str, countDownLatch);
            }
        }

        public static /* synthetic */ a e(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6a59d683", new Object[]{eVar});
            }
            return eVar.g;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            if (str.hashCode() == -1325021319) {
                super.onPostExecute(objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/comprehension/ContentComprehensionData$ImageProcessTask");
        }

        public final synchronized void f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e736042", new Object[]{this, str});
            } else {
                ((ArrayList) this.d).add(str);
            }
        }

        public final void g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("707fe601", new Object[]{this});
                return;
            }
            odg.e("LCCOM.Data", "ProcessImageTask.cancel.");
            this.b = true;
        }

        public final void h(String str, CountDownLatch countDownLatch) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3c37b20", new Object[]{this, str, countDownLatch});
            } else {
                trt.g(new b(str, countDownLatch));
            }
        }

        public final void i(String str, CountDownLatch countDownLatch) {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("248f416e", new Object[]{this, str, countDownLatch});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            String b2 = i8g.b(Globals.getApplication());
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                int i = options.outWidth;
                int i2 = options.outHeight;
                int r = cg9.r(str);
                if (ed2.j(Math.max(1.0f, Math.min((i * 1.0f) / 256.0f, (i2 * 1.0f) / 256.0f))) == 1 && r == 0) {
                    cg9.f(str, b2);
                    z = true;
                } else {
                    Bitmap j = j(str);
                    z = ed2.q(j, b2);
                    if (j != null && !j.isRecycled()) {
                        j.recycle();
                    }
                }
            } catch (Throwable unused) {
                z = false;
            }
            if (!z || !cg9.l(b2)) {
                odg.c("LCCOM.Data", "compressAndUploadImageAsync. compress failed!");
                countDownLatch.countDown();
                return;
            }
            odg.d("LCCOM.Data", "compressAndUploadImageAsync: time=" + (System.currentTimeMillis() - currentTimeMillis) + " p=" + b2 + " " + cg9.k(b2));
            a.h(this.g).u().a(System.currentTimeMillis() - currentTimeMillis);
            long currentTimeMillis2 = System.currentTimeMillis();
            ryp rypVar = new ryp();
            rypVar.a(dov.b(a.i(this.g)).c());
            rypVar.c(ryp.FILE_TYPE_IMAGE_JPG);
            rypVar.b(b2);
            omv.a().uploadAsync(rypVar, new c(b2, countDownLatch, currentTimeMillis2, str), a.d());
        }

        public final Bitmap j(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("fba7286c", new Object[]{this, str});
            }
            Bitmap f = ed2.f(str, 256, false);
            if (f == null) {
                return null;
            }
            float min = Math.min(f.getWidth() / 256.0f, f.getHeight() / 256.0f);
            Matrix matrix = new Matrix();
            float f2 = 1.0f / min;
            matrix.postScale(f2, f2);
            return Bitmap.createBitmap(f, 0, 0, f.getWidth(), f.getHeight(), matrix, true);
        }

        public final synchronized List<String> k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("4ee39217", new Object[]{this});
            }
            return this.d;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, obj});
                return;
            }
            super.onPostExecute(obj);
            Runnable runnable = this.f;
            if (runnable != null && !this.b) {
                runnable.run();
            }
        }

        @Override // android.os.AsyncTask
        public Object doInBackground(Object[] objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("e83e4786", new Object[]{this, objArr});
            }
            if (this.b) {
                return null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            CountDownLatch countDownLatch = new CountDownLatch(((ArrayList) this.c).size());
            sug.a(this.c, new C0436a(countDownLatch));
            try {
                bq4 bq4Var = this.f8260a;
                boolean await = countDownLatch.await(bq4Var != null ? bq4Var.f16547a : 10000L, TimeUnit.MILLISECONDS);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                odg.e("LCCOM.Data", "processImage success:" + await + ", cost:" + currentTimeMillis2 + "ms");
                a.h(this.g).u().e = currentTimeMillis2;
                if (!this.b) {
                    this.e.addAll(k());
                }
            } catch (InterruptedException e) {
                odg.c("LCCOM.Data", "processImage exception:" + Log.getStackTraceString(e));
            }
            return null;
        }

        public final void l(String str, CountDownLatch countDownLatch) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be2d4f58", new Object[]{this, str, countDownLatch});
            } else if (!cg9.l(str)) {
                countDownLatch.countDown();
            } else {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                int i = options.outWidth;
                int i2 = options.outHeight;
                float f = i2 == 0 ? 0.0f : i / i2;
                if (f < 0.33333334f || f > 3.0f) {
                    countDownLatch.countDown();
                    odg.e("LCCOM.Data", "setImages.processImageEach. invalid image ratio:" + f);
                    return;
                }
                String str2 = ko4.INSTANCE.i().get(str);
                if (!TextUtils.isEmpty(str2)) {
                    f(str2);
                    countDownLatch.countDown();
                    odg.d("LCCOM.Data", "setImages.processImageEach. image has already uploaded.");
                    return;
                }
                h(str, countDownLatch);
            }
        }
    }

    public JSONObject w(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("99f9fa3", new Object[]{this, jSONArray, jSONObject});
        }
        JSONArray jSONArray2 = new JSONArray();
        sug.a(this.b, new c(this, jSONArray2));
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = this.f;
        if (jSONObject3 != null && !jSONObject3.isEmpty()) {
            jSONObject2.putAll(this.f);
        }
        jSONObject2.put("title", this.n);
        jSONObject2.put("text", this.d);
        jSONObject2.put("selectItems", v(this.c));
        jSONObject2.put("images", (Object) jSONArray2);
        jSONObject2.put("recommendKeys", (Object) jSONArray);
        if (!TextUtils.isEmpty(this.o)) {
            JSONArray jSONArray3 = new JSONArray();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("title", (Object) this.o);
            jSONObject4.put("categoryId", (Object) Long.valueOf(this.p));
            jSONArray3.add(jSONObject4);
            jSONObject2.put("items", (Object) jSONArray3);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put(iiz.PERF_STAG_TOTAL, (Object) Integer.valueOf(this.q));
            jSONObject2.put("score", (Object) jSONObject5);
        }
        if (jSONObject != null) {
            Object jSONArray4 = jSONObject.getJSONArray("labels");
            String string = jSONObject.getString("materialVersion");
            if (jSONArray4 != null) {
                jSONObject2.put("labels", jSONArray4);
            }
            if (!TextUtils.isEmpty(string)) {
                jSONObject2.put("materialVersion", Integer.valueOf(string));
            }
        }
        odg.d("LCCOM.Data", "start to request data: " + jSONArray2.size());
        return jSONObject2;
    }
}
