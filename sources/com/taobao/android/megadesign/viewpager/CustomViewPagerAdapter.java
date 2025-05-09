package com.taobao.android.megadesign.viewpager;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import tb.ckf;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/taobao/android/megadesign/viewpager/CustomViewPagerAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "Landroidx/fragment/app/FragmentManager;", "fm", "<init>", "(Landroid/support/v4/app/FragmentManager;)V", "megaDesign_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class CustomViewPagerAdapter extends FragmentPagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<Fragment> f8935a = new ArrayList();
    public final List<String> b = new ArrayList();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomViewPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
        ckf.g(fragmentManager, "fm");
    }

    public static /* synthetic */ Object ipc$super(CustomViewPagerAdapter customViewPagerAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/megadesign/viewpager/CustomViewPagerAdapter");
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        return ((ArrayList) this.f8935a).size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public Fragment getItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("c2fe4a3b", new Object[]{this, new Integer(i)});
        }
        return (Fragment) ((ArrayList) this.f8935a).get(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("1a9ab8b1", new Object[]{this, new Integer(i)});
        }
        return (CharSequence) ((ArrayList) this.b).get(i);
    }

    public final void h(Fragment fragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efd0f4da", new Object[]{this, fragment, str});
            return;
        }
        ckf.g(fragment, "fragment");
        ckf.g(str, "title");
        ((ArrayList) this.f8935a).add(fragment);
        ((ArrayList) this.b).add(str);
    }
}
