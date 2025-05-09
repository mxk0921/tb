package com.alibaba.android.umbrella.performance;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.gdv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class a {
    public static final int ADD_ABTEST = 6;
    public static final int ADD_ARGS = 2;
    public static final int ADD_OTHER_PROCESS = 8;
    public static final int ADD_PROCESS_POINT = 3;
    public static final int ADD_SUB_PROCESS_POINT = 4;
    public static final int COMMIT = 5;
    public static final int REGISTER_PAGE_POINT = 1;
    public static final int SET_CHILD_BIZ = 7;

    /* renamed from: a  reason: collision with root package name */
    public final int f2392a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final gdv g;
    public final long h;
    public final long i;
    public final Map<String, String> j;

    public a(b bVar) {
        this.f2392a = b.c(bVar);
        this.b = b.d(bVar);
        this.c = bVar.e;
        this.d = bVar.f;
        this.e = bVar.g;
        this.h = b.e(bVar);
        this.g = bVar.d;
        this.f = b.f(bVar);
        this.j = b.g(bVar);
        this.i = b.h(bVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f2393a;
        public final String b;
        public final long c;
        public gdv d;
        public String e;
        public String f;
        public String g;
        public String h;
        public Map<String, String> i;
        public long j;

        public b(String str) {
            this.b = str;
            this.c = SystemClock.uptimeMillis();
        }

        public static /* synthetic */ int c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b17e6ddd", new Object[]{bVar})).intValue();
            }
            return bVar.f2393a;
        }

        public static /* synthetic */ String d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ecd60fb7", new Object[]{bVar});
            }
            return bVar.b;
        }

        public static /* synthetic */ long e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ee1421c", new Object[]{bVar})).longValue();
            }
            return bVar.c;
        }

        public static /* synthetic */ String f(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2a4a7f39", new Object[]{bVar});
            }
            return bVar.h;
        }

        public static /* synthetic */ Map g(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("c383fe1b", new Object[]{bVar});
            }
            return bVar.i;
        }

        public static /* synthetic */ long h(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9af58079", new Object[]{bVar})).longValue();
            }
            return bVar.j;
        }

        public b a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("ea9e04ad", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public b b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c87ea45e", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }

        public b i(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("dade0cd2", new Object[]{this, map});
            }
            this.i = map;
            return this;
        }

        public a j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4d7df892", new Object[]{this});
            }
            return new a(this);
        }

        public b k(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("71360c4", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public b l(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d1055954", new Object[]{this, new Long(j)});
            }
            this.j = j;
            return this;
        }

        public b m(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("33045e58", new Object[]{this, str});
            }
            this.h = str;
            return this;
        }

        public b n(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("ec50ed9", new Object[]{this, new Integer(i)});
            }
            this.f2393a = i;
            return this;
        }

        public b o(gdv gdvVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("bb1fff70", new Object[]{this, gdvVar});
            }
            this.d = gdvVar;
            return this;
        }

        public b(String str, long j) {
            this.b = str;
            if (j > 0) {
                this.c = j;
            } else {
                this.c = SystemClock.uptimeMillis();
            }
        }
    }
}
