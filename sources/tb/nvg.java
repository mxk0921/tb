package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.OnFileCreatedListener;
import java.io.File;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class nvg implements OnFileCreatedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final x0s f24976a;
    public final koq b;

    public nvg(x0s x0sVar, koq koqVar) {
        this.f24976a = x0sVar;
        this.b = koqVar;
    }

    public final void a() throws RuntimeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d4e9735", new Object[]{this});
            return;
        }
        ehh.b("LiteSafeExtra", "cleanFiles");
        new xs3(this.f24976a.g()).a();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        try {
            File file = new File(this.f24976a.g().getFilesDir(), "LiteSafe.db");
            if (file.exists()) {
                ehh.b("LiteSafeExtra", pg1.ATOM_EXT_clear);
                file.delete();
            }
        } catch (Throwable th) {
            ehh.d(th);
        }
    }

    public final int c() throws RuntimeException {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a38d4fc8", new Object[]{this})).intValue();
        }
        File file = new File(this.f24976a.g().getFilesDir(), "LiteSafe.db");
        mb9 a2 = mb9.a();
        Map<String, String> b = a2.b(file);
        String str2 = b.get("HisLiteSafeCnt");
        if (str2 == null) {
            str = "1";
        } else {
            str = String.valueOf(Integer.parseInt(str2) + 1);
        }
        b.put("HisLiteSafeCnt", str);
        a2.c(b, file);
        return Integer.parseInt(str);
    }

    @Override // com.taobao.android.tcrash.OnFileCreatedListener
    public void onFileCreated(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8cac13e", new Object[]{this, str});
            return;
        }
        i1r a2 = o1r.a(this.f24976a.g());
        if (a2.b("OpenLitSafe", this.b.defaultValue())) {
            if (str.endsWith("jni.log") || str.endsWith("java.log") || str.endsWith("native.log")) {
                try {
                    ehh.b("LiteSafeExtra", "lite safe clean");
                    if (c() > a2.a("LiteSafeCnt", 1)) {
                        l1s.c().a("", "clean", str);
                        a();
                        b();
                    }
                } catch (Throwable th) {
                    ehh.d(th);
                }
            }
        }
    }
}
