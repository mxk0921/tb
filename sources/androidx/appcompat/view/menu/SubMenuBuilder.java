package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.MenuBuilder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SubMenuBuilder extends MenuBuilder implements SubMenu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MenuItemImpl mItem;
    private MenuBuilder mParentMenu;

    public SubMenuBuilder(Context context, MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        super(context);
        this.mParentMenu = menuBuilder;
        this.mItem = menuItemImpl;
    }

    public static /* synthetic */ Object ipc$super(SubMenuBuilder subMenuBuilder, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1740550133:
                return super.setHeaderTitleInt(((Number) objArr[0]).intValue());
            case -1359463792:
                return new Boolean(super.dispatchMenuItemSelected((MenuBuilder) objArr[0], (MenuItem) objArr[1]));
            case -1055176595:
                return super.getActionViewStatesKey();
            case -806384308:
                return super.setHeaderIconInt(((Number) objArr[0]).intValue());
            case -381468625:
                return super.setHeaderIconInt((Drawable) objArr[0]);
            case -172413135:
                return super.setHeaderViewInt((View) objArr[0]);
            case 1367478288:
                return super.setHeaderTitleInt((CharSequence) objArr[0]);
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/appcompat/view/menu/SubMenuBuilder");
        }
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public boolean collapseItemActionView(MenuItemImpl menuItemImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84cba539", new Object[]{this, menuItemImpl})).booleanValue();
        }
        return this.mParentMenu.collapseItemActionView(menuItemImpl);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public boolean dispatchMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aef83a90", new Object[]{this, menuBuilder, menuItem})).booleanValue();
        }
        if (super.dispatchMenuItemSelected(menuBuilder, menuItem) || this.mParentMenu.dispatchMenuItemSelected(menuBuilder, menuItem)) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public boolean expandItemActionView(MenuItemImpl menuItemImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26fd816c", new Object[]{this, menuItemImpl})).booleanValue();
        }
        return this.mParentMenu.expandItemActionView(menuItemImpl);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public String getActionViewStatesKey() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c11b486d", new Object[]{this});
        }
        MenuItemImpl menuItemImpl = this.mItem;
        if (menuItemImpl != null) {
            i = menuItemImpl.getItemId();
        }
        if (i == 0) {
            return null;
        }
        return super.getActionViewStatesKey() + ":" + i;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("e116d05", new Object[]{this});
        }
        return this.mItem;
    }

    public Menu getParentMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Menu) ipChange.ipc$dispatch("ee93d96e", new Object[]{this});
        }
        return this.mParentMenu;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public MenuBuilder getRootMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuBuilder) ipChange.ipc$dispatch("87a83723", new Object[]{this});
        }
        return this.mParentMenu.getRootMenu();
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public boolean isGroupDividerEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2621aec8", new Object[]{this})).booleanValue();
        }
        return this.mParentMenu.isGroupDividerEnabled();
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public boolean isQwertyMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33deb7b0", new Object[]{this})).booleanValue();
        }
        return this.mParentMenu.isQwertyMode();
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public boolean isShortcutsVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6c1891a", new Object[]{this})).booleanValue();
        }
        return this.mParentMenu.isShortcutsVisible();
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public void setCallback(MenuBuilder.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af67e60e", new Object[]{this, callback});
        } else {
            this.mParentMenu.setCallback(callback);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder, androidx.core.internal.view.SupportMenu, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da4a63c8", new Object[]{this, new Boolean(z)});
        } else {
            this.mParentMenu.setGroupDividerEnabled(z);
        }
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SubMenu) ipChange.ipc$dispatch("e06e25dd", new Object[]{this, drawable}) : (SubMenu) super.setHeaderIconInt(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SubMenu) ipChange.ipc$dispatch("41d2589c", new Object[]{this, charSequence}) : (SubMenu) super.setHeaderTitleInt(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SubMenu) ipChange.ipc$dispatch("c70f3199", new Object[]{this, view});
        }
        return (SubMenu) super.setHeaderViewInt(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SubMenu) ipChange.ipc$dispatch("a83b156a", new Object[]{this, drawable});
        }
        this.mItem.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    public void setQwertyMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("346bea70", new Object[]{this, new Boolean(z)});
        } else {
            this.mParentMenu.setQwertyMode(z);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public void setShortcutsVisible(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3e2d046", new Object[]{this, new Boolean(z)});
        } else {
            this.mParentMenu.setShortcutsVisible(z);
        }
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SubMenu) ipChange.ipc$dispatch("7ca8019c", new Object[]{this, new Integer(i)}) : (SubMenu) super.setHeaderIconInt(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SubMenu) ipChange.ipc$dispatch("2dcca9bd", new Object[]{this, new Integer(i)}) : (SubMenu) super.setHeaderTitleInt(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SubMenu) ipChange.ipc$dispatch("feb6112f", new Object[]{this, new Integer(i)});
        }
        this.mItem.setIcon(i);
        return this;
    }
}
