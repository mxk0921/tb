package androidx.constraintlayout.core.parser;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class CLParsingException extends Exception {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String mElementClass;
    private final int mLineNumber;
    private final String mReason;

    public CLParsingException(String str, CLElement cLElement) {
        super(str);
        this.mReason = str;
        if (cLElement != null) {
            this.mElementClass = cLElement.getStrClass();
            this.mLineNumber = cLElement.getLine();
            return;
        }
        this.mElementClass = "unknown";
        this.mLineNumber = 0;
    }

    public static /* synthetic */ Object ipc$super(CLParsingException cLParsingException, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/parser/CLParsingException");
    }

    public String reason() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c1a6f35", new Object[]{this});
        }
        return this.mReason + " (" + this.mElementClass + " at line " + this.mLineNumber + f7l.BRACKET_END_STR;
    }

    @Override // java.lang.Throwable
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "CLParsingException (" + hashCode() + ") : " + reason();
    }
}
