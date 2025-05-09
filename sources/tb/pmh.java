package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo;
import com.taobao.tao.log.TLog;
import tb.uem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class pmh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final pmh f26184a = new pmh(null);

        static {
            t2o.a(737148954);
        }

        public static /* synthetic */ pmh a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (pmh) ipChange.ipc$dispatch("e38970eb", new Object[0]);
            }
            return f26184a;
        }
    }

    static {
        t2o.a(737148952);
    }

    public /* synthetic */ pmh(a aVar) {
        this();
    }

    public static /* synthetic */ int a(pmh pmhVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1f9b511", new Object[]{pmhVar, context})).intValue();
        }
        return pmhVar.d(context);
    }

    public static /* synthetic */ void b(pmh pmhVar, Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("853cc004", new Object[]{pmhVar, context, new Integer(i)});
        } else {
            pmhVar.f(context, i);
        }
    }

    public static pmh e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pmh) ipChange.ipc$dispatch("372c7cc5", new Object[0]);
        }
        return b.a();
    }

    public void c(Context context, CacheOverviewInfo cacheOverviewInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4fe6463", new Object[]{this, context, cacheOverviewInfo});
        } else if (!hg4.j().k().isLowStorageEnable()) {
            TLog.loge(yr2.MODULE, "LowStorageManager", "not enable");
        } else if (d(context) > 3) {
            TLog.loge(yr2.MODULE, "LowStorageManager", "close too many");
        } else if (vs3.e(context) / 1024 <= hg4.j().k().getLowStoragePopSys()) {
            g(context, cacheOverviewInfo);
        }
    }

    public final int d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f202a47", new Object[]{this, context})).intValue();
        }
        return context.getSharedPreferences(ey1.CACHE_INFO_SP_NAME, 0).getInt("LowStorageManager", 0);
    }

    public final void f(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5e65256", new Object[]{this, context, new Integer(i)});
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(ey1.CACHE_INFO_SP_NAME, 0).edit();
        edit.putInt("LowStorageManager", i);
        edit.apply();
    }

    public final void g(Context context, CacheOverviewInfo cacheOverviewInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea0a333e", new Object[]{this, context, cacheOverviewInfo});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appSize", (Object) Long.valueOf(cacheOverviewInfo.getTotalSize() / 1024));
        jSONObject.put("totalSize", (Object) Long.valueOf(cacheOverviewInfo.getTotalSize() / 1024));
        jSONObject.put("freeSize", (Object) Long.valueOf(cacheOverviewInfo.getAvailableSize() / 1024));
        uem.m("poplayer://disk_clear_guide", jSONObject.toJSONString()).j(new a(context)).l();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements uem.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f26183a;

        public a(Context context) {
            this.f26183a = context;
        }

        @Override // tb.uem.b
        public void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30005e67", new Object[]{this, str, str2, str3});
            }
        }

        @Override // tb.uem.b
        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("42b06e87", new Object[]{this, str});
            }
        }

        @Override // tb.uem.b
        public void b(String str, boolean z, boolean z2, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e12c310", new Object[]{this, str, new Boolean(z), new Boolean(z2), str2, str3});
            } else if (!z2) {
            } else {
                if (!"OnViewJSClose".equals(str2) || !"handleClose".equals(str3)) {
                    TLog.loge(yr2.MODULE, "LowStorageManager", "user Not close");
                    pmh.b(pmh.this, this.f26183a, 0);
                    return;
                }
                TLog.loge(yr2.MODULE, "LowStorageManager", "userCloseClick");
                pmh pmhVar = pmh.this;
                Context context = this.f26183a;
                pmh.b(pmhVar, context, pmh.a(pmhVar, context) + 1);
            }
        }
    }

    public pmh() {
    }
}
