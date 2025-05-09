package com.taobao.android.tbsku.preview;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliConfigInterface;
import com.taobao.android.sku.utils.SkuLogUtils;
import com.taobao.android.sku.widget.HeightMutableFrameLayout;
import com.taobao.android.tbsku.image.PhotoView;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import com.taobao.taobao.R;
import tb.nd2;
import tb.s0m;
import tb.t2o;
import tb.yo0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ImagePreview {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f9596a;
    public final JSONObject b;
    public final JSONArray c;
    public HeightMutableFrameLayout e;
    public ViewPager f;
    public TextView g;
    public TextView h;
    public a i;
    public float d = -0.01f;
    public boolean j = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class ImageAdapter extends PagerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final a f9598a;
        public final JSONObject b;
        public final JSONArray c;
        public final boolean d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                try {
                    if (ImageAdapter.h(ImageAdapter.this) != null) {
                        ImageAdapter.h(ImageAdapter.this).onClick(view);
                    }
                } catch (Throwable unused) {
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class b implements View.OnLongClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                }
                try {
                    if (ImageAdapter.h(ImageAdapter.this) != null) {
                        return ImageAdapter.h(ImageAdapter.this).onLongClick(view);
                    }
                } catch (Throwable unused) {
                }
                return false;
            }
        }

        static {
            t2o.a(785383555);
        }

        public ImageAdapter(a aVar, JSONObject jSONObject, JSONArray jSONArray, boolean z) {
            this.f9598a = aVar;
            this.b = jSONObject;
            this.c = jSONArray;
            this.d = z;
        }

        public static /* synthetic */ a h(ImageAdapter imageAdapter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("aabcda75", new Object[]{imageAdapter});
            }
            return imageAdapter.f9598a;
        }

        public static /* synthetic */ Object ipc$super(ImageAdapter imageAdapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbsku/preview/ImagePreview$ImageAdapter");
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
            } else if (obj instanceof View) {
                viewGroup.removeView((View) obj);
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            JSONArray jSONArray = this.c;
            if (jSONArray != null) {
                return jSONArray.size();
            }
            return 0;
        }

        public final void i(Context context, PhotoView photoView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fab3d4bf", new Object[]{this, context, photoView, str});
                return;
            }
            try {
                if (this.d) {
                    s0m.B().T(ImageStrategyDecider.decideUrl(str, 1200, 1200, ImageStrategyConfig.w("default", "9001").j(1200).h(1200).i(TaobaoImageUrlStrategy.ImageQuality.q90).a())).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, "9001").into(photoView);
                } else {
                    s0m.B().T(str).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, "9002").skipCache().into(photoView);
                }
            } catch (Throwable th) {
                SkuLogUtils.i(th.toString());
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            JSONObject jSONObject;
            JSONObject jSONObject2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
            }
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.xsku_scaleimage, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(R.id.txview_popupwindow);
            PhotoView photoView = (PhotoView) inflate.findViewById(R.id.imageviewtouch);
            photoView.setOnClickListener(new a());
            photoView.setOnLongClickListener(new b());
            JSONObject jSONObject3 = this.c.getJSONObject(i);
            String string = jSONObject3.getString("desc");
            if (TextUtils.isEmpty(string) && (jSONObject2 = this.b) != null) {
                string = jSONObject2.getString("title");
            }
            String string2 = jSONObject3.getString("url");
            if (TextUtils.isEmpty(string2) && (jSONObject = this.b) != null) {
                string2 = jSONObject.getString("icon");
            }
            j(viewGroup.getContext(), textView, string);
            i(viewGroup.getContext(), photoView, string2);
            viewGroup.addView(inflate);
            return inflate;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue();
            }
            if (view == obj) {
                return true;
            }
            return false;
        }

        public final void j(Context context, TextView textView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("74340d97", new Object[]{this, context, textView, str});
            } else if (TextUtils.isEmpty(str)) {
                textView.setVisibility(8);
            } else {
                textView.setText(str);
                textView.setVisibility(0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void a(JSONObject jSONObject, int i);

        void onClick(View view);

        boolean onLongClick(View view);
    }

    static {
        t2o.a(785383553);
    }

    public ImagePreview(Context context, JSONObject jSONObject, JSONArray jSONArray) {
        if (context != null && jSONObject != null && jSONArray != null) {
            this.f9596a = context;
            this.b = jSONObject;
            this.c = jSONArray;
            f();
        }
    }

    public static /* synthetic */ TextView a(ImagePreview imagePreview) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("7d199197", new Object[]{imagePreview});
        }
        return imagePreview.g;
    }

    public static /* synthetic */ void b(ImagePreview imagePreview, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb7ac655", new Object[]{imagePreview, jSONObject, new Integer(i)});
        } else {
            imagePreview.i(jSONObject, i);
        }
    }

    public final void c(int i, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("640455a4", new Object[]{this, new Integer(i), jSONArray});
            return;
        }
        int currentItem = this.f.getCurrentItem();
        this.f.setCurrentItem(i);
        TextView textView = this.g;
        textView.setText("" + (1 + i));
        if (currentItem == i) {
            i(jSONArray.getJSONObject(i), i);
        }
    }

    public View d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        if (this.e == null) {
            h(this.f9596a, this.b, this.c);
        }
        return this.e;
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("742cec9b", new Object[]{this});
            return;
        }
        AliConfigInterface b = yo0.b();
        if (b != null) {
            this.j = Boolean.parseBoolean(b.getConfig("android_sku", "convert_jpeg_to_heic", "true"));
        }
    }

    public final void g(final JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("962cd866", new Object[]{this, jSONArray});
            return;
        }
        ViewPager viewPager = this.f;
        if (viewPager != null) {
            viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.taobao.android.tbsku.preview.ImagePreview.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrollStateChanged(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                    }
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrolled(int i, float f, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                    }
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageSelected(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                        return;
                    }
                    TextView a2 = ImagePreview.a(ImagePreview.this);
                    a2.setText("" + (1 + i));
                    ImagePreview.b(ImagePreview.this, jSONArray.getJSONObject(i), i);
                }
            });
        }
    }

    public final void h(Context context, JSONObject jSONObject, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc1f642c", new Object[]{this, context, jSONObject, jSONArray});
            return;
        }
        HeightMutableFrameLayout heightMutableFrameLayout = (HeightMutableFrameLayout) LayoutInflater.from(context).inflate(R.layout.xsku_image_container, (ViewGroup) null, false);
        this.e = heightMutableFrameLayout;
        this.f = (ViewPager) heightMutableFrameLayout.findViewById(R.id.view_pager);
        this.g = (TextView) this.e.findViewById(R.id.tv_current_index);
        this.h = (TextView) this.e.findViewById(R.id.tv_total_size);
        this.f.setAdapter(new ImageAdapter(this.i, jSONObject, jSONArray, this.j));
        g(jSONArray);
        e(jSONObject, jSONArray);
        float f = this.d;
        if (f >= 1.0E-5f) {
            this.e.shrinkHeight(f);
            this.d = -0.01f;
        }
    }

    public final void i(JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef07c111", new Object[]{this, jSONObject, new Integer(i)});
            return;
        }
        try {
            a aVar = this.i;
            if (aVar != null) {
                aVar.a(jSONObject, i);
            }
        } catch (Throwable unused) {
        }
    }

    public void j(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("867091d1", new Object[]{this, aVar});
        } else {
            this.i = aVar;
        }
    }

    public final void e(JSONObject jSONObject, JSONArray jSONArray) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("116474f5", new Object[]{this, jSONObject, jSONArray});
            return;
        }
        String str = "";
        if (jSONArray != null) {
            TextView textView = this.h;
            textView.setText(str + jSONArray.size());
        }
        String string = jSONObject.getString("pvId");
        String string2 = jSONObject.getString("icon");
        String string3 = jSONObject.getString("url");
        if (!TextUtils.isEmpty(string2)) {
            str = string2;
        } else if (!TextUtils.isEmpty(string3)) {
            str = string3;
        }
        if (!TextUtils.isEmpty(string)) {
            int size = jSONArray.size();
            while (i < size) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null && string.equals(jSONObject2.getString("pvId"))) {
                    c(i, jSONArray);
                    return;
                }
                i++;
            }
        } else if (!TextUtils.isEmpty(str)) {
            int size2 = jSONArray.size();
            while (i < size2) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                if (jSONObject3 != null && str.equals(jSONObject3.getString("url"))) {
                    c(i, jSONArray);
                    return;
                }
                i++;
            }
        }
    }
}
