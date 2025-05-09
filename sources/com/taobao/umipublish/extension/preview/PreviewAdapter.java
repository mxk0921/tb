package com.taobao.umipublish.extension.preview;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.extension.preview.PreviewModel;
import java.util.ArrayList;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PreviewAdapter extends PagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int c;
    public int e;

    /* renamed from: a  reason: collision with root package name */
    public final List<PreviewModel.Media> f13985a = new ArrayList();
    public final SparseArray<a> b = new SparseArray<>();
    public int d = -1;
    public boolean f = true;

    static {
        t2o.a(944767026);
    }

    public static /* synthetic */ Object ipc$super(PreviewAdapter previewAdapter, String str, Object... objArr) {
        if (str.hashCode() == -2093417530) {
            super.setPrimaryItem((ViewGroup) objArr[0], ((Number) objArr[1]).intValue(), objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/preview/PreviewAdapter");
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
        } else {
            j((View) obj);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        return ((ArrayList) this.f13985a).size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
        }
        return -2;
    }

    public final a h(PreviewModel.Media media) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("1cb8deef", new Object[]{this, media});
        }
        int i = this.c;
        if (2 == i) {
            return this.b.get(media.type);
        }
        return this.b.get(i);
    }

    public final int i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff70a612", new Object[]{this, new Integer(i)})).intValue();
        }
        if (getCount() <= 0) {
            return i;
        }
        return i % getCount();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
        }
        PreviewModel.Media media = (PreviewModel.Media) ((ArrayList) this.f13985a).get(i(i));
        return h(media).a(viewGroup, media);
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

    public final void j(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d61170", new Object[]{this, view});
            return;
        }
        int i = this.c;
        if (2 == i) {
            this.b.get(this.e).destroyView(view);
        } else {
            this.b.get(i).destroyView(view);
        }
    }

    public final void k(int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a512eb1", new Object[]{this, new Integer(i), view});
            return;
        }
        PreviewModel.Media media = (PreviewModel.Media) ((ArrayList) this.f13985a).get(i);
        int i2 = this.c;
        if (2 == i2) {
            this.b.get(media.type).c(view, media);
        } else {
            this.b.get(i2).c(view, media);
        }
    }

    public void l(int i, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b9a58", new Object[]{this, new Integer(i), aVar});
        } else {
            this.b.put(i, aVar);
        }
    }

    public void m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71c72aeb", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public void n(List<PreviewModel.Media> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d661c0ad", new Object[]{this, list});
            return;
        }
        ((ArrayList) this.f13985a).clear();
        ((ArrayList) this.f13985a).addAll(list);
        notifyDataSetChanged();
    }

    public void o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e09620", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6b226a7", new Object[]{this});
        } else if (this.f) {
            this.f = false;
        } else {
            int i = this.d;
            if (i >= 0 && 1 == ((PreviewModel.Media) ((ArrayList) this.f13985a).get(i)).type) {
                this.b.get(1).b();
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8338fbc6", new Object[]{this, viewGroup, new Integer(i), obj});
            return;
        }
        super.setPrimaryItem(viewGroup, i, obj);
        int i2 = i(i);
        if (i2 >= 0 && i2 < ((ArrayList) this.f13985a).size()) {
            k(i2, (View) obj);
            this.d = i2;
        }
    }
}
