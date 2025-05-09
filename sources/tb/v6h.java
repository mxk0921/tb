package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class v6h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UM_LOADING_TYPE_ERROR = "error";
    public static final String UM_LOADING_TYPE_LOADING = "loading";
    public static final String UM_LOADING_TYPE_NONE = "none";

    /* renamed from: a  reason: collision with root package name */
    public a f29809a;
    public boolean b = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f29810a;
        public final int b;
        public final String e;
        public long d = 0;
        public final long c = SystemClock.uptimeMillis();

        static {
            t2o.a(491782549);
        }

        public a(int i, int i2, String str) {
            this.f29810a = i;
            this.b = i2;
            this.e = str;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            } else {
                this.d = SystemClock.uptimeMillis();
            }
        }

        public long b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6277c33e", new Object[]{this})).longValue();
            }
            long j = this.d - this.c;
            if (j < 0) {
                return 0L;
            }
            return j;
        }

        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("49bb1d99", new Object[]{this});
            }
            return this.e;
        }

        public int d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1cfa4a3b", new Object[]{this})).intValue();
            }
            return this.f29810a;
        }

        public int e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("62e7f399", new Object[]{this})).intValue();
            }
            return this.b;
        }
    }

    static {
        t2o.a(491782548);
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73d299f1", new Object[]{this, map});
            return;
        }
        Map<String, Object> a2 = d0b.a();
        if (!(a2 == null || a2.isEmpty())) {
            for (String str : a2.keySet()) {
                Object obj = a2.get(str);
                if (obj != null) {
                    map.put(str, obj.toString());
                }
            }
        }
    }

    public final void b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1de2f09e", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        a aVar = this.f29809a;
        if (aVar != null) {
            if (!TextUtils.equals(aVar.c(), "error")) {
                e();
            } else {
                return;
            }
        }
        this.f29809a = new a(i, i2, "error");
    }

    public final void c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b9da52", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.f29809a == null) {
            this.f29809a = new a(i, i2, "loading");
        }
    }

    public void d(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aeba03a", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.b) {
            c(i, i2);
        } else {
            b(i, i2);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6a2a9fa", new Object[]{this});
            return;
        }
        a aVar = this.f29809a;
        if (aVar != null) {
            aVar.a();
            HashMap hashMap = new HashMap(16);
            hashMap.put("index", String.valueOf(this.f29809a.e()));
            hashMap.put("pageNum", String.valueOf(this.f29809a.d()));
            hashMap.put("stay_time", String.valueOf(this.f29809a.b()));
            hashMap.put("loadingType", this.f29809a.c());
            hashMap.put("frameworkType", "infoflow");
            a(hashMap);
            hdv.a().commitSuccess("Smart_Loading", "loadingView_stay_time", "1.0", "PageHomeCommitTracker_Loading", "PageHomeCommitTracker_Loading_Legacy", hashMap);
            this.f29809a = null;
        }
    }

    public void f(IUiRefreshActionModel iUiRefreshActionModel) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15eda199", new Object[]{this, iUiRefreshActionModel});
        } else if (TextUtils.equals(iUiRefreshActionModel.getRequestType(), "scrollNextPage")) {
            boolean isEmpty = TextUtils.isEmpty(iUiRefreshActionModel.getDataChangeType());
            this.b = true ^ isEmpty;
            if (isEmpty && (aVar = this.f29809a) != null) {
                b(aVar.d(), this.f29809a.e());
            }
        }
    }
}
