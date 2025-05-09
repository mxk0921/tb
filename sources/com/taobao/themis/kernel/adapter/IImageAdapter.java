package com.taobao.themis.kernel.adapter;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import tb.n8s;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IImageAdapter extends n8s {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void onImageFinish(Drawable drawable);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f13563a;
        public String b;

        static {
            t2o.a(839909472);
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("58b71cc9", new Object[]{this})).intValue();
            }
            return this.f13563a;
        }

        public final int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f8156c39", new Object[]{this})).intValue();
            }
            return 0;
        }

        public final String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b8645edb", new Object[]{this});
            }
            return this.b;
        }

        public final boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("13f1e994", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public final void e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5038a61", new Object[]{this, new Integer(i)});
            } else {
                this.f13563a = i;
            }
        }

        public final void f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88c75e63", new Object[]{this, str});
            } else {
                this.b = str;
            }
        }
    }

    void loadImage(String str, b bVar, a aVar);

    void setImageUrl(ImageView imageView, String str, b bVar);
}
