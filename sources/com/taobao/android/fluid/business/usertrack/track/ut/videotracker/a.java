package com.taobao.android.fluid.business.usertrack.track.ut.videotracker;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.sj4;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String c;
    public long d;
    public long e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public long k;
    public long l;
    public long m;
    public String v;
    public String x;
    public long y;
    public long z;

    /* renamed from: a  reason: collision with root package name */
    public long f7698a = 0;
    public long b = 0;
    public int n = 0;
    public int o = 1;
    public int p = 0;
    public int q = 0;
    public int r = 0;
    public int s = 0;
    public long t = 0;
    public long u = 0;
    public int w = -1;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.fluid.business.usertrack.track.ut.videotracker.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class C0413a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final a f7699a;
        public final Map<String, String> b = new HashMap(20);
        public final b c;

        static {
            t2o.a(468713643);
        }

        public C0413a(a aVar, b bVar) {
            this.f7699a = aVar;
            this.c = bVar;
        }

        public Map<String, String> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("ce31e56a", new Object[]{this});
            }
            return this.b;
        }

        public C0413a b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0413a) ipChange.ipc$dispatch("eef20e2a", new Object[]{this});
            }
            this.f7699a.e = SystemClock.elapsedRealtime();
            ((HashMap) this.b).put("svm_ts", String.valueOf(this.f7699a.e));
            if (this.c != null) {
                sj4.a(this.b);
                ((HashMap) this.b).put("svm_pid", this.c.d);
                ((HashMap) this.b).put("svm_has_preplayer", String.valueOf(this.c.e));
                ((HashMap) this.b).put("svm_p_mtop_use_nd_api", String.valueOf(this.c.g));
                this.f7699a.f7698a = SystemClock.elapsedRealtime() - this.c.f7700a;
                ((HashMap) this.b).put("svm_p_time", String.valueOf(this.f7699a.f7698a));
                this.f7699a.b = SystemClock.elapsedRealtime() - this.c.b;
                ((HashMap) this.b).put("svm_p_visible_time", String.valueOf(this.f7699a.b));
                ((HashMap) this.b).put("svm_dsl_md5", this.c.j);
                ((HashMap) this.b).put("svm_p_flag_ggpick_isdefault", String.valueOf(this.c.l));
                ((HashMap) this.b).put("svm_p_flag_ggpick_cachetype", String.valueOf(this.c.k));
                if (!TextUtils.isEmpty(this.c.m)) {
                    ((HashMap) this.b).put("svm_p_flag_ggpick_cachescene", this.c.m);
                }
                if (!TextUtils.isEmpty(this.c.n)) {
                    ((HashMap) this.b).put("svm_p_flag_ggpick_iscoldred", this.c.n);
                }
                if (!TextUtils.isEmpty(this.c.o)) {
                    ((HashMap) this.b).put("svm_p_flag_ggpick_usepreloaddw", this.c.o);
                }
                if (!TextUtils.isEmpty(this.c.p)) {
                    ((HashMap) this.b).put("svm_p_flag_ggpick_fromLaun", this.c.p);
                }
                if (!TextUtils.isEmpty(this.c.q)) {
                    ((HashMap) this.b).put("svm_p_flag_ggpick_launUsePre", this.c.q);
                }
            }
            return this;
        }

        public C0413a c(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0413a) ipChange.ipc$dispatch("7be27fa8", new Object[]{this, new Long(j)});
            }
            ((HashMap) this.b).put("svm_cost", String.valueOf(j));
            return this;
        }

        public C0413a d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0413a) ipChange.ipc$dispatch("eb589a47", new Object[]{this});
            }
            ((HashMap) this.b).put("svm_error_code", this.f7699a.f);
            ((HashMap) this.b).put("svm_error_content", this.f7699a.g);
            return this;
        }

        public C0413a e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0413a) ipChange.ipc$dispatch("d2a1607", new Object[]{this});
            }
            ((HashMap) this.b).put("svm_p_mtop_api", this.f7699a.c);
            b bVar = this.c;
            if (bVar != null) {
                ((HashMap) this.b).put("svm_p_mtop_index", String.valueOf(bVar.f));
            }
            return this;
        }

        public C0413a f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0413a) ipChange.ipc$dispatch("3194cd34", new Object[]{this});
            }
            b bVar = this.c;
            if (bVar != null) {
                ((HashMap) this.b).put("svm_biz_params", bVar.c);
            }
            return this;
        }

        public C0413a g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0413a) ipChange.ipc$dispatch("ac332254", new Object[]{this});
            }
            ((HashMap) this.b).put("svm_player_qos", this.f7699a.v);
            return this;
        }

        public C0413a h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0413a) ipChange.ipc$dispatch("efbed6fe", new Object[]{this, str});
            }
            if (!TextUtils.isEmpty(str)) {
                ((HashMap) this.b).put("svm_reserve1", str);
            }
            return this;
        }

        public C0413a i(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0413a) ipChange.ipc$dispatch("a93b6cbf", new Object[]{this, str});
            }
            if (!TextUtils.isEmpty(str)) {
                ((HashMap) this.b).put("svm_reserve2", str);
            }
            return this;
        }

        public C0413a j(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0413a) ipChange.ipc$dispatch("62b80280", new Object[]{this, str});
            }
            if (!TextUtils.isEmpty(str)) {
                ((HashMap) this.b).put("svm_reserve3", str);
            }
            return this;
        }

        public C0413a k(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0413a) ipChange.ipc$dispatch("c1dd72c0", new Object[]{this, str});
            }
            if (!TextUtils.isEmpty(str)) {
                ((HashMap) this.b).put("svm_reserves", VideoTracker.c(str));
            }
            return this;
        }

        public C0413a l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0413a) ipChange.ipc$dispatch("bcd96bdf", new Object[]{this});
            }
            ((HashMap) this.b).put("svm_vv_flag_stall", String.valueOf(this.f7699a.s));
            ((HashMap) this.b).put("svm_vv_gap_stall", String.valueOf(this.f7699a.t));
            return this;
        }

        public C0413a m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0413a) ipChange.ipc$dispatch("1d7136ff", new Object[]{this});
            }
            ((HashMap) this.b).put("svm_vvid", this.f7699a.h);
            ((HashMap) this.b).put("svm_playerid", this.f7699a.i);
            ((HashMap) this.b).put("svm_preplayerid", this.f7699a.j);
            a aVar = this.f7699a;
            aVar.k = aVar.d > 0 ? SystemClock.elapsedRealtime() - this.f7699a.d : 1L;
            if (!((HashMap) this.b).containsKey("svm_vv_time")) {
                ((HashMap) this.b).put("svm_vv_time", String.valueOf(this.f7699a.k));
            }
            Map<String, String> map = this.b;
            this.f7699a.getClass();
            ((HashMap) map).put("svm_vv_content_id", null);
            ((HashMap) this.b).put("svm_vv_video_duration", String.valueOf(this.f7699a.l));
            ((HashMap) this.b).put("svm_vv_progress", String.valueOf(this.f7699a.m));
            ((HashMap) this.b).put("svm_vv_index", String.valueOf(this.f7699a.n));
            ((HashMap) this.b).put("svm_vv_play_count", String.valueOf(this.f7699a.o));
            ((HashMap) this.b).put("svm_vv_retry_count", String.valueOf(this.f7699a.p));
            ((HashMap) this.b).put("svm_vv_hit_cache", String.valueOf(this.f7699a.q));
            ((HashMap) this.b).put("svm_vv_is_active", String.valueOf(this.f7699a.r));
            ((HashMap) this.b).put("svm_vv_flag_predl", String.valueOf(this.f7699a.w));
            if (!TextUtils.isEmpty(this.f7699a.x)) {
                ((HashMap) this.b).put("svm_p_flag_ggpick_hit", this.f7699a.x);
            }
            long j = this.f7699a.u;
            if (j > 0) {
                ((HashMap) this.b).put("svm_vv_gap_launcher_time", String.valueOf(j));
            }
            return this;
        }

        public C0413a n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0413a) ipChange.ipc$dispatch("c179e1d8", new Object[]{this});
            }
            Map<String, String> map = this.b;
            this.f7699a.getClass();
            ((HashMap) map).put("svm_vv_content_data", null);
            return this;
        }

        public C0413a o(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0413a) ipChange.ipc$dispatch("f965f5c8", new Object[]{this, new Long(j)});
            }
            ((HashMap) this.b).put("svm_vv_time", String.valueOf(j));
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public long f7700a;
        public long b;
        public String c;
        public String d;
        public String h;
        public String k;
        public String l;
        public String m;
        public String n;
        public String o;
        public String p;
        public String q;
        public int e = 0;
        public int f = -1;
        public final String g = "1";
        public boolean i = true;
        public final String j = "";

        static {
            t2o.a(468713644);
        }
    }

    static {
        t2o.a(468713642);
    }

    public C0413a a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C0413a) ipChange.ipc$dispatch("32d8625c", new Object[]{this, bVar});
        }
        return new C0413a(this, bVar);
    }
}
