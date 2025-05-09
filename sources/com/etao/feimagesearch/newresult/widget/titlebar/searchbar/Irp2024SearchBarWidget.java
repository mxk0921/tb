package com.etao.feimagesearch.newresult.widget.titlebar.searchbar;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.ui.CornerImageView;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.a07;
import tb.ckf;
import tb.mzu;
import tb.p1p;
import tb.qnd;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Irp2024SearchBarWidget implements TextWatcher, View.OnClickListener, TextView.OnEditorActionListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Context activity;
    private TUrlImageView clearView;
    private final View closeBtn;
    private final ViewGroup container;
    private TextView contentTv;
    private String curSearchContent;
    private final String defaultHint;
    private View hintContainer;
    private String hintQuery;
    private EditText inputView;
    private boolean isDarkMode;
    private boolean isTriggerElder;
    private View rootView;
    private final TextView searchBtn;
    private qnd searchStateListener;
    private CornerImageView thumbView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Irp2024SearchBarWidget.access$getInputView$p(Irp2024SearchBarWidget.this).requestFocus();
            Irp2024SearchBarWidget.access$optionInputMethod(Irp2024SearchBarWidget.this, true);
        }
    }

    static {
        t2o.a(481297273);
    }

    public Irp2024SearchBarWidget(Context context, ViewGroup viewGroup, boolean z, boolean z2, qnd qndVar) {
        ckf.g(context, "activity");
        ckf.g(viewGroup, "container");
        this.activity = context;
        this.container = viewGroup;
        this.isDarkMode = z;
        this.isTriggerElder = z2;
        this.searchStateListener = qndVar;
        this.defaultHint = "输入想搜的内容";
        View inflate = LayoutInflater.from(context).inflate(R.layout.feis_search_bar_2024, viewGroup, false);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(p1p.b(6.5f));
        gradientDrawable.setColor(Color.parseColor("#FFFFFF"));
        inflate.setBackground(gradientDrawable);
        ViewProxy.setOnClickListener(inflate, this);
        this.rootView = inflate;
        this.hintQuery = "";
        this.curSearchContent = "";
        View findViewById = inflate.findViewById(R.id.fl_et_container);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(p1p.b(4.5f));
        gradientDrawable2.setColor(Color.parseColor("#F3F6F8"));
        findViewById.setBackground(gradientDrawable2);
        View findViewById2 = this.rootView.findViewById(R.id.iv_thumbnail);
        CornerImageView cornerImageView = (CornerImageView) findViewById2;
        cornerImageView.setRadius(p1p.b(6.5f));
        cornerImageView.setBackgroundColor(Color.parseColor("#222222"));
        ckf.f(findViewById2, "rootView.findViewById<Co…seColor(\"#222222\"))\n    }");
        this.thumbView = (CornerImageView) findViewById2;
        View findViewById3 = this.rootView.findViewById(R.id.et_search_bar);
        EditText editText = (EditText) findViewById3;
        editText.addTextChangedListener(this);
        editText.setOnEditorActionListener(this);
        editText.setHint("输入想搜的内容");
        float f = 16.0f;
        editText.setTextSize(1, this.isTriggerElder ? 18.0f : 16.0f);
        ckf.f(findViewById3, "rootView.findViewById<Ed…lder) 18f else 16f)\n    }");
        this.inputView = (EditText) findViewById3;
        View findViewById4 = this.rootView.findViewById(R.id.btn_clear);
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById4;
        tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN016xbmRY1ahO8yUKOWb_!!6000000003361-49-tps-500-500.webp");
        tUrlImageView.setOnClickListener(this);
        tUrlImageView.setVisibility(8);
        StringBuilder sb = new StringBuilder();
        int i = R.string.taobao_app_1007_1_18996;
        sb.append(Localization.q(i));
        sb.append(',');
        int i2 = R.string.taobao_app_1007_button;
        sb.append(Localization.q(i2));
        tUrlImageView.setContentDescription(sb.toString());
        ckf.f(findViewById4, "rootView.findViewById<TU…07_button)\n      }\"\n    }");
        this.clearView = (TUrlImageView) findViewById4;
        View findViewById5 = this.rootView.findViewById(R.id.fl_hint_container);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setShape(0);
        gradientDrawable3.setCornerRadius(p1p.b(4.5f));
        gradientDrawable3.setColor(Color.parseColor("#F3F6F8"));
        findViewById5.setBackground(gradientDrawable3);
        this.hintContainer = findViewById5;
        View findViewById6 = this.rootView.findViewById(R.id.tv_content);
        TextView textView = (TextView) findViewById6;
        textView.setTextSize(1, this.isTriggerElder ? 18.0f : 16.0f);
        textView.setOnClickListener(this);
        ckf.f(findViewById6, "rootView.findViewById<Te…024SearchBarWidget)\n    }");
        this.contentTv = (TextView) findViewById6;
        TUrlImageView tUrlImageView2 = (TUrlImageView) this.rootView.findViewById(R.id.btn_content_clear);
        tUrlImageView2.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN016xbmRY1ahO8yUKOWb_!!6000000003361-49-tps-500-500.webp");
        tUrlImageView2.setOnClickListener(this);
        tUrlImageView2.setContentDescription(Localization.q(i) + ',' + Localization.q(i2));
        View findViewById7 = this.rootView.findViewById(R.id.btn_search);
        TextView textView2 = (TextView) findViewById7;
        textView2.setTextSize(1, this.isTriggerElder ? 18.0f : 16.0f);
        textView2.setOnClickListener(this);
        textView2.setContentDescription(Localization.q(R.string.taobao_app_1007_search) + ',' + Localization.q(i2));
        ckf.f(findViewById7, "rootView.findViewById<Te…07_button)\n      }\"\n    }");
        this.searchBtn = (TextView) findViewById7;
        View findViewById8 = this.rootView.findViewById(R.id.btn_close);
        TextView textView3 = (TextView) findViewById8;
        textView3.setTextSize(1, this.isTriggerElder ? 18.0f : f);
        textView3.setOnClickListener(this);
        textView3.setTextColor(Color.parseColor(this.isDarkMode ? "#383838" : "#11192D"));
        textView3.setContentDescription(Localization.q(R.string.taobao_app_1007_close) + ',' + Localization.q(i2));
        ckf.f(findViewById8, "rootView.findViewById<Te…07_button)\n      }\"\n    }");
        this.closeBtn = findViewById8;
    }

    public static final /* synthetic */ EditText access$getInputView$p(Irp2024SearchBarWidget irp2024SearchBarWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditText) ipChange.ipc$dispatch("df3e4f2e", new Object[]{irp2024SearchBarWidget});
        }
        return irp2024SearchBarWidget.inputView;
    }

    public static final /* synthetic */ void access$optionInputMethod(Irp2024SearchBarWidget irp2024SearchBarWidget, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("463ad166", new Object[]{irp2024SearchBarWidget, new Boolean(z)});
        } else {
            irp2024SearchBarWidget.optionInputMethod(z);
        }
    }

    private final void closeSearchDoor(boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd077a5f", new Object[]{this, new Boolean(z)});
            return;
        }
        String validQuery = getValidQuery();
        if (validQuery == null) {
            validQuery = "";
        }
        this.curSearchContent = validQuery;
        View view = this.hintContainer;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        this.contentTv.setText(this.curSearchContent);
        optionInputMethod(false);
    }

    private final String getValidQuery() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9587ca17", new Object[]{this});
        }
        Editable text = this.inputView.getText();
        if (text == null) {
            return null;
        }
        if (text.length() > 0) {
            return text.toString();
        }
        return this.hintQuery;
    }

    private final void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        qnd qndVar = this.searchStateListener;
        if (qndVar != null) {
            qndVar.c(false);
        }
        this.container.removeView(this.rootView);
        optionInputMethod(false);
        qnd qndVar2 = this.searchStateListener;
        if (qndVar2 != null) {
            qndVar2.a(false);
        }
    }

    private final void openSearchDoor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc4ebe7", new Object[]{this});
            return;
        }
        qnd qndVar = this.searchStateListener;
        if (qndVar != null) {
            qndVar.c(true);
        }
        this.searchBtn.setVisibility(0);
        this.inputView.setVisibility(0);
        this.hintContainer.setVisibility(8);
        this.curSearchContent = "";
        this.inputView.setText("");
        EditText editText = this.inputView;
        editText.setSelection(editText.getText().length());
        this.inputView.post(new a());
        updateSearchBtnState();
    }

    private final void updateSearchBtnState() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc7bd40d", new Object[]{this});
        } else if (TextUtils.isEmpty(getValidQuery())) {
            this.searchBtn.setClickable(false);
            TextView textView = this.searchBtn;
            if (this.isDarkMode) {
                str = "#777777";
            } else {
                str = "#CACFD7";
            }
            textView.setTextColor(Color.parseColor(str));
        } else {
            this.searchBtn.setClickable(true);
            this.searchBtn.setTextColor(Color.parseColor("#FF6200"));
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    public final String getHintQuery() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e3cd40e", new Object[]{this});
        }
        return this.hintQuery;
    }

    public final boolean isVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3aa8873", new Object[]{this})).booleanValue();
        }
        if (this.rootView.getParent() != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        ckf.d(view);
        int id = view.getId();
        if (id == R.id.btn_clear) {
            this.inputView.setText("");
            qnd qndVar = this.searchStateListener;
            if (qndVar != null) {
                qndVar.c(true);
            }
        } else if (id == R.id.btn_search) {
            onSearchClick();
        } else if (id == R.id.btn_close) {
            closeSearchDoor(false);
            hide();
        } else if (id == R.id.tv_content) {
            this.hintContainer.setVisibility(8);
        } else if (id == R.id.btn_content_clear) {
            this.hintContainer.setVisibility(8);
            this.inputView.setText("");
            qnd qndVar2 = this.searchStateListener;
            if (qndVar2 != null) {
                qndVar2.c(true);
            }
        }
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31ef5ab8", new Object[]{this, textView, new Integer(i), keyEvent})).booleanValue();
        }
        if (i != 3) {
            return false;
        }
        onSearchClick();
        return true;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    public final void setHintQuery(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b9b6990", new Object[]{this, str});
            return;
        }
        if (str == null || TextUtils.isEmpty(str)) {
            this.inputView.setHint(this.defaultHint);
            this.hintQuery = "";
        } else {
            this.inputView.setHint(str);
            this.hintQuery = str;
        }
        updateSearchBtnState();
    }

    public final void setQueryTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca1d13c5", new Object[]{this, str});
            return;
        }
        if (str == null) {
            str = "";
        }
        this.curSearchContent = str;
        closeSearchDoor(true);
    }

    public final void setThumbContent(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78040262", new Object[]{this, bitmap});
        } else {
            this.thumbView.setImageBitmap(bitmap);
        }
    }

    public final void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        openSearchDoor();
        if (this.rootView.getParent() == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, p1p.a(51.0f));
            layoutParams.gravity = 16;
            int a2 = p1p.a(17.0f);
            layoutParams.setMargins(a2, 0, a2, 0);
            this.container.addView(this.rootView, layoutParams);
        }
        qnd qndVar = this.searchStateListener;
        if (qndVar != null) {
            qndVar.a(true);
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77fdbb29", new Object[]{this, editable});
        } else if (editable != null) {
            updateSearchBtnState();
            this.clearView.setVisibility(editable.length() > 0 ? 0 : 8);
            ViewGroup.LayoutParams layoutParams = this.inputView.getLayoutParams();
            if (layoutParams != null) {
                ((FrameLayout.LayoutParams) layoutParams).setMargins(0, 0, editable.length() > 0 ? p1p.a(31.0f) : 0, 0);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    private final void onSearchClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6402d68", new Object[]{this});
            return;
        }
        String validQuery = getValidQuery();
        if (!TextUtils.isEmpty(validQuery)) {
            if (validQuery == null) {
                validQuery = "";
            }
            this.curSearchContent = validQuery;
            qnd qndVar = this.searchStateListener;
            if (qndVar != null) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.add(this.curSearchContent);
                qndVar.b(jSONArray);
            }
            mzu.i("Page_PhotoSearchResult", "starttextsearch", new String[0]);
            closeSearchDoor(true);
        }
    }

    private final void optionInputMethod(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72fa0357", new Object[]{this, new Boolean(z)});
        } else if (z) {
            Object systemService = this.activity.getSystemService("input_method");
            if (systemService != null) {
                ((InputMethodManager) systemService).showSoftInput(this.inputView, 1);
            }
        } else {
            Object systemService2 = this.activity.getSystemService("input_method");
            if (systemService2 != null) {
                ((InputMethodManager) systemService2).hideSoftInputFromWindow(((Activity) this.activity).getWindow().getDecorView().getWindowToken(), 0);
            }
        }
    }

    public /* synthetic */ Irp2024SearchBarWidget(Context context, ViewGroup viewGroup, boolean z, boolean z2, qnd qndVar, int i, a07 a07Var) {
        this(context, viewGroup, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, qndVar);
    }
}
