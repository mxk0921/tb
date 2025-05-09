package com.taobao.uikit.actionbar;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsGlobalMenuAbility;
import com.taobao.android.abilityidl.ability.GlobalMenuMenuClickResult;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import com.taobao.uikit.actionbar.util.MenuLog;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.aac;
import tb.kdb;
import tb.t2o;
import tb.yba;
import tb.zba;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ShowMenuAbility extends AbsGlobalMenuAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ShowMenuAbility";

    static {
        t2o.a(927989802);
    }

    private boolean addMenu(TBPublicMenu tBPublicMenu, List<yba> list, final aac aacVar) {
        TBPublicMenuItem build;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1663e98", new Object[]{this, tBPublicMenu, list, aacVar})).booleanValue();
        }
        if (list.isEmpty()) {
            return true;
        }
        final ArrayList<TBPublicMenuItem> arrayList = new ArrayList<>();
        boolean z = false;
        for (yba ybaVar : list) {
            if (ybaVar == null || TextUtils.isEmpty(ybaVar.f31962a) || TextUtils.isEmpty(ybaVar.b)) {
                MenuLog.block("", TAG, "customPopoverItems is null. " + ybaVar);
                aacVar.O(ErrorResult.a.g("addItems is null"));
                return false;
            }
            TBPublicMenuItem.Builder builder = new TBPublicMenuItem.Builder();
            String str = ybaVar.b + ":";
            String str2 = ybaVar.f31962a;
            if (str2.contains(Localization.q(R.string.app_share))) {
                z = true;
            }
            builder.setTitle(str + str2);
            arrayList.add(builder.build());
            MenuLog.log(TAG, "customPopoverItems: title: " + build.getTitle() + "; imageUrl: " + build.getIconUrl());
        }
        TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener = new TBPublicMenu.TBOnPublicMenuClickListener() { // from class: com.taobao.uikit.actionbar.ShowMenuAbility.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
            public void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
                    return;
                }
                GlobalMenuMenuClickResult globalMenuMenuClickResult = new GlobalMenuMenuClickResult();
                globalMenuMenuClickResult.index = arrayList.indexOf(tBPublicMenuItem);
                aacVar.k1(globalMenuMenuClickResult);
            }
        };
        tBPublicMenu.addExternalMenus(arrayList, tBOnPublicMenuClickListener);
        if (z) {
            tBPublicMenu.getPresenter().addOnDefaultMenuClickListener(tBOnPublicMenuClickListener);
        }
        return true;
    }

    public static /* synthetic */ Object ipc$super(ShowMenuAbility showMenuAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/actionbar/ShowMenuAbility");
    }

    public static Bundle mapToBundle(Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("7c270ca9", new Object[]{map});
        }
        Bundle bundle = new Bundle();
        if (map == null) {
            return bundle;
        }
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                bundle.putString(key, null);
            } else if (value instanceof String) {
                bundle.putString(key, (String) value);
            } else if (value instanceof Integer) {
                bundle.putInt(key, ((Integer) value).intValue());
            } else if (value instanceof Boolean) {
                bundle.putBoolean(key, ((Boolean) value).booleanValue());
            } else if (value instanceof Float) {
                bundle.putFloat(key, ((Float) value).floatValue());
            } else if (value instanceof Double) {
                bundle.putDouble(key, ((Double) value).doubleValue());
            } else if (value instanceof Long) {
                bundle.putLong(key, ((Long) value).longValue());
            } else if (value instanceof Map) {
                bundle.putBundle(key, mapToBundle((Map) value));
            } else if (value instanceof Parcelable) {
                bundle.putParcelable(key, (Parcelable) value);
            } else if (value instanceof Serializable) {
                bundle.putSerializable(key, (Serializable) value);
            }
        }
        return bundle;
    }

    private void removeMenu(TBPublicMenu tBPublicMenu, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aed83520", new Object[]{this, tBPublicMenu, list});
            return;
        }
        for (String str : list) {
            tBPublicMenu.removeCustomMenuItemsByType(str);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsGlobalMenuAbility
    public void show(kdb kdbVar, final zba zbaVar, aac aacVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5529ebf2", new Object[]{this, kdbVar, zbaVar, aacVar});
            return;
        }
        Activity activity = (Activity) kdbVar.l().getContext();
        if (activity == null) {
            MenuLog.block("", TAG, "context is null");
            aacVar.O(ErrorResult.a.d("context is null"));
            return;
        }
        TBPublicMenu tBPublicMenu = new TBPublicMenu(activity, new ITBPublicMenu() { // from class: com.taobao.uikit.actionbar.ShowMenuAbility.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.actionbar.ITBPublicMenu
            public TBPublicMenu getPublicMenu() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (TBPublicMenu) ipChange2.ipc$dispatch("1f3d234e", new Object[]{this});
                }
                return null;
            }

            @Override // com.taobao.uikit.actionbar.ITBPublicMenu
            public Bundle pageUserInfo() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Bundle) ipChange2.ipc$dispatch("65615653", new Object[]{this});
                }
                Bundle bundle = new Bundle();
                bundle.putAll(ShowMenuAbility.mapToBundle(zbaVar.c));
                return bundle;
            }
        });
        List<yba> list = zbaVar.f32663a;
        if (list == null || addMenu(tBPublicMenu, list, aacVar)) {
            List<String> list2 = zbaVar.b;
            if (list2 != null) {
                removeMenu(tBPublicMenu, list2);
            }
            tBPublicMenu.show();
        }
    }
}
