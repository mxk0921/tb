package tb;

import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class mu9 {

    /* renamed from: a  reason: collision with root package name */
    public final List<khp> f24314a;
    public final char b;
    public final double c;
    public final String d;
    public final String e;

    public mu9(List<khp> list, char c, double d, double d2, String str, String str2) {
        this.f24314a = list;
        this.b = c;
        this.c = d2;
        this.d = str;
        this.e = str2;
    }

    public static int c(char c, String str, String str2) {
        return (((c * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List<khp> a() {
        return this.f24314a;
    }

    public double b() {
        return this.c;
    }

    public int hashCode() {
        return c(this.b, this.e, this.d);
    }
}
