package androidx.constraintlayout.core.parser;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class CLString extends CLElement {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public CLString(char[] cArr) {
        super(cArr);
    }

    public static CLElement allocate(char[] cArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CLElement) ipChange.ipc$dispatch("82d7f22c", new Object[]{cArr});
        }
        return new CLString(cArr);
    }

    public static CLString from(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CLString) ipChange.ipc$dispatch("8f191d6e", new Object[]{str});
        }
        CLString cLString = new CLString(str.toCharArray());
        cLString.setStart(0L);
        cLString.setEnd(str.length() - 1);
        return cLString;
    }

    public static /* synthetic */ Object ipc$super(CLString cLString, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1403628309) {
            return new Integer(super.hashCode());
        }
        if (hashCode == 1814730534) {
            return new Boolean(super.equals(objArr[0]));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/constraintlayout/core/parser/CLString");
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CLString) || !content().equals(((CLString) obj).content())) {
            return super.equals(obj);
        }
        return true;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return super.hashCode();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d03d950", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        StringBuilder sb = new StringBuilder();
        addIndent(sb, i);
        sb.append("'");
        sb.append(content());
        sb.append("'");
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49c68cf6", new Object[]{this});
        }
        return "'" + content() + "'";
    }
}
