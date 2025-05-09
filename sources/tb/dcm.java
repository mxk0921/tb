package tb;

import android.content.SharedPreferences;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class dcm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final dcm f17727a = new dcm();

        static {
            t2o.a(625999943);
        }

        public static /* synthetic */ dcm a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (dcm) ipChange.ipc$dispatch("b78ee99d", new Object[0]);
            }
            return f17727a;
        }
    }

    static {
        t2o.a(625999942);
    }

    public static dcm f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dcm) ipChange.ipc$dispatch("2d8b1a58", new Object[0]);
        }
        return a.a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8a68faf", new Object[]{this});
            return;
        }
        try {
            SharedPreferences d = d();
            if (d != null) {
                d.edit().clear().apply();
            }
        } catch (Throwable th) {
            wdm.h("PopCountManager clearPopCounts error.", th);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81a9f8cf", new Object[]{this, str});
            return;
        }
        try {
            SharedPreferences d = d();
            if (d != null) {
                d.edit().putInt(str, -1).apply();
            }
        } catch (Throwable th) {
            wdm.h("PopCountManager finishPop error.", th);
        }
    }

    public int c(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fb89873b", new Object[]{this, str, new Integer(i)})).intValue();
        }
        try {
            SharedPreferences d = d();
            if (d == null) {
                return i;
            }
            return d.getInt(str, i);
        } catch (Throwable th) {
            wdm.h("PopCountManager getPopCountsFor error.", th);
            return i;
        }
    }

    public int e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c35302fa", new Object[]{this, str})).intValue();
        }
        try {
            SharedPreferences d = d();
            if (d == null) {
                return -1;
            }
            int i = d.getInt(str, 0) + 1;
            d.edit().putInt(str, i).apply();
            return i;
        } catch (Throwable th) {
            wdm.h("PopCountManager increasePopCountsFor error.", th);
            return -1;
        }
    }

    public final SharedPreferences d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("75ba1678", new Object[]{this});
        }
        if (PopLayer.getReference() == null || PopLayer.getReference().getApp() == null) {
            return null;
        }
        return PopLayer.getReference().getApp().getSharedPreferences("sp_poplayer_xxx_yyy_zzz", 0);
    }
}
