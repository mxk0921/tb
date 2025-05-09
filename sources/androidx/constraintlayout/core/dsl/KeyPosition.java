package androidx.constraintlayout.core.dsl;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class KeyPosition extends Keys {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mFrame;
    private String mTarget;
    private String mTransitionEasing = null;
    private float mPercentWidth = Float.NaN;
    private float mPercentHeight = Float.NaN;
    private float mPercentX = Float.NaN;
    private float mPercentY = Float.NaN;
    private Type mPositionType = Type.CARTESIAN;

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
            return ipChange instanceof IpChange ? (Type[]) ipChange.ipc$dispatch("4b87ef1f", new Object[0]) : new Type[]{CARTESIAN, SCREEN, PATH};
        }

        private Type(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(Type type, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/dsl/KeyPosition$Type");
        }

        public static Type valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Type) ipChange.ipc$dispatch("c93d2794", new Object[]{str});
            }
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Type[]) ipChange.ipc$dispatch("85e363c3", new Object[0]);
            }
            return (Type[]) $VALUES.clone();
        }
    }

    public KeyPosition(String str, int i) {
        this.mTarget = null;
        this.mFrame = 0;
        this.mTarget = str;
        this.mFrame = i;
    }

    public static /* synthetic */ Object ipc$super(KeyPosition keyPosition, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/dsl/KeyPosition");
    }

    public int getFrames() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("df19fe16", new Object[]{this})).intValue();
        }
        return this.mFrame;
    }

    public float getPercentHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7c91f8d", new Object[]{this})).floatValue();
        }
        return this.mPercentHeight;
    }

    public float getPercentWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c5997fee", new Object[]{this})).floatValue();
        }
        return this.mPercentWidth;
    }

    public float getPercentX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1db4aa20", new Object[]{this})).floatValue();
        }
        return this.mPercentX;
    }

    public float getPercentY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1dc2c1a1", new Object[]{this})).floatValue();
        }
        return this.mPercentY;
    }

    public Type getPositionType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Type) ipChange.ipc$dispatch("a66b44db", new Object[]{this});
        }
        return this.mPositionType;
    }

    public String getTarget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("663f84d2", new Object[]{this});
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

    public void setFrames(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a8bacb4", new Object[]{this, new Integer(i)});
        } else {
            this.mFrame = i;
        }
    }

    public void setPercentHeight(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e886bdcf", new Object[]{this, new Float(f)});
        } else {
            this.mPercentHeight = f;
        }
    }

    public void setPercentWidth(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c92cf3f6", new Object[]{this, new Float(f)});
        } else {
            this.mPercentWidth = f;
        }
    }

    public void setPercentX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bb76a04", new Object[]{this, new Float(f)});
        } else {
            this.mPercentX = f;
        }
    }

    public void setPercentY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d6c42a3", new Object[]{this, new Float(f)});
        } else {
            this.mPercentY = f;
        }
    }

    public void setPositionType(Type type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e1b7df", new Object[]{this, type});
        } else {
            this.mPositionType = type;
        }
    }

    public void setTarget(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15b02e4", new Object[]{this, str});
        } else {
            this.mTarget = str;
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
        sb.append(this.mFrame);
        sb.append(",\n");
        if (this.mPositionType != null) {
            sb.append("type:'");
            sb.append(this.mPositionType);
            sb.append("',\n");
        }
        append(sb, "easing", this.mTransitionEasing);
        append(sb, "percentX", this.mPercentX);
        append(sb, "percentY", this.mPercentY);
        append(sb, "percentWidth", this.mPercentWidth);
        append(sb, "percentHeight", this.mPercentHeight);
        sb.append("},\n");
        return sb.toString();
    }
}
