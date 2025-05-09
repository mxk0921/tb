package tb;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class gvn {
    public static final /* synthetic */ g6i a(Matcher matcher, int i, CharSequence charSequence) {
        return f(matcher, i, charSequence);
    }

    public static final /* synthetic */ g6i b(Matcher matcher, CharSequence charSequence) {
        return g(matcher, charSequence);
    }

    public static final /* synthetic */ int e(Iterable iterable) {
        return j(iterable);
    }

    public static final g6i f(Matcher matcher, int i, CharSequence charSequence) {
        if (!matcher.find(i)) {
            return null;
        }
        return new h6i(matcher, charSequence);
    }

    public static final g6i g(Matcher matcher, CharSequence charSequence) {
        if (!matcher.matches()) {
            return null;
        }
        return new h6i(matcher, charSequence);
    }

    public static final aef h(MatchResult matchResult) {
        return hfn.n(matchResult.start(), matchResult.end());
    }

    public static final aef i(MatchResult matchResult, int i) {
        return hfn.n(matchResult.start(i), matchResult.end(i));
    }

    public static final int j(Iterable<? extends mk9> iterable) {
        int i = 0;
        for (mk9 mk9Var : iterable) {
            i |= mk9Var.getValue();
        }
        return i;
    }
}
