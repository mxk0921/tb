package androidx.constraintlayout.core.parser;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class CLKey extends CLContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ArrayList<String> sSections;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        sSections = arrayList;
        arrayList.add("ConstraintSets");
        sSections.add("Variables");
        sSections.add("Generate");
        sSections.add(TypedValues.TransitionType.NAME);
        sSections.add("KeyFrames");
        sSections.add(TypedValues.AttributesType.NAME);
        sSections.add("KeyPositions");
        sSections.add("KeyCycles");
    }

    public CLKey(char[] cArr) {
        super(cArr);
    }

    public static CLElement allocate(char[] cArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CLElement) ipChange.ipc$dispatch("82d7f22c", new Object[]{cArr}) : new CLKey(cArr);
    }

    public static /* synthetic */ Object ipc$super(CLKey cLKey, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1403628309) {
            return new Integer(super.hashCode());
        }
        if (hashCode == 1814730534) {
            return new Boolean(super.equals(objArr[0]));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/constraintlayout/core/parser/CLKey");
    }

    @Override // androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLElement
    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CLKey) || Objects.equals(getName(), ((CLKey) obj).getName())) {
            return super.equals(obj);
        }
        return false;
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return content();
    }

    public CLElement getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CLElement) ipChange.ipc$dispatch("66e87022", new Object[]{this});
        }
        if (this.mElements.size() > 0) {
            return this.mElements.get(0);
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLElement
    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return super.hashCode();
    }

    public void set(CLElement cLElement) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c490c267", new Object[]{this, cLElement});
        } else if (this.mElements.size() > 0) {
            this.mElements.set(0, cLElement);
        } else {
            this.mElements.add(cLElement);
        }
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d03d950", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        StringBuilder sb = new StringBuilder(getDebugName());
        addIndent(sb, i);
        String content = content();
        if (this.mElements.size() > 0) {
            sb.append(content);
            sb.append(": ");
            if (sSections.contains(content)) {
                i2 = 3;
            }
            if (i2 > 0) {
                sb.append(this.mElements.get(0).toFormattedJSON(i, i2 - 1));
            } else {
                String json = this.mElements.get(0).toJSON();
                if (json.length() + i < CLElement.sMaxLine) {
                    sb.append(json);
                } else {
                    sb.append(this.mElements.get(0).toFormattedJSON(i, i2 - 1));
                }
            }
            return sb.toString();
        }
        return content + ": <> ";
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49c68cf6", new Object[]{this});
        }
        if (this.mElements.size() > 0) {
            return getDebugName() + content() + ": " + this.mElements.get(0).toJSON();
        }
        return getDebugName() + content() + ": <> ";
    }

    public static CLElement allocate(String str, CLElement cLElement) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CLElement) ipChange.ipc$dispatch("7cc58042", new Object[]{str, cLElement});
        }
        CLKey cLKey = new CLKey(str.toCharArray());
        cLKey.setStart(0L);
        cLKey.setEnd(str.length() - 1);
        cLKey.set(cLElement);
        return cLKey;
    }
}
