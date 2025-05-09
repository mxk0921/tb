package tb;

import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.themis.graphics.JNIBridge;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class s5u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JNIBridge f27812a;
    public final float b;

    public s5u(JNIBridge jNIBridge, float f) {
        this.f27812a = jNIBridge;
        this.b = f <= 0.0f ? 1.0f : f;
    }

    public final void a(MotionEvent motionEvent, int i, int i2, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38a36eb0", new Object[]{this, motionEvent, new Integer(i), new Integer(i2), byteBuffer});
        } else if (i2 != -1) {
            byteBuffer.putLong(motionEvent.getEventTime() * 1000);
            byteBuffer.putLong(i2);
            byteBuffer.putLong(motionEvent.getPointerId(i));
            if (i == 0) {
                byteBuffer.putDouble(d(motionEvent.getRawX()));
                byteBuffer.putDouble(d(motionEvent.getRawX()));
            } else {
                byteBuffer.putDouble(d(motionEvent.getX(i)));
                byteBuffer.putDouble(d(motionEvent.getY(i)));
            }
            byteBuffer.putDouble(d(motionEvent.getX(i)));
            byteBuffer.putDouble(d(motionEvent.getY(i)));
        }
    }

    public final int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14bcf6c7", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 5) {
            return 1;
        }
        if (i == 6) {
            return 3;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 0;
        }
        return -1;
    }

    public boolean c(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(pointerCount * 56);
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
            a(motionEvent, motionEvent.getActionIndex(), b, allocateDirect);
        } else if (z2) {
            while (i < pointerCount) {
                if (i != motionEvent.getActionIndex() && motionEvent.getToolType(i) == 1) {
                    a(motionEvent, i, 2, allocateDirect);
                }
                i++;
            }
            a(motionEvent, motionEvent.getActionIndex(), b, allocateDirect);
        } else {
            while (i < pointerCount) {
                a(motionEvent, i, b, allocateDirect);
                i++;
            }
        }
        if (allocateDirect.position() % 56 == 0) {
            this.f27812a.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
            return true;
        }
        throw new AssertionError("Packet position is not on field boundary");
    }

    public final int d(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15d9a896", new Object[]{this, new Float(f)})).intValue();
        }
        return (int) ((f / this.b) + 0.5f);
    }
}
