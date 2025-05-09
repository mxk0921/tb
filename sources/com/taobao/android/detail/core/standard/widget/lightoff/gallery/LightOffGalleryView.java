package com.taobao.android.detail.core.standard.widget.lightoff.gallery;

import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.standard.widget.lightoff.model.LightOffItemModel;
import com.taobao.android.detail.core.standard.widget.lightoff.vm.ILightOffViewModel;
import java.util.List;
import tb.fkc;
import tb.gkc;
import tb.mog;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class LightOffGalleryView extends ViewPager implements fkc<LightOffItemModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LightOffGalleryAdapter mAdapter;

    static {
        t2o.a(438304839);
        t2o.a(438304837);
    }

    public LightOffGalleryView(mog mogVar) {
        this(mogVar, null);
    }

    private void init(mog mogVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28e60972", new Object[]{this, mogVar});
            return;
        }
        LightOffGalleryAdapter lightOffGalleryAdapter = new LightOffGalleryAdapter(mogVar);
        this.mAdapter = lightOffGalleryAdapter;
        setAdapter(lightOffGalleryAdapter);
    }

    public static /* synthetic */ Object ipc$super(LightOffGalleryView lightOffGalleryView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/core/standard/widget/lightoff/gallery/LightOffGalleryView");
    }

    public void bindData(List<LightOffItemModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9573b7f", new Object[]{this, list});
            return;
        }
        this.mAdapter.k(list);
        this.mAdapter.notifyDataSetChanged();
    }

    @Override // tb.fkc
    public Drawable getCurrentViewSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("6aa2fde7", new Object[]{this});
        }
        View i = this.mAdapter.i();
        if (i == null) {
            return null;
        }
        Object tag = i.getTag();
        if (tag instanceof ILightOffViewModel) {
            return ((ILightOffViewModel) tag).createSnapshot();
        }
        return null;
    }

    public LightOffGalleryAdapter getPageAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LightOffGalleryAdapter) ipChange.ipc$dispatch("e1e1e9e9", new Object[]{this});
        }
        return this.mAdapter;
    }

    @Override // tb.fkc
    public boolean isCurrentViewAllowPull() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("408f36e5", new Object[]{this})).booleanValue();
        }
        View i = this.mAdapter.i();
        if (i == null) {
            return false;
        }
        Object tag = i.getTag();
        if (tag instanceof ILightOffViewModel) {
            return ((ILightOffViewModel) tag).allowPull();
        }
        return false;
    }

    public void setItemListener(gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea877773", new Object[]{this, gkcVar});
        } else {
            this.mAdapter.j(gkcVar);
        }
    }

    public LightOffGalleryView(mog mogVar, AttributeSet attributeSet) {
        super(mogVar.f24181a, attributeSet);
        init(mogVar);
    }
}
