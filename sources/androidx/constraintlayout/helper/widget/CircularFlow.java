package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.VirtualLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class CircularFlow extends VirtualLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "CircularFlow";
    private static float sDefaultAngle;
    private static int sDefaultRadius;
    private float[] mAngles;
    public ConstraintLayout mContainer;
    private int mCountAngle;
    private int mCountRadius;
    private int[] mRadius;
    private String mReferenceAngles;
    private Float mReferenceDefaultAngle;
    private Integer mReferenceDefaultRadius;
    private String mReferenceRadius;
    public int mViewCenter;

    public CircularFlow(Context context) {
        super(context);
    }

    private void addAngle(String str) {
        float[] fArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bc415c3", new Object[]{this, str});
        } else if (str != null && str.length() != 0 && this.myContext != null && (fArr = this.mAngles) != null) {
            if (this.mCountAngle + 1 > fArr.length) {
                this.mAngles = Arrays.copyOf(fArr, fArr.length + 1);
            }
            this.mAngles[this.mCountAngle] = Integer.parseInt(str);
            this.mCountAngle++;
        }
    }

    private void addRadius(String str) {
        int[] iArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76154ee4", new Object[]{this, str});
        } else if (str != null && str.length() != 0 && this.myContext != null && (iArr = this.mRadius) != null) {
            if (this.mCountRadius + 1 > iArr.length) {
                this.mRadius = Arrays.copyOf(iArr, iArr.length + 1);
            }
            this.mRadius[this.mCountRadius] = (int) (Integer.parseInt(str) * this.myContext.getResources().getDisplayMetrics().density);
            this.mCountRadius++;
        }
    }

    private void anchorReferences() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12e9d924", new Object[]{this});
            return;
        }
        this.mContainer = (ConstraintLayout) getParent();
        for (int i = 0; i < this.mCount; i++) {
            View viewById = this.mContainer.getViewById(this.mIds[i]);
            if (viewById != null) {
                int i2 = sDefaultRadius;
                float f = sDefaultAngle;
                int[] iArr = this.mRadius;
                if (iArr == null || i >= iArr.length) {
                    Integer num = this.mReferenceDefaultRadius;
                    if (num == null || num.intValue() == -1) {
                        Log.e(TAG, "Added radius to view with id: " + this.mMap.get(Integer.valueOf(viewById.getId())));
                    } else {
                        this.mCountRadius++;
                        if (this.mRadius == null) {
                            this.mRadius = new int[1];
                        }
                        int[] radius = getRadius();
                        this.mRadius = radius;
                        radius[this.mCountRadius - 1] = i2;
                    }
                } else {
                    i2 = iArr[i];
                }
                float[] fArr = this.mAngles;
                if (fArr == null || i >= fArr.length) {
                    Float f2 = this.mReferenceDefaultAngle;
                    if (f2 == null || f2.floatValue() == -1.0f) {
                        Log.e(TAG, "Added angle to view with id: " + this.mMap.get(Integer.valueOf(viewById.getId())));
                    } else {
                        this.mCountAngle++;
                        if (this.mAngles == null) {
                            this.mAngles = new float[1];
                        }
                        float[] angles = getAngles();
                        this.mAngles = angles;
                        angles[this.mCountAngle - 1] = f;
                    }
                } else {
                    f = fArr[i];
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) viewById.getLayoutParams();
                layoutParams.circleAngle = f;
                layoutParams.circleConstraint = this.mViewCenter;
                layoutParams.circleRadius = i2;
                viewById.setLayoutParams(layoutParams);
            }
        }
        applyLayoutFeatures();
    }

    public static /* synthetic */ Object ipc$super(CircularFlow circularFlow, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1832146921) {
            super.init((AttributeSet) objArr[0]);
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else if (hashCode == 1811093877) {
            return new Integer(super.removeView((View) objArr[0]));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/constraintlayout/helper/widget/CircularFlow");
        }
    }

    private float[] removeAngle(float[] fArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("b2f1b7ff", new Object[]{this, fArr, new Integer(i)});
        }
        if (fArr == null || i < 0 || i >= this.mCountAngle) {
            return fArr;
        }
        return removeElementFromArray(fArr, i);
    }

    private static int[] removeElementFromArray(int[] iArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("9a6c89ad", new Object[]{iArr, new Integer(i)});
        }
        int[] iArr2 = new int[iArr.length - 1];
        int i2 = 0;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (i3 != i) {
                i2++;
                iArr2[i2] = iArr[i3];
            }
        }
        return iArr2;
    }

    private int[] removeRadius(int[] iArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("fceb230c", new Object[]{this, iArr, new Integer(i)});
        }
        return (iArr == null || i < 0 || i >= this.mCountRadius) ? iArr : removeElementFromArray(iArr, i);
    }

    private void setAngles(String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("415ea613", new Object[]{this, str});
        } else if (str != null) {
            this.mCountAngle = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    addAngle(str.substring(i).trim());
                    return;
                } else {
                    addAngle(str.substring(i, indexOf).trim());
                    i = indexOf + 1;
                }
            }
        }
    }

    private void setRadius(String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("841e5725", new Object[]{this, str});
        } else if (str != null) {
            this.mCountRadius = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    addRadius(str.substring(i).trim());
                    return;
                } else {
                    addRadius(str.substring(i, indexOf).trim());
                    i = indexOf + 1;
                }
            }
        }
    }

    public void addViewToCircularFlow(View view, int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5e3abfa", new Object[]{this, view, new Integer(i), new Float(f)});
        } else if (!containsId(view.getId())) {
            addView(view);
            this.mCountAngle++;
            float[] angles = getAngles();
            this.mAngles = angles;
            angles[this.mCountAngle - 1] = f;
            this.mCountRadius++;
            int[] radius = getRadius();
            this.mRadius = radius;
            radius[this.mCountRadius - 1] = (int) (i * this.myContext.getResources().getDisplayMetrics().density);
            anchorReferences();
        }
    }

    public float[] getAngles() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("5c41f204", new Object[]{this});
        }
        return Arrays.copyOf(this.mAngles, this.mCountAngle);
    }

    public int[] getRadius() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("31a9f2b5", new Object[]{this});
        }
        return Arrays.copyOf(this.mRadius, this.mCountRadius);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public void init(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92cba817", new Object[]{this, attributeSet});
            return;
        }
        super.init(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ConstraintLayout_Layout_circularflow_viewCenter) {
                    this.mViewCenter = obtainStyledAttributes.getResourceId(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_circularflow_angles) {
                    String string = obtainStyledAttributes.getString(index);
                    this.mReferenceAngles = string;
                    setAngles(string);
                } else if (index == R.styleable.ConstraintLayout_Layout_circularflow_radiusInDP) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.mReferenceRadius = string2;
                    setRadius(string2);
                } else if (index == R.styleable.ConstraintLayout_Layout_circularflow_defaultAngle) {
                    Float valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, sDefaultAngle));
                    this.mReferenceDefaultAngle = valueOf;
                    setDefaultAngle(valueOf.floatValue());
                } else if (index == R.styleable.ConstraintLayout_Layout_circularflow_defaultRadius) {
                    Integer valueOf2 = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, sDefaultRadius));
                    this.mReferenceDefaultRadius = valueOf2;
                    setDefaultRadius(valueOf2.intValue());
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public boolean isUpdatable(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b78f7303", new Object[]{this, view})).booleanValue();
        }
        if (containsId(view.getId()) && indexFromId(view.getId()) != -1) {
            return true;
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        String str = this.mReferenceAngles;
        if (str != null) {
            this.mAngles = new float[1];
            setAngles(str);
        }
        String str2 = this.mReferenceRadius;
        if (str2 != null) {
            this.mRadius = new int[1];
            setRadius(str2);
        }
        Float f = this.mReferenceDefaultAngle;
        if (f != null) {
            setDefaultAngle(f.floatValue());
        }
        Integer num = this.mReferenceDefaultRadius;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        anchorReferences();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public int removeView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6bf31975", new Object[]{this, view})).intValue();
        }
        int removeView = super.removeView(view);
        if (removeView == -1) {
            return removeView;
        }
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this.mContainer);
        constraintSet.clear(view.getId(), 8);
        constraintSet.applyTo(this.mContainer);
        float[] fArr = this.mAngles;
        if (removeView < fArr.length) {
            this.mAngles = removeAngle(fArr, removeView);
            this.mCountAngle--;
        }
        int[] iArr = this.mRadius;
        if (removeView < iArr.length) {
            this.mRadius = removeRadius(iArr, removeView);
            this.mCountRadius--;
        }
        anchorReferences();
        return removeView;
    }

    public void setDefaultAngle(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5258b005", new Object[]{this, new Float(f)});
        } else {
            sDefaultAngle = f;
        }
    }

    public void setDefaultRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("442b110b", new Object[]{this, new Integer(i)});
        } else {
            sDefaultRadius = i;
        }
    }

    public void updateAngle(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2980abbf", new Object[]{this, view, new Float(f)});
        } else if (!isUpdatable(view)) {
            Log.e(TAG, "It was not possible to update angle to view with id: " + view.getId());
        } else {
            int indexFromId = indexFromId(view.getId());
            if (indexFromId <= this.mAngles.length) {
                float[] angles = getAngles();
                this.mAngles = angles;
                angles[indexFromId] = f;
                anchorReferences();
            }
        }
    }

    public void updateRadius(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46022533", new Object[]{this, view, new Integer(i)});
        } else if (!isUpdatable(view)) {
            Log.e(TAG, "It was not possible to update radius to view with id: " + view.getId());
        } else {
            int indexFromId = indexFromId(view.getId());
            if (indexFromId <= this.mRadius.length) {
                int[] radius = getRadius();
                this.mRadius = radius;
                radius[indexFromId] = (int) (i * this.myContext.getResources().getDisplayMetrics().density);
                anchorReferences();
            }
        }
    }

    public void updateReference(View view, int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d699c506", new Object[]{this, view, new Integer(i), new Float(f)});
        } else if (!isUpdatable(view)) {
            Log.e(TAG, "It was not possible to update radius and angle to view with id: " + view.getId());
        } else {
            int indexFromId = indexFromId(view.getId());
            if (getAngles().length > indexFromId) {
                float[] angles = getAngles();
                this.mAngles = angles;
                angles[indexFromId] = f;
            }
            if (getRadius().length > indexFromId) {
                int[] radius = getRadius();
                this.mRadius = radius;
                radius[indexFromId] = (int) (i * this.myContext.getResources().getDisplayMetrics().density);
            }
            anchorReferences();
        }
    }

    public CircularFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircularFlow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private static float[] removeElementFromArray(float[] fArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("9a424327", new Object[]{fArr, new Integer(i)});
        }
        float[] fArr2 = new float[fArr.length - 1];
        int i2 = 0;
        for (int i3 = 0; i3 < fArr.length; i3++) {
            if (i3 != i) {
                i2++;
                fArr2[i2] = fArr[i3];
            }
        }
        return fArr2;
    }
}
