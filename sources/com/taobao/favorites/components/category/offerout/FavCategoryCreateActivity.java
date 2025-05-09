package com.taobao.favorites.components.category.offerout;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.favorites.FavoriteBaseActivity;
import com.taobao.favorites.favoritesdk.base.ModelSdkBusiness;
import com.taobao.favorites.favoritesdk.base.ResultListener;
import com.taobao.favorites.favoritesdk.category.response.ComTaobaoMercuryCreateShareListResponse;
import com.taobao.favorites.template.FavTemplateConstant;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.acq;
import tb.pyu;
import tb.t2o;
import tb.v29;
import tb.vf3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FavCategoryCreateActivity extends FavoriteBaseActivity implements View.OnClickListener, ResultListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FavCategoryCreateActivity";
    private String itemId;
    private TextView mActionBarOperation;
    private EditText mCatedoryDetail;
    private EditText mCategoryName;
    public boolean hasText = false;
    private TextWatcher nameWatcher = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            FavCategoryCreateActivity favCategoryCreateActivity = FavCategoryCreateActivity.this;
            if (FavCategoryCreateActivity.access$100(favCategoryCreateActivity, FavCategoryCreateActivity.access$000(favCategoryCreateActivity).getRootView())) {
                FavCategoryCreateActivity.access$000(FavCategoryCreateActivity.this).setCursorVisible(true);
            } else {
                FavCategoryCreateActivity.access$000(FavCategoryCreateActivity.this).setCursorVisible(false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            FavCategoryCreateActivity.access$000(FavCategoryCreateActivity.this).requestFocus();
            FavCategoryCreateActivity.this.showKeyboard();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements TextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f10539a;

            public a(String str) {
                this.f10539a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                FavCategoryCreateActivity.access$000(FavCategoryCreateActivity.this).setText(this.f10539a);
                FavCategoryCreateActivity.access$000(FavCategoryCreateActivity.this).setSelection(this.f10539a.length());
            }
        }

        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77fdbb29", new Object[]{this, editable});
                return;
            }
            if (editable == null || editable.toString().trim().length() <= 0) {
                FavCategoryCreateActivity.this.hasText = false;
            } else {
                FavCategoryCreateActivity.this.hasText = true;
            }
            FavCategoryCreateActivity favCategoryCreateActivity = FavCategoryCreateActivity.this;
            if (favCategoryCreateActivity.hasText) {
                FavCategoryCreateActivity.access$200(favCategoryCreateActivity).setTextColor(FavCategoryCreateActivity.this.getResources().getColor(R.color.orange));
            } else {
                FavCategoryCreateActivity.access$200(favCategoryCreateActivity).setTextColor(FavCategoryCreateActivity.this.getResources().getColor(R.color.favorite_actionbar_text_color));
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
                return;
            }
            String obj = FavCategoryCreateActivity.access$000(FavCategoryCreateActivity.this).getText().toString();
            String stringFilter = FavCategoryCreateActivity.this.stringFilter(obj);
            if (!obj.equals(stringFilter)) {
                v29.d("标题只能输入中文、字母、数字哦!");
                FavCategoryCreateActivity.access$000(FavCategoryCreateActivity.this).postDelayed(new a(stringFilter), 200L);
            }
        }
    }

    static {
        t2o.a(707788810);
        t2o.a(707788836);
    }

    public static /* synthetic */ EditText access$000(FavCategoryCreateActivity favCategoryCreateActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditText) ipChange.ipc$dispatch("21889caf", new Object[]{favCategoryCreateActivity});
        }
        return favCategoryCreateActivity.mCategoryName;
    }

    public static /* synthetic */ boolean access$100(FavCategoryCreateActivity favCategoryCreateActivity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3538397", new Object[]{favCategoryCreateActivity, view})).booleanValue();
        }
        return favCategoryCreateActivity.isKeyboardShown(view);
    }

    public static /* synthetic */ TextView access$200(FavCategoryCreateActivity favCategoryCreateActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("dd6b5fb2", new Object[]{favCategoryCreateActivity});
        }
        return favCategoryCreateActivity.mActionBarOperation;
    }

    public static /* synthetic */ Object ipc$super(FavCategoryCreateActivity favCategoryCreateActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -1064812440:
                super.supportDisablePublicMenu();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/favorites/components/category/offerout/FavCategoryCreateActivity");
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryCreateActivity", "public void onClick(View v)", "20180112");
        if (view.getId() == R.id.tv_complete && this.hasText) {
            String obj = this.mCategoryName.getText().toString();
            String obj2 = this.mCatedoryDetail.getText().toString();
            if (TextUtils.isEmpty(obj)) {
                v29.b(R.string.fav_cat_detail_error_title_empty);
                return;
            }
            hideKeyboard();
            createList(obj.trim(), obj2, this.itemId);
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryCreateActivity", "protected void onCreate(Bundle savedInstanceState)", "20180112");
        super.onCreate(bundle);
        setContentView(R.layout.favorite_category_dialog_new_category);
        if (getIntent() != null) {
            this.itemId = pyu.a(getIntent().getData()).get(FavTemplateConstant.ITEM_ID);
        }
        EditText editText = (EditText) findViewById(R.id.category_name);
        this.mCategoryName = editText;
        editText.getViewTreeObserver().addOnGlobalLayoutListener(new a());
        this.mCategoryName.addTextChangedListener(this.nameWatcher);
        this.mCatedoryDetail = (EditText) findViewById(R.id.category_detail);
        initActionBar();
        getSupportActionBar().setTitle(getResources().getString(R.string.fav_cat_detail_create_title));
        this.mActionBarOperation.setText(getResources().getString(R.string.fav_cat_detail_edit_finish));
        updateUTPageName("Page_DetailAddCategory");
        HashMap hashMap = new HashMap();
        hashMap.put("spm-cnt", "a21ay.8180209");
        updatePageProperties(hashMap);
        new Handler(Looper.getMainLooper()).postDelayed(new b(), 300L);
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryCreateActivity", "protected void onDestroy()", "20180112");
        super.onDestroy();
        hideKeyboard();
    }

    @Override // com.taobao.favorites.favoritesdk.base.ResultListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryCreateActivity", "public void onError(int requestType, MtopResponse response, Object requestContext)", "20180112");
        hideloadingMaskLayout();
        if (mtopResponse != null && !TextUtils.isEmpty(mtopResponse.getRetMsg())) {
            v29.d(mtopResponse.getRetMsg());
        }
    }

    @Override // com.taobao.favorites.favoritesdk.base.ResultListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryCreateActivity", "public void onSuccess(int requestType, MtopResponse response, BaseOutDo pojo, Object requestContext)", "20180112");
        hideloadingMaskLayout();
        v29.a();
        finish();
    }

    @Override // com.taobao.favorites.favoritesdk.base.ResultListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryCreateActivity", "public void onSystemError(int requestType, MtopResponse response, Object requestContext)", "20180112");
        hideloadingMaskLayout();
        if (!mtopResponse.is41XResult()) {
            v29.b(R.string.server_busy);
        }
    }

    public String stringFilter(String str) throws PatternSyntaxException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bdb8326", new Object[]{this, str});
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryCreateActivity", "public String stringFilter(String str) throws PatternSyntaxException", "20180112");
        return Pattern.compile("[^a-zA-Z0-9一-龥]").matcher(str).replaceAll("").trim();
    }

    private void initActionBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a43a14d4", new Object[]{this});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryCreateActivity", "private void initActionBar()", "20180112");
        ActionBar supportActionBar = getSupportActionBar();
        this.mActionBarOperation = (TextView) LayoutInflater.from(this).inflate(R.layout.favorite_category_create_actionbar, (ViewGroup) null);
        supportActionBar.setDisplayShowCustomEnabled(true);
        ActionBar.LayoutParams layoutParams = new ActionBar.LayoutParams(-2, -1, 5);
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = DensityUtil.dip2px(getActivity().getApplicationContext(), 12.0f);
        supportActionBar.setCustomView(this.mActionBarOperation, layoutParams);
        this.mActionBarOperation.setOnClickListener(this);
        super.supportDisablePublicMenu();
    }

    public boolean hideKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8c20b54", new Object[]{this})).booleanValue();
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryCreateActivity", "public boolean hideKeyboard()", "20180112");
        TLog.logd(TAG, "hideKeyBoard");
        try {
            return ((InputMethodManager) this.mCategoryName.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.mCategoryName.getWindowToken(), 0);
        } catch (Exception unused) {
            TLog.loge(TAG, "hideContactsKeyboard error");
            return false;
        }
    }

    public boolean showKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9e9488f", new Object[]{this})).booleanValue();
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryCreateActivity", "public boolean showKeyboard()", "20180112");
        TLog.logd(TAG, "showKeyboard");
        try {
            ((InputMethodManager) this.mCategoryName.getContext().getSystemService("input_method")).showSoftInput(this.mCategoryName, 0);
        } catch (Exception unused) {
            TLog.loge(TAG, "showKeyboard error");
        }
        return false;
    }

    private boolean isKeyboardShown(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d89b848f", new Object[]{this, view})).booleanValue();
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryCreateActivity", "private boolean isKeyboardShown(View rootView)", "20180112");
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return ((float) (view.getBottom() - rect.bottom)) > view.getResources().getDisplayMetrics().density * 128.0f;
    }

    public void createList(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1129265f", new Object[]{this, str, str2, str3});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.category.offerout.FavCategoryCreateActivity", "public void createList(String name, String detail, String itemId)", "20180112");
        showLoadingMaskLayout();
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3);
        }
        ModelSdkBusiness.b(vf3.a("mclaren", 1, "0", str, str2, 1L, 2L, 0L, JSON.toJSONString(arrayList), null, 0L)).h(ComTaobaoMercuryCreateShareListResponse.class, this);
    }
}
