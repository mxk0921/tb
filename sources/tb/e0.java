package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.PltMnnBucketManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class e0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static a f18188a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface a {
    }

    static {
        t2o.a(481296409);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("136c87ee", new Object[]{str});
        }
        String c = PltMnnBucketManager.Companion.a().c();
        if (TextUtils.isEmpty(str)) {
            return c;
        }
        if (TextUtils.isEmpty(c)) {
            return str;
        }
        return str + "," + c;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99aab474", new Object[0]);
        }
        return a(lg4.E1());
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("841ff7b4", new Object[]{str});
        }
        a aVar = f18188a;
        if (aVar == null) {
            return "";
        }
        return ((tts$e) aVar).a(str);
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4afea14", new Object[]{str});
        }
        a aVar = f18188a;
        if (aVar == null) {
            return "";
        }
        return ((tts$e) aVar).b(str);
    }

    public static String e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a5f588a", new Object[]{str, str2});
        }
        String d = d(str);
        if (TextUtils.isEmpty(d)) {
            return str2;
        }
        return d;
    }

    public static void f(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9816d03", new Object[]{aVar});
        } else {
            f18188a = aVar;
        }
    }
}
