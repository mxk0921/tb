package tb;

import android.text.TextUtils;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import tb.hgb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class kmr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAOLIVE_ONLINE_LIVE_ID = "id=200518454785";
    public static kmr b;

    /* renamed from: a  reason: collision with root package name */
    public hgb.a f22768a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements ISmallWindowStrategy {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(kmr kmrVar) {
        }

        @Override // com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy
        public void onSmallWindowClick(View view, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("265e0e99", new Object[]{this, view, str, str2, str3});
                return;
            }
            if (!TextUtils.isEmpty(str) && pvs.D1()) {
                str = str.replace(kmr.TAOLIVE_ONLINE_LIVE_ID, "id=" + pvs.A2());
            }
            if (TextUtils.isEmpty(str)) {
                str = u90.e(str2);
            }
            voj.b(view.getContext(), str, null, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements hgb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.hgb
        public void a(hgb.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("174fdd40", new Object[]{this, aVar});
                return;
            }
            kmr.b(kmr.this, aVar);
            v2s.o().f().a(kmr.a(kmr.this));
        }
    }

    static {
        t2o.a(779093368);
    }

    public static /* synthetic */ hgb.a a(kmr kmrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hgb.a) ipChange.ipc$dispatch("af5cf588", new Object[]{kmrVar});
        }
        return kmrVar.f22768a;
    }

    public static /* synthetic */ hgb.a b(kmr kmrVar, hgb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hgb.a) ipChange.ipc$dispatch("2121974e", new Object[]{kmrVar, aVar});
        }
        kmrVar.f22768a = aVar;
        return aVar;
    }

    public static kmr d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmr) ipChange.ipc$dispatch("cd372093", new Object[0]);
        }
        if (b == null) {
            b = new kmr();
        }
        return b;
    }

    public static boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6394cfd", new Object[]{str})).booleanValue();
        }
        if (!TAOLIVE_ONLINE_LIVE_ID.equals("id=" + str)) {
            if (!"id=219181588018".equals("id=" + str)) {
                return false;
            }
        }
        return true;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        v2s.o().f().b(this.f22768a);
        imr.b().e();
        this.f22768a = null;
        b = null;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        imr.b().h(v2s.o().f().getApplication(), "TAOBAO");
        imr.b().g(new a(this));
        imr.b().f(new b());
        if (gq0.j() != null) {
            gq0.j().a();
        }
    }
}
