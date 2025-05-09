package androidx.constraintlayout.core.dsl;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class KeyPositions extends Keys {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int[] mFrames;
    private String[] mTarget;
    private String mTransitionEasing = null;
    private Type mPositionType = null;
    private float[] mPercentWidth = null;
    private float[] mPercentHeight = null;
    private float[] mPercentX = null;
    private float[] mPercentY = null;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Type extends Enum<Type> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Type CARTESIAN = new Type("CARTESIAN", 0);
        public static final Type SCREEN = new Type("SCREEN", 1);
        public static final Type PATH = new Type("PATH", 2);
        private static final /* synthetic */ Type[] $VALUES = $values();

        private static /* synthetic */ Type[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Type[]) ipChange.ipc$dispatch("2494804e", new Object[0]) : new Type[]{CARTESIAN, SCREEN, PATH};
        }

        private Type(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(Type type, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/dsl/KeyPositions$Type");
        }

        public static Type valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Type) ipChange.ipc$dispatch("5d865679", new Object[]{str});
            }
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Type[]) ipChange.ipc$dispatch("35a7a02a", new Object[0]);
            }
            return (Type[]) $VALUES.clone();
        }
    }

    public KeyPositions(int i, String... strArr) {
        this.mFrames = null;
        this.mTarget = strArr;
        int[] iArr = new int[i];
        this.mFrames = iArr;
        float length = 100.0f / (iArr.length + 1);
        int i2 = 0;
        while (true) {
            int[] iArr2 = this.mFrames;
            if (i2 < iArr2.length) {
                iArr2[i2] = (int) ((i2 * length) + length);
                i2++;
            } else {
                return;
            }
        }
    }

    public static /* synthetic */ Object ipc$super(KeyPositions keyPositions, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/dsl/KeyPositions");
    }

    public int[] getFrames() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("425c721", new Object[]{this});
        }
        return this.mFrames;
    }

    public float[] getPercentHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("515ad4e4", new Object[]{this});
        }
        return this.mPercentHeight;
    }

    public float[] getPercentWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("ed9680a3", new Object[]{this});
        }
        return this.mPercentWidth;
    }

    public float[] getPercentX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("98e09cb1", new Object[]{this});
        }
        return this.mPercentX;
    }

    public float[] getPercentY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("9a957550", new Object[]{this});
        }
        return this.mPercentY;
    }

    public Type getPositionType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Type) ipChange.ipc$dispatch("261be212", new Object[]{this});
        }
        return this.mPositionType;
    }

    public String[] getTarget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("da3c49dd", new Object[]{this});
        }
        return this.mTarget;
    }

    public String getTransitionEasing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b433663", new Object[]{this});
        }
        return this.mTransitionEasing;
    }

    public void setFrames(int... iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6f28b7d", new Object[]{this, iArr});
        } else {
            this.mFrames = iArr;
        }
    }

    public void setPercentHeight(float... fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285aef9c", new Object[]{this, fArr});
        } else {
            this.mPercentHeight = fArr;
        }
    }

    public void setPercentWidth(float... fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7b7e55", new Object[]{this, fArr});
        } else {
            this.mPercentWidth = fArr;
        }
    }

    public void setPercentX(float... fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b3fca07", new Object[]{this, fArr});
        } else {
            this.mPercentX = fArr;
        }
    }

    public void setPercentY(float... fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80260548", new Object[]{this, fArr});
        } else {
            this.mPercentY = fArr;
        }
    }

    public void setPositionType(Type type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bafe8148", new Object[]{this, type});
        } else {
            this.mPositionType = type;
        }
    }

    public void setTransitionEasing(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99662473", new Object[]{this, str});
        } else {
            this.mTransitionEasing = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPositions:{\n");
        append(sb, "target", this.mTarget);
        sb.append("frame:");
        sb.append(Arrays.toString(this.mFrames));
        sb.append(",\n");
        if (this.mPositionType != null) {
            sb.append("type:'");
            sb.append(this.mPositionType);
            sb.append("',\n");
        }
        append(sb, "easing", this.mTransitionEasing);
        append(sb, "percentX", this.mPercentX);
        append(sb, "percentX", this.mPercentY);
        append(sb, "percentWidth", this.mPercentWidth);
        append(sb, "percentHeight", this.mPercentHeight);
        sb.append("},\n");
        return sb.toString();
    }
}
