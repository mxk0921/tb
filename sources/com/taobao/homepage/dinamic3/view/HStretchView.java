package com.taobao.homepage.dinamic3.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import tb.bqa;
import tb.cw6;
import tb.nd2;
import tb.p2b;
import tb.s0m;
import tb.s8d;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class HStretchView extends ImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String TAG = "StretchView";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BitmapDrawable f10589a;
        public final /* synthetic */ float b;
        public final /* synthetic */ float c;

        public a(BitmapDrawable bitmapDrawable, float f, float f2) {
            this.f10589a = bitmapDrawable;
            this.b = f;
            this.c = f2;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            BitmapDrawable bitmapDrawable;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            if (cw6.b()) {
                bqa.a(HStretchView.access$000(HStretchView.this), "图片下载失败");
            }
            if (HStretchView.this.getDrawable() == null && (bitmapDrawable = this.f10589a) != null) {
                HStretchView.access$100(HStretchView.this, bitmapDrawable.getBitmap(), this.b, this.c);
                if (cw6.b()) {
                    bqa.a(HStretchView.access$000(HStretchView.this), "设置预置图片");
                }
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f10590a;
        public final /* synthetic */ float b;

        public b(float f, float f2) {
            this.f10590a = f;
            this.b = f2;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent.getDrawable() != null) {
                HStretchView.access$100(HStretchView.this, succPhenixEvent.getDrawable().getBitmap(), this.f10590a, this.b);
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            if (cw6.b()) {
                bqa.a(HStretchView.access$000(HStretchView.this), "图片下载失败");
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            BitmapDrawable drawable;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (!(succPhenixEvent.getDrawable() == null || (drawable = succPhenixEvent.getDrawable()) == null)) {
                drawable.setAntiAlias(false);
                HStretchView.this.setImageBitmap(drawable.getBitmap());
            }
            return false;
        }
    }

    static {
        t2o.a(729809061);
    }

    public HStretchView(Context context) {
        super(context);
        setScaleType(ImageView.ScaleType.FIT_XY);
    }

    public static /* synthetic */ String access$000(HStretchView hStretchView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc1134e9", new Object[]{hStretchView});
        }
        return hStretchView.TAG;
    }

    public static /* synthetic */ void access$100(HStretchView hStretchView, Bitmap bitmap, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87f0e1d6", new Object[]{hStretchView, bitmap, new Float(f), new Float(f2)});
        } else {
            hStretchView.loadBitmap(bitmap, f, f2);
        }
    }

    private Bitmap getStretchXBitmap(Bitmap bitmap, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("5ff1970d", new Object[]{this, bitmap, new Integer(i), new Integer(i2)});
        }
        if (bitmap == null) {
            return null;
        }
        Paint paint = new Paint();
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth() + i2, bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, new Rect(0, 0, i, bitmap.getHeight()), new Rect(0, 0, i, bitmap.getHeight()), paint);
        int i3 = i + i2;
        canvas.drawBitmap(bitmap, new Rect(i, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(i3, 0, bitmap.getWidth() + i2, bitmap.getHeight()), paint);
        canvas.drawBitmap(bitmap, new Rect(i, 0, 1 + i, bitmap.getHeight()), new Rect(i, 0, i3, bitmap.getHeight()), paint);
        return createBitmap;
    }

    public static /* synthetic */ Object ipc$super(HStretchView hStretchView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/dinamic3/view/HStretchView");
    }

    private void loadBitmap(Bitmap bitmap, float f, float f2) {
        Bitmap stretchBitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d10ec972", new Object[]{this, bitmap, new Float(f), new Float(f2)});
        } else if (bitmap != null && (stretchBitmap = getStretchBitmap(bitmap, f, f2)) != null) {
            setImageBitmap(stretchBitmap);
        }
    }

    public void setImageUrl(String str, float f, float f2, BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d53c31c", new Object[]{this, str, new Float(f), new Float(f2), bitmapDrawable});
        } else if (!TextUtils.isEmpty(str)) {
            s0m.B().N0(getContext()).U("homepage-ads", str).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, p2b.f(str, "5401")).succListener(new b(f, f2)).failListener(new a(bitmapDrawable, f, f2)).fetch();
        } else {
            setImageDrawable(null);
        }
    }

    public HStretchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setScaleType(ImageView.ScaleType.FIT_XY);
    }

    private Bitmap getStretchBitmap(Bitmap bitmap, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("4c43bd07", new Object[]{this, bitmap, new Float(f), new Float(f2)});
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= 0) {
            return bitmap;
        }
        if (cw6.b()) {
            bqa.a(this.TAG, String.format("bitmap width=%d, height=%d desRatio = %f", Integer.valueOf(width), Integer.valueOf(height), Float.valueOf(f2)));
        }
        float f3 = height / width;
        if (f3 <= f2) {
            if (cw6.b()) {
                bqa.a(this.TAG, String.format("bitmapRatio = %f, desRatio =%f, bitmapRatio <= desRationo need stretch", Float.valueOf(f3), Float.valueOf(f2)));
            }
            return bitmap;
        } else if (f2 <= 0.0f) {
            if (cw6.b()) {
                bqa.a("desRatio cannot be less then 0", new String[0]);
            }
            return bitmap;
        } else if (f > 1.0f || f < 0.0f) {
            if (cw6.b()) {
                bqa.a("stretchPercentX can only be less then 1 and more then 0", new String[0]);
            }
            return bitmap;
        } else {
            int height2 = ((int) (bitmap.getHeight() / f2)) - bitmap.getWidth();
            int width2 = (int) (bitmap.getWidth() * f);
            if (cw6.b()) {
                bqa.a(this.TAG, String.format("stretchWidth = %d, stretchX = %d", Integer.valueOf(height2), Integer.valueOf(width2)));
            }
            if (width2 == bitmap.getWidth() && width2 > 0) {
                width2--;
            }
            return getStretchXBitmap(bitmap, width2, height2);
        }
    }

    public HStretchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setScaleType(ImageView.ScaleType.FIT_XY);
    }

    public void setImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            s0m.B().N0(getContext()).U("homepage-ads", str).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, p2b.f(str, "5401")).succListener(new d()).failListener(new c()).fetch();
        } else {
            setImageDrawable(null);
        }
    }
}
