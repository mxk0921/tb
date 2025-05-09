package io.unicorn.embedding.android;

import android.graphics.Matrix;
import android.view.InputDevice;
import android.view.MotionEvent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import tb.hs9;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class AndroidTouchProcessor {
    public static final Matrix d = new Matrix();

    /* renamed from: a  reason: collision with root package name */
    public final hs9 f15169a;
    public final a b = a.a();
    public final boolean c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public @interface PointerChange {
        public static final int ADD = 1;
        public static final int CANCEL = 0;
        public static final int DOWN = 4;
        public static final int HOVER = 3;
        public static final int MOVE = 5;
        public static final int REMOVE = 2;
        public static final int UP = 6;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public @interface PointerDeviceKind {
        public static final int INVERTED_STYLUS = 3;
        public static final int MOUSE = 1;
        public static final int STYLUS = 2;
        public static final int TOUCH = 0;
        public static final int UNKNOWN = 4;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public @interface PointerSignalKind {
        public static final int NONE = 0;
        public static final int SCROLL = 1;
        public static final int UNKNOWN = 2;
    }

    static {
        t2o.a(945815618);
    }

    public AndroidTouchProcessor(hs9 hs9Var, boolean z) {
        this.f15169a = hs9Var;
        this.c = z;
    }

    public final void a(MotionEvent motionEvent, int i, int i2, int i3, Matrix matrix, ByteBuffer byteBuffer) {
        long j;
        int i4;
        float[] fArr;
        long j2;
        double d2;
        double d3;
        double d4;
        InputDevice.MotionRange motionRange;
        if (i2 != -1) {
            if (this.c) {
                j = this.b.c(motionEvent).d();
            } else {
                j = 0;
            }
            int c = c(motionEvent.getToolType(i));
            if (motionEvent.getActionMasked() == 8) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            byteBuffer.putLong(j);
            byteBuffer.putLong(motionEvent.getEventTime() * 1000);
            byteBuffer.putLong(i2);
            byteBuffer.putLong(c);
            byteBuffer.putLong(i4);
            byteBuffer.putLong(motionEvent.getPointerId(i));
            byteBuffer.putLong(0L);
            matrix.mapPoints(new float[]{motionEvent.getX(i), motionEvent.getY(i)});
            byteBuffer.putDouble(fArr[0]);
            byteBuffer.putDouble(fArr[1]);
            byteBuffer.putDouble(vu3.b.GEO_NOT_SUPPORT);
            byteBuffer.putDouble(vu3.b.GEO_NOT_SUPPORT);
            if (c == 1) {
                j2 = motionEvent.getButtonState() & 31;
                if (j2 == 0 && motionEvent.getSource() == 8194 && (i2 == 4 || i2 == 5)) {
                    j2 = 1;
                }
            } else {
                j2 = c == 2 ? (motionEvent.getButtonState() >> 4) & 15 : 0L;
            }
            byteBuffer.putLong(j2);
            byteBuffer.putLong(0L);
            byteBuffer.putLong(0L);
            byteBuffer.putDouble(motionEvent.getPressure(i));
            if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
                d2 = 1.0d;
                d3 = vu3.b.GEO_NOT_SUPPORT;
            } else {
                d3 = motionRange.getMin();
                d2 = motionRange.getMax();
            }
            byteBuffer.putDouble(d3);
            byteBuffer.putDouble(d2);
            if (c == 2) {
                byteBuffer.putDouble(motionEvent.getAxisValue(24, i));
                d4 = vu3.b.GEO_NOT_SUPPORT;
                byteBuffer.putDouble(vu3.b.GEO_NOT_SUPPORT);
            } else {
                d4 = vu3.b.GEO_NOT_SUPPORT;
                byteBuffer.putDouble(vu3.b.GEO_NOT_SUPPORT);
                byteBuffer.putDouble(vu3.b.GEO_NOT_SUPPORT);
            }
            byteBuffer.putDouble(motionEvent.getSize(i));
            byteBuffer.putDouble(motionEvent.getToolMajor(i));
            byteBuffer.putDouble(motionEvent.getToolMinor(i));
            byteBuffer.putDouble(d4);
            byteBuffer.putDouble(d4);
            byteBuffer.putDouble(motionEvent.getAxisValue(8, i));
            if (c == 2) {
                byteBuffer.putDouble(motionEvent.getAxisValue(25, i));
            } else {
                byteBuffer.putDouble(d4);
            }
            byteBuffer.putLong(i3);
            if (i4 == 1) {
                byteBuffer.putDouble(-motionEvent.getAxisValue(10));
                byteBuffer.putDouble(-motionEvent.getAxisValue(9));
                return;
            }
            byteBuffer.putDouble(vu3.b.GEO_NOT_SUPPORT);
            byteBuffer.putDouble(vu3.b.GEO_NOT_SUPPORT);
        }
    }

    public final int b(int i) {
        if (i == 0) {
            return 4;
        }
        if (i == 1) {
            return 6;
        }
        if (i == 5) {
            return 4;
        }
        if (i == 6) {
            return 6;
        }
        if (i == 2) {
            return 5;
        }
        if (i == 7) {
            return 3;
        }
        if (i == 3) {
            return 0;
        }
        if (i == 8) {
            return 3;
        }
        return -1;
    }

    public final int c(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 1;
        }
        if (i != 4) {
            return 4;
        }
        return 3;
    }

    public boolean d(MotionEvent motionEvent) {
        boolean z;
        boolean isFromSource = motionEvent.isFromSource(2);
        if (motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8) {
            z = true;
        } else {
            z = false;
        }
        if (!isFromSource || !z) {
            return false;
        }
        int b = b(motionEvent.getActionMasked());
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 232);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        a(motionEvent, motionEvent.getActionIndex(), b, 0, d, allocateDirect);
        if (allocateDirect.position() % 232 == 0) {
            this.f15169a.i(allocateDirect, allocateDirect.position());
            return true;
        }
        throw new AssertionError("Packet position is not on field boundary.");
    }

    public boolean e(MotionEvent motionEvent) {
        f(motionEvent, d);
        return true;
    }

    public boolean f(MotionEvent motionEvent, Matrix matrix) {
        boolean z;
        boolean z2;
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(pointerCount * 232);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        int actionMasked = motionEvent.getActionMasked();
        int b = b(motionEvent.getActionMasked());
        if (actionMasked == 0 || actionMasked == 5) {
            z = true;
        } else {
            z = false;
        }
        if (z || !(actionMasked == 1 || actionMasked == 6)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z) {
            a(motionEvent, motionEvent.getActionIndex(), b, 0, matrix, allocateDirect);
        } else if (z2) {
            for (int i = 0; i < pointerCount; i++) {
                if (i != motionEvent.getActionIndex() && motionEvent.getToolType(i) == 1) {
                    a(motionEvent, i, 5, 1, matrix, allocateDirect);
                }
            }
            a(motionEvent, motionEvent.getActionIndex(), b, 0, matrix, allocateDirect);
        } else {
            for (int i2 = 0; i2 < pointerCount; i2++) {
                a(motionEvent, i2, b, 0, matrix, allocateDirect);
            }
        }
        if (allocateDirect.position() % 232 == 0) {
            this.f15169a.i(allocateDirect, allocateDirect.position());
            return true;
        }
        throw new AssertionError("Packet position is not on field boundary");
    }

    public static void g() {
    }
}
