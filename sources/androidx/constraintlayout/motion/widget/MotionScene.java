package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.StateSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import tb.f7l;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MotionScene {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ANTICIPATE = 6;
    public static final int BOUNCE = 4;
    private static final String CONSTRAINTSET_TAG = "ConstraintSet";
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DESKTOP = false;
    public static final int EASE_IN = 1;
    public static final int EASE_IN_OUT = 0;
    public static final int EASE_OUT = 2;
    private static final String INCLUDE_TAG = "include";
    private static final String INCLUDE_TAG_UC = "Include";
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    private static final String KEYFRAMESET_TAG = "KeyFrameSet";
    public static final int LAYOUT_CALL_MEASURE = 2;
    public static final int LAYOUT_HONOR_REQUEST = 1;
    public static final int LAYOUT_IGNORE_REQUEST = 0;
    public static final int LINEAR = 3;
    private static final int MIN_DURATION = 8;
    private static final String MOTIONSCENE_TAG = "MotionScene";
    private static final String ONCLICK_TAG = "OnClick";
    private static final String ONSWIPE_TAG = "OnSwipe";
    public static final int OVERSHOOT = 5;
    private static final int SPLINE_STRING = -1;
    private static final String STATESET_TAG = "StateSet";
    private static final String TAG = "MotionScene";
    public static final int TRANSITION_BACKWARD = 0;
    public static final int TRANSITION_FORWARD = 1;
    private static final String TRANSITION_TAG = "Transition";
    public static final int UNSET = -1;
    private static final String VIEW_TRANSITION = "ViewTransition";
    private MotionEvent mLastTouchDown;
    public float mLastTouchX;
    public float mLastTouchY;
    private final MotionLayout mMotionLayout;
    private boolean mRtl;
    private MotionLayout.MotionTracker mVelocityTracker;
    public final ViewTransitionController mViewTransitionController;
    public StateSet mStateSet = null;
    public Transition mCurrentTransition = null;
    private boolean mDisableAutoTransition = false;
    private ArrayList<Transition> mTransitionList = new ArrayList<>();
    private Transition mDefaultTransition = null;
    private ArrayList<Transition> mAbstractTransitionList = new ArrayList<>();
    private SparseArray<ConstraintSet> mConstraintSetMap = new SparseArray<>();
    private HashMap<String, Integer> mConstraintSetIdMap = new HashMap<>();
    private SparseIntArray mDeriveMap = new SparseIntArray();
    private int mDefaultDuration = 400;
    private int mLayoutDuringTransition = 0;
    private boolean mIgnoreTouch = false;
    private boolean mMotionOutsideRegion = false;

    public MotionScene(MotionLayout motionLayout) {
        this.mMotionLayout = motionLayout;
        this.mViewTransitionController = new ViewTransitionController(motionLayout);
    }

    public static /* synthetic */ int access$1000(MotionScene motionScene) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("545639ec", new Object[]{motionScene})).intValue();
        }
        return motionScene.mLayoutDuringTransition;
    }

    public static /* synthetic */ SparseArray access$1100(MotionScene motionScene) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseArray) ipChange.ipc$dispatch("4e5ccb21", new Object[]{motionScene});
        }
        return motionScene.mConstraintSetMap;
    }

    public static /* synthetic */ int access$1200(MotionScene motionScene, Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1fd02a25", new Object[]{motionScene, context, new Integer(i)})).intValue();
        }
        return motionScene.parseInclude(context, i);
    }

    public static /* synthetic */ MotionLayout access$700(MotionScene motionScene) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MotionLayout) ipChange.ipc$dispatch("392e1870", new Object[]{motionScene});
        }
        return motionScene.mMotionLayout;
    }

    public static /* synthetic */ int access$900(MotionScene motionScene) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fc6ee12", new Object[]{motionScene})).intValue();
        }
        return motionScene.mDefaultDuration;
    }

    private int getIndex(Transition transition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e2f7cae", new Object[]{this, transition})).intValue();
        }
        int access$300 = Transition.access$300(transition);
        if (access$300 != -1) {
            for (int i = 0; i < this.mTransitionList.size(); i++) {
                if (Transition.access$300(this.mTransitionList.get(i)) == access$300) {
                    return i;
                }
            }
            return -1;
        }
        throw new IllegalArgumentException("The transition must have an id");
    }

    public static String getLine(Context context, int i, XmlPullParser xmlPullParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7753724a", new Object[]{context, new Integer(i), xmlPullParser});
        }
        return ".(" + Debug.getName(context, i) + ".xml:" + xmlPullParser.getLineNumber() + ") \"" + xmlPullParser.getName() + "\"";
    }

    private int getRealID(int i) {
        int stateGetConstraintID;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15e06e80", new Object[]{this, new Integer(i)})).intValue();
        }
        StateSet stateSet = this.mStateSet;
        if (stateSet == null || (stateGetConstraintID = stateSet.stateGetConstraintID(i, -1, -1)) == -1) {
            return i;
        }
        return stateGetConstraintID;
    }

    private boolean isProcessingTouch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4380a8ed", new Object[]{this})).booleanValue();
        }
        if (this.mVelocityTracker != null) {
            return true;
        }
        return false;
    }

    private void parseInclude(Context context, XmlPullParser xmlPullParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31c8e6f6", new Object[]{this, context, xmlPullParser});
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.include);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == R.styleable.include_constraintSet) {
                parseInclude(context, obtainStyledAttributes.getResourceId(index, -1));
            }
        }
        obtainStyledAttributes.recycle();
    }

    private void parseMotionSceneTags(Context context, XmlPullParser xmlPullParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17fee08f", new Object[]{this, context, xmlPullParser});
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.MotionScene);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == R.styleable.MotionScene_defaultDuration) {
                int i2 = obtainStyledAttributes.getInt(index, this.mDefaultDuration);
                this.mDefaultDuration = i2;
                if (i2 < 8) {
                    this.mDefaultDuration = 8;
                }
            } else if (index == R.styleable.MotionScene_layoutDuringTransition) {
                this.mLayoutDuringTransition = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    private void readConstraintChain(int i, MotionLayout motionLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fda52c9", new Object[]{this, new Integer(i), motionLayout});
            return;
        }
        ConstraintSet constraintSet = this.mConstraintSetMap.get(i);
        constraintSet.derivedState = constraintSet.mIdString;
        int i2 = this.mDeriveMap.get(i);
        if (i2 > 0) {
            readConstraintChain(i2, motionLayout);
            ConstraintSet constraintSet2 = this.mConstraintSetMap.get(i2);
            if (constraintSet2 == null) {
                Log.e(TypedValues.MotionScene.NAME, "ERROR! invalid deriveConstraintsFrom: @id/" + Debug.getName(this.mMotionLayout.getContext(), i2));
                return;
            }
            constraintSet.derivedState += "/" + constraintSet2.derivedState;
            constraintSet.readFallback(constraintSet2);
        } else {
            constraintSet.derivedState += "  layout";
            constraintSet.readFallback(motionLayout);
        }
        constraintSet.applyDeltaFrom(constraintSet);
    }

    public static String stripID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82ca49c", new Object[]{str});
        }
        if (str == null) {
            return "";
        }
        int indexOf = str.indexOf(47);
        if (indexOf < 0) {
            return str;
        }
        return str.substring(indexOf + 1);
    }

    public void addOnClickListeners(MotionLayout motionLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a6ef3ea", new Object[]{this, motionLayout, new Integer(i)});
            return;
        }
        Iterator<Transition> it = this.mTransitionList.iterator();
        while (it.hasNext()) {
            Transition next = it.next();
            if (Transition.access$400(next).size() > 0) {
                Iterator it2 = Transition.access$400(next).iterator();
                while (it2.hasNext()) {
                    ((Transition.TransitionOnClick) it2.next()).removeOnClickListeners(motionLayout);
                }
            }
        }
        Iterator<Transition> it3 = this.mAbstractTransitionList.iterator();
        while (it3.hasNext()) {
            Transition next2 = it3.next();
            if (Transition.access$400(next2).size() > 0) {
                Iterator it4 = Transition.access$400(next2).iterator();
                while (it4.hasNext()) {
                    ((Transition.TransitionOnClick) it4.next()).removeOnClickListeners(motionLayout);
                }
            }
        }
        Iterator<Transition> it5 = this.mTransitionList.iterator();
        while (it5.hasNext()) {
            Transition next3 = it5.next();
            if (Transition.access$400(next3).size() > 0) {
                Iterator it6 = Transition.access$400(next3).iterator();
                while (it6.hasNext()) {
                    ((Transition.TransitionOnClick) it6.next()).addOnClickListeners(motionLayout, i, next3);
                }
            }
        }
        Iterator<Transition> it7 = this.mAbstractTransitionList.iterator();
        while (it7.hasNext()) {
            Transition next4 = it7.next();
            if (Transition.access$400(next4).size() > 0) {
                Iterator it8 = Transition.access$400(next4).iterator();
                while (it8.hasNext()) {
                    ((Transition.TransitionOnClick) it8.next()).addOnClickListeners(motionLayout, i, next4);
                }
            }
        }
    }

    public void addTransition(Transition transition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0679d75", new Object[]{this, transition});
            return;
        }
        int index = getIndex(transition);
        if (index == -1) {
            this.mTransitionList.add(transition);
        } else {
            this.mTransitionList.set(index, transition);
        }
    }

    public boolean applyViewTransition(int i, MotionController motionController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c51269e1", new Object[]{this, new Integer(i), motionController})).booleanValue();
        }
        return this.mViewTransitionController.applyViewTransition(i, motionController);
    }

    public Transition bestTransitionFor(int i, float f, float f2, MotionEvent motionEvent) {
        float f3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Transition) ipChange.ipc$dispatch("a8dc5e4d", new Object[]{this, new Integer(i), new Float(f), new Float(f2), motionEvent});
        }
        if (i == -1) {
            return this.mCurrentTransition;
        }
        List<Transition> transitionsWithState = getTransitionsWithState(i);
        RectF rectF = new RectF();
        float f4 = 0.0f;
        Transition transition = null;
        for (Transition transition2 : transitionsWithState) {
            if (!Transition.access$500(transition2) && Transition.access$200(transition2) != null) {
                Transition.access$200(transition2).setRTL(this.mRtl);
                RectF touchRegion = Transition.access$200(transition2).getTouchRegion(this.mMotionLayout, rectF);
                if (touchRegion == null || motionEvent == null || touchRegion.contains(motionEvent.getX(), motionEvent.getY())) {
                    RectF limitBoundsTo = Transition.access$200(transition2).getLimitBoundsTo(this.mMotionLayout, rectF);
                    if (limitBoundsTo == null || motionEvent == null || limitBoundsTo.contains(motionEvent.getX(), motionEvent.getY())) {
                        float dot = Transition.access$200(transition2).dot(f, f2);
                        if (Transition.access$200(transition2).mIsRotateMode && motionEvent != null) {
                            float x = motionEvent.getX() - Transition.access$200(transition2).mRotateCenterX;
                            float y = motionEvent.getY() - Transition.access$200(transition2).mRotateCenterY;
                            dot = ((float) (Math.atan2(f2 + y, f + x) - Math.atan2(x, y))) * 10.0f;
                        }
                        if (Transition.access$000(transition2) == i) {
                            f3 = -1.0f;
                        } else {
                            f3 = 1.1f;
                        }
                        float f5 = dot * f3;
                        if (f5 > f4) {
                            transition = transition2;
                            f4 = f5;
                        }
                    }
                }
            }
        }
        return transition;
    }

    public void disableAutoTransition(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b06f141", new Object[]{this, new Boolean(z)});
        } else {
            this.mDisableAutoTransition = z;
        }
    }

    public void enableViewTransition(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92db8775", new Object[]{this, new Integer(i), new Boolean(z)});
        } else {
            this.mViewTransitionController.enableViewTransition(i, z);
        }
    }

    public int gatPathMotionArc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("38cad557", new Object[]{this})).intValue();
        }
        Transition transition = this.mCurrentTransition;
        if (transition != null) {
            return Transition.access$1900(transition);
        }
        return -1;
    }

    public ConstraintSet getConstraintSet(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintSet) ipChange.ipc$dispatch("80193d8d", new Object[]{this, context, str});
        }
        for (int i = 0; i < this.mConstraintSetMap.size(); i++) {
            int keyAt = this.mConstraintSetMap.keyAt(i);
            if (str.equals(context.getResources().getResourceName(keyAt))) {
                return this.mConstraintSetMap.get(keyAt);
            }
        }
        return null;
    }

    public int[] getConstraintSetIds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("95b09034", new Object[]{this});
        }
        int size = this.mConstraintSetMap.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = this.mConstraintSetMap.keyAt(i);
        }
        return iArr;
    }

    public ArrayList<Transition> getDefinedTransitions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("847487cc", new Object[]{this});
        }
        return this.mTransitionList;
    }

    public int getDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a84", new Object[]{this})).intValue();
        }
        Transition transition = this.mCurrentTransition;
        if (transition != null) {
            return Transition.access$1800(transition);
        }
        return this.mDefaultDuration;
    }

    public int getEndId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d46221a", new Object[]{this})).intValue();
        }
        Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return -1;
        }
        return Transition.access$000(transition);
    }

    public Interpolator getInterpolator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Interpolator) ipChange.ipc$dispatch("bf078b59", new Object[]{this});
        }
        int access$1500 = Transition.access$1500(this.mCurrentTransition);
        if (access$1500 == -2) {
            return AnimationUtils.loadInterpolator(this.mMotionLayout.getContext(), Transition.access$1700(this.mCurrentTransition));
        }
        if (access$1500 == -1) {
            final Easing interpolator = Easing.getInterpolator(Transition.access$1600(this.mCurrentTransition));
            return new Interpolator() { // from class: androidx.constraintlayout.motion.widget.MotionScene.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.TimeInterpolator
                public float getInterpolation(float f) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("22c782db", new Object[]{this, new Float(f)})).floatValue();
                    }
                    return (float) interpolator.get(f);
                }
            };
        } else if (access$1500 == 0) {
            return new AccelerateDecelerateInterpolator();
        } else {
            if (access$1500 == 1) {
                return new AccelerateInterpolator();
            }
            if (access$1500 == 2) {
                return new DecelerateInterpolator();
            }
            if (access$1500 == 4) {
                return new BounceInterpolator();
            }
            if (access$1500 == 5) {
                return new OvershootInterpolator();
            }
            if (access$1500 != 6) {
                return null;
            }
            return new AnticipateInterpolator();
        }
    }

    public Key getKeyFrame(Context context, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Key) ipChange.ipc$dispatch("59d2322c", new Object[]{this, context, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return null;
        }
        Iterator it = Transition.access$1400(transition).iterator();
        while (it.hasNext()) {
            KeyFrames keyFrames = (KeyFrames) it.next();
            for (Integer num : keyFrames.getKeys()) {
                if (i2 == num.intValue()) {
                    Iterator<Key> it2 = keyFrames.getKeyFramesForView(num.intValue()).iterator();
                    while (it2.hasNext()) {
                        Key next = it2.next();
                        if (next.mFramePosition == i3 && next.mType == i) {
                            return next;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    public void getKeyFrames(MotionController motionController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d70861f", new Object[]{this, motionController});
            return;
        }
        Transition transition = this.mCurrentTransition;
        if (transition == null) {
            Transition transition2 = this.mDefaultTransition;
            if (transition2 != null) {
                Iterator it = Transition.access$1400(transition2).iterator();
                while (it.hasNext()) {
                    ((KeyFrames) it.next()).addFrames(motionController);
                }
                return;
            }
            return;
        }
        Iterator it2 = Transition.access$1400(transition).iterator();
        while (it2.hasNext()) {
            ((KeyFrames) it2.next()).addFrames(motionController);
        }
    }

    public int[] getMatchingStateLabels(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("c5fefc29", new Object[]{this, strArr});
        }
        int size = this.mConstraintSetMap.size();
        int[] iArr = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintSet valueAt = this.mConstraintSetMap.valueAt(i2);
            int keyAt = this.mConstraintSetMap.keyAt(i2);
            if (valueAt.matchesLabels(strArr)) {
                valueAt.getStateLabels();
                iArr[i] = keyAt;
                i++;
            }
        }
        return Arrays.copyOf(iArr, i);
    }

    public float getMaxAcceleration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28cf1745", new Object[]{this})).floatValue();
        }
        Transition transition = this.mCurrentTransition;
        if (transition == null || Transition.access$200(transition) == null) {
            return 0.0f;
        }
        return Transition.access$200(this.mCurrentTransition).getMaxAcceleration();
    }

    public float getMaxVelocity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e105e022", new Object[]{this})).floatValue();
        }
        Transition transition = this.mCurrentTransition;
        if (transition == null || Transition.access$200(transition) == null) {
            return 0.0f;
        }
        return Transition.access$200(this.mCurrentTransition).getMaxVelocity();
    }

    public boolean getMoveWhenScrollAtTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29af28ff", new Object[]{this})).booleanValue();
        }
        Transition transition = this.mCurrentTransition;
        if (transition == null || Transition.access$200(transition) == null) {
            return false;
        }
        return Transition.access$200(this.mCurrentTransition).getMoveWhenScrollAtTop();
    }

    public float getPathPercent(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d2af4c92", new Object[]{this, view, new Integer(i)})).floatValue();
        }
        return 0.0f;
    }

    public float getProgressDirection(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("77cfc0d3", new Object[]{this, new Float(f), new Float(f2)})).floatValue();
        }
        Transition transition = this.mCurrentTransition;
        if (transition == null || Transition.access$200(transition) == null) {
            return 0.0f;
        }
        return Transition.access$200(this.mCurrentTransition).getProgressDirection(f, f2);
    }

    public int getSpringBoundary() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b955447", new Object[]{this})).intValue();
        }
        Transition transition = this.mCurrentTransition;
        if (transition == null || Transition.access$200(transition) == null) {
            return 0;
        }
        return Transition.access$200(this.mCurrentTransition).getSpringBoundary();
    }

    public float getSpringDamping() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9fe64376", new Object[]{this})).floatValue();
        }
        Transition transition = this.mCurrentTransition;
        if (transition == null || Transition.access$200(transition) == null) {
            return 0.0f;
        }
        return Transition.access$200(this.mCurrentTransition).getSpringDamping();
    }

    public float getSpringMass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f12ac78e", new Object[]{this})).floatValue();
        }
        Transition transition = this.mCurrentTransition;
        if (transition == null || Transition.access$200(transition) == null) {
            return 0.0f;
        }
        return Transition.access$200(this.mCurrentTransition).getSpringMass();
    }

    public float getSpringStiffiness() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a377a6b2", new Object[]{this})).floatValue();
        }
        Transition transition = this.mCurrentTransition;
        if (transition == null || Transition.access$200(transition) == null) {
            return 0.0f;
        }
        return Transition.access$200(this.mCurrentTransition).getSpringStiffness();
    }

    public float getSpringStopThreshold() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c46f57bd", new Object[]{this})).floatValue();
        }
        Transition transition = this.mCurrentTransition;
        if (transition == null || Transition.access$200(transition) == null) {
            return 0.0f;
        }
        return Transition.access$200(this.mCurrentTransition).getSpringStopThreshold();
    }

    public float getStaggered() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f6c4bfcd", new Object[]{this})).floatValue();
        }
        Transition transition = this.mCurrentTransition;
        if (transition != null) {
            return Transition.access$2000(transition);
        }
        return 0.0f;
    }

    public int getStartId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("588931e1", new Object[]{this})).intValue();
        }
        Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return -1;
        }
        return Transition.access$100(transition);
    }

    public Transition getTransitionById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Transition) ipChange.ipc$dispatch("7bef2e8f", new Object[]{this, new Integer(i)});
        }
        Iterator<Transition> it = this.mTransitionList.iterator();
        while (it.hasNext()) {
            Transition next = it.next();
            if (Transition.access$300(next) == i) {
                return next;
            }
        }
        return null;
    }

    public int getTransitionDirection(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b705a15b", new Object[]{this, new Integer(i)})).intValue();
        }
        Iterator<Transition> it = this.mTransitionList.iterator();
        while (it.hasNext()) {
            if (Transition.access$100(it.next()) == i) {
                return 0;
            }
        }
        return 1;
    }

    public List<Transition> getTransitionsWithState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ba3b93ae", new Object[]{this, new Integer(i)});
        }
        int realID = getRealID(i);
        ArrayList arrayList = new ArrayList();
        Iterator<Transition> it = this.mTransitionList.iterator();
        while (it.hasNext()) {
            Transition next = it.next();
            if (Transition.access$100(next) == realID || Transition.access$000(next) == realID) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public boolean hasKeyFramePosition(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c71d9ccd", new Object[]{this, view, new Integer(i)})).booleanValue();
        }
        Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return false;
        }
        Iterator it = Transition.access$1400(transition).iterator();
        while (it.hasNext()) {
            Iterator<Key> it2 = ((KeyFrames) it.next()).getKeyFramesForView(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().mFramePosition == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isViewTransitionEnabled(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c72e9483", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return this.mViewTransitionController.isViewTransitionEnabled(i);
    }

    public int lookUpConstraintId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("38349f96", new Object[]{this, str})).intValue();
        }
        Integer num = this.mConstraintSetIdMap.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public String lookUpConstraintName(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3170586", new Object[]{this, new Integer(i)});
        }
        for (Map.Entry<String, Integer> entry : this.mConstraintSetIdMap.entrySet()) {
            Integer value = entry.getValue();
            if (value != null && value.intValue() == i) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    public void processScrollMove(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db94dd14", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        Transition transition = this.mCurrentTransition;
        if (transition != null && Transition.access$200(transition) != null) {
            Transition.access$200(this.mCurrentTransition).scrollMove(f, f2);
        }
    }

    public void processScrollUp(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62688f5e", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        Transition transition = this.mCurrentTransition;
        if (transition != null && Transition.access$200(transition) != null) {
            Transition.access$200(this.mCurrentTransition).scrollUp(f, f2);
        }
    }

    public void removeTransition(Transition transition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be6f7c18", new Object[]{this, transition});
            return;
        }
        int index = getIndex(transition);
        if (index != -1) {
            this.mTransitionList.remove(index);
        }
    }

    public void setConstraintSet(int i, ConstraintSet constraintSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93c4d1ac", new Object[]{this, new Integer(i), constraintSet});
        } else {
            this.mConstraintSetMap.put(i, constraintSet);
        }
    }

    public void setDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55c2b106", new Object[]{this, new Integer(i)});
            return;
        }
        Transition transition = this.mCurrentTransition;
        if (transition != null) {
            transition.setDuration(i);
        } else {
            this.mDefaultDuration = i;
        }
    }

    public void setKeyframe(View view, int i, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77feb38e", new Object[]{this, view, new Integer(i), str, obj});
            return;
        }
        Transition transition = this.mCurrentTransition;
        if (transition != null) {
            Iterator it = Transition.access$1400(transition).iterator();
            while (it.hasNext()) {
                Iterator<Key> it2 = ((KeyFrames) it.next()).getKeyFramesForView(view.getId()).iterator();
                while (it2.hasNext()) {
                    if (it2.next().mFramePosition == i && obj != null) {
                        Float f = (Float) obj;
                    }
                }
            }
        }
    }

    public void setRtl(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c129585", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mRtl = z;
        Transition transition = this.mCurrentTransition;
        if (transition != null && Transition.access$200(transition) != null) {
            Transition.access$200(this.mCurrentTransition).setRTL(this.mRtl);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
        if (r2 != (-1)) goto L_0x003c;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setTransition(int r7, int r8) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = androidx.constraintlayout.motion.widget.MotionScene.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0022
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r7)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r8)
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r2 = 0
            r8[r2] = r6
            r2 = 1
            r8[r2] = r1
            r1 = 2
            r8[r1] = r7
            java.lang.String r7 = "b551353e"
            r0.ipc$dispatch(r7, r8)
            return
        L_0x0022:
            androidx.constraintlayout.widget.StateSet r0 = r6.mStateSet
            r1 = -1
            if (r0 == 0) goto L_0x003a
            int r0 = r0.stateGetConstraintID(r7, r1, r1)
            if (r0 == r1) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r0 = r7
        L_0x002f:
            androidx.constraintlayout.widget.StateSet r2 = r6.mStateSet
            int r2 = r2.stateGetConstraintID(r8, r1, r1)
            if (r2 == r1) goto L_0x0038
            goto L_0x003c
        L_0x0038:
            r2 = r8
            goto L_0x003c
        L_0x003a:
            r0 = r7
            goto L_0x0038
        L_0x003c:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r3 = r6.mCurrentTransition
            if (r3 == 0) goto L_0x004f
            int r3 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r3)
            if (r3 != r8) goto L_0x004f
            androidx.constraintlayout.motion.widget.MotionScene$Transition r3 = r6.mCurrentTransition
            int r3 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$100(r3)
            if (r3 != r7) goto L_0x004f
            return
        L_0x004f:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r3 = r6.mTransitionList
            java.util.Iterator r3 = r3.iterator()
        L_0x0055:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x008f
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r4 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r4
            int r5 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r4)
            if (r5 != r2) goto L_0x006d
            int r5 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$100(r4)
            if (r5 == r0) goto L_0x0079
        L_0x006d:
            int r5 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r4)
            if (r5 != r8) goto L_0x0055
            int r5 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$100(r4)
            if (r5 != r7) goto L_0x0055
        L_0x0079:
            r6.mCurrentTransition = r4
            if (r4 == 0) goto L_0x008e
            androidx.constraintlayout.motion.widget.TouchResponse r7 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r4)
            if (r7 == 0) goto L_0x008e
            androidx.constraintlayout.motion.widget.MotionScene$Transition r7 = r6.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r7 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r7)
            boolean r8 = r6.mRtl
            r7.setRTL(r8)
        L_0x008e:
            return
        L_0x008f:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r7 = r6.mDefaultTransition
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r3 = r6.mAbstractTransitionList
            java.util.Iterator r3 = r3.iterator()
        L_0x0097:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00ab
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r4 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r4
            int r5 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r4)
            if (r5 != r8) goto L_0x0097
            r7 = r4
            goto L_0x0097
        L_0x00ab:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r8 = new androidx.constraintlayout.motion.widget.MotionScene$Transition
            r8.<init>(r6, r7)
            androidx.constraintlayout.motion.widget.MotionScene.Transition.access$102(r8, r0)
            androidx.constraintlayout.motion.widget.MotionScene.Transition.access$002(r8, r2)
            if (r0 == r1) goto L_0x00bd
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r7 = r6.mTransitionList
            r7.add(r8)
        L_0x00bd:
            r6.mCurrentTransition = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionScene.setTransition(int, int):void");
    }

    public void setupTouch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86880e49", new Object[]{this});
            return;
        }
        Transition transition = this.mCurrentTransition;
        if (transition != null && Transition.access$200(transition) != null) {
            Transition.access$200(this.mCurrentTransition).setupTouch();
        }
    }

    public boolean supportTouch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("725da53b", new Object[]{this})).booleanValue();
        }
        Iterator<Transition> it = this.mTransitionList.iterator();
        while (it.hasNext()) {
            if (Transition.access$200(it.next()) != null) {
                return true;
            }
        }
        Transition transition = this.mCurrentTransition;
        if (transition == null || Transition.access$200(transition) == null) {
            return false;
        }
        return true;
    }

    public boolean validateLayout(MotionLayout motionLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7228b8c6", new Object[]{this, motionLayout})).booleanValue();
        }
        if (motionLayout == this.mMotionLayout && motionLayout.mScene == this) {
            return true;
        }
        return false;
    }

    public void viewTransition(int i, View... viewArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ebdf0df", new Object[]{this, new Integer(i), viewArr});
        } else {
            this.mViewTransitionController.viewTransition(i, viewArr);
        }
    }

    private int getId(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("863b256d", new Object[]{this, context, str})).intValue();
        }
        int identifier = str.contains("/") ? context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName()) : -1;
        if (identifier != -1) {
            return identifier;
        }
        if (str.length() > 1) {
            return Integer.parseInt(str.substring(1));
        }
        Log.e(TypedValues.MotionScene.NAME, "error in parsing id");
        return identifier;
    }

    public int getAutoCompleteMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1b213b", new Object[]{this})).intValue();
        }
        Transition transition = this.mCurrentTransition;
        if (transition == null || Transition.access$200(transition) == null) {
            return 0;
        }
        return Transition.access$200(this.mCurrentTransition).getAutoCompleteMode();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Transition {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int AUTO_ANIMATE_TO_END = 4;
        public static final int AUTO_ANIMATE_TO_START = 3;
        public static final int AUTO_JUMP_TO_END = 2;
        public static final int AUTO_JUMP_TO_START = 1;
        public static final int AUTO_NONE = 0;
        public static final int INTERPOLATE_ANTICIPATE = 6;
        public static final int INTERPOLATE_BOUNCE = 4;
        public static final int INTERPOLATE_EASE_IN = 1;
        public static final int INTERPOLATE_EASE_IN_OUT = 0;
        public static final int INTERPOLATE_EASE_OUT = 2;
        public static final int INTERPOLATE_LINEAR = 3;
        public static final int INTERPOLATE_OVERSHOOT = 5;
        public static final int INTERPOLATE_REFERENCE_ID = -2;
        public static final int INTERPOLATE_SPLINE_STRING = -1;
        public static final int TRANSITION_FLAG_FIRST_DRAW = 1;
        public static final int TRANSITION_FLAG_INTERCEPT_TOUCH = 4;
        public static final int TRANSITION_FLAG_INTRA_AUTO = 2;
        private int mAutoTransition;
        private int mConstraintSetEnd;
        private int mConstraintSetStart;
        private int mDefaultInterpolator;
        private int mDefaultInterpolatorID;
        private String mDefaultInterpolatorString;
        private boolean mDisable;
        private int mDuration;
        private int mId;
        private boolean mIsAbstract;
        private ArrayList<KeyFrames> mKeyFramesList;
        private int mLayoutDuringTransition;
        private final MotionScene mMotionScene;
        private ArrayList<TransitionOnClick> mOnClicks;
        private int mPathMotionArc;
        private float mStagger;
        private TouchResponse mTouchResponse;
        private int mTransitionFlags;

        public Transition(MotionScene motionScene, Transition transition) {
            this.mId = -1;
            this.mIsAbstract = false;
            this.mConstraintSetEnd = -1;
            this.mConstraintSetStart = -1;
            this.mDefaultInterpolator = 0;
            this.mDefaultInterpolatorString = null;
            this.mDefaultInterpolatorID = -1;
            this.mDuration = 400;
            this.mStagger = 0.0f;
            this.mKeyFramesList = new ArrayList<>();
            this.mTouchResponse = null;
            this.mOnClicks = new ArrayList<>();
            this.mAutoTransition = 0;
            this.mDisable = false;
            this.mPathMotionArc = -1;
            this.mLayoutDuringTransition = 0;
            this.mTransitionFlags = 0;
            this.mMotionScene = motionScene;
            this.mDuration = MotionScene.access$900(motionScene);
            if (transition != null) {
                this.mPathMotionArc = transition.mPathMotionArc;
                this.mDefaultInterpolator = transition.mDefaultInterpolator;
                this.mDefaultInterpolatorString = transition.mDefaultInterpolatorString;
                this.mDefaultInterpolatorID = transition.mDefaultInterpolatorID;
                this.mDuration = transition.mDuration;
                this.mKeyFramesList = transition.mKeyFramesList;
                this.mStagger = transition.mStagger;
                this.mLayoutDuringTransition = transition.mLayoutDuringTransition;
            }
        }

        public static /* synthetic */ int access$000(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("38d37e82", new Object[]{transition})).intValue();
            }
            return transition.mConstraintSetEnd;
        }

        public static /* synthetic */ int access$002(Transition transition, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("535d8785", new Object[]{transition, new Integer(i)})).intValue();
            }
            transition.mConstraintSetEnd = i;
            return i;
        }

        public static /* synthetic */ int access$100(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1bff31c3", new Object[]{transition})).intValue();
            }
            return transition.mConstraintSetStart;
        }

        public static /* synthetic */ int access$102(Transition transition, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d5a83c64", new Object[]{transition, new Integer(i)})).intValue();
            }
            transition.mConstraintSetStart = i;
            return i;
        }

        public static /* synthetic */ boolean access$1300(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("53aa8d85", new Object[]{transition})).booleanValue();
            }
            return transition.mIsAbstract;
        }

        public static /* synthetic */ ArrayList access$1400(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("270b2f9c", new Object[]{transition});
            }
            return transition.mKeyFramesList;
        }

        public static /* synthetic */ int access$1500(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1a01f3f6", new Object[]{transition})).intValue();
            }
            return transition.mDefaultInterpolator;
        }

        public static /* synthetic */ String access$1600(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("cef3ddc", new Object[]{transition});
            }
            return transition.mDefaultInterpolatorString;
        }

        public static /* synthetic */ int access$1700(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e0595a78", new Object[]{transition})).intValue();
            }
            return transition.mDefaultInterpolatorID;
        }

        public static /* synthetic */ int access$1800(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c3850db9", new Object[]{transition})).intValue();
            }
            return transition.mDuration;
        }

        public static /* synthetic */ int access$1900(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a6b0c0fa", new Object[]{transition})).intValue();
            }
            return transition.mPathMotionArc;
        }

        public static /* synthetic */ TouchResponse access$200(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TouchResponse) ipChange.ipc$dispatch("8665dd36", new Object[]{transition});
            }
            return transition.mTouchResponse;
        }

        public static /* synthetic */ float access$2000(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2c72288d", new Object[]{transition})).floatValue();
            }
            return transition.mStagger;
        }

        public static /* synthetic */ TouchResponse access$202(Transition transition, TouchResponse touchResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TouchResponse) ipChange.ipc$dispatch("6878b927", new Object[]{transition, touchResponse});
            }
            transition.mTouchResponse = touchResponse;
            return touchResponse;
        }

        public static /* synthetic */ int access$300(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e2569845", new Object[]{transition})).intValue();
            }
            return transition.mId;
        }

        public static /* synthetic */ ArrayList access$400(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("ea2ea7ed", new Object[]{transition});
            }
            return transition.mOnClicks;
        }

        public static /* synthetic */ boolean access$500(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a8adfed8", new Object[]{transition})).booleanValue();
            }
            return transition.mDisable;
        }

        public static /* synthetic */ int access$600(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8bd9b208", new Object[]{transition})).intValue();
            }
            return transition.mAutoTransition;
        }

        public static /* synthetic */ MotionScene access$800(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MotionScene) ipChange.ipc$dispatch("2d6d3d66", new Object[]{transition});
            }
            return transition.mMotionScene;
        }

        private void fillFromAttributeList(MotionScene motionScene, Context context, AttributeSet attributeSet) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("79b09a91", new Object[]{this, motionScene, context, attributeSet});
                return;
            }
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Transition);
            fill(motionScene, context, obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }

        public void addKeyFrame(KeyFrames keyFrames) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("431ceb7a", new Object[]{this, keyFrames});
            } else {
                this.mKeyFramesList.add(keyFrames);
            }
        }

        public void addOnClick(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("256d6c2f", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            Iterator<TransitionOnClick> it = this.mOnClicks.iterator();
            while (it.hasNext()) {
                TransitionOnClick next = it.next();
                if (next.mTargetId == i) {
                    next.mMode = i2;
                    return;
                }
            }
            this.mOnClicks.add(new TransitionOnClick(this, i, i2));
        }

        public String debugString(Context context) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f2ad1ee3", new Object[]{this, context});
            }
            if (this.mConstraintSetStart == -1) {
                str = "null";
            } else {
                str = context.getResources().getResourceEntryName(this.mConstraintSetStart);
            }
            if (this.mConstraintSetEnd == -1) {
                return str + " -> null";
            }
            return str + " -> " + context.getResources().getResourceEntryName(this.mConstraintSetEnd);
        }

        public int getAutoTransition() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e5482cd4", new Object[]{this})).intValue();
            }
            return this.mAutoTransition;
        }

        public int getDuration() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ed837a84", new Object[]{this})).intValue();
            }
            return this.mDuration;
        }

        public int getEndConstraintSetId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("759f4fd5", new Object[]{this})).intValue();
            }
            return this.mConstraintSetEnd;
        }

        public int getId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1ddaaf0b", new Object[]{this})).intValue();
            }
            return this.mId;
        }

        public List<KeyFrames> getKeyFrameList() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("1661cd1e", new Object[]{this});
            }
            return this.mKeyFramesList;
        }

        public int getLayoutDuringTransition() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3b104e30", new Object[]{this})).intValue();
            }
            return this.mLayoutDuringTransition;
        }

        public List<TransitionOnClick> getOnClickList() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("a60f954f", new Object[]{this});
            }
            return this.mOnClicks;
        }

        public int getPathMotionArc() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6f745c5b", new Object[]{this})).intValue();
            }
            return this.mPathMotionArc;
        }

        public float getStagger() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("62b83c6e", new Object[]{this})).floatValue();
            }
            return this.mStagger;
        }

        public int getStartConstraintSetId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a1745b6e", new Object[]{this})).intValue();
            }
            return this.mConstraintSetStart;
        }

        public TouchResponse getTouchResponse() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TouchResponse) ipChange.ipc$dispatch("edb1496", new Object[]{this});
            }
            return this.mTouchResponse;
        }

        public boolean isEnabled() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56f023c2", new Object[]{this})).booleanValue();
            }
            return true ^ this.mDisable;
        }

        public boolean isTransitionFlag(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9925ec15", new Object[]{this, new Integer(i)})).booleanValue();
            }
            if ((i & this.mTransitionFlags) != 0) {
                return true;
            }
            return false;
        }

        public void removeOnClick(int i) {
            TransitionOnClick transitionOnClick;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32eaf4b7", new Object[]{this, new Integer(i)});
                return;
            }
            Iterator<TransitionOnClick> it = this.mOnClicks.iterator();
            while (true) {
                if (!it.hasNext()) {
                    transitionOnClick = null;
                    break;
                }
                transitionOnClick = it.next();
                if (transitionOnClick.mTargetId == i) {
                    break;
                }
            }
            if (transitionOnClick != null) {
                this.mOnClicks.remove(transitionOnClick);
            }
        }

        public void setAutoTransition(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1202a1b6", new Object[]{this, new Integer(i)});
            } else {
                this.mAutoTransition = i;
            }
        }

        public void setDuration(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55c2b106", new Object[]{this, new Integer(i)});
            } else {
                this.mDuration = Math.max(i, 8);
            }
        }

        public void setEnabled(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4bb1a20e", new Object[]{this, new Boolean(z)});
            } else {
                this.mDisable = !z;
            }
        }

        public void setInterpolatorInfo(int i, String str, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10597b34", new Object[]{this, new Integer(i), str, new Integer(i2)});
                return;
            }
            this.mDefaultInterpolator = i;
            this.mDefaultInterpolatorString = str;
            this.mDefaultInterpolatorID = i2;
        }

        public void setLayoutDuringTransition(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f11f7da", new Object[]{this, new Integer(i)});
            } else {
                this.mLayoutDuringTransition = i;
            }
        }

        public void setOnSwipe(OnSwipe onSwipe) {
            TouchResponse touchResponse;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aa66773a", new Object[]{this, onSwipe});
                return;
            }
            if (onSwipe == null) {
                touchResponse = null;
            } else {
                touchResponse = new TouchResponse(MotionScene.access$700(this.mMotionScene), onSwipe);
            }
            this.mTouchResponse = touchResponse;
        }

        public void setOnTouchUp(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b926fde3", new Object[]{this, new Integer(i)});
                return;
            }
            TouchResponse touchResponse = getTouchResponse();
            if (touchResponse != null) {
                touchResponse.setTouchUpMode(i);
            }
        }

        public void setPathMotionArc(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("164325a7", new Object[]{this, new Integer(i)});
            } else {
                this.mPathMotionArc = i;
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

        public void setTransitionFlag(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bc76c1d9", new Object[]{this, new Integer(i)});
            } else {
                this.mTransitionFlags = i;
            }
        }

        private void fill(MotionScene motionScene, Context context, TypedArray typedArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("92d80a0e", new Object[]{this, motionScene, context, typedArray});
                return;
            }
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                if (index == R.styleable.Transition_constraintSetEnd) {
                    this.mConstraintSetEnd = typedArray.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.mConstraintSetEnd);
                    if ("layout".equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        constraintSet.load(context, this.mConstraintSetEnd);
                        MotionScene.access$1100(motionScene).append(this.mConstraintSetEnd, constraintSet);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.mConstraintSetEnd = MotionScene.access$1200(motionScene, context, this.mConstraintSetEnd);
                    }
                } else if (index == R.styleable.Transition_constraintSetStart) {
                    this.mConstraintSetStart = typedArray.getResourceId(index, this.mConstraintSetStart);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.mConstraintSetStart);
                    if ("layout".equals(resourceTypeName2)) {
                        ConstraintSet constraintSet2 = new ConstraintSet();
                        constraintSet2.load(context, this.mConstraintSetStart);
                        MotionScene.access$1100(motionScene).append(this.mConstraintSetStart, constraintSet2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.mConstraintSetStart = MotionScene.access$1200(motionScene, context, this.mConstraintSetStart);
                    }
                } else if (index == R.styleable.Transition_motionInterpolator) {
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 == 1) {
                        int resourceId = typedArray.getResourceId(index, -1);
                        this.mDefaultInterpolatorID = resourceId;
                        if (resourceId != -1) {
                            this.mDefaultInterpolator = -2;
                        }
                    } else if (i2 == 3) {
                        String string = typedArray.getString(index);
                        this.mDefaultInterpolatorString = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.mDefaultInterpolatorID = typedArray.getResourceId(index, -1);
                                this.mDefaultInterpolator = -2;
                            } else {
                                this.mDefaultInterpolator = -1;
                            }
                        }
                    } else {
                        this.mDefaultInterpolator = typedArray.getInteger(index, this.mDefaultInterpolator);
                    }
                } else if (index == R.styleable.Transition_duration) {
                    int i3 = typedArray.getInt(index, this.mDuration);
                    this.mDuration = i3;
                    if (i3 < 8) {
                        this.mDuration = 8;
                    }
                } else if (index == R.styleable.Transition_staggered) {
                    this.mStagger = typedArray.getFloat(index, this.mStagger);
                } else if (index == R.styleable.Transition_autoTransition) {
                    this.mAutoTransition = typedArray.getInteger(index, this.mAutoTransition);
                } else if (index == R.styleable.Transition_android_id) {
                    this.mId = typedArray.getResourceId(index, this.mId);
                } else if (index == R.styleable.Transition_transitionDisable) {
                    this.mDisable = typedArray.getBoolean(index, this.mDisable);
                } else if (index == R.styleable.Transition_pathMotionArc) {
                    this.mPathMotionArc = typedArray.getInteger(index, -1);
                } else if (index == R.styleable.Transition_layoutDuringTransition) {
                    this.mLayoutDuringTransition = typedArray.getInteger(index, 0);
                } else if (index == R.styleable.Transition_transitionFlags) {
                    this.mTransitionFlags = typedArray.getInteger(index, 0);
                }
            }
            if (this.mConstraintSetStart == -1) {
                this.mIsAbstract = true;
            }
        }

        public void addOnClick(Context context, XmlPullParser xmlPullParser) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cb8ae83", new Object[]{this, context, xmlPullParser});
            } else {
                this.mOnClicks.add(new TransitionOnClick(context, this, xmlPullParser));
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static class TransitionOnClick implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange = null;
            public static final int ANIM_TOGGLE = 17;
            public static final int ANIM_TO_END = 1;
            public static final int ANIM_TO_START = 16;
            public static final int JUMP_TO_END = 256;
            public static final int JUMP_TO_START = 4096;
            public int mMode;
            public int mTargetId;
            private final Transition mTransition;

            public TransitionOnClick(Context context, Transition transition, XmlPullParser xmlPullParser) {
                this.mTargetId = -1;
                this.mMode = 17;
                this.mTransition = transition;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.OnClick);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = obtainStyledAttributes.getIndex(i);
                    if (index == R.styleable.OnClick_targetId) {
                        this.mTargetId = obtainStyledAttributes.getResourceId(index, this.mTargetId);
                    } else if (index == R.styleable.OnClick_clickAction) {
                        this.mMode = obtainStyledAttributes.getInt(index, this.mMode);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v4, types: [android.view.View] */
            public void addOnClickListeners(MotionLayout motionLayout, int i, Transition transition) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                boolean z5 = false;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a60f5302", new Object[]{this, motionLayout, new Integer(i), transition});
                    return;
                }
                int i2 = this.mTargetId;
                MotionLayout motionLayout2 = motionLayout;
                if (i2 != -1) {
                    motionLayout2 = motionLayout.findViewById(i2);
                }
                if (motionLayout2 == null) {
                    Log.e(TypedValues.MotionScene.NAME, "OnClick could not find id " + this.mTargetId);
                    return;
                }
                int access$100 = Transition.access$100(transition);
                int access$000 = Transition.access$000(transition);
                if (access$100 == -1) {
                    ViewProxy.setOnClickListener(motionLayout2, this);
                    return;
                }
                int i3 = this.mMode;
                if ((i3 & 1) == 0 || i != access$100) {
                    z = false;
                } else {
                    z = true;
                }
                if ((i3 & 256) == 0 || i != access$100) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                boolean z6 = z | z2;
                if ((i3 & 1) == 0 || i != access$100) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                boolean z7 = z3 | z6;
                if ((i3 & 16) == 0 || i != access$000) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                boolean z8 = z7 | z4;
                if ((i3 & 4096) != 0 && i == access$000) {
                    z5 = true;
                }
                if (z8 || z5) {
                    ViewProxy.setOnClickListener(motionLayout2, this);
                }
            }

            public boolean isTransitionViable(Transition transition, MotionLayout motionLayout) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("71de1c8a", new Object[]{this, transition, motionLayout})).booleanValue();
                }
                Transition transition2 = this.mTransition;
                if (transition2 == transition) {
                    return true;
                }
                int access$000 = Transition.access$000(transition2);
                int access$100 = Transition.access$100(this.mTransition);
                if (access$100 != -1) {
                    int i = motionLayout.mCurrentState;
                    if (i == access$100 || i == access$000) {
                        return true;
                    }
                    return false;
                } else if (motionLayout.mCurrentState != access$000) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                boolean z;
                boolean z2;
                boolean z3 = false;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                MotionLayout access$700 = MotionScene.access$700(Transition.access$800(this.mTransition));
                if (access$700.isInteractionEnabled()) {
                    if (Transition.access$100(this.mTransition) == -1) {
                        int currentState = access$700.getCurrentState();
                        if (currentState == -1) {
                            access$700.transitionToState(Transition.access$000(this.mTransition));
                            return;
                        }
                        Transition transition = new Transition(Transition.access$800(this.mTransition), this.mTransition);
                        Transition.access$102(transition, currentState);
                        Transition.access$002(transition, Transition.access$000(this.mTransition));
                        access$700.setTransition(transition);
                        access$700.transitionToEnd();
                        return;
                    }
                    Transition transition2 = Transition.access$800(this.mTransition).mCurrentTransition;
                    int i = this.mMode;
                    if ((i & 1) == 0 && (i & 256) == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if ((i & 16) == 0 && (i & 4096) == 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z || !z2) {
                        z3 = z;
                    } else {
                        Transition transition3 = Transition.access$800(this.mTransition).mCurrentTransition;
                        Transition transition4 = this.mTransition;
                        if (transition3 != transition4) {
                            access$700.setTransition(transition4);
                        }
                        if (access$700.getCurrentState() != access$700.getEndState() && access$700.getProgress() <= 0.5f) {
                            z3 = z;
                            z2 = false;
                        }
                    }
                    if (!isTransitionViable(transition2, access$700)) {
                        return;
                    }
                    if (z3 && (1 & this.mMode) != 0) {
                        access$700.setTransition(this.mTransition);
                        access$700.transitionToEnd();
                    } else if (z2 && (this.mMode & 16) != 0) {
                        access$700.setTransition(this.mTransition);
                        access$700.transitionToStart();
                    } else if (z3 && (this.mMode & 256) != 0) {
                        access$700.setTransition(this.mTransition);
                        access$700.setProgress(1.0f);
                    } else if (z2 && (this.mMode & 4096) != 0) {
                        access$700.setTransition(this.mTransition);
                        access$700.setProgress(0.0f);
                    }
                }
            }

            public void removeOnClickListeners(MotionLayout motionLayout) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d488ee5c", new Object[]{this, motionLayout});
                    return;
                }
                int i = this.mTargetId;
                if (i != -1) {
                    View findViewById = motionLayout.findViewById(i);
                    if (findViewById == null) {
                        Log.e(TypedValues.MotionScene.NAME, " (*)  could not find id " + this.mTargetId);
                        return;
                    }
                    ViewProxy.setOnClickListener(findViewById, null);
                }
            }

            public TransitionOnClick(Transition transition, int i, int i2) {
                this.mTransition = transition;
                this.mTargetId = i;
                this.mMode = i2;
            }
        }

        public Transition(int i, MotionScene motionScene, int i2, int i3) {
            this.mId = -1;
            this.mIsAbstract = false;
            this.mConstraintSetEnd = -1;
            this.mConstraintSetStart = -1;
            this.mDefaultInterpolator = 0;
            this.mDefaultInterpolatorString = null;
            this.mDefaultInterpolatorID = -1;
            this.mDuration = 400;
            this.mStagger = 0.0f;
            this.mKeyFramesList = new ArrayList<>();
            this.mTouchResponse = null;
            this.mOnClicks = new ArrayList<>();
            this.mAutoTransition = 0;
            this.mDisable = false;
            this.mPathMotionArc = -1;
            this.mLayoutDuringTransition = 0;
            this.mTransitionFlags = 0;
            this.mId = i;
            this.mMotionScene = motionScene;
            this.mConstraintSetStart = i2;
            this.mConstraintSetEnd = i3;
            this.mDuration = MotionScene.access$900(motionScene);
            this.mLayoutDuringTransition = MotionScene.access$1000(motionScene);
        }

        public Transition(MotionScene motionScene, Context context, XmlPullParser xmlPullParser) {
            this.mId = -1;
            this.mIsAbstract = false;
            this.mConstraintSetEnd = -1;
            this.mConstraintSetStart = -1;
            this.mDefaultInterpolator = 0;
            this.mDefaultInterpolatorString = null;
            this.mDefaultInterpolatorID = -1;
            this.mDuration = 400;
            this.mStagger = 0.0f;
            this.mKeyFramesList = new ArrayList<>();
            this.mTouchResponse = null;
            this.mOnClicks = new ArrayList<>();
            this.mAutoTransition = 0;
            this.mDisable = false;
            this.mPathMotionArc = -1;
            this.mLayoutDuringTransition = 0;
            this.mTransitionFlags = 0;
            this.mDuration = MotionScene.access$900(motionScene);
            this.mLayoutDuringTransition = MotionScene.access$1000(motionScene);
            this.mMotionScene = motionScene;
            fillFromAttributeList(motionScene, context, Xml.asAttributeSet(xmlPullParser));
        }
    }

    private boolean hasCycleDependency(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d112eee9", new Object[]{this, new Integer(i)})).booleanValue();
        }
        int i2 = this.mDeriveMap.get(i);
        int size = this.mDeriveMap.size();
        while (i2 > 0) {
            if (i2 == i) {
                return true;
            }
            size--;
            if (size < 0) {
                return true;
            }
            i2 = this.mDeriveMap.get(i2);
        }
        return false;
    }

    public void readFallback(MotionLayout motionLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f30797a", new Object[]{this, motionLayout});
            return;
        }
        for (int i = 0; i < this.mConstraintSetMap.size(); i++) {
            int keyAt = this.mConstraintSetMap.keyAt(i);
            if (hasCycleDependency(keyAt)) {
                Log.e(TypedValues.MotionScene.NAME, "Cannot be derived from yourself");
                return;
            } else {
                readConstraintChain(keyAt, motionLayout);
            }
        }
    }

    public void processTouchEvent(MotionEvent motionEvent, int i, MotionLayout motionLayout) {
        MotionLayout.MotionTracker motionTracker;
        MotionEvent motionEvent2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efabed8", new Object[]{this, motionEvent, new Integer(i), motionLayout});
            return;
        }
        RectF rectF = new RectF();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = this.mMotionLayout.obtainVelocityTracker();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        if (i != -1) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.mLastTouchX = motionEvent.getRawX();
                this.mLastTouchY = motionEvent.getRawY();
                this.mLastTouchDown = motionEvent;
                this.mIgnoreTouch = false;
                if (Transition.access$200(this.mCurrentTransition) != null) {
                    RectF limitBoundsTo = Transition.access$200(this.mCurrentTransition).getLimitBoundsTo(this.mMotionLayout, rectF);
                    if (limitBoundsTo == null || limitBoundsTo.contains(this.mLastTouchDown.getX(), this.mLastTouchDown.getY())) {
                        RectF touchRegion = Transition.access$200(this.mCurrentTransition).getTouchRegion(this.mMotionLayout, rectF);
                        if (touchRegion == null || touchRegion.contains(this.mLastTouchDown.getX(), this.mLastTouchDown.getY())) {
                            this.mMotionOutsideRegion = false;
                        } else {
                            this.mMotionOutsideRegion = true;
                        }
                        Transition.access$200(this.mCurrentTransition).setDown(this.mLastTouchX, this.mLastTouchY);
                        return;
                    }
                    this.mLastTouchDown = null;
                    this.mIgnoreTouch = true;
                    return;
                }
                return;
            } else if (action == 2 && !this.mIgnoreTouch) {
                float rawY = motionEvent.getRawY() - this.mLastTouchY;
                float rawX = motionEvent.getRawX() - this.mLastTouchX;
                if ((rawX != vu3.b.GEO_NOT_SUPPORT || rawY != vu3.b.GEO_NOT_SUPPORT) && (motionEvent2 = this.mLastTouchDown) != null) {
                    Transition bestTransitionFor = bestTransitionFor(i, rawX, rawY, motionEvent2);
                    if (bestTransitionFor != null) {
                        motionLayout.setTransition(bestTransitionFor);
                        RectF touchRegion2 = Transition.access$200(this.mCurrentTransition).getTouchRegion(this.mMotionLayout, rectF);
                        if (touchRegion2 != null && !touchRegion2.contains(this.mLastTouchDown.getX(), this.mLastTouchDown.getY())) {
                            z = true;
                        }
                        this.mMotionOutsideRegion = z;
                        Transition.access$200(this.mCurrentTransition).setUpTouchEvent(this.mLastTouchX, this.mLastTouchY);
                    }
                } else {
                    return;
                }
            }
        }
        if (!this.mIgnoreTouch) {
            Transition transition = this.mCurrentTransition;
            if (!(transition == null || Transition.access$200(transition) == null || this.mMotionOutsideRegion)) {
                Transition.access$200(this.mCurrentTransition).processTouchEvent(motionEvent, this.mVelocityTracker, i, this);
            }
            this.mLastTouchX = motionEvent.getRawX();
            this.mLastTouchY = motionEvent.getRawY();
            if (motionEvent.getAction() == 1 && (motionTracker = this.mVelocityTracker) != null) {
                motionTracker.recycle();
                this.mVelocityTracker = null;
                int i2 = motionLayout.mCurrentState;
                if (i2 != -1) {
                    autoTransition(motionLayout, i2);
                }
            }
        }
    }

    private void load(Context context, int i) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58836868", new Object[]{this, context, new Integer(i)});
            return;
        }
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            Transition transition = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals(CONSTRAINTSET_TAG)) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case -687739768:
                            if (name.equals(INCLUDE_TAG_UC)) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case 269306229:
                            if (name.equals(TRANSITION_TAG)) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 312750793:
                            if (name.equals(ONCLICK_TAG)) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 327855227:
                            if (name.equals(ONSWIPE_TAG)) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 793277014:
                            if (name.equals(TypedValues.MotionScene.NAME)) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1382829617:
                            if (name.equals(STATESET_TAG)) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1942574248:
                            if (name.equals("include")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            parseMotionSceneTags(context, xml);
                            continue;
                        case 1:
                            ArrayList<Transition> arrayList = this.mTransitionList;
                            transition = new Transition(this, context, xml);
                            arrayList.add(transition);
                            if (this.mCurrentTransition == null && !Transition.access$1300(transition)) {
                                this.mCurrentTransition = transition;
                                if (Transition.access$200(transition) != null) {
                                    Transition.access$200(this.mCurrentTransition).setRTL(this.mRtl);
                                }
                            }
                            if (Transition.access$1300(transition)) {
                                if (Transition.access$000(transition) == -1) {
                                    this.mDefaultTransition = transition;
                                } else {
                                    this.mAbstractTransitionList.add(transition);
                                }
                                this.mTransitionList.remove(transition);
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (transition == null) {
                                String resourceEntryName = context.getResources().getResourceEntryName(i);
                                int lineNumber = xml.getLineNumber();
                                StringBuilder sb = new StringBuilder();
                                sb.append(" OnSwipe (");
                                sb.append(resourceEntryName);
                                sb.append(".xml:");
                                sb.append(lineNumber);
                                sb.append(f7l.BRACKET_END_STR);
                            }
                            if (transition != null) {
                                Transition.access$202(transition, new TouchResponse(context, this.mMotionLayout, xml));
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if (transition != null) {
                                if (!this.mMotionLayout.isInEditMode()) {
                                    transition.addOnClick(context, xml);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        case 4:
                            this.mStateSet = new StateSet(context, xml);
                            continue;
                        case 5:
                            parseConstraintSet(context, xml);
                            continue;
                        case 6:
                        case 7:
                            parseInclude(context, xml);
                            continue;
                        case '\b':
                            KeyFrames keyFrames = new KeyFrames(context, xml);
                            if (transition != null) {
                                Transition.access$1400(transition).add(keyFrames);
                                break;
                            } else {
                                continue;
                            }
                        case '\t':
                            this.mViewTransitionController.add(new ViewTransition(context, xml));
                            continue;
                        default:
                            continue;
                    }
                }
            }
        } catch (IOException e) {
            Log.e(TypedValues.MotionScene.NAME, "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e(TypedValues.MotionScene.NAME, "Error parsing resource: " + i, e2);
        }
    }

    public boolean autoTransition(MotionLayout motionLayout, int i) {
        Transition transition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e305ef81", new Object[]{this, motionLayout, new Integer(i)})).booleanValue();
        }
        if (isProcessingTouch() || this.mDisableAutoTransition) {
            return false;
        }
        Iterator<Transition> it = this.mTransitionList.iterator();
        while (it.hasNext()) {
            Transition next = it.next();
            if (Transition.access$600(next) != 0 && ((transition = this.mCurrentTransition) != next || !transition.isTransitionFlag(2))) {
                if (i == Transition.access$100(next) && (Transition.access$600(next) == 4 || Transition.access$600(next) == 2)) {
                    MotionLayout.TransitionState transitionState = MotionLayout.TransitionState.FINISHED;
                    motionLayout.setState(transitionState);
                    motionLayout.setTransition(next);
                    if (Transition.access$600(next) == 4) {
                        motionLayout.transitionToEnd();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.evaluate(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(transitionState);
                        motionLayout.onNewStateAttachHandlers();
                    }
                    return true;
                } else if (i == Transition.access$000(next) && (Transition.access$600(next) == 3 || Transition.access$600(next) == 1)) {
                    MotionLayout.TransitionState transitionState2 = MotionLayout.TransitionState.FINISHED;
                    motionLayout.setState(transitionState2);
                    motionLayout.setTransition(next);
                    if (Transition.access$600(next) == 3) {
                        motionLayout.transitionToStart();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.evaluate(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(transitionState2);
                        motionLayout.onNewStateAttachHandlers();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public ConstraintSet getConstraintSet(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConstraintSet) ipChange.ipc$dispatch("72bb4d7c", new Object[]{this, new Integer(i)}) : getConstraintSet(i, -1, -1);
    }

    public ConstraintSet getConstraintSet(int i, int i2, int i3) {
        int stateGetConstraintID;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintSet) ipChange.ipc$dispatch("8a05205c", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        StateSet stateSet = this.mStateSet;
        if (!(stateSet == null || (stateGetConstraintID = stateSet.stateGetConstraintID(i, i2, i3)) == -1)) {
            i = stateGetConstraintID;
        }
        if (this.mConstraintSetMap.get(i) != null) {
            return this.mConstraintSetMap.get(i);
        }
        Log.e(TypedValues.MotionScene.NAME, "Warning could not find ConstraintSet id/" + Debug.getName(this.mMotionLayout.getContext(), i) + " In MotionScene");
        SparseArray<ConstraintSet> sparseArray = this.mConstraintSetMap;
        return sparseArray.get(sparseArray.keyAt(0));
    }

    private int parseInclude(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e36b1aa", new Object[]{this, context, new Integer(i)})).intValue();
        }
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && CONSTRAINTSET_TAG.equals(name)) {
                    return parseConstraintSet(context, xml);
                }
            }
            return -1;
        } catch (IOException e) {
            Log.e(TypedValues.MotionScene.NAME, "Error parsing resource: " + i, e);
            return -1;
        } catch (XmlPullParserException e2) {
            Log.e(TypedValues.MotionScene.NAME, "Error parsing resource: " + i, e2);
            return -1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int parseConstraintSet(Context context, XmlPullParser xmlPullParser) {
        char c;
        char c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b20555ec", new Object[]{this, context, xmlPullParser})).intValue();
        }
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.setForceId(false);
        int attributeCount = xmlPullParser.getAttributeCount();
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < attributeCount; i3++) {
            String attributeName = xmlPullParser.getAttributeName(i3);
            String attributeValue = xmlPullParser.getAttributeValue(i3);
            attributeName.hashCode();
            switch (attributeName.hashCode()) {
                case -1496482599:
                    if (attributeName.equals("deriveConstraintsFrom")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1153153640:
                    if (attributeName.equals("constraintRotate")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 973381616:
                    if (attributeName.equals("stateLabels")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    i2 = getId(context, attributeValue);
                    break;
                case 1:
                    try {
                        constraintSet.mRotate = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.hashCode();
                        switch (attributeValue.hashCode()) {
                            case -768416914:
                                if (attributeValue.equals("x_left")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3317767:
                                if (attributeValue.equals("left")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3387192:
                                if (attributeValue.equals("none")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 108511772:
                                if (attributeValue.equals("right")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1954540437:
                                if (attributeValue.equals("x_right")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                                constraintSet.mRotate = 4;
                                continue;
                            case 1:
                                constraintSet.mRotate = 2;
                                continue;
                            case 2:
                                constraintSet.mRotate = 0;
                                continue;
                            case 3:
                                constraintSet.mRotate = 1;
                                continue;
                            case 4:
                                constraintSet.mRotate = 3;
                                continue;
                        }
                    }
                case 2:
                    i = getId(context, attributeValue);
                    this.mConstraintSetIdMap.put(stripID(attributeValue), Integer.valueOf(i));
                    constraintSet.mIdString = Debug.getName(context, i);
                    break;
                case 3:
                    constraintSet.setStateLabels(attributeValue);
                    break;
            }
        }
        if (i != -1) {
            if (this.mMotionLayout.mDebugPath != 0) {
                constraintSet.setValidateOnParse(true);
            }
            constraintSet.load(context, xmlPullParser);
            if (i2 != -1) {
                this.mDeriveMap.put(i, i2);
            }
            this.mConstraintSetMap.put(i, constraintSet);
        }
        return i;
    }

    public MotionScene(Context context, MotionLayout motionLayout, int i) {
        this.mMotionLayout = motionLayout;
        this.mViewTransitionController = new ViewTransitionController(motionLayout);
        load(context, i);
        SparseArray<ConstraintSet> sparseArray = this.mConstraintSetMap;
        int i2 = R.id.motion_base;
        sparseArray.put(i2, new ConstraintSet());
        this.mConstraintSetIdMap.put("motion_base", Integer.valueOf(i2));
    }

    public void setTransition(Transition transition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9713376", new Object[]{this, transition});
            return;
        }
        this.mCurrentTransition = transition;
        if (transition != null && Transition.access$200(transition) != null) {
            Transition.access$200(this.mCurrentTransition).setRTL(this.mRtl);
        }
    }
}
