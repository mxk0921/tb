package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class uk8 {

    /* renamed from: a  reason: collision with root package name */
    public static final u1r f29432a = new u1r("REMOVED_TASK");
    public static final u1r b = new u1r("CLOSED_EMPTY");

    public static final long a(long j) {
        return j / 1000000;
    }

    public static final long b(long j) {
        if (j <= 0) {
            return 0L;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j;
    }
}
