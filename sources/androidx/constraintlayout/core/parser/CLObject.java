package androidx.constraintlayout.core.parser;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class CLObject extends CLContainer implements Iterable<CLKey> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class CLObjectIterator implements Iterator<CLKey> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int mIndex = 0;
        public CLObject mObject;

        public CLObjectIterator(CLObject cLObject) {
            this.mObject = cLObject;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("291ab8", new Object[]{this})).booleanValue();
            }
            if (this.mIndex < this.mObject.size()) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public CLKey next() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CLKey) ipChange.ipc$dispatch("593809d7", new Object[]{this});
            }
            CLKey cLKey = (CLKey) this.mObject.mElements.get(this.mIndex);
            this.mIndex++;
            return cLKey;
        }
    }

    public CLObject(char[] cArr) {
        super(cArr);
    }

    public static CLObject allocate(char[] cArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CLObject) ipChange.ipc$dispatch("888a31cf", new Object[]{cArr});
        }
        return new CLObject(cArr);
    }

    public static /* synthetic */ Object ipc$super(CLObject cLObject, String str, Object... objArr) {
        if (str.hashCode() == -1790083425) {
            return super.clone();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/parser/CLObject");
    }

    @Override // java.lang.Iterable
    public Iterator<CLKey> iterator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("8f345362", new Object[]{this});
        }
        return new CLObjectIterator(this);
    }

    public String toFormattedJSON() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a7c71b0", new Object[]{this}) : toFormattedJSON(0, 0);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d03d950", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        StringBuilder sb = new StringBuilder(getDebugName());
        sb.append("{\n");
        Iterator<CLElement> it = this.mElements.iterator();
        boolean z = true;
        while (it.hasNext()) {
            CLElement next = it.next();
            if (!z) {
                sb.append(",\n");
            } else {
                z = false;
            }
            sb.append(next.toFormattedJSON(CLElement.sBaseIndent + i, i2 - 1));
        }
        sb.append("\n");
        addIndent(sb, i);
        sb.append("}");
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49c68cf6", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(getDebugName() + "{ ");
        Iterator<CLElement> it = this.mElements.iterator();
        while (it.hasNext()) {
            CLElement next = it.next();
            if (!z) {
                sb.append(", ");
            } else {
                z = false;
            }
            sb.append(next.toJSON());
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLElement
    public CLObject clone() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CLObject) ipChange.ipc$dispatch("446d0837", new Object[]{this}) : (CLObject) super.clone();
    }
}
