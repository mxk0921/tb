package tb;

import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class vao {

    /* renamed from: a  reason: collision with root package name */
    public int f29896a;
    public String b;
    public HashMap<String, String> c;

    static {
        t2o.a(253755423);
    }

    public int a() {
        return this.f29896a;
    }

    public HashMap<String, String> b() {
        return this.c;
    }

    public String c() {
        return this.b;
    }

    public void d(int i) {
        this.f29896a = i;
    }

    public void e(HashMap<String, String> hashMap) {
        this.c = hashMap;
    }

    public void f(String str) {
        this.b = str;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Result{code='");
        sb.append(this.f29896a);
        sb.append("', message='");
        sb.append(this.b);
        sb.append("', item='");
        HashMap<String, String> hashMap = this.c;
        if (hashMap != null) {
            str = hashMap.toString();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }
}
