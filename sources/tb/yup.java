package tb;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tbhudong.TBHuDongServiceImp;
import com.taobao.tbreachflow.shortcuts.bean.ContentVO;
import com.taobao.tbreachflow.shortcuts.bean.ItemVO;
import com.taobao.tbreachflow.shortcuts.config.ShortcutConfig;
import com.taobao.tbreachflow.shortcuts.config.ShortcutControlConfig;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.yup;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class yup {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile yup e;
    public static final AtomicBoolean f = new AtomicBoolean(false);

    /* renamed from: a  reason: collision with root package name */
    public final Context f32360a;
    public final Set<String> b = new HashSet();
    public final Map<String, ShortcutInfo> c = new ConcurrentHashMap();
    public boolean d = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Localization.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.alibaba.ability.localization.Localization.a
        public void onChange(Language language, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c58b74d", new Object[]{this, language, str});
                return;
            }
            aqa.b("Localization.onChange language: " + language, new Object[0]);
            gno.b(yup.f(yup.this)).e("shortcut_update_time", 0);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b extends TypeReference<Map<String, ShortcutControlConfig>> {
        public b(yup yupVar) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f32362a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ JSONObject c;
        public final /* synthetic */ ShortcutControlConfig d;
        public final /* synthetic */ SuccPhenixEvent e;
        public final /* synthetic */ ShortcutManager f;
        public final /* synthetic */ Map g;

        public c(String str, JSONObject jSONObject, JSONObject jSONObject2, ShortcutControlConfig shortcutControlConfig, SuccPhenixEvent succPhenixEvent, ShortcutManager shortcutManager, Map map) {
            this.f32362a = str;
            this.b = jSONObject;
            this.c = jSONObject2;
            this.d = shortcutControlConfig;
            this.e = succPhenixEvent;
            this.f = shortcutManager;
            this.g = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                yup.n(yup.this, this.f32362a, this.b, this.c, this.d, this.e.getDrawable().getBitmap(), this.f, this.g);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements yyb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rup f32363a;
        public final /* synthetic */ ShortcutManager b;
        public final /* synthetic */ Map c;

        public d(rup rupVar, ShortcutManager shortcutManager, Map map) {
            this.f32363a = rupVar;
            this.b = shortcutManager;
            this.c = map;
        }

        @Override // tb.yyb
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da277f39", new Object[]{this, str});
                return;
            }
            this.c.put("error", str);
            yup.h(yup.this).clear();
            yup.l(yup.this);
            luv.b("ShortcutsManager", "networkShortcut.onResponseError", z9u.ARG_TAOKE_ERROR + str);
        }

        @Override // tb.yyb
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad91c6f4", new Object[]{this, str});
            } else {
                n8b.a().execute(new a(str));
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f32364a;

            public a(String str) {
                this.f32364a = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f19c0c4a", new Object[]{this});
                } else if (yup.k().get()) {
                    yup.h(yup.this).clear();
                    yup.l(yup.this);
                }
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Map<String, ShortcutControlConfig> b = w8l.d().b();
                ContentVO a2 = d.this.f32363a.a(this.f32364a);
                if (a2 != null) {
                    List<ItemVO> itemList = a2.getItemList();
                    yup.g(yup.this).clear();
                    yup.h(yup.this).clear();
                    d dVar = d.this;
                    yup.i(yup.this, dVar.b);
                    int i = 0;
                    while (i < itemList.size()) {
                        ItemVO itemVO = itemList.get(i);
                        i++;
                        String id = itemVO.getId();
                        yup.h(yup.this).add(id);
                        aqa.b("networkShortcut.shortcutId=" + id, new Object[0]);
                        itemVO.setRank(i);
                        aqa.b("networkShortcut.shortcut=" + itemVO.toString(), new Object[0]);
                        ShortcutControlConfig shortcutControlConfig = b.get(id);
                        d dVar2 = d.this;
                        yup.j(yup.this, id, itemVO, shortcutControlConfig, dVar2.b, dVar2.c);
                    }
                    gno.b(yup.f(yup.this)).e("shortcut_update_time", Long.valueOf(a2.getNextRefreshTime()));
                    luv.b("ShortcutsManager", "updatesShortcuts.onResponseSuccess", "");
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: tb.zup
                        @Override // java.lang.Runnable
                        public final void run() {
                            yup.d.a.this.b();
                        }
                    }, 60000L);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f32365a;
        public final /* synthetic */ ItemVO b;
        public final /* synthetic */ SuccPhenixEvent c;
        public final /* synthetic */ ShortcutManager d;
        public final /* synthetic */ Map e;

        public e(String str, ItemVO itemVO, SuccPhenixEvent succPhenixEvent, ShortcutManager shortcutManager, Map map) {
            this.f32365a = str;
            this.b = itemVO;
            this.c = succPhenixEvent;
            this.d = shortcutManager;
            this.e = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                yup.m(yup.this, this.f32365a, this.b, this.c.getDrawable().getBitmap(), this.d, this.e);
            }
        }
    }

    public yup(Context context) {
        if (context.getApplicationContext() != null) {
            this.f32360a = context.getApplicationContext();
        } else {
            this.f32360a = context;
        }
    }

    public static /* synthetic */ Context f(yup yupVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("a8c16cf1", new Object[]{yupVar});
        }
        return yupVar.f32360a;
    }

    public static /* synthetic */ Map g(yup yupVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6733484d", new Object[]{yupVar});
        }
        return yupVar.c;
    }

    public static /* synthetic */ Set h(yup yupVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("e980c6e6", new Object[]{yupVar});
        }
        return yupVar.b;
    }

    public static /* synthetic */ void i(yup yupVar, ShortcutManager shortcutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b29d95a", new Object[]{yupVar, shortcutManager});
        } else {
            yupVar.r(shortcutManager);
        }
    }

    public static /* synthetic */ void j(yup yupVar, String str, ItemVO itemVO, ShortcutControlConfig shortcutControlConfig, ShortcutManager shortcutManager, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bd57c51", new Object[]{yupVar, str, itemVO, shortcutControlConfig, shortcutManager, map});
        } else {
            yupVar.E(str, itemVO, shortcutControlConfig, shortcutManager, map);
        }
    }

    public static /* synthetic */ AtomicBoolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("b8af39fc", new Object[0]);
        }
        return f;
    }

    public static /* synthetic */ void l(yup yupVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d40b3b3", new Object[]{yupVar});
        } else {
            yupVar.D();
        }
    }

    public static /* synthetic */ void m(yup yupVar, String str, ItemVO itemVO, Bitmap bitmap, ShortcutManager shortcutManager, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d20604", new Object[]{yupVar, str, itemVO, bitmap, shortcutManager, map});
        } else {
            yupVar.o(str, itemVO, bitmap, shortcutManager, map);
        }
    }

    public static /* synthetic */ void n(yup yupVar, String str, JSONObject jSONObject, JSONObject jSONObject2, ShortcutControlConfig shortcutControlConfig, Bitmap bitmap, ShortcutManager shortcutManager, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b12551bc", new Object[]{yupVar, str, jSONObject, jSONObject2, shortcutControlConfig, bitmap, shortcutManager, map});
        } else {
            yupVar.p(str, jSONObject, jSONObject2, shortcutControlConfig, bitmap, shortcutManager, map);
        }
    }

    public static yup u(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yup) ipChange.ipc$dispatch("c5eca6c", new Object[]{context});
        }
        if (e == null) {
            synchronized (yup.class) {
                try {
                    if (e == null) {
                        e = new yup(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public final void A(ShortcutManager shortcutManager, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82b77606", new Object[]{this, shortcutManager, map});
            return;
        }
        rup rupVar = new rup();
        rupVar.c(new d(rupVar, shortcutManager, map));
    }

    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7764bd9", new Object[]{this});
            return;
        }
        this.d = true;
        D();
        I();
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c132fdfa", new Object[]{this});
            return;
        }
        try {
            f.set(false);
            ((HashSet) this.b).clear();
            ((ConcurrentHashMap) this.c).clear();
        } catch (Throwable unused) {
        }
    }

    public final void o(String str, ItemVO itemVO, Bitmap bitmap, ShortcutManager shortcutManager, Map<String, String> map) {
        ShortcutInfo.Builder rank;
        ShortcutInfo.Builder shortLabel;
        ShortcutInfo.Builder longLabel;
        Icon createWithBitmap;
        ShortcutInfo.Builder icon;
        ShortcutInfo.Builder intent;
        ShortcutInfo.Builder disabledMessage;
        ShortcutInfo build;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dd7e7ec", new Object[]{this, str, itemVO, bitmap, shortcutManager, map});
            return;
        }
        try {
            String linkUrl = itemVO.getLinkUrl();
            Intent intent2 = new Intent();
            intent2.setAction("android.intent.action.VIEW");
            intent2.setFlags(268468224);
            intent2.setData(Uri.parse(linkUrl));
            String title = itemVO.getTitle();
            String title2 = itemVO.getTitle();
            String disableToast = itemVO.getDisableToast();
            aqa.b("addNetworkShortcut.shortcut=" + itemVO.toString(), new Object[0]);
            int rank2 = itemVO.getRank();
            qsp.a();
            rank = psp.a(TBHuDongServiceImp.getApplication(), str).setRank(rank2);
            shortLabel = rank.setShortLabel(title);
            longLabel = shortLabel.setLongLabel(title2);
            createWithBitmap = Icon.createWithBitmap(bitmap);
            icon = longLabel.setIcon(createWithBitmap);
            intent = icon.setIntent(intent2);
            disabledMessage = intent.setDisabledMessage(disableToast);
            build = disabledMessage.build();
            G(shortcutManager, str, build, map);
        } catch (Throwable th) {
            aqa.c("addNetworkShortcut.error.", th);
        }
    }

    public final void q(ShortcutManager shortcutManager) {
        List<Object> pinnedShortcuts;
        String id;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("794ca82b", new Object[]{this, shortcutManager});
            return;
        }
        try {
            shortcutManager.removeAllDynamicShortcuts();
            pinnedShortcuts = shortcutManager.getPinnedShortcuts();
            ArrayList arrayList = new ArrayList();
            if (!pinnedShortcuts.isEmpty()) {
                for (Object obj : pinnedShortcuts) {
                    ShortcutInfo a2 = gsp.a(obj);
                    if (a2 != null) {
                        id = a2.getId();
                        arrayList.add(id);
                    }
                }
                shortcutManager.disableShortcuts(arrayList);
            }
        } catch (Throwable th) {
            aqa.c("clearShortcuts.error.", th);
        }
    }

    public final void r(ShortcutManager shortcutManager) {
        List<Object> dynamicShortcuts;
        String id;
        String id2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c4d11a1", new Object[]{this, shortcutManager});
            return;
        }
        try {
            dynamicShortcuts = shortcutManager.getDynamicShortcuts();
            ArrayList arrayList = new ArrayList();
            for (Object obj : dynamicShortcuts) {
                ShortcutInfo a2 = gsp.a(obj);
                if (a2 != null) {
                    Set<String> set = this.b;
                    id = a2.getId();
                    if (!((HashSet) set).contains(id)) {
                        id2 = a2.getId();
                        arrayList.add(id2);
                    }
                }
            }
            shortcutManager.disableShortcuts(arrayList);
            shortcutManager.removeDynamicShortcuts(arrayList);
        } catch (Throwable th) {
            aqa.c("disableOtherDynamicShortcuts.error.", th);
        }
    }

    public final void s(ShortcutManager shortcutManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("927aa5e3", new Object[]{this, shortcutManager, str});
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            shortcutManager.disableShortcuts(arrayList);
            shortcutManager.removeDynamicShortcuts(arrayList);
        } catch (Throwable th) {
            aqa.c("disableShortcut.error.", th);
        }
    }

    public final <T> T t(JSONObject jSONObject, JSONObject jSONObject2, String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("1897ecff", new Object[]{this, jSONObject, jSONObject2, str, cls});
        }
        if (jSONObject2 != null) {
            try {
                if (jSONObject2.containsKey(str)) {
                    return (T) jSONObject2.getObject(str, cls);
                }
            } catch (Throwable th) {
                aqa.c("getConfigValue.error.key=" + str, th);
                return null;
            }
        }
        if (jSONObject == null || !jSONObject.containsKey(str)) {
            return null;
        }
        return (T) jSONObject.getObject(str, cls);
    }

    public final /* synthetic */ void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("394cae6a", new Object[]{this});
        } else if (f.get()) {
            ((HashSet) this.b).clear();
            D();
        }
    }

    public final /* synthetic */ boolean w(String str, String str2, ItemVO itemVO, ShortcutManager shortcutManager, Map map, SuccPhenixEvent succPhenixEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("defb4c52", new Object[]{this, str, str2, itemVO, shortcutManager, map, succPhenixEvent})).booleanValue();
        }
        if (succPhenixEvent == null || succPhenixEvent.getDrawable() == null) {
            ((HashSet) this.b).remove(str2);
            map.put(str2, "imageLoadError.drawableIsNull.");
            H(map);
            aqa.a("Phenix.getIconFromConfig.succListener.getDrawable=null.imageUrl=" + str);
        } else {
            aqa.b("getIconFromConfig.succListener.url=" + str, new Object[0]);
            n8b.a().execute(new e(str2, itemVO, succPhenixEvent, shortcutManager, map));
        }
        return false;
    }

    public final /* synthetic */ boolean x(String str, Map map, String str2, FailPhenixEvent failPhenixEvent) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f195b1a", new Object[]{this, str, map, str2, failPhenixEvent})).booleanValue();
        }
        ((HashSet) this.b).remove(str);
        if (failPhenixEvent != null) {
            obj = Integer.valueOf(failPhenixEvent.getResultCode());
        } else {
            obj = "";
        }
        map.put(str, String.format("imageLoadError.fail.resultCode=%s", obj));
        H(map);
        aqa.a("Phenix.getIconFromConfig.failListener.imageUrl=" + str2);
        return false;
    }

    public final /* synthetic */ boolean y(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, ShortcutControlConfig shortcutControlConfig, ShortcutManager shortcutManager, Map map, SuccPhenixEvent succPhenixEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2fff639", new Object[]{this, str, str2, jSONObject, jSONObject2, shortcutControlConfig, shortcutManager, map, succPhenixEvent})).booleanValue();
        }
        if (succPhenixEvent == null || succPhenixEvent.getDrawable() == null) {
            ((HashSet) this.b).remove(str2);
            map.put(str2, "imageLoadError.drawableIsNull.");
            H(map);
            aqa.a("Phenix.getIconFromConfig.succListener.getDrawable=null.imageUrl=" + str);
        } else {
            aqa.b("getIconFromConfig.succListener.url=" + str, new Object[0]);
            n8b.a().execute(new c(str2, jSONObject, jSONObject2, shortcutControlConfig, succPhenixEvent, shortcutManager, map));
        }
        return false;
    }

    public final /* synthetic */ boolean z(String str, Map map, String str2, FailPhenixEvent failPhenixEvent) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("647d2230", new Object[]{this, str, map, str2, failPhenixEvent})).booleanValue();
        }
        ((HashSet) this.b).remove(str);
        if (failPhenixEvent != null) {
            obj = Integer.valueOf(failPhenixEvent.getResultCode());
        } else {
            obj = "";
        }
        map.put(str, String.format("imageLoadError.fail.resultCode=%s", obj));
        H(map);
        aqa.a("Phenix.getIconFromConfig.failListener.imageUrl=" + str2);
        return false;
    }

    public final void E(final String str, final ItemVO itemVO, ShortcutControlConfig shortcutControlConfig, final ShortcutManager shortcutManager, final Map<String, String> map) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63762ad8", new Object[]{this, str, itemVO, shortcutControlConfig, shortcutManager, map});
            return;
        }
        try {
            if (itemVO == null) {
                aqa.b("startAddNetworkShortcut.shortcutItem=null.return.", new Object[0]);
            } else if (shortcutControlConfig != null && !shortcutControlConfig.isEnable()) {
                aqa.b("startAddNetworkShortcut.shortcutId=%s.controlConfig.isInValid.disableShortcut.", str);
                s(shortcutManager, str);
                if (shortcutControlConfig.isEnable()) {
                    str2 = "disable.abConfig.inValid.";
                } else {
                    str2 = "disable.abConfig.notEnable.";
                }
                map.put(str, str2);
                ((HashSet) this.b).remove(str);
                H(map);
            } else if (!itemVO.isValid()) {
                aqa.b("startAddNetworkShortcut.shortcutItem=", itemVO.toString());
                map.put(str, "disable.inValid.");
                ((HashSet) this.b).remove(str);
                H(map);
            } else {
                final String iconUrl = itemVO.getIconUrl();
                aqa.b("getIconFromConfig.url=" + iconUrl, new Object[0]);
                s0m.B().T(iconUrl).succListener(new s8d() { // from class: tb.tup
                    @Override // tb.s8d
                    public final boolean onHappen(b1m b1mVar) {
                        boolean w;
                        String str3 = str;
                        ItemVO itemVO2 = itemVO;
                        w = yup.this.w(iconUrl, str3, itemVO2, shortcutManager, map, (SuccPhenixEvent) b1mVar);
                        return w;
                    }
                }).failListener(new s8d() { // from class: tb.uup
                    @Override // tb.s8d
                    public final boolean onHappen(b1m b1mVar) {
                        boolean x;
                        String str3 = str;
                        Map map2 = map;
                        x = yup.this.x(str3, map2, iconUrl, (FailPhenixEvent) b1mVar);
                        return x;
                    }
                }).fetch();
            }
        } catch (Throwable th) {
            ((HashSet) this.b).remove(str);
            map.put(str, "catchError.fail.");
            H(map);
            aqa.c("startAddNetworkShortcut.error.", th);
        }
    }

    public final synchronized void G(ShortcutManager shortcutManager, String str, ShortcutInfo shortcutInfo, Map<String, String> map) {
        boolean dynamicShortcuts;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c97b6bd5", new Object[]{this, shortcutManager, str, shortcutInfo, map});
        } else if (!f.get()) {
            aqa.b("tryAddShortcut.mIsUpdating=false.return.", new Object[0]);
        } else {
            ((HashSet) this.b).remove(str);
            ((ConcurrentHashMap) this.c).put(str, shortcutInfo);
            aqa.b("tryAddShortcut.add.id=%s.", str);
            if (((HashSet) this.b).isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (String str3 : ((ConcurrentHashMap) this.c).keySet()) {
                    arrayList.add(((ConcurrentHashMap) this.c).get(str3));
                }
                dynamicShortcuts = shortcutManager.setDynamicShortcuts(arrayList);
                for (String str4 : ((ConcurrentHashMap) this.c).keySet()) {
                    if (dynamicShortcuts) {
                        str2 = "updatedSuccess";
                    } else {
                        str2 = "isRateLimited";
                    }
                    map.put(str4, str2);
                }
                ((HashSet) this.b).clear();
                D();
                H(map);
            }
        }
    }

    public final void H(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4b9f3a2", new Object[]{this, map});
            return;
        }
        try {
            if (((HashSet) this.b).isEmpty() && !f.get()) {
                D();
                String userId = Login.getUserId();
                if (TextUtils.isEmpty(userId)) {
                    userId = "";
                }
                map.put("userId", userId);
                UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("shortcuts_update");
                uTHitBuilders$UTCustomHitBuilder.setEventPage("TBShortcutsManager");
                uTHitBuilders$UTCustomHitBuilder.setProperties(map);
                UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
                aqa.b("trackUpdateShortcuts.trackMap=%s", map.toString());
            }
        } catch (Throwable th) {
            aqa.c("trackUpdateShortcuts.error.", th);
        }
    }

    public void I() {
        ShortcutManager shortcutManager;
        int maxShortcutCountPerActivity;
        List<Object> pinnedShortcuts;
        String id;
        Context context;
        Object systemService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72565a4a", new Object[]{this});
            return;
        }
        try {
            Localization.a(new a());
            AtomicBoolean atomicBoolean = f;
            if (atomicBoolean.get()) {
                aqa.b("updatesShortcuts.mIsUpdating=true.return.", new Object[0]);
                return;
            }
            atomicBoolean.set(true);
            if (Build.VERSION.SDK_INT < 25 || (context = this.f32360a) == null) {
                shortcutManager = null;
            } else {
                systemService = context.getSystemService(ttp.a());
                shortcutManager = jup.a(systemService);
            }
            aqa.b("updatesShortcuts.shortcutManager=" + shortcutManager, new Object[0]);
            if (shortcutManager == null) {
                D();
                return;
            }
            HashMap hashMap = new HashMap(4);
            maxShortcutCountPerActivity = shortcutManager.getMaxShortcutCountPerActivity();
            hashMap.put("maxCount", String.valueOf(maxShortcutCountPerActivity));
            pinnedShortcuts = shortcutManager.getPinnedShortcuts();
            hashMap.put("pinnedCount", String.valueOf(pinnedShortcuts.size()));
            ArrayList arrayList = new ArrayList();
            for (Object obj : pinnedShortcuts) {
                ShortcutInfo a2 = gsp.a(obj);
                if (a2 != null) {
                    id = a2.getId();
                    arrayList.add(id);
                }
            }
            hashMap.put("pinnedIdList", arrayList.toString());
            if (!w8l.d().e()) {
                q(shortcutManager);
                hashMap.put("orangeEnable", "false");
                ((HashSet) this.b).clear();
                H(hashMap);
                return;
            }
            hashMap.put("orangeEnable", "true");
            boolean f2 = w8l.d().f();
            aqa.b("updatesShortcuts.shortcutsNetEnable=" + f2, new Object[0]);
            luv.b("ShortcutsManager", "updatesShortcuts", "shortcutsNetEnable=" + f2);
            if (f2) {
                Long l = (Long) gno.b(this.f32360a).a("shortcut_update_time", 0L);
                long longValue = l.longValue();
                if (this.d || longValue < System.currentTimeMillis() / 1000) {
                    aqa.b("shortcuts update: updateTime =", l);
                    A(shortcutManager, hashMap);
                    luv.b("ShortcutsManager", "networkShortcut", "");
                    return;
                }
                return;
            }
            B(shortcutManager, hashMap);
            luv.b("ShortcutsManager", "orangeShortcut", "");
        } catch (Throwable th) {
            D();
            aqa.c("ShortcutsManager.updatesShortcuts.error.", th);
        }
    }

    public final void B(ShortcutManager shortcutManager, Map<String, String> map) {
        Object obj;
        Variation variation;
        Variation variation2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac512a06", new Object[]{this, shortcutManager, map});
            return;
        }
        String c2 = w8l.d().c();
        Map<String, ShortcutControlConfig> b2 = w8l.d().b();
        Map<String, ShortcutConfig> a2 = w8l.d().a();
        aqa.b("updatesShortcuts.shortcutControlConfigMap=" + JSON.toJSONString(b2), new Object[0]);
        aqa.b("updatesShortcuts.shortcuts=" + JSON.toJSONString(a2), new Object[0]);
        boolean isEmpty = TextUtils.isEmpty(c2);
        boolean z = isEmpty ^ true;
        Map map2 = null;
        if (!isEmpty) {
            VariationSet activate = UTABTest.activate("ReachFlow", c2);
            if (activate != null) {
                variation2 = activate.getVariation("enable");
                variation = activate.getVariation("configControlLists");
            } else {
                variation2 = null;
                variation = null;
            }
            map.put("abControlBucketId", String.valueOf(activate.getExperimentBucketId()));
            if (variation2 == null || variation2.getValueAsBoolean(true)) {
                map.put("abControlEnable", "true");
                if (variation != null) {
                    String valueAsString = variation.getValueAsString("");
                    if (!TextUtils.isEmpty(valueAsString)) {
                        map2 = (Map) JSON.parseObject(valueAsString, new b(this), new Feature[0]);
                    }
                }
            } else {
                aqa.b("clearShortcuts.abControlConfigMap.enableVar=false", new Object[0]);
                q(shortcutManager);
                map.put("abEnable", "false");
                ((HashSet) this.b).clear();
                H(map);
                return;
            }
        }
        Set<String> keySet = b2.keySet();
        boolean containsAll = (isEmpty || map2 == null || map2.isEmpty()) ? false : map2.keySet().containsAll(keySet);
        map.put("useABControl", String.valueOf(containsAll));
        aqa.b("updatesShortcuts.useShortcutABEnable=%s.useABControlConfig=%s.", Boolean.valueOf(z), Boolean.valueOf(containsAll));
        ((ConcurrentHashMap) this.c).clear();
        ((HashSet) this.b).clear();
        this.b.addAll(keySet);
        r(shortcutManager);
        for (String str : keySet) {
            aqa.b("updatesShortcuts.shortcutId=" + str, new Object[0]);
            ShortcutConfig shortcutConfig = a2.get(str);
            aqa.b("updatesShortcuts.shortcutConfig=" + JSON.toJSONString(shortcutConfig), new Object[0]);
            if (containsAll) {
                obj = map2.get(str);
            } else {
                obj = b2.get(str);
            }
            F(str, shortcutConfig, (ShortcutControlConfig) obj, shortcutManager, map);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: tb.vup
            @Override // java.lang.Runnable
            public final void run() {
                yup.this.v();
            }
        }, 60000L);
    }

    public final void F(final String str, ShortcutConfig shortcutConfig, final ShortcutControlConfig shortcutControlConfig, final ShortcutManager shortcutManager, final Map<String, String> map) {
        long j;
        VariationSet activate;
        String str2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd3ef2de", new Object[]{this, str, shortcutConfig, shortcutControlConfig, shortcutManager, map});
            return;
        }
        try {
            if (shortcutConfig == null) {
                aqa.b("startAddShortcut.shortcutId=%s.shortcutConfig=null.return.", str);
            } else if (shortcutControlConfig != null && !shortcutControlConfig.isValid()) {
                aqa.b("startAddShortcut.shortcutId=%s.controlConfig.isInValid.disableShortcut.", str);
                s(shortcutManager, str);
                if (shortcutControlConfig.isEnable()) {
                    str2 = "disable.abConfig.inValid.";
                } else {
                    str2 = "disable.abConfig.notEnable.";
                }
                map.put(str, str2);
                ((HashSet) this.b).remove(str);
                H(map);
            } else if (!shortcutConfig.isValid()) {
                aqa.b("startAddShortcut.shortcutId=%s.shortcutConfig.isInValid.disableShortcut.", str);
                s(shortcutManager, str);
                map.put(str, "disable.inValid.");
                ((HashSet) this.b).remove(str);
                H(map);
            } else {
                final JSONObject jSONObject = null;
                if (TextUtils.isEmpty(shortcutConfig.getAbTestModule()) || (activate = UTABTest.activate("ReachFlow", shortcutConfig.getAbTestModule())) == null) {
                    j = 0;
                } else {
                    Variation variation = activate.getVariation("config");
                    if (variation != null) {
                        String valueAsString = variation.getValueAsString("");
                        if (!TextUtils.isEmpty(valueAsString)) {
                            jSONObject = JSON.parseObject(valueAsString);
                        }
                    }
                    j = activate.getExperimentBucketId();
                }
                map.put(str + "-ABBucketId", String.valueOf(j));
                String str3 = str + "-useABConfig";
                if (jSONObject == null) {
                    z = false;
                }
                map.put(str3, String.valueOf(z));
                final JSONObject parseObject = JSON.parseObject(JSON.toJSONString(shortcutConfig));
                final String str4 = (String) t(parseObject, jSONObject, "iconUrl", String.class);
                aqa.b("getIconFromConfig.url=" + str4, new Object[0]);
                s0m.B().T(str4).succListener(new s8d() { // from class: tb.wup
                    @Override // tb.s8d
                    public final boolean onHappen(b1m b1mVar) {
                        boolean y;
                        JSONObject jSONObject2 = jSONObject;
                        ShortcutControlConfig shortcutControlConfig2 = shortcutControlConfig;
                        y = yup.this.y(str4, str, parseObject, jSONObject2, shortcutControlConfig2, shortcutManager, map, (SuccPhenixEvent) b1mVar);
                        return y;
                    }
                }).failListener(new s8d() { // from class: tb.xup
                    @Override // tb.s8d
                    public final boolean onHappen(b1m b1mVar) {
                        boolean z2;
                        String str5 = str;
                        Map map2 = map;
                        z2 = yup.this.z(str5, map2, str4, (FailPhenixEvent) b1mVar);
                        return z2;
                    }
                }).fetch();
            }
        } catch (Throwable th) {
            ((HashSet) this.b).remove(str);
            map.put(str, "catchError.fail.");
            H(map);
            aqa.c("startAddShortcut.error.", th);
        }
    }

    public final void p(String str, JSONObject jSONObject, JSONObject jSONObject2, ShortcutControlConfig shortcutControlConfig, Bitmap bitmap, ShortcutManager shortcutManager, Map<String, String> map) {
        ShortcutInfo.Builder rank;
        ShortcutInfo.Builder shortLabel;
        ShortcutInfo.Builder longLabel;
        Icon createWithBitmap;
        ShortcutInfo.Builder icon;
        ShortcutInfo.Builder intent;
        ShortcutInfo.Builder disabledMessage;
        ShortcutInfo build;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dc316ff", new Object[]{this, str, jSONObject, jSONObject2, shortcutControlConfig, bitmap, shortcutManager, map});
            return;
        }
        try {
            Intent intent2 = new Intent();
            intent2.setAction("android.intent.action.VIEW");
            intent2.setFlags(268468224);
            intent2.setData(Uri.parse((String) t(jSONObject, jSONObject2, "targetUrl", String.class)));
            int index = shortcutControlConfig.getIndex();
            String str2 = (String) t(jSONObject, jSONObject2, "shortTitle", String.class);
            String str3 = (String) t(jSONObject, jSONObject2, "longTitle", String.class);
            aqa.b("addShortcut.shortcutId=%s.index=%s.longTitle=%s.shortTitle=%s.", str, Integer.valueOf(index), str3, str2);
            qsp.a();
            rank = psp.a(TBHuDongServiceImp.getApplication(), str).setRank(index);
            shortLabel = rank.setShortLabel(str2);
            longLabel = shortLabel.setLongLabel(str3);
            createWithBitmap = Icon.createWithBitmap(bitmap);
            icon = longLabel.setIcon(createWithBitmap);
            intent = icon.setIntent(intent2);
            disabledMessage = intent.setDisabledMessage((String) t(jSONObject, jSONObject2, "disableToast", String.class));
            build = disabledMessage.build();
            G(shortcutManager, str, build, map);
        } catch (Throwable th) {
            aqa.c("addShortcut.error.", th);
        }
    }
}
