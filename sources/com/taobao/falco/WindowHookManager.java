package com.taobao.falco;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.falco.y;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class WindowHookManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile WindowHookManager e;

    /* renamed from: a  reason: collision with root package name */
    public final Set<a> f10456a = new CopyOnWriteArraySet();
    public final Map<Integer, Boolean> b = new ConcurrentHashMap();
    public final Set<Integer> c = new HashSet();
    public volatile boolean d = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class DecorViewArrayList extends ArrayList<View> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final Class<?> mDecorViewClazz;

        public DecorViewArrayList(List<View> list) {
            super(list);
            Class<?> cls;
            try {
                cls = Class.forName("com.android.internal.policy.DecorView", true, Context.class.getClassLoader());
            } catch (Exception e) {
                ALog.e("falco.WindowHookManager", "[DecorViewArrayList]", null, e, new Object[0]);
                cls = null;
            }
            this.mDecorViewClazz = cls;
            for (View view : list) {
                hookDecorView(view);
            }
        }

        private void hookDecorView(View view) {
            try {
                Class<?> cls = this.mDecorViewClazz;
                if (cls != null && cls.isInstance(view)) {
                    Field declaredField = this.mDecorViewClazz.getDeclaredField("mWindow");
                    declaredField.setAccessible(true);
                    Window window = (Window) declaredField.get(view);
                    if (window == null || !WindowHookManager.a(WindowHookManager.this, window, null)) {
                        ALog.e("falco.WindowHookManager", "[hookDecorView] Window failed", null, new Object[0]);
                    } else {
                        WindowHookManager.b(WindowHookManager.this).put(Integer.valueOf(window.hashCode()), Boolean.TRUE);
                    }
                    if (!hookInputMethodManager(view)) {
                        ALog.e("falco.WindowHookManager", "[hookDecorView] InputMethodManager failed", null, new Object[0]);
                    }
                }
            } catch (Exception e) {
                ALog.e("falco.WindowHookManager", "[hookDecorView]", null, e, new Object[0]);
            }
        }

        private boolean hookInputMethodManager(View view) {
            InputMethodManager inputMethodManager;
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8803f8ea", new Object[]{this, view})).booleanValue();
            }
            Context context = view.getContext();
            if (context == null || (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) == null) {
                return false;
            }
            if (WindowHookManager.c(WindowHookManager.this).contains(Integer.valueOf(inputMethodManager.hashCode()))) {
                return true;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                z = hookInputMethodManagerCommon(inputMethodManager);
            } else {
                z = hookInputMethodManagerLess13(inputMethodManager);
            }
            if (z) {
                WindowHookManager.c(WindowHookManager.this).add(Integer.valueOf(inputMethodManager.hashCode()));
            }
            return z;
        }

        private boolean hookInputMethodManagerCommon(InputMethodManager inputMethodManager) {
            try {
                Field declaredField = InputMethodManager.class.getDeclaredField("mH");
                declaredField.setAccessible(true);
                Handler handler = (Handler) declaredField.get(inputMethodManager);
                Field declaredField2 = Handler.class.getDeclaredField("mCallback");
                declaredField2.setAccessible(true);
                declaredField2.set(handler, new InnerKeyEventListener(inputMethodManager, (Handler.Callback) declaredField2.get(handler), 31));
                return true;
            } catch (Exception e) {
                ALog.e("falco.WindowHookManager", "[hookInputMethodManagerCommon]", null, e, new Object[0]);
                return false;
            }
        }

        private boolean hookInputMethodManagerLess13(InputMethodManager inputMethodManager) {
            try {
                Field declaredField = InputMethodManager.class.getDeclaredField("mIInputContext");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(inputMethodManager);
                Field declaredField2 = Class.forName("com.android.internal.view.IInputConnectionWrapper", true, Context.class.getClassLoader()).getDeclaredField("mH");
                declaredField2.setAccessible(true);
                Handler handler = (Handler) declaredField2.get(obj);
                Field declaredField3 = Handler.class.getDeclaredField("mCallback");
                declaredField3.setAccessible(true);
                declaredField3.set(handler, new InnerKeyEventListener(inputMethodManager, (Handler.Callback) declaredField3.get(handler), 65));
                return true;
            } catch (Exception e) {
                ALog.e("falco.WindowHookManager", "[hookInputMethodManagerLess13]", null, e, new Object[0]);
                return false;
            }
        }

        public static /* synthetic */ Object ipc$super(DecorViewArrayList decorViewArrayList, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -475350822) {
                return super.remove(((Number) objArr[0]).intValue());
            }
            if (hashCode == -332530133) {
                return new Boolean(super.remove(objArr[0]));
            }
            if (hashCode == 195222152) {
                return new Boolean(super.add((DecorViewArrayList) objArr[0]));
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/falco/WindowHookManager$DecorViewArrayList");
        }

        private void removeDecorViewWindow(Object obj) {
            Boolean bool;
            try {
                Class<?> cls = this.mDecorViewClazz;
                if (cls != null && cls.isInstance(obj)) {
                    Field declaredField = this.mDecorViewClazz.getDeclaredField("mWindow");
                    declaredField.setAccessible(true);
                    Window window = (Window) declaredField.get(obj);
                    if (window != null && (bool = (Boolean) WindowHookManager.b(WindowHookManager.this).get(Integer.valueOf(window.hashCode()))) != null && bool.booleanValue()) {
                        WindowHookManager.b(WindowHookManager.this).remove(Integer.valueOf(window.hashCode()));
                    }
                }
            } catch (Exception e) {
                ALog.e("falco.WindowHookManager", "[removeDecorViewWindow]", null, e, new Object[0]);
            }
        }

        public boolean add(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("df3d232e", new Object[]{this, view})).booleanValue();
            }
            hookDecorView(view);
            return super.add((DecorViewArrayList) view);
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ec2dfe2b", new Object[]{this, obj})).booleanValue();
            }
            removeDecorViewWindow(obj);
            return super.remove(obj);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public View remove(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("c1bf2b9a", new Object[]{this, new Integer(i)});
            }
            View view = (View) super.remove(i);
            removeDecorViewWindow(view);
            return view;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class InnerKeyEventListener implements Handler.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int DO_FINISH_COMPOSING_TEXT = 65;
        public static final int MSG_ON_SHOW_REQUESTED = 31;

        /* renamed from: a  reason: collision with root package name */
        public final InputMethodManager f10457a;
        public final Handler.Callback b;
        public final int c;
        public final Class<?> d;
        public final Class<?> e;
        public final Set<Integer> f = new HashSet();

        public InnerKeyEventListener(InputMethodManager inputMethodManager, Handler.Callback callback, int i) {
            Class<?> cls;
            Exception e;
            this.f10457a = inputMethodManager;
            this.b = callback;
            this.c = i;
            Class<?> cls2 = null;
            try {
                cls = Class.forName("android.widget.Editor", true, Context.class.getClassLoader());
            } catch (Exception e2) {
                e = e2;
                cls = null;
            }
            try {
                cls2 = Class.forName("android.widget.Editor$InputContentType", true, Context.class.getClassLoader());
            } catch (Exception e3) {
                e = e3;
                ALog.e("falco.WindowHookManager", "[InnerKeyEventListener] error", null, e, new Object[0]);
                this.d = cls;
                this.e = cls2;
            }
            this.d = cls;
            this.e = cls2;
        }

        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9756c749", new Object[]{this});
                return;
            }
            try {
                Object c = c();
                if (c instanceof TextView) {
                    b((TextView) c);
                }
            } catch (Exception e) {
                ALog.e("falco.WindowHookManager", "[handleServedView] error", null, e, new Object[0]);
            }
        }

        public final void b(TextView textView) throws Exception {
            Class<?> cls;
            Class<?> cls2 = this.d;
            if (cls2 != null && (cls = this.e) != null) {
                Set<Integer> set = this.f;
                if (!((HashSet) set).contains(Integer.valueOf(textView.hashCode()))) {
                    Field declaredField = TextView.class.getDeclaredField("mEditor");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(textView);
                    if (cls2.isInstance(obj)) {
                        Field declaredField2 = cls2.getDeclaredField("mInputContentType");
                        declaredField2.setAccessible(true);
                        Object obj2 = declaredField2.get(obj);
                        if (cls.isInstance(obj2)) {
                            Field declaredField3 = cls.getDeclaredField("onEditorActionListener");
                            declaredField3.setAccessible(true);
                            Object obj3 = declaredField3.get(obj2);
                            if (obj3 instanceof TextView.OnEditorActionListener) {
                                final TextView.OnEditorActionListener onEditorActionListener = (TextView.OnEditorActionListener) obj3;
                                declaredField3.set(obj2, new TextView.OnEditorActionListener() { // from class: com.taobao.falco.WindowHookManager.InnerKeyEventListener.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // android.widget.TextView.OnEditorActionListener
                                    public boolean onEditorAction(TextView textView2, int i, KeyEvent keyEvent) {
                                        IpChange ipChange = $ipChange;
                                        if (ipChange instanceof IpChange) {
                                            return ((Boolean) ipChange.ipc$dispatch("31ef5ab8", new Object[]{this, textView2, new Integer(i), keyEvent})).booleanValue();
                                        }
                                        WindowHookManager.m(WindowHookManager.this, null, new KeyEvent(1, a.KEYCODE_CUSTOM_ENTER));
                                        return onEditorActionListener.onEditorAction(textView2, i, keyEvent);
                                    }
                                });
                                ((HashSet) set).add(Integer.valueOf(textView.hashCode()));
                            }
                        }
                    }
                }
            }
        }

        public final Object c() {
            Object obj;
            InputMethodManager inputMethodManager = this.f10457a;
            try {
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                declaredField.setAccessible(true);
                obj = declaredField.get(inputMethodManager);
            } catch (Exception unused) {
                obj = null;
            }
            if (obj != null) {
                return obj;
            }
            try {
                Method declaredMethod = InputMethodManager.class.getDeclaredMethod("getServedViewLocked", new Class[0]);
                declaredMethod.setAccessible(true);
                return declaredMethod.invoke(inputMethodManager, new Object[0]);
            } catch (Exception unused2) {
                return obj;
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
            }
            if (message.what == this.c) {
                a();
            }
            Handler.Callback callback = this.b;
            if (callback != null) {
                return callback.handleMessage(message);
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        public static final int KEYCODE_CUSTOM_ENTER = KeyEvent.getMaxKeyCode() + 1;

        void a(Activity activity, KeyEvent keyEvent, long j);

        void d(Activity activity, int i, float f, float f2, long j);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements y.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<Activity> f10458a;

        public b(Activity activity) {
            this.f10458a = new WeakReference<>(activity);
        }

        public void a(KeyEvent keyEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a534d20", new Object[]{this, keyEvent});
            } else {
                WindowHookManager.m(WindowHookManager.this, this.f10458a.get(), keyEvent);
            }
        }

        public void b(int i, float f, float f2, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6018f9d", new Object[]{this, new Integer(i), new Float(f), new Float(f2), new Long(j)});
                return;
            }
            for (a aVar : WindowHookManager.d(WindowHookManager.this)) {
                try {
                    aVar.d(this.f10458a.get(), i, f, f2, j);
                } catch (Exception e) {
                    ALog.e("falco.WindowHookManager", "[dispatchTouchEvent] error", null, e, new Object[0]);
                }
            }
        }
    }

    public static /* synthetic */ boolean a(WindowHookManager windowHookManager, Window window, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c49c554c", new Object[]{windowHookManager, window, activity})).booleanValue();
        }
        return windowHookManager.g(window, activity);
    }

    public static /* synthetic */ Map b(WindowHookManager windowHookManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a7d0ab87", new Object[]{windowHookManager});
        }
        return windowHookManager.b;
    }

    public static /* synthetic */ Set c(WindowHookManager windowHookManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("cd677e42", new Object[]{windowHookManager});
        }
        return windowHookManager.c;
    }

    public static /* synthetic */ Set d(WindowHookManager windowHookManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("f2fb8743", new Object[]{windowHookManager});
        }
        return windowHookManager.f10456a;
    }

    public static void j(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d034948", new Object[]{aVar});
        } else if (aVar != null && e != null) {
            ((CopyOnWriteArraySet) e.f10456a).add(aVar);
        }
    }

    public static /* synthetic */ void m(WindowHookManager windowHookManager, Activity activity, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49fe2235", new Object[]{windowHookManager, activity, keyEvent});
        } else {
            windowHookManager.f(activity, keyEvent);
        }
    }

    public void e(Activity activity, Fragment fragment) {
        DialogFragment dialogFragment;
        Dialog dialog;
        Window window;
        Window window2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4695099e", new Object[]{this, activity, fragment});
            return;
        }
        if (activity != null && (window2 = activity.getWindow()) != null && !((ConcurrentHashMap) this.b).containsKey(Integer.valueOf(window2.hashCode())) && g(window2, activity)) {
            ALog.e("falco.WindowHookManager", "[addProxy]", null, "activity", activity.getLocalClassName());
            ((ConcurrentHashMap) this.b).put(Integer.valueOf(window2.hashCode()), Boolean.FALSE);
        }
        if ((fragment instanceof DialogFragment) && (dialog = (dialogFragment = (DialogFragment) fragment).getDialog()) != null && (window = dialog.getWindow()) != null && !((ConcurrentHashMap) this.b).containsKey(Integer.valueOf(window.hashCode())) && g(window, activity)) {
            ALog.e("falco.WindowHookManager", "[addProxy]", null, "dialogFragment", dialogFragment.getClass().getName());
            ((ConcurrentHashMap) this.b).put(Integer.valueOf(window.hashCode()), Boolean.FALSE);
        }
    }

    public final void f(Activity activity, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ca968e", new Object[]{this, activity, keyEvent});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = ((CopyOnWriteArraySet) this.f10456a).iterator();
        while (it.hasNext()) {
            try {
                ((a) it.next()).a(activity, keyEvent, currentTimeMillis);
            } catch (Exception e2) {
                ALog.e("falco.WindowHookManager", "[dispatchKeyEvent] error", null, e2, new Object[0]);
            }
        }
    }

    public final boolean g(Window window, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b278d1be", new Object[]{this, window, activity})).booleanValue();
        }
        Window.Callback callback = window.getCallback();
        if (callback == null) {
            return false;
        }
        try {
            window.setCallback((Window.Callback) Proxy.newProxyInstance(WindowHookManager.class.getClassLoader(), new Class[]{Window.Callback.class}, new y(callback, new b(activity))));
            return true;
        } catch (Exception e2) {
            ALog.e("falco.WindowHookManager", "addProxy error.", null, e2, new Object[0]);
            return false;
        }
    }

    public void i(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbfc82d3", new Object[]{this, aVar, new Boolean(z)});
            return;
        }
        ((CopyOnWriteArraySet) this.f10456a).add(aVar);
        if (z && Build.VERSION.SDK_INT >= 24) {
            this.d = h();
        }
        if (this.d) {
            ALog.e("falco.WindowHookManager", "[init] WindowManagerGlobal hooked", null, new Object[0]);
        }
        e = this;
    }

    public void k(Activity activity) {
        Window window;
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac9d3863", new Object[]{this, activity});
        } else if (activity != null && (window = activity.getWindow()) != null && (bool = (Boolean) ((ConcurrentHashMap) this.b).get(Integer.valueOf(window.hashCode()))) != null && !bool.booleanValue()) {
            ((ConcurrentHashMap) this.b).remove(Integer.valueOf(window.hashCode()));
            ALog.e("falco.WindowHookManager", "[removeProxy]", null, "activity", activity.getLocalClassName());
        }
    }

    public void l(Fragment fragment) {
        Dialog dialog;
        Window window;
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38328cc9", new Object[]{this, fragment});
        } else if ((fragment instanceof DialogFragment) && (dialog = ((DialogFragment) fragment).getDialog()) != null && (window = dialog.getWindow()) != null && (bool = (Boolean) ((ConcurrentHashMap) this.b).get(Integer.valueOf(window.hashCode()))) != null && !bool.booleanValue()) {
            ((ConcurrentHashMap) this.b).remove(Integer.valueOf(window.hashCode()));
            ALog.e("falco.WindowHookManager", "[removeProxy]", null, "dialogFragment", fragment.getClass().getName());
        }
    }

    public final boolean h() {
        try {
            Class<?> cls = Class.forName("android.view.WindowManagerGlobal", true, Context.class.getClassLoader());
            Object invoke = cls.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mLock");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(invoke);
            Field declaredField2 = cls.getDeclaredField("mViews");
            declaredField2.setAccessible(true);
            synchronized (obj) {
                declaredField2.set(invoke, new DecorViewArrayList((List) declaredField2.get(invoke)));
            }
            return true;
        } catch (Exception e2) {
            ALog.e("falco.WindowHookManager", "hook WindowManagerGlobal error.", null, e2, new Object[0]);
            return false;
        }
    }
}
