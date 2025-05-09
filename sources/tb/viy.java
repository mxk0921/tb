package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final /* synthetic */ class viy {
    public static /* synthetic */ String a(CharSequence charSequence, CharSequence[] charSequenceArr) {
        if (charSequence != null) {
            StringBuilder sb = new StringBuilder();
            if (charSequenceArr.length > 0) {
                sb.append(charSequenceArr[0]);
                for (int i = 1; i < charSequenceArr.length; i++) {
                    sb.append(charSequence);
                    sb.append(charSequenceArr[i]);
                }
            }
            return sb.toString();
        }
        throw new NullPointerException("delimiter");
    }
}
