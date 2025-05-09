package com.taobao.themis.container.app.page.swiper;

import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/taobao/themis/container/app/page/swiper/ThresholdPageListener;", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "a", "themis_container_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class ThresholdPageListener implements ViewPager.OnPageChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final float f13493a;
    public final a b = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public float f13494a;
        public boolean b;
        public boolean c;
        public boolean d = true;

        static {
            t2o.a(835715145);
        }

        public final boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bd28e45e", new Object[]{this})).booleanValue();
            }
            return this.c;
        }

        public final float b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8c89f89", new Object[]{this})).floatValue();
            }
            return this.f13494a;
        }

        public final boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1ee70b02", new Object[]{this})).booleanValue();
            }
            return this.d;
        }

        public final boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ad3ffaf6", new Object[]{this})).booleanValue();
            }
            return this.b;
        }

        public final void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e6256", new Object[]{this});
                return;
            }
            this.f13494a = 0.0f;
            this.b = false;
            this.c = false;
            this.d = true;
        }

        public final void f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c38a662e", new Object[]{this, new Boolean(z)});
            } else {
                this.c = z;
            }
        }

        public final void g(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5996af5e", new Object[]{this, new Boolean(z)});
            } else {
                this.d = z;
            }
        }

        public final void h(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e907abb", new Object[]{this, new Float(f)});
            } else {
                this.f13494a = f;
            }
        }

        public final void i(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aa2c35a", new Object[]{this, new Boolean(z)});
            } else {
                this.b = z;
            }
        }
    }

    static {
        t2o.a(835715144);
    }

    public ThresholdPageListener(float f) {
        this.f13493a = f;
    }

    public abstract void a(int i);

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
            this.b.e();
        } else {
            a aVar = this.b;
            if (i != 1) {
                z = false;
            }
            aVar.i(z);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
        } else if (this.b.d()) {
            if (this.b.c()) {
                this.b.g(false);
            } else if (this.b.b() < f) {
                if (!this.b.a() && f >= this.f13493a) {
                    this.b.f(true);
                    a(i + 1);
                }
            } else if (!this.b.a() && 1 - f >= this.f13493a) {
                this.b.f(true);
                a(i);
            }
            this.b.h(f);
        }
    }
}
