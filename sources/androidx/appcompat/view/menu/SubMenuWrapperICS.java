package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.internal.view.SupportSubMenu;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SubMenuWrapperICS extends MenuWrapperICS implements SubMenu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final SupportSubMenu mSubMenu;

    public SubMenuWrapperICS(Context context, SupportSubMenu supportSubMenu) {
        super(context, supportSubMenu);
        this.mSubMenu = supportSubMenu;
    }

    public static /* synthetic */ Object ipc$super(SubMenuWrapperICS subMenuWrapperICS, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/appcompat/view/menu/SubMenuWrapperICS");
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47e22ec1", new Object[]{this});
        } else {
            this.mSubMenu.clearHeader();
        }
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("e116d05", new Object[]{this});
        }
        return getMenuItemWrapper(this.mSubMenu.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SubMenu) ipChange.ipc$dispatch("7ca8019c", new Object[]{this, new Integer(i)});
        }
        this.mSubMenu.setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SubMenu) ipChange.ipc$dispatch("2dcca9bd", new Object[]{this, new Integer(i)});
        }
        this.mSubMenu.setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SubMenu) ipChange.ipc$dispatch("c70f3199", new Object[]{this, view});
        }
        this.mSubMenu.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SubMenu) ipChange.ipc$dispatch("feb6112f", new Object[]{this, new Integer(i)});
        }
        this.mSubMenu.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SubMenu) ipChange.ipc$dispatch("e06e25dd", new Object[]{this, drawable});
        }
        this.mSubMenu.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SubMenu) ipChange.ipc$dispatch("41d2589c", new Object[]{this, charSequence});
        }
        this.mSubMenu.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SubMenu) ipChange.ipc$dispatch("a83b156a", new Object[]{this, drawable});
        }
        this.mSubMenu.setIcon(drawable);
        return this;
    }
}
