package com.taobao.android.weex_uikit.util;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.util.a;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import tb.dwh;
import tb.f7l;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class FunctionParser<K, V> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final char SPACE = ' ';

    /* renamed from: a  reason: collision with root package name */
    public final c<K, V> f10007a;
    public final b b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/util/FunctionParser$Token");
        }

        public static Token valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Token) ipChange.ipc$dispatch("33646ce9", new Object[]{str});
            }
            return (Token) Enum.valueOf(Token.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class WXInterpretationException extends RuntimeException {
        static {
            t2o.a(986710112);
        }

        private WXInterpretationException(String str) {
            super(str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f10008a;
        public Token b;
        public String c;
        public int d;

        static {
            t2o.a(986710109);
        }

        public static /* synthetic */ boolean a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f75aa559", new Object[]{bVar})).booleanValue();
            }
            return bVar.j();
        }

        public static /* synthetic */ Token b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Token) ipChange.ipc$dispatch("450c7964", new Object[]{bVar});
            }
            return bVar.e();
        }

        public static /* synthetic */ String c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("bd40afed", new Object[]{bVar});
            }
            return bVar.f();
        }

        public static /* synthetic */ String d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9dba05ee", new Object[]{bVar});
            }
            return bVar.f10008a;
        }

        public final Token e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Token) ipChange.ipc$dispatch("de045d2d", new Object[]{this});
            }
            return this.b;
        }

        public final String f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ba6a953e", new Object[]{this});
            }
            return this.c;
        }

        public final boolean g(char c) {
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

        public final boolean h(CharSequence charSequence) {
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

        public final void i(String str) {
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
            } else if (h(str)) {
                this.b = Token.FUNC_NAME;
                this.c = str;
            } else {
                this.b = Token.PARAM_VALUE;
                this.c = str;
            }
        }

        public final boolean j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9a83d21b", new Object[]{this})).booleanValue();
            }
            int i = this.d;
            while (true) {
                if (this.d >= this.f10008a.length()) {
                    break;
                }
                char charAt = this.f10008a.charAt(this.d);
                if (charAt == ' ') {
                    int i2 = this.d;
                    this.d = i2 + 1;
                    if (i != i2) {
                        break;
                    }
                    i++;
                } else if (g(charAt) || charAt == '.' || charAt == '%' || charAt == '-' || charAt == '+') {
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
                i(this.f10008a.substring(i, i4));
                return true;
            }
            this.b = null;
            this.c = null;
            return false;
        }

        public b(String str) {
            this.d = 0;
            this.f10008a = str;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface c<K, V> {
    }

    static {
        t2o.a(986710107);
    }

    public FunctionParser(String str, c<K, V> cVar) {
        this.b = new b(str);
        this.f10007a = cVar;
    }

    public final LinkedHashMap<K, V> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedHashMap) ipChange.ipc$dispatch("96b78876", new Object[]{this});
        }
        LinkedHashMap<K, V> linkedHashMap = new LinkedHashMap<>();
        do {
            linkedHashMap.putAll(b());
        } while (b.b(this.b) == Token.FUNC_NAME);
        return linkedHashMap;
    }

    public final Map<K, V> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c0c0cc54", new Object[]{this});
        }
        LinkedList linkedList = new LinkedList();
        String c2 = c(Token.FUNC_NAME);
        c(Token.LEFT_PARENT);
        linkedList.add(c(Token.PARAM_VALUE));
        while (true) {
            Token b2 = b.b(this.b);
            Token token = Token.COMMA;
            if (b2 == token) {
                c(token);
                linkedList.add(c(Token.PARAM_VALUE));
            } else {
                c(Token.RIGHT_PARENT);
                return ((a.C0522a) this.f10007a).a(c2, linkedList);
            }
        }
    }

    public final String c(Token token) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e26c2a6c", new Object[]{this, token});
        }
        try {
            if (token != b.b(this.b)) {
                return "";
            }
            String c2 = b.c(this.b);
            b.a(this.b);
            return c2;
        } catch (Exception unused) {
            dwh.e(token + "Token doesn't match" + b.d(this.b));
            return "";
        }
    }

    public LinkedHashMap<K, V> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedHashMap) ipChange.ipc$dispatch("ade29dd6", new Object[]{this});
        }
        b.a(this.b);
        return a();
    }
}
