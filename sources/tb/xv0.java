package tb;

import android.content.Context;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class xv0 extends iu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(245366898);
    }

    public xv0(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(xv0 xv0Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2134829933) {
            super.releaseCamera();
            return null;
        } else if (hashCode == -733301440) {
            super.l();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/zoloz/android/phone/zdoc/camera/AndroidImpl");
        }
    }

    @Override // tb.iu
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d44ab540", new Object[]{this});
            return;
        }
        super.l();
        this.b.setDisplayOrientation(this.e);
    }

    @Override // tb.iu, tb.alb
    public void releaseCamera() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c11493", new Object[]{this});
        } else {
            super.releaseCamera();
        }
    }

    @Override // tb.alb
    public void startPreview(SurfaceHolder surfaceHolder, float f, int i, int i2) {
        Camera camera;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce4b2a73", new Object[]{this, surfaceHolder, new Float(f), new Integer(i), new Integer(i2)});
            return;
        }
        BioLog.d("startPreview...");
        if (!this.o && (camera = this.b) != null) {
            try {
                camera.setPreviewDisplay(surfaceHolder);
                this.b.startPreview();
                this.o = true;
            } catch (Exception e) {
                BioLog.e(e.toString());
                zkb zkbVar = this.d;
                if (zkbVar != null) {
                    zkbVar.onError(-1);
                }
            }
        }
    }
}
