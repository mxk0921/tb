package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class KeyTrigger extends Key {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CROSS = "CROSS";
    public static final int KEY_TYPE = 5;
    public static final String NAME = "KeyTrigger";
    public static final String NEGATIVE_CROSS = "negativeCross";
    public static final String POSITIVE_CROSS = "positiveCross";
    public static final String POST_LAYOUT = "postLayout";
    private static final String TAG = "KeyTrigger";
    public static final String TRIGGER_COLLISION_ID = "triggerCollisionId";
    public static final String TRIGGER_COLLISION_VIEW = "triggerCollisionView";
    public static final String TRIGGER_ID = "triggerID";
    public static final String TRIGGER_RECEIVER = "triggerReceiver";
    public static final String TRIGGER_SLACK = "triggerSlack";
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
    public float mTriggerSlack = 0.1f;
    public RectF mCollisionRect = new RectF();
    public RectF mTargetRect = new RectF();
    public HashMap<String, Method> mMethodHashMap = new HashMap<>();
    private int mCurveFit = -1;
    private String mCross = null;
    private String mNegativeCross = null;
    private String mPositiveCross = null;
    private View mTriggerCollisionView = null;
    private boolean mFireCrossReset = true;
    private boolean mFireNegativeReset = true;
    private boolean mFirePositiveReset = true;
    private float mFireThreshold = Float.NaN;
    private boolean mPostLayout = false;

    public KeyTrigger() {
        int i = Key.UNSET;
        this.mViewTransitionOnNegativeCross = i;
        this.mViewTransitionOnPositiveCross = i;
        this.mViewTransitionOnCross = i;
        int i2 = Key.UNSET;
        this.mTriggerReceiver = i2;
        this.mTriggerID = i2;
        this.mTriggerCollisionId = i2;
        this.mType = 5;
        this.mCustomConstraints = new HashMap<>();
    }

    public static /* synthetic */ float access$002(KeyTrigger keyTrigger, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f736b935", new Object[]{keyTrigger, new Float(f)})).floatValue();
        }
        keyTrigger.mFireThreshold = f;
        return f;
    }

    public static /* synthetic */ String access$102(KeyTrigger keyTrigger, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe263bfa", new Object[]{keyTrigger, str});
        }
        keyTrigger.mNegativeCross = str;
        return str;
    }

    public static /* synthetic */ String access$202(KeyTrigger keyTrigger, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cde66f99", new Object[]{keyTrigger, str});
        }
        keyTrigger.mPositiveCross = str;
        return str;
    }

    public static /* synthetic */ String access$302(KeyTrigger keyTrigger, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9da6a338", new Object[]{keyTrigger, str});
        }
        keyTrigger.mCross = str;
        return str;
    }

    public static /* synthetic */ int access$400(KeyTrigger keyTrigger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5560ad0", new Object[]{keyTrigger})).intValue();
        }
        return keyTrigger.mTriggerID;
    }

    public static /* synthetic */ int access$402(KeyTrigger keyTrigger, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f45f1f7", new Object[]{keyTrigger, new Integer(i)})).intValue();
        }
        keyTrigger.mTriggerID = i;
        return i;
    }

    public static /* synthetic */ int access$500(KeyTrigger keyTrigger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c60bd791", new Object[]{keyTrigger})).intValue();
        }
        return keyTrigger.mTriggerCollisionId;
    }

    public static /* synthetic */ int access$502(KeyTrigger keyTrigger, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1549bd56", new Object[]{keyTrigger, new Integer(i)})).intValue();
        }
        keyTrigger.mTriggerCollisionId = i;
        return i;
    }

    public static /* synthetic */ boolean access$600(KeyTrigger keyTrigger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6c1a463", new Object[]{keyTrigger})).booleanValue();
        }
        return keyTrigger.mPostLayout;
    }

    public static /* synthetic */ boolean access$602(KeyTrigger keyTrigger, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b4dc897", new Object[]{keyTrigger, new Boolean(z)})).booleanValue();
        }
        keyTrigger.mPostLayout = z;
        return z;
    }

    public static /* synthetic */ int access$700(KeyTrigger keyTrigger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e7777113", new Object[]{keyTrigger})).intValue();
        }
        return keyTrigger.mTriggerReceiver;
    }

    public static /* synthetic */ int access$702(KeyTrigger keyTrigger, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("21515414", new Object[]{keyTrigger, new Integer(i)})).intValue();
        }
        keyTrigger.mTriggerReceiver = i;
        return i;
    }

    private void fire(String str, View view) {
        Method method;
        if (str != null) {
            if (str.startsWith(".")) {
                fireCustom(str, view);
                return;
            }
            if (this.mMethodHashMap.containsKey(str)) {
                method = this.mMethodHashMap.get(str);
                if (method == null) {
                    return;
                }
            } else {
                method = null;
            }
            if (method == null) {
                try {
                    method = view.getClass().getMethod(str, new Class[0]);
                    this.mMethodHashMap.put(str, method);
                } catch (NoSuchMethodException unused) {
                    this.mMethodHashMap.put(str, null);
                    Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + " " + Debug.getName(view));
                    return;
                }
            }
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception unused2) {
                Log.e("KeyTrigger", "Exception in call \"" + this.mCross + "\"on class " + view.getClass().getSimpleName() + " " + Debug.getName(view));
            }
        }
    }

    public static /* synthetic */ Object ipc$super(KeyTrigger keyTrigger, String str, Object... objArr) {
        if (str.hashCode() == -843737632) {
            return super.copy((Key) objArr[0]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/motion/widget/KeyTrigger");
    }

    private void setUpRect(RectF rectF, View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff939efb", new Object[]{this, rectF, view, new Boolean(z)});
            return;
        }
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(HashMap<String, ViewSpline> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73d03d49", new Object[]{this, hashMap});
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0102 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void conditionallyFire(float r10, android.view.View r11) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.KeyTrigger.conditionallyFire(float, android.view.View):void");
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key copy(Key key) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Key) ipChange.ipc$dispatch("cdb595e0", new Object[]{this, key});
        }
        super.copy(key);
        KeyTrigger keyTrigger = (KeyTrigger) key;
        this.mCurveFit = keyTrigger.mCurveFit;
        this.mCross = keyTrigger.mCross;
        this.mTriggerReceiver = keyTrigger.mTriggerReceiver;
        this.mNegativeCross = keyTrigger.mNegativeCross;
        this.mPositiveCross = keyTrigger.mPositiveCross;
        this.mTriggerID = keyTrigger.mTriggerID;
        this.mTriggerCollisionId = keyTrigger.mTriggerCollisionId;
        this.mTriggerCollisionView = keyTrigger.mTriggerCollisionView;
        this.mTriggerSlack = keyTrigger.mTriggerSlack;
        this.mFireCrossReset = keyTrigger.mFireCrossReset;
        this.mFireNegativeReset = keyTrigger.mFireNegativeReset;
        this.mFirePositiveReset = keyTrigger.mFirePositiveReset;
        this.mFireThreshold = keyTrigger.mFireThreshold;
        this.mFireLastPos = keyTrigger.mFireLastPos;
        this.mPostLayout = keyTrigger.mPostLayout;
        this.mCollisionRect = keyTrigger.mCollisionRect;
        this.mTargetRect = keyTrigger.mTargetRect;
        this.mMethodHashMap = keyTrigger.mMethodHashMap;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(HashSet<String> hashSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9934fc4", new Object[]{this, hashSet});
        }
    }

    public int getCurveFit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b3daae92", new Object[]{this})).intValue();
        }
        return this.mCurveFit;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78192133", new Object[]{this, context, attributeSet});
        } else {
            Loader.read(this, context.obtainStyledAttributes(attributeSet, R.styleable.KeyTrigger), context);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key clone() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Key) ipChange.ipc$dispatch("94336aea", new Object[]{this}) : new KeyTrigger().copy(this);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Loader {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final int COLLISION = 9;
        private static final int CROSS = 4;
        private static final int FRAME_POS = 8;
        private static final int NEGATIVE_CROSS = 1;
        private static final int POSITIVE_CROSS = 2;
        private static final int POST_LAYOUT = 10;
        private static final int TARGET_ID = 7;
        private static final int TRIGGER_ID = 6;
        private static final int TRIGGER_RECEIVER = 11;
        private static final int TRIGGER_SLACK = 5;
        private static final int VT_CROSS = 12;
        private static final int VT_NEGATIVE_CROSS = 13;
        private static final int VT_POSITIVE_CROSS = 14;
        private static SparseIntArray sAttrMap;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            sAttrMap = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyTrigger_framePosition, 8);
            sAttrMap.append(R.styleable.KeyTrigger_onCross, 4);
            sAttrMap.append(R.styleable.KeyTrigger_onNegativeCross, 1);
            sAttrMap.append(R.styleable.KeyTrigger_onPositiveCross, 2);
            sAttrMap.append(R.styleable.KeyTrigger_motionTarget, 7);
            sAttrMap.append(R.styleable.KeyTrigger_triggerId, 6);
            sAttrMap.append(R.styleable.KeyTrigger_triggerSlack, 5);
            sAttrMap.append(R.styleable.KeyTrigger_motion_triggerOnCollision, 9);
            sAttrMap.append(R.styleable.KeyTrigger_motion_postLayoutCollision, 10);
            sAttrMap.append(R.styleable.KeyTrigger_triggerReceiver, 11);
            sAttrMap.append(R.styleable.KeyTrigger_viewTransitionOnCross, 12);
            sAttrMap.append(R.styleable.KeyTrigger_viewTransitionOnNegativeCross, 13);
            sAttrMap.append(R.styleable.KeyTrigger_viewTransitionOnPositiveCross, 14);
        }

        private Loader() {
        }

        public static void read(KeyTrigger keyTrigger, TypedArray typedArray, Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("441b434e", new Object[]{keyTrigger, typedArray, context});
                return;
            }
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (sAttrMap.get(index)) {
                    case 1:
                        KeyTrigger.access$102(keyTrigger, typedArray.getString(index));
                        break;
                    case 2:
                        KeyTrigger.access$202(keyTrigger, typedArray.getString(index));
                        break;
                    case 3:
                    default:
                        Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + sAttrMap.get(index));
                        break;
                    case 4:
                        KeyTrigger.access$302(keyTrigger, typedArray.getString(index));
                        break;
                    case 5:
                        keyTrigger.mTriggerSlack = typedArray.getFloat(index, keyTrigger.mTriggerSlack);
                        break;
                    case 6:
                        KeyTrigger.access$402(keyTrigger, typedArray.getResourceId(index, KeyTrigger.access$400(keyTrigger)));
                        break;
                    case 7:
                        if (!MotionLayout.IS_IN_EDIT_MODE) {
                            if (typedArray.peekValue(index).type == 3) {
                                keyTrigger.mTargetString = typedArray.getString(index);
                                break;
                            } else {
                                keyTrigger.mTargetId = typedArray.getResourceId(index, keyTrigger.mTargetId);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, keyTrigger.mTargetId);
                            keyTrigger.mTargetId = resourceId;
                            if (resourceId == -1) {
                                keyTrigger.mTargetString = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        }
                    case 8:
                        int integer = typedArray.getInteger(index, keyTrigger.mFramePosition);
                        keyTrigger.mFramePosition = integer;
                        KeyTrigger.access$002(keyTrigger, (integer + 0.5f) / 100.0f);
                        break;
                    case 9:
                        KeyTrigger.access$502(keyTrigger, typedArray.getResourceId(index, KeyTrigger.access$500(keyTrigger)));
                        break;
                    case 10:
                        KeyTrigger.access$602(keyTrigger, typedArray.getBoolean(index, KeyTrigger.access$600(keyTrigger)));
                        break;
                    case 11:
                        KeyTrigger.access$702(keyTrigger, typedArray.getResourceId(index, KeyTrigger.access$700(keyTrigger)));
                        break;
                    case 12:
                        keyTrigger.mViewTransitionOnCross = typedArray.getResourceId(index, keyTrigger.mViewTransitionOnCross);
                        break;
                    case 13:
                        keyTrigger.mViewTransitionOnNegativeCross = typedArray.getResourceId(index, keyTrigger.mViewTransitionOnNegativeCross);
                        break;
                    case 14:
                        keyTrigger.mViewTransitionOnPositiveCross = typedArray.getResourceId(index, keyTrigger.mViewTransitionOnPositiveCross);
                        break;
                }
            }
        }
    }

    private void fireCustom(String str, View view) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de4993a", new Object[]{this, str, view});
            return;
        }
        if (str.length() == 1) {
            z = true;
        }
        if (!z) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.mCustomConstraints.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z || lowerCase.matches(str)) {
                ConstraintAttribute constraintAttribute = this.mCustomConstraints.get(str2);
                if (constraintAttribute != null) {
                    constraintAttribute.applyCustom(view);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a0, code lost:
        if (r7.equals("triggerCollisionId") == false) goto L_0x0024;
     */
    @Override // androidx.constraintlayout.motion.widget.Key
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setValue(java.lang.String r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.KeyTrigger.setValue(java.lang.String, java.lang.Object):void");
    }
}
