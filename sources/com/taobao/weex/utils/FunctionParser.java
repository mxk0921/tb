package com.taobao.weex.utils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.f7l;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class FunctionParser<K, V> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final char SPACE = ' ';

    /* renamed from: a  reason: collision with root package name */
    public final Mapper<K, V> f14143a;
    public final Lexer b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Lexer {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f14144a;
        public Token b;
        public String c;
        public int d;

        static {
            t2o.a(985661802);
        }

        public static /* synthetic */ boolean access$100(Lexer lexer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ce69c8d3", new Object[]{lexer})).booleanValue();
            }
            return lexer.f();
        }

        public static /* synthetic */ Token access$200(Lexer lexer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Token) ipChange.ipc$dispatch("81247490", new Object[]{lexer});
            }
            return lexer.a();
        }

        public static /* synthetic */ String access$300(Lexer lexer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1d6afc6f", new Object[]{lexer});
            }
            return lexer.b();
        }

        public static /* synthetic */ String access$400(Lexer lexer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b9d8f8ce", new Object[]{lexer});
            }
            return lexer.f14144a;
        }

        public final Token a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Token) ipChange.ipc$dispatch("8c609d03", new Object[]{this});
            }
            return this.b;
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ba6a953e", new Object[]{this});
            }
            return this.c;
        }

        public final boolean c(char c) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("369568cf", new Object[]{this, new Character(c)})).booleanValue();
            }
            if ('0' <= c && c <= '9') {
                return true;
            }
            if ('a' <= c && c <= 'z') {
                return true;
            }
            if ('A' > c || c > 'Z') {
                return false;
            }
            return true;
        }

        public final boolean d(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("34eedb68", new Object[]{this, charSequence})).booleanValue();
            }
            for (int i = 0; i < charSequence.length(); i++) {
                char charAt = charSequence.charAt(i);
                if (('a' > charAt || charAt > 'z') && (('A' > charAt || charAt > 'Z') && charAt != '-')) {
                    return false;
                }
            }
            return true;
        }

        public final void e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e1074421", new Object[]{this, str});
            } else if (f7l.BRACKET_START_STR.equals(str)) {
                this.b = Token.LEFT_PARENT;
                this.c = f7l.BRACKET_START_STR;
            } else if (f7l.BRACKET_END_STR.equals(str)) {
                this.b = Token.RIGHT_PARENT;
                this.c = f7l.BRACKET_END_STR;
            } else if (",".equals(str)) {
                this.b = Token.COMMA;
                this.c = ",";
            } else if (d(str)) {
                this.b = Token.FUNC_NAME;
                this.c = str;
            } else {
                this.b = Token.PARAM_VALUE;
                this.c = str;
            }
        }

        public final boolean f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9a83d21b", new Object[]{this})).booleanValue();
            }
            int i = this.d;
            while (true) {
                if (this.d >= this.f14144a.length()) {
                    break;
                }
                char charAt = this.f14144a.charAt(this.d);
                if (charAt == ' ') {
                    int i2 = this.d;
                    this.d = i2 + 1;
                    if (i != i2) {
                        break;
                    }
                    i++;
                } else if (c(charAt) || charAt == '.' || charAt == '%' || charAt == '-' || charAt == '+') {
                    this.d++;
                } else {
                    int i3 = this.d;
                    if (i == i3) {
                        this.d = i3 + 1;
                    }
                }
            }
            int i4 = this.d;
            if (i != i4) {
                e(this.f14144a.substring(i, i4));
                return true;
            }
            this.b = null;
            this.c = null;
            return false;
        }

        public Lexer(String str) {
            this.d = 0;
            this.f14144a = str;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface Mapper<K, V> {
        Map<K, V> map(String str, List<String> list);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum Token {
        FUNC_NAME,
        PARAM_VALUE,
        LEFT_PARENT,
        RIGHT_PARENT,
        COMMA;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(Token token, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/utils/FunctionParser$Token");
        }

        public static Token valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Token) ipChange.ipc$dispatch("7ff5abc7", new Object[]{str});
            }
            return (Token) Enum.valueOf(Token.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class WXInterpretationException extends RuntimeException {
        static {
            t2o.a(985661805);
        }

        private WXInterpretationException(String str) {
            super(str);
        }
    }

    static {
        t2o.a(985661800);
    }

    public FunctionParser(String str, Mapper<K, V> mapper) {
        this.b = new Lexer(str);
        this.f14143a = mapper;
    }

    public final LinkedHashMap<K, V> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedHashMap) ipChange.ipc$dispatch("96b78876", new Object[]{this});
        }
        LinkedHashMap<K, V> linkedHashMap = new LinkedHashMap<>();
        do {
            linkedHashMap.putAll(b());
        } while (Lexer.access$200(this.b) == Token.FUNC_NAME);
        return linkedHashMap;
    }

    public final Map<K, V> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c0c0cc54", new Object[]{this});
        }
        LinkedList linkedList = new LinkedList();
        String c = c(Token.FUNC_NAME);
        c(Token.LEFT_PARENT);
        linkedList.add(c(Token.PARAM_VALUE));
        while (true) {
            Token access$200 = Lexer.access$200(this.b);
            Token token = Token.COMMA;
            if (access$200 == token) {
                c(token);
                linkedList.add(c(Token.PARAM_VALUE));
            } else {
                c(Token.RIGHT_PARENT);
                return this.f14143a.map(c, linkedList);
            }
        }
    }

    public final String c(Token token) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8bc098a", new Object[]{this, token});
        }
        try {
            if (token != Lexer.access$200(this.b)) {
                return "";
            }
            String access$300 = Lexer.access$300(this.b);
            Lexer.access$100(this.b);
            return access$300;
        } catch (Exception unused) {
            WXLogUtils.e(token + "Token doesn't match" + Lexer.access$400(this.b));
            return "";
        }
    }

    public LinkedHashMap<K, V> parse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedHashMap) ipChange.ipc$dispatch("ade29dd6", new Object[]{this});
        }
        Lexer.access$100(this.b);
        return a();
    }
}
