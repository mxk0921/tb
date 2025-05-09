package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.ActionBarContextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class StandaloneActionMode extends ActionMode implements MenuBuilder.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ActionMode.Callback mCallback;
    private Context mContext;
    private ActionBarContextView mContextView;
    private WeakReference<View> mCustomView;
    private boolean mFinished;
    private boolean mFocusable;
    private MenuBuilder mMenu;

    public StandaloneActionMode(Context context, ActionBarContextView actionBarContextView, ActionMode.Callback callback, boolean z) {
        this.mContext = context;
        this.mContextView = actionBarContextView;
        this.mCallback = callback;
        MenuBuilder defaultShowAsAction = new MenuBuilder(actionBarContextView.getContext()).setDefaultShowAsAction(1);
        this.mMenu = defaultShowAsAction;
        defaultShowAsAction.setCallback(this);
        this.mFocusable = z;
    }

    public static /* synthetic */ Object ipc$super(StandaloneActionMode standaloneActionMode, String str, Object... objArr) {
        if (str.hashCode() == -156587760) {
            super.setTitleOptionalHint(((Boolean) objArr[0]).booleanValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/appcompat/view/StandaloneActionMode");
    }

    @Override // androidx.appcompat.view.ActionMode
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
        } else if (!this.mFinished) {
            this.mFinished = true;
            this.mCallback.onDestroyActionMode(this);
        }
    }

    @Override // androidx.appcompat.view.ActionMode
    public View getCustomView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4c7fb1b5", new Object[]{this});
        }
        WeakReference<View> weakReference = this.mCustomView;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.ActionMode
    public Menu getMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Menu) ipChange.ipc$dispatch("7d2f65a4", new Object[]{this});
        }
        return this.mMenu;
    }

    @Override // androidx.appcompat.view.ActionMode
    public MenuInflater getMenuInflater() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuInflater) ipChange.ipc$dispatch("fc0e7c4", new Object[]{this});
        }
        return new SupportMenuInflater(this.mContextView.getContext());
    }

    @Override // androidx.appcompat.view.ActionMode
    public CharSequence getSubtitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("a9bc6905", new Object[]{this});
        }
        return this.mContextView.getSubtitle();
    }

    @Override // androidx.appcompat.view.ActionMode
    public CharSequence getTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("1db95d71", new Object[]{this});
        }
        return this.mContextView.getTitle();
    }

    @Override // androidx.appcompat.view.ActionMode
    public void invalidate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60a4a042", new Object[]{this});
        } else {
            this.mCallback.onPrepareActionMode(this, this.mMenu);
        }
    }

    @Override // androidx.appcompat.view.ActionMode
    public boolean isTitleOptional() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3600be59", new Object[]{this})).booleanValue();
        }
        return this.mContextView.isTitleOptional();
    }

    @Override // androidx.appcompat.view.ActionMode
    public boolean isUiFocusable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a103bcff", new Object[]{this})).booleanValue();
        }
        return this.mFocusable;
    }

    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5ca4aca", new Object[]{this, menuBuilder, new Boolean(z)});
        }
    }

    public void onCloseSubMenu(SubMenuBuilder subMenuBuilder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47f1a860", new Object[]{this, subMenuBuilder});
        }
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5a05a4b", new Object[]{this, menuBuilder, menuItem})).booleanValue();
        }
        return this.mCallback.onActionItemClicked(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public void onMenuModeChange(MenuBuilder menuBuilder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f6216e3", new Object[]{this, menuBuilder});
            return;
        }
        invalidate();
        this.mContextView.showOverflowMenu();
    }

    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50b25b8f", new Object[]{this, subMenuBuilder})).booleanValue();
        }
        if (!subMenuBuilder.hasVisibleItems()) {
            return true;
        }
        new MenuPopupHelper(this.mContextView.getContext(), subMenuBuilder).show();
        return true;
    }

    @Override // androidx.appcompat.view.ActionMode
    public void setCustomView(View view) {
        WeakReference<View> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38d77233", new Object[]{this, view});
            return;
        }
        this.mContextView.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference<>(view);
        } else {
            weakReference = null;
        }
        this.mCustomView = weakReference;
    }

    @Override // androidx.appcompat.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d7863c5", new Object[]{this, charSequence});
        } else {
            this.mContextView.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70050a41", new Object[]{this, charSequence});
        } else {
            this.mContextView.setTitle(charSequence);
        }
    }

    @Override // androidx.appcompat.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6aaa910", new Object[]{this, new Boolean(z)});
            return;
        }
        super.setTitleOptionalHint(z);
        this.mContextView.setTitleOptional(z);
    }

    @Override // androidx.appcompat.view.ActionMode
    public void setSubtitle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c462502", new Object[]{this, new Integer(i)});
        } else {
            setSubtitle(this.mContext.getString(i));
        }
    }

    @Override // androidx.appcompat.view.ActionMode
    public void setTitle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afdc1a06", new Object[]{this, new Integer(i)});
        } else {
            setTitle(this.mContext.getString(i));
        }
    }
}
