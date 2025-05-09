package tb;

import android.view.Surface;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.utils.ArtcLog;
import com.taobao.artc.video.NativeWindow;
import org.webrtc.SurfaceTextureHelper;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class o03 implements SurfaceTextureHelper.OnTextureFrameAvailableListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public SurfaceTextureHelper f25059a = null;
    public NativeWindow b = null;
    public a c = null;
    public boolean d = false;
    public int e = 0;
    public int f = 0;
    public int g = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void onTextureReady(int i, int i2, int i3, int i4, float[] fArr, long j);
    }

    static {
        t2o.a(395313318);
        t2o.a(395313822);
    }

    public void a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47ac273a", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (this.b != null) {
            ArtcLog.i("CameraProxy", "config, width:", Integer.valueOf(i), ", height:", Integer.valueOf(i2), ", format:", Integer.valueOf(i3));
            this.b.w(i, i2, i3);
            this.d = true;
        }
    }

    public void b(SurfaceTextureHelper surfaceTextureHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32c3d177", new Object[]{this, surfaceTextureHelper});
            return;
        }
        ArtcLog.i("CameraProxy", "init, stHelper:", this.f25059a);
        if (this.f25059a == null) {
            this.f25059a = surfaceTextureHelper;
            surfaceTextureHelper.startListening(this);
            this.b = new NativeWindow(new Surface(this.f25059a.getSurfaceTexture()));
        }
    }

    public void c(byte[] bArr, int i, int i2, int i3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e724c59", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Integer(i3), new Long(j)});
            return;
        }
        NativeWindow nativeWindow = this.b;
        if (nativeWindow != null) {
            nativeWindow.g(bArr);
            this.e = i;
            this.f = i2;
            this.g = i3;
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc3ba5b6", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public void e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16b733ee", new Object[]{this, aVar});
        } else {
            this.c = aVar;
        }
    }

    @Override // org.webrtc.SurfaceTextureHelper.OnTextureFrameAvailableListener
    public void onTextureFrameAvailable(int i, float[] fArr, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c74fcb5", new Object[]{this, new Integer(i), fArr, new Long(j)});
            return;
        }
        a aVar = this.c;
        if (aVar != null) {
            aVar.onTextureReady(i, this.e, this.f, this.g, fArr, j);
        } else {
            this.f25059a.returnTextureFrame();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ae64730", new Object[]{this});
            return;
        }
        ArtcLog.i("CameraProxy", "uninit", new Object[0]);
        NativeWindow nativeWindow = this.b;
        if (nativeWindow != null) {
            nativeWindow.close();
            this.b = null;
            this.d = false;
        }
        SurfaceTextureHelper surfaceTextureHelper = this.f25059a;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.stopListening();
        }
    }
}
