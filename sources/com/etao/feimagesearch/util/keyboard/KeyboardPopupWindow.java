package com.etao.feimagesearch.util.keyboard;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.TBAutoSizeConfig;
import tb.t2o;
import tb.urk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class KeyboardPopupWindow extends PopupWindow implements ViewTreeObserver.OnGlobalLayoutListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context context;
    private int maxHeight;
    private urk onKeyboardStateListener;
    private ViewGroup rootLayout;
    private boolean isSoftKeyboardOpened = false;
    private int keyboardHeight = 0;
    private OnScreenChangedListener screenChangedListener = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements OnScreenChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.etao.feimagesearch.util.keyboard.KeyboardPopupWindow$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public class RunnableC0241a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0241a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                KeyboardPopupWindow keyboardPopupWindow = KeyboardPopupWindow.this;
                KeyboardPopupWindow.access$102(keyboardPopupWindow, KeyboardPopupWindow.access$200(keyboardPopupWindow, KeyboardPopupWindow.access$000(keyboardPopupWindow)));
                KeyboardPopupWindow.this.onGlobalLayout();
            }
        }

        public a() {
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public void onActivityChanged(Activity activity, int i, Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("994f466c", new Object[]{this, activity, new Integer(i), configuration});
            } else if (KeyboardPopupWindow.access$000(KeyboardPopupWindow.this) != null && KeyboardPopupWindow.this.getContentView() != null) {
                KeyboardPopupWindow.this.getContentView().postDelayed(new RunnableC0241a(), 1000L);
            }
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public void onScreenChanged(int i, Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f4888a;
        public final /* synthetic */ ViewGroup b;

        public b(Context context, ViewGroup viewGroup) {
            this.f4888a = context;
            this.b = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!((Activity) this.f4888a).isFinishing()) {
                KeyboardPopupWindow.this.showAtLocation(this.b, 0, 0, 0);
            }
        }
    }

    static {
        t2o.a(481297672);
    }

    public KeyboardPopupWindow(Context context, ViewGroup viewGroup, urk urkVar) {
        this.maxHeight = 0;
        this.onKeyboardStateListener = urkVar;
        this.context = context;
        this.rootLayout = viewGroup;
        View view = new View(context);
        setContentView(view);
        int screenHeight = getScreenHeight(context);
        this.maxHeight = screenHeight;
        setHeight(screenHeight);
        setWidth(0);
        setBackgroundDrawable(new ColorDrawable(0));
        setSoftInputMode(16);
        setInputMethodMode(1);
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        TBAutoSizeConfig.x().d0(this.screenChangedListener);
        viewGroup.post(new b(context, viewGroup));
    }

    public static /* synthetic */ Context access$000(KeyboardPopupWindow keyboardPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("1343b493", new Object[]{keyboardPopupWindow});
        }
        return keyboardPopupWindow.context;
    }

    public static /* synthetic */ int access$102(KeyboardPopupWindow keyboardPopupWindow, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d0e1f98", new Object[]{keyboardPopupWindow, new Integer(i)})).intValue();
        }
        keyboardPopupWindow.maxHeight = i;
        return i;
    }

    public static /* synthetic */ int access$200(KeyboardPopupWindow keyboardPopupWindow, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26439fbe", new Object[]{keyboardPopupWindow, context})).intValue();
        }
        return keyboardPopupWindow.getScreenHeight(context);
    }

    private int getScreenHeight(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb976a8b", new Object[]{this, context})).intValue();
        }
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static /* synthetic */ Object ipc$super(KeyboardPopupWindow keyboardPopupWindow, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/util/keyboard/KeyboardPopupWindow");
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        if (isShowing()) {
            dismiss();
        }
        TBAutoSizeConfig.x().h0(this.screenChangedListener);
        this.rootLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    public boolean isSoftKeyboardOpened() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c8ba34f", new Object[]{this})).booleanValue();
        }
        return this.isSoftKeyboardOpened;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
            return;
        }
        Rect rect = new Rect();
        getContentView().getWindowVisibleDisplayFrame(rect);
        int i = rect.bottom;
        if (i > this.maxHeight) {
            this.maxHeight = i;
        }
        int i2 = this.maxHeight;
        int i3 = i2 - i;
        this.keyboardHeight = i3;
        if (i3 > i2 / 4) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = this.isSoftKeyboardOpened;
        if (!z2 && z) {
            this.isSoftKeyboardOpened = true;
            this.onKeyboardStateListener.i(i3);
        } else if (z2 && !z) {
            this.isSoftKeyboardOpened = false;
            this.onKeyboardStateListener.d();
        } else if (z2 && z) {
            this.onKeyboardStateListener.v(i3);
        }
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else {
            this.isSoftKeyboardOpened = false;
        }
    }
}
