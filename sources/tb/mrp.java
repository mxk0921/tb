package tb;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.pm.ShortcutManagerCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.shop.common.ShopConstants;
import java.util.UUID;
import org.android.agoo.common.AgooConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class mrp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f24260a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Intent d;
        public final /* synthetic */ ShortcutManager e;

        public a(Context context, String str, String str2, Intent intent, ShortcutManager shortcutManager) {
            this.f24260a = context;
            this.b = str;
            this.c = str2;
            this.d = intent;
            this.e = shortcutManager;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            Icon createWithBitmap;
            ShortcutInfo.Builder icon;
            ShortcutInfo.Builder shortLabel;
            ShortcutInfo.Builder intent;
            ShortcutInfo build;
            Intent createShortcutResultIntent;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            Bitmap bitmap = succPhenixEvent.getDrawable().getBitmap();
            qsp.a();
            ShortcutInfo.Builder a2 = psp.a(this.f24260a, this.b);
            createWithBitmap = Icon.createWithBitmap(bitmap);
            icon = a2.setIcon(createWithBitmap);
            shortLabel = icon.setShortLabel(this.c);
            intent = shortLabel.setIntent(this.d);
            build = intent.build();
            createShortcutResultIntent = this.e.createShortcutResultIntent(build);
            this.e.requestPinShortcut(build, ya.e(this.f24260a, 0, createShortcutResultIntent, 0).getIntentSender());
            irg.a("WebApp", "ShortCutUtils === addShortcut === 创建桌面创建快捷图标");
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Intent f24261a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Context c;

        public b(Intent intent, String str, Context context) {
            this.f24261a = intent;
            this.b = str;
            this.c = context;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            this.f24261a.putExtra("android.intent.extra.shortcut.ICON", succPhenixEvent.getDrawable().getBitmap());
            this.f24261a.putExtra("android.intent.extra.shortcut.INTENT", new Intent("android.intent.action.VIEW", Uri.parse(this.b)));
            this.c.sendBroadcast(this.f24261a);
            irg.a("WebApp", "ShortCutUtils === addShortcut === 创建桌面创建快捷图标 8.0以下版本");
            return false;
        }
    }

    static {
        t2o.a(1030750350);
    }

    public static void a(Context context, String str, String str2, String str3) {
        boolean isRequestPinShortcutSupported;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("833768d8", new Object[]{context, str, str2, str3});
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                String uuid = UUID.randomUUID().toString();
                ShortcutManager a2 = jup.a(context.getSystemService(ShopConstants.PARAM_SHORTCUT));
                if (a2 != null) {
                    isRequestPinShortcutSupported = a2.isRequestPinShortcutSupported();
                    if (isRequestPinShortcutSupported) {
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str3));
                        intent.setAction("android.intent.action.VIEW");
                        s0m.B().N0(context).T(str2).succListener(new a(context, uuid, str, intent, a2)).fetch();
                    }
                }
                irg.a("WebApp", "ShortCutUtils === addShortcut === 设备不支持在桌面创建快捷图标！！");
            } else {
                Intent intent2 = new Intent(ShortcutManagerCompat.ACTION_INSTALL_SHORTCUT);
                intent2.putExtra(AgooConstants.MESSAGE_DUPLICATE, false);
                intent2.putExtra("android.intent.extra.shortcut.NAME", str);
                s0m.B().N0(context).T(str2).succListener(new b(intent2, str3, context)).fetch();
            }
        } catch (Exception e) {
            irg.a("WebApp", "ShortCutUtils === addShortcut === 创建异常：" + e.getMessage());
        }
        irg.a("WebApp", "ShortCutUtils === addShortcut === 创建快捷方式成功");
    }
}
