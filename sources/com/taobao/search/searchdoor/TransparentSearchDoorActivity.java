package com.taobao.search.searchdoor;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.acq;
import tb.t2o;
import tb.u4p;
import tb.und;
import tb.yui;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TransparentSearchDoorActivity extends SearchDoorActivity implements u4p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/TransparentSearchDoorActivity$1");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            super.onAnimationEnd(animator);
            TransparentSearchDoorActivity.D3(TransparentSearchDoorActivity.this);
        }
    }

    static {
        t2o.a(815792962);
        t2o.a(815793540);
    }

    public static /* synthetic */ void D3(TransparentSearchDoorActivity transparentSearchDoorActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76ccbd75", new Object[]{transparentSearchDoorActivity});
        } else {
            super.finish();
        }
    }

    public static /* synthetic */ Object ipc$super(TransparentSearchDoorActivity transparentSearchDoorActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else if (hashCode == 1150324634) {
            super.finish();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/searchdoor/TransparentSearchDoorActivity");
        }
    }

    @Override // com.taobao.search.searchdoor.SearchDoorActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // com.taobao.search.searchdoor.SearchDoorActivity, com.taobao.tao.BaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        overridePendingTransition(0, 0);
        if (!((yui) this.b).e()) {
            setVisible(false);
            super.finish();
        }
        ((yui) this.b).i(false, new a());
    }

    @Override // com.taobao.search.searchdoor.SearchDoorActivity
    public boolean s3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d5af992", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.u4p
    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a58521de", new Object[]{this});
        } else {
            ((yui) this.b).g();
        }
    }

    @Override // com.taobao.search.searchdoor.SearchDoorActivity
    public und u3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (und) ipChange.ipc$dispatch("f998f7aa", new Object[]{this});
        }
        return new yui(this);
    }

    @Override // tb.u4p
    public void z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6889d694", new Object[]{this});
        } else {
            ((yui) this.b).f();
        }
    }
}
