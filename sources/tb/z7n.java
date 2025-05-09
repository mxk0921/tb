package tb;

import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.adapter.internal.CommonCode;
import com.taobao.taobao.R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class z7n extends zio {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String j = "QueryMediaTask";
    private static final Set<String> k;
    private c e;
    private final boolean f;
    private Handler c = new Handler(Looper.getMainLooper());
    private List<zs9> d = new ArrayList();
    private volatile boolean g = false;
    private boolean h = true;
    private boolean i = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ zs9 c;

        public a(zs9 zs9Var) {
            this.c = zs9Var;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/album/QueryMediaTask$1");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            z7n.e(z7n.this).add(this.c);
            if (z7n.f(z7n.this) != null && !z7n.g(z7n.this)) {
                z7n.f(z7n.this).B(this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ Map d;
        public final /* synthetic */ Map e;
        public final /* synthetic */ List f;

        public b(boolean z, Map map, Map map2, List list) {
            this.c = z;
            this.d = map;
            this.e = map2;
            this.f = list;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/album/QueryMediaTask$2");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            if (this.c) {
                n73.f();
            }
            if (z7n.f(z7n.this) != null && !z7n.g(z7n.this)) {
                for (Map.Entry entry : this.d.entrySet()) {
                    if (entry.getValue() != null) {
                        ((zs9) entry.getKey()).c((zs9) this.e.get(((zs9) entry.getKey()).h()));
                        z7n.f(z7n.this).t((zs9) entry.getKey());
                    }
                }
                List list = this.f;
                if (!(list == null || list.isEmpty())) {
                    z7n.f(z7n.this).A(this.f);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface c {
        void A(List<pei> list);

        void B(zs9 zs9Var);

        void t(zs9 zs9Var);

        void z(pei peiVar);
    }

    public z7n(c cVar, boolean z) {
        this.e = cVar;
        this.f = z;
    }

    public static /* synthetic */ List e(z7n z7nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fbed906d", new Object[]{z7nVar});
        }
        return z7nVar.d;
    }

    public static /* synthetic */ c f(z7n z7nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("5ac34faf", new Object[]{z7nVar});
        }
        return z7nVar.e;
    }

    public static /* synthetic */ boolean g(z7n z7nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b45af5c", new Object[]{z7nVar})).booleanValue();
        }
        return z7nVar.g;
    }

    private List<pei> h(Map<zs9, List<pei>> map, zs9 zs9Var, pei peiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7d90015b", new Object[]{this, map, zs9Var, peiVar});
        }
        List<pei> list = map.get(zs9Var);
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(peiVar);
        return list;
    }

    public static /* synthetic */ Object ipc$super(z7n z7nVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/album/QueryMediaTask");
    }

    public static boolean k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b6894e5", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        for (String str2 : k) {
            if (lowerCase.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    private void l(zs9 zs9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bda8d1d3", new Object[]{this, zs9Var});
        } else {
            this.c.post(new a(zs9Var));
        }
    }

    private void m(Map<zs9, List<pei>> map, List<pei> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4d3b086", new Object[]{this, map, list});
            return;
        }
        boolean z = this.h;
        boolean z2 = !z;
        if (z) {
            this.h = false;
        }
        if (!z) {
            n73.j();
        }
        HashMap hashMap = new HashMap(map.size());
        for (Map.Entry<zs9, List<pei>> entry : map.entrySet()) {
            if (!(entry.getValue() == null || entry.getKey() == null)) {
                entry.getKey().a(entry.getValue());
                entry.getKey().m();
                entry.getKey().n();
                hashMap.put(entry.getKey().h(), entry.getKey().e());
            }
        }
        if (!z) {
            n73.i();
        }
        this.c.post(new b(z2, map, hashMap, list));
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51b10b8f", new Object[]{this});
            return;
        }
        n73.g();
        Cursor n = n();
        Cursor p = p();
        HashMap hashMap = new HashMap();
        zs9 zs9Var = new zs9("/" + Localization.q(R.string.taobao_app_1007_1_18952));
        this.d.add(zs9Var);
        l(zs9Var);
        if (n == null && p == null) {
            zs9Var.l(true);
        } else if ((n == null || !n.moveToFirst()) && (p == null || !p.moveToFirst())) {
            if (n != null) {
                n.close();
            }
            if (p != null) {
                p.close();
            }
            zs9Var.l(true);
        } else {
            n73.h();
            if (n != null && n.moveToFirst()) {
                i(n, hashMap, zs9Var);
            }
            if (p != null && p.moveToFirst()) {
                j(p, hashMap, zs9Var);
            }
            ArrayList arrayList = new ArrayList(hashMap.size());
            for (Map.Entry entry : hashMap.entrySet()) {
                arrayList.add(entry.getValue());
            }
            this.d.addAll(arrayList);
        }
    }

    private Cursor p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cursor) ipChange.ipc$dispatch("d91a8621", new Object[]{this});
        }
        if (!this.f) {
            return null;
        }
        try {
            return MediaStore.Images.Media.query(caa.c().getContentResolver(), MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "date_modified", "duration", CommonCode.MapKey.HAS_RESOLUTION}, null, null, "title");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // tb.zio
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15c1193f", new Object[]{this});
        } else {
            o();
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else {
            this.g = true;
        }
    }

    private Cursor n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cursor) ipChange.ipc$dispatch("f5d096e", new Object[]{this});
        }
        try {
            return MediaStore.Images.Media.query(caa.c().getContentResolver(), MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "date_modified", "_display_name", "orientation"}, null, null, String.format("%1$s DESC,%2$s DESC,%3$s DESC", "date_modified", "_display_name", "_id"));
        } catch (Exception unused) {
            return null;
        }
    }

    static {
        t2o.a(481296468);
        HashSet hashSet = new HashSet();
        k = hashSet;
        hashSet.add("screenshot");
        hashSet.add("截屏");
        hashSet.add("screen_shot");
        hashSet.add("screen-shot");
        hashSet.add("screen shot");
        hashSet.add("screencapture");
        hashSet.add("screen_capture");
        hashSet.add("screen-capture");
        hashSet.add("screen capture");
        hashSet.add("screencap");
        hashSet.add("screen_cap");
        hashSet.add("screen-cap");
        hashSet.add("screen cap");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012e A[LOOP:0: B:12:0x0051->B:50:0x012e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0121 A[EDGE_INSN: B:57:0x0121->B:46:0x0121 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void i(android.database.Cursor r26, java.util.Map<java.lang.String, tb.zs9> r27, tb.zs9 r28) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.z7n.i(android.database.Cursor, java.util.Map, tb.zs9):void");
    }

    private void j(Cursor cursor, Map<String, zs9> map, zs9 zs9Var) {
        zs9 zs9Var2;
        boolean z = true;
        int i = 4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd18d61c", new Object[]{this, cursor, map, zs9Var});
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(10);
        p7m.a("album video count", String.valueOf(cursor.getCount()));
        if (caa.t() || caa.s()) {
            i = 8;
        }
        int i2 = 0;
        while (!this.g) {
            try {
                long j2 = cursor.getLong(cursor.getColumnIndex("_id"));
                String string = cursor.getString(cursor.getColumnIndex("_data"));
                long j3 = cursor.getLong(cursor.getColumnIndex("date_modified"));
                long j4 = cursor.getLong(cursor.getColumnIndex("duration"));
                if (!TextUtils.isEmpty(string) && string.endsWith(ryp.FILE_TYPE_VIDEO_MP4)) {
                    File file = new File(string);
                    if (file.exists()) {
                        pei peiVar = new pei(j2, string, "", j3, j4, true);
                        arrayList.add(peiVar);
                        String parent = file.getParent();
                        if (map.containsKey(parent)) {
                            zs9Var2 = map.get(parent);
                        } else {
                            zs9 zs9Var3 = new zs9(parent);
                            map.put(parent, zs9Var3);
                            l(zs9Var3);
                            zs9Var2 = zs9Var3;
                        }
                        hashMap.put(zs9Var2, h(hashMap, zs9Var2, peiVar));
                        hashMap.put(zs9Var, arrayList);
                        i2 += 2;
                        if (!z) {
                            i = 100;
                        }
                        if (i2 == i) {
                            m(hashMap, arrayList2);
                            HashMap hashMap2 = new HashMap();
                            arrayList = new ArrayList();
                            arrayList2 = new ArrayList(10);
                            i2 = 0;
                            hashMap = hashMap2;
                            z = false;
                        }
                    }
                }
            } catch (Exception unused) {
            }
            if (!cursor.moveToNext()) {
                break;
            }
        }
        cursor.close();
        if (!arrayList.isEmpty()) {
            m(hashMap, arrayList2);
        }
    }
}
