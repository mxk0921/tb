package com.taobao.tao.adapter.biz.plugins;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.appcompat.taobao.util.Globals;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.statistic.TBS;
import com.taobao.taobao.R;
import com.ut.share.utils.FlowOutFacade;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.krg;
import tb.ma4;
import tb.nwo;
import tb.t2o;
import tb.whp;
import tb.xjp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SystemImageSharePlugin implements xjp.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class ShareNavFragment extends Fragment {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public d f11889a;

        static {
            t2o.a(793772083);
        }

        public static Map<String, Object> bundleToMap(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("5e7f0643", new Object[]{bundle});
            }
            HashMap hashMap = new HashMap();
            if (bundle != null) {
                for (String str : bundle.keySet()) {
                    hashMap.put(str, bundle.get(str));
                }
            }
            return hashMap;
        }

        public static /* synthetic */ Object ipc$super(ShareNavFragment shareNavFragment, String str, Object... objArr) {
            if (str.hashCode() == 1257714799) {
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/adapter/biz/plugins/SystemImageSharePlugin$ShareNavFragment");
        }

        @Override // androidx.fragment.app.Fragment
        public void onActivityResult(int i, int i2, Intent intent) {
            d dVar;
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
                return;
            }
            super.onActivityResult(i, i2, intent);
            if (i == 9999 && (dVar = this.f11889a) != null) {
                if (intent == null) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = new JSONObject(bundleToMap(intent.getExtras()));
                }
                ((b) dVar).a(jSONObject);
            }
        }

        public void p2(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fdc6978a", new Object[]{this, dVar});
            } else {
                this.f11889a = dVar;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements nwo.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f11890a;
        public final /* synthetic */ TBShareContent b;

        public a(FragmentActivity fragmentActivity, TBShareContent tBShareContent) {
            this.f11890a = fragmentActivity;
            this.b = tBShareContent;
        }

        @Override // tb.nwo.e
        public void a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a211a4c6", new Object[]{this, context});
            }
        }

        @Override // tb.nwo.e
        public void b(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("680a80b1", new Object[]{this, context});
            }
        }

        @Override // tb.nwo.e
        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e65661d7", new Object[]{this, str});
            } else {
                SystemImageSharePlugin.b(SystemImageSharePlugin.this, this.f11890a, this.b, str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TBShareContent f11891a;
        public final /* synthetic */ long b;

        public b(SystemImageSharePlugin systemImageSharePlugin, TBShareContent tBShareContent, long j) {
            this.f11891a = tBShareContent;
            this.b = j;
        }

        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2bc05ded", new Object[]{this, jSONObject});
                return;
            }
            String str = this.f11891a.businessId;
            TBS.Ext.commitEvent("Page_Share", 19999, "PopupFinish", str, null, "sysSharePanel=1,time=" + (System.currentTimeMillis() - this.b) + ",data=" + jSONObject.toJSONString());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Toast makeText = Toast.makeText(Globals.getApplication(), Localization.q(R.string.taobao_app_1010_1_18163), 1);
            makeText.setGravity(17, 0, 0);
            makeText.show();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface d {
    }

    static {
        t2o.a(793772078);
        t2o.a(667942959);
    }

    public static /* synthetic */ void b(SystemImageSharePlugin systemImageSharePlugin, FragmentActivity fragmentActivity, TBShareContent tBShareContent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d26bed55", new Object[]{systemImageSharePlugin, fragmentActivity, tBShareContent, str});
        } else {
            systemImageSharePlugin.d(fragmentActivity, tBShareContent, str);
        }
    }

    public static Fragment c(FragmentManager fragmentManager, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("3389f6ce", new Object[]{fragmentManager, dVar});
        }
        ShareNavFragment shareNavFragment = (ShareNavFragment) fragmentManager.findFragmentByTag("SHARE_Hub_Fragment");
        if (shareNavFragment == null) {
            shareNavFragment = new ShareNavFragment();
        }
        if (!shareNavFragment.isAdded() && !fragmentManager.isDestroyed()) {
            fragmentManager.beginTransaction().add(shareNavFragment, "SHARE_Hub_Fragment").commitAllowingStateLoss();
            fragmentManager.executePendingTransactions();
        }
        shareNavFragment.p2(dVar);
        return shareNavFragment;
    }

    public static Uri e(Context context, String str) {
        Cursor cursor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("a7e8212a", new Object[]{context, str});
        }
        try {
            ContentResolver contentResolver = context.getContentResolver();
            Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            cursor = contentResolver.query(uri, new String[]{"_id"}, "_data=? ", new String[]{str}, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        int i = cursor.getInt(cursor.getColumnIndex("_id"));
                        Uri withAppendedPath = Uri.withAppendedPath(Uri.parse("content://media/external/images/media"), "" + i);
                        try {
                            cursor.close();
                        } catch (Throwable unused) {
                        }
                        return withAppendedPath;
                    }
                } catch (Throwable unused2) {
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    return null;
                }
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("_data", str);
            Uri insert = context.getContentResolver().insert(uri, contentValues);
            if (cursor != null) {
                try {
                    cursor.close();
                } catch (Throwable unused4) {
                }
            }
            return insert;
        } catch (Throwable unused5) {
            cursor = null;
        }
    }

    @Override // tb.xjp.b
    public boolean a(ma4 ma4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd9b9ed2", new Object[]{this, ma4Var})).booleanValue();
        }
        return true;
    }

    @Override // tb.xjp.b
    public void cancel(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f7d8cf3", new Object[]{this, new Boolean(z)});
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e95d00b1", new Object[]{this});
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new c(), 600L);
        }
    }

    @Override // tb.xjp.b
    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return "Physical_Screenshots_SystemShare";
    }

    public final void d(FragmentActivity fragmentActivity, TBShareContent tBShareContent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3463d3c9", new Object[]{this, fragmentActivity, tBShareContent, str});
        } else if (fragmentActivity != null && !fragmentActivity.isFinishing() && !fragmentActivity.isDestroyed()) {
            Intent intent = new Intent();
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            if (Build.VERSION.SDK_INT >= 24) {
                arrayList.add(e(fragmentActivity, str));
            } else {
                arrayList.add(Uri.fromFile(new File(str)));
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new ComponentName("com.tencent.mm", "com.tencent.mm.ui.tools.ShareToTimeLineUI"));
            arrayList2.add(new ComponentName("com.tencent.mm", "com.tencent.mm.ui.tools.ShareImgUI"));
            arrayList2.add(new ComponentName("com.tencent.mm", "com.tencent.mm.ui.tools.ShareScreenImgUI"));
            arrayList2.add(new ComponentName("com.tencent.mm", "com.tencent.mm.ui.tools.ShareScreenToTimeLineUI"));
            arrayList2.add(new ComponentName("com.tencent.mm", "com.tencent.mm.ui.tools.AddFavoriteUI"));
            intent.setAction("android.intent.action.SEND_MULTIPLE");
            intent.setType("image/*");
            intent.addFlags(268435459);
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
            Fragment c2 = c(fragmentActivity.getSupportFragmentManager(), new b(this, tBShareContent, System.currentTimeMillis()));
            Intent createChooser = Intent.createChooser(intent, Localization.q(R.string.taobao_app_1010_1_18159));
            createChooser.putExtra("android.intent.extra.EXCLUDE_COMPONENTS", (Parcelable[]) arrayList2.toArray(new ComponentName[0]));
            TBS.Ext.commitEvent("Page_Share", 19999, "Popup", tBShareContent.businessId, null, "sysSharePanel=1");
            try {
                FlowOutFacade.getInstance().startActivityForResult(c2, createChooser, krg.LOG_LEVEL_DEBUG);
            } catch (Throwable unused) {
            }
            f();
        }
    }

    @Override // tb.xjp.b
    public void onEvent(ma4 ma4Var) {
        FragmentActivity fragmentActivity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("611b4fe0", new Object[]{this, ma4Var});
            return;
        }
        TBShareContent a2 = ma4Var.a().a();
        if (!TextUtils.isEmpty(a2.imageUrl) && new File(a2.imageUrl).exists() && (fragmentActivity = (FragmentActivity) ShareBizAdapter.getInstance().getAppEnv().getTopActivity()) != null) {
            new whp().h("screenshot", true, new a(fragmentActivity, a2));
        }
    }
}
