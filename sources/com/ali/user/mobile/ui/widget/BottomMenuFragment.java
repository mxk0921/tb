package com.ali.user.mobile.ui.widget;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.ui.BaseDialogFragment;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.utils.ElderUtil;
import com.ali.user.mobile.utils.ScreenUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class BottomMenuFragment extends BaseDialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int cancelBtnBgRes;
    private String controlHitPrefix;
    private int itemLayoutId;
    private String mMenuTitle;
    private List<MenuItem> menuItems;
    private int rootLayoutId;
    private boolean transparent = true;
    public boolean needDivider = true;

    static {
        t2o.a(70254879);
    }

    public static /* synthetic */ Object ipc$super(BottomMenuFragment bottomMenuFragment, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/ui/widget/BottomMenuFragment");
        }
    }

    public List<MenuItem> getMenuItems() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3df10215", new Object[]{this});
        }
        return this.menuItems;
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
            this.rootLayoutId = R.layout.aliuser_fragment_bottom_menu;
        }
        View inflate = layoutInflater.inflate(this.rootLayoutId, viewGroup, false);
        if (this.menuItems == null) {
            dismissAllowingStateLoss();
            return inflate;
        }
        TextView textView = (TextView) inflate.findViewById(R.id.aliuser_cancel_tv);
        int i = this.cancelBtnBgRes;
        if (i > 0) {
            textView.setBackgroundResource(i);
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.ali.user.mobile.ui.widget.BottomMenuFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    BottomMenuFragment.this.onCancelClick();
                }
            }
        });
        TextView textView2 = (TextView) inflate.findViewById(R.id.aliuser_bottom_menu_title_tv);
        View findViewById = inflate.findViewById(R.id.aliuser_bottom_menu_title_divider);
        if (TextUtils.isEmpty(this.mMenuTitle)) {
            textView2.setVisibility(8);
            findViewById.setVisibility(8);
        } else {
            findViewById.setVisibility(0);
            textView2.setVisibility(0);
            textView2.setText(this.mMenuTitle);
        }
        ListView listView = (ListView) inflate.findViewById(R.id.aliuser_menu_lv);
        if (!this.needDivider) {
            listView.setDividerHeight(0);
        }
        MenuItemAdapter menuItemAdapter = new MenuItemAdapter(getActivity().getBaseContext(), this.menuItems);
        menuItemAdapter.setLayoutId(this.itemLayoutId);
        listView.setAdapter((ListAdapter) menuItemAdapter);
        ElderUtil.scaleTextSize(textView);
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

    public void setCancelBtnBgRes(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cef91181", new Object[]{this, new Integer(i)});
        } else {
            this.cancelBtnBgRes = i;
        }
    }

    public void setControlHitPrefix(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a826bb", new Object[]{this, str});
        } else {
            this.controlHitPrefix = str;
        }
    }

    public void setItemLayoutId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6eb2402", new Object[]{this, new Integer(i)});
        } else {
            this.itemLayoutId = i;
        }
    }

    public void setMenuItems(List<MenuItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd2c5557", new Object[]{this, list});
            return;
        }
        for (MenuItem menuItem : list) {
            if (menuItem.textSize == 0.0f) {
                menuItem.textSize = DataProviderFactory.getApplicationContext().getResources().getDimension(R.dimen.aliuser_textsize_normal);
            }
            if (DataProviderFactory.getDataProvider().enableElder()) {
                menuItem.textSize = ScreenUtil.dip2px(DataProviderFactory.getApplicationContext(), ElderUtil.getScaleSize(ScreenUtil.pxTodip(DataProviderFactory.getApplicationContext(), menuItem.textSize)));
            }
        }
        this.menuItems = list;
    }

    public void setMenuTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12f42948", new Object[]{this, str});
        } else {
            this.mMenuTitle = str;
        }
    }

    public void setRootLayoutId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4ad4693", new Object[]{this, new Integer(i)});
        } else {
            this.rootLayoutId = i;
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
        } catch (IllegalStateException unused) {
        }
    }
}
