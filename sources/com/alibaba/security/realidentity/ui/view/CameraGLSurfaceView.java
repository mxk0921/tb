package com.alibaba.security.realidentity.ui.view;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CameraGLSurfaceView extends GLSurfaceView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public CameraGLSurfaceView(Context context) {
        super(context);
        a(context);
    }

    public static /* synthetic */ Object ipc$super(CameraGLSurfaceView cameraGLSurfaceView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/ui/view/CameraGLSurfaceView");
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            setEGLContextClientVersion(2);
        }
    }

    public CameraGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }
}
