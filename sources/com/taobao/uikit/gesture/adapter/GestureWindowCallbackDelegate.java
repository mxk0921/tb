package com.taobao.uikit.gesture.adapter;

import android.os.Build;
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
import com.taobao.uikit.gesture.controller.GestureManager;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class GestureWindowCallbackDelegate implements Window.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final GestureManager mGestureManager;
    private final Window.Callback mOriginCallback;

    static {
        t2o.a(933232647);
    }

    public GestureWindowCallbackDelegate(Window.Callback callback, GestureManager gestureManager) {
        this.mOriginCallback = callback;
        this.mGestureManager = gestureManager;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ab5f9e7", new Object[]{this, motionEvent})).booleanValue();
        }
        Window.Callback callback = this.mOriginCallback;
        if (callback == null || !callback.dispatchGenericMotionEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a534d24", new Object[]{this, keyEvent})).booleanValue();
        }
        Window.Callback callback = this.mOriginCallback;
        if (callback == null || !callback.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8813208a", new Object[]{this, keyEvent})).booleanValue();
        }
        Window.Callback callback = this.mOriginCallback;
        if (callback == null || !callback.dispatchKeyShortcutEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbbb6bb7", new Object[]{this, accessibilityEvent})).booleanValue();
        }
        Window.Callback callback = this.mOriginCallback;
        if (callback == null || !callback.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        MotionEvent onTouchEvent = this.mGestureManager.onTouchEvent(motionEvent);
        if (onTouchEvent != null) {
            motionEvent = onTouchEvent;
        }
        return dispatchTouchEventWithoutManager(motionEvent);
    }

    public boolean dispatchTouchEventWithoutManager(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae37de3a", new Object[]{this, motionEvent})).booleanValue();
        }
        Window.Callback callback = this.mOriginCallback;
        if (callback == null || !callback.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6dcf906a", new Object[]{this, motionEvent})).booleanValue();
        }
        Window.Callback callback = this.mOriginCallback;
        if (callback == null || !callback.dispatchTrackballEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3557b8d", new Object[]{this, actionMode});
            return;
        }
        Window.Callback callback = this.mOriginCallback;
        if (callback != null) {
            callback.onActionModeFinished(actionMode);
        }
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c12f6f8e", new Object[]{this, actionMode});
            return;
        }
        Window.Callback callback = this.mOriginCallback;
        if (callback != null) {
            callback.onActionModeStarted(actionMode);
        }
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        Window.Callback callback = this.mOriginCallback;
        if (callback != null) {
            callback.onAttachedToWindow();
        }
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f48f3b41", new Object[]{this});
            return;
        }
        Window.Callback callback = this.mOriginCallback;
        if (callback != null) {
            callback.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d479db08", new Object[]{this, new Integer(i), menu})).booleanValue();
        }
        Window.Callback callback = this.mOriginCallback;
        if (callback == null || !callback.onCreatePanelMenu(i, menu)) {
            return false;
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4ebc9f90", new Object[]{this, new Integer(i)});
        }
        Window.Callback callback = this.mOriginCallback;
        if (callback == null) {
            return null;
        }
        return callback.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        Window.Callback callback = this.mOriginCallback;
        if (callback != null) {
            callback.onDetachedFromWindow();
        }
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad41a8b9", new Object[]{this, new Integer(i), menuItem})).booleanValue();
        }
        Window.Callback callback = this.mOriginCallback;
        if (callback == null || !callback.onMenuItemSelected(i, menuItem)) {
            return false;
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15d437e7", new Object[]{this, new Integer(i), menu})).booleanValue();
        }
        Window.Callback callback = this.mOriginCallback;
        if (callback == null || !callback.onMenuOpened(i, menu)) {
            return false;
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a08ae12d", new Object[]{this, new Integer(i), menu});
            return;
        }
        Window.Callback callback = this.mOriginCallback;
        if (callback != null) {
            callback.onPanelClosed(i, menu);
        }
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84c1a5ea", new Object[]{this, new Integer(i), view, menu})).booleanValue();
        }
        Window.Callback callback = this.mOriginCallback;
        if (callback == null || !callback.onPreparePanel(i, view, menu)) {
            return false;
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5fea47d2", new Object[]{this})).booleanValue();
        }
        Window.Callback callback = this.mOriginCallback;
        return callback != null && callback.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7edd78b", new Object[]{this, layoutParams});
            return;
        }
        Window.Callback callback = this.mOriginCallback;
        if (callback != null) {
            callback.onWindowAttributesChanged(layoutParams);
        }
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        Window.Callback callback = this.mOriginCallback;
        if (callback != null) {
            callback.onWindowFocusChanged(z);
        }
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActionMode) ipChange.ipc$dispatch("bd823506", new Object[]{this, callback});
        }
        Window.Callback callback2 = this.mOriginCallback;
        if (callback2 == null) {
            return null;
        }
        return callback2.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(SearchEvent searchEvent) {
        Window.Callback callback;
        boolean onSearchRequested;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4dfa1059", new Object[]{this, searchEvent})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 23 && (callback = this.mOriginCallback) != null) {
            onSearchRequested = callback.onSearchRequested(searchEvent);
            if (onSearchRequested) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        Window.Callback callback2;
        ActionMode onWindowStartingActionMode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActionMode) ipChange.ipc$dispatch("8e25ded9", new Object[]{this, callback, new Integer(i)});
        }
        if (Build.VERSION.SDK_INT < 23 || (callback2 = this.mOriginCallback) == null) {
            return null;
        }
        onWindowStartingActionMode = callback2.onWindowStartingActionMode(callback, i);
        return onWindowStartingActionMode;
    }
}
