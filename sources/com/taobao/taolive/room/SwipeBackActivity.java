package com.taobao.taolive.room;

import android.os.Bundle;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.taolive.room.ui.swipeback.SwipeBackLayout;
import tb.lzq;
import tb.mzq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class SwipeBackActivity extends CustomBaseActivity implements lzq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public mzq f13113a;

    static {
        t2o.a(779092747);
        t2o.a(806355816);
    }

    public static /* synthetic */ Object ipc$super(SwipeBackActivity swipeBackActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 1835627922) {
            super.onPostCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 1874373038) {
            return super.findViewById(((Number) objArr[0]).intValue());
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taolive/room/SwipeBackActivity");
        }
    }

    @Override // tb.lzq
    public void f2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7a9b90b", new Object[]{this, new Boolean(z)});
        } else {
            l3().setEnableGesture(z);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public View findViewById(int i) {
        mzq mzqVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6fb8a9ae", new Object[]{this, new Integer(i)});
        }
        View findViewById = super.findViewById(i);
        if (findViewById != null || (mzqVar = this.f13113a) == null) {
            return findViewById;
        }
        return mzqVar.a(i);
    }

    public SwipeBackLayout l3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SwipeBackLayout) ipChange.ipc$dispatch("5e950d87", new Object[]{this});
        }
        return this.f13113a.b();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        mzq mzqVar = new mzq(this);
        this.f13113a = mzqVar;
        mzqVar.c();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d697592", new Object[]{this, bundle});
            return;
        }
        super.onPostCreate(bundle);
        this.f13113a.d();
    }
}
