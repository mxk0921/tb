package com.zoloz.android.phone.zdoc.camera.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.DisplayUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.alb;
import tb.t2o;
import tb.xv0;
import tb.zkb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class CameraSurfaceView extends SurfaceView implements SurfaceHolder.Callback, AbsSurfaceView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static alb mCameraInterface = null;
    public zkb mCameraCallback;
    public Context mContext;
    public float mPreviewRate;
    public SurfaceHolder mSurfaceHolder;

    static {
        t2o.a(245366910);
        t2o.a(245366909);
    }

    public CameraSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        this.mPreviewRate = DisplayUtil.getScreenRate(applicationContext);
        SurfaceHolder holder = getHolder();
        this.mSurfaceHolder = holder;
        holder.setFormat(-2);
        this.mSurfaceHolder.setType(3);
        this.mSurfaceHolder.addCallback(this);
    }

    @Deprecated
    public static alb getCameraImpl(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (alb) ipChange.ipc$dispatch("4ec8d4df", new Object[]{context});
        }
        if (mCameraInterface == null) {
            mCameraInterface = new xv0(context);
        }
        return mCameraInterface;
    }

    public static /* synthetic */ Object ipc$super(CameraSurfaceView cameraSurfaceView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/zoloz/android/phone/zdoc/camera/widget/CameraSurfaceView");
    }

    public static void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[0]);
        } else {
            mCameraInterface = null;
        }
    }

    @Override // com.zoloz.android.phone.zdoc.camera.widget.AbsSurfaceView
    public void setCameraCallback(zkb zkbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5510b070", new Object[]{this, zkbVar});
        } else {
            this.mCameraCallback = zkbVar;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f2c515", new Object[]{this, surfaceHolder, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        BioLog.i("surfaceChanged...");
        alb albVar = mCameraInterface;
        if (albVar != null) {
            try {
                albVar.startPreview(this.mSurfaceHolder, this.mPreviewRate, i2, i3);
            } catch (Exception unused) {
            }
            if (this.mCameraCallback != null) {
                int cameraViewRotation = mCameraInterface.getCameraViewRotation();
                if (cameraViewRotation == 90 || cameraViewRotation == 270) {
                    i2 = mCameraInterface.getPreviewHeight();
                    i3 = mCameraInterface.getPreviewWidth();
                } else if (cameraViewRotation == 0 || cameraViewRotation == 180) {
                    i2 = mCameraInterface.getPreviewWidth();
                    i3 = mCameraInterface.getPreviewHeight();
                }
                this.mCameraCallback.onSurfaceChanged(i2, i3);
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84fd8b02", new Object[]{this, surfaceHolder});
            return;
        }
        BioLog.i("surfaceCreated...");
        alb albVar = mCameraInterface;
        if (albVar != null) {
            albVar.b(this.mCameraCallback);
        }
        try {
            alb albVar2 = mCameraInterface;
            if (albVar2 != null) {
                albVar2.startCamera();
            }
            zkb zkbVar = this.mCameraCallback;
            if (zkbVar != null) {
                zkbVar.onSurfaceCreated();
            }
        } catch (Exception unused) {
            zkb zkbVar2 = this.mCameraCallback;
            if (zkbVar2 != null) {
                zkbVar2.onError(-1);
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7b74573", new Object[]{this, surfaceHolder});
            return;
        }
        BioLog.i("surfaceDestroyed...");
        alb albVar = mCameraInterface;
        if (albVar != null) {
            albVar.stopCamera();
            mCameraInterface.b(null);
        }
        zkb zkbVar = this.mCameraCallback;
        if (zkbVar != null) {
            zkbVar.onSurfaceDestroyed();
        }
    }
}
