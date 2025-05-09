package com.taobao.login4android.uti;

import android.text.TextUtils;
import android.view.View;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.login.ui.BaseLoginFragment;
import com.ali.user.mobile.ui.widget.BottomMenuFragment;
import com.ali.user.mobile.ui.widget.MenuItem;
import com.ali.user.mobile.ui.widget.MenuItemOnClickListener;
import com.ali.user.mobile.utils.NavUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.utils.LoginSwitch;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.cr0;
import tb.t2o;
import tb.xpr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PrivacyUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String TAG = "login.Privacy";

    public static void addMoreMenus(BottomMenuFragment bottomMenuFragment, List<MenuItem> list, final BaseLoginFragment baseLoginFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3f19027", new Object[]{bottomMenuFragment, list, baseLoginFragment});
            return;
        }
        Map<String, String> showPrivacy = showPrivacy();
        if (showPrivacy != null) {
            String str = showPrivacy.get("entranceName");
            final String str2 = showPrivacy.get("h5Url");
            if ("true".equals(showPrivacy.get("isShow")) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && list != null && bottomMenuFragment != null && baseLoginFragment != null) {
                MenuItem menuItem = new MenuItem();
                menuItem.setText(str);
                menuItem.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem) { // from class: com.taobao.login4android.uti.PrivacyUtil.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str3, Object... objArr) {
                        str3.hashCode();
                        int hashCode = str3.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str3 + "' with hashcode " + hashCode + " in com/taobao/login4android/uti/PrivacyUtil$1");
                    }

                    @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                    public void onClickMenuItem(View view, MenuItem menuItem2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem2});
                        } else if (baseLoginFragment.isActive()) {
                            NavUtil.navToOrigin(DataProviderFactory.getApplicationContext(), str2);
                        }
                    }
                });
                list.add(menuItem);
            }
        }
    }

    public static boolean isPrivacyEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8b7522c", new Object[0])).booleanValue();
        }
        try {
            if (!LoginSwitch.getSwitch("ignorePrivacy", "false") && !LoginStatus.isFromChangeAccount()) {
                return xpr.A(DataProviderFactory.getApplicationContext());
            }
            return false;
        } catch (Throwable th) {
            LoginTLogAdapter.e(TAG, "TBMinorsProtect exception", th);
            return false;
        }
    }

    public static Map<String, String> showPrivacy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5358db87", new Object[0]);
        }
        try {
            cr0.a a2 = new cr0().a(DataProviderFactory.getApplicationContext());
            if (a2 == null) {
                LoginTLogAdapter.e(TAG, "config is null");
                return null;
            }
            String b = a2.b();
            String a3 = a2.a();
            boolean f = a2.f();
            HashMap hashMap = new HashMap();
            LoginTLogAdapter.e(TAG, a2.toString());
            hashMap.put("isShow", String.valueOf(f));
            hashMap.put("entranceName", b);
            hashMap.put("h5Url", a3);
            return hashMap;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    static {
        t2o.a(70255015);
    }
}
