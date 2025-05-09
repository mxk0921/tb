package tb;

import android.graphics.Rect;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class x9f extends om7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements TextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public bn7 f31230a;
        public final en7 b;
        public final String c;
        public final View d;

        static {
            t2o.a(444596278);
        }

        public b(x9f x9fVar, View view, en7 en7Var) {
            this.b = en7Var;
            this.d = view;
            Map<String, String> map = en7Var.d;
            if (!map.isEmpty()) {
                this.c = map.get("onChange");
                map.get("onBegin");
            }
        }

        public void a(bn7 bn7Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("903d17ed", new Object[]{this, bn7Var});
            } else {
                this.f31230a = bn7Var;
            }
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77fdbb29", new Object[]{this, editable});
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
            } else if (!TextUtils.isEmpty(this.c)) {
                ArrayList arrayList = new ArrayList(5);
                arrayList.add(((EditText) this.d).getText());
                this.d.setTag(jn7.VIEW_PARAMS, arrayList);
                om7.d(this.d, this.f31230a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public bn7 f31231a;
        public final en7 b;
        public final String c;
        public final View d;
        public boolean e;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements View.OnFocusChangeListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
                } else if (!z && !c.a(c.this)) {
                    c.b(c.this);
                }
            }
        }

        static {
            t2o.a(444596279);
        }

        public c(x9f x9fVar, View view, en7 en7Var) {
            this.b = en7Var;
            this.d = view;
            Map<String, String> map = en7Var.d;
            if (!map.isEmpty()) {
                this.c = map.get("onFinish");
            }
        }

        public static /* synthetic */ boolean a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("90b4835f", new Object[]{cVar})).booleanValue();
            }
            return cVar.e;
        }

        public static /* synthetic */ void b(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf65ed7a", new Object[]{cVar});
            } else {
                cVar.c();
            }
        }

        public final void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1236df2f", new Object[]{this});
                return;
            }
            if (!TextUtils.isEmpty(this.c)) {
                ArrayList arrayList = new ArrayList(5);
                arrayList.add(((EditText) this.d).getText());
                this.d.setTag(jn7.VIEW_PARAMS, arrayList);
                om7.d(this.d, this.f31231a, this.b, this.c);
            }
            this.d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.d.setTag(jn7.KEY_BOARD_LISTENER, null);
            this.e = true;
        }

        public final void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e35e1c6a", new Object[]{this});
            }
        }

        public void e(bn7 bn7Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("903d17ed", new Object[]{this, bn7Var});
                return;
            }
            this.f31231a = bn7Var;
            this.d.setOnFocusChangeListener(new a());
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            Rect rect = new Rect();
            View rootView = this.d.getRootView();
            rootView.getWindowVisibleDisplayFrame(rect);
            int height = rootView.getHeight();
            if (height - rect.bottom > height / 3) {
                d();
            } else {
                c();
            }
        }
    }

    static {
        t2o.a(444596276);
    }

    public static /* synthetic */ Object ipc$super(x9f x9fVar, String str, Object... objArr) {
        if (str.hashCode() == -1721752687) {
            super.b((View) objArr[0], (bn7) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/event/InputEventHandlerWorker");
    }

    @Override // tb.om7
    public void b(View view, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99602391", new Object[]{this, view, bn7Var});
            return;
        }
        super.b(view, bn7Var);
        e(view, bn7Var);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f31229a;
        public final /* synthetic */ Map b;
        public final /* synthetic */ bn7 c;
        public final /* synthetic */ en7 d;

        public a(View view, Map map, bn7 bn7Var, en7 en7Var) {
            this.f31229a = view;
            this.b = map;
            this.c = bn7Var;
            this.d = en7Var;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            if (motionEvent.getActionMasked() == 1) {
                View view2 = this.f31229a;
                int i = jn7.KEY_BOARD_LISTENER;
                if (((c) view2.getTag(i)) == null) {
                    ((InputMethodManager) this.f31229a.getContext().getSystemService("input_method")).showSoftInput(this.f31229a, 0);
                    if (this.b.containsKey("onBegin")) {
                        String str = (String) this.b.get("onBegin");
                        if (!TextUtils.isEmpty(str)) {
                            ArrayList arrayList = new ArrayList(5);
                            arrayList.add(((EditText) this.f31229a).getText());
                            this.f31229a.setTag(jn7.VIEW_PARAMS, arrayList);
                            om7.d(this.f31229a, this.c, this.d, str);
                        }
                    }
                    c cVar = new c(x9f.this, this.f31229a, this.d);
                    cVar.e(this.c);
                    this.f31229a.getViewTreeObserver().addOnGlobalLayoutListener(cVar);
                    this.f31229a.setTag(i, cVar);
                }
            }
            return false;
        }
    }

    public void e(View view, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b30d5161", new Object[]{this, view, bn7Var});
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.setFocusable(true);
            viewGroup.setFocusableInTouchMode(true);
        }
        en7 en7Var = (en7) view.getTag(jn7.PROPERTY_KEY);
        if (en7Var != null) {
            Map<String, String> map = en7Var.d;
            if (map.isEmpty()) {
                return;
            }
            if (view.isFocusable()) {
                if (map.containsKey("onChange")) {
                    int i = jn7.TEXT_WATCHER;
                    b bVar = (b) view.getTag(i);
                    if (bVar != null) {
                        ((EditText) view).removeTextChangedListener(bVar);
                    }
                    b bVar2 = new b(this, view, en7Var);
                    bVar2.a(bn7Var);
                    view.setTag(i, bVar2);
                    ((EditText) view).addTextChangedListener(bVar2);
                }
                if (map.containsKey("onFinish") || map.containsKey("onBegin")) {
                    ViewProxy.setOnTouchListener(view, new a(view, map, bn7Var, en7Var));
                    return;
                }
                return;
            }
            ViewProxy.setOnTouchListener(view, null);
            b bVar3 = (b) view.getTag(jn7.TEXT_WATCHER);
            if (bVar3 != null) {
                ((EditText) view).removeTextChangedListener(bVar3);
            }
            view.setOnFocusChangeListener(null);
        }
    }
}
