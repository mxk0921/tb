package com.taobao.relationship.module;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.relationship.view.FollowButton;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Properties;
import tb.au9;
import tb.bt9;
import tb.bu9;
import tb.cna;
import tb.ft9;
import tb.gt9;
import tb.ht9;
import tb.kt9;
import tb.lt9;
import tb.ot9;
import tb.pt9;
import tb.rgw;
import tb.rt9;
import tb.s0m;
import tb.t2o;
import tb.y7t;
import tb.z9u;
import tb.zep;
import tb.zt9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class FollowModule implements View.OnClickListener, bt9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FollowButton f11491a;
    public final Activity b;
    public bu9 c;
    public pt9 d;
    public ht9 e;
    public boolean f;
    public ft9 g;
    public zt9 h;
    public ot9 i;
    public PopupWindow j;
    public ViewGroup k;
    public TextView l;
    public TIconFontTextView m;
    public TextView n;
    public boolean o;
    public SyncBroadcastReceiver p;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class SyncBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<FollowModule> f11492a;

        static {
            t2o.a(759169041);
        }

        public SyncBroadcastReceiver(WeakReference<FollowModule> weakReference) {
            this.f11492a = weakReference;
        }

        public static /* synthetic */ Object ipc$super(SyncBroadcastReceiver syncBroadcastReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/relationship/module/FollowModule$SyncBroadcastReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean booleanExtra;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            WeakReference<FollowModule> weakReference = this.f11492a;
            if (weakReference != null && weakReference.get() != null) {
                y7t.a("FollowModule", "onReceive , intent = " + intent.toString());
                if (FollowModule.a(this.f11492a.get()) == null) {
                    if (Globals.getApplication() != null) {
                        LocalBroadcastManager.getInstance(Globals.getApplication()).unregisterReceiver(FollowModule.b(FollowModule.this));
                    }
                } else if (FollowModule.c(this.f11492a.get()) != null) {
                    try {
                        if (TextUtils.equals(intent.getAction(), gt9.ACTION_UPDATA_FOLLOW_STATE)) {
                            int intExtra = intent.getIntExtra("accountType", -1);
                            long longExtra = intent.getLongExtra("accountId", -1L);
                            if (longExtra == -1) {
                                String stringExtra = intent.getStringExtra("accountId");
                                if (!TextUtils.isEmpty(stringExtra)) {
                                    try {
                                        longExtra = Long.parseLong(stringExtra);
                                    } catch (NumberFormatException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            if (FollowModule.c(this.f11492a.get()).f20882a != longExtra) {
                                return;
                            }
                            if ((FollowModule.c(this.f11492a.get()).b == intExtra || intExtra == -1) && (booleanExtra = intent.getBooleanExtra(a.MSG_FOLLOWED, false)) != FollowModule.d(FollowModule.this)) {
                                FollowModule.e(this.f11492a.get(), booleanExtra);
                            }
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    static {
        t2o.a(759169040);
        t2o.a(759169046);
    }

    public FollowModule(Activity activity, ht9 ht9Var) {
        this(activity, ht9Var, new bu9(), new pt9(), new FollowButton(activity));
    }

    public static /* synthetic */ Activity a(FollowModule followModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("4232ccfa", new Object[]{followModule});
        }
        return followModule.b;
    }

    public static /* synthetic */ SyncBroadcastReceiver b(FollowModule followModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SyncBroadcastReceiver) ipChange.ipc$dispatch("69a2ebf1", new Object[]{followModule});
        }
        return followModule.p;
    }

    public static /* synthetic */ ht9 c(FollowModule followModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ht9) ipChange.ipc$dispatch("28e1225a", new Object[]{followModule});
        }
        return followModule.e;
    }

    public static /* synthetic */ boolean d(FollowModule followModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3057cd8f", new Object[]{followModule})).booleanValue();
        }
        return followModule.f;
    }

    public static /* synthetic */ void e(FollowModule followModule, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67dd482a", new Object[]{followModule, new Boolean(z)});
        } else {
            followModule.G(z);
        }
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97044d52", new Object[]{this});
            return;
        }
        LocalBroadcastManager.getInstance(this.b).unregisterReceiver(this.p);
        y7t.a("FollowModule", "unregisterReceiver");
    }

    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e6e531a", new Object[]{this});
        } else if (this.e != null) {
            this.d.getClass();
            kt9 c = kt9.c();
            ht9 ht9Var = this.e;
            if (c.b(ht9Var.f20882a, ht9Var.b)) {
                kt9 c2 = kt9.c();
                ht9 ht9Var2 = this.e;
                G(c2.a(ht9Var2.f20882a, ht9Var2.b));
            } else if (zep.b()) {
                rt9 rt9Var = new rt9();
                ht9 ht9Var3 = this.e;
                rt9Var.b = ht9Var3.f20882a;
                rt9Var.c = ht9Var3.b;
                rt9Var.d = ht9Var3.g;
                rt9Var.i = ht9Var3.f;
                new com.taobao.relationship.mtop.isfollow.a(this).d(rt9Var);
            }
        }
    }

    public void E(ht9 ht9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4c049ca", new Object[]{this, ht9Var});
        } else if (ht9Var != null) {
            this.e = ht9Var;
            D();
        }
    }

    public void F(ht9 ht9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b65641a5", new Object[]{this, ht9Var, new Boolean(z)});
        } else if (ht9Var != null) {
            this.e = ht9Var;
            StringBuilder sb = new StringBuilder("updateDataWithState , accountId = ");
            sb.append(ht9Var.f20882a);
            sb.append(", accountType = ");
            sb.append(ht9Var.b);
            sb.append(", follow = ");
            sb.append(z);
            G(z);
            kt9 c = kt9.c();
            ht9 ht9Var2 = this.e;
            c.f(ht9Var2.f20882a, ht9Var2.b, z);
        }
    }

    public final void G(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb8ee6b6", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f = z;
        o(z);
        q();
    }

    public final String f() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c373b47", new Object[]{this});
        }
        ht9 ht9Var = this.e;
        String str3 = "";
        if (ht9Var == null) {
            return str3;
        }
        if (!TextUtils.isEmpty(ht9Var.c)) {
            str = this.e.c;
        } else {
            str = str3;
        }
        if (!TextUtils.isEmpty(this.e.d)) {
            str2 = this.e.d;
        } else {
            str2 = str3;
        }
        if (!TextUtils.isEmpty(this.e.e)) {
            str3 = this.e.e;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("account_id=" + this.e.f20882a);
        sb.append(",Origin=" + str);
        sb.append(",Page=" + str2);
        sb.append(",Extend=" + str3);
        return sb.toString();
    }

    public final Properties g() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Properties) ipChange.ipc$dispatch("529b6823", new Object[]{this});
        }
        ht9 ht9Var = this.e;
        if (ht9Var == null) {
            return null;
        }
        String str3 = "";
        if (!TextUtils.isEmpty(ht9Var.c)) {
            str = this.e.c;
        } else {
            str = str3;
        }
        if (!TextUtils.isEmpty(this.e.d)) {
            str2 = this.e.d;
        } else {
            str2 = str3;
        }
        if (!TextUtils.isEmpty(this.e.e)) {
            str3 = this.e.e;
        }
        Properties properties = new Properties();
        properties.put(z9u.KEY_ACCOUNT_ID, Long.valueOf(this.e.f20882a));
        properties.put("Origin", str);
        properties.put("Page", str2);
        properties.put("Extend", str3);
        return properties;
    }

    public View h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.f11491a;
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        pt9 pt9Var = this.d;
        if (pt9Var == null || !pt9Var.f) {
            this.f11491a.initWithConfig(this.c);
            this.f11491a.setOnClickListener(this);
            k();
            j();
            y();
            n();
            return;
        }
        l(pt9Var.g);
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
        } else if (this.e != null && zep.b()) {
            rt9 rt9Var = new rt9();
            ht9 ht9Var = this.e;
            rt9Var.b = ht9Var.f20882a;
            rt9Var.c = ht9Var.b;
            rt9Var.d = ht9Var.g;
            rt9Var.i = ht9Var.f;
            new com.taobao.relationship.mtop.isfollow.a(this).d(rt9Var);
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cff72abd", new Object[]{this});
            return;
        }
        pt9 pt9Var = this.d;
        if (pt9Var != null && pt9Var.e) {
            p();
        }
    }

    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b040fd2", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f11491a.initWithConfig(this.c);
        this.f11491a.setOnClickListener(this);
        k();
        G(z);
        if (this.e != null) {
            kt9 c = kt9.c();
            ht9 ht9Var = this.e;
            c.f(ht9Var.f20882a, ht9Var.b, z);
        }
        y();
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        r(null);
        v(null);
        s(null);
        PopupWindow popupWindow = this.j;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.j.dismiss();
            this.j = null;
        }
        A();
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede39a7", new Object[]{this});
        } else if (this.d != null && au9.g()) {
            if (!TextUtils.isEmpty(this.d.c)) {
                s0m.B().T(this.d.c);
            }
            if (!TextUtils.isEmpty(this.d.d)) {
                s0m.B().T(this.d.d);
            }
        }
    }

    public final void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bbff70d", new Object[]{this, new Boolean(z)});
            return;
        }
        FollowButton followButton = this.f11491a;
        if (followButton != null) {
            followButton.refreshView(z);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        PopupWindow popupWindow;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (this.e != null && this.b != null) {
            if (view == this.f11491a) {
                ft9 ft9Var = this.g;
                if (ft9Var != null) {
                    ft9Var.a(this.f, view);
                }
                if (this.f) {
                    pt9 pt9Var = this.d;
                    if (pt9Var != null && !pt9Var.f26282a) {
                        z();
                    } else if (!this.o) {
                        this.o = true;
                        rt9 rt9Var = new rt9();
                        ht9 ht9Var = this.e;
                        rt9Var.b = ht9Var.f20882a;
                        rt9Var.c = ht9Var.b;
                        rt9Var.f = ht9Var.c;
                        rt9Var.g = ht9Var.d;
                        rt9Var.h = ht9Var.e;
                        rt9Var.d = ht9Var.g;
                        rt9Var.i = ht9Var.f;
                        new com.taobao.relationship.mtop.removefollow.a(this).c(rt9Var);
                    } else {
                        return;
                    }
                    TBS.Adv.ctrlClicked("Page_AttentionWeiTao", CT.Button, "CancelAttention", f());
                } else if (!this.o) {
                    this.o = true;
                    rt9 rt9Var2 = new rt9();
                    ht9 ht9Var2 = this.e;
                    rt9Var2.b = ht9Var2.f20882a;
                    rt9Var2.c = ht9Var2.b;
                    rt9Var2.f = ht9Var2.c;
                    rt9Var2.g = ht9Var2.d;
                    rt9Var2.h = ht9Var2.e;
                    rt9Var2.d = ht9Var2.g;
                    rt9Var2.e = ht9Var2.h;
                    rt9Var2.f27593a = this.b;
                    rt9Var2.i = ht9Var2.f;
                    new com.taobao.relationship.mtop.addfollow.a(this).c(rt9Var2);
                    TBS.Adv.ctrlClicked("Page_AttentionWeiTao", CT.Button, "Attention", f());
                }
            } else {
                int id = view.getId();
                if (id == R.id.relationship_followed_cancle_tv) {
                    PopupWindow popupWindow2 = this.j;
                    if (popupWindow2 != null && popupWindow2.isShowing()) {
                        this.j.dismiss();
                    }
                } else if (id == R.id.relationship_followed_cancle_follow_tv) {
                    if (!this.o) {
                        this.o = true;
                        rt9 rt9Var3 = new rt9();
                        ht9 ht9Var3 = this.e;
                        rt9Var3.b = ht9Var3.f20882a;
                        rt9Var3.c = ht9Var3.b;
                        rt9Var3.f = ht9Var3.c;
                        rt9Var3.g = ht9Var3.d;
                        rt9Var3.h = ht9Var3.e;
                        rt9Var3.d = ht9Var3.g;
                        rt9Var3.i = ht9Var3.f;
                        new com.taobao.relationship.mtop.removefollow.a(this).c(rt9Var3);
                        PopupWindow popupWindow3 = this.j;
                        if (popupWindow3 != null && popupWindow3.isShowing()) {
                            this.j.dismiss();
                        }
                    }
                } else if (id == R.id.relationship_homepage_follow_popupwindow && (popupWindow = this.j) != null && popupWindow.isShowing()) {
                    this.j.dismiss();
                }
            }
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b22c8539", new Object[]{this});
            return;
        }
        this.p = new SyncBroadcastReceiver(new WeakReference(this));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(gt9.ACTION_UPDATA_FOLLOW_STATE);
        LocalBroadcastManager.getInstance(this.b).registerReceiver(this.p, intentFilter);
        y7t.a("FollowModule", "registerReceiver");
    }

    public final void q() {
        pt9 pt9Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e475ff45", new Object[]{this});
        } else if (this.e != null && (pt9Var = this.d) != null && pt9Var.e) {
            Intent intent = new Intent(gt9.ACTION_UPDATA_FOLLOW_STATE);
            intent.putExtra("accountId", this.e.f20882a);
            intent.putExtra("accountType", this.e.b);
            intent.putExtra(a.MSG_FOLLOWED, this.f);
            y7t.a("FollowModule", "sendSyncBroadcast , intent = " + intent.toString());
            LocalBroadcastManager.getInstance(this.b).sendBroadcast(intent);
        }
    }

    public void r(ft9 ft9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb9bd40", new Object[]{this, ft9Var});
        } else {
            this.g = ft9Var;
        }
    }

    public void s(lt9 lt9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7897bc6d", new Object[]{this, lt9Var});
        }
    }

    public void t(ot9 ot9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15bca8dc", new Object[]{this, ot9Var});
        } else {
            this.i = ot9Var;
        }
    }

    public void u(pt9 pt9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c60c36f", new Object[]{this, pt9Var});
        } else {
            this.d = pt9Var;
        }
    }

    public void v(zt9 zt9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5408d1ae", new Object[]{this, zt9Var});
        } else {
            this.h = zt9Var;
        }
    }

    public void w(bu9 bu9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1e06c19", new Object[]{this, bu9Var});
        } else {
            this.c = bu9Var;
        }
    }

    public final void x(boolean z, HashMap<String, Object> hashMap) {
        bu9 bu9Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("968b0542", new Object[]{this, new Boolean(z), hashMap});
            return;
        }
        if (hashMap != null) {
            Object obj = hashMap.get("errorMsg");
            Object obj2 = hashMap.get("errorCode");
            if (obj != null) {
                if ((zep.b() || obj2 == null || !TextUtils.equals(obj2.toString(), "ANDROID_SYS_LOGIN_CANCEL")) && (bu9Var = this.c) != null) {
                    bu9Var.getClass();
                    rgw.e(obj.toString());
                    return;
                }
                return;
            }
        }
        if (z) {
            bu9 bu9Var2 = this.c;
            if (bu9Var2 != null) {
                bu9Var2.getClass();
                rgw.e("关注失败");
                return;
            }
            return;
        }
        bu9 bu9Var3 = this.c;
        if (bu9Var3 != null) {
            bu9Var3.getClass();
            rgw.e("取消关注失败");
        }
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("303410e3", new Object[]{this});
        } else {
            TBS.Ext.commitEvent("Show_Attention", g());
        }
    }

    public FollowModule(Activity activity, ht9 ht9Var, FollowButton followButton) {
        this(activity, ht9Var, new bu9(), new pt9(), followButton);
    }

    public final void C(long j, long j2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f1b74d9", new Object[]{this, new Long(j), new Long(j2), str});
            return;
        }
        G(false);
        bu9 bu9Var = this.c;
        if (bu9Var != null) {
            bu9Var.getClass();
            if (TextUtils.isEmpty(str)) {
                rgw.e("已取消关注");
            } else {
                rgw.e(str);
            }
        }
        if (this.h != null) {
            StringBuilder sb = new StringBuilder("afterStateChangedRefreshView, follow = false, accountId = ");
            sb.append(j);
            sb.append(", accountType = ");
            sb.append(j2);
            this.h.afterStateChangedRefreshView(false, j, j2);
        }
        kt9.c().f(j, j2, false);
    }

    @Override // tb.bt9
    public void onBusSuccess(String str, long j, long j2, HashMap<String, Object> hashMap) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d544e960", new Object[]{this, str, new Long(j), new Long(j2), hashMap});
            return;
        }
        this.o = false;
        ot9 ot9Var = this.i;
        if (ot9Var != null) {
            ot9Var.onBusSuccess(str, j, j2, hashMap);
        }
        if (!TextUtils.equals(gt9.MTOP_ISFOLLOW, str)) {
            String str2 = "";
            if (TextUtils.equals(gt9.MTOP_ADDFOLLOW, str)) {
                zt9 zt9Var = this.h;
                if (zt9Var != null) {
                    zt9Var.beforeStateChangedRefreshView(true, j, j2);
                }
                if (!(hashMap == null || !hashMap.containsKey("toast") || hashMap.get("toast") == null)) {
                    str2 = hashMap.get("toast").toString();
                }
                B(j, j2, str2);
            } else if (TextUtils.equals(gt9.MTOP_REMOVEFOLLOW, str)) {
                zt9 zt9Var2 = this.h;
                if (zt9Var2 != null) {
                    zt9Var2.beforeStateChangedRefreshView(false, j, j2);
                }
                if (!(hashMap == null || !hashMap.containsKey("toast") || hashMap.get("toast") == null)) {
                    str2 = hashMap.get("toast").toString();
                }
                C(j, j2, str2);
            }
        } else if (hashMap != null && (obj = hashMap.get(gt9.PARAMS_MTOP_RESULT_ISFOLLOW)) != null) {
            boolean parseBoolean = Boolean.parseBoolean(obj.toString());
            G(parseBoolean);
            zt9 zt9Var3 = this.h;
            if (zt9Var3 != null) {
                zt9Var3.onCheckedState(parseBoolean, j, j2);
            }
            kt9.c().f(j, j2, parseBoolean);
        }
    }

    public FollowModule(Activity activity, ht9 ht9Var, bu9 bu9Var, pt9 pt9Var, FollowButton followButton) {
        this.o = false;
        this.b = activity;
        this.e = ht9Var;
        this.c = bu9Var;
        this.d = pt9Var;
        this.f11491a = followButton;
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("406d715c", new Object[]{this});
            return;
        }
        if (this.j == null) {
            PopupWindow popupWindow = new PopupWindow(this.b.findViewById(16908290), -1, -1, true);
            this.j = popupWindow;
            popupWindow.setSoftInputMode(16);
            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(Globals.getApplication()).inflate(R.layout.relationship_follow_cancel_view, (ViewGroup) null);
            this.k = viewGroup;
            this.j.setContentView(viewGroup);
            this.l = (TextView) this.k.findViewById(R.id.relationship_followed_cancle_follow_tv);
            TIconFontTextView tIconFontTextView = (TIconFontTextView) this.k.findViewById(R.id.relationship_followed_tips);
            this.m = tIconFontTextView;
            tIconFontTextView.setText("取消关注后将无法在 " + rgw.c(Globals.getApplication(), R.string.uik_icon_we) + "微淘 中查看TA的动态");
            this.n = (TextView) this.k.findViewById(R.id.relationship_followed_cancle_tv);
            ((RelativeLayout) this.k.findViewById(R.id.relationship_homepage_follow_popupwindow)).setOnClickListener(this);
            this.l.setOnClickListener(this);
            this.m.setOnClickListener(this);
            this.n.setOnClickListener(this);
        }
        PopupWindow popupWindow2 = this.j;
        if (popupWindow2 != null) {
            popupWindow2.showAtLocation(this.b.findViewById(16908290), 0, 0, 0);
        }
    }

    public final void B(long j, long j2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e34cb6b0", new Object[]{this, new Long(j), new Long(j2), str});
            return;
        }
        G(true);
        bu9 bu9Var = this.c;
        if (bu9Var != null) {
            bu9Var.getClass();
            if (!TextUtils.isEmpty(str)) {
                rgw.e(str);
            } else {
                rgw.e("关注成功，可以在微淘查看TA的动态啦~");
            }
        }
        pt9 pt9Var = this.d;
        if (pt9Var != null && !pt9Var.b && au9.g()) {
            bu9 bu9Var2 = this.c;
            if (bu9Var2 != null) {
                bu9Var2.getClass();
                Activity activity = this.b;
                pt9 pt9Var2 = this.d;
                cna.a(activity, j, j2, pt9Var2.c, pt9Var2.d, null, this.h);
            } else {
                Activity activity2 = this.b;
                pt9 pt9Var3 = this.d;
                cna.a(activity2, j, j2, pt9Var3.c, pt9Var3.d, null, this.h);
            }
        } else if (this.h != null) {
            StringBuilder sb = new StringBuilder("afterStateChangedRefreshView, follow = true, accountId = ");
            sb.append(j);
            sb.append(", accountType = ");
            sb.append(j2);
            this.h.afterStateChangedRefreshView(true, j, j2);
        }
        kt9.c().f(j, j2, true);
    }

    @Override // tb.bt9
    public void onBusFail(String str, long j, long j2, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0e9a303", new Object[]{this, str, new Long(j), new Long(j2), hashMap});
            return;
        }
        this.o = false;
        ot9 ot9Var = this.i;
        if (ot9Var != null) {
            ot9Var.onBusFail(str, j, j2, hashMap);
        }
        if (!TextUtils.equals(gt9.MTOP_ISFOLLOW, str)) {
            if (TextUtils.equals(gt9.MTOP_ADDFOLLOW, str)) {
                x(true, hashMap);
            } else if (TextUtils.equals(gt9.MTOP_REMOVEFOLLOW, str)) {
                x(false, hashMap);
            }
        }
    }
}
