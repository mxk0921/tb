package tb;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.album.SystemAlbumPickerFragment;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class q2r {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final q2r INSTANCE = new q2r();

    /* renamed from: a  reason: collision with root package name */
    public static final String f26468a = q2r.class.getSimpleName();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface a {
    }

    static {
        t2o.a(481297664);
    }

    @JvmStatic
    public static final void c(FragmentActivity fragmentActivity, boolean z, a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e621aa93", new Object[]{fragmentActivity, new Boolean(z), aVar, str});
        } else if (fragmentActivity != null) {
            q2r q2rVar = INSTANCE;
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            ckf.f(supportFragmentManager, "activity.supportFragmentManager");
            q2rVar.b(supportFragmentManager).p2(z, aVar, str);
        }
    }

    public final SystemAlbumPickerFragment a(FragmentManager fragmentManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SystemAlbumPickerFragment) ipChange.ipc$dispatch("9e431270", new Object[]{this, fragmentManager});
        }
        return (SystemAlbumPickerFragment) fragmentManager.findFragmentByTag(f26468a);
    }

    public final SystemAlbumPickerFragment b(FragmentManager fragmentManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SystemAlbumPickerFragment) ipChange.ipc$dispatch("1d319f8d", new Object[]{this, fragmentManager});
        }
        SystemAlbumPickerFragment a2 = a(fragmentManager);
        if (a2 != null) {
            return a2;
        }
        SystemAlbumPickerFragment systemAlbumPickerFragment = new SystemAlbumPickerFragment();
        fragmentManager.beginTransaction().add(systemAlbumPickerFragment, f26468a).commitNow();
        return systemAlbumPickerFragment;
    }
}
