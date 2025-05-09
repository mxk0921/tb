package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class q8t {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, Set<c>> f26585a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26587a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;
        public final /* synthetic */ long d;

        public b(String str, String str2, long j, long j2) {
            this.f26587a = str;
            this.b = str2;
            this.c = j;
            this.d = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (q8t.f26585a == null) {
                q8t.f26585a = new LinkedHashMap();
            }
            Set<c> set = q8t.f26585a.get(this.f26587a);
            c cVar = new c(this.f26587a, this.b);
            cVar.c = this.c;
            cVar.d = this.d;
            if (set != null) {
                jdh.a("TaoTrace", "add point {%s,%s}'s duration:[%d, %d] result:%b", this.f26587a, this.b, Long.valueOf(this.c), Long.valueOf(this.d), Boolean.valueOf(set.add(cVar)));
                return;
            }
            HashSet hashSet = new HashSet();
            hashSet.add(cVar);
            jdh.a("TaoTrace", "add point {%s,%s}'s duration:[%d, %d] result:%b", this.f26587a, this.b, Long.valueOf(this.c), Long.valueOf(this.d), Boolean.TRUE);
            q8t.f26585a.put(this.f26587a, hashSet);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f26588a;
        public final String b;
        public long c;
        public long d;

        public c(String str, String str2) {
            this.f26588a = str;
            this.b = str2;
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
            }
            long j = this.c;
            if (j <= 0) {
                return false;
            }
            long j2 = this.d;
            if (j2 <= 0 || j2 < j) {
                return false;
            }
            return true;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (!this.f26588a.equals(cVar.f26588a)) {
                return false;
            }
            return this.b.equals(cVar.b);
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return (this.f26588a.hashCode() * 31) + this.b.hashCode();
        }
    }

    public static void a(String str, String str2, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7836146f", new Object[]{str, str2, new Long(j), new Long(j2)});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if ((j2 <= 0 || j <= j2) && c()) {
                pjg.EXECUTOR.submit(new b(str, str2, j, j2));
            }
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f6593f6", new Object[]{str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (c()) {
                pjg.EXECUTOR.submit(new a(str, str2, currentTimeMillis));
            }
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("156be988", new Object[0])).booleanValue();
        }
        return q1r.c(".report_custom_dag_point");
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b4e7c7d", new Object[]{str, str2});
        } else {
            a(str, str2, System.currentTimeMillis(), 0L);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26586a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;

        public a(String str, String str2, long j) {
            this.f26586a = str;
            this.b = str2;
            this.c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            Set<c> set;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Map<String, Set<c>> map = q8t.f26585a;
            if (!(map == null || (set = (Set) ((LinkedHashMap) map).get(this.f26586a)) == null)) {
                c cVar = new c(this.f26586a, this.b);
                for (c cVar2 : set) {
                    if (cVar.equals(cVar2)) {
                        cVar2.d = this.c;
                        jdh.a("TaoTrace", "update point {%s,%s}'s duration:[%d, %d] result:%b", this.f26586a, this.b, Long.valueOf(cVar2.c), Long.valueOf(this.c), Boolean.TRUE);
                        return;
                    }
                }
            }
        }
    }
}
