package tb;

import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class qrc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f26895a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public ImageView.ScaleType h = ImageView.ScaleType.CENTER_CROP;
    public float[] i;

    static {
        t2o.a(352321643);
    }

    public qrc(int i, int i2) {
        this.f26895a = i2;
        this.b = i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "IMediaCommentSizeObject{height=" + this.f26895a + ", width=" + this.b + ", showHeight=" + this.c + ", showWidth=" + this.d + ", showMarginTop=" + this.e + ", showPaddingBottom=0, type=" + this.h + ", videoWidth=0, videoHeight=0}";
    }
}
