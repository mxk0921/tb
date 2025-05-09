package tb;

import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class xmm implements s5c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public jcq f31473a;
    public final String b;

    public xmm(String str) {
        this.b = str;
    }

    @Override // tb.s5c
    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4723202a", new Object[]{this, str});
        }
        jcq jcqVar = this.f31473a;
        if (jcqVar == null) {
            return null;
        }
        String n = jcqVar.n();
        if (n.contains("-")) {
            return n.split("-")[0];
        }
        return null;
    }

    @Override // tb.s5c
    public boolean c(String str) {
        File b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fefed0e", new Object[]{this, str})).booleanValue();
        }
        try {
            if (!n1r.D(bcq.a().e().j(), str) && (b = bcq.a().e().l().b(this.b)) != null && b.exists()) {
                jcq jcqVar = new jcq(bcq.a().e().j(), true, b.getName(), false);
                this.f31473a = jcqVar;
                return jcqVar.E(str).exists();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override // tb.s5c
    public boolean b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acc95f1c", new Object[]{this, context, str, str2})).booleanValue();
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Log.e("FeatureSourceStrategy", "installPreloadFeature:" + str);
            if (bcq.a().d(context, true, this.f31473a, str) && mcq.a() != null && mcq.a().a().contains(str)) {
                ddq.a().b(str, "preload");
                ((jvc) d62.a(jvc.class, new Object[0])).b(str, true, "install_preload_" + this.f31473a.n(), System.currentTimeMillis() - currentTimeMillis, 0, "", this.f31473a.m());
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
