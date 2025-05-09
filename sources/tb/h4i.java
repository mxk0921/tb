package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class h4i {

    /* renamed from: a  reason: collision with root package name */
    public final String f20404a;
    public final float b;
    public final float c;

    public h4i(String str, float f, float f2) {
        this.f20404a = str;
        this.c = f2;
        this.b = f;
    }

    public boolean a(String str) {
        String str2 = this.f20404a;
        if (str2.equalsIgnoreCase(str)) {
            return true;
        }
        if (!str2.endsWith("\r") || !str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }
}
