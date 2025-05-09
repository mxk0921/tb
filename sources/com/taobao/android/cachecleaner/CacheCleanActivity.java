package com.taobao.android.cachecleaner;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.monitor.config.ManualConfig;
import com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.BaseActivity;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.acq;
import tb.ey1;
import tb.f7l;
import tb.hg4;
import tb.sz9;
import tb.t2o;
import tb.ur2;
import tb.vr2;
import tb.vs3;
import tb.wr2;
import tb.xr2;
import tb.yr2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CacheCleanActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public CacheOverviewInfo B;
    public Map<String, Long> C;

    /* renamed from: a  reason: collision with root package name */
    public ProgressBar f6484a;
    public TextView b;
    public TextView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public TextView g;
    public TextView h;
    public View i;
    public View j;
    public View k;
    public View l;
    public View m;
    public Handler n;
    public Handler o;
    public long q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;
    public volatile int p = 0;
    public final AtomicBoolean z = new AtomicBoolean(false);
    public final List<Integer> A = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f6485a;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f6485a < 100) {
                CacheCleanActivity cacheCleanActivity = CacheCleanActivity.this;
                int i = R.string.use_loading;
                CacheCleanActivity.L3(CacheCleanActivity.this).setText(cacheCleanActivity.getString(i, this.f6485a + f7l.MOD));
                this.f6485a = this.f6485a + 1;
                CacheCleanActivity.M3(CacheCleanActivity.this).postDelayed(this, 100L);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements ey1.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f6486a;

        public b(f fVar) {
            this.f6486a = fVar;
        }

        @Override // tb.ey1.a
        public void a(CacheOverviewInfo cacheOverviewInfo, Map<String, Long> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd39a5f0", new Object[]{this, cacheOverviewInfo, map});
                return;
            }
            CacheCleanActivity.t3(CacheCleanActivity.this, cacheOverviewInfo.getTotalUsedSize() * 1024);
            CacheCleanActivity.v3(CacheCleanActivity.this, cacheOverviewInfo);
            CacheCleanActivity.x3(CacheCleanActivity.this, map);
            TLog.loge(yr2.MODULE, "startCheckSystem success", "mAppSize = " + CacheCleanActivity.s3(CacheCleanActivity.this));
            ((e.a) this.f6486a).a();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public long f6487a = 0;
        public final /* synthetic */ String b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ long f6488a;

            public a(long j) {
                this.f6488a = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                CacheCleanActivity.G3(CacheCleanActivity.this).setVisibility(8);
                Toast.makeText(CacheCleanActivity.this, CacheCleanActivity.this.getString(R.string.clean_cache_toast_success, vs3.a(this.f6488a)), 0).show();
                String str = c.this.b;
                str.hashCode();
                if (str.equals("data")) {
                    CacheCleanActivity.I3(CacheCleanActivity.this, false);
                    CacheCleanActivity cacheCleanActivity = CacheCleanActivity.this;
                    CacheCleanActivity.t3(cacheCleanActivity, CacheCleanActivity.s3(cacheCleanActivity) - CacheCleanActivity.E3(CacheCleanActivity.this));
                    CacheCleanActivity.F3(CacheCleanActivity.this, 0L);
                } else if (str.equals("cache")) {
                    CacheCleanActivity.H3(CacheCleanActivity.this, false);
                    CacheCleanActivity cacheCleanActivity2 = CacheCleanActivity.this;
                    CacheCleanActivity.t3(cacheCleanActivity2, CacheCleanActivity.s3(cacheCleanActivity2) - CacheCleanActivity.y3(CacheCleanActivity.this));
                    CacheCleanActivity.z3(CacheCleanActivity.this, 0L);
                }
                CacheCleanActivity.O3(CacheCleanActivity.this);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class b implements ey1.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // tb.ey1.a
            public void a(CacheOverviewInfo cacheOverviewInfo, Map<String, Long> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("bd39a5f0", new Object[]{this, cacheOverviewInfo, map});
                    return;
                }
                CacheCleanActivity.K3(CacheCleanActivity.this, cacheOverviewInfo.getTotalUsedSize() * 1024);
                CacheCleanActivity.x3(CacheCleanActivity.this, map);
                CacheCleanActivity.v3(CacheCleanActivity.this, cacheOverviewInfo);
                TLog.loge(yr2.MODULE, "startCheckSystem success", "mAppSize = " + CacheCleanActivity.J3(CacheCleanActivity.this));
            }
        }

        public c(String str) {
            this.b = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00bb A[Catch: Exception -> 0x0034, TryCatch #0 {Exception -> 0x0034, blocks: (B:6:0x0012, B:11:0x002b, B:16:0x0037, B:23:0x004a, B:25:0x0056, B:27:0x008e, B:28:0x00a4, B:29:0x00bb, B:31:0x00c7, B:33:0x00ff, B:34:0x0114), top: B:41:0x0012 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0169  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x017d  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 395
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.cachecleaner.CacheCleanActivity.c.run():void");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(CacheCleanActivity cacheCleanActivity) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f6490a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements f {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("26f63c6e", new Object[]{this});
                } else {
                    CacheCleanActivity.Q3(CacheCleanActivity.this);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    CacheCleanActivity.q3(CacheCleanActivity.this);
                }
            }
        }

        static {
            t2o.a(737148943);
        }

        public e(int i) {
            this.f6490a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (CacheCleanActivity.P3(CacheCleanActivity.this).get()) {
                try {
                    int i = this.f6490a;
                    if (i == 1) {
                        CacheCleanActivity.R3(CacheCleanActivity.this, new a());
                    } else if (i == 2) {
                        CacheCleanActivity.n3(CacheCleanActivity.this);
                        CacheCleanActivity.Q3(CacheCleanActivity.this);
                    } else if (i == 3) {
                        CacheCleanActivity.o3(CacheCleanActivity.this);
                        CacheCleanActivity.Q3(CacheCleanActivity.this);
                    } else if (i == 4) {
                        CacheCleanActivity.p3(CacheCleanActivity.this);
                        CacheCleanActivity.Q3(CacheCleanActivity.this);
                    }
                } catch (Exception e) {
                    TLog.loge(yr2.MODULE, "CacheCleanActivity", "LoadDataRunnable error.step:" + this.f6490a + "error msg=" + e);
                    CacheCleanActivity.N3(CacheCleanActivity.this);
                    CacheCleanActivity.this.runOnUiThread(new b());
                    CacheCleanActivity.r3(CacheCleanActivity.this, "calculate", e.getMessage());
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface f {
    }

    static {
        t2o.a(737148930);
    }

    public static /* synthetic */ void A3(CacheCleanActivity cacheCleanActivity, String str, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("180255a", new Object[]{cacheCleanActivity, str, new Long(j), new Long(j2), new Long(j3)});
        } else {
            cacheCleanActivity.b4(str, j, j2, j3);
        }
    }

    public static /* synthetic */ void B3(CacheCleanActivity cacheCleanActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b7101ea", new Object[]{cacheCleanActivity});
        } else {
            cacheCleanActivity.Z3();
        }
    }

    public static /* synthetic */ long C3(CacheCleanActivity cacheCleanActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b38376a", new Object[]{cacheCleanActivity})).longValue();
        }
        return cacheCleanActivity.x;
    }

    public static /* synthetic */ long D3(CacheCleanActivity cacheCleanActivity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("45a95c40", new Object[]{cacheCleanActivity, new Long(j)})).longValue();
        }
        cacheCleanActivity.x = j;
        return j;
    }

    public static /* synthetic */ long E3(CacheCleanActivity cacheCleanActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4bee042b", new Object[]{cacheCleanActivity})).longValue();
        }
        return cacheCleanActivity.u;
    }

    public static /* synthetic */ long F3(CacheCleanActivity cacheCleanActivity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4bad279f", new Object[]{cacheCleanActivity, new Long(j)})).longValue();
        }
        cacheCleanActivity.u = j;
        return j;
    }

    public static /* synthetic */ View G3(CacheCleanActivity cacheCleanActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("eedd1b3a", new Object[]{cacheCleanActivity});
        }
        return cacheCleanActivity.l;
    }

    public static /* synthetic */ boolean H3(CacheCleanActivity cacheCleanActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57b4fa7d", new Object[]{cacheCleanActivity, new Boolean(z)})).booleanValue();
        }
        cacheCleanActivity.getClass();
        return z;
    }

    public static /* synthetic */ boolean I3(CacheCleanActivity cacheCleanActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5db8c5dc", new Object[]{cacheCleanActivity, new Boolean(z)})).booleanValue();
        }
        cacheCleanActivity.getClass();
        return z;
    }

    public static /* synthetic */ long J3(CacheCleanActivity cacheCleanActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ec5372f", new Object[]{cacheCleanActivity})).longValue();
        }
        return cacheCleanActivity.y;
    }

    public static /* synthetic */ long K3(CacheCleanActivity cacheCleanActivity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63bc551b", new Object[]{cacheCleanActivity, new Long(j)})).longValue();
        }
        cacheCleanActivity.y = j;
        return j;
    }

    public static /* synthetic */ TextView L3(CacheCleanActivity cacheCleanActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("d68e61f", new Object[]{cacheCleanActivity});
        }
        return cacheCleanActivity.b;
    }

    public static /* synthetic */ Handler M3(CacheCleanActivity cacheCleanActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("2789a3da", new Object[]{cacheCleanActivity});
        }
        return cacheCleanActivity.o;
    }

    public static /* synthetic */ void N3(CacheCleanActivity cacheCleanActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d92682d", new Object[]{cacheCleanActivity});
        } else {
            cacheCleanActivity.S3();
        }
    }

    public static /* synthetic */ void O3(CacheCleanActivity cacheCleanActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e4834ee", new Object[]{cacheCleanActivity});
        } else {
            cacheCleanActivity.X3();
        }
    }

    public static /* synthetic */ AtomicBoolean P3(CacheCleanActivity cacheCleanActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("e8deec2f", new Object[]{cacheCleanActivity});
        }
        return cacheCleanActivity.z;
    }

    public static /* synthetic */ void Q3(CacheCleanActivity cacheCleanActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fb3ce70", new Object[]{cacheCleanActivity});
        } else {
            cacheCleanActivity.m4();
        }
    }

    public static /* synthetic */ void R3(CacheCleanActivity cacheCleanActivity, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdd6704a", new Object[]{cacheCleanActivity, fVar});
        } else {
            cacheCleanActivity.j4(fVar);
        }
    }

    public static /* synthetic */ Object ipc$super(CacheCleanActivity cacheCleanActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/cachecleaner/CacheCleanActivity");
        }
    }

    public static /* synthetic */ void l3(CacheCleanActivity cacheCleanActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba784832", new Object[]{cacheCleanActivity, str});
        } else {
            cacheCleanActivity.U3(str);
        }
    }

    public static /* synthetic */ void m3(CacheCleanActivity cacheCleanActivity, DialogInterface.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea943bc4", new Object[]{cacheCleanActivity, onClickListener});
        } else {
            cacheCleanActivity.g4(onClickListener);
        }
    }

    public static /* synthetic */ void n3(CacheCleanActivity cacheCleanActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35346c17", new Object[]{cacheCleanActivity});
        } else {
            cacheCleanActivity.h4();
        }
    }

    public static /* synthetic */ void o3(CacheCleanActivity cacheCleanActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45ea38d8", new Object[]{cacheCleanActivity});
        } else {
            cacheCleanActivity.i4();
        }
    }

    public static /* synthetic */ void p3(CacheCleanActivity cacheCleanActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56a00599", new Object[]{cacheCleanActivity});
        } else {
            cacheCleanActivity.W3();
        }
    }

    public static /* synthetic */ void q3(CacheCleanActivity cacheCleanActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6755d25a", new Object[]{cacheCleanActivity});
        } else {
            cacheCleanActivity.V3();
        }
    }

    public static /* synthetic */ void r3(CacheCleanActivity cacheCleanActivity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dfea2af", new Object[]{cacheCleanActivity, str, str2});
        } else {
            cacheCleanActivity.c4(str, str2);
        }
    }

    public static /* synthetic */ long s3(CacheCleanActivity cacheCleanActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88c16bd0", new Object[]{cacheCleanActivity})).longValue();
        }
        return cacheCleanActivity.s;
    }

    public static /* synthetic */ long t3(CacheCleanActivity cacheCleanActivity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a946b49a", new Object[]{cacheCleanActivity, new Long(j)})).longValue();
        }
        cacheCleanActivity.s = j;
        return j;
    }

    public static /* synthetic */ CacheOverviewInfo u3(CacheCleanActivity cacheCleanActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CacheOverviewInfo) ipChange.ipc$dispatch("ea13f4a3", new Object[]{cacheCleanActivity});
        }
        return cacheCleanActivity.B;
    }

    public static /* synthetic */ CacheOverviewInfo v3(CacheCleanActivity cacheCleanActivity, CacheOverviewInfo cacheOverviewInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CacheOverviewInfo) ipChange.ipc$dispatch("acdba9d7", new Object[]{cacheCleanActivity, cacheOverviewInfo});
        }
        cacheCleanActivity.B = cacheOverviewInfo;
        return cacheOverviewInfo;
    }

    public static /* synthetic */ Map w3(CacheCleanActivity cacheCleanActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("94c35b13", new Object[]{cacheCleanActivity});
        }
        return cacheCleanActivity.C;
    }

    public static /* synthetic */ Map x3(CacheCleanActivity cacheCleanActivity, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9a1d859a", new Object[]{cacheCleanActivity, map});
        }
        cacheCleanActivity.C = map;
        return map;
    }

    public static /* synthetic */ long y3(CacheCleanActivity cacheCleanActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bae2d213", new Object[]{cacheCleanActivity})).longValue();
        }
        return cacheCleanActivity.t;
    }

    public static /* synthetic */ long z3(CacheCleanActivity cacheCleanActivity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb5216b7", new Object[]{cacheCleanActivity, new Long(j)})).longValue();
        }
        cacheCleanActivity.t = j;
        return j;
    }

    public final synchronized void S3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a12c6922", new Object[]{this});
            return;
        }
        Handler handler = this.o;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.o = null;
        }
    }

    public final synchronized void T3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c05a0f3", new Object[]{this});
            return;
        }
        Handler handler = this.n;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.n.getLooper().quit();
            this.n = null;
        }
    }

    public final void U3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b18e808f", new Object[]{this, str});
            return;
        }
        this.l.setVisibility(0);
        Y3().post(new c(str));
    }

    public final void V3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43a12d6c", new Object[]{this});
            return;
        }
        this.b.setText(R.string.error_loading);
        this.c.setText(R.string.error_loading_msg);
        TextView textView = this.e;
        int i = R.string.empty_size;
        textView.setText(i);
        this.e.setVisibility(0);
        this.d.setEnabled(false);
        TextView textView2 = this.d;
        Resources resources = getResources();
        int i2 = R.color.btn_clean_disable;
        textView2.setTextColor(resources.getColor(i2));
        this.i.setVisibility(8);
        this.g.setText(i);
        this.g.setVisibility(0);
        this.f.setEnabled(false);
        this.f.setTextColor(getResources().getColor(i2));
        this.j.setVisibility(8);
        this.h.setText(i);
        this.k.setVisibility(8);
    }

    public final void W3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cd31420", new Object[]{this});
            return;
        }
        long j = this.s;
        long j2 = this.t;
        long j3 = this.u;
        long j4 = (j - j2) - j3;
        this.v = j4;
        this.w = j;
        this.y = j;
        e4("calculate", j, this.q, this.r, j2, j3, j4);
    }

    public final void X3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fc36f77", new Object[]{this});
            return;
        }
        TLog.loge(yr2.MODULE, "CacheCleanActivity", "finishUpdateUi");
        this.l.setVisibility(8);
        this.f6484a.setMax((int) ((this.q / 1024) / 1024));
        this.f6484a.setProgress((int) ((this.s / 1024) / 1024));
        this.f6484a.setSecondaryProgress((int) ((this.r / 1024) / 1024));
        this.b.setText(vs3.a(this.s));
        int i = R.string.use_percent_msg;
        this.c.setText(getString(i, ((int) ((((float) this.s) / ((float) this.q)) * 100.0f)) + f7l.MOD));
        long j = this.t;
        if (j > 0) {
            this.e.setText(vs3.a(j));
            this.e.setVisibility(0);
            this.d.setEnabled(true);
        } else {
            this.e.setText(R.string.empty_size);
            this.e.setVisibility(0);
            this.d.setEnabled(false);
            this.d.setTextColor(getResources().getColor(R.color.btn_clean_disable));
        }
        this.d.setVisibility(0);
        this.i.setVisibility(8);
        long j2 = this.u;
        if (j2 > 0) {
            this.g.setText(vs3.a(j2));
            this.g.setVisibility(0);
            this.f.setEnabled(true);
        } else {
            this.g.setText(R.string.empty_size);
            this.g.setVisibility(0);
            this.f.setEnabled(false);
            this.f.setTextColor(getResources().getColor(R.color.btn_clean_disable));
        }
        this.f.setVisibility(0);
        this.j.setVisibility(8);
        long j3 = this.v;
        if (j3 > 0) {
            this.h.setText(vs3.a(j3));
        } else {
            this.h.setText(R.string.empty_size);
        }
        this.h.setVisibility(0);
        this.k.setVisibility(8);
        if (this.r / 1024 < hg4.j().k().getLowStorageWeakSys()) {
            this.m.setVisibility(0);
        }
    }

    public final synchronized Handler Y3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("290ce1bc", new Object[]{this});
        }
        Handler handler = this.n;
        if (handler != null) {
            return handler;
        }
        HandlerThread handlerThread = new HandlerThread("[cache_]");
        handlerThread.start();
        Handler handler2 = new Handler(handlerThread.getLooper());
        this.n = handler2;
        return handler2;
    }

    public final void Z3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d3233bf", new Object[]{this});
            return;
        }
        try {
            startActivity(new Intent("android.settings.INTERNAL_STORAGE_SETTINGS"));
            d4();
        } catch (Exception e2) {
            TLog.loge(yr2.MODULE, "CacheCleanActivity", "go to sys error -> " + e2);
        }
    }

    public final void a4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.f6484a = (ProgressBar) findViewById(R.id.cache_main_progress);
        this.b = (TextView) findViewById(R.id.cache_main_title);
        this.c = (TextView) findViewById(R.id.cache_main_msg);
        this.e = (TextView) findViewById(R.id.clean_cache_msg);
        this.d = (TextView) findViewById(R.id.clean_cache_btn);
        this.g = (TextView) findViewById(R.id.clean_data_msg);
        this.f = (TextView) findViewById(R.id.clean_data_btn);
        this.h = (TextView) findViewById(R.id.need_msg);
        this.i = findViewById(R.id.clean_cache_load);
        this.j = findViewById(R.id.clean_data_load);
        this.k = findViewById(R.id.need_load);
        this.l = findViewById(R.id.clean_loading);
        this.m = findViewById(R.id.cache_main_sys);
        this.d.setOnClickListener(new ur2(this));
        this.f.setOnClickListener(new vr2(this));
        ViewProxy.setOnClickListener(this.m, new wr2(this));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    public final void b4(String str, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4017ec4", new Object[]{this, str, new Long(j), new Long(j2), new Long(j3)});
            return;
        }
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("user_cache_clean_new_v2");
        uTHitBuilders$UTCustomHitBuilder.setEventPage("cache_manager");
        uTHitBuilders$UTCustomHitBuilder.setProperty("size", String.valueOf(j / 1024));
        uTHitBuilders$UTCustomHitBuilder.setProperty("remainSize", String.valueOf(j2 / 1024));
        uTHitBuilders$UTCustomHitBuilder.setProperty("startSize", String.valueOf(j3 / 1024));
        uTHitBuilders$UTCustomHitBuilder.setProperty("type", String.valueOf(str));
        uTHitBuilders$UTCustomHitBuilder.setProperty("cacheSessionId", "CacheCleanActivity");
        if (hg4.j().k().isEnable()) {
            uTHitBuilders$UTCustomHitBuilder.setProperty("engine", "quota");
        } else {
            uTHitBuilders$UTCustomHitBuilder.setProperty("engine", "old");
        }
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
    }

    public final void c4(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bca816f", new Object[]{this, str, str2});
            return;
        }
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("user_cache_clean_new_v2");
        uTHitBuilders$UTCustomHitBuilder.setEventPage("cache_manager");
        uTHitBuilders$UTCustomHitBuilder.setProperty("error", str2);
        uTHitBuilders$UTCustomHitBuilder.setProperty("type", String.valueOf(str));
        uTHitBuilders$UTCustomHitBuilder.setProperty("cacheSessionId", "CacheCleanActivity");
        if (hg4.j().k().isEnable()) {
            uTHitBuilders$UTCustomHitBuilder.setProperty("engine", "quota");
        } else {
            uTHitBuilders$UTCustomHitBuilder.setProperty("engine", "old");
        }
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
    }

    public final void d4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c17417", new Object[]{this});
            return;
        }
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("cache_clean_low_storage_sys");
        uTHitBuilders$UTCustomHitBuilder.setEventPage("cache_manager");
        uTHitBuilders$UTCustomHitBuilder.setProperty("appSize", String.valueOf(this.s / 1024));
        uTHitBuilders$UTCustomHitBuilder.setProperty("deviceSize", String.valueOf(this.q / 1024));
        uTHitBuilders$UTCustomHitBuilder.setProperty("useSize", String.valueOf(this.r / 1024));
        uTHitBuilders$UTCustomHitBuilder.setProperty("cacheSessionId", "CacheCleanActivity");
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
    }

    public final void f4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a407955e", new Object[]{this});
        } else {
            e4("start", 0L, 0L, 0L, 0L, 0L, 0L);
        }
    }

    public final void g4(DialogInterface.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4ced6a1", new Object[]{this, onClickListener});
        } else {
            new AlertDialog.Builder(this).setMessage(R.string.clean_dialog_msg).setPositiveButton(R.string.clean_dialog_confirm, onClickListener).setNegativeButton(R.string.clean_dialog_cancel, new d(this)).create().show();
        }
    }

    public final void h4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a18a9184", new Object[]{this});
            return;
        }
        ManualConfig k = hg4.j().k();
        if (!k.isEnable()) {
            this.t = sz9.j(getApplicationContext());
        } else if (sz9.c(getApplicationContext(), k.getSilenceTime())) {
            TLog.loge(yr2.MODULE, "CacheCleanActivity", "startCheckCacheSize: in silence time.");
            this.t = 0L;
        } else {
            this.t = sz9.o(k.getCacheListV2(), this.C) * 1024;
        }
    }

    public final void i4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57cffeb8", new Object[]{this});
            return;
        }
        ManualConfig k = hg4.j().k();
        if (!k.isEnable()) {
            this.u = sz9.l(getApplicationContext());
        } else if (sz9.b(getApplicationContext(), k.getSilenceTime())) {
            TLog.loge(yr2.MODULE, "CacheCleanActivity", "startCheckDataSize: in silence time.");
            this.u = 0L;
        } else {
            this.u = sz9.o(k.getDataListV2(), this.C) * 1024;
        }
    }

    public final void j4(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f234237f", new Object[]{this, fVar});
            return;
        }
        Context applicationContext = getApplicationContext();
        this.q = vs3.f(applicationContext) * 1024;
        this.r = this.q - (vs3.e(applicationContext) * 1024);
        if (hg4.j().k().isEnable()) {
            new ey1(applicationContext).d(new b(fVar));
            return;
        }
        this.s = sz9.i(applicationContext);
        ((e.a) fVar).a();
    }

    public final void k4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad6d9d4b", new Object[]{this});
            return;
        }
        this.p = 0;
        f4();
        this.z.set(true);
        T3();
        S3();
        l4();
        m4();
    }

    public final void l4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9591a01", new Object[]{this});
            return;
        }
        Handler handler = new Handler();
        this.o = handler;
        handler.post(new a());
    }

    @Override // com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_cache);
        getSupportActionBar().setTitle(R.string.cache_page_title);
        a4();
        ((ArrayList) this.A).add(0);
        ((ArrayList) this.A).add(1);
        ((ArrayList) this.A).add(2);
        ((ArrayList) this.A).add(3);
        ((ArrayList) this.A).add(4);
        hg4.j().n();
        if (this.z.compareAndSet(false, true)) {
            k4();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        try {
            b4("all", this.x, this.y, this.w);
            T3();
            S3();
        } catch (Exception e2) {
            TLog.loge(yr2.MODULE, "CacheCleanActivity", "onDestroy error=" + e2);
        }
    }

    public final void m4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("476526e8", new Object[]{this});
            return;
        }
        TLog.loge(yr2.MODULE, "CacheCleanActivity", "startNextStep");
        int indexOf = ((ArrayList) this.A).indexOf(Integer.valueOf(this.p)) + 1;
        if (indexOf < ((ArrayList) this.A).size()) {
            this.p = ((Integer) ((ArrayList) this.A).get(indexOf)).intValue();
            Y3().post(new e(this.p));
            return;
        }
        runOnUiThread(new xr2(this));
    }

    public final void e4(String str, long j, long j2, long j3, long j4, long j5, long j6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d35eb9c", new Object[]{this, str, new Long(j), new Long(j2), new Long(j3), new Long(j4), new Long(j5), new Long(j6)});
            return;
        }
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("user_cache_clean_calculate_v2");
        uTHitBuilders$UTCustomHitBuilder.setEventPage("cache_manager");
        if (str.equals("calculate")) {
            uTHitBuilders$UTCustomHitBuilder.setProperty("appSize", String.valueOf(j / 1024));
            uTHitBuilders$UTCustomHitBuilder.setProperty("deviceSize", String.valueOf(j2 / 1024));
            uTHitBuilders$UTCustomHitBuilder.setProperty("useSize", String.valueOf(j3 / 1024));
            uTHitBuilders$UTCustomHitBuilder.setProperty("cacheSize", String.valueOf(j4 / 1024));
            uTHitBuilders$UTCustomHitBuilder.setProperty("dataSize", String.valueOf(j5 / 1024));
            uTHitBuilders$UTCustomHitBuilder.setProperty("importantSize", String.valueOf(j6 / 1024));
        }
        uTHitBuilders$UTCustomHitBuilder.setProperty("type", str);
        uTHitBuilders$UTCustomHitBuilder.setProperty("cacheSessionId", "CacheCleanActivity");
        if (hg4.j().k().isEnable()) {
            uTHitBuilders$UTCustomHitBuilder.setProperty("engine", "quota");
        } else {
            uTHitBuilders$UTCustomHitBuilder.setProperty("engine", "old");
        }
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
    }
}
