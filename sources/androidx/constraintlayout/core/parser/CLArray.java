package androidx.constraintlayout.core.parser;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class CLArray extends CLContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public CLArray(char[] cArr) {
        super(cArr);
    }

    public static CLElement allocate(char[] cArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CLElement) ipChange.ipc$dispatch("82d7f22c", new Object[]{cArr});
        }
        return new CLArray(cArr);
    }

    public static /* synthetic */ Object ipc$super(CLArray cLArray, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/parser/CLArray");
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d03d950", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        StringBuilder sb = new StringBuilder();
        String json = toJSON();
        if (i2 > 0 || json.length() + i >= CLElement.sMaxLine) {
            sb.append("[\n");
            Iterator<CLElement> it = this.mElements.iterator();
            boolean z = true;
            while (it.hasNext()) {
                CLElement next = it.next();
                if (!z) {
                    sb.append(",\n");
                } else {
                    z = false;
                }
                addIndent(sb, CLElement.sBaseIndent + i);
                sb.append(next.toFormattedJSON(CLElement.sBaseIndent + i, i2 - 1));
            }
            sb.append("\n");
            addIndent(sb, i);
            sb.append("]");
        } else {
            sb.append(json);
        }
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49c68cf6", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(getDebugName() + "[");
        boolean z = true;
        for (int i = 0; i < this.mElements.size(); i++) {
            if (!z) {
                sb.append(", ");
            } else {
                z = false;
            }
            sb.append(this.mElements.get(i).toJSON());
        }
        return ((Object) sb) + "]";
    }
}
