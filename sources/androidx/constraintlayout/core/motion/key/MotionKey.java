package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class MotionKey implements TypedValues {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALPHA = "alpha";
    public static final String CUSTOM = "CUSTOM";
    public static final String ELEVATION = "elevation";
    public static final String ROTATION = "rotationZ";
    public static final String ROTATION_X = "rotationX";
    public static final String SCALE_X = "scaleX";
    public static final String SCALE_Y = "scaleY";
    public static final String TRANSITION_PATH_ROTATE = "transitionPathRotate";
    public static final String TRANSLATION_X = "translationX";
    public static final String TRANSLATION_Y = "translationY";
    public static int UNSET = -1;
    public static final String VISIBILITY = "visibility";
    public HashMap<String, CustomVariable> mCustom;
    public int mFramePosition;
    public int mTargetId;
    public String mTargetString = null;
    public int mType;

    public MotionKey() {
        int i = UNSET;
        this.mFramePosition = i;
        this.mTargetId = i;
    }

    public abstract void addValues(HashMap<String, SplineSet> hashMap);

    public abstract MotionKey clone();

    public MotionKey copy(MotionKey motionKey) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MotionKey) ipChange.ipc$dispatch("f1f9a41a", new Object[]{this, motionKey});
        }
        this.mFramePosition = motionKey.mFramePosition;
        this.mTargetId = motionKey.mTargetId;
        this.mTargetString = motionKey.mTargetString;
        this.mType = motionKey.mType;
        return this;
    }

    public abstract void getAttributeNames(HashSet<String> hashSet);

    public int getFramePosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46dc2a7a", new Object[]{this})).intValue();
        }
        return this.mFramePosition;
    }

    public void setCustomAttribute(String str, int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb2cbdd7", new Object[]{this, str, new Integer(i), new Float(f)});
        } else {
            this.mCustom.put(str, new CustomVariable(str, i, f));
        }
    }

    public void setFramePosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bd51b68", new Object[]{this, new Integer(i)});
        } else {
            this.mFramePosition = i;
        }
    }

    public void setInterpolation(HashMap<String, Integer> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4928ef2a", new Object[]{this, hashMap});
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7ec86d7", new Object[]{this, new Integer(i), new Float(f)})).booleanValue();
        }
        return false;
    }

    public MotionKey setViewId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MotionKey) ipChange.ipc$dispatch("140c1afd", new Object[]{this, new Integer(i)});
        }
        this.mTargetId = i;
        return this;
    }

    public boolean toBoolean(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85b8f614", new Object[]{this, obj})).booleanValue();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return Boolean.parseBoolean(obj.toString());
    }

    public float toFloat(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8c0b5a74", new Object[]{this, obj})).floatValue();
        }
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        return Float.parseFloat(obj.toString());
    }

    public int toInt(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e83b6d0a", new Object[]{this, obj})).intValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return Integer.parseInt(obj.toString());
    }

    public boolean matches(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d15e8b88", new Object[]{this, str})).booleanValue();
        }
        String str2 = this.mTargetString;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    public void setCustomAttribute(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb2cc91a", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else {
            this.mCustom.put(str, new CustomVariable(str, i, i2));
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7ecd1eb", new Object[]{this, new Integer(i), new Boolean(z)})).booleanValue();
        }
        return false;
    }

    public void setCustomAttribute(String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb2d08eb", new Object[]{this, str, new Integer(i), new Boolean(z)});
        } else {
            this.mCustom.put(str, new CustomVariable(str, i, z));
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7ec921a", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (i != 100) {
            return false;
        }
        this.mFramePosition = i2;
        return true;
    }

    public void setCustomAttribute(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a02ae493", new Object[]{this, str, new Integer(i), str2});
        } else {
            this.mCustom.put(str, new CustomVariable(str, i, str2));
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("418eb31b", new Object[]{this, new Integer(i), str})).booleanValue();
        }
        if (i != 101) {
            return false;
        }
        this.mTargetString = str;
        return true;
    }
}
