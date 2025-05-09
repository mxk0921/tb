package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class suf {

    /* renamed from: a  reason: collision with root package name */
    public static final u1r f28281a = new u1r("COMPLETING_ALREADY");
    public static final u1r COMPLETING_WAITING_CHILDREN = new u1r("COMPLETING_WAITING_CHILDREN");
    public static final u1r b = new u1r("COMPLETING_RETRY");
    public static final u1r c = new u1r("TOO_LATE_TO_CANCEL");
    public static final u1r d = new u1r("SEALED");
    public static final ic8 e = new ic8(false);
    public static final ic8 f = new ic8(true);

    public static final Object a(Object obj) {
        if (obj instanceof yse) {
            return new zse((yse) obj);
        }
        return obj;
    }

    public static final Object b(Object obj) {
        zse zseVar;
        yse yseVar;
        if (obj instanceof zse) {
            zseVar = (zse) obj;
        } else {
            zseVar = null;
        }
        if (zseVar == null || (yseVar = zseVar.f32990a) == null) {
            return obj;
        }
        return yseVar;
    }
}
