package tb;

import android.hardware.Camera;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class j03 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f21677a;
    public volatile boolean b;
    public int c = 0;

    static {
        t2o.a(481296841);
    }

    public int a() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("141de724", new Object[]{this})).intValue();
        }
        if (this.c <= 0) {
            try {
                i = Camera.getNumberOfCameras();
            } catch (Exception unused) {
            }
            this.c = i;
        }
        return this.c;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5fb2694", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a8fee7c", new Object[]{this})).booleanValue();
        }
        return this.f21677a;
    }

    public final Camera d() {
        Camera camera;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Camera) ipChange.ipc$dispatch("2fa79cd6", new Object[]{this});
        }
        int a2 = a();
        int i = 0;
        while (true) {
            if (i >= a2) {
                break;
            }
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(i, cameraInfo);
            if (b()) {
                if (cameraInfo.facing == 1) {
                    this.f21677a = true;
                    break;
                }
                i++;
            } else if (cameraInfo.facing == 0) {
                this.f21677a = false;
                break;
            } else {
                i++;
            }
        }
        if (i < a2) {
            camera = Camera.open(i);
        } else {
            camera = Camera.open(0);
        }
        if (camera == null) {
            return Camera.open();
        }
        return camera;
    }

    public Camera e(int i, int i2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Camera) ipChange.ipc$dispatch("9ba96cf6", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        long currentTimeMillis = System.currentTimeMillis();
        Camera camera = null;
        while (true) {
            if (!z && System.currentTimeMillis() - currentTimeMillis > i2) {
                return null;
            }
            try {
                camera = d();
            } catch (Exception unused) {
            }
            if (camera != null) {
                return camera;
            }
            try {
                Thread.sleep(i);
            } catch (InterruptedException unused2) {
            }
            z = false;
        }
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5034417c", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }
}
