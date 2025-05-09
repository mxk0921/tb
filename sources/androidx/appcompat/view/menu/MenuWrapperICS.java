package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.core.internal.view.SupportMenu;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MenuWrapperICS extends BaseMenuWrapper implements Menu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final SupportMenu mWrappedObject;

    public MenuWrapperICS(Context context, SupportMenu supportMenu) {
        super(context);
        if (supportMenu != null) {
            this.mWrappedObject = supportMenu;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public static /* synthetic */ Object ipc$super(MenuWrapperICS menuWrapperICS, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/appcompat/view/menu/MenuWrapperICS");
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MenuItem) ipChange.ipc$dispatch("b286edc1", new Object[]{this, charSequence}) : getMenuItemWrapper(this.mWrappedObject.add(charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SubMenu) ipChange.ipc$dispatch("e48a4b67", new Object[]{this, charSequence}) : getSubMenuWrapper(this.mWrappedObject.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        internalClear();
        this.mWrappedObject.clear();
    }

    @Override // android.view.Menu
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            this.mWrappedObject.close();
        }
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("9c1b0be5", new Object[]{this, new Integer(i)});
        }
        return getMenuItemWrapper(this.mWrappedObject.findItem(i));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("3ded7ea8", new Object[]{this, new Integer(i)});
        }
        return getMenuItemWrapper(this.mWrappedObject.getItem(i));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d6d7eb3", new Object[]{this})).booleanValue();
        }
        return this.mWrappedObject.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b011a13", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        return this.mWrappedObject.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8d60ceb", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        return this.mWrappedObject.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2ac73c0", new Object[]{this, new Integer(i), keyEvent, new Integer(i2)})).booleanValue();
        }
        return this.mWrappedObject.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("874ebfe1", new Object[]{this, new Integer(i)});
            return;
        }
        internalRemoveGroup(i);
        this.mWrappedObject.removeGroup(i);
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb677405", new Object[]{this, new Integer(i)});
            return;
        }
        internalRemoveItem(i);
        this.mWrappedObject.removeItem(i);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd3f0b97", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
        } else {
            this.mWrappedObject.setGroupCheckable(i, z, z2);
        }
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6752593c", new Object[]{this, new Integer(i), new Boolean(z)});
        } else {
            this.mWrappedObject.setGroupEnabled(i, z);
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f0655ad", new Object[]{this, new Integer(i), new Boolean(z)});
        } else {
            this.mWrappedObject.setGroupVisible(i, z);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("346bea70", new Object[]{this, new Boolean(z)});
        } else {
            this.mWrappedObject.setQwertyMode(z);
        }
    }

    @Override // android.view.Menu
    public int size() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        return this.mWrappedObject.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MenuItem) ipChange.ipc$dispatch("a6507a90", new Object[]{this, new Integer(i)}) : getMenuItemWrapper(this.mWrappedObject.add(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SubMenu) ipChange.ipc$dispatch("5d253f52", new Object[]{this, new Integer(i)}) : getSubMenuWrapper(this.mWrappedObject.addSubMenu(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MenuItem) ipChange.ipc$dispatch("ec4ac8d4", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), charSequence}) : getMenuItemWrapper(this.mWrappedObject.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SubMenu) ipChange.ipc$dispatch("a016a64e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), charSequence}) : getSubMenuWrapper(this.mWrappedObject.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MenuItem) ipChange.ipc$dispatch("c43ad8dd", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)}) : getMenuItemWrapper(this.mWrappedObject.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SubMenu) ipChange.ipc$dispatch("7fbd5c4b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)}) : getSubMenuWrapper(this.mWrappedObject.addSubMenu(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e817af0b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), componentName, intentArr, intent, new Integer(i4), menuItemArr})).intValue();
        }
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.mWrappedObject.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = getMenuItemWrapper(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }
}
