package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.internal.view.SupportMenuItem;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ActionMenuItem implements SupportMenuItem {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int CHECKABLE = 1;
    private static final int CHECKED = 2;
    private static final int ENABLED = 16;
    private static final int EXCLUSIVE = 4;
    private static final int HIDDEN = 8;
    private MenuItem.OnMenuItemClickListener mClickListener;
    private CharSequence mContentDescription;
    private Context mContext;
    private final int mGroup;
    private Drawable mIconDrawable;
    private final int mId;
    private Intent mIntent;
    private final int mOrdering;
    private char mShortcutAlphabeticChar;
    private char mShortcutNumericChar;
    private CharSequence mTitle;
    private CharSequence mTitleCondensed;
    private CharSequence mTooltipText;
    private int mShortcutNumericModifiers = 4096;
    private int mShortcutAlphabeticModifiers = 4096;
    private ColorStateList mIconTintList = null;
    private PorterDuff.Mode mIconTintMode = null;
    private boolean mHasIconTint = false;
    private boolean mHasIconTintMode = false;
    private int mFlags = 16;

    public ActionMenuItem(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.mContext = context;
        this.mId = i2;
        this.mGroup = i;
        this.mOrdering = i4;
        this.mTitle = charSequence;
    }

    private void applyIconTint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87831c29", new Object[]{this});
            return;
        }
        Drawable drawable = this.mIconDrawable;
        if (drawable == null) {
            return;
        }
        if (this.mHasIconTint || this.mHasIconTintMode) {
            Drawable wrap = DrawableCompat.wrap(drawable);
            this.mIconDrawable = wrap;
            Drawable mutate = wrap.mutate();
            this.mIconDrawable = mutate;
            if (this.mHasIconTint) {
                DrawableCompat.setTintList(mutate, this.mIconTintList);
            }
            if (this.mHasIconTintMode) {
                DrawableCompat.setTintMode(this.mIconDrawable, this.mIconTintMode);
            }
        }
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean collapseActionView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9677ae13", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean expandActionView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71e14640", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActionProvider) ipChange.ipc$dispatch("b3384524", new Object[]{this});
        }
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public View getActionView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3750083a", new Object[]{this});
        }
        return null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public int getAlphabeticModifiers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("797568f3", new Object[]{this})).intValue();
        }
        return this.mShortcutAlphabeticModifiers;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Character) ipChange.ipc$dispatch("ccf3f01d", new Object[]{this})).charValue();
        }
        return this.mShortcutAlphabeticChar;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public CharSequence getContentDescription() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("3a52ebfa", new Object[]{this});
        }
        return this.mContentDescription;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f5069a3e", new Object[]{this})).intValue();
        }
        return this.mGroup;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("b3e39c04", new Object[]{this});
        }
        return this.mIconDrawable;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public ColorStateList getIconTintList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorStateList) ipChange.ipc$dispatch("5b480c65", new Object[]{this});
        }
        return this.mIconTintList;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PorterDuff.Mode) ipChange.ipc$dispatch("5686628d", new Object[]{this});
        }
        return this.mIconTintMode;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("cdc34bda", new Object[]{this});
        }
        return this.mIntent;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5368d0fe", new Object[]{this})).intValue();
        }
        return this.mId;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContextMenu.ContextMenuInfo) ipChange.ipc$dispatch("2214391f", new Object[]{this});
        }
        return null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public int getNumericModifiers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("255b2d5f", new Object[]{this})).intValue();
        }
        return this.mShortcutNumericModifiers;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Character) ipChange.ipc$dispatch("c4dee31", new Object[]{this})).charValue();
        }
        return this.mShortcutNumericChar;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8042612", new Object[]{this})).intValue();
        }
        return this.mOrdering;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SubMenu) ipChange.ipc$dispatch("b8d8e540", new Object[]{this});
        }
        return null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public androidx.core.view.ActionProvider getSupportActionProvider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (androidx.core.view.ActionProvider) ipChange.ipc$dispatch("5b255091", new Object[]{this});
        }
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("1db95d71", new Object[]{this});
        }
        return this.mTitle;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("68e2158e", new Object[]{this});
        }
        CharSequence charSequence = this.mTitleCondensed;
        if (charSequence != null) {
            return charSequence;
        }
        return this.mTitle;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public CharSequence getTooltipText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("60961479", new Object[]{this});
        }
        return this.mTooltipText;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("244105d0", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7560cd03", new Object[]{this})).booleanValue();
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.mClickListener;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        Intent intent = this.mIntent;
        if (intent == null) {
            return false;
        }
        this.mContext.startActivity(intent);
        return true;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean isActionViewExpanded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74a9a029", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67b690e3", new Object[]{this})).booleanValue();
        }
        if ((this.mFlags & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56f023c2", new Object[]{this})).booleanValue();
        }
        if ((this.mFlags & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3aa8873", new Object[]{this})).booleanValue();
        }
        if ((this.mFlags & 8) == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public boolean requiresActionButton() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10daa561", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public boolean requiresOverflow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97cbd25b", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("662b0755", new Object[]{this, actionProvider});
        }
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("69859e76", new Object[]{this, new Character(c)});
        }
        this.mShortcutAlphabeticChar = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("178370c2", new Object[]{this, new Boolean(z)});
        }
        this.mFlags = (z ? 1 : 0) | (this.mFlags & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("11748103", new Object[]{this, new Boolean(z)});
        }
        int i2 = this.mFlags & (-17);
        if (z) {
            i = 16;
        }
        this.mFlags = i2 | i;
        return this;
    }

    public ActionMenuItem setExclusiveCheckable(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActionMenuItem) ipChange.ipc$dispatch("16ace8d8", new Object[]{this, new Boolean(z)});
        }
        int i2 = this.mFlags & (-5);
        if (z) {
            i = 4;
        }
        this.mFlags = i2 | i;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("24fec21b", new Object[]{this, drawable});
        }
        this.mIconDrawable = drawable;
        applyIconTint();
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("c4b1e38e", new Object[]{this, colorStateList});
        }
        this.mIconTintList = colorStateList;
        this.mHasIconTint = true;
        applyIconTint();
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("4861c5e0", new Object[]{this, mode});
        }
        this.mIconTintMode = mode;
        this.mHasIconTintMode = true;
        applyIconTint();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("1bb1c3d7", new Object[]{this, intent});
        }
        this.mIntent = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("bbf6917a", new Object[]{this, new Character(c)});
        }
        this.mShortcutNumericChar = c;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("3458e405", new Object[]{this, onActionExpandListener});
        }
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("54489043", new Object[]{this, onMenuItemClickListener});
        }
        this.mClickListener = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("a5f23364", new Object[]{this, new Character(c), new Character(c2)});
        }
        this.mShortcutNumericChar = c;
        this.mShortcutAlphabeticChar = Character.toLowerCase(c2);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public void setShowAsAction(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5a34715", new Object[]{this, new Integer(i)});
        }
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public SupportMenuItem setSupportActionProvider(androidx.core.view.ActionProvider actionProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SupportMenuItem) ipChange.ipc$dispatch("c28c5f91", new Object[]{this, actionProvider});
        }
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("d3ab70f6", new Object[]{this, charSequence});
        }
        this.mTitle = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("d8559fd1", new Object[]{this, charSequence});
        }
        this.mTitleCondensed = charSequence;
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("50ff7b57", new Object[]{this, new Character(c), new Integer(i)});
        }
        this.mShortcutAlphabeticChar = Character.toLowerCase(c);
        this.mShortcutAlphabeticModifiers = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public SupportMenuItem setContentDescription(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SupportMenuItem) ipChange.ipc$dispatch("f9d0782", new Object[]{this, charSequence});
        }
        this.mContentDescription = charSequence;
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("4cace8d3", new Object[]{this, new Character(c), new Integer(i)});
        }
        this.mShortcutNumericChar = c;
        this.mShortcutNumericModifiers = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public SupportMenuItem setShowAsActionFlags(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SupportMenuItem) ipChange.ipc$dispatch("e9f9b24e", new Object[]{this, new Integer(i)});
        }
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("88682efb", new Object[]{this, new Integer(i)});
        }
        this.mTitle = this.mContext.getResources().getString(i);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public SupportMenuItem setTooltipText(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SupportMenuItem) ipChange.ipc$dispatch("ea30eacb", new Object[]{this, charSequence});
        }
        this.mTooltipText = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("dc5d6532", new Object[]{this, new Boolean(z)});
        }
        int i2 = this.mFlags & 8;
        if (!z) {
            i = 8;
        }
        this.mFlags = i2 | i;
        return this;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f77ac528", new Object[]{this})).booleanValue();
        }
        return (this.mFlags & 2) != 0;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public SupportMenuItem setActionView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SupportMenuItem) ipChange.ipc$dispatch("35593e60", new Object[]{this, view});
        }
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("d923acdd", new Object[]{this, new Boolean(z)});
        }
        int i2 = this.mFlags & (-3);
        if (z) {
            i = 2;
        }
        this.mFlags = i2 | i;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("9de33ef6", new Object[]{this, new Integer(i)});
        }
        this.mIconDrawable = ContextCompat.getDrawable(this.mContext, i);
        applyIconTint();
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("2c5c4c04", new Object[]{this, new Character(c), new Character(c2), new Integer(i), new Integer(i2)});
        }
        this.mShortcutNumericChar = c;
        this.mShortcutNumericModifiers = KeyEvent.normalizeMetaState(i);
        this.mShortcutAlphabeticChar = Character.toLowerCase(c2);
        this.mShortcutAlphabeticModifiers = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public SupportMenuItem setActionView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SupportMenuItem) ipChange.ipc$dispatch("efedda11", new Object[]{this, new Integer(i)});
        }
        throw new UnsupportedOperationException();
    }
}
