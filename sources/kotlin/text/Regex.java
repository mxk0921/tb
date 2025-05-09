package kotlin.text;

import com.taobao.search.sf.util.tlog.TLogTracker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.text.Regex;
import tb.a07;
import tb.acp;
import tb.ckf;
import tb.d04;
import tb.d1a;
import tb.g1a;
import tb.g6i;
import tb.gvn;
import tb.h1p;
import tb.h6i;
import tb.hfn;
import tb.sbp;
import tb.wbp;
import tb.wsq;
import tb.xz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0011\u0018\u0000 =2\u00060\u0001j\u0002`\u0002:\u0002>?B\u0011\b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fB\u001f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u0005\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0086\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0017J!\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001e2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b!\u0010\"J!\u0010$\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0019H\u0007¢\u0006\u0004\b$\u0010\u001dJ\u001f\u0010%\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0019H\u0007¢\u0006\u0004\b%\u0010&J\u001d\u0010(\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0007¢\u0006\u0004\b(\u0010)J)\u0010(\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00130*¢\u0006\u0004\b(\u0010,J\u001d\u0010-\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0007¢\u0006\u0004\b-\u0010)J%\u00100\u001a\b\u0012\u0004\u0012\u00020\u00070/2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010.\u001a\u00020\u0019¢\u0006\u0004\b0\u00101J'\u00102\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010.\u001a\u00020\u0019H\u0007¢\u0006\u0004\b2\u0010 J\u000f\u00103\u001a\u00020\u0007H\u0016¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u0003¢\u0006\u0004\b5\u00106R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00107R\u001e\u00108\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0011\u0010\b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b:\u00104R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r8F¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006@"}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Ljava/util/regex/Pattern;", "nativePattern", "<init>", "(Ljava/util/regex/Pattern;)V", "", "pattern", "(Ljava/lang/String;)V", "Lkotlin/text/RegexOption;", "option", "(Ljava/lang/String;Lkotlin/text/RegexOption;)V", "", "options", "(Ljava/lang/String;Ljava/util/Set;)V", "", "writeReplace", "()Ljava/lang/Object;", "", "input", "", "matches", "(Ljava/lang/CharSequence;)Z", "containsMatchIn", "", h1p.a.PARAM_KEY_LIST_START_INDEX, "Ltb/g6i;", "find", "(Ljava/lang/CharSequence;I)Ltb/g6i;", "Ltb/sbp;", "findAll", "(Ljava/lang/CharSequence;I)Ltb/sbp;", "matchEntire", "(Ljava/lang/CharSequence;)Ltb/g6i;", "index", "matchAt", "matchesAt", "(Ljava/lang/CharSequence;I)Z", "replacement", "replace", "(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/Function1;", "transform", "(Ljava/lang/CharSequence;Ltb/g1a;)Ljava/lang/String;", "replaceFirst", "limit", "", "split", "(Ljava/lang/CharSequence;I)Ljava/util/List;", "splitToSequence", "toString", "()Ljava/lang/String;", "toPattern", "()Ljava/util/regex/Pattern;", "Ljava/util/regex/Pattern;", "_options", "Ljava/util/Set;", "getPattern", "getOptions", "()Ljava/util/Set;", "Companion", "Serialized", "a", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class Regex implements Serializable {
    public static final a Companion = new a(null);
    private Set<? extends RegexOption> _options;
    private final Pattern nativePattern;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0002\u0018\u0000 \u00122\u00060\u0001j\u0002`\u0002:\u0001\u0013B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lkotlin/text/Regex$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "pattern", "", "flags", "<init>", "(Ljava/lang/String;I)V", "", "readResolve", "()Ljava/lang/Object;", "Ljava/lang/String;", "getPattern", "()Ljava/lang/String;", TLogTracker.LEVEL_INFO, "getFlags", "()I", "Companion", "a", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class Serialized implements Serializable {
        public static final a Companion = new a(null);
        private static final long serialVersionUID = 0;
        private final int flags;
        private final String pattern;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public static final class a {
            public /* synthetic */ a(a07 a07Var) {
                this();
            }

            public a() {
            }
        }

        public Serialized(String str, int i) {
            ckf.g(str, "pattern");
            this.pattern = str;
            this.flags = i;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.pattern, this.flags);
            ckf.f(compile, "compile(...)");
            return new Regex(compile);
        }

        public final int getFlags() {
            return this.flags;
        }

        public final String getPattern() {
            return this.pattern;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {
        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final int b(int i) {
            if ((i & 2) != 0) {
                return i | 64;
            }
            return i;
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class b implements g1a<RegexOption, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f15246a;

        public b(int i) {
            this.f15246a = i;
        }

        /* renamed from: a */
        public final Boolean invoke(RegexOption regexOption) {
            boolean z;
            RegexOption regexOption2 = regexOption;
            if ((regexOption2.getMask() & this.f15246a) == regexOption2.getValue()) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public Regex(Pattern pattern) {
        ckf.g(pattern, "nativePattern");
        this.nativePattern = pattern;
    }

    public static /* synthetic */ g6i find$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.find(charSequence, i);
    }

    public static /* synthetic */ sbp findAll$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.findAll(charSequence, i);
    }

    public static /* synthetic */ List split$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.split(charSequence, i);
    }

    public static /* synthetic */ sbp splitToSequence$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.splitToSequence(charSequence, i);
    }

    private final Object writeReplace() {
        String pattern = this.nativePattern.pattern();
        ckf.f(pattern, "pattern(...)");
        return new Serialized(pattern, this.nativePattern.flags());
    }

    public final boolean containsMatchIn(CharSequence charSequence) {
        ckf.g(charSequence, "input");
        return this.nativePattern.matcher(charSequence).find();
    }

    public final g6i find(CharSequence charSequence, int i) {
        ckf.g(charSequence, "input");
        Matcher matcher = this.nativePattern.matcher(charSequence);
        ckf.f(matcher, "matcher(...)");
        return gvn.a(matcher, i, charSequence);
    }

    public final sbp<g6i> findAll(final CharSequence charSequence, final int i) {
        ckf.g(charSequence, "input");
        if (i >= 0 && i <= charSequence.length()) {
            return acp.h(new d1a() { // from class: tb.fvn
                @Override // tb.d1a
                public final Object invoke() {
                    g6i find;
                    find = Regex.this.find(charSequence, i);
                    return find;
                }
            }, Regex$findAll$2.INSTANCE);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i + ", input length: " + charSequence.length());
    }

    public final Set<RegexOption> getOptions() {
        Set set = this._options;
        if (set != null) {
            return set;
        }
        int flags = this.nativePattern.flags();
        EnumSet allOf = EnumSet.allOf(RegexOption.class);
        ckf.d(allOf);
        d04.E(allOf, new b(flags));
        Set<RegexOption> unmodifiableSet = Collections.unmodifiableSet(allOf);
        ckf.f(unmodifiableSet, "unmodifiableSet(...)");
        this._options = unmodifiableSet;
        return unmodifiableSet;
    }

    public final String getPattern() {
        String pattern = this.nativePattern.pattern();
        ckf.f(pattern, "pattern(...)");
        return pattern;
    }

    public final g6i matchAt(CharSequence charSequence, int i) {
        ckf.g(charSequence, "input");
        Matcher region = this.nativePattern.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i, charSequence.length());
        if (region.lookingAt()) {
            return new h6i(region, charSequence);
        }
        return null;
    }

    public final g6i matchEntire(CharSequence charSequence) {
        ckf.g(charSequence, "input");
        Matcher matcher = this.nativePattern.matcher(charSequence);
        ckf.f(matcher, "matcher(...)");
        return gvn.b(matcher, charSequence);
    }

    public final boolean matches(CharSequence charSequence) {
        ckf.g(charSequence, "input");
        return this.nativePattern.matcher(charSequence).matches();
    }

    public final boolean matchesAt(CharSequence charSequence, int i) {
        ckf.g(charSequence, "input");
        return this.nativePattern.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i, charSequence.length()).lookingAt();
    }

    public final String replace(CharSequence charSequence, String str) {
        ckf.g(charSequence, "input");
        ckf.g(str, "replacement");
        String replaceAll = this.nativePattern.matcher(charSequence).replaceAll(str);
        ckf.f(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final String replaceFirst(CharSequence charSequence, String str) {
        ckf.g(charSequence, "input");
        ckf.g(str, "replacement");
        String replaceFirst = this.nativePattern.matcher(charSequence).replaceFirst(str);
        ckf.f(replaceFirst, "replaceFirst(...)");
        return replaceFirst;
    }

    public final List<String> split(CharSequence charSequence, int i) {
        ckf.g(charSequence, "input");
        wsq.u0(i);
        Matcher matcher = this.nativePattern.matcher(charSequence);
        if (i == 1 || !matcher.find()) {
            return xz3.e(charSequence.toString());
        }
        int i2 = 10;
        if (i > 0) {
            i2 = hfn.f(i, 10);
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = i - 1;
        int i4 = 0;
        do {
            arrayList.add(charSequence.subSequence(i4, matcher.start()).toString());
            i4 = matcher.end();
            if (i3 >= 0 && arrayList.size() == i3) {
                break;
            }
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(i4, charSequence.length()).toString());
        return arrayList;
    }

    public final sbp<String> splitToSequence(CharSequence charSequence, int i) {
        ckf.g(charSequence, "input");
        wsq.u0(i);
        return wbp.b(new Regex$splitToSequence$1(this, charSequence, i, null));
    }

    public final Pattern toPattern() {
        return this.nativePattern;
    }

    public String toString() {
        String pattern = this.nativePattern.toString();
        ckf.f(pattern, "toString(...)");
        return pattern;
    }

    public final String replace(CharSequence charSequence, g1a<? super g6i, ? extends CharSequence> g1aVar) {
        ckf.g(charSequence, "input");
        ckf.g(g1aVar, "transform");
        int i = 0;
        g6i find$default = find$default(this, charSequence, 0, 2, null);
        if (find$default == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(charSequence, i, find$default.c().getStart().intValue());
            sb.append((CharSequence) g1aVar.invoke(find$default));
            i = find$default.c().getEndInclusive().intValue() + 1;
            find$default = find$default.next();
            if (i >= length) {
                break;
            }
        } while (find$default != null);
        if (i < length) {
            sb.append(charSequence, i, length);
        }
        String sb2 = sb.toString();
        ckf.f(sb2, "toString(...)");
        return sb2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Regex(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            tb.ckf.g(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(...)"
            tb.ckf.f(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Regex(java.lang.String r2, kotlin.text.RegexOption r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            tb.ckf.g(r2, r0)
            java.lang.String r0 = "option"
            tb.ckf.g(r3, r0)
            kotlin.text.Regex$a r0 = kotlin.text.Regex.Companion
            int r3 = r3.getValue()
            int r3 = kotlin.text.Regex.a.a(r0, r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(...)"
            tb.ckf.f(r2, r3)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String, kotlin.text.RegexOption):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Regex(java.lang.String r2, java.util.Set<? extends kotlin.text.RegexOption> r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            tb.ckf.g(r2, r0)
            java.lang.String r0 = "options"
            tb.ckf.g(r3, r0)
            kotlin.text.Regex$a r0 = kotlin.text.Regex.Companion
            int r3 = tb.gvn.e(r3)
            int r3 = kotlin.text.Regex.a.a(r0, r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(...)"
            tb.ckf.f(r2, r3)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String, java.util.Set):void");
    }
}
