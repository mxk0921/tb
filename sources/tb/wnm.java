package tb;

import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class wnm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, nei> f30799a;
    public final Map<String, isk> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final wnm f30800a = new wnm();

        static {
            t2o.a(779093132);
        }

        public static /* synthetic */ wnm a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (wnm) ipChange.ipc$dispatch("ecfedc31", new Object[0]);
            }
            return f30800a;
        }
    }

    static {
        t2o.a(779093130);
    }

    public static wnm b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wnm) ipChange.ipc$dispatch("6c827e17", new Object[0]);
        }
        return b.a();
    }

    public final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97ee245", new Object[]{this, str});
        }
        return System.currentTimeMillis() + "_" + str;
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
        } else {
            v2s.o().A().a("PreRequestMediaInfo", str);
        }
    }

    public void d(String str, nei neiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fad52dc", new Object[]{this, str, neiVar});
            return;
        }
        isk iskVar = (isk) ((HashMap) this.b).get(str);
        if (iskVar != null) {
            c("播放信息request 完成，success：" + neiVar.g());
            if (neiVar.g()) {
                iskVar.j2(neiVar);
            } else {
                iskVar.F1();
            }
            ((HashMap) this.b).remove(str);
            return;
        }
        ((HashMap) this.f30799a).put(str, neiVar);
    }

    public String e(Intent intent, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5fa501e9", new Object[]{this, intent, uri});
        }
        if (!orq.a(uri.getQueryParameter("id"))) {
            String queryParameter = uri.getQueryParameter("id");
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("cdnPreRequested", String.valueOf(Boolean.TRUE));
            intent.setData(buildUpon.build());
            String a2 = a(queryParameter);
            new hq2(a2).c(uri);
            return a2;
        } else if (!orq.a(uri.getQueryParameter("id")) || !orq.b(uri.getQueryParameter(yj4.PARAM_NEED_RECOMMEND)) || orq.a(uri.getQueryParameter("livesource"))) {
            return null;
        } else {
            String a3 = a(uri.getQueryParameter("livesource"));
            new fon(a3).b(intent, uri);
            return a3;
        }
    }

    public void f(String str, isk iskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("118c8b67", new Object[]{this, str, iskVar});
            return;
        }
        nei neiVar = (nei) ((HashMap) this.f30799a).get(str);
        if (neiVar != null) {
            c("播放信息预请求已完成，success：" + neiVar.g());
            if (neiVar.g()) {
                iskVar.j2(neiVar);
            } else {
                iskVar.F1();
            }
            ((HashMap) this.f30799a).remove(str);
            return;
        }
        ((HashMap) this.b).put(str, iskVar);
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dfcfa1", new Object[]{this, str});
        } else {
            ((HashMap) this.b).remove(str);
        }
    }

    public wnm() {
        this.f30799a = new HashMap();
        this.b = new HashMap();
    }
}
