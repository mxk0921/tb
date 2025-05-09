package tb;

import com.taobao.monitor.adapter.AbsAPMInitiator;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class lq6 {

    /* renamed from: a  reason: collision with root package name */
    public re2 f23508a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b {
        public static final lq6 sInstance = new lq6();
    }

    public static final lq6 a() {
        return b.sInstance;
    }

    public void b(re2 re2Var) {
        if (this.f23508a == null) {
            this.f23508a = re2Var;
        }
    }

    public void c(String str, String str2) {
        d(str, str2, System.currentTimeMillis());
    }

    public void d(String str, String str2, long j) {
        re2 re2Var = this.f23508a;
        if (re2Var != null) {
            ((AbsAPMInitiator.c) re2Var).b(str, str2, j);
        }
    }

    public void e(String str, HashMap<String, String> hashMap) {
        re2 re2Var = this.f23508a;
        if (re2Var != null) {
            ((AbsAPMInitiator.c) re2Var).c(str, hashMap);
        }
    }

    public void f(String str, HashMap<String, String> hashMap) {
        re2 re2Var = this.f23508a;
        if (re2Var != null) {
            ((AbsAPMInitiator.c) re2Var).d(str, hashMap);
        }
    }

    public void g(String str, String str2) {
        re2 re2Var = this.f23508a;
        if (re2Var != null) {
            ((AbsAPMInitiator.c) re2Var).e(str, str2);
        }
    }

    public lq6() {
    }
}
