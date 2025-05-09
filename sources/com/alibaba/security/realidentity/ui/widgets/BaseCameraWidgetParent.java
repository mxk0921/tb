package com.alibaba.security.realidentity.ui.widgets;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.alibaba.security.realidentity.e;
import com.alibaba.security.realidentity.ui.view.CameraGLSurfaceView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.text.DecimalFormat;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class BaseCameraWidgetParent extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String b = "BaseCameraWidgetParent";

    /* renamed from: a  reason: collision with root package name */
    public CameraGLSurfaceView f2871a;

    public BaseCameraWidgetParent(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(BaseCameraWidgetParent baseCameraWidgetParent, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1705336120) {
            super.setVisibility(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == -436676516) {
            super.onFinishInflate();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/security/realidentity/ui/widgets/BaseCameraWidgetParent");
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        CameraGLSurfaceView cameraGLSurfaceView = this.f2871a;
        if (cameraGLSurfaceView != null) {
            cameraGLSurfaceView.onPause();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        CameraGLSurfaceView cameraGLSurfaceView = this.f2871a;
        if (cameraGLSurfaceView != null) {
            cameraGLSurfaceView.onResume();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        CameraGLSurfaceView cameraGLSurfaceView = this.f2871a;
        if (cameraGLSurfaceView != null) {
            cameraGLSurfaceView.requestRender();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5f8d85c", new Object[]{this});
            return;
        }
        super.onFinishInflate();
        this.f2871a = (CameraGLSurfaceView) findViewById(R.id.abfl_widget_camera_surface);
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26f3255b", new Object[]{this, renderer});
        } else {
            this.f2871a.setRenderer(renderer);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5aa2c8", new Object[]{this, new Integer(i)});
            return;
        }
        this.f2871a.setVisibility(i);
        super.setVisibility(i);
    }

    public BaseCameraWidgetParent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619793b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#0");
        float parseFloat = Float.parseFloat(decimalFormat.format(e.a(getContext()) * 2.0f));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f2871a.getLayoutParams();
        int i4 = (int) parseFloat;
        layoutParams.width = i4;
        layoutParams.height = (int) ((Float.parseFloat(decimalFormat.format(i)) / Float.parseFloat(decimalFormat.format(i2))) * parseFloat);
        layoutParams.gravity = 49;
        layoutParams.topMargin = i3 - (i4 / 2);
        this.f2871a.setLayoutParams(layoutParams);
    }

    public BaseCameraWidgetParent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
            return;
        }
        CameraGLSurfaceView cameraGLSurfaceView = this.f2871a;
        if (cameraGLSurfaceView != null) {
            cameraGLSurfaceView.queueEvent(runnable);
        }
    }
}
