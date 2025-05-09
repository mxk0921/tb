package com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import tb.a2h;
import tb.bg6;
import tb.mbu;
import tb.q0j;
import tb.t2o;
import tb.xxv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MarqueeGalleryAdapter extends PagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<FlexiblePageViewEntity> f8790a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;
    public int g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f8791a;
        public final /* synthetic */ FlexiblePageViewEntity b;
        public final /* synthetic */ int c;

        public a(ViewGroup viewGroup, FlexiblePageViewEntity flexiblePageViewEntity, int i) {
            this.f8791a = viewGroup;
            this.b = flexiblePageViewEntity;
            this.c = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            a2h.a(this.f8791a.getContext(), this.b.jumpUrl);
            MarqueeGalleryAdapter marqueeGalleryAdapter = MarqueeGalleryAdapter.this;
            JSONObject jSONObject = this.b.clickMaidian;
            if (MarqueeGalleryAdapter.h(marqueeGalleryAdapter) != this.c) {
                z = false;
            }
            MarqueeGalleryAdapter.i(marqueeGalleryAdapter, jSONObject, z);
        }
    }

    static {
        t2o.a(310378582);
    }

    public MarqueeGalleryAdapter(boolean z, boolean z2, int i, int i2, int i3) {
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    public static /* synthetic */ int h(MarqueeGalleryAdapter marqueeGalleryAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("581ee4a9", new Object[]{marqueeGalleryAdapter})).intValue();
        }
        return marqueeGalleryAdapter.g;
    }

    public static /* synthetic */ void i(MarqueeGalleryAdapter marqueeGalleryAdapter, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b063f5b9", new Object[]{marqueeGalleryAdapter, jSONObject, new Boolean(z)});
        } else {
            marqueeGalleryAdapter.m(jSONObject, z);
        }
    }

    public static /* synthetic */ Object ipc$super(MarqueeGalleryAdapter marqueeGalleryAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/dinamicx/flexible/MarqueeGalleryAdapter");
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
            return;
        }
        List<FlexiblePageViewEntity> list = this.f8790a;
        if (list != null) {
            int size = i % list.size();
            this.f8790a.size();
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        List<FlexiblePageViewEntity> list = this.f8790a;
        if (list == null) {
            return 0;
        }
        if (list.size() > 3) {
            return this.f8790a.size();
        }
        return this.f8790a.size() * 2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
        }
        List<FlexiblePageViewEntity> list = this.f8790a;
        if (list == null || list.size() <= 0) {
            return new TextView(viewGroup.getContext());
        }
        List<FlexiblePageViewEntity> list2 = this.f8790a;
        return j(viewGroup, i, list2.get(i % list2.size()));
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

    public void k(List<FlexiblePageViewEntity> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d7a82f", new Object[]{this, list});
        } else {
            this.f8790a = list;
        }
    }

    public void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89080c68", new Object[]{this, new Integer(i)});
            return;
        }
        List<FlexiblePageViewEntity> list = this.f8790a;
        if (list != null) {
            this.g = i % list.size();
        } else {
            this.g = i;
        }
    }

    public final void m(JSONObject jSONObject, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9debd42a", new Object[]{this, jSONObject, new Boolean(z)});
            return;
        }
        String str2 = bg6.TAG;
        Log.e(str2, "track4Click " + this.c);
        if (!this.c && jSONObject != null) {
            String string = jSONObject.getString("pageName");
            String string2 = jSONObject.getString("name");
            HashMap hashMap = new HashMap();
            hashMap.putAll(xxv.a(jSONObject.getString("params")));
            if (z) {
                str = "open";
            } else {
                str = "close";
            }
            hashMap.put(q0j.BIZ_CONTEXT_KEY_CARD_TYPE, str);
            mbu.j(string, string2, hashMap);
        }
    }

    public final Object j(ViewGroup viewGroup, int i, FlexiblePageViewEntity flexiblePageViewEntity) {
        FlexiblePageViewNormal flexiblePageViewNormal;
        int i2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6ab147e6", new Object[]{this, viewGroup, new Integer(i), flexiblePageViewEntity});
        }
        if ("normal".equals(flexiblePageViewEntity.style)) {
            flexiblePageViewNormal = new FlexiblePageViewNormal(viewGroup.getContext());
        } else if (!"priceAnimation".equals(flexiblePageViewEntity.style)) {
            return new TextView(viewGroup.getContext());
        } else {
            flexiblePageViewNormal = new FlexiblePageViewPriceAnimation(viewGroup.getContext());
        }
        flexiblePageViewNormal.setOnClickListener(new a(viewGroup, flexiblePageViewEntity, i));
        flexiblePageViewNormal.setPageViewEntity(flexiblePageViewEntity);
        flexiblePageViewNormal.setEnableAutoJellyMarquee(this.b);
        flexiblePageViewNormal.setIsCache(this.c);
        if (i != 0) {
            z = false;
        }
        flexiblePageViewNormal.updateView(z, this.d, this.f, this.e);
        float f = i == 0 ? 1.0f : 0.0f;
        if (i == 0) {
            i2 = this.d;
        } else {
            i2 = this.f;
        }
        flexiblePageViewNormal.updateViewProgress(f, i2, this.e);
        viewGroup.addView(flexiblePageViewNormal, new FrameLayout.LayoutParams(-1, -1));
        return flexiblePageViewNormal;
    }
}
