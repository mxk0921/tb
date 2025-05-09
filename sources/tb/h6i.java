package tb;

import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import tb.h6i;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class h6i implements g6i {

    /* renamed from: a  reason: collision with root package name */
    public final Matcher f20436a;
    public final CharSequence b;
    public final e6i c = new b();
    public List<String> d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a extends c20<String> {
        public a() {
        }

        public /* bridge */ boolean c(String str) {
            return super.contains(str);
        }

        @Override // tb.n00, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return c((String) obj);
        }

        /* renamed from: d */
        public String get(int i) {
            String group = ((Matcher) h6i.this.e()).group(i);
            if (group == null) {
                return "";
            }
            return group;
        }

        public /* bridge */ int e(String str) {
            return super.indexOf(str);
        }

        public /* bridge */ int f(String str) {
            return super.lastIndexOf(str);
        }

        @Override // tb.c20, tb.n00
        public int getSize() {
            return ((Matcher) h6i.this.e()).groupCount() + 1;
        }

        @Override // tb.c20, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return e((String) obj);
        }

        @Override // tb.c20, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return f((String) obj);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class b extends n00<d6i> implements e6i {
        public b() {
        }

        public static final d6i f(b bVar, int i) {
            return bVar.e(i);
        }

        @Override // tb.n00, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            boolean z;
            if (obj == null) {
                z = true;
            } else {
                z = obj instanceof d6i;
            }
            if (!z) {
                return false;
            }
            return d((d6i) obj);
        }

        public /* bridge */ boolean d(d6i d6iVar) {
            return super.contains(d6iVar);
        }

        public d6i e(int i) {
            aef i2;
            h6i h6iVar = h6i.this;
            i2 = gvn.i(h6iVar.e(), i);
            if (i2.getStart().intValue() < 0) {
                return null;
            }
            String group = ((Matcher) h6iVar.e()).group(i);
            ckf.f(group, "group(...)");
            return new d6i(group, i2);
        }

        @Override // tb.n00
        public int getSize() {
            return ((Matcher) h6i.this.e()).groupCount() + 1;
        }

        @Override // tb.n00, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // tb.n00, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<d6i> iterator() {
            return ((deu) dcp.u(i04.Q(yz3.j(this)), new g1a() { // from class: tb.i6i
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    d6i f;
                    f = h6i.b.f(h6i.b.this, ((Integer) obj).intValue());
                    return f;
                }
            })).iterator();
        }
    }

    public h6i(Matcher matcher, CharSequence charSequence) {
        ckf.g(matcher, "matcher");
        ckf.g(charSequence, "input");
        this.f20436a = matcher;
        this.b = charSequence;
    }

    @Override // tb.g6i
    public e6i a() {
        return this.c;
    }

    @Override // tb.g6i
    public List<String> b() {
        if (this.d == null) {
            this.d = new a();
        }
        List<String> list = this.d;
        ckf.d(list);
        return list;
    }

    @Override // tb.g6i
    public aef c() {
        aef h;
        h = gvn.h(e());
        return h;
    }

    public final MatchResult e() {
        return this.f20436a;
    }

    @Override // tb.g6i
    public String getValue() {
        String group = ((Matcher) e()).group();
        ckf.f(group, "group(...)");
        return group;
    }

    @Override // tb.g6i
    public g6i next() {
        int i;
        g6i f;
        int end = ((Matcher) e()).end();
        if (((Matcher) e()).end() == ((Matcher) e()).start()) {
            i = 1;
        } else {
            i = 0;
        }
        int i2 = end + i;
        CharSequence charSequence = this.b;
        if (i2 > charSequence.length()) {
            return null;
        }
        Matcher matcher = this.f20436a.pattern().matcher(charSequence);
        ckf.f(matcher, "matcher(...)");
        f = gvn.f(matcher, i2, charSequence);
        return f;
    }
}
