package androidx.transition;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class MatrixUtils {
    public static final Matrix IDENTITY_MATRIX = new Matrix() { // from class: androidx.transition.MatrixUtils.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/transition/MatrixUtils$1");
        }

        public void oops() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bffefeea", new Object[]{this});
                return;
            }
            throw new IllegalStateException("Matrix can not be modified");
        }

        @Override // android.graphics.Matrix
        public boolean postConcat(Matrix matrix) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9bcce065", new Object[]{this, matrix})).booleanValue();
            }
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postRotate(float f, float f2, float f3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8688db62", new Object[]{this, new Float(f), new Float(f2), new Float(f3)})).booleanValue();
            }
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postScale(float f, float f2, float f3, float f4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7f4f9395", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)})).booleanValue();
            }
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postSkew(float f, float f2, float f3, float f4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a0cb10d5", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)})).booleanValue();
            }
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postTranslate(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c84780d9", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
            }
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preConcat(Matrix matrix) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("29572f82", new Object[]{this, matrix})).booleanValue();
            }
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preRotate(float f, float f2, float f3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("87ef5e3f", new Object[]{this, new Float(f), new Float(f2), new Float(f3)})).booleanValue();
            }
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preScale(float f, float f2, float f3, float f4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("80b61672", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)})).booleanValue();
            }
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preSkew(float f, float f2, float f3, float f4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6f4a3e58", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)})).booleanValue();
            }
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preTranslate(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a18c076", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
            }
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public void reset() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e6256", new Object[]{this});
            } else {
                oops();
            }
        }

        @Override // android.graphics.Matrix
        public void set(Matrix matrix) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4ff95a93", new Object[]{this, matrix});
            } else {
                oops();
            }
        }

        @Override // android.graphics.Matrix
        public boolean setConcat(Matrix matrix, Matrix matrix2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5ff5e1", new Object[]{this, matrix, matrix2})).booleanValue();
            }
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean setPolyToPoly(float[] fArr, int i, float[] fArr2, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c404b2ab", new Object[]{this, fArr, new Integer(i), fArr2, new Integer(i2), new Integer(i3)})).booleanValue();
            }
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean setRectToRect(RectF rectF, RectF rectF2, Matrix.ScaleToFit scaleToFit) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fffa336", new Object[]{this, rectF, rectF2, scaleToFit})).booleanValue();
            }
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public void setRotate(float f, float f2, float f3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d87f62dc", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
            } else {
                oops();
            }
        }

        @Override // android.graphics.Matrix
        public void setScale(float f, float f2, float f3, float f4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d1461b0f", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            } else {
                oops();
            }
        }

        @Override // android.graphics.Matrix
        public void setSinCos(float f, float f2, float f3, float f4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37910c98", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            } else {
                oops();
            }
        }

        @Override // android.graphics.Matrix
        public void setSkew(float f, float f2, float f3, float f4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe46a193", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            } else {
                oops();
            }
        }

        @Override // android.graphics.Matrix
        public void setTranslate(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("76ba20d3", new Object[]{this, new Float(f), new Float(f2)});
            } else {
                oops();
            }
        }

        @Override // android.graphics.Matrix
        public void setValues(float[] fArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70284bb6", new Object[]{this, fArr});
            } else {
                oops();
            }
        }

        @Override // android.graphics.Matrix
        public boolean postRotate(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b03922e2", new Object[]{this, new Float(f)})).booleanValue();
            }
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postScale(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cfa64bd5", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
            }
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postSkew(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("38601915", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
            }
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preRotate(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e02cb8ff", new Object[]{this, new Float(f)})).booleanValue();
            }
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preScale(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ff99e1f2", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
            }
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preSkew(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("94c2cb58", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
            }
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public void setRotate(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc8771dc", new Object[]{this, new Float(f)});
            } else {
                oops();
            }
        }

        @Override // android.graphics.Matrix
        public void setScale(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fbf49acf", new Object[]{this, new Float(f), new Float(f2)});
            } else {
                oops();
            }
        }

        @Override // android.graphics.Matrix
        public void setSinCos(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2305a98", new Object[]{this, new Float(f), new Float(f2)});
            } else {
                oops();
            }
        }

        @Override // android.graphics.Matrix
        public void setSkew(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5acf253", new Object[]{this, new Float(f), new Float(f2)});
            } else {
                oops();
            }
        }
    };

    private MatrixUtils() {
    }
}
