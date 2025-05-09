package androidx.constraintlayout.core.dsl;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Transition {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String mConstraintSetEnd;
    private String mConstraintSetStart;
    private String mId;
    private OnSwipe mOnSwipe = null;
    public final int UNSET = -1;
    private final int DEFAULT_DURATION = 400;
    private final float DEFAULT_STAGGER = 0.0f;
    private int mDefaultInterpolator = 0;
    private String mDefaultInterpolatorString = null;
    private int mDefaultInterpolatorID = -1;
    private int mDuration = 400;
    private float mStagger = 0.0f;
    private KeyFrames mKeyFrames = new KeyFrames();

    public Transition(String str, String str2) {
        this.mId = null;
        this.mConstraintSetEnd = null;
        this.mConstraintSetStart = null;
        this.mId = "default";
        this.mConstraintSetStart = str;
        this.mConstraintSetEnd = str2;
    }

    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return this.mId;
    }

    public void setDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55c2b106", new Object[]{this, new Integer(i)});
        } else {
            this.mDuration = i;
        }
    }

    public void setFrom(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bac98bd", new Object[]{this, str});
        } else {
            this.mConstraintSetStart = str;
        }
    }

    public void setId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb80bee", new Object[]{this, str});
        } else {
            this.mId = str;
        }
    }

    public void setKeyFrames(Keys keys) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("718d7f23", new Object[]{this, keys});
        } else {
            this.mKeyFrames.add(keys);
        }
    }

    public void setOnSwipe(OnSwipe onSwipe) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb27b54", new Object[]{this, onSwipe});
        } else {
            this.mOnSwipe = onSwipe;
        }
    }

    public void setStagger(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a98b60e", new Object[]{this, new Float(f)});
        } else {
            this.mStagger = f;
        }
    }

    public void setTo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12eac54e", new Object[]{this, str});
        } else {
            this.mConstraintSetEnd = str;
        }
    }

    public String toJson() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0e2e4d6", new Object[]{this});
        }
        return toString();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        String str = this.mId + ":{\nfrom:'" + this.mConstraintSetStart + "',\nto:'" + this.mConstraintSetEnd + "',\n";
        if (this.mDuration != 400) {
            str = str + "duration:" + this.mDuration + ",\n";
        }
        if (this.mStagger != 0.0f) {
            str = str + "stagger:" + this.mStagger + ",\n";
        }
        if (this.mOnSwipe != null) {
            str = str + this.mOnSwipe.toString();
        }
        return (str + this.mKeyFrames.toString()) + "},\n";
    }

    public Transition(String str, String str2, String str3) {
        this.mId = null;
        this.mConstraintSetEnd = null;
        this.mConstraintSetStart = null;
        this.mId = str;
        this.mConstraintSetStart = str2;
        this.mConstraintSetEnd = str3;
    }
}
