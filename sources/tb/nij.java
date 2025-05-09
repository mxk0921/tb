package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicYuvToRGB;
import android.renderscript.Type;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import java.io.ByteArrayOutputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class nij {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final RenderScript f24752a;
    public final ScriptIntrinsicYuvToRGB b;
    public Type.Builder c;
    public Type d;
    public Type e;
    public Allocation f;
    public Allocation g;
    public int h = 0;
    public int i = 0;
    public final boolean j = true;
    public boolean k = false;

    static {
        t2o.a(481297628);
    }

    public nij(Context context) {
        RenderScript create = RenderScript.create(context);
        this.f24752a = create;
        this.b = ScriptIntrinsicYuvToRGB.create(create, Element.U8_4(create));
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        Allocation allocation = this.f;
        if (allocation != null) {
            allocation.destroy();
            this.f = null;
        }
        Allocation allocation2 = this.g;
        if (allocation2 != null) {
            allocation2.destroy();
            this.g = null;
        }
        Type type = this.e;
        if (type != null) {
            type.destroy();
        }
        Type type2 = this.d;
        if (type2 != null) {
            type2.destroy();
        }
    }

    public synchronized Bitmap b(byte[] bArr, int i, int i2) {
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("dc981bfd", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
        }
        try {
            if (this.j) {
                if (!(this.h == i && this.i == i2 && this.c != null)) {
                    a();
                    RenderScript renderScript = this.f24752a;
                    Type.Builder x = new Type.Builder(renderScript, Element.U8(renderScript)).setX(bArr.length);
                    this.c = x;
                    RenderScript renderScript2 = this.f24752a;
                    Type create = x.create();
                    this.d = create;
                    this.f = Allocation.createTyped(renderScript2, create, 1);
                    RenderScript renderScript3 = this.f24752a;
                    Type.Builder y = new Type.Builder(renderScript3, Element.RGBA_8888(renderScript3)).setX(i).setY(i2);
                    RenderScript renderScript4 = this.f24752a;
                    Type create2 = y.create();
                    this.e = create2;
                    this.g = Allocation.createTyped(renderScript4, create2, 1);
                    this.h = i;
                    this.i = i2;
                }
                this.f.copyFrom(bArr);
                this.b.setInput(this.f);
                this.b.forEach(this.g);
                bitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.g.copyTo(bitmap);
            } else {
                bitmap = c(bArr, i, i2);
            }
        } catch (Exception unused) {
            bitmap = c(bArr, i, i2);
        }
        return bitmap;
    }

    public final Bitmap c(byte[] bArr, int i, int i2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("28bac9d8", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new YuvImage(bArr, 17, i, i2, null).compressToJpeg(new Rect(0, 0, i, i2), 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        if (!this.k) {
            this.k = true;
            Bitmap.Config config = decodeByteArray.getConfig();
            if (config == null) {
                str = "EMPTY";
            } else {
                str = config.name();
            }
            jzu.n("Page_PhotoSearchTake", "BitmapConfig", 19999, OConstant.DIMEN_CONFIG_NAME, str);
        }
        return decodeByteArray;
    }
}
