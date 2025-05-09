package androidx.constraintlayout.core.parser;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Objects;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class CLElement implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static int sBaseIndent = 2;
    public static int sMaxLine = 80;
    public CLContainer mContainer;
    private final char[] mContent;
    private int mLine;
    public long mStart = -1;
    public long mEnd = Long.MAX_VALUE;

    public CLElement(char[] cArr) {
        this.mContent = cArr;
    }

    public void addIndent(StringBuilder sb, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7a7a5ec", new Object[]{this, sb, new Integer(i)});
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(' ');
        }
    }

    public String content() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a611b020", new Object[]{this});
        }
        String str = new String(this.mContent);
        if (str.length() < 1) {
            return "";
        }
        long j = this.mEnd;
        if (j != Long.MAX_VALUE) {
            long j2 = this.mStart;
            if (j >= j2) {
                return str.substring((int) j2, ((int) j) + 1);
            }
        }
        long j3 = this.mStart;
        return str.substring((int) j3, ((int) j3) + 1);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CLElement)) {
            return false;
        }
        CLElement cLElement = (CLElement) obj;
        if (this.mStart == cLElement.mStart && this.mEnd == cLElement.mEnd && this.mLine == cLElement.mLine && Arrays.equals(this.mContent, cLElement.mContent)) {
            return Objects.equals(this.mContainer, cLElement.mContainer);
        }
        return false;
    }

    public CLElement getContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CLElement) ipChange.ipc$dispatch("9b210e32", new Object[]{this});
        }
        return this.mContainer;
    }

    public String getDebugName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("95afe731", new Object[]{this});
        }
        if (!CLParser.sDebug) {
            return "";
        }
        return getStrClass() + " -> ";
    }

    public long getEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ddee63a0", new Object[]{this})).longValue();
        }
        return this.mEnd;
    }

    public float getFloat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81828a1d", new Object[]{this})).floatValue();
        }
        if (this instanceof CLNumber) {
            return ((CLNumber) this).getFloat();
        }
        return Float.NaN;
    }

    public int getInt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b268c8b3", new Object[]{this})).intValue();
        }
        if (this instanceof CLNumber) {
            return ((CLNumber) this).getInt();
        }
        return 0;
    }

    public int getLine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2a157e4", new Object[]{this})).intValue();
        }
        return this.mLine;
    }

    public long getStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8070b927", new Object[]{this})).longValue();
        }
        return this.mStart;
    }

    public String getStrClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99b497dc", new Object[]{this});
        }
        String cls = getClass().toString();
        return cls.substring(cls.lastIndexOf(46) + 1);
    }

    public int hashCode() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        long j = this.mStart;
        long j2 = this.mEnd;
        int hashCode = ((((Arrays.hashCode(this.mContent) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        CLContainer cLContainer = this.mContainer;
        if (cLContainer != null) {
            i = cLContainer.hashCode();
        }
        return ((hashCode + i) * 31) + this.mLine;
    }

    public boolean isDone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15dabe57", new Object[]{this})).booleanValue();
        }
        if (this.mEnd != Long.MAX_VALUE) {
            return true;
        }
        return false;
    }

    public boolean isStarted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a6f3902", new Object[]{this})).booleanValue();
        }
        if (this.mStart > -1) {
            return true;
        }
        return false;
    }

    public boolean notStarted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67fa7b9", new Object[]{this})).booleanValue();
        }
        if (this.mStart == -1) {
            return true;
        }
        return false;
    }

    public void setContainer(CLContainer cLContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c77f985", new Object[]{this, cLContainer});
        } else {
            this.mContainer = cLContainer;
        }
    }

    public void setEnd(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da96e9a4", new Object[]{this, new Long(j)});
        } else if (this.mEnd == Long.MAX_VALUE) {
            this.mEnd = j;
            if (CLParser.sDebug) {
                PrintStream printStream = System.out;
                printStream.println("closing " + hashCode() + " -> " + this);
            }
            CLContainer cLContainer = this.mContainer;
            if (cLContainer != null) {
                cLContainer.add(this);
            }
        }
    }

    public void setLine(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edddd9a6", new Object[]{this, new Integer(i)});
        } else {
            this.mLine = i;
        }
    }

    public void setStart(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbcb31fd", new Object[]{this, new Long(j)});
        } else {
            this.mStart = j;
        }
    }

    public String toFormattedJSON(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d03d950", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        return "";
    }

    public String toJSON() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49c68cf6", new Object[]{this});
        }
        return "";
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        long j = this.mStart;
        long j2 = this.mEnd;
        if (j > j2 || j2 == Long.MAX_VALUE) {
            return getClass() + " (INVALID, " + this.mStart + "-" + this.mEnd + f7l.BRACKET_END_STR;
        }
        String substring = new String(this.mContent).substring((int) this.mStart, ((int) this.mEnd) + 1);
        return getStrClass() + " (" + this.mStart + " : " + this.mEnd + ") <<" + substring + ">>";
    }

    public CLElement clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CLElement) ipChange.ipc$dispatch("434fe8c4", new Object[]{this});
        }
        try {
            return (CLElement) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public boolean hasContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2b2258a", new Object[]{this})).booleanValue();
        }
        char[] cArr = this.mContent;
        return cArr != null && cArr.length >= 1;
    }
}
