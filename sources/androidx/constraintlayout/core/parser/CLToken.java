package androidx.constraintlayout.core.parser;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class CLToken extends CLElement {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int mIndex = 0;
    public Type mType = Type.UNKNOWN;
    public char[] mTokenTrue = "true".toCharArray();
    public char[] mTokenFalse = "false".toCharArray();
    public char[] mTokenNull = "null".toCharArray();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Type extends Enum<Type> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Type UNKNOWN = new Type("UNKNOWN", 0);
        public static final Type TRUE = new Type("TRUE", 1);
        public static final Type FALSE = new Type("FALSE", 2);
        public static final Type NULL = new Type("NULL", 3);
        private static final /* synthetic */ Type[] $VALUES = $values();

        private static /* synthetic */ Type[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Type[]) ipChange.ipc$dispatch("14bc7031", new Object[0]) : new Type[]{UNKNOWN, TRUE, FALSE, NULL};
        }

        private Type(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(Type type, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/parser/CLToken$Type");
        }

        public static Type valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Type) ipChange.ipc$dispatch("bdf3d51c", new Object[]{str});
            }
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Type[]) ipChange.ipc$dispatch("d48dd70d", new Object[0]);
            }
            return (Type[]) $VALUES.clone();
        }
    }

    public CLToken(char[] cArr) {
        super(cArr);
    }

    public static CLElement allocate(char[] cArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CLElement) ipChange.ipc$dispatch("82d7f22c", new Object[]{cArr});
        }
        return new CLToken(cArr);
    }

    public static /* synthetic */ Object ipc$super(CLToken cLToken, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/parser/CLToken");
    }

    public Type getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Type) ipChange.ipc$dispatch("34481bde", new Object[]{this});
        }
        return this.mType;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d03d950", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        StringBuilder sb = new StringBuilder();
        addIndent(sb, i);
        sb.append(content());
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49c68cf6", new Object[]{this});
        }
        if (!CLParser.sDebug) {
            return content();
        }
        return "<" + content() + ">";
    }

    public boolean validate(char c, long j) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8ed9948", new Object[]{this, new Character(c), new Long(j)})).booleanValue();
        }
        int ordinal = this.mType.ordinal();
        if (ordinal == 0) {
            char[] cArr = this.mTokenTrue;
            int i = this.mIndex;
            if (cArr[i] == c) {
                this.mType = Type.TRUE;
            } else if (this.mTokenFalse[i] == c) {
                this.mType = Type.FALSE;
            } else if (this.mTokenNull[i] == c) {
                this.mType = Type.NULL;
            }
            z = true;
        } else if (ordinal == 1) {
            char[] cArr2 = this.mTokenTrue;
            int i2 = this.mIndex;
            if (cArr2[i2] == c) {
                z = true;
            }
            if (z && i2 + 1 == cArr2.length) {
                setEnd(j);
            }
        } else if (ordinal == 2) {
            char[] cArr3 = this.mTokenFalse;
            int i3 = this.mIndex;
            if (cArr3[i3] == c) {
                z = true;
            }
            if (z && i3 + 1 == cArr3.length) {
                setEnd(j);
            }
        } else if (ordinal == 3) {
            char[] cArr4 = this.mTokenNull;
            int i4 = this.mIndex;
            if (cArr4[i4] == c) {
                z = true;
            }
            if (z && i4 + 1 == cArr4.length) {
                setEnd(j);
            }
        }
        this.mIndex++;
        return z;
    }

    public boolean isNull() throws CLParsingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f04d5dc", new Object[]{this})).booleanValue();
        }
        if (this.mType == Type.NULL) {
            return true;
        }
        throw new CLParsingException("this token is not a null: <" + content() + ">", this);
    }

    public boolean getBoolean() throws CLParsingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c64e37d", new Object[]{this})).booleanValue();
        }
        Type type = this.mType;
        if (type == Type.TRUE) {
            return true;
        }
        if (type == Type.FALSE) {
            return false;
        }
        throw new CLParsingException("this token is not a boolean: <" + content() + ">", this);
    }
}
