package com.taobao.android.dinamicx.component;

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
import com.taobao.android.dinamic.dinamic.DinamicAttr;
import com.taobao.android.dinamic.ext.component.view.TImageView;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.ImageShapeFeature;
import com.taobao.uikit.feature.features.RatioFeature;
import tb.bn7;
import tb.owo;
import tb.sn7;
import tb.vu3;
import tb.y45;
import tb.zk4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TImageViewConstructor extends sn7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String IMAGEVIEW_ASPECT_RATIO = "tAspectRatio";
    private static final String IMAGEVIEW_IMAGE = "tImage";
    private static final String IMAGEVIEW_IMAGE_URL = "tImageUrl";
    private static final String IMAGEVIEW_LOCAL_IMAGE_NAME = "tLocalImageName";
    private static final String IMAGEVIEW_SCALE_TYPE = "tScaleType";
    private static final String IMAGEVIEW_SCALE_TYPE_CENTER_CROP = "centerCrop";
    private static final String IMAGEVIEW_SCALE_TYPE_FIT_CENTER = "fitCenter";
    private static final String IMAGEVIEW_SCALE_TYPE_FIT_XY = "fitXY";
    public static final String TAG = "TImageViewConstructor";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends AsyncTask<Void, Void, Drawable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f7306a;
        public final /* synthetic */ String b;
        public final /* synthetic */ TImageView c;

        public a(Context context, String str, TImageView tImageView) {
            this.f7306a = context;
            this.b = str;
            this.c = tImageView;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/component/TImageViewConstructor$1");
        }

        /* renamed from: a */
        public Drawable doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("8d0ed6e3", new Object[]{this, voidArr});
            }
            int access$000 = TImageViewConstructor.access$000(TImageViewConstructor.this, this.f7306a, this.b);
            if (access$000 == 0) {
                return null;
            }
            try {
                return this.f7306a.getDrawable(access$000);
            } catch (Exception e) {
                Log.e(TImageViewConstructor.TAG, "Get layout parser exception", e);
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb472d81", new Object[]{this, drawable});
            } else {
                this.c.setImageDrawable(drawable);
            }
        }
    }

    public static /* synthetic */ int access$000(TImageViewConstructor tImageViewConstructor, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2183bb44", new Object[]{tImageViewConstructor, context, str})).intValue();
        }
        return tImageViewConstructor.getDrawableId(context, str);
    }

    public static /* synthetic */ Object ipc$super(TImageViewConstructor tImageViewConstructor, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/component/TImageViewConstructor");
    }

    @Override // tb.sn7
    public View initializeViewWithModule(String str, Context context, AttributeSet attributeSet, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("65343113", new Object[]{this, str, context, attributeSet, bn7Var});
        }
        if (!"guess".equals(bn7Var.c())) {
            return new TImageView(context, attributeSet);
        }
        TImageView tImageView = new TImageView(context, attributeSet);
        tImageView.setStrategyConfig(ImageStrategyConfig.v("guess", 5120).a());
        return tImageView;
    }

    @Override // tb.sn7
    public void setBackground(View view, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c88fce3", new Object[]{this, view, str, str2, str3, str4});
            return;
        }
        view.setBackgroundColor(y45.d(str4, 0));
        TImageView tImageView = (TImageView) view;
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            int e = owo.e(tImageView.getContext(), str, 0);
            int e2 = owo.e(tImageView.getContext(), str3, 0);
            int d = y45.d(str2, 0);
            if (e > 0 || e2 > 0) {
                ImageShapeFeature imageShapeFeature = (ImageShapeFeature) tImageView.findFeature(ImageShapeFeature.class);
                if (imageShapeFeature == null) {
                    imageShapeFeature = new ImageShapeFeature();
                    tImageView.addFeature(imageShapeFeature);
                }
                imageShapeFeature.setShape(1);
                float f = e;
                imageShapeFeature.setCornerRadius(f, f, f, f);
                if (e2 > 0) {
                    imageShapeFeature.setStrokeEnable(true);
                    imageShapeFeature.setStrokeWidth(e2);
                    imageShapeFeature.setStrokeColor(d);
                }
            } else if (((ImageShapeFeature) tImageView.findFeature(ImageShapeFeature.class)) != null) {
                tImageView.removeFeature(ImageShapeFeature.class);
            }
        } else if (((ImageShapeFeature) tImageView.findFeature(ImageShapeFeature.class)) != null) {
            tImageView.removeFeature(ImageShapeFeature.class);
        }
    }

    @DinamicAttr(attrSet = {IMAGEVIEW_SCALE_TYPE})
    public void setImageScaleType(TImageView tImageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5da05548", new Object[]{this, tImageView, str});
        } else if (TextUtils.isEmpty(str)) {
            tImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else if (IMAGEVIEW_SCALE_TYPE_FIT_XY.equals(str)) {
            tImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        } else if (IMAGEVIEW_SCALE_TYPE_FIT_CENTER.equals(str)) {
            tImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else if (IMAGEVIEW_SCALE_TYPE_CENTER_CROP.equals(str)) {
            tImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            tImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    @DinamicAttr(attrSet = {IMAGEVIEW_IMAGE_URL})
    public void setImageUrl(TImageView tImageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1826ae53", new Object[]{this, tImageView, str});
        } else {
            tImageView.setImageUrl(str);
        }
    }

    @DinamicAttr(attrSet = {IMAGEVIEW_LOCAL_IMAGE_NAME, IMAGEVIEW_IMAGE})
    public void setLocalRes(TImageView tImageView, String str, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a588098", new Object[]{this, tImageView, str, drawable});
        } else if (str == null) {
            tImageView.setImageDrawable(drawable);
        } else {
            new a(tImageView.getContext(), str, tImageView).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    private int getDrawableId(Context context, String str) {
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
            Log.e(TAG, "getDrawableId exception", e);
            return 0;
        }
    }

    @DinamicAttr(attrSet = {"dWidth", "dHeight", IMAGEVIEW_ASPECT_RATIO})
    public void setAspectRatio(TUrlImageView tUrlImageView, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a33971c", new Object[]{this, tUrlImageView, str, str2, str3});
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
                    RatioFeature ratioFeature = (RatioFeature) tUrlImageView.findFeature(RatioFeature.class);
                    if (ratioFeature == null) {
                        ratioFeature = new RatioFeature();
                        ratioFeature.setRatio((float) (1.0d / d));
                        tUrlImageView.addFeature(ratioFeature);
                    } else {
                        ratioFeature.setRatio((float) (1.0d / d));
                    }
                    ratioFeature.setOrientation(0);
                } else if (tUrlImageView.getLayoutParams() != null) {
                    tUrlImageView.removeFeature(RatioFeature.class);
                    tUrlImageView.getLayoutParams().height = 0;
                }
            } else if (d > vu3.b.GEO_NOT_SUPPORT) {
                RatioFeature ratioFeature2 = (RatioFeature) tUrlImageView.findFeature(RatioFeature.class);
                if (ratioFeature2 == null) {
                    ratioFeature2 = new RatioFeature();
                    ratioFeature2.setRatio((float) d);
                    tUrlImageView.addFeature(ratioFeature2);
                } else {
                    ratioFeature2.setRatio((float) d);
                }
                ratioFeature2.setOrientation(1);
            } else if (tUrlImageView.getLayoutParams() != null) {
                tUrlImageView.removeFeature(RatioFeature.class);
                tUrlImageView.getLayoutParams().width = 0;
            }
        }
    }
}
