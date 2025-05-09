package com.taobao.tao.tbmainfragment;

import android.os.Bundle;
import android.view.KeyEvent;
import androidx.appcompat.app.AppCompatActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.tbmainfragment.anim.FragmentAnimator;
import com.taobao.tao.util.TBMainLog;
import tb.mxq;
import tb.t2o;
import tb.wtd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class SupportActivity extends AppCompatActivity implements wtd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SupportActivity";
    public final mxq mDelegate = new mxq(this);

    static {
        t2o.a(775946370);
        t2o.a(775946365);
    }

    public static /* synthetic */ Object ipc$super(SupportActivity supportActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/tbmainfragment/SupportActivity");
        }
    }

    @Override // tb.wtd
    public FragmentAnimator getFragmentAnimator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentAnimator) ipChange.ipc$dispatch("ce8bca08", new Object[]{this});
        }
        return this.mDelegate.b();
    }

    @Override // tb.wtd
    public mxq getSupportDelegate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mxq) ipChange.ipc$dispatch("2d1a95ab", new Object[]{this});
        }
        return this.mDelegate;
    }

    public abstract boolean isFragmentSupported(String str, ISupportFragment iSupportFragment);

    public void loadRootFragment(int i, ISupportFragment iSupportFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69c0c625", new Object[]{this, new Integer(i), iSupportFragment});
        } else {
            this.mDelegate.f(i, iSupportFragment);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        this.mDelegate.h(bundle);
    }

    @Override // tb.wtd
    public FragmentAnimator onCreateFragmentAnimator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentAnimator) ipChange.ipc$dispatch("c5eed56d", new Object[]{this});
        }
        return this.mDelegate.i();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.mDelegate.j();
        super.onDestroy();
    }

    public boolean onSupportKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1ba32f5", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        return this.mDelegate.k(i, keyEvent);
    }

    public void pop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e863a658", new Object[]{this});
            return;
        }
        TBMainLog.tlog(TAG, "pop");
        this.mDelegate.l();
    }

    public void popTo(Class<?> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("735cb7aa", new Object[]{this, cls, new Boolean(z)});
        } else {
            this.mDelegate.m(cls, z);
        }
    }

    public void replaceFragment(ISupportFragment iSupportFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e5cd988", new Object[]{this, iSupportFragment, new Boolean(z)});
        } else {
            this.mDelegate.o(iSupportFragment, z);
        }
    }

    public void setFragmentAnimator(FragmentAnimator fragmentAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88a7c6a4", new Object[]{this, fragmentAnimator});
        } else {
            this.mDelegate.p(fragmentAnimator);
        }
    }

    public void start(ISupportFragment iSupportFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e146f0a", new Object[]{this, iSupportFragment});
        } else {
            this.mDelegate.q(iSupportFragment);
        }
    }

    public void startForResult(ISupportFragment iSupportFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e36ebad7", new Object[]{this, iSupportFragment, new Integer(i)});
        } else {
            this.mDelegate.t(iSupportFragment, i);
        }
    }

    public void loadRootFragment(int i, ISupportFragment iSupportFragment, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcbe2b65", new Object[]{this, new Integer(i), iSupportFragment, new Boolean(z), new Boolean(z2)});
        } else {
            this.mDelegate.g(i, iSupportFragment, z, z2);
        }
    }

    public void start(ISupportFragment iSupportFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4479e539", new Object[]{this, iSupportFragment, new Integer(i)});
        } else {
            this.mDelegate.r(iSupportFragment, i);
        }
    }

    public void start(ISupportFragment iSupportFragment, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ac334ea", new Object[]{this, iSupportFragment, new Integer(i), new Integer(i2)});
        } else {
            this.mDelegate.s(iSupportFragment, i, i2);
        }
    }

    public boolean tryStartFragment(String str, ISupportFragment iSupportFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c22a5b4d", new Object[]{this, str, iSupportFragment})).booleanValue();
        }
        if (!isFragmentSupported(str, iSupportFragment)) {
            TBMainLog.tlog(TAG, "current fragment or url is not support fragment");
            return false;
        }
        this.mDelegate.q(iSupportFragment);
        return true;
    }
}
