package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.view.menu.MenuWrapperICS;
import androidx.collection.SimpleArrayMap;
import androidx.core.internal.view.SupportMenu;
import androidx.core.internal.view.SupportMenuItem;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SupportActionModeWrapper extends ActionMode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Context mContext;
    public final ActionMode mWrappedObject;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class CallbackWrapper implements ActionMode.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final Context mContext;
        public final ActionMode.Callback mWrappedCallback;
        public final ArrayList<SupportActionModeWrapper> mActionModes = new ArrayList<>();
        public final SimpleArrayMap<Menu, Menu> mMenus = new SimpleArrayMap<>();

        public CallbackWrapper(Context context, ActionMode.Callback callback) {
            this.mContext = context;
            this.mWrappedCallback = callback;
        }

        private Menu getMenuWrapper(Menu menu) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Menu) ipChange.ipc$dispatch("ab006f3b", new Object[]{this, menu});
            }
            Menu menu2 = this.mMenus.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            MenuWrapperICS menuWrapperICS = new MenuWrapperICS(this.mContext, (SupportMenu) menu);
            this.mMenus.put(menu, menuWrapperICS);
            return menuWrapperICS;
        }

        public android.view.ActionMode getActionModeWrapper(ActionMode actionMode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (android.view.ActionMode) ipChange.ipc$dispatch("6c965cb7", new Object[]{this, actionMode});
            }
            int size = this.mActionModes.size();
            for (int i = 0; i < size; i++) {
                SupportActionModeWrapper supportActionModeWrapper = this.mActionModes.get(i);
                if (supportActionModeWrapper != null && supportActionModeWrapper.mWrappedObject == actionMode) {
                    return supportActionModeWrapper;
                }
            }
            SupportActionModeWrapper supportActionModeWrapper2 = new SupportActionModeWrapper(this.mContext, actionMode);
            this.mActionModes.add(supportActionModeWrapper2);
            return supportActionModeWrapper2;
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9256e145", new Object[]{this, actionMode, menuItem})).booleanValue();
            }
            return this.mWrappedCallback.onActionItemClicked(getActionModeWrapper(actionMode), new MenuItemWrapperICS(this.mContext, (SupportMenuItem) menuItem));
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cc104483", new Object[]{this, actionMode, menu})).booleanValue();
            }
            return this.mWrappedCallback.onCreateActionMode(getActionModeWrapper(actionMode), getMenuWrapper(menu));
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9265a419", new Object[]{this, actionMode});
            } else {
                this.mWrappedCallback.onDestroyActionMode(getActionModeWrapper(actionMode));
            }
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d0859236", new Object[]{this, actionMode, menu})).booleanValue();
            }
            return this.mWrappedCallback.onPrepareActionMode(getActionModeWrapper(actionMode), getMenuWrapper(menu));
        }
    }

    public SupportActionModeWrapper(Context context, ActionMode actionMode) {
        this.mContext = context;
        this.mWrappedObject = actionMode;
    }

    public static /* synthetic */ Object ipc$super(SupportActionModeWrapper supportActionModeWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/appcompat/view/SupportActionModeWrapper");
    }

    @Override // android.view.ActionMode
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
        } else {
            this.mWrappedObject.finish();
        }
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4c7fb1b5", new Object[]{this});
        }
        return this.mWrappedObject.getCustomView();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Menu) ipChange.ipc$dispatch("7d2f65a4", new Object[]{this});
        }
        return new MenuWrapperICS(this.mContext, (SupportMenu) this.mWrappedObject.getMenu());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuInflater) ipChange.ipc$dispatch("fc0e7c4", new Object[]{this});
        }
        return this.mWrappedObject.getMenuInflater();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("a9bc6905", new Object[]{this});
        }
        return this.mWrappedObject.getSubtitle();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("61e2c7a7", new Object[]{this});
        }
        return this.mWrappedObject.getTag();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("1db95d71", new Object[]{this});
        }
        return this.mWrappedObject.getTitle();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e54d9fd4", new Object[]{this})).booleanValue();
        }
        return this.mWrappedObject.getTitleOptionalHint();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60a4a042", new Object[]{this});
        } else {
            this.mWrappedObject.invalidate();
        }
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3600be59", new Object[]{this})).booleanValue();
        }
        return this.mWrappedObject.isTitleOptional();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38d77233", new Object[]{this, view});
        } else {
            this.mWrappedObject.setCustomView(view);
        }
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d7863c5", new Object[]{this, charSequence});
        } else {
            this.mWrappedObject.setSubtitle(charSequence);
        }
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e11aa67b", new Object[]{this, obj});
        } else {
            this.mWrappedObject.setTag(obj);
        }
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70050a41", new Object[]{this, charSequence});
        } else {
            this.mWrappedObject.setTitle(charSequence);
        }
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6aaa910", new Object[]{this, new Boolean(z)});
        } else {
            this.mWrappedObject.setTitleOptionalHint(z);
        }
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c462502", new Object[]{this, new Integer(i)});
        } else {
            this.mWrappedObject.setSubtitle(i);
        }
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afdc1a06", new Object[]{this, new Integer(i)});
        } else {
            this.mWrappedObject.setTitle(i);
        }
    }
}
