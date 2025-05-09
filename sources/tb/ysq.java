package tb;

import java.util.NoSuchElementException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ysq extends xsq {
    public static String T0(String str, int i) {
        ckf.g(str, "<this>");
        if (i >= 0) {
            String substring = str.substring(hfn.f(i, str.length()));
            ckf.f(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    public static String U0(String str, int i) {
        ckf.g(str, "<this>");
        if (i >= 0) {
            return X0(str, hfn.c(str.length() - i, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    public static char V0(CharSequence charSequence) {
        ckf.g(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static char W0(CharSequence charSequence) {
        ckf.g(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(wsq.S(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static String X0(String str, int i) {
        ckf.g(str, "<this>");
        if (i >= 0) {
            String substring = str.substring(0, hfn.f(i, str.length()));
            ckf.f(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }
}
