package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ova {
    public static final b Companion = new b(null);
    public static final ova d;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f25680a;
    public final a b;
    public final c c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {
        public static final C1018a Companion = new C1018a(null);

        /* renamed from: a  reason: collision with root package name */
        public static final a f25681a = new a(Integer.MAX_VALUE, Integer.MAX_VALUE, "  ", "", "", "");

        /* compiled from: Taobao */
        /* renamed from: tb.ova$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public static final class C1018a {
            public /* synthetic */ C1018a(a07 a07Var) {
                this();
            }

            public final a a() {
                return a.f25681a;
            }

            public C1018a() {
            }
        }

        public a(int i, int i2, String str, String str2, String str3, String str4) {
            boolean b;
            boolean b2;
            boolean b3;
            ckf.g(str, "groupSeparator");
            ckf.g(str2, "byteSeparator");
            ckf.g(str3, "bytePrefix");
            ckf.g(str4, "byteSuffix");
            if (str3.length() == 0 && str4.length() == 0) {
                str2.length();
            }
            b = pva.b(str);
            if (!b) {
                b2 = pva.b(str2);
                if (!b2) {
                    b3 = pva.b(str3);
                    if (!b3) {
                        pva.b(str4);
                    }
                }
            }
        }

        public final StringBuilder b(StringBuilder sb, String str) {
            ckf.g(sb, "sb");
            ckf.g(str, "indent");
            sb.append(str);
            sb.append("bytesPerLine = ");
            sb.append(Integer.MAX_VALUE);
            sb.append(",");
            sb.append('\n');
            sb.append(str);
            sb.append("bytesPerGroup = ");
            sb.append(Integer.MAX_VALUE);
            sb.append(",");
            sb.append('\n');
            sb.append(str);
            sb.append("groupSeparator = \"");
            sb.append("  ");
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("byteSeparator = \"");
            sb.append("");
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("bytePrefix = \"");
            sb.append("");
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("byteSuffix = \"");
            sb.append("");
            sb.append("\"");
            return sb;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BytesHexFormat(\n");
            b(sb, "    ");
            sb.append('\n');
            sb.append(f7l.BRACKET_END_STR);
            return sb.toString();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class b {
        public /* synthetic */ b(a07 a07Var) {
            this();
        }

        public final ova a() {
            return ova.d;
        }

        public b() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class c {
        public static final a Companion = new a(null);
        public static final c b = new c("", "", false, 1);

        /* renamed from: a  reason: collision with root package name */
        public final boolean f25682a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public static final class a {
            public /* synthetic */ a(a07 a07Var) {
                this();
            }

            public final c a() {
                return c.b;
            }

            public a() {
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
            if (r4 == 1) goto L_0x0020;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public c(java.lang.String r1, java.lang.String r2, boolean r3, int r4) {
            /*
                r0 = this;
                java.lang.String r3 = "prefix"
                tb.ckf.g(r1, r3)
                java.lang.String r3 = "suffix"
                tb.ckf.g(r2, r3)
                r0.<init>()
                int r3 = r1.length()
                if (r3 != 0) goto L_0x001f
                int r3 = r2.length()
                if (r3 != 0) goto L_0x001f
                r3 = 1
                if (r4 != r3) goto L_0x001f
                goto L_0x0020
            L_0x001f:
                r3 = 0
            L_0x0020:
                r0.f25682a = r3
                boolean r1 = tb.pva.a(r1)
                if (r1 != 0) goto L_0x002b
                tb.pva.a(r2)
            L_0x002b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.ova.c.<init>(java.lang.String, java.lang.String, boolean, int):void");
        }

        public final StringBuilder b(StringBuilder sb, String str) {
            ckf.g(sb, "sb");
            ckf.g(str, "indent");
            sb.append(str);
            sb.append("prefix = \"");
            sb.append("");
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("suffix = \"");
            sb.append("");
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("removeLeadingZeros = ");
            sb.append(false);
            sb.append(',');
            sb.append('\n');
            sb.append(str);
            sb.append("minLength = ");
            sb.append(1);
            return sb;
        }

        public final boolean c() {
            return this.f25682a;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NumberHexFormat(\n");
            b(sb, "    ");
            sb.append('\n');
            sb.append(f7l.BRACKET_END_STR);
            return sb.toString();
        }
    }

    static {
        a.C1018a aVar = a.Companion;
        a a2 = aVar.a();
        c.a aVar2 = c.Companion;
        new ova(false, a2, aVar2.a());
        d = new ova(true, aVar.a(), aVar2.a());
    }

    public ova(boolean z, a aVar, c cVar) {
        ckf.g(aVar, "bytes");
        ckf.g(cVar, "number");
        this.f25680a = z;
        this.b = aVar;
        this.c = cVar;
    }

    public final c b() {
        return this.c;
    }

    public final boolean c() {
        return this.f25680a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HexFormat(\n    upperCase = ");
        sb.append(this.f25680a);
        sb.append(",\n    bytes = BytesHexFormat(\n");
        this.b.b(sb, "        ");
        sb.append('\n');
        sb.append("    ),");
        sb.append('\n');
        sb.append("    number = NumberHexFormat(");
        sb.append('\n');
        this.c.b(sb, "        ");
        sb.append('\n');
        sb.append("    )");
        sb.append('\n');
        sb.append(f7l.BRACKET_END_STR);
        return sb.toString();
    }
}
