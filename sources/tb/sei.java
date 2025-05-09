package tb;

import android.app.Activity;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sei implements Window.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Window.Callback f27992a;
    public final Activity d;
    public Window e;
    public final Object[] c = new Object[0];
    public final CopyOnWriteArrayList<krc> b = new CopyOnWriteArrayList<>();

    static {
        t2o.a(774897819);
    }

    public sei(Activity activity) {
        if (activity != null) {
            this.d = activity;
            this.f27992a = activity.getWindow().getCallback();
            activity.getWindow().setCallback(this);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.b.clear();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53144225", new Object[]{this});
            return;
        }
        KeyEvent keyEvent = new KeyEvent(4, 0);
        Iterator<krc> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().d(keyEvent);
        }
    }

    public void c(krc krcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a8c0b2a", new Object[]{this, krcVar});
            return;
        }
        CopyOnWriteArrayList<krc> copyOnWriteArrayList = this.b;
        if (copyOnWriteArrayList == null || !copyOnWriteArrayList.contains(krcVar)) {
            this.b.add(0, krcVar);
        }
    }

    public void d(krc krcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55c47fc3", new Object[]{this, krcVar});
            return;
        }
        CopyOnWriteArrayList<krc> copyOnWriteArrayList = this.b;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(krcVar);
        }
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ab5f9e7", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            return this.f27992a.dispatchGenericMotionEvent(motionEvent);
        } catch (Throwable th) {
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, "dispatchGenericMotionEvent error:" + th.toString());
            return false;
        }
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a534d24", new Object[]{this, keyEvent})).booleanValue();
        }
        try {
            if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
                Iterator<krc> it = this.b.iterator();
                while (it.hasNext()) {
                    if (it.next().d(keyEvent)) {
                        return true;
                    }
                }
            }
            return this.f27992a.dispatchKeyEvent(keyEvent);
        } catch (Throwable th) {
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, "dispatchKeyEvent error:" + th.toString());
            return false;
        }
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8813208a", new Object[]{this, keyEvent})).booleanValue();
        }
        try {
            return this.f27992a.dispatchKeyShortcutEvent(keyEvent);
        } catch (Throwable th) {
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, "dispatchKeyShortcutEvent error:" + th.toString());
            return false;
        }
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbbb6bb7", new Object[]{this, accessibilityEvent})).booleanValue();
        }
        try {
            return this.f27992a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        } catch (Throwable th) {
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, "dispatchPopulateAccessibilityEvent error:" + th.toString());
            return false;
        }
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            return this.f27992a.dispatchTouchEvent(motionEvent);
        } catch (Throwable th) {
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, "dispatchTouchEvent error:" + th.toString());
            return false;
        }
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6dcf906a", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            return this.f27992a.dispatchTrackballEvent(motionEvent);
        } catch (Throwable th) {
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, "dispatchTrackballEvent error:" + th.toString());
            return false;
        }
    }

    public void e(Window window) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c507bd3", new Object[]{this, window});
            return;
        }
        synchronized (this.c) {
            if (window != null) {
                try {
                    if (!(this.d == null || this.e != null || window.getCallback() == this)) {
                        this.e = window;
                        this.d.getWindow().setCallback(this.f27992a);
                        this.f27992a = window.getCallback();
                        window.setCallback(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void f() {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c058f6d", new Object[]{this});
            return;
        }
        synchronized (this.c) {
            try {
                if (!(this.e == null || (activity = this.d) == null || activity.getWindow() == null || this.d.getWindow().getCallback() == this)) {
                    this.e.setCallback(this.f27992a);
                    this.e = null;
                    this.f27992a = this.d.getWindow().getCallback();
                    this.d.getWindow().setCallback(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3557b8d", new Object[]{this, actionMode});
        } else {
            this.f27992a.onActionModeFinished(actionMode);
        }
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c12f6f8e", new Object[]{this, actionMode});
        } else {
            this.f27992a.onActionModeStarted(actionMode);
        }
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
        } else {
            this.f27992a.onAttachedToWindow();
        }
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f48f3b41", new Object[]{this});
        } else {
            this.f27992a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d479db08", new Object[]{this, new Integer(i), menu})).booleanValue();
        }
        return this.f27992a.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4ebc9f90", new Object[]{this, new Integer(i)});
        }
        return this.f27992a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
        } else {
            this.f27992a.onDetachedFromWindow();
        }
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad41a8b9", new Object[]{this, new Integer(i), menuItem})).booleanValue();
        }
        return this.f27992a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15d437e7", new Object[]{this, new Integer(i), menu})).booleanValue();
        }
        return this.f27992a.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a08ae12d", new Object[]{this, new Integer(i), menu});
        } else {
            this.f27992a.onPanelClosed(i, menu);
        }
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84c1a5ea", new Object[]{this, new Integer(i), view, menu})).booleanValue();
        }
        return this.f27992a.onPreparePanel(i, view, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5fea47d2", new Object[]{this})).booleanValue() : this.f27992a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7edd78b", new Object[]{this, layoutParams});
        } else {
            this.f27992a.onWindowAttributesChanged(layoutParams);
        }
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
        } else {
            this.f27992a.onWindowFocusChanged(z);
        }
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ActionMode) ipChange.ipc$dispatch("bd823506", new Object[]{this, callback}) : this.f27992a.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(SearchEvent searchEvent) {
        boolean onSearchRequested;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4dfa1059", new Object[]{this, searchEvent})).booleanValue();
        }
        onSearchRequested = this.f27992a.onSearchRequested(searchEvent);
        return onSearchRequested;
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ActionMode onWindowStartingActionMode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActionMode) ipChange.ipc$dispatch("8e25ded9", new Object[]{this, callback, new Integer(i)});
        }
        onWindowStartingActionMode = this.f27992a.onWindowStartingActionMode(callback, i);
        return onWindowStartingActionMode;
    }
}
