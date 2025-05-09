package com.taobao.detail.rate.v2;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.PagerAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.v2.PreviewItemV2;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import kotlin.Metadata;
import tb.ckf;
import tb.odg;
import tb.pin;
import tb.vcw;
import tb.zpe;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/taobao/detail/rate/v2/CommonPageAdapterV2;", "Landroidx/viewpager/widget/PagerAdapter;", "Landroidx/fragment/app/FragmentActivity;", "activity", "<init>", "(Landroid/support/v4/app/FragmentActivity;)V", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class CommonPageAdapterV2 extends PagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<PreviewItemV2> f10346a = new ArrayList();
    public final Queue<View> b = new LinkedList();
    public final Queue<View> c = new LinkedList();
    public pin d;
    public int e;
    public final FragmentActivity f;

    public CommonPageAdapterV2(FragmentActivity fragmentActivity) {
        this.f = fragmentActivity;
    }

    public static /* synthetic */ Object ipc$super(CommonPageAdapterV2 commonPageAdapterV2, String str, Object... objArr) {
        if (str.hashCode() == -2093417530) {
            super.setPrimaryItem((ViewGroup) objArr[0], ((Number) objArr[1]).intValue(), objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/v2/CommonPageAdapterV2");
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        return this.f10346a.size();
    }

    public final List<PreviewItemV2> getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dbd142c0", new Object[]{this});
        }
        return this.f10346a;
    }

    public final void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b2132a9", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public final void i(pin pinVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a04671ab", new Object[]{this, pinVar});
        } else {
            this.d = pinVar;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue();
        }
        ckf.g(view, "p0");
        ckf.g(obj, IconCompat.EXTRA_OBJ);
        return ckf.b(view, obj);
    }

    public final void j(int i) {
        pin pinVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f75bbff", new Object[]{this, new Integer(i)});
        } else if (i == this.e && (pinVar = this.d) != null) {
            pinVar.h();
        }
    }

    public final void setData(List<PreviewItemV2> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ddf4a4", new Object[]{this, list});
            return;
        }
        ckf.g(list, "data");
        this.f10346a = list;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
            return;
        }
        ckf.g(viewGroup, "container");
        ckf.g(obj, IconCompat.EXTRA_OBJ);
        View view = (View) obj;
        viewGroup.removeView(view);
        Object tag = view.getTag();
        if (tag != null ? tag instanceof zpe : true) {
            ((LinkedList) this.b).offer(view);
            return;
        }
        Object tag2 = view.getTag();
        if (tag2 != null) {
            z = tag2 instanceof vcw;
        }
        if (z) {
            ((LinkedList) this.c).offer(view);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View view;
        vcw vcwVar;
        zpe zpeVar;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
        }
        ckf.g(viewGroup, "container");
        if (this.f10346a.get(i).getVideo() == null) {
            z = false;
        }
        if (!z) {
            if (((LinkedList) this.b).size() > 0) {
                view = (View) ((LinkedList) this.b).poll();
                ckf.f(view, "view");
                Object tag = view.getTag();
                if (tag != null) {
                    zpeVar = (zpe) tag;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.taobao.detail.rate.v2.ImageViewHolder");
                }
            } else {
                zpeVar = new zpe(viewGroup);
                zpeVar.d(this.e);
                zpeVar.e(this.d);
                view = zpeVar.c();
                if (view != null) {
                    view.setTag(zpeVar);
                }
            }
            zpeVar.b(i, this.f10346a.get(i));
        } else {
            if (((LinkedList) this.c).size() > 0) {
                view = (View) ((LinkedList) this.c).poll();
                ckf.f(view, "view");
                Object tag2 = view.getTag();
                if (tag2 != null) {
                    vcwVar = (vcw) tag2;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.taobao.detail.rate.v2.VideoViewHolder");
                }
            } else {
                vcwVar = new vcw(this.f, viewGroup);
                vcwVar.g(this.e);
                vcwVar.h(this.d);
                view = vcwVar.d();
                if (view != null) {
                    view.setTag(vcwVar);
                }
            }
            vcwVar.b(i, this.f10346a.get(i));
        }
        viewGroup.addView(view);
        j(i);
        if (view != null) {
            return view;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8338fbc6", new Object[]{this, viewGroup, new Integer(i), obj});
            return;
        }
        ckf.g(viewGroup, "container");
        ckf.g(obj, IconCompat.EXTRA_OBJ);
        super.setPrimaryItem(viewGroup, i, obj);
        odg.c("CommonPageAdapterV2", "setPrimaryItem " + i);
        if (obj instanceof View) {
            View view = (View) obj;
            if (view.getTag() instanceof vcw) {
                PreviewItemV2.VideoInfo video = this.f10346a.get(i).getVideo();
                Object tag = view.getTag();
                if (tag != null) {
                    ((vcw) tag).f(video);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.detail.rate.v2.VideoViewHolder");
            }
        }
    }
}
