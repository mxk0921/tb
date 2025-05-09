package com.loc;

import android.content.Context;
import android.util.Log;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f5753a = b.Unknow;
    private static volatile d b = d.Unknow;
    private static volatile String c = "";
    private static volatile String d = "";
    private static volatile long e = -1;
    private static volatile a f = a.Unknow;
    private static volatile long g = -1;
    private static volatile String h = "";
    private static volatile String i = "";
    private static volatile long j = 0;
    private static volatile long k = 0;
    private static volatile boolean l = false;
    private static volatile boolean m = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum a {
        Unknow(-1),
        NotAgree(0),
        DidAgree(1);
        
        private int d;

        a(int i) {
            this.d = i;
        }

        public final int a() {
            return this.d;
        }

        public static a a(int i) {
            a aVar = NotAgree;
            if (i == aVar.a()) {
                return aVar;
            }
            a aVar2 = DidAgree;
            return i == aVar2.a() ? aVar2 : Unknow;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum b {
        Unknow(-1),
        NotContain(0),
        DidContain(1);
        
        private int d;

        b(int i) {
            this.d = i;
        }

        public final int a() {
            return this.d;
        }

        public static b a(int i) {
            b bVar = NotContain;
            if (i == bVar.a()) {
                return bVar;
            }
            b bVar2 = DidContain;
            return i == bVar2.a() ? bVar2 : Unknow;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum c {
        SuccessCode(0),
        ShowUnknowCode(555570),
        ShowNoShowCode(555571),
        InfoUnknowCode(555572),
        InfoNotContainCode(555573),
        AgreeUnknowCode(555574),
        AgreeNotAgreeCode(555575),
        InvaildUserKeyCode(10001),
        IllegalArgument(20001);
        
        private final int j;

        c(int i) {
            this.j = i;
        }

        public final int a() {
            return this.j;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum d {
        Unknow(-1),
        NotShow(0),
        DidShow(1);
        
        private int d;

        d(int i) {
            this.d = i;
        }

        public final int a() {
            return this.d;
        }

        public static d a(int i) {
            d dVar = NotShow;
            if (i == dVar.a()) {
                return dVar;
            }
            d dVar2 = DidShow;
            return i == dVar2.a() ? dVar2 : Unknow;
        }
    }

    public static synchronized u a(final Context context, w wVar) {
        boolean z;
        synchronized (t.class) {
            try {
                if (context == null || wVar == null) {
                    return new u(c.IllegalArgument, wVar);
                }
                if (!l) {
                    e(context);
                    l = true;
                }
                u uVar = null;
                if (b != d.DidShow) {
                    if (b == d.Unknow) {
                        uVar = new u(c.ShowUnknowCode, wVar);
                    } else if (b == d.NotShow) {
                        uVar = new u(c.ShowNoShowCode, wVar);
                    }
                    z = false;
                } else {
                    z = true;
                }
                if (z && f5753a != b.DidContain) {
                    if (f5753a == b.Unknow) {
                        uVar = new u(c.InfoUnknowCode, wVar);
                    } else if (f5753a == b.NotContain) {
                        uVar = new u(c.InfoNotContainCode, wVar);
                    }
                    z = false;
                }
                if (z && f != a.DidAgree) {
                    if (f == a.Unknow) {
                        uVar = new u(c.AgreeUnknowCode, wVar);
                    } else if (f == a.NotAgree) {
                        uVar = new u(c.AgreeNotAgreeCode, wVar);
                    }
                    z = false;
                }
                if (k != j) {
                    final long j2 = j;
                    k = j;
                    try {
                        final JSONObject jSONObject = new JSONObject();
                        jSONObject.put("privacyInfo", f5753a.a());
                        jSONObject.put("privacyShow", b.a());
                        jSONObject.put(StEvent.SHOW_TIME, e);
                        jSONObject.put("show2SDK", c);
                        jSONObject.put("show2SDKVer", d);
                        jSONObject.put("privacyAgree", f.a());
                        jSONObject.put("agreeTime", g);
                        jSONObject.put("agree2SDK", h);
                        jSONObject.put("agree2SDKVer", i);
                        final boolean z2 = m;
                        cr.a().b(new cs() { // from class: com.loc.t.2
                            @Override // com.loc.cs
                            public final void a() {
                                if (z2) {
                                    Iterator it = t.b(t.f(context)).iterator();
                                    while (it.hasNext()) {
                                        t.a(context, ((File) it.next()).getName());
                                    }
                                }
                                t.d(context);
                                t.a(context, jSONObject, j2);
                                boolean b2 = t.b(context, jSONObject);
                                if (b2) {
                                    t.b(context, t.b(j2));
                                }
                                if (z2) {
                                    t.b(context);
                                }
                                if (!b2) {
                                    t.a(context, t.b(j2));
                                }
                            }
                        });
                    } catch (Throwable unused) {
                    }
                } else if (m) {
                    cr.a().b(new cs() { // from class: com.loc.t.1
                        @Override // com.loc.cs
                        public final void a() {
                            Iterator it = t.b(t.f(context)).iterator();
                            while (it.hasNext()) {
                                t.a(context, ((File) it.next()).getName());
                            }
                            t.b(context);
                        }
                    });
                }
                m = false;
                String f2 = l.f(context);
                if (f2 == null || f2.length() <= 0) {
                    uVar = new u(c.InvaildUserKeyCode, wVar);
                    Log.e(wVar.a(), String.format("获取apikey失败：\nerrorCode : %d\n原因：%s", Integer.valueOf(uVar.f5760a.a()), uVar.b));
                }
                if (z) {
                    uVar = new u(c.SuccessCode, wVar);
                } else {
                    Log.e(wVar.a(), String.format("隐私合规校验失败：\nerrorCode : %d\n原因：%s", Integer.valueOf(uVar.f5760a.a()), uVar.b));
                }
                return uVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(long j2) {
        return String.format("%d-%s", Long.valueOf(j2), "privacy.data");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void d(Context context) {
        synchronized (t.class) {
            if (context != null) {
                if (!l) {
                    e(context);
                    l = true;
                }
                bd.a(context, "AMap.privacy.data", "AMap.privacy.data", String.format("%d&%d&%d&%s&%s&%d&%d&%s&%s&%d&%d", Integer.valueOf(f5753a.a()), Integer.valueOf(b.a()), Long.valueOf(e), c, d, Integer.valueOf(f.a()), Long.valueOf(g), h, i, Long.valueOf(j), Long.valueOf(k)));
            }
        }
    }

    private static void e(Context context) {
        String str;
        if (context != null) {
            try {
                str = bd.a(context, "AMap.privacy.data", "AMap.privacy.data");
            } catch (Throwable th) {
                th.printStackTrace();
                str = null;
            }
            if (str != null) {
                String[] split = str.split("&");
                if (split.length == 11) {
                    try {
                        f5753a = b.a(Integer.parseInt(split[0]));
                        b = d.a(Integer.parseInt(split[1]));
                        e = Long.parseLong(split[2]);
                        d = split[3];
                        d = split[4];
                        f = a.a(Integer.parseInt(split[5]));
                        g = Long.parseLong(split[6]);
                        h = split[7];
                        i = split[8];
                        j = Long.parseLong(split[9]);
                        k = Long.parseLong(split[10]);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String f(Context context) {
        String absolutePath = context.getFilesDir().getAbsolutePath();
        return absolutePath + "/AMap/Privacy/Upload";
    }

    private static String g(Context context) {
        String absolutePath = context.getFilesDir().getAbsolutePath();
        return absolutePath + "/AMap/Privacy/Reload";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ArrayList<File> b(String str) {
        ArrayList<File> arrayList = new ArrayList<>();
        if (!(str == null || str.length() == 0)) {
            File file = new File(str);
            if (!file.exists()) {
                return arrayList;
            }
            File[] listFiles = file.listFiles();
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    arrayList.add(file2);
                }
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void b(Context context) {
        String[] split;
        try {
            Iterator<File> it = b(g(context)).iterator();
            while (it.hasNext()) {
                File next = it.next();
                String name = next.getName();
                if (name.endsWith("-privacy.data") && (((split = name.split("-")) != null || split.length == 2) && Long.parseLong(split[0]) > 0)) {
                    FileInputStream fileInputStream = new FileInputStream(next);
                    byte[] bArr = new byte[fileInputStream.available()];
                    fileInputStream.read(bArr);
                    if (b(context, new JSONObject(new String(bd.b(context, bArr))))) {
                    }
                }
                next.delete();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static /* synthetic */ void b(Context context, String str) {
        if (str != null && str.length() != 0) {
            try {
                String f2 = f(context);
                File file = new File(f2 + "/" + str);
                if (file.exists()) {
                    file.delete();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private static synchronized void a(Context context, a aVar, w wVar) {
        synchronized (t.class) {
            if (context != null && wVar != null) {
                try {
                    if (!l) {
                        e(context);
                        l = true;
                    }
                    if (aVar != f) {
                        f = aVar;
                        h = wVar.a();
                        i = wVar.b();
                        long currentTimeMillis = System.currentTimeMillis();
                        g = currentTimeMillis;
                        j = currentTimeMillis;
                        d(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Context context, JSONObject jSONObject) {
        try {
            ax axVar = new ax();
            axVar.b = context;
            axVar.f5580a = jSONObject;
            new bo();
            bu a2 = bo.a(axVar);
            if (a2 == null) {
                return false;
            }
            JSONObject jSONObject2 = new JSONObject(x.a(a2.f5615a));
            if (jSONObject2.has("status")) {
                return jSONObject2.getInt("status") == 1;
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    private static synchronized void a(Context context, d dVar, b bVar, w wVar) {
        synchronized (t.class) {
            if (context != null && wVar != null) {
                try {
                    if (!l) {
                        e(context);
                        l = true;
                    }
                    Boolean bool = Boolean.FALSE;
                    if (dVar != b) {
                        bool = Boolean.TRUE;
                        b = dVar;
                    }
                    if (bVar != f5753a) {
                        bool = Boolean.TRUE;
                        f5753a = bVar;
                    }
                    if (bool.booleanValue()) {
                        c = wVar.a();
                        d = wVar.b();
                        long currentTimeMillis = System.currentTimeMillis();
                        e = currentTimeMillis;
                        j = currentTimeMillis;
                        d(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static /* synthetic */ void a(Context context, String str) {
        if (str != null && str.length() != 0) {
            try {
                String f2 = f(context);
                File file = new File(f2 + "/" + str);
                if (file.exists()) {
                    String g2 = g(context);
                    File file2 = new File(g2 + "/" + str);
                    if (!file2.getParentFile().exists()) {
                        file2.getParentFile().mkdirs();
                    }
                    file.renameTo(file2);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static /* synthetic */ void a(Context context, JSONObject jSONObject, long j2) {
        Throwable th;
        byte[] a2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            a2 = bd.a(context, jSONObject.toString().getBytes());
            String b2 = b(j2);
            String f2 = f(context);
            File file = new File(f2 + "/" + b2);
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            fileOutputStream = new FileOutputStream(file);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            fileOutputStream.write(a2);
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream2 = fileOutputStream;
            try {
                th.printStackTrace();
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (Throwable th5) {
                        th5.printStackTrace();
                    }
                }
            } catch (Throwable th6) {
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (Throwable th7) {
                        th7.printStackTrace();
                    }
                }
                throw th6;
            }
        }
    }

    public static void a(Context context, boolean z, w wVar) {
        a(context, z ? a.DidAgree : a.NotAgree, wVar);
    }

    public static void a(Context context, boolean z, boolean z2, w wVar) {
        a(context, z2 ? d.DidShow : d.NotShow, z ? b.DidContain : b.NotContain, wVar);
    }
}
