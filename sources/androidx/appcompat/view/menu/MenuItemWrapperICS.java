package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MenuItemWrapperICS extends BaseMenuWrapper implements MenuItem {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOG_TAG = "MenuItemWrapper";
    private Method mSetExclusiveCheckableMethod;
    private final SupportMenuItem mWrappedObject;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class ActionProviderWrapper extends ActionProvider implements ActionProvider.VisibilityListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final android.view.ActionProvider mInner;
        private ActionProvider.VisibilityListener mListener;

        public ActionProviderWrapper(Context context, android.view.ActionProvider actionProvider) {
            super(context);
            this.mInner = actionProvider;
        }

        public static /* synthetic */ android.view.ActionProvider access$000(ActionProviderWrapper actionProviderWrapper) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (android.view.ActionProvider) ipChange.ipc$dispatch("25a19b52", new Object[]{actionProviderWrapper});
            }
            return actionProviderWrapper.mInner;
        }

        public static /* synthetic */ Object ipc$super(ActionProviderWrapper actionProviderWrapper, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/appcompat/view/menu/MenuItemWrapperICS$ActionProviderWrapper");
        }

        @Override // androidx.core.view.ActionProvider
        public boolean hasSubMenu() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("244105d0", new Object[]{this})).booleanValue();
            }
            return this.mInner.hasSubMenu();
        }

        @Override // androidx.core.view.ActionProvider
        public boolean isVisible() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b3aa8873", new Object[]{this})).booleanValue();
            }
            return this.mInner.isVisible();
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4e956d1", new Object[]{this, new Boolean(z)});
                return;
            }
            ActionProvider.VisibilityListener visibilityListener = this.mListener;
            if (visibilityListener != null) {
                visibilityListener.onActionProviderVisibilityChanged(z);
            }
        }

        @Override // androidx.core.view.ActionProvider
        public View onCreateActionView(MenuItem menuItem) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("fab5f7ca", new Object[]{this, menuItem}) : this.mInner.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.ActionProvider
        public boolean onPerformDefaultAction() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("af68b880", new Object[]{this})).booleanValue();
            }
            return this.mInner.onPerformDefaultAction();
        }

        @Override // androidx.core.view.ActionProvider
        public void onPrepareSubMenu(SubMenu subMenu) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("76714c78", new Object[]{this, subMenu});
            } else {
                this.mInner.onPrepareSubMenu(MenuItemWrapperICS.this.getSubMenuWrapper(subMenu));
            }
        }

        @Override // androidx.core.view.ActionProvider
        public boolean overridesItemVisibility() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b9d77717", new Object[]{this})).booleanValue();
            }
            return this.mInner.overridesItemVisibility();
        }

        @Override // androidx.core.view.ActionProvider
        public void refreshVisibility() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a5d254", new Object[]{this});
            } else {
                this.mInner.refreshVisibility();
            }
        }

        @Override // androidx.core.view.ActionProvider
        public void setVisibilityListener(ActionProvider.VisibilityListener visibilityListener) {
            ActionProviderWrapper actionProviderWrapper;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d352bfb", new Object[]{this, visibilityListener});
                return;
            }
            this.mListener = visibilityListener;
            android.view.ActionProvider actionProvider = this.mInner;
            if (visibilityListener != null) {
                actionProviderWrapper = this;
            } else {
                actionProviderWrapper = null;
            }
            actionProvider.setVisibilityListener(actionProviderWrapper);
        }

        @Override // androidx.core.view.ActionProvider
        public View onCreateActionView() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("3e261c9f", new Object[]{this}) : this.mInner.onCreateActionView();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class CollapsibleActionViewWrapper extends FrameLayout implements CollapsibleActionView {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final android.view.CollapsibleActionView mWrappedView;

        public CollapsibleActionViewWrapper(View view) {
            super(view.getContext());
            this.mWrappedView = (android.view.CollapsibleActionView) view;
            addView(view);
        }

        public static /* synthetic */ Object ipc$super(CollapsibleActionViewWrapper collapsibleActionViewWrapper, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/appcompat/view/menu/MenuItemWrapperICS$CollapsibleActionViewWrapper");
        }

        public View getWrappedView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("e30cb19d", new Object[]{this});
            }
            return (View) this.mWrappedView;
        }

        @Override // androidx.appcompat.view.CollapsibleActionView
        public void onActionViewCollapsed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9750d044", new Object[]{this});
            } else {
                this.mWrappedView.onActionViewCollapsed();
            }
        }

        @Override // androidx.appcompat.view.CollapsibleActionView
        public void onActionViewExpanded() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9bafb1a", new Object[]{this});
            } else {
                this.mWrappedView.onActionViewExpanded();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class OnActionExpandListenerWrapper implements MenuItem.OnActionExpandListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final MenuItem.OnActionExpandListener mObject;

        public OnActionExpandListenerWrapper(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.mObject = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("da0dc46e", new Object[]{this, menuItem})).booleanValue();
            }
            return this.mObject.onMenuItemActionCollapse(MenuItemWrapperICS.this.getMenuItemWrapper(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4110ffa1", new Object[]{this, menuItem})).booleanValue();
            }
            return this.mObject.onMenuItemActionExpand(MenuItemWrapperICS.this.getMenuItemWrapper(menuItem));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class OnMenuItemClickListenerWrapper implements MenuItem.OnMenuItemClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final MenuItem.OnMenuItemClickListener mObject;

        public OnMenuItemClickListenerWrapper(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.mObject = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f2df3d0b", new Object[]{this, menuItem})).booleanValue();
            }
            return this.mObject.onMenuItemClick(MenuItemWrapperICS.this.getMenuItemWrapper(menuItem));
        }
    }

    public MenuItemWrapperICS(Context context, SupportMenuItem supportMenuItem) {
        super(context);
        if (supportMenuItem != null) {
            this.mWrappedObject = supportMenuItem;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public static /* synthetic */ Object ipc$super(MenuItemWrapperICS menuItemWrapperICS, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/appcompat/view/menu/MenuItemWrapperICS");
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9677ae13", new Object[]{this})).booleanValue();
        }
        return this.mWrappedObject.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71e14640", new Object[]{this})).booleanValue();
        }
        return this.mWrappedObject.expandActionView();
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (android.view.ActionProvider) ipChange.ipc$dispatch("b3384524", new Object[]{this});
        }
        androidx.core.view.ActionProvider supportActionProvider = this.mWrappedObject.getSupportActionProvider();
        if (supportActionProvider instanceof ActionProviderWrapper) {
            return ActionProviderWrapper.access$000((ActionProviderWrapper) supportActionProvider);
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3750083a", new Object[]{this});
        }
        View actionView = this.mWrappedObject.getActionView();
        if (actionView instanceof CollapsibleActionViewWrapper) {
            return ((CollapsibleActionViewWrapper) actionView).getWrappedView();
        }
        return actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("797568f3", new Object[]{this})).intValue();
        }
        return this.mWrappedObject.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Character) ipChange.ipc$dispatch("ccf3f01d", new Object[]{this})).charValue();
        }
        return this.mWrappedObject.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("3a52ebfa", new Object[]{this});
        }
        return this.mWrappedObject.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f5069a3e", new Object[]{this})).intValue();
        }
        return this.mWrappedObject.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("b3e39c04", new Object[]{this});
        }
        return this.mWrappedObject.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorStateList) ipChange.ipc$dispatch("5b480c65", new Object[]{this});
        }
        return this.mWrappedObject.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PorterDuff.Mode) ipChange.ipc$dispatch("5686628d", new Object[]{this});
        }
        return this.mWrappedObject.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("cdc34bda", new Object[]{this});
        }
        return this.mWrappedObject.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5368d0fe", new Object[]{this})).intValue();
        }
        return this.mWrappedObject.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContextMenu.ContextMenuInfo) ipChange.ipc$dispatch("2214391f", new Object[]{this});
        }
        return this.mWrappedObject.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("255b2d5f", new Object[]{this})).intValue();
        }
        return this.mWrappedObject.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Character) ipChange.ipc$dispatch("c4dee31", new Object[]{this})).charValue();
        }
        return this.mWrappedObject.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8042612", new Object[]{this})).intValue();
        }
        return this.mWrappedObject.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SubMenu) ipChange.ipc$dispatch("b8d8e540", new Object[]{this});
        }
        return getSubMenuWrapper(this.mWrappedObject.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("1db95d71", new Object[]{this});
        }
        return this.mWrappedObject.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("68e2158e", new Object[]{this});
        }
        return this.mWrappedObject.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("60961479", new Object[]{this});
        }
        return this.mWrappedObject.getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("244105d0", new Object[]{this})).booleanValue();
        }
        return this.mWrappedObject.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74a9a029", new Object[]{this})).booleanValue();
        }
        return this.mWrappedObject.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67b690e3", new Object[]{this})).booleanValue();
        }
        return this.mWrappedObject.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f77ac528", new Object[]{this})).booleanValue();
        }
        return this.mWrappedObject.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56f023c2", new Object[]{this})).booleanValue();
        }
        return this.mWrappedObject.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3aa8873", new Object[]{this})).booleanValue();
        }
        return this.mWrappedObject.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("662b0755", new Object[]{this, actionProvider});
        }
        ActionProviderWrapper actionProviderWrapper = new ActionProviderWrapper(this.mContext, actionProvider);
        SupportMenuItem supportMenuItem = this.mWrappedObject;
        if (actionProvider == null) {
            actionProviderWrapper = null;
        }
        supportMenuItem.setSupportActionProvider(actionProviderWrapper);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("c8879b43", new Object[]{this, view});
        }
        if (view instanceof android.view.CollapsibleActionView) {
            view = new CollapsibleActionViewWrapper(view);
        }
        this.mWrappedObject.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("69859e76", new Object[]{this, new Character(c)});
        }
        this.mWrappedObject.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("178370c2", new Object[]{this, new Boolean(z)});
        }
        this.mWrappedObject.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("d923acdd", new Object[]{this, new Boolean(z)});
        }
        this.mWrappedObject.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("5ff6e9e5", new Object[]{this, charSequence});
        }
        this.mWrappedObject.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("11748103", new Object[]{this, new Boolean(z)});
        }
        this.mWrappedObject.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("24fec21b", new Object[]{this, drawable});
        }
        this.mWrappedObject.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("c4b1e38e", new Object[]{this, colorStateList});
        }
        this.mWrappedObject.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("4861c5e0", new Object[]{this, mode});
        }
        this.mWrappedObject.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("1bb1c3d7", new Object[]{this, intent});
        }
        this.mWrappedObject.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("bbf6917a", new Object[]{this, new Character(c)});
        }
        this.mWrappedObject.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        OnActionExpandListenerWrapper onActionExpandListenerWrapper;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("3458e405", new Object[]{this, onActionExpandListener});
        }
        SupportMenuItem supportMenuItem = this.mWrappedObject;
        if (onActionExpandListener != null) {
            onActionExpandListenerWrapper = new OnActionExpandListenerWrapper(onActionExpandListener);
        } else {
            onActionExpandListenerWrapper = null;
        }
        supportMenuItem.setOnActionExpandListener(onActionExpandListenerWrapper);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        OnMenuItemClickListenerWrapper onMenuItemClickListenerWrapper;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("54489043", new Object[]{this, onMenuItemClickListener});
        }
        SupportMenuItem supportMenuItem = this.mWrappedObject;
        if (onMenuItemClickListener != null) {
            onMenuItemClickListenerWrapper = new OnMenuItemClickListenerWrapper(onMenuItemClickListener);
        } else {
            onMenuItemClickListenerWrapper = null;
        }
        supportMenuItem.setOnMenuItemClickListener(onMenuItemClickListenerWrapper);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("a5f23364", new Object[]{this, new Character(c), new Character(c2)});
        }
        this.mWrappedObject.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5a34715", new Object[]{this, new Integer(i)});
        } else {
            this.mWrappedObject.setShowAsAction(i);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("6247b5b1", new Object[]{this, new Integer(i)});
        }
        this.mWrappedObject.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("d3ab70f6", new Object[]{this, charSequence});
        }
        this.mWrappedObject.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("d8559fd1", new Object[]{this, charSequence});
        }
        this.mWrappedObject.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("67ec69ee", new Object[]{this, charSequence});
        }
        this.mWrappedObject.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("dc5d6532", new Object[]{this, new Boolean(z)});
        }
        return this.mWrappedObject.setVisible(z);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("50ff7b57", new Object[]{this, new Character(c), new Integer(i)});
        }
        this.mWrappedObject.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("9de33ef6", new Object[]{this, new Integer(i)});
        }
        this.mWrappedObject.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("4cace8d3", new Object[]{this, new Character(c), new Integer(i)});
        }
        this.mWrappedObject.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("2c5c4c04", new Object[]{this, new Character(c), new Character(c2), new Integer(i), new Integer(i2)});
        }
        this.mWrappedObject.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("88682efb", new Object[]{this, new Integer(i)});
        }
        this.mWrappedObject.setTitle(i);
        return this;
    }

    public void setExclusiveCheckable(boolean z) {
        try {
            if (this.mSetExclusiveCheckableMethod == null) {
                this.mSetExclusiveCheckableMethod = this.mWrappedObject.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.mSetExclusiveCheckableMethod.invoke(this.mWrappedObject, Boolean.valueOf(z));
        } catch (Exception unused) {
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("f79411b4", new Object[]{this, new Integer(i)});
        }
        this.mWrappedObject.setActionView(i);
        View actionView = this.mWrappedObject.getActionView();
        if (actionView instanceof android.view.CollapsibleActionView) {
            this.mWrappedObject.setActionView(new CollapsibleActionViewWrapper(actionView));
        }
        return this;
    }
}
