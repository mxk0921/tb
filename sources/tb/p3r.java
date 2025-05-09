package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final /* synthetic */ class p3r {

    /* renamed from: a  reason: collision with root package name */
    public static final int f25860a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f25860a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
