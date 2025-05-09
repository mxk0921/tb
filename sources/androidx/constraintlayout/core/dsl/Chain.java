package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.dsl.Constraint;
import androidx.constraintlayout.core.dsl.Helper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class Chain extends Helper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<Style, String> styleMap;
    private Style mStyle = null;
    public ArrayList<Ref> references = new ArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class Anchor {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Constraint.Anchor mConnection = null;
        public int mGoneMargin = Integer.MIN_VALUE;
        public int mMargin;
        public final Constraint.Side mSide;

        public Anchor(Constraint.Side side) {
            this.mSide = side;
        }

        public void build(StringBuilder sb) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec40a1d6", new Object[]{this, sb});
            } else if (this.mConnection != null) {
                sb.append(this.mSide.toString().toLowerCase());
                sb.append(":");
                sb.append(this);
                sb.append(",\n");
            }
        }

        public String getId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
            }
            return Chain.this.name;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder("[");
            if (this.mConnection != null) {
                sb.append("'");
                sb.append(this.mConnection.getId());
                sb.append("','");
                sb.append(this.mConnection.mSide.toString().toLowerCase());
                sb.append("'");
            }
            if (this.mMargin != 0) {
                sb.append(",");
                sb.append(this.mMargin);
            }
            if (this.mGoneMargin != Integer.MIN_VALUE) {
                if (this.mMargin == 0) {
                    sb.append(",0,");
                    sb.append(this.mGoneMargin);
                } else {
                    sb.append(",");
                    sb.append(this.mGoneMargin);
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Style extends Enum<Style> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Style PACKED = new Style("PACKED", 0);
        public static final Style SPREAD = new Style("SPREAD", 1);
        public static final Style SPREAD_INSIDE = new Style("SPREAD_INSIDE", 2);
        private static final /* synthetic */ Style[] $VALUES = $values();

        private static /* synthetic */ Style[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Style[]) ipChange.ipc$dispatch("42d7e1d3", new Object[0]) : new Style[]{PACKED, SPREAD, SPREAD_INSIDE};
        }

        private Style(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(Style style, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/dsl/Chain$Style");
        }

        public static Style valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Style) ipChange.ipc$dispatch("b2c4743e", new Object[]{str});
            }
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Style[]) ipChange.ipc$dispatch("e94716af", new Object[0]);
            }
            return (Style[]) $VALUES.clone();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        styleMap = hashMap;
        hashMap.put(Style.SPREAD, "'spread'");
        hashMap.put(Style.SPREAD_INSIDE, "'spread_inside'");
        hashMap.put(Style.PACKED, "'packed'");
    }

    public Chain(String str) {
        super(str, new Helper.HelperType(""));
    }

    public static /* synthetic */ Object ipc$super(Chain chain, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/dsl/Chain");
    }

    public Chain addReference(Ref ref) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Chain) ipChange.ipc$dispatch("f12f9097", new Object[]{this, ref});
        }
        this.references.add(ref);
        this.configMap.put("contains", referencesToString());
        return this;
    }

    public Style getStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Style) ipChange.ipc$dispatch("8ad559d5", new Object[]{this});
        }
        return this.mStyle;
    }

    public String referencesToString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("25d10a65", new Object[]{this});
        }
        if (this.references.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder("[");
        Iterator<Ref> it = this.references.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
        }
        sb.append("]");
        return sb.toString();
    }

    public void setStyle(Style style) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b96b37", new Object[]{this, style});
            return;
        }
        this.mStyle = style;
        this.configMap.put("style", styleMap.get(style));
    }

    public Chain addReference(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Chain) ipChange.ipc$dispatch("86a85c9", new Object[]{this, str}) : addReference(Ref.parseStringToRef(str));
    }
}
