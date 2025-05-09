package com.taobao.appbundle.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.appbundle.runtime.InjectClassLoader;
import com.taobao.appbundle.runtime.ModuleDependencyUtils;
import com.taobao.tao.BaseActivity;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.bdq;
import tb.d62;
import tb.edq;
import tb.gvk;
import tb.kyn;
import tb.rqk;
import tb.t2o;
import tb.ucq;
import tb.wnc;
import tb.xcq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class BaseFeatureDownloadActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String b;
    public Intent f;
    public int g;
    public boolean i;

    /* renamed from: a  reason: collision with root package name */
    public final ucq f10049a = com.taobao.appbundle.a.Companion.a().h();
    public final wnc c = (wnc) d62.b(wnc.class, "BaseFeatureDownloadActivity");
    public long d = 0;
    public List<String> e = new ArrayList();
    public final edq h = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements edq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: a */
        public void onStateUpdate(bdq bdqVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93485c61", new Object[]{this, bdqVar});
            } else if (bdqVar.f().contains(BaseFeatureDownloadActivity.this.b)) {
                int i = bdqVar.i();
                if (i == 2) {
                    BaseFeatureDownloadActivity.this.o3(bdqVar);
                } else if (i == 3) {
                    BaseFeatureDownloadActivity.this.n3();
                } else if (i == 4) {
                    BaseFeatureDownloadActivity.this.q3(bdqVar);
                } else if (i == 5) {
                    BaseFeatureDownloadActivity.this.s3();
                } else if (i == 6) {
                    BaseFeatureDownloadActivity.this.p3(bdqVar);
                } else if (i == 10) {
                    BaseFeatureDownloadActivity.this.t3();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements rqk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.rqk
        public void onFailure(Exception exc) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebfde814", new Object[]{this, exc});
            } else {
                BaseFeatureDownloadActivity.this.r3(exc);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements gvk<Integer> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        /* renamed from: b */
        public void onSuccess(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af0b58ec", new Object[]{this, num});
                return;
            }
            BaseFeatureDownloadActivity.l3(BaseFeatureDownloadActivity.this, num.intValue());
            BaseFeatureDownloadActivity.this.b();
        }
    }

    static {
        t2o.a(377487377);
    }

    public static /* synthetic */ Object ipc$super(BaseFeatureDownloadActivity baseFeatureDownloadActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            case 1281559479:
                super.onRestart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/appbundle/activity/BaseFeatureDownloadActivity");
        }
    }

    public static /* synthetic */ int l3(BaseFeatureDownloadActivity baseFeatureDownloadActivity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e7c23149", new Object[]{baseFeatureDownloadActivity, new Integer(i)})).intValue();
        }
        baseFeatureDownloadActivity.getClass();
        return i;
    }

    public abstract void b();

    public void m3(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("572f4841", new Object[]{this, str});
        } else if (!this.f10049a.f().contains(str) || !this.f10049a.f().containsAll(this.e)) {
            xcq.e l = xcq.c().l(str);
            for (String str3 : this.e) {
                l.l(str3);
            }
            this.f10049a.c(l.n()).c(new c()).b(new b());
            String str4 = this.b;
            Intent intent = this.f;
            if (intent == null) {
                str2 = "";
            } else {
                str2 = intent.getDataString();
            }
            kyn.e(str4, str2);
            this.d = System.currentTimeMillis();
        } else {
            this.d = System.currentTimeMillis();
            s3();
        }
    }

    public abstract void n3();

    public abstract void o3(bdq bdqVar);

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        setResult(this.g, intent);
        Log.e("FeatureDownloadActivity", "onActivityResult");
        finish();
    }

    @Override // com.taobao.tao.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
        } else {
            super.onNewIntent(intent);
        }
    }

    @Override // com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        this.f10049a.e(this.h);
        this.d = 0L;
        super.onPause();
    }

    @Override // android.app.Activity
    public void onRestart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
            return;
        }
        super.onRestart();
        if (this.f10049a.f().contains(this.b)) {
            finish();
        }
    }

    @Override // com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.f10049a.g(this.h);
        m3(this.b);
    }

    public abstract void p3(bdq bdqVar);

    public abstract void q3(bdq bdqVar);

    public abstract void r3(Exception exc);

    public void s3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1015eb66", new Object[]{this});
        } else if (!this.i) {
            Intent intent = this.f;
            if (intent != null) {
                kyn.c(this.b, intent.getDataString(), System.currentTimeMillis() - this.d);
                int i = this.g;
                if (i > 0) {
                    startActivityForResult(this.f, i);
                } else if ((this.f.getFlags() & 268435456) != 0) {
                    this.f.setFlags(0);
                    startActivity(this.f);
                } else {
                    startActivity(this.f);
                    finish();
                }
            } else if ((getIntent().getFlags() & 268435456) != 0) {
                getIntent().setFlags(0);
                startActivity(getIntent());
            } else {
                startActivity(getIntent());
                finish();
            }
            this.i = true;
        }
    }

    public abstract void t3();

    @Override // com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        setTheme(R.style.Theme_DownLoadActivity);
        super.onCreate(null);
        Bundle extras = getIntent().getExtras();
        String str2 = (String) extras.get("feature_name");
        this.b = str2;
        if (TextUtils.isEmpty(str2) && Build.VERSION.SDK_INT < 28) {
            this.b = InjectClassLoader.Companion.getFeatureName();
        }
        this.e = ModuleDependencyUtils.getDependencies(this.b);
        this.f = (Intent) extras.getParcelable("orignal_intent");
        this.g = extras.getInt("request_code");
        String str3 = this.b;
        Intent intent = this.f;
        if (intent == null) {
            str = "";
        } else {
            str = intent.getDataString();
        }
        kyn.e(str3, str);
        this.d = System.currentTimeMillis();
        wnc wncVar = this.c;
        wncVar.e("show loading view:" + this.b, new Object[0]);
    }
}
