package com.xiaomi.push;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.xiaomi.push.service.az;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class cg {

    /* renamed from: a  reason: collision with root package name */
    private static volatile cg f14797a;

    /* renamed from: a  reason: collision with other field name */
    private Context f787a;

    /* renamed from: a  reason: collision with other field name */
    private cf f788a;

    /* renamed from: a  reason: collision with other field name */
    private final HashMap<String, ce> f790a = new HashMap<>();

    /* renamed from: a  reason: collision with other field name */
    private ThreadPoolExecutor f791a = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: a  reason: collision with other field name */
    private final ArrayList<a> f789a = new ArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static abstract class a implements Runnable {

        /* renamed from: a  reason: collision with other field name */
        private a f793a;

        /* renamed from: a  reason: collision with other field name */
        private String f794a;

        /* renamed from: a  reason: collision with other field name */
        private WeakReference<Context> f795a;
        protected String b;

        /* renamed from: a  reason: collision with other field name */
        protected ce f792a = null;

        /* renamed from: a  reason: collision with other field name */
        private Random f796a = new Random();

        /* renamed from: a  reason: collision with root package name */
        private int f14798a = 0;

        public a(String str) {
            this.f794a = str;
        }

        public SQLiteDatabase a() {
            return this.f792a.getWritableDatabase();
        }

        public abstract void a(Context context, SQLiteDatabase sQLiteDatabase);

        @Override // java.lang.Runnable
        public final void run() {
            Context context;
            WeakReference<Context> weakReference = this.f795a;
            if (weakReference != null && (context = weakReference.get()) != null && context.getFilesDir() != null && this.f792a != null && !TextUtils.isEmpty(this.f794a)) {
                File file = new File(this.f794a);
                u.a(context, new File(file.getParentFile(), bl.b(file.getAbsolutePath())), new ci(this, context));
            }
        }

        /* renamed from: a  reason: collision with other method in class */
        public Object m549a() {
            return null;
        }

        /* renamed from: a  reason: collision with other method in class */
        public String m550a() {
            return this.f794a;
        }

        public void a(Context context) {
            a aVar = this.f793a;
            if (aVar != null) {
                aVar.a(context, m549a());
            }
            b(context);
        }

        public void a(Context context, Object obj) {
            cg.a(context).a(this);
        }

        public void a(ce ceVar, Context context) {
            this.f792a = ceVar;
            this.b = ceVar.a();
            this.f795a = new WeakReference<>(context);
        }

        public void a(a aVar) {
            this.f793a = aVar;
        }

        /* renamed from: a  reason: collision with other method in class */
        public boolean m551a() {
            return this.f792a == null || TextUtils.isEmpty(this.b) || this.f795a == null;
        }

        public void b(Context context) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static abstract class b<T> extends a {

        /* renamed from: a  reason: collision with root package name */
        private int f14799a;

        /* renamed from: a  reason: collision with other field name */
        private String f797a;

        /* renamed from: a  reason: collision with other field name */
        private List<String> f798a;

        /* renamed from: a  reason: collision with other field name */
        private String[] f799a;
        private List<T> b = new ArrayList();
        private String c;
        private String d;
        private String e;

        public b(String str, List<String> list, String str2, String[] strArr, String str3, String str4, String str5, int i) {
            super(str);
            this.f798a = list;
            this.f797a = str2;
            this.f799a = strArr;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f14799a = i;
        }

        @Override // com.xiaomi.push.cg.a
        public SQLiteDatabase a() {
            return ((a) this).f792a.getReadableDatabase();
        }

        public abstract T a(Context context, Cursor cursor);

        public abstract void a(Context context, List<T> list);

        @Override // com.xiaomi.push.cg.a
        public void a(Context context, SQLiteDatabase sQLiteDatabase) {
            String[] strArr;
            this.b.clear();
            List<String> list = this.f798a;
            String str = null;
            if (list == null || list.size() <= 0) {
                strArr = null;
            } else {
                String[] strArr2 = new String[this.f798a.size()];
                this.f798a.toArray(strArr2);
                strArr = strArr2;
            }
            int i = this.f14799a;
            if (i > 0) {
                str = String.valueOf(i);
            }
            Cursor query = sQLiteDatabase.query(super.b, strArr, this.f797a, this.f799a, this.c, this.d, this.e, str);
            if (query != null && query.moveToFirst()) {
                do {
                    T a2 = a(context, query);
                    if (a2 != null) {
                        this.b.add(a2);
                    }
                } while (query.moveToNext());
                query.close();
            }
            a(context, (List) this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c extends a {

        /* renamed from: a  reason: collision with root package name */
        private ArrayList<a> f14800a;

        public c(String str, ArrayList<a> arrayList) {
            super(str);
            ArrayList<a> arrayList2 = new ArrayList<>();
            this.f14800a = arrayList2;
            arrayList2.addAll(arrayList);
        }

        @Override // com.xiaomi.push.cg.a
        public final void a(Context context) {
            super.a(context);
            Iterator<a> it = this.f14800a.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next != null) {
                    next.a(context);
                }
            }
        }

        @Override // com.xiaomi.push.cg.a
        public void a(Context context, SQLiteDatabase sQLiteDatabase) {
            Iterator<a> it = this.f14800a.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next != null) {
                    next.a(context, sQLiteDatabase);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d extends a {

        /* renamed from: a  reason: collision with root package name */
        private String f14801a;

        /* renamed from: a  reason: collision with other field name */
        protected String[] f800a;

        public d(String str, String str2, String[] strArr) {
            super(str);
            this.f14801a = str2;
            this.f800a = strArr;
        }

        @Override // com.xiaomi.push.cg.a
        public void a(Context context, SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.delete(this.b, this.f14801a, this.f800a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class e extends a {

        /* renamed from: a  reason: collision with root package name */
        private ContentValues f14802a;

        public e(String str, ContentValues contentValues) {
            super(str);
            this.f14802a = contentValues;
        }

        @Override // com.xiaomi.push.cg.a
        public void a(Context context, SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.insert(this.b, null, this.f14802a);
        }
    }

    private cg(Context context) {
        this.f787a = context;
    }

    private ce a(String str) {
        ce ceVar = this.f790a.get(str);
        if (ceVar == null) {
            synchronized (this.f790a) {
                if (ceVar == null) {
                    try {
                        ceVar = this.f788a.a(this.f787a, str);
                        this.f790a.put(str, ceVar);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return ceVar;
    }

    public static cg a(Context context) {
        if (f14797a == null) {
            synchronized (cg.class) {
                try {
                    if (f14797a == null) {
                        f14797a = new cg(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14797a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m548a(String str) {
        return a(str).a();
    }

    public void b(a aVar) {
        ce ceVar;
        if (aVar != null) {
            if (this.f788a != null) {
                String a2 = aVar.m550a();
                synchronized (this.f790a) {
                    try {
                        ceVar = this.f790a.get(a2);
                        if (ceVar == null) {
                            ceVar = this.f788a.a(this.f787a, a2);
                            this.f790a.put(a2, ceVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!this.f791a.isShutdown()) {
                    aVar.a(ceVar, this.f787a);
                    a((Runnable) aVar);
                    return;
                }
                return;
            }
            throw new IllegalStateException("should exec init method first!");
        }
    }

    private void a() {
        ah.a(this.f787a).b(new ch(this), az.a(this.f787a).a(ih.StatDataProcessFrequency.a(), 5));
    }

    public void a(a aVar) {
        ce ceVar;
        if (aVar != null) {
            if (this.f788a != null) {
                String a2 = aVar.m550a();
                synchronized (this.f790a) {
                    try {
                        ceVar = this.f790a.get(a2);
                        if (ceVar == null) {
                            ceVar = this.f788a.a(this.f787a, a2);
                            this.f790a.put(a2, ceVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!this.f791a.isShutdown()) {
                    aVar.a(ceVar, this.f787a);
                    synchronized (this.f789a) {
                        this.f789a.add(aVar);
                        a();
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("should exec init method first!");
        }
    }

    public void a(Runnable runnable) {
        if (!this.f791a.isShutdown()) {
            this.f791a.execute(runnable);
        }
    }

    public void a(ArrayList<a> arrayList) {
        if (this.f788a != null) {
            HashMap hashMap = new HashMap();
            if (!this.f791a.isShutdown()) {
                Iterator<a> it = arrayList.iterator();
                while (it.hasNext()) {
                    a next = it.next();
                    if (next.m551a()) {
                        next.a(a(next.m550a()), this.f787a);
                    }
                    ArrayList arrayList2 = (ArrayList) hashMap.get(next.m550a());
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        hashMap.put(next.m550a(), arrayList2);
                    }
                    arrayList2.add(next);
                }
                for (String str : hashMap.keySet()) {
                    ArrayList arrayList3 = (ArrayList) hashMap.get(str);
                    if (arrayList3 != null && arrayList3.size() > 0) {
                        c cVar = new c(str, arrayList3);
                        cVar.a(((a) arrayList3.get(0)).f792a, this.f787a);
                        this.f791a.execute(cVar);
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("should exec setDbHelperFactory method first!");
    }
}
