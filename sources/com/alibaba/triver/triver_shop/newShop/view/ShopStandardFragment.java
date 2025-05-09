package com.alibaba.triver.triver_shop.newShop.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.c8c;
import tb.kew;
import tb.r54;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopStandardFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public c8c f3153a;
    public FrameLayout c;

    static {
        t2o.a(766509705);
    }

    public static /* synthetic */ Object ipc$super(ShopStandardFragment shopStandardFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2147180915:
                super.onSaveInstanceState((Bundle) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 434397186:
                super.onHiddenChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case 462397159:
                super.onDestroyView();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1860817453:
                super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/ShopStandardFragment");
        }
    }

    public static final /* synthetic */ void p2(ShopStandardFragment shopStandardFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce3edba5", new Object[]{shopStandardFragment});
        } else {
            shopStandardFragment.s2();
        }
    }

    public final void A2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53dcd20a", new Object[]{this});
            return;
        }
        c8c c8cVar = this.f3153a;
        if (c8cVar != null) {
            c8cVar.a();
        }
    }

    public final void B2(c8c c8cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f157182", new Object[]{this, c8cVar});
        } else {
            this.f3153a = c8cVar;
        }
    }

    public final void C2(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f15f3f8", new Object[]{this, new Integer(i)});
            return;
        }
        c8c c8cVar = this.f3153a;
        if (c8cVar != null) {
            c8cVar.d(i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
        } else {
            super.onCreate(bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        if (layoutInflater == null) {
            context = null;
        } else {
            context = layoutInflater.getContext();
        }
        if (context == null) {
            if (viewGroup == null) {
                context = null;
            } else {
                context = viewGroup.getContext();
            }
            if (context == null) {
                context = getContext();
            }
        }
        if (context == null) {
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        kew.T(frameLayout);
        kew.Y(frameLayout);
        this.c = frameLayout;
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        super.onDestroyView();
        c8c c8cVar = this.f3153a;
        if (c8cVar != null) {
            c8cVar.onDestroyView();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e46002", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onHiddenChanged(z);
        if (z) {
            A2();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        c8c c8cVar = this.f3153a;
        if (c8cVar != null) {
            c8cVar.onPause();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        c8c c8cVar = this.f3153a;
        if (c8cVar != null) {
            c8cVar.onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
        } else {
            super.onSaveInstanceState(bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            super.onStop();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        s2();
    }

    public final void r2() {
        View b;
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2089193", new Object[]{this});
            return;
        }
        c8c c8cVar = this.f3153a;
        if (c8cVar != null && (b = c8cVar.b(getContext(), this)) != null && (frameLayout = this.c) != null) {
            kew.a(frameLayout, b);
        }
    }

    public final void s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4803f602", new Object[]{this});
        } else if (isAdded()) {
            r2();
        } else {
            r54.F(new ShopStandardFragment$createViewSafely$1(this));
        }
    }

    public final int u2() {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c0f96ed4", new Object[]{this})).intValue();
        }
        c8c c8cVar = this.f3153a;
        if (c8cVar == null) {
            num = null;
        } else {
            num = Integer.valueOf(c8cVar.c());
        }
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final c8c v2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8c) ipChange.ipc$dispatch("d99f78e4", new Object[]{this});
        }
        return this.f3153a;
    }

    public final void z2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f28c91", new Object[]{this});
            return;
        }
        c8c c8cVar = this.f3153a;
        if (c8cVar != null) {
            c8cVar.e();
        }
    }
}
