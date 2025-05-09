package androidx.constraintlayout.motion.widget;

import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Objects;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DesignTool {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG = false;
    private static final boolean DO_NOT_USE = false;
    private static final String TAG = "DesignTool";
    public static final HashMap<Pair<Integer, Integer>, String> sAllAttributes;
    public static final HashMap<String, String> sAllMargins;
    private final MotionLayout mMotionLayout;
    private MotionScene mSceneCache;
    private String mLastStartState = null;
    private String mLastEndState = null;
    private int mLastStartStateId = -1;
    private int mLastEndStateId = -1;

    static {
        HashMap<Pair<Integer, Integer>, String> hashMap = new HashMap<>();
        sAllAttributes = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        sAllMargins = hashMap2;
        hashMap.put(Pair.create(4, 4), "layout_constraintBottom_toBottomOf");
        hashMap.put(Pair.create(4, 3), "layout_constraintBottom_toTopOf");
        hashMap.put(Pair.create(3, 4), "layout_constraintTop_toBottomOf");
        hashMap.put(Pair.create(3, 3), "layout_constraintTop_toTopOf");
        hashMap.put(Pair.create(6, 6), "layout_constraintStart_toStartOf");
        hashMap.put(Pair.create(6, 7), "layout_constraintStart_toEndOf");
        hashMap.put(Pair.create(7, 6), "layout_constraintEnd_toStartOf");
        hashMap.put(Pair.create(7, 7), "layout_constraintEnd_toEndOf");
        hashMap.put(Pair.create(1, 1), "layout_constraintLeft_toLeftOf");
        hashMap.put(Pair.create(1, 2), "layout_constraintLeft_toRightOf");
        hashMap.put(Pair.create(2, 2), "layout_constraintRight_toRightOf");
        hashMap.put(Pair.create(2, 1), "layout_constraintRight_toLeftOf");
        hashMap.put(Pair.create(5, 5), "layout_constraintBaseline_toBaselineOf");
        hashMap2.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
        hashMap2.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
        hashMap2.put("layout_constraintTop_toBottomOf", "layout_marginTop");
        hashMap2.put("layout_constraintTop_toTopOf", "layout_marginTop");
        hashMap2.put("layout_constraintStart_toStartOf", "layout_marginStart");
        hashMap2.put("layout_constraintStart_toEndOf", "layout_marginStart");
        hashMap2.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
        hashMap2.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
        hashMap2.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
        hashMap2.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
        hashMap2.put("layout_constraintRight_toRightOf", "layout_marginRight");
        hashMap2.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }

    public DesignTool(MotionLayout motionLayout) {
        this.mMotionLayout = motionLayout;
    }

    private static void connect(int i, ConstraintSet constraintSet, View view, HashMap<String, String> hashMap, int i2, int i3) {
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e5a29e6", new Object[]{new Integer(i), constraintSet, view, hashMap, new Integer(i2), new Integer(i3)});
            return;
        }
        String str = sAllAttributes.get(Pair.create(Integer.valueOf(i2), Integer.valueOf(i3)));
        String str2 = hashMap.get(str);
        if (str2 != null) {
            String str3 = sAllMargins.get(str);
            if (str3 != null) {
                i4 = getPxFromDp(i, hashMap.get(str3));
            } else {
                i4 = 0;
            }
            constraintSet.connect(view.getId(), i2, Integer.parseInt(str2), i3, i4);
        }
    }

    private static void setAbsolutePositions(int i, ConstraintSet constraintSet, View view, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ce2bf1f", new Object[]{new Integer(i), constraintSet, view, hashMap});
            return;
        }
        String str = hashMap.get("layout_editor_absoluteX");
        if (str != null) {
            constraintSet.setEditorAbsoluteX(view.getId(), getPxFromDp(i, str));
        }
        String str2 = hashMap.get("layout_editor_absoluteY");
        if (str2 != null) {
            constraintSet.setEditorAbsoluteY(view.getId(), getPxFromDp(i, str2));
        }
    }

    public int designAccess(int i, String str, Object obj, float[] fArr, int i2, float[] fArr2, int i3) {
        MotionController motionController;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c54baf3", new Object[]{this, new Integer(i), str, obj, fArr, new Integer(i2), fArr2, new Integer(i3)})).intValue();
        }
        View view = (View) obj;
        if (i != 0) {
            MotionLayout motionLayout = this.mMotionLayout;
            if (motionLayout.mScene == null || view == null || (motionController = motionLayout.mFrameArrayList.get(view)) == null) {
                return -1;
            }
        } else {
            motionController = null;
        }
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            int duration = this.mMotionLayout.mScene.getDuration() / 16;
            motionController.buildPath(fArr2, duration);
            return duration;
        } else if (i == 2) {
            int duration2 = this.mMotionLayout.mScene.getDuration() / 16;
            motionController.buildKeyFrames(fArr2, null);
            return duration2;
        } else if (i != 3) {
            return -1;
        } else {
            this.mMotionLayout.mScene.getDuration();
            return motionController.getAttributeValues(str, fArr2, i3);
        }
    }

    public void disableAutoTransition(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b06f141", new Object[]{this, new Boolean(z)});
        } else {
            this.mMotionLayout.disableAutoTransition(z);
        }
    }

    public void dumpConstraintSet(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d6a3782", new Object[]{this, str});
            return;
        }
        MotionLayout motionLayout = this.mMotionLayout;
        if (motionLayout.mScene == null) {
            motionLayout.mScene = this.mSceneCache;
        }
        int lookUpConstraintId = motionLayout.lookUpConstraintId(str);
        PrintStream printStream = System.out;
        printStream.println(" dumping  " + str + " (" + lookUpConstraintId + f7l.BRACKET_END_STR);
        try {
            this.mMotionLayout.mScene.getConstraintSet(lookUpConstraintId).dump(this.mMotionLayout.mScene, new int[0]);
        } catch (Exception e) {
            Log.e(TAG, "Error while dumping: " + str + " (" + lookUpConstraintId + f7l.BRACKET_END_STR, e);
        }
    }

    public int getAnimationKeyFrames(Object obj, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5de29958", new Object[]{this, obj, fArr})).intValue();
        }
        MotionScene motionScene = this.mMotionLayout.mScene;
        if (motionScene == null) {
            return -1;
        }
        int duration = motionScene.getDuration() / 16;
        MotionController motionController = this.mMotionLayout.mFrameArrayList.get(obj);
        if (motionController == null) {
            return 0;
        }
        motionController.buildKeyFrames(fArr, null);
        return duration;
    }

    public int getAnimationPath(Object obj, float[] fArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b2501e55", new Object[]{this, obj, fArr, new Integer(i)})).intValue();
        }
        MotionLayout motionLayout = this.mMotionLayout;
        if (motionLayout.mScene == null) {
            return -1;
        }
        MotionController motionController = motionLayout.mFrameArrayList.get(obj);
        if (motionController == null) {
            return 0;
        }
        motionController.buildPath(fArr, i);
        return i;
    }

    public void getAnimationRectangles(Object obj, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("313ed200", new Object[]{this, obj, fArr});
            return;
        }
        MotionScene motionScene = this.mMotionLayout.mScene;
        if (motionScene != null) {
            int duration = motionScene.getDuration() / 16;
            MotionController motionController = this.mMotionLayout.mFrameArrayList.get(obj);
            if (motionController != null) {
                motionController.buildRectangles(fArr, duration);
            }
        }
    }

    public String getEndState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bdfa008d", new Object[]{this});
        }
        int endState = this.mMotionLayout.getEndState();
        if (this.mLastEndStateId == endState) {
            return this.mLastEndState;
        }
        String constraintSetNames = this.mMotionLayout.getConstraintSetNames(endState);
        if (constraintSetNames != null) {
            this.mLastEndState = constraintSetNames;
            this.mLastEndStateId = endState;
        }
        return constraintSetNames;
    }

    public float getKeyFramePosition(Object obj, int i, float f, float f2) {
        MotionController motionController;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fb53243", new Object[]{this, obj, new Integer(i), new Float(f), new Float(f2)})).floatValue();
        }
        if ((obj instanceof View) && (motionController = this.mMotionLayout.mFrameArrayList.get((View) obj)) != null) {
            return motionController.getKeyFrameParameter(i, f, f2);
        }
        return 0.0f;
    }

    public int getKeyFramePositions(Object obj, int[] iArr, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8640cff5", new Object[]{this, obj, iArr, fArr})).intValue();
        }
        MotionController motionController = this.mMotionLayout.mFrameArrayList.get((View) obj);
        if (motionController == null) {
            return 0;
        }
        return motionController.getKeyFramePositions(iArr, fArr);
    }

    public Object getKeyframe(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("87feadda", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        MotionLayout motionLayout = this.mMotionLayout;
        MotionScene motionScene = motionLayout.mScene;
        if (motionScene == null) {
            return null;
        }
        return motionScene.getKeyFrame(motionLayout.getContext(), i, i2, i3);
    }

    public Object getKeyframeAtLocation(Object obj, float f, float f2) {
        MotionController motionController;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("49c3323", new Object[]{this, obj, new Float(f), new Float(f2)});
        }
        View view = (View) obj;
        MotionLayout motionLayout = this.mMotionLayout;
        if (motionLayout.mScene == null) {
            return -1;
        }
        if (view == null || (motionController = motionLayout.mFrameArrayList.get(view)) == null) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        return motionController.getPositionKeyframe(viewGroup.getWidth(), viewGroup.getHeight(), f, f2);
    }

    public Boolean getPositionKeyframe(Object obj, Object obj2, float f, float f2, String[] strArr, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("9c2882bb", new Object[]{this, obj, obj2, new Float(f), new Float(f2), strArr, fArr});
        }
        if (!(obj instanceof KeyPositionBase)) {
            return Boolean.FALSE;
        }
        View view = (View) obj2;
        this.mMotionLayout.mFrameArrayList.get(view).positionKeyframe(view, (KeyPositionBase) obj, f, f2, strArr, fArr);
        this.mMotionLayout.rebuildScene();
        this.mMotionLayout.mInTransition = true;
        return Boolean.TRUE;
    }

    public float getProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ba5fa9a", new Object[]{this})).floatValue();
        }
        return this.mMotionLayout.getProgress();
    }

    public String getStartState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b0666d4", new Object[]{this});
        }
        int startState = this.mMotionLayout.getStartState();
        if (this.mLastStartStateId == startState) {
            return this.mLastStartState;
        }
        String constraintSetNames = this.mMotionLayout.getConstraintSetNames(startState);
        if (constraintSetNames != null) {
            this.mLastStartState = constraintSetNames;
            this.mLastStartStateId = startState;
        }
        return this.mMotionLayout.getConstraintSetNames(startState);
    }

    public String getState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fecfaafe", new Object[]{this});
        }
        if (!(this.mLastStartState == null || this.mLastEndState == null)) {
            float progress = getProgress();
            if (progress <= 0.01f) {
                return this.mLastStartState;
            }
            if (progress >= 0.99f) {
                return this.mLastEndState;
            }
        }
        return this.mLastStartState;
    }

    public long getTransitionTimeMs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5019ff9", new Object[]{this})).longValue();
        }
        return this.mMotionLayout.getTransitionTimeMs();
    }

    public boolean isInTransition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17cb712f", new Object[]{this})).booleanValue();
        }
        if (this.mLastStartState == null || this.mLastEndState == null) {
            return false;
        }
        return true;
    }

    public void setKeyFrame(Object obj, int i, String str, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dc80316", new Object[]{this, obj, new Integer(i), str, obj2});
            return;
        }
        MotionScene motionScene = this.mMotionLayout.mScene;
        if (motionScene != null) {
            motionScene.setKeyframe((View) obj, i, str, obj2);
            MotionLayout motionLayout = this.mMotionLayout;
            motionLayout.mTransitionGoalPosition = i / 100.0f;
            motionLayout.mTransitionLastPosition = 0.0f;
            motionLayout.rebuildScene();
            this.mMotionLayout.evaluate(true);
        }
    }

    public void setState(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87fe4aa0", new Object[]{this, str});
            return;
        }
        if (str == null) {
            str = "motion_base";
        }
        if (!Objects.equals(this.mLastStartState, str)) {
            this.mLastStartState = str;
            this.mLastEndState = null;
            MotionLayout motionLayout = this.mMotionLayout;
            if (motionLayout.mScene == null) {
                motionLayout.mScene = this.mSceneCache;
            }
            int lookUpConstraintId = motionLayout.lookUpConstraintId(str);
            this.mLastStartStateId = lookUpConstraintId;
            if (lookUpConstraintId != 0) {
                if (lookUpConstraintId == this.mMotionLayout.getStartState()) {
                    this.mMotionLayout.setProgress(0.0f);
                } else if (lookUpConstraintId == this.mMotionLayout.getEndState()) {
                    this.mMotionLayout.setProgress(1.0f);
                } else {
                    this.mMotionLayout.transitionToState(lookUpConstraintId);
                    this.mMotionLayout.setProgress(1.0f);
                }
            }
            this.mMotionLayout.requestLayout();
        }
    }

    public void setToolPosition(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("360cdd96", new Object[]{this, new Float(f)});
            return;
        }
        MotionLayout motionLayout = this.mMotionLayout;
        if (motionLayout.mScene == null) {
            motionLayout.mScene = this.mSceneCache;
        }
        motionLayout.setProgress(f);
        this.mMotionLayout.evaluate(true);
        this.mMotionLayout.requestLayout();
        this.mMotionLayout.invalidate();
    }

    public void setTransition(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3e75272", new Object[]{this, str, str2});
            return;
        }
        MotionLayout motionLayout = this.mMotionLayout;
        if (motionLayout.mScene == null) {
            motionLayout.mScene = this.mSceneCache;
        }
        int lookUpConstraintId = motionLayout.lookUpConstraintId(str);
        int lookUpConstraintId2 = this.mMotionLayout.lookUpConstraintId(str2);
        this.mMotionLayout.setTransition(lookUpConstraintId, lookUpConstraintId2);
        this.mLastStartStateId = lookUpConstraintId;
        this.mLastEndStateId = lookUpConstraintId2;
        this.mLastStartState = str;
        this.mLastEndState = str2;
    }

    public void setViewDebug(Object obj, int i) {
        MotionController motionController;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dce7d0d4", new Object[]{this, obj, new Integer(i)});
        } else if ((obj instanceof View) && (motionController = this.mMotionLayout.mFrameArrayList.get(obj)) != null) {
            motionController.setDrawPath(i);
            this.mMotionLayout.invalidate();
        }
    }

    private static int getPxFromDp(int i, String str) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fbea7825", new Object[]{new Integer(i), str})).intValue();
        }
        if (str == null || (indexOf = str.indexOf(100)) == -1) {
            return 0;
        }
        return (int) ((Integer.valueOf(str.substring(0, indexOf)).intValue() * i) / 160.0f);
    }

    private static void setBias(ConstraintSet constraintSet, View view, HashMap<String, String> hashMap, int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35cc062d", new Object[]{constraintSet, view, hashMap, new Integer(i)});
            return;
        }
        if (i == 1) {
            str = "layout_constraintVertical_bias";
        } else {
            str = "layout_constraintHorizontal_bias";
        }
        String str2 = hashMap.get(str);
        if (str2 == null) {
            return;
        }
        if (i == 0) {
            constraintSet.setHorizontalBias(view.getId(), Float.parseFloat(str2));
        } else if (i == 1) {
            constraintSet.setVerticalBias(view.getId(), Float.parseFloat(str2));
        }
    }

    private static void setDimensions(int i, ConstraintSet constraintSet, View view, HashMap<String, String> hashMap, int i2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4554ec22", new Object[]{new Integer(i), constraintSet, view, hashMap, new Integer(i2)});
            return;
        }
        if (i2 == 1) {
            str = "layout_height";
        } else {
            str = "layout_width";
        }
        String str2 = hashMap.get(str);
        if (str2 != null) {
            int pxFromDp = !str2.equalsIgnoreCase("wrap_content") ? getPxFromDp(i, str2) : -2;
            if (i2 == 0) {
                constraintSet.constrainWidth(view.getId(), pxFromDp);
            } else {
                constraintSet.constrainHeight(view.getId(), pxFromDp);
            }
        }
    }

    public int getKeyFrameInfo(Object obj, int i, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd493b6f", new Object[]{this, obj, new Integer(i), iArr})).intValue();
        }
        MotionController motionController = this.mMotionLayout.mFrameArrayList.get((View) obj);
        if (motionController == null) {
            return 0;
        }
        return motionController.getKeyFrameInfo(i, iArr);
    }

    public void setKeyframe(Object obj, String str, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff036739", new Object[]{this, obj, str, obj2});
        } else if (obj instanceof Key) {
            ((Key) obj).setValue(str, obj2);
            this.mMotionLayout.rebuildScene();
            this.mMotionLayout.mInTransition = true;
        }
    }

    public Object getKeyframe(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("be9845eb", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        }
        if (this.mMotionLayout.mScene == null) {
            return null;
        }
        int id = ((View) obj).getId();
        MotionLayout motionLayout = this.mMotionLayout;
        return motionLayout.mScene.getKeyFrame(motionLayout.getContext(), i, id, i2);
    }

    public void setAttributes(int i, String str, Object obj, Object obj2) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff8234e5", new Object[]{this, new Integer(i), str, obj, obj2});
            return;
        }
        View view = (View) obj;
        if (obj2 instanceof HashMap) {
            hashMap = (HashMap) obj2;
        } else {
            hashMap = new HashMap();
        }
        int lookUpConstraintId = this.mMotionLayout.lookUpConstraintId(str);
        ConstraintSet constraintSet = this.mMotionLayout.mScene.getConstraintSet(lookUpConstraintId);
        if (constraintSet != null) {
            constraintSet.clear(view.getId());
            setDimensions(i, constraintSet, view, hashMap, 0);
            setDimensions(i, constraintSet, view, hashMap, 1);
            connect(i, constraintSet, view, hashMap, 6, 6);
            connect(i, constraintSet, view, hashMap, 6, 7);
            connect(i, constraintSet, view, hashMap, 7, 7);
            connect(i, constraintSet, view, hashMap, 7, 6);
            connect(i, constraintSet, view, hashMap, 1, 1);
            connect(i, constraintSet, view, hashMap, 1, 2);
            connect(i, constraintSet, view, hashMap, 2, 2);
            connect(i, constraintSet, view, hashMap, 2, 1);
            connect(i, constraintSet, view, hashMap, 3, 3);
            connect(i, constraintSet, view, hashMap, 3, 4);
            connect(i, constraintSet, view, hashMap, 4, 3);
            connect(i, constraintSet, view, hashMap, 4, 4);
            connect(i, constraintSet, view, hashMap, 5, 5);
            setBias(constraintSet, view, hashMap, 0);
            setBias(constraintSet, view, hashMap, 1);
            setAbsolutePositions(i, constraintSet, view, hashMap);
            this.mMotionLayout.updateState(lookUpConstraintId, constraintSet);
            this.mMotionLayout.requestLayout();
        }
    }

    public boolean setKeyFramePosition(Object obj, int i, int i2, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26a4e460", new Object[]{this, obj, new Integer(i), new Integer(i2), new Float(f), new Float(f2)})).booleanValue();
        }
        if (!(obj instanceof View)) {
            return false;
        }
        MotionLayout motionLayout = this.mMotionLayout;
        if (motionLayout.mScene != null) {
            MotionController motionController = motionLayout.mFrameArrayList.get(obj);
            MotionLayout motionLayout2 = this.mMotionLayout;
            int i3 = (int) (motionLayout2.mTransitionPosition * 100.0f);
            if (motionController != null) {
                View view = (View) obj;
                if (motionLayout2.mScene.hasKeyFramePosition(view, i3)) {
                    float keyFrameParameter = motionController.getKeyFrameParameter(2, f, f2);
                    float keyFrameParameter2 = motionController.getKeyFrameParameter(5, f, f2);
                    this.mMotionLayout.mScene.setKeyframe(view, i3, "motion:percentX", Float.valueOf(keyFrameParameter));
                    this.mMotionLayout.mScene.setKeyframe(view, i3, "motion:percentY", Float.valueOf(keyFrameParameter2));
                    this.mMotionLayout.rebuildScene();
                    this.mMotionLayout.evaluate(true);
                    this.mMotionLayout.invalidate();
                    return true;
                }
            }
        }
        return false;
    }
}
