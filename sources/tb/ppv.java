package tb;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ppv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static ppv e;

    /* renamed from: a  reason: collision with root package name */
    public Context f26228a;
    public final HashMap<String, List<String>> b = new HashMap<>();
    public boolean c;
    public boolean d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a extends AsyncTask<Void, Void, HashMap<String, List<String>>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<Context> f26229a;
        public HashMap<String, List<String>> b;

        static {
            t2o.a(779093232);
        }

        public a(Context context, HashMap<String, List<String>> hashMap) {
            this.f26229a = new WeakReference<>(context);
            this.b = hashMap;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/service/UserActionManager$LoadUserActionTask");
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x00cc, code lost:
            if (r7 != null) goto L_0x00a3;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> doInBackground(java.lang.Void... r7) {
            /*
                r6 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = tb.ppv.a.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r1 == 0) goto L_0x0018
                java.lang.String r1 = "1ac0d1a"
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r6
                r3 = 1
                r2[r3] = r7
                java.lang.Object r7 = r0.ipc$dispatch(r1, r2)
                java.util.HashMap r7 = (java.util.HashMap) r7
                return r7
            L_0x0018:
                java.lang.ref.WeakReference<android.content.Context> r7 = r6.f26229a
                java.lang.Object r7 = r7.get()
                android.content.Context r7 = (android.content.Context) r7
                r0 = 0
                if (r7 != 0) goto L_0x0024
                return r0
            L_0x0024:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r7 = tb.qg9.c(r7)
                r1.append(r7)
                java.lang.String r7 = java.io.File.separator
                r1.append(r7)
                java.lang.String r2 = "LiveUA"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r1 = tb.qg9.a(r1)
                java.io.File r2 = new java.io.File
                r2.<init>(r1)
                boolean r3 = r2.exists()
                if (r3 != 0) goto L_0x0050
                r2.mkdirs()
            L_0x0050:
                java.util.Calendar r2 = java.util.Calendar.getInstance()
                java.util.Date r2 = r2.getTime()
                java.text.DateFormat r3 = java.text.DateFormat.getDateInstance()
                java.lang.String r2 = r3.format(r2)
                java.io.File r3 = new java.io.File
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r1)
                r4.append(r7)
                r4.append(r2)
                java.lang.String r7 = r4.toString()
                r3.<init>(r7)
                boolean r7 = r3.exists()
                if (r7 != 0) goto L_0x007e
                return r0
            L_0x007e:
                java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch: all -> 0x00b3, Exception -> 0x00b8
                r7.<init>(r3)     // Catch: all -> 0x00b3, Exception -> 0x00b8
                java.nio.channels.FileChannel r1 = r7.getChannel()     // Catch: all -> 0x00ab, Exception -> 0x00b0
                long r2 = r1.size()     // Catch: all -> 0x00a7, Exception -> 0x00a9
                int r3 = (int) r2     // Catch: all -> 0x00a7, Exception -> 0x00a9
                java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r3)     // Catch: all -> 0x00a7, Exception -> 0x00a9
                r1.read(r2)     // Catch: all -> 0x00a7, Exception -> 0x00a9
                byte[] r2 = r2.array()     // Catch: all -> 0x00a7, Exception -> 0x00a9
                java.lang.String r3 = new java.lang.String     // Catch: all -> 0x00a7, Exception -> 0x00a9
                r3.<init>(r2)     // Catch: all -> 0x00a7, Exception -> 0x00a9
                java.util.HashMap r0 = r6.b(r3)     // Catch: all -> 0x00a7, Exception -> 0x00a9
                r1.close()     // Catch: Exception -> 0x00cf
            L_0x00a3:
                r7.close()     // Catch: Exception -> 0x00cf
                goto L_0x00cf
            L_0x00a7:
                r0 = move-exception
                goto L_0x00bc
            L_0x00a9:
                goto L_0x00c7
            L_0x00ab:
                r1 = move-exception
                r5 = r1
                r1 = r0
                r0 = r5
                goto L_0x00bc
            L_0x00b0:
                r1 = r0
                goto L_0x00c7
            L_0x00b3:
                r7 = move-exception
                r1 = r0
                r0 = r7
                r7 = r1
                goto L_0x00bc
            L_0x00b8:
                r7 = r0
                r1 = r7
                goto L_0x00c7
            L_0x00bc:
                if (r1 == 0) goto L_0x00c1
                r1.close()     // Catch: Exception -> 0x00c6
            L_0x00c1:
                if (r7 == 0) goto L_0x00c6
                r7.close()     // Catch: Exception -> 0x00c6
            L_0x00c6:
                throw r0
            L_0x00c7:
                if (r1 == 0) goto L_0x00cc
                r1.close()     // Catch: Exception -> 0x00cf
            L_0x00cc:
                if (r7 == 0) goto L_0x00cf
                goto L_0x00a3
            L_0x00cf:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.ppv.a.doInBackground(java.lang.Void[]):java.util.HashMap");
        }

        public final HashMap<String, List<String>> b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HashMap) ipChange.ipc$dispatch("4b0efd8d", new Object[]{this, str});
            }
            HashMap<String, List<String>> hashMap = new HashMap<>();
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject parseObject = JSON.parseObject(str);
                    if (parseObject.keySet().size() > 0) {
                        for (String str2 : parseObject.keySet()) {
                            String valueOf = String.valueOf(str2);
                            hashMap.put(valueOf, mxf.d(parseObject.getJSONArray(valueOf)));
                        }
                    }
                } catch (Exception unused) {
                }
            }
            return hashMap;
        }

        /* renamed from: c */
        public void onPostExecute(HashMap<String, List<String>> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b6a1adb6", new Object[]{this, hashMap});
                return;
            }
            HashMap<String, List<String>> hashMap2 = this.b;
            if (hashMap2 != null) {
                hashMap2.clear();
            } else {
                this.b = new HashMap<>();
            }
            if (hashMap != null) {
                this.b.putAll(hashMap);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<Context> f26230a;
        public final HashMap<String, List<String>> b;

        static {
            t2o.a(779093233);
        }

        public b(Context context, HashMap<String, List<String>> hashMap) {
            this.f26230a = new WeakReference<>(context);
            this.b = hashMap;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/service/UserActionManager$SaveUserActionTask");
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            Context context;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
            }
            if (this.f26230a.get() == null) {
                return null;
            }
            String a2 = qg9.a(qg9.c(context) + File.separator + "LiveUA");
            File file = new File(a2);
            if (!file.exists()) {
                file.mkdirs();
            }
            String format = DateFormat.getDateInstance().format(Calendar.getInstance().getTime());
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    file2.delete();
                }
            }
            File file3 = new File(a2 + File.separator + format);
            try {
                file3.createNewFile();
                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                fileOutputStream.write(JSON.toJSONString(this.b).getBytes());
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Exception unused) {
            }
            return null;
        }
    }

    static {
        t2o.a(779093231);
    }

    public static ppv c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ppv) ipChange.ipc$dispatch("26d75a75", new Object[]{context});
        }
        if (e == null) {
            e = new ppv();
        }
        ppv ppvVar = e;
        ppvVar.f26228a = context;
        return ppvVar;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6464897d", new Object[]{this, str, str2});
            return;
        }
        HashMap<String, List<String>> hashMap = this.b;
        if (hashMap == null) {
            return;
        }
        if (hashMap.containsKey(str)) {
            List<String> list = this.b.get(str);
            if (list != null && !list.contains(str2)) {
                list.add(str2);
                this.c = true;
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        this.b.put(str, arrayList);
        this.c = true;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.f26228a = null;
        }
    }

    public boolean d(String str, String str2) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac9c533a", new Object[]{this, str, str2})).booleanValue();
        }
        HashMap<String, List<String>> hashMap = this.b;
        if (hashMap == null || !hashMap.containsKey(str) || (list = this.b.get(str)) == null || !list.contains(str2)) {
            return false;
        }
        return true;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8bbc46e", new Object[]{this});
        } else if (!this.d) {
            this.d = true;
            new a(this.f26228a, this.b).execute(new Void[0]);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa416cc5", new Object[]{this});
        } else if (this.c) {
            this.c = false;
            new b(this.f26228a, this.b).execute(new Void[0]);
        }
    }
}
