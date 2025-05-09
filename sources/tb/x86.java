package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class x86 extends DXImageWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXQRCODEIMAGEVIEW_BARCODE = 4691410307390837559L;
    public static final long DXQRCODEIMAGEVIEW_QRCODE = 7665026788792100L;
    public static final long DXQRCODEIMAGEVIEW_QRCODEIMAGEVIEW = -1286778439428491861L;

    /* renamed from: a  reason: collision with root package name */
    public String f31204a;
    public String b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends AsyncTask<Void, Void, Drawable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f31205a;
        public final boolean b;
        public final WeakReference<ImageView> c;
        public final int d;
        public final int e;

        static {
            t2o.a(614465711);
        }

        public a(ImageView imageView, boolean z, String str, int i, int i2) {
            this.c = new WeakReference<>(imageView);
            this.b = z;
            this.f31205a = str;
            this.d = i;
            this.e = i2;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/dinamicX/view/DXQRCodeImageViewWidgetNode$EncodQROrBarCodeTask");
        }

        /* renamed from: a */
        public Drawable doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("8d0ed6e3", new Object[]{this, voidArr});
            }
            return b();
        }

        public Drawable b() {
            Bitmap bitmap;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("bbe7333f", new Object[]{this});
            }
            if (this.b) {
                bitmap = yxh.b(this.f31205a, this.d, this.e);
            } else {
                bitmap = yxh.a(this.f31205a, this.d, this.e);
            }
            if (bitmap == null) {
                return null;
            }
            return new BitmapDrawable(bitmap);
        }

        /* renamed from: c */
        public void onPostExecute(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb472d81", new Object[]{this, drawable});
                return;
            }
            ImageView imageView = this.c.get();
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
        }
    }

    static {
        t2o.a(614465709);
    }

    public static /* synthetic */ Object ipc$super(x86 x86Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -303753557) {
            super.onRenderView((Context) objArr[0], (View) objArr[1]);
            return null;
        } else if (hashCode == 1115049375) {
            super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
            return null;
        } else if (hashCode == 2119721610) {
            super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/order/core/dinamicX/view/DXQRCodeImageViewWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new x86();
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof x86)) {
            super.onClone(dXWidgetNode, z);
            x86 x86Var = (x86) dXWidgetNode;
            this.f31204a = x86Var.f31204a;
            this.b = x86Var.b;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        ImageView imageView = (ImageView) view;
        if (!TextUtils.isEmpty(this.f31204a)) {
            setImageScaleType(imageView, getScaleType());
            jb6.s(new a(imageView, true, this.f31204a, getMeasuredWidth(), getMeasuredHeight()), new Void[0]);
        } else if (!TextUtils.isEmpty(this.b)) {
            setImageScaleType(imageView, getScaleType());
            jb6.s(new a(imageView, false, this.b, getMeasuredWidth(), getMeasuredHeight()), new Void[0]);
        } else {
            super.onRenderView(context, view);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXQRCODEIMAGEVIEW_QRCODE) {
            this.f31204a = str;
        } else if (j == DXQRCODEIMAGEVIEW_BARCODE) {
            this.b = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }
}
