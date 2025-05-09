package com.ali.user.mobile.login.newui;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.ali.user.mobile.login.model.AppLaunchInfoResponseData;
import com.ali.user.mobile.login.ui.CommonLoginRegFragment;
import com.ali.user.mobile.login.ui.LoginClickAction;
import com.ali.user.mobile.login.ui.UserLoginActivity;
import com.ali.user.mobile.register.ui.AliUserRegisterActivity;
import com.ali.user.mobile.ui.widget.BottomMenuFragment;
import com.ali.user.mobile.ui.widget.MenuItemOnClickListener;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.activity.auth.AlipayAuth;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class BaseRegisterFragment extends CommonLoginRegFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public AppLaunchInfoResponseData mFireAppLaunchRes;

    static {
        t2o.a(70254599);
    }

    public static /* synthetic */ void access$000(BaseRegisterFragment baseRegisterFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39748463", new Object[]{baseRegisterFragment, str});
        } else {
            baseRegisterFragment.addControl(str);
        }
    }

    public static /* synthetic */ Object ipc$super(BaseRegisterFragment baseRegisterFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1824869764) {
            super.onPrepareOptionsMenu((Menu) objArr[0]);
            return null;
        } else if (hashCode == -1180824595) {
            super.initViews((View) objArr[0]);
            return null;
        } else if (hashCode == 1893326613) {
            return new Boolean(super.onOptionsItemSelected((MenuItem) objArr[0]));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/ali/user/mobile/login/newui/BaseRegisterFragment");
        }
    }

    public void addCheckAction(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("129c9b7f", new Object[]{this, new Integer(i)});
        } else {
            commonAddCheck(i, LoginStatus.degradeHegui, this.mProtocolCB, this.mProtocolCBXianyu);
        }
    }

    @Override // com.ali.user.mobile.login.ui.CommonLoginRegFragment, com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        super.initViews(view);
        updateLogo((TUrlImageView) view.findViewById(R.id.aliuser_taobao_logo));
    }

    @Override // com.ali.user.mobile.login.ui.CommonLoginRegFragment
    public boolean isFromOversea() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54e6172", new Object[]{this})).booleanValue();
        }
        return UserLoginActivity.displayOversea(this.mFireAppLaunchRes);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16d37bde", new Object[]{this, menu, menuInflater});
            return;
        }
        menu.clear();
        menuInflater.inflate(R.menu.aliuser_menu, menu);
        try {
            MenuItem findItem = menu.findItem(R.id.aliuser_menu_item_help);
            SpannableString spannableString = new SpannableString(getResources().getString(R.string.aliuser_menu_help));
            spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.aliuser_showloginId_text_color)), 0, spannableString.length(), 0);
            findItem.setTitle(spannableString);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70d9df15", new Object[]{this, menuItem})).booleanValue();
        }
        int itemId = menuItem.getItemId();
        if (itemId == R.id.aliuser_menu_item_help) {
            addControl("Button-Help");
            AliUserRegisterActivity.goRegHelp(getBaseActivity());
        } else if (itemId == R.id.aliuser_menu_item_more) {
            addControl("Button-More");
            showBottomMenu();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("933ab27c", new Object[]{this, menu});
            return;
        }
        int i = R.id.aliuser_menu_item_help;
        if (menu.findItem(i) != null) {
            int i2 = R.id.aliuser_menu_item_more;
            if (menu.findItem(i2) != null) {
                if (isFromOversea() || !showXianyuTogether()) {
                    menu.findItem(i2).setVisible(false);
                    menu.findItem(i).setVisible(true);
                } else {
                    menu.findItem(i2).setVisible(true);
                    menu.findItem(i).setVisible(false);
                }
            }
        }
        super.onPrepareOptionsMenu(menu);
    }

    public abstract void regTaobaoOnly();

    public void showBottomAlipay(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3120f0b9", new Object[]{this, view});
            return;
        }
        View findViewById = view.findViewById(R.id.aliuser_sns_alipay_ll);
        TextView textView = (TextView) view.findViewById(R.id.ali_user_login_alipay_login_tv);
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.ali.user.mobile.login.newui.BaseRegisterFragment.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    } else {
                        BaseRegisterFragment.this.addCheckAction(LoginClickAction.ACTION_ALIPAY);
                    }
                }
            });
            AlipayAuth.showAlipay(this, textView, findViewById, true);
        }
    }

    public void showBottomMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cac9e0e", new Object[]{this});
        } else if (isActive() && isVisible()) {
            BottomMenuFragment bottomMenuFragment = new BottomMenuFragment();
            ArrayList arrayList = new ArrayList();
            com.ali.user.mobile.ui.widget.MenuItem menuItem = new com.ali.user.mobile.ui.widget.MenuItem();
            menuItem.setText(getString(R.string.aliuser_menu_help));
            menuItem.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem) { // from class: com.ali.user.mobile.login.newui.BaseRegisterFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/newui/BaseRegisterFragment$1");
                }

                @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                public void onClickMenuItem(View view, com.ali.user.mobile.ui.widget.MenuItem menuItem2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem2});
                    } else if (BaseRegisterFragment.this.isActive()) {
                        BaseRegisterFragment.access$000(BaseRegisterFragment.this, "Button-Help");
                        AliUserRegisterActivity.goRegHelp(BaseRegisterFragment.this.getBaseActivity());
                    }
                }
            });
            arrayList.add(menuItem);
            com.ali.user.mobile.ui.widget.MenuItem menuItem2 = new com.ali.user.mobile.ui.widget.MenuItem();
            menuItem2.setText(getString(R.string.aliuser_protocol_disagree_with_xianyu));
            menuItem2.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem2) { // from class: com.ali.user.mobile.login.newui.BaseRegisterFragment.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/newui/BaseRegisterFragment$2");
                }

                @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                public void onClickMenuItem(View view, com.ali.user.mobile.ui.widget.MenuItem menuItem3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem3});
                    } else {
                        BaseRegisterFragment.this.regTaobaoOnly();
                    }
                }
            });
            arrayList.add(menuItem2);
            bottomMenuFragment.setMenuItems(arrayList);
            bottomMenuFragment.show(getFragmentManager(), getPageName());
        }
    }
}
