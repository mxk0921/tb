package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.dsl.Constraint;
import androidx.constraintlayout.core.dsl.Helper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Barrier extends Helper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Constraint.Side mDirection = null;
    private int mMargin = Integer.MIN_VALUE;
    private ArrayList<Ref> references = new ArrayList<>();

    public Barrier(String str) {
        super(str, new Helper.HelperType(Helper.typeMap.get(Helper.Type.BARRIER)));
    }

    public static /* synthetic */ Object ipc$super(Barrier barrier, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/dsl/Barrier");
    }

    public Barrier addReference(Ref ref) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Barrier) ipChange.ipc$dispatch("a6e09721", new Object[]{this, ref});
        }
        this.references.add(ref);
        this.configMap.put("contains", referencesToString());
        return this;
    }

    public Constraint.Side getDirection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Constraint.Side) ipChange.ipc$dispatch("3f3c6957", new Object[]{this});
        }
        return this.mDirection;
    }

    public int getMargin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63ac3b1e", new Object[]{this})).intValue();
        }
        return this.mMargin;
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

    public void setDirection(Constraint.Side side) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5372195", new Object[]{this, side});
            return;
        }
        this.mDirection = side;
        this.configMap.put("direction", Helper.sideMap.get(side));
    }

    public void setMargin(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a84110ac", new Object[]{this, new Integer(i)});
            return;
        }
        this.mMargin = i;
        this.configMap.put("margin", String.valueOf(i));
    }

    public Barrier addReference(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Barrier) ipChange.ipc$dispatch("db3307d3", new Object[]{this, str}) : addReference(Ref.parseStringToRef(str));
    }

    public Barrier(String str, String str2) {
        super(str, new Helper.HelperType(Helper.typeMap.get(Helper.Type.BARRIER)), str2);
        Map<String, String> convertConfigToMap = convertConfigToMap();
        this.configMap = convertConfigToMap;
        if (convertConfigToMap.containsKey("contains")) {
            Ref.addStringToReferences(this.configMap.get("contains"), this.references);
        }
    }
}
