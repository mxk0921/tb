package com.taobao.android.dinamic.constructor;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import tb.bn7;
import tb.cq0;
import tb.jn7;
import tb.sn7;
import tb.t2o;
import tb.vu3;
import tb.y45;
import tb.zk4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DImageViewConstructor extends sn7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HEIGHT_LIMIT = "heightLimit";
    private static final String IMAGEVIEW_ASPECT_RATIO = "dAspectRatio";
    private static final String IMAGEVIEW_IMAGE_URL = "dImageUrl";
    private static final String IMAGEVIEW_LOCAL_IMAGE = "dImage";
    private static final String IMAGEVIEW_LOCAL_IMAGE_NAME = "dImageName";
    private static final String IMAGEVIEW_SCALE_TYPE = "dScaleType";
    private static final String IMAGEVIEW_SCALE_TYPE_CENTER_CROP = "centerCrop";
    private static final String IMAGEVIEW_SCALE_TYPE_FIT_CENTER = "fitCenter";
    private static final String IMAGEVIEW_SCALE_TYPE_FIT_XY = "fitXY";
    public static final String TAG = "DImageViewConstructor";
    public static final String WIDTH_LIMIT = "widthLimit";
    private a dxWebImageInterface;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f7258a;
        public String b;
        public String c;
        public String d;
        public String e;
        public float f;
        public int g;
        public boolean h;
        public boolean i;
        public boolean j;
        public boolean k;
        public boolean l;
        public boolean m;

        static {
            t2o.a(444596254);
        }

        public static /* synthetic */ boolean a(b bVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5896a5b2", new Object[]{bVar, new Boolean(z)})).booleanValue();
            }
            bVar.k = z;
            return z;
        }

        public static /* synthetic */ boolean b(b bVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("87480fd1", new Object[]{bVar, new Boolean(z)})).booleanValue();
            }
            bVar.j = z;
            return z;
        }

        public static /* synthetic */ boolean c(b bVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b5f979f0", new Object[]{bVar, new Boolean(z)})).booleanValue();
            }
            bVar.h = z;
            return z;
        }

        public static /* synthetic */ boolean d(b bVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e4aae40f", new Object[]{bVar, new Boolean(z)})).booleanValue();
            }
            bVar.i = z;
            return z;
        }

        public static /* synthetic */ boolean e(b bVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("135c4e2e", new Object[]{bVar, new Boolean(z)})).booleanValue();
            }
            bVar.l = z;
            return z;
        }

        public static /* synthetic */ boolean f(b bVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("420db84d", new Object[]{bVar, new Boolean(z)})).booleanValue();
            }
            bVar.m = z;
            return z;
        }

        public boolean g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("25c1dea2", new Object[]{this})).booleanValue();
            }
            return this.h;
        }

        public boolean h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ac9cf385", new Object[]{this})).booleanValue();
            }
            return this.i;
        }

        public boolean i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("becb1c8d", new Object[]{this})).booleanValue();
            }
            return this.j;
        }

        public boolean j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("dc74f7e7", new Object[]{this})).booleanValue();
            }
            return this.k;
        }

        public boolean k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bd7c0e16", new Object[]{this})).booleanValue();
            }
            return this.m;
        }

        public boolean l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d5274121", new Object[]{this})).booleanValue();
            }
            return this.l;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c extends AsyncTask<Void, Void, Drawable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f7259a;
        public final WeakReference<ImageView> b;
        public final Context c;

        static {
            t2o.a(444596255);
        }

        public c(ImageView imageView, String str) {
            this.b = new WeakReference<>(imageView);
            this.f7259a = str;
            this.c = imageView.getContext().getApplicationContext();
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/constructor/DImageViewConstructor$LoadDrawableTask");
        }

        /* renamed from: a */
        public Drawable doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("8d0ed6e3", new Object[]{this, voidArr});
            }
            int b = b(this.c, this.f7259a);
            if (b == 0) {
                return null;
            }
            try {
                return this.c.getDrawable(b);
            } catch (Exception e) {
                Log.e(DImageViewConstructor.TAG, "Get layout parser exception", e);
                return null;
            }
        }

        public final int b(Context context, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("409026f", new Object[]{this, context, str})).intValue();
            }
            if (context == null || TextUtils.isEmpty(str)) {
                return 0;
            }
            try {
                return context.getResources().getIdentifier(str, zk4.CONTACTS_INFO_NOT_EMPTY_STATUS, context.getPackageName());
            } catch (Exception e) {
                Log.e(DImageViewConstructor.TAG, "getDrawableId exception", e);
                return 0;
            }
        }

        /* renamed from: c */
        public void onPostExecute(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb472d81", new Object[]{this, drawable});
                return;
            }
            ImageView imageView = this.b.get();
            if (imageView != null && this.f7259a.equals((String) imageView.getTag(jn7.TAG_CURRENT_IMAGE_NAME))) {
                imageView.setImageDrawable(drawable);
                imageView.setTag(jn7.TAG_IMAGE_NAME, this.f7259a);
            }
        }
    }

    static {
        t2o.a(444596252);
    }

    public static /* synthetic */ Object ipc$super(DImageViewConstructor dImageViewConstructor, String str, Object... objArr) {
        if (str.hashCode() == -1372344534) {
            super.setAttributes((View) objArr[0], (Map) objArr[1], (ArrayList) objArr[2], (bn7) objArr[3]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/constructor/DImageViewConstructor");
    }

    private void setImage(ImageView imageView, String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("946da6d1", new Object[]{this, imageView, str, bVar});
            return;
        }
        a aVar = this.dxWebImageInterface;
        if (aVar != null) {
            ((cq0) aVar).b(imageView, str, bVar);
        }
    }

    private void setLocalImage(ImageView imageView, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7447257", new Object[]{this, imageView, drawable});
        } else {
            imageView.setImageDrawable(drawable);
        }
    }

    @Override // tb.sn7
    public View initializeView(String str, Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6a3fe4ae", new Object[]{this, str, context, attributeSet});
        }
        a aVar = this.dxWebImageInterface;
        if (aVar == null) {
            return new ImageView(context);
        }
        return ((cq0) aVar).a(context);
    }

    @Override // tb.sn7
    public void setBackground(View view, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c88fce3", new Object[]{this, view, str, str2, str3, str4});
        } else {
            view.setBackgroundColor(y45.d(str4, 0));
        }
    }

    public void setDxWebImageInterface(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f73d8882", new Object[]{this, aVar});
        } else {
            this.dxWebImageInterface = aVar;
        }
    }

    public void setImageScaleType(ImageView imageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5760896", new Object[]{this, imageView, str});
        } else if (TextUtils.isEmpty(str)) {
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else if (IMAGEVIEW_SCALE_TYPE_FIT_XY.equals(str)) {
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        } else if (IMAGEVIEW_SCALE_TYPE_FIT_CENTER.equals(str)) {
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else if (IMAGEVIEW_SCALE_TYPE_CENTER_CROP.equals(str)) {
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    @Override // tb.sn7
    public void setAttributes(View view, Map<String, Object> map, ArrayList<String> arrayList, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae33af2a", new Object[]{this, view, map, arrayList, bn7Var});
            return;
        }
        super.setAttributes(view, map, arrayList, bn7Var);
        ImageView imageView = (ImageView) view;
        if (arrayList.contains(IMAGEVIEW_LOCAL_IMAGE)) {
            setLocalImage(imageView, (Drawable) map.get(IMAGEVIEW_LOCAL_IMAGE));
        }
        if (arrayList.contains(IMAGEVIEW_LOCAL_IMAGE_NAME)) {
            setLocalRes(imageView, (String) map.get(IMAGEVIEW_LOCAL_IMAGE_NAME));
        }
        if (arrayList.contains(IMAGEVIEW_SCALE_TYPE)) {
            setImageScaleType(imageView, (String) map.get(IMAGEVIEW_SCALE_TYPE));
        }
        String str = (String) map.get("dWidth");
        String str2 = (String) map.get("dHeight");
        b bVar = new b();
        bVar.d = bn7Var.c();
        if (TextUtils.equals(str, "match_content") && !TextUtils.equals(str2, "match_content")) {
            bVar.e = "heightLimit";
            b.a(bVar, true);
            imageView.setAdjustViewBounds(true);
        } else if (!TextUtils.equals(str, "match_content") && TextUtils.equals(str2, "match_content")) {
            bVar.e = "widthLimit";
            b.a(bVar, true);
            imageView.setAdjustViewBounds(true);
        }
        if (arrayList.contains(IMAGEVIEW_ASPECT_RATIO)) {
            setAspectRatio(imageView, str, str2, (String) map.get(IMAGEVIEW_ASPECT_RATIO), bVar);
            if (bVar.j()) {
                setImageScaleType(imageView, (String) map.get(IMAGEVIEW_SCALE_TYPE));
            }
        }
        if (arrayList.contains("dCornerRadius")) {
            bVar.f7258a = (String) map.get("dCornerRadius");
            b.b(bVar, true);
        }
        if (arrayList.contains("dBorderColor")) {
            bVar.b = (String) map.get("dBorderColor");
            b.c(bVar, true);
        }
        if (arrayList.contains("dBorderWidth")) {
            bVar.c = (String) map.get("dBorderWidth");
            b.d(bVar, true);
        }
        if (arrayList.contains(IMAGEVIEW_IMAGE_URL)) {
            b.e(bVar, true);
        }
        setImage(imageView, (String) map.get(IMAGEVIEW_IMAGE_URL), bVar);
    }

    public void setLocalRes(ImageView imageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe9e6ac2", new Object[]{this, imageView, str});
            return;
        }
        imageView.setTag(jn7.TAG_CURRENT_IMAGE_NAME, str);
        if (str == null) {
            imageView.setImageDrawable(null);
            imageView.setTag(jn7.TAG_IMAGE_NAME, null);
        } else if (!str.equals((String) imageView.getTag(jn7.TAG_IMAGE_NAME))) {
            new c(imageView, str).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public void setAspectRatio(ImageView imageView, String str, String str2, String str3, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb8b319d", new Object[]{this, imageView, str, str2, str3, bVar});
            return;
        }
        boolean z = !TextUtils.equals(str, "match_content") && TextUtils.equals(str2, "match_content");
        if (z || (TextUtils.equals(str, "match_content") && !TextUtils.equals(str2, "match_content"))) {
            double d = -1.0d;
            try {
                if (!TextUtils.isEmpty(str3)) {
                    d = Double.valueOf(str3).doubleValue();
                }
            } catch (Throwable unused) {
            }
            if (z) {
                if (d > vu3.b.GEO_NOT_SUPPORT) {
                    bVar.f = (float) (1.0d / d);
                    bVar.g = 0;
                    b.f(bVar, true);
                } else if (imageView.getLayoutParams() != null) {
                    imageView.getLayoutParams().height = 0;
                }
            } else if (d > vu3.b.GEO_NOT_SUPPORT) {
                bVar.f = (float) d;
                bVar.g = 1;
                b.f(bVar, true);
            } else if (imageView.getLayoutParams() != null) {
                imageView.getLayoutParams().width = 0;
            }
        }
    }
}
