package com.taobao.wetao.home;

import android.os.Bundle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.a;
import com.taobao.tao.flexbox.layoutmanager.container.MainDexContainerFragment;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.log.TLog;
import tb.bax;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class GuangGuangTnodeMainFragment extends MainDexContainerFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String J2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72d4e50f", new Object[0]);
        }
        return bax.a();
    }

    public static /* synthetic */ Object ipc$super(GuangGuangTnodeMainFragment guangGuangTnodeMainFragment, String str, Object... objArr) {
        if (str.hashCode() == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/wetao/home/GuangGuangTnodeMainFragment");
    }

    public final void E2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73b8a9c5", new Object[]{this});
        } else if (o.O == null) {
            TLog.loge("Guangguang", "AllsparkApplication is not Initialized");
            a.a("com.taobao.allspark", null);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.MainDexContainerFragment, com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        E2();
        getArguments().putString("url", J2());
        super.onCreate(bundle);
        setUTPageName(null);
        getUrl();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.MainDexContainerFragment
    public String s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ae1a31a", new Object[]{this});
        }
        return "onUrlRefresh";
    }
}
