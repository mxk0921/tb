package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.MenuItem;
import android.view.View;
import androidx.core.internal.view.SupportMenuItem;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MenuItemCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    @Deprecated
    public static final int SHOW_AS_ACTION_ALWAYS = 2;
    @Deprecated
    public static final int SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW = 8;
    @Deprecated
    public static final int SHOW_AS_ACTION_IF_ROOM = 1;
    @Deprecated
    public static final int SHOW_AS_ACTION_NEVER = 0;
    @Deprecated
    public static final int SHOW_AS_ACTION_WITH_TEXT = 4;
    private static final String TAG = "MenuItemCompat";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api26Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api26Impl() {
        }

        public static int getAlphabeticModifiers(MenuItem menuItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1cc47ab8", new Object[]{menuItem})).intValue();
            }
            return menuItem.getAlphabeticModifiers();
        }

        public static CharSequence getContentDescription(MenuItem menuItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("38662a15", new Object[]{menuItem});
            }
            return menuItem.getContentDescription();
        }

        public static ColorStateList getIconTintList(MenuItem menuItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ColorStateList) ipChange.ipc$dispatch("e5ac9dbe", new Object[]{menuItem});
            }
            return menuItem.getIconTintList();
        }

        public static PorterDuff.Mode getIconTintMode(MenuItem menuItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PorterDuff.Mode) ipChange.ipc$dispatch("26247b90", new Object[]{menuItem});
            }
            return menuItem.getIconTintMode();
        }

        public static int getNumericModifiers(MenuItem menuItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("614a7ccc", new Object[]{menuItem})).intValue();
            }
            return menuItem.getNumericModifiers();
        }

        public static CharSequence getTooltipText(MenuItem menuItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("f9dbe2b6", new Object[]{menuItem});
            }
            return menuItem.getTooltipText();
        }

        public static MenuItem setAlphabeticShortcut(MenuItem menuItem, char c, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MenuItem) ipChange.ipc$dispatch("f5990c24", new Object[]{menuItem, new Character(c), new Integer(i)});
            }
            return menuItem.setAlphabeticShortcut(c, i);
        }

        public static MenuItem setContentDescription(MenuItem menuItem, CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MenuItem) ipChange.ipc$dispatch("483e01d2", new Object[]{menuItem, charSequence});
            }
            return menuItem.setContentDescription(charSequence);
        }

        public static MenuItem setIconTintList(MenuItem menuItem, ColorStateList colorStateList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MenuItem) ipChange.ipc$dispatch("e52ff47d", new Object[]{menuItem, colorStateList});
            }
            return menuItem.setIconTintList(colorStateList);
        }

        public static MenuItem setIconTintMode(MenuItem menuItem, PorterDuff.Mode mode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MenuItem) ipChange.ipc$dispatch("cc09c9e5", new Object[]{menuItem, mode});
            }
            return menuItem.setIconTintMode(mode);
        }

        public static MenuItem setNumericShortcut(MenuItem menuItem, char c, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MenuItem) ipChange.ipc$dispatch("e1e23328", new Object[]{menuItem, new Character(c), new Integer(i)});
            }
            return menuItem.setNumericShortcut(c, i);
        }

        public static MenuItem setShortcut(MenuItem menuItem, char c, char c2, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MenuItem) ipChange.ipc$dispatch("8ad8f58b", new Object[]{menuItem, new Character(c), new Character(c2), new Integer(i), new Integer(i2)});
            }
            return menuItem.setShortcut(c, c2, i, i2);
        }

        public static MenuItem setTooltipText(MenuItem menuItem, CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MenuItem) ipChange.ipc$dispatch("c02687a9", new Object[]{menuItem, charSequence});
            }
            return menuItem.setTooltipText(charSequence);
        }
    }

    /* compiled from: Taobao */
    @Deprecated
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface OnActionExpandListener {
        boolean onMenuItemActionCollapse(MenuItem menuItem);

        boolean onMenuItemActionExpand(MenuItem menuItem);
    }

    private MenuItemCompat() {
    }

    @Deprecated
    public static boolean collapseActionView(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad1bf4da", new Object[]{menuItem})).booleanValue();
        }
        return menuItem.collapseActionView();
    }

    @Deprecated
    public static boolean expandActionView(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44ad7a0d", new Object[]{menuItem})).booleanValue();
        }
        return menuItem.expandActionView();
    }

    public static ActionProvider getActionProvider(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActionProvider) ipChange.ipc$dispatch("29fb1d4b", new Object[]{menuItem});
        }
        if (menuItem instanceof SupportMenuItem) {
            return ((SupportMenuItem) menuItem).getSupportActionProvider();
        }
        return null;
    }

    @Deprecated
    public static View getActionView(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c6852dcf", new Object[]{menuItem});
        }
        return menuItem.getActionView();
    }

    public static int getAlphabeticModifiers(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1cc47ab8", new Object[]{menuItem})).intValue();
        }
        if (menuItem instanceof SupportMenuItem) {
            return ((SupportMenuItem) menuItem).getAlphabeticModifiers();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getAlphabeticModifiers(menuItem);
        }
        return 0;
    }

    public static CharSequence getContentDescription(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("38662a15", new Object[]{menuItem});
        }
        if (menuItem instanceof SupportMenuItem) {
            return ((SupportMenuItem) menuItem).getContentDescription();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getContentDescription(menuItem);
        }
        return null;
    }

    public static ColorStateList getIconTintList(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorStateList) ipChange.ipc$dispatch("e5ac9dbe", new Object[]{menuItem});
        }
        if (menuItem instanceof SupportMenuItem) {
            return ((SupportMenuItem) menuItem).getIconTintList();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getIconTintList(menuItem);
        }
        return null;
    }

    public static PorterDuff.Mode getIconTintMode(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PorterDuff.Mode) ipChange.ipc$dispatch("26247b90", new Object[]{menuItem});
        }
        if (menuItem instanceof SupportMenuItem) {
            return ((SupportMenuItem) menuItem).getIconTintMode();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getIconTintMode(menuItem);
        }
        return null;
    }

    public static int getNumericModifiers(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("614a7ccc", new Object[]{menuItem})).intValue();
        }
        if (menuItem instanceof SupportMenuItem) {
            return ((SupportMenuItem) menuItem).getNumericModifiers();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getNumericModifiers(menuItem);
        }
        return 0;
    }

    public static CharSequence getTooltipText(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("f9dbe2b6", new Object[]{menuItem});
        }
        if (menuItem instanceof SupportMenuItem) {
            return ((SupportMenuItem) menuItem).getTooltipText();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getTooltipText(menuItem);
        }
        return null;
    }

    @Deprecated
    public static boolean isActionViewExpanded(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88fc0a04", new Object[]{menuItem})).booleanValue();
        }
        return menuItem.isActionViewExpanded();
    }

    public static MenuItem setActionProvider(MenuItem menuItem, ActionProvider actionProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("9d8a13a", new Object[]{menuItem, actionProvider});
        }
        if (menuItem instanceof SupportMenuItem) {
            return ((SupportMenuItem) menuItem).setSupportActionProvider(actionProvider);
        }
        return menuItem;
    }

    @Deprecated
    public static MenuItem setActionView(MenuItem menuItem, View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MenuItem) ipChange.ipc$dispatch("bed3f0a6", new Object[]{menuItem, view}) : menuItem.setActionView(view);
    }

    public static void setAlphabeticShortcut(MenuItem menuItem, char c, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b673bef", new Object[]{menuItem, new Character(c), new Integer(i)});
        } else if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setAlphabeticShortcut(menuItem, c, i);
        }
    }

    public static void setContentDescription(MenuItem menuItem, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("537ba81d", new Object[]{menuItem, charSequence});
        } else if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setContentDescription(menuItem, charSequence);
        }
    }

    public static void setIconTintList(MenuItem menuItem, ColorStateList colorStateList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1df0ed08", new Object[]{menuItem, colorStateList});
        } else if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setIconTintList(menuItem, colorStateList);
        }
    }

    public static void setIconTintMode(MenuItem menuItem, PorterDuff.Mode mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b94c070", new Object[]{menuItem, mode});
        } else if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setIconTintMode(menuItem, mode);
        }
    }

    public static void setNumericShortcut(MenuItem menuItem, char c, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5677df3", new Object[]{menuItem, new Character(c), new Integer(i)});
        } else if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setNumericShortcut(menuItem, c, i);
        }
    }

    @Deprecated
    public static MenuItem setOnActionExpandListener(MenuItem menuItem, final OnActionExpandListener onActionExpandListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("80027d6a", new Object[]{menuItem, onActionExpandListener});
        }
        return menuItem.setOnActionExpandListener(new MenuItem.OnActionExpandListener() { // from class: androidx.core.view.MenuItemCompat.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.MenuItem.OnActionExpandListener
            public boolean onMenuItemActionCollapse(MenuItem menuItem2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("da0dc46e", new Object[]{this, menuItem2})).booleanValue();
                }
                return OnActionExpandListener.this.onMenuItemActionCollapse(menuItem2);
            }

            @Override // android.view.MenuItem.OnActionExpandListener
            public boolean onMenuItemActionExpand(MenuItem menuItem2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("4110ffa1", new Object[]{this, menuItem2})).booleanValue();
                }
                return OnActionExpandListener.this.onMenuItemActionExpand(menuItem2);
            }
        });
    }

    public static void setShortcut(MenuItem menuItem, char c, char c2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24a02c96", new Object[]{menuItem, new Character(c), new Character(c2), new Integer(i), new Integer(i2)});
        } else if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setShortcut(c, c2, i, i2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setShortcut(menuItem, c, c2, i, i2);
        }
    }

    @Deprecated
    public static void setShowAsAction(MenuItem menuItem, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b9f8c", new Object[]{menuItem, new Integer(i)});
        } else {
            menuItem.setShowAsAction(i);
        }
    }

    public static void setTooltipText(MenuItem menuItem, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a362934", new Object[]{menuItem, charSequence});
        } else if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setTooltipText(menuItem, charSequence);
        }
    }

    @Deprecated
    public static MenuItem setActionView(MenuItem menuItem, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MenuItem) ipChange.ipc$dispatch("186309d7", new Object[]{menuItem, new Integer(i)}) : menuItem.setActionView(i);
    }
}
