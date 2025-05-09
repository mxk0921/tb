package tb;

import android.util.Log;
import com.alibaba.android.umbrella.link.TLogger;
import com.alibaba.android.umbrella.link.export.UMDimKey;
import com.alibaba.android.umbrella.link.export.UmTypeKey;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.prg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class mrg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final nrg f24251a = new nrg();
    public final prg b = new prg();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends prg.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String f;
        public final /* synthetic */ String g;
        public final /* synthetic */ String h;
        public final /* synthetic */ String i;
        public final /* synthetic */ krg j;

        public a(String str, String str2, String str3, String str4, krg krgVar) {
            this.f = str;
            this.g = str2;
            this.h = str3;
            this.i = str4;
            this.j = krgVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umbrella/link/LinkLogManager$1");
        }

        @Override // tb.prg.b
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25ca0f44", new Object[]{this});
                return;
            }
            a(d71.POINT_LOG, this.f, this.g, this.h, this.i);
            TLogger.c(this.j);
        }
    }

    public ayu a(String str, String str2, String str3, ayu ayuVar, int i, String str4, String str5, Map<UMDimKey, Object> map, lrg lrgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ayu) ipChange.ipc$dispatch("a421dab7", new Object[]{this, str, str2, str3, ayuVar, new Integer(i), str4, str5, map, lrgVar});
        }
        if (this.f24251a.i(str, str2, str3, str4)) {
            return null;
        }
        krg b = b(str, str2, str3, ayuVar, i, str4, str5, map, lrgVar);
        i(b);
        return b.m();
    }

    public final krg b(String str, String str2, String str3, ayu ayuVar, int i, String str4, String str5, Map<UMDimKey, Object> map, lrg lrgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (krg) ipChange.ipc$dispatch("a890ee34", new Object[]{this, str, str2, str3, ayuVar, new Integer(i), str4, str5, map, lrgVar});
        }
        krg t = new krg().q(str, str2).u(str3).w(!byu.a(str4) ? 1 : 0).x(i).s(str4, str5).r(map).t(lrgVar);
        if (ayuVar == null) {
            ayuVar = new ayu(wxu.a(""));
        }
        return t.z(ayuVar).v(wxu.b()).y(zxu.d()).A(zxu.e()).B(zxu.f(str));
    }

    public nrg c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nrg) ipChange.ipc$dispatch("33a01bed", new Object[]{this});
        }
        return this.f24251a;
    }

    public final void d(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aaaed34", new Object[]{this, str, str2, str3, str4});
        } else if (this.f24251a.d() && !byu.a(str4)) {
            Log.e("umbrella2", str + ", mainBizName=" + str2 + " featureType=" + str3 + " errorCode=" + str4);
        }
    }

    public final String e(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f819165f", new Object[]{this, str, str2, str3, str4});
        }
        return this.f24251a.e(str, str2, str3) ? "umbrella2" : str4;
    }

    public void g(String str, String str2, UmTypeKey umTypeKey, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f1699b5", new Object[]{this, str, str2, umTypeKey, str3, str4});
        } else if (this.f24251a.c()) {
            d71.b(str, str2, umTypeKey, str3, str4);
            d("triggerCommitFeedback", str, umTypeKey.getKey(), str3);
        }
    }

    public void h(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2a97538", new Object[]{this, str, str2, str3, str4, str5, map});
        } else if (!this.f24251a.h(str4, str5, str, "")) {
            d71.d(str, str2, e(str4, str5, str, str3), str4, str5, map);
            d("triggerCommitSuccess", str4, str, "");
        }
    }

    public final void i(krg krgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c02bc889", new Object[]{this, krgVar});
        } else if (krgVar.m() != null) {
            String k = krgVar.k();
            String a2 = krgVar.a();
            String f = krgVar.f();
            String c = krgVar.c();
            this.b.b(new a(k, a2, f, c, krgVar));
            d("triggerLogEntity", k, f, c);
        }
    }

    public void f(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89854ba5", new Object[]{this, str, str2, str3, str4, str5, map, str6, str7});
        } else if (!this.f24251a.h(str4, str5, str, str6) && !odv.b(str6)) {
            HashMap hashMap = new HashMap();
            hashMap.put("Umbrella_Diagnose_Type", "0");
            hashMap.put("Umbrella_Diagnose_ErrorCode", str6);
            nzb.b().d(str4, hashMap);
            d71.a(str, str2, e(str4, str5, str, str3), str4, str5, map, str6, str7);
            d("triggerCommitFailure", str4, str, str6);
        }
    }
}
