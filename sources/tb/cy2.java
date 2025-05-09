package tb;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import androidx.core.math.MathUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class cy2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final float b;
    public final Rect c;
    public final boolean d;

    /* renamed from: a  reason: collision with root package name */
    public final Rect f17430a = new Rect();
    public final float e = -1.0f;

    static {
        t2o.a(481296898);
    }

    public cy2(CameraCharacteristics cameraCharacteristics) {
        Rect rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        this.c = rect;
        boolean z = false;
        if (rect == null) {
            this.b = 1.0f;
            this.d = false;
            agh.h("Camera2_Camera2Zoom", "mSensorSize is null");
            return;
        }
        Float f = (Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        float floatValue = (f == null || f.floatValue() < 1.0f) ? 1.0f : f.floatValue();
        this.b = floatValue;
        agh.h("Camera2_Camera2Zoom", "maxZoom: " + floatValue);
        this.d = Float.compare(floatValue, 1.0f) > 0 ? true : z;
    }

    public void a(CaptureRequest.Builder builder, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6628a64", new Object[]{this, builder, new Float(f)});
        } else if (!this.d) {
            agh.h("Camera2_Camera2Zoom", "setZoom: not supported");
        } else {
            float f2 = this.b;
            float clamp = MathUtils.clamp(f * f2, 1.0f, f2);
            int width = this.c.width() / 2;
            int height = this.c.height() / 2;
            int width2 = (int) ((this.c.width() * 0.5f) / clamp);
            int height2 = (int) ((this.c.height() * 0.5f) / clamp);
            this.f17430a.set(width - width2, height - height2, width + width2, height + height2);
            builder.set(CaptureRequest.SCALER_CROP_REGION, this.f17430a);
        }
    }

    public void b(CaptureRequest.Builder builder, float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c38f7ba", new Object[]{this, builder, new Float(f), new Integer(i)});
        } else if (!this.d) {
            agh.h("Camera2_Camera2Zoom", "setZoom: not supported");
        } else {
            float min = f < 0.0f ? 0.0f : Math.min(f, this.b);
            if (i == 1) {
                float f2 = this.e;
                if (f2 >= 0.0f && min <= f2) {
                    return;
                }
            } else if (i == 2) {
                float f3 = this.e;
                if (f3 >= 0.0f && min >= f3) {
                    return;
                }
            } else {
                float f4 = this.e;
                if (f4 >= 0.0f && min == f4) {
                    return;
                }
            }
            int width = this.c.width() / 2;
            int height = this.c.height() / 2;
            int width2 = (int) ((this.c.width() * 0.5f) / min);
            int height2 = (int) ((this.c.height() * 0.5f) / min);
            this.f17430a.set(width - width2, height - height2, width + width2, height + height2);
            builder.set(CaptureRequest.SCALER_CROP_REGION, this.f17430a);
        }
    }
}
