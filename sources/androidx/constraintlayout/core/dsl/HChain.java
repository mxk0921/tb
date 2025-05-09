package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.dsl.Chain;
import androidx.constraintlayout.core.dsl.Constraint;
import androidx.constraintlayout.core.dsl.Helper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class HChain extends Chain {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private HAnchor mLeft = new HAnchor(Constraint.HSide.LEFT);
    private HAnchor mRight = new HAnchor(Constraint.HSide.RIGHT);
    private HAnchor mStart = new HAnchor(Constraint.HSide.START);
    private HAnchor mEnd = new HAnchor(Constraint.HSide.END);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class HAnchor extends Chain.Anchor {
        public HAnchor(Constraint.HSide hSide) {
            super(Constraint.Side.valueOf(hSide.name()));
        }
    }

    public HChain(String str) {
        super(str);
        this.type = new Helper.HelperType(Helper.typeMap.get(Helper.Type.HORIZONTAL_CHAIN));
    }

    public static /* synthetic */ Object ipc$super(HChain hChain, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/dsl/HChain");
    }

    public HAnchor getEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HAnchor) ipChange.ipc$dispatch("88bfeb2b", new Object[]{this});
        }
        return this.mEnd;
    }

    public HAnchor getLeft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HAnchor) ipChange.ipc$dispatch("b5bb2803", new Object[]{this});
        }
        return this.mLeft;
    }

    public HAnchor getRight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HAnchor) ipChange.ipc$dispatch("4c72df2c", new Object[]{this});
        }
        return this.mRight;
    }

    public HAnchor getStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HAnchor) ipChange.ipc$dispatch("95ffb0f2", new Object[]{this});
        }
        return this.mStart;
    }

    public void linkToEnd(Constraint.HAnchor hAnchor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2768d7e", new Object[]{this, hAnchor});
        } else {
            linkToEnd(hAnchor, 0);
        }
    }

    public void linkToLeft(Constraint.HAnchor hAnchor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27942688", new Object[]{this, hAnchor});
        } else {
            linkToLeft(hAnchor, 0);
        }
    }

    public void linkToRight(Constraint.HAnchor hAnchor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59c2ce5d", new Object[]{this, hAnchor});
        } else {
            linkToRight(hAnchor, 0);
        }
    }

    public void linkToStart(Constraint.HAnchor hAnchor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e702857", new Object[]{this, hAnchor});
        } else {
            linkToStart(hAnchor, 0);
        }
    }

    public void linkToEnd(Constraint.HAnchor hAnchor, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c5b9545", new Object[]{this, hAnchor, new Integer(i)});
        } else {
            linkToEnd(hAnchor, i, Integer.MIN_VALUE);
        }
    }

    public void linkToLeft(Constraint.HAnchor hAnchor, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caf11d7b", new Object[]{this, hAnchor, new Integer(i)});
        } else {
            linkToLeft(hAnchor, i, Integer.MIN_VALUE);
        }
    }

    public void linkToRight(Constraint.HAnchor hAnchor, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de977046", new Object[]{this, hAnchor, new Integer(i)});
        } else {
            linkToRight(hAnchor, i, Integer.MIN_VALUE);
        }
    }

    public void linkToStart(Constraint.HAnchor hAnchor, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af95558c", new Object[]{this, hAnchor, new Integer(i)});
        } else {
            linkToStart(hAnchor, i, Integer.MIN_VALUE);
        }
    }

    public void linkToEnd(Constraint.HAnchor hAnchor, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f17865e", new Object[]{this, hAnchor, new Integer(i), new Integer(i2)});
            return;
        }
        HAnchor hAnchor2 = this.mEnd;
        hAnchor2.mConnection = hAnchor;
        hAnchor2.mMargin = i;
        hAnchor2.mGoneMargin = i2;
        this.configMap.put("end", hAnchor2.toString());
    }

    public void linkToLeft(Constraint.HAnchor hAnchor, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("933304e8", new Object[]{this, hAnchor, new Integer(i), new Integer(i2)});
            return;
        }
        HAnchor hAnchor2 = this.mLeft;
        hAnchor2.mConnection = hAnchor;
        hAnchor2.mMargin = i;
        hAnchor2.mGoneMargin = i2;
        this.configMap.put("left", hAnchor2.toString());
    }

    public void linkToRight(Constraint.HAnchor hAnchor, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4570b7d", new Object[]{this, hAnchor, new Integer(i), new Integer(i2)});
            return;
        }
        HAnchor hAnchor2 = this.mRight;
        hAnchor2.mConnection = hAnchor;
        hAnchor2.mMargin = i;
        hAnchor2.mGoneMargin = i2;
        this.configMap.put("right", hAnchor2.toString());
    }

    public void linkToStart(Constraint.HAnchor hAnchor, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4315cef7", new Object[]{this, hAnchor, new Integer(i), new Integer(i2)});
            return;
        }
        HAnchor hAnchor2 = this.mStart;
        hAnchor2.mConnection = hAnchor;
        hAnchor2.mMargin = i;
        hAnchor2.mGoneMargin = i2;
        this.configMap.put("start", hAnchor2.toString());
    }

    public HChain(String str, String str2) {
        super(str);
        this.config = str2;
        this.type = new Helper.HelperType(Helper.typeMap.get(Helper.Type.HORIZONTAL_CHAIN));
        Map<String, String> convertConfigToMap = convertConfigToMap();
        this.configMap = convertConfigToMap;
        if (convertConfigToMap.containsKey("contains")) {
            Ref.addStringToReferences(this.configMap.get("contains"), this.references);
        }
    }
}
