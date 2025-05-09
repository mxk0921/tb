package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.dsl.Chain;
import androidx.constraintlayout.core.dsl.Constraint;
import androidx.constraintlayout.core.dsl.Helper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class VChain extends Chain {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private VAnchor mTop = new VAnchor(Constraint.VSide.TOP);
    private VAnchor mBottom = new VAnchor(Constraint.VSide.BOTTOM);
    private VAnchor mBaseline = new VAnchor(Constraint.VSide.BASELINE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class VAnchor extends Chain.Anchor {
        public VAnchor(Constraint.VSide vSide) {
            super(Constraint.Side.valueOf(vSide.name()));
        }
    }

    public VChain(String str) {
        super(str);
        this.type = new Helper.HelperType(Helper.typeMap.get(Helper.Type.VERTICAL_CHAIN));
    }

    public static /* synthetic */ Object ipc$super(VChain vChain, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/dsl/VChain");
    }

    public VAnchor getBaseline() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VAnchor) ipChange.ipc$dispatch("d3fcec81", new Object[]{this});
        }
        return this.mBaseline;
    }

    public VAnchor getBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VAnchor) ipChange.ipc$dispatch("3da5bd67", new Object[]{this});
        }
        return this.mBottom;
    }

    public VAnchor getTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VAnchor) ipChange.ipc$dispatch("45e707e5", new Object[]{this});
        }
        return this.mTop;
    }

    public void linkToBaseline(Constraint.VAnchor vAnchor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266703bc", new Object[]{this, vAnchor});
        } else {
            linkToBaseline(vAnchor, 0);
        }
    }

    public void linkToBottom(Constraint.VAnchor vAnchor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb4d16d6", new Object[]{this, vAnchor});
        } else {
            linkToBottom(vAnchor, 0);
        }
    }

    public void linkToTop(Constraint.VAnchor vAnchor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10c67076", new Object[]{this, vAnchor});
        } else {
            linkToTop(vAnchor, 0);
        }
    }

    public void linkToBaseline(Constraint.VAnchor vAnchor, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a679e6c7", new Object[]{this, vAnchor, new Integer(i)});
        } else {
            linkToBaseline(vAnchor, i, Integer.MIN_VALUE);
        }
    }

    public void linkToBottom(Constraint.VAnchor vAnchor, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e5636ed", new Object[]{this, vAnchor, new Integer(i)});
        } else {
            linkToBottom(vAnchor, i, Integer.MIN_VALUE);
        }
    }

    public void linkToTop(Constraint.VAnchor vAnchor, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("808114d", new Object[]{this, vAnchor, new Integer(i)});
        } else {
            linkToTop(vAnchor, i, Integer.MIN_VALUE);
        }
    }

    public void linkToBaseline(Constraint.VAnchor vAnchor, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28c3651c", new Object[]{this, vAnchor, new Integer(i), new Integer(i2)});
            return;
        }
        VAnchor vAnchor2 = this.mBaseline;
        vAnchor2.mConnection = vAnchor;
        vAnchor2.mMargin = i;
        vAnchor2.mGoneMargin = i2;
        this.configMap.put("baseline", vAnchor2.toString());
    }

    public void linkToBottom(Constraint.VAnchor vAnchor, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c7119b6", new Object[]{this, vAnchor, new Integer(i), new Integer(i2)});
            return;
        }
        VAnchor vAnchor2 = this.mBottom;
        vAnchor2.mConnection = vAnchor;
        vAnchor2.mMargin = i;
        vAnchor2.mGoneMargin = i2;
        this.configMap.put("bottom", vAnchor2.toString());
    }

    public void linkToTop(Constraint.VAnchor vAnchor, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8fa8b56", new Object[]{this, vAnchor, new Integer(i), new Integer(i2)});
            return;
        }
        VAnchor vAnchor2 = this.mTop;
        vAnchor2.mConnection = vAnchor;
        vAnchor2.mMargin = i;
        vAnchor2.mGoneMargin = i2;
        this.configMap.put("top", vAnchor2.toString());
    }

    public VChain(String str, String str2) {
        super(str);
        this.config = str2;
        this.type = new Helper.HelperType(Helper.typeMap.get(Helper.Type.VERTICAL_CHAIN));
        Map<String, String> convertConfigToMap = convertConfigToMap();
        this.configMap = convertConfigToMap;
        if (convertConfigToMap.containsKey("contains")) {
            Ref.addStringToReferences(this.configMap.get("contains"), this.references);
        }
    }
}
