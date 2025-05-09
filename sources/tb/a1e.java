package tb;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.container.ui.titlebar.NavigatorBarAnimType;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface a1e {
    public static final int CENTER = 2;
    public static final a Companion = a.$$INSTANCE;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static final int CENTER = 2;
        public static final int LEFT = 0;
        public static final int RIGHT = 1;

        static {
            t2o.a(835715190);
        }
    }

    void addLeftAction(a90 a90Var);

    void addRightAction(a90 a90Var);

    void addRightAction(a90 a90Var, int i);

    void attachPage(ITMSPage iTMSPage);

    void clearCenterActions();

    void clearLeftActions();

    void clearRightActions();

    <T> T getAction(Class<T> cls);

    List<a90> getActions();

    Drawable getBackgroundDrawable();

    View getContentView();

    int getTitleViewHeight();

    void hideTitleBar(NavigatorBarAnimType navigatorBarAnimType);

    void removeAction(a90 a90Var);

    void setStyle(Window.Theme theme);

    void setTitleBarAlpha(int i);

    void setTitleBarBackgroundColor(int i);

    void setTitleBarBackgroundDrawable(Drawable drawable);

    void showTitleBar(NavigatorBarAnimType navigatorBarAnimType);
}
