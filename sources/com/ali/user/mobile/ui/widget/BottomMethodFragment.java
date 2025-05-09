package com.ali.user.mobile.ui.widget;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.ui.BaseDialogFragment;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.utils.ElderUtil;
import com.ali.user.mobile.utils.ScreenUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class BottomMethodFragment extends BaseDialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String controlHitPrefix;
    private String mMenuTitle;
    private List<LoginMethodItem> methods;
    private int rootLayoutId;
    private boolean transparent = true;

    static {
        t2o.a(70254881);
    }

    private View createLoginMethodButton(int i, String str, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ee10e9b5", new Object[]{this, new Integer(i), str, onClickListener});
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        float f = displayMetrics.density;
        layoutParams.topMargin = (int) (24.0f * f);
        layoutParams.leftMargin = (int) (f * 16.0f);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(dpToPx(44.0f), dpToPx(44.0f));
        linearLayout2.setOnClickListener(onClickListener);
        linearLayout2.setLayoutParams(layoutParams2);
        linearLayout2.setBackgroundResource(R.drawable.aliuser_btn_gray_rectangle);
        linearLayout2.setGravity(17);
        linearLayout2.setOrientation(1);
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new LinearLayout.LayoutParams(dpToPx(27.5f), dpToPx(27.5f)));
        imageView.setImageResource(i);
        linearLayout2.addView(imageView);
        linearLayout.addView(linearLayout2);
        TextView textView = new TextView(getContext());
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        textView.setText(str);
        textView.setGravity(17);
        textView.setTextSize(2, 13.0f);
        textView.setPadding(0, (int) (displayMetrics.density * 10.0f), 0, 0);
        linearLayout.addView(textView);
        return linearLayout;
    }

    private int dpToPx(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("11e1b4dd", new Object[]{this, new Float(f)})).intValue();
        }
        return Math.round(f * getResources().getDisplayMetrics().density);
    }

    public static /* synthetic */ Object ipc$super(BottomMethodFragment bottomMethodFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -596517775:
                super.show((FragmentManager) objArr[0], (String) objArr[1]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/ui/widget/BottomMethodFragment");
        }
    }

    public void onCancelClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("454030d6", new Object[]{this});
            return;
        }
        if (!TextUtils.isEmpty(getTag())) {
            String str = "";
            if (!TextUtils.isEmpty(this.controlHitPrefix)) {
                str = (str + this.controlHitPrefix) + "_";
            }
            UserTrackAdapter.sendControlUT(getTag(), str + "cancel");
        }
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
        } else {
            super.onCreate(bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        getDialog().requestWindowFeature(1);
        if (this.transparent) {
            getDialog().getWindow().setWindowAnimations(R.style.AliUserMenuAnimation);
        }
        if (this.rootLayoutId <= 0) {
            this.rootLayoutId = R.layout.aliuser_bottom_method_menu;
        }
        View inflate = layoutInflater.inflate(this.rootLayoutId, viewGroup, false);
        ScrollView scrollView = (ScrollView) inflate.findViewById(R.id.aliuser_icons_scrollview);
        List<LoginMethodItem> list = this.methods;
        if (list == null || list.size() <= 0) {
            scrollView.setVisibility(8);
        } else {
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.aliuser_button_container);
            for (int i = 0; i < this.methods.size(); i++) {
                LoginMethodItem loginMethodItem = this.methods.get(i);
                linearLayout.addView(createLoginMethodButton(loginMethodItem.getImage(), loginMethodItem.getTextBelowIcon(), loginMethodItem.getMenuItemOnClickListener()));
            }
        }
        ViewProxy.setOnClickListener(inflate.findViewById(R.id.aliuser_cancel_tv), new View.OnClickListener() { // from class: com.ali.user.mobile.ui.widget.BottomMethodFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    BottomMethodFragment.this.onCancelClick();
                }
            }
        });
        TextView textView = (TextView) inflate.findViewById(R.id.aliuser_bottom_menu_title_tv);
        if (TextUtils.isEmpty(this.mMenuTitle)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(this.mMenuTitle);
        }
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        WindowManager.LayoutParams attributes = getDialog().getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 80;
        getDialog().getWindow().setAttributes(attributes);
        if (this.transparent) {
            getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        } else {
            getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(getContext().getResources().getColor(R.color.aliuser_half_transparent_background)));
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        if (this.transparent) {
            getView().setAnimation(AnimationUtils.loadAnimation(getActivity(), R.anim.aliuser_menu_out));
        }
        super.onStop();
    }

    public void setControlHitPrefix(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a826bb", new Object[]{this, str});
        } else {
            this.controlHitPrefix = str;
        }
    }

    public void setMenuItems(List<MenuItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd2c5557", new Object[]{this, list});
        } else if (list != null) {
            for (MenuItem menuItem : list) {
                if (menuItem.textSize == 0.0f) {
                    menuItem.textSize = DataProviderFactory.getApplicationContext().getResources().getDimension(R.dimen.aliuser_textsize_normal);
                }
                if (DataProviderFactory.getDataProvider().enableElder()) {
                    menuItem.textSize = ScreenUtil.dip2px(DataProviderFactory.getApplicationContext(), ElderUtil.getScaleSize(ScreenUtil.pxTodip(DataProviderFactory.getApplicationContext(), menuItem.textSize)));
                }
            }
        }
    }

    public void setMenuTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12f42948", new Object[]{this, str});
        } else {
            this.mMenuTitle = str;
        }
    }

    public void setMethods(List<LoginMethodItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58f72068", new Object[]{this, list});
        } else if (list != null) {
            for (LoginMethodItem loginMethodItem : list) {
                if (loginMethodItem.textSize == 0.0f) {
                    loginMethodItem.textSize = DataProviderFactory.getApplicationContext().getResources().getDimension(R.dimen.aliuser_textsize_normal);
                }
            }
            this.methods = list;
        }
    }

    public void setTransparent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4573e19d", new Object[]{this, new Boolean(z)});
        } else {
            this.transparent = z;
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc71dc71", new Object[]{this, fragmentManager, str});
            return;
        }
        try {
            super.show(fragmentManager, str);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }
}
