package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.FloatRect;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MotionKeyTrigger extends MotionKey {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CROSS = "CROSS";
    public static final int KEY_TYPE = 5;
    public static final String NEGATIVE_CROSS = "negativeCross";
    public static final String POSITIVE_CROSS = "positiveCross";
    public static final String POST_LAYOUT = "postLayout";
    private static final String TAG = "KeyTrigger";
    public static final String TRIGGER_COLLISION_ID = "triggerCollisionId";
    public static final String TRIGGER_COLLISION_VIEW = "triggerCollisionView";
    public static final String TRIGGER_ID = "triggerID";
    public static final String TRIGGER_RECEIVER = "triggerReceiver";
    public static final String TRIGGER_SLACK = "triggerSlack";
    public static final int TYPE_CROSS = 312;
    public static final int TYPE_NEGATIVE_CROSS = 310;
    public static final int TYPE_POSITIVE_CROSS = 309;
    public static final int TYPE_POST_LAYOUT = 304;
    public static final int TYPE_TRIGGER_COLLISION_ID = 307;
    public static final int TYPE_TRIGGER_COLLISION_VIEW = 306;
    public static final int TYPE_TRIGGER_ID = 308;
    public static final int TYPE_TRIGGER_RECEIVER = 311;
    public static final int TYPE_TRIGGER_SLACK = 305;
    public static final int TYPE_VIEW_TRANSITION_ON_CROSS = 301;
    public static final int TYPE_VIEW_TRANSITION_ON_NEGATIVE_CROSS = 303;
    public static final int TYPE_VIEW_TRANSITION_ON_POSITIVE_CROSS = 302;
    public static final String VIEW_TRANSITION_ON_CROSS = "viewTransitionOnCross";
    public static final String VIEW_TRANSITION_ON_NEGATIVE_CROSS = "viewTransitionOnNegativeCross";
    public static final String VIEW_TRANSITION_ON_POSITIVE_CROSS = "viewTransitionOnPositiveCross";
    private float mFireLastPos;
    private int mTriggerCollisionId;
    private int mTriggerID;
    private int mTriggerReceiver;
    public int mViewTransitionOnCross;
    public int mViewTransitionOnNegativeCross;
    public int mViewTransitionOnPositiveCross;
    private int mCurveFit = -1;
    private String mCross = null;
    private String mNegativeCross = null;
    private String mPositiveCross = null;
    public float mTriggerSlack = 0.1f;
    private boolean mFireCrossReset = true;
    private boolean mFireNegativeReset = true;
    private boolean mFirePositiveReset = true;
    private float mFireThreshold = Float.NaN;
    private boolean mPostLayout = false;
    public FloatRect mCollisionRect = new FloatRect();
    public FloatRect mTargetRect = new FloatRect();

    public MotionKeyTrigger() {
        int i = MotionKey.UNSET;
        this.mTriggerReceiver = i;
        this.mTriggerID = i;
        this.mTriggerCollisionId = i;
        this.mViewTransitionOnNegativeCross = i;
        this.mViewTransitionOnPositiveCross = i;
        this.mViewTransitionOnCross = i;
        this.mType = 5;
        this.mCustom = new HashMap<>();
    }

    private void fireCustom(String str, MotionWidget motionWidget) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76e7c782", new Object[]{this, str, motionWidget});
            return;
        }
        if (str.length() == 1) {
            z = true;
        }
        if (!z) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.mCustom.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z || lowerCase.matches(str)) {
                CustomVariable customVariable = this.mCustom.get(str2);
                if (customVariable != null) {
                    customVariable.applyToWidget(motionWidget);
                }
            }
        }
    }

    public static /* synthetic */ Object ipc$super(MotionKeyTrigger motionKeyTrigger, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -672364841:
                return new Boolean(super.setValue(((Number) objArr[0]).intValue(), ((Number) objArr[1]).floatValue()));
            case -672361958:
                return new Boolean(super.setValue(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue()));
            case -672345621:
                return new Boolean(super.setValue(((Number) objArr[0]).intValue(), ((Boolean) objArr[1]).booleanValue()));
            case -235297766:
                return super.copy((MotionKey) objArr[0]);
            case 1099871003:
                return new Boolean(super.setValue(((Number) objArr[0]).intValue(), (String) objArr[1]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/motion/key/MotionKeyTrigger");
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(HashMap<String, SplineSet> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73d03d49", new Object[]{this, hashMap});
        }
    }

    public void conditionallyFire(float f, MotionWidget motionWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("175e953a", new Object[]{this, new Float(f), motionWidget});
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(HashSet<String> hashSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9934fc4", new Object[]{this, hashSet});
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7ec921a", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (i == 307) {
            this.mTriggerCollisionId = i2;
        } else if (i == 308) {
            this.mTriggerID = toInt(Integer.valueOf(i2));
        } else if (i != 311) {
            switch (i) {
                case 301:
                    this.mViewTransitionOnCross = i2;
                    break;
                case 302:
                    this.mViewTransitionOnPositiveCross = i2;
                    break;
                case 303:
                    this.mViewTransitionOnNegativeCross = i2;
                    break;
                default:
                    return super.setValue(i, i2);
            }
        } else {
            this.mTriggerReceiver = i2;
        }
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKey clone() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MotionKey) ipChange.ipc$dispatch("dbbed667", new Object[]{this}) : new MotionKeyTrigger().copy((MotionKey) this);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKeyTrigger copy(MotionKey motionKey) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MotionKeyTrigger) ipChange.ipc$dispatch("ce10d8e4", new Object[]{this, motionKey});
        }
        super.copy(motionKey);
        MotionKeyTrigger motionKeyTrigger = (MotionKeyTrigger) motionKey;
        this.mCurveFit = motionKeyTrigger.mCurveFit;
        this.mCross = motionKeyTrigger.mCross;
        this.mTriggerReceiver = motionKeyTrigger.mTriggerReceiver;
        this.mNegativeCross = motionKeyTrigger.mNegativeCross;
        this.mPositiveCross = motionKeyTrigger.mPositiveCross;
        this.mTriggerID = motionKeyTrigger.mTriggerID;
        this.mTriggerCollisionId = motionKeyTrigger.mTriggerCollisionId;
        this.mTriggerSlack = motionKeyTrigger.mTriggerSlack;
        this.mFireCrossReset = motionKeyTrigger.mFireCrossReset;
        this.mFireNegativeReset = motionKeyTrigger.mFireNegativeReset;
        this.mFirePositiveReset = motionKeyTrigger.mFirePositiveReset;
        this.mFireThreshold = motionKeyTrigger.mFireThreshold;
        this.mFireLastPos = motionKeyTrigger.mFireLastPos;
        this.mPostLayout = motionKeyTrigger.mPostLayout;
        this.mCollisionRect = motionKeyTrigger.mCollisionRect;
        this.mTargetRect = motionKeyTrigger.mTargetRect;
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a2, code lost:
        if (r7.equals("viewTransitionOnPositiveCross") == false) goto L_0x0027;
     */
    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int getId(java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.key.MotionKeyTrigger.getId(java.lang.String):int");
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7ec86d7", new Object[]{this, new Integer(i), new Float(f)})).booleanValue();
        }
        if (i != 305) {
            return super.setValue(i, f);
        }
        this.mTriggerSlack = f;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("418eb31b", new Object[]{this, new Integer(i), str})).booleanValue();
        }
        if (i == 309) {
            this.mPositiveCross = str;
        } else if (i == 310) {
            this.mNegativeCross = str;
        } else if (i != 312) {
            return super.setValue(i, str);
        } else {
            this.mCross = str;
        }
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7ecd1eb", new Object[]{this, new Integer(i), new Boolean(z)})).booleanValue();
        }
        if (i != 304) {
            return super.setValue(i, z);
        }
        this.mPostLayout = z;
        return true;
    }
}
