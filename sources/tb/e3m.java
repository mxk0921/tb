package tb;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.shop.common.ShopConstants;
import com.taobao.tbhudong.TBHuDongServiceImp;
import com.taobao.tbreachflow.shortcuts.windvane.WVShortcutsPlugin;
import java.util.ArrayList;
import java.util.List;
import tb.e3m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class e3m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
    }

    public static boolean c(ShortcutManager shortcutManager, String str) {
        List<Object> pinnedShortcuts;
        String id;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6b5b4f0", new Object[]{shortcutManager, str})).booleanValue();
        }
        pinnedShortcuts = shortcutManager.getPinnedShortcuts();
        if (pinnedShortcuts != null) {
            for (Object obj : pinnedShortcuts) {
                ShortcutInfo a2 = gsp.a(obj);
                if (a2 != null) {
                    id = a2.getId();
                    if (str.equals(id)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static String d(String str) {
        boolean isRequestPinShortcutSupported;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2dc5798d", new Object[]{str});
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return "PARAM_INVALID";
            }
            if (Build.VERSION.SDK_INT < 26) {
                return "SYSTEM_LEVEL_INVALID";
            }
            ShortcutManager a2 = jup.a(TBHuDongServiceImp.getApplication().getSystemService(ShopConstants.PARAM_SHORTCUT));
            if (a2 == null) {
                return "SYSTEM_PIN_SHORTCUT_NOT_SUPPORT";
            }
            isRequestPinShortcutSupported = a2.isRequestPinShortcutSupported();
            if (!isRequestPinShortcutSupported) {
                return "SYSTEM_PIN_SHORTCUT_NOT_SUPPORT";
            }
            if (c(a2, str)) {
                return "";
            }
            return "NOT_ADDED";
        } catch (Throwable th) {
            aqa.c("PinnedShortcutsManager.isIconIdAdded.error.", th);
            return "CATCH_ERROR_INVALID";
        }
    }

    public static /* synthetic */ boolean e(Context context, String str, String str2, Intent intent, ShortcutManager shortcutManager, a aVar, SuccPhenixEvent succPhenixEvent) {
        Icon createWithBitmap;
        ShortcutInfo.Builder icon;
        ShortcutInfo.Builder shortLabel;
        ShortcutInfo.Builder intent2;
        ShortcutInfo build;
        Intent createShortcutResultIntent;
        boolean updateShortcuts;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45c9334", new Object[]{context, str, str2, intent, shortcutManager, aVar, succPhenixEvent})).booleanValue();
        }
        Bitmap bitmap = succPhenixEvent.getDrawable().getBitmap();
        ShortcutInfo.Builder a2 = psp.a(context, str);
        createWithBitmap = Icon.createWithBitmap(bitmap);
        icon = a2.setIcon(createWithBitmap);
        shortLabel = icon.setShortLabel(str2);
        intent2 = shortLabel.setIntent(intent);
        build = intent2.build();
        if (c(shortcutManager, str)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(build);
            updateShortcuts = shortcutManager.updateShortcuts(arrayList);
            aqa.b("PinnedShortcutsManager.updateShortcut.id=%s.updateShortcuts=%s.", str, Boolean.valueOf(updateShortcuts));
            if (updateShortcuts) {
                ((WVShortcutsPlugin.a) aVar).c(true, "");
            } else {
                ((WVShortcutsPlugin.a) aVar).c(false, "UPDATE_FAIL_RATE_LIMITED");
            }
        } else {
            createShortcutResultIntent = shortcutManager.createShortcutResultIntent(build);
            shortcutManager.requestPinShortcut(build, ya.e(context, 0, createShortcutResultIntent, 0).getIntentSender());
            aqa.b("PinnedShortcutsManager.addShortcut.id=%s", str);
            ((WVShortcutsPlugin.a) aVar).c(true, "");
        }
        return false;
    }

    public static /* synthetic */ boolean f(a aVar, FailPhenixEvent failPhenixEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b1f9800", new Object[]{aVar, failPhenixEvent})).booleanValue();
        }
        ((WVShortcutsPlugin.a) aVar).c(false, "ICON_IMAGE_LOAD_FAIL");
        return false;
    }

    public static void g(final Context context, final String str, final String str2, String str3, String str4, final a aVar) {
        boolean isRequestPinShortcutSupported;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65293a2d", new Object[]{context, str, str2, str3, str4, aVar});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    final ShortcutManager a2 = jup.a(TBHuDongServiceImp.getApplication().getSystemService(ShopConstants.PARAM_SHORTCUT));
                    if (a2 != null) {
                        isRequestPinShortcutSupported = a2.isRequestPinShortcutSupported();
                        if (isRequestPinShortcutSupported) {
                            final Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str4));
                            intent.setFlags(268468224);
                            s0m.B().N0(context).T(str3).succListener(new s8d() { // from class: tb.c3m
                                @Override // tb.s8d
                                public final boolean onHappen(b1m b1mVar) {
                                    boolean e;
                                    String str5 = str2;
                                    Intent intent2 = intent;
                                    e = e3m.e(context, str, str5, intent2, a2, aVar, (SuccPhenixEvent) b1mVar);
                                    return e;
                                }
                            }).failListener(new s8d() { // from class: tb.d3m
                                @Override // tb.s8d
                                public final boolean onHappen(b1m b1mVar) {
                                    boolean f;
                                    f = e3m.f(e3m.a.this, (FailPhenixEvent) b1mVar);
                                    return f;
                                }
                            }).fetch();
                            return;
                        }
                    }
                    ((WVShortcutsPlugin.a) aVar).c(false, "SYSTEM_PIN_SHORTCUT_NOT_SUPPORT");
                    return;
                }
                ((WVShortcutsPlugin.a) aVar).c(false, "SYSTEM_LEVEL_INVALID");
                return;
            }
            ((WVShortcutsPlugin.a) aVar).c(false, "PARAM_INVALID");
        } catch (Throwable th) {
            aqa.c("PinnedShortcutsManager.addShortcut.error.", th);
            ((WVShortcutsPlugin.a) aVar).c(false, "CATCH_ERROR_INVALID");
        }
    }
}
