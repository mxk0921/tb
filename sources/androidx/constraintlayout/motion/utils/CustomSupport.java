package androidx.constraintlayout.motion.utils;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class CustomSupport {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG = false;
    private static final String TAG = "CustomSupport";

    /* compiled from: Taobao */
    /* renamed from: androidx.constraintlayout.motion.utils.CustomSupport$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType;

        static {
            int[] iArr = new int[ConstraintAttribute.AttributeType.values().length];
            $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType = iArr;
            try {
                iArr[ConstraintAttribute.AttributeType.INT_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[ConstraintAttribute.AttributeType.FLOAT_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[ConstraintAttribute.AttributeType.COLOR_DRAWABLE_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[ConstraintAttribute.AttributeType.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[ConstraintAttribute.AttributeType.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[ConstraintAttribute.AttributeType.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[ConstraintAttribute.AttributeType.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private static int clamp(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9591374", new Object[]{new Integer(i)})).intValue();
        }
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public static void setInterpolatedValue(ConstraintAttribute constraintAttribute, View view, float[] fArr) {
        NoSuchMethodException e;
        IllegalAccessException e2;
        InvocationTargetException e3;
        String str = "\"";
        Class<?> cls = view.getClass();
        String str2 = "set" + constraintAttribute.getName();
        try {
            try {
                try {
                    try {
                        switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[constraintAttribute.getType().ordinal()]) {
                            case 1:
                                str = str;
                                cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf((int) fArr[0]));
                                return;
                            case 2:
                                str = str;
                                cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                                return;
                            case 3:
                                str = str;
                                Method method = cls.getMethod(str2, Drawable.class);
                                int clamp = clamp((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f));
                                int clamp2 = clamp((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f));
                                ColorDrawable colorDrawable = new ColorDrawable();
                                colorDrawable.setColor((clamp << 16) | (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp2 << 8) | clamp((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f)));
                                method.invoke(view, colorDrawable);
                                return;
                            case 4:
                                try {
                                } catch (IllegalAccessException e4) {
                                    e2 = e4;
                                    str = str;
                                } catch (NoSuchMethodException e5) {
                                    e = e5;
                                    str = str;
                                }
                                try {
                                    str = str;
                                } catch (IllegalAccessException e6) {
                                    e2 = e6;
                                    Log.e(TAG, "Cannot access method " + str2 + " on View \"" + Debug.getName(view) + str, e2);
                                    return;
                                } catch (NoSuchMethodException e7) {
                                    e = e7;
                                    Log.e(TAG, "No method " + str2 + " on View \"" + Debug.getName(view) + str, e);
                                    return;
                                } catch (InvocationTargetException e8) {
                                    e3 = e8;
                                    str = str;
                                    Log.e(TAG, "Cannot invoke method " + str2 + " on View \"" + Debug.getName(view) + str, e3);
                                    return;
                                }
                                try {
                                    cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf((clamp((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | clamp((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                                    return;
                                } catch (IllegalAccessException e9) {
                                    e2 = e9;
                                    Log.e(TAG, "Cannot access method " + str2 + " on View \"" + Debug.getName(view) + str, e2);
                                    return;
                                } catch (NoSuchMethodException e10) {
                                    e = e10;
                                    Log.e(TAG, "No method " + str2 + " on View \"" + Debug.getName(view) + str, e);
                                    return;
                                } catch (InvocationTargetException e11) {
                                    e3 = e11;
                                    Log.e(TAG, "Cannot invoke method " + str2 + " on View \"" + Debug.getName(view) + str, e3);
                                    return;
                                }
                            case 5:
                                throw new RuntimeException("unable to interpolate strings " + constraintAttribute.getName());
                            case 6:
                                cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(fArr[0] > 0.5f));
                                return;
                            case 7:
                                cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                                return;
                            default:
                                return;
                        }
                    } catch (IllegalAccessException e12) {
                        e2 = e12;
                    } catch (NoSuchMethodException e13) {
                        e = e13;
                    } catch (InvocationTargetException e14) {
                        e3 = e14;
                    }
                } catch (IllegalAccessException e15) {
                    e2 = e15;
                } catch (NoSuchMethodException e16) {
                    e = e16;
                }
            } catch (InvocationTargetException e17) {
                e3 = e17;
            }
        } catch (IllegalAccessException e18) {
            e2 = e18;
        } catch (NoSuchMethodException e19) {
            e = e19;
        }
    }
}
