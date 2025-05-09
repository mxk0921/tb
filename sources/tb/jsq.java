package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class jsq {
    public static <T> void a(Appendable appendable, T t, g1a<? super T, ? extends CharSequence> g1aVar) {
        boolean z;
        ckf.g(appendable, "<this>");
        if (g1aVar != null) {
            appendable.append((CharSequence) g1aVar.invoke(t));
            return;
        }
        if (t == null) {
            z = true;
        } else {
            z = t instanceof CharSequence;
        }
        if (z) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(t.toString());
        }
    }
}
