package com.taobao.tao.flexbox.layoutmanager.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import java.util.ArrayList;
import java.util.HashMap;
import tb.anl;
import tb.od0;
import tb.s6o;
import tb.t2o;

/* compiled from: Taobao */
@CleanAnnotation(name = "remove")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class NavigationBarModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static HashMap<o, ArrayList<d>> menusMap = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements ImageLoader.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ActionBar f12329a;

        public a(ActionBar actionBar) {
            this.f12329a = actionBar;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.e
        public void onImageLoadFailed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3feabda6", new Object[]{this});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.e
        public void onImageLoaded(BitmapDrawable bitmapDrawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30484add", new Object[]{this, bitmapDrawable});
            } else {
                this.f12329a.setIcon(bitmapDrawable);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b implements ImageLoader.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ android.app.ActionBar f12330a;

        public b(android.app.ActionBar actionBar) {
            this.f12330a = actionBar;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.e
        public void onImageLoadFailed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3feabda6", new Object[]{this});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.e
        public void onImageLoaded(BitmapDrawable bitmapDrawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30484add", new Object[]{this, bitmapDrawable});
            } else {
                this.f12330a.setIcon(bitmapDrawable);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface c {
        public static final int MENU_FEEDBACK = 3;
        public static final int MENU_HELP = 2;
        public static final int MENU_HOME = 1;
        public static final int MENU_MESSAGE = 0;
        public static final int[] defaultMenus = {0, 1, 2, 3};

        void T0(int[] iArr);
    }

    static {
        t2o.a(503317304);
        t2o.a(503316559);
    }

    public static void appendNaviMenu(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aad9e60d", new Object[]{jVar});
            return;
        }
        JSONObject jSONObject = (JSONObject) jVar.b;
        String string = jSONObject.getString("icon");
        String string2 = jSONObject.getString("title");
        Activity activity = (Activity) jVar.c();
        ArrayList<d> arrayList = menusMap.get(jVar.f11976a);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            menusMap.put(jVar.f11976a, arrayList);
        }
        arrayList.add(new d(string, string2, jVar.c));
        activity.invalidateOptionsMenu();
    }

    public static ArrayList<d> getMenus(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("e498a25", new Object[]{oVar});
        }
        return menusMap.get(oVar);
    }

    public static void hide(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48a3b18a", new Object[]{jVar});
        } else if (jVar.f11976a.W() instanceof anl) {
            ((anl) jVar.f11976a.W()).hideActionBar();
        } else if (jVar.c() instanceof AppCompatActivity) {
            ((AppCompatActivity) jVar.c()).getSupportActionBar().hide();
        } else if (jVar.c() instanceof Activity) {
            ((Activity) jVar.c()).getActionBar().hide();
        }
    }

    public static void hideStatusBar(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("666305cd", new Object[]{jVar});
        }
    }

    public static void remove(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5057ac5", new Object[]{oVar});
        } else {
            menusMap.remove(oVar);
        }
    }

    public static void setNaviBarLeftItem(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ed1e787", new Object[]{jVar});
        } else {
            setTitle(jVar);
        }
    }

    public static void setNaviMenu(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f90401c5", new Object[]{jVar});
            return;
        }
        try {
            JSONArray jSONArray = ((JSONObject) jVar.b).getJSONArray("menu");
            if (jSONArray != null) {
                int[] iArr = new int[jSONArray.size()];
                for (int i = 0; i < jSONArray.size(); i++) {
                    iArr[i] = jSONArray.getIntValue(i);
                }
                if (jVar.c() instanceof c) {
                    ((c) jVar.c()).T0(iArr);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void setStyle(d.j jVar) {
        int identifier;
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce0f54fd", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            String string = ((JSONObject) json).getString("color");
            String string2 = ((JSONObject) jVar.b).getString("backgroundColor");
            ((JSONObject) jVar.b).getString("borderBottomWidth");
            ((JSONObject) jVar.b).getString("borderBottomColor");
            if (jVar.c() instanceof AppCompatActivity) {
                ActionBar supportActionBar = ((AppCompatActivity) jVar.c()).getSupportActionBar();
                if (!TextUtils.isEmpty(string2)) {
                    supportActionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor(string2)));
                }
            } else if ((jVar.c() instanceof Activity) && !TextUtils.isEmpty(string2)) {
                ((Activity) jVar.c()).getActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor(string2)));
            }
            if (!TextUtils.isEmpty(string) && (identifier = Resources.getSystem().getIdentifier("action_bar_title", "id", "android")) > 0 && (textView = (TextView) ((AppCompatActivity) jVar.c()).findViewById(identifier)) != null) {
                textView.setTextColor(Color.parseColor(string));
            }
        }
    }

    public static void setTitle(d.j jVar) {
        android.app.ActionBar actionBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3b1c236", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            String str = null;
            String string = ((JSONObject) json).containsKey("title") ? ((JSONObject) jVar.b).getString("title") : null;
            String string2 = ((JSONObject) jVar.b).containsKey("subtitle") ? ((JSONObject) jVar.b).getString("subtitle") : null;
            if (((JSONObject) jVar.b).containsKey("icon")) {
                str = ((JSONObject) jVar.b).getString("icon");
            }
            if (jVar.f11976a.W() instanceof anl) {
                if (!TextUtils.isEmpty(string)) {
                    ((anl) jVar.f11976a.W()).setTitle(string);
                }
            } else if (jVar.c() instanceof AppCompatActivity) {
                ActionBar supportActionBar = ((AppCompatActivity) jVar.c()).getSupportActionBar();
                if (supportActionBar == null) {
                    return;
                }
                if (!TextUtils.isEmpty(str)) {
                    od0.D().a().e(jVar.c(), str, -1, -1, new a(supportActionBar));
                    return;
                }
                if (!TextUtils.isEmpty(string)) {
                    supportActionBar.setDisplayOptions(12);
                    supportActionBar.setTitle(string);
                }
                if (!TextUtils.isEmpty(string2)) {
                    supportActionBar.setSubtitle(string2);
                }
            } else if ((jVar.c() instanceof Activity) && (actionBar = ((Activity) jVar.c()).getActionBar()) != null) {
                if (!TextUtils.isEmpty(str)) {
                    od0.D().a().e(jVar.c(), str, -1, -1, new b(actionBar));
                    return;
                }
                if (!TextUtils.isEmpty(string)) {
                    actionBar.setTitle(string);
                }
                if (!TextUtils.isEmpty(string2)) {
                    actionBar.setSubtitle(string2);
                }
            }
        }
    }

    public static void show(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a9d642f", new Object[]{jVar});
        } else if (jVar.f11976a.W() instanceof anl) {
            ((anl) jVar.f11976a.W()).showActionBar();
        } else if (jVar.c() instanceof AppCompatActivity) {
            ((AppCompatActivity) jVar.c()).getSupportActionBar().show();
        } else if (jVar.c() instanceof Activity) {
            ((Activity) jVar.c()).getActionBar().show();
        }
    }

    public static void showNaviMenu(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93deba8a", new Object[]{jVar});
        } else {
            boolean z = jVar.c() instanceof Activity;
        }
    }

    public static void showStatusBar(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0877cc8", new Object[]{jVar});
        }
    }

    public static void setNaviBarRightItem(d.j jVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("388ac548", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            String str = null;
            String string = ((JSONObject) json).containsKey("title") ? ((JSONObject) jVar.b).getString("title") : null;
            if (((JSONObject) jVar.b).containsKey("icon")) {
                str = ((JSONObject) jVar.b).getString("icon");
            }
            Activity activity = (Activity) jVar.c();
            ArrayList<d> arrayList = menusMap.get(jVar.f11976a);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                menusMap.put(jVar.f11976a, arrayList);
            }
            while (true) {
                if (i >= arrayList.size()) {
                    arrayList.add(new d(str, string, RVStartParams.TRANSPARENT_TITLE_ALWAYS, jVar.c));
                    break;
                }
                d dVar = arrayList.get(i);
                if (dVar != null && ((!TextUtils.isEmpty(dVar.f12331a) && dVar.f12331a.equals(str)) || (!TextUtils.isEmpty(dVar.b) && dVar.b.equals(string)))) {
                    break;
                }
                i++;
            }
            activity.invalidateOptionsMenu();
        }
    }

    public static void setStatusBarStyle(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aff1e85a", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if ((json instanceof JSONObject) && Build.VERSION.SDK_INT >= 23) {
            String string = ((JSONObject) json).getString("style");
            Context c2 = jVar.c();
            if (!(c2 instanceof Activity)) {
                return;
            }
            if (TextUtils.equals("lightContent", string)) {
                s6o.M((Activity) c2, 0, false);
            } else if (TextUtils.equals("default", string)) {
                s6o.M((Activity) c2, 0, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f12331a;
        public final String b;
        public final String c;
        public final d.k d;

        static {
            t2o.a(503317308);
        }

        public d(String str, String str2, d.k kVar) {
            this.f12331a = str;
            this.b = str2;
            this.d = kVar;
        }

        public d(String str, String str2, String str3, d.k kVar) {
            this.f12331a = str;
            this.b = str2;
            this.c = str3;
            this.d = kVar;
        }
    }
}
