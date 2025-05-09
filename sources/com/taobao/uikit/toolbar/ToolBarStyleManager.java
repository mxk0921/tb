package com.taobao.uikit.toolbar;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.toolbar.api.IToolBarStyleSelector;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ToolBarStyleManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(927989847);
    }

    private static void initActionBarDefaultStyle(AppCompatActivity appCompatActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a2e6ec1", new Object[]{appCompatActivity});
            return;
        }
        ActionBar supportActionBar = appCompatActivity.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setElevation(0.0f);
            supportActionBar.setBackgroundDrawable(ContextCompat.getDrawable(appCompatActivity, R.color.uik_action_bar_normal));
            ViewGroup viewGroup = (ViewGroup) appCompatActivity.findViewById(R.id.action_bar_container);
            Toolbar toolbar = (Toolbar) appCompatActivity.findViewById(R.id.action_bar);
            if (viewGroup != null) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                layoutParams.height = (int) appCompatActivity.getResources().getDimension(R.dimen.uik_action_bar_height);
                viewGroup.setLayoutParams(layoutParams);
            }
            if (toolbar != null) {
                toolbar.setContentInsetStartWithNavigation(0);
                ViewGroup.LayoutParams layoutParams2 = toolbar.getLayoutParams();
                layoutParams2.height = (int) appCompatActivity.getResources().getDimension(R.dimen.uik_action_bar_height);
                toolbar.setLayoutParams(layoutParams2);
                toolbar.setTitleTextAppearance(appCompatActivity, R.style.TBTitle);
                toolbar.setSubtitleTextAppearance(appCompatActivity, R.style.TBSubTitle);
                toolbar.setTitleMargin(0, toolbar.getTitleMarginTop(), 0, toolbar.getTitleMarginBottom());
                int i = R.color.uik_action_icon_normal;
                toolbar.setTitleTextColor(ContextCompat.getColor(appCompatActivity, i));
                toolbar.setSubtitleTextColor(ContextCompat.getColor(appCompatActivity, i));
                if ((supportActionBar.getDisplayOptions() & 4) != 0) {
                    toolbar.setNavigationIcon(R.drawable.abc_ic_ab_back_mtrl_am_alpha);
                }
                Drawable navigationIcon = toolbar.getNavigationIcon();
                if (navigationIcon != null) {
                    Drawable wrap = DrawableCompat.wrap(navigationIcon);
                    wrap.mutate();
                    DrawableCompat.setTint(wrap, ContextCompat.getColor(appCompatActivity, i));
                }
                Drawable overflowIcon = toolbar.getOverflowIcon();
                if (overflowIcon != null) {
                    Drawable wrap2 = DrawableCompat.wrap(overflowIcon);
                    wrap2.mutate();
                    DrawableCompat.setTint(wrap2, ContextCompat.getColor(appCompatActivity, i));
                }
            }
        }
    }

    private static void initActionBarDesignTokenStyle(AppCompatActivity appCompatActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1a29567", new Object[]{appCompatActivity});
            return;
        }
        ActionBar supportActionBar = appCompatActivity.getSupportActionBar();
        if (supportActionBar != null && supportActionBar.isShowing()) {
            supportActionBar.setElevation(0.0f);
            supportActionBar.setBackgroundDrawable(ContextCompat.getDrawable(appCompatActivity, R.color.uik_action_bar_normal));
            ViewGroup viewGroup = (ViewGroup) appCompatActivity.findViewById(R.id.action_bar_container);
            if (viewGroup != null) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                layoutParams.height = (int) appCompatActivity.getResources().getDimension(R.dimen.uik_action_bar_height);
                viewGroup.setLayoutParams(layoutParams);
            }
            Toolbar toolbar = (Toolbar) appCompatActivity.findViewById(R.id.action_bar);
            if (toolbar != null) {
                toolbar.setContentInsetStartWithNavigation(0);
                ViewGroup.LayoutParams layoutParams2 = toolbar.getLayoutParams();
                layoutParams2.height = (int) appCompatActivity.getResources().getDimension(R.dimen.uik_action_bar_height);
                toolbar.setLayoutParams(layoutParams2);
                toolbar.setNavigationIcon(R.drawable.uik_action_back_icon);
                Drawable navigationIcon = toolbar.getNavigationIcon();
                if (navigationIcon != null) {
                    Drawable wrap = DrawableCompat.wrap(navigationIcon);
                    wrap.mutate();
                    DrawableCompat.setTint(wrap, ContextCompat.getColor(appCompatActivity, R.color.tb_text_primary));
                }
                toolbar.setTitleTextAppearance(appCompatActivity, R.style.tb_design_token_title);
                toolbar.setSubtitleTextAppearance(appCompatActivity, R.style.tb_design_token_subtitle);
                toolbar.setTitleMargin(0, toolbar.getTitleMarginTop(), 0, toolbar.getTitleMarginBottom());
                Drawable overflowIcon = toolbar.getOverflowIcon();
                if (overflowIcon != null) {
                    Drawable wrap2 = DrawableCompat.wrap(overflowIcon);
                    wrap2.mutate();
                    DrawableCompat.setTint(wrap2, ContextCompat.getColor(appCompatActivity, R.color.tb_text_primary));
                }
            }
        }
    }

    public static void initActionBarStyle(AppCompatActivity appCompatActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69fa208", new Object[]{appCompatActivity});
        } else if (!(appCompatActivity instanceof IToolBarStyleSelector) || ((IToolBarStyleSelector) appCompatActivity).getToolBarStyle() != 2) {
            initActionBarDefaultStyle(appCompatActivity);
        } else {
            initActionBarDesignTokenStyle(appCompatActivity);
        }
    }

    public static void updateActionViewIconColor(AppCompatActivity appCompatActivity, TBPublicMenu tBPublicMenu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f68de26f", new Object[]{appCompatActivity, tBPublicMenu});
        } else if (tBPublicMenu != null) {
            if (!(appCompatActivity instanceof IToolBarStyleSelector) || ((IToolBarStyleSelector) appCompatActivity).getToolBarStyle() != 2) {
                tBPublicMenu.setActionViewIconColor(ContextCompat.getColor(appCompatActivity, R.color.uik_action_icon_normal));
                return;
            }
            tBPublicMenu.setActionViewIconColor(ContextCompat.getColor(appCompatActivity, R.color.tb_text_primary));
            tBPublicMenu.useNewActionViewStyle();
        }
    }

    public static void initActionBarStyle(AppCompatActivity appCompatActivity, TBPublicMenu tBPublicMenu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("362d24f1", new Object[]{appCompatActivity, tBPublicMenu});
            return;
        }
        if (!(appCompatActivity instanceof IToolBarStyleSelector) || ((IToolBarStyleSelector) appCompatActivity).getToolBarStyle() != 2) {
            initActionBarDefaultStyle(appCompatActivity);
        } else {
            initActionBarDesignTokenStyle(appCompatActivity);
        }
        updateActionViewIconColor(appCompatActivity, tBPublicMenu);
    }
}
