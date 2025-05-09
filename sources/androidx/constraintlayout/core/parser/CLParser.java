package androidx.constraintlayout.core.parser;

import com.ali.user.mobile.model.TokenType;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.k68;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class CLParser {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean sDebug;
    private String mContent;
    private boolean mHasComment = false;
    private int mLineNumber;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class TYPE extends Enum<TYPE> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final TYPE UNKNOWN = new TYPE("UNKNOWN", 0);
        public static final TYPE OBJECT = new TYPE("OBJECT", 1);
        public static final TYPE ARRAY = new TYPE("ARRAY", 2);
        public static final TYPE NUMBER = new TYPE(TokenType.NUMBER, 3);
        public static final TYPE STRING = new TYPE(k68.TYPE_STRING, 4);
        public static final TYPE KEY = new TYPE("KEY", 5);
        public static final TYPE TOKEN = new TYPE("TOKEN", 6);
        private static final /* synthetic */ TYPE[] $VALUES = $values();

        private static /* synthetic */ TYPE[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TYPE[]) ipChange.ipc$dispatch("2c881861", new Object[0]) : new TYPE[]{UNKNOWN, OBJECT, ARRAY, NUMBER, STRING, KEY, TOKEN};
        }

        private TYPE(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(TYPE type, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/parser/CLParser$TYPE");
        }

        public static TYPE valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TYPE) ipChange.ipc$dispatch("aa3d50d6", new Object[]{str});
            }
            return (TYPE) Enum.valueOf(TYPE.class, str);
        }

        public static TYPE[] values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TYPE[]) ipChange.ipc$dispatch("66e38d05", new Object[0]);
            }
            return (TYPE[]) $VALUES.clone();
        }
    }

    public CLParser(String str) {
        this.mContent = str;
    }

    private CLElement createElement(CLElement cLElement, int i, TYPE type, boolean z, char[] cArr) {
        CLElement cLElement2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CLElement) ipChange.ipc$dispatch("5eceace9", new Object[]{this, cLElement, new Integer(i), type, new Boolean(z), cArr});
        }
        if (sDebug) {
            System.out.println("CREATE " + type + " at " + cArr[i]);
        }
        switch (type.ordinal()) {
            case 1:
                cLElement2 = CLObject.allocate(cArr);
                i++;
                break;
            case 2:
                cLElement2 = CLArray.allocate(cArr);
                i++;
                break;
            case 3:
                cLElement2 = CLNumber.allocate(cArr);
                break;
            case 4:
                cLElement2 = CLString.allocate(cArr);
                break;
            case 5:
                cLElement2 = CLKey.allocate(cArr);
                break;
            case 6:
                cLElement2 = CLToken.allocate(cArr);
                break;
            default:
                cLElement2 = null;
                break;
        }
        if (cLElement2 == null) {
            return null;
        }
        cLElement2.setLine(this.mLineNumber);
        if (z) {
            cLElement2.setStart(i);
        }
        if (cLElement instanceof CLContainer) {
            cLElement2.setContainer((CLContainer) cLElement);
        }
        return cLElement2;
    }

    public static CLObject parse(String str) throws CLParsingException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CLObject) ipChange.ipc$dispatch("10338297", new Object[]{str}) : new CLParser(str).parse();
    }

    private CLElement getNextJsonElement(int i, char c, CLElement cLElement, char[] cArr) throws CLParsingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CLElement) ipChange.ipc$dispatch("354a8f6c", new Object[]{this, new Integer(i), new Character(c), cLElement, cArr});
        }
        if (c == '\t' || c == '\n' || c == '\r' || c == ' ') {
            return cLElement;
        }
        if (c == '\"' || c == '\'') {
            if (cLElement instanceof CLObject) {
                return createElement(cLElement, i, TYPE.KEY, true, cArr);
            }
            return createElement(cLElement, i, TYPE.STRING, true, cArr);
        } else if (c == '[') {
            return createElement(cLElement, i, TYPE.ARRAY, true, cArr);
        } else {
            if (c != ']') {
                if (c == '{') {
                    return createElement(cLElement, i, TYPE.OBJECT, true, cArr);
                }
                if (c != '}') {
                    switch (c) {
                        case '+':
                        case '-':
                        case '.':
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            return createElement(cLElement, i, TYPE.NUMBER, true, cArr);
                        case ',':
                        case ':':
                            return cLElement;
                        case '/':
                            int i2 = i + 1;
                            if (i2 >= cArr.length || cArr[i2] != '/') {
                                return cLElement;
                            }
                            this.mHasComment = true;
                            return cLElement;
                        default:
                            if (!(cLElement instanceof CLContainer) || (cLElement instanceof CLObject)) {
                                return createElement(cLElement, i, TYPE.KEY, true, cArr);
                            }
                            CLElement createElement = createElement(cLElement, i, TYPE.TOKEN, true, cArr);
                            CLToken cLToken = (CLToken) createElement;
                            if (cLToken.validate(c, i)) {
                                return createElement;
                            }
                            throw new CLParsingException("incorrect token <" + c + "> at line " + this.mLineNumber, cLToken);
                    }
                }
            }
            cLElement.setEnd(i - 1);
            CLElement container = cLElement.getContainer();
            container.setEnd(i);
            return container;
        }
    }

    public CLObject parse() throws CLParsingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CLObject) ipChange.ipc$dispatch("9e078721", new Object[]{this});
        }
        char[] charArray = this.mContent.toCharArray();
        int length = charArray.length;
        this.mLineNumber = 1;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            char c = charArray[i];
            if (c == '{') {
                break;
            }
            if (c == '\n') {
                this.mLineNumber++;
            }
            i++;
        }
        if (i != -1) {
            CLObject allocate = CLObject.allocate(charArray);
            allocate.setLine(this.mLineNumber);
            allocate.setStart(i);
            CLObject cLObject = allocate;
            for (int i2 = i + 1; i2 < length; i2++) {
                char c2 = charArray[i2];
                if (c2 == '\n') {
                    this.mLineNumber++;
                }
                if (this.mHasComment) {
                    if (c2 == '\n') {
                        this.mHasComment = false;
                    } else {
                        continue;
                    }
                }
                if (cLObject == null) {
                    break;
                }
                if (cLObject.isDone()) {
                    cLObject = getNextJsonElement(i2, c2, cLObject, charArray);
                } else if (cLObject instanceof CLObject) {
                    if (c2 == '}') {
                        cLObject.setEnd(i2 - 1);
                    } else {
                        cLObject = getNextJsonElement(i2, c2, cLObject, charArray);
                    }
                } else if (!(cLObject instanceof CLArray)) {
                    boolean z = cLObject instanceof CLString;
                    if (z) {
                        long j = cLObject.mStart;
                        if (charArray[(int) j] == c2) {
                            cLObject.setStart(j + 1);
                            cLObject.setEnd(i2 - 1);
                        }
                    } else {
                        if (cLObject instanceof CLToken) {
                            CLToken cLToken = (CLToken) cLObject;
                            if (!cLToken.validate(c2, i2)) {
                                throw new CLParsingException("parsing incorrect token " + cLToken.content() + " at line " + this.mLineNumber, cLToken);
                            }
                        }
                        if ((cLObject instanceof CLKey) || z) {
                            long j2 = cLObject.mStart;
                            char c3 = charArray[(int) j2];
                            if ((c3 == '\'' || c3 == '\"') && c3 == c2) {
                                cLObject.setStart(j2 + 1);
                                cLObject.setEnd(i2 - 1);
                            }
                        }
                        if (!cLObject.isDone() && (c2 == '}' || c2 == ']' || c2 == ',' || c2 == ' ' || c2 == '\t' || c2 == '\r' || c2 == '\n' || c2 == ':')) {
                            long j3 = i2 - 1;
                            cLObject.setEnd(j3);
                            if (c2 == '}' || c2 == ']') {
                                cLObject = cLObject.getContainer();
                                cLObject.setEnd(j3);
                                if (cLObject instanceof CLKey) {
                                    cLObject = cLObject.getContainer();
                                    cLObject.setEnd(j3);
                                }
                            }
                        }
                    }
                } else if (c2 == ']') {
                    cLObject.setEnd(i2 - 1);
                } else {
                    cLObject = getNextJsonElement(i2, c2, cLObject, charArray);
                }
                if (cLObject.isDone() && (!(cLObject instanceof CLKey) || ((CLKey) cLObject).mElements.size() > 0)) {
                    cLObject = cLObject.getContainer();
                }
            }
            while (cLObject != null && !cLObject.isDone()) {
                if (cLObject instanceof CLString) {
                    cLObject.setStart(((int) cLObject.mStart) + 1);
                }
                cLObject.setEnd(length - 1);
                cLObject = cLObject.getContainer();
            }
            if (sDebug) {
                System.out.println("Root: " + allocate.toJSON());
            }
            return allocate;
        }
        throw new CLParsingException("invalid json content", null);
    }
}
