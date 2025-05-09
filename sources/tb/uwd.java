package tb;

import android.view.ViewGroup;
import com.taobao.themis.kernel.container.ui.splash.ISplashView;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import java.util.List;
import kotlin.Deprecated;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface uwd {
    void createSplashView(ViewGroup viewGroup);

    void destroy();

    mm4 getContainerModel();

    List<t4c> getInstanceExtension();

    @Deprecated(message = "instead of LaunchNG")
    a9s getLauncher();

    pwd getLauncherNG();

    rwd getPageFactory();

    twd getRenderFactory();

    TMSSolutionType getSolutionType();

    ISplashView getSplashView();

    boolean reload(pcs pcsVar);
}
