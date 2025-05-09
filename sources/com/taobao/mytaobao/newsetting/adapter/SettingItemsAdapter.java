package com.taobao.mytaobao.newsetting.adapter;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.constants.LoginSceneConstants;
import com.taobao.mytaobao.newsetting.adapter.holder.SettingItemViewHolder;
import com.taobao.mytaobao.newsetting.business.model.DynamicSettingItem;
import com.taobao.mytaobao.newsetting.business.request.SettingsRequest;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.h1p;
import tb.p3j;
import tb.qgj;
import tb.suv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SettingItemsAdapter extends RecyclerView.Adapter<SettingItemViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f11244a;
    public final LayoutInflater b;
    public String c = "-1";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11245a;
        public final /* synthetic */ String b;

        public a(String str, String str2) {
            this.f11245a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Globals.getApplication().getSharedPreferences("SettingItemsAdapterSp", 0).edit().putString(this.f11245a, this.b).apply();
            }
        }
    }

    static {
        t2o.a(745537810);
    }

    public SettingItemsAdapter(Context context) {
        new Handler();
        this.f11244a = context;
        this.b = LayoutInflater.from(context);
    }

    public static /* synthetic */ void M(SettingItemsAdapter settingItemsAdapter, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("101c798", new Object[]{settingItemsAdapter, str, str2});
        } else {
            settingItemsAdapter.S(str, str2);
        }
    }

    public static /* synthetic */ Context N(SettingItemsAdapter settingItemsAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("ce5a203d", new Object[]{settingItemsAdapter});
        }
        return settingItemsAdapter.f11244a;
    }

    public static /* synthetic */ Object ipc$super(SettingItemsAdapter settingItemsAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/newsetting/adapter/SettingItemsAdapter");
    }

    public final String O(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e39a8596", new Object[]{this, str});
        }
        return this.f11244a.getSharedPreferences("SettingItemsAdapterSp", 0).getString(str, null);
    }

    /* renamed from: P */
    public void onBindViewHolder(SettingItemViewHolder settingItemViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24c684", new Object[]{this, settingItemViewHolder, new Integer(i)});
            return;
        }
        throw null;
    }

    /* renamed from: Q */
    public SettingItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SettingItemViewHolder) ipChange.ipc$dispatch("a23d2114", new Object[]{this, viewGroup, new Integer(i)});
        }
        return new SettingItemViewHolder(this.b.inflate(R.layout.new_mytaobao_setting_page_item, (ViewGroup) null));
    }

    public final void S(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9e8ca0d", new Object[]{this, str, str2});
        } else {
            p3j.g(new a(str, str2));
        }
    }

    public String T(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dcb4849c", new Object[]{this, str});
        }
        String scheme = Uri.parse(str).getScheme();
        if (scheme != null && ("http".equals(scheme) || "https".equals(scheme))) {
            return str;
        }
        return h1p.HTTPS_PREFIX + str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return 0;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final DynamicSettingItem f11246a;
        public final String b;
        public final String c;
        public Handler d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a implements Handler.Callback {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f11247a;

            public a(String str) {
                this.f11247a = str;
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
                }
                switch (message.what) {
                    case 911101:
                        if (!TextUtils.isEmpty(this.f11247a)) {
                            if (this.f11247a.contains("modify_password")) {
                                Login.navByScene(SettingItemsAdapter.N(SettingItemsAdapter.this), LoginSceneConstants.SCENE_CHANGEPASSWORD);
                            } else if (this.f11247a.contains("bind_phone")) {
                                Login.navByScene(SettingItemsAdapter.N(SettingItemsAdapter.this), LoginSceneConstants.SCENE_BINDMOBILE);
                            } else if (this.f11247a.contains("change_phone")) {
                                Login.navByScene(SettingItemsAdapter.N(SettingItemsAdapter.this), LoginSceneConstants.SCENE_CHANGEMOBILE);
                            } else if (this.f11247a.contains("retrieve_password")) {
                                Login.navByScene(SettingItemsAdapter.N(SettingItemsAdapter.this), LoginSceneConstants.SCENE_FOUNDPASSWORD);
                            }
                        }
                        Login.deleteLoadedListener(b.a(b.this));
                        qgj.a();
                        break;
                    case 911102:
                    case 911103:
                    case Login.NOTIFY_WEEDOUT /* 911106 */:
                        Login.deleteLoadedListener(b.a(b.this));
                        break;
                }
                return true;
            }
        }

        static {
            t2o.a(745537812);
        }

        public b(DynamicSettingItem dynamicSettingItem) {
            this.f11246a = dynamicSettingItem;
            this.b = dynamicSettingItem.hrefUrl;
            this.c = dynamicSettingItem.fastUrl;
        }

        public static /* synthetic */ Handler a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Handler) ipChange.ipc$dispatch("7a02cd59", new Object[]{bVar});
            }
            return bVar.d;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            boolean z;
            boolean z2 = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            if (TextUtils.isEmpty(this.c)) {
                str = this.b;
            } else {
                str = this.c;
                z2 = true;
            }
            if (!TextUtils.isEmpty(str)) {
                String str2 = this.f11246a.menuDesc;
                if (!TextUtils.isEmpty(str2)) {
                    SettingItemsAdapter.M(SettingItemsAdapter.this, this.f11246a.menuName, this.f11246a.menuName + str2);
                }
                if (view.getTag() != null) {
                    TBS.Ext.commitEvent("Page_MYTBSettingVC", Integer.parseInt("2101"), this.f11246a.utName, null, null, "spm-url=" + this.f11246a.spm);
                    HashMap hashMap = new HashMap();
                    hashMap.put("spm-url", this.f11246a.spm);
                    suv.l(hashMap);
                }
                if (str.contains("modify_password") || str.contains("bind_phone") || str.contains("change_phone") || str.contains("retrieve_password")) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("com.taobao.tao.login.REFRESH_COOKIES_FIRST", true);
                    Handler handler = new Handler(Looper.getMainLooper(), new a(str));
                    this.d = handler;
                    Login.login(handler, true, bundle);
                    return;
                }
                if (!z2) {
                    str = SettingItemsAdapter.this.T(str);
                }
                try {
                    if (z2) {
                        z = Nav.from(SettingItemsAdapter.N(SettingItemsAdapter.this)).toUriSimple(str);
                    } else {
                        if (!"https://m.taobao.com/go/mytaobao/newpaysettings".equals(str) && !"http://m.taobao.com/go/newmytaobaocommonsettings2".equals(str) && !"http://m.taobao.com/go/newmytaobaohelpsettings".equals(str)) {
                            z = Nav.from(SettingItemsAdapter.N(SettingItemsAdapter.this)).toUri(str);
                        }
                        z = Nav.from(SettingItemsAdapter.N(SettingItemsAdapter.this)).skipAllProcessors().toUri(str);
                    }
                    if (!z) {
                        TLog.logd("TaoBaoSettingActivity", " ~ setting item jump failed !");
                    }
                    if (this.f11246a.showRedDot) {
                        SettingsRequest.a(view.getContext(), this.f11246a.key);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
