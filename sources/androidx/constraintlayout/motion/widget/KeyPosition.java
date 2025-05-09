package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.motion.utils.ViewSpline;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class KeyPosition extends KeyPositionBase {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DRAWPATH = "drawPath";
    public static final int KEY_TYPE = 2;
    public static final String NAME = "KeyPosition";
    public static final String PERCENT_HEIGHT = "percentHeight";
    public static final String PERCENT_WIDTH = "percentWidth";
    public static final String PERCENT_X = "percentX";
    public static final String PERCENT_Y = "percentY";
    public static final String SIZE_PERCENT = "sizePercent";
    private static final String TAG = "KeyPosition";
    public static final String TRANSITION_EASING = "transitionEasing";
    public static final int TYPE_AXIS = 3;
    public static final int TYPE_CARTESIAN = 0;
    public static final int TYPE_PATH = 1;
    public static final int TYPE_SCREEN = 2;
    public String mTransitionEasing = null;
    public int mPathMotionArc = Key.UNSET;
    public int mDrawPath = 0;
    public float mPercentWidth = Float.NaN;
    public float mPercentHeight = Float.NaN;
    public float mPercentX = Float.NaN;
    public float mPercentY = Float.NaN;
    public float mAltPercentX = Float.NaN;
    public float mAltPercentY = Float.NaN;
    public int mPositionType = 0;
    private float mCalculatedPositionX = Float.NaN;
    private float mCalculatedPositionY = Float.NaN;

    public KeyPosition() {
        this.mType = 2;
    }

    private void calcCartesianPosition(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef54843", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            return;
        }
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float f7 = 0.0f;
        float f8 = Float.isNaN(this.mPercentX) ? 0.0f : this.mPercentX;
        float f9 = Float.isNaN(this.mAltPercentY) ? 0.0f : this.mAltPercentY;
        float f10 = Float.isNaN(this.mPercentY) ? 0.0f : this.mPercentY;
        if (!Float.isNaN(this.mAltPercentX)) {
            f7 = this.mAltPercentX;
        }
        this.mCalculatedPositionX = (int) (f + (f8 * f5) + (f7 * f6));
        this.mCalculatedPositionY = (int) (f2 + (f5 * f9) + (f6 * f10));
    }

    private void calcPathPosition(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afb7296a", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            return;
        }
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float f7 = this.mPercentX;
        float f8 = this.mPercentY;
        this.mCalculatedPositionX = f + (f5 * f7) + ((-f6) * f8);
        this.mCalculatedPositionY = f2 + (f6 * f7) + (f5 * f8);
    }

    public static /* synthetic */ Object ipc$super(KeyPosition keyPosition, String str, Object... objArr) {
        if (str.hashCode() == -843737632) {
            return super.copy((Key) objArr[0]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/motion/widget/KeyPosition");
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(HashMap<String, ViewSpline> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73d03d49", new Object[]{this, hashMap});
        }
    }

    @Override // androidx.constraintlayout.motion.widget.KeyPositionBase
    public void calcPosition(int i, int i2, float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("605108c5", new Object[]{this, new Integer(i), new Integer(i2), new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            return;
        }
        int i3 = this.mPositionType;
        if (i3 == 1) {
            calcPathPosition(f, f2, f3, f4);
        } else if (i3 != 2) {
            calcCartesianPosition(f, f2, f3, f4);
        } else {
            calcScreenPosition(i, i2);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key copy(Key key) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Key) ipChange.ipc$dispatch("cdb595e0", new Object[]{this, key});
        }
        super.copy(key);
        KeyPosition keyPosition = (KeyPosition) key;
        this.mTransitionEasing = keyPosition.mTransitionEasing;
        this.mPathMotionArc = keyPosition.mPathMotionArc;
        this.mDrawPath = keyPosition.mDrawPath;
        this.mPercentWidth = keyPosition.mPercentWidth;
        this.mPercentHeight = Float.NaN;
        this.mPercentX = keyPosition.mPercentX;
        this.mPercentY = keyPosition.mPercentY;
        this.mAltPercentX = keyPosition.mAltPercentX;
        this.mAltPercentY = keyPosition.mAltPercentY;
        this.mCalculatedPositionX = keyPosition.mCalculatedPositionX;
        this.mCalculatedPositionY = keyPosition.mCalculatedPositionY;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.KeyPositionBase
    public float getPositionX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc690d90", new Object[]{this})).floatValue();
        }
        return this.mCalculatedPositionX;
    }

    @Override // androidx.constraintlayout.motion.widget.KeyPositionBase
    public float getPositionY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc772511", new Object[]{this})).floatValue();
        }
        return this.mCalculatedPositionY;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78192133", new Object[]{this, context, attributeSet});
        } else {
            Loader.access$000(this, context.obtainStyledAttributes(attributeSet, R.styleable.KeyPosition));
        }
    }

    @Override // androidx.constraintlayout.motion.widget.KeyPositionBase
    public void positionAttributes(View view, RectF rectF, RectF rectF2, float f, float f2, String[] strArr, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f563dd", new Object[]{this, view, rectF, rectF2, new Float(f), new Float(f2), strArr, fArr});
            return;
        }
        int i = this.mPositionType;
        if (i == 1) {
            positionPathAttributes(rectF, rectF2, f, f2, strArr, fArr);
        } else if (i == 2) {
            positionScreenAttributes(view, rectF, rectF2, f, f2, strArr, fArr);
        } else if (i != 3) {
            positionCartAttributes(rectF, rectF2, f, f2, strArr, fArr);
        } else {
            positionAxisAttributes(rectF, rectF2, f, f2, strArr, fArr);
        }
    }

    public void setType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e09620", new Object[]{this, new Integer(i)});
        } else {
            this.mPositionType = i;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Loader {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final int CURVE_FIT = 4;
        private static final int DRAW_PATH = 5;
        private static final int FRAME_POSITION = 2;
        private static final int PATH_MOTION_ARC = 10;
        private static final int PERCENT_HEIGHT = 12;
        private static final int PERCENT_WIDTH = 11;
        private static final int PERCENT_X = 6;
        private static final int PERCENT_Y = 7;
        private static final int SIZE_PERCENT = 8;
        private static final int TARGET_ID = 1;
        private static final int TRANSITION_EASING = 3;
        private static final int TYPE = 9;
        private static SparseIntArray sAttrMap;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            sAttrMap = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyPosition_motionTarget, 1);
            sAttrMap.append(R.styleable.KeyPosition_framePosition, 2);
            sAttrMap.append(R.styleable.KeyPosition_transitionEasing, 3);
            sAttrMap.append(R.styleable.KeyPosition_curveFit, 4);
            sAttrMap.append(R.styleable.KeyPosition_drawPath, 5);
            sAttrMap.append(R.styleable.KeyPosition_percentX, 6);
            sAttrMap.append(R.styleable.KeyPosition_percentY, 7);
            sAttrMap.append(R.styleable.KeyPosition_keyPositionType, 9);
            sAttrMap.append(R.styleable.KeyPosition_sizePercent, 8);
            sAttrMap.append(R.styleable.KeyPosition_percentWidth, 11);
            sAttrMap.append(R.styleable.KeyPosition_percentHeight, 12);
            sAttrMap.append(R.styleable.KeyPosition_pathMotionArc, 10);
        }

        private Loader() {
        }

        public static /* synthetic */ void access$000(KeyPosition keyPosition, TypedArray typedArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b681e591", new Object[]{keyPosition, typedArray});
            } else {
                read(keyPosition, typedArray);
            }
        }

        private static void read(KeyPosition keyPosition, TypedArray typedArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0f7ddab", new Object[]{keyPosition, typedArray});
                return;
            }
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (sAttrMap.get(index)) {
                    case 1:
                        if (!MotionLayout.IS_IN_EDIT_MODE) {
                            if (typedArray.peekValue(index).type == 3) {
                                keyPosition.mTargetString = typedArray.getString(index);
                                break;
                            } else {
                                keyPosition.mTargetId = typedArray.getResourceId(index, keyPosition.mTargetId);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, keyPosition.mTargetId);
                            keyPosition.mTargetId = resourceId;
                            if (resourceId == -1) {
                                keyPosition.mTargetString = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        }
                    case 2:
                        keyPosition.mFramePosition = typedArray.getInt(index, keyPosition.mFramePosition);
                        break;
                    case 3:
                        if (typedArray.peekValue(index).type == 3) {
                            keyPosition.mTransitionEasing = typedArray.getString(index);
                            break;
                        } else {
                            keyPosition.mTransitionEasing = Easing.NAMED_EASING[typedArray.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        keyPosition.mCurveFit = typedArray.getInteger(index, keyPosition.mCurveFit);
                        break;
                    case 5:
                        keyPosition.mDrawPath = typedArray.getInt(index, keyPosition.mDrawPath);
                        break;
                    case 6:
                        keyPosition.mPercentX = typedArray.getFloat(index, keyPosition.mPercentX);
                        break;
                    case 7:
                        keyPosition.mPercentY = typedArray.getFloat(index, keyPosition.mPercentY);
                        break;
                    case 8:
                        float f = typedArray.getFloat(index, keyPosition.mPercentHeight);
                        keyPosition.mPercentWidth = f;
                        keyPosition.mPercentHeight = f;
                        break;
                    case 9:
                        keyPosition.mPositionType = typedArray.getInt(index, keyPosition.mPositionType);
                        break;
                    case 10:
                        keyPosition.mPathMotionArc = typedArray.getInt(index, keyPosition.mPathMotionArc);
                        break;
                    case 11:
                        keyPosition.mPercentWidth = typedArray.getFloat(index, keyPosition.mPercentWidth);
                        break;
                    case 12:
                        keyPosition.mPercentHeight = typedArray.getFloat(index, keyPosition.mPercentHeight);
                        break;
                    default:
                        Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + sAttrMap.get(index));
                        break;
                }
            }
            if (keyPosition.mFramePosition == -1) {
                Log.e("KeyPosition", "no frame position");
            }
        }
    }

    private void calcScreenPosition(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e899c711", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        float f = this.mPercentX;
        float f2 = 0;
        this.mCalculatedPositionX = (i * f) + f2;
        this.mCalculatedPositionY = (i2 * f) + f2;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key clone() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Key) ipChange.ipc$dispatch("94336aea", new Object[]{this}) : new KeyPosition().copy(this);
    }

    @Override // androidx.constraintlayout.motion.widget.KeyPositionBase
    public boolean intersects(int i, int i2, RectF rectF, RectF rectF2, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd7e4d41", new Object[]{this, new Integer(i), new Integer(i2), rectF, rectF2, new Float(f), new Float(f2)})).booleanValue();
        }
        calcPosition(i, i2, rectF.centerX(), rectF.centerY(), rectF2.centerX(), rectF2.centerY());
        return Math.abs(f - this.mCalculatedPositionX) < 20.0f && Math.abs(f2 - this.mCalculatedPositionY) < 20.0f;
    }

    public void positionAxisAttributes(RectF rectF, RectF rectF2, float f, float f2, String[] strArr, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("598af160", new Object[]{this, rectF, rectF2, new Float(f), new Float(f2), strArr, fArr});
            return;
        }
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float centerX2 = rectF2.centerX();
        float centerY2 = rectF2.centerY();
        if (centerX > centerX2) {
            centerX2 = centerX;
            centerX = centerX2;
        }
        if (centerY <= centerY2) {
            centerY2 = centerY;
            centerY = centerY2;
        }
        float f3 = centerX2 - centerX;
        float f4 = centerY - centerY2;
        String str = strArr[0];
        if (str == null) {
            strArr[0] = "percentX";
            fArr[0] = (f - centerX) / f3;
            strArr[1] = "percentY";
            fArr[1] = (f2 - centerY2) / f4;
        } else if ("percentX".equals(str)) {
            fArr[0] = (f - centerX) / f3;
            fArr[1] = (f2 - centerY2) / f4;
        } else {
            fArr[1] = (f - centerX) / f3;
            fArr[0] = (f2 - centerY2) / f4;
        }
    }

    public void positionCartAttributes(RectF rectF, RectF rectF2, float f, float f2, String[] strArr, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dcc4b41", new Object[]{this, rectF, rectF2, new Float(f), new Float(f2), strArr, fArr});
            return;
        }
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float centerX2 = rectF2.centerX() - centerX;
        float centerY2 = rectF2.centerY() - centerY;
        String str = strArr[0];
        if (str == null) {
            strArr[0] = "percentX";
            fArr[0] = (f - centerX) / centerX2;
            strArr[1] = "percentY";
            fArr[1] = (f2 - centerY) / centerY2;
        } else if ("percentX".equals(str)) {
            fArr[0] = (f - centerX) / centerX2;
            fArr[1] = (f2 - centerY) / centerY2;
        } else {
            fArr[1] = (f - centerX) / centerX2;
            fArr[0] = (f2 - centerY) / centerY2;
        }
    }

    public void positionScreenAttributes(View view, RectF rectF, RectF rectF2, float f, float f2, String[] strArr, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef9b1a9", new Object[]{this, view, rectF, rectF2, new Float(f), new Float(f2), strArr, fArr});
            return;
        }
        rectF.centerX();
        rectF.centerY();
        rectF2.centerX();
        rectF2.centerY();
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        String str = strArr[0];
        if (str == null) {
            strArr[0] = "percentX";
            fArr[0] = f / width;
            strArr[1] = "percentY";
            fArr[1] = f2 / height;
        } else if ("percentX".equals(str)) {
            fArr[0] = f / width;
            fArr[1] = f2 / height;
        } else {
            fArr[1] = f / width;
            fArr[0] = f2 / height;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
        if (r7.equals("percentHeight") == false) goto L_0x0024;
     */
    @Override // androidx.constraintlayout.motion.widget.Key
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setValue(java.lang.String r7, java.lang.Object r8) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            com.android.alibaba.ip.runtime.IpChange r4 = androidx.constraintlayout.motion.widget.KeyPosition.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0019
            java.lang.String r5 = "fe0c3f5c"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r6
            r3[r1] = r7
            r3[r0] = r8
            r4.ipc$dispatch(r5, r3)
            return
        L_0x0019:
            r7.hashCode()
            r4 = -1
            int r5 = r7.hashCode()
            switch(r5) {
                case -1812823328: goto L_0x006c;
                case -1127236479: goto L_0x0060;
                case -1017587252: goto L_0x0056;
                case -827014263: goto L_0x004a;
                case -200259324: goto L_0x003e;
                case 428090547: goto L_0x0032;
                case 428090548: goto L_0x0026;
                default: goto L_0x0024;
            }
        L_0x0024:
            r0 = -1
            goto L_0x0077
        L_0x0026:
            java.lang.String r0 = "percentY"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0030
            goto L_0x0024
        L_0x0030:
            r0 = 6
            goto L_0x0077
        L_0x0032:
            java.lang.String r0 = "percentX"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x003c
            goto L_0x0024
        L_0x003c:
            r0 = 5
            goto L_0x0077
        L_0x003e:
            java.lang.String r0 = "sizePercent"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0048
            goto L_0x0024
        L_0x0048:
            r0 = 4
            goto L_0x0077
        L_0x004a:
            java.lang.String r0 = "drawPath"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0054
            goto L_0x0024
        L_0x0054:
            r0 = 3
            goto L_0x0077
        L_0x0056:
            java.lang.String r1 = "percentHeight"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0077
            goto L_0x0024
        L_0x0060:
            java.lang.String r0 = "percentWidth"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x006a
            goto L_0x0024
        L_0x006a:
            r0 = 1
            goto L_0x0077
        L_0x006c:
            java.lang.String r0 = "transitionEasing"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0076
            goto L_0x0024
        L_0x0076:
            r0 = 0
        L_0x0077:
            switch(r0) {
                case 0: goto L_0x00a7;
                case 1: goto L_0x00a0;
                case 2: goto L_0x0099;
                case 3: goto L_0x0092;
                case 4: goto L_0x0089;
                case 5: goto L_0x0082;
                case 6: goto L_0x007b;
                default: goto L_0x007a;
            }
        L_0x007a:
            goto L_0x00ad
        L_0x007b:
            float r7 = r6.toFloat(r8)
            r6.mPercentY = r7
            goto L_0x00ad
        L_0x0082:
            float r7 = r6.toFloat(r8)
            r6.mPercentX = r7
            goto L_0x00ad
        L_0x0089:
            float r7 = r6.toFloat(r8)
            r6.mPercentWidth = r7
            r6.mPercentHeight = r7
            goto L_0x00ad
        L_0x0092:
            int r7 = r6.toInt(r8)
            r6.mDrawPath = r7
            goto L_0x00ad
        L_0x0099:
            float r7 = r6.toFloat(r8)
            r6.mPercentHeight = r7
            goto L_0x00ad
        L_0x00a0:
            float r7 = r6.toFloat(r8)
            r6.mPercentWidth = r7
            goto L_0x00ad
        L_0x00a7:
            java.lang.String r7 = r8.toString()
            r6.mTransitionEasing = r7
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.KeyPosition.setValue(java.lang.String, java.lang.Object):void");
    }

    public void positionPathAttributes(RectF rectF, RectF rectF2, float f, float f2, String[] strArr, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecb04f5c", new Object[]{this, rectF, rectF2, new Float(f), new Float(f2), strArr, fArr});
            return;
        }
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float centerX2 = rectF2.centerX() - centerX;
        float centerY2 = rectF2.centerY() - centerY;
        float hypot = (float) Math.hypot(centerX2, centerY2);
        if (hypot < 1.0E-4d) {
            System.out.println("distance ~ 0");
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        float f3 = centerX2 / hypot;
        float f4 = centerY2 / hypot;
        float f5 = f2 - centerY;
        float f6 = f - centerX;
        float f7 = ((f3 * f5) - (f6 * f4)) / hypot;
        float f8 = ((f3 * f6) + (f4 * f5)) / hypot;
        String str = strArr[0];
        if (str == null) {
            strArr[0] = "percentX";
            strArr[1] = "percentY";
            fArr[0] = f8;
            fArr[1] = f7;
        } else if ("percentX".equals(str)) {
            fArr[0] = f8;
            fArr[1] = f7;
        }
    }
}
