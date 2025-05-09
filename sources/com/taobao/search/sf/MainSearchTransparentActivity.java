package com.taobao.search.sf;

import android.content.Context;
import android.os.Bundle;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.acq;
import tb.rim;
import tb.t2o;
import tb.u4p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MainSearchTransparentActivity extends MainSearchResultActivity implements u4p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean Y = false;
    public LinearLayout Z;

    static {
        t2o.a(815793363);
        t2o.a(815793540);
    }

    public static /* synthetic */ Object ipc$super(MainSearchTransparentActivity mainSearchTransparentActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1750918234:
                return new Boolean(super.N3());
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1150324634:
                super.finish();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/MainSearchTransparentActivity");
        }
    }

    @Override // com.taobao.search.sf.BaseResultActivity
    public boolean A4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd5494e5", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.search.sf.BaseResultActivity
    public boolean N3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97a31ba6", new Object[]{this})).booleanValue();
        }
        if (this.Y || super.N3()) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.search.sf.MainSearchResultActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // com.taobao.search.sf.MainSearchResultActivity, com.taobao.search.sf.BaseResultActivity, com.taobao.tao.BaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        overridePendingTransition(0, 0);
        super.finish();
    }

    @Override // com.taobao.search.sf.BaseResultActivity
    public boolean h4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e24874b4", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.search.sf.MainSearchResultActivity, com.taobao.search.sf.BaseResultActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        setTheme(R.style.TranslucentStyle);
        super.onCreate(bundle);
        rim.q(this);
        this.Z = (LinearLayout) findViewById(R.id.ll_root);
    }

    @Override // com.taobao.search.sf.MainSearchResultActivity, com.taobao.search.sf.BaseResultActivity, com.taobao.baseactivity.CustomBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        rim.r(this);
    }

    @Override // tb.u4p
    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a58521de", new Object[]{this});
        } else {
            this.Z.setVisibility(8);
        }
    }

    @Override // tb.u4p
    public void z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6889d694", new Object[]{this});
            return;
        }
        this.Y = true;
        finish();
    }
}
