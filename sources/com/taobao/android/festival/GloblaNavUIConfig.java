package com.taobao.android.festival;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.taobao.TBActionBar;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.skin.SkinConfig;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.Globals;
import com.taobao.tao.navigation.NavigationTabIconSourceType;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import tb.k1q;
import tb.s69;
import tb.s8d;
import tb.t2o;
import tb.wl2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class GloblaNavUIConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_GLOBAL_ACTIONBAR_TEXT_COLOR = "actionbarTextColor";
    public static final String KEY_GLOBAL_ACTIONBAR_UPINDICATOR = "actionBarUpIndicator";
    public static final String KEY_GLOBAL_MSGCENTER_BORDER_COLOR = "messageBorderColor";
    public static final String KEY_GLOBAL_MSGCENTER_NUM_COLOR = "messageNumColor";

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<Context> f7663a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public enum TABBAR_IMAGE_TYPE {
        HOME("tabbarImagesURL_home", "tabbarImagesURL_home_selected"),
        WEITAO("tabbarImagesURL_we", "tabbarImagesURL_we_selected"),
        COMMUNITY("tabbarImagesURL_community", "tabbarImagesURL_community_selected"),
        CART("tabbarImagesURL_cart", "tabbarImagesURL_cart_selected"),
        MYTAOBAO("tabbarImagesURL_my", "tabbarImagesURL_my_selected");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String selected;
        public String unselect;

        TABBAR_IMAGE_TYPE(String str, String str2) {
            this.unselect = str;
            this.selected = str2;
        }

        public static /* synthetic */ Object ipc$super(TABBAR_IMAGE_TYPE tabbar_image_type, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/festival/GloblaNavUIConfig$TABBAR_IMAGE_TYPE");
        }

        public static TABBAR_IMAGE_TYPE valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TABBAR_IMAGE_TYPE) ipChange.ipc$dispatch("90c221a7", new Object[]{str});
            }
            return (TABBAR_IMAGE_TYPE) Enum.valueOf(TABBAR_IMAGE_TYPE.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f7664a;
        public final /* synthetic */ ActionBar b;

        public a(GloblaNavUIConfig globlaNavUIConfig, View view, ActionBar actionBar) {
            this.f7664a = view;
            this.b = actionBar;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            View view = this.f7664a;
            if (view != null) {
                view.setBackgroundDrawable(succPhenixEvent.getDrawable());
            }
            ActionBar actionBar = this.b;
            if (actionBar != null) {
                actionBar.setBackgroundDrawable(succPhenixEvent.getDrawable());
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] $SwitchMap$android$support$v7$taobao$TBActionBar$ActionBarStyle;
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$festival$GloblaNavUIConfig$TABBAR_IMAGE_TYPE;

        static {
            int[] iArr = new int[TABBAR_IMAGE_TYPE.values().length];
            $SwitchMap$com$taobao$android$festival$GloblaNavUIConfig$TABBAR_IMAGE_TYPE = iArr;
            try {
                iArr[TABBAR_IMAGE_TYPE.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$festival$GloblaNavUIConfig$TABBAR_IMAGE_TYPE[TABBAR_IMAGE_TYPE.WEITAO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$android$festival$GloblaNavUIConfig$TABBAR_IMAGE_TYPE[TABBAR_IMAGE_TYPE.CART.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$android$festival$GloblaNavUIConfig$TABBAR_IMAGE_TYPE[TABBAR_IMAGE_TYPE.MYTAOBAO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$android$festival$GloblaNavUIConfig$TABBAR_IMAGE_TYPE[TABBAR_IMAGE_TYPE.COMMUNITY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[TBActionBar.ActionBarStyle.values().length];
            $SwitchMap$android$support$v7$taobao$TBActionBar$ActionBarStyle = iArr2;
            try {
                iArr2[TBActionBar.ActionBarStyle.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$android$support$v7$taobao$TBActionBar$ActionBarStyle[TBActionBar.ActionBarStyle.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        t2o.a(464519175);
    }

    public GloblaNavUIConfig(Context context) {
        this.f7663a = new WeakReference<>(context);
    }

    public static void c() {
        Pair pair;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8ebd5c4", new Object[0]);
        } else if (FestivalMgr.i().u()) {
            FestivalMgr i = FestivalMgr.i();
            boolean z = i.z();
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            String l = i.l("global", "tabbarImagesURL_home_second_selected");
            String l2 = i.l("global", "tabbarImagesURL_community_selected");
            if (TextUtils.isEmpty(l)) {
                l = "//gw.alicdn.com/mt/TB1WyjhPpXXXXb9XpXXXXXXXXXX-156-156.png";
            }
            if (TextUtils.isEmpty(l2)) {
                l2 = "//gw.alicdn.com/mt/TB1abm0PpXXXXcfaXXXXXXXXXXX-156-156.png";
            }
            int e = i.e("global", "tabbarTextColorSel", Color.parseColor("#ff5000"));
            int e2 = i.e("global", "tabbarTextColorUnSel", Color.parseColor("#3D4245"));
            int parseColor = Color.parseColor("#c1c4cd");
            String l3 = i.l("global", "tabbarImagesURL_tabbar_bkg");
            TABBAR_IMAGE_TYPE[] values = TABBAR_IMAGE_TYPE.values();
            int length = values.length;
            int i2 = 0;
            while (i2 < length) {
                TABBAR_IMAGE_TYPE tabbar_image_type = values[i2];
                arrayList.add(new Pair("global", tabbar_image_type.unselect));
                arrayList.add(new Pair("global", tabbar_image_type.selected));
                String l4 = i.l("global", tabbar_image_type.unselect);
                String l5 = i.l("global", tabbar_image_type.selected);
                int i3 = b.$SwitchMap$com$taobao$android$festival$GloblaNavUIConfig$TABBAR_IMAGE_TYPE[tabbar_image_type.ordinal()];
                if (i3 == 1) {
                    pair = new Pair(l4, l);
                } else if (i3 == 2 || i3 == 3 || i3 == 4) {
                    pair = new Pair(l4, l5);
                } else {
                    pair = i3 != 5 ? null : new Pair(l4, l2);
                }
                hashMap.put(tabbar_image_type, pair);
                i2++;
                values = values;
                arrayList = arrayList;
                i = i;
            }
            ArrayList<com.taobao.tao.navigation.b> t = com.taobao.tao.navigation.a.t();
            Iterator<com.taobao.tao.navigation.b> it = t.iterator();
            while (it.hasNext()) {
                com.taobao.tao.navigation.b next = it.next();
                if (next != null) {
                    int m = next.m();
                    if (m == 0) {
                        next.J((Pair) hashMap.get(TABBAR_IMAGE_TYPE.HOME));
                    } else if (m == 1) {
                        next.J((Pair) hashMap.get(TABBAR_IMAGE_TYPE.WEITAO));
                    } else if (m == 2) {
                        next.J((Pair) hashMap.get(TABBAR_IMAGE_TYPE.COMMUNITY));
                    } else if (m == 3) {
                        next.J((Pair) hashMap.get(TABBAR_IMAGE_TYPE.CART));
                    } else if (m == 4) {
                        next.J((Pair) hashMap.get(TABBAR_IMAGE_TYPE.MYTAOBAO));
                    }
                    next.V(e);
                    next.Z(e2);
                }
            }
            HashMap hashMap2 = new HashMap();
            SkinConfig o = k1q.q().o();
            s69 e3 = s69.e();
            String str = "";
            hashMap2.put("festivalCode", e3 != null ? e3.g("global", "festivalCode") : str);
            if (o != null) {
                str = o.skinCode;
            }
            hashMap2.put("skinCode", str);
            for (int i4 = 0; i4 < t.size(); i4++) {
                t.get(i4).L(NavigationTabIconSourceType.URL);
            }
            if (TextUtils.isEmpty(l3)) {
                com.taobao.tao.navigation.a.p0(t, new ColorDrawable(-1), parseColor, z);
            } else {
                com.taobao.tao.navigation.a.q0(t, l3, 0, z);
            }
            wl2.a(Globals.getApplication(), hashMap2);
            FestivalMgr.i().I(true);
        }
    }

    public void a(Context context, View view, TBActionBar.ActionBarStyle actionBarStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cb8ce55", new Object[]{this, context, view, actionBarStyle});
        } else {
            b(context, view, actionBarStyle, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(android.content.Context r26, android.view.View r27, androidx.appcompat.taobao.TBActionBar.ActionBarStyle r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 786
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.festival.GloblaNavUIConfig.b(android.content.Context, android.view.View, androidx.appcompat.taobao.TBActionBar$ActionBarStyle, boolean):void");
    }
}
